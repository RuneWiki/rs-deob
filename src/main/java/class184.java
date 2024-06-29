import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class184 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public int field3166 = -1;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lj;")
    public static class269 field3163 = new class269();

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lbe;")
    public static class283 field3167 = class153.method941(-40, ":clan:");

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "[I")
    public static int[] field3168 = new int[100];

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lbe;")
    public static class283 field3171 = class153.method941(125, "b12_full");

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Lbe;")
    private static class283 field3175 = class153.method941(-11, "Connection lost)3");

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Lbe;")
    public static class283 field3176 = field3175;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lbe;")
    public static class283 field3172 = class153.method941(126, "Mem:");

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "J")
    public static long field3174;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lic;")
    public class109 field3161;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[I")
    public int[] field3164;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[Lbe;")
    public class283[] field3160;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[[S")
    public static short[][] field3169;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 5)
    public static void method1213(int arg0) {
        field3172 = null;
        field3175 = null;
        field3176 = null;
        field3167 = null;
        if (arg0 == 3) {
            field3171 = null;
            field3163 = null;
            field3168 = null;
            field3169 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)J", line = 23)
    public static final long method1214(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2627; var4++) {
            class26 var5 = var3.field2623[var4];
            if ((var5.field379 >> 29 & 0x3L) == 2L && var5.field398 == arg1 && var5.field394 == arg2) {
                return var5.field379;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBLbm;I)V", line = 44)
    public static final void method1215(int arg0, int arg1, byte arg2, class129 arg3, int arg4) {
        field3162++;
        if (class42.field589 >= 400) {
            return;
        }
        if (arg3.field2193 != null) {
            arg3 = arg3.method806((byte) -128);
        }
        if (arg3 == null || !arg3.field2199) {
            return;
        }
        class283 var5 = arg3.field2152;
        if (arg3.field2185 != 0) {
            var5 = class299.method2022(new class283[] { var5, class231.method1560(arg3.field2185, (byte) -108, class213.field3624.field3259), class18.field224, class37.field540, class296.method2012(arg3.field2185, (byte) 117), class72.field1273 }, (byte) 113);
        }
        if (class222.field3727 == 1) {
            class275.method1848(arg0, class40.field562, (long) arg4, (byte) -60, arg1, class299.method2022(new class283[] { class222.field3745, class255.field4306, var5 }, (byte) 19), (short) 1);
            class297.field5027++;
        } else if (!class103.field1760) {
            class283[] var6 = arg3.field2142;
            class298.field5047++;
            if (class164.field2707) {
                var6 = class71.method468(var6, (byte) 87);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class280.field4678 != 0 || !var6[var7].method1910(16369, class71.field1221))) {
                        byte var8 = 0;
                        class23.field344++;
                        if (var7 == 0) {
                            var8 = 48;
                        }
                        if (var7 == 1) {
                            var8 = 46;
                        }
                        if (var7 == 2) {
                            var8 = 13;
                        }
                        if (var7 == 3) {
                            var8 = 3;
                        }
                        if (var7 == 4) {
                            var8 = 49;
                        }
                        class275.method1848(arg0, var6[var7], (long) arg4, (byte) -60, arg1, class299.method2022(new class283[] { class86.field1462, var5 }, (byte) 125), var8);
                    }
                }
            }
            if (class280.field4678 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1910(16369, class71.field1221)) {
                        short var10 = 0;
                        if (var9 == 0) {
                            var10 = 48;
                        }
                        if (var9 == 1) {
                            var10 = 46;
                        }
                        short var11 = 0;
                        if (var9 == 2) {
                            var10 = 13;
                        }
                        class305.field5223++;
                        if (var9 == 3) {
                            var10 = 3;
                        }
                        if (var9 == 4) {
                            var10 = 49;
                        }
                        if (arg3.field2185 > class213.field3624.field3259) {
                            var11 = 2000;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class275.method1848(arg0, var6[var9], (long) arg4, (byte) -60, arg1, class299.method2022(new class283[] { class86.field1462, var5 }, (byte) 20), var10);
                    }
                }
            }
            class275.method1848(arg0, class298.field5042, (long) arg4, (byte) -60, arg1, class299.method2022(new class283[] { class86.field1462, var5 }, (byte) 115), (short) 1007);
        } else if ((class12.field112 & 0x2) == 2) {
            class275.method1848(arg0, class89.field1514, (long) arg4, (byte) -60, arg1, class299.method2022(new class283[] { class135.field2272, class255.field4306, var5 }, (byte) 35), (short) 4);
            class72.field1275++;
        }
        if (arg2 >= -123) {
            field3176 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I", line = 189)
    public static final int method1216(byte arg0, int arg1) {
        field3177++;
        class94 var2 = class46.method272(arg1, (byte) 70);
        if (arg0 != -55) {
            method1216((byte) 82, 80);
        }
        int var3 = var2.field1585;
        int var4 = var2.field1590;
        int var5 = var2.field1594;
        int var6 = class294.field4955[var5 - var4];
        return var6 & class6.field63[var3] >> var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLkd;)V", line = 222)
    public static final void method1217(byte arg0, class70 arg1) {
        arg1.field1219 = arg1.field1203;
        field3165++;
        if (arg1.field1212 == 0) {
            arg1.field1173 = 0;
            return;
        }
        if (arg1.field1192 != -1 && arg1.field1200 == 0) {
            class157 var2 = class132.method821(128, arg1.field1192);
            if (arg1.field1183 > 0 && var2.field2571 == 0) {
                arg1.field1173++;
                return;
            }
            if (arg1.field1183 <= 0 && var2.field2572 == 0) {
                arg1.field1173++;
                return;
            }
        }
        int var3 = arg1.field1193;
        int var4 = arg1.field1210;
        int var5 = arg1.field1178[arg1.field1212 - 1] * 128 + arg1.method460((byte) 116) * 64;
        if (arg0 <= 90) {
            method1217((byte) 101, (class70) null);
        }
        int var6 = arg1.field1150[arg1.field1212 - 1] * 128 + (arg1.method460((byte) 42) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field1210 = var6;
            arg1.field1193 = var5;
            return;
        }
        if (var5 > var3) {
            if (var6 > var4) {
                arg1.field1153 = 1280;
            } else if (var6 >= var4) {
                arg1.field1153 = 1536;
            } else {
                arg1.field1153 = 1792;
            }
        } else if (var3 <= var5) {
            if (var6 > var4) {
                arg1.field1153 = 1024;
            } else if (var6 < var4) {
                arg1.field1153 = 0;
            }
        } else if (var4 < var6) {
            arg1.field1153 = 768;
        } else if (var4 <= var6) {
            arg1.field1153 = 512;
        } else {
            arg1.field1153 = 256;
        }
        int var7 = arg1.field1153 - arg1.field1160 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field1207;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1204;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1151;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1152;
        }
        boolean var10 = true;
        if (var8 == -1) {
            var8 = arg1.field1204;
        }
        arg1.field1219 = var8;
        if (arg1 instanceof class60) {
            var10 = ((class60) arg1).field822.field2191;
        }
        if (var10) {
            if (arg1.field1160 != arg1.field1153 && arg1.field1174 == -1 && arg1.field1202 != 0) {
                var9 = 2;
            }
            if (arg1.field1212 > 2) {
                var9 = 6;
            }
            if (arg1.field1212 > 3) {
                var9 = 8;
            }
            if (arg1.field1173 > 0 && arg1.field1212 > 1) {
                arg1.field1173--;
                var9 = 8;
            }
        } else {
            if (arg1.field1212 > 1) {
                var9 = 6;
            }
            if (arg1.field1212 > 2) {
                var9 = 8;
            }
            if (arg1.field1173 > 0 && arg1.field1212 > 1) {
                var9 = 8;
                arg1.field1173--;
            }
        }
        if (arg1.field1199[arg1.field1212 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field1219 == arg1.field1204 && arg1.field1187 != -1) {
            arg1.field1219 = arg1.field1187;
        }
        if (var3 < var5) {
            arg1.field1193 += var9;
            if (arg1.field1193 > var5) {
                arg1.field1193 = var5;
            }
        } else if (var3 > var5) {
            arg1.field1193 -= var9;
            if (arg1.field1193 < var5) {
                arg1.field1193 = var5;
            }
        }
        if (var4 < var6) {
            arg1.field1210 += var9;
            if (arg1.field1210 > var6) {
                arg1.field1210 = var6;
            }
        } else if (var6 < var4) {
            arg1.field1210 -= var9;
            if (var6 > arg1.field1210) {
                arg1.field1210 = var6;
            }
        }
        if (arg1.field1193 == var5 && arg1.field1210 == var6) {
            arg1.field1212--;
            if (arg1.field1183 > 0) {
                arg1.field1183--;
            }
        }
    }
}
