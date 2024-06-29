import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class257 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Lwd;")
    public static class148 field4167;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lmo;III)Lo;")
    public static final class21 method1779(class447 arg0, int arg1, int arg2, int arg3) {
        field4169++;
        class186 var4 = new class186(arg0.method2771(arg3, arg1, 3));
        class21 var5 = new class21(arg1, var4.method1270(-9970), var4.method1270(-9970), var4.method1284(8388607), var4.method1284(arg2 + 8402903), var4.method1322(false) == 1, var4.method1322(false));
        int var6 = var4.method1322(false);
        int var7 = 0;
        if (arg2 != -14296) {
            field4167 = null;
        }
        while (var7 < var6) {
            var5.field277.method245(500, new class367(var4.method1322(false), var4.method1272((byte) -58), var4.method1272((byte) -66), var4.method1272((byte) -106), var4.method1272((byte) -125), var4.method1272((byte) -69), var4.method1272((byte) -93), var4.method1272((byte) -68), var4.method1272((byte) -81)));
            var7++;
        }
        var5.method151((byte) 84);
        return var5;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static final void method1780(boolean arg0) {
        field4168++;
        class104.field1466 = null;
        class413.field6116 = -1;
        if (!arg0) {
            method1780(true);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1781(int arg0) {
        field4167 = null;
        if (arg0 <= 99) {
            field4167 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lmo;I)V")
    public static final void method1782(class447 arg0, int arg1) {
        class221.field3676 = arg0;
        field4166++;
        if (arg1 != 21260) {
            field4167 = null;
        }
    }
}
