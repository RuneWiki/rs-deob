import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class403 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lrg;")
    private class645 field6005 = new class645(null);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[B")
    private static byte[] field6004 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    private int field6007;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "J")
    private long field6011;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    private int[] field6008;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[I")
    private int[] field6009;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    private int[] field6010;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
    public int[] field6012;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()I", line = 4)
    public final int method2551() {
        int var1 = this.field6008.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6008[var4] >= 0 && this.field6012[var4] < var3) {
                var2 = var4;
                var3 = this.field6012[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 29)
    public final void method2552(int arg0) {
        this.field6005.field9084 = this.field6008[arg0];
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I", line = 33)
    private final int method2553(int arg0) {
        byte var2 = this.field6005.field9068[this.field6005.field9084];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6009[arg0] = var3;
            this.field6005.field9084++;
        } else {
            var3 = this.field6009[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2564(arg0, var3);
        }
        int var4 = this.field6005.method3716((byte) -126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6005.field9068[this.field6005.field9084] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6005.field9084++;
                this.field6009[arg0] = var5;
                return this.method2564(arg0, var5);
            }
        }
        this.field6005.field9084 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)J", line = 71)
    public final long method2554(int arg0) {
        return (long) this.field6007 * (long) arg0 + this.field6011;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 75)
    public final void method2555() {
        this.field6005.field9084 = -1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(J)V", line = 79)
    public final void method2556(long arg0) {
        this.field6011 = arg0;
        int var3 = this.field6008.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6012[var4] = 0;
            this.field6009[var4] = 0;
            this.field6005.field9084 = this.field6010[var4];
            this.method2562(var4);
            this.field6008[var4] = this.field6005.field9084;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V", line = 98)
    public static void method2557() {
        field6004 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()I", line = 101)
    public final int method2558() {
        return this.field6008.length;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()Z", line = 106)
    public final boolean method2559() {
        return this.field6005.field9068 != null;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()V", line = 110)
    public final void method2560() {
        this.field6005.field9068 = null;
        this.field6010 = null;
        this.field6008 = null;
        this.field6012 = null;
        this.field6009 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I", line = 120)
    public final int method2561(int arg0) {
        return this.method2553(arg0);
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 127)
    public final void method2562(int arg0) {
        int var2 = this.field6005.method3716((byte) -125);
        this.field6012[arg0] += var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([B)V", line = 132)
    public final void method2563(byte[] arg0) {
        this.field6005.field9068 = arg0;
        this.field6005.field9084 = 10;
        int var2 = this.field6005.method3712((byte) -111);
        this.field6006 = this.field6005.method3712((byte) -123);
        this.field6007 = 500000;
        this.field6010 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6005.method3720(-19541);
            int var6 = this.field6005.method3720(-19541);
            if (var5 == 1297379947) {
                this.field6010[var3] = this.field6005.field9084;
                var3++;
            }
            this.field6005.field9084 += var6;
        }
        this.field6011 = 0L;
        this.field6008 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6008[var4] = this.field6010[var4];
        }
        this.field6012 = new int[var2];
        this.field6009 = new int[var2];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I", line = 191)
    private final int method2564(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6004[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6005.method3745(-6314) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6005.method3745(-6314) << 16;
            }
            return var8;
        }
        int var3 = this.field6005.method3745(-6314);
        int var4 = this.field6005.method3716((byte) -127);
        if (var3 == 47) {
            this.field6005.field9084 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6005.method3747((byte) -74);
            var4 -= 3;
            int var6 = this.field6012[arg0];
            this.field6011 += (long) (this.field6007 - var5) * (long) var6;
            this.field6007 = var5;
            this.field6005.field9084 += var4;
            return 2;
        } else {
            this.field6005.field9084 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V", line = 234)
    public final void method2565(int arg0) {
        this.field6008[arg0] = this.field6005.field9084;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "()Z", line = 240)
    public final boolean method2566() {
        int var1 = this.field6008.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6008[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 263)
    public class403() {
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V", line = 266)
    public class403(byte[] arg0) {
        this.method2563(arg0);
    }
}
