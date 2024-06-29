import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class22 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lnc;")
    private class145 field570 = new class145(null);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[B")
    private static byte[] field572 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "J")
    private long field578;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[I")
    public int[] field571;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[I")
    private int[] field573;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    private int[] field575;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    private int[] field576;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()Z")
    public final boolean method185() {
        return this.field570.field2613 != null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()Z")
    public final boolean method186() {
        int var1 = this.field573.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field573[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
    public final int method187() {
        int var1 = this.field573.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field573[var4] >= 0 && this.field571[var4] < var3) {
                var2 = var4;
                var3 = this.field571[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(J)V")
    public final void method188(long arg0) {
        this.field578 = arg0;
        int var3 = this.field573.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field571[var4] = 0;
            this.field576[var4] = 0;
            this.field570.field2643 = this.field575[var4];
            this.method191(var4);
            this.field573[var4] = this.field570.field2643;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    private final int method189(int arg0) {
        byte var2 = this.field570.field2613[this.field570.field2643];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field576[arg0] = var3;
            this.field570.field2643++;
        } else {
            var3 = this.field576[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method198(arg0, var3);
        }
        int var4 = this.field570.method1048(16);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field570.field2613[this.field570.field2643] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field570.field2643++;
                this.field576[arg0] = var5;
                return this.method198(arg0, var5);
            }
        }
        this.field570.field2643 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)J")
    public final long method190(int arg0) {
        return (long) this.field574 * (long) arg0 + this.field578;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        int var2 = this.field570.method1048(16);
        this.field571[arg0] += var2;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
    public static void method192() {
        field572 = null;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        this.field570.field2643 = this.field573[arg0];
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "()V")
    public final void method194() {
        this.field570.field2613 = null;
        this.field575 = null;
        this.field573 = null;
        this.field571 = null;
        this.field576 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V")
    public final void method195(byte[] arg0) {
        this.field570.field2613 = arg0;
        this.field570.field2643 = 10;
        int var2 = this.field570.method1049((byte) 107);
        this.field577 = this.field570.method1049((byte) 103);
        this.field574 = 500000;
        this.field575 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field570.method1018(-1068451600);
            int var6 = this.field570.method1018(-1068451600);
            if (var5 == 1297379947) {
                this.field575[var3] = this.field570.field2643;
                var3++;
            }
            this.field570.field2643 += var6;
        }
        this.field578 = 0L;
        this.field573 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field573[var4] = this.field575[var4];
        }
        this.field571 = new int[var2];
        this.field576 = new int[var2];
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
    public final int method196(int arg0) {
        return this.method189(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public final void method197(int arg0) {
        this.field573[arg0] = this.field570.field2643;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    private final int method198(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field572[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field570.method998(64) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field570.method998(61) << 16;
            }
            return var8;
        }
        int var3 = this.field570.method998(105);
        int var4 = this.field570.method1048(16);
        if (var3 == 47) {
            this.field570.field2643 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field570.method1023(-1002744);
            var4 -= 3;
            int var6 = this.field571[arg0];
            this.field578 += (long) (this.field574 - var5) * (long) var6;
            this.field574 = var5;
            this.field570.field2643 += var4;
            return 2;
        } else {
            this.field570.field2643 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
    public final void method199() {
        this.field570.field2643 = -1;
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "()I")
    public final int method200() {
        return this.field573.length;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class22() {
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V")
    public class22(byte[] arg0) {
        this.method195(arg0);
    }
}
