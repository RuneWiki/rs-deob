import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class135 extends class72 {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lla;")
    public static class422 field2158;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[[Z")
    public static boolean[][] field2156;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method1085(byte arg0, int arg1) {
        field2157++;
        if (arg1 != -1 && arg0 == -13 && class229.field3705[arg1]) {
            class334.field4889.method2614(arg0 ^ 0x7D55, arg1);
            class158.field2453[arg1] = null;
            class114.field1763[arg1] = null;
            class229.field3705[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1086(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2158 = null;
        }
        field2159++;
        return class367.method2346(arg1, arg2, false) & class405.method2497(arg2, (byte) 114, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 47)
    public static void method1087(byte arg0) {
        if (arg0 >= 84) {
            field2156 = null;
            field2158 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Lio;")
    public abstract class708 method1084(byte arg0);
}
