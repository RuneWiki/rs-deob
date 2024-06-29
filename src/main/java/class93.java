import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public abstract class class93 {

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "[I")
    public static int[] field1257 = new int[250];

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Loi;")
    public static class49 field1256;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Lmo;")
    public static class507 field1260;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "[Lqg;")
    public static class307[] field1255;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
    public abstract boolean method571(int arg0);

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
    public static void method572(int arg0) {
        field1256 = null;
        field1255 = null;
        field1260 = null;
        field1257 = null;
        if (arg0 != 250) {
            field1260 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)J")
    public abstract long method573(boolean arg0);

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)I")
    public abstract int method574(int arg0);

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)C")
    public abstract char method575(int arg0);

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
    public abstract int method576(byte arg0);
}
