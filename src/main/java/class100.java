import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class100 extends class132 {

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Z")
    public volatile boolean field1870 = true;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Ljc;")
    public class100 field1869;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lqa;")
    public class169 field1871;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([III)V")
    public final void method621(int[] arg0, int arg1, int arg2) {
        if (this.field1870) {
            this.method567(arg0, arg1, arg2);
        } else {
            this.method570(arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "([III)V")
    public abstract void method567(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()Ljc;")
    public abstract class100 method572();

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()Ljc;")
    public abstract class100 method568();

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()I")
    public abstract int method564();

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public abstract void method570(int arg0);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()I")
    public int method622() {
        return 255;
    }
}
