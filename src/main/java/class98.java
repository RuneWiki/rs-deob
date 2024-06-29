import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class98 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lie;")
    private class32 field1754 = new class32((byte[]) null);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[B")
    private static byte[] field1755 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "J")
    private long field1760;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
    private int[] field1758;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[I")
    private int[] field1759;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[I")
    public int[] field1761;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    private int[] field1762;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
    private final int method741(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1755[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1754.method316((byte) -20) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1754.method316((byte) -119) << 16;
            }
            return var8;
        }
        int var3 = this.field1754.method316((byte) 121);
        int var4 = this.field1754.method301((byte) 72);
        if (var3 == 47) {
            this.field1754.field647 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1754.method313((byte) -80);
            var4 -= 3;
            int var6 = this.field1761[arg0];
            this.field1760 += (long) (this.field1756 - var5) * (long) var6;
            this.field1756 = var5;
            this.field1754.field647 += var4;
            return 2;
        } else {
            this.field1754.field647 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([B)V")
    public final void method742(byte[] arg0) {
        this.field1754.field644 = arg0;
        this.field1754.field647 = 10;
        int var2 = this.field1754.method339(-16777216);
        this.field1757 = this.field1754.method339(-16777216);
        this.field1756 = 500000;
        this.field1758 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1754.method319((byte) -18);
            int var6 = this.field1754.method319((byte) -18);
            if (var5 == 1297379947) {
                this.field1758[var3] = this.field1754.field647;
                var3++;
            }
            this.field1754.field647 += var6;
        }
        this.field1760 = 0L;
        this.field1762 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1762[var4] = this.field1758[var4];
        }
        this.field1761 = new int[var2];
        this.field1759 = new int[var2];
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V")
    public static void method743() {
        field1755 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method744(int arg0) {
        this.field1762[arg0] = this.field1754.field647;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "()Z")
    public final boolean method745() {
        return this.field1754.field644 != null;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "()I")
    public final int method746() {
        int var1 = this.field1762.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1762[var4] >= 0 && this.field1761[var4] < var3) {
                var2 = var4;
                var3 = this.field1761[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(J)V")
    public final void method747(long arg0) {
        this.field1760 = arg0;
        int var3 = this.field1762.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1761[var4] = 0;
            this.field1759[var4] = 0;
            this.field1754.field647 = this.field1758[var4];
            this.method755(var4);
            this.field1762[var4] = this.field1754.field647;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "()V")
    public final void method748() {
        this.field1754.field647 = -1;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public final void method749(int arg0) {
        this.field1754.field647 = this.field1762[arg0];
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)I")
    public final int method750(int arg0) {
        return this.method753(arg0);
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "()Z")
    public final boolean method751() {
        int var1 = this.field1762.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1762[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)J")
    public final long method752(int arg0) {
        return (long) this.field1756 * (long) arg0 + this.field1760;
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)I")
    private final int method753(int arg0) {
        byte var2 = this.field1754.field644[this.field1754.field647];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1759[arg0] = var3;
            this.field1754.field647++;
        } else {
            var3 = this.field1759[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method741(arg0, var3);
        }
        int var4 = this.field1754.method301((byte) 72);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1754.field644[this.field1754.field647] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1754.field647++;
                this.field1759[arg0] = var5;
                return this.method741(arg0, var5);
            }
        }
        this.field1754.field647 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "()I")
    public final int method754() {
        return this.field1762.length;
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
    public final void method755(int arg0) {
        int var2 = this.field1754.method301((byte) 72);
        this.field1761[arg0] += var2;
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "()V")
    public final void method756() {
        this.field1754.field644 = null;
        this.field1758 = null;
        this.field1762 = null;
        this.field1761 = null;
        this.field1759 = null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class98() {
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "([B)V")
    public class98(byte[] arg0) {
        this.method742(arg0);
    }
}
