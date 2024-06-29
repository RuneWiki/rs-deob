import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lpa;")
    private class105 field931 = new class105(null);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[B")
    private static byte[] field932 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "J")
    private long field938;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    private int[] field933;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[I")
    public int[] field934;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    private int[] field936;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[I")
    private int[] field939;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()Z")
    public final boolean method309() {
        int var1 = this.field933.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field933[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
    public final int method310() {
        return this.field933.length;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
    public final void method311() {
        this.field931.field2405 = null;
        this.field936 = null;
        this.field933 = null;
        this.field934 = null;
        this.field939 = null;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()V")
    public final void method312() {
        this.field931.field2404 = -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(J)V")
    public final void method313(long arg0) {
        this.field938 = arg0;
        int var3 = this.field933.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field934[var4] = 0;
            this.field939[var4] = 0;
            this.field931.field2404 = this.field936[var4];
            this.method316(var4);
            this.field933[var4] = this.field931.field2404;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
    public final int method314(int arg0) {
        return this.method319(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([B)V")
    public final void method315(byte[] arg0) {
        this.field931.field2405 = arg0;
        this.field931.field2404 = 10;
        int var2 = this.field931.method838((byte) 5);
        this.field935 = this.field931.method838((byte) 5);
        this.field937 = 500000;
        this.field936 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field931.method821((byte) 84);
            int var6 = this.field931.method821((byte) 118);
            if (var5 == 1297379947) {
                this.field936[var3] = this.field931.field2404;
                var3++;
            }
            this.field931.field2404 += var6;
        }
        this.field938 = 0L;
        this.field933 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field933[var4] = this.field936[var4];
        }
        this.field934 = new int[var2];
        this.field939 = new int[var2];
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public final void method316(int arg0) {
        int var2 = this.field931.method793((byte) -102);
        this.field934[arg0] += var2;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "()I")
    public final int method317() {
        int var1 = this.field933.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field933[var4] >= 0 && this.field934[var4] < var3) {
                var2 = var4;
                var3 = this.field934[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "()V")
    public static void method318() {
        field932 = null;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
    private final int method319(int arg0) {
        byte var2 = this.field931.field2405[this.field931.field2404];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field939[arg0] = var3;
            this.field931.field2404++;
        } else {
            var3 = this.field939[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method324(arg0, var3);
        }
        int var4 = this.field931.method793((byte) -102);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field931.field2405[this.field931.field2404] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field931.field2404++;
                this.field939[arg0] = var5;
                return this.method324(arg0, var5);
            }
        }
        this.field931.field2404 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public final void method320(int arg0) {
        this.field931.field2404 = this.field933[arg0];
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
    public final void method321(int arg0) {
        this.field933[arg0] = this.field931.field2404;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)J")
    public final long method322(int arg0) {
        return (long) this.field937 * (long) arg0 + this.field938;
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "()Z")
    public final boolean method323() {
        return this.field931.field2405 != null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
    private final int method324(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field932[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field931.method831((byte) 76) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field931.method831((byte) 76) << 16;
            }
            return var8;
        }
        int var3 = this.field931.method831((byte) 76);
        int var4 = this.field931.method793((byte) -102);
        if (var3 == 47) {
            this.field931.field2404 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field931.method799(-1);
            var4 -= 3;
            int var6 = this.field934[arg0];
            this.field938 += (long) (this.field937 - var5) * (long) var6;
            this.field937 = var5;
            this.field931.field2404 += var4;
            return 2;
        } else {
            this.field931.field2404 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class38() {
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
    public class38(byte[] arg0) {
        this.method315(arg0);
    }
}
