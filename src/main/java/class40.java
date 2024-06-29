import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ORGNKIAP")
public class class40 extends class37 {

    @OriginalMember(owner = "client!ORGNKIAP", name = "f", descriptor = "Z")
    private boolean field1114 = false;

    @OriginalMember(owner = "client!ORGNKIAP", name = "i", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ORGNKIAP", name = "g", descriptor = "LORGNKIAP;")
    public class40 field1115;

    @OriginalMember(owner = "client!ORGNKIAP", name = "h", descriptor = "LORGNKIAP;")
    public class40 field1116;

    @OriginalMember(owner = "client!ORGNKIAP", name = "b", descriptor = "()V")
    public void method400() {
        if (this.field1116 != null) {
            this.field1116.field1115 = this.field1115;
            this.field1115.field1116 = this.field1116;
            this.field1115 = null;
            this.field1116 = null;
        }
    }
}
