import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class18 extends class169 {

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Z")
    public boolean field386 = false;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public int field389 = 0;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public int field395 = 0;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "[I")
    private static int[] field387 = class140.field2878;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "[I")
    private static int[] field391 = class140.field2891;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "[I")
    public int[] field385;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
    public int[] field393;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "[I")
    public int[] field396;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "[[I")
    public int[][] field383;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "[[I")
    public int[][] field384;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Lbh;")
    public abstract class18 method106(boolean arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Laa;ILaa;I[I)V")
    public abstract void method107(class2 arg0, int arg1, class2 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public final void method108(int arg0) {
        int var2 = field387[arg0];
        int var3 = field391[arg0];
        for (int var4 = 0; var4 < this.field395; ++var4) {
            int var5 = this.field385[var4] * var3 - this.field396[var4] * var2 >> 16;
            this.field396[var4] = this.field396[var4] * var3 + this.field385[var4] * var2 >> 16;
            this.field385[var4] = var5;
        }
        this.field394 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public static void method109() {
        field387 = null;
        field391 = null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
    public final void method110() {
        if (this.field394 != 2) {
            this.field394 = 2;
            this.field392 = 0;
            for (int var1 = 0; var1 < this.field395; ++var1) {
                int var2 = this.field393[var1];
                int var3 = this.field385[var1];
                int var4 = this.field396[var1];
                int var5 = var3 * var3 + var2 * var2 + var4 * var4;
                if (var5 > this.field392) {
                    this.field392 = var5;
                }
            }
            this.field392 = (int) (Math.sqrt((double) this.field392) + 0.99D);
            this.field397 = this.field392;
            this.field388 = this.field392 + this.field392;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([[IIIIZI)Lbh;")
    public abstract class18 method111(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
    public final void method112() {
        for (int var1 = 0; var1 < this.field395; ++var1) {
            int var2 = this.field396[var1];
            this.field396[var1] = this.field393[var1];
            this.field393[var1] = -var2;
        }
        this.field394 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Laa;I)V")
    public abstract void method113(class2 arg0, int arg1);

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()V")
    public final void method114() {
        for (int var1 = 0; var1 < this.field395; ++var1) {
            int var2 = this.field393[var1];
            this.field393[var1] = this.field396[var1];
            this.field396[var1] = -var2;
        }
        this.field394 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)Lbh;")
    public abstract class18 method116(boolean arg0);

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()V")
    public final void method117() {
        for (int var1 = 0; var1 < this.field395; ++var1) {
            this.field393[var1] = -this.field393[var1];
            this.field396[var1] = -this.field396[var1];
        }
        this.field394 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public final void method118(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field395; ++var4) {
            this.field393[var4] = this.field393[var4] * arg0 / 128;
            this.field385[var4] = this.field385[var4] * arg1 / 128;
            this.field396[var4] = this.field396[var4] * arg2 / 128;
        }
        this.field394 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V")
    public final void method119(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field395; ++var4) {
            this.field393[var4] += arg0;
            this.field385[var4] += arg1;
            this.field396[var4] += arg2;
        }
        this.field394 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lbh;)Lbh;")
    public abstract class18 method121(class18 arg0);

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "()V")
    public final void method122() {
        if (this.field394 != 1) {
            this.field394 = 1;
            super.field3376 = 0;
            this.field390 = 0;
            this.field392 = 0;
            for (int var1 = 0; var1 < this.field395; ++var1) {
                int var2 = this.field393[var1];
                int var3 = this.field385[var1];
                int var4 = this.field396[var1];
                if (-var3 > super.field3376) {
                    super.field3376 = -var3;
                }
                if (var3 > this.field390) {
                    this.field390 = var3;
                }
                int var5 = var2 * var2 + var4 * var4;
                if (var5 > this.field392) {
                    this.field392 = var5;
                }
            }
            this.field392 = (int) (Math.sqrt((double) this.field392) + 0.99D);
            this.field397 = (int) (Math.sqrt((double) (this.field392 * this.field392 + super.field3376 * super.field3376)) + 0.99D);
            this.field388 = this.field397 + (int) (Math.sqrt((double) (this.field392 * this.field392 + this.field390 * this.field390)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "()I")
    public final int method123() {
        this.method122();
        return this.field392;
    }
}
