import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class232 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Llb;")
    private class121 field4044 = new class121((byte[]) null);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[B")
    private static byte[] field4047 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "J")
    private long field4050;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    public int[] field4045;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    private int[] field4046;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "[I")
    private int[] field4048;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    private int[] field4052;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
    public final void method1599() {
        this.field4044.field2014 = null;
        this.field4046 = null;
        this.field4052 = null;
        this.field4045 = null;
        this.field4048 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
    public static void method1600() {
        field4047 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method1601(int arg0) {
        this.field4044.field2026 = this.field4052[arg0];
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()Z")
    public final boolean method1602() {
        return this.field4044.field2014 != null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)J")
    public final long method1603(int arg0) {
        return (long) this.field4051 * (long) arg0 + this.field4050;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
    private final int method1604(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4047[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4044.method897(-35) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4044.method897(-109) << 16;
            }
            return var8;
        }
        int var3 = this.field4044.method897(-128);
        int var4 = this.field4044.method917(91);
        if (var3 == 47) {
            this.field4044.field2026 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4044.method891((byte) -128);
            var4 -= 3;
            int var6 = this.field4045[arg0];
            this.field4050 += (long) (this.field4051 - var5) * (long) var6;
            this.field4051 = var5;
            this.field4044.field2026 += var4;
            return 2;
        } else {
            this.field4044.field2026 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public final void method1605(int arg0) {
        this.field4052[arg0] = this.field4044.field2026;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([B)V")
    public final void method1606(byte[] arg0) {
        this.field4044.field2014 = arg0;
        this.field4044.field2026 = 10;
        int var2 = this.field4044.method876(false);
        this.field4049 = this.field4044.method876(false);
        this.field4051 = 500000;
        this.field4046 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4044.method865((byte) 8);
            int var6 = this.field4044.method865((byte) 8);
            if (var5 == 1297379947) {
                this.field4046[var3] = this.field4044.field2026;
                var3++;
            }
            this.field4044.field2026 += var6;
        }
        this.field4050 = 0L;
        this.field4052 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4052[var4] = this.field4046[var4];
        }
        this.field4045 = new int[var2];
        this.field4048 = new int[var2];
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public final void method1607(int arg0) {
        int var2 = this.field4044.method917(122);
        this.field4045[arg0] += var2;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V")
    public final void method1608() {
        this.field4044.field2026 = -1;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)I")
    public final int method1609(int arg0) {
        return this.method1614(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()Z")
    public final boolean method1610() {
        int var1 = this.field4052.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4052[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "()I")
    public final int method1611() {
        int var1 = this.field4052.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4052[var4] >= 0 && this.field4045[var4] < var3) {
                var2 = var4;
                var3 = this.field4045[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "()I")
    public final int method1612() {
        return this.field4052.length;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(J)V")
    public final void method1613(long arg0) {
        this.field4050 = arg0;
        int var3 = this.field4052.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4045[var4] = 0;
            this.field4048[var4] = 0;
            this.field4044.field2026 = this.field4046[var4];
            this.method1607(var4);
            this.field4052[var4] = this.field4044.field2026;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)I")
    private final int method1614(int arg0) {
        byte var2 = this.field4044.field2014[this.field4044.field2026];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4048[arg0] = var3;
            this.field4044.field2026++;
        } else {
            var3 = this.field4048[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1604(arg0, var3);
        }
        int var4 = this.field4044.method917(88);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4044.field2014[this.field4044.field2026] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4044.field2026++;
                this.field4048[arg0] = var5;
                return this.method1604(arg0, var5);
            }
        }
        this.field4044.field2026 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class232() {
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    public class232(byte[] arg0) {
        this.method1606(arg0);
    }
}
