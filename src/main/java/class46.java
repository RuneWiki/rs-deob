import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class46 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljd;")
    private static class92 field1012 = class202.method1325((byte) 90, "Connection lost)3");

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljd;")
    public static class92 field1011 = class202.method1325((byte) 90, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1014 = 0;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Ljd;")
    public static class92 field1018 = field1012;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lla;")
    public static class108 field1015;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1013++;
        class102 var10 = null;
        if (arg9 >= -19) {
            return;
        }
        for (class102 var11 = (class102) class211.field4080.method103(57); var11 != null; var11 = (class102) class211.field4080.method100(-49)) {
            if (var11.field2106 == arg0 && var11.field2108 == arg4 && var11.field2102 == arg6 && var11.field2093 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class102();
            var10.field2108 = arg4;
            var10.field2102 = arg6;
            var10.field2093 = arg8;
            var10.field2106 = arg0;
            class193.method1279(var10, 4096);
            class211.field4080.method101(var10, (byte) 11);
        }
        var10.field2084 = arg3;
        var10.field2092 = arg5;
        var10.field2088 = arg2;
        var10.field2085 = arg7;
        var10.field2090 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public static final void method289(int arg0, int arg1, int arg2) {
        field1016++;
        class5 var3 = class214.method1388(75, arg1);
        if (arg2 != -18701) {
            method290((byte) 23);
        }
        int var4 = var3.field272;
        int var5 = var3.field281;
        int var6 = var3.field284;
        int var7 = class25.field577[var6 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class165.field3242[var5] = class67.method396(class196.method1301(class165.field3242[var5], ~var8), class196.method1301(arg0 << var4, var8));
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method290(byte arg0) {
        field1011 = null;
        if (arg0 < 34) {
            method290((byte) 67);
        }
        field1018 = null;
        field1012 = null;
        field1015 = null;
    }
}
