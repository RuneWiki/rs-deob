import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class170 extends class430 {

    @OriginalMember(owner = "client!os", name = "i", descriptor = "Z")
    public volatile boolean field2399 = true;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Los;")
    public class170 field2397;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Lwn;")
    public class581 field2398;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "([III)V", line = 6)
    public final void method1214(int[] arg0, int arg1, int arg2) {
        if (this.field2399) {
            this.method1088(arg0, arg1, arg2);
        } else {
            this.method1083(arg2);
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "()I", line = 15)
    public int method1043() {
        return 255;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([III)V")
    public abstract void method1088(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public abstract void method1083(int arg0);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "()Los;")
    public abstract class170 method1086();

    @OriginalMember(owner = "client!os", name = "c", descriptor = "()Los;")
    public abstract class170 method1065();

    @OriginalMember(owner = "client!os", name = "e", descriptor = "()I")
    public abstract int method1054();
}
