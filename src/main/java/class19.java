import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lh;")
    private class70 field471 = new class70(null);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[B")
    private static byte[] field472 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "J")
    private long field475;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
    private int[] field474;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
    public int[] field477;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    private int[] field478;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
    private int[] field479;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public static void method110() {
        field472 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.field478[arg0] = this.field471.field1472;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([B)V")
    public final void method112(byte[] arg0) {
        this.field471.field1493 = arg0;
        this.field471.field1472 = 10;
        int var2 = this.field471.method442(-21351);
        this.field476 = this.field471.method442(-21351);
        this.field473 = 500000;
        this.field474 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field471.method453(48);
            int var6 = this.field471.method453(98);
            if (var5 == 1297379947) {
                this.field474[var3] = this.field471.field1472;
                var3++;
            }
            this.field471.field1472 += var6;
        }
        this.field475 = 0L;
        this.field478 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field478[var4] = this.field474[var4];
        }
        this.field477 = new int[var2];
        this.field479 = new int[var2];
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(J)V")
    public final void method113(long arg0) {
        this.field475 = arg0;
        int var3 = this.field478.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field477[var4] = 0;
            this.field479[var4] = 0;
            this.field471.field1472 = this.field474[var4];
            this.method116(var4);
            this.field478[var4] = this.field471.field1472;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I")
    public final int method114(int arg0) {
        return this.method118(arg0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
    public final void method115() {
        this.field471.field1472 = -1;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public final void method116(int arg0) {
        int var2 = this.field471.method449(123);
        this.field477[arg0] += var2;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        this.field471.field1472 = this.field478[arg0];
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)I")
    private final int method118(int arg0) {
        byte var2 = this.field471.field1493[this.field471.field1472];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field479[arg0] = var3;
            this.field471.field1472++;
        } else {
            var3 = this.field479[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method124(arg0, var3);
        }
        int var4 = this.field471.method449(-3);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field471.field1493[this.field471.field1472] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field471.field1472++;
                this.field479[arg0] = var5;
                return this.method124(arg0, var5);
            }
        }
        this.field471.field1472 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
    public final int method119() {
        return this.field478.length;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()V")
    public final void method120() {
        this.field471.field1493 = null;
        this.field474 = null;
        this.field478 = null;
        this.field477 = null;
        this.field479 = null;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z")
    public final boolean method121() {
        return this.field471.field1493 != null;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "()Z")
    public final boolean method122() {
        int var1 = this.field478.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field478[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)J")
    public final long method123(int arg0) {
        return (long) this.field473 * (long) arg0 + this.field475;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
    private final int method124(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field472[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field471.method443(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field471.method443(255) << 16;
            }
            return var8;
        }
        int var3 = this.field471.method443(255);
        int var4 = this.field471.method449(-29);
        if (var3 == 47) {
            this.field471.field1472 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field471.method415(-52);
            var4 -= 3;
            int var6 = this.field477[arg0];
            this.field475 += (long) (this.field473 - var5) * (long) var6;
            this.field473 = var5;
            this.field471.field1472 += var4;
            return 2;
        } else {
            this.field471.field1472 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "()I")
    public final int method125() {
        int var1 = this.field478.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field478[var4] >= 0 && this.field477[var4] < var3) {
                var2 = var4;
                var3 = this.field477[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.method112(arg0);
    }
}
