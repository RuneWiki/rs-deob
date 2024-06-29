import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class82 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field1363 = 0;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field1365 = 128;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field1362 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
    public boolean field1364 = false;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    private int field1384 = 128;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    private int field1385 = 0;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public int field1388 = -1;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "Ldf;")
    public static class51 field1370 = class46.method233("<col=ff9040>", 100);

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field1368 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Z")
    public static boolean field1366 = false;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Ldf;")
    public static class51 field1374 = class46.method233("leuchten1:", 100);

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Ldf;")
    public static class51 field1379 = class46.method233("<col=ffffff> )4 ", 100);

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Ldf;")
    public static class51 field1375 = class46.method233("mapfunction", 100);

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "Z")
    public static boolean field1389 = false;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lu;")
    public static class111 field1367;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "[Lwc;")
    public static class213[] field1369;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[S")
    private short[] field1373;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[S")
    private short[] field1376;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[S")
    private short[] field1378;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[S")
    private short[] field1380;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method638(byte arg0) {
        field1383++;
        if (class243.field4206 != -1) {
            class215.method1475(class243.field4206, arg0 ^ 0xFFFFFFFD);
        }
        for (int var1 = 0; var1 < class167.field2713; var1++) {
            if (class213.field3705[var1]) {
                class42.field681[var1] = true;
            }
            class93.field1547[var1] = class213.field3705[var1];
            class213.field3705[var1] = false;
        }
        if (arg0 != 2) {
            field1368 = 92;
        }
        class78.field1248 = -1;
        class37.field564 = -1;
        class221.field3829 = null;
        class248.field4366 = class179.field2960;
        if (class243.field4206 != -1) {
            class167.field2713 = 0;
            class8.method41(0, class76.field1230, (byte) 79, class95.field1578, 0, -1, 0, 0, class243.field4206);
        }
        class59.method391();
        class225.field3945 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)Ltb;")
    public final class65 method639(byte arg0, int arg1) {
        class65 var3 = (class65) class204.field3403.method1357((byte) -124, (long) this.field1377);
        field1387++;
        if (var3 == null) {
            class178 var4 = class178.method1267(class47.field746, this.field1381, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1378 != null) {
                for (int var5 = 0; var5 < this.field1378.length; var5++) {
                    var4.method1260(this.field1378[var5], this.field1380[var5]);
                }
            }
            if (this.field1373 != null) {
                for (int var6 = 0; var6 < this.field1373.length; var6++) {
                    var4.method1245(this.field1373[var6], this.field1376[var6]);
                }
            }
            var3 = var4.method1246(this.field1362 + 64, this.field1385 + 850, -30, -50, -30);
            class204.field3403.method1351(var3, 2, (long) this.field1377);
        }
        if (arg0 != -4) {
            return null;
        }
        class65 var7;
        if (this.field1388 == -1 || arg1 == -1) {
            var7 = var3.method449(true, true);
        } else {
            var7 = class72.method501(this.field1388, (byte) 21).method1084(false, arg1, var3);
        }
        if (this.field1365 != 128 || this.field1384 != 128) {
            var7.method441(this.field1365, this.field1384, this.field1365);
        }
        if (this.field1363 != 0) {
            if (this.field1363 == 90) {
                var7.method453();
            }
            if (this.field1363 == 180) {
                var7.method438();
            }
            if (this.field1363 == 270) {
                var7.method454();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILlb;)V")
    public final void method640(int arg0, class121 arg1) {
        field1372++;
        if (arg0 != 31712) {
            method638((byte) -26);
        }
        while (true) {
            int var3 = arg1.method897(127);
            if (var3 == 0) {
                return;
            }
            this.method643(var3, (byte) -55, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static void method641(byte arg0) {
        field1375 = null;
        field1379 = null;
        field1374 = null;
        field1370 = null;
        int var1 = 27 % ((51 - arg0) / 54);
        field1367 = null;
        field1369 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static int method642(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBLlb;)V")
    private final void method643(int arg0, byte arg1, class121 arg2) {
        if (arg0 == 1) {
            this.field1381 = arg2.method876(false);
        } else if (arg0 == 2) {
            this.field1388 = arg2.method876(false);
        } else if (arg0 == 4) {
            this.field1365 = arg2.method876(false);
        } else if (arg0 == 5) {
            this.field1384 = arg2.method876(false);
        } else if (arg0 == 6) {
            this.field1363 = arg2.method876(false);
        } else if (arg0 == 7) {
            this.field1362 = arg2.method897(-85);
        } else if (arg0 == 8) {
            this.field1385 = arg2.method897(-17);
        } else if (arg0 == 9) {
            this.field1364 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method897(-114);
            this.field1380 = new short[var4];
            this.field1378 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1378[var5] = (short) arg2.method876(false);
                this.field1380[var5] = (short) arg2.method876(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method897(125);
            this.field1376 = new short[var6];
            this.field1373 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1373[var7] = (short) arg2.method876(false);
                this.field1376[var7] = (short) arg2.method876(false);
            }
        }
        if (arg1 > -17) {
            field1366 = false;
        }
        field1371++;
    }
}
