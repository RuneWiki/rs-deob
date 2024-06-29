import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class471 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lrn;")
    public static class174 field7070 = new class174(73, 12);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Ljv;")
    public static class55 field7071 = new class55(8);

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lug;")
    public static class392 field7073 = new class392();

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Lhu;")
    public static class85 field7072;

    static {
        new class342(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 12)
    public static void method2831(int arg0) {
        field7070 = null;
        field7072 = null;
        field7071 = null;
        if (arg0 != 12) {
            field7071 = null;
        }
        field7073 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)I")
    public abstract int method2828(byte arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method2829(Component arg0, int arg1);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2830(int arg0, Component arg1);
}
