import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class113 extends class32 {

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Z")
    public volatile boolean field1990 = true;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lui;")
    public class113 field1991;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lwc;")
    public class212 field1989;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([III)V")
    public final void method820(int[] arg0, int arg1, int arg2) {
        if (this.field1990) {
            this.method72(arg0, arg1, arg2);
        } else {
            this.method81(arg2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()Lui;")
    public abstract class113 method75();

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public abstract void method81(int arg0);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "([III)V")
    public abstract void method72(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()Lui;")
    public abstract class113 method82();

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "()I")
    public int method213() {
        return 255;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "()I")
    public abstract int method71();
}
