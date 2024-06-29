import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class120 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lui;")
    public static class212 field1792;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Lpk;")
    public static class237 field1793;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IC)C")
    public static final char method854(int arg0, char arg1) {
        field1796++;
        if (arg0 == -182) {
            return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
        } else {
            return 'X';
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method855(byte arg0) {
        field1792 = null;
        int var1 = -9 / ((31 - arg0) / 47);
        field1793 = null;
    }
}
