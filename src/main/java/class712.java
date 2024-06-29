import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class712 extends class107 {

    @OriginalMember(owner = "client!paa", name = "J", descriptor = "I")
    private int field10019;

    @OriginalMember(owner = "client!paa", name = "I", descriptor = "Lpr;")
    private static class179 field10018;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "()V")
    public final void method866() {
        field10018.method1388(this.field10019, false);
    }

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "()I")
    public final int method870() {
        return field10018.method1392((byte) 124, this.field10019);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "()V")
    public final void method865() {
        field10018.method1387(31, this.field10019);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method867(Component arg0) throws Exception {
        field10018.method1389((byte) -120, arg0, class53.field849, class608.field8585);
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lfc;I)V")
    public class712(class731 arg0, int arg1) {
        field10018 = (class179) arg0.method4069(true);
        this.field10019 = arg1;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "()V")
    public final void method861() {
        field10018.method1390(this.field10019, super.field1567);
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V")
    public final void method876(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field10018.method1391(arg0, false, this.field10019);
        }
    }

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "()V")
    public static void method3942() {
        field10018 = null;
    }
}
