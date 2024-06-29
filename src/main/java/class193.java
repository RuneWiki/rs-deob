import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class193 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lhi;")
    private static class82 field3264 = class95.method664((byte) -91, "Discard");

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lhi;")
    public static class82 field3266 = class95.method664((byte) -111, "Mem:");

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lhi;")
    public static class82 field3262 = field3264;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lhi;")
    public static class82 field3269 = class95.method664((byte) -45, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Z")
    public static boolean field3276 = false;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3261 = -1;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lhi;")
    public static class82 field3279 = class95.method664((byte) -112, "");

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lhi;")
    public static class82 field3282 = class95.method664((byte) -61, "Continuer");

    @OriginalMember(owner = "client!td", name = "x", descriptor = "[[I")
    public static int[][] field3283 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lhi;")
    private static class82 field3260 = class95.method664((byte) -52, "Face here");

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lhi;")
    public static class82 field3275 = field3260;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3280 = 99;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Ltd;")
    public class193 field3268;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ltd;")
    public class193 field3274;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[Lve;")
    public static class212[] field3278;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 4)
    public final void method1339(int arg0) {
        field3265++;
        if (this.field3268 == null) {
            return;
        }
        this.field3268.field3274 = this.field3274;
        this.field3274.field3268 = this.field3268;
        if (arg0 == 0) {
            this.field3268 = null;
            this.field3274 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 31)
    public static void method1340(int arg0) {
        field3264 = null;
        if (arg0 < 45) {
            field3279 = (class82) null;
        }
        field3282 = null;
        field3279 = null;
        field3283 = (int[][]) null;
        field3278 = null;
        field3275 = null;
        field3262 = null;
        field3260 = null;
        field3269 = null;
        field3266 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILhi;)V", line = 53)
    public static final void method1341(int arg0, class82 arg1) {
        field3273++;
        if (class157.field2662 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method568(22476);
        if (var3 == 0L) {
            return;
        }
        if (arg0 <= 38) {
            field3278 = (class212[]) null;
        }
        while (var2 < class157.field2662.length && class157.field2662[var2].field2418 != var3) {
            var2++;
        }
        if (class157.field2662.length > var2 && class157.field2662[var2] != null) {
            class61.field957.method1504(207, -1);
            class136.field2342++;
            class61.field957.method1057((byte) 43, class157.field2662[var2].field2418);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1342(int arg0, int arg1, int arg2) {
        field3281++;
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class79.field1342[arg0];
        int var5 = class286.field4809[arg0];
        if (arg1 == 0) {
            class110.field1959++;
            class61.field957.method1504(206, -1);
            class61.field957.method1075(var3 + var3 + 3, -1);
        }
        if (arg1 == 1) {
            class61.field957.method1504(234, -1);
            class284.field4774++;
            class61.field957.method1075(var3 + var3 + 14 + 3, -1);
        }
        if (arg1 == 2) {
            class61.field957.method1504(196, -1);
            class180.field3068++;
            class61.field957.method1075(var3 + var3 + 3, -1);
        }
        class61.field957.method1064((byte) -122, class19.field235[82] ? 1 : 0);
        class61.field957.method1102((byte) -112, class226.field3916 + var4);
        class111.field2008 = class286.field4809[0];
        class38.field634 = class79.field1342[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class61.field957.method1055(class286.field4809[arg0] - var5, 0);
            class61.field957.method1075(class79.field1342[arg0] - var4, -1);
        }
        if (arg2 > -7) {
            field3283 = (int[][]) ((int[][]) null);
        }
        class61.field957.method1070(class230.field3976 + var5, (byte) 59);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Luf;IIIIII)V", line = 171)
    public static final void method1343(class189 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        field3271++;
        long var8 = 0L;
        boolean var10 = false;
        if (arg5 == 0) {
            var8 = class317.method2173(arg4, arg1, arg2);
        } else if (arg5 == 1) {
            var8 = class33.method258(arg4, arg1, arg2);
        } else if (arg5 == 2) {
            var8 = class297.method2054(arg4, arg1, arg2);
        } else if (arg5 == 3) {
            var8 = class262.method1870(arg4, arg1, arg2);
        }
        if (arg3 != 24775) {
            return;
        }
        boolean var11 = false;
        int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
        class157 var13 = class99.method682(var12, (byte) -122);
        int var14 = (int) var8 >> 20 & 0x3;
        if (var13.method1120(arg3 - 24778)) {
            class83.method581(var13, arg2, true, arg4, arg1);
        }
        int var15 = ((int) var8 & 0x7E9C8) >> 14;
        if (var8 == 0L) {
            return;
        }
        class175 var16 = null;
        class175 var17 = null;
        if (arg5 == 0) {
            class90 var21 = class323.method2227(arg4, arg1, arg2);
            if (var21 != null) {
                var16 = var21.field1617;
                var17 = var21.field1626;
            }
            if (var13.field2670 != 0) {
                arg0.method1312(var15, var14, arg1, arg2, -1, var13.field2664);
            }
        } else if (arg5 == 1) {
            class182 var18 = class104.method716(arg4, arg1, arg2);
            if (var18 != null) {
                var17 = var18.field3103;
                var16 = var18.field3107;
            }
        } else if (arg5 == 2) {
            class69 var19 = class308.method2127(arg4, arg1, arg2);
            if (var19 != null) {
                var17 = var19.field1075;
            }
            if (var13.field2670 != 0 && (var13.field2704 + arg1) < 104 && (arg2 + var13.field2704) < 104 && (var13.field2725 + arg1) < 104 && (arg2 + var13.field2725) < 104) {
                arg0.method1308(var13.field2704, arg1, var13.field2664, var13.field2725, arg2, var14, (byte) -64);
            }
        } else if (arg5 == 3) {
            class123 var20 = class136.method930(arg4, arg1, arg2);
            if (var20 != null) {
                var17 = var20.field2150;
            }
            if (var13.field2670 == 1) {
                arg0.method1315(arg2, arg1, -262145);
            }
        }
        if (!class147.field2485 || !var13.field2683) {
            return;
        }
        if (var15 == 2) {
            if (var17 instanceof class160) {
                ((class160) var17).method1159(arg3 - 24776);
            } else {
                class232.method1642(arg6, 0, arg3 - 24686, arg1, arg2, var14 + 4, 0, var15, var13);
            }
            if (var16 instanceof class160) {
                ((class160) var16).method1159(-1);
            } else {
                class232.method1642(arg6, 0, arg3 ^ 0x6095, arg1, arg2, var14 + 1 & 0x3, 0, var15, var13);
            }
        } else if (var15 == 5) {
            if (var17 instanceof class160) {
                ((class160) var17).method1159(-1);
            } else {
                class232.method1642(arg6, class245.field4251[var14] * 8, 101, arg1, arg2, var14, class66.field1033[var14] * 8, 4, var13);
            }
        } else if (var15 == 6) {
            if (var17 instanceof class160) {
                ((class160) var17).method1159(-1);
            } else {
                class232.method1642(arg6, class100.field1793[var14] * 8, 73, arg1, arg2, var14 + 4, class224.field3891[var14] * 8, 4, var13);
            }
        } else if (var15 == 7) {
            if (var17 instanceof class160) {
                ((class160) var17).method1159(-1);
            } else {
                class232.method1642(arg6, 0, 99, arg1, arg2, (var14 + 2 & 0x3) + 4, 0, 4, var13);
            }
        } else if (var15 == 8) {
            if ((var17 instanceof class160)) {
                ((class160) var17).method1159(-1);
            } else {
                class232.method1642(arg6, class100.field1793[var14] * 8, 104, arg1, arg2, var14 + 4, class224.field3891[var14] * 8, 4, var13);
            }
            if (var16 instanceof class160) {
                ((class160) var16).method1159(-1);
            } else {
                class232.method1642(arg6, class100.field1793[var14] * 8, 123, arg1, arg2, (var14 + 2 & 0x3) + 4, class224.field3891[var14] * 8, 4, var13);
            }
        } else if (var15 == 11) {
            if (var17 instanceof class160) {
                ((class160) var17).method1159(arg3 ^ 0xFFFF9F38);
            } else {
                class232.method1642(arg6, 0, 62, arg1, arg2, var14 + 4, 0, 10, var13);
            }
        } else if ((var17 instanceof class160)) {
            ((class160) var17).method1159(-1);
        } else {
            class232.method1642(arg6, 0, arg3 ^ 0x60BF, arg1, arg2, var14, 0, var15, var13);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z[J[I)V", line = 365)
    public static final void method1344(boolean arg0, long[] arg1, int[] arg2) {
        field3270++;
        if (!arg0) {
            class328.method2248(1, arg1, arg1.length - 1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I", line = 394)
    public static final int method1345(int arg0, int arg1) {
        if (arg1 == 255) {
            field3263++;
            return arg0 & 0xFF;
        } else {
            return -86;
        }
    }
}
