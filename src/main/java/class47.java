import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OZVKRYKO")
public class class47 {

    @OriginalMember(owner = "OZVKRYKO", name = "a", descriptor = "I")
    private int field1214 = 9;

    @OriginalMember(owner = "OZVKRYKO", name = "b", descriptor = "J")
    public long field1215;

    @OriginalMember(owner = "OZVKRYKO", name = "c", descriptor = "LOZVKRYKO;")
    public class47 field1216;

    @OriginalMember(owner = "OZVKRYKO", name = "d", descriptor = "LOZVKRYKO;")
    public class47 field1217;

    @OriginalMember(owner = "OZVKRYKO", name = "e", descriptor = "Z")
    public static boolean field1218;

    @OriginalMember(owner = "OZVKRYKO", name = "a", descriptor = "()V")
    public void method396() {
        if (this.field1217 != null) {
            this.field1217.field1216 = this.field1216;
            this.field1216.field1217 = this.field1217;
            this.field1216 = null;
            this.field1217 = null;
        }
    }
}
