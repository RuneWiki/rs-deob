import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 extends class70 {

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
    public static boolean field478 = false;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field480 = -1;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Z")
    public static boolean field487 = true;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Llc;")
    public static class69 field484 = class69.method470((byte) -116, "@gre@World");

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Llc;")
    public static class69 field483 = class69.method470((byte) -117, "@yel@World");

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "[J")
    public static long[] field491 = new long[32];

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Llc;")
    public static class69 field474 = class69.method470((byte) -100, "headicons_hint");

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lcc;")
    public class16 field485;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "[B")
    public byte[] field486;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILlc;III)V")
    public static final void method149(int arg0, int arg1, class69 arg2, int arg3, int arg4, int arg5) {
        field476++;
        if (class72.field1604 < 500) {
            class101.field2197[class72.field1604] = arg2;
            class76.field1700[class72.field1604] = arg3;
            class77.field1748[class72.field1604] = arg4;
            class68.field1474[class72.field1604] = arg5;
            class77.field1740[class72.field1604] = arg1;
            class72.field1604++;
        }
        int var6 = -83 % ((22 - arg0) / 34);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIZ)Llc;")
    public static final class69 method150(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = 1;
        field488++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var5 = arg1 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        if (arg2 != -31890) {
            field491 = null;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg1 /= arg0;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class69 var9 = new class69();
        var9.field1523 = var6;
        var9.field1488 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
    public static int method151(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public static final void method152(int arg0) {
        if (arg0 == -1) {
            class47.field985.method220((byte) -128);
            field479++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lwd;BII[Lvb;[B)V")
    public static final void method153(class129 arg0, byte arg1, int arg2, int arg3, class122[] arg4, byte[] arg5) {
        if (arg1 != 64) {
            method150(-94, -14, 99, false);
        }
        class94 var6 = new class94(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method684(false);
            if (var8 == 0) {
                field473++;
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method684(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method703((byte) 88);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg2 + var11;
                int var18 = arg3 + var12;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    int var19 = var13;
                    if ((class43.field856[1][var18][var17] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    class122 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg4[var19];
                    }
                    class108.method810(arg0, var16, var20, 768, var7, var17, var18, var13, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method154(byte arg0) {
        class114.field2463 = 0;
        field477++;
        if (arg0 <= 69) {
            method150(-37, 27, -90, false);
        }
        for (int var1 = -1; var1 < class62.field1284 + class27.field585; var1++) {
            class50 var18;
            if (var1 == -1) {
                var18 = class46.field974;
            } else if (class27.field585 > var1) {
                var18 = class123.field2682[class92.field2013[var1]];
            } else {
                var18 = class112.field2434[class70.field1569[var1 - class27.field585]];
            }
            if (var18 != null && var18.method327(true)) {
                if (var18 instanceof class72) {
                    class68 var19 = ((class72) var18).field1616;
                    if (var19.field1462 != null) {
                        var19 = var19.method453(126);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class27.field585 <= var1) {
                    class68 var20 = ((class72) var18).field1616;
                    if (var20.field1469 >= 0 && var20.field1469 < class69.field1537.length) {
                        client.method111(var18.field1086 + 15, var18, true);
                        if (class40.field779 > -1) {
                            class69.field1537[var20.field1469].method139(class40.field779 - 12, class13.field269 - 30);
                        }
                    }
                    if (class75.field1694 == 1 && class70.field1569[var1 - class27.field585] == class74.field1663 && class62.field1282 % 20 < 10) {
                        client.method111(var18.field1086 + 15, var18, true);
                        if (class40.field779 > -1) {
                            class49.field1010[0].method139(class40.field779 - 12, class13.field269 + -28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class60 var22 = (class60) var18;
                    if (var22.field1209 != -1 || var22.field1225 != -1) {
                        client.method111(var18.field1086 + 15, var18, true);
                        if (class40.field779 > -1) {
                            if (var22.field1209 != -1) {
                                class53.field1139[var22.field1209].method139(class40.field779 - 12, class13.field269 - var21);
                                var21 += 25;
                            }
                            if (var22.field1225 != -1) {
                                class69.field1537[var22.field1225].method139(class40.field779 - 12, -var21 + class13.field269);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class75.field1694 == 10 && class92.field2013[var1] == class64.field1351) {
                        client.method111(var18.field1086 + 15, var18, true);
                        if (class40.field779 > -1) {
                            class49.field1010[1].method139(class40.field779 - 12, class13.field269 - var21);
                        }
                    }
                }
                if (var18.field1054 != null && (class27.field585 <= var1 || class92.field2005 == 0 || class92.field2005 == 3 || class92.field2005 == 1 && class72.method511(false, ((class60) var18).field1222))) {
                    client.method111(var18.field1086, var18, true);
                    if (class40.field779 > -1 && class104.field2244 > class114.field2463) {
                        class104.field2277[class114.field2463] = class82.field1861.method298(var18.field1054) / 2;
                        class104.field2275[class114.field2463] = class82.field1861.field941;
                        class104.field2284[class114.field2463] = class40.field779;
                        class104.field2253[class114.field2463] = class13.field269;
                        class104.field2266[class114.field2463] = var18.field1056;
                        class104.field2252[class114.field2463] = var18.field1066;
                        class104.field2259[class114.field2463] = var18.field1026;
                        class104.field2286[class114.field2463] = var18.field1054;
                        class114.field2463++;
                    }
                }
                if (class62.field1282 < var18.field1078) {
                    client.method111(var18.field1086 + 15, var18, true);
                    if (class40.field779 > -1) {
                        int var23 = var18.field1040 * 30 / var18.field1052;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class95.method728(class40.field779 - 15, class13.field269 + -3, var23, 5, 65280);
                        class95.method728(var23 + class40.field779 - 15, class13.field269 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field1068[var24] > class62.field1282) {
                        client.method111(var18.field1086 / 2, var18, true);
                        if (class40.field779 > -1) {
                            if (var24 == 1) {
                                class13.field269 -= 20;
                            }
                            if (var24 == 2) {
                                class40.field779 -= 15;
                                class13.field269 -= 10;
                            }
                            if (var24 == 3) {
                                class40.field779 += 15;
                                class13.field269 -= 10;
                            }
                            class16.field314[var18.field1071[var24]].method139(class40.field779 - 12, class13.field269 + -12);
                            class36.field733.method299(class106.method791(var18.field1050[var24], (byte) -119), class40.field779, class13.field269 + 4, 0);
                            class36.field733.method299(class106.method791(var18.field1050[var24], (byte) -67), class40.field779 - 1, class13.field269 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class114.field2463; var2++) {
            int var3 = class104.field2284[var2];
            int var4 = class104.field2277[var2];
            int var5 = class104.field2253[var2];
            boolean var6 = true;
            int var7 = class104.field2275[var2];
            while (var6) {
                var6 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var5 + 2 > class104.field2253[var17] + -class104.field2275[var17] && class104.field2253[var17] + 2 > -var7 + var5 && var3 - var4 < class104.field2284[var17] + class104.field2277[var17] && var3 + var4 > class104.field2284[var17] + -class104.field2277[var17] && class104.field2253[var17] - class104.field2275[var17] < var5) {
                        var5 = class104.field2253[var17] - class104.field2275[var17];
                        var6 = true;
                    }
                }
            }
            class40.field779 = class104.field2284[var2];
            class13.field269 = class104.field2253[var2] = var5;
            class69 var8 = class104.field2286[var2];
            if (class17.field334 == 0) {
                int var9 = 16776960;
                if (class104.field2266[var2] < 6) {
                    var9 = class33.field661[class104.field2266[var2]];
                }
                if (class104.field2266[var2] == 6) {
                    var9 = class92.field2000 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class104.field2266[var2] == 7) {
                    var9 = class92.field2000 % 20 >= 10 ? 65535 : 255;
                }
                if (class104.field2266[var2] == 8) {
                    var9 = class92.field2000 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class104.field2266[var2] == 9) {
                    int var10 = 150 - class104.field2259[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = var10 * 5 + 64780;
                    }
                }
                if (class104.field2266[var2] == 10) {
                    int var11 = 150 - class104.field2259[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (class104.field2266[var2] == 11) {
                    int var12 = 150 - class104.field2259[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 32768000 + 16777215 - var12 * 327680;
                    }
                }
                if (class104.field2252[var2] == 0) {
                    class82.field1861.method299(var8, class40.field779, class13.field269 + 1, 0);
                    class82.field1861.method299(var8, class40.field779, class13.field269, var9);
                }
                if (class104.field2252[var2] == 1) {
                    class82.field1861.method290(var8, class40.field779, class13.field269 + 1, 0, class92.field2000);
                    class82.field1861.method290(var8, class40.field779, class13.field269, var9, class92.field2000);
                }
                if (class104.field2252[var2] == 2) {
                    class82.field1861.method300(var8, class40.field779, class13.field269 + 1, 0, class92.field2000);
                    class82.field1861.method300(var8, class40.field779, class13.field269, var9, class92.field2000);
                }
                if (class104.field2252[var2] == 3) {
                    class82.field1861.method302(var8, class40.field779, class13.field269 + 1, 0, class92.field2000, 150 - class104.field2259[var2]);
                    class82.field1861.method302(var8, class40.field779, class13.field269, var9, class92.field2000, 150 - class104.field2259[var2]);
                }
                if (class104.field2252[var2] == 4) {
                    int var13 = class82.field1861.method298(var8);
                    int var14 = (150 - class104.field2259[var2]) * (var13 + 100) / 150;
                    class95.method719(class40.field779 - 50, 0, class40.field779 + 50, 334);
                    class82.field1861.method291(var8, class40.field779 + 50 - var14, class13.field269 + 1, 0);
                    class82.field1861.method291(var8, class40.field779 + 50 - var14, class13.field269, var9);
                    class95.method724();
                }
                if (class104.field2252[var2] == 5) {
                    int var15 = 150 - class104.field2259[var2];
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class95.method719(0, class13.field269 - class82.field1861.field941 - 1, 512, class13.field269 + 5);
                    class82.field1861.method299(var8, class40.field779, class13.field269 + var16 + 1, 0);
                    class82.field1861.method299(var8, class40.field779, class13.field269 + var16, var9);
                    class95.method724();
                }
            } else {
                class82.field1861.method299(var8, class40.field779, class13.field269 + 1, 0);
                class82.field1861.method299(var8, class40.field779, class13.field269, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public static final void method155(boolean arg0) {
        field481++;
        if (class18.field348 != null) {
            class17 var1 = class18.field348;
            synchronized (class18.field348) {
                class18.field348 = null;
            }
        }
        if (!arg0) {
            field478 = false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static final void method156(int arg0) {
        field471++;
        int var1 = class33.field656;
        int var2 = class121.field2600;
        int var3 = class19.field419;
        int var4 = class112.field2430;
        int var5 = 6116423;
        class95.method728(var1, var2, var3, var4, var5);
        if (arg0 != -13309) {
            method152(11);
        }
        class95.method728(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class95.method717(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class82.field1861.method291(class18.field375, var1 + 3, var2 + 14, var5);
        int var6 = class74.field1666;
        int var7 = class101.field2193;
        if (class77.field1718 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class77.field1718 == 1) {
            var7 -= 553;
            var6 -= 205;
        }
        if (class77.field1718 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < class72.field1604; var8++) {
            int var9 = (class72.field1604 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < var1 + var3 && var6 > var9 - 13 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class82.field1861.method296(class101.field2197[var8], var1 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method157(byte arg0) {
        field484 = null;
        field474 = null;
        field491 = null;
        field483 = null;
        if (arg0 != 12) {
            field484 = null;
        }
    }
}
