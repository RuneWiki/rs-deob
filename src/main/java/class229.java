import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class229 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lwm;")
    private class403 field3380 = new class403(null);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[B")
    private static byte[] field3379 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field3387;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "J")
    private long field3386;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[I")
    private int[] field3381;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    public int[] field3382;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
    private int[] field3384;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
    private int[] field3385;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
    public final int method1411(int arg0) {
        return this.method1422(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(J)V")
    public final void method1412(long arg0) {
        this.field3386 = arg0;
        int var3 = this.field3385.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3382[var4] = 0;
            this.field3381[var4] = 0;
            this.field3380.field5665 = this.field3384[var4];
            this.method1418(var4);
            this.field3385[var4] = this.field3380.field5665;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()I")
    public final int method1413() {
        return this.field3385.length;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    private final int method1414(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3379[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3380.method2357((byte) 123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3380.method2357((byte) 113) << 16;
            }
            return var8;
        }
        int var3 = this.field3380.method2357((byte) 107);
        int var4 = this.field3380.method2320((byte) -81);
        if (var3 == 47) {
            this.field3380.field5665 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3380.method2323((byte) 100);
            var4 -= 3;
            int var6 = this.field3382[arg0];
            this.field3386 += (long) (this.field3387 - var5) * (long) var6;
            this.field3387 = var5;
            this.field3380.field5665 += var4;
            return 2;
        } else {
            this.field3380.field5665 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([B)V")
    public final void method1415(byte[] arg0) {
        this.field3380.field5663 = arg0;
        this.field3380.field5665 = 10;
        int var2 = this.field3380.method2338(0);
        this.field3383 = this.field3380.method2338(0);
        this.field3387 = 500000;
        this.field3384 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3380.method2319((byte) 83);
            int var6 = this.field3380.method2319((byte) 92);
            if (var5 == 1297379947) {
                this.field3384[var3] = this.field3380.field5665;
                var3++;
            }
            this.field3380.field5665 += var6;
        }
        this.field3386 = 0L;
        this.field3385 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3385[var4] = this.field3384[var4];
        }
        this.field3382 = new int[var2];
        this.field3381 = new int[var2];
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)J")
    public final long method1416(int arg0) {
        return (long) this.field3387 * (long) arg0 + this.field3386;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()I")
    public final int method1417() {
        int var1 = this.field3385.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3385[var4] >= 0 && this.field3382[var4] < var3) {
                var2 = var4;
                var3 = this.field3382[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final void method1418(int arg0) {
        int var2 = this.field3380.method2320((byte) -41);
        this.field3382[arg0] += var2;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()V")
    public final void method1419() {
        this.field3380.field5663 = null;
        this.field3384 = null;
        this.field3385 = null;
        this.field3382 = null;
        this.field3381 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()Z")
    public final boolean method1420() {
        int var1 = this.field3385.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3385[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z")
    public final boolean method1421() {
        return this.field3380.field5663 != null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    private final int method1422(int arg0) {
        byte var2 = this.field3380.field5663[this.field3380.field5665];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3381[arg0] = var3;
            this.field3380.field5665++;
        } else {
            var3 = this.field3381[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1414(arg0, var3);
        }
        int var4 = this.field3380.method2320((byte) -81);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3380.field5663[this.field3380.field5665] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3380.field5665++;
                this.field3381[arg0] = var5;
                return this.method1414(arg0, var5);
            }
        }
        this.field3380.field5665 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public final void method1423(int arg0) {
        this.field3385[arg0] = this.field3380.field5665;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()V")
    public static void method1424() {
        field3379 = null;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "()V")
    public final void method1425() {
        this.field3380.field5665 = -1;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public final void method1426(int arg0) {
        this.field3380.field5665 = this.field3385[arg0];
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class229() {
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
    public class229(byte[] arg0) {
        this.method1415(arg0);
    }
}
