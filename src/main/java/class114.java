import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class114 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lut;)V")
    public class114(class114 arg0) {
        this.field1424 = arg0.field1424;
        this.field1426 = arg0.field1426;
        this.field1425 = arg0.field1425;
    }
}
