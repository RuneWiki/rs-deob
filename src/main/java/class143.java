import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class143 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
    public final boolean method1059(boolean arg0) {
        if (arg0) {
            this.method1059(false);
        }
        field2010++;
        return (this.field2009 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
    public final boolean method1060(int arg0) {
        if (arg0 != 16563) {
            this.method1062(-55);
        }
        field2011++;
        return (this.field2009 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z")
    public final boolean method1061(byte arg0) {
        field2014++;
        if (arg0 != -92) {
            this.method1060(73);
        }
        return (this.field2009 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
    public final boolean method1062(int arg0) {
        if (arg0 != 512) {
            this.field2013 = -58;
        }
        field2015++;
        return (this.field2009 & 0x4) != 0;
    }
}
