import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class621 extends class555 {

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public int field8840;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Lqk;")
    public static class148 field8842 = new class148(119, 2);

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Lag;", line = 3)
    public final class214 method210(int arg0) {
        if (arg0 != 7288) {
            method3635(-28, null);
        }
        field8839++;
        return class140.field1917;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[B)Lnfa;", line = 15)
    public static final class228 method3635(int arg0, byte[] arg1) {
        field8843++;
        class228 var2 = new class228();
        class26 var3 = new class26(arg1);
        var3.field330 = var3.field279.length - 2;
        int var4 = var3.method193(2);
        int var5 = var3.field279.length - var4 - 2 - 12;
        var3.field330 = var5;
        int var6 = var3.method189(arg0 + 295);
        var2.field3177 = var3.method193(2);
        var2.field3174 = var3.method193(2);
        var2.field3169 = var3.method193(2);
        if (arg0 != -40) {
            field8842 = null;
        }
        var2.field3182 = var3.method193(2);
        int var7 = var3.method194((byte) 119);
        if (var7 > 0) {
            var2.field3178 = new class209[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method193(2);
                class209 var10 = new class209(class670.method3834(var9, arg0 ^ 0xFFFFA42A));
                var2.field3178[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method189(255);
                    int var12 = var3.method189(255);
                    var10.method1387(new class285(var12), (long) var11, (byte) -105);
                }
            }
        }
        var3.field330 = 0;
        var2.field3179 = var3.method182(-93);
        var2.field3173 = new String[var6];
        var2.field3180 = new int[var6];
        var2.field3176 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field330) {
            int var14 = var3.method193(2);
            if (var14 == 3) {
                var2.field3173[var13] = var3.method196((byte) -92).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3180[var13] = var3.method194((byte) 119);
            } else {
                var2.field3180[var13] = var3.method189(255);
            }
            var2.field3176[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B[[BLtp;)V", line = 94)
    public static final void method3636(byte arg0, byte[][] arg1, class295 arg2) {
        if (arg0 != -87) {
            method3636((byte) -103, null, null);
        }
        field8838++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class26 var11 = new class26(var10);
                int var12 = class592.field8537[var5] >> 8;
                int var13 = class592.field8537[var5] & 0xFF;
                int var14 = var12 * 64 - class179.field2535;
                int var15 = var13 * 64 - class510.field7109;
                class350.method1993(arg0 ^ 0xFFFF9732);
                arg2.method714(var15, var14, (byte) -24, class464.field6351, var11, class510.field7109, class179.field2535);
                arg2.method1732(false, var14, class96.field1401, var11, var15, var3);
                if (!arg2.field1519 && class585.field8427 / 8 == var12 && class13.field192 / 8 == var13 && var3[0] != -1) {
                    class67.field932 = class533.field7474.method1230(var3[2], class128.field1758, var3[1], false, var3[3], var3[0]);
                    class143.field1986 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class592.field8537[var6] >> 8) * 64 - class179.field2535;
            int var8 = (class592.field8537[var6] & 0xFF) * 64 - class510.field7109;
            byte[] var9 = arg1[var6];
            if (var9 == null && class13.field192 < 800) {
                class350.method1993(26779);
                arg2.method706(arg0 ^ 0xFFFFFFA9, var8, 64, 64, var7);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lvfa;Lrq;IIIIIIIIIIIIII)V", line = 172)
    public class621(class92 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field8840 = arg15;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([ILkc;BI)V", line = 180)
    public static final void method3637(int[] arg0, class655 arg1, byte arg2, int arg3) {
        if (arg2 != -2) {
            method3639(null, (byte) 51, -128, 38, 57, null, -2.0727687F, 35, -116, -104, -122);
        }
        field8841++;
        if (arg1.field8348 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field8348.length; var5++) {
                if (arg1.field8348[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field8317 != -1) {
                class103 var6 = class274.field3684.method1881((byte) -80, arg1.field8317);
                int var7 = var6.field1476;
                if (var7 == 1) {
                    arg1.field8328 = 0;
                    arg1.field8407 = 1;
                    arg1.field8323 = 0;
                    arg1.field8357 = 0;
                    arg1.field8391 = arg3;
                    if (!arg1.field8312) {
                        class694.method3941(arg1.field8357, var6, arg1, true);
                    }
                }
                if (var7 == 2) {
                    arg1.field8328 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg1.field8348 == null || arg1.field8348[var9] == -1 || class274.field3684.method1881((byte) -80, arg0[var9]).field1490 >= class274.field3684.method1881((byte) -80, arg1.field8348[var9]).field1490) {
                arg1.field8391 = arg3;
                arg1.field8348 = arg0;
                break;
            }
        }
        if (var8) {
            arg1.field8348 = arg0;
            arg1.field8391 = arg3;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 271)
    public static void method3638(int arg0) {
        field8842 = null;
        if (arg0 != 8) {
            field8842 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([FBIII[FFIIII)V", line = 282)
    public static final void method3639(float[] arg0, byte arg1, int arg2, int arg3, int arg4, float[] arg5, float arg6, int arg7, int arg8, int arg9, int arg10) {
        field8844++;
        int var11 = arg9 - arg4;
        int var12 = arg2 - arg3;
        int var13 = -86 % ((-arg1 - 83) / 42);
        int var14 = arg7 - arg8;
        float var15 = arg5[2] * (float) var14 + arg5[0] * (float) var12 + arg5[1] * (float) var11;
        float var16 = arg5[5] * (float) var14 + arg5[3] * (float) var12 + arg5[4] * (float) var11;
        float var17 = arg5[8] * (float) var14 + arg5[7] * (float) var11 + arg5[6] * (float) var12;
        float var18 = (float) Math.sqrt((double) (var17 * var17 + var15 * var15 + var16 * var16));
        float var19 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        float var20 = (float) Math.asin((double) (var16 / var18)) / 3.1415927F + arg6 + 0.5F;
        if (arg10 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg10 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        arg0[0] = var19;
        arg0[1] = var20;
    }
}
