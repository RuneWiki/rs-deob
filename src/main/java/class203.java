import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class203 extends class190 {

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Z")
    public volatile boolean field3532 = true;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Llc;")
    public class203 field3533;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Ltj;")
    public class41 field3535;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V")
    public final void method1324(int[] arg0, int arg1, int arg2) {
        if (this.field3532) {
            this.method120(arg0, arg1, arg2);
        } else {
            this.method153(arg2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()Llc;")
    public abstract class203 method135();

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()I")
    public int method160() {
        return 255;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()Llc;")
    public abstract class203 method150();

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()I")
    public abstract int method133();

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([III)V")
    public abstract void method120(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public abstract void method153(int arg0);
}
