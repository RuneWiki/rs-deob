import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class38 extends class307 {

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Z")
    public volatile boolean field702 = true;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lvc;")
    public class183 field701;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lcg;")
    public class38 field703;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)V", line = 3)
    public final void method315(int[] arg0, int arg1, int arg2) {
        if (this.field702) {
            this.method319(arg0, arg1, arg2);
        } else {
            this.method316(arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()I", line = 13)
    public int method318() {
        return 255;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    public abstract void method316(int arg0);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()Lcg;")
    public abstract class38 method317();

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([III)V")
    public abstract void method319(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()Lcg;")
    public abstract class38 method320();

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()I")
    public abstract int method321();
}
