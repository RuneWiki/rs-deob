import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class489 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field6976 = 104;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "S")
    public static short field6977 = 320;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field6978 = 0;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "[C")
    public static char[] field6979 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Leia;B)V", line = 9)
    public static final void method2942(class241 arg0, byte arg1) {
        if (arg0.field2875 != null) {
            arg0.field2875.field1357 = 0;
        }
        field6980++;
        arg0.field2877 = false;
        if (arg1 >= -59) {
            field6976 = -106;
        }
        for (class241 var2 = arg0.method678(); var2 != null; var2 = arg0.method681()) {
            method2942(var2, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 39)
    public static void method2943(boolean arg0) {
        field6979 = null;
        if (arg0) {
            method2943(false);
        }
    }
}
