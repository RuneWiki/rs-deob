import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class272 extends class513 {

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lpia;")
    public class104 field3797;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IBI)V")
    public static final void method1760(int arg0, byte arg1, int arg2) {
        field3799++;
        class281 var3 = class54.method395((byte) -53, (long) arg2, 12);
        if (arg1 < 116) {
            method1761((byte) -19, -80);
        }
        var3.method1821((byte) -127);
        var3.field3910 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lpia;)V")
    public class272(class104 arg0) {
        this.field3797 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
    public static final void method1761(byte arg0, int arg1) {
        int var2 = 21 % ((arg0 + 66) / 50);
        field3798++;
        class281 var3 = class54.method395((byte) -53, (long) arg1, 14);
        var3.method1818((byte) 86);
    }
}
