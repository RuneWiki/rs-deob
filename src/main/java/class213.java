import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class213 extends class35 {

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "Z")
    public boolean field4138 = false;

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
    public int field4141 = 0;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
    public int field4137 = 0;

    @OriginalMember(owner = "client!vf", name = "pb", descriptor = "Z")
    public boolean field4143 = false;

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
    public static int field4136 = 0;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "[I")
    private static int[] field4134 = class72.field1396;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "[J")
    public static long[] field4127 = new long[1000];

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
    private static int[] field4129 = class72.field1404;

    @OriginalMember(owner = "client!vf", name = "vb", descriptor = "Z")
    public static boolean field4149 = false;

    @OriginalMember(owner = "client!vf", name = "ub", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "S")
    public short field4128;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "S")
    public short field4131;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "S")
    public short field4135;

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "S")
    public short field4139;

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "S")
    public short field4142;

    @OriginalMember(owner = "client!vf", name = "rb", descriptor = "S")
    public short field4145;

    @OriginalMember(owner = "client!vf", name = "tb", descriptor = "S")
    public short field4147;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "[I")
    public int[] field4132;

    @OriginalMember(owner = "client!vf", name = "qb", descriptor = "[I")
    public int[] field4144;

    @OriginalMember(owner = "client!vf", name = "sb", descriptor = "[I")
    public int[] field4146;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "[[I")
    public int[][] field4130;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "[[I")
    public int[][] field4133;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
    public final void method1395(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4137; ++var4) {
            this.field4144[var4] = this.field4144[var4] * arg0 / 128;
            this.field4146[var4] = this.field4146[var4] * arg1 / 128;
            this.field4132[var4] = this.field4132[var4] * arg2 / 128;
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
    public static void method1396() {
        field4134 = null;
        field4129 = null;
        field4127 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Lvf;")
    public abstract class213 method629(boolean arg0);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
    public final void method1397() {
        for (int var1 = 0; var1 < this.field4137; ++var1) {
            int var2 = this.field4132[var1];
            this.field4132[var1] = this.field4144[var1];
            this.field4144[var1] = -var2;
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
    public final void method1398() {
        for (int var1 = 0; var1 < this.field4137; ++var1) {
            int var2 = this.field4144[var1];
            this.field4144[var1] = this.field4132[var1];
            this.field4132[var1] = -var2;
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)Lvf;")
    public abstract class213 method624(boolean arg0);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public final void method1399(int arg0) {
        int var2 = field4134[arg0];
        int var3 = field4129[arg0];
        for (int var4 = 0; var4 < this.field4137; ++var4) {
            int var5 = this.field4146[var4] * var3 - this.field4132[var4] * var2 >> 16;
            this.field4132[var4] = this.field4146[var4] * var2 + this.field4132[var4] * var3 >> 16;
            this.field4146[var4] = var5;
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Le;ILe;I[I)V")
    public abstract void method637(class41 arg0, int arg1, class41 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()I")
    public final int method1400() {
        this.method1404();
        return this.field4128;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([[IIIIZI)Lvf;")
    public abstract class213 method633(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()V")
    public final void method1401() {
        for (int var1 = 0; var1 < this.field4137; ++var1) {
            this.field4144[var1] = -this.field4144[var1];
            this.field4132[var1] = -this.field4132[var1];
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V")
    public final void method1402(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4137; ++var4) {
            this.field4144[var4] += arg0;
            this.field4146[var4] += arg1;
            this.field4132[var4] += arg2;
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Le;I)V")
    public abstract void method628(class41 arg0, int arg1);

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public final void method1403(int arg0) {
        int var2 = field4134[arg0];
        int var3 = field4129[arg0];
        for (int var4 = 0; var4 < this.field4137; ++var4) {
            int var5 = this.field4146[var4] * var2 + this.field4144[var4] * var3 >> 16;
            this.field4146[var4] = this.field4146[var4] * var3 - this.field4144[var4] * var2 >> 16;
            this.field4144[var4] = var5;
        }
        this.field4143 = false;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "()V")
    public final void method1404() {
        if (!this.field4143) {
            this.field4143 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field4137; ++var9) {
                int var10 = this.field4144[var9];
                int var11 = this.field4146[var9];
                int var12 = this.field4132[var9];
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
            this.field4142 = (short) var1;
            this.field4135 = (short) var4;
            super.field758 = (short) var2;
            this.field4139 = (short) var5;
            this.field4131 = (short) var3;
            this.field4147 = (short) var6;
            this.field4128 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field4145 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }
}
