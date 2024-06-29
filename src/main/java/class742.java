import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class742 extends class661 {

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public int field10312 = (int) (class479.method2864((byte) -123) / 1000L);

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "Ljava/lang/String;")
    public String field10314;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "S")
    public short field10313;

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 7)
    public class742(String arg0, int arg1) {
        this.field10314 = arg0;
        this.field10313 = (short) arg1;
    }
}
