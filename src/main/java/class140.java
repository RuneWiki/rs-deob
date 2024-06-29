import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class140 extends class52 {

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Z")
    public boolean field2537 = false;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    public int field2557 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "Z")
    public boolean field2540 = false;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public int field2555 = 0;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field2536 = 0;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "Z")
    public static boolean field2543 = false;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "[I")
    private static int[] field2550 = class23.field422;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "[I")
    private static int[] field2545 = class23.field434;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "[J")
    public static long[] field2553 = new long[1000];

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "S")
    public short field2541;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "S")
    public short field2542;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "S")
    public short field2546;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "S")
    public short field2548;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "S")
    public short field2549;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "S")
    public short field2552;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "S")
    public short field2556;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
    public int[] field2538;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "[I")
    public int[] field2539;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "[I")
    public int[] field2544;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "[[I")
    public int[][] field2547;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "[[I")
    public int[][] field2558;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)Loh;")
    public abstract class140 method546(boolean arg0);

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public final void method862(int arg0) {
        int var2 = field2550[arg0];
        int var3 = field2545[arg0];
        for (int var4 = 0; var4 < this.field2557; ++var4) {
            int var5 = this.field2544[var4] * var3 - this.field2539[var4] * var2 >> 16;
            this.field2539[var4] = this.field2544[var4] * var2 + this.field2539[var4] * var3 >> 16;
            this.field2544[var4] = var5;
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfd;I)V")
    public abstract void method548(class54 arg0, int arg1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([[IIIIZI)Loh;")
    public abstract class140 method555(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public static void method863() {
        field2550 = null;
        field2545 = null;
        field2553 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfd;ILfd;I[I)V")
    public abstract void method560(class54 arg0, int arg1, class54 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
    public final void method864() {
        for (int var1 = 0; var1 < this.field2557; ++var1) {
            int var2 = this.field2538[var1];
            this.field2538[var1] = this.field2539[var1];
            this.field2539[var1] = -var2;
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "()V")
    public final void method865() {
        for (int var1 = 0; var1 < this.field2557; ++var1) {
            int var2 = this.field2539[var1];
            this.field2539[var1] = this.field2538[var1];
            this.field2538[var1] = -var2;
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "()V")
    public final void method866() {
        for (int var1 = 0; var1 < this.field2557; ++var1) {
            this.field2538[var1] = -this.field2538[var1];
            this.field2539[var1] = -this.field2539[var1];
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "()I")
    public final int method867() {
        this.method870();
        return this.field2552;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(III)V")
    public final void method868(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2557; ++var4) {
            this.field2538[var4] = this.field2538[var4] * arg0 / 128;
            this.field2544[var4] = this.field2544[var4] * arg1 / 128;
            this.field2539[var4] = this.field2539[var4] * arg2 / 128;
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(III)V")
    public final void method869(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2557; ++var4) {
            this.field2538[var4] += arg0;
            this.field2544[var4] += arg1;
            this.field2539[var4] += arg2;
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "()V")
    public final void method870() {
        if (!this.field2540) {
            this.field2540 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field2557; ++var9) {
                int var10 = this.field2538[var9];
                int var11 = this.field2544[var9];
                int var12 = this.field2539[var9];
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
            this.field2541 = (short) var1;
            this.field2542 = (short) var4;
            super.field949 = (short) var2;
            this.field2548 = (short) var5;
            this.field2556 = (short) var3;
            this.field2549 = (short) var6;
            this.field2552 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field2546 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public final void method871(int arg0) {
        int var2 = field2550[arg0];
        int var3 = field2545[arg0];
        for (int var4 = 0; var4 < this.field2557; ++var4) {
            int var5 = this.field2544[var4] * var2 + this.field2538[var4] * var3 >> 16;
            this.field2544[var4] = this.field2544[var4] * var3 - this.field2538[var4] * var2 >> 16;
            this.field2538[var4] = var5;
        }
        this.field2540 = false;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(Z)Loh;")
    public abstract class140 method549(boolean arg0);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
