import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class373 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ldg;")
    private class236 field5241 = new class236((byte[]) null);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[B")
    private static byte[] field5240 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    private int field5246;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field5248;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "J")
    private long field5242;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    private int[] field5243;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    private int[] field5244;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[I")
    private int[] field5245;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public int[] field5247;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
    public final int method2366() {
        int var1 = this.field5243.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5243[var4] >= 0 && this.field5247[var4] < var3) {
                var2 = var4;
                var3 = this.field5247[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public final int method2367(int arg0) {
        return this.method2373(arg0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([B)V")
    public final void method2368(byte[] arg0) {
        this.field5241.field3364 = arg0;
        this.field5241.field3320 = 10;
        int var2 = this.field5241.method1617((byte) 48);
        this.field5248 = this.field5241.method1617((byte) 48);
        this.field5246 = 500000;
        this.field5245 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5241.method1597(3641);
            int var6 = this.field5241.method1597(3641);
            if (var5 == 1297379947) {
                this.field5245[var3] = this.field5241.field3320;
                var3++;
            }
            this.field5241.field3320 += var6;
        }
        this.field5242 = 0L;
        this.field5243 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5243[var4] = this.field5245[var4];
        }
        this.field5247 = new int[var2];
        this.field5244 = new int[var2];
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()Z")
    public final boolean method2369() {
        return this.field5241.field3364 != null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()I")
    public final int method2370() {
        return this.field5243.length;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    private final int method2371(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5240[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5241.method1574(-63) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5241.method1574(-60) << 16;
            }
            return var8;
        }
        int var3 = this.field5241.method1574(-33);
        int var4 = this.field5241.method1582(-7745);
        if (var3 == 47) {
            this.field5241.field3320 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5241.method1616(false);
            var4 -= 3;
            int var6 = this.field5247[arg0];
            this.field5242 += (long) (this.field5246 - var5) * (long) var6;
            this.field5246 = var5;
            this.field5241.field3320 += var4;
            return 2;
        } else {
            this.field5241.field3320 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()V")
    public static void method2372() {
        field5240 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
    private final int method2373(int arg0) {
        byte var2 = this.field5241.field3364[this.field5241.field3320];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5244[arg0] = var3;
            this.field5241.field3320++;
        } else {
            var3 = this.field5244[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2371(arg0, var3);
        }
        int var4 = this.field5241.method1582(-7745);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5241.field3364[this.field5241.field3320] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5241.field3320++;
                this.field5244[arg0] = var5;
                return this.method2371(arg0, var5);
            }
        }
        this.field5241.field3320 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "()V")
    public final void method2374() {
        this.field5241.field3364 = null;
        this.field5245 = null;
        this.field5243 = null;
        this.field5247 = null;
        this.field5244 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final void method2375(int arg0) {
        this.field5241.field3320 = this.field5243[arg0];
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(J)V")
    public final void method2376(long arg0) {
        this.field5242 = arg0;
        int var3 = this.field5243.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5247[var4] = 0;
            this.field5244[var4] = 0;
            this.field5241.field3320 = this.field5245[var4];
            this.method2379(var4);
            this.field5243[var4] = this.field5241.field3320;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)J")
    public final long method2377(int arg0) {
        return (long) this.field5246 * (long) arg0 + this.field5242;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "()Z")
    public final boolean method2378() {
        int var1 = this.field5243.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5243[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public final void method2379(int arg0) {
        int var2 = this.field5241.method1582(-7745);
        this.field5247[arg0] += var2;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "()V")
    public final void method2380() {
        this.field5241.field3320 = -1;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public final void method2381(int arg0) {
        this.field5243[arg0] = this.field5241.field3320;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class373() {
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
    public class373(byte[] arg0) {
        this.method2368(arg0);
    }
}
