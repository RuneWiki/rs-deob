import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class216 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lce;")
    private class28 field4020 = new class28(null);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[B")
    private static byte[] field4019 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    private int field4025;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "J")
    private long field4021;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
    public int[] field4022;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
    private int[] field4023;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[I")
    private int[] field4026;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "[I")
    private int[] field4027;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method1421(int arg0) {
        this.field4020.field526 = this.field4027[arg0];
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
    public static void method1422() {
        field4019 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public final void method1423(int arg0) {
        this.field4027[arg0] = this.field4020.field526;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(J)V")
    public final void method1424(long arg0) {
        this.field4021 = arg0;
        int var3 = this.field4027.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4022[var4] = 0;
            this.field4023[var4] = 0;
            this.field4020.field526 = this.field4026[var4];
            this.method1435(var4);
            this.field4027[var4] = this.field4020.field526;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()I")
    public final int method1425() {
        int var1 = this.field4027.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4027[var4] >= 0 && this.field4022[var4] < var3) {
                var2 = var4;
                var3 = this.field4022[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([B)V")
    public final void method1426(byte[] arg0) {
        this.field4020.field502 = arg0;
        this.field4020.field526 = 10;
        int var2 = this.field4020.method230((byte) -118);
        this.field4024 = this.field4020.method230((byte) -125);
        this.field4025 = 500000;
        this.field4026 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4020.method226(-124);
            int var6 = this.field4020.method226(-117);
            if (var5 == 1297379947) {
                this.field4026[var3] = this.field4020.field526;
                var3++;
            }
            this.field4020.field526 += var6;
        }
        this.field4021 = 0L;
        this.field4027 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4027[var4] = this.field4026[var4];
        }
        this.field4022 = new int[var2];
        this.field4023 = new int[var2];
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()Z")
    public final boolean method1427() {
        int var1 = this.field4027.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4027[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()V")
    public final void method1428() {
        this.field4020.field526 = -1;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "()I")
    public final int method1429() {
        return this.field4027.length;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "()Z")
    public final boolean method1430() {
        return this.field4020.field502 != null;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I")
    public final int method1431(int arg0) {
        return this.method1432(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)I")
    private final int method1432(int arg0) {
        byte var2 = this.field4020.field502[this.field4020.field526];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4023[arg0] = var3;
            this.field4020.field526++;
        } else {
            var3 = this.field4023[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1434(arg0, var3);
        }
        int var4 = this.field4020.method191(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4020.field502[this.field4020.field526] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4020.field526++;
                this.field4023[arg0] = var5;
                return this.method1434(arg0, var5);
            }
        }
        this.field4020.field526 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "()V")
    public final void method1433() {
        this.field4020.field502 = null;
        this.field4026 = null;
        this.field4027 = null;
        this.field4022 = null;
        this.field4023 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
    private final int method1434(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4019[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4020.method215(-1797813752) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4020.method215(-1797813752) << 16;
            }
            return var8;
        }
        int var3 = this.field4020.method215(-1797813752);
        int var4 = this.field4020.method191(false);
        if (var3 == 47) {
            this.field4020.field526 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4020.method225(82);
            var4 -= 3;
            int var6 = this.field4022[arg0];
            this.field4021 += (long) (this.field4025 - var5) * (long) var6;
            this.field4025 = var5;
            this.field4020.field526 += var4;
            return 2;
        } else {
            this.field4020.field526 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
    public final void method1435(int arg0) {
        int var2 = this.field4020.method191(false);
        this.field4022[arg0] += var2;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)J")
    public final long method1436(int arg0) {
        return (long) this.field4025 * (long) arg0 + this.field4021;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class216() {
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V")
    public class216(byte[] arg0) {
        this.method1426(arg0);
    }
}
