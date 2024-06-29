import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class584 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Ldaa;")
    private class11 field8349 = new class11(null);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[B")
    private static byte[] field8350 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    private int field8352;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public int field8356;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "J")
    private long field8355;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[I")
    private int[] field8351;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public int[] field8353;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    private int[] field8354;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    private int[] field8357;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
    public final void method3412(byte[] arg0) {
        this.field8349.field138 = arg0;
        this.field8349.field165 = 10;
        int var2 = this.field8349.method93((byte) 126);
        this.field8356 = this.field8349.method93((byte) 90);
        this.field8352 = 500000;
        this.field8357 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field8349.method119(-107);
            int var6 = this.field8349.method119(-26);
            if (var5 == 1297379947) {
                this.field8357[var3] = this.field8349.field165;
                var3++;
            }
            this.field8349.field165 += var6;
        }
        this.field8355 = 0L;
        this.field8351 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field8351[var4] = this.field8357[var4];
        }
        this.field8353 = new int[var2];
        this.field8354 = new int[var2];
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z")
    public final boolean method3413() {
        return this.field8349.field138 != null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
    private final int method3414(int arg0) {
        byte var2 = this.field8349.field138[this.field8349.field165];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field8354[arg0] = var3;
            this.field8349.field165++;
        } else {
            var3 = this.field8354[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3417(arg0, var3);
        }
        int var4 = this.field8349.method123(-82);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field8349.field138[this.field8349.field165] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field8349.field165++;
                this.field8354[arg0] = var5;
                return this.method3417(arg0, var5);
            }
        }
        this.field8349.field165 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
    public final void method3415() {
        this.field8349.field165 = -1;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
    public final int method3416() {
        int var1 = this.field8351.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field8351[var4] >= 0 && this.field8353[var4] < var3) {
                var2 = var4;
                var3 = this.field8353[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    private final int method3417(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field8350[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field8349.method110((byte) 81) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field8349.method110((byte) 30) << 16;
            }
            return var8;
        }
        int var3 = this.field8349.method110((byte) 44);
        int var4 = this.field8349.method123(-110);
        if (var3 == 47) {
            this.field8349.field165 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field8349.method89((byte) -17);
            var4 -= 3;
            int var6 = this.field8353[arg0];
            this.field8355 += (long) (this.field8352 - var5) * (long) var6;
            this.field8352 = var5;
            this.field8349.field165 += var4;
            return 2;
        } else {
            this.field8349.field165 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
    public final int method3418() {
        return this.field8351.length;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
    public static void method3419() {
        field8350 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method3420(int arg0) {
        this.field8349.field165 = this.field8351[arg0];
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
    public final int method3421(int arg0) {
        return this.method3414(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)J")
    public final long method3422(int arg0) {
        return (long) this.field8352 * (long) arg0 + this.field8355;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "()V")
    public final void method3423() {
        this.field8349.field138 = null;
        this.field8357 = null;
        this.field8351 = null;
        this.field8353 = null;
        this.field8354 = null;
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "()Z")
    public final boolean method3424() {
        int var1 = this.field8351.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field8351[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public final void method3425(int arg0) {
        int var2 = this.field8349.method123(-107);
        this.field8353[arg0] += var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(J)V")
    public final void method3426(long arg0) {
        this.field8355 = arg0;
        int var3 = this.field8351.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field8353[var4] = 0;
            this.field8354[var4] = 0;
            this.field8349.field165 = this.field8357[var4];
            this.method3425(var4);
            this.field8351[var4] = this.field8349.field165;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public final void method3427(int arg0) {
        this.field8351[arg0] = this.field8349.field165;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class584() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
    public class584(byte[] arg0) {
        this.method3412(arg0);
    }
}
