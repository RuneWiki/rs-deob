import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class94 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lji;")
    private class225 field1533 = new class225((byte[]) null);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[B")
    private static byte[] field1532 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "J")
    private long field1534;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    private int[] field1535;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    public int[] field1538;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
    private int[] field1540;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
    public final void method571(byte[] arg0) {
        this.field1533.field3995 = arg0;
        this.field1533.field3996 = 10;
        int var2 = this.field1533.method1593(true);
        this.field1539 = this.field1533.method1593(true);
        this.field1536 = 500000;
        this.field1540 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1533.method1562(21705);
            int var6 = this.field1533.method1562(21705);
            if (var5 == 1297379947) {
                this.field1540[var3] = this.field1533.field3996;
                var3++;
            }
            this.field1533.field3996 += var6;
        }
        this.field1534 = 0L;
        this.field1535 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1535[var4] = this.field1540[var4];
        }
        this.field1538 = new int[var2];
        this.field1537 = new int[var2];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()Z")
    public final boolean method572() {
        int var1 = this.field1535.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1535[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
    public static void method573() {
        field1532 = null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
    public final void method574() {
        this.field1533.field3995 = null;
        this.field1540 = null;
        this.field1535 = null;
        this.field1538 = null;
        this.field1537 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    private final int method575(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1532[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1533.method1580(-77) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1533.method1580(-8) << 16;
            }
            return var8;
        }
        int var3 = this.field1533.method1580(-12);
        int var4 = this.field1533.method1581(-1);
        if (var3 == 47) {
            this.field1533.field3996 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1533.method1591(2);
            var4 -= 3;
            int var6 = this.field1538[arg0];
            this.field1534 += (long) (this.field1536 - var5) * (long) var6;
            this.field1536 = var5;
            this.field1533.field3996 += var4;
            return 2;
        } else {
            this.field1533.field3996 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J")
    public final long method576(int arg0) {
        return (long) this.field1536 * (long) arg0 + this.field1534;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()I")
    public final int method577() {
        int var1 = this.field1535.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1535[var4] >= 0 && this.field1538[var4] < var3) {
                var2 = var4;
                var3 = this.field1538[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public final void method578(int arg0) {
        this.field1533.field3996 = this.field1535[arg0];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V")
    public final void method579(long arg0) {
        this.field1534 = arg0;
        int var3 = this.field1535.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1538[var4] = 0;
            this.field1537[var4] = 0;
            this.field1533.field3996 = this.field1540[var4];
            this.method586(var4);
            this.field1535[var4] = this.field1533.field3996;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method580(int arg0) {
        this.field1535[arg0] = this.field1533.field3996;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
    public final void method581() {
        this.field1533.field3996 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
    public final int method582() {
        return this.field1535.length;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()Z")
    public final boolean method583() {
        return this.field1533.field3995 != null;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
    public final int method584(int arg0) {
        return this.method585(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)I")
    private final int method585(int arg0) {
        byte var2 = this.field1533.field3995[this.field1533.field3996];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1537[arg0] = var3;
            this.field1533.field3996++;
        } else {
            var3 = this.field1537[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method575(arg0, var3);
        }
        int var4 = this.field1533.method1581(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1533.field3995[this.field1533.field3996] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1533.field3996++;
                this.field1537[arg0] = var5;
                return this.method575(arg0, var5);
            }
        }
        this.field1533.field3996 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public final void method586(int arg0) {
        int var2 = this.field1533.method1581(-1);
        this.field1538[arg0] += var2;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.method571(arg0);
    }
}
