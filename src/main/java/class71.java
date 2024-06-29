import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZMCAQRHG")
public class class71 {

    @OriginalMember(owner = "client!ZMCAQRHG", name = "a", descriptor = "I")
    private int field1725 = 7;

    @OriginalMember(owner = "client!ZMCAQRHG", name = "b", descriptor = "J")
    public long field1726;

    @OriginalMember(owner = "client!ZMCAQRHG", name = "c", descriptor = "LZMCAQRHG;")
    public class71 field1727;

    @OriginalMember(owner = "client!ZMCAQRHG", name = "d", descriptor = "LZMCAQRHG;")
    public class71 field1728;

    @OriginalMember(owner = "client!ZMCAQRHG", name = "e", descriptor = "Z")
    public static boolean field1729;

    @OriginalMember(owner = "client!ZMCAQRHG", name = "a", descriptor = "()V")
    public void method602() {
        if (this.field1728 != null) {
            this.field1728.field1727 = this.field1727;
            this.field1727.field1728 = this.field1728;
            this.field1727 = null;
            this.field1728 = null;
        }
    }
}
