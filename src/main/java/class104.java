import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class104 extends class272 {

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "[B")
    private byte[] field1873 = new byte[512];

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "[S")
    private short[] field1881 = new short[512];

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private int field1876 = 2048;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    private int field1872 = 0;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    private int field1877 = 1;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    private int field1871 = 5;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    private int field1888 = 5;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    private int field1890 = 2;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static volatile int field1880 = 0;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "Lli;")
    public static class185 field1886 = class245.method1649("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", -13);

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "Lli;")
    public static class185 field1882 = class245.method1649("compass", 127);

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            return null;
        } else {
            ++field1874;
            int[] var3 = super.field4819.method1632(0, arg0);
            if (super.field4819.field4294) {
                int var4 = class232.field4177[arg0] * this.field1871 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~var7 > ~class246.field4385; ++var7) {
                    class145.field2759 = Integer.MAX_VALUE;
                    class84.field1665 = Integer.MAX_VALUE;
                    class3.field60 = Integer.MAX_VALUE;
                    class239.field4263 = Integer.MAX_VALUE;
                    int var8 = class38.field598[var7] * this.field1888 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                        int var13 = 255 & this.field1873[255 & (var11 >= this.field1871 ? -this.field1871 + var11 : var11)];
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = 2 * (this.field1873[255 & var13 + (var14 >= this.field1888 ? -this.field1888 + var14 : var14)] & 255);
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 + -this.field1881[var15] + var8;
                            int var17 = -(var11 << 12) - this.field1881[var27] + var4;
                            int var18 = this.field1877;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (var16 < 0 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var16 >= 0 ? var16 : -var16;
                                    int var26 = ~var17 <= -1 ? var17 : -var17;
                                    var19 = var26 >= var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class239.field4263 <= var19) {
                                if (var19 >= class3.field60) {
                                    if (class84.field1665 <= var19) {
                                        if (class145.field2759 > var19) {
                                            class145.field2759 = var19;
                                        }
                                    } else {
                                        class145.field2759 = class84.field1665;
                                        class84.field1665 = var19;
                                    }
                                } else {
                                    class145.field2759 = class84.field1665;
                                    class84.field1665 = class3.field60;
                                    class3.field60 = var19;
                                }
                            } else {
                                class145.field2759 = class84.field1665;
                                class84.field1665 = class3.field60;
                                class3.field60 = class239.field4263;
                                class239.field4263 = var19;
                            }
                        }
                    }
                    int var12 = this.field1890;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class239.field4263 + class3.field60;
                                    }
                                } else {
                                    var3[var7] = class145.field2759;
                                }
                            } else {
                                var3[var7] = class84.field1665;
                            }
                        } else {
                            var3[var7] = class3.field60;
                        }
                    } else {
                        var3[var7] = class239.field4263;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
    private final void method731(byte arg0) {
        ++field1885;
        Random var2 = new Random((long) this.field1872);
        if (arg0 <= 77) {
            this.method35(90, 78);
        }
        this.field1881 = new short[512];
        if (~this.field1876 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field1881[var3] = (short) class255.method1729(var2, 3, this.field1876);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class104() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILne;Lne;Z)I")
    public static final int method732(boolean arg0, int arg1, class199 arg2, class199 arg3, boolean arg4) {
        if (arg4) {
            field1889 = -103;
        }
        ++field1875;
        if (arg1 == 1) {
            int var5 = arg3.field2900;
            int var6 = arg2.field2900;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (arg1 == 2) {
            return arg3.method1429(!arg4).field4237.method1341(arg2.method1429(true).field4237, false);
        } else if (~arg1 == -4) {
            if (arg3.field3659.method1329(class275.field4871, (byte) 22)) {
                if (arg2.field3659.method1329(class275.field4871, (byte) 22)) {
                    return 0;
                } else {
                    return !arg0 ? 1 : -1;
                }
            } else if (arg2.field3659.method1329(class275.field4871, (byte) 22)) {
                return arg0 ? 1 : -1;
            } else {
                return arg3.field3659.method1341(arg2.field3659, false);
            }
        } else if (~arg1 == -5) {
            if (arg3.method1088(104)) {
                return !arg2.method1088(92) ? 1 : 0;
            } else {
                return arg2.method1088(87) ? -1 : 0;
            }
        } else if (arg1 == 5) {
            if (!arg3.method1083((byte) 105)) {
                return !arg2.method1083((byte) -20) ? 0 : -1;
            } else {
                return !arg2.method1083((byte) 115) ? 1 : 0;
            }
        } else if (~arg1 == -7) {
            if (arg3.method1089((byte) -118)) {
                return arg2.method1089((byte) -25) ? 0 : 1;
            } else {
                return arg2.method1089((byte) -3) ? -1 : 0;
            }
        } else if (arg1 == 7) {
            if (arg3.method1085(82)) {
                return arg2.method1085(74) ? 0 : 1;
            } else {
                return arg2.method1085(110) ? -1 : 0;
            }
        } else {
            return -arg2.field3654 + arg3.field3654;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
    public static void method733(byte arg0) {
        field1882 = null;
        if (arg0 != 65) {
            method733((byte) 43);
        }
        field1886 = null;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 != 0) {
            this.method113(-20);
        }
        this.field1873 = class39.method244(this.field1872, arg0 ^ 255);
        this.method731((byte) 95);
        ++field1879;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    public static final void method734(byte arg0) {
        ++field1878;
        if (~class69.method456((byte) 91) == -3) {
            byte var1 = (byte) (class252.field4478 + -4 & 255);
            int var2 = class252.field4478 % 104;
            if (arg0 != -46) {
                field1887 = 31;
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; ~var16 > -105; ++var16) {
                    class65.field1132[var3][var2][var16] = var1;
                }
            }
            if (~class265.field4703 != -4) {
                for (int var4 = 0; var4 < 2; ++var4) {
                    class216.field3963[var4] = -1000000;
                    class276.field4901[var4] = 1000000;
                    class282.field4977[var4] = 0;
                    class48.field790[var4] = 1000000;
                    class132.field2371[var4] = 0;
                }
                if (~class211.field3848 != -2) {
                    int var5 = class236.method1606(58, class268.field4745, class113.field2039, class265.field4703);
                    if (var5 - class7.field157 < 800 && ~(class239.field4262[class265.field4703][class113.field2039 >> 7][class268.field4745 >> 7] & 4) != -1) {
                        class149.method1056(1, (byte) 119, false, class268.field4745 >> 7, class153.field2896, class113.field2039 >> 7);
                        return;
                    }
                } else {
                    if (~(4 & class239.field4262[class265.field4703][class241.field4310.field2694 >> 7][class241.field4310.field2687 >> 7]) != -1) {
                        class149.method1056(0, (byte) 119, false, class241.field4310.field2687 >> 7, class153.field2896, class241.field4310.field2694 >> 7);
                    }
                    if (~class136.field2550 <= -311) {
                        return;
                    }
                    int var6 = class268.field4745 >> 7;
                    int var7 = class241.field4310.field2694 >> 7;
                    int var8 = class113.field2039 >> 7;
                    int var9;
                    if (var7 <= var8) {
                        var9 = -var7 + var8;
                    } else {
                        var9 = var7 - var8;
                    }
                    int var10 = class241.field4310.field2687 >> 7;
                    int var11;
                    if (~var10 >= ~var6) {
                        var11 = var6 - var10;
                    } else {
                        var11 = var10 - var6;
                    }
                    if (var9 > var11) {
                        int var12 = 32768;
                        int var13 = var11 * 65536 / var9;
                        while (var7 != var8) {
                            if (~var8 > ~var7) {
                                ++var8;
                            } else if (~var8 < ~var7) {
                                --var8;
                            }
                            if (~(4 & class239.field4262[class265.field4703][var8][var6]) != -1) {
                                class149.method1056(1, (byte) 119, false, var6, class153.field2896, var8);
                                return;
                            }
                            var12 += var13;
                            if (~var12 <= -65537) {
                                var12 -= 65536;
                                if (~var6 > ~var10) {
                                    ++var6;
                                } else if (var10 < var6) {
                                    --var6;
                                }
                                if (~(class239.field4262[class265.field4703][var8][var6] & 4) != -1) {
                                    class149.method1056(1, (byte) 119, false, var6, class153.field2896, var8);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var14 = var9 * 65536 / var11;
                    int var15 = 32768;
                    while (var6 != var10) {
                        if (var6 >= var10) {
                            if (~var10 > ~var6) {
                                --var6;
                            }
                        } else {
                            ++var6;
                        }
                        if (~(4 & class239.field4262[class265.field4703][var8][var6]) != -1) {
                            class149.method1056(1, (byte) 119, false, var6, class153.field2896, var8);
                            return;
                        }
                        var15 += var14;
                        if (~var15 <= -65537) {
                            var15 -= 65536;
                            if (~var8 <= ~var7) {
                                if (~var7 > ~var8) {
                                    --var8;
                                }
                            } else {
                                ++var8;
                            }
                            if ((4 & class239.field4262[class265.field4703][var8][var6]) != 0) {
                                class149.method1056(1, (byte) 119, false, var6, class153.field2896, var8);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(III)Lm;")
    public static final class38 method735(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class38 var4 = var3.field3636;
            var3.field3636 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Ljd;")
    public static final class118 method736(int arg0) {
        ++field1884;
        class118 var1 = new class118(34);
        var1.method877((byte) 97, 11);
        if (arg0 != -28218) {
            return null;
        } else {
            var1.method877((byte) 121, class215.field3951);
            var1.method877((byte) 96, class156.field2962 ? 1 : 0);
            var1.method877((byte) 126, class163.field3055 ? 1 : 0);
            var1.method877((byte) 121, !class32.field533 ? 0 : 1);
            var1.method877((byte) 96, !class225.field4116 ? 0 : 1);
            var1.method877((byte) 127, !class1.field30 ? 0 : 1);
            var1.method877((byte) 113, !class7.field160 ? 0 : 1);
            var1.method877((byte) 109, class152.field2884 ? 1 : 0);
            var1.method877((byte) 114, !class194.field3578 ? 0 : 1);
            var1.method877((byte) 104, class84.field1666);
            var1.method877((byte) 95, !class217.field3979 ? 0 : 1);
            var1.method877((byte) 125, class14.field237 ? 1 : 0);
            var1.method877((byte) 119, !class178.field3262 ? 0 : 1);
            var1.method877((byte) 123, class207.field3809);
            var1.method877((byte) 120, !class140.field2634 ? 0 : 1);
            var1.method877((byte) 95, class250.field4461);
            var1.method877((byte) 97, class193.field3568);
            var1.method877((byte) 123, class280.field4965);
            var1.method856(31133, class236.field4222);
            var1.method856(31133, class97.field1821);
            var1.method877((byte) 96, class16.method121());
            var1.method842(class216.field3962, -6596);
            var1.method877((byte) 114, class56.field965);
            var1.method877((byte) 107, !class72.field1264 ? 0 : 1);
            var1.method877((byte) 108, class240.field4296 ? 1 : 0);
            var1.method877((byte) 124, class128.field2296);
            var1.method877((byte) 114, class138.field2574 ? 1 : 0);
            var1.method877((byte) 108, !class73.field1277 ? 0 : 1);
            return var1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 84 / ((-21 - arg1) / 55);
        ++field1883;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field1871 = arg0.method867(false);
                                }
                            } else {
                                this.field1888 = arg0.method867(false);
                            }
                        } else {
                            this.field1877 = arg0.method867(false);
                        }
                    } else {
                        this.field1890 = arg0.method867(false);
                    }
                } else {
                    this.field1876 = arg0.method827(255);
                }
            } else {
                this.field1872 = arg0.method867(false);
            }
        } else {
            this.field1888 = this.field1871 = arg0.method867(false);
        }
    }
}
