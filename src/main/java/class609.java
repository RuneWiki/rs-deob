import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class609 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lji;")
    private class611 field8504 = new class611(null);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "[B")
    private static byte[] field8503 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field8507;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    private int field8508;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "J")
    private long field8506;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
    private int[] field8505;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
    private int[] field8509;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[I")
    public int[] field8510;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
    private int[] field8511;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V", line = 3)
    public final void method3362() {
        this.field8504.field8529 = null;
        this.field8505 = null;
        this.field8511 = null;
        this.field8510 = null;
        this.field8509 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()Z", line = 14)
    public final boolean method3363() {
        return this.field8504.field8529 != null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)J", line = 17)
    public final long method3364(int arg0) {
        return (long) this.field8508 * (long) arg0 + this.field8506;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(J)V", line = 20)
    public final void method3365(long arg0) {
        this.field8506 = arg0;
        int var3 = this.field8511.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field8510[var4] = 0;
            this.field8509[var4] = 0;
            this.field8504.field8520 = this.field8505[var4];
            this.method3373(var4);
            this.field8511[var4] = this.field8504.field8520;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I", line = 39)
    private final int method3366(int arg0) {
        byte var2 = this.field8504.field8529[this.field8504.field8520];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field8509[arg0] = var3;
            this.field8504.field8520++;
        } else {
            var3 = this.field8509[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3377(arg0, var3);
        }
        int var4 = this.field8504.method3439((byte) -20);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field8504.field8529[this.field8504.field8520] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field8504.field8520++;
                this.field8509[arg0] = var5;
                return this.method3377(arg0, var5);
            }
        }
        this.field8504.field8520 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()Z", line = 79)
    public final boolean method3367() {
        int var1 = this.field8511.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field8511[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()I", line = 93)
    public final int method3368() {
        int var1 = this.field8511.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field8511[var4] >= 0 && this.field8510[var4] < var3) {
                var2 = var4;
                var3 = this.field8510[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 118)
    public final void method3369(int arg0) {
        this.field8511[arg0] = this.field8504.field8520;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()V", line = 121)
    public final void method3370() {
        this.field8504.field8520 = -1;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "()V", line = 124)
    public static void method3371() {
        field8503 = null;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 129)
    public final void method3372(int arg0) {
        this.field8504.field8520 = this.field8511[arg0];
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 133)
    public final void method3373(int arg0) {
        int var2 = this.field8504.method3439((byte) -20);
        this.field8510[arg0] += var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([B)V", line = 137)
    public final void method3374(byte[] arg0) {
        this.field8504.field8529 = arg0;
        this.field8504.field8520 = 10;
        int var2 = this.field8504.method3402((byte) 127);
        this.field8507 = this.field8504.method3402((byte) 127);
        this.field8508 = 500000;
        this.field8505 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field8504.method3418(-2);
            int var6 = this.field8504.method3418(-2);
            if (var5 == 1297379947) {
                this.field8505[var3] = this.field8504.field8520;
                var3++;
            }
            this.field8504.field8520 += var6;
        }
        this.field8506 = 0L;
        this.field8511 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field8511[var4] = this.field8505[var4];
        }
        this.field8510 = new int[var2];
        this.field8509 = new int[var2];
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "()I", line = 195)
    public final int method3375() {
        return this.field8511.length;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 264)
    public class609() {
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V", line = 266)
    public class609(byte[] arg0) {
        this.method3374(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)I", line = 211)
    public final int method3376(int arg0) {
        return this.method3366(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I", line = 218)
    private final int method3377(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field8503[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field8504.method3428((byte) 72) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field8504.method3428((byte) 17) << 16;
            }
            return var8;
        }
        int var3 = this.field8504.method3428((byte) -108);
        int var4 = this.field8504.method3439((byte) -20);
        if (var3 == 47) {
            this.field8504.field8520 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field8504.method3385(-124);
            var4 -= 3;
            int var6 = this.field8510[arg0];
            this.field8506 += (long) (this.field8508 - var5) * (long) var6;
            this.field8508 = var5;
            this.field8504.field8520 += var4;
            return 2;
        } else {
            this.field8504.field8520 += var4;
            return 3;
        }
    }
}
