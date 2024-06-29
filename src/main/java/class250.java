import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class class250 {

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Ltja;")
    public static class288 field2935 = new class288(8);

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "Lbt;")
    public static class48 field2939;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V")
    public static final void method1496(int arg0, int arg1) {
        field2936++;
        if (arg1 != -1394622263) {
            method1496(34, 44);
        }
        if (class647.method3652(arg0, arg1 + 1394622263)) {
            class397.method2328(-1, 117, class316.field3880[arg0]);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)J")
    public abstract long method679(byte arg0);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILvk;Liaa;IILtba;II)V")
    public static final void method1497(int arg0, class388 arg1, class521 arg2, int arg3, int arg4, class174 arg5, int arg6, int arg7) {
        field2937++;
        class96 var8 = new class96();
        var8.field1258 = arg7 << 9;
        var8.field1255 = arg3;
        var8.field1267 = arg4 << 9;
        if (arg0 < 66) {
            field2939 = null;
        }
        if (arg5 != null) {
            var8.field1268 = arg5;
            int var10 = arg5.field2125;
            int var11 = arg5.field2147;
            if (arg6 == 1 || arg6 == 3) {
                var11 = arg5.field2125;
                var10 = arg5.field2147;
            }
            var8.field1269 = arg5.field2180;
            var8.field1256 = arg5.field2163;
            var8.field1270 = arg7 + var10 << 9;
            var8.field1248 = arg5.field2084;
            var8.field1259 = arg5.field2093;
            var8.field1278 = arg5.field2099;
            var8.field1264 = arg5.field2116 << 9;
            var8.field1274 = arg5.field2148;
            var8.field1261 = arg5.field2165;
            var8.field1263 = arg5.field2175;
            var8.field1282 = arg5.field2080 << 9;
            var8.field1254 = arg5.field2114;
            var8.field1271 = arg4 + var11 << 9;
            if (arg5.field2157 != null) {
                var8.field1250 = true;
                var8.method836(103);
            }
            if (var8.field1263 != null) {
                var8.field1276 = (int) ((double) (var8.field1259 - var8.field1269) * Math.random()) + var8.field1269;
            }
            class477.field6625.method2732(var8, 21939);
            return;
        }
        if (arg1 != null) {
            var8.field1281 = arg1;
            class479 var9 = arg1.field5003;
            if (var9.field6636 != null) {
                var8.field1250 = true;
                var9 = var9.method2843(class2.field30, 228);
            }
            if (var9 != null) {
                var8.field1271 = var9.field6710 + arg4 << 9;
                var8.field1270 = var9.field6710 + arg7 << 9;
                var8.field1274 = class136.method1002(arg1, (byte) 46);
                var8.field1256 = var9.field6686;
                var8.field1254 = var9.field6646;
                var8.field1248 = var9.field6672;
                var8.field1264 = var9.field6663 << 9;
                var8.field1278 = var9.field6660;
                var8.field1282 = var9.field6704 << 9;
            }
            class599.field8109.method2732(var8, 21939);
            return;
        }
        if (arg2 == null) {
            return;
        }
        var8.field1283 = arg2;
        var8.field1270 = arg2.method1665(1720746760) + arg7 << 9;
        var8.field1271 = arg2.method1665(1720746760) + arg4 << 9;
        var8.field1274 = class427.method2544(-4293, arg2);
        var8.field1264 = arg2.field7369 << 9;
        var8.field1278 = arg2.field7376;
        var8.field1256 = arg2.field7382;
        var8.field1248 = 256;
        var8.field1282 = 0;
        var8.field1254 = 256;
        class118.field1501.method2112(var8, (byte) 6, (long) arg2.field3393);
        return;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)V")
    public static void method1498(byte arg0) {
        field2939 = null;
        if (arg0 > -48) {
            method1496(126, 112);
        }
        field2935 = null;
    }
}
