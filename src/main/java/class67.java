import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class67 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lgb;")
    private class39 field1586 = new class39(null);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[B")
    private static byte[] field1585 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "J")
    private long field1592;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
    private int[] field1589;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public int[] field1590;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "[I")
    private int[] field1591;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    private int[] field1593;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()Z", line = 4)
    public final boolean method521() {
        int var1 = this.field1591.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1591[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 18)
    public final void method522(int arg0) {
        int var2 = this.field1586.method324((byte) 8);
        this.field1590[arg0] += var2;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)J", line = 22)
    public final long method523(int arg0) {
        return (long) this.field1588 * (long) arg0 + this.field1592;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()Z", line = 26)
    public final boolean method524() {
        return this.field1586.field957 < 0;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)I", line = 31)
    public final int method525(int arg0) {
        return this.method537(arg0);
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 37)
    public final void method526(int arg0) {
        this.field1586.field957 = this.field1591[arg0];
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()I", line = 41)
    public final int method527() {
        int var1 = this.field1591.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1591[var4] >= 0 && this.field1590[var4] < var3) {
                var2 = var4;
                var3 = this.field1590[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()V", line = 66)
    public static void method528() {
        field1585 = null;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()V", line = 69)
    public final void method529() {
        this.field1586.field957 = -1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(J)V", line = 72)
    public final void method530(long arg0) {
        this.field1592 = arg0;
        int var3 = this.field1591.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1590[var4] = 0;
            this.field1589[var4] = 0;
            this.field1586.field957 = this.field1593[var4];
            this.method522(var4);
            this.field1591[var4] = this.field1586.field957;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "()I", line = 92)
    public final int method531() {
        return this.field1591.length;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V", line = 95)
    public final void method532(int arg0) {
        this.field1591[arg0] = this.field1586.field957;
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "()Z", line = 98)
    public final boolean method533() {
        return this.field1586.field974 != null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I", line = 103)
    private final int method534(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1585[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1586.method330(-30864) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1586.method330(-30864) << 16;
            }
            return var8;
        }
        int var3 = this.field1586.method330(-30864);
        int var4 = this.field1586.method324((byte) 8);
        if (var3 == 47) {
            this.field1586.field957 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1586.method342(-4);
            var4 -= 3;
            int var6 = this.field1590[arg0];
            this.field1592 += (long) (this.field1588 - var5) * (long) var6;
            this.field1588 = var5;
            this.field1586.field957 += var4;
            return 2;
        } else {
            this.field1586.field957 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "()V", line = 145)
    public final void method535() {
        this.field1586.field974 = null;
        this.field1593 = null;
        this.field1591 = null;
        this.field1590 = null;
        this.field1589 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B)V", line = 163)
    public final void method536(byte[] arg0) {
        this.field1586.field974 = arg0;
        this.field1586.field957 = 10;
        int var2 = this.field1586.method343((byte) -6);
        this.field1587 = this.field1586.method343((byte) -6);
        this.field1588 = 500000;
        this.field1593 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1586.method322((byte) -118);
            int var5 = this.field1586.method322((byte) -118);
            if (var4 == 1297379947) {
                this.field1593[var3] = this.field1586.field957;
                var3++;
            }
            this.field1586.field957 += var5;
        }
        this.field1591 = (int[]) this.field1593.clone();
        this.field1590 = new int[var2];
        this.field1589 = new int[var2];
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)I", line = 218)
    private final int method537(int arg0) {
        byte var2 = this.field1586.field974[this.field1586.field957];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1589[arg0] = var3;
            this.field1586.field957++;
        } else {
            var3 = this.field1589[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method534(arg0, var3);
        }
        int var4 = this.field1586.method324((byte) 8);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1586.field974[this.field1586.field957] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1586.field957++;
                this.field1589[arg0] = var5;
                return this.method534(arg0, var5);
            }
        }
        this.field1586.field957 += var4;
        return 0;
    }
}
