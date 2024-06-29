import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class112 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "S")
    public static short field1315 = 1;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lal;")
    public static class195 field1312;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLwo;)I", line = 5)
    public static final int method654(byte arg0, class285 arg1) {
        field1314++;
        int var2 = 0;
        if (arg1.method1797(arg0 ^ 0x71, class38.field446)) {
            var2++;
        }
        if (arg0 == 113) {
            if (arg1.method1797(0, class397.field5392)) {
                var2++;
            }
            return var2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 26)
    public static void method655(int arg0) {
        field1312 = null;
        if (arg0 != 10) {
            method656(false);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method656(boolean arg0) {
        class433.field5909 = null;
        class228.field2883 = null;
        field1313++;
        class296.field3951 = null;
        class175.field2032 = null;
        class310.field4202 = arg0;
        class354.field4809 = null;
        class11.method53(16026);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method657(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1311++;
        class12 var5 = class390.method2422(arg3 ^ 0x145BB76A, arg2, arg3);
        var5.method66(-15);
        var5.field149 = arg1;
        var5.field152 = arg0;
        var5.field144 = arg4;
    }
}
