import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class105 extends class64 {

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Z")
    public volatile boolean field1825 = true;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljj;")
    public class105 field1827;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lkd;")
    public class204 field1826;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()Ljj;")
    public abstract class105 method556();

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public abstract void method561(int arg0);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()Ljj;")
    public abstract class105 method573();

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V")
    public final void method740(int[] arg0, int arg1, int arg2) {
        if (this.field1825) {
            this.method569(arg0, arg1, arg2);
        } else {
            this.method561(arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
    public int method741() {
        return 255;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "([III)V")
    public abstract void method569(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()I")
    public abstract int method565();
}
