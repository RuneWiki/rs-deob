import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class750 {

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "[I")
    public static int[] field10459 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "[I")
    public static int[] field10452 = new int[2048];

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public int field10450;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public int field10453;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public int field10454;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public int field10455;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field10456;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 6)
    public static final void method4178(byte arg0) {
        class564.field8163 = null;
        class121.field1650 = null;
        class711.field10018 = null;
        class690.field9787 = null;
        class166.field2361 = null;
        class168.field2376 = null;
        class663.field9475 = null;
        class703.field9911 = null;
        class139.field1899 = null;
        class25.field222 = null;
        class285.field3967 = null;
        class757.field10543 = null;
        class755.field10511 = null;
        class589.field8382 = null;
        field10457++;
        class242.field3575 = null;
        class357.field5267 = null;
        class193.field2838 = null;
        class208.field3141 = null;
        if (arg0 <= 62) {
            field10458 = 44;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIII)V", line = 35)
    public static final void method4179(int arg0, int arg1, int arg2, int arg3) {
        class375 var4 = class565.field8185[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class129 var5 = var4.field5428;
        class129 var6 = var4.field5424;
        if (var5 != null) {
            var5.field1778 = (short) (var5.field1778 * arg3 / (0x10 << class639.field9095 - 7));
            var5.field1779 = (short) (var5.field1779 * arg3 / (0x10 << class639.field9095 - 7));
        }
        if (var6 != null) {
            var6.field1778 = (short) (var6.field1778 * arg3 / (0x10 << class639.field9095 - 7));
            var6.field1779 = (short) (var6.field1779 * arg3 / (0x10 << class639.field9095 - 7));
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V", line = 61)
    public static void method4180(byte arg0) {
        int var1 = -123 % ((arg0 + 85) / 41);
        field10452 = null;
        field10459 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZI)Z", line = 78)
    public static final boolean method4181(int arg0, boolean arg1, int arg2) {
        field10456++;
        if (arg1) {
            method4180((byte) 40);
        }
        return (class369.method2318((byte) -94, arg2, arg0) | (arg0 & 0x2000) != 0 | class209.method1490(arg0, (byte) 83, arg2)) & class299.method1862(arg2, arg0, (byte) 21);
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V", line = 93)
    public static final void method4182(byte arg0) {
        field10460++;
        if (!class147.field2154) {
            class34.field311 = class638.field9031 != -1 && class456.field6499 >= class638.field9031 || ((class404.field5765 ? 26 : 22) + class456.field6499 * 16) > class565.field8187;
        }
        class351.field5206.method3553(0);
        class389.field5612.method3553(0);
        if (arg0 <= 74) {
            field10452 = null;
        }
        for (class304 var1 = (class304) class303.field4137.method3565(126); var1 != null; var1 = (class304) class303.field4137.method3561((byte) 43)) {
            int var39 = var1.field4152;
            if (var39 < 1000) {
                var1.method2656((byte) 117);
                if (var39 == 47 || var39 == 8 || var39 == 13 || var39 == 57 || var39 == 22 || var39 == 23 || var39 == 25) {
                    class389.field5612.method3559(var1, (byte) 12);
                } else {
                    class351.field5206.method3559(var1, (byte) 12);
                }
            }
        }
        class351.field5206.method3566(class303.field4137, (byte) 45);
        class389.field5612.method3566(class303.field4137, (byte) 104);
        if (class456.field6499 > 1) {
            if (class235.field3514 && class253.field3661.method2780(81, 114) && class456.field6499 > 2) {
                class242.field3576 = (class304) class303.field4137.field8734.field6186.field6186;
            } else {
                class242.field3576 = (class304) class303.field4137.field8734.field6186;
            }
            class585.field8347 = (class304) class303.field4137.field8734.field6186;
        } else {
            class585.field8347 = null;
            class242.field3576 = null;
        }
        int var2 = -1;
        class553 var3 = (class553) class466.field6643.method3565(-78);
        if (var3 != null) {
            var2 = var3.method762(-4);
        }
        if (!class147.field2154) {
            if (var2 == 0 && (class316.field4268 == 1 && class456.field6499 > 2 || class91.method708(-2001))) {
                var2 = 2;
            }
            if (var2 == 2 && class456.field6499 > 0 && var3 != null) {
                if (class131.field1810 == null && class520.field7494 == 0) {
                    class518.method3149(var3.method761(false), 20927, var3.method760(125));
                } else {
                    class3.field22 = 2;
                }
            }
            if (var2 == 0) {
                if (class242.field3576 != null) {
                    class401.method2440(false);
                } else if (class549.field7997) {
                    class61.method571(false);
                }
            }
            if (class131.field1810 == null && class520.field7494 == 0) {
                class3.field22 = 0;
                class691.field9800 = null;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class535.field7789.method2459(-32213);
            int var5 = class535.field7789.method2452(-88);
            boolean var6 = false;
            if (class537.field7799 != null) {
                if ((class327.field4441 - 10) <= var4 && (class666.field9521 + class327.field4441 + 10) >= var4 && var5 >= class90.field1279 - 10 && var5 <= class702.field9898 + class90.field1279 + 10) {
                    var6 = true;
                } else {
                    class338.method2080((byte) 74);
                }
            }
            if (!var6) {
                if (var4 < class132.field1820 - 10 || class132.field1820 + class314.field4246 + 10 < var4 || var5 < (class388.field5606 - 10) || (class388.field5606 + class731.field10246 + 10) < var5) {
                    class593.method3480(25387);
                } else if (class34.field311) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class654.field9376; var9++) {
                        if (class404.field5765) {
                            int var10 = class388.field5606 + (var9 * 16) + 33;
                            if ((var10 - 13) < var5 && (var10 + 4) > var5) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class388.field5606 + 31;
                            if ((var11 - 13) < var5 && var11 + 3 > var5) {
                                var7 = var9;
                                var8 = var11 - 13;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class139 var13 = new class139(class225.field3348);
                        for (class194 var14 = (class194) var13.method983(106); var14 != null; var14 = (class194) var13.method982(82)) {
                            if (var7 == var12) {
                                if (var14.field2845 > 1) {
                                    class271.method1770((byte) -115, var8, var14, var5);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method760(125);
        int var16 = var3.method761(false);
        if (class537.field7799 != null && var15 >= class327.field4441 && class666.field9521 + class327.field4441 >= var15 && class90.field1279 <= var16 && (class90.field1279 + class702.field9898) >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class537.field7799.field2845; var18++) {
                if (class404.field5765) {
                    int var23 = var18 * 16 + class90.field1279 + 33;
                    if (var23 - 13 < var16 && (var23 + 4) > var16) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class90.field1279 + 31;
                    if (var16 > var22 - 13 && var16 < (var22 + 3)) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class139 var20 = new class139(class537.field7799.field2841);
                for (class304 var21 = (class304) var20.method983(93); var21 != null; var21 = (class304) var20.method982(82)) {
                    if (var17 == var19) {
                        class17.method82(-115, var16, var15, var21);
                        break;
                    }
                    var19++;
                }
            }
            class593.method3480(25387);
            return;
        }
        if (class132.field1820 > var15 || var15 > (class314.field4246 + class132.field1820) || class388.field5606 > var16 || var16 > (class388.field5606 + class731.field10246)) {
            return;
        }
        if (class34.field311) {
            int var24 = -1;
            int var25 = -1;
            for (int var26 = 0; var26 < class654.field9376; var26++) {
                if (class404.field5765) {
                    int var28 = var26 * 16 + class388.field5606 + 33;
                    if (var28 - 13 < var16 && (var28 + 4) > var16) {
                        var25 = var28 - 13;
                        var24 = var26;
                        break;
                    }
                } else {
                    int var27 = class388.field5606 + (var26 * 16) + 31;
                    if (var16 > var27 - 13 && var27 + 3 > var16) {
                        var25 = var27 - 13;
                        var24 = var26;
                        break;
                    }
                }
            }
            if (var24 != -1) {
                int var29 = 0;
                class139 var30 = new class139(class225.field3348);
                for (class194 var31 = (class194) var30.method983(56); var31 != null; var31 = (class194) var30.method982(82)) {
                    if (var24 == var29) {
                        if (var31.field2845 == 1) {
                            class17.method82(-46, var16, var15, (class304) var31.field2841.field7165.field5596);
                            class593.method3480(25387);
                            return;
                        }
                        class271.method1770((byte) -125, var25, var31, var16);
                        return;
                    }
                    var29++;
                }
                return;
            }
        } else {
            int var32 = -1;
            for (int var33 = 0; var33 < class456.field6499; var33++) {
                if (class404.field5765) {
                    int var38 = ((class456.field6499 - var33 - 1) * 16) + class388.field5606 + 33;
                    if (var16 > (var38 - 13) && var38 + 4 > var16) {
                        var32 = var33;
                    }
                } else {
                    int var37 = (class456.field6499 - var33 - 1) * 16 + (class388.field5606 + 31);
                    if (var16 > (var37 - 13) && var16 < var37 + 3) {
                        var32 = var33;
                    }
                }
            }
            if (var32 != -1) {
                int var34 = 0;
                class587 var35 = new class587(class303.field4137);
                for (class304 var36 = (class304) var35.method3454(-52); var36 != null; var36 = (class304) var35.method3452(112)) {
                    if (var32 == var34) {
                        class17.method82(-19, var16, var15, var36);
                        break;
                    }
                    var34++;
                }
            }
            class593.method3480(25387);
        }
        return;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Laf;I)I", line = 503)
    public static final int method4183(class13 arg0, int arg1) {
        field10451++;
        if (arg1 != 13607) {
            field10458 = 96;
        }
        if (class234.field3509 == arg0) {
            return 5890;
        } else if (class272.field3857 == arg0) {
            return 34167;
        } else if (class401.field5746 == arg0) {
            return 34168;
        } else if (class231.field3462 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
