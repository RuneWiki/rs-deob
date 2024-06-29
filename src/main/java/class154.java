import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class154 extends class62 {

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Z")
    public boolean field2579;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[Lga;")
    public class154[] field2575;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[I")
    public static int[] field2577 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lpa;")
    public static class140 field2584 = new class140(16);

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Leg;")
    public static class37 field2595 = class174.method1167("Veuillez patienter)3)3)3", -77);

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "[Z")
    public static boolean[] field2597 = new boolean[100];

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "Leg;")
    private static class37 field2593 = class174.method1167("Connected to update server", -81);

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Leg;")
    public static class37 field2596 = field2593;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "Leg;")
    private static class37 field2599 = class174.method1167("Ok", -76);

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Leg;")
    public static class37 field2594 = field2599;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "Z")
    public static boolean field2600 = true;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lk;")
    public class218 field2585;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lhk;")
    public class36 field2574;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public void method539(int arg0) {
        if (this.field2579) {
            this.field2574.method207(113);
            this.field2574 = null;
        } else {
            this.field2585.method1531((byte) 60);
            this.field2585 = null;
        }
        field2581++;
        if (arg0 <= 53) {
            this.method539(47);
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static void method1051(int arg0) {
        if (arg0 != -24524) {
            method1057(-45, (class37) null);
        }
        field2599 = null;
        field2593 = null;
        field2595 = null;
        field2597 = null;
        field2584 = null;
        field2577 = null;
        field2594 = null;
        field2596 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[I")
    public int[] method143(int arg0, int arg1) {
        field2582++;
        if (arg1 != 1075962732) {
            field2599 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public void method144(int arg0) {
        field2587++;
        if (arg0 != -9) {
            this.field2574 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)[I")
    public final int[] method1052(int arg0, int arg1, byte arg2) {
        if (arg2 >= -24) {
            method1055(-56, -36, 64, 97, (byte) 17, 27, -19, 22, 9, 91, -39);
        }
        field2591++;
        return this.field2575[arg0].field2579 ? this.field2575[arg0].method143(arg1, 1075962732) : this.field2575[arg0].method193((byte) 115, arg1)[0];
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I")
    public int method543(byte arg0) {
        if (arg0 > -54) {
            field2577 = null;
        }
        field2588++;
        return -1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZIBILva;III)V")
    public static final void method1053(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class187 arg5, int arg6, int arg7, int arg8) {
        field2578++;
        if (arg3 != 48) {
            method1057(73, (class37) null);
        }
        if (arg0 < 0 || arg0 >= 104 || arg8 < 0 || arg8 >= 104) {
            while (true) {
                int var11 = arg5.method1268(255);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg5.method1268(arg3 ^ 0xCF);
                    return;
                }
                if (var11 <= 49) {
                    arg5.method1268(arg3 ^ 0xCF);
                }
            }
        }
        if (!arg1) {
            class241.field4312[arg6][arg0][arg8] = 0;
        }
        while (true) {
            int var9 = arg5.method1268(255);
            if (var9 == 0) {
                if (arg1) {
                    class218.field3754[0][arg0][arg8] = class177.field2958[0][arg0][arg8];
                    return;
                } else if (arg6 == 0) {
                    class218.field3754[0][arg0][arg8] = -class291.method1946(arg8 + arg2 + 556238, 932731 - -arg4 + arg0, 5962) * 8;
                    return;
                } else {
                    class218.field3754[arg6][arg0][arg8] = class218.field3754[arg6 - 1][arg0][arg8] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg5.method1268(255);
                if (arg1) {
                    class218.field3754[0][arg0][arg8] = var10 * 8 + class177.field2958[0][arg0][arg8];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg6 == 0) {
                    class218.field3754[0][arg0][arg8] = -var10 * 8;
                    return;
                }
                class218.field3754[arg6][arg0][arg8] = class218.field3754[arg6 - 1][arg0][arg8] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class265.field4657[arg6][arg0][arg8] = arg5.method1269(255);
                class30.field432[arg6][arg0][arg8] = (byte) ((var9 - 2) / 4);
                client.field1894[arg6][arg0][arg8] = (byte) class96.method626(3, arg7 + var9 - 2);
            } else if (var9 > 81) {
                class174.field2910[arg6][arg0][arg8] = (byte) (var9 - 81);
            } else if (!arg1) {
                class241.field4312[arg6][arg0][arg8] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lva;II)V")
    public void method142(class187 arg0, int arg1, int arg2) {
        field2598++;
        if (arg1 != -14015) {
            this.field2579 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)[[I")
    public int[][] method193(byte arg0, int arg1) {
        field2576++;
        if (arg0 != 115) {
            this.method1052(118, -15, (byte) -89);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)[[I")
    public final int[][] method1054(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method193((byte) 120, -39);
        }
        field2580++;
        if (!this.field2575[arg1].field2579) {
            return this.field2575[arg1].method193((byte) 115, arg2);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field2575[arg1].method143(arg2, 1075962732);
        var4[0] = var5;
        var4[1] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIBIIIIII)V")
    public static final void method1055(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        boolean var11;
        if (class171.field2879 > 0 && (class171.field2879 % 10) < 5) {
            var11 = true;
        } else {
            var11 = false;
        }
        int var12 = arg10 - arg5;
        int var13 = arg2 - arg1;
        int var14 = 983040 / arg6;
        int var15 = 983040 / arg7;
        for (int var16 = -var14; var16 < (var13 + var14); var16++) {
            int var18 = arg6 * var16 + arg3 >> 16;
            int var19 = (var16 + 1) * arg6 + arg3 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg9 + var18;
                int var10000 = arg9 + var19;
                int var23 = arg1 + var16 >> 6;
                if (var23 >= 0 && var23 <= (class74.field1163.length - 1)) {
                    int[][] var24 = class74.field1163[var23];
                    for (int var25 = -var15; var25 < (var12 + var15); var25++) {
                        int var26 = arg7 * var25 + arg8 >> 16;
                        int var27 = (var25 + 1) * arg7 + arg8 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg0 + var26;
                            var10000 = arg0 + var27;
                            int var31 = arg5 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = ((arg5 + var25 & 0x3F) << 6) + (arg1 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class133 var34 = class178.method1186(var33 - 1, 0);
                                    if (!class201.field3422[var34.field2235]) {
                                        if (var11 && class187.field3193 == var34.field2235) {
                                            class83 var35 = new class83();
                                            var35.field1310 = var34.field2235;
                                            var35.field1307 = var21;
                                            var35.field1311 = var29;
                                            class267.field4672.method1574(var35, 0);
                                        } else {
                                            class247.field4436[var34.field2235].method702(var21 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field2592++;
        for (class83 var17 = (class83) class267.field4672.method1566(-3); var17 != null; var17 = (class83) class267.field4672.method1570(3)) {
            class247.field4436[var17.field1310].method702(var17.field1307 - 7, var17.field1311 + -7);
            class122.method867(var17.field1307, var17.field1311, 15, 16776960, 128);
            class122.method867(var17.field1307, var17.field1311, 7, 16777215, 256);
        }
        if (arg4 < 125) {
            method1055(-104, -17, -82, 94, (byte) -98, -22, -122, -5, -5, 120, 1);
        }
        class267.field4672.method1573(96);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)V")
    public final void method1056(int arg0, int arg1, int arg2) {
        int var4 = this.field2589 == 255 ? arg2 : this.field2589;
        if (this.field2579) {
            this.field2574 = new class36(var4, arg2, arg0);
        } else {
            this.field2585 = new class218(var4, arg2, arg0);
        }
        field2573++;
        if (arg1 != -14687) {
            this.method143(-76, -81);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IZ)V")
    public class154(int arg0, boolean arg1) {
        this.field2579 = arg1;
        this.field2575 = new class154[arg0];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILeg;)V")
    public static final void method1057(int arg0, class37 arg1) {
        field2586++;
        if (class127.field2129 >= 2) {
            if (arg1.method256(true, class263.field4628)) {
                class105.method698((byte) 48);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class274.method1839((byte) -128, 0, (class37) null, class156.method1061((byte) 105, new class37[] { class85.field1333, class163.method1096(var4, (byte) -35), class291.field5121 }));
            }
            if (arg1.method256(true, class115.field1962)) {
                class105.method698((byte) -22);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class274.method1839((byte) -120, 0, (class37) null, class156.method1061((byte) 120, new class37[] { class221.field3810, class163.method1096(var7, (byte) -35), class291.field5121 }));
                class196.method1366(arg0 ^ 0xFFFF938A);
                class105.method698((byte) -127);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class274.method1839((byte) -113, 0, (class37) null, class156.method1061((byte) 88, new class37[] { class126.field2123, class163.method1096(var9, (byte) -35), class291.field5121 }));
            }
            if (arg1.method256(true, class165.field2745)) {
                class137.method971(0);
            }
            if (arg1.method256(true, class85.field1342)) {
                class151.field2532.method826((byte) -62);
            }
            if (arg1.method256(true, class175.field2929)) {
                class151.field2532.method821((byte) 92);
            }
            if (arg1.method256(true, class81.field1265)) {
                class177.field2957.method1427(false);
                class187.field3190.method423((byte) 126);
                class151.field2532.method819((byte) -17);
            }
            if (arg1.method256(true, class79.field1233)) {
                class204.field3483 = true;
            }
            if (arg1.method256(true, class104.field1622)) {
                class102.method683(25, false);
            }
            if (arg1.method256(true, class101.field1587)) {
                class243.field4373 = true;
            }
            if (arg1.method256(true, class281.field4954)) {
                class243.field4373 = false;
            }
            if (arg1.method256(true, class62.field1025)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class215.field3719[var10].field2738[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method235(class187.field3200, 65) && class165.field2737 != 0) {
                class187.method1284(arg1.method263(6, false).method231((byte) 126), false);
            }
            if (arg1.method256(true, class224.field3842) && class165.field2737 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method235(class83.field1312, 65)) {
                class147.field2495 = arg1.method263(12, false).method255(-157).method231((byte) 117);
                class274.method1839((byte) -103, 0, (class37) null, class156.method1061((byte) -66, new class37[] { class111.field1856, class163.method1096(class147.field2495, (byte) -35) }));
            }
            if (arg1.method256(true, class82.field1282)) {
                class126.field2117 = true;
            }
        }
        class181.field3035++;
        class273.field4778.method1697(102, 111);
        class273.field4778.method1292(arg1.method222((byte) 116) - 1, (byte) -64);
        if (arg0 == 27649) {
            class273.field4778.method1289(arg1.method263(2, false), -69);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)I")
    public int method1058(byte arg0) {
        if (arg0 != 121) {
            this.method543((byte) 92);
        }
        field2590++;
        return -1;
    }
}
