import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class124 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lp;")
    private class56 field1758 = new class56(null);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[B")
    private static byte[] field1759 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "J")
    private long field1762;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
    private int[] field1760;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
    private int[] field1763;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[I")
    public int[] field1765;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[I")
    private int[] field1766;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)J")
    public final long method755(int arg0) {
        return (long) this.field1761 * (long) arg0 + this.field1762;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public static void method756() {
        field1759 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
    private final int method757(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1759[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1758.method367(1) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1758.method367(1) << 16;
            }
            return var8;
        }
        int var3 = this.field1758.method367(1);
        int var4 = this.field1758.method351(23);
        if (var3 == 47) {
            this.field1758.field699 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1758.method328(-1974);
            var4 -= 3;
            int var6 = this.field1765[arg0];
            this.field1762 += (long) (this.field1761 - var5) * (long) var6;
            this.field1761 = var5;
            this.field1758.field699 += var4;
            return 2;
        } else {
            this.field1758.field699 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method758(int arg0) {
        this.field1758.field699 = this.field1760[arg0];
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()Z")
    public final boolean method759() {
        return this.field1758.field693 != null;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
    public final void method760() {
        this.field1758.field699 = -1;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
    public final int method761() {
        return this.field1760.length;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "()Z")
    public final boolean method762() {
        int var1 = this.field1760.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1760[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "()I")
    public final int method763() {
        int var1 = this.field1760.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1760[var4] >= 0 && this.field1765[var4] < var3) {
                var2 = var4;
                var3 = this.field1765[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([B)V")
    public final void method764(byte[] arg0) {
        this.field1758.field693 = arg0;
        this.field1758.field699 = 10;
        int var2 = this.field1758.method318(true);
        this.field1764 = this.field1758.method318(true);
        this.field1761 = 500000;
        this.field1763 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1758.method311(0);
            int var6 = this.field1758.method311(0);
            if (var5 == 1297379947) {
                this.field1763[var3] = this.field1758.field699;
                var3++;
            }
            this.field1758.field699 += var6;
        }
        this.field1762 = 0L;
        this.field1760 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1760[var4] = this.field1763[var4];
        }
        this.field1765 = new int[var2];
        this.field1766 = new int[var2];
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public final void method765(int arg0) {
        int var2 = this.field1758.method351(-105);
        this.field1765[arg0] += var2;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)I")
    public final int method766(int arg0) {
        return this.method768(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(J)V")
    public final void method767(long arg0) {
        this.field1762 = arg0;
        int var3 = this.field1760.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1765[var4] = 0;
            this.field1766[var4] = 0;
            this.field1758.field699 = this.field1763[var4];
            this.method765(var4);
            this.field1760[var4] = this.field1758.field699;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)I")
    private final int method768(int arg0) {
        byte var2 = this.field1758.field693[this.field1758.field699];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1766[arg0] = var3;
            this.field1758.field699++;
        } else {
            var3 = this.field1766[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method757(arg0, var3);
        }
        int var4 = this.field1758.method351(-122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1758.field693[this.field1758.field699] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1758.field699++;
                this.field1766[arg0] = var5;
                return this.method757(arg0, var5);
            }
        }
        this.field1758.field699 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public final void method769(int arg0) {
        this.field1760[arg0] = this.field1758.field699;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "()V")
    public final void method770() {
        this.field1758.field693 = null;
        this.field1763 = null;
        this.field1760 = null;
        this.field1765 = null;
        this.field1766 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class124() {
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V")
    public class124(byte[] arg0) {
        this.method764(arg0);
    }
}
