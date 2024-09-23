import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OGKECTLC")
public class class45 {

    @OriginalMember(owner = "OGKECTLC", name = "a", descriptor = "Z")
    private boolean field1260 = true;

    @OriginalMember(owner = "OGKECTLC", name = "b", descriptor = "Z")
    private boolean field1261 = true;

    @OriginalMember(owner = "OGKECTLC", name = "c", descriptor = "J")
    public long field1262;

    @OriginalMember(owner = "OGKECTLC", name = "d", descriptor = "LOGKECTLC;")
    public class45 field1263;

    @OriginalMember(owner = "OGKECTLC", name = "e", descriptor = "LOGKECTLC;")
    public class45 field1264;

    @OriginalMember(owner = "OGKECTLC", name = "f", descriptor = "Z")
    public static boolean field1265;

    @OriginalMember(owner = "OGKECTLC", name = "a", descriptor = "()V")
    public void method450() {
        if (this.field1264 != null) {
            this.field1264.field1263 = this.field1263;
            this.field1263.field1264 = this.field1264;
            this.field1263 = null;
            this.field1264 = null;
        }
    }
}
