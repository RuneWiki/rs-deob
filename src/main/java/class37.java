import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MUOTSYDS")
public class class37 extends class66 {

    @OriginalMember(owner = "client!MUOTSYDS", name = "g", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!MUOTSYDS", name = "e", descriptor = "LMUOTSYDS;")
    public class37 field1139;

    @OriginalMember(owner = "client!MUOTSYDS", name = "f", descriptor = "LMUOTSYDS;")
    public class37 field1140;

    @OriginalMember(owner = "client!MUOTSYDS", name = "b", descriptor = "()V")
    public void method344() {
        if (this.field1140 != null) {
            this.field1140.field1139 = this.field1139;
            this.field1139.field1140 = this.field1140;
            this.field1139 = null;
            this.field1140 = null;
        }
    }
}
