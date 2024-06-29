import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class128 extends class37 {

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Z")
    private boolean field2763 = true;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "Z")
    private boolean field2771 = true;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "[S")
    public static short[] field2769 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2770;
        if (arg0 != 75) {
            this.field2763 = true;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(0, !this.field2763 ? arg1 : class105.field2348 - arg1, (byte) 122);
            if (!this.field2771) {
                class156.method1050(var4, 0, var3, 0, class72.field1719);
            } else {
                for (int var5 = 0; var5 < class72.field1719; ++var5) {
                    var3[var5] = var4[-var5 + class71.field1691];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int[][] var4 = this.method370(this.field2763 ? -arg0 + class105.field2348 : arg0, 0, 3);
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            if (!this.field2771) {
                for (int var11 = 0; class72.field1719 > var11; ++var11) {
                    var6[var11] = var7[var11];
                    var10[var11] = var8[var11];
                    var5[var11] = var9[var11];
                }
            } else {
                for (int var12 = 0; class72.field1719 > var12; ++var12) {
                    var6[var12] = var7[-var12 + class71.field1691];
                    var10[var12] = var8[-var12 + class71.field1691];
                    var5[var12] = var9[-var12 + class71.field1691];
                }
            }
        }
        if (arg1 <= 5) {
            field2765 = -106;
        }
        ++field2762;
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)Lfb;")
    public static final class53 method891(byte arg0) {
        ++field2764;
        if (arg0 != 95) {
            field2769 = null;
        }
        try {
            return (class53) Class.forName("oh").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 != 1) {
            method892(12);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field825 = ~arg2.method221(arg1 ^ -118) == -2;
                }
            } else {
                this.field2763 = arg2.method221(-110) == 1;
            }
        } else {
            this.field2771 = ~arg2.method221(-97) == -2;
        }
        ++field2768;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public static final void method892(int arg0) {
        class1.field11.method659(49, true);
        ++field2766;
        class1.field11.method239((byte) 104, (long) arg0);
        ++class130.field2796;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
    public static void method893(byte arg0) {
        int var1 = 83 / ((arg0 - 52) / 63);
        field2769 = null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public static final void method894(boolean arg0) {
        ++field2772;
        if (class20.field394 <= 0) {
            if (class191.field3839 > 0) {
                for (int var1 = 0; var1 < 256; ++var1) {
                    if (~class191.field3839 >= -769) {
                        if (class191.field3839 <= 256) {
                            class23.field461[var1] = class7.method35(class72.field1729[var1], class13.field234[var1], -class191.field3839 + 256, 0);
                        } else {
                            class23.field461[var1] = class13.field234[var1];
                        }
                    } else {
                        class23.field461[var1] = class7.method35(class13.field234[var1], class72.field1729[var1], -class191.field3839 + 1024, 0);
                    }
                }
            } else {
                for (int var2 = 0; ~var2 > -257; ++var2) {
                    class23.field461[var2] = class72.field1729[var2];
                }
            }
        } else {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                if (class20.field394 <= 768) {
                    if (class20.field394 > 256) {
                        class23.field461[var3] = class9.field186[var3];
                    } else {
                        class23.field461[var3] = class7.method35(class72.field1729[var3], class9.field186[var3], -class20.field394 + 256, 0);
                    }
                } else {
                    class23.field461[var3] = class7.method35(class9.field186[var3], class72.field1729[var3], -class20.field394 + 1024, 0);
                }
            }
        }
        short var4 = 256;
        int var5 = 0;
        int var6 = 0;
        int var7 = class3.field42.field223 * 9;
        for (int var8 = 1; ~var8 > ~(var4 + -1); ++var8) {
            int var21 = 22 - -((-var8 + var4) * class105.field2355[var8] / var4);
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var24 = class3.field42.field222[var7++];
                int var25 = class75.field1800[var6++];
                if (var25 == 0) {
                    class43.field944.field222[var5++] = var24;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class23.field461[var25];
                    class43.field944.field222[var5++] = class208.method1372(var27 * class208.method1372(var24, 65280) + class208.method1372(65280, var28) * var25, 16711680) + class208.method1372(class208.method1372(var28, 16711935) * var25 + var27 * class208.method1372(var24, 16711935), -16711936) >> 8;
                }
            }
            for (int var23 = 0; ~var23 > ~var21; ++var23) {
                class43.field944.field222[var5++] = class3.field42.field222[var7++];
            }
            var7 += class3.field42.field223 + -128;
        }
        int var9 = 0;
        int var10 = 0;
        if (arg0) {
            class43.field944.method93(0, 9);
            int var11 = class3.field42.field223 * 9 + 128;
            for (int var12 = 1; var12 < var4 - 1; ++var12) {
                int var13 = 22 - -((var4 - var12) * class105.field2355[var12] / var4);
                if (var13 < 0) {
                    var13 = 0;
                }
                for (int var14 = 0; var14 < var13; ++var14) {
                    int var10001 = var10++;
                    --var11;
                    class155.field3191.field222[var10001] = class3.field42.field222[var11];
                }
                for (int var15 = var13; ~var15 > -129; ++var15) {
                    --var11;
                    int var16 = class3.field42.field222[var11];
                    int var17 = class75.field1800[var9++];
                    if (~var17 != -1) {
                        int var19 = 256 - var17;
                        int var20 = class23.field461[var17];
                        class155.field3191.field222[var10++] = class208.method1372(class208.method1372(16711935, var16) * var19 + var17 * class208.method1372(var20, 16711935), -16711936) - -class208.method1372(16711680, var17 * class208.method1372(65280, var20) + class208.method1372(var16, 65280) * var19) >> 8;
                    } else {
                        class155.field3191.field222[var10++] = var16;
                    }
                }
                var9 += var13;
                var11 += class3.field42.field223 - -128;
            }
            class155.field3191.method93(637, 9);
        }
    }
}
