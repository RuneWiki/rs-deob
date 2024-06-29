import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lqc;")
    private class114 field2212 = new class114(null);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[B")
    private static byte[] field2213 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    private int field2214;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "J")
    private long field2216;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[I")
    private int[] field2217;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    public int[] field2218;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
    private int[] field2219;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
    private int[] field2220;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
    private final int method724(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2213[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2212.method957((byte) 80) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2212.method957((byte) 19) << 16;
            }
            return var8;
        }
        int var3 = this.field2212.method957((byte) 61);
        int var4 = this.field2212.method960((byte) -128);
        if (var3 == 47) {
            this.field2212.field2816 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2212.method933(-108);
            var4 -= 3;
            int var6 = this.field2218[arg0];
            this.field2216 += (long) (this.field2214 - var5) * (long) var6;
            this.field2214 = var5;
            this.field2212.field2816 += var4;
            return 2;
        } else {
            this.field2212.field2816 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()Z")
    public final boolean method725() {
        int var1 = this.field2220.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2220[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
    public final int method726(int arg0) {
        return this.method731(arg0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method727(int arg0) {
        this.field2220[arg0] = this.field2212.field2816;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([B)V")
    public final void method728(byte[] arg0) {
        this.field2212.field2880 = arg0;
        this.field2212.field2816 = 10;
        int var2 = this.field2212.method944((byte) 110);
        this.field2215 = this.field2212.method944((byte) 117);
        this.field2214 = 500000;
        this.field2217 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2212.method973(-120);
            int var6 = this.field2212.method973(-124);
            if (var5 == 1297379947) {
                this.field2217[var3] = this.field2212.field2816;
                var3++;
            }
            this.field2212.field2816 += var6;
        }
        this.field2216 = 0L;
        this.field2220 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2220[var4] = this.field2217[var4];
        }
        this.field2218 = new int[var2];
        this.field2219 = new int[var2];
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
    public static void method729() {
        field2213 = null;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()Z")
    public final boolean method730() {
        return this.field2212.field2880 != null;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
    private final int method731(int arg0) {
        byte var2 = this.field2212.field2880[this.field2212.field2816];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2219[arg0] = var3;
            this.field2212.field2816++;
        } else {
            var3 = this.field2219[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method724(arg0, var3);
        }
        int var4 = this.field2212.method960((byte) -126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2212.field2880[this.field2212.field2816] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2212.field2816++;
                this.field2219[arg0] = var5;
                return this.method724(arg0, var5);
            }
        }
        this.field2212.field2816 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
    public final int method732() {
        int var1 = this.field2220.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2220[var4] >= 0 && this.field2218[var4] < var3) {
                var2 = var4;
                var3 = this.field2218[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()V")
    public final void method733() {
        this.field2212.field2880 = null;
        this.field2217 = null;
        this.field2220 = null;
        this.field2218 = null;
        this.field2219 = null;
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "()V")
    public final void method734() {
        this.field2212.field2816 = -1;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public final void method735(int arg0) {
        int var2 = this.field2212.method960((byte) -125);
        this.field2218[arg0] += var2;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public final void method736(int arg0) {
        this.field2212.field2816 = this.field2220[arg0];
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)J")
    public final long method737(int arg0) {
        return (long) this.field2214 * (long) arg0 + this.field2216;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(J)V")
    public final void method738(long arg0) {
        this.field2216 = arg0;
        int var3 = this.field2220.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2218[var4] = 0;
            this.field2219[var4] = 0;
            this.field2212.field2816 = this.field2217[var4];
            this.method735(var4);
            this.field2220[var4] = this.field2212.field2816;
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "()I")
    public final int method739() {
        return this.field2220.length;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class88() {
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
    public class88(byte[] arg0) {
        this.method728(arg0);
    }
}
