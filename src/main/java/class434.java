import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class434 extends class386 {

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    private int field6222 = 4096;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    private int field6224 = 4096;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    private int field6228 = 409;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "[I")
    private int[] field6225 = new int[3];

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    private int field6234 = 4096;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Ljk;")
    public static class585 field6230 = new class585(57, 4);

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field6232 = 0;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Ljn;")
    public static class668 field6231;

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 111)
    public class434() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 14)
    public static final int method2600(String arg0, int arg1) {
        ++field6223;
        for (int var2 = arg1; ~var2 > ~class180.field2217.length; ++var2) {
            if (class180.field2217[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V", line = 34)
    public static void method2601(int arg0) {
        field6231 = null;
        if (arg0 != 0) {
            field6231 = null;
        }
        field6230 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLun;)V", line = 46)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field6226;
        if (arg1 <= 111) {
            field6231 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method2258(-3);
                            this.field6225[0] = class435.method2605(var5 << 4, 267386880);
                            this.field6225[2] = class435.method2605(var5, 255) >> 12;
                            this.field6225[1] = class435.method2605(var5, 65280) >> 4;
                        }
                    } else {
                        this.field6222 = arg2.method2260(-77);
                    }
                } else {
                    this.field6234 = arg2.method2260(-28);
                }
            } else {
                this.field6224 = arg2.method2260(-42);
            }
        } else {
            this.field6228 = arg2.method2260(-40);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I", line = 117)
    public final int[][] method645(int arg0, int arg1) {
        ++field6229;
        if (arg1 != 3) {
            this.field6234 = 56;
        }
        int[][] var3 = super.field5148.method1054(arg0, arg1 + 16254);
        if (super.field5148.field2041) {
            int[][] var4 = this.method2211(arg0, 0, -112);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class599.field8643 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field6225[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field6228 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field6225[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field6228) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field6225[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field6228 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field6222 * var12 >> 12;
                            var9[var11] = this.field6234 * var14 >> 12;
                            var10[var11] = this.field6224 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljn;ZLfa;)V", line = 229)
    public static final void method2602(class668 arg0, boolean arg1, class212 arg2) {
        class501.field7003 = arg0;
        class490.field6845 = arg2;
        if (!arg1) {
            ++field6227;
        }
    }
}
