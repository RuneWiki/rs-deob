import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class24 extends class4 {

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "Z")
    public boolean field501 = false;

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    public int field500 = 0;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
    public int field508 = 0;

    @OriginalMember(owner = "client!cd", name = "Eb", descriptor = "Z")
    public boolean field515 = false;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "[I")
    private static int[] field499 = class12.field283;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "[I")
    private static int[] field504 = class12.field279;

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "[I")
    public static int[] field506 = new int[1000];

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "client!cd", name = "Bb", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "Z")
    public static boolean field510 = false;

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "S")
    public short field495;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "S")
    public short field497;

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "S")
    public short field505;

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "S")
    public short field507;

    @OriginalMember(owner = "client!cd", name = "Cb", descriptor = "S")
    public short field513;

    @OriginalMember(owner = "client!cd", name = "Db", descriptor = "S")
    public short field514;

    @OriginalMember(owner = "client!cd", name = "Fb", descriptor = "S")
    public short field516;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "[I")
    public int[] field496;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "[I")
    public int[] field509;

    @OriginalMember(owner = "client!cd", name = "Ab", descriptor = "[I")
    public int[] field511;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "[[I")
    public int[][] field494;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "[[I")
    public int[][] field503;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)Lcd;")
    public abstract class24 method161(boolean arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
    public static void method162() {
        field504 = null;
        field499 = null;
        field506 = null;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        int var2 = field504[arg0];
        int var3 = field499[arg0];
        for (int var4 = 0; var4 < this.field508; ++var4) {
            int var5 = this.field511[var4] * var3 - this.field509[var4] * var2 >> 16;
            this.field509[var4] = this.field511[var4] * var2 + this.field509[var4] * var3 >> 16;
            this.field511[var4] = var5;
        }
        this.field501 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public final void method164(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field508; ++var4) {
            this.field496[var4] += arg0;
            this.field511[var4] += arg1;
            this.field509[var4] += arg2;
        }
        this.field501 = false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
    public final void method165() {
        for (int var1 = 0; var1 < this.field508; ++var1) {
            int var2 = this.field496[var1];
            this.field496[var1] = this.field509[var1];
            this.field509[var1] = -var2;
        }
        this.field501 = false;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)Lcd;")
    public abstract class24 method166(boolean arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
    public final void method168() {
        for (int var1 = 0; var1 < this.field508; ++var1) {
            int var2 = this.field509[var1];
            this.field509[var1] = this.field496[var1];
            this.field496[var1] = -var2;
        }
        this.field501 = false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lkf;I)V")
    public abstract void method169(class96 arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
    public final void method171() {
        if (!this.field501) {
            this.field501 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field508; ++var9) {
                int var10 = this.field496[var9];
                int var11 = this.field511[var9];
                int var12 = this.field509[var9];
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
            this.field514 = (short) var1;
            this.field497 = (short) var4;
            super.field84 = (short) var2;
            this.field507 = (short) var5;
            this.field495 = (short) var3;
            this.field505 = (short) var6;
            this.field516 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field513 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([[IIIIZI)Lcd;")
    public abstract class24 method172(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
    public final void method173() {
        for (int var1 = 0; var1 < this.field508; ++var1) {
            this.field496[var1] = -this.field496[var1];
            this.field509[var1] = -this.field509[var1];
        }
        this.field501 = false;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "()I")
    public final int method174() {
        this.method171();
        return this.field516;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lkf;ILkf;I[I)V")
    public abstract void method175(class96 arg0, int arg1, class96 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field508; ++var4) {
            this.field496[var4] = this.field496[var4] * arg0 / 128;
            this.field511[var4] = this.field511[var4] * arg1 / 128;
            this.field509[var4] = this.field509[var4] * arg2 / 128;
        }
        this.field501 = false;
    }
}
