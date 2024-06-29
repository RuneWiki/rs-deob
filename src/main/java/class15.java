import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class15 extends class203 {

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    private int field120 = -1;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    private int field124 = 0;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field123 = 0;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Lud;")
    public static class52 field130 = new class52();

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "F")
    public static float field125;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Lhi;")
    public static class26 field127;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "[I")
    public static int[] field132;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "[[[B")
    public static byte[][][] field121;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V", line = 12)
    public static void method55(int arg0) {
        if (arg0 >= -58) {
            field134 = -114;
        }
        field121 = (byte[][][]) null;
        field132 = null;
        field127 = null;
        field130 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lea;", line = 40)
    public static final class64 method56(int arg0, int arg1) {
        field131++;
        class64 var2 = (class64) class100.field1649.method263(2013, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class35.field471.method157(0, arg0, (byte) 19);
        if (var3 == null) {
            return null;
        }
        class64 var4 = new class64();
        class92 var5 = new class92(var3);
        var5.field1476 = var5.field1495.length - 2;
        int var6 = var5.method721(125);
        int var7 = var5.field1495.length - (var6 + 2 + 12);
        var5.field1476 = var7;
        int var8 = var5.method704(1509947792);
        var4.field969 = var5.method721(arg1 ^ 0x7A);
        var4.field972 = var5.method721(arg1 ^ 0x18);
        var4.field977 = var5.method721(arg1 + 96);
        var4.field966 = var5.method721(arg1 ^ 0x47);
        int var9 = var5.method702(-1);
        if (var9 > 0) {
            var4.field973 = new class49[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method721(85);
                class49 var12 = new class49(class229.method1622(true, var11));
                var4.field973[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method704(arg1 ^ 0x59FFF990);
                    int var14 = var5.method704(1509947792);
                    var12.method309(new class173(var14), (long) var13, 1);
                }
            }
        }
        int var15 = 0;
        var5.field1476 = arg1;
        var4.field980 = var5.method689(125);
        var4.field970 = new int[var8];
        var4.field976 = new class62[var8];
        var4.field968 = new int[var8];
        while (var7 > var5.field1476) {
            int var16 = var5.method721(36);
            if (var16 == 3) {
                var4.field976[var15] = var5.method696((byte) 73);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field968[var15] = var5.method702(class290.method1975(arg1, -1));
            } else {
                var4.field968[var15] = var5.method704(arg1 + 1509947792);
            }
            var4.field970[var15++] = var16;
        }
        class100.field1649.method257(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "finalize", descriptor = "()V", line = 127)
    protected final void finalize() throws Throwable {
        field119++;
        if (this.field120 != -1) {
            class79.method614(this.field120, this.field124, this.field133);
            this.field120 = -1;
            this.field124 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V", line = 279)
    public class15(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class154.field2479;
        var3.glGenTextures(1, var2, 0);
        this.field120 = var2[0];
        this.field133 = class79.field1324;
        class154.method1141(this.field120);
        int var4 = class23.field246[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class79.field1326 += var6.limit() - this.field124;
        this.field124 = var6.limit();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I", line = 158)
    public static final int method57(int arg0, int arg1) {
        if (arg1 != 22321) {
            field121 = (byte[][][]) ((byte[][][]) null);
        }
        field128++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 178)
    public final void method58(boolean arg0) {
        if (arg0) {
            return;
        }
        field129++;
        int var2 = class140.method1047(80);
        if ((var2 & 0x1) == 0) {
            class154.method1141(this.field120);
        }
        if ((var2 & 0x2) == 0) {
            class154.method1115(0);
        }
        if ((var2 & 0x4) == 0) {
            class154.method1128(0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILhg;IIIII)V", line = 204)
    public static final void method59(int arg0, int arg1, int arg2, class216 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field126++;
        int var9 = arg1 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg3.field3676;
            var11 = arg3.field3669;
        } else {
            var10 = arg3.field3669;
            var11 = arg3.field3676;
        }
        int var12;
        int var13;
        if (arg5 + var10 > 104) {
            var12 = arg5;
            var13 = arg5 + 1;
        } else {
            var12 = arg5 + (var10 >> 1);
            var13 = arg5 + (var10 + 1 >> 1);
        }
        int var14;
        int var15;
        if ((arg4 + var11) <= 104) {
            var14 = arg4 + (var11 >> 1);
            var15 = arg4 + (var11 + 1 >> 1);
        } else {
            var15 = arg4 + 1;
            var14 = arg4;
        }
        int var16 = (arg4 << 7) + (var11 << 6);
        int[][] var17 = class37.field569[arg2];
        if (arg8 != -29827) {
            method56(-104, 96);
        }
        int var18 = (arg5 << 7) + (var10 << 6);
        int var19 = 0;
        int var20 = var17[var12][var14] + var17[var12][var15] + var17[var13][var14] + var17[var13][var15] >> 2;
        if (arg2 != 0) {
            int[][] var21 = class37.field569[0];
            var19 = var20 - (var21[var12][var15] + var21[var13][var14] + var21[var12][var14] + var21[var13][var15] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg2 < 3) {
            var22 = class37.field569[arg2 + 1];
        }
        class291 var23 = arg3.method1534((class61) null, var22, arg1, var16, var17, var18, true, (byte) -81, var20, false, arg7);
        class168.method1204(var23.field4937, var18 - arg6, var19, var16 - arg0);
    }
}
