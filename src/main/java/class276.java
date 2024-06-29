import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class class276 extends class539 {

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "Z")
    public volatile boolean field3877 = true;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "Lao;")
    public class259 field3875;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "Lvw;")
    public class276 field3874;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "([III)V", line = 8)
    public final void method1675(int[] arg0, int arg1, int arg2) {
        if (this.field3877) {
            this.method1672(arg0, arg1, arg2);
        } else {
            this.method1678(arg2);
        }
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "()I", line = 17)
    public int method1677() {
        return 255;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "([III)V")
    public abstract void method1672(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "()Lvw;")
    public abstract class276 method1673();

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "()I")
    public abstract int method1674();

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "()Lvw;")
    public abstract class276 method1676();

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public abstract void method1678(int arg0);
}
