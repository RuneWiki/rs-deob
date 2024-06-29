import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lhb;")
    private class51 field2039 = new class51();

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lpb;")
    private class106 field2045 = new class106();

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Laf;")
    private class7 field2046;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lic;")
    public static class59 field2042 = class59.method433(0, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[I")
    public static int[] field2038 = new int[1000];

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field2040 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lic;")
    public static class59 field2030 = class59.method433(0, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[[S")
    public static short[][] field2049 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Lic;")
    public static class59 field2053 = class59.method433(0, "<img=0>");

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Lce;")
    public static class20 field2050;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "[[B")
    public static byte[][] field2047;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method668(boolean arg0) {
        if (arg0) {
            field2053 = null;
        }
        field2033++;
        class2.field31 = new class83();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lce;")
    public static final class20 method669(int arg0) {
        field2031++;
        class20 var1 = new class20();
        var1.field437 = class136.field3037[0];
        var1.field442 = client.field488[arg0];
        var1.field443 = class15.field298[0];
        var1.field444 = class5.field105;
        var1.field438 = class100.field2471[0];
        var1.field440 = class44.field1120[0];
        var1.field439 = class100.field2478;
        var1.field441 = class34.field918;
        class2.method10(arg0 - 6);
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method670(int arg0) {
        if (arg0 != 1341) {
            return;
        }
        field2042 = null;
        field2049 = null;
        field2053 = null;
        field2038 = null;
        field2047 = null;
        field2030 = null;
        field2050 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IJ)V")
    public final void method671(int arg0, long arg1) {
        if (arg0 < 4) {
            method669(-61);
        }
        field2029++;
        class51 var4 = (class51) this.field2046.method35(arg1, 105);
        if (var4 != null) {
            var4.method929(101);
            var4.method387((byte) -102);
            this.field2052++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILhb;J)V")
    public final void method672(int arg0, class51 arg1, long arg2) {
        if (this.field2052 == 0) {
            class51 var5 = this.field2045.method823((byte) 119);
            var5.method929(116);
            var5.method387((byte) -117);
            if (this.field2039 == var5) {
                class51 var6 = this.field2045.method823((byte) 119);
                var6.method929(112);
                var6.method387((byte) -66);
            }
        } else {
            this.field2052--;
        }
        if (arg0 == -30464) {
            field2044++;
            this.field2046.method38(arg1, (byte) 121, arg2);
            this.field2045.method829(arg0 ^ 0x76FF, arg1);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ldd;I)V")
    public static final void method673(class26 arg0, int arg1) {
        if (arg1 == 7735) {
            field2032++;
            class38.field988 = arg0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lt;")
    public static final class132 method674(byte arg0) {
        field2034++;
        class132 var1 = new class132();
        byte[] var2 = class136.field3037[0];
        var1.field2957 = class44.field1120[0];
        var1.field2955 = class100.field2471[0];
        var1.field2954 = class100.field2478;
        var1.field2958 = class15.field298[0];
        var1.field2952 = client.field488[0];
        if (arg0 != 36) {
            return null;
        }
        int var3 = var1.field2957 * var1.field2952;
        var1.field2953 = new int[var3];
        var1.field2956 = class5.field105;
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2953[var4] = class34.field918[class24.method156(var2[var4], 255)];
        }
        class2.method10(arg0 ^ 0xFFFFFFDE);
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)Lhb;")
    public final class51 method675(long arg0, int arg1) {
        field2028++;
        if (arg1 != 26431) {
            this.method675(-48L, 26);
        }
        class51 var4 = (class51) this.field2046.method35(arg0, 105);
        if (var4 != null) {
            this.field2045.method829(-1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public final void method676(byte arg0) {
        field2035++;
        if (arg0 > -97) {
            field2047 = null;
        }
        while (true) {
            class51 var2 = this.field2045.method823((byte) 119);
            if (var2 == null) {
                this.field2052 = this.field2048;
                return;
            }
            var2.method929(116);
            var2.method387((byte) -100);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIIILcd;)V")
    public static final void method677(byte arg0, int arg1, int arg2, int arg3, int arg4, class19 arg5) {
        field2051++;
        class86 var6 = new class86();
        var6.field2171 = arg3 * 128;
        var6.field2151 = arg1 * 128;
        int var7 = -121 % ((arg0 - 6) / 63);
        var6.field2162 = arg5.field397;
        var6.field2150 = arg4;
        var6.field2164 = arg5.field401;
        int var8 = arg5.field434;
        var6.field2147 = arg5.field376;
        var6.field2167 = arg5.field407;
        int var9 = arg5.field418;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg5.field418;
            var9 = arg5.field434;
        }
        var6.field2148 = (arg3 + var9) * 128;
        var6.field2170 = arg5.field377 * 128;
        var6.field2158 = (arg1 + var8) * 128;
        if (arg5.field379 != null) {
            var6.field2156 = arg5;
            var6.method708((byte) -73);
        }
        class61.field1561.method689(var6, (byte) 48);
        if (var6.field2167 != null) {
            var6.field2174 = var6.field2164 + (int) (Math.random() * (double) (var6.field2147 - var6.field2164));
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
    public class82(int arg0) {
        this.field2052 = arg0;
        this.field2048 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2046 = new class7(var2);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLub;Lub;)V")
    public static final void method678(byte arg0, class141 arg1, class141 arg2) {
        field2037++;
        if (class51.field1281 == null) {
            class51.field1281 = class152.method1118(-114, class47.field1193, class100.field2476, class90.field2294);
        }
        if (class23.field547 == null) {
            class23.field547 = class79.method645(class90.field2294, (byte) 57, class100.field2476, class63.field1622);
        }
        if (class52.field1286 == null) {
            class52.field1286 = class79.method645(class90.field2294, (byte) 116, class100.field2476, class86.field2173);
        }
        if (class87.field2210 == null) {
            class87.field2210 = class79.method645(class90.field2294, (byte) 55, class100.field2476, class70.field1776);
        }
        class129.method988(0, 23, 765, 480, 0);
        class129.method995(0, 0, 125, 23, 12425273, 9135624);
        class129.method995(125, 0, 640, 23, 5197647, 2697513);
        arg2.method1146(class8.field171, 62, 15, 0, -1);
        if (class87.field2210 != null) {
            class87.field2210[1].method111(140, 1);
            arg1.method1134(class47.field1207, 152, 10, 16777215, -1);
            class87.field2210[0].method111(140, 12);
            arg1.method1134(class1.field21, 152, 21, 16777215, -1);
        }
        if (class52.field1286 != null) {
            short var3 = 280;
            short var4 = 390;
            if (class75.field1857[0] == 0 && class115.field2714[0] == 0) {
                class52.field1286[2].method111(var3, 4);
            } else {
                class52.field1286[0].method111(var3, 4);
            }
            short var5 = 610;
            short var6 = 500;
            if (class75.field1857[0] == 0 && class115.field2714[0] == 1) {
                class52.field1286[3].method111(var3 + 15, 4);
            } else {
                class52.field1286[1].method111(var3 + 15, 4);
            }
            arg2.method1134(class81.field2021, var3 + 32, 17, 16777215, -1);
            if (class75.field1857[0] == 1 && class115.field2714[0] == 0) {
                class52.field1286[2].method111(var4, 4);
            } else {
                class52.field1286[0].method111(var4, 4);
            }
            if (class75.field1857[0] == 1 && class115.field2714[0] == 1) {
                class52.field1286[3].method111(var4 + 15, 4);
            } else {
                class52.field1286[1].method111(var4 + 15, 4);
            }
            arg2.method1134(class153.field3319, var4 + 32, 17, 16777215, -1);
            if (class75.field1857[0] == 2 && class115.field2714[0] == 0) {
                class52.field1286[2].method111(var6, 4);
            } else {
                class52.field1286[0].method111(var6, 4);
            }
            if (class75.field1857[0] == 2 && class115.field2714[0] == 1) {
                class52.field1286[3].method111(var6 + 15, 4);
            } else {
                class52.field1286[1].method111(var6 + 15, 4);
            }
            arg2.method1134(class137.field3052, var6 + 32, 17, 16777215, -1);
            if (class75.field1857[0] == 3 && class115.field2714[0] == 0) {
                class52.field1286[2].method111(var5, 4);
            } else {
                class52.field1286[0].method111(var5, 4);
            }
            if (class75.field1857[0] == 3 && class115.field2714[0] == 1) {
                class52.field1286[3].method111(var5 + 15, 4);
            } else {
                class52.field1286[1].method111(var5 + 15, 4);
            }
            arg2.method1134(class43.field1118, var5 + 32, 17, 16777215, -1);
        }
        int var7 = 87 % ((50 - arg0) / 44);
        class129.method988(708, 4, 50, 16, 0);
        arg1.method1146(class65.field1639, 733, 16, 16777215, -1);
        class46.field1178 = -1;
        if (class51.field1281 == null) {
            return;
        }
        byte var8 = 88;
        byte var9 = 19;
        int var10 = 765 / (var8 + 1);
        int var11 = 480 / (var9 + 1);
        int var12;
        int var13;
        do {
            var12 = var11;
            var13 = var10;
            if ((var10 - 1) * var11 >= class137.field3060) {
                var10--;
            }
            if (class137.field3060 <= (var11 - 1) * var10) {
                var11--;
            }
            if (class137.field3060 <= (var11 - 1) * var10) {
                var11--;
            }
        } while (var11 != var12 || var10 != var13);
        int var14 = (765 - var8 * var10) / (var10 - -1);
        int var15 = (480 - var9 * var11) / (var11 + 1);
        if (var15 > 5) {
            var15 = 5;
        }
        if (var14 > 5) {
            var14 = 5;
        }
        int var16 = (765 - (var10 - 1) * var14 - var8 * var10) / 2;
        int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
        int var18 = var16;
        int var19 = var17 + 23;
        int var20 = 0;
        for (int var21 = 0; var21 < class137.field3060; var21++) {
            class2 var22 = class99.field2463[var21];
            boolean var23 = true;
            class59 var24 = class46.method361(var22.field33, -119);
            if (var22.field33 == -1) {
                var24 = class65.field1644;
                var23 = false;
            } else if (var22.field33 > 1980) {
                var24 = class27.field703;
                var23 = false;
            }
            if (class16.field325 >= var18 && class145.field3166 >= var19 && class16.field325 < var8 + var18 && class145.field3166 < var9 + var19 && var23) {
                class46.field1178 = var21;
                class51.field1281[var22.field40 ? 1 : 0].method1022(var18, var19, 128, 16777215);
            } else {
                class51.field1281[var22.field40 ? 1 : 0].method1020(var18, var19);
            }
            if (class23.field547 != null) {
                class23.field547[(var22.field40 ? 8 : 0) + var22.field39].method111(var18 + 29, var19);
            }
            arg2.method1146(class46.method361(var22.field38, -71), var18 + 15, var9 / 2 + var19 + 5, 0, -1);
            arg1.method1146(var24, var18 + 60, var9 / 2 + var19 - -5, 268435455, -1);
            var19 += var9 + var15;
            var20++;
            if (var11 <= var20) {
                var18 += var8 + var14;
                var20 = 0;
                var19 = var17 + 23;
            }
        }
    }
}
