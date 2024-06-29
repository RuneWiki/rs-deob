import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class502 {

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
    private int[] field7320 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lao;")
    public static class191 field7318 = new class191(92, 12);

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Ljk;")
    public static class450 field7324 = null;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Lao;")
    public static class191 field7323 = new class191(33, 20);

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "Lho;")
    public static class103 field7328 = new class103(53, 7);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lrq;")
    public class235 field7310;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    private int[] field7314;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[S")
    private short[] field7313;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[S")
    private short[] field7317;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[S")
    private short[] field7319;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "[S")
    private short[] field7321;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
    public final boolean method3006(int arg0) {
        field7325++;
        if (this.field7314 == null) {
            return true;
        }
        boolean var2 = true;
        class361 var3 = this.field7310.field3138;
        synchronized (this.field7310.field3138) {
            for (int var4 = arg0; var4 < this.field7314.length; var4++) {
                if (!this.field7310.field3138.method2142(this.field7314[var4], 0, (byte) 59)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Lpq;")
    public final class131 method3007(int arg0) {
        field7307++;
        class131[] var2 = new class131[5];
        int var3 = 0;
        class361 var4 = this.field7310.field3138;
        synchronized (this.field7310.field3138) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field7320[var5] != -1) {
                    var2[var3++] = class490.method2960(0, this.field7320[var5], this.field7310.field3138, 76);
                }
                var5++;
            }
        }
        int var6 = 0;
        if (arg0 != -24906) {
            method3013(106, -112);
        }
        while (var6 < 5) {
            if (var2[var6] != null && var2[var6].field1693 < 13) {
                var2[var6].method787(arg0 + 24906, 0);
            }
            var6++;
        }
        class131 var7 = new class131(var2, var3);
        if (this.field7319 != null) {
            for (int var8 = 0; var8 < this.field7319.length; var8++) {
                var7.method799(-92, this.field7317[var8], this.field7319[var8]);
            }
        }
        if (this.field7321 != null) {
            for (int var9 = 0; var9 < this.field7321.length; var9++) {
                var7.method789(false, this.field7313[var9], this.field7321[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III[BBI)Z")
    public static final boolean method3008(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5) {
        field7322++;
        if (arg4 >= -55) {
            field7323 = null;
        }
        boolean var6 = true;
        class396 var7 = new class396(arg3);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2405(false);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2443(-94);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method2388((byte) -114) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = var14 + arg1;
                    if (var17 > 0 && var18 > 0 && arg5 - 1 > var17 && var18 < arg2 - 1) {
                        class70 var19 = class123.field1593.method2920(var8, 19219);
                        if (var16 != 22 || class319.field4256.field4687 || var19.field886 != 0 || var19.field904 == 1 || var19.field842) {
                            if (!var19.method417(-12521)) {
                                var6 = false;
                                class321.field4274++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2443(83);
                if (var12 == 0) {
                    break;
                }
                var7.method2388((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Z")
    public final boolean method3009(boolean arg0) {
        field7316++;
        boolean var2 = arg0;
        class361 var3 = this.field7310.field3138;
        synchronized (this.field7310.field3138) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field7320[var4] != -1 && !this.field7310.field3138.method2142(this.field7320[var4], 0, (byte) 18)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
    public static final int method3010(int arg0, int arg1) {
        field7326++;
        if (arg0 != -10806) {
            method3008(-61, -19, -39, null, (byte) -84, -60);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method3011(byte arg0) {
        if (arg0 < -107) {
            field7328 = null;
            field7323 = null;
            field7324 = null;
            field7318 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static final void method3012(int arg0) {
        field7308++;
        if (class328.field4360 == 0 || class328.field4360 == 5) {
            return;
        }
        try {
            if (++class316.field4210 > 2000) {
                if (class446.field6499 != null) {
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                }
                if (class505.field7338 >= 1) {
                    class328.field4360 = 0;
                    class326.method1918((byte) 124, -5);
                    return;
                }
                class505.field7338++;
                class316.field4210 = 0;
                if (class48.field505 == 2 || class48.field505 == 3) {
                    class255.field3395.field3561 = !class255.field3395.field3561;
                } else {
                    class211.field2823.field3561 = !class211.field2823.field3561;
                }
                class328.field4360 = 1;
            }
            if (class328.field4360 == 1) {
                if (class48.field505 == 2 || class48.field505 == 3) {
                    class142.field1879 = class381.field5518.method829(class255.field3395.method1628(52), class255.field3395.field3564, -12048);
                } else {
                    class142.field1879 = class381.field5518.method829(class211.field2823.method1628(86), class211.field2823.field3564, -12048);
                }
                class328.field4360 = 2;
            }
            if (class328.field4360 == 2) {
                if (class142.field1879.field3149 == 2) {
                    throw new IOException();
                }
                if (class142.field1879.field3149 != 1) {
                    return;
                }
                class446.field6499 = new class426((Socket) class142.field1879.field3151, class381.field5518);
                class142.field1879 = null;
                long var1 = class484.field7129 = class408.method2501(class392.field5663, 57);
                class106.field1443.field5729 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class106.field1443.method2449((byte) 120, class459.field6847.field782);
                class106.field1443.method2449((byte) 115, var3);
                class446.field6499.method2620(true, class106.field1443.field5761, 0, 2);
                class116.method699(3);
                int var4 = class446.field6499.method2626((byte) 1);
                class116.method699(3);
                if (var4 != 0) {
                    class328.field4360 = 0;
                    class326.method1918((byte) 127, var4);
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                    class183.method1063(65280);
                    return;
                }
                class328.field4360 = 3;
            }
            int var5 = -63 % ((arg0 + 23) / 56);
            if (class328.field4360 == 3) {
                if (class446.field6499.method2624(114) < 8) {
                    return;
                }
                class446.field6499.method2621(false, 0, 8, class334.field4414.field5761);
                class334.field4414.field5729 = 0;
                class118.field1548 = class334.field4414.method2391((byte) -119);
                class396 var6 = new class396(70);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class118.field1548 >> 32), (int) class118.field1548 };
                var6.method2449((byte) 123, 10);
                var6.method2398(-83, var7[0]);
                var6.method2398(126, var7[1]);
                var6.method2398(-128, var7[2]);
                var6.method2398(-3, var7[3]);
                var6.method2422(class408.method2501(class392.field5663, 57), 121);
                var6.method2415(class516.field7509, 21742);
                var6.method2424(class183.field2384, class318.field4248, 0);
                class13 var8 = class106.field1443;
                var8.field5729 = 0;
                if (class48.field505 == 2 || class48.field505 == 3) {
                    if (class527.field7734 == 12) {
                        var8.method2449((byte) 117, class459.field6852.field782);
                    } else {
                        var8.method2449((byte) 116, class459.field6850.field782);
                    }
                    var8.method2444((byte) 65, 0);
                    int var9 = var8.field5729;
                    var8.method2398(116, 596);
                    var8.method2449((byte) 126, class47.field493);
                    var8.method2449((byte) 123, class423.method2612(2));
                    var8.method2444((byte) 65, class372.field5051);
                    var8.method2444((byte) 65, class430.field6244);
                    var8.method2449((byte) 120, class319.field4256.field4654);
                    class321.method1906(-1, var8);
                    var8.method2415(class339.field4485, 21742);
                    var8.method2398(119, class385.field5601);
                    class396 var10 = class319.field4256.method1741((byte) -103);
                    var8.method2449((byte) 120, var10.field5729);
                    var8.method2438(0, var10.field5761, var10.field5729, 1769508784);
                    class435.field6347 = true;
                    var8.method2444((byte) 65, class263.field3537);
                    class291.method1746(95);
                    var8.method2438(0, var6.field5761, var6.field5729, 1769508784);
                    var8.method2437(var8.field5729 - var9, false);
                } else {
                    var8.method2449((byte) 122, class459.field6853.field782);
                    var8.method2444((byte) 65, 0);
                    int var11 = var8.field5729;
                    var8.method2398(-22, 596);
                    var8.method2449((byte) 122, class381.field5520.field1407);
                    var8.method2449((byte) 116, class374.field5072);
                    class321.method1906(-1, var8);
                    var8.method2415(class339.field4485, 21742);
                    var8.method2398(117, class385.field5601);
                    class291.method1746(108);
                    var8.method2438(0, var6.field5761, var6.field5729, 1769508784);
                    var8.method2437(var8.field5729 - var11, false);
                }
                class446.field6499.method2620(true, var8.field5761, 0, var8.field5729);
                var8.method78(-117, var7);
                for (int var12 = 0; var12 < 4; var12++) {
                    var7[var12] += 50;
                }
                class334.field4414.method78(-72, var7);
                class328.field4360 = 4;
            }
            if (class328.field4360 == 4) {
                if (class446.field6499.method2624(111) < 1) {
                    return;
                }
                int var13 = class446.field6499.method2626((byte) 116);
                if (var13 == 21) {
                    class328.field4360 = 7;
                } else if (var13 == 29) {
                    class328.field4360 = 13;
                } else if (var13 == 1) {
                    class328.field4360 = 5;
                    class326.method1918((byte) 127, var13);
                    return;
                } else if (var13 == 2) {
                    class328.field4360 = 8;
                } else if (var13 == 15) {
                    class328.field4360 = 14;
                    class132.field1742 = -2;
                } else if (var13 == 23 && class505.field7338 < 1) {
                    class505.field7338++;
                    class316.field4210 = 0;
                    class328.field4360 = 1;
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                    return;
                } else {
                    class328.field4360 = 0;
                    class326.method1918((byte) 110, var13);
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                    class183.method1063(65280);
                    return;
                }
            }
            if (class328.field4360 == 6) {
                class106.field1443.field5729 = 0;
                class106.field1443.method74(class459.field6851.field782, (byte) 106);
                class446.field6499.method2620(true, class106.field1443.field5761, 0, class106.field1443.field5729);
                class328.field4360 = 4;
            } else if (class328.field4360 == 7) {
                if (class446.field6499.method2624(119) >= 1) {
                    class352.field4701 = (class446.field6499.method2626((byte) 118) + 3) * 60;
                    class328.field4360 = 0;
                    class326.method1918((byte) 126, 21);
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                    class183.method1063(65280);
                }
            } else if (class328.field4360 == 13) {
                if (class446.field6499.method2624(127) >= 1) {
                    class33.field341 = class446.field6499.method2626((byte) 126);
                    class328.field4360 = 0;
                    class326.method1918((byte) 125, 29);
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                    class183.method1063(65280);
                }
            } else if (class328.field4360 != 8) {
                if (class328.field4360 == 9) {
                    if (class48.field505 == 3) {
                        class449.field6536 = true;
                    } else {
                        class449.field6536 = false;
                    }
                    class13 var14 = class334.field4414;
                    if (class48.field505 == 2 || class48.field505 == 3) {
                        if (class446.field6499.method2624(109) < class243.field3210) {
                            return;
                        }
                        class446.field6499.method2621(false, 0, class243.field3210, var14.field5761);
                        var14.field5729 = 0;
                        class509.field7372 = var14.method2388((byte) -122);
                        class402.field5822 = var14.method2388((byte) -125);
                        class193.field2495 = var14.method2388((byte) -128) == 1;
                        class310.field4150 = var14.method2388((byte) -122) == 1;
                        class238.field3160 = var14.method2388((byte) -126) == 1;
                        class334.field4432 = var14.method2388((byte) -119) == 1;
                        class308.field4121 = var14.method2386(-23648);
                        class19.field166 = var14.method2388((byte) -117) == 1;
                        class386.field5616 = var14.method2440((byte) -15);
                        class48.field508 = var14.method2388((byte) -128) == 1;
                        if (class48.field505 == 3) {
                            boolean var15 = var14.method2388((byte) -121) == 1;
                            if (var15) {
                                long var16 = var14.method2391((byte) -112);
                                String var18 = class90.method498(var16, 64);
                                int var19 = var14.method2388((byte) -112);
                                byte[] var20 = new byte[var19];
                                var14.method83(0, var20, var19, -54);
                                String var21 = class418.method2586(var20, 191);
                                class86 var22 = null;
                                try {
                                    class236 var23 = class381.field5518.method850("3", false, true);
                                    while (var23.field3149 == 0) {
                                        class316.method1873(1L, false);
                                    }
                                    if (var23.field3149 == 1) {
                                        var22 = (class86) var23.field3151;
                                        int var24 = var18.length() + 2 + 3 - (-var21.length() + -4);
                                        if (var24 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class396 var25 = new class396(var24 + 1);
                                        var25.method2449((byte) 117, var24);
                                        var25.method2449((byte) 125, 0);
                                        var25.method2402(var18, 571119120);
                                        var25.method2402(var21, 571119120);
                                        var25.method2413(1299316304);
                                        var22.method469(0, var25.field5729, 23609, var25.field5761);
                                    }
                                } catch (Exception var34) {
                                }
                                try {
                                    if (var22 != null) {
                                        var22.method472(-29827);
                                    }
                                } catch (Exception var32) {
                                }
                            }
                        }
                        class123.field1593.method2921(true, class48.field508);
                        class237.field3158.method224(class48.field508, true);
                        class87.field1032.method1669(class48.field508, -11453);
                    } else if (class446.field6499.method2624(113) >= class243.field3210) {
                        class446.field6499.method2621(false, 0, class243.field3210, var14.field5761);
                        var14.field5729 = 0;
                        class509.field7372 = var14.method2388((byte) -122);
                        class402.field5822 = var14.method2388((byte) -125);
                        class193.field2495 = var14.method2388((byte) -111) == 1;
                        class310.field4150 = var14.method2388((byte) -125) == 1;
                        class238.field3160 = var14.method2388((byte) -125) == 1;
                        class226.field3041 = var14.method2386(-23648);
                        class19.field166 = class226.field3041 > 0;
                        class130.field1686 = var14.method2386(-23648);
                        class328.field4359 = var14.method2386(-23648);
                        class457.field6818 = var14.method2386(-23648);
                        class146.field1934 = var14.method2406((byte) -92);
                        class263.field3525 = class381.field5518.method853(true, class146.field1934);
                        class68.field783 = var14.method2388((byte) -117);
                        class395.field5695 = var14.method2386(-23648);
                        class14.field149 = var14.method2386(-23648);
                        class12.field129 = var14.method2388((byte) -117) == 1;
                        class96.field1170.field7783 = class96.field1170.field7832 = var14.method2420((byte) -67);
                        class244.field3223 = new class266();
                        class244.field3223.field3559 = var14.method2386(-23648);
                        if (class244.field3223.field3559 == 65535) {
                            class244.field3223.field3559 = -1;
                        }
                        class244.field3223.field3564 = var14.method2420((byte) -67);
                        if (class401.field5807 != class287.field3779) {
                            class244.field3223.field3570 = class244.field3223.field3559 + 40000;
                            class244.field3223.field3566 = class244.field3223.field3559 + 50000;
                        }
                        if (class401.field5807 != class264.field3547 && (class255.field3395.method1629(class225.field3029, -13798) || class255.field3395.method1629(class422.field6149, -13798))) {
                            class255.field3395 = class244.field3223;
                        }
                    } else {
                        return;
                    }
                    if ((!class193.field2495 || class238.field3160) && !class19.field166) {
                        try {
                            class400.method2475(class381.field5518.field1828, -62, "unzap");
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            class400.method2475(class381.field5518.field1828, -110, "zap");
                        } catch (Throwable var33) {
                            if (class15.field157) {
                                try {
                                    class381.field5518.field1828.getAppletContext().showDocument(new URL(class381.field5518.field1828.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var31) {
                                }
                            }
                        }
                    }
                    if (class401.field5807 == class287.field3779) {
                        try {
                            class400.method2475(class381.field5518.field1828, -58, "loggedin");
                        } catch (Throwable var29) {
                        }
                    }
                    if (class48.field505 != 2 && class48.field505 != 3) {
                        class328.field4360 = 0;
                        class326.method1918((byte) 121, 2);
                        class516.method3075((byte) 32);
                        class57.method345(1, 6);
                        class188.field2437 = null;
                        return;
                    }
                    class328.field4360 = 11;
                }
                if (class328.field4360 == 11) {
                    if (class446.field6499.method2624(118) < 3) {
                        return;
                    }
                    class446.field6499.method2621(false, 0, 3, class334.field4414.field5761);
                    class328.field4360 = 12;
                }
                if (class328.field4360 == 12) {
                    class13 var26 = class334.field4414;
                    var26.field5729 = 0;
                    if (var26.method81(false)) {
                        if (class446.field6499.method2624(124) < 1) {
                            return;
                        }
                        class446.field6499.method2621(false, 3, 1, var26.field5761);
                    }
                    class188.field2437 = class465.method2845((byte) 108)[var26.method75(9256)];
                    class132.field1742 = var26.method2386(-23648);
                    class328.field4360 = 10;
                }
                if (class328.field4360 == 10) {
                    if (class446.field6499.method2624(121) >= class132.field1742) {
                        class446.field6499.method2621(false, 0, class132.field1742, class334.field4414.field5761);
                        class334.field4414.field5729 = 0;
                        int var27 = class132.field1742;
                        class328.field4360 = 0;
                        class326.method1918((byte) 120, 2);
                        class288.method1727(0);
                        class73.method429(class334.field4414, (byte) -114);
                        class126.field1634 = -1;
                        class440.method2696(-1501808444);
                        if (class334.field4414.field5729 != var27) {
                            throw new RuntimeException("lswp pos:" + class334.field4414.field5729 + " psize:" + var27);
                        }
                        class188.field2437 = null;
                    }
                } else if (class328.field4360 == 14) {
                    if (class132.field1742 == -2) {
                        if (class446.field6499.method2624(125) < 2) {
                            return;
                        }
                        class446.field6499.method2621(false, 0, 2, class334.field4414.field5761);
                        class334.field4414.field5729 = 0;
                        class132.field1742 = class334.field4414.method2386(-23648);
                    }
                    if (class446.field6499.method2624(124) >= class132.field1742) {
                        class446.field6499.method2621(false, 0, class132.field1742, class334.field4414.field5761);
                        class334.field4414.field5729 = 0;
                        int var28 = class132.field1742;
                        class328.field4360 = 0;
                        class326.method1918((byte) 127, 15);
                        class285.method1713(true);
                        class73.method429(class334.field4414, (byte) -114);
                        if (class334.field4414.field5729 != var28) {
                            throw new RuntimeException("lswpr pos:" + class334.field4414.field5729 + " psize:" + var28);
                        }
                        class188.field2437 = null;
                    }
                }
            } else if (class446.field6499.method2624(119) >= 1) {
                class243.field3210 = class446.field6499.method2626((byte) -76);
                class328.field4360 = 9;
            }
        } catch (IOException var35) {
            if (class446.field6499 != null) {
                class446.field6499.method2625(true);
                class446.field6499 = null;
            }
            if (class505.field7338 < 1) {
                class328.field4360 = 1;
                class316.field4210 = 0;
                class505.field7338++;
                if (class48.field505 == 2 || class48.field505 == 3) {
                    class255.field3395.field3561 = !class255.field3395.field3561;
                } else {
                    class211.field2823.field3561 = !class211.field2823.field3561;
                }
            } else {
                class328.field4360 = 0;
                class326.method1918((byte) 119, -4);
                class183.method1063(65280);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)I")
    public static final int method3013(int arg0, int arg1) {
        if (arg1 != 2) {
            method3008(-37, 101, -97, null, (byte) -113, 4);
        }
        field7315++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILug;I)V")
    private final void method3014(int arg0, class396 arg1, int arg2) {
        if (arg0 == 1) {
            arg1.method2388((byte) -125);
        } else if (arg0 == 2) {
            int var8 = arg1.method2388((byte) -120);
            this.field7314 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field7314[var9] = arg1.method2386(-23648);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg1.method2388((byte) -128);
                this.field7319 = new short[var4];
                this.field7317 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field7319[var5] = (short) arg1.method2386(-23648);
                    this.field7317[var5] = (short) arg1.method2386(-23648);
                }
            } else if (arg0 == 41) {
                int var6 = arg1.method2388((byte) -111);
                this.field7313 = new short[var6];
                this.field7321 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field7321[var7] = (short) arg1.method2386(-23648);
                    this.field7313[var7] = (short) arg1.method2386(-23648);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field7320[arg0 - 60] = arg1.method2386(-23648);
            }
        }
        field7309++;
        int var10 = -72 % ((-arg2 - 31) / 41);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lug;I)V")
    public final void method3015(class396 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -118);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field7312++;
                return;
            }
            this.method3014(var3, arg0, arg1 ^ 0xFFFFFFB4);
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Lpq;")
    public final class131 method3016(int arg0) {
        field7311++;
        if (this.field7314 == null) {
            return null;
        }
        class131[] var2 = new class131[this.field7314.length];
        class361 var3 = this.field7310.field3138;
        synchronized (this.field7310.field3138) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field7314.length) {
                    break;
                }
                var2[var4] = class490.method2960(0, this.field7314[var4], this.field7310.field3138, 122);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field7314.length; var5++) {
            if (var2[var5].field1693 < 13) {
                var2[var5].method787(0, 0);
            }
        }
        class131 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class131(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (arg0 >= -15) {
            this.field7313 = null;
        }
        if (this.field7319 != null) {
            for (int var7 = 0; var7 < this.field7319.length; var7++) {
                var6.method799(-83, this.field7317[var7], this.field7319[var7]);
            }
        }
        if (this.field7321 != null) {
            for (int var8 = 0; var8 < this.field7321.length; var8++) {
                var6.method789(false, this.field7313[var8], this.field7321[var8]);
            }
        }
        return var6;
    }
}
