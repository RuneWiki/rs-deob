import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class195 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lfh;")
    private class128 field3553 = new class128((byte[]) null);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[B")
    private static byte[] field3552 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private int field3555;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "J")
    private long field3558;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
    private int[] field3556;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
    public int[] field3557;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    private int[] field3559;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[I")
    private int[] field3560;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
    public final int method1414() {
        int var1 = this.field3556.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3556[var4] >= 0 && this.field3557[var4] < var3) {
                var2 = var4;
                var3 = this.field3557[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([B)V")
    public final void method1415(byte[] arg0) {
        this.field3553.field2385 = arg0;
        this.field3553.field2379 = 10;
        int var2 = this.field3553.method912(-111);
        this.field3554 = this.field3553.method912(-111);
        this.field3555 = 500000;
        this.field3560 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3553.method923(true);
            int var6 = this.field3553.method923(true);
            if (var5 == 1297379947) {
                this.field3560[var3] = this.field3553.field2379;
                var3++;
            }
            this.field3553.field2379 += var6;
        }
        this.field3558 = 0L;
        this.field3556 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3556[var4] = this.field3560[var4];
        }
        this.field3557 = new int[var2];
        this.field3559 = new int[var2];
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()V")
    public static void method1416() {
        field3552 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)J")
    public final long method1417(int arg0) {
        return (long) this.field3555 * (long) arg0 + this.field3558;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()V")
    public final void method1418() {
        this.field3553.field2385 = null;
        this.field3560 = null;
        this.field3556 = null;
        this.field3557 = null;
        this.field3559 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    private final int method1419(int arg0) {
        byte var2 = this.field3553.field2385[this.field3553.field2379];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3559[arg0] = var3;
            this.field3553.field2379++;
        } else {
            var3 = this.field3559[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1428(arg0, var3);
        }
        int var4 = this.field3553.method910((byte) -57);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3553.field2385[this.field3553.field2379] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3553.field2379++;
                this.field3559[arg0] = var5;
                return this.method1428(arg0, var5);
            }
        }
        this.field3553.field2379 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public final void method1420(int arg0) {
        this.field3556[arg0] = this.field3553.field2379;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()Z")
    public final boolean method1421() {
        return this.field3553.field2385 != null;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "()Z")
    public final boolean method1422() {
        int var1 = this.field3556.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3556[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(J)V")
    public final void method1423(long arg0) {
        this.field3558 = arg0;
        int var3 = this.field3556.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3557[var4] = 0;
            this.field3559[var4] = 0;
            this.field3553.field2379 = this.field3560[var4];
            this.method1425(var4);
            this.field3556[var4] = this.field3553.field2379;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "()V")
    public final void method1424() {
        this.field3553.field2379 = -1;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
    public final void method1425(int arg0) {
        int var2 = this.field3553.method910((byte) -81);
        this.field3557[arg0] += var2;
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "()I")
    public final int method1426() {
        return this.field3556.length;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
    public final void method1427(int arg0) {
        this.field3553.field2379 = this.field3556[arg0];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
    private final int method1428(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3552[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3553.method937(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3553.method937(false) << 16;
            }
            return var8;
        }
        int var3 = this.field3553.method937(false);
        int var4 = this.field3553.method910((byte) -108);
        if (var3 == 47) {
            this.field3553.field2379 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3553.method952((byte) -58);
            var4 -= 3;
            int var6 = this.field3557[arg0];
            this.field3558 += (long) (this.field3555 - var5) * (long) var6;
            this.field3555 = var5;
            this.field3553.field2379 += var4;
            return 2;
        } else {
            this.field3553.field2379 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I")
    public final int method1429(int arg0) {
        return this.method1419(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class195() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
    public class195(byte[] arg0) {
        this.method1415(arg0);
    }
}
