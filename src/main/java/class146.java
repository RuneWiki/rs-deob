import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class146 extends class227 {

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "Loq;")
    public static class242 field1933;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Z")
    public static boolean field1935;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "Lo;")
    public static class24 field1936;

    static {
        new class305("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field1933 = new class242("", 12);
        field1935 = false;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 5)
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "(I)V", line = 9)
    public static void method890(int arg0) {
        field1933 = null;
        if (arg0 == 0) {
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method62(int arg0, int arg1) {
        ++field1931;
        int[] var3 = super.field3068.method1970(arg1, (byte) 47);
        if (super.field3068.field4480) {
            class438.method2688(var3, 0, class446.field6486, class190.field2457[arg1]);
        }
        if (arg0 != 15811) {
            method890(88);
        }
        return var3;
    }
}
