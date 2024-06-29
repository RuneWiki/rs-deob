import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class class214 extends class431 {

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "Z")
    public volatile boolean field3487 = true;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lfp;")
    public class214 field3485;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "Ljc;")
    public class306 field3486;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "()I", line = 3)
    public int method1482() {
        return 255;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "([III)V", line = 8)
    public final void method1483(int[] arg0, int arg1, int arg2) {
        if (this.field3487) {
            this.method387(arg0, arg1, arg2);
        } else {
            this.method389(arg2);
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "()I")
    public abstract int method391();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([III)V")
    public abstract void method387(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "()Lfp;")
    public abstract class214 method386();

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public abstract void method389(int arg0);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "()Lfp;")
    public abstract class214 method394();
}
