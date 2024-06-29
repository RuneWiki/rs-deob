import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class80 {

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    private int field2443;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "Ldc;")
    private static class25 field2444;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()V")
    public static void method766() {
        field2444 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method613(Component arg0) throws Exception {
        field2444.method194(68, class134.field3037, class38.field922, arg0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public final void method607() {
        field2444.method192(-29957, this.field2443);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public final void method620(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2444.method193(this.field2443, arg0, 13857);
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
    public final void method622() {
        field2444.method196(this.field2443, super.field1968);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()I")
    public final int method616() {
        return field2444.method195(-263, this.field2443);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V")
    public final void method617() {
        field2444.method191(this.field2443, 5669);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lvb;I)V")
    public class97(class148 arg0, int arg1) {
        field2444 = arg0.method1126(-113);
        this.field2443 = arg1;
    }
}
