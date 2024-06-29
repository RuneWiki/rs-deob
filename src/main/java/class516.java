import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class516 extends class507 {

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    private int field7508;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Ljava/lang/String;")
    public static String field7509 = "";

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Ljava/awt/Image;")
    public static Image field7506;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[Lvg;")
    public class39[] field7510;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[[B")
    private byte[][] field7507;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[[I")
    public static int[][] field7502;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z", line = 4)
    public final boolean method3072(int arg0, int arg1) {
        if (arg1 != 2693) {
            method3075((byte) 24);
        }
        field7511++;
        return this.field7510[arg0].field406;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)Z", line = 17)
    public final boolean method3073(int arg0, boolean arg1) {
        if (!arg1) {
            this.method3074(-102);
        }
        field7512++;
        return this.field7510[arg0].field400;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Z", line = 29)
    public final boolean method3074(int arg0) {
        field7505++;
        if (this.field7510 != null) {
            return true;
        }
        if (this.field7507 == null) {
            if (!class26.field257.method2145(this.field7508, -92)) {
                return false;
            }
            int[] var2 = class26.field257.method2152(this.field7508, -1);
            this.field7507 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field7507[var3] = class26.field257.method2130(this.field7508, var2[var3], -88);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field7507.length; var5++) {
            byte[] var14 = this.field7507[var5];
            int var15 = (var14[0] & 0xFF) << 8 | var14[1] & 0xFF;
            var4 &= class398.field5794.method2133(arg0 ^ 0x1, var15);
        }
        if (!var4) {
            return false;
        }
        class167 var6 = new class167();
        int var7 = class26.field257.method2136(arg0 ^ 0xFFFFFFD1, this.field7508);
        this.field7510 = new class39[var7];
        if (arg0 != 1) {
            this.method3074(-97);
        }
        int[] var8 = class26.field257.method2152(this.field7508, arg0 - 2);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field7507[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class123 var12 = null;
            for (class123 var13 = (class123) var6.method970(12); var13 != null; var13 = (class123) var6.method976((byte) -128)) {
                if (var13.field1599 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class123(var11, class398.field5794.method2128(-2, var11));
                var6.method975(0, var12);
            }
            this.field7510[var8[var9]] = new class39(var10, var12);
        }
        this.field7507 = null;
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 124)
    public static final void method3075(byte arg0) {
        field7503++;
        if (arg0 != 32) {
            field7502 = null;
        }
        class272.method1647(512);
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 136)
    public static void method3076(int arg0) {
        if (arg0 == 0) {
            field7502 = null;
            field7509 = null;
            field7506 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Z", line = 154)
    public final boolean method3077(int arg0, byte arg1) {
        field7513++;
        return arg1 == 53 ? this.field7510[arg0].field414 : false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII[B)Z", line = 168)
    public static final boolean method3078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field7504++;
        int var7 = arg4 % arg1;
        int var8;
        if (arg3 == var7) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg0 + arg1 - 1) / arg1);
        int var10 = -((arg4 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg5] == 0) {
                    return true;
                }
                arg5 += arg1;
            }
            int var13 = arg5 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V", line = 213)
    public class516(int arg0) {
        this.field7508 = arg0;
    }
}
