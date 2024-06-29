import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class78 extends class338 {

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Lql;")
    public class346 field879;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
    public boolean field878;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Z", line = 6)
    public final boolean method434(boolean arg0) {
        if (arg0) {
            this.field878 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)I", line = 16)
    public final int method435(int arg0) {
        return arg0 == 1 ? 1 : -87;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Z", line = 26)
    public final boolean method436(byte arg0) {
        if (arg0 <= 35) {
            this.method50(-32);
        }
        return this.field878;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lql;)V", line = 40)
    public class78(class346 arg0) {
        this.field879 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()I", line = 50)
    public int method48() {
        return 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjo;Ljo;)V")
    public abstract void method47(int arg0, class218 arg1, class218 arg2);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
    public abstract void method53(int arg0, int arg1);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()Z")
    public abstract boolean method49();

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()Z")
    public abstract boolean method51();

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()V")
    public abstract void method54();

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    public abstract void method50(int arg0);
}
