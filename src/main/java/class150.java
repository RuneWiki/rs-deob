import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class150 extends class12 {

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Lkh;")
    public static class117 field2730 = class224.method1450((byte) -21, "Standort");

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "Lkh;")
    public static class117 field2731 = class224.method1450((byte) -112, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "[I")
    public int[] field2723;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[I")
    public int[] field2728;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "[I")
    public int[] field2737;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "[Lfi;")
    public class65[] field2722;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "[Lfi;")
    public class65[] field2729;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "[[[B")
    public byte[][][] field2735;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static final void method1071(int arg0) {
        field2727++;
        if (class187.field3354 == null) {
            return;
        }
        if (class43.field952 < 10) {
            if (!class222.field4012.method91(class187.field3354, true)) {
                class43.field952 = class222.field4012.method79(class187.field3354, 0) / 10;
                return;
            }
            class43.field952 = 10;
        }
        if (arg0 != 19) {
            return;
        }
        if (class43.field952 == 10) {
            class145 var1 = new class145(class222.field4012.method107(false, class43.field948, class187.field3354));
            int var2 = var1.method1049((byte) 88);
            int var3 = var1.method1049((byte) 120);
            int var4 = var1.method1049((byte) 94);
            int var5 = var1.method1049((byte) 119);
            int var6 = var1.method1049((byte) 119);
            int var7 = var1.method1049((byte) 101);
            class90.field1672 = 8.0D;
            class9.field152 = 8.0D;
            class80.field1501 = var2 * 64;
            class173.field3116 = var3 * 64;
            int var8 = (class93.field1712.field4244 >> 7) + (class143.field2591 - class80.field1501);
            int var9 = class184.field3319 + (class93.field1712.field4221 >> 7) - class173.field3116;
            int var10 = var9 + (int) (Math.random() * 10.0D) - 5;
            class56.field1165 = new int[class55.field1124 + 1];
            int var11 = class160.field2929 >> 2 << 10;
            class237.field4284 = (var4 + 1 - var2) * 64;
            int var12 = var8 + (int) (Math.random() * 10.0D) - 5;
            int var13 = class21.field567 >> 1;
            int var14 = class237.field4284 >> 6;
            class33.field773 = (var5 + 1 - var3) * 64;
            int var15 = class33.field773 >> 6;
            if (var12 >= 0 && class237.field4284 > var12 && var10 >= 0 && var10 < class33.field773) {
                class1.field12 = class33.field773 - var10;
                class156.field2838 = var12;
            } else {
                class156.field2838 = var6 * 64 - class80.field1501;
                class1.field12 = class33.field773 + class173.field3116 - var7 * 64;
            }
            class165.field2982 = new byte[var14][var15][];
            class215.field3903 = new byte[var14][var15][];
            class208.field3738 = new byte[var14][var15][];
            class203.field3671 = new byte[var14][var15][];
            class56.field1155 = new int[var14][var15][];
            class175.field3166 = new int[var14][var15][];
            class106.field1932 = new byte[var14][var15][];
            class173.field3117 = new byte[var14][var15][];
            for (int var16 = 0; var16 < class55.field1124; var16++) {
                class135 var17 = class145.method990(4, var16);
                if (var17 != null) {
                    int var18 = var17.field2430;
                    if (var18 >= 0 && !class89.field1657.method538(4988, var18)) {
                        var18 = -1;
                    }
                    int var19;
                    if (var17.field2435 >= 0) {
                        int var23 = var17.field2435;
                        int var24 = (var23 & 0x7F) + var13;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 > 127) {
                            var24 = 127;
                        }
                        int var25 = (var11 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                        var19 = class89.field1654[class179.method1241(var25, arg0 ^ 0x5CDE, 96)];
                    } else if (var18 >= 0) {
                        var19 = class89.field1654[class179.method1241(class89.field1657.method531(var18, (byte) -128), 23757, 96)];
                    } else if (var17.field2434 == -1) {
                        var19 = -1;
                    } else {
                        int var20 = var17.field2434;
                        int var21 = (var20 & 0x7F) + var13;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > 127) {
                            var21 = 127;
                        }
                        int var22 = (var11 + var20 & 0xFC00) + (var20 & 0x380) + var21;
                        var19 = class89.field1654[class179.method1241(var22, 23757, 96)];
                    }
                    class56.field1165[var16 + 1] = var19;
                }
            }
            class43.field952 = 20;
        } else if (class43.field952 == 20) {
            class166.method1177(class222.field4012.method107(false, class98.field1806, class187.field3354), arg0 - 17);
            class43.field952 = 30;
            class55.method423(arg0 ^ 0x13);
        } else if (class43.field952 == 30) {
            class217.method1426((byte) 81, class222.field4012.method107(false, class75.field1416, class187.field3354));
            class43.field952 = 50;
            class55.method423(0);
        } else if (class43.field952 == 50) {
            class102.method690(class222.field4012.method107(false, class161.field2939, class187.field3354), false);
            class43.field952 = 70;
            class55.method423(0);
        } else if (class43.field952 == 70) {
            class49.method383(-118, class222.field4012.method107(false, class214.field3893, class187.field3354));
            class43.field952 = 90;
            class55.method423(0);
        } else {
            class40.method351((byte) 126, class222.field4012.method107(false, class223.field4028, class187.field3354));
            if (class43.field952 == 90) {
                class102.field1861 = new class197(11, true, class85.field1608);
                class27.field675 = new class197(12, true, class85.field1608);
                class174.field3135 = new class197(14, true, class85.field1608);
                class157.field2862 = new class197(17, true, class85.field1608);
                class191.field3405 = new class197(19, true, class85.field1608);
                class223.field4020 = new class197(22, true, class85.field1608);
                class3.field42 = new class197(26, true, class85.field1608);
                class71.field1365 = new class197(30, true, class85.field1608);
                class43.field952 = 100;
            }
            class211.field3837 = -1;
            class43.field952 = 100;
            class34.field807 = -1;
            class55.method423(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static final void method1072(boolean arg0) {
        class103 var1 = class199.field3581;
        synchronized (class199.field3581) {
            class26.field656++;
            class30.field719 = class11.field379;
            if (!arg0) {
                field2733 = -106;
            }
            class137.field2479 = class137.field2482;
            class199.field3571 = class50.field1039;
            class215.field3907 = class176.field3181;
            class187.field3353 = class5.field63;
            class41.field929 = class77.field1474;
            class171.field3089 = class19.field538;
            class176.field3181 = 0;
        }
        field2734++;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static void method1073(boolean arg0) {
        if (arg0) {
            field2731 = null;
            field2730 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2732++;
        int var9 = arg0 - arg8;
        int var10 = arg2 - arg6;
        int var11 = (arg7 - arg5 << 16) / var9;
        int var12 = (arg4 - arg1 << 16) / var10;
        if (arg3 != 2) {
            method1072(false);
        }
        if (arg0 < class237.field4284) {
            var9++;
        }
        if (arg2 < class33.field773) {
            var10++;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            int var30 = var11 * var13 >> 16;
            int var31 = (var13 + 1) * var11 >> 16;
            int var32 = var31 - var30;
            if (var32 > 0) {
                int var33 = arg5 + var30;
                int var34 = arg5 + var31;
                int var35 = arg8 + var13 >> 6;
                byte[][] var36 = class165.field2982[var35];
                byte[][] var37 = class215.field3903[var35];
                int[][] var38 = class175.field3166[var35];
                byte[][] var39 = class173.field3117[var35];
                byte[][] var40 = class203.field3671[var35];
                byte[][] var41 = class106.field1932[var35];
                for (int var42 = 0; var42 < var10; var42++) {
                    int var43 = var12 * var42 >> 16;
                    int var44 = (var42 + 1) * var12 >> 16;
                    int var45 = var44 - var43;
                    if (var45 > 0) {
                        int var46 = arg1 + var44;
                        int var47 = arg1 + var43;
                        int var48 = arg6 + var42 >> 6;
                        int var49 = var42 + arg6 & 0x3F;
                        int var50 = arg8 + var13 & 0x3F;
                        int var51 = (var49 << 6) + var50;
                        int var52;
                        if (var38[var48] == null) {
                            int var53 = var13 + arg8 & 0x4;
                            int var54 = arg6 + var42 & 0x4;
                            if ((var53 >= 2 || var54 <= 2) && (var53 <= 2 || var54 >= 2)) {
                                var52 = class56.field1165[class161.field2941 + 1];
                            } else {
                                var52 = 4936552;
                            }
                        } else {
                            var52 = var38[var48][var51];
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var55 = var36[var48] == null ? 0 : class56.field1165[var36[var48][var51] & 0xFF];
                        int var56 = var37[var48] == null ? 0 : class56.field1165[var37[var48][var51] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class83.method579(var33, var47, var32, var45, var52);
                        } else {
                            if (var55 != 0) {
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                byte var57 = var40[var48] == null ? 0 : var40[var48][var51];
                                int var58 = var57 & 0xFC;
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class83.method579(var33, var47, var32, var45, var55);
                                } else {
                                    class124.method862(var58 >> 2, var52, true, var45, var32, class83.field1561, (byte) 61, var33, var57 & 0x3, var55, var47);
                                }
                            }
                            if (var56 != 0) {
                                if (var56 == -1) {
                                    var56 = var52;
                                }
                                byte var59 = var41[var48][var51];
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class83.method579(var33, var47, var32, var45, var56);
                                }
                                class124.method862(var60 >> 2, 0, var55 == 0, var45, var32, class83.field1561, (byte) 61, var33, var59 & 0x3, var56, var47);
                            }
                        }
                        if (var39[var48] != null) {
                            int var61 = var39[var48][var51] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var32 == 1) {
                                    var62 = var33;
                                } else {
                                    var62 = var34 - 1;
                                }
                                int var63 = 13421772;
                                int var64;
                                if (var45 == 1) {
                                    var64 = var47;
                                } else {
                                    var64 = var46 - 1;
                                }
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var63 = 13369344;
                                    var61 -= 4;
                                }
                                if (var61 == 1) {
                                    class83.method577(var33, var47, var45, var63);
                                } else if (var61 == 2) {
                                    class83.method569(var33, var47, var32, var63);
                                } else if (var61 == 3) {
                                    class83.method577(var62, var47, var45, var63);
                                } else if (var61 == 4) {
                                    class83.method569(var33, var64, var32, var63);
                                } else if (var61 == 9) {
                                    class83.method577(var33, var47, var45, 16777215);
                                    class83.method569(var33, var47, var32, var63);
                                } else if (var61 == 10) {
                                    class83.method577(var62, var47, var45, 16777215);
                                    class83.method569(var33, var47, var32, var63);
                                } else if (var61 == 11) {
                                    class83.method577(var62, var47, var45, 16777215);
                                    class83.method569(var33, var64, var32, var63);
                                } else if (var61 == 12) {
                                    class83.method577(var33, var47, var45, 16777215);
                                    class83.method569(var33, var64, var32, var63);
                                } else if (var61 == 17) {
                                    class83.method569(var33, var47, 1, var63);
                                } else if (var61 == 18) {
                                    class83.method569(var62, var47, 1, var63);
                                } else if (var61 == 19) {
                                    class83.method569(var62, var64, 1, var63);
                                } else if (var61 == 20) {
                                    class83.method569(var33, var64, 1, var63);
                                } else if (var61 == 25) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class83.method569(var33 + var65, var64 - var65, 1, var63);
                                    }
                                } else if (var61 == 26) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class83.method569(var33 + var66, var47 + var66, 1, var63);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg5 + var16;
                int var10000 = arg5 + var15;
                byte[][] var20 = class208.field3738[var14 + arg8 >> 6];
                for (int var21 = 0; var21 < var10; var21++) {
                    int var22 = (var21 + 1) * var12 >> 16;
                    int var23 = var12 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (var24 > 0) {
                        int var25 = arg1 + var23;
                        var10000 = arg1 + var22;
                        int var27 = ((arg6 + var21 & 0x3F) << 6) + (arg8 + var14 & 0x3F);
                        int var28 = var21 + arg6 >> 6;
                        if (var20[var28] != null) {
                            int var29 = var20[var28][var27] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class155.field2832[var29 - 1].method1086(var18, var25, var17 * 2 + 1, var24 * 2 + 1);
                                } else {
                                    class155.field2832[var29 - 1].method1086(var18 - var17 / 2, -(var24 / 2) + var25, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
