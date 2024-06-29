import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class295 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Lgw;")
    private class148 field4047 = new class148(null);

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "[B")
    private static byte[] field4049 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "J")
    private long field4052;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
    private int[] field4048;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "[I")
    private int[] field4050;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "[I")
    private int[] field4054;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "[I")
    public int[] field4055;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V", line = 3)
    public final void method1807(int arg0) {
        this.field4047.field2177 = this.field4054[arg0];
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()V", line = 6)
    public final void method1808() {
        this.field4047.field2177 = -1;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)J", line = 9)
    public final long method1809(int arg0) {
        return (long) this.field4051 * (long) arg0 + this.field4052;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "([B)V", line = 15)
    public final void method1810(byte[] arg0) {
        this.field4047.field2146 = arg0;
        this.field4047.field2177 = 10;
        int var2 = this.field4047.method1045(true);
        this.field4053 = this.field4047.method1045(true);
        this.field4051 = 500000;
        this.field4048 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4047.method1026(-917302120);
            int var6 = this.field4047.method1026(-917302120);
            if (var5 == 1297379947) {
                this.field4048[var3] = this.field4047.field2177;
                var3++;
            }
            this.field4047.field2177 += var6;
        }
        this.field4052 = 0L;
        this.field4054 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4054[var4] = this.field4048[var4];
        }
        this.field4055 = new int[var2];
        this.field4050 = new int[var2];
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)I", line = 71)
    public final int method1811(int arg0) {
        return this.method1815(arg0);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V", line = 264)
    public class295() {
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "([B)V", line = 266)
    public class295(byte[] arg0) {
        this.method1810(arg0);
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V", line = 81)
    public final void method1812(int arg0) {
        int var2 = this.field4047.method1021((byte) 122);
        this.field4055[arg0] += var2;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "()I", line = 85)
    public final int method1813() {
        return this.field4054.length;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "()V", line = 102)
    public static void method1814() {
        field4049 = null;
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)I", line = 106)
    private final int method1815(int arg0) {
        byte var2 = this.field4047.field2146[this.field4047.field2177];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4050[arg0] = var3;
            this.field4047.field2177++;
        } else {
            var3 = this.field4050[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1820(arg0, var3);
        }
        int var4 = this.field4047.method1021((byte) 106);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4047.field2146[this.field4047.field2177] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4047.field2177++;
                this.field4050[arg0] = var5;
                return this.method1820(arg0, var5);
            }
        }
        this.field4047.field2177 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(J)V", line = 145)
    public final void method1816(long arg0) {
        this.field4052 = arg0;
        int var3 = this.field4054.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4055[var4] = 0;
            this.field4050[var4] = 0;
            this.field4047.field2177 = this.field4048[var4];
            this.method1812(var4);
            this.field4054[var4] = this.field4047.field2177;
        }
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "(I)V", line = 163)
    public final void method1817(int arg0) {
        this.field4054[arg0] = this.field4047.field2177;
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "()V", line = 166)
    public final void method1818() {
        this.field4047.field2146 = null;
        this.field4048 = null;
        this.field4054 = null;
        this.field4055 = null;
        this.field4050 = null;
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "()Z", line = 176)
    public final boolean method1819() {
        int var1 = this.field4054.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4054[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)I", line = 192)
    private final int method1820(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4049[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4047.method1032((byte) -33) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4047.method1032((byte) -33) << 16;
            }
            return var8;
        }
        int var3 = this.field4047.method1032((byte) -33);
        int var4 = this.field4047.method1021((byte) -77);
        if (var3 == 47) {
            this.field4047.field2177 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4047.method1028((byte) 123);
            var4 -= 3;
            int var6 = this.field4055[arg0];
            this.field4052 += (long) (this.field4051 - var5) * (long) var6;
            this.field4051 = var5;
            this.field4047.field2177 += var4;
            return 2;
        } else {
            this.field4047.field2177 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "()I", line = 236)
    public final int method1821() {
        int var1 = this.field4054.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4054[var4] >= 0 && this.field4055[var4] < var3) {
                var2 = var4;
                var3 = this.field4055[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "()Z", line = 261)
    public final boolean method1822() {
        return this.field4047.field2146 != null;
    }
}
