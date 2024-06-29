import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class250 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lhi;")
    private class291 field4268 = new class291((byte[]) null);

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "[B")
    private static byte[] field4276 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    private int field4272;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "J")
    private long field4273;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    private int[] field4269;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
    public int[] field4270;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
    private int[] field4274;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    private int[] field4275;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)J", line = 3)
    public final long method1713(int arg0) {
        return (long) this.field4272 * (long) arg0 + this.field4273;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 6)
    public final void method1714() {
        this.field4268.field4950 = null;
        this.field4269 = null;
        this.field4274 = null;
        this.field4270 = null;
        this.field4275 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 15)
    public final void method1715(int arg0) {
        this.field4274[arg0] = this.field4268.field4946;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)I", line = 19)
    private final int method1716(int arg0) {
        byte var2 = this.field4268.field4950[this.field4268.field4946];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4275[arg0] = var3;
            this.field4268.field4946++;
        } else {
            var3 = this.field4275[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1717(arg0, var3);
        }
        int var4 = this.field4268.method2004(-10352);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4268.field4950[this.field4268.field4946] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4268.field4946++;
                this.field4275[arg0] = var5;
                return this.method1717(arg0, var5);
            }
        }
        this.field4268.field4946 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I", line = 60)
    private final int method1717(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4276[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4268.method2011(-113) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4268.method2011(-81) << 16;
            }
            return var8;
        }
        int var3 = this.field4268.method2011(-55);
        int var4 = this.field4268.method2004(-10352);
        if (var3 == 47) {
            this.field4268.field4946 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4268.method2009((byte) 64);
            var4 -= 3;
            int var6 = this.field4270[arg0];
            this.field4273 += (long) (this.field4272 - var5) * (long) var6;
            this.field4272 = var5;
            this.field4268.field4946 += var4;
            return 2;
        } else {
            this.field4268.field4946 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 103)
    public static void method1718() {
        field4276 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([B)V", line = 107)
    public final void method1719(byte[] arg0) {
        this.field4268.field4950 = arg0;
        this.field4268.field4946 = 10;
        int var2 = this.field4268.method2021((byte) 74);
        this.field4271 = this.field4268.method2021((byte) 74);
        this.field4272 = 500000;
        this.field4269 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4268.method1969((byte) -16);
            int var5 = this.field4268.method1969((byte) -16);
            if (var4 == 1297379947) {
                this.field4269[var3] = this.field4268.field4946;
                var3++;
            }
            this.field4268.field4946 += var5;
        }
        this.field4273 = 0L;
        this.field4274 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4274[var6] = this.field4269[var6];
        }
        this.field4270 = new int[var2];
        this.field4275 = new int[var2];
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 264)
    public class250() {
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([B)V", line = 266)
    public class250(byte[] arg0) {
        this.method1719(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 165)
    public final void method1720(int arg0) {
        int var2 = this.field4268.method2004(-10352);
        this.field4270[arg0] += var2;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)I", line = 171)
    public final int method1721(int arg0) {
        return this.method1716(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()Z", line = 181)
    public final boolean method1722() {
        int var1 = this.field4274.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4274[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()I", line = 198)
    public final int method1723() {
        return this.field4274.length;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V", line = 201)
    public final void method1724(int arg0) {
        this.field4268.field4946 = this.field4274[arg0];
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(J)V", line = 207)
    public final void method1725(long arg0) {
        this.field4273 = arg0;
        int var3 = this.field4274.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4270[var4] = 0;
            this.field4275[var4] = 0;
            this.field4268.field4946 = this.field4269[var4];
            this.method1720(var4);
            this.field4274[var4] = this.field4268.field4946;
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "()I", line = 227)
    public final int method1726() {
        int var1 = this.field4274.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4274[var4] >= 0 && this.field4270[var4] < var3) {
                var2 = var4;
                var3 = this.field4270[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "()V", line = 252)
    public final void method1727() {
        this.field4268.field4946 = -1;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "()Z", line = 257)
    public final boolean method1728() {
        return this.field4268.field4950 != null;
    }
}
