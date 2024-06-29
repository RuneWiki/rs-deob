import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class88 extends class82 {

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
    public volatile boolean field1399 = true;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Lcd;")
    public class28 field1398;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lai;")
    public class88 field1397;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()Lai;")
    public abstract class88 method270();

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()Lai;")
    public abstract class88 method257();

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([III)V")
    public final void method571(int[] arg0, int arg1, int arg2) {
        if (this.field1399) {
            this.method265(arg0, arg1, arg2);
        } else {
            this.method249(arg2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()I")
    public abstract int method273();

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
    public abstract void method249(int arg0);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "([III)V")
    public abstract void method265(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "()I")
    public int method572() {
        return 255;
    }
}
