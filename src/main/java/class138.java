import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class138 {

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lod;")
    public class138 field2031;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lve;")
    public class309 field2029;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(II)V")
    public class138(int arg0, int arg1) {
        this.field2030 = arg0;
        this.field2027 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lod;I)V")
    public class138(class138 arg0, int arg1) {
        this.field2031 = arg0;
        this.field2027 = this.field2031.field2027 + arg1;
        this.field2029 = this.field2031.field2029;
        this.field2030 = this.field2031.field2030;
    }
}
