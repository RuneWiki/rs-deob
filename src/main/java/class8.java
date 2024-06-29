import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class8 extends class210 {

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
    public volatile boolean field321 = true;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lie;")
    public class85 field320;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lag;")
    public class8 field318;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()Lag;")
    public abstract class8 method51();

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([III)V")
    public abstract void method52(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()I")
    public int method53() {
        return 255;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()I")
    public abstract int method54();

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "([III)V")
    public final void method55(int[] arg0, int arg1, int arg2) {
        if (this.field321) {
            this.method52(arg0, arg1, arg2);
        } else {
            this.method56(arg2);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public abstract void method56(int arg0);

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()Lag;")
    public abstract class8 method57();
}
