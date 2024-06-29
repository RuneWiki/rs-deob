import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class308 {

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lrp;")
    private class276 field4377 = new class276((byte[]) null);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "[B")
    private static byte[] field4376 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "J")
    private long field4381;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[I")
    private int[] field4378;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "[I")
    private int[] field4380;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "[I")
    public int[] field4382;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "[I")
    private int[] field4383;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "()Z")
    public final boolean method1904() {
        int var1 = this.field4383.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4383[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public final void method1905(int arg0) {
        int var2 = this.field4377.method1692(31);
        this.field4382[arg0] += var2;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)J")
    public final long method1906(int arg0) {
        return (long) this.field4384 * (long) arg0 + this.field4381;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "()Z")
    public final boolean method1907() {
        return this.field4377.field4064 != null;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public final void method1908(int arg0) {
        this.field4377.field4021 = this.field4383[arg0];
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "()V")
    public static void method1909() {
        field4376 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(J)V")
    public final void method1910(long arg0) {
        this.field4381 = arg0;
        int var3 = this.field4383.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4382[var4] = 0;
            this.field4378[var4] = 0;
            this.field4377.field4021 = this.field4380[var4];
            this.method1905(var4);
            this.field4383[var4] = this.field4377.field4021;
        }
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "(I)I")
    private final int method1911(int arg0) {
        byte var2 = this.field4377.field4064[this.field4377.field4021];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4378[arg0] = var3;
            this.field4377.field4021++;
        } else {
            var3 = this.field4378[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1918(arg0, var3);
        }
        int var4 = this.field4377.method1692(28);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4377.field4064[this.field4377.field4021] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4377.field4021++;
                this.field4378[arg0] = var5;
                return this.method1918(arg0, var5);
            }
        }
        this.field4377.field4021 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([B)V")
    public final void method1912(byte[] arg0) {
        this.field4377.field4064 = arg0;
        this.field4377.field4021 = 10;
        int var2 = this.field4377.method1729(65280);
        this.field4379 = this.field4377.method1729(65280);
        this.field4384 = 500000;
        this.field4380 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4377.method1688(20402);
            int var6 = this.field4377.method1688(20402);
            if (var5 == 1297379947) {
                this.field4380[var3] = this.field4377.field4021;
                var3++;
            }
            this.field4377.field4021 += var6;
        }
        this.field4381 = 0L;
        this.field4383 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4383[var4] = this.field4380[var4];
        }
        this.field4382 = new int[var2];
        this.field4378 = new int[var2];
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "()I")
    public final int method1913() {
        return this.field4383.length;
    }

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "()V")
    public final void method1914() {
        this.field4377.field4064 = null;
        this.field4380 = null;
        this.field4383 = null;
        this.field4382 = null;
        this.field4378 = null;
    }

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)I")
    public final int method1915(int arg0) {
        return this.method1911(arg0);
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "()V")
    public final void method1916() {
        this.field4377.field4021 = -1;
    }

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "()I")
    public final int method1917() {
        int var1 = this.field4383.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4383[var4] >= 0 && this.field4382[var4] < var3) {
                var2 = var4;
                var3 = this.field4382[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I")
    private final int method1918(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4376[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4377.method1701(-23121) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4377.method1701(-23121) << 16;
            }
            return var8;
        }
        int var3 = this.field4377.method1701(-23121);
        int var4 = this.field4377.method1692(115);
        if (var3 == 47) {
            this.field4377.field4021 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4377.method1748(false);
            var4 -= 3;
            int var6 = this.field4382[arg0];
            this.field4381 += (long) (this.field4384 - var5) * (long) var6;
            this.field4384 = var5;
            this.field4377.field4021 += var4;
            return 2;
        } else {
            this.field4377.field4021 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V")
    public final void method1919(int arg0) {
        this.field4383[arg0] = this.field4377.field4021;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
    public class308() {
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "([B)V")
    public class308(byte[] arg0) {
        this.method1912(arg0);
    }
}
