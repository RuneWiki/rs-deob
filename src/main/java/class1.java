import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class1 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4 = "glow2:";

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    public static int[] field6 = new int[1000];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lfh;")
    public static class140 field7;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 5)
    public static void method1(int arg0) {
        field6 = null;
        if (arg0 != 128) {
            method1(79);
        }
        field7 = null;
        field4 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILvh;ILp;ILf;II)V", line = 26)
    public static final void method2(int arg0, class219 arg1, int arg2, class169 arg3, int arg4, class239 arg5, int arg6, int arg7) {
        field1++;
        class96 var8 = new class96();
        var8.field1272 = arg7;
        var8.field1253 = arg4 * 128;
        var8.field1268 = arg0 * arg2;
        if (arg1 != null) {
            var8.field1257 = arg1.field3116;
            var8.field1261 = arg1.field3160;
            var8.field1252 = arg1.field3147;
            var8.field1273 = arg1.field3110;
            int var10 = arg1.field3112;
            var8.field1267 = arg1.field3102 * 128;
            var8.field1271 = arg1;
            int var11 = arg1.field3096;
            if (arg6 == 1 || arg6 == 3) {
                var10 = arg1.field3096;
                var11 = arg1.field3112;
            }
            var8.field1258 = (arg2 + var10) * 128;
            var8.field1256 = arg1.field3104;
            var8.field1251 = (arg4 + var11) * 128;
            if (arg1.field3125 != null) {
                var8.field1264 = true;
                var8.method693(-110);
            }
            if (var8.field1252 != null) {
                var8.field1270 = (int) ((double) (var8.field1257 - var8.field1261) * Math.random()) + var8.field1261;
            }
            class264.field3831.method415((byte) 51, var8);
        } else if (arg3 != null) {
            var8.field1266 = arg3;
            class157 var9 = arg3.field2345;
            if (var9.field2206 != null) {
                var8.field1264 = true;
                var9 = var9.method1210(110);
            }
            if (var9 != null) {
                var8.field1258 = (var9.field2224 + arg2) * 128;
                var8.field1251 = (var9.field2224 + arg4) * 128;
                var8.field1256 = class336.method2345((byte) -54, arg3);
                var8.field1273 = var9.field2182;
                var8.field1267 = var9.field2203 * 128;
            }
            class343.field5336.method415((byte) -101, var8);
        } else if (arg5 != null) {
            var8.field1269 = arg5;
            var8.field1258 = (arg2 + arg5.method1699(arg0 - 129)) * 128;
            var8.field1251 = (arg5.method1699(-1) + arg4) * 128;
            var8.field1256 = class336.method2346(arg5, (byte) -94);
            var8.field1273 = arg5.field3464;
            var8.field1267 = arg5.field3459 * 128;
            class169.field2344.method2275(var8, 111, class201.method1476(-118, arg5.field3475));
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILfd;)Ljava/lang/String;", line = 115)
    public static final String method3(int arg0, class299 arg1) {
        field3++;
        if (arg0 != 32767) {
            field7 = (class140) null;
        }
        return class137.method1035(true, 32767, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V", line = 134)
    public static final void method4(int arg0, int arg1) {
        field2++;
        class42 var2 = class166.method1242(arg1, arg0, -1249071392);
        var2.method306((byte) -104);
    }
}
