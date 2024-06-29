import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lwm;")
    private class254 field247 = new class254((byte[]) null);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "[B")
    private static byte[] field248 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "J")
    private long field250;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    private int[] field249;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    private int[] field252;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
    public int[] field253;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
    private int[] field254;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()Z", line = 6)
    public final boolean method173() {
        return this.field247.field3840 != null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V", line = 9)
    public static void method174() {
        field248 = null;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()Z", line = 13)
    public final boolean method175() {
        int var1 = this.field249.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field249[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V", line = 27)
    public final void method176() {
        this.field247.field3840 = null;
        this.field252 = null;
        this.field249 = null;
        this.field253 = null;
        this.field254 = null;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()I", line = 36)
    public final int method177() {
        return this.field249.length;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V", line = 41)
    public final void method178(long arg0) {
        this.field250 = arg0;
        int var3 = this.field249.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field253[var4] = 0;
            this.field254[var4] = 0;
            this.field247.field3866 = this.field252[var4];
            this.method179(var4);
            this.field249[var4] = this.field247.field3866;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 60)
    public final void method179(int arg0) {
        int var2 = this.field247.method1764((byte) -55);
        this.field253[arg0] += var2;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 64)
    public final void method180(int arg0) {
        this.field247.field3866 = this.field249[arg0];
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I", line = 71)
    public final int method181(int arg0) {
        return this.method185(arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([B)V", line = 78)
    public final void method182(byte[] arg0) {
        this.field247.field3840 = arg0;
        this.field247.field3866 = 10;
        int var2 = this.field247.method1755(false);
        this.field251 = this.field247.method1755(false);
        this.field255 = 500000;
        this.field252 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field247.method1741(-32769);
            int var5 = this.field247.method1741(-32769);
            if (var4 == 1297379947) {
                this.field252[var3] = this.field247.field3866;
                var3++;
            }
            this.field247.field3866 += var5;
        }
        this.field250 = 0L;
        this.field249 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field249[var6] = this.field252[var6];
        }
        this.field253 = new int[var2];
        this.field254 = new int[var2];
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 131)
    public final void method183(int arg0) {
        this.field249[arg0] = this.field247.field3866;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 264)
    public class22() {
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V", line = 266)
    public class22(byte[] arg0) {
        this.method182(arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I", line = 144)
    private final int method184(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field248[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field247.method1774((byte) -1) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field247.method1774((byte) 103) << 16;
            }
            return var8;
        }
        int var3 = this.field247.method1774((byte) 67);
        int var4 = this.field247.method1764((byte) -55);
        if (var3 == 47) {
            this.field247.field3866 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field247.method1758((byte) 80);
            var4 -= 3;
            int var6 = this.field253[arg0];
            this.field250 += (long) (this.field255 - var5) * (long) var6;
            this.field255 = var5;
            this.field247.field3866 += var4;
            return 2;
        } else {
            this.field247.field3866 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)I", line = 188)
    private final int method185(int arg0) {
        byte var2 = this.field247.field3840[this.field247.field3866];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field254[arg0] = var3;
            this.field247.field3866++;
        } else {
            var3 = this.field254[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method184(arg0, var3);
        }
        int var4 = this.field247.method1764((byte) -55);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field247.field3840[this.field247.field3866] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field247.field3866++;
                this.field254[arg0] = var5;
                return this.method184(arg0, var5);
            }
        }
        this.field247.field3866 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()I", line = 230)
    public final int method186() {
        int var1 = this.field249.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field249[var4] >= 0 && this.field253[var4] < var3) {
                var2 = var4;
                var3 = this.field253[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)J", line = 255)
    public final long method187(int arg0) {
        return (long) this.field255 * (long) arg0 + this.field250;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "()V", line = 260)
    public final void method188() {
        this.field247.field3866 = -1;
    }
}
