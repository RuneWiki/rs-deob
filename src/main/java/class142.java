import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class142 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lb;")
    private class8 field3455 = new class8(null);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[B")
    private static byte[] field3459 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "J")
    private long field3458;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[I")
    public int[] field3456;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
    private int[] field3460;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    private int[] field3461;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
    private int[] field3463;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()Z")
    public final boolean method1137() {
        return this.field3455.field132 != null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method1138(int arg0) {
        int var2 = this.field3455.method83(-1);
        this.field3456[arg0] += var2;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()I")
    public final int method1139() {
        int var1 = this.field3460.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3460[var4] >= 0 && this.field3456[var4] < var3) {
                var2 = var4;
                var3 = this.field3456[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()Z")
    public final boolean method1140() {
        int var1 = this.field3460.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3460[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "()V")
    public static void method1141() {
        field3459 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([B)V")
    public final void method1142(byte[] arg0) {
        this.field3455.field132 = arg0;
        this.field3455.field182 = 10;
        int var2 = this.field3455.method68(-2);
        this.field3462 = this.field3455.method68(-2);
        this.field3457 = 500000;
        this.field3461 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3455.method70(false);
            int var6 = this.field3455.method70(false);
            if (var5 == 1297379947) {
                this.field3461[var3] = this.field3455.field182;
                var3++;
            }
            this.field3455.field182 += var6;
        }
        this.field3458 = 0L;
        this.field3460 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3460[var4] = this.field3461[var4];
        }
        this.field3456 = new int[var2];
        this.field3463 = new int[var2];
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(J)V")
    public final void method1143(long arg0) {
        this.field3458 = arg0;
        int var3 = this.field3460.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3456[var4] = 0;
            this.field3463[var4] = 0;
            this.field3455.field182 = this.field3461[var4];
            this.method1138(var4);
            this.field3460[var4] = this.field3455.field182;
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "()V")
    public final void method1144() {
        this.field3455.field182 = -1;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method1145(int arg0) {
        this.field3455.field182 = this.field3460[arg0];
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
    private final int method1146(int arg0) {
        byte var2 = this.field3455.field132[this.field3455.field182];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3463[arg0] = var3;
            this.field3455.field182++;
        } else {
            var3 = this.field3463[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1147(arg0, var3);
        }
        int var4 = this.field3455.method83(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3455.field132[this.field3455.field182] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3455.field182++;
                this.field3463[arg0] = var5;
                return this.method1147(arg0, var5);
            }
        }
        this.field3455.field182 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
    private final int method1147(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3459[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3455.method62((byte) 123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3455.method62((byte) 79) << 16;
            }
            return var8;
        }
        int var3 = this.field3455.method62((byte) 102);
        int var4 = this.field3455.method83(-1);
        if (var3 == 47) {
            this.field3455.field182 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3455.method56(-19856);
            var4 -= 3;
            int var6 = this.field3456[arg0];
            this.field3458 += (long) (this.field3457 - var5) * (long) var6;
            this.field3457 = var5;
            this.field3455.field182 += var4;
            return 2;
        } else {
            this.field3455.field182 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "()V")
    public final void method1148() {
        this.field3455.field132 = null;
        this.field3461 = null;
        this.field3460 = null;
        this.field3456 = null;
        this.field3463 = null;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)J")
    public final long method1149(int arg0) {
        return (long) this.field3457 * (long) arg0 + this.field3458;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public final void method1150(int arg0) {
        this.field3460[arg0] = this.field3455.field182;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I")
    public final int method1151(int arg0) {
        return this.method1146(arg0);
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "()I")
    public final int method1152() {
        return this.field3460.length;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class142() {
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
    public class142(byte[] arg0) {
        this.method1142(arg0);
    }
}
