import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class12 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field87 = -1;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
    public static int[] field89 = new int[2];

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lrk;")
    public static class427 field92;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field90;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLu;ILu;I)I", line = 60)
    public static final int method59(boolean arg0, class187 arg1, int arg2, class187 arg3, int arg4) {
        field91++;
        if (arg2 == 1) {
            int var5 = arg1.field1850;
            int var6 = arg3.field1850;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (~arg2 == arg4) {
            return class22.method286((byte) -21, arg3.method1354((byte) 120).field3512, class89.field1320, arg1.method1354((byte) 49).field3512);
        } else if (arg2 == 3) {
            if (arg1.field2713.equals("-")) {
                if (arg3.field2713.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2713.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class22.method286((byte) -21, arg3.field2713, class89.field1320, arg1.field2713);
            }
        } else if (arg2 == 4) {
            if (arg1.method1007((byte) -87)) {
                return arg3.method1007((byte) -87) ? 0 : 1;
            } else if (arg3.method1007((byte) -87)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg1.method1015(64)) {
                return arg3.method1015(arg4 + 67) ? 0 : 1;
            } else if (arg3.method1015(64)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg1.method1014(-61)) {
                return arg3.method1014(arg4 ^ 0x19) ? 0 : 1;
            } else if (arg3.method1014(-86)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg1.method1009(1)) {
                return arg3.method1009(1) ? 0 : 1;
            } else if (arg3.method1009(1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg1.field2706;
            int var8 = arg3.field2706;
            if (arg0) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field2701 - arg3.field2701;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 166)
    public static final void method60(int arg0, int arg1, int arg2) {
        class224 var3 = class118.field1653[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3108 != null) {
            var3.field3108 = null;
        }
        if (var3.field3125 != null) {
            var3.field3125 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 184)
    public static void method61(int arg0) {
        field90 = null;
        field92 = null;
        if (arg0 < 27) {
            field90 = null;
        }
        field89 = null;
    }
}
