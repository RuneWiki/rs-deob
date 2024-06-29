import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class167 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public int field2586 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lna;")
    public static class26 field2589 = class69.method505("m-Ochte mit Ihnen handeln)3", (byte) -119);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Z")
    public static boolean field2582 = false;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lna;")
    public static class26 field2590 = class69.method505(" zuerst von Ihrer Freunde)2Liste(Q", (byte) -119);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Lve;")
    public static class266 field2587;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[[[I")
    public static int[][][] field2588;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1128(int arg0) {
        field2593++;
        int[] var1 = new int[class115.field1818];
        int var2 = 0;
        for (int var3 = 0; var3 < class115.field1818; var3++) {
            class217 var4 = class45.method341(var3, (byte) 119);
            if (var4.field3448 >= 0 || var4.field3410 >= 0) {
                var1[var2++] = var3;
            }
        }
        class196.field3039 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class196.field3039[var5] = var1[var5];
        }
        if (arg0 != 128) {
            method1128(19);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lve;I)V", line = 47)
    public static final void method1129(class266 arg0, int arg1) {
        field2585++;
        class137.field2097 = arg0;
        if (arg1 < 39) {
            field2591 = -82;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILwa;)V", line = 83)
    public final void method1130(int arg0, class82 arg1) {
        while (true) {
            int var3 = arg1.method642((byte) -74);
            if (var3 == 0) {
                if (arg0 != -20638) {
                    method1129((class266) null, 55);
                }
                field2592++;
                return;
            }
            this.method1132(arg1, (byte) -117, var3);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I[[FI[[FIBIIBZBI[[FILhg;)V", line = 107)
    public static final void method1131(int arg0, int[][] arg1, float[][] arg2, int arg3, float[][] arg4, int arg5, byte arg6, int arg7, int arg8, byte arg9, boolean arg10, byte arg11, int arg12, float[][] arg13, int arg14, class172 arg15) {
        field2584++;
        int var16 = (arg0 << 8) + 255;
        int var17 = (arg5 << 8) + 255;
        int var18 = (arg8 << 8) + 255;
        int var19 = (arg14 << 8) + 255;
        int[] var20 = class287.field4804[arg11];
        int[] var21 = new int[var20.length >> 1];
        for (int var22 = 0; var22 < var21.length; var22++) {
            var21[var22] = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -125, arg6, false, arg15, arg2, arg12, var20[var22 + var22], arg4, var20[var22 + var22 + 1]);
        }
        if (arg9 != 88) {
            return;
        }
        int[] var23 = null;
        if (arg10) {
            if (arg11 == 1) {
                int var25 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -122, arg6, true, arg15, arg2, arg12, 64, arg4, 128);
                int var26 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -114, arg6, true, arg15, arg2, arg12, 128, arg4, 64);
                var23 = new int[] { var26, var25, var21[2], var25, var21[0], var21[2] };
            } else if (arg11 == 2) {
                var23 = new int[6];
                int var27 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -121, arg6, true, arg15, arg2, arg12, 128, arg4, 128);
                int var28 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -128, arg6, true, arg15, arg2, arg12, 64, arg4, 0);
                var23[2] = var27;
                var23[0] = var21[0];
                var23[5] = var21[0];
                var23[3] = var27;
                var23[1] = var28;
                var23[4] = var21[1];
            } else if (arg11 == 3) {
                var23 = new int[6];
                int var42 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -114, arg6, true, arg15, arg2, arg12, 0, arg4, 128);
                int var43 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -115, arg6, true, arg15, arg2, arg12, 64, arg4, 0);
                var23[4] = var43;
                var23[1] = var21[1];
                var23[0] = var21[2];
                var23[3] = var42;
                var23[2] = var42;
                var23[5] = var21[2];
            } else if (arg11 == 4) {
                var23 = new int[3];
                int var29 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -115, arg6, true, arg15, arg2, arg12, 0, arg4, 128);
                var23[0] = var21[3];
                var23[2] = var21[0];
                var23[1] = var29;
            } else if (arg11 == 5) {
                var23 = new int[3];
                int var41 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -112, arg6, true, arg15, arg2, arg12, 128, arg4, 128);
                var23[1] = var41;
                var23[0] = var21[2];
                var23[2] = var21[3];
            } else if (arg11 == 6) {
                var23 = new int[6];
                int var39 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -123, arg6, true, arg15, arg2, arg12, 128, arg4, 0);
                int var40 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -115, arg6, true, arg15, arg2, arg12, 128, arg4, 128);
                var23[1] = var39;
                var23[0] = var21[3];
                var23[2] = var40;
                var23[4] = var21[0];
                var23[3] = var40;
                var23[5] = var21[3];
            } else if (arg11 == 7) {
                var23 = new int[6];
                int var30 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -126, arg6, true, arg15, arg2, arg12, 0, arg4, 128);
                int var31 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -117, arg6, true, arg15, arg2, arg12, 128, arg4, 0);
                var23[3] = var30;
                var23[2] = var30;
                var23[0] = var21[1];
                var23[4] = var21[2];
                var23[1] = var31;
                var23[5] = var21[1];
            } else if (arg11 == 8) {
                var23 = new int[3];
                int var32 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -117, arg6, true, arg15, arg2, arg12, 0, arg4, 0);
                var23[2] = var21[4];
                var23[0] = var21[3];
                var23[1] = var32;
            } else if (arg11 == 9) {
                int var33 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -118, arg6, true, arg15, arg2, arg12, 128, arg4, 64);
                int var34 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -121, arg6, true, arg15, arg2, arg12, 96, arg4, 32);
                int var35 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -120, arg6, true, arg15, arg2, arg12, 64, arg4, 0);
                var23 = new int[] { var34, var33, var21[4], var34, var21[4], var21[3], var34, var21[3], var21[2], var34, var21[2], var21[1], var34, var21[1], var35 };
            } else if (arg11 == 10) {
                var23 = new int[9];
                int var38 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -120, arg6, true, arg15, arg2, arg12, 0, arg4, 128);
                var23[0] = var21[2];
                var23[8] = var21[0];
                var23[1] = var38;
                var23[4] = var38;
                var23[2] = var21[3];
                var23[7] = var38;
                var23[3] = var21[3];
                var23[5] = var21[4];
                var23[6] = var21[4];
            } else if (arg11 == 11) {
                var23 = new int[12];
                int var36 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -119, arg6, true, arg15, arg2, arg12, 0, arg4, 64);
                int var37 = class17.method116(var19, 0.0F, var16, var17, (int[][]) null, arg1, arg3, arg13, var18, (byte) -121, arg6, true, arg15, arg2, arg12, 128, arg4, 64);
                var23[5] = var36;
                var23[1] = var36;
                var23[8] = var36;
                var23[0] = var21[3];
                var23[2] = var21[0];
                var23[11] = var37;
                var23[6] = var21[2];
                var23[7] = var37;
                var23[10] = var21[1];
                var23[3] = var21[3];
                var23[4] = var21[2];
                var23[9] = var21[2];
            }
        }
        arg15.method1184(arg7, arg3, arg12, var21, var23, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lwa;BI)V", line = 385)
    private final void method1132(class82 arg0, byte arg1, int arg2) {
        if (arg1 > -86) {
            this.method1130(-83, (class82) null);
        }
        field2595++;
        if (arg2 == 5) {
            this.field2586 = arg0.method576(1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 419)
    public static void method1133(byte arg0) {
        field2589 = null;
        field2590 = null;
        field2587 = null;
        field2588 = (int[][][]) null;
        if (arg0 != 62) {
            field2587 = (class266) null;
        }
    }
}
