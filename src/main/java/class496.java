import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class496 extends class80 {

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field7278 = 0;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    private int field7274 = 1;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field7277 = 2048;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "[B")
    private byte[] field7286 = new byte[512];

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    private int field7273 = 2;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "[S")
    private short[] field7287 = new short[512];

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    private int field7275 = 5;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    private int field7288 = 5;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field7281 = 0;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field7276 = 0;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field7289 = 0;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Ls;")
    public static class186 field7283 = new class186(89, 8);

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Lmo;")
    public static class531 field7291 = new class531(4, 3);

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field7294 = "";

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "[J")
    public static long[] field7293;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)V", line = 7)
    public static final void method2995(int arg0, boolean arg1) {
        ++field7271;
        if (~class132.field2213 != ~arg0) {
            class339.field5099 = class484.field7129 = class231.field3585[arg0];
            class368.method2256((byte) 127);
            class316.field4800 = new int[class339.field5099][class484.field7129];
            class162.field2598 = new int[4][class339.field5099 >> 3][class484.field7129 >> 3];
            class56.field1188 = new int[class339.field5099][class484.field7129];
            if (!arg1) {
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    class67.field1367[var2] = class86.method799(class484.field7129, class339.field5099, arg1);
                }
                class249.field3848 = new byte[4][class339.field5099][class484.field7129];
                class478.method2853(class484.field7129, 4, class339.field5099, 31530);
                class508.method3045(class484.field7129 >> 3, class262.field4006, 191, class339.field5099 >> 3);
                class132.field2213 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V", line = 40)
    public static void method2996(boolean arg0) {
        field7283 = null;
        field7291 = null;
        if (arg0) {
            field7276 = -87;
        }
        field7293 = null;
        field7294 = null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 53)
    public static final void method2997(byte arg0) {
        ++field7279;
        if (!class237.field3652) {
            class161.method1148((byte) 127, class224.field3513);
            if (arg0 != -57) {
                method2995(-64, true);
            }
            if (class310.field4698 != null) {
                class161.method1148((byte) 116, class310.field4698);
            }
            class237.field3652 = true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V", line = 79)
    public final void method23(boolean arg0) {
        ++field7290;
        this.field7286 = class272.method1723(this.field7278, 6);
        if (!arg0) {
            this.field7288 = 33;
        }
        this.method2998((byte) 96);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)[I", line = 93)
    public final int[] method25(int arg0, int arg1) {
        ++field7282;
        if (arg1 != -16828) {
            this.method2998((byte) -76);
        }
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int var4 = class44.field795[arg0] * this.field7288 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class137.field2308 > var7; ++var7) {
                class143.field2409 = Integer.MAX_VALUE;
                class4.field79 = Integer.MAX_VALUE;
                class85.field1755 = Integer.MAX_VALUE;
                class470.field6981 = Integer.MAX_VALUE;
                int var8 = class460.field6860[var7] * this.field7275 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field7286[255 & (~this.field7288 < ~var11 ? var11 : -this.field7288 + var11)] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = (this.field7286[255 & var13 - -(this.field7275 > var14 ? var14 : -this.field7275 + var14)] & 255) * 2;
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field7287[var15];
                        int var17 = -this.field7287[var27] - (var11 << 12) + var4;
                        int var18 = this.field7274;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class470.field6981 > var19) {
                            class143.field2409 = class4.field79;
                            class4.field79 = class85.field1755;
                            class85.field1755 = class470.field6981;
                            class470.field6981 = var19;
                        } else if (var19 < class85.field1755) {
                            class143.field2409 = class4.field79;
                            class4.field79 = class85.field1755;
                            class85.field1755 = var19;
                        } else if (var19 >= class4.field79) {
                            if (var19 < class143.field2409) {
                                class143.field2409 = var19;
                            }
                        } else {
                            class143.field2409 = class4.field79;
                            class4.field79 = var19;
                        }
                    }
                }
                int var12 = this.field7273;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class470.field6981 + class85.field1755;
                                }
                            } else {
                                var3[var7] = class143.field2409;
                            }
                        } else {
                            var3[var7] = class4.field79;
                        }
                    } else {
                        var3[var7] = class85.field1755;
                    }
                } else {
                    var3[var7] = class470.field6981;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 391)
    public class496() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILnn;)V", line = 308)
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 75 / ((28 - arg1) / 53);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field7288 = arg2.method1858(-3256);
                                }
                            } else {
                                this.field7275 = arg2.method1858(-3256);
                            }
                        } else {
                            this.field7274 = arg2.method1858(-3256);
                        }
                    } else {
                        this.field7273 = arg2.method1858(-3256);
                    }
                } else {
                    this.field7277 = arg2.method1841((byte) -117);
                }
            } else {
                this.field7278 = arg2.method1858(-3256);
            }
        } else {
            this.field7275 = this.field7288 = arg2.method1858(-3256);
        }
        ++field7280;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)V", line = 395)
    private final void method2998(byte arg0) {
        int var2 = -45 / ((-71 - arg0) / 36);
        ++field7272;
        Random var3 = new Random((long) this.field7278);
        this.field7287 = new short[512];
        if (this.field7277 > 0) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field7287[var4] = (short) class32.method222(var3, -13086, this.field7277);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(Z)V", line = 456)
    public static final void method2999(boolean arg0) {
        if (!arg0) {
            if (~class255.field3909 != 0) {
                class68.method591(false, class255.field3909, -1, 7390, -1);
                class255.field3909 = -1;
            }
            ++field7285;
        }
    }
}
