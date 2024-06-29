import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class84 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lik;")
    private class261 field1459 = new class261((byte[]) null);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[B")
    private static byte[] field1460 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "J")
    private long field1461;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
    private int[] field1462;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
    public int[] field1463;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
    private int[] field1464;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    private int[] field1465;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()Z")
    public final boolean method566() {
        int var1 = this.field1464.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1464[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V")
    public final void method567() {
        this.field1459.field4587 = -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    private final int method568(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1460[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1459.method1693((byte) 76) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1459.method1693((byte) -113) << 16;
            }
            return var8;
        }
        int var3 = this.field1459.method1693((byte) 84);
        int var4 = this.field1459.method1743(126);
        if (var3 == 47) {
            this.field1459.field4587 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1459.method1747(false);
            var4 -= 3;
            int var6 = this.field1463[arg0];
            this.field1461 += (long) (this.field1467 - var5) * (long) var6;
            this.field1467 = var5;
            this.field1459.field4587 += var4;
            return 2;
        } else {
            this.field1459.field4587 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()I")
    public final int method569() {
        int var1 = this.field1464.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1464[var4] >= 0 && this.field1463[var4] < var3) {
                var2 = var4;
                var3 = this.field1463[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B)V")
    public final void method570(byte[] arg0) {
        this.field1459.field4619 = arg0;
        this.field1459.field4587 = 10;
        int var2 = this.field1459.method1740((byte) 51);
        this.field1466 = this.field1459.method1740((byte) 94);
        this.field1467 = 500000;
        this.field1465 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1459.method1712(-4);
            int var6 = this.field1459.method1712(-4);
            if (var5 == 1297379947) {
                this.field1465[var3] = this.field1459.field4587;
                var3++;
            }
            this.field1459.field4587 += var6;
        }
        this.field1461 = 0L;
        this.field1464 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1464[var4] = this.field1465[var4];
        }
        this.field1463 = new int[var2];
        this.field1462 = new int[var2];
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method571(int arg0) {
        this.field1464[arg0] = this.field1459.field4587;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
    private final int method572(int arg0) {
        byte var2 = this.field1459.field4619[this.field1459.field4587];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1462[arg0] = var3;
            this.field1459.field4587++;
        } else {
            var3 = this.field1462[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method568(arg0, var3);
        }
        int var4 = this.field1459.method1743(123);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1459.field4619[this.field1459.field4587] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1459.field4587++;
                this.field1462[arg0] = var5;
                return this.method568(arg0, var5);
            }
        }
        this.field1459.field4587 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()V")
    public final void method573() {
        this.field1459.field4619 = null;
        this.field1465 = null;
        this.field1464 = null;
        this.field1463 = null;
        this.field1462 = null;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()I")
    public final int method574() {
        return this.field1464.length;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public final void method575(int arg0) {
        int var2 = this.field1459.method1743(123);
        this.field1463[arg0] += var2;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public final void method576(int arg0) {
        this.field1459.field4587 = this.field1464[arg0];
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
    public static void method577() {
        field1460 = null;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()Z")
    public final boolean method578() {
        return this.field1459.field4619 != null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(J)V")
    public final void method579(long arg0) {
        this.field1461 = arg0;
        int var3 = this.field1464.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1463[var4] = 0;
            this.field1462[var4] = 0;
            this.field1459.field4587 = this.field1465[var4];
            this.method575(var4);
            this.field1464[var4] = this.field1459.field4587;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)I")
    public final int method580(int arg0) {
        return this.method572(arg0);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([B)V")
    public class84(byte[] arg0) {
        this.method570(arg0);
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)J")
    public final long method581(int arg0) {
        return (long) this.field1467 * (long) arg0 + this.field1461;
    }
}
