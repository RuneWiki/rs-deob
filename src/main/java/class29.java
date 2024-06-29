import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class29 extends class110 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
    public volatile boolean field530 = true;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Lqa;")
    public class145 field531;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Lch;")
    public class29 field533;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([III)V")
    public abstract void method151(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "([III)V")
    public final void method253(int[] arg0, int arg1, int arg2) {
        if (this.field530) {
            this.method151(arg0, arg1, arg2);
        } else {
            this.method136(arg2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()I")
    public abstract int method127();

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()I")
    public int method168() {
        return 255;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "()Lch;")
    public abstract class29 method128();

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "()Lch;")
    public abstract class29 method153();
}
