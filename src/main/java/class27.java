import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KMUPFLXI")
public class class27 {

    @OriginalMember(owner = "client!KMUPFLXI", name = "a", descriptor = "J")
    public long field951;

    @OriginalMember(owner = "client!KMUPFLXI", name = "b", descriptor = "LKMUPFLXI;")
    public class27 field952;

    @OriginalMember(owner = "client!KMUPFLXI", name = "c", descriptor = "LKMUPFLXI;")
    public class27 field953;

    @OriginalMember(owner = "client!KMUPFLXI", name = "d", descriptor = "Z")
    public static boolean field954;

    @OriginalMember(owner = "client!KMUPFLXI", name = "a", descriptor = "()V")
    public void method272() {
        if (this.field953 != null) {
            this.field953.field952 = this.field952;
            this.field952.field953 = this.field953;
            this.field952 = null;
            this.field953 = null;
        }
    }
}
