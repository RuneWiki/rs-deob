import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class295 extends class147 {

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lic;")
    public class246 field4367;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Z")
    public boolean field4368;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I", line = 6)
    public final int method1849(int arg0) {
        return arg0 < 121 ? -44 : 1;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Z", line = 17)
    public final boolean method1850(boolean arg0) {
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()I", line = 29)
    public int method1852() {
        return 0;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)Z", line = 38)
    public final boolean method1854(byte arg0) {
        int var2 = -91 / ((arg0 + 40) / 49);
        return this.field4368;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lic;)V", line = 45)
    public class295(class246 arg0) {
        this.field4367 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public abstract void method1847();

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()Z")
    public abstract boolean method1848();

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public abstract void method1851(int arg0);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()Z")
    public abstract boolean method1853();

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILtr;Ltr;)V")
    public abstract void method1855(int arg0, class151 arg1, class151 arg2);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public abstract void method1856(int arg0, int arg1);
}
