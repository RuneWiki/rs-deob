import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class375 extends class35 {

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Z")
    public volatile boolean field5606 = true;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public int field5608;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lmr;")
    public class152 field5605;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Luh;")
    public class375 field5607;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([III)V", line = 5)
    public final void method2312(int[] arg0, int arg1, int arg2) {
        if (this.field5606) {
            this.method48(arg0, arg1, arg2);
        } else {
            this.method58(arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()I", line = 14)
    public int method74() {
        return 255;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "([III)V")
    public abstract void method48(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
    public abstract void method58(int arg0);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()Luh;")
    public abstract class375 method86();

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()Luh;")
    public abstract class375 method85();

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()I")
    public abstract int method49();
}
