import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class70 extends class319 {

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field990 = 0;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "[I")
    public static int[] field991 = new int[2500];

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field995 = 0;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
    public static int[] field988;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIII)V", line = 5)
    public static final void method462(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field992++;
        int var6 = arg2 - arg4;
        int var7 = arg3 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class155.method1110(arg1 ^ 0xFFFFFFAC, arg0, arg4, arg2, arg5);
            }
        } else if (var6 == 0) {
            class320.method2249((byte) 49, arg3, arg5, arg4, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                int var10 = arg3;
                arg3 = arg2;
                arg0 = arg4;
                arg4 = var9;
                arg2 = var10;
            }
            if (arg0 > arg3) {
                int var11 = arg0;
                arg0 = arg3;
                arg3 = var11;
                int var12 = arg4;
                arg4 = arg2;
                arg2 = var12;
            }
            int var13 = arg4;
            if (arg1 != -87) {
                field991 = (int[]) null;
            }
            int var14 = arg2 - arg4;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = arg3 - arg0;
            int var16 = -(var15 >> 1);
            int var17 = arg4 >= arg2 ? -1 : 1;
            if (var8) {
                for (int var18 = arg0; var18 <= arg3; var18++) {
                    var16 += var14;
                    class281.field4523[var18][var13] = arg5;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg3; var19++) {
                    var16 += var14;
                    class281.field4523[var13][var19] = arg5;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILqi;Z)V", line = 139)
    public static final void method463(int arg0, int arg1, class234 arg2, boolean arg3) {
        if (arg3) {
            method463(33, -104, (class234) null, true);
        }
        field997++;
        if (arg2.field4268 == arg1 && arg1 != -1) {
            class202 var4 = class325.method2274(arg1, -75);
            int var5 = var4.field3291;
            if (var5 == 1) {
                arg2.field4250 = 0;
                arg2.field4265 = 0;
                arg2.field4190 = arg0;
                arg2.field4237 = 1;
                arg2.field4201 = 0;
                class190.method1411(31, false, var4, arg2.field4264, arg2.field4265, arg2.field4255);
            }
            if (var5 == 2) {
                arg2.field4250 = 0;
            }
        } else if (arg1 == -1 || arg2.field4268 == -1 || class325.method2274(arg1, -87).field3279 >= class325.method2274(arg2.field4268, -58).field3279) {
            arg2.field4237 = 1;
            arg2.field4201 = 0;
            arg2.field4279 = arg2.field4251;
            arg2.field4250 = 0;
            arg2.field4190 = arg0;
            arg2.field4265 = 0;
            arg2.field4268 = arg1;
            if (arg2.field4268 != -1) {
                class190.method1411(31, false, class325.method2274(arg2.field4268, -116), arg2.field4264, arg2.field4265, arg2.field4255);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)I", line = 209)
    public static final int method464(int arg0, int arg1, int arg2) {
        field993++;
        if (arg2 != 1388) {
            field988 = (int[]) null;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 253)
    public static void method465(byte arg0) {
        field988 = null;
        if (arg0 < 121) {
            field989 = -52;
        }
        field991 = null;
    }
}
