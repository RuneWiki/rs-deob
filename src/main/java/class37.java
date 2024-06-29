import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lof;")
    private class103 field895 = new class103(null);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[B")
    private static byte[] field894 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "J")
    private long field898;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
    private int[] field896;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public int[] field899;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "[I")
    private int[] field901;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
    private int[] field902;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public final int method278(int arg0) {
        return this.method293(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public static void method279() {
        field894 = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()I")
    public final int method280() {
        int var1 = this.field902.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field902[var4] >= 0 && this.field899[var4] < var3) {
                var2 = var4;
                var3 = this.field899[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([B)V")
    public final void method281(byte[] arg0) {
        this.field895.field2498 = arg0;
        this.field895.field2501 = 10;
        int var2 = this.field895.method808(-20054);
        this.field900 = this.field895.method808(-20054);
        this.field897 = 500000;
        this.field896 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field895.method803(false);
            int var6 = this.field895.method803(false);
            if (var5 == 1297379947) {
                this.field896[var3] = this.field895.field2501;
                var3++;
            }
            this.field895.field2501 += var6;
        }
        this.field898 = 0L;
        this.field902 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field902[var4] = this.field896[var4];
        }
        this.field899 = new int[var2];
        this.field901 = new int[var2];
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    public final void method282(int arg0) {
        this.field902[arg0] = this.field895.field2501;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()Z")
    public final boolean method283() {
        int var1 = this.field902.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field902[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()I")
    public final int method284() {
        return this.field902.length;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
    public final void method285() {
        this.field895.field2498 = null;
        this.field896 = null;
        this.field902 = null;
        this.field899 = null;
        this.field901 = null;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "()V")
    public final void method286() {
        this.field895.field2501 = -1;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "()Z")
    public final boolean method287() {
        return this.field895.field2498 != null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(J)V")
    public final void method288(long arg0) {
        this.field898 = arg0;
        int var3 = this.field902.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field899[var4] = 0;
            this.field901[var4] = 0;
            this.field895.field2501 = this.field896[var4];
            this.method290(var4);
            this.field902[var4] = this.field895.field2501;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)J")
    public final long method289(int arg0) {
        return (long) this.field897 * (long) arg0 + this.field898;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public final void method290(int arg0) {
        int var2 = this.field895.method798((byte) -85);
        this.field899[arg0] += var2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    private final int method291(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field894[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field895.method829((byte) 121) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field895.method829((byte) 53) << 16;
            }
            return var8;
        }
        int var3 = this.field895.method829((byte) -74);
        int var4 = this.field895.method798((byte) -91);
        if (var3 == 47) {
            this.field895.field2501 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field895.method805(3);
            var4 -= 3;
            int var6 = this.field899[arg0];
            this.field898 += (long) (this.field897 - var5) * (long) var6;
            this.field897 = var5;
            this.field895.field2501 += var4;
            return 2;
        } else {
            this.field895.field2501 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public final void method292(int arg0) {
        this.field895.field2501 = this.field902[arg0];
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)I")
    private final int method293(int arg0) {
        byte var2 = this.field895.field2498[this.field895.field2501];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field901[arg0] = var3;
            this.field895.field2501++;
        } else {
            var3 = this.field901[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method291(arg0, var3);
        }
        int var4 = this.field895.method798((byte) -89);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field895.field2498[this.field895.field2501] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field895.field2501++;
                this.field901[arg0] = var5;
                return this.method291(arg0, var5);
            }
        }
        this.field895.field2501 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class37() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "([B)V")
    public class37(byte[] arg0) {
        this.method281(arg0);
    }
}
