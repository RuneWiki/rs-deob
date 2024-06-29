import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class89 {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lgaa;")
    public static class315 field1233 = new class315(15000);

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Lfi;")
    public static class583 field1236;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Llca;")
    public static class672 field1234;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lqn;ILaj;)V")
    public static final void method721(class70 arg0, int arg1, class333 arg2) {
        class357.field5236 = arg0;
        class156.field2149 = "";
        int var3 = -107 % ((arg1 - 20) / 37);
        field1235++;
        class322.field4631 = arg2;
        if (class483.field6674.startsWith("win")) {
            class156.field2149 = class156.field2149 + "windows/";
        } else if (class483.field6674.startsWith("linux")) {
            class156.field2149 = class156.field2149 + "linux/";
        } else if (class483.field6674.startsWith("mac")) {
            class156.field2149 = class156.field2149 + "macos/";
        }
        if (class357.field5236.field977) {
            class156.field2149 = class156.field2149 + "msjava/";
        } else if (class483.field6672.startsWith("amd64") || class483.field6672.startsWith("x86_64")) {
            class156.field2149 = class156.field2149 + "x86_64/";
        } else if (class483.field6672.startsWith("i386") || class483.field6672.startsWith("i486") || class483.field6672.startsWith("i586") || class483.field6672.startsWith("x86")) {
            class156.field2149 = class156.field2149 + "x86/";
        } else if (class483.field6672.startsWith("ppc")) {
            class156.field2149 = class156.field2149 + "ppc/";
        } else {
            class156.field2149 = class156.field2149 + "universal/";
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        field1237++;
        if (arg2 != 6680) {
            field1236 = null;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class396.field5820 - class549.field7448) * var6 / 100 + class549.field7448;
        if (var7 < class665.field9200) {
            var7 = class665.field9200;
        } else if (var7 > class537.field7311) {
            var7 = class537.field7311;
        }
        int var8 = arg1 * var7 * 512 / (arg0 * 334);
        if (class551.field7455 > var8) {
            short var12 = class551.field7455;
            var7 = var12 * 334 * arg0 / (arg1 * 512);
            if (class537.field7311 < var7) {
                var7 = class537.field7311;
                int var13 = arg1 * var7 * 512 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg5) {
                    class379.field5542.method543();
                    class379.field5542.method462(113, var14, arg4, arg1, arg3, -16777216);
                    class379.field5542.method462(-113, var14, arg4, arg1, arg0 + arg3 - var14, -16777216);
                }
                arg3 += var14;
                arg0 -= var14 * 2;
            }
        } else if (class521.field7158 < var8) {
            short var9 = class521.field7158;
            var7 = arg0 * var9 * 334 / (arg1 * 512);
            if (var7 < class665.field9200) {
                var7 = class665.field9200;
                int var10 = arg0 * 334 * var9 / (var7 * 512);
                int var11 = (arg1 - var10) / 2;
                if (arg5) {
                    class379.field5542.method543();
                    class379.field5542.method462(arg2 ^ 0xFFFFE59D, arg0, arg4, var11, arg3, -16777216);
                    class379.field5542.method462(arg2 ^ 0xFFFFE597, arg0, arg4 + arg1 - var11, var11, arg3, -16777216);
                }
                arg4 += var11;
                arg1 -= var11 * 2;
            }
        }
        class754.field10468 = arg3;
        class634.field8854 = (short) arg1;
        class165.field2233 = arg1 * var7 / 334;
        class62.field892 = arg4;
        class142.field2056 = (short) arg0;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method723(int arg0) {
        if (arg0 > -48) {
            method721(null, -125, null);
        }
        field1233 = null;
        field1234 = null;
        field1236 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(FIFIIFIIF[FI)V")
    public abstract void method724(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, float[] arg9, int arg10);
}
