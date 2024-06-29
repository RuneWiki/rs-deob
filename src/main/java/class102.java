import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class102 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lka;")
    private class61 field2618 = new class61(null);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "[B")
    private static byte[] field2619 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    private int field2625;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "J")
    private long field2621;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    private int[] field2620;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public int[] field2622;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
    private int[] field2623;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    private int[] field2624;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)J", line = 4)
    public final long method840(int arg0) {
        return (long) this.field2625 * (long) arg0 + this.field2621;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 8)
    public final void method841(int arg0) {
        this.field2618.field1556 = this.field2623[arg0];
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)I", line = 12)
    public final int method842(int arg0) {
        return this.method853(arg0);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V", line = 22)
    public final void method843(int arg0) {
        this.field2623[arg0] = this.field2618.field1556;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()I", line = 25)
    public final int method844() {
        return this.field2623.length;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([B)V", line = 28)
    public final void method845(byte[] arg0) {
        this.field2618.field1577 = arg0;
        this.field2618.field1556 = 10;
        int var2 = this.field2618.method507((byte) -101);
        this.field2626 = this.field2618.method507((byte) -40);
        this.field2625 = 500000;
        this.field2620 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2618.method496((byte) 122);
            int var5 = this.field2618.method496((byte) 122);
            if (var4 == 1297379947) {
                this.field2620[var3] = this.field2618.field1556;
                var3++;
            }
            this.field2618.field1556 += var5;
        }
        this.field2623 = (int[]) this.field2620.clone();
        this.field2622 = new int[var2];
        this.field2624 = new int[var2];
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V", line = 73)
    public final void method846() {
        this.field2618.field1577 = null;
        this.field2620 = null;
        this.field2623 = null;
        this.field2622 = null;
        this.field2624 = null;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z", line = 83)
    public final boolean method847() {
        int var1 = this.field2623.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2623[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V", line = 96)
    public static void method848() {
        field2619 = null;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Z", line = 99)
    public final boolean method849() {
        return this.field2618.field1556 < 0;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z", line = 102)
    public final boolean method850() {
        return this.field2618.field1577 != null;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()I", line = 109)
    public final int method851() {
        int var1 = this.field2623.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2623[var4] >= 0 && this.field2622[var4] < var3) {
                var2 = var4;
                var3 = this.field2622[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I", line = 135)
    private final int method852(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2619[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2618.method494(20471) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2618.method494(20471) << 16;
            }
            return var8;
        }
        int var3 = this.field2618.method494(20471);
        int var4 = this.field2618.method531((byte) -108);
        if (var3 == 47) {
            this.field2618.field1556 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2618.method510(-64);
            var4 -= 3;
            int var6 = this.field2622[arg0];
            this.field2621 += (long) (this.field2625 - var5) * (long) var6;
            this.field2625 = var5;
            this.field2618.field1556 += var4;
            return 2;
        } else {
            this.field2618.field1556 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I", line = 189)
    private final int method853(int arg0) {
        byte var2 = this.field2618.field1577[this.field2618.field1556];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2624[arg0] = var3;
            this.field2618.field1556++;
        } else {
            var3 = this.field2624[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method852(arg0, var3);
        }
        int var4 = this.field2618.method531((byte) -75);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2618.field1577[this.field2618.field1556] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2618.field1556++;
                this.field2624[arg0] = var5;
                return this.method852(arg0, var5);
            }
        }
        this.field2618.field1556 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()V", line = 229)
    public final void method854() {
        this.field2618.field1556 = -1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(J)V", line = 232)
    public final void method855(long arg0) {
        this.field2621 = arg0;
        int var3 = this.field2623.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2622[var4] = 0;
            this.field2624[var4] = 0;
            this.field2618.field1556 = this.field2620[var4];
            this.method856(var4);
            this.field2623[var4] = this.field2618.field1556;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V", line = 253)
    public final void method856(int arg0) {
        int var2 = this.field2618.method531((byte) -118);
        this.field2622[arg0] += var2;
    }
}
