import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class110 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lwa;")
    public static class75 field1886 = class66.method560("", false);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lwa;")
    public static class75 field1885 = class66.method560("Verbindung mit Update)2Server)3)3)3", false);

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lwa;")
    public static class75 field1889 = class66.method560("compass", false);

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILja;)Lhc;", line = 8)
    public static final class162 method860(int arg0, class60 arg1) {
        field1887++;
        return arg0 == 22759 ? new class162(arg1.method487((byte) -112), arg1.method487((byte) -77), arg1.method487((byte) -64), arg1.method487((byte) -77), arg1.method489(-124), arg1.method501(0)) : (class162) null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 35)
    public static void method863(boolean arg0) {
        if (arg0) {
            method860(-43, (class60) null);
        }
        field1889 = null;
        field1886 = null;
        field1885 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I")
    public abstract int method861(int arg0);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method862(Component arg0, int arg1);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method864(int arg0, Component arg1);
}
