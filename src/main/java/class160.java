import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class160 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Liaa;")
    private class452 field1891 = new class452(null);

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "[B")
    private static byte[] field1893 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "J")
    private long field1895;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "[I")
    private int[] field1892;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "[I")
    public int[] field1894;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "[I")
    private int[] field1897;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "[I")
    private int[] field1899;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(J)V")
    public final void method958(long arg0) {
        this.field1895 = arg0;
        int var3 = this.field1892.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1894[var4] = 0;
            this.field1897[var4] = 0;
            this.field1891.field6215 = this.field1899[var4];
            this.method973(var4);
            this.field1892[var4] = this.field1891.field6215;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
    public final void method959() {
        this.field1891.field6215 = -1;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public final void method960(int arg0) {
        this.field1891.field6215 = this.field1892[arg0];
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "()V")
    public static void method961() {
        field1893 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "([B)V")
    public final void method962(byte[] arg0) {
        this.field1891.field6209 = arg0;
        this.field1891.field6215 = 10;
        int var2 = this.field1891.method2574(-1758460248);
        this.field1896 = this.field1891.method2574(-1758460248);
        this.field1898 = 500000;
        this.field1899 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1891.method2575((byte) -48);
            int var6 = this.field1891.method2575((byte) -48);
            if (var5 == 1297379947) {
                this.field1899[var3] = this.field1891.field6215;
                var3++;
            }
            this.field1891.field6215 += var6;
        }
        this.field1895 = 0L;
        this.field1892 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1892[var4] = this.field1899[var4];
        }
        this.field1894 = new int[var2];
        this.field1897 = new int[var2];
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "()V")
    public final void method963() {
        this.field1891.field6209 = null;
        this.field1899 = null;
        this.field1892 = null;
        this.field1894 = null;
        this.field1897 = null;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)J")
    public final long method964(int arg0) {
        return (long) this.field1898 * (long) arg0 + this.field1895;
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)I")
    public final int method965(int arg0) {
        return this.method969(arg0);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
    private final int method966(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1893[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1891.method2541(84) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1891.method2541(51) << 16;
            }
            return var8;
        }
        int var3 = this.field1891.method2541(113);
        int var4 = this.field1891.method2556(17);
        if (var3 == 47) {
            this.field1891.field6215 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1891.method2524(3);
            var4 -= 3;
            int var6 = this.field1894[arg0];
            this.field1895 += (long) (this.field1898 - var5) * (long) var6;
            this.field1898 = var5;
            this.field1891.field6215 += var4;
            return 2;
        } else {
            this.field1891.field6215 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "()I")
    public final int method967() {
        int var1 = this.field1892.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1892[var4] >= 0 && this.field1894[var4] < var3) {
                var2 = var4;
                var3 = this.field1894[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "()Z")
    public final boolean method968() {
        return this.field1891.field6209 != null;
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)I")
    private final int method969(int arg0) {
        byte var2 = this.field1891.field6209[this.field1891.field6215];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1897[arg0] = var3;
            this.field1891.field6215++;
        } else {
            var3 = this.field1897[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method966(arg0, var3);
        }
        int var4 = this.field1891.method2556(22);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1891.field6209[this.field1891.field6215] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1891.field6215++;
                this.field1897[arg0] = var5;
                return this.method966(arg0, var5);
            }
        }
        this.field1891.field6215 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)V")
    public final void method970(int arg0) {
        this.field1892[arg0] = this.field1891.field6215;
    }

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "()I")
    public final int method971() {
        return this.field1892.length;
    }

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "()Z")
    public final boolean method972() {
        int var1 = this.field1892.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1892[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "(I)V")
    public final void method973(int arg0) {
        int var2 = this.field1891.method2556(70);
        this.field1894[arg0] += var2;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
    public class160() {
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "([B)V")
    public class160(byte[] arg0) {
        this.method962(arg0);
    }
}
