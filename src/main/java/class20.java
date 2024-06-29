import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class20 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lra;")
    private class41 field265 = new class41((byte[]) null);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[B")
    private static byte[] field264 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "J")
    private long field272;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
    private int[] field266;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public int[] field270;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I", line = 5)
    private final int method121(int arg0) {
        byte var2 = this.field265.field772[this.field265.field738];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field269[arg0] = var3;
            this.field265.field738++;
        } else {
            var3 = this.field269[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method124(arg0, var3);
        }
        int var4 = this.field265.method333(-92);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field265.field772[this.field265.field738] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field265.field738++;
                this.field269[arg0] = var5;
                return this.method124(arg0, var5);
            }
        }
        this.field265.field738 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)I", line = 45)
    public final int method122(int arg0) {
        return this.method121(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 55)
    public final void method123() {
        this.field265.field772 = null;
        this.field271 = null;
        this.field266 = null;
        this.field270 = null;
        this.field269 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I", line = 64)
    private final int method124(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field264[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field265.method357(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field265.method357(false) << 16;
            }
            return var8;
        }
        int var3 = this.field265.method357(false);
        int var4 = this.field265.method333(-128);
        if (var3 == 47) {
            this.field265.field738 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field265.method349((byte) -121);
            var4 -= 3;
            int var6 = this.field270[arg0];
            this.field272 += (long) (this.field268 - var5) * (long) var6;
            this.field268 = var5;
            this.field265.field738 += var4;
            return 2;
        } else {
            this.field265.field738 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()I", line = 106)
    public final int method125() {
        return this.field266.length;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 110)
    public final void method126(int arg0) {
        int var2 = this.field265.method333(-108);
        this.field270[arg0] += var2;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()Z", line = 115)
    public final boolean method127() {
        int var1 = this.field266.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field266[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(J)V", line = 129)
    public final void method128(long arg0) {
        this.field272 = arg0;
        int var3 = this.field266.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field270[var4] = 0;
            this.field269[var4] = 0;
            this.field265.field738 = this.field271[var4];
            this.method126(var4);
            this.field266[var4] = this.field265.field738;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()Z", line = 148)
    public final boolean method129() {
        return this.field265.field772 != null;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()I", line = 155)
    public final int method130() {
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

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([B)V", line = 180)
    public final void method131(byte[] arg0) {
        this.field265.field772 = arg0;
        this.field265.field738 = 10;
        int var2 = this.field265.method346(-16);
        this.field267 = this.field265.method346(-16);
        this.field268 = 500000;
        this.field271 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field265.method327(4);
            int var5 = this.field265.method327(4);
            if (var4 == 1297379947) {
                this.field271[var3] = this.field265.field738;
                var3++;
            }
            this.field265.field738 += var5;
        }
        this.field272 = 0L;
        this.field266 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field266[var6] = this.field271[var6];
        }
        this.field270 = new int[var2];
        this.field269 = new int[var2];
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 234)
    public final void method132(int arg0) {
        this.field266[arg0] = this.field265.field738;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)J", line = 238)
    public final long method133(int arg0) {
        return (long) this.field268 * (long) arg0 + this.field272;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 244)
    public final void method134(int arg0) {
        this.field265.field738 = this.field266[arg0];
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()V", line = 247)
    public final void method135() {
        this.field265.field738 = -1;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 264)
    public class20() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V", line = 266)
    public class20(byte[] arg0) {
        this.method131(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()V", line = 254)
    public static void method136() {
        field264 = null;
    }
}
