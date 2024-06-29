import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class126 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1671 = 1406;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[I")
    public static int[] field1673 = new int[4096];

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lei;")
    public static class289 field1672 = new class289(16);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lbi;IIIIILfp;IIII)Lbi;")
    public static final class143 method849(class143 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class9 arg6, int arg7, int arg8, int arg9, int arg10) {
        field1674++;
        long var11 = (long) arg9;
        if (arg8 != 22884) {
            return null;
        }
        class143 var13 = (class143) class443.field6436.method2310((byte) -128, var11);
        short var14 = 1031;
        if (var13 == null) {
            class100 var15 = class267.method1838(0, arg9, false, class52.field659);
            if (var15 == null) {
                return null;
            }
            var13 = arg6.method163(var15, var14, class57.field701, 64, 768);
            class443.field6436.method2299(true, var13, var11);
        }
        class143 var16 = var13.method966((byte) 2, var14, true);
        if (arg10 != 0) {
            var16.method954(arg10);
        }
        if (arg7 != 0) {
            var16.method944(arg7);
        }
        if (arg3 != 0) {
            var16.method958(arg3);
        }
        if (arg2 != 0) {
            var16.method946(0, arg2, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method850(byte arg0) {
        field1672 = null;
        if (arg0 >= -50) {
            method849((class143) null, -21, 44, 15, 115, -115, (class9) null, -19, -81, -121, 57);
        }
        field1673 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static final void method851(byte arg0) {
        if (arg0 != -97) {
            method849((class143) null, 120, -12, -34, 22, -11, (class9) null, 10, 102, 7, 61);
        }
        field1669++;
        class363 var1 = class303.field4440;
        synchronized (class303.field4440) {
            class303.field4440.method2313(121);
        }
        class363 var2 = class9.field123;
        synchronized (class9.field123) {
            class9.field123.method2313(112);
        }
    }
}
