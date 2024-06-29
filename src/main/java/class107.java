import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lrm;")
    private class249 field1844 = new class249((byte[]) null);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[B")
    private static byte[] field1843 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "J")
    private long field1849;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    private int[] field1845;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[I")
    private int[] field1846;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
    public int[] field1848;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[I")
    private int[] field1850;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 3)
    public final void method727(int arg0) {
        this.field1850[arg0] = this.field1844.field4314;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()I", line = 10)
    public final int method728() {
        return this.field1850.length;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()Z", line = 16)
    public final boolean method729() {
        int var1 = this.field1850.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1850[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 32)
    public final void method730(int arg0) {
        int var2 = this.field1844.method1727(true);
        this.field1848[arg0] += var2;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()V", line = 36)
    public static void method731() {
        field1843 = null;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)I", line = 41)
    private final int method732(int arg0) {
        byte var2 = this.field1844.field4338[this.field1844.field4314];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1846[arg0] = var3;
            this.field1844.field4314++;
        } else {
            var3 = this.field1846[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method740(arg0, var3);
        }
        int var4 = this.field1844.method1727(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1844.field4338[this.field1844.field4314] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1844.field4314++;
                this.field1846[arg0] = var5;
                return this.method740(arg0, var5);
            }
        }
        this.field1844.field4314 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)J", line = 79)
    public final long method733(int arg0) {
        return (long) this.field1847 * (long) arg0 + this.field1849;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 82)
    public final void method734(int arg0) {
        this.field1844.field4314 = this.field1850[arg0];
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)I", line = 86)
    public final int method735(int arg0) {
        return this.method732(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()V", line = 93)
    public final void method736() {
        this.field1844.field4338 = null;
        this.field1845 = null;
        this.field1850 = null;
        this.field1848 = null;
        this.field1846 = null;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()V", line = 102)
    public final void method737() {
        this.field1844.field4314 = -1;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "()I", line = 106)
    public final int method738() {
        int var1 = this.field1850.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1850[var4] >= 0 && this.field1848[var4] < var3) {
                var2 = var4;
                var3 = this.field1848[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(J)V", line = 131)
    public final void method739(long arg0) {
        this.field1849 = arg0;
        int var3 = this.field1850.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1848[var4] = 0;
            this.field1846[var4] = 0;
            this.field1844.field4314 = this.field1845[var4];
            this.method730(var4);
            this.field1850[var4] = this.field1844.field4314;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I", line = 149)
    private final int method740(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1843[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1844.method1731(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1844.method1731(true) << 16;
            }
            return var8;
        }
        int var3 = this.field1844.method1731(true);
        int var4 = this.field1844.method1727(true);
        if (var3 == 47) {
            this.field1844.field4314 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1844.method1749(false);
            var4 -= 3;
            int var6 = this.field1848[arg0];
            this.field1849 += (long) (this.field1847 - var5) * (long) var6;
            this.field1847 = var5;
            this.field1844.field4314 += var4;
            return 2;
        } else {
            this.field1844.field4314 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "()Z", line = 192)
    public final boolean method741() {
        return this.field1844.field4338 != null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([B)V", line = 195)
    public final void method742(byte[] arg0) {
        this.field1844.field4338 = arg0;
        this.field1844.field4314 = 10;
        int var2 = this.field1844.method1712(-1);
        this.field1851 = this.field1844.method1712(-1);
        this.field1847 = 500000;
        this.field1845 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1844.method1738(-1756395344);
            int var5 = this.field1844.method1738(-1756395344);
            if (var4 == 1297379947) {
                this.field1845[var3] = this.field1844.field4314;
                var3++;
            }
            this.field1844.field4314 += var5;
        }
        this.field1849 = 0L;
        this.field1850 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1850[var6] = this.field1845[var6];
        }
        this.field1848 = new int[var2];
        this.field1846 = new int[var2];
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 264)
    public class107() {
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V", line = 266)
    public class107(byte[] arg0) {
        this.method742(arg0);
    }
}
