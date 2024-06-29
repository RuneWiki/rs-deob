import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class60 extends class326 {

    @OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
    private int field801 = 0;

    @OriginalMember(owner = "client!jt", name = "R", descriptor = "[S")
    private short[] field799 = new short[512];

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    private int field796 = 2048;

    @OriginalMember(owner = "client!jt", name = "W", descriptor = "[B")
    private byte[] field804 = new byte[512];

    @OriginalMember(owner = "client!jt", name = "Y", descriptor = "I")
    private int field806 = 5;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    private int field795 = 1;

    @OriginalMember(owner = "client!jt", name = "ab", descriptor = "I")
    private int field808 = 5;

    @OriginalMember(owner = "client!jt", name = "Z", descriptor = "I")
    private int field807 = 2;

    @OriginalMember(owner = "client!jt", name = "X", descriptor = "[Ldg;")
    public static class261[] field805;

    @OriginalMember(owner = "client!jt", name = "V", descriptor = "Lmc;")
    public static class78 field803;

    @OriginalMember(owner = "client!jt", name = "db", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!jt", name = "eb", descriptor = "Loj;")
    public static class235 field812;

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!jt", name = "U", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!jt", name = "bb", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!jt", name = "cb", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field800;
        if (arg2 > -3) {
            this.field799 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field808 = arg1.method201((byte) -122);
                                }
                            } else {
                                this.field806 = arg1.method201((byte) -105);
                            }
                        } else {
                            this.field795 = arg1.method201((byte) -114);
                        }
                    } else {
                        this.field807 = arg1.method201((byte) -109);
                    }
                } else {
                    this.field796 = arg1.method215((byte) 97);
                }
            } else {
                this.field801 = arg1.method201((byte) -123);
            }
        } else {
            this.field806 = this.field808 = arg1.method201((byte) -122);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method420(int arg0, int arg1, String arg2) {
        class491.method2861(class257.field3424, arg1 + 25277);
        ++class346.field4767;
        ++field798;
        if (arg1 == -25276) {
            class203.field2751.method228(1 + class231.method1292((byte) 3, arg2), 32);
            class203.field2751.method213((byte) 45, arg0);
            class203.field2751.method208(arg2, -92);
        }
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
    public static void method421(int arg0) {
        field803 = null;
        if (arg0 > -32) {
            field805 = null;
        }
        field812 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIIZII)V")
    public static final void method422(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field809;
        if (class289.field3897 == null) {
            class98.field1432.method2222(arg5, arg2, arg1, -16777216, 112, arg4);
        } else if (class233.field3103.field6501 >= 0 && class233.field3103.field6501 < class295.field3947 * 128 && class233.field3103.field6507 >= 0 && class233.field3103.field6507 < class39.field567 * 128) {
            ++class67.field911;
            if (class233.field3103 != null && class233.field3103.field6501 + 64 + -(class233.field3103.method545(false) * 64) >> 7 == class345.field4761 && class233.field3103.field6507 + -(64 * class233.field3103.method545(false)) + 64 >> 7 == class124.field1817) {
                class345.field4761 = -1;
                class124.field1817 = -1;
                class1.method5(true);
            }
            class203.method1160(0);
            if (!arg3) {
                class65.method434(false);
            }
            class114.method727((byte) 124);
            class223.method1261(arg2, arg5, true, arg4, arg1, (byte) 85);
            int var6 = class148.field2111;
            int var7 = class422.field5730;
            int var8 = class13.field182;
            int var9 = class385.field5338;
            if (~class56.field772 == -2) {
                int var10 = (int) class239.field3186;
                if (var10 < class387.field5358 >> 8) {
                    var10 = class387.field5358 >> 8;
                }
                if (class278.field3687[4] && var10 < class4.field61[4] + 128) {
                    var10 = class4.field61[4] - -128;
                }
                int var11 = 16383 & (int) class270.field3610 + class41.field582;
                class26.method151(true, (var10 >> 3) * 3 + 600, class87.field1215, var8, -50 + class247.method1385(-122, class233.field3103.field6501, class233.field3103.field6507, class373.field5104), class36.field544, var11, var10);
            } else if (~class56.field772 != -5) {
                if (class56.field772 == 5) {
                    class299.method1681((byte) 75, var8);
                }
            } else {
                int var12 = (int) class239.field3186;
                if (var12 < class387.field5358 >> 8) {
                    var12 = class387.field5358 >> 8;
                }
                if (class278.field3687[4] && ~(class4.field61[4] + 128) < ~var12) {
                    var12 = class4.field61[4] - -128;
                }
                int var13 = 16383 & (int) class270.field3610;
                class26.method151(true, (var12 >> 3) * 3 + 600, class87.field1215, var8, class247.method1385(18, class186.field2560, class23.field306, class373.field5104) + -50, class36.field544, var13, var12);
            }
            int var14 = class197.field2680;
            int var15 = class195.field2638;
            int var16 = class412.field5637;
            int var17 = class155.field2171;
            int var18 = class348.field4796;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class278.field3687[var19]) {
                    int var22 = (int) ((double) (class467.field6463[var19] * 2 - -1) * Math.random() - (double) class467.field6463[var19] + Math.sin((double) class419.field5687[var19] / 100.0D * (double) class409.field5604[var19]) * (double) class4.field61[var19]);
                    if (var19 == 4) {
                        class155.field2171 += var22;
                        if (~class155.field2171 <= -1025) {
                            if (~class155.field2171 < -3073) {
                                class155.field2171 = 3072;
                            }
                        } else {
                            class155.field2171 = 1024;
                        }
                    }
                    if (~var19 == -2) {
                        class195.field2638 += var22;
                    }
                    if (var19 == 3) {
                        class348.field4796 = class348.field4796 + var22 & 16383;
                    }
                    if (~var19 == -3) {
                        class412.field5637 += var22;
                    }
                    if (~var19 == -1) {
                        class197.field2680 += var22;
                    }
                }
            }
            if (class197.field2680 < 0) {
                class197.field2680 = 0;
            }
            if (arg0 != 101) {
                method420(-66, -95, (String) null);
            }
            if (class412.field5637 < 0) {
                class412.field5637 = 0;
            }
            if ((class143.field2058 << 7) + -1 < class197.field2680) {
                class197.field2680 = (class143.field2058 << 7) + -1;
            }
            if (~class412.field5637 < ~((class91.field1344 << 7) + -1)) {
                class412.field5637 = (class91.field1344 << 7) + -1;
            }
            class94.method594(82);
            class458.method2690((byte) 42);
            class98.field1432.method1981(var6, var9, var6 + var7, var8 + var9);
            class98.field1432.method2005();
            int var20 = class476.field6568;
            if (class11.field147 != null) {
                class11.field147.method2691(class348.field4796, class143.field2057 << 3, class98.field1432, var8, class155.field2171, var20, var6, 0, var7, var9);
            } else {
                class98.field1432.method2064(var20);
            }
            class183.method1073(-1);
            class62.field820.method1030(class197.field2680, class195.field2638, class412.field5637, 16383 & -class155.field2171, -class348.field4796 & 16383, -class176.field2398 & 16383);
            class98.field1432.method1956(class62.field820);
            class98.field1432.method1975(var6 - -(var7 / 2), var8 / 2 + var9, class171.field2350 << 1, class171.field2350 << 1);
            class276.method1553(class171.field2350 << 1, var7 / 2 + var6, class171.field2350 << 1, var8 / 2 + var9, (byte) -86);
            class432.method2552(class412.field5637, class195.field2638, arg0 + 117, -class176.field2398 & 16383, 16383 & -class348.field4796, -class155.field2171 & 16383, class197.field2680);
            byte var21 = ~class488.field6789.method2412((byte) -123, class222.field2958) == -3 ? (byte) class67.field911 : 1;
            class15.method97(class98.field1432, class70.field968, class195.field2636, class62.field820, class197.field2680, class195.field2638, class412.field5637, class191.field2589, class138.field2006, class97.field1420, class121.field1774, class108.field1612, class127.field1866, class233.field3103.field6502 + 1, var21, class233.field3103.field6501 >> 7, class233.field3103.field6507 >> 7, !class488.field6789.field6673);
            class183.method1073(arg0 + -102);
            if (class18.field258 == 30) {
                class276.method1552(var9, 256, var8, var7, (byte) -54, var6, 256);
                class21.method129(var6, var7, 256, 2, var8, 256, var9);
                class64.method432(256, var8, var6, true, var7, 256, var9);
                class191.method1094(var9, 111, var8, var6, var7);
            }
            class73.method478();
            class195.field2638 = var15;
            class412.field5637 = var16;
            class197.field2680 = var14;
            class155.field2171 = var17;
            class348.field4796 = var18;
            if (class233.field3104 && ~class477.field6599.method1368(0) == -1) {
                class233.field3104 = false;
            }
            if (class233.field3104) {
                class98.field1432.method2222(var8, var6, var9, -16777216, 122, var7);
                class363.method2212(class284.field3828, false, class230.field3051.method1176(class110.field1676, (byte) -92), (byte) 69);
            }
        } else {
            class98.field1432.method2222(arg5, arg2, arg1, -16777216, arg0 + -1, arg4);
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
    private final void method423(byte arg0) {
        ++field797;
        Random var2 = new Random((long) this.field801);
        this.field799 = new short[512];
        if (~this.field796 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field799[var3] = (short) class257.method1447(20094, this.field796, var2);
            }
        }
        if (arg0 < 10) {
            method420(-49, 5, (String) null);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field802;
        int[] var3 = super.field4344.method130(arg1, 104);
        if (arg0 >= -6) {
            return null;
        } else {
            if (super.field4344.field286) {
                int var4 = 2048 - -(class95.field1400[arg1] * this.field808);
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class181.field2495; ++var7) {
                    class297.field3986 = Integer.MAX_VALUE;
                    class281.field3790 = Integer.MAX_VALUE;
                    class400.field5508 = Integer.MAX_VALUE;
                    class453.field6144 = Integer.MAX_VALUE;
                    int var8 = class389.field5375[var7] * this.field806 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                        int var13 = this.field804[255 & (~this.field808 < ~var11 ? var11 : -this.field808 + var11)] & 255;
                        for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                            int var15 = (this.field804[var13 + (~this.field806 >= ~var14 ? -this.field806 + var14 : var14) & 255] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = var8 - this.field799[var15] + -(var14 << 12);
                            int var17 = var4 - ((var11 << 12) + this.field799[var27]);
                            int var18 = this.field795;
                            int var19;
                            if (var18 != 1) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (~var17 > -1 ? -var17 : var17) + (var16 < 0 ? -var16 : var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var17 > -1 ? -var17 : var17;
                                    int var26 = var16 < 0 ? -var16 : var16;
                                    var19 = ~var26 < ~var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~var19 <= ~class453.field6144) {
                                if (~class400.field5508 >= ~var19) {
                                    if (var19 < class281.field3790) {
                                        class297.field3986 = class281.field3790;
                                        class281.field3790 = var19;
                                    } else if (class297.field3986 > var19) {
                                        class297.field3986 = var19;
                                    }
                                } else {
                                    class297.field3986 = class281.field3790;
                                    class281.field3790 = class400.field5508;
                                    class400.field5508 = var19;
                                }
                            } else {
                                class297.field3986 = class281.field3790;
                                class281.field3790 = class400.field5508;
                                class400.field5508 = class453.field6144;
                                class453.field6144 = var19;
                            }
                        }
                    }
                    int var12 = this.field807;
                    if (var12 != 0) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class453.field6144 + class400.field5508;
                                    }
                                } else {
                                    var3[var7] = class297.field3986;
                                }
                            } else {
                                var3[var7] = class281.field3790;
                            }
                        } else {
                            var3[var7] = class400.field5508;
                        }
                    } else {
                        var3[var7] = class453.field6144;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field810;
        if (arg0 > -100) {
            field805 = null;
        }
        this.field804 = class409.method2458((byte) -94, this.field801);
        this.method423((byte) 94);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    static {
        new class206("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field805 = new class261[4];
        field803 = new class78(38, 4);
        field811 = -1;
        field812 = new class235(0);
    }
}
