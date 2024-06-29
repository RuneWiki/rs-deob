import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 extends class67 {

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "Ldd;")
    public static class26 field1362 = new class26(64);

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field1371 = 0;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "Z")
    public static boolean field1370 = false;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Lrd;")
    private static class114 field1372 = class84.method656("flash1:", (byte) 124);

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lrd;")
    public static class114 field1375 = class84.method656("@or2@", (byte) 127);

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Lrd;")
    public static class114 field1367 = field1372;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "Lrd;")
    private static class114 field1369 = class84.method656(" ", (byte) 118);

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Lrd;")
    public static class114 field1374 = field1369;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lrd;")
    private static class114 field1376 = class84.method656("Try again in 60 secs)3)3)3", (byte) 126);

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "Lrd;")
    public static class114 field1373 = field1376;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Lbe;")
    public static class13 field1368 = new class13();

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Lrd;")
    public static class114 field1377 = class84.method656("chatback", (byte) 127);

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Lrd;")
    private static class114 field1378 = class84.method656("Choose Option", (byte) 119);

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "Lrd;")
    private static class114 field1383 = class84.method656("cyan:", (byte) 117);

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lrd;")
    public static class114 field1380 = field1378;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "Lrd;")
    public static class114 field1382 = field1383;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "Lrd;")
    public static class114 field1379 = class84.method656("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", (byte) 117);

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "Ljb;")
    public class64 field1359;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "Ljb;")
    public class64 field1364;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    public static int[] field1360;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "[I")
    public static int[] field1381;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method518(int arg0) {
        field1375 = null;
        field1360 = null;
        field1376 = null;
        field1377 = null;
        field1367 = null;
        field1372 = null;
        field1374 = null;
        if (arg0 != 32) {
            field1380 = null;
        }
        field1378 = null;
        field1380 = null;
        field1362 = null;
        field1381 = null;
        field1379 = null;
        field1383 = null;
        field1369 = null;
        field1368 = null;
        field1373 = null;
        field1382 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public final void method519(byte arg0) {
        field1363++;
        if (arg0 <= -69 && this.field1364 != null) {
            this.field1364.field1359 = this.field1359;
            this.field1359.field1364 = this.field1364;
            this.field1359 = null;
            this.field1364 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILpb;II)Loa;")
    public static final class93 method520(int arg0, class100 arg1, int arg2, int arg3) {
        field1358++;
        if (class122.method955(arg2, (byte) -119, arg3, arg1)) {
            return arg0 == 64 ? class99.method744(-19457) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZ)Lhe;")
    public static final class54 method521(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        long var6 = ((long) arg4 << 40) + ((long) arg2 << 38) + (long) arg0 + ((long) arg1 << 16);
        field1366++;
        if (!arg5) {
            class54 var8 = (class54) class116.field2715.method194((byte) -69, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = class128.method988(arg0, false);
        if (arg1 > 1 && var9.field1092 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1067[var11] && var9.field1067[var11] != 0) {
                    var10 = var9.field1092[var11];
                }
            }
            if (var10 != -1) {
                var9 = class128.method988(var10, false);
            }
        }
        class133 var12 = var9.method375(1, -93);
        if (var12 == null) {
            return null;
        }
        class54 var13 = null;
        if (var9.field1085 != -1) {
            var13 = method521(var9.field1098, 10, 1, arg3, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class59.field1215;
        int var15 = class59.field1217;
        int var16 = class59.field1218;
        int var17 = class59.field1213;
        int var18 = class59.field1212;
        int var19 = class59.field1216;
        int var20 = class59.field1214;
        int[] var21 = class134.method1089();
        if (arg3 != 2) {
            field1379 = null;
        }
        int var22 = class134.field3278;
        int var23 = class134.field3270;
        class54 var24 = new class54(36, 32);
        class59.method437(var24.field1129, 36, 32);
        class92.field2145 = class134.method1103(class92.field2145);
        class59.method434(0, 0, 36, 32, 0);
        class134.field3275 = false;
        class134.method1092(16, 16);
        int var25 = var9.field1112;
        if (arg5) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg2 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class134.field3272[var9.field1125] * var25 >> 16;
        int var27 = class134.field3279[var9.field1125] * var25 >> 16;
        var12.method1071();
        var12.method1084(0, var9.field1089, var9.field1105, var9.field1125, var9.field1124, var12.field1052 / 2 + var26 + var9.field1090, var9.field1090 + var27);
        if (arg2 >= 1) {
            var24.method397(1);
        }
        if (arg2 >= 2) {
            var24.method397(16777215);
        }
        if (arg4 != 0) {
            var24.method390(arg4);
        }
        class59.method437(var24.field1129, 36, 32);
        if (var9.field1085 != -1) {
            var13.method400(0, 0);
        }
        if (!arg5 && (var9.field1074 == 1 || arg1 != 1) && arg1 != -1) {
            class109.field2529.method333(class1.method2(65280, arg1), 1, 10, 1);
            class109.field2529.method333(class1.method2(arg3 + 65278, arg1), 0, 9, 16776960);
        }
        if (!arg5) {
            class116.field2715.method193(arg3 ^ 0xFFFFFF91, var24, var6);
        }
        class59.method437(var14, var16, var15);
        class59.method428(var17, var20, var18, var19);
        class134.method1103(var21);
        class134.field3278 = var22;
        class134.field3270 = var23;
        class134.method1093();
        class134.field3275 = true;
        return var24;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static final void method522(byte arg0) {
        field1365++;
        int var1 = 0;
        if (arg0 != 46) {
            method520(-70, null, -36, 17);
        }
        while (class48.field1004 > var1) {
            int var2 = class118.field2771[var1];
            class8 var3 = class123.field2894[var2];
            int var4 = class77.field1752.method462((byte) 116);
            if ((var4 & 0x10) != 0) {
                var3.field701 = class77.field1752.method457(false);
                var3.field710 = class77.field1752.method467(255);
            }
            if ((var4 & 0x4) != 0) {
                var3.field709 = class77.field1752.method467(255);
                if (var3.field709 == 65535) {
                    var3.field709 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class77.field1752.method475((byte) 99);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class77.field1752.method451((byte) 115);
                if (var3.field750 == var5 && var5 != -1) {
                    int var7 = class12.method97(var5, false).field604;
                    if (var7 == 1) {
                        var3.field694 = 0;
                        var3.field705 = var6;
                        var3.field692 = 0;
                        var3.field755 = 0;
                    }
                    if (var7 == 2) {
                        var3.field694 = 0;
                    }
                } else if (var5 == -1 || var3.field750 == -1 || class12.method97(var5, false).field613 >= class12.method97(var3.field750, false).field613) {
                    var3.field692 = 0;
                    var3.field750 = var5;
                    var3.field705 = var6;
                    var3.field742 = var3.field754;
                    var3.field694 = 0;
                    var3.field755 = 0;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class77.field1752.method466(0);
                int var9 = class77.field1752.method451((byte) 115);
                var3.method252(class20.field370, 70, var9, var8);
                var3.field741 = class20.field370 + 300;
                var3.field732 = class77.field1752.method462((byte) 116);
                var3.field713 = class77.field1752.method466(0);
            }
            if ((var4 & 0x80) != 0) {
                var3.field721 = class77.field1752.method480((byte) -51);
                int var10 = class77.field1752.method470((byte) 122);
                var3.field744 = 0;
                if (var3.field721 == 65535) {
                    var3.field721 = -1;
                }
                var3.field717 = 0;
                var3.field706 = (var10 & 0xFFFF) + class20.field370;
                var3.field731 = var10 >> 16;
                if (var3.field706 > class20.field370) {
                    var3.field744 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field715 = class77.field1752.method456(-1);
                var3.field747 = 100;
            }
            if ((var4 & 0x1) != 0) {
                var3.field121 = class51.method361(class77.field1752.method467(255), (byte) 48);
                var3.field696 = var3.field121.field2935;
                var3.field739 = var3.field121.field2931;
                var3.field743 = var3.field121.field2929;
                var3.field735 = var3.field121.field2946;
                var3.field757 = var3.field121.field2954;
                var3.field697 = var3.field121.field2923;
                var3.field716 = var3.field121.field2948;
                var3.field730 = var3.field121.field2912;
                var3.field722 = var3.field121.field2942;
            }
            if ((var4 & 0x2) != 0) {
                int var11 = class77.field1752.method451((byte) 80);
                int var12 = class77.field1752.method482(255);
                var3.method252(class20.field370, 70, var12, var11);
                var3.field741 = class20.field370 + 300;
                var3.field732 = class77.field1752.method482(255);
                var3.field713 = class77.field1752.method462((byte) 116);
            }
            var1++;
        }
    }
}
