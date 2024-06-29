import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class592 extends class261 {

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    private int field8754;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "Lap;")
    private static class38 field8753;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "()V")
    public final void method1654() {
        field8753.method195(this.field8754, 25333);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "()I")
    public final int method1651() {
        return field8753.method197(this.field8754, (byte) -17);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1657(Component arg0) throws Exception {
        field8753.method193(class36.field419, arg0, false, class614.field9002);
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
    public final void method1662(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8753.method194(arg0, true, this.field8754);
        }
    }

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "()V")
    public final void method1663() {
        field8753.method198(this.field8754, (byte) -45);
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "()V")
    public final void method1655() {
        field8753.method196(this.field8754, super.field3845);
    }

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "()V")
    public static void method3449() {
        field8753 = null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Luf;I)V")
    public class592(class353 arg0, int arg1) {
        field8753 = arg0.method2168(-93);
        this.field8754 = arg1;
    }
}
