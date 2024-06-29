import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OJTWJXEY")
public class class34 {

    @OriginalMember(owner = "client!OJTWJXEY", name = "a", descriptor = "Z")
    private boolean field1023 = true;

    @OriginalMember(owner = "client!OJTWJXEY", name = "b", descriptor = "J")
    public long field1024;

    @OriginalMember(owner = "client!OJTWJXEY", name = "c", descriptor = "LOJTWJXEY;")
    public class34 field1025;

    @OriginalMember(owner = "client!OJTWJXEY", name = "d", descriptor = "LOJTWJXEY;")
    public class34 field1026;

    @OriginalMember(owner = "client!OJTWJXEY", name = "e", descriptor = "Z")
    public static boolean field1027;

    @OriginalMember(owner = "client!OJTWJXEY", name = "a", descriptor = "()V")
    public void method338() {
        if (this.field1026 != null) {
            this.field1026.field1025 = this.field1025;
            this.field1025.field1026 = this.field1026;
            this.field1025 = null;
            this.field1026 = null;
        }
    }
}
