import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class57 extends class143 {

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Ljd;")
    public static class86 field1160 = class122.method868("lila:", true);

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "Ljd;")
    private static class86 field1161 = class122.method868("white:", true);

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Ljd;")
    public static class86 field1165 = field1161;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Ljd;")
    public static class86 field1162 = field1161;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)I")
    public static final int method413(byte arg0, int arg1) {
        field1157++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg0 >= -24) {
            return -74;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(BI)I")
    public static final int method414(byte arg0, int arg1) {
        field1169++;
        int var2 = -1 / ((65 - arg0) / 38);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
    public static final void method415(byte arg0) {
        if (class9.field295[98]) {
            class6.field240 += (12 - class6.field240) / 2;
        } else if (class9.field295[99]) {
            class6.field240 += (-class6.field240 - 12) / 2;
        } else {
            class6.field240 /= 2;
        }
        field1158++;
        class139.field2641 += class6.field240 / 2;
        if (class9.field295[96]) {
            class113.field2150 += (-class113.field2150 - 24) / 2;
        } else if (class9.field295[97]) {
            class113.field2150 += (24 - class113.field2150) / 2;
        } else {
            class113.field2150 /= 2;
        }
        int var1 = class124.field2412.field685 + class244.field4362;
        int var2 = class124.field2412.field676 + class80.field1571;
        class86.field1664 += class113.field2150 / 2;
        if (arg0 != 34) {
            method416((class86) null, 6);
        }
        if ((class141.field2678 - var2) < -500 || (class141.field2678 - var2) > 500 || class204.field3692 - var1 < -500 || class204.field3692 - var1 > 500) {
            class204.field3692 = var1;
            class141.field2678 = var2;
        }
        if (class141.field2678 != var2) {
            class141.field2678 += (var2 - class141.field2678) / 16;
        }
        if (class204.field3692 != var1) {
            class204.field3692 += (var1 - class204.field3692) / 16;
        }
        class252.method1701(128);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljd;I)V")
    public static final void method416(class86 arg0, int arg1) {
        field1166++;
        if (arg1 <= 65) {
            field1160 = null;
        }
        if (class38.field905 >= 2) {
            if (arg0.method631(12508, class236.field4259)) {
                class160.method1166((byte) -48);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class58.method423(class109.method783(2, new class86[] { class252.field4489, class4.method26(false, var4), class113.field2149 }), false, 0, (class86) null);
            }
            if (arg0.method631(12508, class31.field668)) {
                class130.method915(-14139);
            }
            if (arg0.method631(12508, class194.field3464)) {
                class253.field4496.method1161(128);
            }
            if (arg0.method631(12508, class238.field4293)) {
                class253.field4496.method1160(4);
            }
            if (arg0.method631(12508, class163.field3061)) {
                class144.field2739 = true;
            }
            if (arg0.method631(12508, class165.field3087)) {
                class138.method983(25, (byte) 2);
            }
            if (arg0.method631(12508, class30.field633)) {
                class68.field1327 = true;
            }
            if (arg0.method631(12508, class256.field4544)) {
                class68.field1327 = false;
            }
            if (arg0.method631(12508, class173.field3174)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class122.field2388[var5].field300[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method597(class170.field3132, 102) && class220.field3961 != 0) {
                class143.method1016(-121, arg0.method633(6, (byte) 61).method598(26));
            }
            if (arg0.method631(12508, class66.field1305) && class220.field3961 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method597(class185.field3286, -127)) {
                class195.field3501 = arg0.method633(12, (byte) 61).method588(-1).method598(26);
                class58.method423(class109.method783(2, new class86[] { class30.field630, class4.method26(false, class195.field3501) }), false, 0, (class86) null);
            }
            if (arg0.method631(12508, class4.field47)) {
                class180.field3251 = true;
            }
        }
        class153.field2883++;
        class36.field809.method1356(140, true);
        class36.field809.method1388(-63, arg0.method612((byte) 125) - 1);
        class36.field809.method1379(0, arg0.method633(2, (byte) 61));
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)Lug;")
    public static final class193 method417(int arg0, int arg1) {
        class193 var2 = (class193) class165.field3088.method701((byte) -121, (long) arg0);
        field1159++;
        if (arg1 < 101) {
            method416((class86) null, -86);
        }
        if (var2 != null) {
            return var2;
        }
        class193 var3 = class117.method825(class252.field4485, arg0, class27.field622, (byte) 105, false);
        if (var3 != null) {
            class165.field3088.method696((long) arg0, var3, (byte) -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method418(boolean arg0) {
        field1160 = null;
        if (arg0) {
            field1165 = null;
            field1161 = null;
            field1162 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZIIBZZ)Lod;")
    public static final class90 method419(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, boolean arg6, boolean arg7) {
        if (arg5 < 8) {
            return null;
        }
        field1164++;
        class69 var8 = class272.method1853(0, arg0);
        if (arg4 > 1 && var8.field1393 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field1400[var10] <= arg4 && var8.field1400[var10] != 0) {
                    var9 = var8.field1393[var10];
                }
            }
            if (var9 != -1) {
                var8 = class272.method1853(0, var9);
            }
        }
        class89 var11 = var8.method492(true);
        if (var11 == null) {
            return null;
        }
        class167 var12 = null;
        if (var8.field1391 != -1) {
            var12 = (class167) method419(var8.field1360, 0, false, 1, 10, (byte) 39, true, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1401 != -1) {
            var12 = (class167) method419(var8.field1416, arg1, false, arg3, arg4, (byte) 44, false, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class131.field2493;
        int var14 = class131.field2495;
        int var15 = class131.field2488;
        int[] var16 = new int[4];
        class131.method935(var16);
        class167 var17 = new class167(36, 32);
        class131.method928(var17.field3098, 36, 32);
        class145.method1047();
        class145.method1038(16, 16);
        class145.field2748 = false;
        int var18 = var8.field1350;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class145.field2742[var8.field1346] * var18 >> 16;
        int var20 = class145.field2746[var8.field1346] * var18 >> 16;
        var11.method216(0, var8.field1406, var8.field1386, var8.field1346, var8.field1371, var20 + var8.field1399 - (var11.method233() / 2), var19 - -var8.field1399);
        if (arg3 >= 1) {
            var17.method1207(1);
            if (arg3 >= 2) {
                var17.method1207(16777215);
            }
            class131.method928(var17.field3098, 36, 32);
        }
        if (arg1 != 0) {
            var17.method1198(arg1);
        }
        if (var8.field1391 != -1) {
            var12.method668(0, 0);
        } else if (var8.field1401 != -1) {
            class131.method928(var12.field3098, 36, 32);
            var17.method668(0, 0);
            var17 = var12;
        }
        if (arg2 && (var8.field1390 == 1 || arg4 != 1) && arg4 != -1) {
            class138.field2637.method1772(class112.method788(-124, arg4), 0, 9, 16776960, 1);
        }
        class131.method928(var13, var14, var15);
        class131.method922(var16);
        class145.method1047();
        class145.field2748 = true;
        return var17;
    }
}
