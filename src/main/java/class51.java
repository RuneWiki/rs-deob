import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class51 extends class14 {

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Lea;")
    private static class45 field1088;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()V")
    public final void method94() {
        field1088.method296(65, this.field1087);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method95(Component arg0) throws Exception {
        field1088.method301(class121.field2268, class80.field1542, arg0, 112);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
    public final void method93() {
        field1088.method299(this.field1087, super.field338);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()V")
    public final void method99() {
        field1088.method298((byte) -19, this.field1087);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public final void method105(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1088.method297(this.field1087, arg0, -72);
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "()V")
    public static void method335() {
        field1088 = null;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "()I")
    public final int method104() {
        return field1088.method300((byte) 117, this.field1087);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(La;I)V")
    public class51(class1 arg0, int arg1) {
        field1088 = arg0.method5(0);
        this.field1087 = arg1;
    }
}
