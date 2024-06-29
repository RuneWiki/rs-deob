import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class40 extends class264 {

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lks;")
    public class173 field543;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Z")
    public boolean field544;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public abstract void method347(int arg0, int arg1);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public abstract void method348();

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Z")
    public final boolean method349(int arg0) {
        if (arg0 != 11509) {
            this.field543 = (class173) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public int method350() {
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()Z")
    public abstract boolean method351();

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
    public final int method352(int arg0) {
        int var2 = 51 % ((arg0 + 3) / 42);
        return 1;
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)Z")
    public final boolean method353(int arg0) {
        if (arg0 != 0) {
            this.field543 = (class173) null;
        }
        return this.field544;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILqb;Lqb;)V")
    public abstract void method354(int arg0, class89 arg1, class89 arg2);

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lks;)V")
    public class40(class173 arg0) {
        this.field543 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)V")
    public abstract void method355(int arg0);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()Z")
    public abstract boolean method356();
}
