import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class48 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lnk;")
    public static class16 field547;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[B")
    public byte[] field545;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[B")
    public byte[] field546;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 13)
    public static void method297(boolean arg0) {
        field547 = null;
        if (!arg0) {
            method297(false);
        }
    }
}
