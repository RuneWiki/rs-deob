import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class425 extends class321 {

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field6217 = -1;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lmv;")
    public static class295 field6216;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public static void method2560(int arg0) {
        field6216 = null;
        if (arg0 != -21482) {
            field6217 = 45;
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public static final void method2561(int arg0) {
        class65 var1 = (class65) class111.field1644.method1904(false);
        if (arg0 != -1) {
            return;
        }
        while (var1 != null) {
            if (var1.field1032) {
                var1.method396((byte) 58);
            }
            var1 = (class65) class111.field1644.method1901(116);
        }
        field6215++;
        for (class65 var2 = (class65) class232.field3072.method1904(false); var2 != null; var2 = (class65) class232.field3072.method1901(arg0 + 104)) {
            if (var2.field1032) {
                var2.method396((byte) 58);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z")
    public static final boolean method2562(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field6214++;
            return class174.method1197(arg0, arg2, 18610) || class264.method1587((byte) 95, arg2, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public static int method2563(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method2564(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field6219++;
        if (!arg5) {
            return;
        }
        if (class175.field2455 <= arg3 - arg1 && class375.field5631 >= arg3 + arg1 && (arg6 - arg1) >= class323.field4704 && (arg6 + arg1) <= class148.field2106) {
            class206.method1322(arg6, arg2, arg1, arg4, arg3, (byte) 55, arg0);
        } else {
            class383.method2364(arg4, arg0, arg1, arg6, arg2, arg3, -16761);
        }
    }
}
