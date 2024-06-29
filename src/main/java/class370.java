import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class370 extends class510 {

    @OriginalMember(owner = "client!po", name = "C", descriptor = "I")
    public int field5219;

    @OriginalMember(owner = "client!po", name = "D", descriptor = "Lin;")
    public static class380 field5220 = new class380(81, 2);

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "Ljea;")
    public static class250 field5222;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "[I")
    public static int[] field5223;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILuf;ZI)V", line = 4)
    public static final void method2207(int arg0, class519 arg1, boolean arg2, int arg3) {
        field5218++;
        if (class766.field10586 != null || class383.field5382 || arg1 == null || class391.method2345(arg1, -30553) == null) {
            return;
        }
        class766.field10586 = arg1;
        class6.field86 = class391.method2345(arg1, -30553);
        class435.field6063 = 0;
        class286.field4209 = arg0;
        class752.field10459 = arg2;
        class591.field8482 = arg3;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 26)
    public static void method2208(int arg0) {
        field5222 = null;
        field5223 = null;
        if (arg0 >= -91) {
            method2207(111, null, false, 33);
        }
        field5220 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Lhl;", line = 41)
    public final class353 method327(byte arg0) {
        if (arg0 <= 51) {
            method2208(-6);
        }
        field5221++;
        return class243.field3479;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lmp;Lfe;IIIIIIIIIIIIII)V", line = 55)
    public class370(class565 arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field5219 = arg15;
    }
}
