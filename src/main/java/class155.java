import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class155 implements class111 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lnf;")
    public static class162 field2316 = new class162(50);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lub;")
    public static class92 field2318;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2311;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILfh;BIILah;Lgk;I)V")
    public static final void method1124(int arg0, class136 arg1, byte arg2, int arg3, int arg4, class295 arg5, class161 arg6, int arg7) {
        field2314++;
        class80 var8 = new class80();
        if (arg2 != 106) {
            return;
        }
        var8.field1222 = arg4 * 128;
        var8.field1233 = arg3 * 128;
        var8.field1211 = arg0;
        if (arg5 != null) {
            var8.field1228 = arg5.field4583;
            var8.field1235 = arg5.field4575;
            var8.field1214 = arg5.field4601;
            var8.field1230 = arg5;
            var8.field1225 = arg5.field4643 * 128;
            var8.field1232 = arg5.field4610;
            var8.field1231 = arg5.field4590;
            int var9 = arg5.field4620;
            int var10 = arg5.field4592;
            if (arg7 == 1 || arg7 == 3) {
                var9 = arg5.field4592;
                var10 = arg5.field4620;
            }
            var8.field1224 = (arg3 + var10) * 128;
            var8.field1221 = (arg4 + var9) * 128;
            if (arg5.field4598 != null) {
                var8.field1217 = true;
                var8.method629(false);
            }
            if (var8.field1214 != null) {
                var8.field1216 = (int) (Math.random() * (double) (var8.field1228 - var8.field1235)) + var8.field1235;
            }
            class58.field922.method12(var8, 12);
        } else if (arg6 != null) {
            var8.field1218 = arg6;
            class95 var11 = arg6.field2421;
            if (var11.field1547 != null) {
                var8.field1217 = true;
                var11 = var11.method741(arg2 ^ 0x1C);
            }
            if (var11 != null) {
                var8.field1221 = (var11.field1539 + arg4) * 128;
                var8.field1224 = (var11.field1539 + arg3) * 128;
                var8.field1231 = class298.method2002(arg6, (byte) 99);
                var8.field1232 = var11.field1493;
                var8.field1225 = var11.field1541 * 128;
            }
            class121.field1832.method12(var8, 12);
        } else if (arg1 != null) {
            var8.field1234 = arg1;
            var8.field1221 = (arg1.method1013(0) + arg4) * 128;
            var8.field1224 = (arg1.method1013(0) + arg3) * 128;
            var8.field1231 = class91.method691(21272, arg1);
            var8.field1232 = arg1.field2041;
            var8.field1225 = arg1.field2031 * 128;
            class193.field3023.method2046(var8, -73, class170.method1223(true, arg1.field2064));
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2311 = null;
        field2318 = null;
        field2316 = null;
        if (arg0 != -8412) {
            method1125(-92);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI[II)Ljava/lang/String;")
    public final String method822(long arg0, int arg1, int[] arg2, int arg3) {
        field2313++;
        if (arg3 == 0) {
            class231 var6 = class61.method497(arg2[0], 7324);
            return var6.method1588((int) arg0, -16375);
        } else if (arg3 == 1 || arg3 == 10) {
            class179 var7 = class123.method929(22497, (int) arg0);
            return var7.field2778;
        } else if (arg1 > -51) {
            return null;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class61.method497(arg2[0], 7324).method1588((int) arg0, -16375);
        } else {
            return null;
        }
    }
}
