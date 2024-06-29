import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field243 = 0;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field249 = 0;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Ldd;")
    public static class34 field246 = new class34(64);

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lai;")
    public static class10 field250 = class44.method278("title)3jpg", 98);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lnd;")
    public class122 field247;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lh;I)V")
    public static final void method91(class65 arg0, int arg1) {
        field235++;
        if (arg0.field1140 == 0) {
            return;
        }
        if (arg0.field1130 != -1 && arg0.field1130 < 32768) {
            class125 var2 = class168.field3249[arg0.field1130];
            if (var2 != null) {
                int var3 = arg0.field1100 - var2.field1100;
                int var4 = arg0.field1097 - var2.field1097;
                if (var3 != 0 || var4 != 0) {
                    arg0.field1108 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 >= -21) {
            method93(null, -49);
        }
        if (arg0.field1130 >= 32768) {
            int var5 = arg0.field1130 - 32768;
            if (class78.field1370 == var5) {
                var5 = 2047;
            }
            class38 var6 = class2.field10[var5];
            if (var6 != null) {
                int var7 = arg0.field1100 - var6.field1100;
                int var8 = arg0.field1097 - var6.field1097;
                if (var7 != 0 || var8 != 0) {
                    arg0.field1108 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1134 != 0 || arg0.field1143 != 0) && (arg0.field1116 == 0 || arg0.field1114 > 0)) {
            int var9 = arg0.field1100 - (arg0.field1134 - class2.field16 - class2.field16) * 64;
            int var10 = arg0.field1097 - (arg0.field1143 - class200.field3767 - class200.field3767) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field1108 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1143 = 0;
            arg0.field1134 = 0;
        }
        int var11 = arg0.field1108 - arg0.field1109 & 0x7FF;
        if (var11 == 0) {
            arg0.field1119 = 0;
            return;
        }
        arg0.field1119++;
        if (var11 <= 1024) {
            arg0.field1109 += arg0.field1140;
            boolean var12 = true;
            if (arg0.field1140 > var11 || var11 > 2048 - arg0.field1140) {
                var12 = false;
                arg0.field1109 = arg0.field1108;
            }
            if (arg0.field1092 == arg0.field1080 && (arg0.field1119 > 25 || var12)) {
                if (arg0.field1082 == -1) {
                    arg0.field1080 = arg0.field1091;
                } else {
                    arg0.field1080 = arg0.field1082;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field1109 -= arg0.field1140;
            if (var11 < arg0.field1140 || var11 > 2048 - arg0.field1140) {
                var13 = false;
                arg0.field1109 = arg0.field1108;
            }
            if (arg0.field1092 == arg0.field1080 && (arg0.field1119 > 25 || var13)) {
                if (arg0.field1111 == -1) {
                    arg0.field1080 = arg0.field1091;
                } else {
                    arg0.field1080 = arg0.field1111;
                }
            }
        }
        arg0.field1109 &= 0x7FF;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method92(byte arg0) {
        field246 = null;
        field250 = null;
        int var1 = -70 / ((arg0 - 20) / 33);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lsh;I)V")
    public static final void method93(class171 arg0, int arg1) {
        int var2 = 0;
        field238++;
        if (arg0.field3303 == 0) {
            var2 = class36.field560.method563(arg0.field3307, arg0.field3302, arg0.field3314);
        }
        int var3 = -1;
        int var4 = 0;
        if (arg0.field3303 == 1) {
            var2 = class36.field560.method598(arg0.field3307, arg0.field3302, arg0.field3314);
        }
        if (arg0.field3303 == 2) {
            var2 = class36.field560.method571(arg0.field3307, arg0.field3302, arg0.field3314);
        }
        int var5 = 0;
        if (arg0.field3303 == 3) {
            var2 = class36.field560.method580(arg0.field3307, arg0.field3302, arg0.field3314);
        }
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class36.field560.method588(arg0.field3307, arg0.field3302, arg0.field3314, var2);
            var5 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg0.field3297 = var5;
        arg0.field3313 = var3;
        arg0.field3304 = var4;
        int var7 = -122 / ((arg1 - 15) / 63);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method94(int arg0) {
        field253++;
        if (arg0 < 71) {
            field252 = -60;
        }
        if (class33.field511 != null || class100.field1871 != null) {
            return;
        }
        int var1 = class25.field384;
        if (class180.field3415) {
            if (var1 != 1) {
                int var6 = class79.field1389;
                int var7 = class89.field1559;
                if (class160.field3086 - 10 > var6 || var6 > class193.field3670 + class160.field3086 + 10 || var7 < class108.field2008 - 10 || var7 > class108.field2008 + class118.field2279 + 10) {
                    class180.field3415 = false;
                    class147.method1015(false, class160.field3086, class193.field3670, class118.field2279, class108.field2008);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class193.field3670;
            int var9 = class108.field2008;
            int var10 = class160.field3086;
            int var11 = class172.field3330;
            int var12 = class5.field58;
            int var13 = -1;
            for (int var14 = 0; var14 < class53.field946; var14++) {
                int var15 = (class53.field946 - var14 - 1) * 15 + var9 + 31;
                if (var10 < var11 && var8 + var10 > var11 && var12 > var15 - 13 && var15 + 3 > var12) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class30.method200(var13, (byte) 102);
            }
            class180.field3415 = false;
            class147.method1015(false, class160.field3086, class193.field3670, class118.field2279, class108.field2008);
            return;
        }
        if (var1 == 1 && class53.field946 > 0) {
            int var2 = class75.field1308[class53.field946 - 1];
            if (var2 == 12 || var2 == 17 || var2 == 45 || var2 == 22 || var2 == 10 || var2 == 8 || var2 == 24 || var2 == 43 || var2 == 18 || var2 == 21 || var2 == 20 || var2 == 1004) {
                int var3 = class36.field561[class53.field946 - 1];
                int var4 = class148.field2848[class53.field946 - 1];
                class200 var5 = class66.method432(var4, false);
                if (class26.method170(class203.method1318(0, var5), -25796) || class174.method1141(-1, class203.method1318(0, var5))) {
                    class129.field2459 = 0;
                    class123.field2356 = false;
                    if (class33.field511 != null) {
                        class168.method1116(class33.field511, -90);
                    }
                    class33.field511 = class66.method432(var4, false);
                    class196.field3714 = class172.field3330;
                    class184.field3493 = class5.field58;
                    class80.field1406 = var3;
                    class168.method1116(class33.field511, -112);
                    return;
                }
            }
        }
        if (var1 == 1 && (class27.field406 == 1 && class53.field946 > 2 || class180.method1165(class53.field946 - 1, 100))) {
            var1 = 2;
        }
        if (var1 == 1 && class53.field946 > 0) {
            class30.method200(class53.field946 - 1, (byte) 102);
        }
        if (var1 == 2 && class53.field946 > 0) {
            class139.method947(26026);
            return;
        }
    }
}
