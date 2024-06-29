import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class142 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lpd;")
    private class96 field2246 = new class96((byte[]) null);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[B")
    private static byte[] field2245 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "J")
    private long field2247;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    private int[] field2248;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    public int[] field2249;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    private int[] field2251;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    private int[] field2252;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)J")
    public final long method975(int arg0) {
        return (long) this.field2250 * (long) arg0 + this.field2247;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([B)V")
    public final void method976(byte[] arg0) {
        this.field2246.field1218 = arg0;
        this.field2246.field1228 = 10;
        int var2 = this.field2246.method549(255);
        this.field2253 = this.field2246.method549(255);
        this.field2250 = 500000;
        this.field2251 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2246.method597(-1197332568);
            int var6 = this.field2246.method597(-1197332568);
            if (var5 == 1297379947) {
                this.field2251[var3] = this.field2246.field1228;
                var3++;
            }
            this.field2246.field1228 += var6;
        }
        this.field2247 = 0L;
        this.field2248 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2248[var4] = this.field2251[var4];
        }
        this.field2249 = new int[var2];
        this.field2252 = new int[var2];
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method977(int arg0) {
        this.field2246.field1228 = this.field2248[arg0];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()Z")
    public final boolean method978() {
        return this.field2246.field1218 != null;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public final void method979(int arg0) {
        this.field2248[arg0] = this.field2246.field1228;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public final void method980(int arg0) {
        int var2 = this.field2246.method542((byte) -72);
        this.field2249[arg0] += var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(J)V")
    public final void method981(long arg0) {
        this.field2247 = arg0;
        int var3 = this.field2248.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2249[var4] = 0;
            this.field2252[var4] = 0;
            this.field2246.field1228 = this.field2251[var4];
            this.method980(var4);
            this.field2248[var4] = this.field2246.field1228;
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
    private final int method982(int arg0) {
        byte var2 = this.field2246.field1218[this.field2246.field1228];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2252[arg0] = var3;
            this.field2246.field1228++;
        } else {
            var3 = this.field2252[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method988(arg0, var3);
        }
        int var4 = this.field2246.method542((byte) -72);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2246.field1218[this.field2246.field1228] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2246.field1228++;
                this.field2252[arg0] = var5;
                return this.method988(arg0, var5);
            }
        }
        this.field2246.field1228 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)I")
    public final int method983(int arg0) {
        return this.method982(arg0);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
    public final int method984() {
        return this.field2248.length;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
    public final void method985() {
        this.field2246.field1218 = null;
        this.field2251 = null;
        this.field2248 = null;
        this.field2249 = null;
        this.field2252 = null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()I")
    public final int method986() {
        int var1 = this.field2248.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2248[var4] >= 0 && this.field2249[var4] < var3) {
                var2 = var4;
                var3 = this.field2249[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V")
    public static void method987() {
        field2245 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
    private final int method988(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2245[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2246.method584(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2246.method584(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2246.method584(255);
        int var4 = this.field2246.method542((byte) -72);
        if (var3 == 47) {
            this.field2246.field1228 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2246.method598(-1235752501);
            var4 -= 3;
            int var6 = this.field2249[arg0];
            this.field2247 += (long) (this.field2250 - var5) * (long) var6;
            this.field2250 = var5;
            this.field2246.field1228 += var4;
            return 2;
        } else {
            this.field2246.field1228 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()Z")
    public final boolean method989() {
        int var1 = this.field2248.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2248[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class142() {
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()V")
    public final void method990() {
        this.field2246.field1228 = -1;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
    public class142(byte[] arg0) {
        this.method976(arg0);
    }
}
