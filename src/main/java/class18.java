import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class18 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lnj;")
    private class228 field262 = new class228((byte[]) null);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[B")
    private static byte[] field263 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
    private long field264;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
    private int[] field265;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[I")
    private int[] field266;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "[I")
    public int[] field270;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
    private final int method123(int arg0) {
        byte var2 = this.field262.field3040[this.field262.field3029];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field269[arg0] = var3;
            this.field262.field3029++;
        } else {
            var3 = this.field269[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method136(arg0, var3);
        }
        int var4 = this.field262.method1334(-8714);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field262.field3040[this.field262.field3029] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field262.field3029++;
                this.field269[arg0] = var5;
                return this.method136(arg0, var5);
            }
        }
        this.field262.field3029 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
    public final int method124(int arg0) {
        return this.method123(arg0);
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public final void method125(int arg0) {
        int var2 = this.field262.method1334(-8714);
        this.field270[arg0] += var2;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public final void method126(int arg0) {
        this.field266[arg0] = this.field262.field3029;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
    public final int method127() {
        int var1 = this.field266.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field266[var4] >= 0 && this.field270[var4] < var3) {
                var2 = var4;
                var3 = this.field270[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public final void method128(int arg0) {
        this.field262.field3029 = this.field266[arg0];
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)J")
    public final long method129(int arg0) {
        return (long) this.field268 * (long) arg0 + this.field264;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V")
    public final void method130() {
        this.field262.field3040 = null;
        this.field265 = null;
        this.field266 = null;
        this.field270 = null;
        this.field269 = null;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V")
    public static void method131() {
        field263 = null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()I")
    public final int method132() {
        return this.field266.length;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V")
    public final void method133() {
        this.field262.field3029 = -1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([B)V")
    public final void method134(byte[] arg0) {
        this.field262.field3040 = arg0;
        this.field262.field3029 = 10;
        int var2 = this.field262.method1343(255);
        this.field267 = this.field262.method1343(255);
        this.field268 = 500000;
        this.field265 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field262.method1344((byte) 123);
            int var6 = this.field262.method1344((byte) 108);
            if (var5 == 1297379947) {
                this.field265[var3] = this.field262.field3029;
                var3++;
            }
            this.field262.field3029 += var6;
        }
        this.field264 = 0L;
        this.field266 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field266[var4] = this.field265[var4];
        }
        this.field270 = new int[var2];
        this.field269 = new int[var2];
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()Z")
    public final boolean method135() {
        return this.field262.field3040 != null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
    private final int method136(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field263[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field262.method1348(-92) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field262.method1348(-121) << 16;
            }
            return var8;
        }
        int var3 = this.field262.method1348(-101);
        int var4 = this.field262.method1334(-8714);
        if (var3 == 47) {
            this.field262.field3029 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field262.method1333((byte) -79);
            var4 -= 3;
            int var6 = this.field270[arg0];
            this.field264 += (long) (this.field268 - var5) * (long) var6;
            this.field268 = var5;
            this.field262.field3029 += var4;
            return 2;
        } else {
            this.field262.field3029 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(J)V")
    public final void method137(long arg0) {
        this.field264 = arg0;
        int var3 = this.field266.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field270[var4] = 0;
            this.field269[var4] = 0;
            this.field262.field3029 = this.field265[var4];
            this.method125(var4);
            this.field266[var4] = this.field262.field3029;
        }
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "()Z")
    public final boolean method138() {
        int var1 = this.field266.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field266[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class18() {
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([B)V")
    public class18(byte[] arg0) {
        this.method134(arg0);
    }
}
