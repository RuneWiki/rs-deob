import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class436 {

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Lib;")
    private class163 field6386 = new class163(null);

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[B")
    private static byte[] field6390 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    private int field6388;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public int field6391;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "J")
    private long field6393;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[I")
    private int[] field6387;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "[I")
    public int[] field6389;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[I")
    private int[] field6392;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
    private int[] field6394;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 4)
    public final void method3330(int arg0) {
        int var2 = this.field6386.method1424(false);
        this.field6389[arg0] += var2;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "()I", line = 9)
    public final int method3331() {
        int var1 = this.field6394.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6394[var4] >= 0 && this.field6389[var4] < var3) {
                var2 = var4;
                var3 = this.field6389[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)I", line = 37)
    private final int method3332(int arg0) {
        byte var2 = this.field6386.field2209[this.field6386.field2201];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6392[arg0] = var3;
            this.field6386.field2201++;
        } else {
            var3 = this.field6392[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3339(arg0, var3);
        }
        int var4 = this.field6386.method1424(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6386.field2209[this.field6386.field2201] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6386.field2201++;
                this.field6392[arg0] = var5;
                return this.method3339(arg0, var5);
            }
        }
        this.field6386.field2201 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 263)
    public class436() {
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "([B)V", line = 265)
    public class436(byte[] arg0) {
        this.method3340(arg0);
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "()Z", line = 81)
    public final boolean method3333() {
        return this.field6386.field2209 != null;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "()I", line = 84)
    public final int method3334() {
        return this.field6394.length;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "()V", line = 88)
    public final void method3335() {
        this.field6386.field2209 = null;
        this.field6387 = null;
        this.field6394 = null;
        this.field6389 = null;
        this.field6392 = null;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "()Z", line = 106)
    public final boolean method3336() {
        int var1 = this.field6394.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6394[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(J)V", line = 121)
    public final void method3337(long arg0) {
        this.field6393 = arg0;
        int var3 = this.field6394.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6389[var4] = 0;
            this.field6392[var4] = 0;
            this.field6386.field2201 = this.field6387[var4];
            this.method3330(var4);
            this.field6394[var4] = this.field6386.field2201;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)I", line = 142)
    public final int method3338(int arg0) {
        return this.method3332(arg0);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I", line = 148)
    private final int method3339(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6390[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6386.method1455((byte) 62) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6386.method1455((byte) 62) << 16;
            }
            return var8;
        }
        int var3 = this.field6386.method1455((byte) 62);
        int var4 = this.field6386.method1424(false);
        if (var3 == 47) {
            this.field6386.field2201 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6386.method1436((byte) 54);
            var4 -= 3;
            int var6 = this.field6389[arg0];
            this.field6393 += (long) (this.field6388 - var5) * (long) var6;
            this.field6388 = var5;
            this.field6386.field2201 += var4;
            return 2;
        } else {
            this.field6386.field2201 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "([B)V", line = 191)
    public final void method3340(byte[] arg0) {
        this.field6386.field2209 = arg0;
        this.field6386.field2201 = 10;
        int var2 = this.field6386.method1445((byte) 115);
        this.field6391 = this.field6386.method1445((byte) 114);
        this.field6388 = 500000;
        this.field6387 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6386.method1453((byte) 100);
            int var6 = this.field6386.method1453((byte) 92);
            if (var5 == 1297379947) {
                this.field6387[var3] = this.field6386.field2201;
                var3++;
            }
            this.field6386.field2201 += var6;
        }
        this.field6393 = 0L;
        this.field6394 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6394[var4] = this.field6387[var4];
        }
        this.field6389 = new int[var2];
        this.field6392 = new int[var2];
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)J", line = 248)
    public final long method3341(int arg0) {
        return (long) this.field6388 * (long) arg0 + this.field6393;
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "()V", line = 251)
    public final void method3342() {
        this.field6386.field2201 = -1;
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V", line = 254)
    public final void method3343(int arg0) {
        this.field6394[arg0] = this.field6386.field2201;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 257)
    public final void method3344(int arg0) {
        this.field6386.field2201 = this.field6394[arg0];
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "()V", line = 260)
    public static void method3345() {
        field6390 = null;
    }
}
