import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class class82 extends class130 {

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "Z")
    public volatile boolean field1334 = true;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "Lbv;")
    public class475 field1336;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lms;")
    public class82 field1335;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([III)V", line = 14)
    public final void method723(int[] arg0, int arg1, int arg2) {
        if (this.field1334) {
            this.method725(arg0, arg1, arg2);
        } else {
            this.method721(arg2);
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "()I", line = 21)
    public int method724() {
        return 255;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()Lms;")
    public abstract class82 method719();

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "()Lms;")
    public abstract class82 method720();

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public abstract void method721(int arg0);

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "()I")
    public abstract int method722();

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "([III)V")
    public abstract void method725(int[] arg0, int arg1, int arg2);
}
