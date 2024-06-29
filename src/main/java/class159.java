import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class159 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[Z")
    public static boolean[] field2560 = new boolean[100];

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[[I")
    public static int[][] field2566 = new int[104][104];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lmh;")
    private static class62 field2562 = class201.method1405(true, "glow3:");

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lmh;")
    public static class62 field2558 = field2562;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lmh;")
    public static class62 field2565 = field2562;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Ldd;")
    public static class75 field2564;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[Lwj;")
    public static class135[] field2559;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1163(int arg0) {
        field2556++;
        int var1 = 84 % ((49 - arg0) / 48);
        if (class296.field5052 == 0 || class296.field5052 == 5) {
            return;
        }
        try {
            if (++class247.field4193 > 2000) {
                if (class200.field3381 != null) {
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                }
                if (class80.field1337 >= 1) {
                    class114.field1922 = -5;
                    class296.field5052 = 0;
                    return;
                }
                class296.field5052 = 1;
                class247.field4193 = 0;
                class80.field1337++;
                if (class78.field1315 == class20.field202) {
                    class78.field1315 = class243.field4136;
                } else {
                    class78.field1315 = class20.field202;
                }
            }
            if (class296.field5052 == 1) {
                class124.field2049 = class193.field3246.method1947(false, class78.field1315, class36.field474);
                class296.field5052 = 2;
            }
            if (class296.field5052 == 2) {
                if (class124.field2049.field2322 == 2) {
                    throw new IOException();
                }
                if (class124.field2049.field2322 != 1) {
                    return;
                }
                class200.field3381 = new class165((Socket) class124.field2049.field2323, class193.field3246);
                class124.field2049 = null;
                long var2 = class123.field2043 = class275.field4689.method451(109);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class170.field2772.field1476 = 0;
                class170.field2772.method717(1, 14);
                class170.field2772.method717(1, var4);
                class200.field3381.method1187(0, 2, -98, class170.field2772.field1495);
                if (class221.field3800 != null) {
                    class221.field3800.method852(true);
                }
                if (class158.field2537 != null) {
                    class158.field2537.method852(true);
                }
                int var5 = class200.field3381.method1191((byte) 111);
                if (class221.field3800 != null) {
                    class221.field3800.method852(true);
                }
                if (class158.field2537 != null) {
                    class158.field2537.method852(true);
                }
                if (var5 != 0) {
                    class114.field1922 = var5;
                    class296.field5052 = 0;
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                    return;
                }
                class296.field5052 = 3;
            }
            if (class296.field5052 == 3) {
                if (class200.field3381.method1185((byte) 47) < 8) {
                    return;
                }
                class200.field3381.method1192((byte) 127, 0, 8, class75.field1223.field1495);
                int[] var6 = new int[4];
                class75.field1223.field1476 = 0;
                class77.field1277 = class75.field1223.method690(74);
                var6[2] = (int) (class77.field1277 >> 32);
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                class170.field2772.field1476 = 0;
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                var6[3] = (int) class77.field1277;
                class170.field2772.method717(1, 10);
                class170.field2772.method712(var6[0], 126);
                class170.field2772.method712(var6[1], -111);
                class170.field2772.method712(var6[2], 125);
                class170.field2772.method712(var6[3], -97);
                class170.field2772.method694(class275.field4689.method451(34), (byte) -34);
                class170.field2772.method710(class275.field4698, false);
                class170.field2772.method697(class29.field402, (byte) 115, class218.field3768);
                class164.field2652.field1476 = 0;
                if (class118.field1983 == 40) {
                    class164.field2652.method717(1, 18);
                } else {
                    class164.field2652.method717(1, 16);
                }
                class164.field2652.method738((byte) -126, 153 - (-class170.field2772.field1476 - class152.method1090(21850, class181.field2879)));
                class164.field2652.method712(513, -19);
                class164.field2652.method717(1, class45.field679);
                class164.field2652.method717(1, 1);
                class164.field2652.method717(1, client.method2050((byte) 57));
                class164.field2652.method738((byte) -72, class306.field5258);
                class164.field2652.method738((byte) 92, class60.field878);
                class190.method1327(class164.field2652, 52);
                class164.field2652.method710(class181.field2879, false);
                class164.field2652.method712(class291.field4950, -27);
                class164.field2652.method712(class135.method1022((byte) -39), 123);
                class50.field730 = true;
                class164.field2652.method738((byte) 58, class221.field3803);
                class164.field2652.method712(class112.field1852.field294, -45);
                class164.field2652.method712(class200.field3382.field294, 122);
                class164.field2652.method712(class300.field5148.field294, -67);
                class164.field2652.method712(class37.field500.field294, -35);
                class164.field2652.method712(class272.field4629.field294, -116);
                class164.field2652.method712(class113.field1874.field294, 124);
                class164.field2652.method712(class163.field2649.field294, 13);
                class164.field2652.method712(class218.field3753.field294, -5);
                class164.field2652.method712(class53.field781.field294, -127);
                class164.field2652.method712(class194.field3277.field294, -111);
                class164.field2652.method712(class32.field440.field294, 116);
                class164.field2652.method712(class14.field115.field294, -71);
                class164.field2652.method712(class35.field471.field294, 127);
                class164.field2652.method712(class281.field4800.field294, 118);
                class164.field2652.method712(class201.field3416.field294, 116);
                class164.field2652.method712(class290.field4931.field294, 114);
                class164.field2652.method712(class194.field3260.field294, 126);
                class164.field2652.method712(class105.field1722.field294, -69);
                class164.field2652.method712(class35.field470.field294, -121);
                class164.field2652.method712(class198.field3350.field294, -40);
                class164.field2652.method712(class298.field5084.field294, 113);
                class164.field2652.method712(class98.field1622.field294, 112);
                class164.field2652.method712(class196.field3319.field294, 127);
                class164.field2652.method712(class275.field4718.field294, 118);
                class164.field2652.method712(class150.field2364.field294, 22);
                class164.field2652.method712(class173.field2799.field294, -59);
                class164.field2652.method712(class203.field3429.field294, 115);
                class164.field2652.method726(0, class170.field2772.field1476, (byte) -3, class170.field2772.field1495);
                class200.field3381.method1187(0, class164.field2652.field1476, -114, class164.field2652.field1495);
                class170.field2772.method1688((byte) -62, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class75.field1223.method1688((byte) -52, var6);
                class296.field5052 = 4;
            }
            if (class296.field5052 == 4) {
                if (class200.field3381.method1185((byte) 53) < 1) {
                    return;
                }
                int var8 = class200.field3381.method1191((byte) 116);
                if (var8 == 21) {
                    class296.field5052 = 7;
                } else if (var8 == 29) {
                    class296.field5052 = 10;
                } else if (var8 == 1) {
                    class296.field5052 = 5;
                    class114.field1922 = var8;
                    return;
                } else if (var8 == 2) {
                    class296.field5052 = 8;
                } else if (var8 == 15) {
                    class114.field1922 = var8;
                    class296.field5052 = 0;
                    return;
                } else if (var8 == 23 && class80.field1337 < 1) {
                    class80.field1337++;
                    class247.field4193 = 0;
                    class296.field5052 = 1;
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                    return;
                } else {
                    class296.field5052 = 0;
                    class114.field1922 = var8;
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                    return;
                }
            }
            if (class296.field5052 == 6) {
                class170.field2772.field1476 = 0;
                class170.field2772.method1693(17, false);
                class200.field3381.method1187(0, class170.field2772.field1476, -100, class170.field2772.field1495);
                class296.field5052 = 4;
                return;
            }
            if (class296.field5052 == 7) {
                if (class200.field3381.method1185((byte) 36) >= 1) {
                    class309.field5295 = class200.field3381.method1191((byte) 111) * 60 + 180;
                    class114.field1922 = 21;
                    class296.field5052 = 0;
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                    return;
                }
                return;
            }
            if (class296.field5052 == 10) {
                if (class200.field3381.method1185((byte) 48) < 1) {
                    return;
                }
                class90.field1425 = class200.field3381.method1191((byte) 118);
                class296.field5052 = 0;
                class114.field1922 = 29;
                class200.field3381.method1193(-1);
                class200.field3381 = null;
                return;
            }
            if (class296.field5052 == 8) {
                if (class200.field3381.method1185((byte) 64) < 11) {
                    return;
                }
                class200.field3381.method1192((byte) 126, 0, 11, class75.field1223.field1495);
                class75.field1223.field1476 = 0;
                class293.field4985 = class75.field1223.method702(-1);
                class70.field1076 = class75.field1223.method702(-1);
                class304.field5236 = class75.field1223.method702(-1);
                if (class304.field5236 == 1) {
                    try {
                        class195.field3295.method406((byte) 61, class193.field3246.field4878);
                    } catch (Throwable var12) {
                    }
                } else {
                    try {
                        class244.field4157.method406((byte) 61, class193.field3246.field4878);
                    } catch (Throwable var13) {
                    }
                }
                class14.field111 = class75.field1223.method702(-1);
                class5.field62 = class75.field1223.method702(-1) == 1;
                class156.field2523 = class75.field1223.method721(24);
                class166.field2703 = class75.field1223.method702(-1);
                class237.field4063 = class75.field1223.method1690(11598);
                class60.field874 = class75.field1223.method721(55);
                class296.field5052 = 9;
            }
            if (class296.field5052 == 9) {
                if (class200.field3381.method1185((byte) 112) < class60.field874) {
                    return;
                }
                class75.field1223.field1476 = 0;
                class200.field3381.method1192((byte) 126, 0, class60.field874, class75.field1223.field1495);
                class114.field1922 = 2;
                class296.field5052 = 0;
                class53.method343(32054);
                class2.field30 = -1;
                class103.method818(false, false);
                class237.field4063 = -1;
                return;
            }
        } catch (IOException var14) {
            if (class200.field3381 != null) {
                class200.field3381.method1193(-1);
                class200.field3381 = null;
            }
            if (class80.field1337 < 1) {
                class296.field5052 = 1;
                if (class78.field1315 == class20.field202) {
                    class78.field1315 = class243.field4136;
                } else {
                    class78.field1315 = class20.field202;
                }
                class247.field4193 = 0;
                class80.field1337++;
            } else {
                class296.field5052 = 0;
                class114.field1922 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 397)
    public static void method1164(int arg0) {
        field2560 = null;
        field2558 = null;
        field2559 = null;
        field2565 = null;
        field2562 = null;
        field2564 = null;
        if (arg0 != 50) {
            method1164(46);
        }
        field2566 = (int[][]) null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V", line = 413)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3) {
        field2563++;
        class62 var4 = class254.method1772(new class62[] { class46.field693, class42.method284(arg2, -125), class186.field2975, class42.method284(arg3 >> 6, -125), class186.field2975, class42.method284(arg1 >> 6, -122), class186.field2975, class42.method284(arg3 & 0x3F, -118), class186.field2975, class42.method284(arg1 & 0x3F, -126) }, 0);
        var4.method426((byte) 107);
        if (arg0 != 40) {
            method1165(-15, -21, -43, 106);
        }
        class226.method1599(var4, false);
    }
}
