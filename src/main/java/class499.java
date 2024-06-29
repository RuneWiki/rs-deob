import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class499 extends class411 {

    @OriginalMember(owner = "client!bia", name = "A", descriptor = "Lea;")
    public static class547 field6805 = new class547(18, 3);

    @OriginalMember(owner = "client!bia", name = "E", descriptor = "[Ljea;")
    public static class452[] field6808 = new class452[14];

    @OriginalMember(owner = "client!bia", name = "p", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!bia", name = "q", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!bia", name = "s", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!bia", name = "t", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!bia", name = "y", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!bia", name = "B", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!bia", name = "r", descriptor = "Lufa;")
    private class680 field6796;

    @OriginalMember(owner = "client!bia", name = "u", descriptor = "Lufa;")
    public class680 field6799;

    @OriginalMember(owner = "client!bia", name = "v", descriptor = "Lufa;")
    private class680 field6800;

    @OriginalMember(owner = "client!bia", name = "w", descriptor = "Lufa;")
    private class680 field6801;

    @OriginalMember(owner = "client!bia", name = "x", descriptor = "Lufa;")
    private class680 field6802;

    @OriginalMember(owner = "client!bia", name = "C", descriptor = "Lufa;")
    private class680 field6807;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIZ)V")
    public final void method910(int arg0, int arg1, int arg2, boolean arg3) {
        ++field6794;
        int var5 = this.field6800.method666() + arg2;
        int var6 = arg2 + super.field5796.field2415 + -this.field6802.method666();
        int var7 = arg1 + this.field6796.method663();
        int var8 = arg1 + super.field5796.field2402 + -this.field6801.method663();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method2366(arg0 ^ 102) / 10000;
        int[] var12 = new int[4];
        class21.field142.method398(var12);
        class21.field142.method426(var5, var7, var5 + var11, var8);
        this.method820(var10, var9, var7, var5, (byte) 88);
        class21.field142.method426(var5 - -var11, var7, var6, var8);
        this.field6807.method3860(var5, var7, var9, var10);
        class21.field142.method426(var12[0], var12[1], var12[arg0], var12[3]);
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lni;Lni;Lij;)V")
    public class499(class522 arg0, class522 arg1, class424 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIB)V")
    public void method820(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field6797;
        this.field6799.method3860(arg3, arg2, arg1, arg0);
        if (arg4 <= 21) {
            method2790(56, 14);
        }
    }

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "(I)Z")
    public static final boolean method2788(int arg0) throws IOException {
        ++field6804;
        if (class582.field8161 == null) {
            return false;
        } else {
            if (class327.field4373 == null) {
                if (class340.field4586) {
                    if (!class582.field8161.method1435(-1949, 1)) {
                        return false;
                    }
                    class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                    class182.field2225 = 0;
                    ++class678.field9463;
                    class340.field4586 = false;
                }
                class569.field8012.field8520 = 0;
                if (class569.field8012.method2705((byte) 54)) {
                    if (!class582.field8161.method1435(-1949, 1)) {
                        return false;
                    }
                    class582.field8161.method1440(class569.field8012.field8529, 1, 2047, 1);
                    ++class678.field9463;
                    class182.field2225 = 0;
                }
                class340.field4586 = true;
                class547[] var1 = class34.method168(125);
                int var2 = class569.field8012.method2700(0);
                if (~var2 > -1 || ~var2 <= ~var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class569.field8012.field8520);
                }
                class327.field4373 = var1[var2];
                class488.field6682 = class327.field4373.field7718;
            }
            if (~class488.field6682 == 0) {
                if (!class582.field8161.method1435(-1949, 1)) {
                    return false;
                }
                class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 1);
                class182.field2225 = 0;
                class488.field6682 = class569.field8012.field8529[0] & 255;
                ++class678.field9463;
            }
            if (class488.field6682 == -2) {
                if (!class582.field8161.method1435(-1949, 2)) {
                    return false;
                }
                class582.field8161.method1440(class569.field8012.field8529, 0, 2047, 2);
                class569.field8012.field8520 = 0;
                class488.field6682 = class569.field8012.method3402((byte) 127);
                class678.field9463 += 2;
                class182.field2225 = 0;
            }
            if (~class488.field6682 < -1) {
                if (!class582.field8161.method1435(-1949, class488.field6682)) {
                    return false;
                }
                class569.field8012.field8520 = 0;
                class582.field8161.method1440(class569.field8012.field8529, 0, arg0 + -525198532, class488.field6682);
                class182.field2225 = 0;
                class678.field9463 += class488.field6682;
            }
            class422.field5904 = class681.field9489;
            class681.field9489 = class431.field6077;
            class431.field6077 = class327.field4373;
            if (class327.field4373 == class236.field3095) {
                class327.field4373 = null;
                return false;
            } else if (class589.field8232 == class327.field4373) {
                int var3 = class569.field8012.method3392(false);
                int var4 = class569.field8012.method3402((byte) 127);
                class386.field5455.method3552(-7469, var3, var4);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class24.field178) {
                boolean var5 = class569.field8012.method3428((byte) 64) == 1;
                String var6 = class569.field8012.method3403((byte) 84);
                String var7 = var6;
                if (var5) {
                    var7 = class569.field8012.method3403((byte) 84);
                }
                int var8 = class569.field8012.method3428((byte) 81);
                boolean var9 = false;
                if (var8 <= 1) {
                    if ((!class581.field8146 || class75.field906) && !class446.field6207) {
                        if (var8 <= 1 && class336.method1996(var7, (byte) 113)) {
                            var9 = true;
                        }
                    } else {
                        var9 = true;
                    }
                }
                if (!var9 && ~class378.field5252 == -1) {
                    String var10 = class199.method1100(class296.method1767(class569.field8012, (byte) 72), 62);
                    if (~var8 == -3) {
                        class291.method1735(var6, 24, "<img=1>" + var6, var10, -1, (String) null, (byte) -67, 0, "<img=1>" + var7);
                    } else if (~var8 == -2) {
                        class291.method1735(var6, 24, "<img=0>" + var6, var10, -1, (String) null, (byte) -82, 0, "<img=0>" + var7);
                    } else {
                        class291.method1735(var6, 24, var6, var10, -1, (String) null, (byte) -63, 0, var7);
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class343.field4607 == class327.field4373) {
                int var11 = class569.field8012.method3418(-2);
                int var12 = class569.field8012.method3402((byte) 127);
                class512.method2839(arg0 + -525200580);
                class247.method1480(var12, var11, 9767);
                class327.field4373 = null;
                return true;
            } else if (class761.field10612 == class327.field4373) {
                int var13 = class569.field8012.method3419((byte) 99);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class569.field8012.method3418(-2);
                int var15 = class569.field8012.method3408(-43);
                class512.method2839(arg0 ^ -525200580);
                class39.method191(var15, var14, 113, var13);
                class697 var16 = class761.field10628.method4169(var13, (byte) -125);
                class540.method2967(var16.field9802, var15, (byte) -104, var16.field9737, var16.field9814);
                class94.method649(var15, var16.field9763, true, var16.field9776, var16.field9768);
                class327.field4373 = null;
                return true;
            } else if (class516.field6968 == class327.field4373) {
                class512.method2839(-1);
                class685.method3879((byte) 1);
                class327.field4373 = null;
                return true;
            } else if (field6805 == class327.field4373) {
                int var17 = class569.field8012.method3411(arg0 ^ 525200557);
                int var18 = class569.field8012.method3435(true);
                class512.method2839(-1);
                class22.method86(-29680, var18, true, var17);
                class327.field4373 = null;
                return true;
            } else if (class522.field7042 == class327.field4373) {
                class418.method2400((byte) -45, class583.field8164);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class296.field3980) {
                int var19 = class569.field8012.method3408(-84);
                int var20 = class569.field8012.method3419((byte) -106);
                int var21 = class569.field8012.method3425((byte) -126);
                class512.method2839(-1);
                class526 var22 = (class526) class520.field6994.method2552((long) var19, arg0 ^ -525200580);
                if (var22 != null) {
                    class303.method1815(16398, false, var22, var22.field7062 != var20);
                }
                class94.method651(false, -126, var20, var19, var21);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class257.field3349) {
                int var23 = class569.field8012.method3402((byte) 127);
                int var24 = class569.field8012.method3408(-89);
                class512.method2839(-1);
                class332.method1968(var24, 17, var23);
                class327.field4373 = null;
                return true;
            } else if (class685.field9549 == class327.field4373) {
                class55.field565 = class569.field8012.method3435(true);
                class21.field156 = class569.field8012.method3429(-126);
                class327.field4373 = null;
                return true;
            } else if (class70.field764 == class327.field4373) {
                String var25 = class569.field8012.method3403((byte) 84);
                int var26 = class569.field8012.method3402((byte) 127);
                String var27 = class511.field6912.method1603(var26, 67).method3563(15281, class569.field8012);
                class291.method1735(var25, 19, var25, var27, var26, (String) null, (byte) -93, 0, var25);
                class327.field4373 = null;
                return true;
            } else if (class735.field10243 == class327.field4373) {
                class418.method2400((byte) -45, class348.field4628);
                class327.field4373 = null;
                return true;
            } else if (class374.field5198 == class327.field4373) {
                class418.method2400((byte) -45, class494.field6733);
                class327.field4373 = null;
                return true;
            } else if (class556.field7839 == class327.field4373) {
                class74.method550(arg0 + -525200579, class287.field3823, class569.field8012, class488.field6682);
                class327.field4373 = null;
                return true;
            } else if (class443.field6167 == class327.field4373) {
                int var28 = class569.field8012.method3402((byte) 127);
                String var29 = class569.field8012.method3403((byte) 84);
                class512.method2839(-1);
                class413.method2388(var29, var28, 52);
                class327.field4373 = null;
                return true;
            } else if (class462.field6393 == class327.field4373) {
                class358.method2061(19208, class569.field8012.method3403((byte) 84));
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class183.field2233) {
                int var30 = class569.field8012.method3408(-124);
                int var31 = class569.field8012.method3418(arg0 + -525200581);
                class512.method2839(-1);
                class526 var32 = (class526) class520.field6994.method2552((long) var31, -1);
                class526 var33 = (class526) class520.field6994.method2552((long) var30, -1);
                if (var33 != null) {
                    class303.method1815(16398, false, var33, var32 == null || var32.field7062 != var33.field7062);
                }
                if (var32 != null) {
                    var32.method315(arg0 ^ 525200538);
                    class520.field6994.method2558(var32, (long) var30, arg0 ^ -525200580);
                }
                class218 var34 = class357.method2056(var31, -9820);
                if (var34 != null) {
                    class277.method1652(1, var34);
                }
                class218 var35 = class357.method2056(var30, -9820);
                if (var35 != null) {
                    class277.method1652(arg0 + -525200578, var35);
                    class676.method3845(var35, true, (byte) -117);
                }
                if (class116.field1543 != -1) {
                    class522.method2904(1, class116.field1543, -43);
                }
                class327.field4373 = null;
                return true;
            } else if (class554.field7820 == class327.field4373) {
                boolean var36 = class569.field8012.method3428((byte) 15) == 1;
                byte[] var37 = new byte[class488.field6682 - 1];
                class569.field8012.method3389(var37, true, class488.field6682 + -1, 0);
                class55.method316(var37, var36, false);
                class327.field4373 = null;
                return true;
            } else if (class362.field4799 == class327.field4373) {
                while (class569.field8012.field8520 < class488.field6682) {
                    boolean var48 = class569.field8012.method3428((byte) 102) == 1;
                    String var49 = class569.field8012.method3403((byte) 84);
                    String var50 = class569.field8012.method3403((byte) 84);
                    int var51 = class569.field8012.method3402((byte) 127);
                    int var52 = class569.field8012.method3428((byte) 87);
                    String var53 = "";
                    boolean var54 = false;
                    if (var51 > 0) {
                        var53 = class569.field8012.method3403((byte) 84);
                        var54 = class569.field8012.method3428((byte) -100) == 1;
                    }
                    for (int var55 = 0; ~var55 > ~class233.field3026; ++var55) {
                        if (!var48) {
                            if (var49.equals(class512.field6935[var55])) {
                                if (class48.field490[var55] != var51) {
                                    boolean var56 = true;
                                    for (class554 var57 = (class554) class222.field2870.method113((byte) 15); var57 != null; var57 = (class554) class222.field2870.method119(false)) {
                                        if (var57.field7824.equals(var49)) {
                                            if (~var51 != -1 && ~var57.field7823 == -1) {
                                                var56 = false;
                                                var57.method975((byte) -72);
                                            } else if (var51 == 0 && ~var57.field7823 != -1) {
                                                var56 = false;
                                                var57.method975((byte) 126);
                                            }
                                        }
                                    }
                                    if (var56) {
                                        class222.field2870.method118(true, new class554(var49, var51));
                                    }
                                    class48.field490[var55] = var51;
                                }
                                class58.field621[var55] = var50;
                                class441.field6158[var55] = var53;
                                class179.field2206[var55] = var52;
                                var49 = null;
                                class24.field187[var55] = var54;
                                break;
                            }
                        } else if (var50.equals(class512.field6935[var55])) {
                            class512.field6935[var55] = var49;
                            var49 = null;
                            class58.field621[var55] = var50;
                            break;
                        }
                    }
                    if (var49 != null && ~class233.field3026 > -201) {
                        class512.field6935[class233.field3026] = var49;
                        class58.field621[class233.field3026] = var50;
                        class48.field490[class233.field3026] = var51;
                        class441.field6158[class233.field3026] = var53;
                        class179.field2206[class233.field3026] = var52;
                        class24.field187[class233.field3026] = var54;
                        ++class233.field3026;
                    }
                }
                class328.field4444 = class292.field3876;
                class543.field7686 = 2;
                boolean var38 = false;
                int var39 = class233.field3026;
                while (~var39 < -1) {
                    boolean var40 = true;
                    --var39;
                    for (int var41 = 0; ~var39 < ~var41; ++var41) {
                        if (class48.field490[var41] != class294.field3941.field7967 && ~class48.field490[var41 + 1] == ~class294.field3941.field7967 || class48.field490[var41] == 0 && class48.field490[var41 + 1] != 0) {
                            int var42 = class48.field490[var41];
                            class48.field490[var41] = class48.field490[var41 + 1];
                            class48.field490[var41 + 1] = var42;
                            String var43 = class441.field6158[var41];
                            class441.field6158[var41] = class441.field6158[var41 + 1];
                            class441.field6158[var41 + 1] = var43;
                            String var44 = class512.field6935[var41];
                            class512.field6935[var41] = class512.field6935[var41 - -1];
                            class512.field6935[var41 + 1] = var44;
                            String var45 = class58.field621[var41];
                            class58.field621[var41] = class58.field621[var41 + 1];
                            class58.field621[var41 + 1] = var45;
                            int var46 = class179.field2206[var41];
                            class179.field2206[var41] = class179.field2206[var41 + 1];
                            class179.field2206[var41 + 1] = var46;
                            boolean var47 = class24.field187[var41];
                            class24.field187[var41] = class24.field187[var41 + 1];
                            var40 = false;
                            class24.field187[var41 + 1] = var47;
                        }
                    }
                    if (var40) {
                        break;
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class496.field6748 == class327.field4373) {
                int var58 = class569.field8012.method3419((byte) -114);
                int var59 = class569.field8012.method3435(true);
                int var60 = class569.field8012.method3429(108);
                int var61 = class569.field8012.method3429(-110);
                int var62 = class569.field8012.method3425((byte) 122);
                class512.method2839(-1);
                class587.field8213[var62] = true;
                class24.field183[var62] = var59;
                class726.field10138[var62] = var61;
                class753.field10442[var62] = var60;
                class491.field6700[var62] = var58;
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class295.field3972) {
                class409.field5773 = class569.field8012.method3428((byte) 48);
                class327.field4373 = null;
                class585.field8194 = class292.field3876;
                return true;
            } else if (class578.field8114 == class327.field4373) {
                class106.method720(119);
                class327.field4373 = null;
                return false;
            } else if (class327.field4373 == class106.field1411) {
                class418.method2400((byte) -45, class180.field2212);
                class327.field4373 = null;
                return true;
            } else if (class574.field8080 == class327.field4373) {
                class569.field8012.field8520 += 28;
                if (class569.field8012.method3409(-114)) {
                    class584.method3260(class569.field8012.field8520 + -28, class569.field8012, true);
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class236.field3096) {
                int var63 = class569.field8012.method3418(-2);
                class512.method2839(arg0 + -525200580);
                if (var63 != -1) {
                    int var64 = (268430012 & var63) >> 14;
                    int var65 = var63 & 16383;
                    int var66 = var64 - class99.field1313;
                    int var67 = var65 - class133.field1704;
                    if (~var66 > -1) {
                        var66 = 0;
                    } else if (class272.field3589 <= var66) {
                        var66 = class272.field3589;
                    }
                    class520.field6999 = (var66 << 9) + 256;
                    if (~var67 <= -1) {
                        if (class3.field26 <= var67) {
                            var67 = class3.field26;
                        }
                    } else {
                        var67 = 0;
                    }
                    class39.field404 = (var67 << 9) + 256;
                } else {
                    class39.field404 = -1;
                    class520.field6999 = -1;
                }
                class327.field4373 = null;
                return true;
            } else if (class58.field628 == class327.field4373) {
                int var68 = class569.field8012.method3435(true);
                int var69 = class569.field8012.method3429(arg0 + -525200499);
                int var70 = class569.field8012.method3428((byte) 127);
                int var71 = class569.field8012.method3425((byte) -120);
                int var72 = class569.field8012.method3427((byte) 107) << 2;
                class512.method2839(arg0 + -525200580);
                class67.method512(-25686, var71, var69, var72, var68, var70);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class315.field4248) {
                class418.method2400((byte) -45, class571.field8045);
                class327.field4373 = null;
                return true;
            } else if (class471.field6517 == class327.field4373) {
                int var73 = class569.field8012.method3392(false);
                int var74 = class569.field8012.method3419((byte) 91);
                int var75 = class569.field8012.method3419((byte) -81);
                int var76 = class569.field8012.method3402((byte) 127);
                int var77 = class569.field8012.method3425((byte) -124);
                boolean var78 = ~(128 & var77) != -1;
                int var79 = var77 & 7;
                int var80 = 15 & var77 >> 3;
                if (var80 == 15) {
                    var80 = -1;
                }
                if (var73 >> 30 != 0) {
                    int var81 = var73 >> 28 & 3;
                    int var82 = ((var73 & 268426116) >> 14) - class99.field1313;
                    int var83 = (16383 & var73) + -class133.field1704;
                    if (var82 >= 0 && var83 >= 0 && class272.field3589 > var82 && ~class3.field26 < ~var83) {
                        int var84 = var82 * 512 + 256;
                        int var85 = var83 * 512 + 256;
                        int var86 = var81;
                        if (~var81 > -4 && class669.method3767(var83, (byte) -118, var82)) {
                            var86 = var81 + 1;
                        }
                        class640 var87 = new class640(var76, var75, class406.field5732, var81, var86, var84, -var74 + class86.method624(var81, var85, var84, 24111), var85, var82, var82, var83, var83, var79);
                        class576.field8091.method725(new class309(var87), -20911);
                    }
                } else if (~(var73 >> 29) == -1) {
                    if (~(var73 >> 28) != -1) {
                        int var88 = var73 & 65535;
                        class83 var89;
                        if (class247.field3207 == var88) {
                            var89 = class653.field9086;
                        } else {
                            var89 = class361.field4793[var88];
                        }
                        if (var89 != null) {
                            if (var76 == 65535) {
                                var76 = -1;
                            }
                            boolean var90 = true;
                            int var91 = var78 ? var89.field810 : var89.field829;
                            if (var76 != -1 && ~var91 != 0) {
                                if (~var76 != ~var91) {
                                    class49 var92 = class303.field4090.method3521(2, var76);
                                    class49 var93 = class303.field4090.method3521(2, var91);
                                    if (~var92.field497 != 0 && var93.field497 != -1) {
                                        class300 var94 = class460.field6365.method1090(var92.field497, 16383);
                                        class300 var95 = class460.field6365.method1090(var93.field497, 16383);
                                        if (~var94.field4056 > ~var95.field4056) {
                                            var90 = false;
                                        }
                                    }
                                } else {
                                    class49 var96 = class303.field4090.method3521(2, var76);
                                    if (var96.field496 && ~var96.field497 != 0) {
                                        class300 var97 = class460.field6365.method1090(var96.field497, arg0 + -525184196);
                                        int var98 = var97.field4043;
                                        if (~var98 != -1 && ~var98 != -3) {
                                            if (~var98 == -2) {
                                                var90 = true;
                                            }
                                        } else {
                                            var90 = false;
                                        }
                                    }
                                }
                            }
                            if (var90) {
                                if (!var78) {
                                    var89.field824 = 0;
                                    var89.field850 = 0;
                                    var89.field813 = 1;
                                    var89.field867 = var80;
                                    var89.field829 = var76;
                                    var89.field834 = var74;
                                    var89.field841 = var79;
                                    var89.field844 = class406.field5732 + var75;
                                    if (~var89.field844 < ~class406.field5732) {
                                        var89.field824 = -1;
                                    }
                                    if (~var89.field829 == -65536) {
                                        var89.field829 = -1;
                                    }
                                    if (var89.field829 != -1 && ~class406.field5732 == ~var89.field844) {
                                        int var99 = class303.field4090.method3521(arg0 + -525200577, var89.field829).field497;
                                        if (var99 != -1) {
                                            class300 var100 = class460.field6365.method1090(var99, 16383);
                                            if (var100 != null && var100.field4042 != null && !var89.field819) {
                                                class153.method930((byte) -128, var89, 0, var100);
                                            }
                                        }
                                    }
                                } else {
                                    var89.field886 = 0;
                                    var89.field885 = class406.field5732 + var75;
                                    var89.field793 = var80;
                                    var89.field810 = var76;
                                    var89.field804 = var79;
                                    var89.field889 = 0;
                                    var89.field808 = var74;
                                    var89.field880 = 1;
                                    if (~class406.field5732 > ~var89.field885) {
                                        var89.field889 = -1;
                                    }
                                    if (~var89.field810 == -65536) {
                                        var89.field810 = -1;
                                    }
                                    if (var89.field810 != -1 && class406.field5732 == var89.field885) {
                                        int var101 = class303.field4090.method3521(2, var89.field810).field497;
                                        if (var101 != -1) {
                                            class300 var102 = class460.field6365.method1090(var101, arg0 ^ 525194044);
                                            if (var102 != null && var102.field4042 != null && !var89.field819) {
                                                class153.method930((byte) -128, var89, 0, var102);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var103 = var73 & 65535;
                    class706 var104 = (class706) class681.field9475.method2552((long) var103, -1);
                    if (var104 != null) {
                        class215 var105 = var104.field9890;
                        if (var76 == 65535) {
                            var76 = -1;
                        }
                        boolean var106 = true;
                        int var107 = var78 ? var105.field810 : var105.field829;
                        if (~var76 != 0 && ~var107 != 0) {
                            if (~var76 == ~var107) {
                                class49 var108 = class303.field4090.method3521(arg0 ^ 525200577, var76);
                                if (var108.field496 && ~var108.field497 != 0) {
                                    class300 var109 = class460.field6365.method1090(var108.field497, 16383);
                                    int var110 = var109.field4043;
                                    if (var110 != 0 && var110 != 2) {
                                        if (var110 == 1) {
                                            var106 = true;
                                        }
                                    } else {
                                        var106 = false;
                                    }
                                }
                            } else {
                                class49 var111 = class303.field4090.method3521(2, var76);
                                class49 var112 = class303.field4090.method3521(2, var107);
                                if (~var111.field497 != 0 && ~var112.field497 != 0) {
                                    class300 var113 = class460.field6365.method1090(var111.field497, 16383);
                                    class300 var114 = class460.field6365.method1090(var112.field497, 16383);
                                    if (~var114.field4056 < ~var113.field4056) {
                                        var106 = false;
                                    }
                                }
                            }
                        }
                        if (var106) {
                            if (var78) {
                                var105.field885 = class406.field5732 + var75;
                                var105.field793 = var80;
                                var105.field886 = 0;
                                var105.field804 = var79;
                                var105.field810 = var76;
                                var105.field889 = 0;
                                var105.field880 = 1;
                                var105.field808 = var74;
                                if (class406.field5732 < var105.field885) {
                                    var105.field889 = -1;
                                }
                                if (var105.field810 != -1 && class406.field5732 == var105.field885) {
                                    int var115 = class303.field4090.method3521(2, var105.field810).field497;
                                    if (var115 != -1) {
                                        class300 var116 = class460.field6365.method1090(var115, 16383);
                                        if (var116 != null && var116.field4042 != null && !var105.field819) {
                                            class153.method930((byte) -128, var105, 0, var116);
                                        }
                                    }
                                }
                            } else {
                                var105.field813 = 1;
                                var105.field841 = var79;
                                var105.field824 = 0;
                                var105.field850 = 0;
                                var105.field829 = var76;
                                var105.field867 = var80;
                                var105.field844 = class406.field5732 - -var75;
                                var105.field834 = var74;
                                if (var105.field844 > class406.field5732) {
                                    var105.field824 = -1;
                                }
                                if (var105.field829 != -1 && ~class406.field5732 == ~var105.field844) {
                                    int var117 = class303.field4090.method3521(2, var105.field829).field497;
                                    if (~var117 != 0) {
                                        class300 var118 = class460.field6365.method1090(var117, 16383);
                                        if (var118 != null && var118.field4042 != null && !var105.field819) {
                                            class153.method930((byte) -128, var105, 0, var118);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class109.field1453) {
                class656.field9166 = class124.method800((byte) -107, class569.field8012.method3428((byte) -108));
                class327.field4373 = null;
                return true;
            } else if (class698.field9817 == class327.field4373) {
                class418.method2400((byte) -45, class614.field8606);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class135.field1725) {
                int var119 = class569.field8012.method3396(1689622712);
                int var120 = class569.field8012.method3418(-2);
                int var121 = class569.field8012.method3428((byte) 122);
                String var122 = "";
                String var123 = var122;
                if (~(var121 & 1) != -1) {
                    var122 = class569.field8012.method3403((byte) 84);
                    if (~(var121 & 2) != -1) {
                        var123 = class569.field8012.method3403((byte) 84);
                    } else {
                        var123 = var122;
                    }
                }
                String var124 = class569.field8012.method3403((byte) 84);
                if (var119 != 99) {
                    if (!var123.equals("") && class336.method1996(var123, (byte) 125)) {
                        class327.field4373 = null;
                        return true;
                    }
                    class270.method1616((byte) -113, var119, var124, var120, var123, var122, var122);
                } else {
                    class392.method2288(var124, -92);
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class276.field3684) {
                class418.method2400((byte) -45, class617.field8660);
                class327.field4373 = null;
                return true;
            } else if (class586.field8198 == class327.field4373) {
                String var125 = class569.field8012.method3403((byte) 84);
                boolean var126 = ~class569.field8012.method3428((byte) -103) == -2;
                String var127;
                if (var126) {
                    var127 = class569.field8012.method3403((byte) 84);
                } else {
                    var127 = var125;
                }
                int var128 = class569.field8012.method3402((byte) 127);
                byte var129 = class569.field8012.method3390((byte) -19);
                boolean var130 = false;
                if (var129 == -128) {
                    var130 = true;
                }
                if (!var130) {
                    String var131 = class569.field8012.method3403((byte) 84);
                    class690 var132 = new class690();
                    var132.field9667 = var125;
                    var132.field9660 = var127;
                    var132.field9658 = class540.method2966(-1, var132.field9660);
                    var132.field9661 = var129;
                    var132.field9662 = var128;
                    var132.field9666 = var131;
                    int var133;
                    for (var133 = class170.field2122 + -1; ~var133 <= -1; --var133) {
                        int var134 = class723.field10093[var133].field9658.compareTo(var132.field9658);
                        if (~var134 == -1) {
                            class723.field10093[var133].field9662 = var128;
                            class723.field10093[var133].field9661 = var129;
                            class723.field10093[var133].field9666 = var131;
                            if (var127.equals(class653.field9086.field1148)) {
                                class10.field60 = var129;
                            }
                            class112.field1479 = class292.field3876;
                            class327.field4373 = null;
                            return true;
                        }
                        if (var134 < 0) {
                            break;
                        }
                    }
                    if (~class170.field2122 <= ~class723.field10093.length) {
                        class327.field4373 = null;
                        return true;
                    }
                    for (int var135 = class170.field2122 + -1; ~var133 > ~var135; --var135) {
                        class723.field10093[var135 - -1] = class723.field10093[var135];
                    }
                    if (class170.field2122 == 0) {
                        class723.field10093 = new class690[100];
                    }
                    class723.field10093[var133 - -1] = var132;
                    ++class170.field2122;
                    if (var127.equals(class653.field9086.field1148)) {
                        class10.field60 = var129;
                    }
                } else {
                    if (~class170.field2122 == -1) {
                        class327.field4373 = null;
                        return true;
                    }
                    boolean var136 = false;
                    int var137;
                    for (var137 = 0; ~var137 > ~class170.field2122 && (!class723.field10093[var137].field9660.equals(var127) || class723.field10093[var137].field9662 != var128); ++var137) {
                    }
                    if (class170.field2122 > var137) {
                        while (~var137 > ~(class170.field2122 - 1)) {
                            class723.field10093[var137] = class723.field10093[var137 - -1];
                            ++var137;
                        }
                        --class170.field2122;
                        class723.field10093[class170.field2122] = null;
                    }
                }
                class327.field4373 = null;
                class112.field1479 = class292.field3876;
                return true;
            } else if (class393.field5561 == class327.field4373) {
                int var138 = class569.field8012.method3408(-91);
                int var139 = class569.field8012.method3425((byte) 59);
                class512.method2839(-1);
                class760.method4225(var139, -39, var138);
                class327.field4373 = null;
                return true;
            } else if (class526.field7063 == class327.field4373) {
                String var140 = class569.field8012.method3403((byte) 84);
                int var141 = class569.field8012.method3419((byte) 101);
                class512.method2839(arg0 + -525200580);
                class413.method2388(var140, var141, 68);
                class327.field4373 = null;
                return true;
            } else if (class523.field7049 == class327.field4373) {
                int var142 = class569.field8012.method3402((byte) 127);
                if (~var142 == -65536) {
                    var142 = -1;
                }
                int var143 = class569.field8012.method3428((byte) -123);
                int var144 = class569.field8012.method3402((byte) 127);
                int var145 = class569.field8012.method3428((byte) -118);
                class595.method3297(arg0 ^ -1807148081, var145, var143, var142, true, var144, 256);
                class327.field4373 = null;
                return true;
            } else if (class497.field6759 == class327.field4373) {
                int var146 = class569.field8012.method3419((byte) -31);
                int var147 = class569.field8012.method3448(true);
                class512.method2839(-1);
                class110.method743(var146, (byte) -85, var147);
                class327.field4373 = null;
                return true;
            } else if (class424.field5951 == class327.field4373) {
                int var148 = class569.field8012.method3402((byte) 127);
                class83 var149;
                if (class247.field3207 != var148) {
                    var149 = class361.field4793[var148];
                } else {
                    var149 = class653.field9086;
                }
                if (var149 == null) {
                    class327.field4373 = null;
                    return true;
                } else {
                    int var150 = class569.field8012.method3402((byte) 127);
                    int var151 = class569.field8012.method3428((byte) -112);
                    boolean var152 = ~(32768 & var150) != -1;
                    if (var149.field1148 != null && var149.field1121 != null) {
                        boolean var153 = false;
                        if (~var151 >= -2) {
                            if (!var152 && (class581.field8146 && !class75.field906 || class446.field6207)) {
                                var153 = true;
                            } else if (class336.method1996(var149.field1148, (byte) 117)) {
                                var153 = true;
                            }
                        }
                        if (!var153 && class378.field5252 == 0) {
                            int var154 = -1;
                            String var155;
                            if (!var152) {
                                var155 = class199.method1100(class296.method1767(class569.field8012, (byte) 72), 62);
                            } else {
                                var150 &= 32767;
                                class71 var156 = class221.method1262((byte) -12, class569.field8012);
                                var154 = var156.field765;
                                var155 = var156.field768.method3563(15281, class569.field8012);
                            }
                            var149.field822 = var155.trim();
                            var149.field853 = var150 >> 8;
                            var149.field858 = 255 & var150;
                            var149.field836 = 150;
                            int var157;
                            if (~var151 != -2 && ~var151 != -3) {
                                var157 = !var152 ? 2 : 17;
                            } else {
                                var157 = var152 ? 17 : 1;
                            }
                            if (~var151 == -3) {
                                class291.method1735(var149.field1147, var157, "<img=1>" + var149.method615(0, true), var155, var154, (String) null, (byte) -107, 0, "<img=1>" + var149.method611(-1, false));
                            } else if (var151 == 1) {
                                class291.method1735(var149.field1147, var157, "<img=0>" + var149.method615(0, true), var155, var154, (String) null, (byte) -84, 0, "<img=0>" + var149.method611(-1, false));
                            } else {
                                class291.method1735(var149.field1147, var157, var149.method615(arg0 ^ 525200579, true), var155, var154, (String) null, (byte) -81, 0, var149.method611(-1, false));
                            }
                        }
                    }
                    class327.field4373 = null;
                    return true;
                }
            } else if (class536.field7286 == class327.field4373) {
                int var158 = class569.field8012.method3402((byte) 127);
                if (~var158 == -65536) {
                    var158 = -1;
                }
                int var159 = class569.field8012.method3448(true);
                class512.method2839(arg0 + -525200580);
                class294.method1761(var159, 30585, var158);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class12.field76) {
                int var160 = class569.field8012.method3435(true);
                byte var161 = class569.field8012.method3386((byte) -112);
                class512.method2839(-1);
                class414.method2391(var161, 65280, var160);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class31.field271) {
                class418.method2400((byte) -45, class103.field1384);
                class327.field4373 = null;
                return true;
            } else if (class699.field9831 == class327.field4373) {
                int var162 = class569.field8012.method3427((byte) 112);
                class512.method2839(-1);
                class101.method694(256, var162);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class12.field70) {
                int var163 = class569.field8012.method3427((byte) -85);
                int var164 = class569.field8012.method3419((byte) 92);
                class512.method2839(-1);
                class659.method3724(var164, 0, arg0 + -525200495, var163);
                class327.field4373 = null;
                return true;
            } else if (class525.field7056 == class327.field4373) {
                int[] var165 = new int[4];
                for (int var166 = 0; ~var166 > -5; ++var166) {
                    var165[var166] = class569.field8012.method3427((byte) -104);
                }
                int var167 = class569.field8012.method3402((byte) 127);
                int var168 = class569.field8012.method3429(arg0 ^ -525200566);
                class706 var169 = (class706) class681.field9475.method2552((long) var167, -1);
                if (var169 != null) {
                    class340.method2005(var168, var169.field9890, arg0 ^ 525200578, var165);
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class176.field2173) {
                int var170 = class569.field8012.method3428((byte) 37);
                if (~class569.field8012.method3428((byte) 75) == -1) {
                    class507.field6864[var170] = new class278();
                } else {
                    --class569.field8012.field8520;
                    class507.field6864[var170] = new class278(class569.field8012);
                }
                class327.field4373 = null;
                class721.field10080 = class292.field3876;
                return true;
            } else if (class327.field4373 == class116.field1542) {
                int var171 = class569.field8012.method3425((byte) -112);
                int var172 = var171 >> 2;
                int var173 = var171 & 3;
                int var174 = class473.field6544[var172];
                int var175 = class569.field8012.method3419((byte) -40);
                if (var175 == 65535) {
                    var175 = -1;
                }
                int var176 = class569.field8012.method3408(arg0 + -525200657);
                int var177 = 3 & var176 >> 28;
                int var178 = (268432921 & var176) >> 14;
                int var179 = var178 - class99.field1313;
                int var180 = var176 & 16383;
                int var181 = var180 - class133.field1704;
                class412.method2380(var172, var173, true, var179, var181, var177, var175, var174);
                class327.field4373 = null;
                return true;
            } else if (class488.field6686 == class327.field4373) {
                class418.method2400((byte) -45, class589.field8226);
                class327.field4373 = null;
                return true;
            } else if (class569.field8023 == class327.field4373) {
                int var182 = class569.field8012.method3411(50);
                byte var183 = class569.field8012.method3433(128);
                class386.field5455.method3552(-7469, var183, var182);
                class327.field4373 = null;
                return true;
            } else if (class640.field8907 == class327.field4373) {
                if (class526.field7067 != null) {
                    class426.method2445(class11.field68.field5517.method2812((byte) 120), -1, 3, -1, false);
                }
                byte[] var184 = new byte[class488.field6682];
                class569.field8012.method2696(0, class488.field6682, var184, true);
                String var185 = class324.method1933(class488.field6682, 0, (byte) -84, var184);
                class58.method336(true, ~class11.field68.field5503.method741((byte) 127) == -2, var185, true, class287.field3823);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class227.field2954) {
                boolean var186 = ~class569.field8012.method3428((byte) 65) == -2;
                String var187 = class569.field8012.method3403((byte) 84);
                String var188 = var187;
                if (var186) {
                    var188 = class569.field8012.method3403((byte) 84);
                }
                long var189 = (long) class569.field8012.method3402((byte) 127);
                long var191 = (long) class569.field8012.method3385(arg0 ^ -525200576);
                int var193 = class569.field8012.method3428((byte) 106);
                long var194 = (var189 << 32) + var191;
                boolean var196 = false;
                int var197 = 0;
                while (true) {
                    if (~var197 <= -101) {
                        if (var193 <= 1) {
                            if ((!class581.field8146 || class75.field906) && !class446.field6207) {
                                if (class336.method1996(var188, (byte) 126)) {
                                    var196 = true;
                                }
                            } else {
                                var196 = true;
                            }
                        }
                        break;
                    }
                    if (class413.field5838[var197] == var194) {
                        var196 = true;
                        break;
                    }
                    ++var197;
                }
                if (!var196 && class378.field5252 == 0) {
                    class413.field5838[class690.field9669] = var194;
                    class690.field9669 = (class690.field9669 + 1) % 100;
                    String var198 = class199.method1100(class296.method1767(class569.field8012, (byte) 72), 62);
                    if (~var193 != -3) {
                        if (~var193 != -2) {
                            class291.method1735(var187, 3, var187, var198, -1, (String) null, (byte) -108, 0, var188);
                        } else {
                            class291.method1735(var187, 7, "<img=0>" + var187, var198, -1, (String) null, (byte) -120, 0, "<img=0>" + var188);
                        }
                    } else {
                        class291.method1735(var187, 7, "<img=1>" + var187, var198, -1, (String) null, (byte) -93, 0, "<img=1>" + var188);
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class353.field4710 == class327.field4373) {
                class447.method2512((byte) -101);
                class327.field4373 = null;
                return true;
            } else if (class397.field5631 == class327.field4373) {
                int var199 = class569.field8012.method3427((byte) 50);
                byte var200 = class569.field8012.method3390((byte) -19);
                class512.method2839(-1);
                class520.method2866(var200, var199, (byte) -120);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class182.field2226) {
                String var201 = class569.field8012.method3403((byte) 84);
                int var202 = class569.field8012.method3448(true);
                class512.method2839(arg0 ^ -525200580);
                class541.method3038(var202, (byte) -52, var201);
                class327.field4373 = null;
                return true;
            } else if (class661.field9241 == class327.field4373) {
                class727.method4076(false, class24.field181);
                class327.field4373 = null;
                return false;
            } else if (class327.field4373 == class201.field2390) {
                int var203 = class569.field8012.method3427((byte) -79);
                int var204 = class569.field8012.method3419((byte) -72);
                int var205 = class569.field8012.method3392(false);
                class512.method2839(-1);
                class400.method2315(var205, (var203 << 16) + var204, (byte) 111);
                class327.field4373 = null;
                return true;
            } else if (class412.field5818 == class327.field4373) {
                int var206 = class569.field8012.method3448(true);
                int var207 = class569.field8012.method3419((byte) -48);
                int var208 = class569.field8012.method3448(true);
                class512.method2839(-1);
                class590.method3282(var207, var206, 5, 4, var208);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class158.field2002) {
                class148.field1904 = class569.field8012.method3428((byte) 15);
                for (int var209 = 0; ~class148.field1904 < ~var209; ++var209) {
                    class554.field7827[var209] = class569.field8012.method3403((byte) 84);
                    class72.field775[var209] = class569.field8012.method3403((byte) 84);
                    if (class72.field775[var209].equals("")) {
                        class72.field775[var209] = class554.field7827[var209];
                    }
                    class270.field3568[var209] = class569.field8012.method3403((byte) 84);
                    class82.field1110[var209] = class569.field8012.method3403((byte) 84);
                    if (class82.field1110[var209].equals("")) {
                        class82.field1110[var209] = class270.field3568[var209];
                    }
                    class759.field10584[var209] = false;
                }
                class328.field4444 = class292.field3876;
                class327.field4373 = null;
                return true;
            } else if (class84.field1170 == class327.field4373) {
                class585.method3264(-1048016408);
                class327.field4373 = null;
                return false;
            } else if (class755.field10545 == class327.field4373) {
                int var210 = class569.field8012.method3425((byte) -107);
                int var211 = class569.field8012.method3411(75);
                class386.field5455.method3560(var211, var210, -32727);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class299.field4015) {
                int var212 = class569.field8012.method3411(arg0 ^ 525200514);
                if (var212 == 65535) {
                    var212 = -1;
                }
                int var213 = class569.field8012.method3429(-83);
                String var214 = class569.field8012.method3403((byte) 84);
                int var215 = class569.field8012.method3429(126);
                if (~var215 <= -2 && ~var215 >= -9) {
                    if (var214.equalsIgnoreCase("null")) {
                        var214 = null;
                    }
                    class476.field6573[var215 + -1] = var214;
                    class361.field4774[var215 + -1] = var212;
                    class381.field5272[var215 + -1] = ~var213 == -1;
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class137.field1741) {
                int var216 = class569.field8012.method3428((byte) 51);
                int var217 = var216 >> 5;
                int var218 = var216 & 31;
                if (~var218 == -1) {
                    class475.field6572[var217] = null;
                    class327.field4373 = null;
                    return true;
                } else {
                    class641 var219 = new class641();
                    var219.field8921 = var218;
                    var219.field8913 = class569.field8012.method3428((byte) 90);
                    if (var219.field8913 >= 0 && var219.field8913 < class635.field8820.length) {
                        if (~var219.field8921 != -2 && var219.field8921 != 10) {
                            if (~var219.field8921 <= -3 && var219.field8921 <= 6) {
                                if (var219.field8921 == 2) {
                                    var219.field8910 = 256;
                                    var219.field8922 = 256;
                                }
                                if (~var219.field8921 == -4) {
                                    var219.field8910 = 0;
                                    var219.field8922 = 256;
                                }
                                if (~var219.field8921 == -5) {
                                    var219.field8910 = 512;
                                    var219.field8922 = 256;
                                }
                                if (~var219.field8921 == -6) {
                                    var219.field8910 = 256;
                                    var219.field8922 = 0;
                                }
                                if (~var219.field8921 == -7) {
                                    var219.field8922 = 512;
                                    var219.field8910 = 256;
                                }
                                var219.field8921 = 2;
                                var219.field8914 = class569.field8012.method3428((byte) -112);
                                var219.field8910 += class569.field8012.method3402((byte) 127) - class99.field1313 << 9;
                                var219.field8922 += class569.field8012.method3402((byte) 127) + -class133.field1704 << 9;
                                var219.field8915 = class569.field8012.method3428((byte) 2) << 2;
                                var219.field8912 = class569.field8012.method3402((byte) 127);
                            }
                        } else {
                            var219.field8918 = class569.field8012.method3402((byte) 127);
                            class569.field8012.field8520 += 6;
                        }
                        var219.field8911 = class569.field8012.method3402((byte) 127);
                        if (var219.field8911 == 65535) {
                            var219.field8911 = -1;
                        }
                        class475.field6572[var217] = var219;
                    }
                    class327.field4373 = null;
                    return true;
                }
            } else if (class552.field7811 == class327.field4373) {
                int var220 = class569.field8012.method3402((byte) 127);
                if (var220 == 65535) {
                    var220 = -1;
                }
                int var221 = class569.field8012.method3428((byte) 91);
                int var222 = class569.field8012.method3402((byte) 127);
                int var223 = class569.field8012.method3428((byte) 5);
                int var224 = class569.field8012.method3402((byte) 127);
                class595.method3297(-1962608884, var223, var221, var220, false, var222, var224);
                class327.field4373 = null;
                return true;
            } else if (class728.field10165 == class327.field4373) {
                int var225 = class569.field8012.method3429(arg0 ^ 525200520);
                int var226 = class569.field8012.method3435(true);
                int var227 = class569.field8012.method3427((byte) 57) << 2;
                int var228 = class569.field8012.method3435(true);
                int var229 = class569.field8012.method3435(true);
                class512.method2839(-1);
                class541.method3014(var225, var228, true, var227, var226, var229, arg0 + -525200676);
                class327.field4373 = null;
                return true;
            } else if (class501.field6826 == class327.field4373) {
                int var230 = class569.field8012.method3402((byte) 127);
                int var231 = class569.field8012.method3428((byte) 101);
                boolean var232 = (1 & var231) == 1;
                class362.method2075(arg0 + -525200605, var230, var232);
                int var233 = class569.field8012.method3402((byte) 127);
                for (int var234 = 0; ~var233 < ~var234; ++var234) {
                    int var235 = class569.field8012.method3411(84);
                    int var236 = class569.field8012.method3425((byte) -122);
                    if (var236 == 255) {
                        var236 = class569.field8012.method3392(false);
                    }
                    class153.method931(var232, var236, 3113, var230, var235 + -1, var234);
                }
                class25.field192[class321.method1919(class566.field7986++, 31)] = var230;
                class327.field4373 = null;
                return true;
            } else if (class578.field8109 == class327.field4373) {
                String var237 = class569.field8012.method3403((byte) 84);
                String var238 = class199.method1100(class296.method1767(class569.field8012, (byte) 72), 62);
                class270.method1616((byte) 44, 6, var238, 0, var237, var237, var237);
                class327.field4373 = null;
                return true;
            } else if (class84.field1168 == class327.field4373) {
                int var239 = class569.field8012.method3429(74);
                int var240 = class569.field8012.method3429(arg0 ^ 525200520);
                if (var239 == 255) {
                    var240 = -1;
                    var239 = -1;
                }
                class535.method2949((byte) -103, var239, var240);
                class327.field4373 = null;
                return true;
            } else if (class716.field10021 == class327.field4373) {
                class168.field2101 = class569.field8012.method3428((byte) -118);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class101.field1343) {
                class418.method2400((byte) -45, class295.field3976);
                class327.field4373 = null;
                return true;
            } else if (class687.field9626 == class327.field4373) {
                int var241 = class569.field8012.method3448(true);
                int var242 = class569.field8012.method3419((byte) 121);
                class512.method2839(-1);
                class704.method3969(true, var242, var241);
                class327.field4373 = null;
                return true;
            } else if (class582.field8152 == class327.field4373) {
                int var243 = class569.field8012.method3402((byte) 127);
                int var244 = class569.field8012.method3402((byte) 127);
                int var245 = class569.field8012.method3402((byte) 127);
                class512.method2839(-1);
                if (class357.field4742[var243] != null) {
                    for (int var246 = var244; var246 < var245; ++var246) {
                        int var247 = class569.field8012.method3385(arg0 + -525200702);
                        if (~class357.field4742[var243].length < ~var246 && class357.field4742[var243][var246] != null) {
                            class357.field4742[var243][var246].field2719 = var247;
                        }
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class165.field2067) {
                class418.method2400((byte) -45, class262.field3428);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class178.field2184) {
                int var248 = class569.field8012.method3429(arg0 + -525200497);
                int var249 = class569.field8012.method3419((byte) -81);
                boolean var250 = ~(1 & var248) == -2;
                class136.method850(true, var250, var249);
                class25.field192[class321.method1919(class566.field7986++, 31)] = var249;
                class327.field4373 = null;
                return true;
            } else if (class401.field5673 == class327.field4373) {
                int var251 = class569.field8012.method3435(true);
                int var252 = class569.field8012.method3411(102);
                class512.method2839(-1);
                if (var251 == 2) {
                    class191.method1068(arg0 ^ 525200577);
                }
                class116.field1543 = var252;
                class401.method2320(var252, arg0 + -525213468);
                class574.method3221(-124, false);
                class498.method2786(class116.field1543);
                for (int var253 = 0; ~var253 > -101; ++var253) {
                    class24.field186[var253] = true;
                }
                class327.field4373 = null;
                return true;
            } else if (class639.field8876 == class327.field4373) {
                int var254 = class569.field8012.method3425((byte) -128);
                int var255 = class569.field8012.method3425((byte) -128);
                int var256 = class569.field8012.method3427((byte) 90);
                if (~var256 == -65536) {
                    var256 = -1;
                }
                class142.method884(var256, var254, (byte) -83, var255);
                class327.field4373 = null;
                return true;
            } else if (class571.field8037 == class327.field4373) {
                int var257 = class569.field8012.method3391((byte) -108);
                int var258 = class569.field8012.method3429(88);
                int var259 = class569.field8012.method3427((byte) 42);
                if (~var259 == -65536) {
                    var259 = -1;
                }
                class90.method641(var257, var258, var259, 18596);
                class327.field4373 = null;
                return true;
            } else if (class380.field5263 == class327.field4373) {
                class325.field4359 = class569.field8012.method3428((byte) 100);
                class231.field2979 = class569.field8012.method3386((byte) -112) << 3;
                class64.field700 = class569.field8012.method3383(arg0 + -2023493939) << 3;
                while (~class569.field8012.field8520 > ~class488.field6682) {
                    class382 var260 = class750.method4178(-1)[class569.field8012.method3428((byte) 111)];
                    class418.method2400((byte) -45, var260);
                }
                class327.field4373 = null;
                return true;
            } else if (class493.field6727 == class327.field4373) {
                int var261 = class569.field8012.method3402((byte) 127);
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = class569.field8012.method3428((byte) 56);
                int var263 = class569.field8012.method3402((byte) 127);
                int var264 = class569.field8012.method3428((byte) 25);
                int var265 = class569.field8012.method3402((byte) 127);
                class728.method4083(var265, (byte) 1, var261, var262, var263, var264);
                class327.field4373 = null;
                return true;
            } else if (class552.field7812 == class327.field4373) {
                class512.method2839(arg0 + -525200580);
                class271.method1622(9268);
                class327.field4373 = null;
                return true;
            } else if (class33.field338 == class327.field4373) {
                int var266 = class569.field8012.method3419((byte) -39);
                int var267 = class569.field8012.method3418(-2);
                class386.field5455.method3560(var266, var267, arg0 ^ -525177622);
                class327.field4373 = null;
                return true;
            } else if (class587.field8207 == class327.field4373) {
                class418.method2400((byte) -45, class26.field196);
                class327.field4373 = null;
                return true;
            } else if (class611.field8555 == class327.field4373) {
                class64.field700 = class569.field8012.method3383(-1498293360) << 3;
                class325.field4359 = class569.field8012.method3425((byte) -106);
                class231.field2979 = class569.field8012.method3383(arg0 + -2023493939) << 3;
                class327.field4373 = null;
                return true;
            } else if (class48.field488 == class327.field4373) {
                int var268 = class569.field8012.method3402((byte) 127);
                int var269 = class569.field8012.method3428((byte) -100);
                boolean var270 = ~(1 & var269) == -2;
                while (~class569.field8012.field8520 > ~class488.field6682) {
                    int var271 = class569.field8012.method3396(1689622712);
                    int var272 = class569.field8012.method3402((byte) 127);
                    int var273 = 0;
                    if (~var272 != -1) {
                        var273 = class569.field8012.method3428((byte) -124);
                        if (var273 == 255) {
                            var273 = class569.field8012.method3418(arg0 + -525200581);
                        }
                    }
                    class153.method931(var270, var273, arg0 ^ 525197546, var268, var272 + -1, var271);
                }
                class25.field192[class321.method1919(class566.field7986++, 31)] = var268;
                class327.field4373 = null;
                return true;
            } else if (class513.field6942 == class327.field4373) {
                boolean var274 = class569.field8012.method3429(-31) == 1;
                class512.method2839(-1);
                class77.field942 = var274;
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class188.field2261) {
                class45.method275(class488.field6682, class569.field8012, arg0 + -525200579);
                class327.field4373 = null;
                return true;
            } else if (class357.field4743 == class327.field4373) {
                int var275 = class569.field8012.method3428((byte) -114);
                boolean var276 = ~(var275 & 1) == -2;
                String var277 = class569.field8012.method3403((byte) 84);
                String var278 = class569.field8012.method3403((byte) 84);
                if (var278.equals("")) {
                    var278 = var277;
                }
                String var279 = class569.field8012.method3403((byte) 84);
                String var280 = class569.field8012.method3403((byte) 84);
                if (var280.equals("")) {
                    var280 = var279;
                }
                if (var276) {
                    for (int var281 = 0; ~var281 > ~class148.field1904; ++var281) {
                        if (class72.field775[var281].equals(var280)) {
                            class554.field7827[var281] = var277;
                            class72.field775[var281] = var278;
                            class270.field3568[var281] = var279;
                            class82.field1110[var281] = var280;
                            break;
                        }
                    }
                } else {
                    class554.field7827[class148.field1904] = var277;
                    class72.field775[class148.field1904] = var278;
                    class270.field3568[class148.field1904] = var279;
                    class82.field1110[class148.field1904] = var280;
                    class759.field10584[class148.field1904] = class321.method1919(2, var275) == 2;
                    ++class148.field1904;
                }
                class327.field4373 = null;
                class328.field4444 = class292.field3876;
                return true;
            } else if (class327.field4373 == class30.field243) {
                boolean var282 = class569.field8012.method3428((byte) -125) == 1;
                String var283 = class569.field8012.method3403((byte) 84);
                String var284 = var283;
                if (var282) {
                    var284 = class569.field8012.method3403((byte) 84);
                }
                int var285 = class569.field8012.method3428((byte) -6);
                int var286 = class569.field8012.method3402((byte) 127);
                boolean var287 = false;
                if (var285 <= 1 && class336.method1996(var284, (byte) 108)) {
                    var287 = true;
                }
                if (!var287 && ~class378.field5252 == -1) {
                    String var288 = class511.field6912.method1603(var286, 44).method3563(arg0 + -525185298, class569.field8012);
                    if (var285 != 2) {
                        if (var285 != 1) {
                            class291.method1735(var283, 25, var283, var288, var286, (String) null, (byte) -100, 0, var284);
                        } else {
                            class291.method1735(var283, 25, "<img=0>" + var283, var288, var286, (String) null, (byte) -127, 0, "<img=0>" + var284);
                        }
                    } else {
                        class291.method1735(var283, 25, "<img=1>" + var283, var288, var286, (String) null, (byte) -123, 0, "<img=1>" + var284);
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class88.field1203 == class327.field4373) {
                class727.method4076(false, false);
                class327.field4373 = null;
                return false;
            } else if (class64.field703 == class327.field4373) {
                int var289 = class569.field8012.method3392(false);
                int var290 = class569.field8012.method3429(arg0 ^ 525200527);
                int var291 = class569.field8012.method3429(-103);
                class511.field6900[var290] = var289;
                class223.field2877[var290] = var291;
                class212.field2542[var290] = 1;
                int var292 = class464.field6420[var290] + -1;
                for (int var293 = 0; var292 > var293; ++var293) {
                    if (var289 >= class627.field8771[var293]) {
                        class212.field2542[var290] = var293 + 2;
                    }
                }
                class426.field6012[class321.method1919(31, class424.field5942++)] = var290;
                class327.field4373 = null;
                return true;
            } else if (class666.field9272 == class327.field4373) {
                class418.method2400((byte) -45, class516.field6965);
                class327.field4373 = null;
                return true;
            } else if (class677.field9455 == class327.field4373) {
                class29.field239 = ~class488.field6682 < -3 ? class569.field8012.method3403((byte) 84) : class755.field10506.method4201(class723.field10095, (byte) 25);
                class301.field4078 = class488.field6682 > 0 ? class569.field8012.method3402((byte) 127) : -1;
                class327.field4373 = null;
                if (~class301.field4078 == -65536) {
                    class301.field4078 = -1;
                }
                return true;
            } else if (class578.field8110 == class327.field4373) {
                class543.field7686 = 1;
                class327.field4373 = null;
                class328.field4444 = class292.field3876;
                return true;
            } else if (class472.field6534 == class327.field4373) {
                int var294 = class569.field8012.method3408(arg0 ^ -525200590);
                class512.method2839(-1);
                class590.method3282(class247.field3207, 0, 5, arg0 ^ 525200583, var294);
                class327.field4373 = null;
                return true;
            } else if (class690.field9668 == class327.field4373) {
                int var295 = class569.field8012.method3441(-1420625632);
                int var296 = class569.field8012.method3418(arg0 + -525200581);
                int var297 = class569.field8012.method3382(65536);
                class512.method2839(-1);
                class176.method1008(var297, (byte) -105, var295, var296);
                class327.field4373 = null;
                return true;
            } else if (arg0 != 525200579) {
                return true;
            } else if (class327.field4373 == class188.field2265) {
                int var298 = class569.field8012.method3448(true);
                class512.method2839(-1);
                class526 var299 = (class526) class520.field6994.method2552((long) var298, -1);
                if (var299 != null) {
                    class303.method1815(16398, false, var299, true);
                }
                if (class414.field5851 != null) {
                    class277.method1652(1, class414.field5851);
                    class414.field5851 = null;
                }
                class327.field4373 = null;
                return true;
            } else if (class629.field8777 == class327.field4373) {
                int var300 = class569.field8012.method3392(false);
                int var301 = class569.field8012.method3397(arg0 + -525200697);
                class512.method2839(arg0 ^ -525200580);
                class29.method116(var300, var301, true);
                class327.field4373 = null;
                return true;
            } else if (class659.field9195 == class327.field4373) {
                int var302 = class569.field8012.method3402((byte) 127);
                int var303 = class569.field8012.method3448(true);
                int var304 = class569.field8012.method3419((byte) -115);
                int var305 = class569.field8012.method3411(96);
                class512.method2839(-1);
                class590.method3282(var304 << 16 | var302, var305, 7, 4, var303);
                class327.field4373 = null;
                return true;
            } else if (class412.field5808 == class327.field4373) {
                class418.method2400((byte) -45, class363.field4805);
                class327.field4373 = null;
                return true;
            } else if (class685.field9605 == class327.field4373) {
                class756.field10559 = class569.field8012.method3426((byte) -1);
                class581.field8146 = class569.field8012.method3428((byte) 112) == 1;
                class327.field4373 = null;
                return true;
            } else if (class736.field10277 == class327.field4373) {
                if (~class116.field1543 != 0) {
                    class522.method2904(0, class116.field1543, -46);
                }
                class327.field4373 = null;
                return true;
            } else if (class374.field5202 == class327.field4373) {
                if (!class719.method4041(-6410, class713.field9949)) {
                    class167.field2097 = 30 * class569.field8012.method3402((byte) 127);
                } else {
                    class167.field2097 = (int) ((float) class569.field8012.method3402((byte) 127) * 2.5F);
                }
                class585.field8194 = class292.field3876;
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class288.field3827) {
                class418.method2400((byte) -45, class541.field7357);
                class327.field4373 = null;
                return true;
            } else if (class559.field7864 == class327.field4373) {
                int var306 = class569.field8012.method3427((byte) 75);
                class512.method2839(arg0 + -525200580);
                class103.method708((byte) 67, var306);
                class327.field4373 = null;
                return true;
            } else if (class615.field8613 == class327.field4373) {
                for (int var307 = 0; var307 < class361.field4793.length; ++var307) {
                    if (class361.field4793[var307] != null) {
                        class361.field4793[var307].field821 = null;
                        class361.field4793[var307].field871 = -1;
                    }
                }
                for (int var308 = 0; ~var308 > ~class12.field79; ++var308) {
                    class746.field10359[var308].field9890.field821 = null;
                    class746.field10359[var308].field9890.field871 = -1;
                }
                class327.field4373 = null;
                return true;
            } else if (class387.field5464 == class327.field4373) {
                int var309 = class569.field8012.method3392(false);
                class512.method2839(-1);
                class590.method3282(-1, -1, 3, arg0 ^ 525200583, var309);
                class327.field4373 = null;
                return true;
            } else if (class600.field8357 == class327.field4373) {
                boolean var310 = class569.field8012.method3428((byte) 20) == 1;
                String var311 = class569.field8012.method3403((byte) 84);
                String var312 = var311;
                if (var310) {
                    var312 = class569.field8012.method3403((byte) 84);
                }
                long var313 = class569.field8012.method3445(-105);
                long var315 = (long) class569.field8012.method3402((byte) 127);
                long var317 = (long) class569.field8012.method3385(-124);
                int var319 = class569.field8012.method3428((byte) 126);
                long var320 = (var315 << 32) + var317;
                boolean var322 = false;
                int var323 = 0;
                while (true) {
                    if (var323 >= 100) {
                        if (var319 <= 1) {
                            if ((!class581.field8146 || class75.field906) && !class446.field6207) {
                                if (class336.method1996(var312, (byte) 121)) {
                                    var322 = true;
                                }
                            } else {
                                var322 = true;
                            }
                        }
                        break;
                    }
                    if (class413.field5838[var323] == var320) {
                        var322 = true;
                        break;
                    }
                    ++var323;
                }
                if (!var322 && ~class378.field5252 == -1) {
                    class413.field5838[class690.field9669] = var320;
                    class690.field9669 = (class690.field9669 - -1) % 100;
                    String var324 = class199.method1100(class296.method1767(class569.field8012, (byte) 72), 62);
                    if (var319 != 2 && var319 != 3) {
                        if (~var319 == -2) {
                            class291.method1735(var311, 9, "<img=0>" + var311, var324, -1, class360.method2066(var313, arg0 + -525200681), (byte) -65, 0, "<img=0>" + var312);
                        } else {
                            class291.method1735(var311, 9, var311, var324, -1, class360.method2066(var313, -120), (byte) -84, 0, var312);
                        }
                    } else {
                        class291.method1735(var311, 9, "<img=1>" + var311, var324, -1, class360.method2066(var313, arg0 + -525200644), (byte) -113, 0, "<img=1>" + var312);
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class478.field6607 == class327.field4373) {
                int var325 = class569.field8012.method3408(-108);
                int var326 = class569.field8012.method3411(arg0 + -525200459);
                if (var326 == 65535) {
                    var326 = -1;
                }
                int var327 = class569.field8012.method3411(74);
                if (~var327 == -65536) {
                    var327 = -1;
                }
                int var328 = class569.field8012.method3448(true);
                class512.method2839(-1);
                for (int var329 = var327; ~var326 <= ~var329; ++var329) {
                    long var330 = ((long) var328 << 32) - -((long) var329);
                    class703 var332 = (class703) class310.field4196.method2552(var330, -1);
                    class703 var333;
                    if (var332 != null) {
                        var333 = new class703(var325, var332.field9872);
                        var332.method315(103);
                    } else if (~var329 == 0) {
                        var333 = new class703(var325, class357.method2056(var328, -9820).field2825.field9872);
                    } else {
                        var333 = new class703(var325, -1);
                    }
                    class310.field4196.method2558(var333, var330, -1);
                }
                class327.field4373 = null;
                return true;
            } else if (class641.field8916 == class327.field4373) {
                int var334 = class569.field8012.method3392(false);
                int var335 = class569.field8012.method3402((byte) 127);
                if (~var335 == -65536) {
                    var335 = -1;
                }
                int var336 = class569.field8012.method3411(66);
                int var337 = class569.field8012.method3402((byte) 127);
                if (~var337 == -65536) {
                    var337 = -1;
                }
                class512.method2839(-1);
                for (int var338 = var335; ~var338 >= ~var337; ++var338) {
                    long var339 = ((long) var334 << 32) - -((long) var338);
                    class703 var341 = (class703) class310.field4196.method2552(var339, -1);
                    class703 var342;
                    if (var341 != null) {
                        var342 = new class703(var341.field9868, var336);
                        var341.method315(110);
                    } else if (~var338 == 0) {
                        var342 = new class703(class357.method2056(var334, arg0 ^ -525191833).field2825.field9868, var336);
                    } else {
                        var342 = new class703(0, var336);
                    }
                    class310.field4196.method2558(var342, var339, arg0 ^ -525200580);
                }
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 == class15.field109) {
                int var343 = class569.field8012.method3448(true);
                int var344 = class569.field8012.method3411(111);
                int var345 = class569.field8012.method3402((byte) 127);
                int var346 = class569.field8012.method3402((byte) 127);
                class512.method2839(arg0 + -525200580);
                class540.method2967(var346, var343, (byte) -121, var345, var344);
                class327.field4373 = null;
                return true;
            } else if (class83.field1117 == class327.field4373) {
                class112.field1479 = class292.field3876;
                if (class488.field6682 == 0) {
                    class723.field10093 = null;
                    class288.field3829 = null;
                    class170.field2122 = 0;
                    class256.field3321 = null;
                    class327.field4373 = null;
                    return true;
                } else {
                    class288.field3829 = class569.field8012.method3403((byte) 84);
                    boolean var347 = class569.field8012.method3428((byte) 85) == 1;
                    if (var347) {
                        class569.field8012.method3403((byte) 84);
                    }
                    long var348 = class569.field8012.method3445(-126);
                    class256.field3321 = class543.method3084(-89, var348);
                    class362.field4798 = class569.field8012.method3390((byte) -19);
                    int var350 = class569.field8012.method3428((byte) 120);
                    if (~var350 == -256) {
                        class327.field4373 = null;
                        return true;
                    } else {
                        class170.field2122 = var350;
                        class690[] var351 = new class690[100];
                        for (int var352 = 0; ~var352 > ~class170.field2122; ++var352) {
                            var351[var352] = new class690();
                            var351[var352].field9667 = class569.field8012.method3403((byte) 84);
                            boolean var358 = class569.field8012.method3428((byte) -106) == 1;
                            if (var358) {
                                var351[var352].field9660 = class569.field8012.method3403((byte) 84);
                            } else {
                                var351[var352].field9660 = var351[var352].field9667;
                            }
                            var351[var352].field9658 = class540.method2966(arg0 ^ -525200580, var351[var352].field9660);
                            var351[var352].field9662 = class569.field8012.method3402((byte) 127);
                            var351[var352].field9661 = class569.field8012.method3390((byte) -19);
                            var351[var352].field9666 = class569.field8012.method3403((byte) 84);
                            if (var351[var352].field9660.equals(class653.field9086.field1148)) {
                                class10.field60 = var351[var352].field9661;
                            }
                        }
                        boolean var353 = false;
                        int var354 = class170.field2122;
                        while (var354 > 0) {
                            boolean var355 = true;
                            --var354;
                            for (int var356 = 0; var354 > var356; ++var356) {
                                if (~var351[var356].field9658.compareTo(var351[var356 + 1].field9658) < -1) {
                                    class690 var357 = var351[var356];
                                    var351[var356] = var351[var356 + 1];
                                    var351[var356 + 1] = var357;
                                    var355 = false;
                                }
                            }
                            if (var355) {
                                break;
                            }
                        }
                        class327.field4373 = null;
                        class723.field10093 = var351;
                        return true;
                    }
                }
            } else if (class360.field4770 == class327.field4373) {
                boolean var359 = class569.field8012.method3428((byte) -117) == 1;
                String var360 = class569.field8012.method3403((byte) 84);
                String var361 = var360;
                if (var359) {
                    var361 = class569.field8012.method3403((byte) 84);
                }
                long var362 = class569.field8012.method3445(-122);
                long var364 = (long) class569.field8012.method3402((byte) 127);
                long var366 = (long) class569.field8012.method3385(arg0 ^ -525200575);
                int var368 = class569.field8012.method3428((byte) -119);
                int var369 = class569.field8012.method3402((byte) 127);
                long var370 = (var364 << 32) + var366;
                boolean var372 = false;
                int var373 = 0;
                while (true) {
                    if (~var373 <= -101) {
                        if (var368 <= 1 && class336.method1996(var361, (byte) 103)) {
                            var372 = true;
                        }
                        break;
                    }
                    if (class413.field5838[var373] == var370) {
                        var372 = true;
                        break;
                    }
                    ++var373;
                }
                if (!var372 && class378.field5252 == 0) {
                    class413.field5838[class690.field9669] = var370;
                    class690.field9669 = (class690.field9669 - -1) % 100;
                    String var374 = class511.field6912.method1603(var369, 98).method3563(15281, class569.field8012);
                    if (var368 == 2) {
                        class291.method1735(var360, 20, "<img=1>" + var360, var374, var369, class360.method2066(var362, -76), (byte) -117, 0, "<img=1>" + var361);
                    } else if (var368 == 1) {
                        class291.method1735(var360, 20, "<img=0>" + var360, var374, var369, class360.method2066(var362, -113), (byte) -121, 0, "<img=0>" + var361);
                    } else {
                        class291.method1735(var360, 20, var360, var374, var369, class360.method2066(var362, -81), (byte) -53, 0, var361);
                    }
                }
                class327.field4373 = null;
                return true;
            } else if (class713.field9955 == class327.field4373) {
                int var375 = class569.field8012.method3419((byte) -102);
                int var376 = class569.field8012.method3448(true);
                class512.method2839(arg0 ^ -525200580);
                class520.method2866(var376, var375, (byte) -120);
                class327.field4373 = null;
                return true;
            } else if (class327.field4373 != class317.field4271) {
                if (class493.field6725 == class327.field4373) {
                    class18.method77(0);
                    class327.field4373 = null;
                    return true;
                } else if (class504.field6845 == class327.field4373) {
                    String var391 = class569.field8012.method3403((byte) 84);
                    Object[] var392 = new Object[var391.length() + 1];
                    for (int var393 = var391.length() + -1; var393 >= 0; --var393) {
                        if (var391.charAt(var393) != 's') {
                            var392[var393 + 1] = new Integer(class569.field8012.method3418(-2));
                        } else {
                            var392[var393 + 1] = class569.field8012.method3403((byte) 84);
                        }
                    }
                    var392[0] = new Integer(class569.field8012.method3418(-2));
                    class512.method2839(-1);
                    class404 var394 = new class404();
                    var394.field5709 = var392;
                    class498.method2775(var394);
                    class327.field4373 = null;
                    return true;
                } else if (class327.field4373 == class231.field2975) {
                    int var395 = class569.field8012.method3408(-112);
                    int var396 = class569.field8012.method3427((byte) -77);
                    if (~var396 == -65536) {
                        var396 = -1;
                    }
                    class512.method2839(-1);
                    class590.method3282(var396, -1, 2, arg0 ^ 525200583, var395);
                    class327.field4373 = null;
                    return true;
                } else if (class745.field10355 == class327.field4373) {
                    int var397 = class569.field8012.method3427((byte) 78);
                    if (var397 == 65535) {
                        var397 = -1;
                    }
                    int var398 = class569.field8012.method3418(-2);
                    class512.method2839(arg0 ^ -525200580);
                    class590.method3282(var397, -1, 1, 4, var398);
                    class327.field4373 = null;
                    return true;
                } else if (class354.field4720 == class327.field4373) {
                    int var399 = class569.field8012.method3428((byte) 8);
                    class512.method2839(-1);
                    class678.field9468 = var399;
                    class327.field4373 = null;
                    return true;
                } else if (class354.field4731 == class327.field4373) {
                    class292.field3892 = class569.field8012.method3413(false);
                    class585.field8194 = class292.field3876;
                    class327.field4373 = null;
                    return true;
                } else if (class327.field4373 == class324.field4345) {
                    int var400 = class569.field8012.method3418(-2);
                    class631.field8778 = class287.field3823.method4136(var400, 113);
                    class327.field4373 = null;
                    return true;
                } else if (class327.field4373 == class303.field4085) {
                    class386.field5455.method3556((byte) -79);
                    class670.field9318 += 32;
                    class327.field4373 = null;
                    return true;
                } else if (class639.field8866 == class327.field4373) {
                    class325.field4359 = class569.field8012.method3428((byte) -115);
                    class231.field2979 = class569.field8012.method3433(128) << 3;
                    class64.field700 = class569.field8012.method3390((byte) -19) << 3;
                    for (class270 var401 = (class270) class472.field6537.method2560(105); var401 != null; var401 = (class270) class472.field6537.method2557(-1)) {
                        int var404 = (int) (3L & var401.field556 >> 28);
                        int var405 = (int) (16383L & var401.field556);
                        int var406 = -class99.field1313 + var405;
                        int var407 = (int) (16383L & var401.field556 >> 14);
                        int var408 = -class133.field1704 + var407;
                        if (class325.field4359 == var404 && var406 >= class64.field700 && ~(class64.field700 - -8) < ~var406 && class231.field2979 <= var408 && ~var408 > ~(class231.field2979 - -8)) {
                            var401.method315(arg0 ^ 525200512);
                            if (~var406 <= -1 && ~var408 <= -1 && var406 < class272.field3589 && ~class3.field26 < ~var408) {
                                class753.method4191(var406, class325.field4359, (byte) 122, var408);
                            }
                        }
                    }
                    for (class189 var402 = (class189) class56.field574.method724(32); var402 != null; var402 = (class189) class56.field574.method723(96)) {
                        if (~var402.field2269 <= ~class64.field700 && var402.field2269 < class64.field700 + 8 && ~var402.field2270 <= ~class231.field2979 && ~(class231.field2979 + 8) < ~var402.field2270 && class325.field4359 == var402.field2273) {
                            var402.field2281 = true;
                        }
                    }
                    for (class189 var403 = (class189) class103.field1381.method724(32); var403 != null; var403 = (class189) class103.field1381.method723(arg0 + -525200461)) {
                        if (~class64.field700 >= ~var403.field2269 && var403.field2269 < class64.field700 + 8 && class231.field2979 <= var403.field2270 && ~(class231.field2979 + 8) < ~var403.field2270 && ~class325.field4359 == ~var403.field2273) {
                            var403.field2281 = true;
                        }
                    }
                    class327.field4373 = null;
                    return true;
                } else {
                    class760.method4223((Throwable) null, arg0 ^ -525200569, "T1 - " + (class327.field4373 != null ? class327.field4373.method3100((byte) 67) : -1) + "," + (class681.field9489 == null ? -1 : class681.field9489.method3100((byte) 76)) + "," + (class422.field5904 == null ? -1 : class422.field5904.method3100((byte) 71)) + " - " + class488.field6682);
                    class727.method4076(false, false);
                    return true;
                }
            } else {
                boolean var377 = class569.field8012.method3428((byte) 117) == 1;
                String var378 = class569.field8012.method3403((byte) 84);
                String var379 = var378;
                if (var377) {
                    var379 = class569.field8012.method3403((byte) 84);
                }
                long var380 = (long) class569.field8012.method3402((byte) 127);
                long var382 = (long) class569.field8012.method3385(-123);
                int var384 = class569.field8012.method3428((byte) 79);
                int var385 = class569.field8012.method3402((byte) 127);
                long var386 = (var380 << 32) + var382;
                boolean var388 = false;
                int var389 = 0;
                while (true) {
                    if (var389 >= 100) {
                        if (var384 <= 1 && class336.method1996(var379, (byte) 104)) {
                            var388 = true;
                        }
                        break;
                    }
                    if (class413.field5838[var389] == var386) {
                        var388 = true;
                        break;
                    }
                    ++var389;
                }
                if (!var388 && ~class378.field5252 == -1) {
                    class413.field5838[class690.field9669] = var386;
                    class690.field9669 = (class690.field9669 - -1) % 100;
                    String var390 = class511.field6912.method1603(var385, 98).method3563(15281, class569.field8012);
                    if (~var384 == -3) {
                        class291.method1735(var378, 18, "<img=1>" + var378, var390, var385, (String) null, (byte) -101, 0, "<img=1>" + var379);
                    } else if (~var384 != -2) {
                        class291.method1735(var378, 18, var378, var390, var385, (String) null, (byte) -97, 0, var379);
                    } else {
                        class291.method1735(var378, 18, "<img=0>" + var378, var390, var385, (String) null, (byte) -126, 0, "<img=0>" + var379);
                    }
                }
                class327.field4373 = null;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
    public final void method184(byte arg0) {
        super.method184(arg0);
        ++field6795;
        class424 var2 = (class424) super.field5796;
        this.field6799 = class79.method594(var2.field5952, super.field5787, (byte) -89);
        this.field6807 = class79.method594(var2.field5946, super.field5787, (byte) -89);
        this.field6800 = class79.method594(var2.field5954, super.field5787, (byte) -89);
        this.field6802 = class79.method594(var2.field5950, super.field5787, (byte) -89);
        this.field6796 = class79.method594(var2.field5943, super.field5787, (byte) -89);
        this.field6801 = class79.method594(var2.field5953, super.field5787, (byte) -89);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V")
    public static void method2789(boolean arg0) {
        field6805 = null;
        if (arg0) {
            method2790(-29, 33);
        }
        field6808 = null;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)Z")
    public final boolean method183(int arg0) {
        ++field6798;
        if (!super.method183(arg0)) {
            return false;
        } else {
            class424 var2 = (class424) super.field5796;
            if (!super.field5787.method2882(-22, var2.field5952)) {
                return false;
            } else if (!super.field5787.method2882(-81, var2.field5946)) {
                return false;
            } else if (!super.field5787.method2882(-87, var2.field5954)) {
                return false;
            } else if (!super.field5787.method2882(-58, var2.field5950)) {
                return false;
            } else if (!super.field5787.method2882(-61, var2.field5943)) {
                return false;
            } else {
                return super.field5787.method2882(-61, var2.field5953);
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIBZ)V")
    public final void method907(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 == -36) {
            if (arg3) {
                int[] var5 = new int[4];
                class21.field142.method398(var5);
                class21.field142.method426(arg1, arg0, super.field5796.field2415 + arg1, arg0 - -super.field5796.field2402);
                int var6 = this.field6800.method666();
                int var7 = this.field6800.method663();
                int var8 = this.field6802.method666();
                int var9 = this.field6802.method663();
                this.field6800.method3859(arg1, (-var7 + super.field5796.field2402) / 2 + arg0);
                this.field6802.method3859(arg1 - -super.field5796.field2415 + -var8, (-var9 + super.field5796.field2402) / 2 + arg0);
                class21.field142.method426(arg1, arg0, super.field5796.field2415 + arg1, this.field6796.method663() + arg0);
                this.field6796.method3860(arg1 + var6, arg0, -var6 + -var8 + super.field5796.field2415, super.field5796.field2402);
                int var10 = this.field6801.method663();
                class21.field142.method426(arg1, super.field5796.field2402 + arg0 - var10, super.field5796.field2415 + arg1, arg0 - -super.field5796.field2402);
                this.field6801.method3860(arg1 + var6, arg0 - -super.field5796.field2402 + -var10, -var8 + super.field5796.field2415 + -var6, super.field5796.field2402);
                class21.field142.method426(var5[0], var5[1], var5[2], var5[3]);
            }
            ++field6803;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)V")
    public static final void method2790(int arg0, int arg1) {
        ++field6806;
        class252 var2 = class150.method916(arg1, -114, 17);
        var2.method1497(0);
        if (arg0 < 94) {
            field6805 = null;
        }
    }
}
