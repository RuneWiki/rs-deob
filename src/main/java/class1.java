import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AIZKCREI")
public class class1 {

    @OriginalMember(owner = "AIZKCREI", name = "a", descriptor = "J")
    public long field1;

    @OriginalMember(owner = "AIZKCREI", name = "b", descriptor = "LAIZKCREI;")
    public class1 field2;

    @OriginalMember(owner = "AIZKCREI", name = "c", descriptor = "LAIZKCREI;")
    public class1 field3;

    @OriginalMember(owner = "AIZKCREI", name = "d", descriptor = "Z")
    public static boolean field4;

    @OriginalMember(owner = "AIZKCREI", name = "a", descriptor = "()V")
    public void method1() {
        if (this.field3 != null) {
            this.field3.field2 = this.field2;
            this.field2.field3 = this.field3;
            this.field2 = null;
            this.field3 = null;
        }
    }
}
