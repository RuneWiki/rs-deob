import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 implements class178 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lid;")
    public static class149 field404 = class60.method382("Module texte charg-B", (byte) 53);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lid;")
    public static class149 field403 = class60.method382(")2", (byte) 89);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lve;")
    public static class189 field406 = new class189(64);

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[I")
    public static int[] field408 = new int[5];

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BJI[I)Lid;")
    public final class149 method152(byte arg0, long arg1, int arg2, int[] arg3) {
        field407++;
        if (arg2 == 0) {
            class13 var6 = class150.method1072(arg3[0], (byte) -122);
            return var6.method84(77, (int) arg1);
        }
        if (arg0 >= -32) {
            field406 = null;
        }
        if (arg2 == 1 || arg2 == 10) {
            class261 var7 = class226.method1516((int) arg1, -28322);
            return var7.field4604;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class150.method1072(arg3[0], (byte) -119).method84(112, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method153(byte arg0) {
        if (arg0 == 42) {
            field403 = null;
            field404 = null;
            field406 = null;
            field408 = null;
        }
    }
}
