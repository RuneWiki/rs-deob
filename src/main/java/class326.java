import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class326 {

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Z")
    public boolean field4762 = false;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4753 = 0;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "[I")
    public static int[] field4758 = new int[2048];

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lrp;")
    public class305 field4757;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "[[I")
    public static int[][] field4755;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILwm;)V", line = 6)
    private final void method1962(int arg0, int arg1, class403 arg2) {
        field4756++;
        int var4 = 0 / ((39 - arg1) / 38);
        if (arg0 == 1) {
            this.field4761 = arg2.method2338(0);
        } else if (arg0 == 2) {
            this.field4759 = arg2.method2323((byte) 120);
        } else if (arg0 == 3) {
            this.field4762 = true;
            return;
        } else if (arg0 == 4) {
            this.field4761 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 33)
    public static void method1963(int arg0) {
        if (arg0 != 23497) {
            field4758 = null;
        }
        field4758 = null;
        field4755 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lwm;I)V", line = 46)
    public final void method1964(class403 arg0, int arg1) {
        int var3 = -66 % ((arg1 - 10) / 52);
        field4751++;
        while (true) {
            int var4 = arg0.method2357((byte) 105);
            if (var4 == 0) {
                return;
            }
            this.method1962(var4, 113, arg0);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZILza;I)Lo;", line = 67)
    public final class24 method1965(boolean arg0, int arg1, class290 arg2, int arg3) {
        field4754++;
        long var5 = (long) ((arg0 ? 262144 : 0) | arg3 << 16 | this.field4761 | arg2.field4237 << 19);
        class24 var7 = (class24) this.field4757.field4447.method1088(var5, (byte) 37);
        if (arg1 != 874) {
            return null;
        } else if (var7 != null) {
            return var7;
        } else if (this.field4757.field4444.method424(0, this.field4761)) {
            class506 var8 = class506.method3018(this.field4757.field4444, this.field4761, 0);
            if (var8 != null) {
                var8.field7494 = var8.field7497 = var8.field7491 = var8.field7492 = 0;
                if (arg0) {
                    var8.method3012();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method3011();
                }
            }
            class24 var10 = arg2.method312(var8, true);
            if (var10 != null) {
                this.field4757.field4447.method1097(19627, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V", line = 115)
    public static final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4752++;
        class503.method2965((byte) -10, arg2);
        int var7 = 0;
        int var8 = arg2 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        if (arg5 != 262144) {
            return;
        }
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class112.field1523[arg6];
        int var16 = arg4 - var8;
        class447.method2605(-7, arg4 - arg2, arg1, var16, var15);
        int var17 = arg4 + var8;
        class447.method2605(arg5 - 262151, var16, arg3, var17, var15);
        class447.method2605(-7, var17, arg1, arg2 + arg4, var15);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class280.field4141[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class112.field1523[arg6 + var9];
                    int[] var19 = class112.field1523[arg6 - var9];
                    int var20 = class280.field4141[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class447.method2605(-7, var22, arg1, var24, var18);
                    class447.method2605(-7, var24, arg3, var23, var18);
                    class447.method2605(-7, var23, arg1, var21, var18);
                    class447.method2605(-7, var22, arg1, var24, var19);
                    class447.method2605(-7, var24, arg3, var23, var19);
                    class447.method2605(-7, var23, arg1, var21, var19);
                } else {
                    int[] var25 = class112.field1523[arg6 + var9];
                    int[] var26 = class112.field1523[arg6 - var9];
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var7;
                    class447.method2605(arg5 ^ 0xFFFBFFF9, var28, arg1, var27, var25);
                    class447.method2605(-7, var28, arg1, var27, var26);
                }
            }
            int[] var29 = class112.field1523[arg6 + var7];
            int[] var30 = class112.field1523[arg6 - var7];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var8 > var7) {
                int var33 = var7 <= var11 ? var11 : class280.field4141[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class447.method2605(-7, var32, arg1, var35, var29);
                class447.method2605(arg5 - 262151, var35, arg3, var34, var29);
                class447.method2605(-7, var34, arg1, var31, var29);
                class447.method2605(-7, var32, arg1, var35, var30);
                class447.method2605(-7, var35, arg3, var34, var30);
                class447.method2605(-7, var34, arg1, var31, var30);
            } else {
                class447.method2605(-7, var32, arg1, var31, var29);
                class447.method2605(-7, var32, arg1, var31, var30);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Z", line = 248)
    public final boolean method1967(byte arg0) {
        if (arg0 <= 102) {
            return false;
        } else {
            field4760++;
            return this.field4757.field4444.method424(0, this.field4761);
        }
    }
}
