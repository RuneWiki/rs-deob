import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class123 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lwd;")
    private class140 field2898 = new class140(null);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[B")
    private static byte[] field2899 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "J")
    private long field2905;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[I")
    public int[] field2900;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    private int[] field2901;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
    private int[] field2903;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
    private int[] field2904;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()I", line = 3)
    public final int method955() {
        return this.field2904.length;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()Z", line = 7)
    public final boolean method956() {
        int var1 = this.field2904.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2904[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V", line = 20)
    public final void method957() {
        this.field2898.field3325 = null;
        this.field2903 = null;
        this.field2904 = null;
        this.field2900 = null;
        this.field2901 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()V", line = 29)
    public static void method958() {
        field2899 = null;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "()Z", line = 32)
    public final boolean method959() {
        return this.field2898.field3325 != null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 36)
    public final void method960(int arg0) {
        int var2 = this.field2898.method1122(-2042883115);
        this.field2900[arg0] += var2;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 42)
    public final void method961(int arg0) {
        this.field2904[arg0] = this.field2898.field3347;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([B)V", line = 45)
    public final void method962(byte[] arg0) {
        this.field2898.field3325 = arg0;
        this.field2898.field3347 = 10;
        int var2 = this.field2898.method1072(37);
        this.field2902 = this.field2898.method1072(85);
        this.field2906 = 500000;
        this.field2903 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2898.method1118(4);
            int var6 = this.field2898.method1118(4);
            if (var5 == 1297379947) {
                this.field2903[var3] = this.field2898.field3347;
                var3++;
            }
            this.field2898.field3347 += var6;
        }
        this.field2904 = new int[this.field2903.length];
        for (int var4 = 0; var4 < this.field2904.length; var4++) {
            this.field2904[var4] = this.field2903[var4];
        }
        this.field2900 = new int[var2];
        this.field2901 = new int[var2];
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "()V", line = 97)
    public final void method963() {
        this.field2898.field3347 = -1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(J)V", line = 100)
    public final void method964(long arg0) {
        this.field2905 = arg0;
        int var3 = this.field2904.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2900[var4] = 0;
            this.field2901[var4] = 0;
            this.field2898.field3347 = this.field2903[var4];
            this.method960(var4);
            this.field2904[var4] = this.field2898.field3347;
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "()I", line = 119)
    public final int method965() {
        int var1 = this.field2904.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2904[var4] >= 0 && this.field2900[var4] < var3) {
                var2 = var4;
                var3 = this.field2900[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)J", line = 148)
    public final long method966(int arg0) {
        return (long) this.field2906 * (long) arg0 + this.field2905;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 153)
    public final void method967(int arg0) {
        this.field2898.field3347 = this.field2904[arg0];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I", line = 163)
    private final int method968(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2899[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2898.method1105(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2898.method1105(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2898.method1105(255);
        int var4 = this.field2898.method1122(-2042883115);
        if (var3 == 47) {
            this.field2898.field3347 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2898.method1114(false);
            var4 -= 3;
            int var6 = this.field2900[arg0];
            this.field2905 += (long) (this.field2906 - var5) * (long) var6;
            this.field2906 = var5;
            this.field2898.field3347 += var4;
            return 2;
        } else {
            this.field2898.field3347 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "()Z", line = 208)
    public final boolean method969() {
        return this.field2898.field3347 < 0;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)I", line = 217)
    private final int method970(int arg0) {
        byte var2 = this.field2898.field3325[this.field2898.field3347];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2901[arg0] = var3;
            this.field2898.field3347++;
        } else {
            var3 = this.field2901[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method968(arg0, var3);
        }
        int var4 = this.field2898.method1122(-2042883115);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2898.field3325[this.field2898.field3347] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2898.field3347++;
                this.field2901[arg0] = var5;
                return this.method968(arg0, var5);
            }
        }
        this.field2898.field3347 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I", line = 257)
    public final int method971(int arg0) {
        return this.method970(arg0);
    }
}
