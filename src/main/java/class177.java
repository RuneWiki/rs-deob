import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class177 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lfj;")
    private class66 field3046 = new class66(null);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[B")
    private static byte[] field3047 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private int field3048;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "J")
    private long field3049;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    private int[] field3050;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
    public int[] field3051;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
    private int[] field3052;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
    private int[] field3054;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(J)V")
    public final void method1108(long arg0) {
        this.field3049 = arg0;
        int var3 = this.field3050.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3051[var4] = 0;
            this.field3054[var4] = 0;
            this.field3046.field1195 = this.field3052[var4];
            this.method1122(var4);
            this.field3050[var4] = this.field3046.field1195;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
    public static void method1109() {
        field3047 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
    private final int method1110(int arg0) {
        byte var2 = this.field3046.field1219[this.field3046.field1195];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3054[arg0] = var3;
            this.field3046.field1195++;
        } else {
            var3 = this.field3054[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1123(arg0, var3);
        }
        int var4 = this.field3046.method501((byte) 30);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3046.field1219[this.field3046.field1195] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3046.field1195++;
                this.field3054[arg0] = var5;
                return this.method1123(arg0, var5);
            }
        }
        this.field3046.field1195 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()I")
    public final int method1111() {
        int var1 = this.field3050.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3050[var4] >= 0 && this.field3051[var4] < var3) {
                var2 = var4;
                var3 = this.field3051[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()V")
    public final void method1112() {
        this.field3046.field1219 = null;
        this.field3052 = null;
        this.field3050 = null;
        this.field3051 = null;
        this.field3054 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public final void method1113(int arg0) {
        this.field3050[arg0] = this.field3046.field1195;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
    public final int method1114() {
        return this.field3050.length;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)J")
    public final long method1115(int arg0) {
        return (long) this.field3048 * (long) arg0 + this.field3049;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
    public final void method1116(byte[] arg0) {
        this.field3046.field1219 = arg0;
        this.field3046.field1195 = 10;
        int var2 = this.field3046.method500(96);
        this.field3053 = this.field3046.method500(92);
        this.field3048 = 500000;
        this.field3052 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3046.method528(true);
            int var6 = this.field3046.method528(true);
            if (var5 == 1297379947) {
                this.field3052[var3] = this.field3046.field1195;
                var3++;
            }
            this.field3046.field1195 += var6;
        }
        this.field3049 = 0L;
        this.field3050 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3050[var4] = this.field3052[var4];
        }
        this.field3051 = new int[var2];
        this.field3054 = new int[var2];
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
    public final void method1117(int arg0) {
        this.field3046.field1195 = this.field3050[arg0];
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
    public final void method1118() {
        this.field3046.field1195 = -1;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z")
    public final boolean method1119() {
        return this.field3046.field1219 != null;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)I")
    public final int method1120(int arg0) {
        return this.method1110(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "()Z")
    public final boolean method1121() {
        int var1 = this.field3050.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3050[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public final void method1122(int arg0) {
        int var2 = this.field3046.method501((byte) 30);
        this.field3051[arg0] += var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    private final int method1123(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3047[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3046.method506(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3046.method506(255) << 16;
            }
            return var8;
        }
        int var3 = this.field3046.method506(255);
        int var4 = this.field3046.method501((byte) 30);
        if (var3 == 47) {
            this.field3046.field1195 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3046.method480(104);
            var4 -= 3;
            int var6 = this.field3051[arg0];
            this.field3049 += (long) (this.field3048 - var5) * (long) var6;
            this.field3048 = var5;
            this.field3046.field1195 += var4;
            return 2;
        } else {
            this.field3046.field1195 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class177() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
    public class177(byte[] arg0) {
        this.method1116(arg0);
    }
}
