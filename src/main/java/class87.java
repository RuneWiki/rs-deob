import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class87 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILlea;IIII)V", line = 6)
    public static final void method650(int arg0, class571 arg1, int arg2, int arg3, int arg4, int arg5) {
        field1041++;
        if (arg1.field8037 == -1 && arg1.field8042 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg1.field8030 * class688.field9602.field8496.method1981((byte) -98) >> 8;
        if (arg1.field8054 < arg3) {
            var6 += arg3 - arg1.field8054;
        } else if (arg3 < arg1.field8036) {
            var6 += arg1.field8036 - arg3;
        }
        if (arg1.field8053 < arg0) {
            var6 += arg0 - arg1.field8053;
        } else if (arg0 < arg1.field8033) {
            var6 += arg1.field8033 - arg0;
        }
        if (arg1.field8044 == 0 || arg1.field8044 < var6 - 256 || class688.field9602.field8496.method1981((byte) -98) == 0 || arg1.field8025 != arg4) {
            if (arg1.field8026 != null) {
                class44.field468.method2512(arg1.field8026);
                arg1.field8043 = null;
                arg1.field8047 = null;
                arg1.field8026 = null;
            }
            if (arg1.field8049 != null) {
                class44.field468.method2512(arg1.field8049);
                arg1.field8028 = null;
                arg1.field8049 = null;
                arg1.field8050 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg1.field8044 - arg1.field8051;
        if (var8 < 0) {
            var8 = arg1.field8044;
        }
        int var9 = var7;
        int var10 = var6 - arg1.field8051;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class724.field10031.method3744(1);
        int var11 = 8192;
        int var12 = (arg1.field8054 + arg1.field8036) / 2 - arg3;
        int var13 = (arg1.field8053 + arg1.field8033) / 2 - arg0;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class326.field4589 - ((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 < 4096) {
                var15 = var6 * 8192 / 4096 + 8192;
            } else {
                var15 = 16384;
            }
            var11 = var14 * var15 / 8192 + (16384 - var15 >> 1);
        }
        if (arg2 != 16384) {
            return;
        }
        if (arg1.field8026 != null) {
            arg1.field8026.method1061(var9);
            arg1.field8026.method1078(var11);
        } else if (arg1.field8037 >= 0) {
            int var16 = arg1.field8031 == 256 && arg1.field8039 == 256 ? 256 : class739.method4086(arg1.field8039, (byte) -122, arg1.field8031);
            if (arg1.field8024) {
                if (arg1.field8047 == null) {
                    arg1.field8047 = class622.method3580(class102.field1184, arg1.field8037);
                }
                if (arg1.field8047 != null) {
                    if (arg1.field8043 == null) {
                        arg1.field8043 = arg1.field8047.method3582(new int[] { 22050 });
                    }
                    if (arg1.field8043 != null) {
                        class168 var20 = class168.method1076(arg1.field8043, var16, var9 << 6, var11);
                        var20.method1056(-1);
                        class44.field468.method2510(var20);
                        arg1.field8026 = var20;
                    }
                }
            } else {
                class307 var17 = class307.method1998(class406.field5726, arg1.field8037, 0);
                if (var17 != null) {
                    class348 var18 = var17.method1995().method2196(class413.field5782);
                    class168 var19 = class168.method1076(var18, var16, var9 << 6, var11);
                    var19.method1056(-1);
                    class44.field468.method2510(var19);
                    arg1.field8026 = var19;
                }
            }
        }
        if (arg1.field8049 != null) {
            arg1.field8049.method1061(var9);
            arg1.field8049.method1078(var11);
            if (arg1.field8049.method529((byte) 46)) {
                return;
            }
            arg1.field8049 = null;
            arg1.field8050 = null;
            arg1.field8028 = null;
        } else if (arg1.field8042 != null && (arg1.field8040 -= arg5) <= 0) {
            int var21 = arg1.field8031 == 256 && arg1.field8039 == 256 ? 256 : (int) ((double) (arg1.field8031 - arg1.field8039) * Math.random()) + arg1.field8039;
            if (arg1.field8032) {
                if (arg1.field8050 == null) {
                    int var22 = (int) (Math.random() * (double) arg1.field8042.length);
                    arg1.field8050 = class622.method3580(class102.field1184, arg1.field8042[var22]);
                }
                if (arg1.field8050 != null) {
                    if (arg1.field8028 == null) {
                        arg1.field8028 = arg1.field8050.method3582(new int[] { 22050 });
                    }
                    if (arg1.field8028 != null) {
                        class168 var23 = class168.method1076(arg1.field8028, var21, var9 << 6, var11);
                        var23.method1056(0);
                        class44.field468.method2510(var23);
                        arg1.field8049 = var23;
                        arg1.field8040 = arg1.field8052 + (int) ((double) (arg1.field8046 - arg1.field8052) * Math.random());
                        return;
                    }
                }
                return;
            }
            int var24 = (int) ((double) arg1.field8042.length * Math.random());
            class307 var25 = class307.method1998(class406.field5726, arg1.field8042[var24], 0);
            if (var25 != null) {
                class348 var26 = var25.method1995().method2196(class413.field5782);
                class168 var27 = class168.method1076(var26, var21, var9 << 6, var11);
                var27.method1056(0);
                class44.field468.method2510(var27);
                arg1.field8049 = var27;
                arg1.field8040 = (int) ((double) (arg1.field8046 - arg1.field8052) * Math.random()) + arg1.field8052;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJZLae;III)V", line = 276)
    public static final void method651(byte arg0, long arg1, boolean arg2, class283 arg3, int arg4, int arg5, int arg6) {
        class434.method2601(0, true, arg3, arg5, arg2, arg6, arg4, arg1);
        if (arg0 != -31) {
            method650(92, null, -127, -59, 13, 71);
        }
        field1040++;
    }
}
