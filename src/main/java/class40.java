import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OBKNBIRU")
public class class40 extends class27 {

    @OriginalMember(owner = "OBKNBIRU", name = "e", descriptor = "Z")
    private boolean field1072 = false;

    @OriginalMember(owner = "OBKNBIRU", name = "h", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "OBKNBIRU", name = "f", descriptor = "LOBKNBIRU;")
    public class40 field1073;

    @OriginalMember(owner = "OBKNBIRU", name = "g", descriptor = "LOBKNBIRU;")
    public class40 field1074;

    @OriginalMember(owner = "OBKNBIRU", name = "b", descriptor = "()V")
    public void method312() {
        if (this.field1074 != null) {
            this.field1074.field1073 = this.field1073;
            this.field1073.field1074 = this.field1074;
            this.field1073 = null;
            this.field1074 = null;
        }
    }
}
