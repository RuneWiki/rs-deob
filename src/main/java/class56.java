import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class56 extends class143 {

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "B")
    public byte field647 = 5;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "[I")
    public static int[] field649 = new int[2500];

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "Lcq;")
    public static class72 field648 = new class72("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field651 = 0;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZIIZ)V")
    public static final void method312(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class290.field3819 = 0L;
        field642++;
        int var5 = client.method2697(-105);
        if (!arg1) {
            return;
        }
        if (arg3 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class267.field3454.method770()) {
            arg4 = true;
        }
        class301.method1912(arg4, arg3, (byte) -38, var5, arg0, arg2);
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
    public static void method313(byte arg0) {
        field648 = null;
        if (arg0 >= -120) {
            field649 = null;
        }
        field649 = null;
    }
}
