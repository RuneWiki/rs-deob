import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class81 extends class110 {

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    public int field1883 = 0;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public int field1874 = 0;

    @OriginalMember(owner = "client!ia", name = "qb", descriptor = "Z")
    public boolean field1892 = false;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "Z")
    public boolean field1884 = false;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field1876 = 0;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "Z")
    public static boolean field1877 = false;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "[I")
    private static int[] field1879 = class11.field201;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "[J")
    public static long[] field1885 = new long[1000];

    @OriginalMember(owner = "client!ia", name = "pb", descriptor = "[I")
    private static int[] field1891 = class11.field211;

    @OriginalMember(owner = "client!ia", name = "tb", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "S")
    public short field1878;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "S")
    public short field1880;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "S")
    public short field1881;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "S")
    public short field1882;

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "S")
    public short field1886;

    @OriginalMember(owner = "client!ia", name = "lb", descriptor = "S")
    public short field1887;

    @OriginalMember(owner = "client!ia", name = "rb", descriptor = "S")
    public short field1893;

    @OriginalMember(owner = "client!ia", name = "nb", descriptor = "[I")
    public int[] field1889;

    @OriginalMember(owner = "client!ia", name = "sb", descriptor = "[I")
    public int[] field1894;

    @OriginalMember(owner = "client!ia", name = "ub", descriptor = "[I")
    public int[] field1896;

    @OriginalMember(owner = "client!ia", name = "mb", descriptor = "[[I")
    public int[][] field1888;

    @OriginalMember(owner = "client!ia", name = "ob", descriptor = "[[I")
    public int[][] field1890;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    public static void method604() {
        field1891 = null;
        field1879 = null;
        field1885 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
    public final void method605() {
        for (int var1 = 0; var1 < this.field1874; ++var1) {
            this.field1896[var1] = -this.field1896[var1];
            this.field1894[var1] = -this.field1894[var1];
        }
        this.field1884 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([[IIIIZI)Lia;")
    public abstract class81 method606(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lia;")
    public abstract class81 method607(boolean arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()V")
    public final void method608() {
        if (!this.field1884) {
            this.field1884 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field1874; ++var9) {
                int var10 = this.field1896[var9];
                int var11 = this.field1889[var9];
                int var12 = this.field1894[var9];
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
            this.field1880 = (short) var1;
            this.field1881 = (short) var4;
            super.field2440 = (short) var2;
            this.field1886 = (short) var5;
            this.field1887 = (short) var3;
            this.field1882 = (short) var6;
            this.field1893 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field1878 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public final void method609(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1874; ++var4) {
            this.field1896[var4] += arg0;
            this.field1889[var4] += arg1;
            this.field1894[var4] += arg2;
        }
        this.field1884 = false;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public final void method610(int arg0) {
        int var2 = field1891[arg0];
        int var3 = field1879[arg0];
        for (int var4 = 0; var4 < this.field1874; ++var4) {
            int var5 = this.field1889[var4] * var3 - this.field1894[var4] * var2 >> 16;
            this.field1894[var4] = this.field1894[var4] * var3 + this.field1889[var4] * var2 >> 16;
            this.field1889[var4] = var5;
        }
        this.field1884 = false;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()I")
    public final int method611() {
        this.method608();
        return this.field1893;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
    public final void method612() {
        for (int var1 = 0; var1 < this.field1874; ++var1) {
            int var2 = this.field1896[var1];
            this.field1896[var1] = this.field1894[var1];
            this.field1894[var1] = -var2;
        }
        this.field1884 = false;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
    public final void method613(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1874; ++var4) {
            this.field1896[var4] = this.field1896[var4] * arg0 / 128;
            this.field1889[var4] = this.field1889[var4] * arg1 / 128;
            this.field1894[var4] = this.field1894[var4] * arg2 / 128;
        }
        this.field1884 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lf;I)V")
    public abstract void method614(class51 arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)Lia;")
    public abstract class81 method615(boolean arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lf;ILf;I[I)V")
    public abstract void method616(class51 arg0, int arg1, class51 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public final void method618(int arg0) {
        int var2 = field1891[arg0];
        int var3 = field1879[arg0];
        for (int var4 = 0; var4 < this.field1874; ++var4) {
            int var5 = this.field1896[var4] * var3 + this.field1889[var4] * var2 >> 16;
            this.field1889[var4] = this.field1889[var4] * var3 - this.field1896[var4] * var2 >> 16;
            this.field1896[var4] = var5;
        }
        this.field1884 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "()V")
    public final void method620() {
        for (int var1 = 0; var1 < this.field1874; ++var1) {
            int var2 = this.field1894[var1];
            this.field1894[var1] = this.field1896[var1];
            this.field1896[var1] = -var2;
        }
        this.field1884 = false;
    }
}
