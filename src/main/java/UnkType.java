import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ic")
public class UnkType {

    @OriginalMember(owner = "ic", name = "c", descriptor = "Z")
    public boolean field1016 = true;

    @OriginalMember(owner = "ic", name = "d", descriptor = "Z")
    public boolean field1017 = false;

    @OriginalMember(owner = "ic", name = "e", descriptor = "Z")
    public boolean field1018 = true;

    @OriginalMember(owner = "ic", name = "f", descriptor = "Z")
    public boolean field1019 = true;

    @OriginalMember(owner = "ic", name = "g", descriptor = "Z")
    public boolean field1020 = false;

    @OriginalMember(owner = "ic", name = "a", descriptor = "I")
    private static int field1014 = 3;

    @OriginalMember(owner = "ic", name = "b", descriptor = "[Lic;")
    public static UnkType[] field1015;
}
