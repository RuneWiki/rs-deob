import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class368 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lef;")
    private class385 field5392 = new class385((byte[]) null);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[B")
    private static byte[] field5393 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    private int field5398;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "J")
    private long field5400;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    private int[] field5394;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
    public int[] field5396;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    private int[] field5397;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[I")
    private int[] field5399;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
    private final int method2209(int arg0) {
        byte var2 = this.field5392.field5685[this.field5392.field5666];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5394[arg0] = var3;
            this.field5392.field5666++;
        } else {
            var3 = this.field5394[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2221(arg0, var3);
        }
        int var4 = this.field5392.method2353(100);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5392.field5685[this.field5392.field5666] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5392.field5666++;
                this.field5394[arg0] = var5;
                return this.method2221(arg0, var5);
            }
        }
        this.field5392.field5666 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public final void method2210(int arg0) {
        int var2 = this.field5392.method2353(105);
        this.field5396[arg0] += var2;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public final void method2211(int arg0) {
        this.field5392.field5666 = this.field5399[arg0];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
    public final void method2212() {
        this.field5392.field5685 = null;
        this.field5397 = null;
        this.field5399 = null;
        this.field5396 = null;
        this.field5394 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()V")
    public static void method2213() {
        field5393 = null;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)J")
    public final long method2214(int arg0) {
        return (long) this.field5398 * (long) arg0 + this.field5400;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)I")
    public final int method2215(int arg0) {
        return this.method2209(arg0);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public final void method2216(int arg0) {
        this.field5399[arg0] = this.field5392.field5666;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()V")
    public final void method2217() {
        this.field5392.field5666 = -1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([B)V")
    public final void method2218(byte[] arg0) {
        this.field5392.field5685 = arg0;
        this.field5392.field5666 = 10;
        int var2 = this.field5392.method2323(-126);
        this.field5395 = this.field5392.method2323(-42);
        this.field5398 = 500000;
        this.field5397 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5392.method2354(255);
            int var6 = this.field5392.method2354(255);
            if (var5 == 1297379947) {
                this.field5397[var3] = this.field5392.field5666;
                var3++;
            }
            this.field5392.field5666 += var6;
        }
        this.field5400 = 0L;
        this.field5399 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5399[var4] = this.field5397[var4];
        }
        this.field5396 = new int[var2];
        this.field5394 = new int[var2];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(J)V")
    public final void method2219(long arg0) {
        this.field5400 = arg0;
        int var3 = this.field5399.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5396[var4] = 0;
            this.field5394[var4] = 0;
            this.field5392.field5666 = this.field5397[var4];
            this.method2210(var4);
            this.field5399[var4] = this.field5392.field5666;
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "()I")
    public final int method2220() {
        int var1 = this.field5399.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5399[var4] >= 0 && this.field5396[var4] < var3) {
                var2 = var4;
                var3 = this.field5396[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I")
    private final int method2221(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5393[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5392.method2343(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5392.method2343(255) << 16;
            }
            return var8;
        }
        int var3 = this.field5392.method2343(255);
        int var4 = this.field5392.method2353(115);
        if (var3 == 47) {
            this.field5392.field5666 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5392.method2382((byte) -74);
            var4 -= 3;
            int var6 = this.field5396[arg0];
            this.field5400 += (long) (this.field5398 - var5) * (long) var6;
            this.field5398 = var5;
            this.field5392.field5666 += var4;
            return 2;
        } else {
            this.field5392.field5666 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "()Z")
    public final boolean method2222() {
        int var1 = this.field5399.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5399[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "()I")
    public final int method2223() {
        return this.field5399.length;
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "()Z")
    public final boolean method2224() {
        return this.field5392.field5685 != null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class368() {
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "([B)V")
    public class368(byte[] arg0) {
        this.method2218(arg0);
    }
}
