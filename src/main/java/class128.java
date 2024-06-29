import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class128 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Llh;")
    private class249 field2391 = new class249((byte[]) null);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[B")
    private static byte[] field2392 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field2397;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "J")
    private long field2395;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    private int[] field2393;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[I")
    public int[] field2394;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
    private int[] field2398;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "[I")
    private int[] field2399;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Z")
    public final boolean method882() {
        return this.field2391.field4350 != null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method883() {
        int var1 = this.field2398.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2398[var4] >= 0 && this.field2394[var4] < var3) {
                var2 = var4;
                var3 = this.field2394[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public final void method884(int arg0) {
        this.field2391.field4335 = this.field2398[arg0];
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
    public final int method885() {
        return this.field2398.length;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([B)V")
    public final void method886(byte[] arg0) {
        this.field2391.field4350 = arg0;
        this.field2391.field4335 = 10;
        int var2 = this.field2391.method1674(1355769544);
        this.field2396 = this.field2391.method1674(1355769544);
        this.field2397 = 500000;
        this.field2399 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2391.method1652(-5528);
            int var6 = this.field2391.method1652(-5528);
            if (var5 == 1297379947) {
                this.field2399[var3] = this.field2391.field4335;
                var3++;
            }
            this.field2391.field4335 += var6;
        }
        this.field2395 = 0L;
        this.field2398 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2398[var4] = this.field2399[var4];
        }
        this.field2394 = new int[var2];
        this.field2393 = new int[var2];
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
    public static void method887() {
        field2392 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
    private final int method888(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2392[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2391.method1677(-6677) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2391.method1677(-6677) << 16;
            }
            return var8;
        }
        int var3 = this.field2391.method1677(-6677);
        int var4 = this.field2391.method1654(true);
        if (var3 == 47) {
            this.field2391.field4335 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2391.method1648((byte) 77);
            var4 -= 3;
            int var6 = this.field2394[arg0];
            this.field2395 += (long) (this.field2397 - var5) * (long) var6;
            this.field2397 = var5;
            this.field2391.field4335 += var4;
            return 2;
        } else {
            this.field2391.field4335 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()V")
    public final void method889() {
        this.field2391.field4350 = null;
        this.field2399 = null;
        this.field2398 = null;
        this.field2394 = null;
        this.field2393 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)I")
    private final int method890(int arg0) {
        byte var2 = this.field2391.field4350[this.field2391.field4335];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2393[arg0] = var3;
            this.field2391.field4335++;
        } else {
            var3 = this.field2393[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method888(arg0, var3);
        }
        int var4 = this.field2391.method1654(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2391.field4350[this.field2391.field4335] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2391.field4335++;
                this.field2393[arg0] = var5;
                return this.method888(arg0, var5);
            }
        }
        this.field2391.field4335 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method891(int arg0) {
        int var2 = this.field2391.method1654(true);
        this.field2394[arg0] += var2;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)J")
    public final long method892(int arg0) {
        return (long) this.field2397 * (long) arg0 + this.field2395;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "()V")
    public final void method893() {
        this.field2391.field4335 = -1;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public final void method894(int arg0) {
        this.field2398[arg0] = this.field2391.field4335;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)I")
    public final int method895(int arg0) {
        return this.method890(arg0);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(J)V")
    public final void method896(long arg0) {
        this.field2395 = arg0;
        int var3 = this.field2398.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2394[var4] = 0;
            this.field2393[var4] = 0;
            this.field2391.field4335 = this.field2399[var4];
            this.method891(var4);
            this.field2398[var4] = this.field2391.field4335;
        }
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "()Z")
    public final boolean method897() {
        int var1 = this.field2398.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2398[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([B)V")
    public class128(byte[] arg0) {
        this.method886(arg0);
    }
}
