import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class110 extends InputStream {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1858 = -1;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[Z")
    public static boolean[] field1859 = new boolean[200];

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1869 = -1;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Z")
    public static boolean field1863 = false;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lph;")
    public static class229 field1864 = class266.method1858("um", 0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lkb;")
    public static class89 field1870;

    @OriginalMember(owner = "client!pj", name = "read", descriptor = "()I", line = 9)
    public final int read() {
        field1868++;
        class288.method1976((byte) 85, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 18)
    public static final void method834(String arg0, Throwable arg1, int arg2) {
        field1867++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class240.method1689(arg1, (byte) -82);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class330.method2260(var3, 2036340808);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class332.field5646.field1561 == null) {
                return;
            }
            if (arg2 != -1) {
                method834((String) null, (Throwable) null, 65);
            }
            class247 var8 = class332.field5646.method684(0, new URL(class332.field5646.field1561.getCodeBase(), "clienterror.ws?c=" + class282.field4668 + "&u=" + class260.field4348 + "&v1=" + class92.field1549 + "&v2=" + class92.field1559 + "&e=" + var7));
            while (var8.field4125 == 0) {
                class288.method1976((byte) 107, 1L);
            }
            if (var8.field4125 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field4123;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 69)
    public static void method835(int arg0) {
        if (arg0 != 38) {
            method840(false);
        }
        field1870 = null;
        field1859 = null;
        field1864 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 83)
    public static final void method836(boolean arg0) {
        if (class121.field2031 != null) {
            class121.field2031.method534(-1);
            class121.field2031 = null;
        }
        field1862++;
        class252.method1769((byte) -8);
        class321.method2177();
        for (int var1 = 0; var1 < 4; var1++) {
            class160.field2592[var1].method818(-90);
        }
        class154.method1116(-1, false);
        System.gc();
        class176.method1271(-125, 2);
        class300.field4870 = arg0;
        class187.field3048 = -1;
        class162.method1145(true, (byte) 16);
        class95.field1611 = 0;
        class1.field1 = 0;
        class1.field9 = 0;
        class124.field2083 = false;
        class122.field2054 = 0;
        for (int var2 = 0; var2 < class162.field2606.length; var2++) {
            class162.field2606[var2] = null;
        }
        class253.field4233 = 0;
        class139.field2248 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class114.field1931[var3] = null;
            class72.field1232[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class187.field3035[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class8.field108[var5][var6][var7] = null;
                }
            }
        }
        class50.method352((byte) -10);
        class332.field5660 = 0;
        class45.method332(0);
        class129.method933(-3, true);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lcl;", line = 180)
    public static final class32 method837(int arg0) {
        class32 var1 = new class32(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], class279.field4623[0], class314.field5346);
        if (arg0 != -6859) {
            field1859 = (boolean[]) null;
        }
        field1865++;
        class214.method1517(-25672);
        return var1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)Ltc;", line = 194)
    public static final class282 method838(int arg0, boolean arg1) {
        field1857++;
        class282 var2 = (class282) class241.field3984.method1413((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class89.field1508.method523(-79, arg0, 4);
        if (arg1) {
            method837(-85);
        }
        class282 var4 = new class282();
        if (var3 != null) {
            var4.method1941(new class164(var3), 13915, arg0);
        }
        class241.field3984.method1419((long) arg0, 5216, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[Loi;[BIIIIZII)V", line = 224)
    public static final void method839(int arg0, int arg1, class108[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1860++;
        if (arg7 > -65) {
            method836(true);
        }
        class164 var11 = new class164(arg3);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1154((byte) 118);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1209(-128);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFE9) >> 6;
                int var17 = var14 & 0x3F;
                int var18 = var11.method1178(8);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                int var21 = var14 >> 12;
                if (arg0 == var21 && arg4 <= var16 && var16 < arg4 + 8 && var17 >= arg5 && (arg5 + 8) > var17) {
                    class83 var22 = class260.method1807(false, var12);
                    int var23 = arg1 + class71.method557(var16 & 0x7, var22.field1434, var22.field1424, var20, arg9, var17 & 0x7, 81);
                    int var24 = arg6 + class107.method805(arg9, var22.field1424, var20, var17 & 0x7, (byte) 121, var16 & 0x7, var22.field1434);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class108 var25 = null;
                        if (!arg8) {
                            int var26 = arg10;
                            if ((class245.field4050[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg2[var26];
                            }
                        }
                        class213.method1509(arg9 + var20 & 0x3, arg8, false, var23, var24, var19, !arg8, arg10, arg10, var25, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V", line = 305)
    public static final void method840(boolean arg0) {
        if (arg0) {
            class225.field3705 = class324.field5533;
            class192.field3174 = class203.field3346;
            class215.field3544 = class132.field2142;
        } else {
            class225.field3705 = class277.field4604;
            class192.field3174 = class103.field1753;
            class215.field3544 = class37.field600;
        }
        class206.field3397 = class225.field3705.length;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I", line = 341)
    public static final int method841(int arg0) {
        field1866++;
        try {
            if (arg0 != 1001) {
                method840(true);
            }
            if (class149.field2414 == 0) {
                if (class130.method935(false) - 5000L < class111.field1882) {
                    return 0;
                }
                class314.field5339 = class249.field4143.method683(class313.field5273, arg0 ^ 0x3E9, class147.field2376);
                class122.field2048 = class130.method935(false);
                class149.field2414 = 1;
            }
            if ((class122.field2048 + 30000L) < class130.method935(false)) {
                return class100.method769(1000, (byte) -17);
            }
            if (class149.field2414 == 1) {
                if (class314.field5339.field4125 == 2) {
                    return class100.method769(1001, (byte) -17);
                }
                if (class314.field5339.field4125 != 1) {
                    return -1;
                }
                class121.field2031 = new class67((Socket) class314.field5339.field4123, class249.field4143);
                int var1 = 0;
                class314.field5339 = null;
                if (class229.field3762) {
                    var1 = class216.field3556;
                }
                class121.field2033.field2670 = 0;
                class121.field2033.method1188(arg0 - 1127, 131);
                class121.field2033.method1168(var1, (byte) -71);
                class121.field2031.method527(class121.field2033.field2668, arg0 ^ 0x52E8, class121.field2033.field2670, 0);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (field1870 != null) {
                    field1870.method662((byte) 93);
                }
                int var2 = class121.field2031.method529(-27959);
                if (class307.field5177 != null) {
                    class307.field5177.method662((byte) 93);
                }
                if (field1870 != null) {
                    field1870.method662((byte) 93);
                }
                if (var2 != 0) {
                    return class100.method769(var2, (byte) -17);
                }
                class149.field2414 = 2;
            }
            if (class149.field2414 == 2) {
                if (class121.field2031.method525(false) < 2) {
                    return -1;
                }
                class262.field4387 = class121.field2031.method529(-27959);
                class262.field4387 <<= 0x8;
                class262.field4387 += class121.field2031.method529(-27959);
                class63.field924 = new byte[class262.field4387];
                class149.field2414 = 3;
                class4.field43 = 0;
            }
            if (class149.field2414 != 3) {
                return -1;
            }
            int var3 = class121.field2031.method525(false);
            if (var3 < 1) {
                return -1;
            }
            if ((class262.field4387 - class4.field43) < var3) {
                var3 = class262.field4387 - class4.field43;
            }
            class121.field2031.method532(false, var3, class4.field43, class63.field924);
            class4.field43 += var3;
            if (class262.field4387 > class4.field43) {
                return -1;
            } else if (class205.method1433(class63.field924, 98)) {
                class240.field3967 = new class134[class57.field812];
                int var4 = 0;
                for (int var5 = class124.field2081; var5 <= class287.field4718; var5++) {
                    class134 var6 = class183.method1294(var5, (byte) 125);
                    if (var6 != null) {
                        class240.field3967[var4++] = var6;
                    }
                }
                class121.field2031.method534(arg0 - 1002);
                class226.field3711 = 0;
                class121.field2031 = null;
                class63.field924 = null;
                class149.field2414 = 0;
                class111.field1882 = class130.method935(false);
                return 0;
            } else {
                return class100.method769(1002, (byte) -17);
            }
        } catch (IOException var8) {
            return class100.method769(1003, (byte) -17);
        }
    }
}
