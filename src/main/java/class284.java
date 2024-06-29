import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class284 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lf;")
    private class37 field4477 = new class37((byte[]) null);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[B")
    private static byte[] field4479 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    private int field4483;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "J")
    private long field4485;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[I")
    private int[] field4480;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[I")
    private int[] field4481;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "[I")
    private int[] field4482;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
    public int[] field4484;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()Z")
    public final boolean method1902() {
        return this.field4477.field583 != null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
    public final int method1903() {
        return this.field4480.length;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)J")
    public final long method1904(int arg0) {
        return (long) this.field4483 * (long) arg0 + this.field4485;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()V")
    public final void method1905() {
        this.field4477.field583 = null;
        this.field4481 = null;
        this.field4480 = null;
        this.field4484 = null;
        this.field4482 = null;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "()V")
    public final void method1906() {
        this.field4477.field588 = -1;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)I")
    private final int method1907(int arg0) {
        byte var2 = this.field4477.field583[this.field4477.field588];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4482[arg0] = var3;
            this.field4477.field588++;
        } else {
            var3 = this.field4482[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1913(arg0, var3);
        }
        int var4 = this.field4477.method292(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4477.field583[this.field4477.field588] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4477.field588++;
                this.field4482[arg0] = var5;
                return this.method1913(arg0, var5);
            }
        }
        this.field4477.field588 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "()I")
    public final int method1908() {
        int var1 = this.field4480.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4480[var4] >= 0 && this.field4484[var4] < var3) {
                var2 = var4;
                var3 = this.field4484[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "()Z")
    public final boolean method1909() {
        int var1 = this.field4480.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4480[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)I")
    public final int method1910(int arg0) {
        return this.method1907(arg0);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public final void method1911(int arg0) {
        this.field4477.field588 = this.field4480[arg0];
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public final void method1912(int arg0) {
        this.field4480[arg0] = this.field4477.field588;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
    private final int method1913(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4479[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4477.method333((byte) -59) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4477.method333((byte) -59) << 16;
            }
            return var8;
        }
        int var3 = this.field4477.method333((byte) -59);
        int var4 = this.field4477.method292(true);
        if (var3 == 47) {
            this.field4477.field588 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4477.method336(23362);
            var4 -= 3;
            int var6 = this.field4484[arg0];
            this.field4485 += (long) (this.field4483 - var5) * (long) var6;
            this.field4483 = var5;
            this.field4477.field588 += var4;
            return 2;
        } else {
            this.field4477.field588 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "()V")
    public static void method1914() {
        field4479 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(J)V")
    public final void method1915(long arg0) {
        this.field4485 = arg0;
        int var3 = this.field4480.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4484[var4] = 0;
            this.field4482[var4] = 0;
            this.field4477.field588 = this.field4481[var4];
            this.method1916(var4);
            this.field4480[var4] = this.field4477.field588;
        }
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
    public final void method1916(int arg0) {
        int var2 = this.field4477.method292(true);
        this.field4484[arg0] += var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([B)V")
    public final void method1917(byte[] arg0) {
        this.field4477.field583 = arg0;
        this.field4477.field588 = 10;
        int var2 = this.field4477.method293(109);
        this.field4478 = this.field4477.method293(-23);
        this.field4483 = 500000;
        this.field4481 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4477.method307(-122);
            int var6 = this.field4477.method307(-120);
            if (var5 == 1297379947) {
                this.field4481[var3] = this.field4477.field588;
                var3++;
            }
            this.field4477.field588 += var6;
        }
        this.field4485 = 0L;
        this.field4480 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4480[var4] = this.field4481[var4];
        }
        this.field4484 = new int[var2];
        this.field4482 = new int[var2];
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class284() {
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "([B)V")
    public class284(byte[] arg0) {
        this.method1917(arg0);
    }
}
