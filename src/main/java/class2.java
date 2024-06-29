import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public int field30 = -1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lod;")
    public static class101 field19 = class46.method335(-101, ")3runescape)3com");

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lod;")
    private static class101 field29 = class46.method335(-86, "Login");

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lod;")
    public static class101 field20 = field29;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[I")
    public static int[] field34 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lod;")
    private static class101 field26 = class46.method335(79, "You can(Wt add yourself to your own friend list");

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lod;")
    public static class101 field27 = class46.method335(-92, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Lod;")
    public static class101 field28 = field26;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lod;")
    private static class101 field37 = class46.method335(95, "Password: ");

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lod;")
    public static class101 field23 = field37;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Loc;")
    public class100 field36;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field22;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public static int[] field31;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[I")
    public int[] field33;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[Lod;")
    public class101[] field32;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method7(int arg0) {
        field20 = null;
        field29 = null;
        field34 = null;
        field27 = null;
        field19 = null;
        if (arg0 != 8) {
            return;
        }
        field23 = null;
        field37 = null;
        field26 = null;
        field22 = null;
        field31 = null;
        field28 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lod;Lod;IILod;)V")
    public static final void method8(class101 arg0, class101 arg1, int arg2, int arg3, class101 arg4) {
        field21++;
        int var5 = 46 % ((arg2 - 58) / 57);
        for (int var6 = 99; var6 > 0; var6--) {
            class158.field3637[var6] = class158.field3637[var6 - 1];
            class39.field932[var6] = class39.field932[var6 - 1];
            class79.field1653[var6] = class79.field1653[var6 - 1];
            class95.field2054[var6] = class95.field2054[var6 - 1];
        }
        class158.field3637[0] = arg3;
        class46.field1099 = class108.field2306;
        class141.field3242++;
        class39.field932[0] = arg1;
        class79.field1653[0] = arg4;
        class95.field2054[0] = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILsa;)Z")
    public static final boolean method9(int arg0, class126 arg1) {
        if (arg0 < 43) {
            method10(-77, 44);
        }
        field25++;
        if (class79.field1659) {
            if (class42.method313(arg1, (byte) -93) != 0) {
                return false;
            }
            if (arg1.field2782 == 0) {
                return false;
            }
        }
        return arg1.field2754;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lod;")
    public static final class101 method10(int arg0, int arg1) {
        field24++;
        return arg0 > arg1 ? class82.method592(false, arg1) : class67.field1511;
    }
}
