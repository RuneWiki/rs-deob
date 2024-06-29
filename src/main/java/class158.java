import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class158 extends class253 {

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    private int field2380 = 0;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    private int field2382 = 0;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Z")
    public boolean field2377 = false;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    private int field2385 = -32768;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    private int field2388 = -1;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "Loh;")
    private class281 field2387;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Z")
    public static boolean field2379 = false;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "Lvh;")
    private class64 field2390;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
    public static int[] field2373;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIZ[[I)I", line = 5)
    public static final int method1072(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[][] arg5) {
        int var6 = (128 - arg2) * arg5[arg3][arg0] + arg5[arg3 + 1][arg0] * arg2 >> 7;
        field2376++;
        int var7 = (128 - arg2) * arg5[arg3][arg0 + 1] + arg5[arg3 + 1][arg0 + 1] * arg2 >> 7;
        if (!arg4) {
            method1078(117);
        }
        return (128 - arg1) * var6 + arg1 * var7 >> 7;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lce;ZLgd;)Lfm;", line = 24)
    public static final class127 method1073(class257 arg0, boolean arg1, class170 arg2) {
        field2392++;
        long var3 = ((long) arg0.field4027 << 56) - ((long) (-(arg0.field4022 + 1 << 16) - arg0.field4039) - ((long) arg0.field4023 << 32));
        class127 var5 = (class127) arg2.method1222(0, var3);
        if (arg1) {
            field2373 = (int[]) null;
        }
        if (var5 == null) {
            var5 = new class127(arg0.field4022, (float) arg0.field4039, true, false, arg0.field4023);
            arg2.method1227(var5, 0, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 44)
    public final void method1074(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method1075(123);
        }
        field2372++;
        if (this.field2377) {
            return;
        }
        this.field2380 += arg1;
        while (this.field2380 > this.field2387.field4322[this.field2382]) {
            this.field2380 -= this.field2387.field4322[this.field2382];
            this.field2382++;
            if (this.field2387.field4326.length <= this.field2382) {
                this.field2377 = true;
                break;
            }
        }
        if (!this.field2377) {
            class170.method1231(false, this.field2381, this.field2386, this.field2382, this.field2387, -24255);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Lwi;", line = 78)
    private final class221 method1075(int arg0) {
        field2375++;
        class265 var2 = class112.method831(this.field2378, true);
        class221 var3;
        if (this.field2377) {
            var3 = var2.method1809(-1, 2, 0, -1);
        } else {
            var3 = var2.method1809(this.field2388, 2, this.field2380, this.field2382);
        }
        if (arg0 == -1) {
            return var3 == null ? null : var3;
        } else {
            return (class221) null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I", line = 103)
    public static final int method1076(int arg0, int arg1) {
        field2393++;
        if (arg1 < 0) {
            return 0;
        }
        class137 var2 = (class137) class281.field4320.method1222(arg0, (long) arg1);
        if (var2 == null) {
            return class59.method469(arg1, (byte) -2).field444;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2158.length; var4++) {
            if (var2.field2158[var4] == -1) {
                var3++;
            }
        }
        return var3 + class59.method469(arg1, (byte) -2).field444 - var2.field2158.length;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V", line = 145)
    public static final void method1077(int arg0, int arg1) {
        field2389++;
        if (arg0 > 46) {
            class213.field3248.method2175(arg1, -1401253017);
            class257.field4031.method2175(arg1, -1401253017);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIIII)V", line = 227)
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2381 = arg2;
        this.field2386 = arg3;
        this.field2391 = arg4;
        this.field2378 = arg0;
        this.field2383 = arg1;
        this.field2371 = arg5 + arg6;
        int var8 = class112.method831(this.field2378, true).field4117;
        if (var8 == -1) {
            this.field2377 = true;
        } else {
            this.field2377 = false;
            this.field2387 = class133.method948(var8, (byte) 33);
        }
        if (this.field2371 == arg6) {
            class170.method1231(false, this.field2381, this.field2386, this.field2382, this.field2387, -24255);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V", line = 162)
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2374++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIIJILvh;)V", line = 173)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field2370++;
        class221 var13 = this.method1075(-1);
        if (var13 != null) {
            var13.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2390);
            this.field2385 = var13.method76();
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()I", line = 189)
    public final int method76() {
        field2384++;
        return this.field2385;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 218)
    public static void method1078(int arg0) {
        if (arg0 != 1) {
            method1076(-94, -90);
        }
        field2373 = null;
    }
}
