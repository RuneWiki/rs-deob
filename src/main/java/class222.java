import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class222 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lh;")
    private class190 field4029 = new class190((byte[]) null);

    @OriginalMember(owner = "client!t", name = "h", descriptor = "[B")
    private static byte[] field4036 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "J")
    private long field4034;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    private int[] field4030;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
    private int[] field4032;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    public int[] field4033;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[I")
    private int[] field4035;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()Z")
    public final boolean method1518() {
        int var1 = this.field4035.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4035[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I")
    public final int method1519(int arg0) {
        return this.method1525(arg0);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public final void method1520() {
        this.field4029.field3487 = -1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public final void method1521(int arg0) {
        int var2 = this.field4029.method1232((byte) 93);
        this.field4033[arg0] += var2;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public final void method1522(int arg0) {
        this.field4035[arg0] = this.field4029.field3487;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final int method1523() {
        return this.field4035.length;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B)V")
    public final void method1524(byte[] arg0) {
        this.field4029.field3465 = arg0;
        this.field4029.field3487 = 10;
        int var2 = this.field4029.method1275(128);
        this.field4037 = this.field4029.method1275(128);
        this.field4031 = 500000;
        this.field4032 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4029.method1269(118);
            int var6 = this.field4029.method1269(109);
            if (var5 == 1297379947) {
                this.field4032[var3] = this.field4029.field3487;
                var3++;
            }
            this.field4029.field3487 += var6;
        }
        this.field4034 = 0L;
        this.field4035 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4035[var4] = this.field4032[var4];
        }
        this.field4033 = new int[var2];
        this.field4030 = new int[var2];
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)I")
    private final int method1525(int arg0) {
        byte var2 = this.field4029.field3465[this.field4029.field3487];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4030[arg0] = var3;
            this.field4029.field3487++;
        } else {
            var3 = this.field4030[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1527(arg0, var3);
        }
        int var4 = this.field4029.method1232((byte) 126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4029.field3465[this.field4029.field3487] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4029.field3487++;
                this.field4030[arg0] = var5;
                return this.method1527(arg0, var5);
            }
        }
        this.field4029.field3487 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public final void method1526(int arg0) {
        this.field4029.field3487 = this.field4035[arg0];
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
    private final int method1527(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4036[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4029.method1265(123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4029.method1265(113) << 16;
            }
            return var8;
        }
        int var3 = this.field4029.method1265(116);
        int var4 = this.field4029.method1232((byte) 98);
        if (var3 == 47) {
            this.field4029.field3487 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4029.method1282(111);
            var4 -= 3;
            int var6 = this.field4033[arg0];
            this.field4034 += (long) (this.field4031 - var5) * (long) var6;
            this.field4031 = var5;
            this.field4029.field3487 += var4;
            return 2;
        } else {
            this.field4029.field3487 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)J")
    public final long method1528(int arg0) {
        return (long) this.field4031 * (long) arg0 + this.field4034;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(J)V")
    public final void method1529(long arg0) {
        this.field4034 = arg0;
        int var3 = this.field4035.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4033[var4] = 0;
            this.field4030[var4] = 0;
            this.field4029.field3487 = this.field4032[var4];
            this.method1521(var4);
            this.field4035[var4] = this.field4029.field3487;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()Z")
    public final boolean method1530() {
        return this.field4029.field3465 != null;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()V")
    public static void method1531() {
        field4036 = null;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "()V")
    public final void method1532() {
        this.field4029.field3465 = null;
        this.field4032 = null;
        this.field4035 = null;
        this.field4033 = null;
        this.field4030 = null;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "()I")
    public final int method1533() {
        int var1 = this.field4035.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4035[var4] >= 0 && this.field4033[var4] < var3) {
                var2 = var4;
                var3 = this.field4033[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class222() {
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([B)V")
    public class222(byte[] arg0) {
        this.method1524(arg0);
    }
}
