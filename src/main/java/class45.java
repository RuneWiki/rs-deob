import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class45 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lsi;")
    private class194 field973 = new class194((byte[]) null);

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[B")
    private static byte[] field978 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "J")
    private long field979;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    private int[] field974;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[I")
    public int[] field975;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[I")
    private int[] field976;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
    private int[] field977;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method274(int arg0) {
        this.field973.field3497 = this.field976[arg0];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
    public final void method275() {
        this.field973.field3497 = -1;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()Z")
    public final boolean method276() {
        int var1 = this.field976.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field976[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)J")
    public final long method277(int arg0) {
        return (long) this.field980 * (long) arg0 + this.field979;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()I")
    public final int method278() {
        return this.field976.length;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()I")
    public final int method279() {
        int var1 = this.field976.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field976[var4] >= 0 && this.field975[var4] < var3) {
                var2 = var4;
                var3 = this.field975[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
    public static void method280() {
        field978 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public final void method281(int arg0) {
        int var2 = this.field973.method1270(-86);
        this.field975[arg0] += var2;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public final void method282(int arg0) {
        this.field976[arg0] = this.field973.field3497;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([B)V")
    public final void method283(byte[] arg0) {
        this.field973.field3469 = arg0;
        this.field973.field3497 = 10;
        int var2 = this.field973.method1294((byte) 3);
        this.field981 = this.field973.method1294((byte) 3);
        this.field980 = 500000;
        this.field974 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field973.method1266(4);
            int var6 = this.field973.method1266(4);
            if (var5 == 1297379947) {
                this.field974[var3] = this.field973.field3497;
                var3++;
            }
            this.field973.field3497 += var6;
        }
        this.field979 = 0L;
        this.field976 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field976[var4] = this.field974[var4];
        }
        this.field975 = new int[var2];
        this.field977 = new int[var2];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    private final int method284(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field978[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field973.method1301(-8317) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field973.method1301(-8317) << 16;
            }
            return var8;
        }
        int var3 = this.field973.method1301(-8317);
        int var4 = this.field973.method1270(-51);
        if (var3 == 47) {
            this.field973.field3497 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field973.method1277((byte) -101);
            var4 -= 3;
            int var6 = this.field975[arg0];
            this.field979 += (long) (this.field980 - var5) * (long) var6;
            this.field980 = var5;
            this.field973.field3497 += var4;
            return 2;
        } else {
            this.field973.field3497 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I")
    private final int method285(int arg0) {
        byte var2 = this.field973.field3469[this.field973.field3497];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field977[arg0] = var3;
            this.field973.field3497++;
        } else {
            var3 = this.field977[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method284(arg0, var3);
        }
        int var4 = this.field973.method1270(-74);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field973.field3469[this.field973.field3497] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field973.field3497++;
                this.field977[arg0] = var5;
                return this.method284(arg0, var5);
            }
        }
        this.field973.field3497 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
    public final int method286(int arg0) {
        return this.method285(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "()Z")
    public final boolean method287() {
        return this.field973.field3469 != null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(J)V")
    public final void method288(long arg0) {
        this.field979 = arg0;
        int var3 = this.field976.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field975[var4] = 0;
            this.field977[var4] = 0;
            this.field973.field3497 = this.field974[var4];
            this.method281(var4);
            this.field976[var4] = this.field973.field3497;
        }
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "()V")
    public final void method289() {
        this.field973.field3469 = null;
        this.field974 = null;
        this.field976 = null;
        this.field975 = null;
        this.field977 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class45() {
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        this.method283(arg0);
    }
}
