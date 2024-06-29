import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class163 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2766 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[Z")
    public static boolean[] field2767 = new boolean[112];

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Lwa;")
    public static class75 field2770 = class66.method560("<col=ffff00>", false);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "[I")
    public static int[] field2769 = new int[1000];

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lgb;")
    public static class158 field2768 = new class158(32);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lwa;")
    public static class75 field2779 = class66.method560("Lade)3)3)3", false);

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lwa;")
    public static class75 field2776 = class66.method560(" steht bereits auf Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2780 = -1;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lcb;")
    public static class267 field2778;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1219(int arg0, int arg1, int arg2) {
        field2774++;
        class118 var3 = (class118) class310.field5269.method1007((long) arg0, arg1 - 17004);
        if (var3 == null) {
            return 0;
        } else if (~arg2 == arg1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2001.length; var5++) {
                if (var3.field1999[var5] == arg2) {
                    var4 += var3.field2001[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1220(int arg0) {
        if (arg0 != 26462) {
            method1222(113);
        }
        field2768.method1201(arg0 ^ 0xFFFFD62F);
        field2775++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILwa;I)V", line = 56)
    public static final void method1221(int arg0, class75 arg1, int arg2) {
        field2772++;
        boolean var3 = false;
        class75 var4 = arg1.method610(21).method613(122);
        if (arg2 != 29458) {
            return;
        }
        for (int var5 = 0; var5 < class229.field3894; var5++) {
            class96 var6 = class169.field2842[class65.field1131[var5]];
            if (var6 != null && var6.field1561 != null && var6.field1561.method614(var4, -66)) {
                class112.method870(0, class279.field4831.field3236[0], (byte) 117, 1, false, 0, 2, 1, var6.field3236[0], 0, class279.field4831.field3205[0], var6.field3205[0]);
                var3 = true;
                if (arg0 == 1) {
                    class89.field1470.method87(65280, 152);
                    class89.field1470.method513((byte) -113, class65.field1131[var5]);
                    class10.field125++;
                } else if (arg0 == 4) {
                    class89.field1470.method87(65280, 112);
                    class130.field2250++;
                    class89.field1470.method503(-597878072, class65.field1131[var5]);
                } else if (arg0 == 5) {
                    class267.field4600++;
                    class89.field1470.method87(65280, 180);
                    class89.field1470.method513((byte) -111, class65.field1131[var5]);
                } else if (arg0 == 6) {
                    class187.field3119++;
                    class89.field1470.method87(arg2 + 35822, 250);
                    class89.field1470.method480((byte) -50, class65.field1131[var5]);
                } else if (arg0 == 7) {
                    class306.field5229++;
                    class89.field1470.method87(65280, 233);
                    class89.field1470.method493(class65.field1131[var5], (byte) 88);
                }
                break;
            }
        }
        if (!var3) {
            class162.method1216((byte) 38, 0, class66.method562((byte) -117, new class75[] { class306.field5223, var4 }), class121.field2037);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 132)
    public static final void method1222(int arg0) {
        if (arg0 != -4018) {
            method1220(-94);
        }
        class41.field655.method1200(false);
        field2773++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V", line = 157)
    public static final void method1223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2771++;
        if (class13.field176 == 0) {
            class144.field2484++;
            int var7 = class253.field4250;
            int var8 = class180.field3021;
            int var9 = class297.field5083;
            int var10 = class2.field5;
            int var11 = (arg4 - arg6) * (var10 - var8) / arg3 + var8;
            int var12 = (arg0 - arg1) * (var9 - var7) / arg2 + var7;
            if (class161.field2738 && (class123.field2056 & 0x40) == 64) {
                class262 var13 = class161.method1208(class29.field405, class206.field3482, (byte) 51);
                if (var13 == null) {
                    class189.method1428((byte) -60);
                } else {
                    class232.method1694(-501, class197.field3307, (short) 57, var12, class64.field1116, var11, 0L);
                }
            } else {
                class232.method1694(arg5 - 436, class9.field114, (short) 36, var12, class121.field2037, var11, 0L);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg5 != -65) {
            return;
        }
        while (class120.field2023 > var16) {
            long var17 = class210.field3586[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = ((int) var17 & 0x795C1CFE) >> 29;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                label301: {
                    var14 = var17;
                    if (var21 == 2 && class189.method1429(class67.field1174, var19, var20, var17)) {
                        class108 var23 = class3.method14((byte) 83, var22);
                        if (var23.field1812 != null) {
                            var23 = var23.method849(true);
                        }
                        if (var23 == null) {
                            break label301;
                        }
                        if (class13.field176 == 1) {
                            class233.field3955++;
                            class232.method1694(-501, class244.field4110, (short) 49, var19, class66.method562((byte) 121, new class75[] { class237.field3994, class164.field2781, var23.field1819 }), var20, var17);
                        } else if (!class161.field2738) {
                            class121.field2036++;
                            class75[] var24 = var23.field1845;
                            if (class78.field1344) {
                                var24 = class54.method395(var24, true);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; var25--) {
                                    if (var24[var25] != null) {
                                        class74.field1243++;
                                        short var26 = 0;
                                        if (var25 == 0) {
                                            var26 = 10;
                                        }
                                        if (var25 == 1) {
                                            var26 = 31;
                                        }
                                        if (var25 == 2) {
                                            var26 = 47;
                                        }
                                        if (var25 == 3) {
                                            var26 = 58;
                                        }
                                        if (var25 == 4) {
                                            var26 = 1004;
                                        }
                                        class232.method1694(-501, var24[var25], var26, var19, class66.method562((byte) 126, new class75[] { class306.field5222, var23.field1819 }), var20, var17);
                                    }
                                }
                            }
                            class232.method1694(-501, class245.field4122, (short) 1003, var19, class66.method562((byte) 119, new class75[] { class306.field5222, var23.field1819 }), var20, (long) var23.field1823);
                        } else if ((class123.field2056 & 0x4) == 4) {
                            class232.method1694(-501, class197.field3307, (short) 17, var19, class66.method562((byte) -44, new class75[] { class215.field3673, class164.field2781, var23.field1819 }), var20, var17);
                            class240.field4051++;
                        }
                    }
                    if (var21 == 1) {
                        class295 var27 = class35.field521[var22];
                        if (var27.field5070.field3854 == 1 && (var27.field3259 & 0x7F) == 64 && (var27.field3218 & 0x7F) == 64) {
                            for (int var28 = 0; var28 < class121.field2031; var28++) {
                                class295 var29 = class35.field521[class132.field2281[var28]];
                                if (var29 != null && var27 != var29 && var29.field5070.field3854 == 1 && var27.field3259 == var29.field3259 && var27.field3218 == var29.field3218) {
                                    class76.method666(var29.field5070, class132.field2281[var28], 37, var20, var19);
                                }
                            }
                            for (int var30 = 0; var30 < class229.field3894; var30++) {
                                class96 var31 = class169.field2842[class65.field1131[var30]];
                                if (var31 != null && var27.field3259 == var31.field3259 && var27.field3218 == var31.field3218) {
                                    class147.method1133((byte) 126, var20, var19, class65.field1131[var30], var31);
                                }
                            }
                        }
                        class76.method666(var27.field5070, var22, 37, var20, var19);
                    }
                    if (var21 == 0) {
                        class96 var32 = class169.field2842[var22];
                        if ((var32.field3259 & 0x7F) == 64 && (var32.field3218 & 0x7F) == 64) {
                            for (int var33 = 0; var33 < class121.field2031; var33++) {
                                class295 var34 = class35.field521[class132.field2281[var33]];
                                if (var34 != null && var34.field5070.field3854 == 1 && var32.field3259 == var34.field3259 && var32.field3218 == var34.field3218) {
                                    class76.method666(var34.field5070, class132.field2281[var33], 37, var20, var19);
                                }
                            }
                            for (int var35 = 0; var35 < class229.field3894; var35++) {
                                class96 var36 = class169.field2842[class65.field1131[var35]];
                                if (var36 != null && var32 != var36 && var32.field3259 == var36.field3259 && var32.field3218 == var36.field3218) {
                                    class147.method1133((byte) 125, var20, var19, class65.field1131[var35], var36);
                                }
                            }
                        }
                        class147.method1133((byte) 127, var20, var19, var22, var32);
                    }
                    if (var21 == 3) {
                        class170 var37 = class130.field2245[class67.field1174][var19][var20];
                        if (var37 != null) {
                            for (class306 var38 = (class306) var37.method1254(16); var38 != null; var38 = (class306) var37.method1257(1)) {
                                int var39 = var38.field5228.field2055;
                                class278 var40 = class199.method1475(var39, (byte) -94);
                                if (class13.field176 == 1) {
                                    class232.method1694(-501, class244.field4110, (short) 15, var19, class66.method562((byte) -62, new class75[] { class237.field3994, class305.field5209, var40.field4770 }), var20, (long) var39);
                                    class223.field3795++;
                                } else if (!class161.field2738) {
                                    class216.field3696++;
                                    class75[] var41 = var40.field4822;
                                    if (class78.field1344) {
                                        var41 = class54.method395(var41, true);
                                    }
                                    for (int var42 = 4; var42 >= 0; var42--) {
                                        if (var41 != null && var41[var42] != null) {
                                            class78.field1334++;
                                            byte var43 = 0;
                                            if (var42 == 0) {
                                                var43 = 9;
                                            }
                                            if (var42 == 1) {
                                                var43 = 43;
                                            }
                                            if (var42 == 2) {
                                                var43 = 5;
                                            }
                                            if (var42 == 3) {
                                                var43 = 59;
                                            }
                                            if (var42 == 4) {
                                                var43 = 2;
                                            }
                                            class232.method1694(-501, var41[var42], var43, var19, class66.method562((byte) -89, new class75[] { class98.field1631, var40.field4770 }), var20, (long) var39);
                                        } else if (var42 == 2) {
                                            class96.field1581++;
                                            class232.method1694(arg5 ^ 0x1B4, class199.field3339, (short) 5, var19, class66.method562((byte) -67, new class75[] { class98.field1631, var40.field4770 }), var20, (long) var39);
                                        }
                                    }
                                    class232.method1694(arg5 ^ 0x1B4, class245.field4122, (short) 1005, var19, class66.method562((byte) -65, new class75[] { class98.field1631, var40.field4770 }), var20, (long) var39);
                                } else if ((class123.field2056 & 0x1) == 1) {
                                    class310.field5281++;
                                    class232.method1694(-501, class197.field3307, (short) 13, var19, class66.method562((byte) 118, new class75[] { class215.field3673, class305.field5209, var40.field4770 }), var20, (long) var39);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 483)
    public static void method1224(byte arg0) {
        field2768 = null;
        field2770 = null;
        field2776 = null;
        field2767 = null;
        field2778 = null;
        field2779 = null;
        int var1 = 51 % ((-arg0 - 68) / 32);
        field2769 = null;
    }
}
