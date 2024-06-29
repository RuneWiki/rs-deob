import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class140 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Les;")
    private class630 field1815 = new class630(null);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[B")
    private static byte[] field1814 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "J")
    private long field1821;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
    public int[] field1817;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[I")
    private int[] field1819;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
    private int[] field1820;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
    private int[] field1822;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()I", line = 5)
    public final int method808() {
        return this.field1820.length;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()I", line = 9)
    public final int method809() {
        int var1 = this.field1820.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1820[var4] >= 0 && this.field1817[var4] < var3) {
                var2 = var4;
                var3 = this.field1817[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 35)
    public final void method810(int arg0) {
        this.field1815.field8812 = this.field1820[arg0];
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()Z", line = 39)
    public final boolean method811() {
        return this.field1815.field8804 != null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I", line = 43)
    private final int method812(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1814[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1815.method3501(-9268) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1815.method3501(-9268) << 16;
            }
            return var8;
        }
        int var3 = this.field1815.method3501(-9268);
        int var4 = this.field1815.method3491(false);
        if (var3 == 47) {
            this.field1815.field8812 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1815.method3517(-1);
            var4 -= 3;
            int var6 = this.field1817[arg0];
            this.field1821 += (long) (this.field1818 - var5) * (long) var6;
            this.field1818 = var5;
            this.field1815.field8812 += var4;
            return 2;
        } else {
            this.field1815.field8812 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "()V", line = 88)
    public static void method813() {
        field1814 = null;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "()Z", line = 93)
    public final boolean method814() {
        int var1 = this.field1820.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1820[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 107)
    public final void method815(int arg0) {
        int var2 = this.field1815.method3491(false);
        this.field1817[arg0] += var2;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 111)
    public final void method816(int arg0) {
        this.field1820[arg0] = this.field1815.field8812;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)I", line = 115)
    private final int method817(int arg0) {
        byte var2 = this.field1815.field8804[this.field1815.field8812];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1819[arg0] = var3;
            this.field1815.field8812++;
        } else {
            var3 = this.field1819[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method812(arg0, var3);
        }
        int var4 = this.field1815.method3491(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1815.field8804[this.field1815.field8812] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1815.field8812++;
                this.field1819[arg0] = var5;
                return this.method812(arg0, var5);
            }
        }
        this.field1815.field8812 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "()V", line = 153)
    public final void method818() {
        this.field1815.field8804 = null;
        this.field1822 = null;
        this.field1820 = null;
        this.field1817 = null;
        this.field1819 = null;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)I", line = 163)
    public final int method819(int arg0) {
        return this.method817(arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([B)V", line = 169)
    public final void method820(byte[] arg0) {
        this.field1815.field8804 = arg0;
        this.field1815.field8812 = 10;
        int var2 = this.field1815.method3470(13111);
        this.field1816 = this.field1815.method3470(13111);
        this.field1818 = 500000;
        this.field1822 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1815.method3483(67);
            int var6 = this.field1815.method3483(70);
            if (var5 == 1297379947) {
                this.field1822[var3] = this.field1815.field8812;
                var3++;
            }
            this.field1815.field8812 += var6;
        }
        this.field1821 = 0L;
        this.field1820 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1820[var4] = this.field1822[var4];
        }
        this.field1817 = new int[var2];
        this.field1819 = new int[var2];
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(J)V", line = 222)
    public final void method821(long arg0) {
        this.field1821 = arg0;
        int var3 = this.field1820.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1817[var4] = 0;
            this.field1819[var4] = 0;
            this.field1815.field8812 = this.field1822[var4];
            this.method815(var4);
            this.field1820[var4] = this.field1815.field8812;
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)J", line = 241)
    public final long method822(int arg0) {
        return (long) this.field1818 * (long) arg0 + this.field1821;
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "()V", line = 244)
    public final void method823() {
        this.field1815.field8812 = -1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 264)
    public class140() {
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "([B)V", line = 266)
    public class140(byte[] arg0) {
        this.method820(arg0);
    }
}
