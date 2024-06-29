import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class193 extends class189 {

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Z")
    public boolean field3289 = false;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public int field3302 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lsk;")
    private class243 field3293 = new class243();

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    private int field3311 = 0;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "Lid;")
    public class226 field3309 = new class226();

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Z")
    private boolean field3318 = false;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    private int field3319 = 0;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[Lkh;")
    public class6[] field3290;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "J")
    private long field3297;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3295 = 0;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Z")
    private static boolean field3298 = false;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field3304 = 0;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "Lpj;")
    public static class51 field3301 = new class51(8);

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    private static int field3308 = 0;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "[Z")
    private static boolean[] field3306 = new boolean[8];

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[Z")
    private static boolean[] field3307 = new boolean[8];

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3310 = 2;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public int field3313;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "J")
    public long field3296;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "J")
    private long field3299;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Lsk;")
    private static class243 field3292;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[Lkh;")
    public static class6[] field3291;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
    public static final void method1325() {
        field3301 = new class51(8);
        field3308 = 0;
        for (class193 var0 = (class193) field3292.method1678(19); var0 != null; var0 = (class193) field3292.method1677(111)) {
            var0.method1338();
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V")
    public final void method1326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1332(arg0, arg1, class23.field301 + arg2, class120.field2032 + arg3, class184.field3099 + arg4);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(J)Z")
    private final boolean method1327(long arg0) {
        long var3;
        if (this.field3297 > this.field3299) {
            var3 = this.field3297;
        } else {
            var3 = this.field3299;
        }
        int var5 = (int) (this.field3296 - var3);
        if (var5 > 750) {
            this.method1338();
            return false;
        }
        if (this.field3299 > 0L) {
            this.field3322 = this.field3321 - (this.field3316 << 6) >> 7;
            this.field3315 = ((this.field3316 << 6) + this.field3321 >> 7) - 1;
            this.field3313 = this.field3325 - (this.field3314 << 6) >> 7;
            this.field3317 = ((this.field3314 << 6) + this.field3325 >> 7) - 1;
            this.field3324 = this.field3326;
            if (this.field3323 < 3) {
                this.field3312 = class218.field3754[this.field3323 + 1][this.field3322][this.field3313] + class218.field3754[this.field3323 + 1][this.field3315][this.field3313] + class218.field3754[this.field3323 + 1][this.field3322][this.field3317] + class218.field3754[this.field3323 + 1][this.field3315][this.field3317] >> 2;
            } else {
                this.field3312 = this.field3324 - 1024;
            }
            int var6 = class76.field1192[this.field3320];
            int var7 = class76.field1189[this.field3320];
            this.method1333(var6, var7);
            if (this.field3318) {
                class167 var8 = (class167) this.field3293.method1678(66);
                while (true) {
                    if (var8 == null) {
                        this.field3318 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field2794.field854; var9++) {
                        var8.method1120(true, this.field3296, var7, 1, var6, (byte) -76);
                    }
                    var8 = (class167) this.field3293.method1677(126);
                }
            }
            int var10 = (int) (arg0 - this.field3296);
            for (class167 var11 = (class167) this.field3293.method1678(3); var11 != null; var11 = (class167) this.field3293.method1677(112)) {
                var11.method1120(var5 < 10, arg0, var7, var10, var6, (byte) -76);
            }
        }
        this.field3296 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static final void method1328(int arg0) {
        field3310 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()V")
    public static void method1329() {
        field3292 = null;
        field3291 = null;
        field3301 = null;
        field3306 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(J)V")
    public static final void method1330(long arg0) {
        field3304 = 0;
        field3303 = 0;
        long var2 = class149.method1024(-14898);
        for (class193 var4 = (class193) field3292.method1678(111); var4 != null; var4 = (class193) field3292.method1677(-89)) {
            if (var4.method1327(arg0)) {
                field3304++;
            }
        }
        if (field3298 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field3292.method1674(0) + ", running: " + field3304 + ". Particles: " + field3303 + ". Time taken: " + (class149.method1024(-14898) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([Loe;[Lqh;Z[I[I[I)V")
    public final void method1331(class71[] arg0, class28[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field3289) {
            this.method1334(arg0, arg2, arg3, arg4, arg5);
            this.method1336(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIIII)V")
    public final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3289) {
            return;
        }
        if (this.field3320 != arg0) {
            for (class167 var6 = (class167) this.field3293.method1678(48); var6 != null; var6 = (class167) this.field3293.method1677(-31)) {
                var6.field2771 = true;
            }
        }
        this.field3299 = this.field3296;
        this.field3320 = arg0;
        this.field3323 = arg1;
        this.field3321 = arg2;
        this.field3326 = arg3;
        this.field3325 = arg4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
    private final void method1333(int arg0, int arg1) {
        for (class159 var3 = (class159) this.field3309.method1566(-3); var3 != null; var3 = (class159) this.field3309.method1570(3)) {
            var3.field2645 = this.field3321 + var3.field2637;
            var3.field2652 = this.field3326 + var3.field2641;
            var3.field2649 = this.field3325 + var3.field2642;
            if (this.field3320 == 0) {
                var3.field2640 = var3.field2643.field413.field3018;
                var3.field2648 = var3.field2643.field413.field2992;
            } else {
                int var4 = var3.field2643.field413.field3018;
                int var5 = var3.field2643.field413.field2992;
                var3.field2640 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field2648 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([Loe;Z[I[I[I)V")
    private final void method1334(class71[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3306[var6] = false;
        }
        label65: for (class167 var7 = (class167) this.field3293.method1678(124); var7 != null; var7 = (class167) this.field3293.method1677(110)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field2767) {
                        field3306[var11] = true;
                        var7.field2784 = false;
                        continue label65;
                    }
                }
            }
            if (!arg1) {
                if (var7.field2762 == 0) {
                    var7.method1308((byte) 64);
                    this.field3311--;
                } else {
                    var7.field2784 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field3311 != 8; var8++) {
                if (!field3306[var8]) {
                    class167 var9 = new class167(arg0[var8], this, this.field3296);
                    this.field3293.method1676((byte) -127, var9);
                    this.field3311++;
                }
            }
        }
        for (class167 var10 = (class167) this.field3293.method1678(92); var10 != null; var10 = (class167) this.field3293.method1677(126)) {
            var10.method1123(arg2[var10.field2767.field1116], arg3[var10.field2767.field1123], arg3[var10.field2767.field1116], arg2[var10.field2767.field1123], arg4[var10.field2767.field1123], 64512, arg3[var10.field2767.field1121], arg2[var10.field2767.field1121], arg4[var10.field2767.field1116], arg4[var10.field2767.field1121]);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()V")
    public final void method1335() {
        this.field3318 = true;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([Lqh;Z[I[I[I)V")
    private final void method1336(class28[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field3307[var6] = false;
        }
        label74: for (class159 var7 = (class159) this.field3309.method1566(-3); var7 != null; var7 = (class159) this.field3309.method1570(3)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field2643) {
                        field3307[var11] = true;
                        continue label74;
                    }
                }
            }
            if (!arg1) {
                var7.method441(16773377);
                this.field3319--;
                if (var7.method1948(true)) {
                    var7.method1953(91923);
                    field3308--;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field3319 != 8; var8++) {
                if (!field3307[var8]) {
                    class159 var9 = null;
                    if (arg0[var8].field413.field2996 == 1 && field3308 < 32) {
                        var9 = new class159(arg0[var8], this);
                        field3301.method328((long) arg0[var8].field413.field3001, var9, 1371);
                        field3308++;
                    }
                    if (var9 == null) {
                        var9 = new class159(arg0[var8], this);
                    }
                    this.field3309.method1574(var9, 0);
                    this.field3319++;
                }
            }
        }
        for (class159 var10 = (class159) this.field3309.method1566(-3); var10 != null; var10 = (class159) this.field3309.method1570(3)) {
            var10.method1082(arg4[var10.field2643.field408], arg2[var10.field2643.field408], arg3[var10.field2643.field408], 0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljl;)V")
    public static final void method1337(class101 arg0) {
        field3305 = 0;
        field3295 = 0;
        field3292 = new class243();
        field3291 = new class6[1024];
        class228.method1583(-10, arg0);
        class13.method97(arg0, -1);
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "()V")
    public final void method1338() {
        this.field3289 = true;
        for (class159 var1 = (class159) this.field3309.method1566(-3); var1 != null; var1 = (class159) this.field3309.method1570(3)) {
            if (var1.field2643.field413.field2996 == 1) {
                var1.method1953(91923);
            }
        }
        this.field3290 = new class6[8192];
        this.field3302 = 0;
        this.field3293 = new class243();
        this.field3311 = 0;
        this.field3309 = new class226();
        this.field3319 = 0;
        this.method1308((byte) 64);
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "()I")
    public static final int method1339() {
        return field3310;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(III)V")
    public class193(int arg0, int arg1, int arg2) {
        this.field3316 = arg1;
        this.field3314 = arg2;
        this.field3290 = new class6[8192];
        this.field3297 = (long) arg0;
        this.field3318 = true;
        field3292.method1676((byte) -127, this);
    }

    static {
        new class187(131056);
    }
}
