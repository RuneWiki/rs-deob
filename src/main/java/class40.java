import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public abstract class class40 extends class180 {

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Lqi;")
    public class458 field676;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Z")
    public boolean field677;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "()I", line = 8)
    public int method326() {
        return 0;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)Z", line = 18)
    public final boolean method329(int arg0) {
        int var2 = -32 / ((arg0 + 47) / 33);
        return false;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)I", line = 27)
    public final int method330(boolean arg0) {
        if (!arg0) {
            this.field677 = true;
        }
        return 1;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(Z)Z", line = 39)
    public final boolean method332(boolean arg0) {
        if (!arg0) {
            this.method330(true);
        }
        return this.field677;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lqi;)V", line = 47)
    public class40(class458 arg0) {
        this.field676 = arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()Z")
    public abstract boolean method323();

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILai;Lai;)V")
    public abstract void method324(int arg0, class201 arg1, class201 arg2);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "()Z")
    public abstract boolean method325();

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
    public abstract void method327(int arg0, int arg1);

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "()V")
    public abstract void method328();

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
    public abstract void method331(int arg0);
}
