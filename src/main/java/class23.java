import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class23 extends class117 {

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Z")
    private boolean field291 = true;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    private int field294 = 4096;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field288 = -1;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field296 = "Please remove ";

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "[I")
    public static int[] field293;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)V")
    public static final void method128(int arg0, int arg1) {
        int var2 = arg0;
        ++field300;
        if (~arg1 < ~arg0) {
            arg1 = arg0;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class240.field3834 += arg1 * 128;
        if (~class240.field3834 < ~field293.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class240.field3834 -= field293.length;
            class282.method1891(class137.field2168[var3], arg0 ^ 9223);
        }
        int var4 = (-arg1 + arg0) * 128;
        int var5 = arg1 * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var4; ++var7) {
            int var26 = class282.field4509[var6 - -var5] + -(field293[field293.length + -1 & class240.field3834 + var6] * arg1 / 6);
            if (~var26 > -1) {
                var26 = 0;
            }
            class282.field4509[var6++] = var26;
        }
        for (int var8 = -arg1 + arg0; ~var8 > ~var2; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (var25 < 50 && ~var24 < -11 && var24 < 118) {
                    class282.field4509[var23 + var24] = 255;
                } else {
                    class282.field4509[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; ~(-arg1 + var2) < ~var9; ++var9) {
            class233.field3749[var9] = class233.field3749[arg1 + var9];
        }
        for (int var10 = var2 - arg1; ~var10 > ~var2; ++var10) {
            class233.field3749[var10] = (int) (Math.sin((double) class44.field726 / 14.0D) * 16.0D + Math.sin((double) class44.field726 / 15.0D) * 14.0D + 12.0D * Math.sin((double) class44.field726 / 16.0D));
            ++class44.field726;
        }
        int var11 = ((1 & class29.field360) + arg1) / 2;
        class281.field4492 += arg1;
        if (~var11 < -1) {
            for (int var12 = 0; class281.field4492 > var12; ++var12) {
                int var21 = (int) (128.0D * Math.random()) + 128;
                int var22 = 2 + (int) (124.0D * Math.random());
                class282.field4509[(var21 << 7) + var22] = 192;
            }
            class281.field4492 = 0;
            for (int var13 = 0; ~var2 < ~var13; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (~(var20 - -var11) > -129) {
                        var18 += class282.field4509[var19 + var20 + var11];
                    }
                    if (~(-var11 + -1 + var20) <= -1) {
                        var18 -= class282.field4509[-var11 + -1 + var19 + var20];
                    }
                    if (~var20 <= -1) {
                        class241.field3843[var19 + var20] = var18 / (var11 * 2 - -1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var2 > var16; ++var16) {
                    int var17 = var16 * 128;
                    if (~var2 < ~(var11 + var16)) {
                        var15 += class241.field3843[var11 * 128 + (var14 - -var17)];
                    }
                    if (-var11 + var16 + -1 >= 0) {
                        var15 -= class241.field3843[-(var11 * 128) - (128 - (var14 + var17))];
                    }
                    if (var16 >= 0) {
                        class282.field4509[var14 - -var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZC)C")
    public static final char method129(boolean arg0, char arg1) {
        ++field289;
        if (~arg1 == -199) {
            return 'E';
        } else if (~arg1 == -231) {
            return 'e';
        } else if (~arg1 == -224) {
            return 's';
        } else if (~arg1 == -339) {
            return 'E';
        } else {
            if (!arg0) {
                method128(-6, -99);
            }
            return (char) (~arg1 == -340 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "(I)Z")
    public static final boolean method130(int arg0) {
        ++field298;
        try {
            if (~class22.field272 == arg0) {
                if (class156.field2440 == null) {
                    class156.field2440 = class197.method1382(class62.field1026, class293.field4691, class237.field3810);
                    if (class156.field2440 == null) {
                        return false;
                    }
                }
                if (class258.field4162 == null) {
                    class258.field4162 = new class65(class46.field785, class307.field4920);
                }
                if (class84.field1392.method2115(class258.field4162, 22050, class11.field119, (byte) 113, class156.field2440)) {
                    class84.field1392.method2098(-128);
                    class84.field1392.method2099(class236.field3800, (byte) -95);
                    class84.field1392.method2094((byte) 114, class33.field509, class156.field2440);
                    class258.field4162 = null;
                    class22.field272 = 0;
                    class62.field1026 = null;
                    class156.field2440 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class84.field1392.method2119(arg0 + -994449845);
            class22.field272 = 0;
            class258.field4162 = null;
            class156.field2440 = null;
            class62.field1026 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        ++field292;
        int var3 = 109 / ((37 - arg1) / 38);
        int[][] var4 = super.field1886.method419(arg0, (byte) -20);
        if (super.field1886.field1022) {
            int[] var5 = this.method837(0, 0, arg0 + -1 & class293.field4689);
            int[] var6 = this.method837(0, 0, arg0);
            int[] var7 = this.method837(0, 0, class293.field4689 & arg0 + 1);
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            for (int var11 = 0; var11 < class168.field2737; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field294;
                int var13 = (var6[class234.field3769 & var11 + 1] + -var6[var11 + -1 & class234.field3769]) * this.field294;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 >> 12;
                int var17 = var16 * var16 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var17) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 == -1) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var20 = 16777216 / var18;
                    var21 = var12 / var18;
                    var19 = var13 / var18;
                }
                if (this.field291) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var21 = 2048 - -(var21 >> 1);
                }
                var8[var11] = var19;
                var10[var11] = var21;
                var9[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(II)I")
    public static final int method131(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "(I)V")
    public static void method132(int arg0) {
        field296 = null;
        field293 = null;
        if (arg0 != -1) {
            field290 = 64;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field295;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field291 = ~arg0.method1133((byte) 53) == -2;
            }
        } else {
            this.field294 = arg0.method1142(-18970);
        }
        if (arg1 != 255) {
            this.method44((class162) null, 94, 107);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }
}
