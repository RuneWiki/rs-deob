import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class38 extends class186 {

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "Z")
    public boolean field862 = false;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public int field851 = 0;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public int field866 = 0;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "Z")
    public boolean field868 = false;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "[I")
    private static int[] field861 = class194.field3803;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "[I")
    private static int[] field864 = class194.field3787;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Z")
    public static boolean field860 = false;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "[J")
    public static long[] field867 = new long[1000];

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "S")
    public short field849;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "S")
    public short field852;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "S")
    public short field853;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "S")
    public short field854;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "S")
    public short field855;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "S")
    public short field856;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "S")
    public short field869;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
    public int[] field850;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "[I")
    public int[] field870;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "[I")
    public int[] field871;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "[[I")
    public int[][] field857;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "[[I")
    public int[][] field863;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()V")
    public final void method236() {
        if (!this.field862) {
            this.field862 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field866; ++var9) {
                int var10 = this.field871[var9];
                int var11 = this.field850[var9];
                int var12 = this.field870[var9];
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
            this.field852 = (short) var1;
            this.field855 = (short) var4;
            super.field3511 = (short) var2;
            this.field854 = (short) var5;
            this.field869 = (short) var3;
            this.field853 = (short) var6;
            this.field856 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field849 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([[IIIIZI)Ldg;")
    public abstract class38 method237(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public final void method238(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field866; ++var4) {
            this.field871[var4] = this.field871[var4] * arg0 / 128;
            this.field850[var4] = this.field850[var4] * arg1 / 128;
            this.field870[var4] = this.field870[var4] * arg2 / 128;
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V")
    public static void method239() {
        field864 = null;
        field861 = null;
        field867 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)Ldg;")
    public abstract class38 method240(boolean arg0);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
    public final void method241(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field866; ++var4) {
            this.field871[var4] += arg0;
            this.field850[var4] += arg1;
            this.field870[var4] += arg2;
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public final void method243(int arg0) {
        int var2 = field864[arg0];
        int var3 = field861[arg0];
        for (int var4 = 0; var4 < this.field866; ++var4) {
            int var5 = this.field850[var4] * var3 - this.field870[var4] * var2 >> 16;
            this.field870[var4] = this.field870[var4] * var3 + this.field850[var4] * var2 >> 16;
            this.field850[var4] = var5;
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lef;I)V")
    public abstract void method244(class47 arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)Ldg;")
    public abstract class38 method245(boolean arg0);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
    public final int method246() {
        this.method236();
        return this.field856;
    }

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
    public final void method247(int arg0) {
        int var2 = field864[arg0];
        int var3 = field861[arg0];
        for (int var4 = 0; var4 < this.field866; ++var4) {
            int var5 = this.field871[var4] * var3 + this.field850[var4] * var2 >> 16;
            this.field850[var4] = this.field850[var4] * var3 - this.field871[var4] * var2 >> 16;
            this.field871[var4] = var5;
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()V")
    public final void method248() {
        for (int var1 = 0; var1 < this.field866; ++var1) {
            this.field871[var1] = -this.field871[var1];
            this.field870[var1] = -this.field870[var1];
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lef;ILef;I[I)V")
    public abstract void method249(class47 arg0, int arg1, class47 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
    public final void method250() {
        for (int var1 = 0; var1 < this.field866; ++var1) {
            int var2 = this.field870[var1];
            this.field870[var1] = this.field871[var1];
            this.field871[var1] = -var2;
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "()V")
    public final void method251() {
        for (int var1 = 0; var1 < this.field866; ++var1) {
            int var2 = this.field871[var1];
            this.field871[var1] = this.field870[var1];
            this.field870[var1] = -var2;
        }
        this.field862 = false;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
