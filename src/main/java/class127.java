import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class127 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Llj;")
    private class216 field2277 = new class216((byte[]) null);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[B")
    private static byte[] field2278 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    private int field2284;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "J")
    private long field2281;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    private int[] field2280;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    private int[] field2282;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    private int[] field2283;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[I")
    public int[] field2285;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
    private final int method937(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2278[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2277.method1446(5350) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2277.method1446(5350) << 16;
            }
            return var8;
        }
        int var3 = this.field2277.method1446(5350);
        int var4 = this.field2277.method1465((byte) 83);
        if (var3 == 47) {
            this.field2277.field3728 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2277.method1448(26420);
            var4 -= 3;
            int var6 = this.field2285[arg0];
            this.field2281 += (long) (this.field2284 - var5) * (long) var6;
            this.field2284 = var5;
            this.field2277.field3728 += var4;
            return 2;
        } else {
            this.field2277.field3728 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(J)V")
    public final void method938(long arg0) {
        this.field2281 = arg0;
        int var3 = this.field2282.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2285[var4] = 0;
            this.field2283[var4] = 0;
            this.field2277.field3728 = this.field2280[var4];
            this.method946(var4);
            this.field2282[var4] = this.field2277.field3728;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)J")
    public final long method939(int arg0) {
        return (long) this.field2284 * (long) arg0 + this.field2281;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V")
    public final void method940(byte[] arg0) {
        this.field2277.field3706 = arg0;
        this.field2277.field3728 = 10;
        int var2 = this.field2277.method1487(123);
        this.field2279 = this.field2277.method1487(93);
        this.field2284 = 500000;
        this.field2280 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2277.method1442(-1330139880);
            int var6 = this.field2277.method1442(-1330139880);
            if (var5 == 1297379947) {
                this.field2280[var3] = this.field2277.field3728;
                var3++;
            }
            this.field2277.field3728 += var6;
        }
        this.field2281 = 0L;
        this.field2282 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2282[var4] = this.field2280[var4];
        }
        this.field2285 = new int[var2];
        this.field2283 = new int[var2];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
    public final boolean method941() {
        return this.field2277.field3706 != null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
    public final int method942(int arg0) {
        return this.method951(arg0);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()Z")
    public final boolean method943() {
        int var1 = this.field2282.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2282[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public final void method944() {
        this.field2277.field3728 = -1;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
    public final void method945() {
        this.field2277.field3706 = null;
        this.field2280 = null;
        this.field2282 = null;
        this.field2285 = null;
        this.field2283 = null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public final void method946(int arg0) {
        int var2 = this.field2277.method1465((byte) 119);
        this.field2285[arg0] += var2;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()I")
    public final int method947() {
        return this.field2282.length;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()V")
    public static void method948() {
        field2278 = null;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()I")
    public final int method949() {
        int var1 = this.field2282.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2282[var4] >= 0 && this.field2285[var4] < var3) {
                var2 = var4;
                var3 = this.field2285[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public final void method950(int arg0) {
        this.field2277.field3728 = this.field2282[arg0];
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
    private final int method951(int arg0) {
        byte var2 = this.field2277.field3706[this.field2277.field3728];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2283[arg0] = var3;
            this.field2277.field3728++;
        } else {
            var3 = this.field2283[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method937(arg0, var3);
        }
        int var4 = this.field2277.method1465((byte) 80);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2277.field3706[this.field2277.field3728] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2277.field3728++;
                this.field2283[arg0] = var5;
                return this.method937(arg0, var5);
            }
        }
        this.field2277.field3728 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
    public final void method952(int arg0) {
        this.field2282[arg0] = this.field2277.field3728;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    public class127(byte[] arg0) {
        this.method940(arg0);
    }
}
