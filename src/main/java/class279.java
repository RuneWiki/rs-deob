import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class279 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3768 = -1;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lfg;")
    public static class83 field3769 = new class83("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    public static int[] field3770 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field3770 = null;
        field3769 = null;
        if (arg0 != 80) {
            method1573(94);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
    public static final boolean method1574(int arg0, int arg1, int arg2) {
        field3766++;
        if (arg1 <= 20) {
            method1573(-122);
        }
        return (arg2 & 0x400) != 0;
    }
}
