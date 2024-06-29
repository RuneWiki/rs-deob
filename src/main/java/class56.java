import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TVKHSKYG")
public class class56 {

    @OriginalMember(owner = "client!TVKHSKYG", name = "a", descriptor = "Z")
    private boolean field1531 = false;

    @OriginalMember(owner = "client!TVKHSKYG", name = "b", descriptor = "J")
    public long field1532;

    @OriginalMember(owner = "client!TVKHSKYG", name = "c", descriptor = "LTVKHSKYG;")
    public class56 field1533;

    @OriginalMember(owner = "client!TVKHSKYG", name = "d", descriptor = "LTVKHSKYG;")
    public class56 field1534;

    @OriginalMember(owner = "client!TVKHSKYG", name = "e", descriptor = "Z")
    public static boolean field1535;

    @OriginalMember(owner = "client!TVKHSKYG", name = "a", descriptor = "()V")
    public void method518() {
        if (this.field1534 != null) {
            this.field1534.field1533 = this.field1533;
            this.field1533.field1534 = this.field1534;
            this.field1533 = null;
            this.field1534 = null;
        }
    }
}
