import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class84 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lcea;")
    private class215 field1522 = new class215(null);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[B")
    private static byte[] field1521 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "J")
    private long field1525;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
    private int[] field1523;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    private int[] field1524;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
    public int[] field1526;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    private int[] field1527;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()Z")
    public final boolean method799() {
        int var1 = this.field1527.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1527[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    private final int method800(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1521[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1522.method1535(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1522.method1535(255) << 16;
            }
            return var8;
        }
        int var3 = this.field1522.method1535(255);
        int var4 = this.field1522.method1514((byte) 112);
        if (var3 == 47) {
            this.field1522.field3109 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1522.method1499(-1);
            var4 -= 3;
            int var6 = this.field1526[arg0];
            this.field1525 += (long) (this.field1529 - var5) * (long) var6;
            this.field1529 = var5;
            this.field1522.field3109 += var4;
            return 2;
        } else {
            this.field1522.field3109 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B)V")
    public final void method801(byte[] arg0) {
        this.field1522.field3066 = arg0;
        this.field1522.field3109 = 10;
        int var2 = this.field1522.method1478(842397944);
        this.field1528 = this.field1522.method1478(842397944);
        this.field1529 = 500000;
        this.field1524 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1522.method1533((byte) -126);
            int var6 = this.field1522.method1533((byte) -126);
            if (var5 == 1297379947) {
                this.field1524[var3] = this.field1522.field3109;
                var3++;
            }
            this.field1522.field3109 += var6;
        }
        this.field1525 = 0L;
        this.field1527 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1527[var4] = this.field1524[var4];
        }
        this.field1526 = new int[var2];
        this.field1523 = new int[var2];
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
    public final int method802() {
        return this.field1527.length;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(J)V")
    public final void method803(long arg0) {
        this.field1525 = arg0;
        int var3 = this.field1527.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1526[var4] = 0;
            this.field1523[var4] = 0;
            this.field1522.field3109 = this.field1524[var4];
            this.method804(var4);
            this.field1527[var4] = this.field1522.field3109;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method804(int arg0) {
        int var2 = this.field1522.method1514((byte) 98);
        this.field1526[arg0] += var2;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method805(int arg0) {
        this.field1527[arg0] = this.field1522.field3109;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
    public final void method806() {
        this.field1522.field3066 = null;
        this.field1524 = null;
        this.field1527 = null;
        this.field1526 = null;
        this.field1523 = null;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)J")
    public final long method807(int arg0) {
        return (long) this.field1529 * (long) arg0 + this.field1525;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
    private final int method808(int arg0) {
        byte var2 = this.field1522.field3066[this.field1522.field3109];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1523[arg0] = var3;
            this.field1522.field3109++;
        } else {
            var3 = this.field1523[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method800(arg0, var3);
        }
        int var4 = this.field1522.method1514((byte) 40);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1522.field3066[this.field1522.field3109] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1522.field3109++;
                this.field1523[arg0] = var5;
                return this.method800(arg0, var5);
            }
        }
        this.field1522.field3109 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()I")
    public final int method809() {
        int var1 = this.field1527.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1527[var4] >= 0 && this.field1526[var4] < var3) {
                var2 = var4;
                var3 = this.field1526[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "()Z")
    public final boolean method810() {
        return this.field1522.field3066 != null;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public final void method811(int arg0) {
        this.field1522.field3109 = this.field1527[arg0];
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "()V")
    public static void method812() {
        field1521 = null;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I")
    public final int method813(int arg0) {
        return this.method808(arg0);
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "()V")
    public final void method814() {
        this.field1522.field3109 = -1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
    public class84(byte[] arg0) {
        this.method801(arg0);
    }
}
