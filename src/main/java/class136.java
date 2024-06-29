import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class136 extends class276 {

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public int field2369 = 0;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Z")
    public boolean field2374 = false;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lqb;")
    private class58 field2367 = new class58();

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    private int field2388 = 0;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "Lng;")
    public class76 field2386 = new class76();

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "Z")
    private boolean field2395 = false;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    private int field2401 = 0;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    private int field2400;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "[Lgb;")
    public class148[] field2381;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "J")
    private long field2379;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field2370 = 0;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2366 = 0;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
    private static boolean field2372 = false;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Ljk;")
    public static class254 field2373 = new class254(8);

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    private static int field2383 = 0;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "[Z")
    private static boolean[] field2387 = new boolean[8];

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "[Z")
    private static boolean[] field2385 = new boolean[8];

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field2384 = 2;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "J")
    private long field2371;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "J")
    public long field2380;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Lqb;")
    private static class58 field2382;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "[Lgb;")
    public static class148[] field2377;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lsi;Z[I[I[I)V")
    private final void method920(class199[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2385[var6] = false;
        }
        label74: for (class272 var7 = (class272) this.field2386.method529(10); var7 != null; var7 = (class272) this.field2386.method533(83)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field4807) {
                        field2385[var11] = true;
                        continue label74;
                    }
                }
            }
            if (!arg1) {
                var7.method828((byte) -53);
                this.field2401--;
                if (var7.method1344(101)) {
                    var7.method1346(28);
                    field2383--;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field2401 != 8; var8++) {
                if (!field2385[var8]) {
                    class272 var9 = null;
                    if (arg0[var8].field3455.field4367 == 1 && field2383 < 32) {
                        var9 = new class272(arg0[var8], this);
                        field2373.method1639(1, var9, (long) arg0[var8].field3455.field4361);
                        field2383++;
                    }
                    if (var9 == null) {
                        var9 = new class272(arg0[var8], this);
                    }
                    this.field2386.method536(var9, (byte) -45);
                    this.field2401++;
                }
            }
        }
        for (class272 var10 = (class272) this.field2386.method529(10); var10 != null; var10 = (class272) this.field2386.method533(67)) {
            var10.method1805(arg3[var10.field4807.field3462], arg4[var10.field4807.field3462], arg2[var10.field4807.field3462], -49);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
    public static final void method921() {
        field2373 = new class254(8);
        field2383 = 0;
        for (class136 var0 = (class136) field2382.method393((byte) 98); var0 != null; var0 = (class136) field2382.method391(107)) {
            var0.method931();
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public final void method922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2374) {
            return;
        }
        if (this.field2403 != arg0) {
            for (class248 var6 = (class248) this.field2367.method393((byte) 21); var6 != null; var6 = (class248) this.field2367.method391(106)) {
                var6.field4270 = true;
            }
        }
        this.field2371 = this.field2380;
        this.field2403 = arg0;
        this.field2399 = arg1;
        this.field2397 = arg2;
        this.field2390 = arg3;
        this.field2392 = arg4;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
    public final void method923() {
        this.field2395 = true;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static final void method924(int arg0) {
        field2384 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    private final void method925(int arg0, int arg1) {
        for (class272 var3 = (class272) this.field2386.method529(10); var3 != null; var3 = (class272) this.field2386.method533(96)) {
            var3.field4794 = this.field2397 + var3.field4804;
            var3.field4810 = this.field2390 + var3.field4801;
            var3.field4795 = this.field2392 + var3.field4800;
            if (this.field2403 == 0) {
                var3.field4793 = var3.field4807.field3455.field4363;
                var3.field4803 = var3.field4807.field3455.field4366;
            } else {
                int var4 = var3.field4807.field3455.field4363;
                int var5 = var3.field4807.field3455.field4366;
                var3.field4793 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field4803 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ltg;)V")
    public static final void method926(class182 arg0) {
        field2366 = 0;
        field2370 = 0;
        field2382 = new class58();
        field2377 = new class148[1024];
        class187.method1278((byte) -74, arg0);
        class50.method349(arg0, 1000);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lui;Z[I[I[I)V")
    private final void method927(class230[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2387[var6] = false;
        }
        label65: for (class248 var7 = (class248) this.field2367.method393((byte) -120); var7 != null; var7 = (class248) this.field2367.method391(122)) {
            if (arg0 != null) {
                for (int var11 = 0; var11 < arg0.length; var11++) {
                    if (arg0[var11] == var7.field4285) {
                        field2387[var11] = true;
                        var7.field4281 = false;
                        continue label65;
                    }
                }
            }
            if (!arg1) {
                if (var7.field4264 == 0) {
                    var7.method1828(-1072);
                    this.field2388--;
                } else {
                    var7.field4281 = true;
                }
            }
        }
        if (arg0 != null) {
            for (int var8 = 0; var8 < arg0.length && this.field2388 != 8; var8++) {
                if (!field2387[var8]) {
                    class248 var9 = new class248(arg0[var8], this, this.field2380);
                    this.field2367.method395((byte) 30, var9);
                    this.field2388++;
                }
            }
        }
        for (class248 var10 = (class248) this.field2367.method393((byte) -107); var10 != null; var10 = (class248) this.field2367.method391(112)) {
            var10.method1606(arg2[var10.field4285.field3982], arg3[var10.field4285.field3972], arg4[var10.field4285.field3988], arg2[var10.field4285.field3972], 110, arg3[var10.field4285.field3982], arg2[var10.field4285.field3988], arg4[var10.field4285.field3982], arg3[var10.field4285.field3988], arg4[var10.field4285.field3972]);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lui;[Lsi;Z[I[I[I)V")
    public final void method928(class230[] arg0, class199[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2374) {
            this.method927(arg0, arg2, arg3, arg4, arg5);
            this.method920(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()I")
    public static final int method929() {
        return field2384;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()V")
    public static void method930() {
        field2382 = null;
        field2377 = null;
        field2373 = null;
        field2387 = null;
        field2385 = null;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "()V")
    public final void method931() {
        this.field2374 = true;
        for (class272 var1 = (class272) this.field2386.method529(10); var1 != null; var1 = (class272) this.field2386.method533(116)) {
            if (var1.field4807.field3455.field4367 == 1) {
                var1.method1346(120);
            }
        }
        this.field2381 = new class148[8192];
        this.field2369 = 0;
        this.field2367 = new class58();
        this.field2388 = 0;
        this.field2386 = new class76();
        this.field2401 = 0;
        this.method1828(-1072);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIII)V")
    public final void method932(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method922(arg0, arg1, class260.field4540 + arg2, class240.field4154 + arg3, class163.field2869 + arg4);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(J)V")
    public static final void method933(long arg0) {
        field2375 = 0;
        field2368 = 0;
        long var2 = class231.method1513(-64);
        for (class136 var4 = (class136) field2382.method393((byte) 100); var4 != null; var4 = (class136) field2382.method391(118)) {
            if (var4.method934(arg0)) {
                field2375++;
            }
        }
        if (field2372 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2382.method392((byte) 124) + ", running: " + field2375 + ". Particles: " + field2368 + ". Time taken: " + (class231.method1513(112) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(J)Z")
    private final boolean method934(long arg0) {
        long var3;
        if (this.field2379 > this.field2371) {
            var3 = this.field2379;
        } else {
            var3 = this.field2371;
        }
        int var5 = (int) (this.field2380 - var3);
        if (var5 > 750) {
            this.method931();
            return false;
        }
        if (this.field2371 > 0L) {
            this.field2398 = this.field2397 - (this.field2389 << 6) >> 7;
            this.field2402 = ((this.field2389 << 6) + this.field2397 >> 7) - 1;
            this.field2391 = this.field2392 - (this.field2400 << 6) >> 7;
            this.field2393 = ((this.field2400 << 6) + this.field2392 >> 7) - 1;
            this.field2396 = this.field2390;
            if (this.field2399 < 3) {
                this.field2394 = class189.field3337[this.field2399 + 1][this.field2402][this.field2391] + class189.field3337[this.field2399 + 1][this.field2398][this.field2391] + class189.field3337[this.field2399 + 1][this.field2398][this.field2393] + class189.field3337[this.field2399 + 1][this.field2402][this.field2393] >> 2;
            } else {
                this.field2394 = this.field2396 - 1024;
            }
            int var6 = class134.field2339[this.field2403];
            int var7 = class134.field2344[this.field2403];
            this.method925(var6, var7);
            if (this.field2395) {
                class248 var8 = (class248) this.field2367.method393((byte) -127);
                while (true) {
                    if (var8 == null) {
                        this.field2395 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field4271.field388; var9++) {
                        var8.method1609((byte) 108, 1, this.field2380, var6, true, var7);
                    }
                    var8 = (class248) this.field2367.method391(114);
                }
            }
            int var10 = (int) (arg0 - this.field2380);
            for (class248 var11 = (class248) this.field2367.method393((byte) 8); var11 != null; var11 = (class248) this.field2367.method391(110)) {
                var11.method1609((byte) 71, var10, arg0, var6, var5 < 10, var7);
            }
        }
        this.field2380 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(III)V")
    public class136(int arg0, int arg1, int arg2) {
        this.field2389 = arg1;
        this.field2400 = arg2;
        this.field2381 = new class148[8192];
        this.field2379 = (long) arg0;
        this.field2395 = true;
        field2382.method395((byte) 36, this);
    }

    static {
        new class261(131056);
    }
}
