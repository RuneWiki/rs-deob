import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class177 extends class162 {

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[J")
    private long[] field3349 = new long[10];

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    private int field3338 = 0;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    private int field3353 = 256;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    private int field3352 = 1;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "J")
    private long field3350 = class100.method748((byte) 35);

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static volatile int field3346 = 0;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lsd;")
    public static class166 field3345 = class135.method935("Bitte versuchen Sie es erneut)3", 0);

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Lsd;")
    public static class166 field3351 = class135.method935("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 0);

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lsd;")
    public static class166 field3341 = class135.method935("Freie Welt", 0);

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Lsd;")
    public static class166 field3356 = class135.method935("mapback", 0);

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
    public static boolean field3347 = false;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    private int field3355;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
    public static int[] field3342;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "[[S")
    public static short[][] field3357;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static final void method1203(int arg0) {
        if (arg0 != -103) {
            return;
        }
        field3354++;
        for (class46 var1 = (class46) class32.field588.method1109((byte) -117); var1 != null; var1 = (class46) class32.field588.method1115((byte) 105)) {
            if (var1.field817 > 0) {
                var1.field817--;
            }
            if (var1.field817 != 0) {
                if (var1.field827 > 0) {
                    var1.field827--;
                }
                if (var1.field827 == 0 && var1.field828 >= 1 && var1.field826 >= 1 && var1.field828 <= 102 && var1.field826 <= 102 && (var1.field824 < 0 || class23.method159(var1.field824, arg0 ^ 0x7DCB, var1.field835))) {
                    class203.method1334(var1.field828, var1.field831, var1.field825, 120, var1.field826, var1.field832, var1.field824, var1.field835);
                    var1.field827 = -1;
                    if (var1.field824 == var1.field823 && var1.field823 == -1) {
                        var1.method915(0);
                    } else if (var1.field824 == var1.field823 && var1.field831 == var1.field830 && var1.field835 == var1.field834) {
                        var1.method915(0);
                    }
                }
            } else if (var1.field823 < 0 || class23.method159(var1.field823, -32174, var1.field834)) {
                class203.method1334(var1.field828, var1.field830, var1.field825, arg0 + 154, var1.field826, var1.field832, var1.field823, var1.field834);
                var1.method915(0);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lh;")
    public static final class64 method1204(int arg0, int arg1) {
        field3344++;
        if (arg0 <= 92) {
            method1204(16, 28);
        }
        class64 var2 = (class64) class37.field676.method64((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field1961.method353(3, arg1, -71);
        class64 var4 = new class64();
        if (var3 != null) {
            var4.method540(new class53(var3), 36);
        }
        class37.field676.method67(var4, 15266, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method1093(int arg0) {
        field3340++;
        for (int var2 = arg0; var2 < 10; var2++) {
            this.field3349[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method1205(int arg0) {
        if (arg0 != 0) {
            field3341 = null;
        }
        field3342 = null;
        field3341 = null;
        field3345 = null;
        field3351 = null;
        field3357 = null;
        field3356 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    public final int method1095(int arg0, int arg1, int arg2) {
        field3339++;
        int var4 = this.field3353;
        this.field3353 = 300;
        int var5 = this.field3352;
        this.field3352 = 1;
        this.field3350 = class100.method748((byte) 35);
        if (this.field3349[this.field3355] == 0L) {
            this.field3352 = var5;
            this.field3353 = var4;
        } else if (this.field3350 > this.field3349[this.field3355]) {
            this.field3353 = (int) ((long) (arg1 * 2560) / (this.field3350 - this.field3349[this.field3355]));
        }
        if (this.field3353 < 25) {
            this.field3353 = 25;
        }
        if (this.field3353 > 256) {
            this.field3353 = 256;
            this.field3352 = (int) ((long) arg1 - (this.field3350 - this.field3349[this.field3355]) / 10L);
        }
        if (this.field3352 > arg1) {
            this.field3352 = arg1;
        }
        this.field3349[this.field3355] = this.field3350;
        this.field3355 = (this.field3355 + 1) % 10;
        if (this.field3352 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3349[var6] != 0L) {
                    this.field3349[var6] += this.field3352;
                }
            }
        }
        if (arg2 > this.field3352) {
            this.field3352 = arg2;
        }
        class189.method1260((long) this.field3352, 1);
        int var7 = arg0;
        while (this.field3338 < 256) {
            this.field3338 += this.field3353;
            var7++;
        }
        this.field3338 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class177() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3349[var1] = this.field3350;
        }
    }
}
