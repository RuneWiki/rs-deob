import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class114 extends class1 {

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
    private int field2026 = 4096;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "I")
    private int field2025 = 4096;

    @OriginalMember(owner = "client!kf", name = "nb", descriptor = "[I")
    private int[] field2031 = new int[3];

    @OriginalMember(owner = "client!kf", name = "sb", descriptor = "I")
    private int field2036 = 4096;

    @OriginalMember(owner = "client!kf", name = "ob", descriptor = "I")
    private int field2032 = 409;

    @OriginalMember(owner = "client!kf", name = "kb", descriptor = "Loc;")
    private static class151 field2028 = class137.method873(2, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "Loc;")
    public static class151 field2024 = field2028;

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "Luc;")
    public static class211 field2027 = new class211(64);

    @OriginalMember(owner = "client!kf", name = "pb", descriptor = "I")
    public static int field2033 = 50;

    @OriginalMember(owner = "client!kf", name = "ub", descriptor = "[I")
    public static int[] field2038 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

    @OriginalMember(owner = "client!kf", name = "qb", descriptor = "Loc;")
    public static class151 field2034 = class137.method873(2, "<col=ffff00>");

    @OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!kf", name = "tb", descriptor = "Lpc;")
    public static class161 field2037;

    @OriginalMember(owner = "client!kf", name = "rb", descriptor = "[[B")
    public static byte[][] field2035;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            field2024 = null;
        }
        ++field2029;
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658) {
            int[][] var4 = this.method8(0, (byte) 42, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class202.field3603 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2031[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field2032 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2031[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field2032) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2031[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field2032 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2026 * var12 >> 12;
                            var9[var11] = this.field2036 * var14 >> 12;
                            var10[var11] = this.field2025 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class114() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V")
    public static void method686(byte arg0) {
        field2028 = null;
        field2038 = null;
        if (arg0 > -7) {
            method686((byte) 69);
        }
        field2024 = null;
        field2034 = null;
        field2027 = null;
        field2035 = null;
        field2037 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var5 = arg2.method1450(arg0 ^ -23209);
                            this.field2031[1] = class26.method206(var5, 65280) >> 4;
                            this.field2031[2] = class26.method206(255, var5) >> 12;
                            this.field2031[0] = class26.method206(var5, 16711680) << 4;
                        }
                    } else {
                        this.field2026 = arg2.method1490((byte) 73);
                    }
                } else {
                    this.field2036 = arg2.method1490((byte) 73);
                }
            } else {
                this.field2025 = arg2.method1490((byte) 73);
            }
        } else {
            this.field2032 = arg2.method1490((byte) 73);
        }
        ++field2030;
        if (arg0 != 0) {
            this.field2031 = null;
        }
    }
}
