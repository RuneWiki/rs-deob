import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class629 extends class189 {

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "Z")
    public volatile boolean field8719 = true;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public int field8717;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "Lpda;")
    public class629 field8716;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "Lam;")
    public class632 field8718;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()I")
    public abstract int method1382();

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public abstract void method1401(int arg0);

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "()Lpda;")
    public abstract class629 method1400();

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "()I")
    public int method2407() {
        return 255;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([III)V")
    public abstract void method1378(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "()Lpda;")
    public abstract class629 method1361();

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "([III)V")
    public final void method3517(int[] arg0, int arg1, int arg2) {
        if (this.field8719) {
            this.method1378(arg0, arg1, arg2);
        } else {
            this.method1401(arg2);
        }
    }
}
