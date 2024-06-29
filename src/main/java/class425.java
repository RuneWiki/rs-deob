import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class425 extends class311 {

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Z")
    public volatile boolean field5916 = true;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lua;")
    public class173 field5917;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lrb;")
    public class425 field5915;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I", line = 6)
    public int method1082() {
        return 255;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([III)V", line = 9)
    public final void method2625(int[] arg0, int arg1, int arg2) {
        if (this.field5916) {
            this.method106(arg0, arg1, arg2);
        } else {
            this.method97(arg2);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([III)V")
    public abstract void method106(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lrb;")
    public abstract class425 method100();

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()Lrb;")
    public abstract class425 method105();

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()I")
    public abstract int method103();

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public abstract void method97(int arg0);
}
