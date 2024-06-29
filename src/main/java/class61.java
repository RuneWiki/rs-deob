import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lec;")
    public static class28 field1351 = class28.method210(-46, "@yel@*V");

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field1363 = 3353893;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Z")
    public static boolean field1360 = false;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1358 = 0;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Lec;")
    public static class28 field1362 = class28.method210(-46, "overlay_multiway");

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public static int[] field1348 = new int[200];

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1354 = -1;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lec;")
    public static class28 field1355 = class28.method210(-46, "Loading ignore list");

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lec;")
    public static class28 field1350 = class28.method210(-46, "Feb");

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "Lec;")
    public static class28 field1374 = class28.method210(-46, "Add friend @whi@");

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "Lec;")
    public static class28 field1375 = class28.method210(-46, "Password: ");

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lpa;")
    public static class91 field1353 = new class91(100);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lwc;")
    public static class128 field1357;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lcc;")
    public static class16 field1367;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Loc;")
    public class87 field1346;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Loc;")
    public class87 field1372;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "Loc;")
    public class87 field1373;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lbb;")
    public static class9 field1344;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public static boolean field1347;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "[I")
    public static int[] field1365;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILvb;III)[B")
    public static final byte[] method494(int arg0, class122 arg1, int arg2, int arg3, int arg4) {
        field1369++;
        long var5 = ((long) arg0 << 32) - (-((long) (arg4 << 16)) - ((long) (arg4 * 37 + arg2 & 0xFFFF)));
        if (class88.field1970 != null) {
            class32 var7 = (class32) class88.field1970.method660(arg3 ^ 0xFFFFFF9D, var5);
            if (var7 != null) {
                return var7.field673;
            }
        }
        byte[] var8 = arg1.method932(-110, arg2, arg4);
        if (var8 == null) {
            return null;
        } else if (arg3 == 99) {
            if (class88.field1970 != null) {
                class88.field1970.method666(false, new class32(var8), var5);
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static final void method495(int arg0) {
        field1371++;
        class56 var1 = (class56) class76.field1694.method326(0);
        if (arg0 != 128) {
            field1347 = false;
        }
        while (var1 != null) {
            if (class122.field2657 != var1.field1292 || var1.field1280) {
                var1.method319((byte) -128);
            } else if (class83.field1888 >= var1.field1299) {
                var1.method457(true, class12.field197);
                if (var1.field1280) {
                    var1.method319((byte) -127);
                } else {
                    class11.field179.method760(var1.field1292, var1.field1297, var1.field1290, var1.field1278, 60, var1, 0, -1, false);
                }
            }
            var1 = (class56) class76.field1694.method325((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method496(int arg0) {
        field1356++;
        class91.field2003 = 0;
        class16.field306 = 0;
        class7.method37((byte) -127);
        class20.method135(true);
        class17.method99(66);
        for (int var1 = 0; var1 < class91.field2003; var1++) {
            int var3 = class17.field327[var1];
            if (class83.field1888 != class88.field1956[var3].field1458) {
                class88.field1956[var3].field1996 = null;
                class88.field1956[var3] = null;
            }
        }
        if (class76.field1692 != class56.field1282.field2554) {
            throw new RuntimeException("gnp1 pos:" + class56.field1282.field2554 + " psize:" + class76.field1692);
        }
        for (int var2 = arg0; var2 < class64.field1430; var2++) {
            if (class88.field1956[class64.field1429[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class64.field1430);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/awt/Graphics;I)V")
    public static final void method497(Graphics arg0, int arg1) {
        class125.field2707.method91(4, arg0, arg1 + 11675, 4);
        if (arg1 == 0) {
            field1361++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static void method498(int arg0) {
        field1348 = null;
        field1367 = null;
        field1355 = null;
        field1362 = null;
        field1374 = null;
        field1357 = null;
        if (arg0 > -94) {
            field1344 = null;
        }
        field1353 = null;
        field1375 = null;
        field1365 = null;
        field1344 = null;
        field1351 = null;
        field1350 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static final void method499(int arg0) {
        field1352++;
        int var1 = class68.field1541 + class37.field848.field1446;
        int var2 = class8.field148 + class37.field848.field1501;
        if (class50.field1177 - var1 < -500 || class50.field1177 - var1 > 500 || class57.field1310 - var2 < -500 || class57.field1310 - var2 > 500) {
            class50.field1177 = var1;
            class57.field1310 = var2;
        }
        if (class57.field1310 != var2) {
            class57.field1310 += (var2 - class57.field1310) / 16;
        }
        if (class50.field1177 != var1) {
            class50.field1177 += (var1 - class50.field1177) / 16;
        }
        int var3 = class50.field1177 >> 7;
        if (class74.field1634[96]) {
            class5.field89 += (-class5.field89 - 24) / 2;
        } else if (class74.field1634[97]) {
            class5.field89 += (24 - class5.field89) / 2;
        } else {
            class5.field89 /= 2;
        }
        int var4 = class57.field1310 >> 7;
        if (arg0 > -107) {
            method498(94);
        }
        int var5 = 0;
        if (class74.field1634[98]) {
            class36.field812 += (12 - class36.field812) / 2;
        } else if (class74.field1634[99]) {
            class36.field812 += (-class36.field812 - 12) / 2;
        } else {
            class36.field812 /= 2;
        }
        class25.field558 += class36.field812 / 2;
        class122.field2663 = class5.field89 / 2 + class122.field2663 & 0x7FF;
        if (class25.field558 < 128) {
            class25.field558 = 128;
        }
        if (class25.field558 > 383) {
            class25.field558 = 383;
        }
        int var6 = class18.method107(class57.field1310, class50.field1177, -2049, class122.field2657);
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class122.field2657;
                    if (var9 < 3 && (class47.field1080[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class118.field2523[var9][var7][var8];
                    if (var5 < var10) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class96.field2141 < var11) {
            class96.field2141 += (var11 - class96.field2141) / 24;
        } else if (var11 < class96.field2141) {
            class96.field2141 += (var11 - class96.field2141) / 80;
        }
    }
}
