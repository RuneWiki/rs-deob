import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class187 {

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lof;")
    private class328 field2722 = new class328(64);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lmn;")
    private class162 field2720;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lss;")
    public static class213 field2723 = new class213("M", "M", "M", "M");

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[[F")
    public static float[][] field2730 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Z")
    public static boolean field2731 = false;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lcc;")
    public static class123 field2727;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    public static int[] field2726;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "[[B")
    public static byte[][] field2729;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[[S")
    public static short[][] field2725;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field2726 = null;
        field2729 = null;
        field2730 = null;
        if (arg0 != 7) {
            method1167(-114);
        }
        field2727 = null;
        field2725 = null;
        field2723 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public final void method1168(int arg0, int arg1) {
        class328 var3 = this.field2722;
        synchronized (this.field2722) {
            this.field2722.method2202(0, arg1);
            if (arg0 != 11) {
                method1167(-6);
            }
        }
        field2721++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public final void method1169(byte arg0) {
        field2718++;
        class328 var2 = this.field2722;
        synchronized (this.field2722) {
            int var3 = 16 / ((arg0 + 5) / 42);
            this.field2722.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIF[FIIIBF)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, byte arg9, float arg10) {
        int var11 = arg7 - arg6;
        int var12 = arg3 - arg0;
        int var13 = arg8 - arg2;
        int var14 = 34 / ((-arg9 - 1) / 37);
        field2733++;
        float var15 = arg5[2] * (float) var12 + arg5[1] * (float) var11 + arg5[0] * (float) var13;
        float var16 = arg5[5] * (float) var12 + arg5[4] * (float) var11 + arg5[3] * (float) var13;
        float var17 = arg5[8] * (float) var12 + arg5[7] * (float) var11 + arg5[6] * (float) var13;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg10 != 1.0F) {
            var18 = arg10 * var18;
        }
        float var19 = var16 + arg4 + 0.5F;
        if (arg1 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg1 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class464.field7127 = var19;
        class193.field2860 = var18;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lpk;")
    public final class442 method1171(byte arg0, int arg1) {
        field2728++;
        if (arg0 != 82) {
            return null;
        }
        class328 var3 = this.field2722;
        class442 var4;
        synchronized (this.field2722) {
            var4 = (class442) this.field2722.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field2720;
        byte[] var6;
        synchronized (this.field2720) {
            var6 = this.field2720.method1004(11, false, arg1);
        }
        class442 var7 = new class442();
        if (var6 != null) {
            var7.method2802(new class208(var6), (byte) 10);
        }
        class328 var8 = this.field2722;
        synchronized (this.field2722) {
            this.field2722.method2188(-123, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public static final void method1172(boolean arg0) {
        if (!arg0) {
            method1167(-105);
        }
        class12.field121 = -1;
        field2732++;
        class256.field4148 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public final void method1173(int arg0) {
        class328 var2 = this.field2722;
        synchronized (this.field2722) {
            if (arg0 > -88) {
                field2723 = null;
            }
            this.field2722.method2189(false);
        }
        field2724++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIB)V")
    public static final void method1174(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2719++;
        class456 var5 = class233.method1654(arg1, 10, 32);
        var5.method2858(10250);
        var5.field7042 = arg2;
        if (arg4 > -104) {
            field2731 = true;
        }
        var5.field7039 = arg0;
        var5.field7041 = arg3;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class187(class236 arg0, int arg1, class162 arg2) {
        this.field2720 = arg2;
        if (this.field2720 != null) {
            this.field2720.method1008(11, (byte) -21);
        }
    }
}
