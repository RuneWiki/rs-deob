import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class163 {

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "Z")
    public static boolean field1997 = false;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "J")
    public static long field1995 = 0L;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "Ljn;")
    public static class668 field1998;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BIII)I", line = 3)
    public static final int method1026(byte arg0, int arg1, int arg2, int arg3) {
        field1994++;
        int var4 = arg2 & 0x3;
        if (arg0 != 109) {
            field1998 = null;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILff;Lr;Lvc;)V", line = 28)
    public static final void method1027(int arg0, class9 arg1, class165 arg2, class289 arg3) {
        field1993++;
        class701 var4 = arg3.method1719(124, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method902();
        if (var5 < var4.method900()) {
            var5 = var4.method900();
        }
        byte var6 = 10;
        int var7 = arg1.field96;
        int var8 = arg1.field93;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field3910 != null) {
            var9 = class214.field2729.method550(arg3.field3910, class141.field1768, null, null, (byte) 107);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class141.field1768[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class318.field4207.method3647(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class318.field4207.method3641() * var9 + (class318.field4207.method3645() / 2);
        }
        int var15 = var5 / arg0 + arg1.field96;
        int var16 = arg1.field93;
        if (var7 < class550.field7992 + var5) {
            var15 = var10 / 2 + var5 / 2 + class550.field7992 + var6 + 5;
            var7 = class550.field7992;
        } else if (var7 > class550.field8001 - var5) {
            var15 = class550.field8001 - (var10 / 2) - var6 - (var5 / 2) - 5;
            var7 = class550.field8001 - var5;
        }
        if (class550.field8006 + var5 > var8) {
            var16 = var5 / 2 + var6 + class550.field8006;
            var8 = class550.field8006;
        } else if (var8 > (class550.field8008 - var5)) {
            var8 = class550.field8008 - var5;
            var16 = class550.field8008 - var6 - (var5 / 2) - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field96), (double) (var8 - arg1.field93)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3927((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field3910 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = var9 * class318.field4207.method3641() + (var16 + 3);
            var20 = var18 - (-var10 - 10);
            if (arg3.field3907 != 0) {
                arg2.method1042(var18, var20 - var18, 1, var16, arg3.field3907, var21 - var16);
            }
            if (arg3.field3909 != 0) {
                arg2.method1046(127, var21 - var16, arg3.field3909, var16, var20 - var18, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class141.field1768[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class318.field4207.method3642(arg2, var23, var15, var16, arg3.field3887, true);
                var16 += class318.field4207.method3641();
            }
        }
        if (arg3.field3904 == -1 && arg3.field3910 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class307 var25 = new class307(arg1);
        var25.field4075 = var21;
        var25.field4078 = var7 + var24;
        var25.field4076 = var19;
        var25.field4077 = var20;
        var25.field4072 = var8 - var24;
        var25.field4079 = var8 + var24;
        var25.field4074 = var7 - var24;
        var25.field4071 = var18;
        class356.field4756.method1129(var25, 262144);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 178)
    public static void method1028(int arg0) {
        if (arg0 != 17503) {
            method1031(null, 84, null, -80, 89);
        }
        field1998 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLun;)Low;", line = 191)
    public static final class317 method1029(byte arg0, class389 arg1) {
        field1999++;
        if (arg0 > -114) {
            field1997 = true;
        }
        return new class317(arg1.method2270((byte) 71), arg1.method2270((byte) 71), arg1.method2270((byte) 71), arg1.method2270((byte) 71), arg1.method2258(-3), arg1.method2229(255));
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Z", line = 203)
    public static final boolean method1030(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1028(20);
        }
        field2000++;
        return (arg0 & 0x800) != 0 | class668.method3798(100, arg1, arg0) || class681.method3861(arg0, arg1, (byte) 127);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "([JI[III)V", line = 225)
    public static final void method1031(long[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field1996++;
        if (arg4 != 1) {
            field1997 = true;
        }
        if (arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (arg0[var11] < ((long) (var11 & var10) + var7)) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6++] = var14;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var9;
        method1031(arg0, arg1, arg2, var6 - 1, arg4);
        method1031(arg0, var6 + 1, arg2, arg3, 1);
    }
}
