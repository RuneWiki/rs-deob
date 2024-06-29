import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class582 extends class665 {

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "Z")
    public volatile boolean field8192 = true;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public int field8191;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "Len;")
    public class288 field8193;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "Lpda;")
    public class582 field8190;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "([III)V", line = 7)
    public final void method3315(int[] arg0, int arg1, int arg2) {
        if (this.field8192) {
            this.method373(arg0, arg1, arg2);
        } else {
            this.method386(arg2);
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "()I", line = 23)
    public int method3160() {
        return 255;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([III)V")
    public abstract void method373(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()Lpda;")
    public abstract class582 method397();

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "()I")
    public abstract int method406();

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "()Lpda;")
    public abstract class582 method403();

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public abstract void method386(int arg0);
}
