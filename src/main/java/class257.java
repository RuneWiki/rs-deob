import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class257 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lwe;")
    private class47 field4272 = new class47((byte[]) null);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[B")
    private static byte[] field4271 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    private int field4275;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "J")
    private long field4279;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    private int[] field4273;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public int[] field4274;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
    private int[] field4276;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    private int[] field4277;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I", line = 4)
    private final int method1855(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4271[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4272.method368(-101) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4272.method368(-127) << 16;
            }
            return var8;
        }
        int var3 = this.field4272.method368(-111);
        int var4 = this.field4272.method351(-23095);
        if (var3 == 47) {
            this.field4272.field857 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4272.method389((byte) 123);
            var4 -= 3;
            int var6 = this.field4274[arg0];
            this.field4279 += (long) (this.field4275 - var5) * (long) var6;
            this.field4275 = var5;
            this.field4272.field857 += var4;
            return 2;
        } else {
            this.field4272.field857 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()I", line = 50)
    public final int method1856() {
        int var1 = this.field4277.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4277[var4] >= 0 && this.field4274[var4] < var3) {
                var2 = var4;
                var3 = this.field4274[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([B)V", line = 80)
    public final void method1857(byte[] arg0) {
        this.field4272.field860 = arg0;
        this.field4272.field857 = 10;
        int var2 = this.field4272.method379(-2);
        this.field4278 = this.field4272.method379(-2);
        this.field4275 = 500000;
        this.field4276 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4272.method373((byte) 36);
            int var5 = this.field4272.method373((byte) 36);
            if (var4 == 1297379947) {
                this.field4276[var3] = this.field4272.field857;
                var3++;
            }
            this.field4272.field857 += var5;
        }
        this.field4279 = 0L;
        this.field4277 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4277[var6] = this.field4276[var6];
        }
        this.field4274 = new int[var2];
        this.field4273 = new int[var2];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 133)
    public final void method1858(int arg0) {
        this.field4272.field857 = this.field4277[arg0];
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()Z", line = 136)
    public final boolean method1859() {
        return this.field4272.field860 != null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()V", line = 140)
    public final void method1860() {
        this.field4272.field860 = null;
        this.field4276 = null;
        this.field4277 = null;
        this.field4274 = null;
        this.field4273 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I", line = 150)
    public final int method1861(int arg0) {
        return this.method1863(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()I", line = 160)
    public final int method1862() {
        return this.field4277.length;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I", line = 164)
    private final int method1863(int arg0) {
        byte var2 = this.field4272.field860[this.field4272.field857];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4273[arg0] = var3;
            this.field4272.field857++;
        } else {
            var3 = this.field4273[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1855(arg0, var3);
        }
        int var4 = this.field4272.method351(-23095);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4272.field860[this.field4272.field857] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4272.field857++;
                this.field4273[arg0] = var5;
                return this.method1855(arg0, var5);
            }
        }
        this.field4272.field857 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(J)V", line = 202)
    public final void method1864(long arg0) {
        this.field4279 = arg0;
        int var3 = this.field4277.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4274[var4] = 0;
            this.field4273[var4] = 0;
            this.field4272.field857 = this.field4276[var4];
            this.method1867(var4);
            this.field4277[var4] = this.field4272.field857;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "()V", line = 220)
    public static void method1865() {
        field4271 = null;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V", line = 223)
    public final void method1866(int arg0) {
        this.field4277[arg0] = this.field4272.field857;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V", line = 227)
    public final void method1867(int arg0) {
        int var2 = this.field4272.method351(-23095);
        this.field4274[arg0] += var2;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "()V", line = 231)
    public final void method1868() {
        this.field4272.field857 = -1;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "()Z", line = 235)
    public final boolean method1869() {
        int var1 = this.field4277.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4277[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)J", line = 250)
    public final long method1870(int arg0) {
        return (long) this.field4275 * (long) arg0 + this.field4279;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 264)
    public class257() {
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V", line = 266)
    public class257(byte[] arg0) {
        this.method1857(arg0);
    }
}
