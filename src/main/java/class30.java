import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class30 extends class92 {

    @OriginalMember(owner = "client!d", name = "T", descriptor = "Z")
    public boolean field560 = false;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public int field568 = 0;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public int field566 = 0;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "Z")
    public boolean field580 = false;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field563 = 0;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "[I")
    private static int[] field561 = class17.field350;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "[J")
    public static long[] field564 = new long[1000];

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field570 = 0;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "[I")
    private static int[] field562 = class17.field341;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "Z")
    public static boolean field565 = false;

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "S")
    public short field567;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "S")
    public short field569;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "S")
    public short field574;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "S")
    public short field575;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "S")
    public short field576;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "S")
    public short field577;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "S")
    public short field582;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
    public int[] field571;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "[I")
    public int[] field573;

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "[I")
    public int[] field578;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "[[I")
    public int[][] field572;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "[[I")
    public int[][] field581;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lma;ILma;I[I)V")
    public abstract void method38(class109 arg0, int arg1, class109 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
    public final void method264(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field566; ++var4) {
            this.field571[var4] += arg0;
            this.field578[var4] += arg1;
            this.field573[var4] += arg2;
        }
        this.field580 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
    public final void method265() {
        for (int var1 = 0; var1 < this.field566; ++var1) {
            int var2 = this.field571[var1];
            this.field571[var1] = this.field573[var1];
            this.field573[var1] = -var2;
        }
        this.field580 = false;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
    public final void method266() {
        if (!this.field580) {
            this.field580 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field566; ++var9) {
                int var10 = this.field571[var9];
                int var11 = this.field578[var9];
                int var12 = this.field573[var9];
                if (var10 < var1) {
                    var1 = var10;
                }
                if (var10 > var4) {
                    var4 = var10;
                }
                if (var11 < var2) {
                    var2 = var11;
                }
                if (var11 > var5) {
                    var5 = var11;
                }
                if (var12 < var3) {
                    var3 = var12;
                }
                if (var12 > var6) {
                    var6 = var12;
                }
                int var13 = var10 * var10 + var12 * var12;
                if (var13 > var7) {
                    var7 = var13;
                }
                int var14 = var11 * var11 + var10 * var10 + var12 * var12;
                if (var14 > var8) {
                    var8 = var14;
                }
            }
            this.field575 = (short) var1;
            this.field576 = (short) var4;
            super.field1928 = (short) var2;
            this.field574 = (short) var5;
            this.field577 = (short) var3;
            this.field569 = (short) var6;
            this.field567 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field582 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()V")
    public static void method267() {
        field562 = null;
        field561 = null;
        field564 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)Ld;")
    public abstract class30 method41(boolean arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([[IIIIZI)Ld;")
    public abstract class30 method37(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lma;I)V")
    public abstract void method40(class109 arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public final void method268(int arg0) {
        int var2 = field562[arg0];
        int var3 = field561[arg0];
        for (int var4 = 0; var4 < this.field566; ++var4) {
            int var5 = this.field578[var4] * var2 + this.field571[var4] * var3 >> 16;
            this.field578[var4] = this.field578[var4] * var3 - this.field571[var4] * var2 >> 16;
            this.field571[var4] = var5;
        }
        this.field580 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(Z)Ld;")
    public abstract class30 method43(boolean arg0);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()I")
    public final int method269() {
        this.method266();
        return this.field567;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "()V")
    public final void method270() {
        for (int var1 = 0; var1 < this.field566; ++var1) {
            this.field571[var1] = -this.field571[var1];
            this.field573[var1] = -this.field573[var1];
        }
        this.field580 = false;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public final void method271(int arg0) {
        int var2 = field562[arg0];
        int var3 = field561[arg0];
        for (int var4 = 0; var4 < this.field566; ++var4) {
            int var5 = this.field578[var4] * var3 - this.field573[var4] * var2 >> 16;
            this.field573[var4] = this.field578[var4] * var2 + this.field573[var4] * var3 >> 16;
            this.field578[var4] = var5;
        }
        this.field580 = false;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(III)V")
    public final void method272(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field566; ++var4) {
            this.field571[var4] = this.field571[var4] * arg0 / 128;
            this.field578[var4] = this.field578[var4] * arg1 / 128;
            this.field573[var4] = this.field573[var4] * arg2 / 128;
        }
        this.field580 = false;
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "()V")
    public final void method273() {
        for (int var1 = 0; var1 < this.field566; ++var1) {
            int var2 = this.field573[var1];
            this.field573[var1] = this.field571[var1];
            this.field571[var1] = -var2;
        }
        this.field580 = false;
    }
}
