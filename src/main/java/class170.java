import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class170 extends class203 {

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[Lfl;")
    public class83[] field2766;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Lmh;")
    public static class62 field2763 = class201.method1405(true, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "[Lfh;")
    public static class112[] field2765 = new class112[27];

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Ljd;")
    public static class241 field2772 = new class241(5000);

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "Lmh;")
    public static class62 field2775 = class201.method1405(true, "mapflag");

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lmh;")
    public static class62 field2776 = class201.method1405(true, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "Z")
    public static boolean field2777 = true;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 8)
    public static void method1218(int arg0) {
        if (arg0 != -10663) {
            return;
        }
        field2772 = null;
        field2765 = null;
        field2776 = null;
        field2775 = null;
        field2763 = null;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Lld;", line = 22)
    public static final class269 method1219(int arg0) {
        field2759++;
        try {
            int var1 = 55 / ((-arg0 - 61) / 39);
            return (class269) Class.forName("tk").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILmh;)I", line = 44)
    public static final int method1220(int arg0, class62 arg1) {
        field2774++;
        for (int var2 = arg0; var2 < class141.field2258.length; var2++) {
            if (class141.field2258[var2].method436(arg1, 32)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIB)I", line = 75)
    public static final int method1221(int arg0, int arg1, byte arg2) {
        field2768++;
        if (arg2 != -98) {
            field2769 = -1;
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLmi;)Lra;", line = 98)
    public static final class120 method1222(byte arg0, class92 arg1) {
        field2760++;
        if (arg0 != 20) {
            field2763 = (class62) null;
        }
        return new class120(arg1.method699((byte) -42), arg1.method699((byte) -82), arg1.method699((byte) -76), arg1.method699((byte) -57), arg1.method737(-1), arg1.method702(-1));
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z", line = 109)
    public final boolean method1223(int arg0, byte arg1) {
        field2764++;
        return arg1 >= -106 ? false : this.field2766[arg0].field1366;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BZ)V", line = 121)
    public static final void method1224(byte arg0, boolean arg1) {
        field2771++;
        if ((class268.field4551.field3821 >> 7) == class152.field2398 && (class268.field4551.field3814 >> 7) == class236.field4062) {
            class152.field2398 = 0;
        }
        int var2 = -26 % ((arg0 - 7) / 38);
        int var3 = class118.field1975;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            long var5;
            class153 var7;
            if (arg1) {
                var7 = class268.field4551;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class98.field1617[var4] << 32;
                var7 = class5.field50[class98.field1617[var4]];
            }
            if (var7 != null && var7.method1100(26422)) {
                var7.field2428 = false;
                if ((class74.field1157 && class118.field1975 > 200 || class118.field1975 > 50) && !arg1 && var7.field3879 == var7.field3876) {
                    var7.field2428 = true;
                }
                int var8 = var7.field3821 >> 7;
                int var9 = var7.field3814 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var7.field2423 == null || var7.field2422 > class199.field3367 || class199.field3367 >= var7.field2445) {
                        if (var7.method1101(true) == 1 && (var7.field3821 & 0x7F) == 64 && (var7.field3814 & 0x7F) == 64) {
                            if (class134.field2179[var8][var9] == class282.field4815) {
                                continue;
                            }
                            class134.field2179[var8][var9] = class282.field4815;
                        }
                        var7.field3819 = class165.method1186((byte) -58, var7.field3814, var7.field3821, class7.field85);
                        class80.method618(class7.field85, var7.field3821, var7.field3814, var7.field3819, (var7.method1101(true) - 1) * 64 + 60, var7, var7.field3856, var5, var7.field3839);
                    } else {
                        var7.field2428 = false;
                        var7.field3819 = class165.method1186((byte) -58, var7.field3814, var7.field3821, class7.field85);
                        class308.method2100(class7.field85, var7.field3821, var7.field3814, var7.field3819, var7, var7.field3856, var5, var7.field2416, var7.field2433, var7.field2414, var7.field2443);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lgi;BILmi;)V", line = 213)
    public static final void method1225(class285 arg0, byte arg1, int arg2, class92 arg3) {
        field2761++;
        class16 var4 = new class16();
        var4.field139 = arg3.method702(-1);
        var4.field137 = arg3.method704(arg1 ^ 0xA6000612);
        var4.field138 = new int[var4.field139];
        var4.field149 = new int[var4.field139];
        var4.field147 = new class147[var4.field139];
        var4.field142 = new byte[var4.field139][][];
        var4.field145 = new class147[var4.field139];
        var4.field140 = new int[var4.field139];
        for (int var5 = 0; var5 < var4.field139; var5++) {
            try {
                int var6 = arg3.method702(-1);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg3.method696((byte) 83).method404(-231));
                    int var8 = 0;
                    String var9 = new String(arg3.method696((byte) 39).method404(-231));
                    if (var6 == 1) {
                        var8 = arg3.method704(arg1 + 1509947918);
                    }
                    var4.field149[var5] = var6;
                    var4.field138[var5] = var8;
                    var4.field145[var5] = arg0.method1938(class143.method1052(var7, 125), 110, var9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method696((byte) 92).method404(arg1 ^ 0x9B));
                    String var11 = new String(arg3.method696((byte) -117).method404(-231));
                    int var12 = arg3.method702(arg1 + 125);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method696((byte) -93).method404(-231));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method704(1509947792);
                            var15[var16] = new byte[var17];
                            arg3.method740(var17, 0, var15[var16], true);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field149[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class143.method1052(var13[var19], 79);
                    }
                    var4.field147[var5] = arg0.method1949(var18, class143.method1052(var10, 41), var11, true);
                    var4.field142[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field140[var5] = -1;
            } catch (SecurityException var26) {
                var4.field140[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field140[var5] = -3;
            } catch (Exception var28) {
                var4.field140[var5] = -4;
            } catch (Throwable var29) {
                var4.field140[var5] = -5;
            }
        }
        if (arg1 != -126) {
            field2776 = (class62) null;
        }
        class15.field130.method330(var4, arg1 ^ 0xFFFFFFEF);
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 325)
    public static final void method1226(int arg0) {
        if (arg0 != 2) {
            field2769 = -62;
        }
        field2762++;
        int var1 = class244.method1710(-28075);
        if (var1 == 0) {
            class15.field121 = (byte[][][]) null;
            class275.method1880(0, (byte) 116);
        } else if (var1 == 1) {
            class216.method1533(-66, (byte) 0);
            class275.method1880(512, (byte) 126);
            class1.method1(-1803);
        } else {
            class216.method1533(-114, (byte) (class282.field4815 - 4 & 0xFF));
            class275.method1880(2, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)Lmh;", line = 356)
    public static final class62 method1227(int arg0, long arg1) {
        field2773++;
        if (arg1 <= (long) arg0 || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class114.field1923[(int) (var7 - (arg1 * 37L))];
            }
            class62 var9 = new class62();
            var9.field906 = var6;
            var9.field893 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lhi;Lhi;IZ)V", line = 397)
    public class170(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        class52 var5 = new class52();
        int var6 = arg0.method159(arg2, true);
        this.field2766 = new class83[var6];
        int[] var7 = arg0.method142(98, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method157(var7[var8], arg2, (byte) 19);
            class289 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class289 var12 = (class289) var5.method334(-18673); var12 != null; var12 = (class289) var5.method335((byte) 121)) {
                if (var12.field4926 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method135(var11, (byte) -82, 0);
                } else {
                    var13 = arg1.method135(0, (byte) -82, var11);
                }
                var10 = new class289(var11, var13);
                var5.method330(var10, -74);
            }
            this.field2766[var7[var8]] = new class83(var9, var10);
        }
    }
}
