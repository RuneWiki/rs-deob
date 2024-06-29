import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 {

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    private int field3348 = 0;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "[Lca;")
    private class16[] field3336;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lje;")
    public static class67 field3341 = class85.method592(255, "sl_stars");

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Luf;")
    public static class145 field3339 = new class145(4096);

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "[I")
    public static int[] field3352 = new int[50];

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Lje;")
    public static class67 field3351 = class85.method592(255, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "J")
    private long field3331;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lca;")
    private class16 field3338;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Lca;")
    private class16 field3349;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lfd;")
    public static class40 field3347;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "[I")
    public static int[] field3353;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(JLca;I)V")
    public final void method1115(long arg0, class16 arg1, int arg2) {
        field3345++;
        if (arg1.field285 != null) {
            arg1.method115(26851);
        }
        class16 var5 = this.field3336[(int) ((long) (this.field3333 - arg2) & arg0)];
        arg1.field285 = var5.field285;
        arg1.field300 = arg0;
        arg1.field293 = var5;
        arg1.field285.field293 = arg1;
        arg1.field293.field285 = arg1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Lca;")
    public final class16 method1116(int arg0) {
        this.field3348 = arg0;
        field3340++;
        return this.method1124(~arg0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method1117(boolean arg0) {
        if (!arg0) {
            method1117(true);
        }
        field3351 = null;
        field3347 = null;
        field3353 = null;
        field3341 = null;
        field3339 = null;
        field3352 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBLta;)V")
    public static final void method1118(int arg0, byte arg1, class133 arg2) {
        if (arg1 != 97) {
            method1118(16, (byte) 73, null);
        }
        if (arg2.field2956 > class34.field627) {
            class38.method238(arg2, arg1 ^ 0xFFFFFF9D);
        } else if (arg2.field2952 >= class34.field627) {
            class64.method431(3, arg2);
        } else {
            method1120(arg2, arg1 - 108);
        }
        field3329++;
        if (arg2.field2957 < 128 || arg2.field2963 < 128 || arg2.field2957 >= 13184 || arg2.field2963 >= 13184) {
            arg2.field2957 = arg2.field2942[0] * 128 + arg2.field2958 * 64;
            arg2.field2952 = 0;
            arg2.field2990 = -1;
            arg2.field2991 = -1;
            arg2.field2963 = arg2.field2993[0] * 128 + arg2.field2958 * 64;
            arg2.field2956 = 0;
            arg2.method1014((byte) -62);
        }
        if (class37.field667 == arg2 && (arg2.field2957 < 1536 || arg2.field2963 < 1536 || arg2.field2957 >= 11776 || arg2.field2963 >= 11776)) {
            arg2.field2957 = arg2.field2942[0] * 128 + arg2.field2958 * 64;
            arg2.field2990 = -1;
            arg2.field2956 = 0;
            arg2.field2952 = 0;
            arg2.field2963 = arg2.field2993[0] * 128 + arg2.field2958 * 64;
            arg2.field2991 = -1;
            arg2.method1014((byte) -62);
        }
        class88.method612(64, arg2);
        class25.method171(arg2, arg1 + 24226);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IJ)Lca;")
    public final class16 method1119(int arg0, long arg1) {
        field3330++;
        if (arg0 != 28254) {
            return null;
        }
        this.field3331 = arg1;
        class16 var4 = this.field3336[(int) ((long) (this.field3333 - 1) & arg1)];
        for (this.field3338 = var4.field293; this.field3338 != var4; this.field3338 = this.field3338.field293) {
            if (this.field3338.field300 == arg1) {
                class16 var5 = this.field3338;
                this.field3338 = this.field3338.field293;
                return var5;
            }
        }
        this.field3338 = null;
        return null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lta;I)V")
    private static final void method1120(class133 arg0, int arg1) {
        arg0.field2960 = arg0.field2954;
        field3343++;
        if (arg0.field2947 == 0) {
            arg0.field2934 = 0;
            return;
        }
        if (arg0.field2991 != -1 && arg0.field2987 == 0) {
            class93 var2 = class49.method316(arg0.field2991, false);
            if (arg0.field2950 > 0 && var2.field2095 == 0) {
                arg0.field2934++;
                return;
            }
            if (arg0.field2950 <= 0 && var2.field2083 == 0) {
                arg0.field2934++;
                return;
            }
        }
        int var3 = arg0.field2957;
        int var4 = arg0.field2942[arg0.field2947 - 1] * 128 + arg0.field2958 * 64;
        int var5 = arg0.field2993[arg0.field2947 - 1] * 128 + arg0.field2958 * 64;
        int var6 = arg0.field2963;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var5 - var6 > 256 || var5 - var6 < -256) {
            arg0.field2957 = var4;
            arg0.field2963 = var5;
            return;
        }
        boolean var7 = true;
        int var8 = arg0.field2986;
        int var9 = 4;
        if (var4 <= var3) {
            if (var3 <= var4) {
                if (var6 < var5) {
                    arg0.field2972 = 1024;
                } else if (var6 > var5) {
                    arg0.field2972 = 0;
                }
            } else if (var6 < var5) {
                arg0.field2972 = 768;
            } else if (var5 < var6) {
                arg0.field2972 = 256;
            } else {
                arg0.field2972 = 512;
            }
        } else if (var6 < var5) {
            arg0.field2972 = 1280;
        } else if (var6 <= var5) {
            arg0.field2972 = 1536;
        } else {
            arg0.field2972 = 1792;
        }
        int var10 = 71 / ((51 - arg1) / 59);
        int var11 = arg0.field2972 - arg0.field2992 & 0x7FF;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 >= -256 && var11 <= 256) {
            var8 = arg0.field2935;
        } else if (var11 >= 256 && var11 < 768) {
            var8 = arg0.field2998;
        } else if (var11 >= -768 && var11 <= -256) {
            var8 = arg0.field2945;
        }
        if (var8 == -1) {
            var8 = arg0.field2935;
        }
        arg0.field2960 = var8;
        if (arg0 instanceof class24) {
            var7 = ((class24) arg0).field442.field2525;
        }
        if (var7) {
            if (arg0.field2992 != arg0.field2972 && arg0.field2988 == -1 && arg0.field2967 != 0) {
                var9 = 2;
            }
            if (arg0.field2947 > 2) {
                var9 = 6;
            }
            if (arg0.field2947 > 3) {
                var9 = 8;
            }
            if (arg0.field2934 > 0 && arg0.field2947 > 1) {
                arg0.field2934--;
                var9 = 8;
            }
        } else {
            if (arg0.field2947 > 1) {
                var9 = 6;
            }
            if (arg0.field2947 > 2) {
                var9 = 8;
            }
            if (arg0.field2934 > 0 && arg0.field2947 > 1) {
                var9 = 8;
                arg0.field2934--;
            }
        }
        if (arg0.field2985[arg0.field2947 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field2960 == arg0.field2935 && arg0.field2946 != -1) {
            arg0.field2960 = arg0.field2946;
        }
        if (var4 > var3) {
            arg0.field2957 += var9;
            if (var4 < arg0.field2957) {
                arg0.field2957 = var4;
            }
        } else if (var4 < var3) {
            arg0.field2957 -= var9;
            if (arg0.field2957 < var4) {
                arg0.field2957 = var4;
            }
        }
        if (var5 > var6) {
            arg0.field2963 += var9;
            if (var5 < arg0.field2963) {
                arg0.field2963 = var5;
            }
        } else if (var5 < var6) {
            arg0.field2963 -= var9;
            if (arg0.field2963 < var5) {
                arg0.field2963 = var5;
            }
        }
        if (arg0.field2957 != var4 || arg0.field2963 != var5) {
            return;
        }
        arg0.field2947--;
        if (arg0.field2950 > 0) {
            arg0.field2950--;
            return;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILqb;II)V")
    public static final void method1121(int arg0, int arg1, int arg2, class113 arg3, int arg4, int arg5) {
        field3332++;
        if (arg3 == null) {
            return;
        }
        int var6 = class47.field874 + class25.field463 & 0x7FF;
        int var7 = arg0 * arg0 + arg2 * arg2;
        if (var7 > 6400) {
            return;
        }
        int var8 = class96.field2143[var6];
        int var9 = var8 * 256 / (class115.field2603 + 256);
        int var10 = class96.field2148[var6];
        int var11 = var10 * 256 / (class115.field2603 + 256);
        int var12 = arg2 * var11 - arg0 * var9 >> 16;
        int var13 = arg2 * var9 + arg0 * var11 >> 16;
        if (arg4 <= 68) {
            method1117(true);
        }
        if (var7 > 2500) {
            arg3.method902(class46.field846, var13 + arg5 + 94 + 4 - arg3.field2573 / 2, arg1 - (-83 - (-(arg3.field2574 / 2) - 4)) + -var12);
        } else {
            arg3.method916(arg5 + var13 + 94 + 4 - arg3.field2573 / 2, arg1 - -83 + -4 - (var12 - -(arg3.field2574 / 2)));
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
    public class145(int arg0) {
        this.field3333 = arg0;
        this.field3336 = new class16[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class16 var3 = this.field3336[var2] = new class16();
            var3.field293 = var3;
            var3.field285 = var3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILkc;I)Lje;")
    public static final class67 method1122(int arg0, class72 arg1, int arg2) {
        field3328++;
        if (!class107.method849((byte) 60, class140.method1063(arg1, (byte) -84), arg2) && arg1.field1452 == null) {
            return null;
        }
        if (arg0 != -1) {
            method1122(27, null, -92);
        }
        if (arg1.field1529 == null || arg2 >= arg1.field1529.length || arg1.field1529[arg2] == null || arg1.field1529[arg2].method459((byte) 52).method445(false) == 0) {
            return class81.field1794 ? class49.method314(new class67[] { class148.field3389, class60.method420(arg2, arg0 + 28499) }, 0) : null;
        } else {
            return arg1.field1529[arg2];
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static final void method1123(int arg0) {
        if (arg0 == 0) {
            class51.field1006 = true;
            class41.field773 = true;
            field3342++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Lca;")
    public final class16 method1124(int arg0) {
        if (arg0 != -1) {
            this.method1124(26);
        }
        field3335++;
        if (this.field3348 > 0 && this.field3336[this.field3348 - 1] != this.field3349) {
            class16 var2 = this.field3349;
            this.field3349 = var2.field293;
            return var2;
        }
        while (this.field3333 > this.field3348) {
            class16 var3 = this.field3336[this.field3348++].field293;
            if (this.field3336[this.field3348 - 1] != var3) {
                this.field3349 = var3.field293;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Lca;")
    public final class16 method1125(byte arg0) {
        field3346++;
        if (this.field3338 == null) {
            return null;
        }
        class16 var2 = this.field3336[(int) (this.field3331 & (long) (this.field3333 - 1))];
        if (arg0 != 12) {
            this.field3338 = null;
        }
        while (this.field3338 != var2) {
            if (this.field3338.field300 == this.field3331) {
                class16 var3 = this.field3338;
                this.field3338 = this.field3338.field293;
                return var3;
            }
            this.field3338 = this.field3338.field293;
        }
        this.field3338 = null;
        return null;
    }
}
