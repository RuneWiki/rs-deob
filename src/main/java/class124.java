import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class124 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1915 = -1;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Z")
    public static boolean field1919;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public static int[] field1918;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method899(byte arg0) {
        if (arg0 < 14) {
            method899((byte) 127);
        }
        field1918 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z")
    public static final boolean method900(int arg0, int arg1, int arg2) {
        field1917++;
        if (arg1 != 52) {
            method900(0, -18, 59);
        }
        return (arg2 & 0x34) != 0;
    }

    static {
        new class157(" days.", " Tage.", " jours.", " dias.");
        field1919 = false;
        field1918 = new int[] { 1, 4 };
    }
}
