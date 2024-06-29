import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class289 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lbj;")
    private class215 field4612 = new class215((byte[]) null);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[B")
    private static byte[] field4614 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    private int field4617;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "J")
    private long field4620;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    public int[] field4613;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
    private int[] field4615;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
    private int[] field4618;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
    private int[] field4619;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
    public final int method1929() {
        int var1 = this.field4619.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4619[var4] >= 0 && this.field4613[var4] < var3) {
                var2 = var4;
                var3 = this.field4613[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()I")
    public final int method1930() {
        return this.field4619.length;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public final void method1931(int arg0) {
        int var2 = this.field4612.method1395(127);
        this.field4613[arg0] += var2;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
    public final int method1932(int arg0) {
        return this.method1934(arg0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([B)V")
    public final void method1933(byte[] arg0) {
        this.field4612.field3287 = arg0;
        this.field4612.field3280 = 10;
        int var2 = this.field4612.method1379(-107);
        this.field4616 = this.field4612.method1379(-78);
        this.field4617 = 500000;
        this.field4618 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4612.method1383((byte) -76);
            int var6 = this.field4612.method1383((byte) 20);
            if (var5 == 1297379947) {
                this.field4618[var3] = this.field4612.field3280;
                var3++;
            }
            this.field4612.field3280 += var6;
        }
        this.field4620 = 0L;
        this.field4619 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4619[var4] = this.field4618[var4];
        }
        this.field4613 = new int[var2];
        this.field4615 = new int[var2];
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
    private final int method1934(int arg0) {
        byte var2 = this.field4612.field3287[this.field4612.field3280];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4615[arg0] = var3;
            this.field4612.field3280++;
        } else {
            var3 = this.field4615[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1936(arg0, var3);
        }
        int var4 = this.field4612.method1395(127);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4612.field3287[this.field4612.field3280] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4612.field3280++;
                this.field4615[arg0] = var5;
                return this.method1936(arg0, var5);
            }
        }
        this.field4612.field3280 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
    public static void method1935() {
        field4614 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
    private final int method1936(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4614[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4612.method1374((byte) -60) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4612.method1374((byte) -60) << 16;
            }
            return var8;
        }
        int var3 = this.field4612.method1374((byte) -60);
        int var4 = this.field4612.method1395(127);
        if (var3 == 47) {
            this.field4612.field3280 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4612.method1403(6591);
            var4 -= 3;
            int var6 = this.field4613[arg0];
            this.field4620 += (long) (this.field4617 - var5) * (long) var6;
            this.field4617 = var5;
            this.field4612.field3280 += var4;
            return 2;
        } else {
            this.field4612.field3280 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()V")
    public final void method1937() {
        this.field4612.field3287 = null;
        this.field4618 = null;
        this.field4619 = null;
        this.field4613 = null;
        this.field4615 = null;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()Z")
    public final boolean method1938() {
        return this.field4612.field3287 != null;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)J")
    public final long method1939(int arg0) {
        return (long) this.field4617 * (long) arg0 + this.field4620;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(J)V")
    public final void method1940(long arg0) {
        this.field4620 = arg0;
        int var3 = this.field4619.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4613[var4] = 0;
            this.field4615[var4] = 0;
            this.field4612.field3280 = this.field4618[var4];
            this.method1931(var4);
            this.field4619[var4] = this.field4612.field3280;
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public final void method1941(int arg0) {
        this.field4612.field3280 = this.field4619[arg0];
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "()V")
    public final void method1942() {
        this.field4612.field3280 = -1;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    public final void method1943(int arg0) {
        this.field4619[arg0] = this.field4612.field3280;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "()Z")
    public final boolean method1944() {
        int var1 = this.field4619.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4619[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class289() {
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([B)V")
    public class289(byte[] arg0) {
        this.method1933(arg0);
    }
}
