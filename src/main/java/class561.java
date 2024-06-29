import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class561 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Lgga;")
    private class511 field7895 = new class511(null);

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "[B")
    private static byte[] field7900 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public int field7897;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    private int field7901;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "J")
    private long field7898;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "[I")
    public int[] field7896;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "[I")
    private int[] field7899;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
    private int[] field7902;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "[I")
    private int[] field7903;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)I")
    public final int method3308(int arg0) {
        return this.method3309(arg0);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
    private final int method3309(int arg0) {
        byte var2 = this.field7895.field6979[this.field7895.field6962];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7903[arg0] = var3;
            this.field7895.field6962++;
        } else {
            var3 = this.field7903[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3311(arg0, var3);
        }
        int var4 = this.field7895.method3038(-99);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7895.field6979[this.field7895.field6962] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7895.field6962++;
                this.field7903[arg0] = var5;
                return this.method3311(arg0, var5);
            }
        }
        this.field7895.field6962 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()V")
    public final void method3310() {
        this.field7895.field6979 = null;
        this.field7899 = null;
        this.field7902 = null;
        this.field7896 = null;
        this.field7903 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
    private final int method3311(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7900[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7895.method3013(-101) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7895.method3013(-99) << 16;
            }
            return var8;
        }
        int var3 = this.field7895.method3013(18);
        int var4 = this.field7895.method3038(-105);
        if (var3 == 47) {
            this.field7895.field6962 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7895.method2983(true);
            var4 -= 3;
            int var6 = this.field7896[arg0];
            this.field7898 += (long) (this.field7901 - var5) * (long) var6;
            this.field7901 = var5;
            this.field7895.field6962 += var4;
            return 2;
        } else {
            this.field7895.field6962 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "()Z")
    public final boolean method3312() {
        int var1 = this.field7902.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7902[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "()V")
    public final void method3313() {
        this.field7895.field6962 = -1;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)J")
    public final long method3314(int arg0) {
        return (long) this.field7901 * (long) arg0 + this.field7898;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(J)V")
    public final void method3315(long arg0) {
        this.field7898 = arg0;
        int var3 = this.field7902.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7896[var4] = 0;
            this.field7903[var4] = 0;
            this.field7895.field6962 = this.field7899[var4];
            this.method3323(var4);
            this.field7902[var4] = this.field7895.field6962;
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "()I")
    public final int method3316() {
        int var1 = this.field7902.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7902[var4] >= 0 && this.field7896[var4] < var3) {
                var2 = var4;
                var3 = this.field7896[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "([B)V")
    public final void method3317(byte[] arg0) {
        this.field7895.field6979 = arg0;
        this.field7895.field6962 = 10;
        int var2 = this.field7895.method3002(-1);
        this.field7897 = this.field7895.method3002(-1);
        this.field7901 = 500000;
        this.field7899 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7895.method3008(64);
            int var6 = this.field7895.method3008(64);
            if (var5 == 1297379947) {
                this.field7899[var3] = this.field7895.field6962;
                var3++;
            }
            this.field7895.field6962 += var6;
        }
        this.field7898 = 0L;
        this.field7902 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7902[var4] = this.field7899[var4];
        }
        this.field7896 = new int[var2];
        this.field7903 = new int[var2];
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
    public final void method3318(int arg0) {
        this.field7895.field6962 = this.field7902[arg0];
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "()I")
    public final int method3319() {
        return this.field7902.length;
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "()V")
    public static void method3320() {
        field7900 = null;
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
    public final void method3321(int arg0) {
        this.field7902[arg0] = this.field7895.field6962;
    }

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "()Z")
    public final boolean method3322() {
        return this.field7895.field6979 != null;
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
    public final void method3323(int arg0) {
        int var2 = this.field7895.method3038(-112);
        this.field7896[arg0] += var2;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
    public class561() {
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "([B)V")
    public class561(byte[] arg0) {
        this.method3317(arg0);
    }
}
