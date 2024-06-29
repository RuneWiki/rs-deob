import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class296 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lcd;")
    public static class64 field5103 = class44.method335((byte) 71, "www");

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lcd;")
    public static class64 field5104 = class44.method335((byte) 71, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lcd;")
    public static class64 field5107 = class44.method335((byte) 71, "::fps ");

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lcd;")
    public static class64 field5098 = class44.method335((byte) 71, "loc");

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Luk;")
    public static class86 field5097;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILfd;ILqi;Lfk;)V", line = 5)
    public static final void method2065(int arg0, int arg1, int arg2, int arg3, class232 arg4, int arg5, class290 arg6, class41 arg7) {
        field5105++;
        if (arg2 > -58) {
            return;
        }
        class246 var8 = new class246();
        var8.field4271 = arg3;
        var8.field4266 = arg1 * 128;
        var8.field4285 = arg0 * 128;
        if (arg6 != null) {
            var8.field4265 = arg6.field4991 * 128;
            int var10 = arg6.field5017;
            var8.field4269 = arg6.field5004;
            var8.field4275 = arg6;
            var8.field4279 = arg6.field4994;
            var8.field4294 = arg6.field4959;
            var8.field4292 = arg6.field5015;
            int var11 = arg6.field4957;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg6.field4957;
                var11 = arg6.field5017;
            }
            var8.field4267 = (arg1 + var11) * 128;
            var8.field4268 = (arg0 + var10) * 128;
            if (arg6.field4993 != null) {
                var8.field4273 = true;
                var8.method1781(0);
            }
            if (var8.field4292 != null) {
                var8.field4276 = var8.field4279 + ((int) (Math.random() * (double) (var8.field4269 - var8.field4279)));
            }
            class93.field1733.method781(var8, 10751);
        } else if (arg4 != null) {
            var8.field4289 = arg4;
            class6 var9 = arg4.field3911;
            if (var9.field144 != null) {
                var8.field4273 = true;
                var9 = var9.method66(0);
            }
            if (var9 != null) {
                var8.field4267 = (arg1 + var9.field141) * 128;
                var8.field4268 = (var9.field141 + arg0) * 128;
                var8.field4294 = class196.method1378(arg4, 128);
                var8.field4265 = var9.field137 * 128;
            }
            class115.field2115.method781(var8, 10751);
        } else if (arg7 != null) {
            var8.field4284 = arg7;
            var8.field4268 = (arg0 + arg7.method325(-12808)) * 128;
            var8.field4267 = (arg1 + arg7.method325(-12808)) * 128;
            var8.field4294 = class44.method336(arg7, 118);
            var8.field4265 = arg7.field675 * 128;
            class17.field336.method1149(var8, arg7.field672.method509(31492), -96);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 92)
    public static final void method2066(int arg0) {
        field5102++;
        if (!class251.field4378) {
            return;
        }
        class251.field4378 = false;
        class164.field2881 = null;
        class265.field4558 = null;
        if (arg0 != 1) {
            method2068(-86);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILqm;)V", line = 123)
    public static final void method2067(int arg0, class222 arg1) {
        if (arg0 >= -119) {
            field5097 = (class86) null;
        }
        field5106++;
        class82.field1520 = arg1.method1606(91, class53.field876);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 142)
    public static final void method2068(int arg0) {
        class280.field4825.method1187(0);
        if (arg0 == 3) {
            field5100++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)Lsh;", line = 159)
    public static final class276 method2069(boolean arg0, int arg1) {
        field5108++;
        class276 var2 = (class276) class228.field3870.method1194((long) arg1, (byte) -75);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return (class276) null;
        } else {
            byte[] var3 = class63.field1222.method1580(0, arg1, 3);
            class276 var4 = new class276();
            if (var3 != null) {
                var4.method1914(new class13(var3), (byte) -106);
            }
            class228.field3870.method1190(12669, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 207)
    public static void method2070(int arg0) {
        field5098 = null;
        field5107 = null;
        field5103 = null;
        field5097 = null;
        if (arg0 <= 6) {
            field5097 = (class86) null;
        }
        field5104 = null;
    }
}
