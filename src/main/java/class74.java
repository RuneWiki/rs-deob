import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class74 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lve;")
    private static class255 field1218 = class87.method607(72, "Take");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lve;")
    public static class255 field1223 = field1218;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lff;")
    public static class47 field1222 = new class47(512);

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lve;")
    public static class255 field1225 = class87.method607(43, "::fpson");

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lve;")
    public static class255 field1228 = class87.method607(106, "settings=");

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lve;")
    public static class255 field1226 = class87.method607(95, ": ");

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lrg;")
    public static class88 field1229;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1224++;
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class30.method170(arg4, class250.field4213[var6], arg2, arg1, -30310);
        }
        if (arg0 < 67) {
            method531(47, -63, 53, (class197) null, -87, -78, 45, 86);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIILtl;IIII)V", line = 35)
    public static final void method531(int arg0, int arg1, int arg2, class197 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class277.field4749) {
            class197.field3381 = 32;
        } else {
            class197.field3381 = 0;
        }
        if (arg4 < 93) {
            method534((byte) 72);
        }
        field1219++;
        class277.field4749 = false;
        if (class235.field3871 != 0) {
            if (arg0 <= arg2 && arg2 < arg0 + 16 && arg1 <= arg6 && arg6 < (arg1 + 16)) {
                arg3.field3310 -= 4;
                class108.method834((byte) 49, arg3);
            } else if (arg2 >= arg0 && arg0 + 16 > arg2 && arg6 >= (arg1 + arg7 - 16) && arg6 < (arg1 + arg7)) {
                arg3.field3310 += 4;
                class108.method834((byte) 49, arg3);
            } else if (arg2 >= (arg0 - class197.field3381) && arg2 < arg0 + class197.field3381 + 16 && arg1 + 16 <= arg6 && arg6 < (arg1 + arg7 - 16)) {
                int var8 = (arg7 - 32) * arg7 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (var8 / 2) - arg1 - 16;
                int var10 = arg7 - var8 - 32;
                arg3.field3310 = (arg5 - arg7) * var9 / var10;
                class108.method834((byte) 49, arg3);
                class277.field4749 = true;
            }
        }
        if (class19.field320 == 0) {
            return;
        }
        int var11 = arg3.field3294;
        if (arg2 >= (arg0 - var11) && arg6 >= arg1 && arg2 < arg0 + 16 && (arg1 + arg7) >= arg6) {
            arg3.field3310 += class19.field320 * 45;
            class108.method834((byte) 49, arg3);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIZ)V", line = 103)
    public static final void method532(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class29.field449 = arg1;
        class315.field5347 = arg2;
        class76.field1249 = arg3;
        class115.field1956 = new class249[arg0][class29.field449][class315.field5347];
        class43.field677 = new int[arg0][class29.field449 + 1][class315.field5347 + 1];
        if (class281.field4827) {
            class34.field555 = new class142[4][];
        }
        if (arg4) {
            class159.field2687 = new class249[1][class29.field449][class315.field5347];
            class118.field1982 = new int[class29.field449][class315.field5347];
            class279.field4783 = new int[1][class29.field449 + 1][class315.field5347 + 1];
            if (class281.field4827) {
                class295.field5062 = new class142[1][];
            }
        } else {
            class159.field2687 = (class249[][][]) null;
            class118.field1982 = (int[][]) null;
            class279.field4783 = (int[][][]) null;
            class295.field5062 = (class142[][]) null;
        }
        class197.method1415(false);
        class298.field5099 = new class253[500];
        class137.field2303 = 0;
        class132.field2198 = new class253[500];
        class276.field4736 = 0;
        class38.field585 = new int[arg0][class29.field449 + 1][class315.field5347 + 1];
        class253.field4262 = new class250[5000];
        class124.field2058 = 0;
        class304.field5204 = new class250[100];
        class218.field3698 = new boolean[class76.field1249 + class76.field1249 + 1][class76.field1249 + class76.field1249 + 1];
        class208.field3565 = new boolean[class76.field1249 + class76.field1249 + 2][class76.field1249 + class76.field1249 + 2];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V", line = 144)
    public static final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 1) {
            method534((byte) -105);
        }
        if (class125.field2082 <= arg5 && arg6 <= class30.field473 && class261.field4427 <= arg1 && arg3 <= class11.field156) {
            class37.method221(arg5, arg3, arg7, arg1, arg4, arg0, arg6, (byte) -68);
        } else {
            class163.method1189(arg1, arg5, arg3, arg0, arg6, arg7, 2048, arg4);
        }
        field1220++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 172)
    public static void method534(byte arg0) {
        field1225 = null;
        field1226 = null;
        field1228 = null;
        if (arg0 == 39) {
            field1218 = null;
            field1229 = null;
            field1222 = null;
            field1223 = null;
        }
    }
}
