import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class157 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Loc;")
    private static class151 field2844 = class137.method873(2, "Bad session id)3");

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Loc;")
    public static class151 field2842 = class137.method873(2, "<col=00ffff>");

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Loc;")
    public static class151 field2843 = field2844;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[Lhh;")
    public static class84[] field2838;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field2842 = null;
        field2844 = null;
        field2843 = null;
        field2838 = null;
        int var1 = 90 % ((11 - arg0) / 41);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)I")
    public static final int method1030(int arg0, int arg1, byte arg2) {
        if (arg2 != -13) {
            method1030(94, -76, (byte) 35);
        }
        field2840++;
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static final void method1031(int arg0) {
        class147 var1 = (class147) class227.field3961.method1534(20912);
        if (arg0 != 0) {
            return;
        }
        while (var1 != null) {
            int var2 = var1.field2631;
            if (class197.method1234(var2, 100)) {
                boolean var3 = true;
                class232[] var4 = class115.field2067[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4237;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1881;
                    class232 var7 = class175.method1115(arg0 - 22192, var6);
                    if (var7 != null) {
                        class27.method208(true, var7);
                    }
                }
            }
            var1 = (class147) class227.field3961.method1535(0);
        }
        field2839++;
    }
}
