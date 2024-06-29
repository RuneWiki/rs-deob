import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class188 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lwg;")
    private class277 field2862 = new class277();

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field2870;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ljf;")
    private class227 field2860;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Z")
    public static boolean field2856 = true;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2855 = 0;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    public static int[] field2857;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V", line = 5)
    public final void method1287(int arg0, int arg1) {
        field2866++;
        int var3 = 7 / ((64 - arg1) / 49);
        if (class26.field339 == null) {
            return;
        }
        for (class261 var4 = (class261) this.field2862.method1826(-127); var4 != null; var4 = (class261) this.field2862.method1823((byte) -128)) {
            if (var4.method1142(10054)) {
                if (var4.method1144(-12903) == null) {
                    var4.method1284(0);
                    var4.method2143((byte) 125);
                    this.field2870++;
                }
            } else if (((long) arg0) < (++var4.field4938)) {
                class261 var5 = class26.field339.method264((byte) -62, var4);
                this.field2860.method1550(var5, var4.field2852, (byte) 124);
                class289.method1883(-3932, var5, var4);
                var4.method1284(0);
                var4.method2143((byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Lth;", line = 53)
    public static final class146 method1288(int arg0, byte arg1) {
        field2868++;
        if (arg1 <= 31) {
            return (class146) null;
        }
        class146 var2 = (class146) class106.field1629.method355((long) arg0, 6487);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class45.field641.method2103(0, 1, arg0 & 0x7FFF);
        } else {
            var3 = class58.field823.method2103(0, 1, arg0);
        }
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1017(new class303(var3), 31153);
        }
        if (arg0 >= 32768) {
            var4.method1015(-128);
        }
        class106.field1629.method350((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JI)V", line = 85)
    public final void method1289(long arg0, int arg1) {
        class261 var4 = (class261) this.field2860.method1558(arg0, false);
        if (var4 != null) {
            var4.method1284(0);
            var4.method2143((byte) 125);
            this.field2870++;
        }
        field2861++;
        if (arg1 != 255) {
            field2871 = -74;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I", line = 104)
    public final int method1290(int arg0) {
        field2869++;
        int var2 = 0;
        if (arg0 != -5739) {
            method1295(-67, 5, -127, -117);
        }
        for (class261 var3 = (class261) this.field2862.method1826(74); var3 != null; var3 = (class261) this.field2862.method1823((byte) -128)) {
            if (!var3.method1142(10054)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILgn;)Lri;", line = 130)
    public static final class44 method1291(int arg0, class303 arg1) {
        field2858++;
        if (arg0 != 7527) {
            method1297((int[][]) ((int[][]) null), false, (float[][]) ((float[][]) null), -48, true, (boolean[]) null, (int[][]) ((int[][]) null), -3, 127, (class217) null, (float[][]) ((float[][]) null), (int[]) null, -52, -24, -59, (byte) 121, 32, 120, false, (byte) 37, true, (float[][]) ((float[][]) null));
        }
        return new class44(arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2059(255), arg1.method2059(arg0 - 7272), arg1.method2043((byte) -111));
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 147)
    public final void method1292(long arg0, int arg1, Object arg2) {
        field2872++;
        this.method1289(arg0, 255);
        if (this.field2870 == 0) {
            class261 var5 = (class261) this.field2862.method1825((byte) 125);
            var5.method1284(0);
            var5.method2143((byte) 125);
        } else {
            this.field2870--;
        }
        class168 var6 = new class168(arg2);
        this.field2860.method1550(var6, arg0, (byte) 31);
        this.field2862.method1824(var6, (byte) -125);
        int var7 = 88 % ((-arg1 - 17) / 55);
        var6.field4938 = 0L;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 174)
    public static void method1293(int arg0) {
        if (arg0 != 1) {
            field2871 = -78;
        }
        field2857 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(JI)Ljava/lang/Object;", line = 185)
    public final Object method1294(long arg0, int arg1) {
        if (arg1 < 114) {
            return (Object) null;
        }
        field2863++;
        class261 var4 = (class261) this.field2860.method1558(arg0, false);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1144(-12903);
        if (var5 == null) {
            var4.method1284(0);
            var4.method2143((byte) 125);
            this.field2870++;
            return null;
        }
        if (var4.method1142(10054)) {
            class168 var6 = new class168(var5);
            this.field2860.method1550(var6, var4.field2852, (byte) 31);
            this.field2862.method1824(var6, (byte) 63);
            var6.field4938 = 0L;
            var4.method1284(0);
            var4.method2143((byte) 125);
        } else {
            this.field2862.method1824(var4, (byte) 73);
            var4.field4938 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V", line = 230)
    public static final void method1295(int arg0, int arg1, int arg2, int arg3) {
        field2873++;
        class43.method309(-8977, false);
        if (arg1 >= -78) {
            method1295(97, -47, -62, 34);
        }
        class148.field2348 = arg3;
        class116.field1796 = arg2;
        class95.method652(arg0, (byte) -97);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 259)
    public final void method1296(int arg0) {
        field2864++;
        if (arg0 != 255) {
            return;
        }
        for (class261 var2 = (class261) this.field2862.method1826(59); var2 != null; var2 = (class261) this.field2862.method1823((byte) -128)) {
            if (var2.method1142(10054)) {
                var2.method1284(0);
                var2.method2143((byte) 125);
                this.field2870++;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V", line = 328)
    public class188(int arg0) {
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2870 = arg0;
        this.field2867 = arg0;
        this.field2860 = new class227(var2);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([[IZ[[FIZ[Z[[IIILqa;[[F[IIIIBIIZBZ[[F)V", line = 293)
    public static final void method1297(int[][] arg0, boolean arg1, float[][] arg2, int arg3, boolean arg4, boolean[] arg5, int[][] arg6, int arg7, int arg8, class217 arg9, float[][] arg10, int[] arg11, int arg12, int arg13, int arg14, byte arg15, int arg16, int arg17, boolean arg18, byte arg19, boolean arg20, float[][] arg21) {
        field2865++;
        if (arg15 != -87) {
            method1293(109);
        }
        int var22 = (arg18 ? 255 : 0) + (arg14 << 8);
        int var23 = (arg17 << 8) + (arg1 ? 255 : 0);
        int var24 = (arg8 << 8) + (arg20 ? 255 : 0);
        int[] var25 = new int[arg11.length / 2];
        int var26 = (arg13 << 8) + (arg4 ? 255 : 0);
        for (int var27 = 0; var27 < var25.length; var27++) {
            int var28 = arg11[var27 + var27];
            int var29 = arg11[var27 + var27 + 1];
            int[][] var30 = arg0 == null || arg5 == null || !arg5[var27] ? arg6 : arg0;
            var25[var27] = method1299(var24, arg12, arg16, false, arg21, (float) arg3, var26, arg2, var29, var23, var30, 102, var22, arg9, arg19, arg10, arg0, var28);
        }
        arg9.method1448(arg7, arg16, arg12, var25, (int[]) null, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 346)
    public final void method1298(byte arg0) {
        if (arg0 != 110) {
            method1291(46, (class303) null);
        }
        field2854++;
        this.field2862.method1828(arg0 ^ 0xFFFFFF95);
        this.field2860.method1553(-27930);
        this.field2870 = this.field2867;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIZ[[FFI[[FII[[IIILqa;I[[F[[II)I", line = 359)
    public static final int method1299(int arg0, int arg1, int arg2, boolean arg3, float[][] arg4, float arg5, int arg6, float[][] arg7, int arg8, int arg9, int[][] arg10, int arg11, int arg12, class217 arg13, int arg14, float[][] arg15, int[][] arg16, int arg17) {
        field2859++;
        if (arg14 == 1) {
            int var19 = arg17;
            arg17 = arg8;
            arg8 = 128 - var19;
        } else if (arg14 == 2) {
            arg8 = 128 - arg8;
            arg17 = 128 - arg17;
        } else if (arg14 == 3) {
            int var18 = arg17;
            arg17 = 128 - arg8;
            arg8 = var18;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg17 == 0 && arg8 == 0) {
            var20 = arg12;
            var21 = arg4[arg2][arg1];
            var22 = arg15[arg2][arg1];
            var23 = arg7[arg2][arg1];
        } else if (arg17 == 128 && arg8 == 0) {
            var22 = arg15[arg2 + 1][arg1];
            var20 = arg9;
            var21 = arg4[arg2 + 1][arg1];
            var23 = arg7[arg2 + 1][arg1];
        } else if (arg17 == 128 && arg8 == 128) {
            var23 = arg7[arg2 + 1][arg1 + 1];
            var21 = arg4[arg2 + 1][arg1 + 1];
            var22 = arg15[arg2 + 1][arg1 + 1];
            var20 = arg0;
        } else if (arg17 == 0 && arg8 == 128) {
            var23 = arg7[arg2][arg1 + 1];
            var21 = arg4[arg2][arg1 + 1];
            var22 = arg15[arg2][arg1 + 1];
            var20 = arg6;
        } else {
            float var24 = arg15[arg2][arg1];
            float var25 = arg4[arg2][arg1];
            float var26 = arg7[arg2][arg1];
            float var27 = (float) arg17 / 128.0F;
            float var28 = (arg4[arg2 + 1][arg1] - var25) * var27 + var25;
            float var29 = (arg7[arg2 + 1][arg1] - var26) * var27 + var26;
            float var30 = (arg15[arg2 + 1][arg1] - var24) * var27 + var24;
            float var31 = arg15[arg2][arg1 + 1];
            float var32 = arg4[arg2][arg1 + 1];
            float var33 = (arg4[arg2 + 1][arg1 + 1] - var32) * var27 + var32;
            float var34 = (float) arg8 / 128.0F;
            var21 = (var33 - var28) * var34 + var28;
            float var35 = arg7[arg2][arg1 + 1];
            float var36 = (arg15[arg2 + 1][arg1 + 1] - var31) * var27 + var31;
            float var37 = (arg7[arg2 + 1][arg1 + 1] - var35) * var27 + var35;
            var23 = (var37 - var29) * var34 + var29;
            var22 = (var36 - var30) * var34 + var30;
            int var38 = class289.method1889(arg9, arg17, (byte) 99, arg12);
            int var39 = class289.method1889(arg0, arg17, (byte) -54, arg6);
            var20 = class289.method1889(var39, arg8, (byte) -60, var38);
        }
        int var40 = (arg2 << 7) + arg17;
        if (arg11 < 16) {
            method1291(-20, (class303) null);
        }
        int var41 = (arg1 << 7) + arg8;
        int var42 = class225.method1532(arg17, arg8, arg1, arg10, arg2, 10);
        return arg13.method1451(var40, var42, var41, var22, var23, var21, arg3 ? var20 & 0xFFFFFF00 : var20, arg16 == null ? 0.0F : (float) (var42 - class225.method1532(arg17, arg8, arg1, arg16, arg2, 10)) / arg5);
    }
}
