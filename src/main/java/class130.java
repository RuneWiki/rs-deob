import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class130 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Leh;")
    private class101 field2271 = new class101((byte[]) null);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[B")
    private static byte[] field2274 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    private int field2276;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "J")
    private long field2275;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    private int[] field2272;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
    public int[] field2273;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[I")
    private int[] field2277;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    private int[] field2279;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    public final void method888() {
        this.field2271.field1730 = null;
        this.field2277 = null;
        this.field2272 = null;
        this.field2273 = null;
        this.field2279 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)J")
    public final long method889(int arg0) {
        return (long) this.field2276 * (long) arg0 + this.field2275;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method890(int arg0) {
        this.field2272[arg0] = this.field2271.field1762;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z")
    public final boolean method891() {
        return this.field2271.field1730 != null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method892(int arg0) {
        this.field2271.field1762 = this.field2272[arg0];
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()I")
    public final int method893() {
        int var1 = this.field2272.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2272[var4] >= 0 && this.field2273[var4] < var3) {
                var2 = var4;
                var3 = this.field2273[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
    public final int method894(int arg0) {
        return this.method897(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V")
    public final void method895(long arg0) {
        this.field2275 = arg0;
        int var3 = this.field2272.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2273[var4] = 0;
            this.field2279[var4] = 0;
            this.field2271.field1762 = this.field2277[var4];
            this.method898(var4);
            this.field2272[var4] = this.field2271.field1762;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()Z")
    public final boolean method896() {
        int var1 = this.field2272.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2272[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)I")
    private final int method897(int arg0) {
        byte var2 = this.field2271.field1730[this.field2271.field1762];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2279[arg0] = var3;
            this.field2271.field1762++;
        } else {
            var3 = this.field2279[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method900(arg0, var3);
        }
        int var4 = this.field2271.method660(-49);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2271.field1730[this.field2271.field1762] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2271.field1762++;
                this.field2279[arg0] = var5;
                return this.method900(arg0, var5);
            }
        }
        this.field2271.field1762 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public final void method898(int arg0) {
        int var2 = this.field2271.method660(-69);
        this.field2273[arg0] += var2;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()I")
    public final int method899() {
        return this.field2272.length;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    private final int method900(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2274[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2271.method669((byte) 36) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2271.method669((byte) 36) << 16;
            }
            return var8;
        }
        int var3 = this.field2271.method669((byte) 36);
        int var4 = this.field2271.method660(-90);
        if (var3 == 47) {
            this.field2271.field1762 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2271.method658(22292);
            var4 -= 3;
            int var6 = this.field2273[arg0];
            this.field2275 += (long) (this.field2276 - var5) * (long) var6;
            this.field2276 = var5;
            this.field2271.field1762 += var4;
            return 2;
        } else {
            this.field2271.field1762 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([B)V")
    public final void method901(byte[] arg0) {
        this.field2271.field1730 = arg0;
        this.field2271.field1762 = 10;
        int var2 = this.field2271.method677(false);
        this.field2278 = this.field2271.method677(false);
        this.field2276 = 500000;
        this.field2277 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2271.method655((byte) 86);
            int var6 = this.field2271.method655((byte) 41);
            if (var5 == 1297379947) {
                this.field2277[var3] = this.field2271.field1762;
                var3++;
            }
            this.field2271.field1762 += var6;
        }
        this.field2275 = 0L;
        this.field2272 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2272[var4] = this.field2277[var4];
        }
        this.field2273 = new int[var2];
        this.field2279 = new int[var2];
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "()V")
    public static void method902() {
        field2274 = null;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "()V")
    public final void method903() {
        this.field2271.field1762 = -1;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class130() {
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V")
    public class130(byte[] arg0) {
        this.method901(arg0);
    }
}
