import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Log;")
    private class221 field482 = new class221((byte[]) null);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[B")
    private static byte[] field481 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "J")
    private long field488;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    private int[] field483;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    public int[] field484;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
    private int[] field485;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    private int[] field489;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()I")
    public final int method259() {
        int var1 = this.field483.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field483[var4] >= 0 && this.field484[var4] < var3) {
                var2 = var4;
                var3 = this.field484[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V")
    public final void method260() {
        this.field482.field3653 = null;
        this.field485 = null;
        this.field483 = null;
        this.field484 = null;
        this.field489 = null;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()I")
    public final int method261() {
        return this.field483.length;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final void method262(int arg0) {
        this.field482.field3655 = this.field483[arg0];
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public final void method263(int arg0) {
        int var2 = this.field482.method1558(123);
        this.field484[arg0] += var2;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I")
    public final int method264(int arg0) {
        return this.method270(arg0);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
    public static void method265() {
        field481 = null;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
    public final void method266() {
        this.field482.field3655 = -1;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()Z")
    public final boolean method267() {
        return this.field482.field3653 != null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V")
    public final void method268(long arg0) {
        this.field488 = arg0;
        int var3 = this.field483.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field484[var4] = 0;
            this.field489[var4] = 0;
            this.field482.field3655 = this.field485[var4];
            this.method263(var4);
            this.field483[var4] = this.field482.field3655;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.field483[arg0] = this.field482.field3655;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)I")
    private final int method270(int arg0) {
        byte var2 = this.field482.field3653[this.field482.field3655];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field489[arg0] = var3;
            this.field482.field3655++;
        } else {
            var3 = this.field489[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method274(arg0, var3);
        }
        int var4 = this.field482.method1558(68);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field482.field3653[this.field482.field3655] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field482.field3655++;
                this.field489[arg0] = var5;
                return this.method274(arg0, var5);
            }
        }
        this.field482.field3655 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "()Z")
    public final boolean method271() {
        int var1 = this.field483.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field483[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([B)V")
    public final void method272(byte[] arg0) {
        this.field482.field3653 = arg0;
        this.field482.field3655 = 10;
        int var2 = this.field482.method1521((byte) 113);
        this.field487 = this.field482.method1521((byte) 113);
        this.field486 = 500000;
        this.field485 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field482.method1526(-16777216);
            int var6 = this.field482.method1526(-16777216);
            if (var5 == 1297379947) {
                this.field485[var3] = this.field482.field3655;
                var3++;
            }
            this.field482.field3655 += var6;
        }
        this.field488 = 0L;
        this.field483 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field483[var4] = this.field485[var4];
        }
        this.field484 = new int[var2];
        this.field489 = new int[var2];
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)J")
    public final long method273(int arg0) {
        return (long) this.field486 * (long) arg0 + this.field488;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
    private final int method274(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field481[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field482.method1517((byte) -96) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field482.method1517((byte) -96) << 16;
            }
            return var8;
        }
        int var3 = this.field482.method1517((byte) -96);
        int var4 = this.field482.method1558(54);
        if (var3 == 47) {
            this.field482.field3655 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field482.method1531(65280);
            var4 -= 3;
            int var6 = this.field484[arg0];
            this.field488 += (long) (this.field486 - var5) * (long) var6;
            this.field486 = var5;
            this.field482.field3655 += var4;
            return 2;
        } else {
            this.field482.field3655 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class31() {
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
    public class31(byte[] arg0) {
        this.method272(arg0);
    }
}
