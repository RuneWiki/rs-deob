import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class331 extends class440 {

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    private int field4884 = 4096;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    private int field4885 = 409;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "[I")
    private int[] field4891 = new int[3];

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    private int field4886 = 4096;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    private int field4893 = 4096;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "Lsn;")
    public static class583 field4889 = new class583("WTQA", 2);

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "Lmf;")
    public static class382 field4892 = new class382(64);

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    public static int field4894 = -1;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "Luc;")
    public static class27 field4895 = new class27("", 14);

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4896 = null;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 240)
    public class331() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method763(int arg0, int arg1) {
        ++field4887;
        int[][] var3 = super.field6417.method3769(arg1, arg0 + -20669);
        if (arg0 != -5766) {
            this.field4886 = 53;
        }
        if (super.field6417.field9606) {
            int[][] var4 = this.method2606(arg1, 0, -1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class549.field7715; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4891[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field4885 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4891[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field4885 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4891[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field4885) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4884 * var12 >> 12;
                            var9[var11] = this.field4893 * var14 >> 12;
                            var10[var11] = this.field4886 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILmo;I)V", line = 107)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 == 5) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 == 4) {
                                int var5 = arg1.method3873(255);
                                this.field4891[2] = class689.method3797(var5 >> 12, 0);
                                this.field4891[1] = class689.method3797(var5 >> 4, 4080);
                                this.field4891[0] = class689.method3797(16711680, var5) << 4;
                            }
                        } else {
                            this.field4884 = arg1.method3847((byte) 118);
                        }
                    } else {
                        this.field4893 = arg1.method3847((byte) 118);
                    }
                } else {
                    this.field4886 = arg1.method3847((byte) 118);
                }
            } else {
                this.field4885 = arg1.method3847((byte) 118);
            }
            ++field4890;
        }
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V", line = 173)
    public static void method2077(int arg0) {
        if (arg0 != 0) {
            field4896 = null;
        }
        field4896 = null;
        field4895 = null;
        field4892 = null;
        field4889 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 191)
    public static final void method2078(boolean arg0, String arg1) {
        ++field4888;
        if (class245.field3797 && ~(class435.field6357 & 24) != -1) {
            boolean var2 = arg0;
            int var3 = class7.field65;
            int[] var4 = class629.field8801;
            for (int var5 = 0; var5 < var3; ++var5) {
                class491 var6 = class141.field2087[var4[var5]];
                if (var6.field6981 != null && var6.field6981.equalsIgnoreCase(arg1) && (class648.field9106 == var6 && ~(16 & class435.field6357) != -1 || var6 != null && ~(8 & class435.field6357) != -1)) {
                    ++class190.field2732;
                    class135 var7 = class688.method3794(class368.field5266, class583.field8198, (byte) 38);
                    var7.field1978.method3816(class654.field9181, -91);
                    var7.field1978.method3865(-1449382360, class189.field2716);
                    var7.field1978.method3860((byte) -107, class19.field223);
                    var7.field1978.method3852(false, var4[var5]);
                    var7.field1978.method3871(true, 0);
                    class19.method223(var7, 0);
                    class229.method1580(var6.field6262[0], var6.method2553((byte) 82), -2, var6.field6271[0], true, var6.method2553((byte) 90), 0, (byte) 51, 0);
                    var2 = true;
                    break;
                }
            }
            if (!var2) {
                class60.method639(4, class274.field4137.method1804(7175, class512.field7203) + arg1, 65535);
            }
            if (class245.field3797) {
                class272.method1794(103);
            }
        }
    }
}
