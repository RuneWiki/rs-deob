import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class98 extends class176 {

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Lsh;")
    private static class174 field2083;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public final void method24() {
        field2083.method1181(this.field2082, 11988);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final void method19(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2083.method1179(this.field2082, arg0, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method22(Component arg0) throws Exception {
        field2083.method1182(arg0, class188.field3736, class10.field195, 551);
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V")
    public static void method678() {
        field2083 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
    public final void method23() {
        field2083.method1183((byte) -11, this.field2082);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()I")
    public final int method20() {
        return field2083.method1178(-28939, this.field2082);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
    public final void method21() {
        field2083.method1180(this.field2082, super.field3529);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lgg;I)V")
    public class98(class67 arg0, int arg1) {
        field2083 = arg0.method477(1006565680);
        this.field2082 = arg1;
    }
}
