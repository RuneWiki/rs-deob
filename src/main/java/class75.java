import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class75 extends class73 {

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
    public volatile boolean field2079 = true;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "Lkf;")
    public class75 field2078;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "Llb;")
    public class78 field2077;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()Lkf;")
    public abstract class75 method402();

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([III)V")
    public final void method707(int[] arg0, int arg1, int arg2) {
        if (this.field2079) {
            this.method404(arg0, arg1, arg2);
        } else {
            this.method418(arg2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "([III)V")
    public abstract void method404(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
    public int method397() {
        return 255;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public abstract void method418(int arg0);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()Lkf;")
    public abstract class75 method436();

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()I")
    public abstract int method394();
}
