import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class322 extends class535 {

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
    public static final void method2063(int arg0, int arg1) {
        class182.method1266((byte) 57);
        field4798++;
        class100.method739(-24777);
        class263.method1705(true, arg0, -1);
        class70.method543(class149.field2287, (byte) -19, class96.field1527, class76.field1256);
        class289.method1852(56, class76.field1256, class96.field1527);
        class47.method440(14490);
        class482.method2844(class525.field7661, (byte) 73);
        int var2 = -81 / ((-arg1 - 61) / 61);
        class531.method3148(-109);
        class305.method1949((byte) 51);
        if (class37.field799 == 2) {
            class170.method1206(1, 3);
        } else if (class37.field799 == 6) {
            class170.method1206(1, 7);
        } else if (class37.field799 == 9) {
            class170.method1206(1, 10);
        } else if (class37.field799 == 1) {
            class376.method2298((byte) 111, class76.field1256, class96.field1527);
            return;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        if (arg1 == 1) {
            field4794++;
            return class539.field7939;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static final void method2064(boolean arg0) {
        class524.field7654 = null;
        class102.field1577 = -1;
        field4796++;
        if (arg0) {
            field4795 = 12;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class322() {
        super(0, true);
    }

    static {
        new class44("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field4797 = -1;
    }
}
