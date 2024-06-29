import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class325 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lgn;")
    private class303 field5054 = new class303((byte[]) null);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[B")
    private static byte[] field5053 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "J")
    private long field5060;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    public int[] field5055;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    private int[] field5056;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    private int[] field5059;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[I")
    private int[] field5061;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 4)
    public final void method2193(int arg0) {
        int var2 = this.field5054.method2017((byte) -11);
        this.field5055[arg0] += var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B)V", line = 8)
    public final void method2194(byte[] arg0) {
        this.field5054.field4716 = arg0;
        this.field5054.field4679 = 10;
        int var2 = this.field5054.method1994(false);
        this.field5057 = this.field5054.method1994(false);
        this.field5058 = 500000;
        this.field5061 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field5054.method1996(-74);
            int var5 = this.field5054.method1996(-118);
            if (var4 == 1297379947) {
                this.field5061[var3] = this.field5054.field4679;
                var3++;
            }
            this.field5054.field4679 += var5;
        }
        this.field5060 = 0L;
        this.field5056 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field5056[var6] = this.field5061[var6];
        }
        this.field5055 = new int[var2];
        this.field5059 = new int[var2];
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I", line = 63)
    private final int method2195(int arg0) {
        byte var2 = this.field5054.field4716[this.field5054.field4679];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5059[arg0] = var3;
            this.field5054.field4679++;
        } else {
            var3 = this.field5059[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2202(arg0, var3);
        }
        int var4 = this.field5054.method2017((byte) -11);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5054.field4716[this.field5054.field4679] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5054.field4679++;
                this.field5059[arg0] = var5;
                return this.method2202(arg0, var5);
            }
        }
        this.field5054.field4679 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 103)
    public final void method2196(int arg0) {
        this.field5054.field4679 = this.field5056[arg0];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I", line = 106)
    public final int method2197() {
        return this.field5056.length;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 109)
    public final void method2198(int arg0) {
        this.field5056[arg0] = this.field5054.field4679;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()Z", line = 113)
    public final boolean method2199() {
        return this.field5054.field4716 != null;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)I", line = 117)
    public final int method2200(int arg0) {
        return this.method2195(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(J)V", line = 124)
    public final void method2201(long arg0) {
        this.field5060 = arg0;
        int var3 = this.field5056.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5055[var4] = 0;
            this.field5059[var4] = 0;
            this.field5054.field4679 = this.field5061[var4];
            this.method2193(var4);
            this.field5056[var4] = this.field5054.field4679;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 264)
    public class325() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V", line = 266)
    public class325(byte[] arg0) {
        this.method2194(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 146)
    private final int method2202(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5053[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5054.method2043((byte) -116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5054.method2043((byte) -124) << 16;
            }
            return var8;
        }
        int var3 = this.field5054.method2043((byte) -121);
        int var4 = this.field5054.method2017((byte) -11);
        if (var3 == 47) {
            this.field5054.field4679 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5054.method2059(255);
            var4 -= 3;
            int var6 = this.field5055[arg0];
            this.field5060 += (long) (this.field5058 - var5) * (long) var6;
            this.field5058 = var5;
            this.field5054.field4679 += var4;
            return 2;
        } else {
            this.field5054.field4679 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()Z", line = 193)
    public final boolean method2203() {
        int var1 = this.field5056.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5056[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)J", line = 206)
    public final long method2204(int arg0) {
        return (long) this.field5058 * (long) arg0 + this.field5060;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()I", line = 210)
    public final int method2205() {
        int var1 = this.field5056.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5056[var4] >= 0 && this.field5055[var4] < var3) {
                var2 = var4;
                var3 = this.field5055[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "()V", line = 237)
    public final void method2206() {
        this.field5054.field4716 = null;
        this.field5061 = null;
        this.field5056 = null;
        this.field5055 = null;
        this.field5059 = null;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "()V", line = 252)
    public final void method2207() {
        this.field5054.field4679 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "()V", line = 261)
    public static void method2208() {
        field5053 = null;
    }
}
