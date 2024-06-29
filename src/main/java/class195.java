import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class195 extends class66 {

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "Z")
    public volatile boolean field3224 = true;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Leq;")
    public class195 field3226;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "Lfh;")
    public class604 field3225;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([III)V", line = 7)
    public final void method1539(int[] arg0, int arg1, int arg2) {
        if (this.field3224) {
            this.method240(arg0, arg1, arg2);
        } else {
            this.method235(arg2);
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()I", line = 18)
    public int method1366() {
        return 255;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()Leq;")
    public abstract class195 method220();

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()I")
    public abstract int method215();

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public abstract void method235(int arg0);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "()Leq;")
    public abstract class195 method219();

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "([III)V")
    public abstract void method240(int[] arg0, int arg1, int arg2);
}
