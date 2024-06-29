import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class104 {

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field1705 = 0;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "[I")
    public static int[] field1707 = new int[50];

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field1710 = 0;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "Lrb;")
    public static class283 field1712 = new class283(42, 3);

    @OriginalMember(owner = "client!st", name = "l", descriptor = "Lrb;")
    public static class283 field1713;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "Lkc;")
    public static class157 field1715;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "F")
    public static float field1711;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Lut;")
    public class148 field1709;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Lml;")
    public static class27 field1702;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "[I")
    public int[] field1708;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)J")
    public static final long method810(int arg0) {
        if (arg0 != -1) {
            field1711 = 0.19887587F;
        }
        field1704++;
        return class294.field3973.method153(10);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method811(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1703++;
        if (arg0 < 55) {
            return true;
        } else if ((class27.field379[0][arg4][arg3] & 0x2) != 0) {
            return true;
        } else if ((class27.field379[arg1][arg4][arg3] & 0x10) == 0) {
            return arg2 == class157.method1130(arg4, arg1, arg3, (byte) -127);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method812(byte arg0) {
        field1702 = null;
        if (arg0 < -86) {
            field1715 = null;
            field1713 = null;
            field1707 = null;
            field1712 = null;
        }
    }

    static {
        new class157("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field1713 = new class283(84, 10);
        field1715 = new class157("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    }
}
