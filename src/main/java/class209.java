import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class209 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lik;")
    private class247 field3662 = new class247((byte[]) null);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[B")
    private static byte[] field3661 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "J")
    private long field3665;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
    private int[] field3663;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[I")
    private int[] field3666;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
    public int[] field3667;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    private int[] field3669;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public static void method1427() {
        field3661 = null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()V")
    public final void method1428() {
        this.field3662.field4238 = null;
        this.field3669 = null;
        this.field3666 = null;
        this.field3667 = null;
        this.field3663 = null;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()I")
    public final int method1429() {
        int var1 = this.field3666.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3666[var4] >= 0 && this.field3667[var4] < var3) {
                var2 = var4;
                var3 = this.field3667[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public final void method1430(int arg0) {
        int var2 = this.field3662.method1705((byte) 69);
        this.field3667[arg0] += var2;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()Z")
    public final boolean method1431() {
        return this.field3662.field4238 != null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public final void method1432(int arg0) {
        this.field3662.field4224 = this.field3666[arg0];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
    private final int method1433(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3661[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3662.method1711((byte) -67) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3662.method1711((byte) -67) << 16;
            }
            return var8;
        }
        int var3 = this.field3662.method1711((byte) -67);
        int var4 = this.field3662.method1705((byte) 82);
        if (var3 == 47) {
            this.field3662.field4224 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3662.method1691(19388);
            var4 -= 3;
            int var6 = this.field3667[arg0];
            this.field3665 += (long) (this.field3668 - var5) * (long) var6;
            this.field3668 = var5;
            this.field3662.field4224 += var4;
            return 2;
        } else {
            this.field3662.field4224 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "()I")
    public final int method1434() {
        return this.field3666.length;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)J")
    public final long method1435(int arg0) {
        return (long) this.field3668 * (long) arg0 + this.field3665;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)I")
    public final int method1436(int arg0) {
        return this.method1440(arg0);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(J)V")
    public final void method1437(long arg0) {
        this.field3665 = arg0;
        int var3 = this.field3666.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3667[var4] = 0;
            this.field3663[var4] = 0;
            this.field3662.field4224 = this.field3669[var4];
            this.method1430(var4);
            this.field3666[var4] = this.field3662.field4224;
        }
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
    public final void method1438(int arg0) {
        this.field3666[arg0] = this.field3662.field4224;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([B)V")
    public final void method1439(byte[] arg0) {
        this.field3662.field4238 = arg0;
        this.field3662.field4224 = 10;
        int var2 = this.field3662.method1694((byte) -100);
        this.field3664 = this.field3662.method1694((byte) -100);
        this.field3668 = 500000;
        this.field3669 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3662.method1712(6357);
            int var6 = this.field3662.method1712(6357);
            if (var5 == 1297379947) {
                this.field3669[var3] = this.field3662.field4224;
                var3++;
            }
            this.field3662.field4224 += var6;
        }
        this.field3665 = 0L;
        this.field3666 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3666[var4] = this.field3669[var4];
        }
        this.field3667 = new int[var2];
        this.field3663 = new int[var2];
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)I")
    private final int method1440(int arg0) {
        byte var2 = this.field3662.field4238[this.field3662.field4224];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3663[arg0] = var3;
            this.field3662.field4224++;
        } else {
            var3 = this.field3663[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1433(arg0, var3);
        }
        int var4 = this.field3662.method1705((byte) 125);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3662.field4238[this.field3662.field4224] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3662.field4224++;
                this.field3663[arg0] = var5;
                return this.method1433(arg0, var5);
            }
        }
        this.field3662.field4224 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "()Z")
    public final boolean method1441() {
        int var1 = this.field3666.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3666[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "()V")
    public final void method1442() {
        this.field3662.field4224 = -1;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class209() {
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V")
    public class209(byte[] arg0) {
        this.method1439(arg0);
    }
}
