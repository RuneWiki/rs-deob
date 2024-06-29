import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ls;")
    private class128 field2218 = new class128(null);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[B")
    private static byte[] field2219 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field2225;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "J")
    private long field2221;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
    public int[] field2222;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    private int[] field2223;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    private int[] field2224;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    private int[] field2226;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
    public final void method726() {
        this.field2218.field2873 = -1;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()Z")
    public final boolean method727() {
        int var1 = this.field2226.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2226[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    private final int method728(int arg0) {
        byte var2 = this.field2218.field2874[this.field2218.field2873];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2224[arg0] = var3;
            this.field2218.field2873++;
        } else {
            var3 = this.field2224[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method733(arg0, var3);
        }
        int var4 = this.field2218.method1006((byte) -105);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2218.field2874[this.field2218.field2873] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2218.field2873++;
                this.field2224[arg0] = var5;
                return this.method733(arg0, var5);
            }
        }
        this.field2218.field2873 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
    public final void method729() {
        this.field2218.field2874 = null;
        this.field2223 = null;
        this.field2226 = null;
        this.field2222 = null;
        this.field2224 = null;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()I")
    public final int method730() {
        int var1 = this.field2226.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2226[var4] >= 0 && this.field2222[var4] < var3) {
                var2 = var4;
                var3 = this.field2222[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method731(int arg0) {
        this.field2218.field2873 = this.field2226[arg0];
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)J")
    public final long method732(int arg0) {
        return (long) this.field2220 * (long) arg0 + this.field2221;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
    private final int method733(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2219[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2218.method1025(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2218.method1025(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2218.method1025(255);
        int var4 = this.field2218.method1006((byte) -105);
        if (var3 == 47) {
            this.field2218.field2873 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2218.method1026((byte) 75);
            var4 -= 3;
            int var6 = this.field2222[arg0];
            this.field2221 += (long) (this.field2220 - var5) * (long) var6;
            this.field2220 = var5;
            this.field2218.field2873 += var4;
            return 2;
        } else {
            this.field2218.field2873 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public final void method734(int arg0) {
        this.field2226[arg0] = this.field2218.field2873;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
    public static void method735() {
        field2219 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
    public final void method736(byte[] arg0) {
        this.field2218.field2874 = arg0;
        this.field2218.field2873 = 10;
        int var2 = this.field2218.method1041(212464720);
        this.field2225 = this.field2218.method1041(212464720);
        this.field2220 = 500000;
        this.field2223 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2218.method1037(18834);
            int var6 = this.field2218.method1037(18834);
            if (var5 == 1297379947) {
                this.field2223[var3] = this.field2218.field2873;
                var3++;
            }
            this.field2218.field2873 += var6;
        }
        this.field2221 = 0L;
        this.field2226 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2226[var4] = this.field2223[var4];
        }
        this.field2222 = new int[var2];
        this.field2224 = new int[var2];
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()Z")
    public final boolean method737() {
        return this.field2218.field2874 != null;
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()I")
    public final int method738() {
        return this.field2226.length;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public final void method739(int arg0) {
        int var2 = this.field2218.method1006((byte) -106);
        this.field2222[arg0] += var2;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)I")
    public final int method740(int arg0) {
        return this.method728(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V")
    public final void method741(long arg0) {
        this.field2221 = arg0;
        int var3 = this.field2226.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2222[var4] = 0;
            this.field2224[var4] = 0;
            this.field2218.field2873 = this.field2223[var4];
            this.method739(var4);
            this.field2226[var4] = this.field2218.field2873;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class95() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class95(byte[] arg0) {
        this.method736(arg0);
    }
}
