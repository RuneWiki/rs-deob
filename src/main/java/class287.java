import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class287 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[Lwe;")
    public static class182[] field4436 = new class182[8];

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "J")
    public long field4430;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lmh;")
    public class287 field4427;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lmh;")
    public class287 field4432;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([[F[[II[[FIZBIIB[[FILel;IBI)V", line = 7)
    public static final void method2025(float[][] arg0, int[][] arg1, int arg2, float[][] arg3, int arg4, boolean arg5, byte arg6, int arg7, int arg8, byte arg9, float[][] arg10, int arg11, class247 arg12, int arg13, byte arg14, int arg15) {
        int var16 = (arg11 << 8) + 255;
        if (arg6 <= 40) {
            field4429 = 95;
        }
        int var17 = (arg4 << 8) + 255;
        field4437++;
        int var18 = (arg15 << 8) + 255;
        int[] var19 = class171.field2822[arg14];
        int var20 = (arg7 << 8) + 255;
        int[] var21 = new int[var19.length >> 1];
        int[] var22 = null;
        for (int var23 = 0; var23 < var21.length; var23++) {
            var21[var23] = class121.method875(var20, arg1, var17, false, arg9, var19[var23 + var23], var19[var23 + var23 + 1], arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -123);
        }
        if (arg5) {
            if (arg14 == 1) {
                var22 = new int[6];
                int var42 = class121.method875(var20, arg1, var17, true, arg9, 64, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -109);
                int var43 = class121.method875(var20, arg1, var17, true, arg9, 128, 64, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -121);
                var22[2] = var21[2];
                var22[3] = var42;
                var22[0] = var43;
                var22[1] = var42;
                var22[4] = var21[0];
                var22[5] = var21[2];
            } else if (arg14 == 2) {
                var22 = new int[6];
                int var25 = class121.method875(var20, arg1, var17, true, arg9, 128, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -99);
                int var26 = class121.method875(var20, arg1, var17, true, arg9, 64, 0, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -84);
                var22[1] = var26;
                var22[3] = var25;
                var22[2] = var25;
                var22[4] = var21[1];
                var22[0] = var21[0];
                var22[5] = var21[0];
            } else if (arg14 == 3) {
                var22 = new int[6];
                int var40 = class121.method875(var20, arg1, var17, true, arg9, 0, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -83);
                int var41 = class121.method875(var20, arg1, var17, true, arg9, 64, 0, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -126);
                var22[4] = var41;
                var22[0] = var21[2];
                var22[2] = var40;
                var22[5] = var21[2];
                var22[1] = var21[1];
                var22[3] = var40;
            } else if (arg14 == 4) {
                var22 = new int[3];
                int var27 = class121.method875(var20, arg1, var17, true, arg9, 0, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -101);
                var22[0] = var21[3];
                var22[1] = var27;
                var22[2] = var21[0];
            } else if (arg14 == 5) {
                var22 = new int[3];
                int var28 = class121.method875(var20, arg1, var17, true, arg9, 128, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -119);
                var22[1] = var28;
                var22[0] = var21[2];
                var22[2] = var21[3];
            } else if (arg14 == 6) {
                var22 = new int[6];
                int var38 = class121.method875(var20, arg1, var17, true, arg9, 128, 0, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -114);
                int var39 = class121.method875(var20, arg1, var17, true, arg9, 128, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -97);
                var22[0] = var21[3];
                var22[4] = var21[0];
                var22[3] = var39;
                var22[5] = var21[3];
                var22[1] = var38;
                var22[2] = var39;
            } else if (arg14 == 7) {
                var22 = new int[6];
                int var29 = class121.method875(var20, arg1, var17, true, arg9, 0, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -116);
                int var30 = class121.method875(var20, arg1, var17, true, arg9, 128, 0, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -128);
                var22[3] = var29;
                var22[0] = var21[1];
                var22[1] = var30;
                var22[5] = var21[1];
                var22[2] = var29;
                var22[4] = var21[2];
            } else if (arg14 == 8) {
                var22 = new int[3];
                int var31 = class121.method875(var20, arg1, var17, true, arg9, 0, 0, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -96);
                var22[2] = var21[4];
                var22[1] = var31;
                var22[0] = var21[3];
            } else if (arg14 == 9) {
                var22 = new int[15];
                int var35 = class121.method875(var20, arg1, var17, true, arg9, 128, 64, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -104);
                int var36 = class121.method875(var20, arg1, var17, true, arg9, 96, 32, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -70);
                int var37 = class121.method875(var20, arg1, var17, true, arg9, 64, 0, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -95);
                var22[14] = var37;
                var22[1] = var35;
                var22[13] = var21[1];
                var22[11] = var21[1];
                var22[6] = var36;
                var22[9] = var36;
                var22[3] = var36;
                var22[7] = var21[3];
                var22[5] = var21[3];
                var22[12] = var36;
                var22[2] = var21[4];
                var22[4] = var21[4];
                var22[0] = var36;
                var22[8] = var21[2];
                var22[10] = var21[2];
            } else if (arg14 == 10) {
                int var34 = class121.method875(var20, arg1, var17, true, arg9, 0, 128, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -91);
                var22 = new int[] { var21[2], var34, var21[3], var21[3], var34, var21[4], var21[4], var34, var21[0] };
            } else if (arg14 == 11) {
                int var32 = class121.method875(var20, arg1, var17, true, arg9, 0, 64, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -73);
                int var33 = class121.method875(var20, arg1, var17, true, arg9, 128, 64, arg10, 0.0F, arg8, var16, arg0, arg3, arg12, (int[][]) null, arg13, var18, (byte) -95);
                var22 = new int[] { var21[3], var32, var21[0], var21[3], var21[2], var32, var21[2], var33, var32, var21[2], var21[1], var33 };
            }
        }
        arg12.method1779(arg2, arg8, arg13, var21, var22, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 285)
    public static void method2026(byte arg0) {
        if (arg0 < 85) {
            field4436 = (class182[]) null;
        }
        field4436 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z", line = 303)
    public final boolean method2027(int arg0) {
        field4435++;
        if (this.field4432 == null) {
            return false;
        } else {
            if (arg0 != 3) {
                this.field4427 = (class287) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 321)
    public final void method2028(int arg0) {
        if (arg0 != 13329) {
            return;
        }
        field4431++;
        if (this.field4432 != null) {
            this.field4432.field4427 = this.field4427;
            this.field4427.field4432 = this.field4432;
            this.field4427 = null;
            this.field4432 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lug;III)Z", line = 339)
    public static final boolean method2029(class253 arg0, int arg1, int arg2, int arg3) {
        field4428++;
        byte[] var4 = arg0.method1813(arg1, arg3, true);
        if (var4 == null) {
            return false;
        } else if (arg2 == 2) {
            class139.method1036(-116, var4);
            return true;
        } else {
            return true;
        }
    }
}
