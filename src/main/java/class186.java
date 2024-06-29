import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class186 extends class213 {

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Z")
    public volatile boolean field3614 = true;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Lsg;")
    public class186 field3616;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Lti;")
    public class198 field3613;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
    public int method1240() {
        return 255;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()I")
    public abstract int method485();

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([III)V")
    public abstract void method474(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()Lsg;")
    public abstract class186 method476();

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()Lsg;")
    public abstract class186 method492();

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "([III)V")
    public final void method1241(int[] arg0, int arg1, int arg2) {
        if (this.field3614) {
            this.method474(arg0, arg1, arg2);
        } else {
            this.method468(arg2);
        }
    }
}
