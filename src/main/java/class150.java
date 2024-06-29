import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class150 extends class41 {

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Z")
    public volatile boolean field3716 = true;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Lra;")
    public class118 field3715;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lwc;")
    public class150 field3714;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()I")
    public int method722() {
        return 255;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()Lwc;")
    public abstract class150 method720();

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()Lwc;")
    public abstract class150 method732();

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([III)V")
    public abstract void method709(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()I")
    public abstract int method721();

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "([III)V")
    public final void method1217(int[] arg0, int arg1, int arg2) {
        if (this.field3716) {
            this.method709(arg0, arg1, arg2);
        } else {
            this.method748(arg2);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public abstract void method748(int arg0);
}
