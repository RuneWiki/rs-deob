import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class435 extends class514 {

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
    public int field6241;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "Log;")
    public static class599 field6237 = new class599(0);

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method2603(int arg0, boolean arg1, int arg2) {
        field6239++;
        if (!arg1) {
            field6236 = -82;
        }
        return class177.method1108(arg2, true, arg0) | (arg0 & 0x60000) != 0 || class541.method3173(arg0, arg2, 55) || class89.method702(arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lpe;Lop;IIIIIIIII)V", line = 14)
    public class435(class564 arg0, class172 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field6238 = arg10;
        this.field6241 = arg9;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Lsq;", line = 34)
    public final class161 method448(byte arg0) {
        field6242++;
        if (arg0 != 25) {
            field6236 = -109;
        }
        return class331.field4404;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIZI)V", line = 47)
    public static final void method2604(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field6235++;
        int var6 = arg2 - arg3;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class9.method53(arg1, (byte) 107, arg3, arg2, arg5);
            }
        } else if (var6 == 0) {
            class520.method3086(arg3, 94, arg0, arg1, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                int var10 = arg0;
                arg1 = arg3;
                arg3 = var9;
                arg0 = arg2;
                arg2 = var10;
            }
            if (arg1 > arg0) {
                int var11 = arg1;
                int var12 = arg3;
                arg1 = arg0;
                arg0 = var11;
                arg3 = arg2;
                arg2 = var12;
            }
            int var13 = arg3;
            int var14 = arg0 - arg1;
            int var15 = arg2 - arg3;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg3 < arg2 ? 1 : -1;
            if (var8) {
                for (int var19 = arg1; var19 <= arg0; var19++) {
                    var16 += var15;
                    class678.field9722[var19][var13] = arg5;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg0; var18++) {
                    var16 += var15;
                    class678.field9722[var13][var18] = arg5;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
            if (arg4) {
                method2603(88, false, -128);
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)I", line = 164)
    public static int method2605(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)I", line = 173)
    public static final int method2606(int arg0, int arg1, int arg2, int arg3) {
        field6240++;
        if (arg3 < 40) {
            return 105;
        } else {
            int var4 = ((arg1 & 0xFF00) * arg2 & 0xFF0000 | (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg2;
            return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 188)
    public static void method2607(int arg0) {
        if (arg0 != 255) {
            method2603(21, true, -67);
        }
        field6237 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V", line = 198)
    public static final void method2608(int arg0, int arg1) {
        field6243++;
        class334.method1932(class424.field6050.method2561(class370.field4980, 0), 8, arg1);
        int var2 = 93 % ((arg0 + 27) / 33);
    }
}
