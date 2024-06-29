import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class116 {

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lic;")
    public static class59 field1259 = class59.method433(0, "welle:");

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lic;")
    public static class59 field1262 = class59.method433(0, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[I")
    public static int[] field1261 = new int[256];

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Lic;")
    private static class59 field1272;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Lic;")
    public static class59 field1274;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
    public static int[] field1273;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lic;")
    public static class59 field1270;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Llf;")
    public static class82 field1277;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lic;")
    public static class59 field1278;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Lic;")
    public static class59 field1284;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lic;")
    private static class59 field1285;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Lic;")
    public static class59 field1282;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Lic;")
    public static class59 field1279;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Lwd;")
    public static class157 field1275;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Lhb;")
    public class51 field1266;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lhb;")
    public class51 field1268;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "[Lt;")
    public static class132[] field1281;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method385(int arg0) {
        field1282 = null;
        field1277 = null;
        field1285 = null;
        field1262 = null;
        field1261 = null;
        field1274 = null;
        field1281 = null;
        field1259 = null;
        field1273 = null;
        field1278 = null;
        field1272 = null;
        field1279 = null;
        field1275 = null;
        field1270 = null;
        if (arg0 == 30) {
            field1284 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static final void method386(int arg0) {
        int var1 = 59 % ((arg0 - 54) / 63);
        field1263++;
        class142.method1059(false, (byte) -119);
        class153.field3312 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < class82.field2047.length; var3++) {
            if (class70.field1779[var3] != -1 && class82.field2047[var3] == null) {
                class82.field2047[var3] = class38.field993.method193(false, 0, class70.field1779[var3]);
                if (class82.field2047[var3] == null) {
                    class153.field3312++;
                    var2 = false;
                }
            }
            if (class55.field1349[var3] != -1 && class116.field2719[var3] == null) {
                class116.field2719[var3] = class38.field993.method186(true, 0, class55.field1349[var3], class8.field163[var3]);
                if (class116.field2719[var3] == null) {
                    class153.field3312++;
                    var2 = false;
                }
            }
        }
        if (!var2) {
            class34.field913 = 1;
            return;
        }
        class38.field989 = 0;
        boolean var4 = true;
        for (int var5 = 0; var5 < class82.field2047.length; var5++) {
            byte[] var57 = class116.field2719[var5];
            if (var57 != null) {
                int var58 = (class148.field3238[var5] >> 8) * 64 - class89.field2229;
                int var59 = (class148.field3238[var5] & 0xFF) * 64 - class68.field1756;
                if (class49.field1235) {
                    var58 = 10;
                    var59 = 10;
                }
                var4 &= class96.method791(var57, var58, -77, var59);
            }
        }
        if (!var4) {
            class34.field913 = 2;
            return;
        }
        if (class34.field913 != 0) {
            class121.method942(class46.method358(new class59[] { class134.field2982, class153.field3323 }, (byte) -75), true, (byte) 59);
        }
        class35.method268((byte) 79);
        class41.method312(200);
        class35.method268((byte) 47);
        class3.field58.method890();
        class35.method268((byte) 95);
        System.gc();
        for (int var6 = 0; var6 < 4; var6++) {
            class108.field2616[var6].method617(124);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var55 = 0; var55 < 104; var55++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    class121.field2785[var7][var55][var56] = 0;
                }
            }
        }
        class35.method268((byte) 11);
        class7.method33((byte) 106);
        int var8 = class82.field2047.length;
        class18.method95((byte) -56);
        class142.method1059(true, (byte) 73);
        if (!class49.field1235) {
            for (int var9 = 0; var9 < var8; var9++) {
                int var18 = (class148.field3238[var9] >> 8) * 64 - class89.field2229;
                int var19 = (class148.field3238[var9] & 0xFF) * 64 - class68.field1756;
                byte[] var20 = class82.field2047[var9];
                if (var20 != null) {
                    class35.method268((byte) 17);
                    class148.method1102(var20, (class157.field3436 - 6) * 8, var18, var19, class108.field2616, (byte) -71, (class106.field2544 - 6) * 8);
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                int var15 = (class148.field3238[var10] >> 8) * 64 - class89.field2229;
                byte[] var16 = class82.field2047[var10];
                int var17 = (class148.field3238[var10] & 0xFF) * 64 - class68.field1756;
                if (var16 == null && class106.field2544 < 800) {
                    class35.method268((byte) 47);
                    class32.method255(64, 64, var17, 0, var15);
                }
            }
            class142.method1059(true, (byte) -9);
            for (int var11 = 0; var11 < var8; var11++) {
                byte[] var12 = class116.field2719[var11];
                if (var12 != null) {
                    int var13 = (class148.field3238[var11] >> 8) * 64 - class89.field2229;
                    int var14 = (class148.field3238[var11] & 0xFF) * 64 - class68.field1756;
                    class35.method268((byte) 88);
                    class142.method1058(class3.field58, var13, (byte) 72, var14, class108.field2616, var12);
                }
            }
        }
        if (class49.field1235) {
            for (int var21 = 0; var21 < 4; var21++) {
                class35.method268((byte) 14);
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = class136.field3023[var21][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 1 & 0x3;
                            int var40 = var38 >> 24 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < class148.field3238.length; var44++) {
                                if (class148.field3238[var44] == var43 && class82.field2047[var44] != null) {
                                    class143.method1066(var21, class82.field2047[var44], var39, (var41 & 0x7) * 8, (byte) -54, var35 * 8, class108.field2616, var40, (var42 & 0x7) * 8, var36 * 8);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class6.method30(var35 * 8, var36 * 8, var21, -94);
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var33 = 0; var33 < 13; var33++) {
                    int var34 = class136.field3023[0][var22][var33];
                    if (var34 == -1) {
                        class32.method255(8, 8, var33 * 8, 0, var22 * 8);
                    }
                }
            }
            class142.method1059(true, (byte) -105);
            for (int var23 = 0; var23 < 4; var23++) {
                class35.method268((byte) 21);
                for (int var24 = 0; var24 < 13; var24++) {
                    for (int var25 = 0; var25 < 13; var25++) {
                        int var26 = class136.field3023[var23][var24][var25];
                        if (var26 != -1) {
                            int var27 = var26 >> 24 & 0x3;
                            int var28 = var26 >> 1 & 0x3;
                            int var29 = var26 >> 14 & 0x3FF;
                            int var30 = var26 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + (var30 / 8);
                            for (int var32 = 0; var32 < class148.field3238.length; var32++) {
                                if (class148.field3238[var32] == var31 && class116.field2719[var32] != null) {
                                    class83.method690(var28, (var30 & 0x7) * 8, var25 * 8, var23, var27, class108.field2616, (var29 & 0x7) * 8, var24 * 8, class116.field2719[var32], class3.field58, 25);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class142.method1059(true, (byte) -107);
        class41.method312(200);
        class35.method268((byte) 119);
        class60.method485((byte) 67, class3.field58, class108.field2616);
        class142.method1059(true, (byte) -122);
        int var45 = class43.field1107;
        if (var45 > class44.field1127) {
            var45 = class44.field1127;
        }
        if (var45 < class44.field1127 - 1) {
            int var46 = class44.field1127 - 1;
        }
        if (class127.field2882) {
            class3.field58.method912(class43.field1107);
        } else {
            class3.field58.method912(0);
        }
        for (int var47 = 0; var47 < 104; var47++) {
            for (int var54 = 0; var54 < 104; var54++) {
                class70.method554((byte) -114, var47, var54);
            }
        }
        class35.method268((byte) 85);
        class36.method277(127);
        class96.field2436.method676((byte) -104);
        if (class126.field2867 != null) {
            class36.field943++;
            class125.field2842.method1072(142, -1);
            class125.field2842.method1195(1057001181, 852);
        }
        if (!class49.field1235) {
            int var48 = (class157.field3436 - 6) / 8;
            int var49 = (class106.field2544 - 6) / 8;
            int var50 = (class157.field3436 + 6) / 8;
            int var51 = (class106.field2544 + 6) / 8;
            for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                for (int var53 = var49 - 1; var53 <= var51 + 1; var53++) {
                    if (var48 > var52 || var50 < var52 || var53 < var49 || var51 < var53) {
                        class38.field993.method183(-1, class46.method358(new class59[] { class63.field1623, class46.method361(var52, -120), class36.field945, class46.method361(var53, -98) }, (byte) -75));
                        class38.field993.method183(-1, class46.method358(new class59[] { class125.field2806, class46.method361(var52, 75), class36.field945, class46.method361(var53, -112) }, (byte) -75));
                    }
                }
            }
        }
        class89.method737(30, 128);
        class35.method268((byte) 57);
        class33.method262((byte) 95);
        class125.field2842.method1072(99, -1);
        class86.method712((byte) -85);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public final void method387(byte arg0) {
        if (arg0 > -64) {
            return;
        }
        field1269++;
        if (this.field1266 != null) {
            this.field1266.field1268 = this.field1268;
            this.field1268.field1266 = this.field1266;
            this.field1268 = null;
            this.field1266 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILh;)V")
    public static final void method388(int arg0, int arg1, int arg2, class49 arg3) {
        int var4 = -42 / ((arg2 - 27) / 57);
        field1264++;
        if ((arg1 & 0x40) != 0) {
            arg3.field1711 = class10.field213.method1180(-128);
            if (arg3.field1711 == 65535) {
                arg3.field1711 = -1;
            }
        }
        if ((arg1 & 0x1) != 0) {
            arg3.field1744 = class10.field213.method1161((byte) 60);
            arg3.field1726 = class10.field213.method1200((byte) 97);
        }
        if ((arg1 & 0x80) != 0) {
            int var5 = class10.field213.method1161((byte) 60);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class10.field213.method1173(false);
            class126.method964(var5, -31174, arg3, var6);
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field1697 = class10.field213.method1214((byte) -46);
            if (arg3.field1697.method425((byte) 105, 0) == 126) {
                arg3.field1697 = arg3.field1697.method452(-805469788, 1);
                class127.method972(arg3.field1697, arg3.field1225, 2, 26018);
            } else if (class159.field3650 == arg3) {
                class127.method972(arg3.field1697, arg3.field1225, 2, 26018);
            }
            arg3.field1738 = 0;
            arg3.field1687 = 0;
            arg3.field1720 = 150;
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field1682 = class10.field213.method1200((byte) 127);
            int var7 = class10.field213.method1175((byte) -99);
            arg3.field1689 = var7 >> 16;
            arg3.field1746 = (var7 & 0xFFFF) + class23.field561;
            arg3.field1739 = 0;
            arg3.field1705 = 0;
            if (arg3.field1682 == 65535) {
                arg3.field1682 = -1;
            }
            if (class23.field561 < arg3.field1746) {
                arg3.field1739 = -1;
            }
        }
        if ((arg1 & 0x10) != 0) {
            int var8 = class10.field213.method1200((byte) 126);
            int var9 = class10.field213.method1170((byte) 110);
            int var10 = class10.field213.method1173(false);
            int var11 = class10.field213.field3457;
            if (arg3.field1225 != null && arg3.field1247 != null) {
                boolean var12 = false;
                long var13 = arg3.field1225.method447(12074);
                if (var9 <= 1) {
                    for (int var15 = 0; var15 < class76.field1863; var15++) {
                        if (class5.field110[var15] == var13) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && class10.field217 == 0) {
                    class5.field103.field3457 = 0;
                    class10.field213.method1168(var10, 0, class5.field103.field3473, -1257469104);
                    class5.field103.field3457 = 0;
                    class59 var16 = class156.method1150(class38.method292((byte) -113, class5.field103).method439((byte) 86));
                    arg3.field1697 = var16.method429(43);
                    arg3.field1687 = var8 >> 8;
                    arg3.field1738 = var8 & 0xFF;
                    arg3.field1720 = 150;
                    if (var9 == 2 || var9 == 3) {
                        class127.method972(var16, class46.method358(new class59[] { class8.field155, arg3.field1225 }, (byte) -75), 1, 26018);
                    } else if (var9 == 1) {
                        class127.method972(var16, class46.method358(new class59[] { class115.field2711, arg3.field1225 }, (byte) -75), 1, 26018);
                    } else {
                        class127.method972(var16, arg3.field1225, 2, 26018);
                    }
                }
            }
            class10.field213.field3457 = var10 + var11;
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field1750 = class10.field213.method1173(false);
            arg3.field1755 = class10.field213.method1199(124);
            arg3.field1736 = class10.field213.method1199(-92);
            arg3.field1731 = class10.field213.method1173(false);
            arg3.field1707 = class10.field213.method1161((byte) 60) + class23.field561;
            arg3.field1725 = class10.field213.method1161((byte) 60) + class23.field561;
            arg3.field1694 = class10.field213.method1194(false);
            arg3.field1715 = 1;
            arg3.field1681 = 0;
        }
        if ((arg1 & 0x200) != 0) {
            int var17 = class10.field213.method1170((byte) -36);
            int var18 = class10.field213.method1199(-94);
            arg3.method550(var18, (byte) -25, class23.field561, var17);
            arg3.field1684 = class23.field561 + 300;
            arg3.field1695 = class10.field213.method1170((byte) -19);
            arg3.field1696 = class10.field213.method1170((byte) -58);
        }
        if ((arg1 & 0x2) != 0) {
            int var19 = class10.field213.method1199(108);
            int var20 = class10.field213.method1194(false);
            arg3.method550(var20, (byte) -25, class23.field561, var19);
            arg3.field1684 = class23.field561 + 300;
            arg3.field1695 = class10.field213.method1173(false);
            arg3.field1696 = class10.field213.method1173(false);
        }
        if ((arg1 & 0x8) == 0) {
            return;
        }
        int var21 = class10.field213.method1194(false);
        byte[] var22 = new byte[var21];
        class157 var23 = new class157(var22);
        class10.field213.method1182(var22, 0, (byte) -120, var21);
        class46.field1176[arg0] = var23;
        arg3.method384(var23, 73);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V")
    public static final void method389(int arg0, int arg1, int arg2, boolean arg3) {
        field1265++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -21844) {
            method389(78, -27, 41, true);
        }
        class159.field3648 = arg1;
        class25.field626 = arg2;
        class25.field632 = arg3;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1261[var0] = var1;
        }
        field1272 = class59.method433(0, "Sorry invited players only)3");
        field1274 = field1272;
        field1273 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
        field1270 = class59.method433(0, "Die Verbindung konnte");
        field1277 = new class82(100);
        field1278 = class59.method433(0, "Sie haben gerade eine andere Welt verlassen)3");
        field1280 = 0;
        field1284 = class59.method433(0, "(U0a )2 via: ");
        field1285 = class59.method433(0, "Login limit exceeded)3");
        field1282 = field1285;
        field1279 = class59.method433(0, " <col=ffff00>");
    }
}
