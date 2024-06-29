import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class62 extends class199 {

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Lcf;")
    private static class122 field1092;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 3)
    public final void method242(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field1092.method923(arg0, false, this.field1093);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V", line = 10)
    public final void method238() {
        field1092.method927(this.field1093, this.field3359);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lcl;I)V", line = 13)
    public class62(class124 arg0, int arg1) {
        field1092 = arg0.method940((byte) 96);
        this.field1093 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 18)
    public final void method239(Component arg0) throws Exception {
        field1092.method928(class99.field1644, class26.field348, arg0, -5076);
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "()V", line = 21)
    public static void method543() {
        field1092 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V", line = 24)
    public final void method240() {
        field1092.method925(-100, this.field1093);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()I", line = 27)
    public final int method241() {
        return field1092.method924(this.field1093, (byte) 53);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()V", line = 30)
    public final void method243() {
        field1092.method926(this.field1093, -5269);
    }
}
