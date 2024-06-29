import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class203 extends class132 {

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
    public volatile boolean field3915 = true;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public int field3916;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lvh;")
    public class203 field3914;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lfc;")
    public class53 field3917;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()I")
    public abstract int method136();

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([III)V")
    public final void method1296(int[] arg0, int arg1, int arg2) {
        if (this.field3915) {
            this.method138(arg0, arg1, arg2);
        } else {
            this.method134(arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public abstract void method134(int arg0);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()Lvh;")
    public abstract class203 method145();

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()Lvh;")
    public abstract class203 method137();

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "()I")
    public int method987() {
        return 255;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "([III)V")
    public abstract void method138(int[] arg0, int arg1, int arg2);
}
