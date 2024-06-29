import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class200 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lcg;")
    private class316 field2844 = new class316((byte[]) null);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[B")
    private static byte[] field2845 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "J")
    private long field2849;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    private int[] field2846;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[I")
    public int[] field2847;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    private int[] field2848;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    private int[] field2850;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()I", line = 3)
    public final int method1414() {
        return this.field2846.length;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V", line = 7)
    public static void method1415() {
        field2845 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 11)
    public final void method1416(int arg0) {
        int var2 = this.field2844.method2179(false);
        this.field2847[arg0] += var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([B)V", line = 17)
    public final void method1417(byte[] arg0) {
        this.field2844.field4798 = arg0;
        this.field2844.field4777 = 10;
        int var2 = this.field2844.method2220((byte) 118);
        this.field2851 = this.field2844.method2220((byte) 103);
        this.field2852 = 500000;
        this.field2848 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2844.method2172((byte) 71);
            int var5 = this.field2844.method2172((byte) 71);
            if (var4 == 1297379947) {
                this.field2848[var3] = this.field2844.field4777;
                var3++;
            }
            this.field2844.field4777 += var5;
        }
        this.field2849 = 0L;
        this.field2846 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2846[var6] = this.field2848[var6];
        }
        this.field2847 = new int[var2];
        this.field2850 = new int[var2];
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()Z", line = 71)
    public final boolean method1418() {
        return this.field2844.field4798 != null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)J", line = 74)
    public final long method1419(int arg0) {
        return (long) this.field2852 * (long) arg0 + this.field2849;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)I", line = 79)
    private final int method1420(int arg0) {
        byte var2 = this.field2844.field4798[this.field2844.field4777];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2850[arg0] = var3;
            this.field2844.field4777++;
        } else {
            var3 = this.field2850[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1422(arg0, var3);
        }
        int var4 = this.field2844.method2179(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2844.field4798[this.field2844.field4777] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2844.field4777++;
                this.field2850[arg0] = var5;
                return this.method1422(arg0, var5);
            }
        }
        this.field2844.field4777 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()V", line = 117)
    public final void method1421() {
        this.field2844.field4798 = null;
        this.field2848 = null;
        this.field2846 = null;
        this.field2847 = null;
        this.field2850 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I", line = 126)
    private final int method1422(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2845[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2844.method2219(16448) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2844.method2219(16448) << 16;
            }
            return var8;
        }
        int var3 = this.field2844.method2219(16448);
        int var4 = this.field2844.method2179(false);
        if (var3 == 47) {
            this.field2844.field4777 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2844.method2210((byte) -5);
            var4 -= 3;
            int var6 = this.field2847[arg0];
            this.field2849 += (long) (this.field2852 - var5) * (long) var6;
            this.field2852 = var5;
            this.field2844.field4777 += var4;
            return 2;
        } else {
            this.field2844.field4777 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()I", line = 169)
    public final int method1423() {
        int var1 = this.field2846.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2846[var4] >= 0 && this.field2847[var4] < var3) {
                var2 = var4;
                var3 = this.field2847[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 195)
    public final void method1424(int arg0) {
        this.field2844.field4777 = this.field2846[arg0];
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "()Z", line = 199)
    public final boolean method1425() {
        int var1 = this.field2846.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2846[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V", line = 214)
    public final void method1426(int arg0) {
        this.field2846[arg0] = this.field2844.field4777;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I", line = 219)
    public final int method1427(int arg0) {
        return this.method1420(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(J)V", line = 226)
    public final void method1428(long arg0) {
        this.field2849 = arg0;
        int var3 = this.field2846.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2847[var4] = 0;
            this.field2850[var4] = 0;
            this.field2844.field4777 = this.field2848[var4];
            this.method1416(var4);
            this.field2846[var4] = this.field2844.field4777;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 264)
    public class200() {
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V", line = 266)
    public class200(byte[] arg0) {
        this.method1417(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "()V", line = 249)
    public final void method1429() {
        this.field2844.field4777 = -1;
    }
}
