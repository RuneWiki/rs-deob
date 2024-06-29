import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class138 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lbg;")
    private class194 field2362 = new class194((byte[]) null);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[B")
    private static byte[] field2363 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "J")
    private long field2367;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    private int[] field2366;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
    public int[] field2368;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[I")
    private int[] field2369;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
    private int[] field2370;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J", line = 3)
    public final long method900(int arg0) {
        return (long) this.field2365 * (long) arg0 + this.field2367;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 7)
    public final void method901(int arg0) {
        int var2 = this.field2362.method1336(-67);
        this.field2368[arg0] += var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I", line = 14)
    private final int method902(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2363[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2362.method1325(7627) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2362.method1325(7627) << 16;
            }
            return var8;
        }
        int var3 = this.field2362.method1325(7627);
        int var4 = this.field2362.method1336(31);
        if (var3 == 47) {
            this.field2362.field3380 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2362.method1349((byte) 91);
            var4 -= 3;
            int var6 = this.field2368[arg0];
            this.field2367 += (long) (this.field2365 - var5) * (long) var6;
            this.field2365 = var5;
            this.field2362.field3380 += var4;
            return 2;
        } else {
            this.field2362.field3380 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I", line = 59)
    public final int method903(int arg0) {
        return this.method913(arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()I", line = 66)
    public final int method904() {
        return this.field2366.length;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 69)
    public final void method905(int arg0) {
        this.field2366[arg0] = this.field2362.field3380;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(J)V", line = 72)
    public final void method906(long arg0) {
        this.field2367 = arg0;
        int var3 = this.field2366.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2368[var4] = 0;
            this.field2370[var4] = 0;
            this.field2362.field3380 = this.field2369[var4];
            this.method901(var4);
            this.field2366[var4] = this.field2362.field3380;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 90)
    public final void method907(int arg0) {
        this.field2362.field3380 = this.field2366[arg0];
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V", line = 94)
    public final void method908() {
        this.field2362.field3380 = -1;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V", line = 99)
    public static void method909() {
        field2363 = null;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V", line = 104)
    public final void method910() {
        this.field2362.field3417 = null;
        this.field2369 = null;
        this.field2366 = null;
        this.field2368 = null;
        this.field2370 = null;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()Z", line = 114)
    public final boolean method911() {
        return this.field2362.field3417 != null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B)V", line = 120)
    public final void method912(byte[] arg0) {
        this.field2362.field3417 = arg0;
        this.field2362.field3380 = 10;
        int var2 = this.field2362.method1308(-116);
        this.field2364 = this.field2362.method1308(-16);
        this.field2365 = 500000;
        this.field2369 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2362.method1350(false);
            int var5 = this.field2362.method1350(false);
            if (var4 == 1297379947) {
                this.field2369[var3] = this.field2362.field3380;
                var3++;
            }
            this.field2362.field3380 += var5;
        }
        this.field2367 = 0L;
        this.field2366 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2366[var6] = this.field2369[var6];
        }
        this.field2368 = new int[var2];
        this.field2370 = new int[var2];
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)I", line = 174)
    private final int method913(int arg0) {
        byte var2 = this.field2362.field3417[this.field2362.field3380];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2370[arg0] = var3;
            this.field2362.field3380++;
        } else {
            var3 = this.field2370[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method902(arg0, var3);
        }
        int var4 = this.field2362.method1336(-50);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2362.field3417[this.field2362.field3380] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2362.field3380++;
                this.field2370[arg0] = var5;
                return this.method902(arg0, var5);
            }
        }
        this.field2362.field3380 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "()Z", line = 213)
    public final boolean method914() {
        int var1 = this.field2366.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2366[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 264)
    public class138() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V", line = 266)
    public class138(byte[] arg0) {
        this.method912(arg0);
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "()I", line = 236)
    public final int method915() {
        int var1 = this.field2366.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2366[var4] >= 0 && this.field2368[var4] < var3) {
                var2 = var4;
                var3 = this.field2368[var4];
            }
        }
        return var2;
    }
}
