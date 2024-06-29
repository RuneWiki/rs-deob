import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class231 extends class144 {

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "[S")
    private short[] field3320 = new short[512];

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    private int field3328 = 5;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    private int field3322 = 0;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    private int field3333 = 5;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    private int field3323 = 1;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    private int field3327 = 2048;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    private int field3331 = 2;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "[B")
    private byte[] field3337 = new byte[512];

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3332 = "Select";

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field3329;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3328 = arg1.method1407(114);
                                }
                            } else {
                                this.field3333 = arg1.method1407(111);
                            }
                        } else {
                            this.field3323 = arg1.method1407(111);
                        }
                    } else {
                        this.field3331 = arg1.method1407(116);
                    }
                } else {
                    this.field3327 = arg1.method1380(true);
                }
            } else {
                this.field3322 = arg1.method1407(arg2 + -20514);
            }
        } else {
            this.field3333 = this.field3328 = arg1.method1407(arg2 ^ 20728);
        }
        if (arg2 != 20630) {
            method1508((class216) null, -52);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lqi;I)Lmj;")
    public static final class144 method1508(class216 arg0, int arg1) {
        ++field3334;
        arg0.method1407(112);
        if (arg1 != 58) {
            return null;
        } else {
            int var2 = arg0.method1407(113);
            class144 var3 = class9.method61(var2, -30);
            var3.field2057 = arg0.method1407(arg1 ^ 86);
            int var4 = arg0.method1407(122);
            for (int var5 = 0; var4 > var5; ++var5) {
                int var6 = arg0.method1407(116);
                var3.method9(var6, arg0, 20630);
            }
            var3.method31((byte) -114);
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(B)V")
    private final void method1509(byte arg0) {
        if (arg0 != 101) {
            field3332 = null;
        }
        Random var2 = new Random((long) this.field3322);
        this.field3320 = new short[512];
        if (~this.field3327 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3320[var3] = (short) class198.method1277((byte) 37, this.field3327, var2);
            }
        }
        ++field3330;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static final void method1510(boolean arg0) {
        if (!arg0) {
            field3332 = null;
        }
        ++field3336;
        if (~class56.field653.toLowerCase().indexOf("microsoft") == 0) {
            class195.field2784[92] = 74;
            class195.field2784[59] = 57;
            class195.field2784[61] = 27;
            class195.field2784[93] = 43;
            class195.field2784[46] = 72;
            class195.field2784[91] = 42;
            class195.field2784[47] = 73;
            if (class56.field669 == null) {
                class195.field2784[222] = 59;
                class195.field2784[192] = 58;
            } else {
                class195.field2784[520] = 59;
                class195.field2784[222] = 58;
                class195.field2784[192] = 28;
            }
            class195.field2784[45] = 26;
            class195.field2784[44] = 71;
        } else {
            class195.field2784[223] = 28;
            class195.field2784[186] = 57;
            class195.field2784[187] = 27;
            class195.field2784[191] = 73;
            class195.field2784[190] = 72;
            class195.field2784[219] = 42;
            class195.field2784[189] = 26;
            class195.field2784[192] = 58;
            class195.field2784[188] = 71;
            class195.field2784[222] = 59;
            class195.field2784[220] = 74;
            class195.field2784[221] = 43;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)V")
    public static final void method1511(int arg0, int arg1) {
        ++field3335;
        int var2 = class204.field2902;
        if (arg1 != -13355) {
            method1510(true);
        }
        int var3 = class245.field3560;
        int var4 = class225.field3172;
        int var5 = class138.field2010;
        int var6 = (int) class159.field2310;
        int var7 = (int) class274.field4085 + class226.field3174 & 2047;
        int var8 = class280.field4246;
        if (~var6 > ~(class16.field195 / 256)) {
            var6 = class16.field195 / 256;
        }
        if (class229.field3259[4] && class1.field16[4] - -128 > var6) {
            var6 = class1.field16[4] + 128;
        }
        class247.method1596(var7, (byte) -115, class70.field821, arg0, var6 * 3 + 600, var6, class238.field3426, class4.method21(class177.field2507.field4553, class199.field2833, class177.field2507.field4563, (byte) 26) + -50);
        if (class245.field3560 == var3 && ~class225.field3172 == ~var4 && class204.field2902 == var2 && ~class280.field4246 == ~var8 && class138.field2010 == var5) {
            class4.field61 = 1;
        } else {
            class121.field1725 = 10;
            class150.field2177 = 10;
            class117.field1653 = 10;
            if (~var4 > ~class225.field3172) {
                var4 += (-var4 + class225.field3172) * class121.field1725 / 1000 + class117.field1653;
                if (~var4 > ~class225.field3172) {
                    class225.field3172 = var4;
                }
            }
            if (~class245.field3560 < ~var3) {
                var3 += class117.field1653 - -((class245.field3560 - var3) * class121.field1725 / 1000);
                if (class245.field3560 > var3) {
                    class245.field3560 = var3;
                }
            }
            class212.field2972 = 10;
            if (var8 < class280.field4246) {
                var8 += (-var8 + class280.field4246) * class212.field2972 / 1000 + class150.field2177;
                if (~var8 > ~class280.field4246) {
                    class280.field4246 = var8;
                }
            }
            if (class204.field2902 > var2) {
                var2 += class117.field1653 - -((-var2 + class204.field2902) * class121.field1725 / 1000);
                if (~class204.field2902 < ~var2) {
                    class204.field2902 = var2;
                }
            }
            if (class280.field4246 < var8) {
                int var9 = var8 - ((var8 - class280.field4246) * class212.field2972 / 1000 + class150.field2177);
                if (class280.field4246 < var9) {
                    class280.field4246 = var9;
                }
            }
            if (~var2 < ~class204.field2902) {
                int var10 = var2 - ((-class204.field2902 + var2) * class121.field1725 / 1000 + class117.field1653);
                if (~var10 < ~class204.field2902) {
                    class204.field2902 = var10;
                }
            }
            int var11 = -var5 + class138.field2010;
            if (var11 > 1024) {
                var11 -= 2048;
            }
            if (var11 < -1024) {
                var11 += 2048;
            }
            if (var3 > class245.field3560) {
                int var12 = var3 - ((var3 - class245.field3560) * class121.field1725 / 1000 + class117.field1653);
                if (class245.field3560 < var12) {
                    class245.field3560 = var12;
                }
            }
            if (var11 > 0) {
                int var13 = class212.field2972 * var11 / 1000 + class150.field2177 + var5;
                var5 = var13 & 2047;
            }
            if (var11 < 0) {
                int var14 = var5 - (-var11 * class212.field2972 / 1000 + class150.field2177);
                var5 = var14 & 2047;
            }
            if (~var4 < ~class225.field3172) {
                int var15 = var4 - (class117.field1653 - -((var4 - class225.field3172) * class121.field1725 / 1000));
                if (~class225.field3172 > ~var15) {
                    class225.field3172 = var15;
                }
            }
            int var16 = class138.field2010 - var5;
            if (~var16 < -1025) {
                var16 -= 2048;
            }
            if (var16 < -1024) {
                var16 += 2048;
            }
            if (var16 >= 0 || var11 <= 0 || var16 > 0 && var11 < 0) {
                class138.field2010 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field3324;
            int[] var3 = super.field2069.method425(true, arg0);
            if (super.field2069.field820) {
                int var4 = class143.field2045[arg0] * this.field3328 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class104.field1411; ++var7) {
                    class19.field231 = Integer.MAX_VALUE;
                    class138.field2006 = Integer.MAX_VALUE;
                    class16.field197 = Integer.MAX_VALUE;
                    class153.field2221 = Integer.MAX_VALUE;
                    int var8 = class87.field1178[var7] * this.field3333 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = 255 & this.field3337[(this.field3328 <= var11 ? -this.field3328 + var11 : var11) & 255];
                        for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                            int var15 = (255 & this.field3337[var13 + (this.field3333 <= var14 ? -this.field3333 + var14 : var14) & 255]) * 2;
                            int var10000 = var8 - (var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field3320[var15];
                            int var17 = -(var11 << 12) - (this.field3320[var27] - var4);
                            int var18 = this.field3323;
                            int var19;
                            if (var18 != 1) {
                                if (var18 != 3) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 > -1 ? -var16 : var16;
                                    int var26 = var17 >= 0 ? var17 : -var17;
                                    var19 = ~var25 >= ~var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class153.field2221 < ~var19) {
                                class19.field231 = class138.field2006;
                                class138.field2006 = class16.field197;
                                class16.field197 = class153.field2221;
                                class153.field2221 = var19;
                            } else if (~var19 > ~class16.field197) {
                                class19.field231 = class138.field2006;
                                class138.field2006 = class16.field197;
                                class16.field197 = var19;
                            } else if (class138.field2006 <= var19) {
                                if (class19.field231 > var19) {
                                    class19.field231 = var19;
                                }
                            } else {
                                class19.field231 = class138.field2006;
                                class138.field2006 = var19;
                            }
                        }
                    }
                    int var12 = this.field3331;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class153.field2221 + class16.field197;
                                    }
                                } else {
                                    var3[var7] = class19.field231;
                                }
                            } else {
                                var3[var7] = class138.field2006;
                            }
                        } else {
                            var3[var7] = class16.field197;
                        }
                    } else {
                        var3[var7] = class153.field2221;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)Z")
    public static final boolean method1512(int arg0) {
        ++field3321;
        if (arg0 != 2047) {
            method1508((class216) null, -11);
        }
        try {
            return class71.method432(-17597);
        } catch (IOException var4) {
            class185.method1208((byte) 108);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class6.field79 + "," + class294.field4651 + "," + class129.field1869 + " - " + class230.field3314 + "," + (class177.field2507.field4597[0] + class110.field1473) + "," + (class166.field2383 - -class177.field2507.field4585[0]) + " - ";
            for (int var3 = 0; var3 < class230.field3314 && ~var3 > -51; ++var3) {
                var2 = var2 + class163.field2332.field3030[var3] + ",";
            }
            class142.method918(arg0 + -2048, var5, var2);
            class233.method1517((byte) 91);
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
    public static void method1513(int arg0) {
        if (arg0 == -26269) {
            field3332 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field3326;
        this.field3337 = class260.method1665(this.field3322, -36);
        this.method1509((byte) 101);
        if (arg0 > -109) {
            this.field3327 = 96;
        }
    }
}
