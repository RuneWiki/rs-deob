import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class117 extends class238 {

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Z")
    public volatile boolean field1485 = true;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lme;")
    public class117 field1484;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lwc;")
    public class46 field1486;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
    public abstract int method73();

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()Lme;")
    public abstract class117 method48();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([III)V")
    public final void method732(int[] arg0, int arg1, int arg2) {
        if (this.field1485) {
            this.method52(arg0, arg1, arg2);
        } else {
            this.method67(arg2);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()Lme;")
    public abstract class117 method72();

    @OriginalMember(owner = "client!me", name = "b", descriptor = "([III)V")
    public abstract void method52(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()I")
    public int method53() {
        return 255;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public abstract void method67(int arg0);
}
