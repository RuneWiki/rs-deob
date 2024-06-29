import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class47 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Z")
    public static boolean field818;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lab;I)Lsd;")
    public static final class275 method297(class249 arg0, int arg1) {
        field820++;
        if (arg1 != 3162) {
            field818 = false;
        }
        return new class275(arg0.method1762(-1), arg0.method1762(-1), arg0.method1762(arg1 ^ 0xFFFFF3A5), arg0.method1762(-1), arg0.method1762(arg1 - 3163), arg0.method1762(-1), arg0.method1762(arg1 - 3163), arg0.method1762(-1), arg0.method1812((byte) 52), arg0.method1802((byte) 123));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static final void method298(byte arg0) {
        if (arg0 <= 104) {
            return;
        }
        field817++;
        if (class83.field1375.toLowerCase().indexOf("microsoft") != -1) {
            class249.field4224[220] = 74;
            class249.field4224[187] = 27;
            class249.field4224[192] = 58;
            class249.field4224[188] = 71;
            class249.field4224[221] = 43;
            class249.field4224[191] = 73;
            class249.field4224[223] = 28;
            class249.field4224[222] = 59;
            class249.field4224[219] = 42;
            class249.field4224[190] = 72;
            class249.field4224[189] = 26;
            class249.field4224[186] = 57;
            return;
        }
        class249.field4224[91] = 42;
        class249.field4224[47] = 73;
        class249.field4224[45] = 26;
        class249.field4224[92] = 74;
        if (class83.field1384 == null) {
            class249.field4224[192] = 58;
            class249.field4224[222] = 59;
        } else {
            class249.field4224[520] = 59;
            class249.field4224[222] = 58;
            class249.field4224[192] = 28;
        }
        class249.field4224[59] = 57;
        class249.field4224[46] = 72;
        class249.field4224[61] = 27;
        class249.field4224[93] = 43;
        class249.field4224[44] = 71;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lih;")
    public static final class57 method299(int arg0, int arg1) {
        field819++;
        class57 var2 = (class57) class68.field1143.method252((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class113.field1930.method1149(arg0, (byte) 33, arg1);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method368(new class249(var3), 0);
        }
        class68.field1143.method247(var4, (long) arg1, arg0 ^ 0xFFFFFFB1);
        return var4;
    }
}
