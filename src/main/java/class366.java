import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class366 {

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lre;")
    private class446 field5533 = new class446((byte[]) null);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "[B")
    private static byte[] field5532 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public int field5535;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    private int field5538;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "J")
    private long field5537;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "[I")
    public int[] field5534;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "[I")
    private int[] field5536;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "[I")
    private int[] field5539;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "[I")
    private int[] field5540;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 3)
    public final void method2245(int arg0) {
        this.field5539[arg0] = this.field5533.field6315;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "()I", line = 7)
    public final int method2246() {
        int var1 = this.field5539.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5539[var4] >= 0 && this.field5534[var4] < var3) {
                var2 = var4;
                var3 = this.field5534[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "()V", line = 34)
    public final void method2247() {
        this.field5533.field6316 = null;
        this.field5536 = null;
        this.field5539 = null;
        this.field5534 = null;
        this.field5540 = null;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "()Z", line = 43)
    public final boolean method2248() {
        return this.field5533.field6316 != null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I", line = 46)
    private final int method2249(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5532[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5533.method2628(49152) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5533.method2628(49152) << 16;
            }
            return var8;
        }
        int var3 = this.field5533.method2628(49152);
        int var4 = this.field5533.method2622((byte) 1);
        if (var3 == 47) {
            this.field5533.field6315 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5533.method2613(-25778);
            var4 -= 3;
            int var6 = this.field5534[arg0];
            this.field5537 += (long) (this.field5538 - var5) * (long) var6;
            this.field5538 = var5;
            this.field5533.field6315 += var4;
            return 2;
        } else {
            this.field5533.field6315 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(J)V", line = 89)
    public final void method2250(long arg0) {
        this.field5537 = arg0;
        int var3 = this.field5539.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5534[var4] = 0;
            this.field5540[var4] = 0;
            this.field5533.field6315 = this.field5536[var4];
            this.method2256(var4);
            this.field5539[var4] = this.field5533.field6315;
        }
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "()Z", line = 112)
    public final boolean method2251() {
        int var1 = this.field5539.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5539[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "()V", line = 125)
    public final void method2252() {
        this.field5533.field6315 = -1;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)I", line = 129)
    private final int method2253(int arg0) {
        byte var2 = this.field5533.field6316[this.field5533.field6315];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5540[arg0] = var3;
            this.field5533.field6315++;
        } else {
            var3 = this.field5540[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2249(arg0, var3);
        }
        int var4 = this.field5533.method2622((byte) 1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5533.field6316[this.field5533.field6315] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5533.field6315++;
                this.field5540[arg0] = var5;
                return this.method2249(arg0, var5);
            }
        }
        this.field5533.field6315 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)I", line = 171)
    public final int method2254(int arg0) {
        return this.method2253(arg0);
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)J", line = 177)
    public final long method2255(int arg0) {
        return (long) this.field5538 * (long) arg0 + this.field5537;
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(I)V", line = 182)
    public final void method2256(int arg0) {
        int var2 = this.field5533.method2622((byte) 1);
        this.field5534[arg0] += var2;
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)V", line = 187)
    public final void method2257(int arg0) {
        this.field5533.field6315 = this.field5539[arg0];
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([B)V", line = 190)
    public final void method2258(byte[] arg0) {
        this.field5533.field6316 = arg0;
        this.field5533.field6315 = 10;
        int var2 = this.field5533.method2631(2530);
        this.field5535 = this.field5533.method2631(2530);
        this.field5538 = 500000;
        this.field5536 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5533.method2604(7);
            int var6 = this.field5533.method2604(-110);
            if (var5 == 1297379947) {
                this.field5536[var3] = this.field5533.field6315;
                var3++;
            }
            this.field5533.field6315 += var6;
        }
        this.field5537 = 0L;
        this.field5539 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5539[var4] = this.field5536[var4];
        }
        this.field5534 = new int[var2];
        this.field5540 = new int[var2];
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "()I", line = 245)
    public final int method2259() {
        return this.field5539.length;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 264)
    public class366() {
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "([B)V", line = 266)
    public class366(byte[] arg0) {
        this.method2258(arg0);
    }

    @OriginalMember(owner = "client!au", name = "g", descriptor = "()V", line = 261)
    public static void method2260() {
        field5532 = null;
    }
}
