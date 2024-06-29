import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class26 extends class3 {

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "[J")
    private long[] field336 = new long[10];

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "I")
    public static int field335 = 0;

    @OriginalMember(owner = "mapview!na", name = "s", descriptor = "Lj;")
    public static class17 field343 = class30.method190(-89, "Farming patch");

    @OriginalMember(owner = "mapview!na", name = "t", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "mapview!na", name = "r", descriptor = "Lj;")
    public static class17 field342 = class30.method190(-107, "Combat Training");

    @OriginalMember(owner = "mapview!na", name = "n", descriptor = "I")
    public static int field338 = 0;

    @OriginalMember(owner = "mapview!na", name = "o", descriptor = "Lj;")
    public static class17 field339 = class30.method190(-127, "Kebab Seller");

    @OriginalMember(owner = "mapview!na", name = "w", descriptor = "Lj;")
    public static class17 field347 = class30.method190(-112, "Platelegs Shop");

    @OriginalMember(owner = "mapview!na", name = "x", descriptor = "Lj;")
    public static class17 field348 = class30.method190(-99, " )2 ");

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "mapview!na", name = "m", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "mapview!na", name = "p", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "mapview!na", name = "q", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "mapview!na", name = "u", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "J")
    private long field332;

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "Lca;")
    public static class6 field333;

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "[I")
    public static int[] field334;

    @OriginalMember(owner = "mapview!na", name = "v", descriptor = "[I")
    public static int[] field346;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "(I)V", line = 19)
    public static void method176(int arg0) {
        field334 = null;
        field347 = null;
        field339 = null;
        field343 = null;
        field346 = null;
        field333 = null;
        field342 = null;
        if (arg0 <= 54) {
            field333 = null;
        }
        field348 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "<init>", descriptor = "()V", line = 171)
    public class26() {
        this.method31(-12745);
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(I)V", line = 62)
    public final void method31(int arg0) {
        this.field341 = 1;
        if (arg0 != -12745) {
            field343 = null;
        }
        this.field345 = 0;
        this.field331 = 256;
        this.field332 = class20.method149((byte) -104);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field336[var2] = this.field332;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(III)I", line = 94)
    public final int method32(int arg0, int arg1, int arg2) {
        int var4 = this.field331;
        int var5 = this.field341;
        this.field341 = 1;
        this.field331 = 300;
        this.field332 = class20.method149((byte) 93);
        if (this.field336[this.field340] == 0L) {
            this.field331 = var4;
            this.field341 = var5;
        } else if (this.field336[this.field340] < this.field332) {
            this.field331 = (int) ((long) (arg1 * 2560) / (this.field332 - this.field336[this.field340]));
        }
        if (arg2 != -13659) {
            method176(-56);
        }
        if (this.field331 < 25) {
            this.field331 = 25;
        }
        if (this.field331 > 256) {
            this.field331 = 256;
            this.field341 = (int) ((long) arg1 - (this.field332 - this.field336[this.field340]) / 10L);
        }
        if (this.field341 > arg1) {
            this.field341 = arg1;
        }
        this.field336[this.field340] = this.field332;
        this.field340 = (this.field340 + 1) % 10;
        if (this.field341 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field336[var6] != 0L) {
                    this.field336[var6] += this.field341;
                }
            }
        }
        if (arg0 > this.field341) {
            this.field341 = arg0;
        }
        int var7 = 0;
        method177(arg2 + 13684, (long) this.field341);
        while (this.field345 < 256) {
            this.field345 += this.field331;
            var7++;
        }
        this.field345 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IJ)V", line = 187)
    public static final void method177(int arg0, long arg1) {
        if (arg0 != 25) {
            field348 = null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class31.method204((byte) 92, arg1 - 1L);
            class31.method204((byte) 92, 1L);
        } else {
            class31.method204((byte) 92, arg1);
        }
    }
}
