import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class217 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lcu;")
    public static class206 field3090 = new class206(33, -1);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lkg;")
    public static class252 field3091 = new class252(0, 0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public static int method1381(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3089++;
        class135 var10 = null;
        class135 var11 = (class135) class94.field1444.method3257(-55);
        if (arg9 > -127) {
            field3091 = null;
        }
        while (var11 != null) {
            if (var11.field2194 == arg4 && var11.field2195 == arg8 && var11.field2198 == arg5 && var11.field2201 == arg6) {
                var10 = var11;
                break;
            }
            var11 = (class135) class94.field1444.method3263((byte) -98);
        }
        if (var10 == null) {
            var10 = new class135();
            var10.field2201 = arg6;
            var10.field2195 = arg8;
            var10.field2194 = arg4;
            var10.field2198 = arg5;
            if (arg8 >= 0 && arg5 >= 0 && arg8 < class34.field530 && arg5 < class34.field531) {
                class125.method966(var10, 0);
            }
            class94.field1444.method3265(var10, (byte) -79);
        }
        var10.field2202 = arg1;
        var10.field2206 = arg3;
        var10.field2208 = arg2;
        var10.field2205 = arg0;
        var10.field2209 = arg7;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1383(int arg0) {
        field3090 = null;
        field3091 = null;
        if (arg0 != -4640) {
            field3090 = null;
        }
    }
}
