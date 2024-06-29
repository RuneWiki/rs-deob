import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class23 extends class166 {

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Z")
    public volatile boolean field324 = true;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lwd;")
    public class23 field323;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lva;")
    public class35 field322;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
    public abstract int method22();

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([III)V")
    public abstract void method26(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([III)V")
    public final void method201(int[] arg0, int arg1, int arg2) {
        if (this.field324) {
            this.method26(arg0, arg1, arg2);
        } else {
            this.method32(arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
    public abstract void method32(int arg0);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()Lwd;")
    public abstract class23 method33();

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()Lwd;")
    public abstract class23 method45();

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()I")
    public int method153() {
        return 255;
    }
}
