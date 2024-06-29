import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class65 extends class332 {

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
    public volatile boolean field843 = true;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lfb;")
    public class65 field845;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lgn;")
    public class6 field844;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()I", line = 5)
    public int method406() {
        return 255;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([III)V", line = 9)
    public final void method407(int[] arg0, int arg1, int arg2) {
        if (this.field843) {
            this.method34(arg0, arg1, arg2);
        } else {
            this.method35(arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()Lfb;")
    public abstract class65 method33();

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public abstract void method35(int arg0);

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()I")
    public abstract int method37();

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()Lfb;")
    public abstract class65 method30();

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([III)V")
    public abstract void method34(int[] arg0, int arg1, int arg2);
}
