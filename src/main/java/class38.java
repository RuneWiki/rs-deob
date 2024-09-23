import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MXUYAYVV")
public class class38 {

    @OriginalMember(owner = "MXUYAYVV", name = "a", descriptor = "J")
    public long field1225;

    @OriginalMember(owner = "MXUYAYVV", name = "b", descriptor = "LMXUYAYVV;")
    public class38 field1226;

    @OriginalMember(owner = "MXUYAYVV", name = "c", descriptor = "LMXUYAYVV;")
    public class38 field1227;

    @OriginalMember(owner = "MXUYAYVV", name = "d", descriptor = "Z")
    public static boolean field1228;

    @OriginalMember(owner = "MXUYAYVV", name = "a", descriptor = "()V")
    public void method430() {
        if (this.field1227 != null) {
            this.field1227.field1226 = this.field1226;
            this.field1226.field1227 = this.field1227;
            this.field1226 = null;
            this.field1227 = null;
        }
    }
}
