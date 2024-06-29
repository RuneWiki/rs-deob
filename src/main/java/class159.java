import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class159 extends class52 {

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    public int field3324 = 0;

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "I")
    public int field3329 = 0;

    @OriginalMember(owner = "client!rg", name = "ob", descriptor = "Z")
    public boolean field3335 = false;

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "[I")
    private static int[] field3327 = class93.field2110;

    @OriginalMember(owner = "client!rg", name = "kb", descriptor = "[I")
    private static int[] field3331 = class93.field2091;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!rg", name = "mb", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "[I")
    public int[] field3322;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "[I")
    public int[] field3323;

    @OriginalMember(owner = "client!rg", name = "lb", descriptor = "[I")
    public int[] field3332;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "[[I")
    public int[][] field3321;

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "[[I")
    public int[][] field3326;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)Lrg;")
    public abstract class159 method344(boolean arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public final void method1144(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3329; ++var4) {
            this.field3322[var4] += arg0;
            this.field3332[var4] += arg1;
            this.field3323[var4] += arg2;
        }
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()I")
    public final int method1145() {
        this.method1151();
        return this.field3334;
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V")
    public final void method1146(int arg0) {
        int var2 = field3331[arg0];
        int var3 = field3327[arg0];
        for (int var4 = 0; var4 < this.field3329; ++var4) {
            int var5 = this.field3332[var4] * var3 - this.field3323[var4] * var2 >> 16;
            this.field3323[var4] = this.field3332[var4] * var2 + this.field3323[var4] * var3 >> 16;
            this.field3332[var4] = var5;
        }
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lt;I)V")
    public abstract void method358(class170 arg0, int arg1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([[IIIIZI)Lrg;")
    public abstract class159 method356(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lrg;)Lrg;")
    public abstract class159 method349(class159 arg0);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()V")
    public final void method1147() {
        if (this.field3328 != 2) {
            this.field3328 = 2;
            this.field3334 = 0;
            for (int var1 = 0; var1 < this.field3329; ++var1) {
                int var2 = this.field3322[var1];
                int var3 = this.field3332[var1];
                int var4 = this.field3323[var1];
                int var5 = var3 * var3 + var2 * var2 + var4 * var4;
                if (var5 > this.field3334) {
                    this.field3334 = var5;
                }
            }
            this.field3334 = (int) (Math.sqrt((double) this.field3334) + 0.99D);
            this.field3330 = this.field3334;
            this.field3325 = this.field3334 + this.field3334;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lt;ILt;I[I)V")
    public abstract void method342(class170 arg0, int arg1, class170 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
    public final void method1148(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3329; ++var4) {
            this.field3322[var4] = this.field3322[var4] * arg0 / 128;
            this.field3332[var4] = this.field3332[var4] * arg1 / 128;
            this.field3323[var4] = this.field3323[var4] * arg2 / 128;
        }
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()V")
    public final void method1149() {
        for (int var1 = 0; var1 < this.field3329; ++var1) {
            int var2 = this.field3322[var1];
            this.field3322[var1] = this.field3323[var1];
            this.field3323[var1] = -var2;
        }
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()V")
    public static void method1150() {
        field3331 = null;
        field3327 = null;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "()V")
    public final void method1151() {
        if (this.field3328 != 1) {
            this.field3328 = 1;
            super.field1328 = 0;
            this.field3333 = 0;
            this.field3334 = 0;
            for (int var1 = 0; var1 < this.field3329; ++var1) {
                int var2 = this.field3322[var1];
                int var3 = this.field3332[var1];
                int var4 = this.field3323[var1];
                if (-var3 > super.field1328) {
                    super.field1328 = -var3;
                }
                if (var3 > this.field3333) {
                    this.field3333 = var3;
                }
                int var5 = var2 * var2 + var4 * var4;
                if (var5 > this.field3334) {
                    this.field3334 = var5;
                }
            }
            this.field3334 = (int) (Math.sqrt((double) this.field3334) + 0.99D);
            this.field3330 = (int) (Math.sqrt((double) (super.field1328 * super.field1328 + this.field3334 * this.field3334)) + 0.99D);
            this.field3325 = this.field3330 + (int) (Math.sqrt((double) (this.field3334 * this.field3334 + this.field3333 * this.field3333)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "()V")
    public final void method1152() {
        for (int var1 = 0; var1 < this.field3329; ++var1) {
            this.field3322[var1] = -this.field3322[var1];
            this.field3323[var1] = -this.field3323[var1];
        }
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "()V")
    public final void method1153() {
        for (int var1 = 0; var1 < this.field3329; ++var1) {
            int var2 = this.field3323[var1];
            this.field3323[var1] = this.field3322[var1];
            this.field3322[var1] = -var2;
        }
        this.field3328 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(Z)Lrg;")
    public abstract class159 method346(boolean arg0);
}
