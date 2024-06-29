import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Lac;")
    private class501 field449 = new class501(null);

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "[B")
    private static byte[] field448 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "J")
    private long field455;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
    public int[] field450;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
    private int[] field451;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "[I")
    private int[] field452;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "[I")
    private int[] field453;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(J)V", line = 3)
    public final void method334(long arg0) {
        this.field455 = arg0;
        int var3 = this.field452.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field450[var4] = 0;
            this.field453[var4] = 0;
            this.field449.field6892 = this.field451[var4];
            this.method339(var4);
            this.field452[var4] = this.field449.field6892;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "()V", line = 21)
    public final void method335() {
        this.field449.field6892 = -1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I", line = 26)
    public final int method336(int arg0) {
        return this.method349(arg0);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "([B)V", line = 32)
    public final void method337(byte[] arg0) {
        this.field449.field6855 = arg0;
        this.field449.field6892 = 10;
        int var2 = this.field449.method2845(-1);
        this.field456 = this.field449.method2845(-1);
        this.field454 = 500000;
        this.field451 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field449.method2840(false);
            int var6 = this.field449.method2840(false);
            if (var5 == 1297379947) {
                this.field451[var3] = this.field449.field6892;
                var3++;
            }
            this.field449.field6892 += var6;
        }
        this.field455 = 0L;
        this.field452 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field452[var4] = this.field451[var4];
        }
        this.field450 = new int[var2];
        this.field453 = new int[var2];
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "()I", line = 88)
    public final int method338() {
        int var1 = this.field452.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field452[var4] >= 0 && this.field450[var4] < var3) {
                var2 = var4;
                var3 = this.field450[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V", line = 117)
    public final void method339(int arg0) {
        int var2 = this.field449.method2829(5112);
        this.field450[arg0] += var2;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "()Z", line = 121)
    public final boolean method340() {
        return this.field449.field6855 != null;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)V", line = 125)
    public final void method341(int arg0) {
        this.field449.field6892 = this.field452[arg0];
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "()I", line = 129)
    public final int method342() {
        return this.field452.length;
    }

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "()V", line = 132)
    public final void method343() {
        this.field449.field6855 = null;
        this.field451 = null;
        this.field452 = null;
        this.field450 = null;
        this.field453 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I", line = 142)
    private final int method344(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field448[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field449.method2874((byte) -75) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field449.method2874((byte) -75) << 16;
            }
            return var8;
        }
        int var3 = this.field449.method2874((byte) -75);
        int var4 = this.field449.method2829(5112);
        if (var3 == 47) {
            this.field449.field6892 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field449.method2819((byte) 72);
            var4 -= 3;
            int var6 = this.field450[arg0];
            this.field455 += (long) (this.field454 - var5) * (long) var6;
            this.field454 = var5;
            this.field449.field6892 += var4;
            return 2;
        } else {
            this.field449.field6892 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "()V", line = 184)
    public static void method345() {
        field448 = null;
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)V", line = 190)
    public final void method346(int arg0) {
        this.field452[arg0] = this.field449.field6892;
    }

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)J", line = 193)
    public final long method347(int arg0) {
        return (long) this.field454 * (long) arg0 + this.field455;
    }

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "()Z", line = 197)
    public final boolean method348() {
        int var1 = this.field452.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field452[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V", line = 264)
    public class38() {
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "([B)V", line = 266)
    public class38(byte[] arg0) {
        this.method337(arg0);
    }

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)I", line = 226)
    private final int method349(int arg0) {
        byte var2 = this.field449.field6855[this.field449.field6892];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field453[arg0] = var3;
            this.field449.field6892++;
        } else {
            var3 = this.field453[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method344(arg0, var3);
        }
        int var4 = this.field449.method2829(5112);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field449.field6855[this.field449.field6892] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field449.field6892++;
                this.field453[arg0] = var5;
                return this.method344(arg0, var5);
            }
        }
        this.field449.field6892 += var4;
        return 0;
    }
}
