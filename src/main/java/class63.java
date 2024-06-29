import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class63 extends class107 {

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Ldf;")
    public class51 field1020;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Lqh;")
    public static class189 field1024 = new class189(50);

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Ldf;")
    public static class51 field1028 = class46.method233("Fertigkeit)2", 100);

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Ldf;")
    public static class51 field1030 = class46.method233("AUS", 100);

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field1033 = -2;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lvh;")
    public static class252 field1027 = new class252();

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Lmh;")
    public static class143 field1031;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "[I")
    public static int[] field1032;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILdf;Lwc;)Ldf;")
    public static final class51 method414(int arg0, class51 arg1, class213 arg2) {
        field1016++;
        int var3 = 78 / ((-arg0 - 69) / 55);
        if (arg1.method271(class83.field1399, -1) == -1) {
            return arg1;
        }
        while (true) {
            int var4 = arg1.method271(class203.field3398, -1);
            if (var4 == -1) {
                while (true) {
                    int var5 = arg1.method271(class172.field2819, -1);
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg1.method271(class202.field3382, -1);
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg1.method271(class248.field4363, -1);
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg1.method271(class218.field3793, -1);
                                            if (var8 == -1) {
                                                while (true) {
                                                    int var9 = arg1.method271(class263.field4601, -1);
                                                    if (var9 == -1) {
                                                        return arg1;
                                                    }
                                                    class51 var10 = class43.field696;
                                                    if (class180.field2974 != null) {
                                                        var10 = class108.method775(class180.field2974.field2508, (byte) 19);
                                                        try {
                                                            if (class180.field2974.field2505 != null) {
                                                                byte[] var11 = ((String) class180.field2974.field2505).getBytes("ISO-8859-1");
                                                                var10 = class101.method741(var11.length, 0, true, var11);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg1 = class20.method104(10, new class51[] { arg1.method269((byte) -74, 0, var9), var10, arg1.method279((byte) -55, var9 + 4) });
                                                }
                                            }
                                            arg1 = class20.method104(-91, new class51[] { arg1.method269((byte) -74, 0, var8), class95.method708(-7831, class139.method1009(arg2, (byte) -107, 4)), arg1.method279((byte) -55, var8 + 2) });
                                        }
                                    }
                                    arg1 = class20.method104(-115, new class51[] { arg1.method269((byte) -74, 0, var7), class95.method708(-7831, class139.method1009(arg2, (byte) 105, 3)), arg1.method279((byte) -55, var7 + 2) });
                                }
                            }
                            arg1 = class20.method104(-91, new class51[] { arg1.method269((byte) -74, 0, var6), class95.method708(-7831, class139.method1009(arg2, (byte) -109, 2)), arg1.method279((byte) -55, var6 + 2) });
                        }
                    }
                    arg1 = class20.method104(79, new class51[] { arg1.method269((byte) -74, 0, var5), class95.method708(-7831, class139.method1009(arg2, (byte) 99, 1)), arg1.method279((byte) -55, var5 + 2) });
                }
            }
            arg1 = class20.method104(-4, new class51[] { arg1.method269((byte) -74, 0, var4), class95.method708(-7831, class139.method1009(arg2, (byte) -52, 0)), arg1.method279((byte) -55, var4 + 2) });
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static final void method415(int arg0) {
        field1017++;
        if (class198.field3300 != null) {
            class198.field3300.method1212(23);
        }
        if (class37.field571 != null) {
            class37.field571.method1212(-119);
        }
        class220.method1513((byte) -112, 2, 22050, class212.field3522);
        class198.field3300 = class175.method1230(class25.field376, arg0, 22050, class31.field452, -91);
        class198.field3300.method1220(3, class50.field800);
        class37.field571 = class175.method1230(class25.field376, 1, 2048, class31.field452, -115);
        class37.field571.method1220(3, class166.field2709);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)Z")
    public static final boolean method416(int arg0, int arg1) {
        field1023++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class67.field1103[arg0];
        if (arg1 != 16776960) {
            field1028 = null;
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V")
    public static final void method417(int arg0, int arg1) {
        class8.field83 = new int[arg0];
        field1022++;
        class75.field1215 = new int[arg0];
        class69.field1119 = new int[arg0];
        if (arg1 != -1) {
            method417(122, 82);
        }
        class109.field1855 = new int[arg0];
        class79.field1262 = new int[arg0];
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lrb;ZI)V")
    public static final void method418(class247 arg0, boolean arg1, int arg2) {
        if (arg0.field4278 > class179.field2960) {
            class84.method653((byte) -125, arg0);
        } else if (class179.field2960 > arg0.field4302) {
            class39.method198(arg0, 8);
        } else {
            class119.method859(1024, arg0);
        }
        if (!arg1) {
            return;
        }
        field1021++;
        if (arg0.field4319 < 128 || arg0.field4348 < 128 || arg0.field4319 >= 13184 || arg0.field4348 >= 13184) {
            arg0.field4319 = arg0.field4343[0] * 128 + arg0.field4345 * 64;
            arg0.field4348 = arg0.field4336[0] * 128 + arg0.field4345 * 64;
            arg0.field4344 = -1;
            arg0.field4334 = -1;
            arg0.field4302 = 0;
            arg0.field4278 = 0;
            arg0.method1680(!arg1);
        }
        if (class44.field706 == arg0 && (arg0.field4319 < 1536 || arg0.field4348 < 1536 || arg0.field4319 >= 11776 || arg0.field4348 >= 11776)) {
            arg0.field4302 = 0;
            arg0.field4344 = -1;
            arg0.field4334 = -1;
            arg0.field4319 = arg0.field4343[0] * 128 + (arg0.field4345 * 64);
            arg0.field4278 = 0;
            arg0.field4348 = arg0.field4336[0] * 128 + arg0.field4345 * 64;
            arg0.method1680(false);
        }
        class67.method470(arg0, 1);
        class130.method956(arg0, (byte) 88);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method419(boolean arg0) {
        field1032 = null;
        field1027 = null;
        field1028 = null;
        if (!arg0) {
            field1030 = null;
            field1031 = null;
            field1024 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLdf;)V")
    public static final void method420(boolean arg0, class51 arg1) {
        field1026++;
        int var2 = class90.method678((byte) -73, arg1);
        if (var2 == -1) {
            return;
        }
        class42.field678 = class259.field4530.field2341[var2] - class107.field1764;
        int var3 = class42.field678 - ((int) ((float) class87.field1457.field3603 / class79.field1261));
        int var4 = (int) ((float) class87.field1457.field3603 / class79.field1261) + class42.field678;
        class3.field16 = class85.field1433 + class46.field736 - class259.field4530.field2338[var2] - 1;
        if (arg0) {
            return;
        }
        int var5 = class3.field16 - ((int) ((float) class87.field1457.field3608 / class79.field1261));
        if (var3 < 0) {
            class42.field678 = (int) ((float) class87.field1457.field3603 / class79.field1261);
        }
        if (var4 > class5.field38) {
            class42.field678 = class5.field38 - ((int) ((float) class87.field1457.field3603 / class79.field1261));
        }
        int var6 = (int) ((float) class87.field1457.field3608 / class79.field1261) + class3.field16;
        if (var5 < 0) {
            class3.field16 = (int) ((float) class87.field1457.field3608 / class79.field1261);
        }
        if (class85.field1433 < var6) {
            class3.field16 = class85.field1433 - (int) ((float) class87.field1457.field3608 / class79.field1261);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
    public static final int method421(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg0 > -96) {
            return -66;
        }
        field1029++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Ldf;")
    public static final class51 method422(long arg0, int arg1) {
        if (arg1 > -23) {
            method419(true);
        }
        field1015++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class247.field4291[(int) (var8 - (arg0 * 37L))];
            }
            class51 var7 = new class51();
            var7.field813 = var6;
            var7.field855 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBII)V")
    public static final void method423(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1025++;
        class74.field1170 = 0;
        for (int var7 = -1; var7 < class86.field1444 + class218.field3788; var7++) {
            class247 var23;
            if (var7 == -1) {
                var23 = class44.field706;
            } else if (var7 < class86.field1444) {
                var23 = class66.field1055[class75.field1195[var7]];
            } else {
                var23 = class34.field512[class193.field3242[var7 - class86.field1444]];
            }
            if (var23 != null && var23.method646((byte) -68)) {
                if (var23 instanceof class83) {
                    class11 var24 = ((class83) var23).field1392;
                    if (var24.field120 != null) {
                        var24 = var24.method60((byte) 108);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class86.field1444 <= var7) {
                    class11 var25 = ((class83) var23).field1392;
                    if (var25.field120 != null) {
                        var25 = var25.method60((byte) 38);
                    }
                    if (var25.field175 >= 0 && class262.field4566.length > var25.field175) {
                        class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -101) + 15);
                        if (class205.field3424 > -1) {
                            class262.field4566[var25.field175].method1103(class205.field3424 + arg0 - 12, arg1 - -class176.field2887 + -30);
                        }
                    }
                    int var26 = 0;
                    class157[] var27 = class135.field2250;
                    while (var26 < var27.length) {
                        class157 var28 = var27[var26];
                        if (var28 != null && var28.field2592 == 1 && class193.field3242[var7 - class86.field1444] == var28.field2596 && (class179.field2960 % 20) < 10) {
                            class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -80) + 15);
                            if (class205.field3424 > -1) {
                                class116.field1968[var28.field2597].method1103(arg0 - (12 - class205.field3424), class176.field2887 + arg1 - 28);
                            }
                        }
                        var26++;
                    }
                } else {
                    class103 var29 = (class103) var23;
                    int var30 = 30;
                    if (var29.field1715 != -1 || var29.field1689 != -1) {
                        class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -102) + 15);
                        if (class205.field3424 > -1) {
                            if (var29.field1715 != -1) {
                                class4.field33[var29.field1715].method1103(arg0 + class205.field3424 - 12, -var30 + arg1 + class176.field2887);
                                var30 += 25;
                            }
                            if (var29.field1689 != -1) {
                                class262.field4566[var29.field1689].method1103(arg0 + class205.field3424 - 12, arg1 - var30 + class176.field2887);
                                var30 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var31 = 0;
                        class157[] var32 = class135.field2250;
                        while (var32.length > var31) {
                            class157 var33 = var32[var31];
                            if (var33 != null && var33.field2592 == 10 && class75.field1195[var7] == var33.field2596) {
                                class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -113) + 15);
                                if (class205.field3424 > -1) {
                                    class116.field1968[var33.field2597].method1103(class205.field3424 + arg0 - 12, class176.field2887 + arg1 + -var30);
                                }
                            }
                            var31++;
                        }
                    }
                }
                if (var23.field4353 != null && (var7 >= class86.field1444 || class125.field2115 == 0 || class125.field2115 == 3 || class125.field2115 == 1 && class183.method1295(11418, ((class103) var23).field1711))) {
                    class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -126));
                    if (class205.field3424 > -1 && class38.field598 > class74.field1170) {
                        class38.field593[class74.field1170] = class239.field4161.method1317(var23.field4353) / 2;
                        class38.field597[class74.field1170] = class239.field4161.field3117;
                        class38.field588[class74.field1170] = class205.field3424;
                        class38.field599[class74.field1170] = class176.field2887;
                        class38.field591[class74.field1170] = var23.field4350;
                        class38.field595[class74.field1170] = var23.field4332;
                        class38.field587[class74.field1170] = var23.field4323;
                        class38.field590[class74.field1170] = var23.field4353;
                        class74.field1170++;
                    }
                }
                if (class179.field2960 < var23.field4305) {
                    class171 var34 = class143.field2396[0];
                    class171 var35 = class143.field2396[1];
                    if (var23 instanceof class83) {
                        class83 var36 = (class83) var23;
                        class171[] var37 = (class171[]) class107.field1757.method1357((byte) -75, (long) var36.field1392.field164);
                        if (var37 == null) {
                            var37 = class188.method1344(123, class162.field2651, var36.field1392.field164, 0);
                            if (var37 != null) {
                                class107.field1757.method1351(var37, 2, (long) var36.field1392.field164);
                            }
                        }
                        if (var37 != null && var37.length == 2) {
                            var35 = var37[1];
                            var34 = var37[0];
                        }
                    }
                    class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -117) + var34.field2800 + 10);
                    if (class205.field3424 > -1) {
                        int var38 = arg0 + class205.field3424 - (var34.field2806 >> 1);
                        int var39 = arg1 - (3 - class176.field2887);
                        var34.method1103(var38, var39);
                        int var40 = var34.field2800;
                        int var41 = var23.field4338 * var34.field2806 / 255;
                        class59.method371(var38, var39, var38 + var41, var39 + var40);
                        var35.method1103(var38, var39);
                        class59.method390(arg0, arg1, arg0 + arg2, arg1 + arg6);
                    }
                }
                for (int var42 = 0; var42 < 4; var42++) {
                    if (class179.field2960 < var23.field4300[var42]) {
                        class131.method967(6, arg5, var23, arg3, arg6 >> 1, arg2 >> 1, var23.method1679((byte) -69) / 2);
                        if (class205.field3424 > -1) {
                            if (var42 == 1) {
                                class176.field2887 -= 20;
                            }
                            if (var42 == 2) {
                                class205.field3424 -= 15;
                                class176.field2887 -= 10;
                            }
                            if (var42 == 3) {
                                class176.field2887 -= 10;
                                class205.field3424 += 15;
                            }
                            class181.field2988[var23.field4310[var42]].method1103(class205.field3424 + arg0 - 12, arg1 - -class176.field2887 + -12);
                            class4.field34.method1333(class51.method311(var23.field4290[var42], 10), arg0 + class205.field3424 - 1, class176.field2887 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg4 > -57) {
            method423(123, 102, 42, -29, (byte) 28, -23, -63);
        }
        for (int var8 = 0; var8 < class74.field1170; var8++) {
            int var9 = class38.field588[var8];
            int var10 = class38.field599[var8];
            int var11 = class38.field593[var8];
            boolean var12 = true;
            int var13 = class38.field597[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class38.field599[var22] - class38.field597[var22] < var10 + 2 && var10 - var13 < class38.field599[var22] - -2 && class38.field593[var22] + class38.field588[var22] > -var11 + var9 && var9 + var11 > class38.field588[var22] + -class38.field593[var22] && var10 > (class38.field599[var22] - class38.field597[var22])) {
                        var12 = true;
                        var10 = class38.field599[var22] - class38.field597[var22];
                    }
                }
            }
            class205.field3424 = class38.field588[var8];
            class176.field2887 = class38.field599[var8] = var10;
            class51 var14 = class38.field590[var8];
            if (class82.field1368 == 0) {
                int var15 = 16776960;
                if (class38.field591[var8] < 6) {
                    var15 = class60.field966[class38.field591[var8]];
                }
                if (class38.field591[var8] == 6) {
                    var15 = class182.field2994 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class38.field591[var8] == 7) {
                    var15 = (class182.field2994 % 20) < 10 ? 255 : 65535;
                }
                if (class38.field591[var8] == 8) {
                    var15 = class182.field2994 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class38.field591[var8] == 9) {
                    int var16 = 150 - class38.field587[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = var16 * 5 + 65280 - 500;
                    }
                }
                if (class38.field591[var8] == 10) {
                    int var17 = 150 - class38.field587[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - (var17 * 327680 - 16384000);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 - ((var17 - 100) * 5) - 32768000;
                    }
                }
                if (class38.field591[var8] == 11) {
                    int var18 = 150 - class38.field587[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = ((var18 - 50) * 327685) + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class38.field595[var8] == 0) {
                    class239.field4161.method1333(var14, class205.field3424 + arg0, arg1 - -class176.field2887, var15, 0);
                }
                if (class38.field595[var8] == 1) {
                    class239.field4161.method1329(var14, class205.field3424 + arg0, class176.field2887 + arg1, var15, 0, class182.field2994);
                }
                if (class38.field595[var8] == 2) {
                    class239.field4161.method1325(var14, class205.field3424 + arg0, class176.field2887 + arg1, var15, 0, class182.field2994);
                }
                if (class38.field595[var8] == 3) {
                    class239.field4161.method1337(var14, arg0 + class205.field3424, class176.field2887 + arg1, var15, 0, class182.field2994, 150 - class38.field587[var8]);
                }
                if (class38.field595[var8] == 4) {
                    int var19 = (150 - class38.field587[var8]) * (class239.field4161.method1317(var14) + 100) / 150;
                    class59.method371(class205.field3424 + arg0 - 50, arg1, arg0 - (-class205.field3424 - 50), arg1 + arg6);
                    class239.field4161.method1335(var14, class205.field3424 + arg0 + 50 - var19, class176.field2887 + arg1, var15, 0);
                    class59.method390(arg0, arg1, arg0 + arg2, arg1 + arg6);
                }
                if (class38.field595[var8] == 5) {
                    int var20 = 150 - class38.field587[var8];
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class59.method371(arg0, class176.field2887 + arg1 - class239.field4161.field3117 - 1, arg0 - -arg2, arg1 + class176.field2887 + 5);
                    class239.field4161.method1333(var14, class205.field3424 + arg0, class176.field2887 + arg1 + var21, var15, 0);
                    class59.method390(arg0, arg1, arg0 + arg2, arg1 + arg6);
                }
            } else {
                class239.field4161.method1333(var14, class205.field3424 + arg0, class176.field2887 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ldf;I)V")
    public class63(class51 arg0, int arg1) {
        this.field1020 = arg0;
    }
}
