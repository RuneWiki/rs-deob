import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class191 {

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Z")
    public static boolean field3110 = true;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field3111 = -1;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field3106;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lbm;Lbm;ZLbm;Lbm;)V", line = 5)
    public static final void method1219(class307 arg0, class307 arg1, boolean arg2, class307 arg3, class307 arg4) {
        field3102++;
        class302.field4577 = arg0;
        class294.field4492 = arg1;
        if (!arg2) {
            method1219((class307) null, (class307) null, true, (class307) null, (class307) null);
        }
        class329.field5042 = arg4;
        class151.field2467 = arg3;
        class138.field2300 = new class68[class302.field4577.method2053((byte) -9)][];
        class303.field4607 = new boolean[class302.field4577.method2053((byte) -9)];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIILsc;JZ)V", line = 29)
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, class19 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class289 var8 = new class289();
        var8.field4443 = arg4;
        var8.field4442 = arg1 * 128 + 64;
        var8.field4441 = arg2 * 128 + 64;
        var8.field4447 = arg3;
        var8.field4446 = arg5;
        var8.field4444 = arg6;
        if (class326.field4975[arg0][arg1][arg2] == null) {
            class326.field4975[arg0][arg1][arg2] = new class47(arg0, arg1, arg2);
        }
        class326.field4975[arg0][arg1][arg2].field967 = var8;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIBIII)V", line = 51)
    public static final void method1221(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3109++;
        int var6 = arg0 - arg4;
        if (arg2 >= -17) {
            return;
        }
        int var7 = arg5 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class122.method792(arg1, arg4, arg5, arg3, -8);
            }
        } else if (var7 == 0) {
            class147.method962(arg1, arg0, arg4, arg3, false);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class147.field2416) {
                var10 = class147.field2416;
                var11 = var9 + (class147.field2416 * var8 >> 12);
            } else if (class259.field4024 < arg0) {
                var10 = class259.field4024;
                var11 = (class259.field4024 * var8 >> 12) + var9;
            } else {
                var11 = arg5;
                var10 = arg0;
            }
            if (var11 < class59.field1162) {
                var10 = (class59.field1162 - var9 << 12) / var8;
                var11 = class59.field1162;
            } else if (var11 > class186.field3028) {
                var10 = (class186.field3028 - var9 << 12) / var8;
                var11 = class186.field3028;
            }
            int var12;
            int var13;
            if (arg4 < class147.field2416) {
                var12 = var9 + (class147.field2416 * var8 >> 12);
                var13 = class147.field2416;
            } else if (class259.field4024 < arg4) {
                var12 = (class259.field4024 * var8 >> 12) + var9;
                var13 = class259.field4024;
            } else {
                var12 = arg3;
                var13 = arg4;
            }
            if (class59.field1162 > var12) {
                var13 = (class59.field1162 - var9 << 12) / var8;
                var12 = class59.field1162;
            } else if (var12 > class186.field3028) {
                var13 = (class186.field3028 - var9 << 12) / var8;
                var12 = class186.field3028;
            }
            class186.method1190(var13, 82, var10, arg1, var12, var11);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLbm;)V", line = 155)
    public static final void method1222(byte arg0, class307 arg1) {
        field3094++;
        class51.field1033 = arg1;
        int var2 = -2 % ((-arg0 - 26) / 56);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 167)
    public static final void method1223(byte arg0) {
        int var1 = (class66.field1265.field1869 >> 7) + class246.field3818;
        field3115++;
        int var2 = (class66.field1265.field1872 >> 7) + class101.field1769;
        if (arg0 != 43) {
            return;
        }
        class42.field814 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class42.field814 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class42.field814 = 1;
        }
        if (class42.field814 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class42.field814 = 0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Lfd;", line = 198)
    public static final class206 method1224(boolean arg0) {
        int var1 = class28.field537[0] * class176.field2833[0];
        field3117++;
        if (!arg0) {
            method1225(85);
        }
        byte[] var2 = class254.field3968[0];
        class206 var5;
        if (class61.field1178[0]) {
            int[] var6 = new int[var1];
            byte[] var7 = class114.field2014[0];
            for (int var8 = 0; var8 < var1; var8++) {
                var6[var8] = class212.method1434(class61.method475(-16777216, var7[var8] << 24), class274.field4202[class61.method475(255, var2[var8])]);
            }
            var5 = new class300(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], var6);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class274.field4202[class61.method475(var2[var4], 255)];
            }
            var5 = new class206(class194.field3127, class321.field4891, class80.field1572[0], class27.field530[0], class28.field537[0], class176.field2833[0], var3);
        }
        class97.method644((byte) 82);
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 245)
    public static final void method1225(int arg0) {
        if (arg0 != 0) {
            field3095 = -80;
        }
        for (int var1 = -1; var1 < class305.field4623; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class283.field4384[var1];
            }
            class278 var3 = class97.field1715[var2];
            if (var3 != null) {
                class72.method557(var3, 0, var3.method710(~arg0));
            }
        }
        field3114++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JZB)V", line = 279)
    public static final void method1226(long arg0, boolean arg1, byte arg2) {
        field3116++;
        if (arg0 == 0L) {
            return;
        }
        if (class77.field1538 >= 100) {
            class42.method321(class123.field2132, 0, 1, "");
            return;
        }
        String var4 = class159.method1024(arg0, (byte) 83);
        for (int var5 = 0; var5 < class77.field1538; var5++) {
            if (class291.field4471[var5] == arg0) {
                class42.method321(var4 + class69.field1475, 0, arg2 + 41, "");
                return;
            }
        }
        if (arg2 != -40) {
            method1220(14, 64, 72, -83, (class19) null, 36L, true);
        }
        for (int var6 = 0; var6 < class274.field4197; var6++) {
            if (class248.field3859[var6] == arg0) {
                class42.method321(class166.field2677 + var4 + class253.field3961, 0, 1, "");
                return;
            }
        }
        if (var4.equals(class66.field1265.field4269)) {
            class42.method321(class101.field1777, 0, 1, "");
            return;
        }
        class4.field102++;
        class291.field4471[class77.field1538] = arg0;
        class122.field2108[class77.field1538] = class58.method451(60, arg0);
        class131.field2221[class77.field1538++] = arg1;
        class165.field2670 = class342.field5323;
        class14.field263.method80(221, (byte) 104);
        class14.field263.method1353((byte) -105, arg0);
    }
}
