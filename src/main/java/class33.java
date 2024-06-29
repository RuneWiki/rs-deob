import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class33 {

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lta;")
    public static class37 field466 = class20.method87(-123, "Furnace");

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "J")
    public long field462;

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "Lqa;")
    public class33 field463;

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Lqa;")
    public class33 field464;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "[B")
    public static byte[] field461;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 12)
    public final void method191(byte arg0) {
        if (this.field463 == null) {
            return;
        }
        this.field463.field464 = this.field464;
        this.field464.field463 = this.field463;
        this.field464 = null;
        if (arg0 <= 62) {
            this.field463 = null;
        }
        this.field463 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I)V", line = 40)
    public static void method192(int arg0) {
        field461 = null;
        field466 = null;
        if (arg0 != 0) {
            method192(-40);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "(B)V", line = 60)
    public static final void method193(byte arg0) {
        if (arg0 > -101) {
            method193((byte) -43);
        }
        class7.field78 = null;
        class37.field507 = null;
        class12.field138 = null;
        class11.field121 = null;
        class20.field231 = null;
        class38.field517 = null;
    }
}
