import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class36 extends class30 {

    @OriginalMember(owner = "client!df", name = "Kb", descriptor = "I")
    public int field836 = 0;

    @OriginalMember(owner = "client!df", name = "Hb", descriptor = "I")
    public int field833 = 0;

    @OriginalMember(owner = "client!df", name = "Rb", descriptor = "Z")
    public boolean field843 = false;

    @OriginalMember(owner = "client!df", name = "Ib", descriptor = "Z")
    public boolean field834 = false;

    @OriginalMember(owner = "client!df", name = "Mb", descriptor = "[J")
    public static long[] field838 = new long[1000];

    @OriginalMember(owner = "client!df", name = "Qb", descriptor = "[I")
    private static int[] field842 = class25.field576;

    @OriginalMember(owner = "client!df", name = "Ob", descriptor = "Z")
    public static boolean field840 = false;

    @OriginalMember(owner = "client!df", name = "Jb", descriptor = "[I")
    private static int[] field835 = class25.field571;

    @OriginalMember(owner = "client!df", name = "Vb", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!df", name = "Zb", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!df", name = "ac", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!df", name = "Fb", descriptor = "S")
    public short field831;

    @OriginalMember(owner = "client!df", name = "Lb", descriptor = "S")
    public short field837;

    @OriginalMember(owner = "client!df", name = "Sb", descriptor = "S")
    public short field844;

    @OriginalMember(owner = "client!df", name = "Tb", descriptor = "S")
    public short field845;

    @OriginalMember(owner = "client!df", name = "Ub", descriptor = "S")
    public short field846;

    @OriginalMember(owner = "client!df", name = "Xb", descriptor = "S")
    public short field849;

    @OriginalMember(owner = "client!df", name = "Yb", descriptor = "S")
    public short field850;

    @OriginalMember(owner = "client!df", name = "Eb", descriptor = "[I")
    public int[] field830;

    @OriginalMember(owner = "client!df", name = "Pb", descriptor = "[I")
    public int[] field841;

    @OriginalMember(owner = "client!df", name = "Wb", descriptor = "[I")
    public int[] field848;

    @OriginalMember(owner = "client!df", name = "Gb", descriptor = "[[I")
    public int[][] field832;

    @OriginalMember(owner = "client!df", name = "Nb", descriptor = "[[I")
    public int[][] field839;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public final void method327(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field836; ++var4) {
            this.field830[var4] = this.field830[var4] * arg0 / 128;
            this.field848[var4] = this.field848[var4] * arg1 / 128;
            this.field841[var4] = this.field841[var4] * arg2 / 128;
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method328() {
        for (int var1 = 0; var1 < this.field836; ++var1) {
            int var2 = this.field841[var1];
            this.field841[var1] = this.field830[var1];
            this.field830[var1] = -var2;
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public final void method329(int arg0) {
        int var2 = field835[arg0];
        int var3 = field842[arg0];
        for (int var4 = 0; var4 < this.field836; ++var4) {
            int var5 = this.field848[var4] * var3 - this.field841[var4] * var2 >> 16;
            this.field841[var4] = this.field848[var4] * var2 + this.field841[var4] * var3 >> 16;
            this.field848[var4] = var5;
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([[IIIIZI)Ldf;")
    public abstract class36 method330(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    public final void method331() {
        if (!this.field834) {
            this.field834 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field836; ++var9) {
                int var10 = this.field830[var9];
                int var11 = this.field848[var9];
                int var12 = this.field841[var9];
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
            this.field837 = (short) var1;
            this.field845 = (short) var4;
            super.field728 = (short) var2;
            this.field831 = (short) var5;
            this.field850 = (short) var3;
            this.field849 = (short) var6;
            this.field844 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field846 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(Z)Ldf;")
    public abstract class36 method332(boolean arg0);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
    public final void method333() {
        for (int var1 = 0; var1 < this.field836; ++var1) {
            int var2 = this.field830[var1];
            this.field830[var1] = this.field841[var1];
            this.field841[var1] = -var2;
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldc;I)V")
    public abstract void method334(class33 arg0, int arg1);

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
    public final void method335() {
        for (int var1 = 0; var1 < this.field836; ++var1) {
            this.field830[var1] = -this.field830[var1];
            this.field841[var1] = -this.field841[var1];
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldc;ILdc;I[I)V")
    public abstract void method336(class33 arg0, int arg1, class33 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public final void method337(int arg0) {
        int var2 = field835[arg0];
        int var3 = field842[arg0];
        for (int var4 = 0; var4 < this.field836; ++var4) {
            int var5 = this.field848[var4] * var2 + this.field830[var4] * var3 >> 16;
            this.field848[var4] = this.field848[var4] * var3 - this.field830[var4] * var2 >> 16;
            this.field830[var4] = var5;
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
    public final void method338(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field836; ++var4) {
            this.field830[var4] += arg0;
            this.field848[var4] += arg1;
            this.field841[var4] += arg2;
        }
        this.field834 = false;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(Z)Ldf;")
    public abstract class36 method339(boolean arg0);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()V")
    public static void method340() {
        field835 = null;
        field842 = null;
        field838 = null;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
    public final int method341() {
        this.method331();
        return this.field844;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
