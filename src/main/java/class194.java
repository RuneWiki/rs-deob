import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class194 extends class97 {

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Lcg;")
    public class393 field2932;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "Z")
    public boolean field2933;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
    public abstract void method1089(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
    public abstract void method1083();

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Z")
    public final boolean method1161(byte arg0) {
        int var2 = -20 / ((6 - arg0) / 39);
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()I")
    public int method1085() {
        return 0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILpq;Lpq;)V")
    public abstract void method1086(int arg0, class46 arg1, class46 arg2);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()Z")
    public abstract boolean method1084();

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
    public abstract void method1087(int arg0, int arg1);

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()Z")
    public abstract boolean method1088();

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Z")
    public final boolean method1162(boolean arg0) {
        return arg0 ? false : this.field2933;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lcg;)V")
    public class194(class393 arg0) {
        this.field2932 = arg0;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)I")
    public final int method1163(byte arg0) {
        int var2 = 23 / ((-arg0 - 55) / 45);
        return 1;
    }
}
