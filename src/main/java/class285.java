import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class285 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lfd;")
    private class299 field4058 = new class299((byte[]) null);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[B")
    private static byte[] field4059 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    private int field4065;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "J")
    private long field4062;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[I")
    public int[] field4061;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
    private int[] field4063;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
    private int[] field4064;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
    private int[] field4066;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J", line = 5)
    public final long method1932(int arg0) {
        return (long) this.field4065 * (long) arg0 + this.field4062;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()V", line = 11)
    public final void method1933() {
        this.field4058.field4350 = null;
        this.field4066 = null;
        this.field4063 = null;
        this.field4061 = null;
        this.field4064 = null;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 21)
    public final void method1934(int arg0) {
        int var2 = this.field4058.method2076(false);
        this.field4061[arg0] += var2;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "()V", line = 25)
    public final void method1935() {
        this.field4058.field4351 = -1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V", line = 28)
    public final void method1936(byte[] arg0) {
        this.field4058.field4350 = arg0;
        this.field4058.field4351 = 10;
        int var2 = this.field4058.method2083((byte) -83);
        this.field4060 = this.field4058.method2083((byte) -74);
        this.field4065 = 500000;
        this.field4066 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4058.method2062(-25795);
            int var5 = this.field4058.method2062(-25795);
            if (var4 == 1297379947) {
                this.field4066[var3] = this.field4058.field4351;
                var3++;
            }
            this.field4058.field4351 += var5;
        }
        this.field4062 = 0L;
        this.field4063 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4063[var6] = this.field4066[var6];
        }
        this.field4061 = new int[var2];
        this.field4064 = new int[var2];
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(J)V", line = 81)
    public final void method1937(long arg0) {
        this.field4062 = arg0;
        int var3 = this.field4063.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4061[var4] = 0;
            this.field4064[var4] = 0;
            this.field4058.field4351 = this.field4066[var4];
            this.method1934(var4);
            this.field4063[var4] = this.field4058.field4351;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 99)
    public final void method1938(int arg0) {
        this.field4058.field4351 = this.field4063[arg0];
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "()Z", line = 103)
    public final boolean method1939() {
        return this.field4058.field4350 != null;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "()Z", line = 107)
    public final boolean method1940() {
        int var1 = this.field4063.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4063[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "()I", line = 123)
    public final int method1941() {
        int var1 = this.field4063.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4063[var4] >= 0 && this.field4061[var4] < var3) {
                var2 = var4;
                var3 = this.field4061[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "()V", line = 148)
    public static void method1942() {
        field4059 = null;
    }

    @OriginalMember(owner = "client!go", name = "g", descriptor = "()I", line = 155)
    public final int method1943() {
        return this.field4063.length;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I", line = 160)
    private final int method1944(int arg0) {
        byte var2 = this.field4058.field4350[this.field4058.field4351];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4064[arg0] = var3;
            this.field4058.field4351++;
        } else {
            var3 = this.field4064[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1947(arg0, var3);
        }
        int var4 = this.field4058.method2076(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4058.field4350[this.field4058.field4351] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4058.field4351++;
                this.field4064[arg0] = var5;
                return this.method1947(arg0, var5);
            }
        }
        this.field4058.field4351 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 198)
    public final void method1945(int arg0) {
        this.field4063[arg0] = this.field4058.field4351;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 264)
    public class285() {
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V", line = 266)
    public class285(byte[] arg0) {
        this.method1936(arg0);
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I", line = 214)
    public final int method1946(int arg0) {
        return this.method1944(arg0);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I", line = 223)
    private final int method1947(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4059[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4058.method2096((byte) -122) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4058.method2096((byte) -122) << 16;
            }
            return var8;
        }
        int var3 = this.field4058.method2096((byte) -122);
        int var4 = this.field4058.method2076(false);
        if (var3 == 47) {
            this.field4058.field4351 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4058.method2085((byte) 86);
            var4 -= 3;
            int var6 = this.field4061[arg0];
            this.field4062 += (long) (this.field4065 - var5) * (long) var6;
            this.field4065 = var5;
            this.field4058.field4351 += var4;
            return 2;
        } else {
            this.field4058.field4351 += var4;
            return 3;
        }
    }
}
