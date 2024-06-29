import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class65 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1086 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lp;")
    public static class280 field1088 = class18.method140((byte) -121, " weitere Optionen");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public static final void method447(int arg0, int arg1, int arg2) {
        if (arg2 != -19392) {
            method448(true, (class180) null);
        }
        field1093++;
        if (class188.field3307 != 0 && arg0 != -1) {
            class112.method785(arg0, class107.field1769, false, 0, arg2 ^ 0xFFFF9350, class188.field3307);
            class54.field893 = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLtg;)V")
    public static final void method448(boolean arg0, class180 arg1) {
        field1092++;
        class276.field4781 = class79.method588((byte) -109, 0, class38.field680, arg1);
        class203.field3525 = new class5[class276.field4781.length];
        class191.field3346 = new class5[class276.field4781.length];
        class199.field3487 = new class5[class276.field4781.length];
        for (int var2 = 0; var2 < class276.field4781.length; var2++) {
            class276.field4781[var2].method67();
            class203.field3525[var2] = class276.field4781[var2].method64();
            class276.field4781[var2].method67();
            class191.field3346[var2] = class276.field4781[var2].method64();
            class276.field4781[var2].method67();
            class199.field3487[var2] = class276.field4781[var2].method64();
            class276.field4781[var2].method67();
        }
        class12.field245 = class53.method391(0, (byte) 3, class86.field1405, arg1);
        class241.field4212 = class44.method333(1, class264.field4651, 0, arg1);
        class75.field1244 = class44.method333(1, class266.field4674, 0, arg1);
        class49.field808 = class44.method333(1, client.field2699, 0, arg1);
        class12.field244 = class44.method333(1, class182.field3206, 0, arg1);
        class64.field1080 = class44.method333(1, class18.field336, 0, arg1);
        class20.field375 = class44.method333(1, class98.field1590, 0, arg1);
        class210.field3614 = class17.method130(class86.field1424, 0, arg1, -112);
        class176.field3055 = class129.method888(0, arg1, (byte) -96, class93.field1508);
        class269.field4708 = class129.method888(0, arg1, (byte) -95, class152.field2638);
        if (arg0) {
            return;
        }
        class262.field4624 = class49.method361(-21, class78.field1272, arg1, 0);
        class108.field1777 = class49.method361(-21, class255.field4452, arg1, 0);
        class181.field3161.method535(class108.field1777, (int[]) null);
        class101.field1651.method535(class108.field1777, (int[]) null);
        class54.field890.method535(class108.field1777, (int[]) null);
        class223 var3 = class51.method374(24479, class176.field3069, arg1, 0);
        var3.method1499();
        class182.field3208 = var3;
        class223[] var4 = class53.method391(0, (byte) 3, class92.field1504, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1499();
        }
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class254.field4448 = var4;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        for (int var10 = 0; var10 < class12.field245.length; var10++) {
            class12.field245[var10].method1506(var6 + var8, var7 + var8, var9 + var8);
        }
        class276.field4781[0].method66(var6 + var8, var7 - -var8, var9 + var8);
        class2.field81 = class12.field245;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method449(int arg0) {
        field1089++;
        if (class264.field4663 == 0 || class264.field4663 == 5) {
            return;
        }
        if (arg0 > -2) {
            method449(-53);
        }
        try {
            if (++class183.field3228 > 2000) {
                if (class44.field727 != null) {
                    class44.field727.method1532(96);
                    class44.field727 = null;
                }
                if (class148.field2574 >= 1) {
                    class264.field4663 = 0;
                    class8.field148 = -5;
                    return;
                }
                class148.field2574++;
                if (class238.field4132 == class152.field2637) {
                    class152.field2637 = class74.field1218;
                } else {
                    class152.field2637 = class238.field4132;
                }
                class183.field3228 = 0;
                class264.field4663 = 1;
            }
            if (class264.field4663 == 1) {
                class83.field1372 = class118.field2117.method1358(class152.field2637, -115, class54.field895);
                class264.field4663 = 2;
            }
            if (class264.field4663 == 2) {
                if (class83.field1372.field3025 == 2) {
                    throw new IOException();
                }
                if (class83.field1372.field3025 != 1) {
                    return;
                }
                class44.field727 = new class227((Socket) class83.field1372.field3028, class118.field2117);
                class83.field1372 = null;
                long var1 = class130.field2300 = class229.field3961.method1896(74);
                class34.field627.field481 = 0;
                class34.field627.method227(-20435, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class34.field627.method227(-20435, var3);
                class44.field727.method1526(2, -110, 0, class34.field627.field475);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                int var4 = class44.field727.method1529(0);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                if (var4 != 0) {
                    class8.field148 = var4;
                    class264.field4663 = 0;
                    class44.field727.method1532(99);
                    class44.field727 = null;
                    return;
                }
                class264.field4663 = 3;
            }
            if (class264.field4663 == 3) {
                if (class44.field727.method1525(5000) < 8) {
                    return;
                }
                class44.field727.method1528(0, 8, (byte) 91, class20.field367.field475);
                class20.field367.field481 = 0;
                int[] var5 = new int[4];
                class248.field4351 = class20.field367.method218(true);
                var5[3] = (int) class248.field4351;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class248.field4351 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class34.field627.field481 = 0;
                class34.field627.method227(-20435, 10);
                class34.field627.method231(11510, var5[0]);
                class34.field627.method231(11510, var5[1]);
                class34.field627.method231(11510, var5[2]);
                class34.field627.method231(11510, var5[3]);
                class34.field627.method219(class229.field3961.method1896(102), -113);
                class34.field627.method195(class229.field3963, -66);
                class34.field627.method196(class155.field2714, class152.field2636, 30267);
                class35.field639.field481 = 0;
                if (class162.field2858 == 40) {
                    class35.field639.method227(-20435, 18);
                } else {
                    class35.field639.method227(-20435, 16);
                }
                class35.field639.method214(-3, (class34.field627.field481 + class169.method1175(class188.field3309, false)) + 159);
                class35.field639.method231(11510, 528);
                class35.field639.method227(-20435, class109.field1828);
                class35.field639.method227(-20435, class16.field295 ? 1 : 0);
                class35.field639.method227(-20435, 0);
                class35.field639.method227(-20435, class210.method1410(0));
                class35.field639.method214(-3, class190.field3328);
                class35.field639.method214(-3, class103.field1724);
                class35.field639.method227(-20435, class128.field2234);
                class253.method1707(0, class35.field639);
                class35.field639.method195(class188.field3309, -66);
                class35.field639.method231(11510, class108.field1778);
                class35.field639.method231(11510, class264.method1783(true));
                class194.field3424 = true;
                class35.field639.method214(-3, class238.field4128);
                class35.field639.method231(11510, class190.field3333.method1247((byte) -60));
                class35.field639.method231(11510, class23.field407.method1247((byte) -65));
                class35.field639.method231(11510, class199.field3485.method1247((byte) 96));
                class35.field639.method231(11510, class132.field2342.method1247((byte) 100));
                class35.field639.method231(11510, class52.field862.method1247((byte) -125));
                class35.field639.method231(11510, class148.field2569.method1247((byte) -113));
                class35.field639.method231(11510, class184.field3246.method1247((byte) -104));
                class35.field639.method231(11510, class57.field925.method1247((byte) 107));
                class35.field639.method231(11510, class220.field3778.method1247((byte) -77));
                class35.field639.method231(11510, class123.field2159.method1247((byte) 69));
                class35.field639.method231(11510, class199.field3492.method1247((byte) -125));
                class35.field639.method231(11510, class107.field1769.method1247((byte) -69));
                class35.field639.method231(11510, class101.field1641.method1247((byte) -72));
                class35.field639.method231(11510, class204.field3550.method1247((byte) 65));
                class35.field639.method231(11510, class98.field1568.method1247((byte) -98));
                class35.field639.method231(11510, class59.field955.method1247((byte) -41));
                class35.field639.method231(11510, class86.field1410.method1247((byte) 61));
                class35.field639.method231(11510, class16.field293.method1247((byte) 110));
                class35.field639.method231(11510, class99.field1606.method1247((byte) 107));
                class35.field639.method231(11510, class235.field4106.method1247((byte) 71));
                class35.field639.method231(11510, class113.field1929.method1247((byte) 102));
                class35.field639.method231(11510, class283.field4991.method1247((byte) 92));
                class35.field639.method231(11510, class275.field4763.method1247((byte) 79));
                class35.field639.method231(11510, class267.field4691.method1247((byte) 120));
                class35.field639.method231(11510, class7.field136.method1247((byte) 77));
                class35.field639.method231(11510, class90.field1468.method1247((byte) 116));
                class35.field639.method231(11510, class8.field166.method1247((byte) 68));
                class35.field639.method231(11510, client.field2700.method1247((byte) -54));
                class35.field639.method207(class34.field627.field481, 0, (byte) 98, class34.field627.field475);
                class44.field727.method1526(class35.field639.field481, 126, 0, class35.field639.field475);
                class34.field627.method550(0, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class20.field367.method550(0, var5);
                class264.field4663 = 4;
            }
            if (class264.field4663 == 4) {
                if (class44.field727.method1525(5000) < 1) {
                    return;
                }
                int var7 = class44.field727.method1529(0);
                if (var7 == 21) {
                    class264.field4663 = 7;
                } else if (var7 == 29) {
                    class264.field4663 = 10;
                } else if (var7 == 1) {
                    class8.field148 = var7;
                    class264.field4663 = 5;
                    return;
                } else if (var7 == 2) {
                    class264.field4663 = 8;
                } else if (var7 == 15) {
                    class264.field4663 = 0;
                    class8.field148 = var7;
                    return;
                } else if (var7 == 23 && class148.field2574 < 1) {
                    class183.field3228 = 0;
                    class264.field4663 = 1;
                    class148.field2574++;
                    class44.field727.method1532(96);
                    class44.field727 = null;
                    return;
                } else {
                    class264.field4663 = 0;
                    class8.field148 = var7;
                    class44.field727.method1532(107);
                    class44.field727 = null;
                    return;
                }
            }
            if (class264.field4663 == 6) {
                class34.field627.field481 = 0;
                class34.field627.method551(17, true);
                class44.field727.method1526(class34.field627.field481, 1, 0, class34.field627.field475);
                class264.field4663 = 4;
            } else if (class264.field4663 == 7) {
                if (class44.field727.method1525(5000) >= 1) {
                    class80.field1316 = class44.field727.method1529(0) * 60 + 180;
                    class8.field148 = 21;
                    class264.field4663 = 0;
                    class44.field727.method1532(98);
                    class44.field727 = null;
                }
            } else if (class264.field4663 != 10) {
                if (class264.field4663 == 8) {
                    if (class44.field727.method1525(5000) < 14) {
                        return;
                    }
                    class44.field727.method1528(0, 14, (byte) 94, class20.field367.field475);
                    class20.field367.field481 = 0;
                    class129.field2238 = class20.field367.method189((byte) -103);
                    class147.field2559 = class20.field367.method189((byte) -103);
                    class280.field4950 = class20.field367.method189((byte) -103) == 1;
                    class44.field739 = class20.field367.method189((byte) -103) == 1;
                    class113.field1863 = class20.field367.method189((byte) -103) == 1;
                    class159.field2773 = class20.field367.method189((byte) -103) == 1;
                    class200.field3504 = class20.field367.method189((byte) -103) == 1;
                    class11.field240 = class20.field367.method193((byte) 77);
                    class215.field3711 = class20.field367.method189((byte) -103) == 1;
                    class29.field541 = class20.field367.method189((byte) -103) == 1;
                    class133.method923(class29.field541, -68);
                    class3.method50(21, class29.field541);
                    if (!class16.field295) {
                        if ((!class280.field4950 || class113.field1863) && !class215.field3711) {
                            try {
                                class29.field559.method1875(class118.field2117.field3473, true);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class8.field186.method1875(class118.field2117.field3473, true);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class85.field1394 = class20.field367.method553(108);
                    class23.field422 = class20.field367.method193((byte) 77);
                    class264.field4663 = 9;
                }
                if (class264.field4663 == 9 && class44.field727.method1525(5000) >= class23.field422) {
                    class20.field367.field481 = 0;
                    class44.field727.method1528(0, class23.field422, (byte) 123, class20.field367.field475);
                    class8.field148 = 2;
                    class264.field4663 = 0;
                    class232.method1562(0);
                    class264.field4655 = -1;
                    class14.method116(false, (byte) 43);
                    class85.field1394 = -1;
                }
            } else if (class44.field727.method1525(5000) >= 1) {
                class86.field1419 = class44.field727.method1529(0);
                class264.field4663 = 0;
                class8.field148 = 29;
                class44.field727.method1532(126);
                class44.field727 = null;
            }
        } catch (IOException var10) {
            if (class44.field727 != null) {
                class44.field727.method1532(93);
                class44.field727 = null;
            }
            if (class148.field2574 < 1) {
                class264.field4663 = 1;
                class183.field3228 = 0;
                class148.field2574++;
                if (class238.field4132 == class152.field2637) {
                    class152.field2637 = class74.field1218;
                } else {
                    class152.field2637 = class238.field4132;
                }
            } else {
                class264.field4663 = 0;
                class8.field148 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public static final void method450(int arg0) {
        field1090++;
        if (arg0 != 24851) {
            method447(123, 2, 20);
        }
        class154.field2674.method1481(false);
        class19.field349.method1481(false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V")
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -1) {
            field1086 = -128;
        }
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class162.method1151(arg2, arg0, -60, arg1, class91.field1484[var6]);
        }
        field1087++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static final void method452(byte arg0) {
        field1091++;
        class20.method156();
        int var1 = -35 % ((12 - arg0) / 58);
        for (int var2 = 0; var2 < 4; var2++) {
            class183.field3211[var2].method706(72);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method453(int arg0) {
        field1088 = null;
        if (arg0 <= 52) {
            field1088 = null;
        }
    }
}
