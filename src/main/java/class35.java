import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NQPZRHXK")
public class class35 {

    @OriginalMember(owner = "client!NQPZRHXK", name = "a", descriptor = "Z")
    private boolean field1043 = false;

    @OriginalMember(owner = "client!NQPZRHXK", name = "b", descriptor = "J")
    public long field1044;

    @OriginalMember(owner = "client!NQPZRHXK", name = "c", descriptor = "LNQPZRHXK;")
    public class35 field1045;

    @OriginalMember(owner = "client!NQPZRHXK", name = "d", descriptor = "LNQPZRHXK;")
    public class35 field1046;

    @OriginalMember(owner = "client!NQPZRHXK", name = "e", descriptor = "Z")
    public static boolean field1047;

    @OriginalMember(owner = "client!NQPZRHXK", name = "a", descriptor = "()V")
    public void method326() {
        if (this.field1046 != null) {
            this.field1046.field1045 = this.field1045;
            this.field1045.field1046 = this.field1046;
            this.field1045 = null;
            this.field1046 = null;
        }
    }
}
