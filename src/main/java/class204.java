import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class204 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3666 = 1;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lhj;")
    private static class69 field3677 = class181.method1318("Connected to update server", (byte) -114);

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
    public static int[] field3676 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lhj;")
    public static class69 field3673 = class181.method1318("3D)2Softwarebibliothek gestartet)3", (byte) -110);

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lhj;")
    public static class69 field3680 = field3677;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "J")
    public long field3672;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Led;")
    public class177 field3664;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Led;")
    public class177 field3671;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Led;")
    public class177 field3679;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)I")
    public static final int method1476(int arg0, boolean arg1, int arg2) {
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        field3667++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (arg1) {
            method1477(-69);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method1477(int arg0) {
        field3670++;
        if (class165.field3034 == 0 || class165.field3034 == 5) {
            return;
        }
        try {
            if ((++class112.field2145) > 2000) {
                if (class135.field2532 != null) {
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                }
                if (class132.field2450 >= 1) {
                    class165.field3034 = 0;
                    class265.field4718 = -5;
                    return;
                }
                class112.field2145 = 0;
                if (class66.field1281 == class167.field3085) {
                    class167.field3085 = class202.field3645;
                } else {
                    class167.field3085 = class66.field1281;
                }
                class165.field3034 = 1;
                class132.field2450++;
            }
            if (~class165.field3034 == arg0) {
                class11.field109 = class36.field508.method231(-23790, class167.field3085, class36.field507);
                class165.field3034 = 2;
            }
            if (class165.field3034 == 2) {
                if (class11.field109.field1663 == 2) {
                    throw new IOException();
                }
                if (class11.field109.field1663 != 1) {
                    return;
                }
                class135.field2532 = new class173((Socket) class11.field109.field1666, class36.field508);
                class11.field109 = null;
                long var1 = class116.field2213 = class209.field3809.method473((byte) 56);
                class48.field692.field2379 = 0;
                class48.field692.method933(14, -20946);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class48.field692.method933(var3, arg0 - 20944);
                class135.field2532.method1267(class48.field692.field2385, (byte) 6, 0, 2);
                if (class29.field421 != null) {
                    class29.field421.method999((byte) 121);
                }
                if (class194.field3551 != null) {
                    class194.field3551.method999((byte) 126);
                }
                int var4 = class135.field2532.method1263(2);
                if (class29.field421 != null) {
                    class29.field421.method999((byte) 127);
                }
                if (class194.field3551 != null) {
                    class194.field3551.method999((byte) 121);
                }
                if (var4 != 0) {
                    class165.field3034 = 0;
                    class265.field4718 = var4;
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                    return;
                }
                class165.field3034 = 3;
            }
            if (class165.field3034 == 3) {
                if (class135.field2532.method1269((byte) -85) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class135.field2532.method1265(class199.field3595.field2385, arg0 ^ 0x5D, 0, 8);
                class199.field3595.field2379 = 0;
                class221.field3971 = class199.field3595.method909(false);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class221.field3971;
                var5[2] = (int) (class221.field3971 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class48.field692.field2379 = 0;
                class48.field692.method933(10, arg0 - 20944);
                class48.field692.method908(false, var5[0]);
                class48.field692.method908(false, var5[1]);
                class48.field692.method908(false, var5[2]);
                class48.field692.method908(false, var5[3]);
                class48.field692.method918(class209.field3809.method473((byte) 71), 18820);
                class48.field692.method927(class209.field3805, (byte) 126);
                class48.field692.method913(arg0 ^ 0xFFFFFFFE, class241.field4422, class266.field4724);
                class112.field2161.field2379 = 0;
                if (class268.field4760 == 40) {
                    class112.field2161.method933(18, -20946);
                } else {
                    class112.field2161.method933(16, arg0 ^ 0x51D0);
                }
                class112.field2161.method943((byte) 127, class48.field692.field2379 + class110.method825(-121, class152.field2835) + 153);
                class112.field2161.method908(false, 512);
                class112.field2161.method933(class16.field215, -20946);
                class112.field2161.method933(0, -20946);
                class112.field2161.method933(class109.method819((byte) -92), -20946);
                class112.field2161.method943((byte) 127, class66.field1278);
                class112.field2161.method943((byte) 127, class20.field287);
                class162.method1211(class112.field2161, (byte) -126);
                class112.field2161.method927(class152.field2835, (byte) 126);
                class112.field2161.method908(false, class114.field2181);
                class112.field2161.method908(false, class43.method245(-126));
                class152.field2833 = true;
                class112.field2161.method943((byte) 127, class228.field4169);
                class112.field2161.method908(false, class38.field521.field1606);
                class112.field2161.method908(false, class55.field989.field1606);
                class112.field2161.method908(false, class273.field4826.field1606);
                class112.field2161.method908(false, class106.field1994.field1606);
                class112.field2161.method908(false, class69.field1339.field1606);
                class112.field2161.method908(false, class173.field3171.field1606);
                class112.field2161.method908(false, class91.field1723.field1606);
                class112.field2161.method908(false, class120.field2268.field1606);
                class112.field2161.method908(false, class98.field1859.field1606);
                class112.field2161.method908(false, class255.field4589.field1606);
                class112.field2161.method908(false, class194.field3544.field1606);
                class112.field2161.method908(false, class212.field3845.field1606);
                class112.field2161.method908(false, class147.field2723.field1606);
                class112.field2161.method908(false, class146.field2696.field1606);
                class112.field2161.method908(false, class90.field1711.field1606);
                class112.field2161.method908(false, class51.field897.field1606);
                class112.field2161.method908(false, class170.field3106.field1606);
                class112.field2161.method908(false, class168.field3086.field1606);
                class112.field2161.method908(false, class41.field586.field1606);
                class112.field2161.method908(false, class123.field2286.field1606);
                class112.field2161.method908(false, class101.field1897.field1606);
                class112.field2161.method908(false, class141.field2643.field1606);
                class112.field2161.method908(false, class113.field2178.field1606);
                class112.field2161.method908(false, class110.field2095.field1606);
                class112.field2161.method908(false, class63.field1230.field1606);
                class112.field2161.method908(false, class78.field1499.field1606);
                class112.field2161.method908(false, class141.field2636.field1606);
                class112.field2161.method921((byte) -17, class48.field692.field2379, class48.field692.field2385, 0);
                class135.field2532.method1267(class112.field2161.field2385, (byte) 6, 0, class112.field2161.field2379);
                class48.field692.method298((byte) 117, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class199.field3595.method298((byte) 117, var5);
                class165.field3034 = 4;
            }
            if (class165.field3034 == 4) {
                if (class135.field2532.method1269((byte) -85) < 1) {
                    return;
                }
                int var7 = class135.field2532.method1263(2);
                if (var7 == 21) {
                    class165.field3034 = 7;
                } else if (var7 == 29) {
                    class165.field3034 = 10;
                } else if (var7 == 1) {
                    class265.field4718 = var7;
                    class165.field3034 = 5;
                    return;
                } else if (var7 == 2) {
                    class165.field3034 = 8;
                } else if (var7 == 15) {
                    class165.field3034 = 0;
                    class265.field4718 = var7;
                    return;
                } else if (var7 == 23 && class132.field2450 < 1) {
                    class165.field3034 = 1;
                    class112.field2145 = 0;
                    class132.field2450++;
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                    return;
                } else {
                    class265.field4718 = var7;
                    class165.field3034 = 0;
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                    return;
                }
            }
            if (class165.field3034 == 6) {
                class48.field692.field2379 = 0;
                class48.field692.method301(17, -104);
                class135.field2532.method1267(class48.field692.field2385, (byte) 6, 0, class48.field692.field2379);
                class165.field3034 = 4;
            } else if (class165.field3034 == 7) {
                if (class135.field2532.method1269((byte) -85) >= 1) {
                    class181.field3299 = class135.field2532.method1263(arg0 ^ 0xFFFFFFFC) * 60 + 180;
                    class165.field3034 = 0;
                    class265.field4718 = 21;
                    class135.field2532.method1270((byte) 41);
                    class135.field2532 = null;
                }
            } else if (class165.field3034 != 10) {
                if (class165.field3034 == 8) {
                    if (class135.field2532.method1269((byte) -85) < 11) {
                        return;
                    }
                    class135.field2532.method1265(class199.field3595.field2385, arg0 ^ 0x62, 0, 11);
                    class199.field3595.field2379 = 0;
                    class245.field4487 = class199.field3595.method937(false);
                    class131.field2432 = class199.field3595.method937(false);
                    class108.field2060 = class199.field3595.method937(false);
                    if (class108.field2060 == 1) {
                        try {
                            class175.field3183.method480(class36.field508.field601, 22);
                        } catch (Throwable var8) {
                        }
                    } else {
                        try {
                            class98.field1864.method480(class36.field508.field601, 73);
                        } catch (Throwable var9) {
                        }
                    }
                    class182.field3313 = class199.field3595.method937(false);
                    class138.field2575 = class199.field3595.method937(false) == 1;
                    class13.field191 = class199.field3595.method912(-95);
                    class43.field613 = class199.field3595.method937(false);
                    class13.field190 = class199.field3595.method299(-927408541);
                    class33.field451 = class199.field3595.method912(-101);
                    class165.field3034 = 9;
                }
                if (class165.field3034 == 9 && class135.field2532.method1269((byte) -85) >= class33.field451) {
                    class199.field3595.field2379 = 0;
                    class135.field2532.method1265(class199.field3595.field2385, -64, 0, class33.field451);
                    class265.field4718 = 2;
                    class165.field3034 = 0;
                    class47.method267(106);
                    class201.field3638 = -1;
                    class223.method1587((byte) -102, false);
                    class13.field190 = -1;
                }
            } else if (class135.field2532.method1269((byte) -85) >= 1) {
                class120.field2266 = class135.field2532.method1263(arg0 ^ 0xFFFFFFFC);
                class165.field3034 = 0;
                class265.field4718 = 29;
                class135.field2532.method1270((byte) 41);
                class135.field2532 = null;
            }
        } catch (IOException var10) {
            if (class135.field2532 != null) {
                class135.field2532.method1270((byte) 41);
                class135.field2532 = null;
            }
            if (class132.field2450 >= 1) {
                class165.field3034 = 0;
                class265.field4718 = -4;
            } else {
                class165.field3034 = 1;
                class132.field2450++;
                class112.field2145 = 0;
                if (class66.field1281 == class167.field3085) {
                    class167.field3085 = class202.field3645;
                } else {
                    class167.field3085 = class66.field1281;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ltk;Z)V")
    public static final void method1478(class50 arg0, boolean arg1) {
        field3665++;
        if (!arg1 && class159.field2952 == arg0.field882) {
            class40.field576[arg0.field794] = true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1479(byte arg0) {
        field3680 = null;
        int var1 = -52 / ((arg0 + 78) / 43);
        field3676 = null;
        field3673 = null;
        field3677 = null;
    }
}
