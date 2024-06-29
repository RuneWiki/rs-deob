import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class129 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lpj;")
    private static class237 field2252 = class33.method353("wishes to trade with you)3", 44);

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field2255 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lpj;")
    public static class237 field2257 = class33.method353("(Y", 62);

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lpj;")
    public static class237 field2258 = class33.method353(": ", 87);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lpj;")
    public static class237 field2253 = class33.method353("Lade Titelbild )2 ", 111);

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lpj;")
    public static class237 field2261 = field2252;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
    public static boolean field2259 = false;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field2260 = -1;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lqe;")
    public class95 field2256;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method913(int arg0) {
        field2261 = null;
        field2252 = null;
        field2258 = null;
        field2257 = null;
        if (arg0 > -83) {
            method914(-48, 55, -31, -87, -116, 30, 27, -11, -41, -90);
        }
        field2253 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class61 var10 = null;
        field2254++;
        for (class61 var11 = (class61) class27.field487.method673(false); var11 != null; var11 = (class61) class27.field487.method680(116)) {
            if (var11.field1217 == arg5 && var11.field1228 == arg1 && var11.field1226 == arg4 && var11.field1216 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class61();
            var10.field1217 = arg5;
            var10.field1226 = arg4;
            var10.field1216 = arg3;
            var10.field1228 = arg1;
            class57.method504((byte) 118, var10);
            class27.field487.method675(var10, (byte) -47);
        }
        var10.field1232 = arg9;
        var10.field1220 = arg6;
        var10.field1218 = arg7;
        var10.field1231 = arg0;
        var10.field1236 = arg8;
        if (arg2 > -105) {
            field2252 = null;
        }
    }
}
