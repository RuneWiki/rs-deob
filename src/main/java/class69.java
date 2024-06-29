import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class69 extends class117 {

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Z")
    public volatile boolean field999 = true;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lec;")
    public class45 field997;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lvc;")
    public class69 field996;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([III)V", line = 4)
    public final void method557(int[] arg0, int arg1, int arg2) {
        if (this.field999) {
            this.method560(arg0, arg1, arg2);
        } else {
            this.method562(arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()I", line = 17)
    public int method561() {
        return 255;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()Lvc;")
    public abstract class69 method556();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
    public abstract int method558();

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()Lvc;")
    public abstract class69 method559();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "([III)V")
    public abstract void method560(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
    public abstract void method562(int arg0);
}
