import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class310 extends class213 {

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public int field4546 = 12800;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public int field4551 = 12800;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
    public boolean field4556 = true;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public int field4566 = 0;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public int field4561 = 0;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public int field4550 = -1;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public int field4565 = -1;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "Ljava/lang/String;")
    public String field4569;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "Ljava/lang/String;")
    public String field4567;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Lll;")
    public class54 field4560;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field4552 = 2;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Lfh;")
    public static class140 field4559;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "[S")
    public static short[] field4557;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILjava/lang/String;)V", line = 14)
    public static final void method2153(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class333 var5 = class283.method1926(arg0, (byte) 82, arg1);
        field4558++;
        if (var5 == null) {
            return;
        }
        if (var5.field5118 != null) {
            class135 var6 = new class135();
            var6.field1841 = arg2;
            var6.field1831 = var5;
            var6.field1838 = arg4;
            var6.field1836 = var5.field5118;
            class276.method1869(true, var6);
        }
        boolean var7 = true;
        if (var5.field5084 > 0) {
            var7 = class7.method40((byte) -101, var5);
        }
        if (!var7 || !client.method891(var5).method1093(arg2 - 1, 26)) {
            return;
        }
        if (arg2 == 1) {
            class251.field3681.method1309(23, 94);
            class360.field5634++;
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-68, arg1);
        }
        if (arg2 == 2) {
            class287.field4135++;
            class251.field3681.method1309(23, 201);
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-117, arg1);
        }
        if (arg2 == 3) {
            class338.field5270++;
            class251.field3681.method1309(23, 30);
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-84, arg1);
        }
        if (arg2 == 4) {
            class232.field3314++;
            class251.field3681.method1309(23, 61);
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-60, arg1);
        }
        if (arg3 > -59) {
            field4568 = 108;
        }
        if (arg2 == 5) {
            class251.field3681.method1309(23, 66);
            class251.field3681.method2084(true, arg0);
            class345.field5357++;
            class251.field3681.method2098(-47, arg1);
        }
        if (arg2 == 6) {
            class251.field3681.method1309(23, 7);
            class206.field2863++;
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-125, arg1);
        }
        if (arg2 == 7) {
            class251.field3681.method1309(23, 108);
            class158.field2247++;
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-118, arg1);
        }
        if (arg2 == 8) {
            class158.field2245++;
            class251.field3681.method1309(23, 255);
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-64, arg1);
        }
        if (arg2 == 9) {
            class126.field1689++;
            class251.field3681.method1309(23, 97);
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-99, arg1);
        }
        if (arg2 == 10) {
            class251.field3681.method1309(23, 10);
            class251.field3681.method2084(true, arg0);
            class251.field3681.method2098(-16, arg1);
            class61.field765++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[II)Z", line = 145)
    public final boolean method2154(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field4564++;
        if (arg1 != -1) {
            return true;
        }
        for (class263 var6 = (class263) this.field4560.method413(1253231568); var6 != null; var6 = (class263) this.field4560.method419(arg1 + 61)) {
            if (var6.method1810((byte) -21, arg4, arg0, arg2)) {
                var6.method1813(arg0, arg4, (byte) 94, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z", line = 171)
    public final boolean method2155(int arg0, int arg1, int arg2) {
        field4553++;
        class263 var4 = (class263) this.field4560.method413(1253231568);
        if (arg0 != -129) {
            method2161(false);
        }
        while (var4 != null) {
            if (var4.method1812(arg2, (byte) 33, arg1)) {
                return true;
            }
            var4 = (class263) this.field4560.method419(arg0 ^ 0xFFFFFF3A);
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 496)
    public class310(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4569 = arg2;
        this.field4556 = arg5;
        this.field4567 = arg1;
        this.field4547 = arg3;
        this.field4548 = arg0;
        this.field4550 = arg4;
        this.field4565 = arg6;
        if (this.field4565 == 255) {
            this.field4565 = 0;
        }
        this.field4560 = new class54();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIBI)Z", line = 203)
    public final boolean method2156(int[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = 14 / ((arg2 + 19) / 51);
        field4549++;
        for (class263 var6 = (class263) this.field4560.method413(1253231568); var6 != null; var6 = (class263) this.field4560.method419(56)) {
            if (var6.method1812(arg1, (byte) 33, arg3)) {
                var6.method1813(arg1, arg3, (byte) -123, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILfh;Lfh;Z)Lte;", line = 228)
    public static final class261 method2157(byte arg0, int arg1, class140 arg2, class140 arg3, boolean arg4) {
        field4562++;
        boolean var5 = true;
        int[] var6 = arg2.method1080(true, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1067(false, var6[var7], arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method1067(false, var9, 0);
                } else {
                    var10 = arg3.method1067(false, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        int var11 = -59 / ((-arg0 - 66) / 52);
        if (!var5) {
            return null;
        }
        try {
            return new class261(arg2, arg3, arg1, arg4);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([[FII[[I[[F[[ILih;IIZF[[FIIIIII)I", line = 288)
    public static final int method2158(float[][] arg0, int arg1, int arg2, int[][] arg3, float[][] arg4, int[][] arg5, class70 arg6, int arg7, int arg8, boolean arg9, float arg10, float[][] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17) {
        if (arg12 == 1) {
            int var19 = arg13;
            arg13 = arg1;
            arg1 = 128 - var19;
        } else if (arg12 == 2) {
            arg1 = 128 - arg1;
            arg13 = 128 - arg13;
        } else if (arg12 == 3) {
            int var18 = arg13;
            arg13 = 128 - arg1;
            arg1 = var18;
        }
        field4554++;
        if (arg14 <= 20) {
            return 40;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg13 == 0 && arg1 == 0) {
            var20 = arg17;
            var21 = arg4[arg8][arg2];
            var22 = arg0[arg8][arg2];
            var23 = arg11[arg8][arg2];
        } else if (arg13 == 128 && arg1 == 0) {
            var22 = arg0[arg8 + 1][arg2];
            var21 = arg4[arg8 + 1][arg2];
            var20 = arg7;
            var23 = arg11[arg8 + 1][arg2];
        } else if (arg13 == 128 && arg1 == 128) {
            var23 = arg11[arg8 + 1][arg2 + 1];
            var21 = arg4[arg8 + 1][arg2 + 1];
            var22 = arg0[arg8 + 1][arg2 + 1];
            var20 = arg16;
        } else if (arg13 == 0 && arg1 == 128) {
            var23 = arg11[arg8][arg2 + 1];
            var20 = arg15;
            var22 = arg0[arg8][arg2 + 1];
            var21 = arg4[arg8][arg2 + 1];
        } else {
            float var24 = arg4[arg8][arg2];
            float var25 = arg11[arg8][arg2];
            float var26 = arg0[arg8][arg2];
            float var27 = (float) arg13 / 128.0F;
            float var28 = (float) arg1 / 128.0F;
            float var29 = (arg4[arg8 + 1][arg2] - var24) * var27 + var24;
            float var30 = (arg11[arg8 + 1][arg2] - var25) * var27 + var25;
            float var31 = (arg0[arg8 + 1][arg2] - var26) * var27 + var26;
            float var32 = arg0[arg8][arg2 + 1];
            float var33 = arg4[arg8][arg2 + 1];
            float var34 = arg11[arg8][arg2 + 1];
            float var35 = (arg0[arg8 + 1][arg2 + 1] - var32) * var27 + var32;
            var22 = (var35 - var31) * var28 + var31;
            float var36 = (arg11[arg8 + 1][arg2 + 1] - var34) * var27 + var34;
            float var37 = (arg4[arg8 + 1][arg2 + 1] - var33) * var27 + var33;
            var23 = (var36 - var30) * var28 + var30;
            var21 = (var37 - var29) * var28 + var29;
            int var38 = class135.method1026(arg17, arg7, false, arg13);
            int var39 = class135.method1026(arg15, arg16, false, arg13);
            var20 = class135.method1026(var38, var39, false, arg1);
        }
        int var40 = (arg2 << 7) + arg1;
        int var41 = (arg8 << 7) + arg13;
        int var42 = class62.method459(arg13, arg8, arg1, arg3, arg2, 13);
        return arg6.method519(var41, var42, var40, var22, var21, var23, arg9 ? var20 & 0xFFFFFF00 : var20, arg5 == null ? 0.0F : (float) (var42 - class62.method459(arg13, arg8, arg1, arg5, arg2, 13)) / arg10);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB[I)Z", line = 399)
    public final boolean method2159(int arg0, int arg1, byte arg2, int[] arg3) {
        field4555++;
        for (class263 var5 = (class263) this.field4560.method413(1253231568); var5 != null; var5 = (class263) this.field4560.method419(122)) {
            if (var5.method1811(arg0, arg1, 0)) {
                var5.method1815(arg1, arg0, arg3, -128);
                return true;
            }
        }
        if (arg2 > -119) {
            field4559 = (class140) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 428)
    public final void method2160(int arg0) {
        this.field4551 = 12800;
        this.field4566 = 0;
        field4563++;
        this.field4561 = 0;
        this.field4546 = arg0;
        for (class263 var2 = (class263) this.field4560.method413(1253231568); var2 != null; var2 = (class263) this.field4560.method419(arg0 - 12697)) {
            if (this.field4561 < var2.field3812) {
                this.field4561 = var2.field3812;
            }
            if (this.field4546 > var2.field3821) {
                this.field4546 = var2.field3821;
            }
            if (var2.field3810 < this.field4551) {
                this.field4551 = var2.field3810;
            }
            if (this.field4566 < var2.field3813) {
                this.field4566 = var2.field3813;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 467)
    public static void method2161(boolean arg0) {
        field4559 = null;
        field4557 = null;
        if (arg0) {
            method2158((float[][]) ((float[][]) null), 80, -114, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (class70) null, -61, -72, false, -0.6714795F, (float[][]) ((float[][]) null), 104, 23, -81, -122, 81, 12);
        }
    }
}
