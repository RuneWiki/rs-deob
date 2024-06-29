import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class396 extends class149 {

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    private int field5448;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "Luf;")
    private static class322 field5449;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
    public final void method1057() {
        field5449.method2035(this.field5448, -12428);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
    public final int method1063() {
        return field5449.method2036(this.field5448, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1064(Component arg0) throws Exception {
        field5449.method2039(class217.field3139, 91, class192.field2868, arg0);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V")
    public final void method1060() {
        field5449.method2038(this.field5448, true);
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()V")
    public static void method2388() {
        field5449 = null;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
    public final void method1061() {
        field5449.method2037(this.field5448, super.field2040);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lis;I)V")
    public class396(class65 arg0, int arg1) {
        field5449 = arg0.method614(-77);
        this.field5448 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public final void method1068(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5449.method2040(12129, this.field5448, arg0);
        }
    }
}
