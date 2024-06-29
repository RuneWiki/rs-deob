import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lic;")
    private class59 field1733 = new class59(null);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[B")
    private static byte[] field1732 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "J")
    private long field1737;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    private int[] field1734;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    private int[] field1735;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    public int[] field1738;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[I")
    private int[] field1739;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
    private final int method581(int arg0) {
        byte var2 = this.field1733.field1495[this.field1733.field1485];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1734[arg0] = var3;
            this.field1733.field1485++;
        } else {
            var3 = this.field1734[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method582(arg0, var3);
        }
        int var4 = this.field1733.method494((byte) -22);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1733.field1495[this.field1733.field1485] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1733.field1485++;
                this.field1734[arg0] = var5;
                return this.method582(arg0, var5);
            }
        }
        this.field1733.field1485 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    private final int method582(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1732[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1733.method480(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1733.method480(0) << 16;
            }
            return var8;
        }
        int var3 = this.field1733.method480(0);
        int var4 = this.field1733.method494((byte) -22);
        if (var3 == 47) {
            this.field1733.field1485 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1733.method455(true);
            var4 -= 3;
            int var6 = this.field1738[arg0];
            this.field1737 += (long) (this.field1736 - var5) * (long) var6;
            this.field1736 = var5;
            this.field1733.field1485 += var4;
            return 2;
        } else {
            this.field1733.field1485 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()Z")
    public final boolean method583() {
        int var1 = this.field1735.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1735[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public final void method584(int arg0) {
        this.field1733.field1485 = this.field1735[arg0];
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)I")
    public final int method585(int arg0) {
        return this.method581(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([B)V")
    public final void method586(byte[] arg0) {
        this.field1733.field1495 = arg0;
        this.field1733.field1485 = 10;
        int var2 = this.field1733.method483((byte) 24);
        this.field1740 = this.field1733.method483((byte) 24);
        this.field1736 = 500000;
        this.field1739 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1733.method498((byte) 123);
            int var6 = this.field1733.method498((byte) 123);
            if (var5 == 1297379947) {
                this.field1739[var3] = this.field1733.field1485;
                var3++;
            }
            this.field1733.field1485 += var6;
        }
        this.field1737 = 0L;
        this.field1735 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1735[var4] = this.field1739[var4];
        }
        this.field1738 = new int[var2];
        this.field1734 = new int[var2];
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public final void method587(int arg0) {
        this.field1735[arg0] = this.field1733.field1485;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()Z")
    public final boolean method588() {
        return this.field1733.field1495 != null;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public final void method589(int arg0) {
        int var2 = this.field1733.method494((byte) -22);
        this.field1738[arg0] += var2;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()I")
    public final int method590() {
        return this.field1735.length;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()V")
    public final void method591() {
        this.field1733.field1495 = null;
        this.field1739 = null;
        this.field1735 = null;
        this.field1738 = null;
        this.field1734 = null;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()V")
    public static void method592() {
        field1732 = null;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "()I")
    public final int method593() {
        int var1 = this.field1735.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1735[var4] >= 0 && this.field1738[var4] < var3) {
                var2 = var4;
                var3 = this.field1738[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "()V")
    public final void method594() {
        this.field1733.field1485 = -1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(J)V")
    public final void method595(long arg0) {
        this.field1737 = arg0;
        int var3 = this.field1735.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1738[var4] = 0;
            this.field1734[var4] = 0;
            this.field1733.field1485 = this.field1739[var4];
            this.method589(var4);
            this.field1735[var4] = this.field1733.field1485;
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)J")
    public final long method596(int arg0) {
        return (long) this.field1736 * (long) arg0 + this.field1737;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class73() {
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V")
    public class73(byte[] arg0) {
        this.method586(arg0);
    }
}
