import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lne;")
    private class95 field2042 = new class95(null);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[B")
    private static byte[] field2043 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field2044;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "J")
    private long field2046;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    private int[] field2045;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    private int[] field2048;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
    public int[] field2049;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
    private int[] field2050;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
    public final long method675(int arg0) {
        return (long) this.field2044 * (long) arg0 + this.field2046;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public static void method676() {
        field2043 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()I")
    public final int method677() {
        int var1 = this.field2045.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2045[var4] >= 0 && this.field2049[var4] < var3) {
                var2 = var4;
                var3 = this.field2049[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([B)V")
    public final void method678(byte[] arg0) {
        this.field2042.field2320 = arg0;
        this.field2042.field2304 = 10;
        int var2 = this.field2042.method795(1);
        this.field2047 = this.field2042.method795(1);
        this.field2044 = 500000;
        this.field2048 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2042.method740((byte) -76);
            int var6 = this.field2042.method740((byte) 82);
            if (var5 == 1297379947) {
                this.field2048[var3] = this.field2042.field2304;
                var3++;
            }
            this.field2042.field2304 += var6;
        }
        this.field2046 = 0L;
        this.field2045 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2045[var4] = this.field2048[var4];
        }
        this.field2049 = new int[var2];
        this.field2050 = new int[var2];
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public final void method679(int arg0) {
        this.field2042.field2304 = this.field2045[arg0];
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public final void method680(int arg0) {
        int var2 = this.field2042.method741(-1);
        this.field2049[arg0] += var2;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()Z")
    public final boolean method681() {
        int var1 = this.field2045.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2045[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()I")
    public final int method682() {
        return this.field2045.length;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "()V")
    public final void method683() {
        this.field2042.field2304 = -1;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)I")
    public final int method684(int arg0) {
        return this.method687(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
    private final int method685(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2043[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2042.method790((byte) 73) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2042.method790((byte) 73) << 16;
            }
            return var8;
        }
        int var3 = this.field2042.method790((byte) 73);
        int var4 = this.field2042.method741(-1);
        if (var3 == 47) {
            this.field2042.field2304 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2042.method763(true);
            var4 -= 3;
            int var6 = this.field2049[arg0];
            this.field2046 += (long) (this.field2044 - var5) * (long) var6;
            this.field2044 = var5;
            this.field2042.field2304 += var4;
            return 2;
        } else {
            this.field2042.field2304 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "()V")
    public final void method686() {
        this.field2042.field2320 = null;
        this.field2048 = null;
        this.field2045 = null;
        this.field2049 = null;
        this.field2050 = null;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I")
    private final int method687(int arg0) {
        byte var2 = this.field2042.field2320[this.field2042.field2304];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2050[arg0] = var3;
            this.field2042.field2304++;
        } else {
            var3 = this.field2050[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method685(arg0, var3);
        }
        int var4 = this.field2042.method741(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2042.field2320[this.field2042.field2304] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2042.field2304++;
                this.field2050[arg0] = var5;
                return this.method685(arg0, var5);
            }
        }
        this.field2042.field2304 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public final void method688(int arg0) {
        this.field2045[arg0] = this.field2042.field2304;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "()Z")
    public final boolean method689() {
        return this.field2042.field2320 != null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(J)V")
    public final void method690(long arg0) {
        this.field2046 = arg0;
        int var3 = this.field2045.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2049[var4] = 0;
            this.field2050[var4] = 0;
            this.field2042.field2304 = this.field2048[var4];
            this.method680(var4);
            this.field2045[var4] = this.field2042.field2304;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class86() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([B)V")
    public class86(byte[] arg0) {
        this.method678(arg0);
    }
}
