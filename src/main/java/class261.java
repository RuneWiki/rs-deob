import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class261 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lig;")
    private class136 field4142 = new class136((byte[]) null);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[B")
    private static byte[] field4141 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "J")
    private long field4147;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    private int[] field4143;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[I")
    private int[] field4144;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    public int[] field4145;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
    private int[] field4148;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(J)V")
    public final void method1741(long arg0) {
        this.field4147 = arg0;
        int var3 = this.field4148.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4145[var4] = 0;
            this.field4144[var4] = 0;
            this.field4142.field2231 = this.field4143[var4];
            this.method1751(var4);
            this.field4148[var4] = this.field4142.field2231;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public final void method1742() {
        this.field4142.field2231 = -1;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public final void method1743() {
        this.field4142.field2263 = null;
        this.field4143 = null;
        this.field4148 = null;
        this.field4145 = null;
        this.field4144 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
    private final int method1744(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4141[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4142.method1012(4) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4142.method1012(4) << 16;
            }
            return var8;
        }
        int var3 = this.field4142.method1012(4);
        int var4 = this.field4142.method987(2);
        if (var3 == 47) {
            this.field4142.field2231 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4142.method1009(108);
            var4 -= 3;
            int var6 = this.field4145[arg0];
            this.field4147 += (long) (this.field4149 - var5) * (long) var6;
            this.field4149 = var5;
            this.field4142.field2231 += var4;
            return 2;
        } else {
            this.field4142.field2231 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
    public final void method1745(byte[] arg0) {
        this.field4142.field2263 = arg0;
        this.field4142.field2231 = 10;
        int var2 = this.field4142.method996(65280);
        this.field4146 = this.field4142.method996(65280);
        this.field4149 = 500000;
        this.field4143 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4142.method1022(95);
            int var6 = this.field4142.method1022(-117);
            if (var5 == 1297379947) {
                this.field4143[var3] = this.field4142.field2231;
                var3++;
            }
            this.field4142.field2231 += var6;
        }
        this.field4147 = 0L;
        this.field4148 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4148[var4] = this.field4143[var4];
        }
        this.field4145 = new int[var2];
        this.field4144 = new int[var2];
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public static void method1746() {
        field4141 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()Z")
    public final boolean method1747() {
        int var1 = this.field4148.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4148[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method1748(int arg0) {
        this.field4148[arg0] = this.field4142.field2231;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
    public final boolean method1749() {
        return this.field4142.field2263 != null;
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()I")
    public final int method1750() {
        int var1 = this.field4148.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4148[var4] >= 0 && this.field4145[var4] < var3) {
                var2 = var4;
                var3 = this.field4145[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public final void method1751(int arg0) {
        int var2 = this.field4142.method987(2);
        this.field4145[arg0] += var2;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
    private final int method1752(int arg0) {
        byte var2 = this.field4142.field2263[this.field4142.field2231];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4144[arg0] = var3;
            this.field4142.field2231++;
        } else {
            var3 = this.field4144[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1744(arg0, var3);
        }
        int var4 = this.field4142.method987(2);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4142.field2263[this.field4142.field2231] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4142.field2231++;
                this.field4144[arg0] = var5;
                return this.method1744(arg0, var5);
            }
        }
        this.field4142.field2231 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "()I")
    public final int method1753() {
        return this.field4148.length;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
    public final int method1754(int arg0) {
        return this.method1752(arg0);
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    public final void method1755(int arg0) {
        this.field4142.field2231 = this.field4148[arg0];
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)J")
    public final long method1756(int arg0) {
        return (long) this.field4149 * (long) arg0 + this.field4147;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
    public class261(byte[] arg0) {
        this.method1745(arg0);
    }
}
