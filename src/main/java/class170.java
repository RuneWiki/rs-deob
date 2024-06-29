import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class170 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2422 = -1;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method1083(int arg0) {
        field2420++;
        if (class110.field1584 == 0 || class110.field1584 == 5) {
            return;
        }
        try {
            if ((++class227.field3544) > 2000) {
                if (class272.field4332 != null) {
                    class272.field4332.method1211((byte) -37);
                    class272.field4332 = null;
                }
                if (class307.field4939 >= 1) {
                    class174.field2457 = -5;
                    class110.field1584 = 0;
                    return;
                }
                class227.field3544 = 0;
                if (class34.field519 == class240.field3748) {
                    class34.field519 = class249.field3888;
                } else {
                    class34.field519 = class240.field3748;
                }
                class307.field4939++;
                class110.field1584 = 1;
            }
            if (class110.field1584 == 1) {
                class35.field536 = class45.field667.method318(class26.field409, 0, class34.field519);
                class110.field1584 = 2;
            }
            if (class110.field1584 == 2) {
                if (class35.field536.field4570 == 2) {
                    throw new IOException();
                }
                if (class35.field536.field4570 != 1) {
                    return;
                }
                class272.field4332 = new class191((Socket) class35.field536.field4567, class45.field667);
                class35.field536 = null;
                long var1 = class131.field1832 = class92.method594(arg0 - 15242, class171.field2435);
                class231.field3614.field3280 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class231.field3614.method1363(14, 120);
                class231.field3614.method1363(var3, -17);
                class272.field4332.method1202((byte) -92, 0, 2, class231.field3614.field3287);
                if (class156.field2158 != null) {
                    class156.field2158.method886(500000);
                }
                if (class110.field1585 != null) {
                    class110.field1585.method886(500000);
                }
                int var4 = class272.field4332.method1206(-6);
                if (class156.field2158 != null) {
                    class156.field2158.method886(500000);
                }
                if (class110.field1585 != null) {
                    class110.field1585.method886(500000);
                }
                if (var4 != 0) {
                    class174.field2457 = var4;
                    class110.field1584 = 0;
                    class272.field4332.method1211((byte) -35);
                    class272.field4332 = null;
                    return;
                }
                class110.field1584 = 3;
            }
            if (class110.field1584 == 3) {
                if (class272.field4332.method1213((byte) -124) < 8) {
                    return;
                }
                class272.field4332.method1212(arg0 + 8, 0, class131.field1830.field3287, 8);
                class131.field1830.field3280 = 0;
                class59.field821 = class131.field1830.method1396(-2);
                class231.field3614.field3280 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class59.field821 >> 32), (int) class59.field821 };
                class231.field3614.method1363(10, -46);
                class231.field3614.method1398(true, var5[0]);
                class231.field3614.method1398(true, var5[1]);
                class231.field3614.method1398(true, var5[2]);
                class231.field3614.method1398(true, var5[3]);
                class231.field3614.method1386(class92.method594(-15250, class171.field2435), true);
                class231.field3614.method1384(class10.field175, arg0 ^ 0x237DD230);
                class231.field3614.method1397(class258.field4163, 106, class136.field1867);
                class35.field534.field3280 = 0;
                if (class142.field1961 == 40) {
                    class35.field534.method1363(18, arg0 + 116);
                } else {
                    class35.field534.method1363(16, 125);
                }
                class35.field534.method1385(class231.field3614.field3280 + (class231.method1518(class258.field4165, 68) + 163), true);
                class35.field534.method1398(true, 551);
                class35.field534.method1363(class308.field4948, 96);
                class35.field534.method1363(class200.field3042 ? 1 : 0, -58);
                class35.field534.method1363(0, arg0 - 113);
                class35.field534.method1363(class246.method1611(100), arg0 + 110);
                class35.field534.method1385(class218.field3386, true);
                class35.field534.method1385(class174.field2460, true);
                class35.field534.method1363(class179.field2716, 109);
                class234.method1539(arg0 - 107, class35.field534);
                class35.field534.method1384(class258.field4165, -595448376);
                class35.field534.method1398(true, class148.field2026);
                class35.field534.method1398(true, class81.method514((byte) 112));
                class25.field402 = true;
                class35.field534.method1385(class305.field4880, true);
                class35.field534.method1398(true, class142.field1962.method2053(26007));
                class35.field534.method1398(true, class186.field2822.method2053(arg0 ^ 0xFFFF9A6F));
                class35.field534.method1398(true, class167.field2382.method2053(26007));
                class35.field534.method1398(true, class177.field2499.method2053(26007));
                class35.field534.method1398(true, class68.field958.method2053(26007));
                class35.field534.method1398(true, class307.field4932.method2053(26007));
                class35.field534.method1398(true, class240.field3737.method2053(26007));
                class35.field534.method1398(true, class29.field449.method2053(26007));
                class35.field534.method1398(true, class311.field5009.method2053(26007));
                class35.field534.method1398(true, class128.field1787.method2053(26007));
                class35.field534.method1398(true, class160.field2238.method2053(26007));
                class35.field534.method1398(true, class242.field3807.method2053(26007));
                class35.field534.method1398(true, class241.field3783.method2053(26007));
                class35.field534.method1398(true, class258.field4175.method2053(26007));
                class35.field534.method1398(true, class7.field74.method2053(26007));
                class35.field534.method1398(true, class171.field2445.method2053(26007));
                class35.field534.method1398(true, class110.field1573.method2053(26007));
                class35.field534.method1398(true, class188.field2855.method2053(arg0 + 26015));
                class35.field534.method1398(true, class254.field3965.method2053(26007));
                class35.field534.method1398(true, class179.field2723.method2053(26007));
                class35.field534.method1398(true, class312.field5022.method2053(arg0 + 26015));
                class35.field534.method1398(true, class36.field546.method2053(26007));
                class35.field534.method1398(true, class249.field3892.method2053(26007));
                class35.field534.method1398(true, class185.field2805.method2053(arg0 + 26015));
                class35.field534.method1398(true, class142.field1947.method2053(arg0 + 26015));
                class35.field534.method1398(true, class35.field532.method2053(26007));
                class35.field534.method1398(true, class278.field4425.method2053(26007));
                class35.field534.method1398(true, class139.field1924.method2053(arg0 + 26015));
                class35.field534.method1398(true, class265.field4273.method2053(26007));
                class35.field534.method1365(class231.field3614.field3280, 0, class231.field3614.field3287, (byte) -62);
                class272.field4332.method1202((byte) -71, 0, class35.field534.field3280, class35.field534.field3287);
                class231.field3614.method811(var5, 128);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class131.field1830.method811(var5, arg0 + 136);
                class110.field1584 = 4;
            }
            if (class110.field1584 == 4) {
                if (class272.field4332.method1213((byte) -114) < 1) {
                    return;
                }
                int var7 = class272.field4332.method1206(122);
                if (var7 == 21) {
                    class110.field1584 = 7;
                } else if (var7 == 29) {
                    class110.field1584 = 10;
                } else if (var7 == 1) {
                    class110.field1584 = 5;
                    class174.field2457 = var7;
                    return;
                } else if (var7 == 2) {
                    class110.field1584 = 8;
                } else if (var7 == 15) {
                    class110.field1584 = 0;
                    class174.field2457 = var7;
                    return;
                } else if (var7 == 23 && class307.field4939 < 1) {
                    class227.field3544 = 0;
                    class110.field1584 = 1;
                    class307.field4939++;
                    class272.field4332.method1211((byte) 125);
                    class272.field4332 = null;
                    return;
                } else {
                    class174.field2457 = var7;
                    class110.field1584 = 0;
                    class272.field4332.method1211((byte) 123);
                    class272.field4332 = null;
                    return;
                }
            }
            if (class110.field1584 == 6) {
                class231.field3614.field3280 = 0;
                class231.field3614.method809(17, 0);
                class272.field4332.method1202((byte) -97, 0, class231.field3614.field3280, class231.field3614.field3287);
                class110.field1584 = 4;
            } else if (~class110.field1584 == arg0) {
                if (class272.field4332.method1213((byte) 103) >= 1) {
                    class80.field1105 = class272.field4332.method1206(arg0 ^ 0xFFFFFF83) * 60 + 180;
                    class174.field2457 = 21;
                    class110.field1584 = 0;
                    class272.field4332.method1211((byte) -29);
                    class272.field4332 = null;
                }
            } else if (class110.field1584 != 10) {
                if (class110.field1584 == 8) {
                    if (class272.field4332.method1213((byte) -92) < 14) {
                        return;
                    }
                    class272.field4332.method1212(0, 0, class131.field1830.field3287, 14);
                    class131.field1830.field3280 = 0;
                    class245.field3846 = class131.field1830.method1374((byte) -60);
                    class205.field3065 = class131.field1830.method1374((byte) -60);
                    class225.field3527 = class131.field1830.method1374((byte) -60) == 1;
                    class103.field1477 = class131.field1830.method1374((byte) -60) == 1;
                    class134.field1845 = class131.field1830.method1374((byte) -60) == 1;
                    class164.field2322 = class131.field1830.method1374((byte) -60) == 1;
                    class103.field1480 = class131.field1830.method1374((byte) -60) == 1;
                    class305.field4917 = class131.field1830.method1379(-119);
                    class134.field1846 = class131.field1830.method1374((byte) -60) == 1;
                    class252.field3939 = class131.field1830.method1374((byte) -60) == 1;
                    class302.method2020(arg0 + 117, class252.field3939);
                    class122.method789(-26132, class252.field3939);
                    class106.method676(class252.field3939, (byte) 76);
                    if (!class200.field3042) {
                        if ((!class225.field3527 || class134.field1845) && !class134.field1846) {
                            try {
                                class172.method1097("unzap", true, class45.field667.field744);
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class172.method1097("zap", true, class45.field667.field744);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    try {
                        class172.method1097("loggedin", true, class45.field667.field744);
                    } catch (Throwable var8) {
                    }
                    class108.field1546 = class131.field1830.method806(arg0 ^ 0xFFFF93E0);
                    class114.field1632 = class131.field1830.method1379(-106);
                    class110.field1584 = 9;
                }
                if (class110.field1584 == 9 && class272.field4332.method1213((byte) 77) >= class114.field1632) {
                    class131.field1830.field3280 = 0;
                    class272.field4332.method1212(0, 0, class131.field1830.field3287, class114.field1632);
                    class110.field1584 = 0;
                    class174.field2457 = 2;
                    class198.method1248(-1645);
                    class200.field3045 = -1;
                    class71.method470(false, -124);
                    class108.field1546 = -1;
                }
            } else if (class272.field4332.method1213((byte) -91) >= 1) {
                class138.field1909 = class272.field4332.method1206(arg0 ^ 0xFFFFFF84);
                class174.field2457 = 29;
                class110.field1584 = 0;
                class272.field4332.method1211((byte) -39);
                class272.field4332 = null;
            }
        } catch (IOException var11) {
            if (class272.field4332 != null) {
                class272.field4332.method1211((byte) -81);
                class272.field4332 = null;
            }
            if (class307.field4939 >= 1) {
                class174.field2457 = -4;
                class110.field1584 = 0;
            } else {
                if (class34.field519 == class240.field3748) {
                    class34.field519 = class249.field3888;
                } else {
                    class34.field519 = class240.field3748;
                }
                class307.field4939++;
                class110.field1584 = 1;
                class227.field3544 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method1084(int arg0, int arg1) {
        field2424++;
        if (arg0 != -24680) {
            field2419 = 42;
        }
        class192.field2925.method943(arg1, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIII)I")
    public static final int method1085(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field2423++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else if (arg0 == 114) {
            return arg1;
        } else {
            return -70;
        }
    }
}
