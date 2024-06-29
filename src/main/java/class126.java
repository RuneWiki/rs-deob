import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class126 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lkl;")
    private class114 field1812 = new class114((byte[]) null);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[B")
    private static byte[] field1813 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "J")
    private long field1814;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
    public int[] field1816;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
    private int[] field1817;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
    private int[] field1818;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
    private int[] field1819;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public final void method840() {
        this.field1812.field1629 = null;
        this.field1817 = null;
        this.field1818 = null;
        this.field1816 = null;
        this.field1819 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(J)V")
    public final void method841(long arg0) {
        this.field1814 = arg0;
        int var3 = this.field1818.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1816[var4] = 0;
            this.field1819[var4] = 0;
            this.field1812.field1673 = this.field1817[var4];
            this.method853(var4);
            this.field1818[var4] = this.field1812.field1673;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public final void method842(int arg0) {
        this.field1812.field1673 = this.field1818[arg0];
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)J")
    public final long method843(int arg0) {
        return (long) this.field1815 * (long) arg0 + this.field1814;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
    public final int method844(int arg0) {
        return this.method847(arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B)V")
    public final void method845(byte[] arg0) {
        this.field1812.field1629 = arg0;
        this.field1812.field1673 = 10;
        int var2 = this.field1812.method756(-29901);
        this.field1820 = this.field1812.method756(-29901);
        this.field1815 = 500000;
        this.field1817 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1812.method759((byte) 99);
            int var6 = this.field1812.method759((byte) 124);
            if (var5 == 1297379947) {
                this.field1817[var3] = this.field1812.field1673;
                var3++;
            }
            this.field1812.field1673 += var6;
        }
        this.field1814 = 0L;
        this.field1818 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1818[var4] = this.field1817[var4];
        }
        this.field1816 = new int[var2];
        this.field1819 = new int[var2];
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()Z")
    public final boolean method846() {
        return this.field1812.field1629 != null;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)I")
    private final int method847(int arg0) {
        byte var2 = this.field1812.field1629[this.field1812.field1673];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1819[arg0] = var3;
            this.field1812.field1673++;
        } else {
            var3 = this.field1819[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method849(arg0, var3);
        }
        int var4 = this.field1812.method780((byte) -70);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1812.field1629[this.field1812.field1673] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1812.field1673++;
                this.field1819[arg0] = var5;
                return this.method849(arg0, var5);
            }
        }
        this.field1812.field1673 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
    public final int method848() {
        int var1 = this.field1818.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1818[var4] >= 0 && this.field1816[var4] < var3) {
                var2 = var4;
                var3 = this.field1816[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
    private final int method849(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1813[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1812.method760(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1812.method760(false) << 16;
            }
            return var8;
        }
        int var3 = this.field1812.method760(false);
        int var4 = this.field1812.method780((byte) -60);
        if (var3 == 47) {
            this.field1812.field1673 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1812.method779(16711680);
            var4 -= 3;
            int var6 = this.field1816[arg0];
            this.field1814 += (long) (this.field1815 - var5) * (long) var6;
            this.field1815 = var5;
            this.field1812.field1673 += var4;
            return 2;
        } else {
            this.field1812.field1673 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
    public final void method850() {
        this.field1812.field1673 = -1;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()Z")
    public final boolean method851() {
        int var1 = this.field1818.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1818[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public final void method852(int arg0) {
        this.field1818[arg0] = this.field1812.field1673;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public final void method853(int arg0) {
        int var2 = this.field1812.method780((byte) -114);
        this.field1816[arg0] += var2;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "()V")
    public static void method854() {
        field1813 = null;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "()I")
    public final int method855() {
        return this.field1818.length;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class126() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    public class126(byte[] arg0) {
        this.method845(arg0);
    }
}
