import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class118 extends class114 {

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Lkc;")
    public class74 field2115;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "Lw;")
    public static class82 field2112 = new class82(128);

    @OriginalMember(owner = "client!si", name = "P", descriptor = "Lia;")
    public static class257 field2119 = class28.method234(-50, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!si", name = "O", descriptor = "Lia;")
    private static class257 field2118 = class28.method234(-41, " is already on your ignore list)3");

    @OriginalMember(owner = "client!si", name = "N", descriptor = "Lia;")
    public static class257 field2117 = field2118;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "[[S")
    public static short[][] field2121 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "Lte;")
    public static class184 field2120;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method837(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2116++;
        try {
            if (class25.field487 == 0) {
                if (class151.field2595 != null) {
                    class151.field2595.method1421((byte) 103);
                    class151.field2595 = null;
                }
                class207.field3551 = null;
                class25.field487 = 1;
                class27.field529 = 0;
                class182.field3173 = false;
            }
            if (class25.field487 == 1) {
                if (class207.field3551 == null) {
                    class207.field3551 = class72.field1404.method718(class238.field4065, class151.field2608, (byte) -102);
                }
                if (class207.field3551.field3000 == 2) {
                    throw new IOException();
                }
                if (class207.field3551.field3000 == 1) {
                    class151.field2595 = new class211((Socket) class207.field3551.field3001, class72.field1404);
                    class207.field3551 = null;
                    class25.field487 = 2;
                }
            }
            if (class25.field487 == 2) {
                long var1 = class43.field854 = class17.field376.method1668(-24);
                class205.field3524.field2677 = 0;
                class205.field3524.method1023(13195, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class205.field3524.method1023(13195, var3);
                class151.field2595.method1419(2, 0, class205.field3524.field2638, 120);
                class40.field827.field2677 = 0;
                class25.field487 = 3;
            }
            if (class25.field487 == 3) {
                if (class182.field3175 != null) {
                    class182.field3175.method628(122);
                }
                if (class79.field1543 != null) {
                    class79.field1543.method628(126);
                }
                int var4 = class151.field2595.method1425(0);
                if (class182.field3175 != null) {
                    class182.field3175.method628(119);
                }
                if (class79.field1543 != null) {
                    class79.field1543.method628(119);
                }
                if (var4 != 0) {
                    class167.method1134(2, var4);
                    return;
                }
                class25.field487 = 4;
                class40.field827.field2677 = 0;
            }
            if (class25.field487 == 4) {
                if (class40.field827.field2677 < 8) {
                    int var5 = class151.field2595.method1423((byte) 85);
                    if (var5 > 8 - class40.field827.field2677) {
                        var5 = 8 - class40.field827.field2677;
                    }
                    if (var5 > 0) {
                        class151.field2595.method1424(class40.field827.field2638, class40.field827.field2677, var5, (byte) -91);
                        class40.field827.field2677 += var5;
                    }
                }
                if (class40.field827.field2677 == 8) {
                    class40.field827.field2677 = 0;
                    class78.field1518 = class40.field827.method1049(126);
                    class25.field487 = 5;
                }
            }
            if (class25.field487 == 5) {
                class205.field3524.field2677 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class78.field1518 >> 32), (int) class78.field1518 };
                class205.field3524.method1023(13195, 10);
                class205.field3524.method1066(-1687589720, var6[0]);
                class205.field3524.method1066(-1687589720, var6[1]);
                class205.field3524.method1066(-1687589720, var6[2]);
                class205.field3524.method1066(-1687589720, var6[3]);
                class205.field3524.method1044(!arg0, class17.field376.method1668(-86));
                class205.field3524.method1068(class17.field377, 0);
                class205.field3524.method1038((byte) 93, class108.field2014, class140.field2489);
                class178.field3081.field2677 = 0;
                if (class217.field3675 == 40) {
                    class178.field3081.method1023(13195, 18);
                } else {
                    class178.field3081.method1023(13195, 16);
                }
                class178.field3081.method1065(class205.field3524.field2677 + (class221.method1458((byte) 82, class194.field3290) + 149), 1210792072);
                class178.field3081.method1066(-1687589720, 503);
                class178.field3081.method1023(13195, 0);
                class178.field3081.method1065(class12.field241, 1210792072);
                class178.field3081.method1065(class166.field2897, 1210792072);
                class24.method214(85, class178.field3081);
                class178.field3081.method1068(class194.field3290, 0);
                class178.field3081.method1066(-1687589720, class225.field3779);
                class178.field3081.method1066(-1687589720, class19.method174(true));
                class95.field1789 = true;
                class178.field3081.method1066(-1687589720, class135.field2411.field3069);
                class178.field3081.method1066(-1687589720, class152.field2655.field3069);
                class178.field3081.method1066(-1687589720, class18.field394.field3069);
                class178.field3081.method1066(-1687589720, class46.field1060.field3069);
                class178.field3081.method1066(-1687589720, class76.field1490.field3069);
                class178.field3081.method1066(-1687589720, class128.field2279.field3069);
                class178.field3081.method1066(-1687589720, class259.field4502.field3069);
                class178.field3081.method1066(-1687589720, class175.field2991.field3069);
                class178.field3081.method1066(-1687589720, class42.field850.field3069);
                class178.field3081.method1066(-1687589720, class121.field2179.field3069);
                class178.field3081.method1066(-1687589720, class56.field1204.field3069);
                class178.field3081.method1066(-1687589720, class40.field831.field3069);
                class178.field3081.method1066(-1687589720, class27.field528.field3069);
                class178.field3081.method1066(-1687589720, class115.field2072.field3069);
                class178.field3081.method1066(-1687589720, class180.field3137.field3069);
                class178.field3081.method1066(-1687589720, class78.field1505.field3069);
                class178.field3081.method1066(-1687589720, class33.field635.field3069);
                class178.field3081.method1066(-1687589720, class167.field2905.field3069);
                class178.field3081.method1066(-1687589720, class238.field4062.field3069);
                class178.field3081.method1066(-1687589720, class169.field2914.field3069);
                class178.field3081.method1066(-1687589720, class54.field1159.field3069);
                class178.field3081.method1066(-1687589720, class52.field1133.field3069);
                class178.field3081.method1066(-1687589720, class34.field660.field3069);
                class178.field3081.method1066(-1687589720, class10.field195.field3069);
                class178.field3081.method1066(-1687589720, class45.field1040.field3069);
                class178.field3081.method1066(-1687589720, class25.field476.field3069);
                class178.field3081.method1066(-1687589720, class152.field2685.field3069);
                class178.field3081.method1032(class205.field3524.field2677, 0, class205.field3524.field2638, 1848138600);
                class151.field2595.method1419(class178.field3081.field2677, 0, class178.field3081.field2638, 122);
                class205.field3524.method915(2, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class40.field827.method915(2, var6);
                class25.field487 = 6;
            }
            if (class25.field487 == 6 && class151.field2595.method1423((byte) 108) > 0) {
                int var8 = class151.field2595.method1425(0);
                if (var8 == 21 && class217.field3675 == 20) {
                    class25.field487 = 7;
                } else if (var8 == 2) {
                    class25.field487 = 9;
                } else if (var8 == 15 && class217.field3675 == 40) {
                    class132.method921((byte) 120);
                    return;
                } else if (var8 == 23 && class82.field1599 < 1) {
                    class82.field1599++;
                    class25.field487 = 0;
                } else {
                    class167.method1134(2, var8);
                    return;
                }
            }
            if (class25.field487 == 7 && class151.field2595.method1423((byte) -71) > 0) {
                class64.field1303 = (class151.field2595.method1425(0) + 3) * 60;
                class42.field852 = 21;
                class25.field487 = 8;
            }
            if (class25.field487 == 8) {
                if (--class64.field1303 <= 0) {
                    class25.field487 = 0;
                }
                class27.field529 = 0;
            } else {
                if (class25.field487 == 9 && class151.field2595.method1423((byte) 93) >= 9) {
                    class59.field1244 = class151.field2595.method1425(0);
                    class174.field2976 = class151.field2595.method1425(0);
                    class87.field1673 = class151.field2595.method1425(0);
                    if (class87.field1673 == 1) {
                        try {
                            class13.field243.method1680(class72.field1404.field1855, 0);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class40.field828.method1680(class72.field1404.field1855, 0);
                        } catch (Throwable var10) {
                        }
                    }
                    class201.field3444 = class151.field2595.method1425(0);
                    class36.field720 = class151.field2595.method1425(0) == 1;
                    class173.field2958 = class151.field2595.method1425(0);
                    class173.field2958 <<= 0x8;
                    class173.field2958 += class151.field2595.method1425(0);
                    class74.field1436 = class151.field2595.method1425(0);
                    class151.field2595.method1424(class40.field827.field2638, 0, 1, (byte) -92);
                    class40.field827.field2677 = 0;
                    class115.field2066 = class40.field827.method914(false);
                    class151.field2595.method1424(class40.field827.field2638, 0, 2, (byte) -85);
                    class40.field827.field2677 = 0;
                    class209.field3582 = class40.field827.method1063(-17162);
                    class25.field487 = 10;
                }
                if (class25.field487 != 10) {
                    class27.field529++;
                    if (class27.field529 > 2000) {
                        if (class82.field1599 < 1) {
                            class82.field1599++;
                            class25.field487 = 0;
                            if (class211.field3612 == class151.field2608) {
                                class151.field2608 = class115.field2074;
                            } else {
                                class151.field2608 = class211.field3612;
                            }
                        } else {
                            class167.method1134(2, -3);
                        }
                    }
                } else if (class151.field2595.method1423((byte) 76) >= class209.field3582) {
                    class40.field827.field2677 = 0;
                    class151.field2595.method1424(class40.field827.field2638, 0, class209.field3582, (byte) -122);
                    class196.method1315(-87);
                    class237.field4059 = -1;
                    class103.method749((byte) -110, false);
                    class115.field2066 = -1;
                }
            }
        } catch (IOException var11) {
            if (class82.field1599 < 1) {
                if (class211.field3612 == class151.field2608) {
                    class151.field2608 = class115.field2074;
                } else {
                    class151.field2608 = class211.field3612;
                }
                class25.field487 = 0;
                class82.field1599++;
            } else {
                class167.method1134(2, -2);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public static final void method838(boolean arg0) {
        if (!arg0) {
            field2121 = null;
        }
        class225.field3775 = null;
        class173.field2955 = null;
        field2113++;
        class37.field735 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;)Lia;")
    public static final class257 method839(int arg0, String arg1) {
        field2114++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class257 var3 = new class257();
        var3.field4447 = 0;
        var3.field4407 = var2;
        if (arg0 <= 64) {
            field2120 = null;
        }
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4447++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lkc;)V")
    public class118(class74 arg0) {
        this.field2115 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
    public static void method840(int arg0) {
        field2118 = null;
        field2121 = null;
        field2120 = null;
        if (arg0 == -12491) {
            field2117 = null;
            field2119 = null;
            field2112 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V")
    public static final void method841(int arg0, int arg1) {
        if (class228.field3835 == null || class228.field3835.length < arg0) {
            class228.field3835 = new int[arg0];
        }
        field2111++;
        int var2 = 53 % ((-arg1 - 49) / 60);
    }
}
