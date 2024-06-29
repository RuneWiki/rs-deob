import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class292 extends class192 {

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Lkl;")
    private static class414 field3950;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method1186() {
        return field3950.method2554(97, this.field3949);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1187(Component arg0) throws Exception {
        field3950.method2558(class231.field3248, arg0, class105.field1478, (byte) -69);
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
    public final void method1188() {
        field3950.method2556(this.field3949, -97);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V")
    public final void method1191() {
        field3950.method2557(this.field3949, -12511);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()V")
    public final void method1190() {
        field3950.method2555(this.field3949, super.field2778);
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public final void method1189(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3950.method2559(true, arg0, this.field3949);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lne;I)V")
    public class292(class76 arg0, int arg1) {
        field3950 = arg0.method601(33);
        this.field3949 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
    public static void method1785() {
        field3950 = null;
    }
}
