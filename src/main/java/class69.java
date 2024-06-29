import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class69 {

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Lmc;")
    private class234 field943 = new class234(null);

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "[B")
    private static byte[] field942 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "J")
    private long field950;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "[I")
    private int[] field945;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "[I")
    public int[] field947;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "[I")
    private int[] field949;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "()I", line = 4)
    public final int method400() {
        return this.field949.length;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 7)
    public final void method401(int arg0) {
        this.field949[arg0] = this.field943.field3133;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "()V", line = 11)
    public final void method402() {
        this.field943.field3193 = null;
        this.field946 = null;
        this.field949 = null;
        this.field947 = null;
        this.field945 = null;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)J", line = 20)
    public final long method403(int arg0) {
        return (long) this.field948 * (long) arg0 + this.field950;
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I", line = 25)
    public final int method404(int arg0) {
        return this.method410(arg0);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I", line = 31)
    private final int method405(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field942[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field943.method1509(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field943.method1509(true) << 16;
            }
            return var8;
        }
        int var3 = this.field943.method1509(true);
        int var4 = this.field943.method1525(false);
        if (var3 == 47) {
            this.field943.field3133 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field943.method1500((byte) -89);
            var4 -= 3;
            int var6 = this.field947[arg0];
            this.field950 += (long) (this.field948 - var5) * (long) var6;
            this.field948 = var5;
            this.field943.field3133 += var4;
            return 2;
        } else {
            this.field943.field3133 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(J)V", line = 73)
    public final void method406(long arg0) {
        this.field950 = arg0;
        int var3 = this.field949.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field947[var4] = 0;
            this.field945[var4] = 0;
            this.field943.field3133 = this.field946[var4];
            this.method409(var4);
            this.field949[var4] = this.field943.field3133;
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "()V", line = 92)
    public final void method407() {
        this.field943.field3133 = -1;
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "()Z", line = 98)
    public final boolean method408() {
        return this.field943.field3193 != null;
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)V", line = 106)
    public final void method409(int arg0) {
        int var2 = this.field943.method1525(false);
        this.field947[arg0] += var2;
    }

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "(I)I", line = 112)
    private final int method410(int arg0) {
        byte var2 = this.field943.field3193[this.field943.field3133];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field945[arg0] = var3;
            this.field943.field3133++;
        } else {
            var3 = this.field945[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method405(arg0, var3);
        }
        int var4 = this.field943.method1525(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field943.field3193[this.field943.field3133] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field943.field3133++;
                this.field945[arg0] = var5;
                return this.method405(arg0, var5);
            }
        }
        this.field943.field3133 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "()Z", line = 152)
    public final boolean method411() {
        int var1 = this.field949.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field949[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "()V", line = 165)
    public static void method412() {
        field942 = null;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V", line = 264)
    public class69() {
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([B)V", line = 266)
    public class69(byte[] arg0) {
        this.method415(arg0);
    }

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "()I", line = 175)
    public final int method413() {
        int var1 = this.field949.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field949[var4] >= 0 && this.field947[var4] < var3) {
                var2 = var4;
                var3 = this.field947[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "(I)V", line = 204)
    public final void method414(int arg0) {
        this.field943.field3133 = this.field949[arg0];
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([B)V", line = 207)
    public final void method415(byte[] arg0) {
        this.field943.field3193 = arg0;
        this.field943.field3133 = 10;
        int var2 = this.field943.method1553((byte) 102);
        this.field944 = this.field943.method1553((byte) -128);
        this.field948 = 500000;
        this.field946 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field943.method1497((byte) 39);
            int var6 = this.field943.method1497((byte) 101);
            if (var5 == 1297379947) {
                this.field946[var3] = this.field943.field3133;
                var3++;
            }
            this.field943.field3133 += var6;
        }
        this.field950 = 0L;
        this.field949 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field949[var4] = this.field946[var4];
        }
        this.field947 = new int[var2];
        this.field945 = new int[var2];
    }
}
