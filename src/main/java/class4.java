import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class4 extends class125 {

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Z")
    public volatile boolean field61 = true;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lfa;")
    public class37 field60;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lac;")
    public class4 field58;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lac;")
    public abstract class4 method15();

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
    public int method16() {
        return 255;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
    public abstract void method17(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()Lac;")
    public abstract class4 method18();

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V")
    public final void method19(int[] arg0, int arg1, int arg2) {
        if (this.field61) {
            this.method17(arg0, arg1, arg2);
        } else {
            this.method21(arg2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()I")
    public abstract int method20();

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public abstract void method21(int arg0);
}
