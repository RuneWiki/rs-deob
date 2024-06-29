import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class47 extends class189 {

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Lgda;")
    public static class53 field551 = new class53(64, -1);

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "[I")
    public static int[] field556 = new int[4096];

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field555;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field556[var0] = class622.method3496(var0, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([SI)[S", line = 7)
    public static final short[] method304(short[] arg0, int arg1) {
        field552++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 13) {
            method304(null, 65);
        }
        short[] var2 = new short[arg0.length];
        class255.method1692(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V", line = 26)
    public static void method305(byte arg0) {
        field551 = null;
        field556 = null;
        if (arg0 != -38) {
            field556 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLoaa;IILoaa;)I", line = 37)
    public static final int method306(boolean arg0, class287 arg1, int arg2, int arg3, class287 arg4) {
        field554++;
        if (arg3 == 1) {
            int var5 = arg1.field2183;
            int var6 = arg4.field2183;
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
            return class103.method737(-1, class549.field7669, arg1.method1880((byte) 111).field6248, arg4.method1880((byte) 111).field6248);
        } else if (arg3 == 3) {
            if (arg1.field4068.equals("-")) {
                if (arg4.field4068.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field4068.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class103.method737(-1, class549.field7669, arg1.field4068, arg4.field4068);
            }
        } else if (arg3 == 4) {
            if (arg1.method1050(-1)) {
                return arg4.method1050(-1) ? 0 : 1;
            } else if (arg4.method1050(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg1.method1048((byte) 126)) {
                return arg4.method1048((byte) 125) ? 0 : 1;
            } else if (arg4.method1048((byte) 126)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg1.method1047(-88)) {
                return arg4.method1047(109) ? 0 : 1;
            } else if (arg4.method1047(119)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 7) {
            if (arg1.method1051(-1)) {
                return arg4.method1051(-1) ? 0 : 1;
            } else if (arg4.method1051(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 8) {
            int var7 = arg1.field4064;
            int var8 = arg4.field4064;
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
            if (arg2 >= -120) {
                field551 = null;
            }
            return arg1.field4067 - arg4.field4067;
        }
    }
}
