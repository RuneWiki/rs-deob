import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class416 {

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Lkl;")
    public static class55 field6046 = new class55(12, 0, 1, 0);

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "[[Z")
    public static boolean[][] field6051 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Lwj;")
    public static class270 field6050 = new class270(69, 6);

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "Lar;")
    public static class479 field6052 = new class479();

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2476(byte arg0) {
        field6049++;
        class162 var1 = class528.field7803;
        synchronized (class528.field7803) {
            class528.field7803.method1068(0);
        }
        if (arg0 == 108) {
            class162 var2 = class345.field4953;
            synchronized (class345.field4953) {
                class345.field4953.method1068(0);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 20)
    public static void method2477(int arg0) {
        field6051 = null;
        if (arg0 > 123) {
            field6046 = null;
            field6050 = null;
            field6052 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IFFF)I", line = 33)
    public static final int method2478(int arg0, float arg1, float arg2, float arg3) {
        field6047++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        if (arg0 != 13981) {
            return -101;
        }
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLtt;IILtt;)I", line = 80)
    public static final int method2479(boolean arg0, class61 arg1, int arg2, int arg3, class61 arg4) {
        field6048++;
        if (arg3 == 1) {
            int var5 = arg1.field3393;
            int var6 = arg4.field3393;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class126.method868(arg1.method504(24857).field3247, class372.field5455, arg4.method504(24857).field3247, 0);
        } else if (arg3 != 3) {
            int var7 = 1 / ((arg2 + 67) / 49);
            if (arg3 == 4) {
                if (arg1.method1474(128)) {
                    return arg4.method1474(128) ? 0 : 1;
                } else if (arg4.method1474(128)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 5) {
                if (arg1.method1471((byte) -126)) {
                    return arg4.method1471((byte) -125) ? 0 : 1;
                } else if (arg4.method1471((byte) -128)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg1.method1468(0)) {
                    return arg4.method1468(0) ? 0 : 1;
                } else if (arg4.method1468(0)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg1.method1472((byte) 123)) {
                    return arg4.method1472((byte) 123) ? 0 : 1;
                } else if (arg4.method1472((byte) 123)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var8 = arg1.field755;
                int var9 = arg4.field755;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var9 == 1000) {
                        var9 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var9 == -1) {
                        var9 = 1000;
                    }
                }
                return var8 - var9;
            } else {
                return arg1.field760 - arg4.field760;
            }
        } else if (arg1.field758.equals("-")) {
            if (arg4.field758.equals("-")) {
                return 0;
            } else if (arg0) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg4.field758.equals("-")) {
            return arg0 ? 1 : -1;
        } else {
            return class126.method868(arg1.field758, class372.field5455, arg4.field758, 0);
        }
    }
}
