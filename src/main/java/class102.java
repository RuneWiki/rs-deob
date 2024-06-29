import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class102 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Llg;")
    public static class107 field1942 = new class107();

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Led;")
    public static class43 field1949 = class191.method1219("<img=1>", false);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Led;")
    public static class43 field1950 = class191.method1219("Ausw-=hlen", false);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lnb;")
    public static class120 field1946;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLob;)Led;")
    public static final class43 method631(byte arg0, class129 arg1) {
        field1944++;
        if (arg0 != 10) {
            return null;
        } else if (class37.method206(class193.method1231((byte) -97, arg1), arg0 ^ 0xFFFFFF93) == 0) {
            return null;
        } else if (arg1.field2593 == null || arg1.field2593.method247((byte) -127).method248((byte) 60) == 0) {
            return class121.field2415 ? class17.field294 : null;
        } else {
            return arg1.field2593;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1942 = null;
        field1949 = null;
        field1950 = null;
        if (arg0 == 219524424) {
            field1946 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lga;Lga;B)V")
    public static final void method633(class58 arg0, class58 arg1, byte arg2) {
        if (arg2 >= -9) {
            method633(null, null, (byte) -94);
        }
        field1943++;
        class85.field1669 = arg1;
        class33.field615 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method634(int arg0) {
        field1941++;
        class121.method794(false, -106);
        boolean var1 = true;
        class131.field2744 = 0;
        for (int var2 = 0; var2 < class95.field1851.length; var2++) {
            if (class112.field2147[var2] != -1 && class95.field1851[var2] == null) {
                class95.field1851[var2] = class4.field90.method367(class112.field2147[var2], 0, (byte) -34);
                if (class95.field1851[var2] == null) {
                    var1 = false;
                    class131.field2744++;
                }
            }
            if (class107.field2050[var2] != -1 && class27.field488[var2] == null) {
                class27.field488[var2] = class4.field90.method348(class95.field1861[var2], class107.field2050[var2], 0, 0);
                if (class27.field488[var2] == null) {
                    var1 = false;
                    class131.field2744++;
                }
            }
        }
        if (!var1) {
            class205.field3998 = 1;
            return;
        }
        class121.field2413 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class95.field1851.length; var4++) {
            byte[] var56 = class27.field488[var4];
            if (var56 != null) {
                int var57 = (class91.field1809[var4] >> 8) * 64 - class170.field3393;
                int var58 = (class91.field1809[var4] & 0xFF) * 64 - class83.field1641;
                if (class203.field3964) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class35.method199(var57, false, var56, var58);
            }
        }
        if (!var3) {
            class205.field3998 = 2;
            return;
        }
        if (class205.field3998 != 0) {
            class5.method33(true, class167.method1036(new class43[] { class201.field3951, class33.field613 }, true), (byte) -72);
        }
        class41.method228((byte) -101);
        class115.method733(-1);
        class41.method228((byte) -117);
        class137.field2842.method1156();
        class41.method228((byte) -86);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class147.field3011[var5].method975(16777215);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class15.field232[var6][var54][var55] = 0;
                }
            }
        }
        class41.method228((byte) -103);
        class132.method853(-115);
        int var7 = class95.field1851.length;
        class68.method425(arg0 ^ arg0);
        class121.method794(true, -92);
        if (!class203.field3964) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class91.field1809[var8] >> 8) * 64 - class170.field3393;
                byte[] var18 = class95.field1851[var8];
                int var19 = (class91.field1809[var8] & 0xFF) * 64 - class83.field1641;
                if (var18 != null) {
                    class41.method228((byte) -115);
                    class20.method98(class147.field3011, -80, class51.field1044 * 8 - 48, var18, (class32.field595 - 6) * 8, var17, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class91.field1809[var9] >> 8) * 64 - class170.field3393;
                byte[] var15 = class95.field1851[var9];
                int var16 = (class91.field1809[var9] & 0xFF) * 64 - class83.field1641;
                if (var15 == null && class32.field595 < 800) {
                    class41.method228((byte) -115);
                    class161.method1016((byte) 59, var16, 64, var14, 64);
                }
            }
            class121.method794(true, -114);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class27.field488[var10];
                if (var11 != null) {
                    int var12 = (class91.field1809[var10] >> 8) * 64 - class170.field3393;
                    int var13 = (class91.field1809[var10] & 0xFF) * 64 - class83.field1641;
                    class41.method228((byte) -118);
                    class140.method900(var12, class137.field2842, var13, arg0 + 27150, class147.field3011, var11);
                }
            }
        }
        if (class203.field3964) {
            for (int var20 = 0; var20 < 4; var20++) {
                class41.method228((byte) -90);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class171.field3403[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class91.field1809.length; var43++) {
                                if (class91.field1809[var43] == var42 && class95.field1851[var43] != null) {
                                    class18.method88(class147.field3011, var38, (var40 & 0x7) * 8, (var41 & 0x7) * 8, class95.field1851[var43], var20, (byte) -124, var34 * 8, var39, var35 * 8);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class33.method187(var20, var34 * 8, (byte) 126, var35 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class171.field3403[0][var21][var32];
                    if (var33 == -1) {
                        class161.method1016((byte) -120, var32 * 8, 8, var21 * 8, 8);
                    }
                }
            }
            class121.method794(true, -122);
            for (int var22 = 0; var22 < 4; var22++) {
                class41.method228((byte) -108);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class171.field3403[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 3 & 0x7FF;
                            int var28 = var25 >> 24 & 0x3;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var27 / 8;
                            for (int var31 = 0; var31 < class91.field1809.length; var31++) {
                                if (class91.field1809[var31] == var30 && class27.field488[var31] != null) {
                                    class54.method325(var26, var22, var24 * 8, (var27 & 0x7) * 8, class147.field3011, (var29 & 0x7) * 8, class27.field488[var31], var23 * 8, class137.field2842, (byte) -116, var28);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class121.method794(true, -110);
        class115.method733(-1);
        class41.method228((byte) -108);
        class49.method303(class147.field3011, true, class137.field2842);
        class121.method794(true, -62);
        int var44 = class7.field145;
        if (var44 > class93.field1839) {
            var44 = class93.field1839;
        }
        if (class93.field1839 - 1 > var44) {
            int var45 = class93.field1839 - 1;
        }
        if (class9.field163) {
            class137.field2842.method1129(class7.field145);
        } else {
            class137.field2842.method1129(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class122.method798(var53, (byte) 15, var46);
            }
        }
        class41.method228((byte) -106);
        class81.method505(0);
        class115.method733(-1);
        if (class198.field3901 != null) {
            class188.field3691++;
            class29.field522.method338(253, 242);
            class29.field522.method581(1057001181, -268435456);
        }
        if (!class203.field3964) {
            int var47 = (class51.field1044 - 6) / 8;
            int var48 = (class51.field1044 + 6) / 8;
            int var49 = (class32.field595 - 6) / 8;
            int var50 = (class32.field595 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var48 < var51 || var49 > var52 || var50 < var52) {
                        class4.field90.method366(class167.method1036(new class43[] { class92.field1829, class30.method161(var51, arg0 + 2), class71.field1393, class30.method161(var52, 10) }, true), false);
                        class4.field90.method366(class167.method1036(new class43[] { class90.field1804, class30.method161(var51, arg0 ^ 0x2), class71.field1393, class30.method161(var52, 10) }, true), false);
                    }
                }
            }
        }
        class35.method197((byte) -70, 30);
        class41.method228((byte) -94);
        class103.method636((byte) 103);
        class29.field522.method338(253, 208);
        class86.method519(8223);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
    public static final int method635(int arg0, int arg1, int arg2, int arg3) {
        field1940++;
        int var4 = arg0 - arg1;
        return ((arg2 & 0xFF00FF) * arg1 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg1 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }
}
