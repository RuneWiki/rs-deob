import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class80 extends class32 {

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
    public volatile boolean field1959 = true;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lcd;")
    public class19 field1960;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lld;")
    public class80 field1958;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()I")
    public abstract int method325();

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
    public final void method615(int[] arg0, int arg1, int arg2) {
        if (this.field1959) {
            this.method326(arg0, arg1, arg2);
        } else {
            this.method323(arg2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    public abstract void method323(int arg0);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()Lld;")
    public abstract class80 method329();

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "()I")
    public int method616() {
        return 255;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "()Lld;")
    public abstract class80 method324();

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "([III)V")
    public abstract void method326(int[] arg0, int arg1, int arg2);
}
