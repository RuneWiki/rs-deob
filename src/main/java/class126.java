import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class126 extends class42 {

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "Z")
    public boolean field2485 = false;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    public int field2472 = 0;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public int field2475 = 0;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "Z")
    public boolean field2484 = false;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "Z")
    public static boolean field2480 = false;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "[I")
    private static int[] field2474 = class40.field717;

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "[I")
    public static int[] field2492 = new int[1000];

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "[I")
    private static int[] field2491 = class40.field719;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "S")
    public short field2471;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "S")
    public short field2476;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "S")
    public short field2483;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "S")
    public short field2487;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "S")
    public short field2488;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "S")
    public short field2489;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "S")
    public short field2490;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "[I")
    public int[] field2470;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[I")
    public int[] field2479;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "[I")
    public int[] field2486;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "[[I")
    public int[][] field2477;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "[[I")
    public int[][] field2482;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public final void method895(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2472; ++var4) {
            this.field2486[var4] += arg0;
            this.field2479[var4] += arg1;
            this.field2470[var4] += arg2;
        }
        this.field2485 = false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public final void method896() {
        if (!this.field2485) {
            this.field2485 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field2472; ++var9) {
                int var10 = this.field2486[var9];
                int var11 = this.field2479[var9];
                int var12 = this.field2470[var9];
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
            this.field2489 = (short) var1;
            this.field2488 = (short) var4;
            super.field756 = (short) var2;
            this.field2490 = (short) var5;
            this.field2471 = (short) var3;
            this.field2476 = (short) var6;
            this.field2487 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field2483 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
    public final void method897() {
        for (int var1 = 0; var1 < this.field2472; ++var1) {
            this.field2486[var1] = -this.field2486[var1];
            this.field2470[var1] = -this.field2470[var1];
        }
        this.field2485 = false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lo;")
    public abstract class126 method845(boolean arg0);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnc;ILnc;I[I)V")
    public abstract void method849(class120 arg0, int arg1, class120 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
    public final void method898(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2472; ++var4) {
            this.field2486[var4] = this.field2486[var4] * arg0 / 128;
            this.field2479[var4] = this.field2479[var4] * arg1 / 128;
            this.field2470[var4] = this.field2470[var4] * arg2 / 128;
        }
        this.field2485 = false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Lo;")
    public abstract class126 method852(boolean arg0);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "(I)V")
    public final void method899(int arg0) {
        int var2 = field2474[arg0];
        int var3 = field2491[arg0];
        for (int var4 = 0; var4 < this.field2472; ++var4) {
            int var5 = this.field2479[var4] * var3 - this.field2470[var4] * var2 >> 16;
            this.field2470[var4] = this.field2479[var4] * var2 + this.field2470[var4] * var3 >> 16;
            this.field2479[var4] = var5;
        }
        this.field2485 = false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([[IIIIZI)Lo;")
    public abstract class126 method853(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
    public static void method900() {
        field2474 = null;
        field2491 = null;
        field2492 = null;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
    public final void method901() {
        for (int var1 = 0; var1 < this.field2472; ++var1) {
            int var2 = this.field2470[var1];
            this.field2470[var1] = this.field2486[var1];
            this.field2486[var1] = -var2;
        }
        this.field2485 = false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnc;I)V")
    public abstract void method847(class120 arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()V")
    public final void method902() {
        for (int var1 = 0; var1 < this.field2472; ++var1) {
            int var2 = this.field2486[var1];
            this.field2486[var1] = this.field2470[var1];
            this.field2470[var1] = -var2;
        }
        this.field2485 = false;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()I")
    public final int method903() {
        this.method896();
        return this.field2487;
    }
}
