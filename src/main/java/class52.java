import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class52 extends class4 {

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Z")
    public boolean field857 = false;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Z")
    public boolean field867 = false;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    public int field869 = 0;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public int field872 = 0;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field850 = 0;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "[I")
    private static int[] field864 = class150.field2896;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "[I")
    public static int[] field860 = new int[1000];

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
    public static int field870 = 0;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "Z")
    public static boolean field868 = false;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "[I")
    private static int[] field871 = class150.field2888;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "S")
    public short field851;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "S")
    public short field853;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "S")
    public short field854;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "S")
    public short field855;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "S")
    public short field856;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "S")
    public short field858;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "S")
    public short field866;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "[I")
    public int[] field861;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "[I")
    public int[] field862;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "[I")
    public int[] field863;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[[I")
    public int[][] field852;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "[[I")
    public int[][] field865;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
    public final void method269() {
        if (!this.field857) {
            this.field857 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field869; ++var9) {
                int var10 = this.field862[var9];
                int var11 = this.field861[var9];
                int var12 = this.field863[var9];
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
            this.field853 = (short) var1;
            this.field854 = (short) var4;
            super.field73 = (short) var2;
            this.field851 = (short) var5;
            this.field866 = (short) var3;
            this.field856 = (short) var6;
            this.field855 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field858 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
    public final void method270() {
        for (int var1 = 0; var1 < this.field869; ++var1) {
            int var2 = this.field862[var1];
            this.field862[var1] = this.field863[var1];
            this.field863[var1] = -var2;
        }
        this.field857 = false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([[IIIIZI)Lfd;")
    public abstract class52 method271(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)Lfd;")
    public abstract class52 method273(boolean arg0);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
    public final void method274() {
        for (int var1 = 0; var1 < this.field869; ++var1) {
            int var2 = this.field863[var1];
            this.field863[var1] = this.field862[var1];
            this.field862[var1] = -var2;
        }
        this.field857 = false;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()I")
    public final int method275() {
        this.method269();
        return this.field855;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method276(int arg0) {
        int var2 = field864[arg0];
        int var3 = field871[arg0];
        for (int var4 = 0; var4 < this.field869; ++var4) {
            int var5 = this.field861[var4] * var3 - this.field863[var4] * var2 >> 16;
            this.field863[var4] = this.field863[var4] * var3 + this.field861[var4] * var2 >> 16;
            this.field861[var4] = var5;
        }
        this.field857 = false;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)Lfd;")
    public abstract class52 method277(boolean arg0);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Leg;I)V")
    public abstract void method279(class46 arg0, int arg1);

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
    public static void method280() {
        field864 = null;
        field871 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "()V")
    public final void method281() {
        for (int var1 = 0; var1 < this.field869; ++var1) {
            this.field862[var1] = -this.field862[var1];
            this.field863[var1] = -this.field863[var1];
        }
        this.field857 = false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Leg;ILeg;I[I)V")
    public abstract void method282(class46 arg0, int arg1, class46 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final void method283(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field869; ++var4) {
            this.field862[var4] = this.field862[var4] * arg0 / 128;
            this.field861[var4] = this.field861[var4] * arg1 / 128;
            this.field863[var4] = this.field863[var4] * arg2 / 128;
        }
        this.field857 = false;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public final void method284(int arg0) {
        int var2 = field864[arg0];
        int var3 = field871[arg0];
        for (int var4 = 0; var4 < this.field869; ++var4) {
            int var5 = this.field862[var4] * var3 + this.field861[var4] * var2 >> 16;
            this.field861[var4] = this.field861[var4] * var3 - this.field862[var4] * var2 >> 16;
            this.field862[var4] = var5;
        }
        this.field857 = false;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
    public final void method285(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field869; ++var4) {
            this.field862[var4] += arg0;
            this.field861[var4] += arg1;
            this.field863[var4] += arg2;
        }
        this.field857 = false;
    }
}
