import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class145 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lwd;")
    private class217 field2517 = new class217((byte[]) null);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[B")
    private static byte[] field2516 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "J")
    private long field2521;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    private int[] field2518;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[I")
    private int[] field2519;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[I")
    private int[] field2522;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
    public int[] field2523;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(J)V")
    public final void method1011(long arg0) {
        this.field2521 = arg0;
        int var3 = this.field2522.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2523[var4] = 0;
            this.field2518[var4] = 0;
            this.field2517.field3581 = this.field2519[var4];
            this.method1012(var4);
            this.field2522[var4] = this.field2517.field3581;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method1012(int arg0) {
        int var2 = this.field2517.method1468((byte) -85);
        this.field2523[arg0] += var2;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public final void method1013(int arg0) {
        this.field2517.field3581 = this.field2522[arg0];
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final void method1014(int arg0) {
        this.field2522[arg0] = this.field2517.field3581;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)J")
    public final long method1015(int arg0) {
        return (long) this.field2524 * (long) arg0 + this.field2521;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)I")
    public final int method1016(int arg0) {
        return this.method1022(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    private final int method1017(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2516[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2517.method1487(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2517.method1487(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2517.method1487(255);
        int var4 = this.field2517.method1468((byte) -85);
        if (var3 == 47) {
            this.field2517.field3581 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2517.method1447(-126);
            var4 -= 3;
            int var6 = this.field2523[arg0];
            this.field2521 += (long) (this.field2524 - var5) * (long) var6;
            this.field2524 = var5;
            this.field2517.field3581 += var4;
            return 2;
        } else {
            this.field2517.field3581 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
    public final int method1018() {
        return this.field2522.length;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([B)V")
    public final void method1019(byte[] arg0) {
        this.field2517.field3633 = arg0;
        this.field2517.field3581 = 10;
        int var2 = this.field2517.method1441(-25);
        this.field2520 = this.field2517.method1441(122);
        this.field2524 = 500000;
        this.field2519 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2517.method1466((byte) -15);
            int var6 = this.field2517.method1466((byte) -15);
            if (var5 == 1297379947) {
                this.field2519[var3] = this.field2517.field3581;
                var3++;
            }
            this.field2517.field3581 += var6;
        }
        this.field2521 = 0L;
        this.field2522 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2522[var4] = this.field2519[var4];
        }
        this.field2523 = new int[var2];
        this.field2518 = new int[var2];
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()V")
    public final void method1020() {
        this.field2517.field3633 = null;
        this.field2519 = null;
        this.field2522 = null;
        this.field2523 = null;
        this.field2518 = null;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()Z")
    public final boolean method1021() {
        return this.field2517.field3633 != null;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)I")
    private final int method1022(int arg0) {
        byte var2 = this.field2517.field3633[this.field2517.field3581];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2518[arg0] = var3;
            this.field2517.field3581++;
        } else {
            var3 = this.field2518[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1017(arg0, var3);
        }
        int var4 = this.field2517.method1468((byte) -85);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2517.field3633[this.field2517.field3581] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2517.field3581++;
                this.field2518[arg0] = var5;
                return this.method1017(arg0, var5);
            }
        }
        this.field2517.field3581 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()V")
    public final void method1023() {
        this.field2517.field3581 = -1;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "()I")
    public final int method1024() {
        int var1 = this.field2522.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2522[var4] >= 0 && this.field2523[var4] < var3) {
                var2 = var4;
                var3 = this.field2523[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "()V")
    public static void method1025() {
        field2516 = null;
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "()Z")
    public final boolean method1026() {
        int var1 = this.field2522.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2522[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class145() {
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B)V")
    public class145(byte[] arg0) {
        this.method1019(arg0);
    }
}
