import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class277 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public static int field3856 = -1;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "S")
    public static short field3859 = 1;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "Lkaa;")
    public static class47 field3860 = new class47(12, 7);

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "Lbw;")
    public static class689 field3863;

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "Lbw;")
    public static class689 field3864 = field3863 = new class689(false);

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "Lmha;")
    public static class419 field3866 = new class419(6, 1);

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "Las;")
    public class154 field3862;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Ljn;")
    public static class720 field3858;

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3865;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V", line = 10)
    public static void method1665(int arg0) {
        field3865 = null;
        field3863 = null;
        int var1 = 7 % ((62 - arg0) / 60);
        field3866 = null;
        field3858 = null;
        field3860 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Lfga;", line = 30)
    public static final class258 method1666(int arg0, int arg1) {
        field3857++;
        class258 var2 = (class258) class148.field2333.method552(arg1 + 11840, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class232.field3292.method2218((byte) 127, 0, arg0);
        class258 var4 = new class258();
        if (var3 != null) {
            var4.method1569((byte) -50, new class677(var3));
        }
        if (arg1 == -11836) {
            var4.method1570(arg1 + 6293);
            class148.field2333.method556((byte) 0, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLvfa;)Lvfa;", line = 57)
    public static final class672 method1667(byte arg0, class672 arg1) {
        field3861++;
        class672 var2 = client.method1873(arg1);
        if (var2 == null) {
            var2 = arg1.field9227;
        }
        return arg0 == 48 ? var2 : null;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)Lpf;", line = 74)
    public static final class583 method1668(int arg0) {
        field3855++;
        class583 var1 = class6.method83((byte) -62);
        var1.field7636 = null;
        var1.field7640 = arg0;
        var1.field7637 = new class276(5000);
        return var1;
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V", line = 87)
    public static final void method1669(int arg0) {
        field3854++;
        if (class597.field7823 == 0 || class597.field7823 == 5) {
            return;
        }
        try {
            short var1;
            if (class347.field4876 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (++class141.field2245 > var1) {
                if (class209.field3089 != null) {
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                }
                if (class347.field4876 >= 3) {
                    class597.field7823 = 0;
                    class484.method2735(-5, (byte) -111);
                    return;
                }
                if (class120.field1919 == 2) {
                    class284.field4030.method3103((byte) -89);
                } else {
                    class202.field3033.method3103((byte) -54);
                }
                class597.field7823 = 1;
                class141.field2245 = 0;
                class347.field4876++;
            }
            if (class597.field7823 == 1) {
                if (class120.field1919 == 2) {
                    class739.field10201 = class284.field4030.method3104(43594, class66.field828);
                } else {
                    class739.field10201 = class202.field3033.method3104(43594, class66.field828);
                }
                class597.field7823 = 2;
            }
            if (class597.field7823 == 2) {
                if (class739.field10201.field2987 == 2) {
                    throw new IOException();
                }
                if (class739.field10201.field2987 != 1) {
                    return;
                }
                class209.field3089 = class654.method3562(7500, (byte) -73, (Socket) class739.field10201.field2986);
                class739.field10201 = null;
                class96.method721((byte) 35);
                class583 var2 = method1668(0);
                var2.field7637.method3823(-36, class86.field1038.field4660);
                class42.method309(var2, 0);
                class539.method3007(arg0 + 7374);
                class597.field7823 = 3;
            }
            if (class597.field7823 == 3) {
                if (!class209.field3089.method1436(1, 1)) {
                    return;
                }
                class209.field3089.method1435(class3.field63.field9399, 1, arg0 ^ 0xFFFFFF8A, 0);
                int var3 = class3.field63.field9399[0] & 0xFF;
                if (var3 != 0) {
                    class597.field7823 = 0;
                    class484.method2735(var3, (byte) -111);
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                    class556.method3093(arg0 + 92);
                    return;
                }
                class3.field63.field9419 = 0;
                class677 var4 = new class677(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method3823(-105, 10);
                var4.method3798(27695, var5[0]);
                var4.method3798(arg0 + 27681, var5[1]);
                var4.method3798(27695, var5[2]);
                var4.method3798(arg0 ^ 0x6C21, var5[3]);
                var4.method3829(14731, 0L);
                var4.method3795(class416.field5739, (byte) -109);
                var4.method3829(arg0 + 14717, class112.field1856);
                var4.method3829(14731, class617.field8246);
                var4.method3806(class225.field3197, class541.field7176, 109);
                class96.method721((byte) 77);
                class583 var6 = method1668(0);
                class276 var7 = var6.field7637;
                if (class120.field1919 == 2) {
                    if (class15.field215 == 13) {
                        var7.method3823(-113, class86.field1044.field4660);
                    } else {
                        var7.method3823(arg0 ^ 0xFFFFFFBD, class86.field1042.field4660);
                    }
                    var7.method3831(1182, 0);
                    int var8 = var7.field9419;
                    var7.method3798(27695, 640);
                    var7.method3827(0, (byte) -32, var4.field9399, var4.field9419);
                    int var9 = var7.field9419;
                    var7.method3795(class371.field5166, (byte) -96);
                    var7.method3823(-26, class758.field10539);
                    var7.method3823(-48, class343.method2050((byte) -112));
                    var7.method3831(1182, class228.field3251);
                    var7.method3831(arg0 ^ 0x490, class199.field2993);
                    var7.method3823(-118, class411.field5711.field3912.method74(true));
                    class477.method2686((byte) 61, var7);
                    var7.method3795(class686.field9560, (byte) -92);
                    var7.method3798(27695, class236.field3316);
                    class677 var10 = class411.field5711.method1674((byte) -112);
                    var7.method3823(-33, var10.field9419);
                    var7.method3827(0, (byte) -32, var10.field9399, var10.field9419);
                    class41.field548 = true;
                    class677 var11 = new class677(class136.field2170.method3545(72));
                    class136.field2170.method3543(var11, -92);
                    var7.method3827(0, (byte) -32, var11.field9399, var11.field9399.length);
                    var7.method3831(1182, class589.field7684);
                    var7.method3829(14731, class310.field4461);
                    var7.method3823(-59, class354.field4992 == null ? 0 : 1);
                    if (class354.field4992 != null) {
                        var7.method3795(class354.field4992, (byte) -77);
                    }
                    var7.method3823(-128, class670.method3695("jagtheora", -22534) ? 1 : 0);
                    var7.method3823(-59, class358.field4998 ? 1 : 0);
                    class258.method1567(var7, (byte) -81);
                    var7.method3796(var5, var7.field9419, (byte) 112, var9);
                    var7.method3818(var7.field9419 - var8, arg0 ^ 0xFFFFFFF0);
                } else {
                    var7.method3823(arg0 - 110, class86.field1045.field4660);
                    var7.method3831(1182, 0);
                    int var12 = var7.field9419;
                    var7.method3798(27695, 640);
                    var7.method3827(0, (byte) -32, var4.field9399, var4.field9419);
                    int var13 = var7.field9419;
                    var7.method3795(class371.field5166, (byte) -80);
                    var7.method3823(arg0 - 35, class683.field9532.field10627);
                    var7.method3823(arg0 - 87, class713.field9854);
                    class477.method2686((byte) 61, var7);
                    var7.method3795(class686.field9560, (byte) -115);
                    var7.method3798(27695, class236.field3316);
                    class258.method1567(var7, (byte) -113);
                    var7.method3796(var5, var7.field9419, (byte) 112, var13);
                    var7.method3818(var7.field9419 - var12, -2);
                }
                class42.method309(var6, arg0 ^ 0xE);
                class539.method3007(7388);
                class128.field2105 = new class417(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class3.field63.method1654((byte) 105, var5);
                class597.field7823 = 4;
            }
            if (class597.field7823 == 4) {
                if (!class209.field3089.method1436(1, 1)) {
                    return;
                }
                class209.field3089.method1435(class3.field63.field9399, 1, -128, 0);
                int var15 = class3.field63.field9399[0] & 0xFF;
                if (var15 == 21) {
                    class597.field7823 = 7;
                } else if (var15 == 29) {
                    class597.field7823 = 13;
                } else if (var15 == 1) {
                    class597.field7823 = 5;
                    class484.method2735(var15, (byte) -111);
                    return;
                } else if (var15 == 2) {
                    class597.field7823 = 8;
                } else if (var15 == 15) {
                    class732.field10143 = -2;
                    class597.field7823 = 14;
                } else if (var15 == 23 && class347.field4876 < 3) {
                    class141.field2245 = 0;
                    class347.field4876++;
                    class597.field7823 = 1;
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                    return;
                } else {
                    class597.field7823 = 0;
                    class484.method2735(var15, (byte) -111);
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                    class556.method3093(arg0 ^ 0x6C);
                    return;
                }
            }
            if (class597.field7823 == 6) {
                class96.method721((byte) 95);
                class583 var16 = method1668(0);
                class276 var17 = var16.field7637;
                var17.method1663(class128.field2105, 8);
                var17.method1656(false, class86.field1049.field4660);
                class42.method309(var16, 0);
                class539.method3007(7388);
                class597.field7823 = 4;
            } else if (class597.field7823 == 7) {
                if (class209.field3089.method1436(arg0 ^ 0xF, 1)) {
                    class209.field3089.method1435(class3.field63.field9399, 1, arg0 - 140, 0);
                    int var18 = class3.field63.field9399[0] & 0xFF;
                    class283.field3999 = var18 * 50;
                    class597.field7823 = 0;
                    class484.method2735(21, (byte) -111);
                    class209.field3089.method1439(arg0 ^ 0xFFFFFFF1);
                    class209.field3089 = null;
                    class556.method3093(-104);
                }
            } else if (class597.field7823 == 13) {
                if (class209.field3089.method1436(arg0 ^ 0xF, 1)) {
                    class209.field3089.method1435(class3.field63.field9399, 1, -125, 0);
                    class300.field4264 = class3.field63.field9399[0] & 0xFF;
                    class597.field7823 = 0;
                    class484.method2735(29, (byte) -111);
                    class209.field3089.method1439(-1);
                    class209.field3089 = null;
                    class556.method3093(-43);
                }
            } else if (class597.field7823 != 8) {
                if (class597.field7823 == 9) {
                    class276 var19 = class3.field63;
                    if (class120.field1919 == 2) {
                        if (!class209.field3089.method1436(1, class302.field4274)) {
                            return;
                        }
                        class209.field3089.method1435(var19.field9399, class302.field4274, arg0 - 134, 0);
                        var19.field9419 = 0;
                        class257.field3521 = var19.method3821((byte) -55);
                        class317.field4519 = var19.method3821((byte) 124);
                        class375.field5199 = var19.method3821((byte) -40) == 1;
                        class662.field8730 = var19.method3821((byte) 121) == 1;
                        class376.field5229 = var19.method3821((byte) -65) == 1;
                        class433.field5956 = var19.method3821((byte) 103) == 1;
                        class303.field4293 = var19.method3807(-1);
                        class224.field3170 = var19.method3821((byte) 99) == 1;
                        class131.field2144 = var19.method3802(20198);
                        class142.field2266 = var19.method3821((byte) 117) == 1;
                        class462.field6333.method2007(arg0 + 99, class142.field2266);
                        class77.field948.method1177(0, class142.field2266);
                        class292.field4177.method2348(3, class142.field2266);
                    } else if (class209.field3089.method1436(arg0 - 13, class302.field4274)) {
                        class209.field3089.method1435(var19.field9399, class302.field4274, -126, 0);
                        var19.field9419 = 0;
                        class257.field3521 = var19.method3821((byte) -73);
                        class317.field4519 = var19.method3821((byte) -52);
                        class375.field5199 = var19.method3821((byte) 106) == 1;
                        class662.field8730 = var19.method3821((byte) 76) == 1;
                        class376.field5229 = var19.method3821((byte) -89) == 1;
                        class727.field10101 = var19.method3820(1237129056);
                        int var20 = var19.method3821((byte) -69);
                        class407.field5658 = (var20 & 0x2) != 0;
                        class224.field3170 = (var20 & 0x1) != 0;
                        class299.field4256 = var19.method3799(false);
                        class200.field3005 = var19.method3807(-1);
                        class148.field2336 = var19.method3807(-1);
                        class238.field3357 = var19.method3807(-1);
                        class308.field4426 = var19.method3799(false);
                        class112.field1854 = class66.field828.method1299(class308.field4426, (byte) -74);
                        class135.field2155 = var19.method3821((byte) 103);
                        class298.field4245 = var19.method3807(arg0 ^ 0xFFFFFFF1);
                        class719.field10012 = var19.method3807(-1);
                        class28.field446 = var19.method3821((byte) 105) == 1;
                        class472.field6475.field5334 = class472.field6475.field5339 = class44.field576 = var19.method3824(-77);
                        class97.field1198 = var19.method3821((byte) -113);
                        class394.field5493 = var19.method3799(false);
                        class404.field5629 = var19.method3821((byte) -73) == 1;
                        class286.field4041 = new class557();
                        class286.field4041.field7338 = var19.method3807(-1);
                        if (class286.field4041.field7338 == 65535) {
                            class286.field4041.field7338 = -1;
                        }
                        class286.field4041.field7333 = var19.method3824(-77);
                        if (class508.field6778 != class304.field4326) {
                            class286.field4041.field7342 = class286.field4041.field7338 + 50000;
                            class286.field4041.field7345 = class286.field4041.field7338 + 40000;
                        }
                        if (class76.field924 != class508.field6778 && (class284.field4030.method3101(class402.field5608, (byte) -72) || class284.field4030.method3101(class478.field6562, (byte) -72))) {
                            class609.method3324(arg0 + 4082);
                        }
                    } else {
                        return;
                    }
                    if ((!class375.field5199 || class376.field5229) && !class224.field3170) {
                        try {
                            class124.method987("unzap", -8364, class514.field6818);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class124.method987("zap", -8364, class514.field6818);
                        } catch (Throwable var27) {
                            if (class589.field7687) {
                                try {
                                    class514.field6818.getAppletContext().showDocument(new URL(class514.field6818.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var26) {
                                }
                            }
                        }
                    }
                    if (class508.field6778 == class304.field4326) {
                        try {
                            class124.method987("loggedin", arg0 - 8378, class514.field6818);
                        } catch (Throwable var24) {
                        }
                    }
                    if (class120.field1919 != 2) {
                        class597.field7823 = 0;
                        class484.method2735(2, (byte) -111);
                        class415.method2409((byte) 97);
                        class66.method566(7, -21035);
                        class94.field1148 = null;
                        return;
                    }
                    class597.field7823 = 11;
                }
                if (class597.field7823 == 11) {
                    if (!class209.field3089.method1436(1, 3)) {
                        return;
                    }
                    class209.field3089.method1435(class3.field63.field9399, 3, -120, 0);
                    class597.field7823 = 12;
                }
                if (class597.field7823 == 12) {
                    class276 var21 = class3.field63;
                    var21.field9419 = 0;
                    if (var21.method1662(1682588262)) {
                        if (!class209.field3089.method1436(1, 1)) {
                            return;
                        }
                        class209.field3089.method1435(var21.field9399, 1, -124, 3);
                    }
                    class94.field1148 = class84.method651(-5)[var21.method1657(-87)];
                    class732.field10143 = var21.method3807(arg0 ^ 0xFFFFFFF1);
                    class597.field7823 = 10;
                }
                if (class597.field7823 == 10) {
                    if (class209.field3089.method1436(1, class732.field10143)) {
                        class209.field3089.method1435(class3.field63.field9399, class732.field10143, -126, 0);
                        class3.field63.field9419 = 0;
                        int var22 = class732.field10143;
                        class597.field7823 = 0;
                        class484.method2735(2, (byte) -111);
                        class608.method3315((byte) -124);
                        class186.method1285((byte) -1, class3.field63);
                        class161.field2401 = -1;
                        if (class94.field1148 == class393.field5484) {
                            class362.method2152(arg0 + 95);
                        } else {
                            class450.method2570(arg0 ^ 0x6D14ED6A);
                        }
                        if (class3.field63.field9419 != var22) {
                            throw new RuntimeException("lswp pos:" + class3.field63.field9419 + " psize:" + var22);
                        }
                        class94.field1148 = null;
                    }
                } else if (class597.field7823 == arg0) {
                    if (class732.field10143 == -2) {
                        if (!class209.field3089.method1436(1, 2)) {
                            return;
                        }
                        class209.field3089.method1435(class3.field63.field9399, 2, arg0 ^ 0xFFFFFF89, 0);
                        class3.field63.field9419 = 0;
                        class732.field10143 = class3.field63.method3807(-1);
                    }
                    if (class209.field3089.method1436(1, class732.field10143)) {
                        class209.field3089.method1435(class3.field63.field9399, class732.field10143, arg0 - 139, 0);
                        class3.field63.field9419 = 0;
                        int var23 = class732.field10143;
                        class597.field7823 = 0;
                        class484.method2735(15, (byte) -111);
                        class27.method251(arg0 - 14);
                        class186.method1285((byte) -1, class3.field63);
                        if (class3.field63.field9419 != var23) {
                            throw new RuntimeException("lswpr pos:" + class3.field63.field9419 + " psize:" + var23);
                        }
                        class94.field1148 = null;
                    }
                }
            } else if (class209.field3089.method1436(1, 1)) {
                class209.field3089.method1435(class3.field63.field9399, 1, -124, 0);
                class597.field7823 = 9;
                class302.field4274 = class3.field63.field9399[0] & 0xFF;
            }
        } catch (IOException var28) {
            if (class209.field3089 != null) {
                class209.field3089.method1439(-1);
                class209.field3089 = null;
            }
            if (class347.field4876 < 3) {
                if (class120.field1919 == 2) {
                    class284.field4030.method3103((byte) -41);
                } else {
                    class202.field3033.method3103((byte) -121);
                }
                class141.field2245 = 0;
                class597.field7823 = 1;
                class347.field4876++;
            } else {
                class597.field7823 = 0;
                class484.method2735(-4, (byte) -111);
                class556.method3093(-113);
            }
        }
    }
}
