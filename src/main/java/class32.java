import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class32 extends class529 {

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Lrb;")
    public static class178 field333;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
    public abstract int method141(byte arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
    public abstract int method139(boolean arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
    public abstract int method143(int arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)J")
    public abstract long method140(int arg0);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I")
    public abstract int method142(int arg0);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
    public static void method205(int arg0) {
        if (arg0 <= 120) {
            field331 = 25;
        }
        field333 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
    public static final void method206(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        field334++;
        if (arg2 != 4) {
            return;
        }
        class312 var8 = new class312();
        var8.field4906 = arg1;
        var8.field4898 = arg7;
        var8.field4900 = class88.field1278 + arg4;
        var8.field4899 = arg6;
        var8.field4907 = arg0;
        var8.field4901 = arg5;
        var8.field4902 = arg3;
        class479.field7319.method2625(var8, 0);
    }
}
