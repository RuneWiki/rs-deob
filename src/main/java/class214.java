import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class214 {

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Lok;")
    public static class41 field3450 = class137.method956("Texturen geladen)3", 45);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lmh;")
    public static class65 field3444;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[[[I")
    public static int[][][] field3443;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILmh;I)Lpi;", line = 6)
    public static final class207 method1511(int arg0, class65 arg1, int arg2) {
        if (arg2 < 0) {
            field3450 = (class41) null;
        }
        field3449++;
        byte[] var3 = arg1.method479(arg0, (byte) 62);
        return var3 == null ? null : new class207(var3);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 21)
    public static final void method1512() {
        GL var0 = class166.field2648;
        var0.glDisableClientState(32886);
        class166.method1190(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class166.method1184();
        for (int var1 = 0; var1 < class236.field3791[0].length; var1++) {
            class6 var2 = class236.field3791[0][var1];
            if (var2.field92 >= 0 && class31.field461.method690(var2.field92, (byte) -29) == 4) {
                var0.glColor4fv(class145.method1006(var2.field79, (byte) -87), 0);
                float var3 = 201.5F - (var2.field95 ? 1.0F : 0.5F);
                var2.method20(class205.field3312, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class166.method1195();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class166.method1172();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lmh;B)Z", line = 60)
    public static final boolean method1513(class65 arg0, byte arg1) {
        field3446++;
        if (arg1 <= 99) {
            field3450 = (class41) null;
        }
        return arg0.method463(1, class46.field723);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 75)
    public static final void method1514(byte arg0) {
        field3448++;
        if (arg0 != -21) {
            field3450 = (class41) null;
        }
        class57.field821.method131(arg0 ^ 0x15);
        class156.field2460.method131(-2);
        class18.field228.method131(-2);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 93)
    public static void method1515(int arg0) {
        field3450 = null;
        field3444 = null;
        field3443 = (int[][][]) null;
        if (arg0 != -2241) {
            method1513((class65) null, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([[II[[F[[FILdg;[[FIBBIIBZII)V", line = 114)
    public static final void method1516(int[][] arg0, int arg1, float[][] arg2, float[][] arg3, int arg4, class6 arg5, float[][] arg6, int arg7, byte arg8, byte arg9, int arg10, int arg11, byte arg12, boolean arg13, int arg14, int arg15) {
        int var16 = (arg11 << 8) + 255;
        int var17 = (arg10 << 8) + 255;
        int var18 = (arg14 << 8) + 255;
        field3447++;
        int[] var19 = class301.field4884[arg9];
        if (arg12 < 8) {
            return;
        }
        int[] var20 = null;
        int var21 = (arg7 << 8) + 255;
        int[] var22 = new int[var19.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -91, arg8, arg1, false, arg3, 0.0F, arg0, var18, var21, arg5, var19[var23 + var23], var19[var23 + var23 + 1]);
        }
        if (arg13) {
            if (arg9 == 1) {
                var20 = new int[6];
                int var25 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -107, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 64, 128);
                int var26 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -89, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 64);
                var20[2] = var22[2];
                var20[1] = var25;
                var20[0] = var26;
                var20[3] = var25;
                var20[4] = var22[0];
                var20[5] = var22[2];
            } else if (arg9 == 2) {
                var20 = new int[6];
                int var27 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -118, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 128);
                int var28 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -125, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 64, 0);
                var20[0] = var22[0];
                var20[3] = var27;
                var20[5] = var22[0];
                var20[1] = var28;
                var20[2] = var27;
                var20[4] = var22[1];
            } else if (arg9 == 3) {
                var20 = new int[6];
                int var29 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) 117, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 0, 128);
                int var30 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) 85, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 64, 0);
                var20[1] = var22[1];
                var20[3] = var29;
                var20[0] = var22[2];
                var20[4] = var30;
                var20[2] = var29;
                var20[5] = var22[2];
            } else if (arg9 == 4) {
                var20 = new int[3];
                int var43 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -101, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 0, 128);
                var20[0] = var22[3];
                var20[1] = var43;
                var20[2] = var22[0];
            } else if (arg9 == 5) {
                var20 = new int[3];
                int var31 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -113, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 128);
                var20[1] = var31;
                var20[0] = var22[2];
                var20[2] = var22[3];
            } else if (arg9 == 6) {
                var20 = new int[6];
                int var32 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -101, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 0);
                int var33 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -77, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 128);
                var20[1] = var32;
                var20[0] = var22[3];
                var20[4] = var22[0];
                var20[2] = var33;
                var20[3] = var33;
                var20[5] = var22[3];
            } else if (arg9 == 7) {
                int var41 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -115, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 0, 128);
                var20 = new int[6];
                int var42 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -118, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 0);
                var20[3] = var41;
                var20[2] = var41;
                var20[0] = var22[1];
                var20[1] = var42;
                var20[5] = var22[1];
                var20[4] = var22[2];
            } else if (arg9 == 8) {
                var20 = new int[3];
                int var34 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) 90, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 0, 0);
                var20[0] = var22[3];
                var20[2] = var22[4];
                var20[1] = var34;
            } else if (arg9 == 9) {
                var20 = new int[15];
                int var35 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) 93, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 64);
                int var36 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) 110, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 96, 32);
                int var37 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -104, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 64, 0);
                var20[12] = var36;
                var20[6] = var36;
                var20[2] = var22[4];
                var20[14] = var37;
                var20[9] = var36;
                var20[0] = var36;
                var20[3] = var36;
                var20[7] = var22[3];
                var20[5] = var22[3];
                var20[4] = var22[4];
                var20[1] = var35;
                var20[13] = var22[1];
                var20[8] = var22[2];
                var20[11] = var22[1];
                var20[10] = var22[2];
            } else if (arg9 == 10) {
                int var38 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) 89, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 0, 128);
                var20 = new int[] { var22[2], var38, var22[3], var22[3], var38, var22[4], var22[4], var38, var22[0] };
            } else if (arg9 == 11) {
                var20 = new int[12];
                int var39 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -108, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 0, 64);
                int var40 = class149.method1035(arg15, arg2, (int[][]) null, arg6, var17, var16, (byte) -86, arg8, arg1, true, arg3, 0.0F, arg0, var18, var21, arg5, 128, 64);
                var20[8] = var39;
                var20[7] = var40;
                var20[5] = var39;
                var20[1] = var39;
                var20[10] = var22[1];
                var20[11] = var40;
                var20[0] = var22[3];
                var20[3] = var22[3];
                var20[2] = var22[0];
                var20[9] = var22[2];
                var20[6] = var22[2];
                var20[4] = var22[2];
            }
        }
        arg5.method25(arg4, arg15, arg1, var22, var20, false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 383)
    public static final void method1517(int[] arg0, byte arg1, Object[] arg2) {
        field3445++;
        class249.method1767(arg2, true, arg0, 0, arg0.length - 1);
        if (arg1 < 63) {
            field3450 = (class41) null;
        }
    }
}
