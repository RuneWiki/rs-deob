import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class299 extends class412 {

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public int field3840 = (int) (class190.method1030(false) / 1000L);

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "S")
    public short field3837;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Ljava/lang/String;")
    public String field3839;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Lvj;")
    public static class373 field3838 = new class373(74, 4);

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "[[B")
    public static byte[][] field3842 = new byte[50][];

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Lcea;")
    public static class180 field3843 = new class180("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Lsca;")
    public static class40 field3844;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIIIIIBI)V", line = 5)
    public static final void method1659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 <= 65) {
            return;
        }
        if (arg2 >= class470.field6589 && arg2 <= class592.field8588 && class470.field6589 <= arg6 && class592.field8588 >= arg6 && class470.field6589 <= arg4 && class592.field8588 >= arg4 && class470.field6589 <= arg5 && arg5 <= class592.field8588 && class563.field8282 <= arg7 && arg7 <= class271.field3513 && class563.field8282 <= arg0 && class271.field3513 >= arg0 && class563.field8282 <= arg1 && class271.field3513 >= arg1 && class563.field8282 <= arg3 && arg3 <= class271.field3513) {
            class585.method3400(arg7, arg6, arg1, arg3, arg0, arg5, arg2, arg4, arg9, false);
        } else {
            class95.method586(arg6, arg5, arg1, arg3, arg4, arg9, true, arg2, arg0, arg7);
        }
        field3841++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 33)
    public static void method1660(int arg0) {
        if (arg0 != 31816) {
            method1659(-120, 99, -36, 56, -116, -66, 106, 19, (byte) 31, 53);
        }
        field3843 = null;
        field3842 = null;
        field3844 = null;
        field3838 = null;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 46)
    public class299(String arg0, int arg1) {
        this.field3837 = (short) arg1;
        this.field3839 = arg0;
    }
}
