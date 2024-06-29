import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class94 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    private int[] field2140;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lkc;")
    private static class67 field2139 = class19.method144("You have only just left another world)3", 71);

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lkc;")
    public static class67 field2141 = class19.method144("null", 90);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
    public static int[] field2143 = new int[128];

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lkc;")
    private static class67 field2138 = class19.method144("Cancel", 71);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lkc;")
    public static class67 field2134 = field2138;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lkc;")
    public static class67 field2147 = field2139;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lgd;")
    public static class44 field2145 = new class44(50);

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lkc;")
    private static class67 field2151 = class19.method144(" more options", 93);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lkc;")
    public static class67 field2148 = field2151;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lgd;")
    public static class44 field2150 = new class44(128);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lkc;")
    private static class67 field2153 = class19.method144("Loaded gamescreen", 87);

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lkc;")
    public static class67 field2152 = field2153;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lkc;")
    public static class67 field2157 = class19.method144("oder benutzen Sie eine andere Welt)3", 126);

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lbd;")
    public static class12 field2156 = new class12();

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lta;")
    public static class119 field2149;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Led;")
    public static class33 field2159;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lje;")
    public static class63 field2160;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[I")
    public static int[] field2154;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method739(int arg0, int arg1, int arg2) {
        field2144++;
        if (arg2 == 0 && class115.field2716 == arg0) {
            return true;
        }
        if (arg1 != 3) {
            field2159 = null;
        }
        if (arg2 == 1 && class73.field1704 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class140.field3357 == arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I", line = 27)
    public final int method740(boolean arg0, int arg1) {
        int var3 = this.field2140.length - 2;
        if (!arg0) {
            return -20;
        }
        field2146++;
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field2140[var4];
            if (arg1 == var5) {
                return this.field2140[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 65)
    public static void method741(int arg0) {
        field2138 = null;
        field2150 = null;
        field2147 = null;
        field2159 = null;
        if (arg0 != -26771) {
            field2152 = null;
        }
        field2154 = null;
        field2160 = null;
        field2148 = null;
        field2145 = null;
        field2152 = null;
        field2149 = null;
        field2134 = null;
        field2153 = null;
        field2157 = null;
        field2139 = null;
        field2156 = null;
        field2151 = null;
        field2141 = null;
        field2143 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V", line = 95)
    public class94(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2140 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2140[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2140[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2140[var5 + var5] = arg0[var4];
            this.field2140[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILqc;BI)V", line = 132)
    public static final void method742(int arg0, class103 arg1, byte arg2, int arg3) {
        if ((arg0 & 0x40) != 0) {
            arg1.field1248 = class112.field2558.method1119(-16894);
            arg1.field1225 = class112.field2558.method1119(-16894);
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field1194 = class112.field2558.method1084(36);
            int var4 = class112.field2558.method1078(118);
            arg1.field1230 = var4 >> 16;
            arg1.field1261 = 0;
            arg1.field1193 = 0;
            arg1.field1222 = class135.field3243 + (var4 & 0xFFFF);
            if (class135.field3243 < arg1.field1222) {
                arg1.field1193 = -1;
            }
            if (arg1.field1194 == 65535) {
                arg1.field1194 = -1;
            }
        }
        int var5 = -55 / ((-arg2 - 80) / 44);
        if ((arg0 & 0x4) != 0) {
            arg1.field1200 = class112.field2558.method1107(-21560);
            if (arg1.field1200 == 65535) {
                arg1.field1200 = -1;
            }
        }
        field2137++;
        if ((arg0 & 0x100) != 0) {
            int var6 = class112.field2558.method1094(10);
            int var7 = class112.field2558.method1094(10);
            arg1.method416(77, class135.field3243, var6, var7);
            arg1.field1202 = class135.field3243 + 300;
            arg1.field1236 = class112.field2558.method1088(1809908424);
            arg1.field1239 = class112.field2558.method1105(255);
        }
        if ((arg0 & 0x10) != 0) {
            int var8 = class112.field2558.method1119(-16894);
            int var9 = class112.field2558.method1088(1809908424);
            int var10 = class112.field2558.method1094(10);
            int var11 = class112.field2558.field3347;
            if (arg1.field2329 != null && arg1.field2334 != null) {
                long var12 = arg1.field2329.method532(-108);
                boolean var14 = false;
                if (var9 <= 1) {
                    for (int var15 = 0; var15 < class128.field3003; var15++) {
                        if (class5.field112[var15] == var12) {
                            var14 = true;
                            break;
                        }
                    }
                }
                if (!var14 && class32.field684 == 0) {
                    class31.field658.field3347 = 0;
                    class112.field2558.method1074(0, var10, 28444, class31.field658.field3325);
                    class31.field658.field3347 = 0;
                    class67 var16 = class25.method195(class31.field658, false).method543(32);
                    arg1.field1219 = var16.method525((byte) 56);
                    arg1.field1257 = var8 >> 8;
                    arg1.field1251 = 150;
                    arg1.field1195 = var8 & 0xFF;
                    if (var9 == 2 || var9 == 3) {
                        class50.method412(var16, false, 1, class63.method479(new class67[] { class38.field870, arg1.field2329 }, 0));
                    } else if (var9 == 1) {
                        class50.method412(var16, false, 1, class63.method479(new class67[] { class115.field2718, arg1.field2329 }, 0));
                    } else {
                        class50.method412(var16, false, 2, arg1.field2329);
                    }
                }
            }
            class112.field2558.field3347 = var10 + var11;
        }
        if ((arg0 & 0x1) != 0) {
            int var17 = class112.field2558.method1084(80);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class112.field2558.method1088(1809908424);
            class14.method115(var18, -128, var17, arg1);
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field1238 = class112.field2558.method1105(255);
            arg1.field1243 = class112.field2558.method1105(255);
            arg1.field1227 = class112.field2558.method1097(false);
            arg1.field1234 = class112.field2558.method1088(1809908424);
            arg1.field1210 = class112.field2558.method1084(51) + class135.field3243;
            arg1.field1240 = class112.field2558.method1107(-21560) + class135.field3243;
            arg1.field1228 = class112.field2558.method1088(1809908424);
            arg1.method419(true);
        }
        if ((arg0 & 0x2) != 0) {
            int var19 = class112.field2558.method1088(1809908424);
            byte[] var20 = new byte[var19];
            class140 var21 = new class140(var20);
            class112.field2558.method1077(var19, 0, -128, var20);
            class69.field1636[arg3] = var21;
            arg1.method785(var21, -1);
        }
        if ((arg0 & 0x80) != 0) {
            int var22 = class112.field2558.method1094(10);
            int var23 = class112.field2558.method1105(255);
            arg1.method416(105, class135.field3243, var22, var23);
            arg1.field1202 = class135.field3243 + 300;
            arg1.field1236 = class112.field2558.method1097(false);
            arg1.field1239 = class112.field2558.method1088(1809908424);
        }
        if ((arg0 & 0x20) == 0) {
            return;
        }
        arg1.field1219 = class112.field2558.method1110(false);
        if (arg1.field1219.method515(0, 255) == 126) {
            arg1.field1219 = arg1.field1219.method531(13401, 1);
            class50.method412(arg1.field1219, false, 2, arg1.field2329);
        } else if (class69.field1640 == arg1) {
            class50.method412(arg1.field1219, false, 2, arg1.field2329);
        }
        arg1.field1251 = 150;
        arg1.field1195 = 0;
        arg1.field1257 = 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)V", line = 351)
    public static final void method743(long arg0, byte arg1) {
        field2136++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != -59) {
            field2138 = null;
        }
        if (class9.field188 >= 100 && class130.field3050 != 1 || class9.field188 >= 200) {
            class50.method412(class116.field2729, false, 0, class127.field2976);
            return;
        }
        class67 var3 = class137.method1065(arg0, (byte) -44).method528((byte) -26);
        for (int var4 = 0; var4 < class9.field188; var4++) {
            if (class31.field650[var4] == arg0) {
                class50.method412(class63.method479(new class67[] { var3, class91.field2108 }, 0), false, 0, class127.field2976);
                return;
            }
        }
        for (int var5 = 0; var5 < class128.field3003; var5++) {
            if (class5.field112[var5] == arg0) {
                class50.method412(class63.method479(new class67[] { class104.field2338, var3, class71.field1691 }, 0), false, 0, class127.field2976);
                return;
            }
        }
        if (var3.method533(class69.field1640.field2329, (byte) -113)) {
            return;
        }
        class55.field1349[class9.field188] = var3;
        class31.field650[class9.field188] = arg0;
        class91.field2100++;
        class46.field1107[class9.field188] = 0;
        class128.field2999[class9.field188] = 0;
        class121.field2849 = true;
        class9.field188++;
        class54.field1295.method713(503, 238);
        class54.field1295.method1083((byte) -98, arg0);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 451)
    public static final void method744(int arg0) {
        if (arg0 == 2) {
            field2142++;
            class116.field2744.method939((byte) -53);
            class67.field1609.method20(0, 0);
            class74.field1771 = class105.method799(class74.field1771);
        }
    }
}
