import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class98 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lab;")
    private class249 field1575 = new class249((byte[]) null);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[B")
    private static byte[] field1576 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "J")
    private long field1582;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "[I")
    private int[] field1577;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public int[] field1579;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
    private int[] field1581;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[I")
    private int[] field1583;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public final int method686(int arg0) {
        return this.method691(arg0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()Z")
    public final boolean method687() {
        return this.field1575.field4182 != null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method688(int arg0) {
        this.field1575.field4160 = this.field1577[arg0];
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()Z")
    public final boolean method689() {
        int var1 = this.field1577.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1577[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([B)V")
    public final void method690(byte[] arg0) {
        this.field1575.field4182 = arg0;
        this.field1575.field4160 = 10;
        int var2 = this.field1575.method1821((byte) 51);
        this.field1578 = this.field1575.method1821((byte) 51);
        this.field1580 = 500000;
        this.field1581 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1575.method1800(-119);
            int var6 = this.field1575.method1800(86);
            if (var5 == 1297379947) {
                this.field1581[var3] = this.field1575.field4160;
                var3++;
            }
            this.field1575.field4160 += var6;
        }
        this.field1582 = 0L;
        this.field1577 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1577[var4] = this.field1581[var4];
        }
        this.field1579 = new int[var2];
        this.field1583 = new int[var2];
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
    private final int method691(int arg0) {
        byte var2 = this.field1575.field4182[this.field1575.field4160];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1583[arg0] = var3;
            this.field1575.field4160++;
        } else {
            var3 = this.field1583[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method693(arg0, var3);
        }
        int var4 = this.field1575.method1772((byte) 70);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1575.field4182[this.field1575.field4160] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1575.field4160++;
                this.field1583[arg0] = var5;
                return this.method693(arg0, var5);
            }
        }
        this.field1575.field4160 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "()I")
    public final int method692() {
        return this.field1577.length;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
    private final int method693(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1576[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1575.method1802((byte) 66) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1575.method1802((byte) 77) << 16;
            }
            return var8;
        }
        int var3 = this.field1575.method1802((byte) -121);
        int var4 = this.field1575.method1772((byte) 110);
        if (var3 == 47) {
            this.field1575.field4160 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1575.method1812((byte) 52);
            var4 -= 3;
            int var6 = this.field1579[arg0];
            this.field1582 += (long) (this.field1580 - var5) * (long) var6;
            this.field1580 = var5;
            this.field1575.field4160 += var4;
            return 2;
        } else {
            this.field1575.field4160 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public final void method694(int arg0) {
        this.field1577[arg0] = this.field1575.field4160;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "()I")
    public final int method695() {
        int var1 = this.field1577.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1577[var4] >= 0 && this.field1579[var4] < var3) {
                var2 = var4;
                var3 = this.field1579[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)J")
    public final long method696(int arg0) {
        return (long) this.field1580 * (long) arg0 + this.field1582;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
    public final void method697(int arg0) {
        int var2 = this.field1575.method1772((byte) 32);
        this.field1579[arg0] += var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(J)V")
    public final void method698(long arg0) {
        this.field1582 = arg0;
        int var3 = this.field1577.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1579[var4] = 0;
            this.field1583[var4] = 0;
            this.field1575.field4160 = this.field1581[var4];
            this.method697(var4);
            this.field1577[var4] = this.field1575.field4160;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "()V")
    public final void method699() {
        this.field1575.field4160 = -1;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "()V")
    public static void method700() {
        field1576 = null;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "()V")
    public final void method701() {
        this.field1575.field4182 = null;
        this.field1581 = null;
        this.field1577 = null;
        this.field1579 = null;
        this.field1583 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class98() {
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V")
    public class98(byte[] arg0) {
        this.method690(arg0);
    }
}
