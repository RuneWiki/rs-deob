import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class763 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public int field10627;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Ljava/lang/String;")
    public String field10630;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field10628 = 0;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field10631;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field10632;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field10634;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Lwu;")
    public static class376 field10633;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "[Z")
    public static boolean[] field10629;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)Ljava/lang/String;", line = 7)
    public static final String method4241(int arg0, int arg1) {
        field10634++;
        if (arg1 != -1) {
            method4242(null, 50, -69, -20, -71, -37);
        }
        class107 var2 = (class107) class1.field12.method2135((long) arg0, (byte) 31);
        if (var2 != null) {
            class543 var3 = var2.field1452.method1584((byte) 6);
            if (var3 != null) {
                double var4 = var2.field1452.method1595(false);
                if ((double) var3.method3042((byte) 111) <= var4 && (double) var3.method3040(0) >= var4) {
                    return var3.method3039((byte) -51);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ms", name = "toString", descriptor = "()Ljava/lang/String;", line = 44)
    public final String toString() {
        field10631++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lwr;IIIII)V", line = 54)
    public static final void method4242(class461 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10632++;
        if (arg0.field6307 == -1 && arg0.field6317 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg0.field6325 * class411.field5711.field3880.method2432(true) >> 8;
        if (arg1 > arg0.field6320) {
            var6 += arg1 - arg0.field6320;
        } else if (arg0.field6311 > arg1) {
            var6 += arg0.field6311 - arg1;
        }
        if (arg0.field6319 < arg5) {
            var6 += arg5 - arg0.field6319;
        } else if (arg0.field6306 > arg5) {
            var6 += arg0.field6306 - arg5;
        }
        if (arg0.field6309 == 0 || (var6 - 256) > arg0.field6309 || class411.field5711.field3880.method2432(true) == 0 || arg0.field6324 != arg4) {
            if (arg0.field6305 != null) {
                class603.field7927.method1612(arg0.field6305);
                arg0.field6328 = null;
                arg0.field6327 = null;
                arg0.field6305 = null;
            }
            if (arg0.field6299 != null) {
                class603.field7927.method1612(arg0.field6299);
                arg0.field6299 = null;
                arg0.field6300 = null;
                arg0.field6322 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg0.field6309 - arg0.field6310;
        if (var8 < 0) {
            var8 = arg0.field6309;
        }
        int var9 = var7;
        int var10 = var6 - arg0.field6310;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class472.field6475.method2256(arg3);
        int var11 = 8192;
        int var12 = (arg0.field6320 + arg0.field6311) / 2 - arg1;
        int var13 = (arg0.field6319 + arg0.field6306) / 2 - arg5;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class372.field5175 - ((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 >= 4096) {
                var15 = 16384;
            } else {
                var15 = (var6 * 8192 / 4096) + 8192;
            }
            var11 = var14 * var15 / 8192 + (16384 - var15 >> 1);
        }
        if (arg0.field6305 != null) {
            arg0.field6305.method2909(var9);
            arg0.field6305.method2908(var11);
        } else if (arg0.field6307 >= 0) {
            int var16 = arg0.field6318 == 256 && arg0.field6323 == 256 ? 256 : class502.method2826(arg0.field6318, arg0.field6323, true);
            if (arg0.field6326) {
                if (arg0.field6327 == null) {
                    arg0.field6327 = class627.method3445(class11.field175, arg0.field6307);
                }
                if (arg0.field6327 != null) {
                    if (arg0.field6328 == null) {
                        arg0.field6328 = arg0.field6327.method3450(new int[] { 22050 });
                    }
                    if (arg0.field6328 != null) {
                        class527 var20 = class527.method2915(arg0.field6328, var16, var9 << 6, var11);
                        var20.method2927(-1);
                        class603.field7927.method1608(var20);
                        arg0.field6305 = var20;
                    }
                }
            } else {
                class174 var17 = class174.method1219(class250.field3445, arg0.field6307, 0);
                if (var17 != null) {
                    class147 var18 = var17.method1220().method1108(class383.field5318);
                    class527 var19 = class527.method2915(var18, var16, var9 << 6, var11);
                    var19.method2927(-1);
                    class603.field7927.method1608(var19);
                    arg0.field6305 = var19;
                }
            }
        }
        if (arg0.field6299 != null) {
            arg0.field6299.method2909(var9);
            arg0.field6299.method2908(var11);
            if (!arg0.field6299.method3566((byte) 78)) {
                arg0.field6299 = null;
                arg0.field6322 = null;
                arg0.field6300 = null;
            }
        } else if (arg0.field6317 != null && (arg0.field6314 -= arg2) <= 0) {
            int var21 = arg0.field6318 == 256 && arg0.field6323 == 256 ? 256 : arg0.field6323 + (int) (Math.random() * (double) (arg0.field6318 - arg0.field6323));
            if (arg0.field6298) {
                if (arg0.field6322 == null) {
                    int var22 = (int) ((double) arg0.field6317.length * Math.random());
                    arg0.field6322 = class627.method3445(class11.field175, arg0.field6317[var22]);
                }
                if (arg0.field6322 != null) {
                    if (arg0.field6300 == null) {
                        arg0.field6300 = arg0.field6322.method3450(new int[] { 22050 });
                    }
                    if (arg0.field6300 != null) {
                        class527 var23 = class527.method2915(arg0.field6300, var21, var9 << 6, var11);
                        var23.method2927(0);
                        class603.field7927.method1608(var23);
                        arg0.field6314 = (int) ((double) (arg0.field6315 - arg0.field6321) * Math.random()) + arg0.field6321;
                        arg0.field6299 = var23;
                        return;
                    }
                }
                return;
            }
            int var24 = (int) (Math.random() * (double) arg0.field6317.length);
            class174 var25 = class174.method1219(class250.field3445, arg0.field6317[var24], 0);
            if (var25 != null) {
                class147 var26 = var25.method1220().method1108(class383.field5318);
                class527 var27 = class527.method2915(var26, var21, var9 << 6, var11);
                var27.method2927(0);
                class603.field7927.method1608(var27);
                arg0.field6299 = var27;
                arg0.field6314 = (int) ((double) (arg0.field6315 - arg0.field6321) * Math.random()) + arg0.field6321;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 325)
    public static void method4243(int arg0) {
        field10633 = null;
        if (arg0 != 0) {
            field10633 = null;
        }
        field10629 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 335)
    public class763(String arg0, int arg1) {
        this.field10627 = arg1;
        this.field10630 = arg0;
    }
}
