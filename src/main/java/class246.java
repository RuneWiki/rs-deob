import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class246 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lfd;")
    private class418 field3286 = new class418(null);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[B")
    private static byte[] field3285 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    private int field3287;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "J")
    private long field3290;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
    public int[] field3289;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "[I")
    private int[] field3291;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
    private int[] field3292;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    private int[] field3293;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 6)
    public final void method1535(int arg0) {
        int var2 = this.field3286.method2382(120);
        this.field3289[arg0] += var2;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V", line = 16)
    public final void method1536() {
        this.field3286.field5393 = null;
        this.field3291 = null;
        this.field3293 = null;
        this.field3289 = null;
        this.field3292 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 25)
    public final void method1537(int arg0) {
        this.field3286.field5367 = this.field3293[arg0];
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I", line = 29)
    public final int method1538(int arg0) {
        return this.method1542(arg0);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()I", line = 36)
    public final int method1539() {
        int var1 = this.field3293.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3293[var4] >= 0 && this.field3289[var4] < var3) {
                var2 = var4;
                var3 = this.field3289[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)J", line = 62)
    public final long method1540(int arg0) {
        return (long) this.field3287 * (long) arg0 + this.field3290;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 65)
    public final void method1541(int arg0) {
        this.field3293[arg0] = this.field3286.field5367;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I", line = 69)
    private final int method1542(int arg0) {
        byte var2 = this.field3286.field5393[this.field3286.field5367];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3292[arg0] = var3;
            this.field3286.field5367++;
        } else {
            var3 = this.field3292[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1547(arg0, var3);
        }
        int var4 = this.field3286.method2382(124);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3286.field5393[this.field3286.field5367] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3286.field5367++;
                this.field3292[arg0] = var5;
                return this.method1547(arg0, var5);
            }
        }
        this.field3286.field5367 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V", line = 107)
    public static void method1543() {
        field3285 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()Z", line = 114)
    public final boolean method1544() {
        int var1 = this.field3293.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3293[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "()Z", line = 130)
    public final boolean method1545() {
        return this.field3286.field5393 != null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(J)V", line = 133)
    public final void method1546(long arg0) {
        this.field3290 = arg0;
        int var3 = this.field3293.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3289[var4] = 0;
            this.field3292[var4] = 0;
            this.field3286.field5367 = this.field3291[var4];
            this.method1535(var4);
            this.field3293[var4] = this.field3286.field5367;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I", line = 151)
    private final int method1547(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3285[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3286.method2396(106) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3286.method2396(85) << 16;
            }
            return var8;
        }
        int var3 = this.field3286.method2396(-117);
        int var4 = this.field3286.method2382(124);
        if (var3 == 47) {
            this.field3286.field5367 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3286.method2364(-87);
            var4 -= 3;
            int var6 = this.field3289[arg0];
            this.field3290 += (long) (this.field3287 - var5) * (long) var6;
            this.field3287 = var5;
            this.field3286.field5367 += var4;
            return 2;
        } else {
            this.field3286.field5367 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "()V", line = 193)
    public final void method1548() {
        this.field3286.field5367 = -1;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "()I", line = 197)
    public final int method1549() {
        return this.field3293.length;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([B)V", line = 201)
    public final void method1550(byte[] arg0) {
        this.field3286.field5393 = arg0;
        this.field3286.field5367 = 10;
        int var2 = this.field3286.method2393(-30727);
        this.field3288 = this.field3286.method2393(-30727);
        this.field3287 = 500000;
        this.field3291 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3286.method2355(85);
            int var6 = this.field3286.method2355(51);
            if (var5 == 1297379947) {
                this.field3291[var3] = this.field3286.field5367;
                var3++;
            }
            this.field3286.field5367 += var6;
        }
        this.field3290 = 0L;
        this.field3293 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3293[var4] = this.field3291[var4];
        }
        this.field3289 = new int[var2];
        this.field3292 = new int[var2];
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 264)
    public class246() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V", line = 266)
    public class246(byte[] arg0) {
        this.method1550(arg0);
    }
}
