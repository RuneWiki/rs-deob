import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class20 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lff;")
    private class53 field347 = new class53(null);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[B")
    private static byte[] field351 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "J")
    private long field348;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
    private int[] field350;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
    public int[] field353;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
    private int[] field355;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Z")
    public final boolean method123() {
        int var1 = this.field350.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field350[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    private final int method124(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field351[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field347.method400(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field347.method400(255) << 16;
            }
            return var8;
        }
        int var3 = this.field347.method400(255);
        int var4 = this.field347.method397(128);
        if (var3 == 47) {
            this.field347.field1000 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field347.method422((byte) 87);
            var4 -= 3;
            int var6 = this.field353[arg0];
            this.field348 += (long) (this.field352 - var5) * (long) var6;
            this.field352 = var5;
            this.field347.field1000 += var4;
            return 2;
        } else {
            this.field347.field1000 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public final int method125() {
        int var1 = this.field350.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field350[var4] >= 0 && this.field353[var4] < var3) {
                var2 = var4;
                var3 = this.field353[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
    public static void method126() {
        field351 = null;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
    public final void method127() {
        this.field347.field1000 = -1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method128(int arg0) {
        int var2 = this.field347.method397(128);
        this.field353[arg0] += var2;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
    public final int method129(int arg0) {
        return this.method132(arg0);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public final void method130(int arg0) {
        this.field350[arg0] = this.field347.field1000;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()I")
    public final int method131() {
        return this.field350.length;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
    private final int method132(int arg0) {
        byte var2 = this.field347.field988[this.field347.field1000];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field349[arg0] = var3;
            this.field347.field1000++;
        } else {
            var3 = this.field349[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method124(arg0, var3);
        }
        int var4 = this.field347.method397(128);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field347.field988[this.field347.field1000] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field347.field1000++;
                this.field349[arg0] = var5;
                return this.method124(arg0, var5);
            }
        }
        this.field347.field1000 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)J")
    public final long method133(int arg0) {
        return (long) this.field352 * (long) arg0 + this.field348;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()Z")
    public final boolean method134() {
        return this.field347.field988 != null;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public final void method135(int arg0) {
        this.field347.field1000 = this.field350[arg0];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(J)V")
    public final void method136(long arg0) {
        this.field348 = arg0;
        int var3 = this.field350.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field353[var4] = 0;
            this.field349[var4] = 0;
            this.field347.field1000 = this.field355[var4];
            this.method128(var4);
            this.field350[var4] = this.field347.field1000;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "()V")
    public final void method137() {
        this.field347.field988 = null;
        this.field355 = null;
        this.field350 = null;
        this.field353 = null;
        this.field349 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([B)V")
    public final void method138(byte[] arg0) {
        this.field347.field988 = arg0;
        this.field347.field1000 = 10;
        int var2 = this.field347.method405(2);
        this.field354 = this.field347.method405(2);
        this.field352 = 500000;
        this.field355 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field347.method419(-4);
            int var6 = this.field347.method419(-4);
            if (var5 == 1297379947) {
                this.field355[var3] = this.field347.field1000;
                var3++;
            }
            this.field347.field1000 += var6;
        }
        this.field348 = 0L;
        this.field350 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field350[var4] = this.field355[var4];
        }
        this.field353 = new int[var2];
        this.field349 = new int[var2];
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class20() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
    public class20(byte[] arg0) {
        this.method138(arg0);
    }
}
