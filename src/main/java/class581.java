import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class class581 extends class656 {

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "Z")
    public volatile boolean field7627 = true;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public int field7624;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Lni;")
    public class523 field7626;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Lgu;")
    public class581 field7625;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "()I", line = 10)
    public int method2925() {
        return 255;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "([III)V", line = 13)
    public final void method3182(int[] arg0, int arg1, int arg2) {
        if (this.field7627) {
            this.method26(arg0, arg1, arg2);
        } else {
            this.method60(arg2);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()Lgu;")
    public abstract class581 method53();

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "([III)V")
    public abstract void method26(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "()Lgu;")
    public abstract class581 method33();

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public abstract void method60(int arg0);

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "()I")
    public abstract int method49();
}
