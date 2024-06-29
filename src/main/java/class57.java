import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 implements Runnable {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lva;")
    private static class121 field1318 = class107.method797("Enter amount:", -10983);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lva;")
    private static class121 field1324 = class107.method797("white:", -10983);

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lva;")
    public static class121 field1332 = field1324;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lva;")
    public static class121 field1330 = field1318;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lva;")
    private static class121 field1322 = class107.method797("Report abuse", -10983);

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lva;")
    public static class121 field1334 = field1322;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1329 = 0;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1323 = -1;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lm;")
    public static class72 field1331;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[[B")
    public static byte[][] field1320;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 5)
    public static void method413(int arg0) {
        field1331 = null;
        field1318 = null;
        field1334 = null;
        field1322 = null;
        if (arg0 == 255) {
            field1324 = null;
            field1320 = null;
            field1330 = null;
            field1332 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 25)
    public static final void method414(byte arg0) {
        field1326++;
        while (class66.field1578.method619(class5.field90, (byte) 89) >= 11) {
            int var1 = class66.field1578.method626(11, -127);
            if (var1 == 2047) {
                break;
            }
            if (class127.field2895[var1] == null) {
                class127.field2895[var1] = new class77();
                if (class14.field254[var1] != null) {
                    class127.field2895[var1].method530(class14.field254[var1], false);
                }
            }
            class71.field1680[class13.field231++] = var1;
            class77 var2 = class127.field2895[var1];
            var2.field722 = class115.field2614;
            int var3 = class66.field1578.method626(1, -113);
            if (var3 == 1) {
                class15.field274[class92.field2087++] = var1;
            }
            int var4 = class66.field1578.method626(5, -68);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class66.field1578.method626(1, -61);
            int var6 = class66.field1578.method626(5, -87);
            if (var6 > 15) {
                var6 -= 32;
            }
            var2.method233(class62.field1494.field730[0] + var6, var5 == 1, false, class62.field1494.field767[0] + var4);
        }
        class66.field1578.method620(0);
        if (arg0 > -99) {
            field1332 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILhe;IB)Lbc;", line = 93)
    public static final class10 method415(int arg0, class47 arg1, int arg2, byte arg3) {
        field1317++;
        if (arg3 > -22) {
            field1323 = -23;
        }
        return class5.method36(arg0, 29066, arg1, arg2) ? class4.method29(0) : null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Lhd;", line = 114)
    public static final class46 method416(byte arg0, int arg1) {
        field1321++;
        class46 var2 = (class46) class129.field2975.method345(123, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class46 var3 = class58.method419(class53.field1223, class113.field2555, false, arg1, 536870911);
        if (var3 != null) {
            class129.field2975.method350((byte) 123, var3, (long) arg1);
        }
        return arg0 < 96 ? null : var3;
    }

    @OriginalMember(owner = "client!jc", name = "run", descriptor = "()V", line = 160)
    public final void run() {
        field1335++;
        try {
            while (true) {
                class9 var1 = class15.field294;
                class101 var2;
                synchronized (class15.field294) {
                    var2 = (class101) class15.field294.method57((byte) 86);
                }
                if (var2 == null) {
                    class113.method833(100L, true);
                    Object var3 = class108.field2458;
                    synchronized (class108.field2458) {
                        if (class90.field2035 <= 1) {
                            class90.field2035 = 0;
                            class108.field2458.notifyAll();
                            return;
                        }
                        class90.field2035--;
                    }
                } else {
                    if (var2.field2254 == 0) {
                        var2.field2252.method496(var2.field2263, (byte) 72, (int) var2.field577, var2.field2263.length);
                        class9 var5 = class15.field294;
                        synchronized (class15.field294) {
                            var2.method187((byte) 39);
                        }
                    } else if (var2.field2254 == 1) {
                        var2.field2263 = var2.field2252.method495((int) var2.field577, -1319);
                        class9 var4 = class15.field294;
                        synchronized (class15.field294) {
                            class50.field1194.method64(var2, (byte) 79);
                        }
                    }
                    Object var6 = class108.field2458;
                    synchronized (class108.field2458) {
                        if (class90.field2035 <= 1) {
                            class90.field2035 = 0;
                            class108.field2458.notifyAll();
                            return;
                        }
                        class90.field2035 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class119.method920(true, null, var17);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 260)
    public static final void method417(int arg0) {
        field1327++;
        class96.method656(-47, false);
        boolean var1 = true;
        class69.field1645 = 0;
        for (int var2 = 0; var2 < class47.field1104.length; var2++) {
            if (class96.field2147[var2] != -1 && class47.field1104[var2] == null) {
                class47.field1104[var2] = class69.field1665.method315(class96.field2147[var2], true, 0);
                if (class47.field1104[var2] == null) {
                    class69.field1645++;
                    var1 = false;
                }
            }
            if (class19.field495[var2] != -1 && class80.field1866[var2] == null) {
                class80.field1866[var2] = class69.field1665.method322(0, (byte) 97, class118.field2684[var2], class19.field495[var2]);
                if (class80.field1866[var2] == null) {
                    var1 = false;
                    class69.field1645++;
                }
            }
        }
        if (!var1) {
            class79.field1845 = 1;
            return;
        }
        class71.field1675 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class47.field1104.length; var4++) {
            byte[] var56 = class80.field1866[var4];
            if (var56 != null) {
                int var57 = (class45.field1062[var4] >> 8) * 64 - class129.field2977;
                int var58 = (class45.field1062[var4] & 0xFF) * 64 - class9.field132;
                if (class86.field1984) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class128.method1000(var56, (byte) -104, var58, var57);
            }
        }
        if (!var3) {
            class79.field1845 = 2;
            return;
        }
        if (arg0 != -1975) {
            field1318 = null;
        }
        if (class79.field1845 != 0) {
            class71.method491(true, class53.field1234, 1932, class115.field2616);
        }
        class97.method658((byte) 89);
        class58.field1348.method755();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class18.field385[var5].method124(-111);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class23.field613[var6][var54][var55] = 0;
                }
            }
        }
        class69.method489((byte) -126);
        int var7 = class47.field1104.length;
        class96.method656(-99, true);
        if (!class86.field1984) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class45.field1062[var8] >> 8) * 64 - class129.field2977;
                int var18 = (class45.field1062[var8] & 0xFF) * 64 - class9.field132;
                byte[] var19 = class47.field1104[var8];
                if (var19 != null) {
                    class80.method552(-65, class100.field2221 * 8 - 48, class18.field385, var19, var18, class60.field1448 * 8 - 48, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class45.field1062[var9] & 0xFF) * 64 - class9.field132;
                int var15 = (class45.field1062[var9] >> 8) * 64 - class129.field2977;
                byte[] var16 = class47.field1104[var9];
                if (var16 == null && class100.field2221 < 800) {
                    class25.method200(64, var14, var15, false, 64);
                }
            }
            class96.method656(-65, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class80.field1866[var10];
                if (var11 != null) {
                    int var12 = (class45.field1062[var10] >> 8) * 64 - class129.field2977;
                    int var13 = (class45.field1062[var10] & 0xFF) * 64 - class9.field132;
                    class114.method874(-2307, var13, class58.field1348, var11, var12, class18.field385);
                }
            }
        }
        if (class86.field1984) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class46.field1082[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + (var41 / 8);
                            for (int var43 = 0; var43 < class45.field1062.length; var43++) {
                                if (class45.field1062[var43] == var42 && class47.field1104[var43] != null) {
                                    class81.method558((byte) -83, var20, (var40 & 0x7) * 8, class18.field385, var39, (var41 & 0x7) * 8, var38, var34 * 8, var35 * 8, class47.field1104[var43]);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class53.method377(var20, var35 * 8, var34 * 8, -114);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class46.field1082[0][var21][var32];
                    if (var33 == -1) {
                        class25.method200(8, var32 * 8, var21 * 8, false, 8);
                    }
                }
            }
            class96.method656(arg0 + 1878, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class46.field1082[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 24 & 0x3;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var27 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class45.field1062.length; var31++) {
                                if (class45.field1062[var31] == var30 && class80.field1866[var31] != null) {
                                    class128.method998(var28, (var29 & 0x7) * 8, var22, class80.field1866[var31], var26, true, var24 * 8, class18.field385, (var27 & 0x7) * 8, class58.field1348, var23 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class96.method656(-106, true);
        class97.method658((byte) 79);
        class12.method100(class18.field385, class58.field1348, -15456);
        class96.method656(-45, true);
        int var44 = class12.field208;
        if (var44 > class121.field2807) {
            var44 = class121.field2807;
        }
        if (class121.field2807 - 1 > var44) {
            int var45 = class121.field2807 - 1;
        }
        if (class38.field879) {
            class58.field1348.method760(class12.field208);
        } else {
            class58.field1348.method760(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class95.method643(var46, var53, false);
            }
        }
        class54.method380(arg0 - 9326);
        class33.field814.method347(true);
        if (class126.field2863 != null) {
            class15.field290++;
            class60.field1437.method622(171, true);
            class60.field1437.method867((byte) -66, 1057001181);
        }
        if (!class86.field1984) {
            int var47 = (class60.field1448 - 6) / 8;
            int var48 = (class100.field2221 - 6) / 8;
            int var49 = (class60.field1448 + 6) / 8;
            int var50 = (class100.field2221 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var48 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var49 < var51 || var52 < var48 || var52 > var50) {
                        class69.field1665.method316(class113.method866((byte) -71, new class121[] { class69.field1660, class35.method242(var51, 10), class115.field2629, class35.method242(var52, arg0 + 1985) }), arg0 ^ 0xFFFFF824);
                        class69.field1665.method316(class113.method866((byte) -110, new class121[] { class15.field303, class35.method242(var51, arg0 ^ 0xFFFFF843), class115.field2629, class35.method242(var52, arg0 + 1985) }), 63);
                    }
                }
            }
        }
        if (class63.field1525 == -1) {
            class60.method437((byte) 67, 30);
        } else {
            class60.method437((byte) 67, 35);
        }
        class23.method191(-3);
        class60.field1437.method622(140, true);
        class127.method989(arg0 + 1975);
    }
}
