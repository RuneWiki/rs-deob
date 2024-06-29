import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class309 extends class390 {

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Ltb;")
    public class227 field4247;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Z")
    public boolean field4246;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)I")
    public final int method1987(byte arg0) {
        if (arg0 != -36) {
            this.field4246 = true;
        }
        return 1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public abstract void method1988(int arg0, int arg1);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()I")
    public int method1989() {
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()Z")
    public abstract boolean method1990();

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "()V")
    public abstract void method1991();

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public abstract void method1992(int arg0);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Z")
    public final boolean method1993(int arg0) {
        if (arg0 != 0) {
            this.field4246 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "()Z")
    public abstract boolean method1994();

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ltb;)V")
    public class309(class227 arg0) {
        this.field4247 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILim;Lim;)V")
    public abstract void method1995(int arg0, class342 arg1, class342 arg2);

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Z")
    public final boolean method1996(int arg0) {
        return arg0 == 1 ? this.field4246 : false;
    }
}
