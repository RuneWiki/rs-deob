import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class59 extends class311 {

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lmm;")
    public class357 field762;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Z")
    public boolean field761;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I", line = 5)
    public final int method462(int arg0) {
        if (arg0 != 4909) {
            this.method471();
        }
        return 1;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z", line = 18)
    public final boolean method465(int arg0) {
        if (arg0 != 21912) {
            this.method469(40, (class257) null, (class257) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z", line = 32)
    public final boolean method470(byte arg0) {
        if (arg0 > -56) {
            this.field762 = (class357) null;
        }
        return this.field761;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()I", line = 42)
    public int method471() {
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lmm;)V", line = 48)
    public class59(class357 arg0) {
        this.field762 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public abstract void method463(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()Z")
    public abstract boolean method464();

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()Z")
    public abstract boolean method466();

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
    public abstract void method467();

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
    public abstract void method468(int arg0, int arg1);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILhn;Lhn;)V")
    public abstract void method469(int arg0, class257 arg1, class257 arg2);
}
