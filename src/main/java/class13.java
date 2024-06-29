import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class13 extends class117 {

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field213 = 0;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field207 = new String[8];

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "[Lem;")
    public class16[] field214;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "[[B")
    private byte[][] field215;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Z")
    public final boolean method108(int arg0) {
        field208++;
        if (this.field214 != null) {
            return true;
        }
        if (this.field215 == null) {
            if (!class466.field6540.method2044(-96, this.field216)) {
                return false;
            }
            int[] var2 = class466.field6540.method2026(this.field216, arg0 - 94);
            this.field215 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field215[var3] = class466.field6540.method2029(this.field216, var2[var3], 0);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field215.length; var5++) {
            byte[] var14 = this.field215[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class105.field1509.method2034(var15, -28758);
        }
        if (!var4) {
            return false;
        }
        class249 var6 = new class249();
        if (arg0 != 1) {
            this.method114(false, 104);
        }
        int var7 = class466.field6540.method2054(0, this.field216);
        this.field214 = new class16[var7];
        int[] var8 = class466.field6540.method2026(this.field216, arg0 ^ 0xFFFFFFA7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field215[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class55 var12 = null;
            for (class55 var13 = (class55) var6.method1544(-117); var13 != null; var13 = (class55) var6.method1546((byte) -42)) {
                if (var13.field893 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class55(var11, class105.field1509.method2038((byte) -58, var11));
                var6.method1553((byte) -126, var12);
            }
            this.field214[var8[var9]] = new class16(var10, var12);
        }
        this.field215 = null;
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLfc;)V")
    public static final void method109(byte arg0, class343 arg1) {
        field211++;
        if (arg0 != 82) {
            field213 = 107;
        }
        class243.field3445 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static void method110(byte arg0) {
        field207 = null;
        if (arg0 >= -2) {
            field213 = -69;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public final boolean method111(int arg0, int arg1) {
        field206++;
        if (arg0 != 24279) {
            this.method111(-11, 23);
        }
        return this.field214[arg1].field269;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)I")
    public static final int method112(int arg0, int arg1, int arg2, int arg3) {
        field212++;
        if (arg0 == arg1) {
            return arg0;
        } else if (arg2 > -35) {
            return -126;
        } else {
            int var4 = 128 - arg3;
            int var5 = (arg0 & 0x7F) * var4 + (arg1 & 0x7F) * arg3 >> 7;
            int var6 = (arg0 & 0x380) * var4 + (arg1 & 0x380) * arg3 >> 7;
            int var7 = (arg0 & 0xFC00) * var4 + (arg1 & 0xFC00) * arg3 >> 7;
            return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I")
    public static final int method113(int arg0, byte arg1) {
        field217++;
        if (arg1 != 3) {
            field207 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Z")
    public final boolean method114(boolean arg0, int arg1) {
        if (arg0) {
            method110((byte) -5);
        }
        field209++;
        return this.field214[arg1].field271;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V")
    public class13(int arg0) {
        this.field216 = arg0;
    }
}
