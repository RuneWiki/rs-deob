import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljp;")
    private class376 field249 = new class376(null);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[B")
    private static byte[] field248 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "J")
    private long field252;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
    private int[] field251;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    public int[] field254;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
    private int[] field255;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I", line = 13)
    private final int method124(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field248[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field249.method2398(-1372747256) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field249.method2398(-1372747256) << 16;
            }
            return var8;
        }
        int var3 = this.field249.method2398(-1372747256);
        int var4 = this.field249.method2392(-1);
        if (var3 == 47) {
            this.field249.field5459 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field249.method2373(1223262424);
            var4 -= 3;
            int var6 = this.field254[arg0];
            this.field252 += (long) (this.field253 - var5) * (long) var6;
            this.field253 = var5;
            this.field249.field5459 += var4;
            return 2;
        } else {
            this.field249.field5459 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I", line = 56)
    public final int method125() {
        int var1 = this.field255.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field255[var4] >= 0 && this.field254[var4] < var3) {
                var2 = var4;
                var3 = this.field254[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()I", line = 81)
    public final int method126() {
        return this.field255.length;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I", line = 85)
    private final int method127(int arg0) {
        byte var2 = this.field249.field5518[this.field249.field5459];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field251[arg0] = var3;
            this.field249.field5459++;
        } else {
            var3 = this.field251[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method124(arg0, var3);
        }
        int var4 = this.field249.method2392(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field249.field5518[this.field249.field5459] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field249.field5459++;
                this.field251[arg0] = var5;
                return this.method124(arg0, var5);
            }
        }
        this.field249.field5459 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I", line = 124)
    public final int method128(int arg0) {
        return this.method127(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 133)
    public final void method129(int arg0) {
        this.field255[arg0] = this.field249.field5459;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()Z", line = 137)
    public final boolean method130() {
        int var1 = this.field255.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field255[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 264)
    public class17() {
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V", line = 266)
    public class17(byte[] arg0) {
        this.method135(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()Z", line = 156)
    public final boolean method131() {
        return this.field249.field5518 != null;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V", line = 159)
    public final void method132(int arg0) {
        this.field249.field5459 = this.field255[arg0];
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "()V", line = 162)
    public final void method133() {
        this.field249.field5459 = -1;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V", line = 166)
    public final void method134(int arg0) {
        int var2 = this.field249.method2392(-1);
        this.field254[arg0] += var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([B)V", line = 171)
    public final void method135(byte[] arg0) {
        this.field249.field5518 = arg0;
        this.field249.field5459 = 10;
        int var2 = this.field249.method2359(-1);
        this.field256 = this.field249.method2359(-1);
        this.field253 = 500000;
        this.field250 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field249.method2384(121);
            int var6 = this.field249.method2384(71);
            if (var5 == 1297379947) {
                this.field250[var3] = this.field249.field5459;
                var3++;
            }
            this.field249.field5459 += var6;
        }
        this.field252 = 0L;
        this.field255 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field255[var4] = this.field250[var4];
        }
        this.field254 = new int[var2];
        this.field251 = new int[var2];
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "()V", line = 224)
    public final void method136() {
        this.field249.field5518 = null;
        this.field250 = null;
        this.field255 = null;
        this.field254 = null;
        this.field251 = null;
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "()V", line = 234)
    public static void method137() {
        field248 = null;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)J", line = 243)
    public final long method138(int arg0) {
        return (long) this.field253 * (long) arg0 + this.field252;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(J)V", line = 246)
    public final void method139(long arg0) {
        this.field252 = arg0;
        int var3 = this.field255.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field254[var4] = 0;
            this.field251[var4] = 0;
            this.field249.field5459 = this.field250[var4];
            this.method134(var4);
            this.field255[var4] = this.field249.field5459;
        }
    }
}
