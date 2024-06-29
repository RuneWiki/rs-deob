import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class199 extends class92 {

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public int field3915 = 0;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "Z")
    public boolean field3910 = false;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    public int field3912 = 0;

    @OriginalMember(owner = "client!w", name = "lb", descriptor = "Z")
    public boolean field3921 = false;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!w", name = "ib", descriptor = "I")
    public static int field3918 = 0;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field3908 = 0;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "[I")
    private static int[] field3913 = class135.field2798;

    @OriginalMember(owner = "client!w", name = "qb", descriptor = "Z")
    public static boolean field3926 = false;

    @OriginalMember(owner = "client!w", name = "nb", descriptor = "[I")
    private static int[] field3923 = class135.field2797;

    @OriginalMember(owner = "client!w", name = "rb", descriptor = "[I")
    public static int[] field3927 = new int[1000];

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "S")
    public short field3909;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "S")
    public short field3914;

    @OriginalMember(owner = "client!w", name = "hb", descriptor = "S")
    public short field3917;

    @OriginalMember(owner = "client!w", name = "mb", descriptor = "S")
    public short field3922;

    @OriginalMember(owner = "client!w", name = "pb", descriptor = "S")
    public short field3925;

    @OriginalMember(owner = "client!w", name = "sb", descriptor = "S")
    public short field3928;

    @OriginalMember(owner = "client!w", name = "tb", descriptor = "S")
    public short field3929;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "[I")
    public int[] field3911;

    @OriginalMember(owner = "client!w", name = "kb", descriptor = "[I")
    public int[] field3920;

    @OriginalMember(owner = "client!w", name = "ob", descriptor = "[I")
    public int[] field3924;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "[[I")
    public int[][] field3916;

    @OriginalMember(owner = "client!w", name = "jb", descriptor = "[[I")
    public int[][] field3919;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
    public final void method1295() {
        for (int var1 = 0; var1 < this.field3915; ++var1) {
            this.field3924[var1] = -this.field3924[var1];
            this.field3911[var1] = -this.field3911[var1];
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
    public static void method1296() {
        field3923 = null;
        field3913 = null;
        field3927 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([[IIIIZI)Lw;")
    public abstract class199 method391(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
    public final void method1297(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3915; ++var4) {
            this.field3924[var4] += arg0;
            this.field3920[var4] += arg1;
            this.field3911[var4] += arg2;
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
    public final void method1298() {
        for (int var1 = 0; var1 < this.field3915; ++var1) {
            int var2 = this.field3924[var1];
            this.field3924[var1] = this.field3911[var1];
            this.field3911[var1] = -var2;
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)Lw;")
    public abstract class199 method389(boolean arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lla;I)V")
    public abstract void method395(class101 arg0, int arg1);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
    public final void method1299(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3915; ++var4) {
            this.field3924[var4] = this.field3924[var4] * arg0 / 128;
            this.field3920[var4] = this.field3920[var4] * arg1 / 128;
            this.field3911[var4] = this.field3911[var4] * arg2 / 128;
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "(I)V")
    public final void method1300(int arg0) {
        int var2 = field3923[arg0];
        int var3 = field3913[arg0];
        for (int var4 = 0; var4 < this.field3915; ++var4) {
            int var5 = this.field3920[var4] * var3 - this.field3911[var4] * var2 >> 16;
            this.field3911[var4] = this.field3920[var4] * var2 + this.field3911[var4] * var3 >> 16;
            this.field3920[var4] = var5;
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()I")
    public final int method1301() {
        this.method1304();
        return this.field3909;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
    public final void method1302() {
        for (int var1 = 0; var1 < this.field3915; ++var1) {
            int var2 = this.field3911[var1];
            this.field3911[var1] = this.field3924[var1];
            this.field3924[var1] = -var2;
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)Lw;")
    public abstract class199 method401(boolean arg0);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "(I)V")
    public final void method1303(int arg0) {
        int var2 = field3923[arg0];
        int var3 = field3913[arg0];
        for (int var4 = 0; var4 < this.field3915; ++var4) {
            int var5 = this.field3924[var4] * var3 + this.field3920[var4] * var2 >> 16;
            this.field3920[var4] = this.field3920[var4] * var3 - this.field3924[var4] * var2 >> 16;
            this.field3924[var4] = var5;
        }
        this.field3910 = false;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
    public final void method1304() {
        if (!this.field3910) {
            this.field3910 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field3915; ++var9) {
                int var10 = this.field3924[var9];
                int var11 = this.field3920[var9];
                int var12 = this.field3911[var9];
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
            this.field3928 = (short) var1;
            this.field3925 = (short) var4;
            super.field1819 = (short) var2;
            this.field3929 = (short) var5;
            this.field3922 = (short) var3;
            this.field3917 = (short) var6;
            this.field3909 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field3914 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lla;ILla;I[I)V")
    public abstract void method398(class101 arg0, int arg1, class101 arg2, int arg3, int[] arg4);
}
