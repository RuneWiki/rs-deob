import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class321 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lwn;")
    private class519 field4785 = new class519(null);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[B")
    private static byte[] field4789 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "J")
    private long field4791;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    public int[] field4788;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    private int[] field4790;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[I")
    private int[] field4792;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    private int[] field4793;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static void method2047() {
        field4789 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B)V")
    public final void method2048(byte[] arg0) {
        this.field4785.field7545 = arg0;
        this.field4785.field7558 = 10;
        int var2 = this.field4785.method3018(566990904);
        this.field4786 = this.field4785.method3018(566990904);
        this.field4787 = 500000;
        this.field4792 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4785.method3053(-129);
            int var6 = this.field4785.method3053(-129);
            if (var5 == 1297379947) {
                this.field4792[var3] = this.field4785.field7558;
                var3++;
            }
            this.field4785.field7558 += var6;
        }
        this.field4791 = 0L;
        this.field4790 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4790[var4] = this.field4792[var4];
        }
        this.field4788 = new int[var2];
        this.field4793 = new int[var2];
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()V")
    public final void method2049() {
        this.field4785.field7545 = null;
        this.field4792 = null;
        this.field4790 = null;
        this.field4788 = null;
        this.field4793 = null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
    public final int method2050() {
        int var1 = this.field4790.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4790[var4] >= 0 && this.field4788[var4] < var3) {
                var2 = var4;
                var3 = this.field4788[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I")
    private final int method2051(int arg0) {
        byte var2 = this.field4785.field7545[this.field4785.field7558];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4793[arg0] = var3;
            this.field4785.field7558++;
        } else {
            var3 = this.field4793[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2057(arg0, var3);
        }
        int var4 = this.field4785.method3015(-2097152);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4785.field7545[this.field4785.field7558] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4785.field7558++;
                this.field4793[arg0] = var5;
                return this.method2057(arg0, var5);
            }
        }
        this.field4785.field7558 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public final void method2052(int arg0) {
        int var2 = this.field4785.method3015(-2097152);
        this.field4788[arg0] += var2;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)I")
    public final int method2053(int arg0) {
        return this.method2051(arg0);
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()Z")
    public final boolean method2054() {
        return this.field4785.field7545 != null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(J)V")
    public final void method2055(long arg0) {
        this.field4791 = arg0;
        int var3 = this.field4790.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4788[var4] = 0;
            this.field4793[var4] = 0;
            this.field4785.field7558 = this.field4792[var4];
            this.method2052(var4);
            this.field4790[var4] = this.field4785.field7558;
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()Z")
    public final boolean method2056() {
        int var1 = this.field4790.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4790[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    private final int method2057(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4789[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4785.method3072((byte) -126) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4785.method3072((byte) -121) << 16;
            }
            return var8;
        }
        int var3 = this.field4785.method3072((byte) -124);
        int var4 = this.field4785.method3015(-2097152);
        if (var3 == 47) {
            this.field4785.field7558 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4785.method3040((byte) -3);
            var4 -= 3;
            int var6 = this.field4788[arg0];
            this.field4791 += (long) (this.field4787 - var5) * (long) var6;
            this.field4787 = var5;
            this.field4785.field7558 += var4;
            return 2;
        } else {
            this.field4785.field7558 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)J")
    public final long method2058(int arg0) {
        return (long) this.field4787 * (long) arg0 + this.field4791;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V")
    public final void method2059(int arg0) {
        this.field4785.field7558 = this.field4790[arg0];
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
    public final void method2060(int arg0) {
        this.field4790[arg0] = this.field4785.field7558;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "()V")
    public final void method2061() {
        this.field4785.field7558 = -1;
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "()I")
    public final int method2062() {
        return this.field4790.length;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class321() {
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
    public class321(byte[] arg0) {
        this.method2048(arg0);
    }
}
