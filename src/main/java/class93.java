import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class93 extends class176 {

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Ldm;")
    public class46 field1434 = new class46();

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "Ldm;")
    public static class46 field1433 = new class46();

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "Ldj;")
    public static class288 field1435;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        field1435 = null;
        field1433 = null;
        if (arg0 > -9) {
            field1433 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILjava/lang/String;IIIB)V")
    public static final void method682(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != 94) {
            field1435 = null;
        }
        field1432++;
        class141 var8 = new class141();
        var8.field2186 = arg5;
        var8.field2189 = arg1;
        var8.field2183 = arg4;
        var8.field2190 = arg0;
        var8.field2192 = arg3;
        var8.field2184 = class405.field5763 + arg2;
        var8.field2185 = arg6;
        class297.field4071.method3145(var8, Integer.MAX_VALUE);
    }
}
