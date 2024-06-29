import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class545 extends class168 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field7601;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field7599;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[[I")
    public static int[][] field7602 = new int[128][128];

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lmg;")
    public static class151 field7603 = new class151();

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3144(int arg0, int arg1, byte arg2) {
        field7604++;
        if (arg2 >= -112) {
            field7603 = null;
        }
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static final void method3145(byte arg0) {
        field7600++;
        class349.field4502.method209(-128);
        if (arg0 != 9) {
            field7602 = null;
        }
        class680.field9495.method1117(2);
        class654.field9104.method1831(1);
        class262.field3311.setBackground(Color.black);
        class23.field427 = -1;
        class349.field4502 = class100.method802(class262.field3311, (byte) 103);
        class680.field9495 = class713.method3981(77, true, class262.field3311);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method3146(boolean arg0) {
        if (!arg0) {
            field7603 = null;
            field7602 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
    public class545(int arg0, int arg1) {
        this.field7601 = arg0;
        this.field7599 = arg1;
    }
}
