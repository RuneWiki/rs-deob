import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class135 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lvq;")
    public static class24 field1848 = new class24(60, 12);

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1850 = 1337;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "J")
    public static long field1853;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static void method900(byte arg0) {
        if (arg0 >= -5) {
            method900((byte) 34);
        }
        field1848 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method901(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0) {
            return;
        }
        field1849++;
        if (arg6 >= class9.field128 && arg6 <= class63.field838 && class9.field128 <= arg2 && class63.field838 >= arg2 && arg4 >= class9.field128 && class63.field838 >= arg4 && class9.field128 <= arg9 && class63.field838 >= arg9 && arg7 >= class248.field3659 && arg7 <= class146.field1978 && arg8 >= class248.field3659 && class146.field1978 >= arg8 && class248.field3659 <= arg5 && class146.field1978 >= arg5 && class248.field3659 <= arg3 && arg3 <= class146.field1978) {
            class231.method1575(arg5, arg2, arg6, arg4, arg8, arg7, (byte) 78, arg9, arg1, arg3);
        } else {
            class9.method90(arg3, arg5, arg9, arg6, arg1, (byte) 79, arg8, arg7, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method902(int arg0) {
        class159.field2132.field3762 = 0;
        field1851++;
        class251.field3687 = null;
        class53.field661 = null;
        class30.field421 = null;
        class35.field496 = 0;
        class15.field246 = 0;
        class184.field2595 = 0;
        class22.field306.field3762 = 0;
        class444.field6471 = null;
        if (arg0 <= 93) {
            field1848 = null;
        }
        class359.method2282(-71);
        class100.method664(false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class455.field6731[var1] = null;
        }
        class187.field2619 = null;
        for (int var2 = 0; var2 < class364.field5260.length; var2++) {
            class26 var4 = class364.field5260[var2];
            if (var4 != null) {
                var4.field709 = -1;
            }
        }
        class129.method863(2);
        class28.field402 = 1;
        client.method1796(30, 63);
        for (int var3 = 0; var3 < 100; var3++) {
            class344.field5053[var3] = true;
        }
        class454.method2814(false);
        class408.field5874 = null;
        class167.field2198 = 0L;
    }
}
