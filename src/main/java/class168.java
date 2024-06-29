import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class168 extends class45 {

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Lnf;")
    public class256 field2268;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Z")
    public boolean field2267;

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lnf;)V", line = 5)
    public class168(class256 arg0) {
        this.field2268 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Z", line = 14)
    public final boolean method1033(byte arg0) {
        if (arg0 <= 42) {
            this.method1037();
        }
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)Z", line = 24)
    public final boolean method1034(boolean arg0) {
        return arg0 ? this.field2267 : true;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()I", line = 35)
    public int method1036() {
        return 0;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)I", line = 45)
    public final int method1040(int arg0) {
        return arg0 == 30639 ? 1 : -28;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()Z")
    public abstract boolean method1035();

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "()V")
    public abstract void method1037();

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public abstract void method1038(int arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    public abstract void method1039(int arg0, int arg1);

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "()Z")
    public abstract boolean method1041();

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILir;Lir;)V")
    public abstract void method1042(int arg0, class216 arg1, class216 arg2);
}
