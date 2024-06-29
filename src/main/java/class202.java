import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public abstract class class202 extends class766 {

    @OriginalMember(owner = "client!fja", name = "o", descriptor = "Z")
    public volatile boolean field2995 = true;

    @OriginalMember(owner = "client!fja", name = "q", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!fja", name = "n", descriptor = "Lfja;")
    public class202 field2994;

    @OriginalMember(owner = "client!fja", name = "p", descriptor = "Lqia;")
    public class574 field2996;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "([III)V", line = 4)
    public final void method1417(int[] arg0, int arg1, int arg2) {
        if (this.field2995) {
            this.method1422(arg0, arg1, arg2);
        } else {
            this.method1421(arg2);
        }
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "()I", line = 13)
    public int method1419() {
        return 255;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "()I")
    public abstract int method1418();

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "()Lfja;")
    public abstract class202 method1420();

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)V")
    public abstract void method1421(int arg0);

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "([III)V")
    public abstract void method1422(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "()Lfja;")
    public abstract class202 method1423();
}
