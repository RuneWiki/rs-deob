import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class107 extends class91 {

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "[J")
    private long[] field2592 = new long[10];

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Lmb;")
    public static class84 field2591 = class79.method672(true, "sideicons");

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lsa;")
    public static class119 field2586 = new class119(64);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "[I")
    public static int[] field2595 = new int[1000];

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Lmb;")
    private static class84 field2596 = class79.method672(true, "Drop");

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "[I")
    public static int[] field2594 = new int[99];

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lmb;")
    public static class84 field2593 = field2596;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lmb;")
    public static class84 field2597;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "Loa;")
    public static class95 field2598;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    private int field2590;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "J")
    private long field2580;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
    public static int[] field2599;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[Lmb;")
    public static class84[] field2582;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILsd;IB)[Lr;")
    public static final class112[] method885(int arg0, class122 arg1, int arg2, byte arg3) {
        int var4 = -61 / ((arg3 + 27) / 37);
        field2589++;
        return class127.method1037(arg2, (byte) -60, arg1, arg0) ? class97.method804(-1) : null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public final void method25(boolean arg0) {
        if (arg0) {
            field2584++;
            for (int var2 = 0; var2 < 10; var2++) {
                this.field2592[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public static void method886(boolean arg0) {
        field2593 = null;
        field2591 = null;
        field2594 = null;
        field2597 = null;
        field2586 = null;
        field2595 = null;
        field2598 = null;
        if (!arg0) {
            method886(true);
        }
        field2596 = null;
        field2582 = null;
        field2599 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public final void method27(byte arg0) {
        this.field2577 = 0;
        this.field2588 = 256;
        field2583++;
        if (arg0 != -31) {
            this.method27((byte) 121);
        }
        this.field2578 = 1;
        this.field2580 = class77.method657(3745);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2592[var2] = this.field2580;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method887(int arg0) {
        field2581++;
        class145.field3523.method25(true);
        for (int var1 = arg0; var1 < 32; var1++) {
            class126.field3040[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class69.field1672[var2] = 0L;
        }
        class106.field2576 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
    public final int method26(int arg0, int arg1, int arg2) {
        field2585++;
        int var4 = this.field2588;
        this.field2588 = 300;
        int var5 = this.field2578;
        this.field2578 = 1;
        this.field2580 = class77.method657(3745);
        if (this.field2592[this.field2590] == 0L) {
            this.field2578 = var5;
            this.field2588 = var4;
        } else if (this.field2592[this.field2590] < this.field2580) {
            this.field2588 = (int) ((long) (arg1 * 2560) / (this.field2580 - this.field2592[this.field2590]));
        }
        if (this.field2588 < 25) {
            this.field2588 = 25;
        }
        if (this.field2588 > 256) {
            this.field2588 = 256;
            this.field2578 = (int) ((long) arg1 - (this.field2580 - this.field2592[this.field2590]) / 10L);
        }
        if (arg1 < this.field2578) {
            this.field2578 = arg1;
        }
        this.field2592[this.field2590] = this.field2580;
        this.field2590 = (this.field2590 + 1) % 10;
        if (this.field2578 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2592[var6] != 0L) {
                    this.field2592[var6] += this.field2578;
                }
            }
        }
        if (arg2 <= 55) {
            this.field2590 = 56;
        }
        if (this.field2578 < arg0) {
            this.field2578 = arg0;
        }
        class22.method149(-110, (long) this.field2578);
        int var7 = 0;
        while (this.field2577 < 256) {
            var7++;
            this.field2577 += this.field2588;
        }
        this.field2577 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class107() {
        this.method27((byte) -31);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2594[var1] = var0 / 4;
        }
        field2597 = class79.method672(true, "sch-Utteln:");
        field2598 = new class95();
    }
}
