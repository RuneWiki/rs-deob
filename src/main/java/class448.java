import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class448 {

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Ldh;")
    private class209 field6676 = new class209(null);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "[B")
    private static byte[] field6675 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    private int field6683;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "J")
    private long field6678;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
    private int[] field6677;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "[I")
    public int[] field6679;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "[I")
    private int[] field6680;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "[I")
    private int[] field6682;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "()I")
    public final int method2696() {
        int var1 = this.field6680.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6680[var4] >= 0 && this.field6679[var4] < var3) {
                var2 = var4;
                var3 = this.field6679[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "()Z")
    public final boolean method2697() {
        return this.field6676.field3036 != null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)J")
    public final long method2698(int arg0) {
        return (long) this.field6683 * (long) arg0 + this.field6678;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public final void method2699(int arg0) {
        int var2 = this.field6676.method1444(true);
        this.field6679[arg0] += var2;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "()Z")
    public final boolean method2700() {
        int var1 = this.field6680.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6680[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([B)V")
    public final void method2701(byte[] arg0) {
        this.field6676.field3036 = arg0;
        this.field6676.field3037 = 10;
        int var2 = this.field6676.method1450((byte) 44);
        this.field6681 = this.field6676.method1450((byte) 33);
        this.field6683 = 500000;
        this.field6682 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6676.method1452(65280);
            int var6 = this.field6676.method1452(65280);
            if (var5 == 1297379947) {
                this.field6682[var3] = this.field6676.field3037;
                var3++;
            }
            this.field6676.field3037 += var6;
        }
        this.field6678 = 0L;
        this.field6680 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6680[var4] = this.field6682[var4];
        }
        this.field6679 = new int[var2];
        this.field6677 = new int[var2];
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
    public final void method2702() {
        this.field6676.field3036 = null;
        this.field6682 = null;
        this.field6680 = null;
        this.field6679 = null;
        this.field6677 = null;
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "()I")
    public final int method2703() {
        return this.field6680.length;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)I")
    public final int method2704(int arg0) {
        return this.method2710(arg0);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
    private final int method2705(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6675[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6676.method1428(32122) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6676.method1428(32122) << 16;
            }
            return var8;
        }
        int var3 = this.field6676.method1428(32122);
        int var4 = this.field6676.method1444(true);
        if (var3 == 47) {
            this.field6676.field3037 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6676.method1458((byte) -10);
            var4 -= 3;
            int var6 = this.field6679[arg0];
            this.field6678 += (long) (this.field6683 - var5) * (long) var6;
            this.field6683 = var5;
            this.field6676.field3037 += var4;
            return 2;
        } else {
            this.field6676.field3037 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "()V")
    public static void method2706() {
        field6675 = null;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
    public final void method2707(int arg0) {
        this.field6680[arg0] = this.field6676.field3037;
    }

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "()V")
    public final void method2708() {
        this.field6676.field3037 = -1;
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V")
    public final void method2709(int arg0) {
        this.field6676.field3037 = this.field6680[arg0];
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
    public class448() {
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)I")
    private final int method2710(int arg0) {
        byte var2 = this.field6676.field3036[this.field6676.field3037];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6677[arg0] = var3;
            this.field6676.field3037++;
        } else {
            var3 = this.field6677[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2705(arg0, var3);
        }
        int var4 = this.field6676.method1444(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6676.field3036[this.field6676.field3037] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6676.field3037++;
                this.field6677[arg0] = var5;
                return this.method2705(arg0, var5);
            }
        }
        this.field6676.field3037 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "([B)V")
    public class448(byte[] arg0) {
        this.method2701(arg0);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(J)V")
    public final void method2711(long arg0) {
        this.field6678 = arg0;
        int var3 = this.field6680.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6679[var4] = 0;
            this.field6677[var4] = 0;
            this.field6676.field3037 = this.field6682[var4];
            this.method2699(var4);
            this.field6680[var4] = this.field6676.field3037;
        }
    }
}
