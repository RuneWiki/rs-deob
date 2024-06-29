import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class291 extends class354 {

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    private int field4172 = 409;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    private int field4168 = 4096;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    private int field4174 = 4096;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "[I")
    private int[] field4169 = new int[3];

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    private int field4166 = 4096;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "[Lcp;")
    public static class507[] field4170 = new class507[0];

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static final void method1806(byte arg0) {
        for (class234 var1 = (class234) class359.field5434.method1639(-1); var1 != null; var1 = (class234) class359.field5434.method1642((byte) -38)) {
            var1.method1520();
        }
        int var2 = 28 % ((50 - arg0) / 39);
        ++field4171;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)V")
    public static final void method1807(boolean arg0) {
        if (class492.field7184 == null || class461.field6801 == null) {
            class461.field6801 = new int[256];
            class492.field7184 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class492.field7184[var1] = (int) (4096.0D * Math.sin(var2));
                class461.field6801[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        if (!arg0) {
            ++field4177;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public static void method1808(byte arg0) {
        int var1 = 64 % ((23 - arg0) / 36);
        field4170 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method1866(false);
                            this.field4169[1] = class388.method2441(var5, 65280) >> 4;
                            this.field4169[2] = class388.method2441(0, var5 >> 12);
                            this.field4169[0] = class388.method2441(var5, 16711680) << 4;
                        }
                    } else {
                        this.field4174 = arg1.method1868(0);
                    }
                } else {
                    this.field4168 = arg1.method1868(0);
                }
            } else {
                this.field4166 = arg1.method1868(arg0 ^ 15180);
            }
        } else {
            this.field4172 = arg1.method1868(0);
        }
        if (arg0 == 15180) {
            ++field4167;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;BII)V")
    public static final void method1809(int arg0, String arg1, byte arg2, int arg3, int arg4) {
        ++field4178;
        class58 var5 = class155.method1123(arg0, arg3, (byte) -56);
        if (var5 != null) {
            if (var5.field880 != null) {
                class519 var6 = new class519();
                var6.field7620 = arg4;
                var6.field7627 = var5.field880;
                var6.field7625 = var5;
                var6.field7633 = arg1;
                class150.method1086(var6);
            }
            boolean var7 = true;
            if (~var5.field892 != -1) {
                var7 = class373.method2389(-28460, var5);
            }
            if (var7) {
                if (arg2 == -107) {
                    if (client.method1349(var5).method782(arg4 + -1, arg2 + 107)) {
                        if (arg4 == 1) {
                            class114.method841(false, class270.field3922);
                            ++class153.field2352;
                            class240.method1555(var5.field946, arg3, arg0, 41065288);
                        }
                        if (~arg4 == -3) {
                            class114.method841(false, class105.field1655);
                            ++class18.field274;
                            class240.method1555(var5.field946, arg3, arg0, arg2 + 41065395);
                        }
                        if (arg4 == 3) {
                            class114.method841(false, class90.field1500);
                            ++class358.field5420;
                            class240.method1555(var5.field946, arg3, arg0, arg2 + 41065395);
                        }
                        if (arg4 == 4) {
                            ++class453.field6636;
                            class114.method841(false, class283.field4110);
                            class240.method1555(var5.field946, arg3, arg0, arg2 ^ -41065251);
                        }
                        if (arg4 == 5) {
                            class114.method841(false, class30.field481);
                            ++class142.field2112;
                            class240.method1555(var5.field946, arg3, arg0, arg2 + 41065395);
                        }
                        if (~arg4 == -7) {
                            ++class310.field4429;
                            class114.method841(false, class287.field4139);
                            class240.method1555(var5.field946, arg3, arg0, 41065288);
                        }
                        if (arg4 == 7) {
                            ++class219.field3157;
                            class114.method841(false, class297.field4243);
                            class240.method1555(var5.field946, arg3, arg0, 41065288);
                        }
                        if (arg4 == 8) {
                            class114.method841(false, class58.field967);
                            ++class451.field6590;
                            class240.method1555(var5.field946, arg3, arg0, 41065288);
                        }
                        if (~arg4 == -10) {
                            class114.method841(false, class396.field5826);
                            ++class469.field6899;
                            class240.method1555(var5.field946, arg3, arg0, 41065288);
                        }
                        if (~arg4 == -11) {
                            ++class149.field2258;
                            class114.method841(false, class214.field3084);
                            class240.method1555(var5.field946, arg3, arg0, arg2 ^ -41065251);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class291() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        ++field4176;
        int[][] var3 = super.field5351.method2819((byte) -14, arg1);
        if (super.field5351.field6959) {
            int[][] var4 = this.method2291(0, (byte) -122, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class404.field5952 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4169[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field4172 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4169[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field4172) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4169[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field4172) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4174 * var12 >> 12;
                            var9[var11] = this.field4168 * var14 >> 12;
                            var10[var11] = this.field4166 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 >= -40) {
            this.field4172 = 4;
        }
        return var3;
    }
}
