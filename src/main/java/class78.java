import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class78 extends class113 {

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Ljb;")
    private class56 field1981;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Lhb;")
    public static class44 field1958 = class102.method810("Icons redrawn", -28606);

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lhb;")
    public static class44 field1967 = class102.method810("Okay", -28606);

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Lhb;")
    private static class44 field1965 = class102.method810("Moderator option: Mute player for 48 hours: <ON>", -28606);

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Lhb;")
    public static class44 field1963 = class102.method810("Untersuchen", -28606);

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lhb;")
    public static class44 field1968 = class102.method810("0(U", -28606);

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Lhb;")
    public static class44 field1979 = class102.method810("Lade Schrifts-=tze )2 ", -28606);

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "Lhb;")
    public static class44 field1978 = class102.method810("@cya@", -28606);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Lhb;")
    public static class44 field1971 = class102.method810(" zuerst von Ihrer Freunde)2Liste(Q", -28606);

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Lhb;")
    public static class44 field1970 = field1965;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field1962;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Ltd;")
    public static class116 field1966;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lva;")
    private class123 field1957;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lpc;")
    public static class93 field1956;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Z")
    private boolean field1964;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
    private boolean field1972;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "[B")
    private byte[] field1974;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[Lhc;")
    public static class45[] field1950;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V", line = 4)
    public static final void method644(int arg0) {
        for (int var1 = 0; var1 < class81.field2080; var1++) {
            int var2 = class96.field2446[var1];
            class46 var3 = class116.field2845[var2];
            int var4 = class53.field1304.method971(true);
            if ((var4 & 0x40) != 0) {
                var3.field1413 = class53.field1304.method991((byte) -85);
                var3.field1380 = class53.field1304.method1001(65280);
            }
            if ((var4 & 0x10) != 0) {
                var3.field1137 = class118.method913(class53.field1304.method1001(65280), (byte) -101);
                var3.field1373 = var3.field1137.field1022;
                var3.field1356 = var3.field1137.field1007;
                var3.field1333 = var3.field1137.field1028;
                var3.field1370 = var3.field1137.field1020;
                var3.field1422 = var3.field1137.field997;
                var3.field1390 = var3.field1137.field999;
                var3.field1388 = var3.field1137.field995;
                var3.field1417 = var3.field1137.field978;
                var3.field1391 = var3.field1137.field994;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class53.field1304.method1020(-120);
                int var6 = class53.field1304.method995(-31);
                var3.method510(var6, class2.field73, var5, (byte) -30);
                var3.field1342 = class2.field73 + 300;
                var3.field1392 = class53.field1304.method1020(-106);
                var3.field1367 = class53.field1304.method971(true);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1387 = class53.field1304.method976(-121);
                var3.field1372 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class53.field1304.method991((byte) -85);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class53.field1304.method995(arg0 + 4406);
                if (var3.field1415 == var7 && var7 != -1) {
                    int var9 = client.method139(arg0 + 4456, var7).field2899;
                    if (var9 == 1) {
                        var3.field1359 = var8;
                        var3.field1369 = 0;
                        var3.field1393 = 0;
                        var3.field1410 = 0;
                    }
                    if (var9 == 2) {
                        var3.field1393 = 0;
                    }
                } else if (var7 == -1 || var3.field1415 == -1 || client.method139(1, var7).field2900 >= client.method139(arg0 ^ 0xFFFFEE98, var3.field1415).field2900) {
                    var3.field1369 = 0;
                    var3.field1410 = 0;
                    var3.field1415 = var7;
                    var3.field1393 = 0;
                    var3.field1402 = var3.field1378;
                    var3.field1359 = var8;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class53.field1304.method1020(-117);
                int var11 = class53.field1304.method995(-106);
                var3.method510(var11, class2.field73, var10, (byte) -30);
                var3.field1342 = class2.field73 + 300;
                var3.field1392 = class53.field1304.method972((byte) 88);
                var3.field1367 = class53.field1304.method995(-49);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1375 = class53.field1304.method969(true);
                if (var3.field1375 == 65535) {
                    var3.field1375 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1353 = class53.field1304.method1001(arg0 + 69735);
                int var12 = class53.field1304.method973(-4);
                var3.field1363 = var12 >> 16;
                var3.field1360 = 0;
                if (var3.field1353 == 65535) {
                    var3.field1353 = -1;
                }
                var3.field1362 = (var12 & 0xFFFF) + class2.field73;
                var3.field1377 = 0;
                if (class2.field73 < var3.field1362) {
                    var3.field1377 = -1;
                }
            }
        }
        if (arg0 == -4455) {
            field1973++;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 165)
    public static void method645(byte arg0) {
        field1968 = null;
        field1967 = null;
        if (arg0 >= -36) {
            return;
        }
        field1970 = null;
        field1956 = null;
        field1966 = null;
        field1965 = null;
        field1958 = null;
        field1979 = null;
        field1971 = null;
        field1950 = null;
        field1963 = null;
        field1978 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)V", line = 201)
    public final void method45(int arg0, byte arg1, int arg2) {
        field1980++;
        if (arg2 == 0) {
            arg2 = 1;
        }
        int var4 = class31.method312(true, arg2) - arg0;
        if (this.field1957 != null) {
            this.field1962 = var4;
        } else if (this.field1972) {
            try {
                class20.method150(this.field1981.field1431, 26572, "midibox.volume=" + var4 + ";");
            } catch (Throwable var6) {
            }
        }
        int var5 = -128 % ((-arg1 - 28) / 57);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 228)
    public final void method51(int arg0) {
        field1976++;
        if (this.field1957 == null || this.field1957.field2998 == 0) {
            return;
        }
        if (this.field1957.field2998 == 1) {
            class114 var2 = (class114) this.field1957.field2995;
            try {
                var2.method869(0, this.field1974, (byte) -90, this.field1974.length);
                var2.method868(-21426);
                try {
                    class20.method150(this.field1981.field1431, 26572, "midibox.loop=" + (this.field1964 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method867(1).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1962 + ";");
                    this.field1972 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method868(-21426);
                } catch (Exception var3) {
                }
            }
        }
        this.field1957 = null;
        if (arg0 < 55) {
            this.method51(68);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)V", line = 275)
    public final void method49(boolean arg0, int arg1) {
        field1960++;
        if (arg0) {
            method647(95, null);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V", line = 289)
    public static final void method646(boolean arg0) {
        field1953++;
        if (!arg0) {
            return;
        }
        for (class125 var1 = (class125) class96.field2437.method443((byte) -111); var1 != null; var1 = (class125) class96.field2437.method434(arg0)) {
            if (var1.field3007 == -1) {
                var1.field3006 = 0;
                class69.method592(var1, -121);
            } else {
                var1.method948(-76);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 317)
    public final void method47(int arg0) {
        field1955++;
        if (arg0 <= 44) {
            this.field1974 = null;
        }
        if (this.field1972) {
            try {
                class20.method150(this.field1981.field1431, 26572, "midibox.src=\"c:/silence.mid\";");
            } catch (Throwable var2) {
            }
            this.field1972 = false;
        }
        this.field1957 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZBI[B)V", line = 343)
    public final void method46(boolean arg0, byte arg1, int arg2, byte[] arg3) {
        field1961++;
        this.field1957 = this.field1981.method526(91);
        if (this.field1957 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        this.field1962 = class31.method312(true, arg2);
        this.field1974 = arg3;
        if (arg1 != -72) {
            method648(-11, false);
        }
        this.field1964 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 367)
    public static final void method647(int arg0, Component arg1) {
        field1952++;
        try {
            Method var2 = class56.field1424;
            if (var2 != null) {
                var2.invoke(arg1, Boolean.FALSE);
            }
        } catch (Throwable var3) {
        }
        if (arg0 != 17964) {
            method648(-87, true);
        }
        arg1.addKeyListener(class18.field358);
        arg1.addFocusListener(class18.field358);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 394)
    public final void method48(int arg0) {
        if (arg0 != -17036) {
            field1975 = 119;
        }
        field1977++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)V", line = 404)
    public static final void method648(int arg0, boolean arg1) {
        field1959++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class35.field847[arg0];
        int var3 = class62.field1568[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = class120.field2946[arg0];
        int var5 = class96.field2456[arg0];
        if (class79.field1990 != 0 && var3 != 1005) {
            class79.field1990 = 0;
            class16.field306 = true;
        }
        if (var3 == 54) {
            class89.field2273++;
            boolean var6 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            if (!var6) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class61.field1550 = class40.field902;
            class33.field792 = class57.field1508;
            class111.field2768 = 0;
            class71.field1742 = 2;
            class92.field2333.method702(true, 224);
            class92.field2333.method998(var5, false);
            class92.field2333.method998(class120.field2936 + var2, false);
            class92.field2333.method1021(class104.field2666 + var4, 128);
        }
        if (var3 == 9) {
            class92.field2333.method702(true, 25);
            field1949++;
            class92.field2333.method1011(class121.field2948, !arg1);
            class92.field2333.method983((byte) -110, class96.field2457);
            class92.field2333.method1011(var5, false);
            class92.field2333.method1017(6, class94.field2397);
            class92.field2333.method975(var2, false);
            class92.field2333.method1021(var4, 128);
            class102.field2592 = 2;
            field1975 = var4;
            class130.field3123 = var2;
            class122.field2981 = 0;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 18) {
            class116.method884(class74.field1886, (byte) -5);
            class74.field1886 = -1;
            class16.field306 = true;
        }
        if (var3 == 37) {
            class103 var8 = class82.field2110[var5];
            if (var8 != null) {
                class130.field3118++;
                class18.method123(false, (byte) 96, 1, 2, var8.field1350[0], 1, class72.field1820.field1350[0], var8.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class33.field792 = class57.field1508;
                class71.field1742 = 2;
                class111.field2768 = 0;
                class61.field1550 = class40.field902;
                class92.field2333.method702(true, 99);
                class92.field2333.method1011(var5, false);
                class92.field2333.method975(class33.field791, false);
            }
        }
        if (var3 == 1001) {
            class57.method541(127, var5, var2, var4);
            class5.field118++;
            class92.field2333.method702(true, 40);
            class92.field2333.method1017(123, class120.field2936 + var2);
            class92.field2333.method1017(-13, var5 >> 14 & 0x7FFF);
            class92.field2333.method1021(class104.field2666 + var4, 128);
        }
        if (var3 == 35) {
            class89.field2260++;
            class92.field2333.method702(true, 218);
            class92.field2333.method975(var2, false);
            class92.field2333.method1011(var5, false);
            class92.field2333.method998(var4, false);
            class122.field2981 = 0;
            class130.field3123 = var2;
            class102.field2592 = 2;
            field1975 = var4;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 19) {
            class46 var9 = class116.field2845[var5];
            if (var9 != null) {
                class18.method123(false, (byte) 96, 1, 2, var9.field1350[0], 1, class72.field1820.field1350[0], var9.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class100.field2530++;
                class71.field1742 = 2;
                class33.field792 = class57.field1508;
                class61.field1550 = class40.field902;
                class111.field2768 = 0;
                class92.field2333.method702(true, 232);
                class92.field2333.method1021(var5, 128);
            }
        }
        if (var3 == 1004) {
            class72 var10 = class90.method727(var2, -160);
            if (var10 == null || var10.field1824[var4] < 100000) {
                field1969++;
                class92.field2333.method702(true, 0);
                class92.field2333.method1021(var5, 128);
            } else {
                class49.method460(class117.method903(new class44[] { class116.method893(10, var10.field1824[var4]), class130.field3121, class42.method358(0, var5).field2004 }, !arg1), class51.field1274, (byte) 126, 0);
            }
            class122.field2981 = 0;
            class130.field3123 = var2;
            field1975 = var4;
            class102.field2592 = 2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 16) {
            class121.field2948 = var4;
            class48.field1195 = 1;
            class96.field2457 = var2;
            class94.field2397 = var5;
            class95.field2421 = class117.method903(new class44[] { class120.field2945, class42.method358(0, var5).field2004, class25.field583 }, false);
            class88.field2251 = true;
            if (class95.field2421 == null) {
                class95.field2421 = class49.field1207;
            }
            class44.field1071 = 0;
            return;
        }
        if (var3 == 26) {
            if (class15.field289) {
                class89.field2283.method279(var4 - 4, var2 + -4);
            } else {
                class89.field2283.method279(class57.field1508 - 4, class40.field902 + -4);
            }
        }
        if (var3 == 21) {
            class101.field2565++;
            boolean var11 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            if (!var11) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class71.field1742 = 2;
            class61.field1550 = class40.field902;
            class33.field792 = class57.field1508;
            class111.field2768 = 0;
            class92.field2333.method702(true, 138);
            class92.field2333.method1021(class120.field2936 + var2, 128);
            class92.field2333.method998(var5, false);
            class92.field2333.method1011(class104.field2666 + var4, false);
        }
        if (var3 == 6 || var3 == 49 || var3 == 10 || var3 == 20) {
            class44 var13 = class64.field1625[arg0];
            int var14 = var13.method388(0, class25.field583);
            if (var14 != -1) {
                long var15 = var13.method380(var14 + 5, (byte) 112).method384(true).method407(true);
                if (var3 == 6) {
                    class100.method792(var15, 21420);
                }
                if (var3 == 49) {
                    class79.method654(-116, var15);
                }
                if (var3 == 10) {
                    class23.method171((byte) 95, var15);
                }
                if (var3 == 20) {
                    class5.method40(var15, (byte) -104);
                }
            }
        }
        if (var3 == 40 && class57.method541(127, var5, var2, var4)) {
            field1954++;
            class92.field2333.method702(true, 37);
            class92.field2333.method1011(var5 >> 14 & 0x7FFF, false);
            class92.field2333.method1021(class120.field2936 + var2, 128);
            class92.field2333.method987(class33.field791, -121);
            class92.field2333.method1011(class104.field2666 + var4, false);
        }
        if (var3 == 1006) {
            class111.field2768 = 0;
            class71.field1742 = 2;
            field1969++;
            class61.field1550 = class40.field902;
            class33.field792 = class57.field1508;
            class92.field2333.method702(arg1, 0);
            class92.field2333.method1021(var5, 128);
        }
        if (var3 == 8) {
            class103 var17 = class82.field2110[var5];
            if (var17 != null) {
                class18.method123(false, (byte) 96, 1, 2, var17.field1350[0], 1, class72.field1820.field1350[0], var17.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class71.field1742 = 2;
                class75.field1898++;
                class33.field792 = class57.field1508;
                class61.field1550 = class40.field902;
                class111.field2768 = 0;
                class92.field2333.method702(arg1, 140);
                class92.field2333.method1011(var5, false);
            }
        }
        if (var3 == 12) {
            class86.field2209++;
            class92.field2333.method702(true, 105);
            class92.field2333.method1017(124, var4);
            class92.field2333.method990(var2, 66);
            class92.field2333.method1021(var5, 128);
            class102.field2592 = 2;
            field1975 = var4;
            class130.field3123 = var2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
            class122.field2981 = 0;
        }
        if (var3 == 30) {
            class103 var18 = class82.field2110[var5];
            if (var18 != null) {
                class18.method123(false, (byte) 96, 1, 2, var18.field1350[0], 1, class72.field1820.field1350[0], var18.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class71.field1742 = 2;
                class111.field2768 = 0;
                class61.field1550 = class40.field902;
                class33.field792 = class57.field1508;
                class92.field2333.method702(true, 204);
                class92.field2333.method1021(var5, 128);
                class53.field1308++;
            }
        }
        if (var3 == 48) {
            class57.method541(125, var5, var2, var4);
            class92.field2333.method702(true, 84);
            class16.field321++;
            class92.field2333.method1011(class120.field2936 + var2, false);
            class92.field2333.method1021(var4 + class104.field2666, 128);
            class92.field2333.method1021(var5 >> 14 & 0x7FFF, 128);
        }
        if (var3 == 4) {
            class57.method541(119, var5, var2, var4);
            class92.field2333.method702(arg1, 113);
            class92.field2333.method998(class104.field2666 + var4, false);
            class77.field1946++;
            class92.field2333.method1011(var5 >> 14 & 0x7FFF, false);
            class92.field2333.method1021(class120.field2936 + var2, 128);
        }
        if (var3 == 39 && class57.method541(127, var5, var2, var4)) {
            class92.field2333.method702(arg1, 128);
            class92.field2333.method1017(123, var5 >> 14 & 0x7FFF);
            class80.field2026++;
            class92.field2333.method1017(123, class104.field2666 + var4);
            class92.field2333.method990(class96.field2457, 70);
            class92.field2333.method1021(class94.field2397, 128);
            class92.field2333.method1017(126, class121.field2948);
            class92.field2333.method1017(-9, class120.field2936 + var2);
        }
        if (var3 == 27) {
            class46 var19 = class116.field2845[var5];
            if (var19 != null) {
                class18.method123(false, (byte) 96, 1, 2, var19.field1350[0], 1, class72.field1820.field1350[0], var19.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class33.field792 = class57.field1508;
                class111.field2768 = 0;
                class61.field1550 = class40.field902;
                class77.field1932++;
                class71.field1742 = 2;
                class92.field2333.method702(true, 92);
                class92.field2333.method1011(class121.field2948, !arg1);
                class92.field2333.method983((byte) -107, class96.field2457);
                class92.field2333.method1011(var5, false);
                class92.field2333.method1017(-52, class94.field2397);
            }
        }
        if (var3 == 13) {
            class57.method541(124, var5, var2, var4);
            class92.field2333.method702(true, 132);
            class92.field2333.method1017(-23, class120.field2936 + var2);
            class92.field2333.method1011(var5 >> 14 & 0x7FFF, false);
            class92.field2333.method1011(class104.field2666 + var4, !arg1);
            class44.field1100++;
        }
        if (var3 == 32) {
            class44 var20 = class64.field1625[arg0];
            int var21 = var20.method388(0, class25.field583);
            if (var21 != -1) {
                if (class125.field3032 == -1) {
                    class85.method688((byte) -25);
                    if (class5.field117 != -1) {
                        class51.field1255 = var20.method380(var21 + 5, (byte) 127).method384(true);
                        class130.field3116 = class125.field3032 = class5.field117;
                        class16.field310 = false;
                    }
                } else {
                    class49.method460(class128.field3068, class51.field1274, (byte) 117, 0);
                }
            }
        }
        if (var3 == 5) {
            class92.field2333.method702(true, 129);
            class92.field2333.method998(var5, false);
            class90.field2310++;
            class92.field2333.method1021(var4, 128);
            class92.field2333.method983((byte) -101, var2);
            field1975 = var4;
            class122.field2981 = 0;
            class130.field3123 = var2;
            class102.field2592 = 2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 41) {
            class92.field2333.method702(true, 131);
            class92.field2323++;
            class92.field2333.method1017(125, var5);
            class92.field2333.method1021(var4, 128);
            class92.field2333.method987(var2, -111);
            class122.field2981 = 0;
            class102.field2592 = 2;
            field1975 = var4;
            class130.field3123 = var2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 17) {
            class85.method688((byte) -25);
        }
        if (var3 == 28 && class131.field3141 == -1) {
            class84.field2150++;
            class92.field2333.method702(true, 251);
            class92.field2333.method983((byte) -118, var2);
            class131.field3141 = var2;
        }
        if (var3 == 36) {
            class129.field3103++;
            class92.field2333.method702(true, 54);
            class92.field2333.method1021(var5, 128);
            class92.field2333.method1021(var4, 128);
            class92.field2333.method975(var2, false);
            class122.field2981 = 0;
            class102.field2592 = 2;
            class130.field3123 = var2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            field1975 = var4;
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 2) {
            class92.field2333.method702(arg1, 236);
            class92.field2333.method1021(var5, 128);
            class92.field2333.method998(var4, false);
            class92.field2333.method990(var2, 109);
            field1975 = var4;
            class102.field2592 = 2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            class94.field2373++;
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
            class122.field2981 = 0;
            class130.field3123 = var2;
        }
        if (var3 == 7) {
            class103 var22 = class82.field2110[var5];
            if (var22 != null) {
                class18.method123(false, (byte) 96, 1, 2, var22.field1350[0], 1, class72.field1820.field1350[0], var22.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class111.field2768 = 0;
                class71.field1742 = 2;
                class25.field596++;
                class61.field1550 = class40.field902;
                class33.field792 = class57.field1508;
                class92.field2333.method702(true, 83);
                class92.field2333.method998(var5, !arg1);
            }
        }
        if (var3 == 15) {
            class46 var23 = class116.field2845[var5];
            if (var23 != null) {
                class18.method123(false, (byte) 96, 1, 2, var23.field1350[0], 1, class72.field1820.field1350[0], var23.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class61.field1550 = class40.field902;
                class71.field1742 = 2;
                class74.field1872++;
                class111.field2768 = 0;
                class33.field792 = class57.field1508;
                class92.field2333.method702(true, 215);
                class92.field2333.method998(var5, !arg1);
                class92.field2333.method990(class33.field791, 73);
            }
        }
        if (var3 == 42) {
            class44 var24 = class64.field1625[arg0];
            int var25 = var24.method388(0, class25.field583);
            if (var25 != -1) {
                long var26 = var24.method380(var25 + 5, (byte) 111).method384(true).method407(true);
                int var28 = -1;
                for (int var29 = 0; var29 < class49.field1208; var29++) {
                    if (class62.field1587[var29] == var26) {
                        var28 = var29;
                        break;
                    }
                }
                if (var28 != -1 && class25.field600[var28] > 0) {
                    class116.field2843 = true;
                    class9.field172 = 3;
                    class51.field1238 = class51.field1274;
                    class79.field1990 = 0;
                    class16.field306 = true;
                    class27.field610 = class62.field1587[var28];
                    class51.field1232 = class117.method903(new class44[] { class74.field1887, class52.field1300[var28] }, false);
                }
            }
        }
        if (var3 == 50) {
            class75.field1891++;
            class92.field2333.method702(true, 196);
            class92.field2333.method1011(var5, false);
            class92.field2333.method1017(-67, var4);
            class92.field2333.method983((byte) -78, var2);
            class102.field2592 = 2;
            class122.field2981 = 0;
            field1975 = var4;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            class130.field3123 = var2;
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 1003) {
            class61.field1550 = class40.field902;
            class111.field2768 = 0;
            class127.field3050++;
            class71.field1742 = 2;
            class33.field792 = class57.field1508;
            class92.field2333.method702(true, 187);
            class92.field2333.method1017(-86, var5 >> 14 & 0x7FFF);
        }
        if (var3 == 11) {
            class57.method541(119, var5, var2, var4);
            class92.field2333.method702(true, 234);
            class120.field2947++;
            class92.field2333.method1011(class120.field2936 + var2, false);
            class92.field2333.method1011(var4 + class104.field2666, false);
            class92.field2333.method998(var5 >> 14 & 0x7FFF, false);
        }
        if (var3 == 14) {
            boolean var30 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            class117.field2870++;
            if (!var30) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class71.field1742 = 2;
            class61.field1550 = class40.field902;
            class111.field2768 = 0;
            class33.field792 = class57.field1508;
            class92.field2333.method702(arg1, 222);
            class92.field2333.method998(var5, false);
            class92.field2333.method998(class120.field2936 + var2, !arg1);
            class92.field2333.method1017(127, class104.field2666 + var4);
        }
        if (var3 == 1) {
            class61.field1535++;
            boolean var32 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            if (!var32) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class71.field1742 = 2;
            class61.field1550 = class40.field902;
            class111.field2768 = 0;
            class33.field792 = class57.field1508;
            class92.field2333.method702(true, 56);
            class92.field2333.method1017(126, var5);
            class92.field2333.method1017(126, var2 + class120.field2936);
            class92.field2333.method1017(-37, class121.field2948);
            class92.field2333.method1021(class94.field2397, 128);
            class92.field2333.method1021(class104.field2666 + var4, 128);
            class92.field2333.method983((byte) -86, class96.field2457);
        }
        if (var3 == 55) {
            class92.field2333.method702(true, 49);
            class92.field2333.method990(class33.field791, 75);
            class92.field2333.method983((byte) -119, var2);
            class92.field2333.method1011(var5, false);
            class104.field2654++;
            class92.field2333.method998(var4, false);
            field1975 = var4;
            class130.field3123 = var2;
            class102.field2592 = 2;
            class122.field2981 = 0;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 53) {
            class92.field2333.method702(arg1, 104);
            class92.field2333.method990(var2, 124);
            class92.field2333.method1011(var4, false);
            class92.field2333.method998(var5, false);
            class33.field803++;
            field1975 = var4;
            class130.field3123 = var2;
            class122.field2981 = 0;
            class102.field2592 = 2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (var3 == 22) {
            class46 var34 = class116.field2845[var5];
            if (var34 != null) {
                class18.method123(false, (byte) 96, 1, 2, var34.field1350[0], 1, class72.field1820.field1350[0], var34.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class131.field3154++;
                class71.field1742 = 2;
                class33.field792 = class57.field1508;
                class61.field1550 = class40.field902;
                class111.field2768 = 0;
                class92.field2333.method702(true, 210);
                class92.field2333.method998(var5, false);
            }
        }
        if (var3 == 52) {
            class46 var35 = class116.field2845[var5];
            if (var35 != null) {
                class18.method123(false, (byte) 96, 1, 2, var35.field1350[0], 1, class72.field1820.field1350[0], var35.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class71.field1742 = 2;
                class33.field792 = class57.field1508;
                class128.field3070++;
                class111.field2768 = 0;
                class61.field1550 = class40.field902;
                class92.field2333.method702(true, 225);
                class92.field2333.method1021(var5, 128);
            }
        }
        if (var3 == 47) {
            class46 var36 = class116.field2845[var5];
            if (var36 != null) {
                class18.field355++;
                class18.method123(false, (byte) 96, 1, 2, var36.field1350[0], 1, class72.field1820.field1350[0], var36.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class61.field1550 = class40.field902;
                class71.field1742 = 2;
                class111.field2768 = 0;
                class33.field792 = class57.field1508;
                class92.field2333.method702(true, 247);
                class92.field2333.method1017(127, var5);
            }
        }
        if (!arg1) {
            method646(false);
        }
        if (var3 == 24) {
            client.field373++;
            class92.field2333.method702(arg1, 180);
            class92.field2333.method987(var2, -112);
            class92.field2333.method998(var4, false);
            class92.field2333.method1017(126, var5);
            field1975 = var4;
            class102.field2592 = 2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
            class130.field3123 = var2;
            class122.field2981 = 0;
        }
        if (var3 == 23) {
            class105.field2683++;
            boolean var37 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            if (!var37) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class111.field2768 = 0;
            class33.field792 = class57.field1508;
            class71.field1742 = 2;
            class61.field1550 = class40.field902;
            class92.field2333.method702(true, 86);
            class92.field2333.method1011(class120.field2936 + var2, false);
            class92.field2333.method975(class33.field791, false);
            class92.field2333.method998(class104.field2666 + var4, false);
            class92.field2333.method998(var5, !arg1);
        }
        if (var3 == 34) {
            class72 var39 = class90.method727(var2, -160);
            class79.field1995 = var39.field1778;
            class33.field791 = var2;
            class13.field251 = var39.field1755;
            class44.field1071 = 1;
            class88.field2251 = true;
            class48.field1195 = 0;
            client.field376 = class117.method903(new class44[] { class109.field2738, var39.field1790, class25.field583 }, !arg1);
            if (class79.field1995 == 16) {
                class101.field2572 = true;
                class88.field2251 = true;
                class39.field873 = 3;
            }
            return;
        }
        if (var3 == 56 || var3 == 38) {
            class44 var40 = class64.field1625[arg0];
            int var41 = var40.method388(0, class25.field583);
            if (var41 != -1) {
                class44 var42 = var40.method380(var41 + 5, (byte) 116).method384(true);
                class44 var43 = var42.method392((byte) -121).method395(21611);
                boolean var44 = false;
                for (int var45 = 0; var45 < class125.field3020; var45++) {
                    class103 var46 = class82.field2110[class118.field2913[var45]];
                    if (var46 != null && var46.field2651 != null && var46.field2651.method412(0, var43)) {
                        class18.method123(false, (byte) 96, 1, 2, var46.field1350[0], 1, class72.field1820.field1350[0], var46.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                        var44 = true;
                        if (var3 == 56) {
                            class75.field1898++;
                            class92.field2333.method702(true, 140);
                            class92.field2333.method1011(class118.field2913[var45], !arg1);
                        }
                        if (var3 == 38) {
                            class92.field2333.method702(true, 204);
                            class53.field1308++;
                            class92.field2333.method1021(class118.field2913[var45], 128);
                        }
                        break;
                    }
                }
                if (!var44) {
                    class49.method460(class117.method903(new class44[] { class52.field1295, var43 }, !arg1), class51.field1274, (byte) 120, 0);
                }
            }
        }
        if (var3 == 3) {
            class103 var47 = class82.field2110[var5];
            if (var47 != null) {
                class18.method123(false, (byte) 96, 1, 2, var47.field1350[0], 1, class72.field1820.field1350[0], var47.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class71.field1742 = 2;
                class33.field792 = class57.field1508;
                class111.field2768 = 0;
                class61.field1550 = class40.field902;
                class92.field2333.method702(true, 71);
                class28.field658++;
                class92.field2333.method1017(-103, class121.field2948);
                class92.field2333.method1011(class94.field2397, false);
                class92.field2333.method998(var5, false);
                class92.field2333.method975(class96.field2457, false);
            }
        }
        if (var3 == 43) {
            class92.field2333.method702(true, 241);
            class92.field2333.method975(var2, false);
            class72 var48 = class90.method727(var2, -160);
            if (var48.field1821 != null && var48.field1821[0][0] == 5) {
                int var49 = var48.field1821[0][1];
                if (class21.field440[var49] != var48.field1783[0]) {
                    class21.field440[var49] = var48.field1783[0];
                    class69.method596(12872, var49);
                    class88.field2251 = true;
                }
            }
            class113.field2788++;
        }
        if (var3 == 33) {
            class103 var50 = class82.field2110[var5];
            if (var50 != null) {
                class101.field2558++;
                class18.method123(false, (byte) 96, 1, 2, var50.field1350[0], 1, class72.field1820.field1350[0], var50.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class33.field792 = class57.field1508;
                class111.field2768 = 0;
                class71.field1742 = 2;
                class61.field1550 = class40.field902;
                class92.field2333.method702(true, 5);
                class92.field2333.method1017(124, var5);
            }
        }
        if (var3 == 29) {
            class92.field2333.method702(true, 241);
            class92.field2333.method975(var2, false);
            class72 var51 = class90.method727(var2, -160);
            class113.field2788++;
            if (var51.field1821 != null && var51.field1821[0][0] == 5) {
                int var52 = var51.field1821[0][1];
                class21.field440[var52] = 1 - class21.field440[var52];
                class69.method596(12872, var52);
                class88.field2251 = true;
            }
        }
        if (var3 == 46) {
            class72 var53 = class90.method727(var2, -160);
            boolean var54 = true;
            if (var53.field1800 > 0) {
                var54 = class35.method337((byte) 109, var53);
            }
            if (var54) {
                class113.field2788++;
                class92.field2333.method702(true, 241);
                class92.field2333.method975(var2, false);
            }
        }
        if (var3 == 1002) {
            class61.field1550 = class40.field902;
            class71.field1742 = 2;
            class111.field2768 = 0;
            class33.field792 = class57.field1508;
            class46 var55 = class116.field2845[var5];
            if (var55 != null) {
                class43 var56 = var55.field1137;
                if (var56.field1012 != null) {
                    var56 = var56.method369(-106);
                }
                if (var56 != null) {
                    class92.field2333.method702(true, 179);
                    class14.field270++;
                    class92.field2333.method1017(123, var56.field987);
                }
            }
        }
        if (var3 == 45) {
            class93.field2354++;
            boolean var57 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            if (!var57) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class61.field1550 = class40.field902;
            class71.field1742 = 2;
            class111.field2768 = 0;
            class33.field792 = class57.field1508;
            class92.field2333.method702(true, 79);
            class92.field2333.method998(var5, false);
            class92.field2333.method998(class104.field2666 + var4, !arg1);
            class92.field2333.method998(class120.field2936 + var2, false);
        }
        if (var3 == 25) {
            class46 var59 = class116.field2845[var5];
            if (var59 != null) {
                class18.method123(false, (byte) 96, 1, 2, var59.field1350[0], 1, class72.field1820.field1350[0], var59.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class33.field792 = class57.field1508;
                class86.field2199++;
                class111.field2768 = 0;
                class71.field1742 = 2;
                class61.field1550 = class40.field902;
                class92.field2333.method702(true, 58);
                class92.field2333.method1011(var5, !arg1);
            }
        }
        if (var3 == 51) {
            class103 var60 = class82.field2110[var5];
            if (var60 != null) {
                class18.method123(false, (byte) 96, 1, 2, var60.field1350[0], 1, class72.field1820.field1350[0], var60.field1355[0], 0, class72.field1820.field1355[0], 0, 0);
                class71.field1742 = 2;
                class111.field2768 = 0;
                class33.field792 = class57.field1508;
                class61.field1550 = class40.field902;
                class36.field870++;
                class92.field2333.method702(arg1, 173);
                class92.field2333.method1021(var5, 128);
            }
        }
        if (var3 == 44) {
            boolean var61 = class18.method123(false, (byte) 96, 0, 2, var2, 0, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            if (!var61) {
                class18.method123(false, (byte) 96, 1, 2, var2, 1, class72.field1820.field1350[0], var4, 0, class72.field1820.field1355[0], 0, 0);
            }
            class33.field792 = class57.field1508;
            class111.field2768 = 0;
            class81.field2073++;
            class61.field1550 = class40.field902;
            class71.field1742 = 2;
            class92.field2333.method702(true, 67);
            class92.field2333.method998(var5, false);
            class92.field2333.method1011(class104.field2666 + var4, false);
            class92.field2333.method1017(123, class120.field2936 + var2);
        }
        if (var3 == 31) {
            class92.field2333.method702(true, 201);
            class92.field2333.method990(var2, 66);
            class92.field2342++;
            class92.field2333.method1011(var5, false);
            class92.field2333.method1021(var4, 128);
            class122.field2981 = 0;
            field1975 = var4;
            class130.field3123 = var2;
            class102.field2592 = 2;
            if (var2 >> 16 == class125.field3032) {
                class102.field2592 = 1;
            }
            if (var2 >> 16 == class98.field2496) {
                class102.field2592 = 3;
            }
        }
        if (class48.field1195 != 0) {
            class88.field2251 = true;
            class48.field1195 = 0;
        }
        if (class44.field1071 != 0) {
            class44.field1071 = 0;
            class88.field2251 = true;
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V", line = 1560)
    public static final void method649(int arg0) {
        field1948++;
        if (class34.field843 != arg0) {
            return;
        }
        int var1 = class128.field3074;
        if (class44.field1071 == 1 && class57.field1508 >= 516 && class40.field902 >= 160 && class57.field1508 <= 765 && class40.field902 <= 205) {
            var1 = 0;
        }
        if (!class15.field289) {
            if (var1 == 1 && class71.field1744 > 0) {
                int var2 = class62.field1568[class71.field1744 - 1];
                if (var2 == 24 || var2 == 41 || var2 == 35 || var2 == 53 || var2 == 50 || var2 == 12 || var2 == 36 || var2 == 31 || var2 == 5 || var2 == 2 || var2 == 16 || var2 == 1004) {
                    int var3 = class120.field2946[class71.field1744 - 1];
                    int var4 = class35.field847[class71.field1744 - 1];
                    class72 var5 = class90.method727(var4, -160);
                    if (var5.field1816 || var5.field1756) {
                        class5.field121 = var3;
                        client.field374 = 0;
                        class105.field2687 = class57.field1508;
                        class77.field1931 = false;
                        class34.field843 = 2;
                        class89.field2287 = class40.field902;
                        if (var4 >> 16 == class125.field3032) {
                            class34.field843 = 1;
                        }
                        class61.field1533 = var4;
                        if (var4 >> 16 == class98.field2496) {
                            class34.field843 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class100.field2544 == 1 || class100.method791(class71.field1744 - 1, false)) && class71.field1744 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class71.field1744 > 0) {
                method648(class71.field1744 - 1, true);
            }
            if (var1 == 2 && class71.field1744 > 0) {
                class5.method38(-335);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class100.field2519;
            int var7 = class110.field2749;
            if (class25.field584 == 0) {
                var7 -= 4;
                var6 -= 4;
            }
            if (class25.field584 == 1) {
                var7 -= 205;
                var6 -= 553;
            }
            if (class25.field584 == 2) {
                var7 -= 357;
                var6 -= 17;
            }
            if (var6 < class107.field2715 - 10 || var6 > class107.field2715 + class82.field2093 + 10 || var7 < class46.field1146 - 10 || field1951 + class46.field1146 + 10 < var7) {
                class15.field289 = false;
                if (class25.field584 == 1) {
                    class88.field2251 = true;
                }
                if (class25.field584 == 2) {
                    class16.field306 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class46.field1146;
        int var9 = class107.field2715;
        int var10 = class82.field2093;
        int var11 = class57.field1508;
        int var12 = class40.field902;
        if (class25.field584 == 0) {
            var12 -= 4;
            var11 -= 4;
        }
        int var13 = -1;
        if (class25.field584 == 1) {
            var12 -= 205;
            var11 -= 553;
        }
        if (class25.field584 == 2) {
            var11 -= 17;
            var12 -= 357;
        }
        for (int var14 = 0; var14 < class71.field1744; var14++) {
            int var15 = (class71.field1744 - var14 - 1) * 15 + var8 + 31;
            if (var9 < var11 && var11 < var9 + var10 && var15 - 13 < var12 && var15 + 3 > var12) {
                var13 = var14;
            }
        }
        if (var13 != -1) {
            method648(var13, true);
        }
        if (class25.field584 == 2) {
            class16.field306 = true;
        }
        if (class25.field584 == 1) {
            class88.field2251 = true;
        }
        class15.field289 = false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZZ)Lhb;", line = 1761)
    public static final class44 method650(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1982++;
        int var4 = 1;
        int var5 = arg0 / arg1;
        if (arg2) {
            method647(107, null);
        }
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg1;
            arg0 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class44 var9 = new class44();
        var9.field1074 = var7;
        var9.field1070 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Ljb;)V", line = 1824)
    public class78(class56 arg0) {
        this.field1981 = arg0;
    }
}
