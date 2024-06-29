import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MOVYLKVL")
public class class41 extends class13 {

    @OriginalMember(owner = "client!MOVYLKVL", name = "g", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!MOVYLKVL", name = "e", descriptor = "LMOVYLKVL;")
    public class41 field1236;

    @OriginalMember(owner = "client!MOVYLKVL", name = "f", descriptor = "LMOVYLKVL;")
    public class41 field1237;

    @OriginalMember(owner = "client!MOVYLKVL", name = "b", descriptor = "()V")
    public void method379() {
        if (this.field1237 != null) {
            this.field1237.field1236 = this.field1236;
            this.field1236.field1237 = this.field1237;
            this.field1236 = null;
            this.field1237 = null;
        }
    }
}
