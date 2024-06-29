import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class220 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lgk;")
    private class468 field3146 = new class468(null);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[B")
    private static byte[] field3145 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field3148;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "J")
    private long field3153;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "[I")
    private int[] field3147;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
    private int[] field3149;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    private int[] field3150;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    public int[] field3152;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static void method1385() {
        field3145 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    private final int method1386(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3145[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3146.method2765(50) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3146.method2765(115) << 16;
            }
            return var8;
        }
        int var3 = this.field3146.method2765(124);
        int var4 = this.field3146.method2747(false);
        if (var3 == 47) {
            this.field3146.field6830 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3146.method2759(1919914864);
            var4 -= 3;
            int var6 = this.field3152[arg0];
            this.field3153 += (long) (this.field3148 - var5) * (long) var6;
            this.field3148 = var5;
            this.field3146.field6830 += var4;
            return 2;
        } else {
            this.field3146.field6830 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
    public final void method1387() {
        this.field3146.field6868 = null;
        this.field3147 = null;
        this.field3149 = null;
        this.field3152 = null;
        this.field3150 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(J)V")
    public final void method1388(long arg0) {
        this.field3153 = arg0;
        int var3 = this.field3149.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3152[var4] = 0;
            this.field3150[var4] = 0;
            this.field3146.field6830 = this.field3147[var4];
            this.method1395(var4);
            this.field3149[var4] = this.field3146.field6830;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
    public final int method1389(int arg0) {
        return this.method1392(arg0);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()Z")
    public final boolean method1390() {
        return this.field3146.field6868 != null;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "()Z")
    public final boolean method1391() {
        int var1 = this.field3149.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3149[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    private final int method1392(int arg0) {
        byte var2 = this.field3146.field6868[this.field3146.field6830];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3150[arg0] = var3;
            this.field3146.field6830++;
        } else {
            var3 = this.field3150[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1386(arg0, var3);
        }
        int var4 = this.field3146.method2747(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3146.field6868[this.field3146.field6830] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3146.field6830++;
                this.field3150[arg0] = var5;
                return this.method1386(arg0, var5);
            }
        }
        this.field3146.field6830 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "()I")
    public final int method1393() {
        return this.field3149.length;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "()I")
    public final int method1394() {
        int var1 = this.field3149.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3149[var4] >= 0 && this.field3152[var4] < var3) {
                var2 = var4;
                var3 = this.field3152[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method1395(int arg0) {
        int var2 = this.field3146.method2747(false);
        this.field3152[arg0] += var2;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "()V")
    public final void method1396() {
        this.field3146.field6830 = -1;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public final void method1397(int arg0) {
        this.field3149[arg0] = this.field3146.field6830;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([B)V")
    public final void method1398(byte[] arg0) {
        this.field3146.field6868 = arg0;
        this.field3146.field6830 = 10;
        int var2 = this.field3146.method2727((byte) 43);
        this.field3151 = this.field3146.method2727((byte) 43);
        this.field3148 = 500000;
        this.field3147 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3146.method2722(false);
            int var6 = this.field3146.method2722(false);
            if (var5 == 1297379947) {
                this.field3147[var3] = this.field3146.field6830;
                var3++;
            }
            this.field3146.field6830 += var6;
        }
        this.field3153 = 0L;
        this.field3149 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3149[var4] = this.field3147[var4];
        }
        this.field3152 = new int[var2];
        this.field3150 = new int[var2];
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public final void method1399(int arg0) {
        this.field3146.field6830 = this.field3149[arg0];
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)J")
    public final long method1400(int arg0) {
        return (long) this.field3148 * (long) arg0 + this.field3153;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class220() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class220(byte[] arg0) {
        this.method1398(arg0);
    }
}
