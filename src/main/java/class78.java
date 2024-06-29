import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class78 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "La;")
    public static class1 field1911 = class113.method934(-11538, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!n", name = "i", descriptor = "La;")
    public static class1 field1918 = class113.method934(-11538, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Li;")
    public static class48 field1920 = new class48(32);

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
    public static boolean field1922 = false;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "La;")
    public static class1 field1923 = class113.method934(-11538, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field1927 = 0;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "La;")
    public static class1 field1928 = class113.method934(-11538, "@gr1@");

    @OriginalMember(owner = "client!n", name = "u", descriptor = "La;")
    public static class1 field1930 = class113.method934(-11538, "weiss:");

    @OriginalMember(owner = "client!n", name = "v", descriptor = "La;")
    public static class1 field1931 = class113.method934(-11538, "Wir vermuten ihr Spielkonto wurde gestohlen");

    @OriginalMember(owner = "client!n", name = "q", descriptor = "La;")
    private static class1 field1926 = class113.method934(-11538, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!n", name = "o", descriptor = "La;")
    public static class1 field1924 = field1926;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "[Ljd;")
    public static class58[] field1929;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIII)I", line = 11)
    public static final int method715(byte arg0, int arg1, int arg2, int arg3) {
        field1916++;
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg1;
        if (arg1 < 3 && (class34.field899[1][var5][var4] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = (128 - var6) * class57.field1454[var7][var5][var4] + class57.field1454[var7][var5 + 1][var4] * var6 >> 7;
        int var9 = arg3 & 0x7F;
        if (arg0 > -116) {
            method717((byte) -86);
        }
        int var10 = (128 - var6) * class57.field1454[var7][var5][var4 + 1] + class57.field1454[var7][var5 + 1][var4 + 1] * var6 >> 7;
        return (128 - var9) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lec;", line = 59)
    public static final class28 method716(int arg0, int arg1) {
        if (arg1 != 13) {
            method721(-34);
        }
        field1912++;
        class28 var2 = (class28) class86.field2155.method264((long) arg0, (byte) 59);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field1000.method218(arg0, 114, 13);
        class28 var4 = new class28();
        var4.field810 = arg0;
        if (var3 != null) {
            var4.method374(new class8(var3), (byte) 61);
        }
        class86.field2155.method263(-7208, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 90)
    public static final void method717(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
        if (arg0 > 0) {
            field1921++;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 106)
    public static void method718(int arg0) {
        field1923 = null;
        field1920 = null;
        field1926 = null;
        field1911 = null;
        field1929 = null;
        field1930 = null;
        field1931 = null;
        field1924 = null;
        if (arg0 == -29013) {
            field1918 = null;
            field1928 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 136)
    public static final void method719(int arg0) {
        class6.field225 = false;
        class112.field2764 = -1;
        class42.field1105 = 0;
        class100.field2550 = 0;
        class70.field1729.field268 = 0;
        class1.field36 = -1;
        class15.field499 = -1;
        class75.field1858 = 0;
        class99.field2437 = -1;
        class35.field942 = 0;
        field1919++;
        class63.field1590 = 0;
        class114.field2816 = 0;
        class15.field489.field268 = arg0;
        for (int var1 = 0; var1 < class80.field2033.length; var1++) {
            if (class80.field2033[var1] != null) {
                class80.field2033[var1].field2014 = -1;
            }
        }
        for (int var2 = 0; var2 < class120.field2995.length; var2++) {
            if (class120.field2995[var2] != null) {
                class120.field2995[var2].field2014 = -1;
            }
        }
        class34.method400(30, -88);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V", line = 181)
    public static final void method720(boolean arg0) {
        class62.method597((byte) -106);
        field1915++;
        if (class63.field1590 == 2) {
            int[] var1 = class111.field2750;
            byte[] var2 = class74.field1848.field749;
            int var3 = var2.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var2[var4] == 0) {
                    var1[var4] = 0;
                }
            }
            class47.field1241.method557(0, 0, 33, 33, 25, 25, class113.field2800, 256, class62.field1559, class62.field1563);
            class42.method455(4);
            return;
        }
        int var5 = class104.field2624.field1975 / 32 + 48;
        int var6 = 464 - class104.field2624.field1966 / 32;
        int var7 = class86.field2161 + class113.field2800 & 0x7FF;
        class104.field2629.method557(25, 5, 146, 151, var5, var6, var7, class103.field2592 + 256, class102.field2591, class74.field1845);
        for (int var8 = 0; var8 < class54.field1436; var8++) {
            int var38 = class80.field2026[var8] * 4 + 2 - class104.field2624.field1975 / 32;
            int var39 = class92.field2306[var8] * 4 + 2 - class104.field2624.field1966 / 32;
            class32.method388(var39, var38, class122.field3049[var8], (byte) 99);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class92 var35 = class17.field553[class2.field76][var9][var34];
                if (var35 != null) {
                    int var36 = var34 * 4 + 2 - class104.field2624.field1966 / 32;
                    int var37 = var9 * 4 + 2 - class104.field2624.field1975 / 32;
                    class32.method388(var36, var37, class63.field1581[0], (byte) 70);
                }
            }
        }
        for (int var10 = 0; var10 < class49.field1343; var10++) {
            class130 var30 = class120.field2995[class22.field678[var10]];
            if (var30 != null && var30.method43(1)) {
                class42 var31 = var30.field3185;
                if (var31.field1137 != null) {
                    var31 = var31.method458(-1);
                }
                if (var31 != null && var31.field1141 && var31.field1083) {
                    int var32 = var30.field1975 / 32 - class104.field2624.field1975 / 32;
                    int var33 = var30.field1966 / 32 - class104.field2624.field1966 / 32;
                    class32.method388(var33, var32, class63.field1581[1], (byte) 75);
                }
            }
        }
        for (int var11 = 0; var11 < class118.field2942; var11++) {
            class2 var22 = class80.field2033[class112.field2761[var11]];
            if (var22 != null && var22.method43(1)) {
                int var23 = var22.field1975 / 32 - class104.field2624.field1975 / 32;
                int var24 = var22.field1966 / 32 - class104.field2624.field1966 / 32;
                boolean var25 = false;
                long var26 = var22.field87.method9((byte) 122);
                for (int var28 = 0; var28 < class59.field1495; var28++) {
                    if (class117.field2932[var28] == var26 && class73.field1791[var28] != 0) {
                        var25 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class104.field2624.field75 != 0 && var22.field75 != 0 && class104.field2624.field75 == var22.field75) {
                    var29 = true;
                }
                if (var25) {
                    class32.method388(var24, var23, class63.field1581[3], (byte) 46);
                } else if (var29) {
                    class32.method388(var24, var23, class63.field1581[4], (byte) 57);
                } else {
                    class32.method388(var24, var23, class63.field1581[2], (byte) 80);
                }
            }
        }
        if (class2.field97 != 0 && class82.field2066 % 20 < 10) {
            if (class2.field97 == 1 && class132.field3215 >= 0 && class120.field2995.length > class132.field3215) {
                class130 var12 = class120.field2995[class132.field3215];
                if (var12 != null) {
                    int var13 = var12.field1975 / 32 - class104.field2624.field1975 / 32;
                    int var14 = var12.field1966 / 32 - class104.field2624.field1966 / 32;
                    class34.method401(var13, class22.field681[1], -74, var14);
                }
            }
            if (class2.field97 == 2) {
                int var15 = (class6.field227 - class53.field1411) * 4 + 2 - class104.field2624.field1966 / 32;
                int var16 = (class134.field3307 - class28.field807) * 4 + 2 - class104.field2624.field1975 / 32;
                class34.method401(var16, class22.field681[1], 75, var15);
            }
            if (class2.field97 == 10 && class134.field3293 >= 0 && class80.field2033.length > class134.field3293) {
                class2 var17 = class80.field2033[class134.field3293];
                if (var17 != null) {
                    int var18 = var17.field1966 / 32 - class104.field2624.field1966 / 32;
                    int var19 = var17.field1975 / 32 - class104.field2624.field1975 / 32;
                    class34.method401(var19, class22.field681[1], 51, var18);
                }
            }
        }
        if (class35.field942 != 0) {
            int var20 = class35.field942 * 4 + 2 - class104.field2624.field1975 / 32;
            int var21 = class108.field2723 * 4 + 2 - class104.field2624.field1966 / 32;
            class32.method388(var21, var20, class22.field681[0], (byte) 83);
        }
        class111.method916(97, 78, 3, 3, 16777215);
        class47.field1241.method557(0, 0, 33, 33, 25, 25, class113.field2800, 256, class62.field1559, class62.field1563);
        if (arg0) {
            class42.method455(4);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 399)
    public static final void method721(int arg0) {
        field1913++;
        if (arg0 < 95) {
            method721(25);
        }
        for (class12 var1 = (class12) class16.field516.method805((byte) -90); var1 != null; var1 = (class12) class16.field516.method812(-4)) {
            if (var1.field425 != null) {
                class99.field2438.method136(var1.field425);
                var1.field425 = null;
            }
            if (var1.field434 != null) {
                class99.field2438.method136(var1.field434);
                var1.field434 = null;
            }
        }
        class16.field516.method809(0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIILia;)V", line = 431)
    public static final void method722(int arg0, boolean arg1, int arg2, int arg3, int arg4, class49 arg5) {
        field1917++;
        class12 var6 = new class12();
        var6.field424 = arg5.field1287 * 128;
        if (!arg1) {
            method723(119, -54, (byte) 96);
        }
        var6.field426 = arg5.field1327;
        var6.field429 = arg5.field1308;
        var6.field436 = arg5.field1284;
        int var7 = arg5.field1288;
        int var8 = arg5.field1300;
        var6.field417 = arg2;
        var6.field418 = arg4 * 128;
        if (arg3 == 1 || arg3 == 3) {
            var7 = arg5.field1300;
            var8 = arg5.field1288;
        }
        var6.field427 = arg0 * 128;
        var6.field431 = (arg0 + var8) * 128;
        var6.field437 = (arg4 + var7) * 128;
        var6.field421 = arg5.field1298;
        if (arg5.field1319 != null) {
            var6.field435 = arg5;
            var6.method248(57);
        }
        class16.field516.method807(var6, -126);
        if (var6.field429 != null) {
            var6.field438 = (int) ((double) (var6.field426 - var6.field436) * Math.random()) + var6.field436;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)Z", line = 478)
    public static final boolean method723(int arg0, int arg1, byte arg2) {
        field1910++;
        if (arg0 == 0 && class48.field1281 == arg1) {
            return true;
        } else if (arg0 == 1 && class52.field1390 == arg1) {
            return true;
        } else if ((arg0 == 2 || arg0 == 3) && class133.field3256 == arg1) {
            return true;
        } else {
            if (arg2 != 52) {
                field1911 = null;
            }
            return false;
        }
    }
}
