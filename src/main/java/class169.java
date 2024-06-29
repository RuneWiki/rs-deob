import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class169 {

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
    public boolean field2655 = false;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lwm;")
    public static class152 field2645 = class157.method1048("Veuillez patienter )2 tentative de r-Btablissement)3", 117);

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2650 = 0;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lwm;")
    public static class152 field2648 = class157.method1048(" )2>", 103);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
    public static boolean field2651 = true;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "[Lum;")
    public static class144[] field2656 = new class144[50];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lwm;")
    public static class152 field2638;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lbg;")
    public static class203 field2642;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[Lnl;")
    public static class30[] field2640;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 9)
    public static final void method1109(Throwable arg0, byte arg1, String arg2) {
        field2649++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class152.method999(arg0, (byte) 25);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class101.method678(var3, (byte) 95);
            String var4 = class121.method785(var3, "%3a", -92, ":");
            String var5 = class121.method785(var4, "%40", -86, "@");
            String var6 = class121.method785(var5, "%26", -97, "&");
            String var7 = class121.method785(var6, "%23", -125, "#");
            if (class175.field2821.field2359 == null) {
                return;
            }
            class188 var8 = class175.field2821.method955(0, new URL(class175.field2821.field2359.getCodeBase(), "clienterror.ws?c=" + class5.field83 + "&u=" + class321.field5605 + "&v1=" + class151.field2349 + "&v2=" + class151.field2362 + "&e=" + var7));
            while (var8.field2980 == 0) {
                class4.method19(0, 1L);
            }
            if (var8.field2980 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2977;
                var9.read();
                var9.close();
            }
            int var10 = -60 / ((-arg1 - 10) / 43);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Leg;", line = 66)
    public final class300 method1110(int arg0, int arg1) {
        field2653++;
        class300 var3 = (class300) class176.field2833.method1620(true, (long) (this.field2639 | arg1 << 16));
        if (var3 != null) {
            return var3;
        }
        class197.field3161.method1361(-1, this.field2639);
        class300 var4 = class61.method401(this.field2639, false, 0, class197.field3161);
        if (arg0 != 30) {
            method1109((Throwable) null, (byte) 97, (String) null);
        }
        if (var4 != null) {
            var4.method2102(class90.field1260, class100.field1447, class64.field968);
            var4.field3740 = var4.field3746;
            var4.field3743 = var4.field3736;
            for (int var5 = 0; var5 < arg1; var5++) {
                var4.method2103();
            }
            class176.field2833.method1614(var4, (long) (arg1 << 16 | this.field2639), (byte) 78);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Z", line = 103)
    public static final boolean method1111(int arg0, byte arg1) {
        field2644++;
        if (arg1 <= 66) {
            method1111(105, (byte) 114);
        }
        if (arg0 < 0) {
            return false;
        }
        int var2 = class273.field4688[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V", line = 127)
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 <= 35) {
            field2642 = (class203) null;
        }
        field2657++;
        if (class197.method1315(71, arg6)) {
            client.method1749(class215.field3501[arg6], -1, arg5, arg7, arg1, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIILuf;ZIIII)V", line = 152)
    public static final void method1113(int arg0, int arg1, boolean arg2, int arg3, int arg4, class22 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field2658++;
        if (arg6 && !class296.method2044(80) && (class70.field1026[0][arg9][arg8] & 0x2) == 0) {
            if ((class70.field1026[arg1][arg9][arg8] & 0x10) != 0) {
                return;
            }
            if (class149.method941(arg8, arg9, arg1, (byte) 24) != class267.field4501) {
                return;
            }
        }
        if (class97.field1391 > arg1) {
            class97.field1391 = arg1;
        }
        class270 var11 = class242.method1656(arg0, true);
        if (class217.field3516 && var11.field4547) {
            return;
        }
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var13 = var11.field4562;
            var12 = var11.field4618;
        } else {
            var12 = var11.field4562;
            var13 = var11.field4618;
        }
        int var14;
        int var15;
        if ((arg9 + var13) > 104) {
            var14 = arg9 + 1;
            var15 = arg9;
        } else {
            var15 = arg9 + (var13 >> 1);
            var14 = (var13 + 1 >> 1) + arg9;
        }
        int[][] var16 = class65.field984[arg7];
        int var17;
        int var18;
        if ((arg8 + var12) > 104) {
            var17 = arg8;
            var18 = arg8 + 1;
        } else {
            var17 = arg8 + (var12 >> 1);
            var18 = (var12 + 1 >> 1) + arg8;
        }
        int var19 = var16[var14][var17] + var16[var15][var17] + var16[var14][var18] + var16[var15][var18] >> 2;
        int var20 = (arg9 << 7) + (var13 << 6);
        int var21 = (arg8 << 7) + (var12 << 6);
        int var22 = 0;
        if (class217.field3516 && arg7 != 0) {
            int[][] var23 = class65.field984[0];
            var22 = var19 - (var23[var14][var17] + var23[var15][var17] + var23[var15][var18] + var23[var14][var18] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg2) {
            var24 = class123.field1728[0];
        } else if (arg7 < 3) {
            var24 = class65.field984[arg7 + 1];
        }
        long var25 = (long) (arg3 << 14 | arg8 << 7 | arg9 | arg4 << 20 | 0x40000000);
        if (var11.field4556 == 0 || arg2) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field4585 == 1) {
            var25 |= 0x400000L;
        }
        int var27 = 34 / ((arg10 - 16) / 32);
        if (var11.field4616) {
            var25 |= 0x80000000L;
        }
        long var28 = var25 | (long) arg0 << 32;
        if (var11.method1844((byte) -105)) {
            class313.method2184(127, (class4) null, arg4, arg1, var11, (class12) null, arg9, arg8);
        }
        boolean var30 = var11.field4587 & !arg2;
        if (arg3 == 22) {
            if (class199.field3209 || var11.field4556 != 0 || var11.field4548 == 1 || var11.field4554) {
                class73 var78;
                if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                    class189 var77 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, 22, var30, 109);
                    if (class217.field3516 && var30) {
                        class102.method684(var77.field2992, var20, var22, var21);
                    }
                    var78 = var77.field2985;
                } else {
                    var78 = new class175(arg0, 22, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
                }
                class313.method2180(arg1, arg9, arg8, var19, var78, var28, var11.field4612);
                if (var11.field4548 == 1 && arg5 != null) {
                    arg5.method171(arg8, arg9, 19661184);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class73 var72;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var71 = var11.method1850(var19, arg3 == 11 ? arg4 + 4 : arg4, var24, var20, var21, arg6, (class300) null, var16, 10, var30, -127);
                if (class217.field3516 && var30) {
                    class102.method684(var71.field2992, var20, var22, var21);
                }
                var72 = var71.field2985;
            } else {
                var72 = new class175(arg0, 10, arg3 == 11 ? arg4 + 4 : arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            if (var72 != null) {
                boolean var73 = class236.method1624(arg1, arg9, arg8, var19, var13, var12, var72, 0, var28);
                if (var11.field4619 && var73 && arg6) {
                    int var74 = 15;
                    if (var72 instanceof class271) {
                        var74 = ((class271) var72).method138() / 4;
                        if (var74 > 30) {
                            var74 = 30;
                        }
                    }
                    for (int var75 = 0; var75 <= var13; var75++) {
                        for (int var76 = 0; var76 <= var12; var76++) {
                            if (var74 > class199.field3218[arg1][arg9 + var75][arg8 + var76]) {
                                class199.field3218[arg1][arg9 + var75][arg8 + var76] = (byte) var74;
                            }
                        }
                    }
                }
            }
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method187(var11.field4544, var13, var12, arg9, true, arg8);
            }
        } else if (arg3 >= 12) {
            class73 var70;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var69 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, arg3, var30, 113);
                if (class217.field3516 && var30) {
                    class102.method684(var69.field2992, var20, var22, var21);
                }
                var70 = var69.field2985;
            } else {
                var70 = new class175(arg0, arg3, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class236.method1624(arg1, arg9, arg8, var19, 1, 1, var70, 0, var28);
            if (arg6 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
                class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 4);
            }
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method187(var11.field4544, var13, var12, arg9, true, arg8);
            }
        } else if (arg3 == 0) {
            class73 var32;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var31 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, 0, var30, 75);
                if (class217.field3516 && var30) {
                    class102.method684(var31.field2992, var20, var22, var21);
                }
                var32 = var31.field2985;
            } else {
                var32 = new class175(arg0, 0, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class112.method749(arg1, arg9, arg8, var19, var32, (class73) null, class22.field373[arg4], 0, var28);
            if (arg6) {
                if (arg4 == 0) {
                    if (var11.field4619) {
                        class199.field3218[arg1][arg9][arg8] = 50;
                        class199.field3218[arg1][arg9][arg8 + 1] = 50;
                    }
                    if (var11.field4563) {
                        class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field4619) {
                        class199.field3218[arg1][arg9][arg8 + 1] = 50;
                        class199.field3218[arg1][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4563) {
                        class281.field4797[arg1][arg9][arg8 + 1] = class72.method493(class281.field4797[arg1][arg9][arg8 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field4619) {
                        class199.field3218[arg1][arg9 + 1][arg8] = 50;
                        class199.field3218[arg1][arg9 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4563) {
                        class281.field4797[arg1][arg9 + 1][arg8] = class72.method493(class281.field4797[arg1][arg9 + 1][arg8], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field4619) {
                        class199.field3218[arg1][arg9][arg8] = 50;
                        class199.field3218[arg1][arg9 + 1][arg8] = 50;
                    }
                    if (var11.field4563) {
                        class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 2);
                    }
                }
            }
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method169(arg4, arg9, arg3, var11.field4544, -26945, arg8);
            }
            if (var11.field4605 != 16) {
                class284.method1924(arg1, arg9, arg8, var11.field4605);
            }
        } else if (arg3 == 1) {
            class73 var68;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var67 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, 1, var30, 57);
                if (class217.field3516 && var30) {
                    class102.method684(var67.field2992, var20, var22, var21);
                }
                var68 = var67.field2985;
            } else {
                var68 = new class175(arg0, 1, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class112.method749(arg1, arg9, arg8, var19, var68, (class73) null, class6.field92[arg4], 0, var28);
            if (var11.field4619 && arg6) {
                if (arg4 == 0) {
                    class199.field3218[arg1][arg9][arg8 + 1] = 50;
                } else if (arg4 == 1) {
                    class199.field3218[arg1][arg9 + 1][arg8 + 1] = 50;
                } else if (arg4 == 2) {
                    class199.field3218[arg1][arg9 + 1][arg8] = 50;
                } else if (arg4 == 3) {
                    class199.field3218[arg1][arg9][arg8] = 50;
                }
            }
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method169(arg4, arg9, arg3, var11.field4544, -26945, arg8);
            }
        } else if (arg3 == 2) {
            int var62 = arg4 + 1 & 0x3;
            class73 var64;
            class73 var66;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var63 = var11.method1850(var19, arg4 + 4, var24, var20, var21, arg6, (class300) null, var16, 2, var30, 121);
                if (class217.field3516 && var30) {
                    class102.method684(var63.field2992, var20, var22, var21);
                }
                var64 = var63.field2985;
                class189 var65 = var11.method1850(var19, var62, var24, var20, var21, arg6, (class300) null, var16, 2, var30, 45);
                if (class217.field3516 && var30) {
                    class102.method684(var65.field2992, var20, var22, var21);
                }
                var66 = var65.field2985;
            } else {
                var64 = new class175(arg0, 2, arg4 + 4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
                var66 = new class175(arg0, 2, var62, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class112.method749(arg1, arg9, arg8, var19, var64, var66, class22.field373[arg4], class22.field373[var62], var28);
            if (var11.field4563 && arg6) {
                if (arg4 == 0) {
                    class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 1);
                    class281.field4797[arg1][arg9][arg8 + 1] = class72.method493(class281.field4797[arg1][arg9][arg8 + 1], 2);
                } else if (arg4 == 1) {
                    class281.field4797[arg1][arg9][arg8 + 1] = class72.method493(class281.field4797[arg1][arg9][arg8 + 1], 2);
                    class281.field4797[arg1][arg9 + 1][arg8] = class72.method493(class281.field4797[arg1][arg9 + 1][arg8], 1);
                } else if (arg4 == 2) {
                    class281.field4797[arg1][arg9 + 1][arg8] = class72.method493(class281.field4797[arg1][arg9 + 1][arg8], 1);
                    class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 2);
                } else if (arg4 == 3) {
                    class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 2);
                    class281.field4797[arg1][arg9][arg8] = class72.method493(class281.field4797[arg1][arg9][arg8], 1);
                }
            }
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method169(arg4, arg9, arg3, var11.field4544, -26945, arg8);
            }
            if (var11.field4605 != 16) {
                class284.method1924(arg1, arg9, arg8, var11.field4605);
            }
        } else if (arg3 == 3) {
            class73 var61;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var60 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, 3, var30, -125);
                if (class217.field3516 && var30) {
                    class102.method684(var60.field2992, var20, var22, var21);
                }
                var61 = var60.field2985;
            } else {
                var61 = new class175(arg0, 3, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class112.method749(arg1, arg9, arg8, var19, var61, (class73) null, class6.field92[arg4], 0, var28);
            if (var11.field4619 && arg6) {
                if (arg4 == 0) {
                    class199.field3218[arg1][arg9][arg8 + 1] = 50;
                } else if (arg4 == 1) {
                    class199.field3218[arg1][arg9 + 1][arg8 + 1] = 50;
                } else if (arg4 == 2) {
                    class199.field3218[arg1][arg9 + 1][arg8] = 50;
                } else if (arg4 == 3) {
                    class199.field3218[arg1][arg9][arg8] = 50;
                }
            }
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method169(arg4, arg9, arg3, var11.field4544, -26945, arg8);
            }
        } else if (arg3 == 9) {
            class73 var34;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var33 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, arg3, var30, 45);
                if (class217.field3516 && var30) {
                    class102.method684(var33.field2992, var20, var22, var21);
                }
                var34 = var33.field2985;
            } else {
                var34 = new class175(arg0, arg3, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class236.method1624(arg1, arg9, arg8, var19, 1, 1, var34, 0, var28);
            if (var11.field4548 != 0 && arg5 != null) {
                arg5.method187(var11.field4544, var13, var12, arg9, true, arg8);
            }
            if (var11.field4605 != 16) {
                class284.method1924(arg1, arg9, arg8, var11.field4605);
            }
        } else if (arg3 == 4) {
            class73 var59;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var58 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, 4, var30, 51);
                if (class217.field3516 && var30) {
                    class102.method684(var58.field2992, var20, var22, var21);
                }
                var59 = var58.field2985;
            } else {
                var59 = new class175(arg0, 4, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class6.method33(arg1, arg9, arg8, var19, var59, (class73) null, class22.field373[arg4], 0, 0, 0, var28);
        } else if (arg3 == 5) {
            long var35 = class79.method526(arg1, arg9, arg8);
            int var37 = 16;
            if (var35 != 0L) {
                var37 = class242.method1656((int) (var35 >>> 32) & Integer.MAX_VALUE, true).field4605;
            }
            class73 var39;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var38 = var11.method1850(var19, arg4, var24, var20, var21, arg6, (class300) null, var16, 4, var30, 62);
                if (class217.field3516 && var30) {
                    class102.method684(var38.field2992, var20 - (class201.field3240[arg4] * 8), var22, var21 - (class236.field3872[arg4] * 8));
                }
                var39 = var38.field2985;
            } else {
                var39 = new class175(arg0, 4, arg4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class6.method33(arg1, arg9, arg8, var19, var39, (class73) null, class22.field373[arg4], 0, class201.field3240[arg4] * var37, class236.field3872[arg4] * var37, var28);
        } else if (arg3 == 6) {
            int var40 = 8;
            long var41 = class79.method526(arg1, arg9, arg8);
            if (var41 != 0L) {
                var40 = class242.method1656(Integer.MAX_VALUE & (int) (var41 >>> 32), true).field4605 / 2;
            }
            class73 var44;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var43 = var11.method1850(var19, arg4 + 4, var24, var20, var21, arg6, (class300) null, var16, 4, var30, -106);
                if (class217.field3516 && var30) {
                    class102.method684(var43.field2992, var20 - class106.field1506[arg4] * 8, var22, var21 - (class189.field2989[arg4] * 8));
                }
                var44 = var43.field2985;
            } else {
                var44 = new class175(arg0, 4, arg4 + 4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class6.method33(arg1, arg9, arg8, var19, var44, (class73) null, 256, arg4, class106.field1506[arg4] * var40, class189.field2989[arg4] * var40, var28);
        } else if (arg3 == 7) {
            int var45 = arg4 + 2 & 0x3;
            class73 var47;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                class189 var46 = var11.method1850(var19, var45 + 4, var24, var20, var21, arg6, (class300) null, var16, 4, var30, -109);
                if (class217.field3516 && var30) {
                    class102.method684(var46.field2992, var20, var22, var21);
                }
                var47 = var46.field2985;
            } else {
                var47 = new class175(arg0, 4, var45 + 4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class6.method33(arg1, arg9, arg8, var19, var47, (class73) null, 256, var45, 0, 0, var28);
        } else if (arg3 == 8) {
            int var48 = 8;
            long var49 = class79.method526(arg1, arg9, arg8);
            if (var49 != 0L) {
                var48 = class242.method1656(Integer.MAX_VALUE & (int) (var49 >>> 32), true).field4605 / 2;
            }
            int var51 = arg4 + 2 & 0x3;
            class73 var55;
            class73 var57;
            if (var11.field4601 == -1 && var11.field4592 == null && !var11.field4582) {
                int var52 = class106.field1506[arg4] * 8;
                int var53 = class189.field2989[arg4] * 8;
                class189 var54 = var11.method1850(var19, arg4 + 4, var24, var20, var21, arg6, (class300) null, var16, 4, var30, 87);
                if (class217.field3516 && var30) {
                    class102.method684(var54.field2992, var20 - var52, var22, var21 - var53);
                }
                var55 = var54.field2985;
                class189 var56 = var11.method1850(var19, var51 + 4, var24, var20, var21, arg6, (class300) null, var16, 4, var30, -124);
                if (class217.field3516 && var30) {
                    class102.method684(var56.field2992, var20 - var52, var22, var21 - var53);
                }
                var57 = var56.field2985;
            } else {
                var55 = new class175(arg0, 4, arg4 + 4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
                var57 = new class175(arg0, 4, var51 + 4, arg7, arg9, arg8, var11.field4601, var11.field4610, (class73) null);
            }
            class6.method33(arg1, arg9, arg8, var19, var55, var57, 256, arg4, class106.field1506[arg4] * var48, class189.field2989[arg4] * var48, var28);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 805)
    public static void method1114(int arg0) {
        field2642 = null;
        field2645 = null;
        field2640 = null;
        field2638 = null;
        field2648 = null;
        field2656 = null;
        if (arg0 != 1) {
            method1112(120, -28, 6, 121, -35, -108, -28, 62);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILhi;)V", line = 822)
    private final void method1115(int arg0, int arg1, int arg2, class291 arg3) {
        if (arg2 != 3) {
            return;
        }
        field2646++;
        if (arg0 == 1) {
            this.field2639 = arg3.method2021((byte) 74);
        } else if (arg0 == 2) {
            this.field2647 = arg3.method2009((byte) 64);
        } else if (arg0 == 3) {
            this.field2655 = true;
        } else if (arg0 == 4) {
            this.field2639 = -1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILhi;)V", line = 873)
    public final void method1116(int arg0, int arg1, class291 arg2) {
        if (arg0 != 2386) {
            field2645 = (class152) null;
        }
        field2652++;
        while (true) {
            int var4 = arg2.method2011(-26);
            if (var4 == 0) {
                return;
            }
            this.method1115(var4, arg1, arg0 ^ 0x951, arg2);
        }
    }
}
