import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class167 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Lio;")
    private class157 field2386 = new class157(null);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "[B")
    private static byte[] field2385 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "J")
    private long field2388;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
    private int[] field2387;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
    private int[] field2390;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[I")
    private int[] field2391;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "[I")
    public int[] field2392;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "()Z")
    public final boolean method1021() {
        return this.field2386.field2199 != null;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "()I")
    public final int method1022() {
        int var1 = this.field2390.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2390[var4] >= 0 && this.field2392[var4] < var3) {
                var2 = var4;
                var3 = this.field2392[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public final void method1023(int arg0) {
        this.field2386.field2219 = this.field2390[arg0];
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "()Z")
    public final boolean method1024() {
        int var1 = this.field2390.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2390[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([B)V")
    public final void method1025(byte[] arg0) {
        this.field2386.field2199 = arg0;
        this.field2386.field2219 = 10;
        int var2 = this.field2386.method963(-128);
        this.field2393 = this.field2386.method963(-120);
        this.field2389 = 500000;
        this.field2387 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2386.method908(false);
            int var6 = this.field2386.method908(false);
            if (var5 == 1297379947) {
                this.field2387[var3] = this.field2386.field2219;
                var3++;
            }
            this.field2386.field2219 += var6;
        }
        this.field2388 = 0L;
        this.field2390 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2390[var4] = this.field2387[var4];
        }
        this.field2392 = new int[var2];
        this.field2391 = new int[var2];
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
    private final int method1026(int arg0) {
        byte var2 = this.field2386.field2199[this.field2386.field2219];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2391[arg0] = var3;
            this.field2386.field2219++;
        } else {
            var3 = this.field2391[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1032(arg0, var3);
        }
        int var4 = this.field2386.method927((byte) -78);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2386.field2199[this.field2386.field2219] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2386.field2219++;
                this.field2391[arg0] = var5;
                return this.method1032(arg0, var5);
            }
        }
        this.field2386.field2219 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)I")
    public final int method1027(int arg0) {
        return this.method1026(arg0);
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "()I")
    public final int method1028() {
        return this.field2390.length;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(J)V")
    public final void method1029(long arg0) {
        this.field2388 = arg0;
        int var3 = this.field2390.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2392[var4] = 0;
            this.field2391[var4] = 0;
            this.field2386.field2219 = this.field2387[var4];
            this.method1034(var4);
            this.field2390[var4] = this.field2386.field2219;
        }
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
    public final void method1030(int arg0) {
        this.field2390[arg0] = this.field2386.field2219;
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)J")
    public final long method1031(int arg0) {
        return (long) this.field2389 * (long) arg0 + this.field2388;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
    private final int method1032(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2385[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2386.method930(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2386.method930(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2386.method930(255);
        int var4 = this.field2386.method927((byte) -78);
        if (var3 == 47) {
            this.field2386.field2219 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2386.method933((byte) 1);
            var4 -= 3;
            int var6 = this.field2392[arg0];
            this.field2388 += (long) (this.field2389 - var5) * (long) var6;
            this.field2389 = var5;
            this.field2386.field2219 += var4;
            return 2;
        } else {
            this.field2386.field2219 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "()V")
    public final void method1033() {
        this.field2386.field2219 = -1;
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V")
    public final void method1034(int arg0) {
        int var2 = this.field2386.method927((byte) -78);
        this.field2392[arg0] += var2;
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "()V")
    public final void method1035() {
        this.field2386.field2199 = null;
        this.field2387 = null;
        this.field2390 = null;
        this.field2392 = null;
        this.field2391 = null;
    }

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "()V")
    public static void method1036() {
        field2385 = null;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class167() {
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([B)V")
    public class167(byte[] arg0) {
        this.method1025(arg0);
    }
}
