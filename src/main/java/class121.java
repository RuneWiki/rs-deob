import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class121 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lrc;")
    private class104 field2852 = new class104(null);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[B")
    private static byte[] field2851 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "J")
    private long field2856;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    private int[] field2853;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    private int[] field2854;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public int[] field2858;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    private int[] field2859;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()Z", line = 3)
    public final boolean method914() {
        return this.field2852.field2563 < 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()Z", line = 7)
    public final boolean method915() {
        int var1 = this.field2853.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2853[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 21)
    public final void method916(int arg0) {
        this.field2852.field2563 = this.field2853[arg0];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([B)V", line = 24)
    public final void method917(byte[] arg0) {
        this.field2852.field2554 = arg0;
        this.field2852.field2563 = 10;
        int var2 = this.field2852.method797(-7916);
        this.field2855 = this.field2852.method797(-7916);
        this.field2857 = 500000;
        this.field2859 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2852.method774(-29404);
            int var6 = this.field2852.method774(-29404);
            if (var5 == 1297379947) {
                this.field2859[var3] = this.field2852.field2563;
                var3++;
            }
            this.field2852.field2563 += var6;
        }
        this.field2853 = new int[this.field2859.length];
        for (int var4 = 0; var4 < this.field2853.length; var4++) {
            this.field2853[var4] = this.field2859[var4];
        }
        this.field2858 = new int[var2];
        this.field2854 = new int[var2];
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)J", line = 76)
    public final long method918(int arg0) {
        return (long) this.field2857 * (long) arg0 + this.field2856;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(J)V", line = 81)
    public final void method919(long arg0) {
        this.field2856 = arg0;
        int var3 = this.field2853.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2858[var4] = 0;
            this.field2854[var4] = 0;
            this.field2852.field2563 = this.field2859[var4];
            this.method929(var4);
            this.field2853[var4] = this.field2852.field2563;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V", line = 99)
    public final void method920() {
        this.field2852.field2554 = null;
        this.field2859 = null;
        this.field2853 = null;
        this.field2858 = null;
        this.field2854 = null;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()I", line = 110)
    public final int method921() {
        return this.field2853.length;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "()V", line = 113)
    public final void method922() {
        this.field2852.field2563 = -1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I", line = 117)
    private final int method923(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2851[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2852.method798((byte) -54) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2852.method798((byte) -89) << 16;
            }
            return var8;
        }
        int var3 = this.field2852.method798((byte) -117);
        int var4 = this.field2852.method796(109);
        if (var3 == 47) {
            this.field2852.field2563 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2852.method770(-9409);
            var4 -= 3;
            int var6 = this.field2858[arg0];
            this.field2856 += (long) (this.field2857 - var5) * (long) var6;
            this.field2857 = var5;
            this.field2852.field2563 += var4;
            return 2;
        } else {
            this.field2852.field2563 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I", line = 163)
    private final int method924(int arg0) {
        byte var2 = this.field2852.field2554[this.field2852.field2563];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2854[arg0] = var3;
            this.field2852.field2563++;
        } else {
            var3 = this.field2854[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method923(arg0, var3);
        }
        int var4 = this.field2852.method796(41);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2852.field2554[this.field2852.field2563] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2852.field2563++;
                this.field2854[arg0] = var5;
                return this.method923(arg0, var5);
            }
        }
        this.field2852.field2563 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "()I", line = 202)
    public final int method925() {
        int var1 = this.field2853.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2853[var4] >= 0 && this.field2858[var4] < var3) {
                var2 = var4;
                var3 = this.field2858[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V", line = 227)
    public final void method926(int arg0) {
        this.field2853[arg0] = this.field2852.field2563;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I", line = 231)
    public final int method927(int arg0) {
        return this.method924(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "()Z", line = 237)
    public final boolean method928() {
        return this.field2852.field2554 != null;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 250)
    public final void method929(int arg0) {
        int var2 = this.field2852.method796(124);
        this.field2858[arg0] += var2;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "()V", line = 262)
    public static void method930() {
        field2851 = null;
    }
}
