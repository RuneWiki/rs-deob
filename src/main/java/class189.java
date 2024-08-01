import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ue")
public abstract class class189 extends class95 {

    @OriginalMember(owner = "ue", name = "mb", descriptor = "I")
    public int field3630 = 0;

    @OriginalMember(owner = "ue", name = "qb", descriptor = "Z")
    public boolean field3634 = false;

    @OriginalMember(owner = "ue", name = "kb", descriptor = "I")
    public int field3628 = 0;

    @OriginalMember(owner = "ue", name = "hb", descriptor = "Z")
    public boolean field3625 = false;

    @OriginalMember(owner = "ue", name = "ab", descriptor = "[I")
    private static int[] field3618 = class124.field2383;

    @OriginalMember(owner = "ue", name = "nb", descriptor = "Z")
    public static boolean field3631 = false;

    @OriginalMember(owner = "ue", name = "ob", descriptor = "[I")
    private static int[] field3632 = class124.field2387;

    @OriginalMember(owner = "ue", name = "vb", descriptor = "[J")
    public static long[] field3639 = new long[1000];

    @OriginalMember(owner = "ue", name = "ub", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "ue", name = "fb", descriptor = "I")
    public static int field3623 = 0;

    @OriginalMember(owner = "ue", name = "wb", descriptor = "I")
    public static int field3640 = 0;

    @OriginalMember(owner = "ue", name = "cb", descriptor = "S")
    public short field3620;

    @OriginalMember(owner = "ue", name = "ib", descriptor = "S")
    public short field3626;

    @OriginalMember(owner = "ue", name = "jb", descriptor = "S")
    public short field3627;

    @OriginalMember(owner = "ue", name = "pb", descriptor = "S")
    public short field3633;

    @OriginalMember(owner = "ue", name = "rb", descriptor = "S")
    public short field3635;

    @OriginalMember(owner = "ue", name = "sb", descriptor = "S")
    public short field3636;

    @OriginalMember(owner = "ue", name = "tb", descriptor = "S")
    public short field3637;

    @OriginalMember(owner = "ue", name = "bb", descriptor = "[I")
    public int[] field3619;

    @OriginalMember(owner = "ue", name = "db", descriptor = "[I")
    public int[] field3621;

    @OriginalMember(owner = "ue", name = "gb", descriptor = "[I")
    public int[] field3624;

    @OriginalMember(owner = "ue", name = "eb", descriptor = "[[I")
    public int[][] field3622;

    @OriginalMember(owner = "ue", name = "lb", descriptor = "[[I")
    public int[][] field3629;

    @OriginalMember(owner = "ue", name = "c", descriptor = "(Z)Lue;")
    public abstract class189 method435(boolean arg0);

    @OriginalMember(owner = "ue", name = "a", descriptor = "()V")
    public final void method1274() {
        if (!this.field3634) {
            this.field3634 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field3630; ++var9) {
                int var10 = this.field3624[var9];
                int var11 = this.field3619[var9];
                int var12 = this.field3621[var9];
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
            this.field3637 = (short) var1;
            this.field3620 = (short) var4;
            super.field1945 = (short) var2;
            this.field3636 = (short) var5;
            this.field3627 = (short) var3;
            this.field3626 = (short) var6;
            this.field3635 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field3633 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "ue", name = "c", descriptor = "(I)V")
    public final void method1275(int arg0) {
        int var2 = field3618[arg0];
        int var3 = field3632[arg0];
        for (int var4 = 0; var4 < this.field3630; ++var4) {
            int var5 = this.field3619[var4] * var3 - this.field3621[var4] * var2 >> 16;
            this.field3621[var4] = this.field3621[var4] * var3 + this.field3619[var4] * var2 >> 16;
            this.field3619[var4] = var5;
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "d", descriptor = "(I)V")
    public final void method1276(int arg0) {
        int var2 = field3618[arg0];
        int var3 = field3632[arg0];
        for (int var4 = 0; var4 < this.field3630; ++var4) {
            int var5 = this.field3624[var4] * var3 + this.field3619[var4] * var2 >> 16;
            this.field3619[var4] = this.field3619[var4] * var3 - this.field3624[var4] * var2 >> 16;
            this.field3624[var4] = var5;
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "d", descriptor = "(Z)Lue;")
    public abstract class189 method436(boolean arg0);

    @OriginalMember(owner = "ue", name = "a", descriptor = "(III)V")
    public final void method1277(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3630; ++var4) {
            this.field3624[var4] += arg0;
            this.field3619[var4] += arg1;
            this.field3621[var4] += arg2;
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "b", descriptor = "()V")
    public static void method1278() {
        field3618 = null;
        field3632 = null;
        field3639 = null;
    }

    @OriginalMember(owner = "ue", name = "b", descriptor = "(III)V")
    public final void method1279(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3630; ++var4) {
            this.field3624[var4] = this.field3624[var4] * arg0 / 128;
            this.field3619[var4] = this.field3619[var4] * arg1 / 128;
            this.field3621[var4] = this.field3621[var4] * arg2 / 128;
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "c", descriptor = "()I")
    public final int method1280() {
        this.method1274();
        return this.field3635;
    }

    @OriginalMember(owner = "ue", name = "d", descriptor = "()V")
    public final void method1281() {
        for (int var1 = 0; var1 < this.field3630; ++var1) {
            this.field3624[var1] = -this.field3624[var1];
            this.field3621[var1] = -this.field3621[var1];
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "e", descriptor = "()V")
    public final void method1282() {
        for (int var1 = 0; var1 < this.field3630; ++var1) {
            int var2 = this.field3621[var1];
            this.field3621[var1] = this.field3624[var1];
            this.field3624[var1] = -var2;
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "b", descriptor = "(IIIIIIII)V")
    public abstract void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "ue", name = "f", descriptor = "()V")
    public final void method1283() {
        for (int var1 = 0; var1 < this.field3630; ++var1) {
            int var2 = this.field3624[var1];
            this.field3624[var1] = this.field3621[var1];
            this.field3621[var1] = -var2;
        }
        this.field3634 = false;
    }

    @OriginalMember(owner = "ue", name = "a", descriptor = "(Ltd;ILtd;I[I)V")
    public abstract void method422(class179 arg0, int arg1, class179 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "ue", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "ue", name = "a", descriptor = "(Ltd;I)V")
    public abstract void method425(class179 arg0, int arg1);

    @OriginalMember(owner = "ue", name = "a", descriptor = "([[IIIIZI)Lue;")
    public abstract class189 method432(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);
}
