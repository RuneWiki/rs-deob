import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class39 {

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "J")
    public long field656 = 0L;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
    public static boolean field643 = true;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lna;")
    private static class26 field647 = class69.method505("RuneScape is loading )2 please wait)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lna;")
    public static class26 field640 = field647;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field641 = 5063219;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lgn;")
    public static class5 field633 = new class5(16);

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[[I")
    public static int[][] field657 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public int field653;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lth;")
    public class86 field632;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 24)
    public static final void method316(int arg0, int arg1) {
        class85.field1388.method1985(arg0 ^ 0x34BD, arg1);
        field638++;
        if (arg0 != -13508) {
            field640 = (class26) null;
        }
        class88.field1447.method1985(-126, arg1);
        class5.field59.method1985(-126, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 40)
    public static void method317(int arg0) {
        field633 = null;
        field657 = (int[][]) null;
        field647 = null;
        if (arg0 != 128) {
            method317(113);
        }
        field640 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([[IZILhg;[IIIIZ[[FZI[[FIIIZ[[I[[FBI[Z)V", line = 59)
    public static final void method318(int[][] arg0, boolean arg1, int arg2, class172 arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8, float[][] arg9, boolean arg10, int arg11, float[][] arg12, int arg13, int arg14, int arg15, boolean arg16, int[][] arg17, float[][] arg18, byte arg19, int arg20, boolean[] arg21) {
        int var22 = (arg2 << 8) + (arg1 ? 255 : 0);
        field631++;
        int var23 = (arg8 ? 255 : 0) + (arg15 << 8);
        int[] var24 = new int[arg4.length / arg11];
        int var25 = (arg10 ? 255 : 0) + (arg14 << 8);
        int var26 = (arg20 << 8) + (arg16 ? 255 : 0);
        for (int var27 = 0; var27 < var24.length; var27++) {
            int var28 = arg4[var27 + var27];
            int[][] var29 = arg0 == null || arg21 == null || !arg21[var27] ? arg17 : arg0;
            int var30 = arg4[var27 + var27 + 1];
            var24[var27] = class17.method116(var25, (float) arg13, var22, var26, arg0, var29, arg7, arg18, var23, (byte) -116, arg19, false, arg3, arg9, arg5, var28, arg12, var30);
        }
        arg3.method1184(arg6, arg7, arg5, var24, (int[]) null, false);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Object;I[III)V", line = 93)
    public static final void method319(Object[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg2[var5];
            int var7 = arg4;
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var6;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (((var9 & 0x1) + var6) > arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7++] = var11;
                }
            }
            arg2[arg1] = arg2[var7];
            arg2[var7] = var6;
            arg0[arg1] = arg0[var7];
            arg0[var7] = var8;
            method319(arg0, var7 - 1, arg2, 47, arg4);
            method319(arg0, arg1, arg2, 100, var7 + 1);
        }
        field654++;
        if (arg3 < 16) {
            method318((int[][]) ((int[][]) null), true, 94, (class172) null, (int[]) null, -50, -107, -51, false, (float[][]) ((float[][]) null), true, 73, (float[][]) ((float[][]) null), -92, -7, -23, true, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte) 52, 41, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V", line = 153)
    public static final void method320(int arg0, boolean arg1) {
        if (arg0 == 96) {
            field636++;
            class133.field2035 = arg1;
            class5.field54 = !class324.method2250(42);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 175)
    public static final void method321(byte arg0) {
        field650++;
        if (!class86.field1420) {
            return;
        }
        int var1 = 88 / ((57 - arg0) / 59);
        class297 var2 = class148.method1011((byte) -19, class29.field501, class297.field5087);
        if (var2 != null && var2.field5115 != null) {
            class263 var3 = new class263();
            var3.field4306 = var2.field5115;
            var3.field4307 = var2;
            class215.method1442(1073376993, var3);
        }
        class86.field1420 = false;
        class132.field2013 = -1;
        class318.method2209(-107, var2);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 214)
    public static final void method322(int arg0) {
        field651++;
        class263.field4308.method1987(3);
        if (arg0 != 0) {
            method320(121, true);
        }
    }
}
