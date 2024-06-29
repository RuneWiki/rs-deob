import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class146 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lv;")
    private class149 field2502 = new class149((byte[]) null);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[B")
    private static byte[] field2503 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "J")
    private long field2509;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
    private int[] field2506;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
    private int[] field2507;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[I")
    private int[] field2508;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
    public int[] field2510;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()Z")
    public final boolean method998() {
        return this.field2502.field2568 != null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()Z")
    public final boolean method999() {
        int var1 = this.field2508.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2508[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public final void method1000(int arg0) {
        int var2 = this.field2502.method1087(0);
        this.field2510[arg0] += var2;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V")
    public static void method1001() {
        field2503 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(J)V")
    public final void method1002(long arg0) {
        this.field2509 = arg0;
        int var3 = this.field2508.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2510[var4] = 0;
            this.field2507[var4] = 0;
            this.field2502.field2593 = this.field2506[var4];
            this.method1000(var4);
            this.field2508[var4] = this.field2502.field2593;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
    private final int method1003(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2503[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2502.method1045((byte) 126) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2502.method1045((byte) -27) << 16;
            }
            return var8;
        }
        int var3 = this.field2502.method1045((byte) 107);
        int var4 = this.field2502.method1087(0);
        if (var3 == 47) {
            this.field2502.field2593 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2502.method1065((byte) 77);
            var4 -= 3;
            int var6 = this.field2510[arg0];
            this.field2509 += (long) (this.field2505 - var5) * (long) var6;
            this.field2505 = var5;
            this.field2502.field2593 += var4;
            return 2;
        } else {
            this.field2502.field2593 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V")
    public final void method1004() {
        this.field2502.field2568 = null;
        this.field2506 = null;
        this.field2508 = null;
        this.field2510 = null;
        this.field2507 = null;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "()I")
    public final int method1005() {
        return this.field2508.length;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public final void method1006(int arg0) {
        this.field2502.field2593 = this.field2508[arg0];
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
    private final int method1007(int arg0) {
        byte var2 = this.field2502.field2568[this.field2502.field2593];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2507[arg0] = var3;
            this.field2502.field2593++;
        } else {
            var3 = this.field2507[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1003(arg0, var3);
        }
        int var4 = this.field2502.method1087(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2502.field2568[this.field2502.field2593] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2502.field2593++;
                this.field2507[arg0] = var5;
                return this.method1003(arg0, var5);
            }
        }
        this.field2502.field2593 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public final void method1008(int arg0) {
        this.field2508[arg0] = this.field2502.field2593;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "()V")
    public final void method1009() {
        this.field2502.field2593 = -1;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "()I")
    public final int method1010() {
        int var1 = this.field2508.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2508[var4] >= 0 && this.field2510[var4] < var3) {
                var2 = var4;
                var3 = this.field2510[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)I")
    public final int method1011(int arg0) {
        return this.method1007(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([B)V")
    public final void method1012(byte[] arg0) {
        this.field2502.field2568 = arg0;
        this.field2502.field2593 = 10;
        int var2 = this.field2502.method1050(1272006568);
        this.field2504 = this.field2502.method1050(1272006568);
        this.field2505 = 500000;
        this.field2506 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2502.method1076(65280);
            int var6 = this.field2502.method1076(65280);
            if (var5 == 1297379947) {
                this.field2506[var3] = this.field2502.field2593;
                var3++;
            }
            this.field2502.field2593 += var6;
        }
        this.field2509 = 0L;
        this.field2508 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2508[var4] = this.field2506[var4];
        }
        this.field2510 = new int[var2];
        this.field2507 = new int[var2];
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)J")
    public final long method1013(int arg0) {
        return (long) this.field2505 * (long) arg0 + this.field2509;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class146() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([B)V")
    public class146(byte[] arg0) {
        this.method1012(arg0);
    }
}
