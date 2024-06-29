import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class95 extends class280 {

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Z")
    public volatile boolean field1410 = true;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Ljf;")
    public class65 field1408;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lcf;")
    public class95 field1409;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lcf;")
    public abstract class95 method249();

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
    public int method706() {
        return 255;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()I")
    public abstract int method253();

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([III)V")
    public abstract void method248(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()Lcf;")
    public abstract class95 method250();

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "([III)V")
    public final void method741(int[] arg0, int arg1, int arg2) {
        if (this.field1410) {
            this.method248(arg0, arg1, arg2);
        } else {
            this.method245(arg2);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public abstract void method245(int arg0);
}
