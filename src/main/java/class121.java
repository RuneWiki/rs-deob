import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class121 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Log;")
    private class146 field2327 = new class146(null);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[B")
    private static byte[] field2326 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "J")
    private long field2334;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    private int[] field2329;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
    private int[] field2330;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public int[] field2331;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    private int[] field2333;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    private final int method772(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2326[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2327.method991(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2327.method991(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2327.method991(255);
        int var4 = this.field2327.method983(false);
        if (var3 == 47) {
            this.field2327.field2865 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2327.method1012(-123);
            var4 -= 3;
            int var6 = this.field2331[arg0];
            this.field2334 += (long) (this.field2328 - var5) * (long) var6;
            this.field2328 = var5;
            this.field2327.field2865 += var4;
            return 2;
        } else {
            this.field2327.field2865 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method773(int arg0) {
        this.field2327.field2865 = this.field2330[arg0];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
    public final void method774() {
        this.field2327.field2859 = null;
        this.field2329 = null;
        this.field2330 = null;
        this.field2331 = null;
        this.field2333 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
    public static void method775() {
        field2326 = null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()Z")
    public final boolean method776() {
        int var1 = this.field2330.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2330[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V")
    public final void method777(long arg0) {
        this.field2334 = arg0;
        int var3 = this.field2330.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2331[var4] = 0;
            this.field2333[var4] = 0;
            this.field2327.field2865 = this.field2329[var4];
            this.method787(var4);
            this.field2330[var4] = this.field2327.field2865;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
    public final void method778(byte[] arg0) {
        this.field2327.field2859 = arg0;
        this.field2327.field2865 = 10;
        int var2 = this.field2327.method1007(112);
        this.field2332 = this.field2327.method1007(37);
        this.field2328 = 500000;
        this.field2329 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2327.method979(1029109968);
            int var6 = this.field2327.method979(1029109968);
            if (var5 == 1297379947) {
                this.field2329[var3] = this.field2327.field2865;
                var3++;
            }
            this.field2327.field2865 += var6;
        }
        this.field2334 = 0L;
        this.field2330 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2330[var4] = this.field2329[var4];
        }
        this.field2331 = new int[var2];
        this.field2333 = new int[var2];
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
    public final int method779(int arg0) {
        return this.method781(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()I")
    public final int method780() {
        int var1 = this.field2330.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2330[var4] >= 0 && this.field2331[var4] < var3) {
                var2 = var4;
                var3 = this.field2331[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
    private final int method781(int arg0) {
        byte var2 = this.field2327.field2859[this.field2327.field2865];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2333[arg0] = var3;
            this.field2327.field2865++;
        } else {
            var3 = this.field2333[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method772(arg0, var3);
        }
        int var4 = this.field2327.method983(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2327.field2859[this.field2327.field2865] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2327.field2865++;
                this.field2333[arg0] = var5;
                return this.method772(arg0, var5);
            }
        }
        this.field2327.field2865 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
    public final int method782() {
        return this.field2330.length;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public final void method783(int arg0) {
        this.field2330[arg0] = this.field2327.field2865;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()V")
    public final void method784() {
        this.field2327.field2865 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)J")
    public final long method785(int arg0) {
        return (long) this.field2328 * (long) arg0 + this.field2334;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()Z")
    public final boolean method786() {
        return this.field2327.field2859 != null;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public final void method787(int arg0) {
        int var2 = this.field2327.method983(false);
        this.field2331[arg0] += var2;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class121() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class121(byte[] arg0) {
        this.method778(arg0);
    }
}
