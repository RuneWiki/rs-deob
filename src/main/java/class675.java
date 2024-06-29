import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class675 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lkv;")
    public class280 field9618;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public abstract void method1353(byte arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZ)V")
    public abstract void method1350(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lfia;IZ)V")
    public abstract void method1348(class599 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)Z")
    public abstract boolean method1347(byte arg0);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)V")
    public abstract void method1354(boolean arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
    public abstract void method1351(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lkv;)V")
    public class675(class280 arg0) {
        this.field9618 = arg0;
    }
}
