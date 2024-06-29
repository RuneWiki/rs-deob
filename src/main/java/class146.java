import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class146 {

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public int field1940;

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
    public class146() {
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lut;)V")
    public class146(class146 arg0) {
        this.field1942 = arg0.field1942;
        this.field1941 = arg0.field1941;
        this.field1939 = arg0.field1939;
        this.field1940 = arg0.field1940;
    }
}
