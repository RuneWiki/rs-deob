import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class433 extends class264 {

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Ljn;")
    public static class409 field6309 = new class409("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "Lbn;")
    public static class160 field6312 = new class160(47, -1);

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "[I")
    public static int[] field6313 = new int[2];

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "Ljn;")
    public static class409 field6314 = new class409("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public int field6306;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "[I")
    public int[] field6301;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "[I")
    public int[] field6305;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "[I")
    public int[] field6310;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "[Llf;")
    public class350[] field6302;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "[Llf;")
    public class350[] field6307;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "[[[B")
    public byte[][][] field6304;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 3)
    public static final void method2656(String arg0, int arg1, byte arg2) {
        if (arg2 < 12) {
            field6312 = null;
        }
        class458.field6768++;
        class257.method1773((byte) -10, class5.field85);
        field6308++;
        class159.field2132.method1727(-128, class248.method1646(arg0, (byte) -66) + 1);
        class159.field2132.method1727(-128, arg1);
        class159.field2132.method1712(arg0, -43);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V", line = 26)
    public static final void method2657(int arg0, byte arg1, int arg2) {
        field6311++;
        if (arg1 >= -71) {
            field6315 = -18;
        }
        if (class103.method695(arg2, -104)) {
            class2.method18(arg0, class444.field6470[arg2], -36);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V", line = 53)
    public static void method2658(boolean arg0) {
        if (arg0) {
            field6312 = null;
        }
        field6309 = null;
        field6312 = null;
        field6314 = null;
        field6313 = null;
    }
}
