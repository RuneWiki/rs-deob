import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class234 extends class238 {

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lmi;")
    public class315 field3532;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Z")
    public boolean field3531;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)Z")
    public final boolean method1495(byte arg0) {
        int var2 = 47 % ((arg0 - 37) / 58);
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
    public abstract void method1069();

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public abstract void method1075(int arg0);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)Z")
    public final boolean method1496(int arg0) {
        if (arg0 != 1) {
            this.field3531 = false;
        }
        return this.field3531;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()Z")
    public abstract boolean method1072();

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)I")
    public final int method1497(int arg0) {
        if (arg0 != 0) {
            this.method1073();
        }
        return 1;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()Z")
    public abstract boolean method1073();

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILkh;Lkh;)V")
    public abstract void method1074(int arg0, class13 arg1, class13 arg2);

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "()I")
    public int method1070() {
        return 0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
    public abstract void method1071(int arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lmi;)V")
    public class234(class315 arg0) {
        this.field3532 = arg0;
    }
}
