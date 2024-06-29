import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class90 extends class286 {

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    private int field1521 = 585;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "Lbe;")
    public static class283 field1519 = class153.method941(127, "welle:");

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field1522 = -1;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "Lbe;")
    public static class283 field1520 = class153.method941(125, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Lbe;")
    public static class283 field1526 = class153.method941(127, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "[Lbe;")
    public static class283[] field1528 = new class283[100];

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lfe;ZI)V", line = 6)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method14(-37, 18);
        }
        if (arg2 == 0) {
            this.field1521 = arg0.method1496(true);
        }
        field1524++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([[FLsf;I[[F[[FBZBIIZ[[IIIII)V", line = 34)
    public static final void method580(float[][] arg0, class100 arg1, int arg2, float[][] arg3, float[][] arg4, byte arg5, boolean arg6, byte arg7, int arg8, int arg9, boolean arg10, int[][] arg11, int arg12, int arg13, int arg14, int arg15) {
        int var16 = (arg15 << 8) + 255;
        int var17 = (arg2 << 8) + 255;
        int var18 = (arg14 << 8) + 255;
        int var19 = (arg13 << 8) + 255;
        int[] var20 = class255.field4304[arg7];
        field1523++;
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class164.method997((int[][]) null, arg11, var20[var23 + var23 + 1], var16, arg3, arg1, 0.0F, arg9, false, arg5, arg0, arg4, var20[var23 + var23], 210, var17, var18, arg12, var19);
        }
        if (arg6) {
            if (arg7 == 1) {
                var21 = new int[6];
                int var42 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 64, 210, var17, var18, arg12, var19);
                int var43 = class164.method997((int[][]) null, arg11, 64, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                var21[1] = var42;
                var21[3] = var42;
                var21[0] = var43;
                var21[4] = var22[0];
                var21[2] = var22[2];
                var21[5] = var22[2];
            } else if (arg7 == 2) {
                int var25 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                int var26 = class164.method997((int[][]) null, arg11, 0, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 64, 210, var17, var18, arg12, var19);
                var21 = new int[] { var22[0], var26, var25, var25, var22[1], var22[0] };
            } else if (arg7 == 3) {
                var21 = new int[6];
                int var27 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 0, 210, var17, var18, arg12, var19);
                int var28 = class164.method997((int[][]) null, arg11, 0, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 64, 210, var17, var18, arg12, var19);
                var21[3] = var27;
                var21[4] = var28;
                var21[1] = var22[1];
                var21[0] = var22[2];
                var21[2] = var27;
                var21[5] = var22[2];
            } else if (arg7 == 4) {
                int var29 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 0, 210, var17, var18, arg12, var19);
                var21 = new int[] { var22[3], var29, var22[0] };
            } else if (arg7 == 5) {
                var21 = new int[3];
                int var41 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                var21[0] = var22[2];
                var21[1] = var41;
                var21[2] = var22[3];
            } else if (arg7 == 6) {
                int var30 = class164.method997((int[][]) null, arg11, 0, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                var21 = new int[6];
                int var31 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                var21[0] = var22[3];
                var21[3] = var31;
                var21[4] = var22[0];
                var21[5] = var22[3];
                var21[1] = var30;
                var21[2] = var31;
            } else if (arg7 == 7) {
                int var39 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 0, 210, var17, var18, arg12, var19);
                int var40 = class164.method997((int[][]) null, arg11, 0, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                var21 = new int[] { var22[1], var40, var39, var39, var22[2], var22[1] };
            } else if (arg7 == 8) {
                var21 = new int[3];
                int var32 = class164.method997((int[][]) null, arg11, 0, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 0, 210, var17, var18, arg12, var19);
                var21[0] = var22[3];
                var21[2] = var22[4];
                var21[1] = var32;
            } else if (arg7 == 9) {
                var21 = new int[15];
                int var33 = class164.method997((int[][]) null, arg11, 64, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                int var34 = class164.method997((int[][]) null, arg11, 32, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 96, 210, var17, var18, arg12, var19);
                int var35 = class164.method997((int[][]) null, arg11, 0, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 64, 210, var17, var18, arg12, var19);
                var21[3] = var34;
                var21[6] = var34;
                var21[0] = var34;
                var21[9] = var34;
                var21[5] = var22[3];
                var21[2] = var22[4];
                var21[8] = var22[2];
                var21[10] = var22[2];
                var21[12] = var34;
                var21[1] = var33;
                var21[14] = var35;
                var21[13] = var22[1];
                var21[7] = var22[3];
                var21[4] = var22[4];
                var21[11] = var22[1];
            } else if (arg7 == 10) {
                var21 = new int[9];
                int var36 = class164.method997((int[][]) null, arg11, 128, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 0, 210, var17, var18, arg12, var19);
                var21[7] = var36;
                var21[0] = var22[2];
                var21[1] = var36;
                var21[4] = var36;
                var21[8] = var22[0];
                var21[6] = var22[4];
                var21[5] = var22[4];
                var21[2] = var22[3];
                var21[3] = var22[3];
            } else if (arg7 == 11) {
                var21 = new int[12];
                int var37 = class164.method997((int[][]) null, arg11, 64, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 0, 210, var17, var18, arg12, var19);
                int var38 = class164.method997((int[][]) null, arg11, 64, var16, arg3, arg1, 0.0F, arg9, true, arg5, arg0, arg4, 128, 210, var17, var18, arg12, var19);
                var21[1] = var37;
                var21[11] = var38;
                var21[8] = var37;
                var21[10] = var22[1];
                var21[7] = var38;
                var21[5] = var37;
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[2] = var22[0];
                var21[4] = var22[2];
                var21[9] = var22[2];
                var21[6] = var22[2];
            }
        }
        arg1.method666(arg8, arg12, arg9, var22, var21, arg10);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 308)
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I", line = 329)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        field1517++;
        if (this.field4863.field3984) {
            int var4 = class153.field2509[arg1];
            for (int var5 = 0; var5 < class27.field410; var5++) {
                int var6 = class174.field2978[var5];
                if (var6 > this.field1521 && var6 < (4096 - this.field1521) && 2048 - this.field1521 < var4 && var4 < (this.field1521 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1521);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field1521) < var6 && var6 < this.field1521 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1521;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1521);
                } else if (var4 < this.field1521 || (4096 - this.field1521) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1521;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1521);
                } else if (var6 >= this.field1521 && var6 <= (4096 - this.field1521)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1521);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        if (arg0 >= -52) {
            method580((float[][]) ((float[][]) null), (class100) null, 122, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte) -47, true, (byte) 16, 123, 67, false, (int[][]) ((int[][]) null), -7, -72, 94, 123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V", line = 408)
    public static void method581(boolean arg0) {
        field1519 = null;
        field1520 = null;
        field1526 = null;
        field1528 = null;
        if (arg0) {
            field1527 = -9;
        }
    }
}
