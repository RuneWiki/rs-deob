import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class136 extends class213 {

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
    public int[] field2586 = new int[] { -1 };

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "[I")
    public int[] field2594 = new int[1];

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lob;")
    private static class141 field2591 = class175.method1195(40, "Connecting to update server");

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public static int field2590 = 100;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lob;")
    private static class141 field2588 = class175.method1195(40, "Malformed login packet)3");

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lob;")
    public static class141 field2595 = field2588;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "Lob;")
    public static class141 field2596 = class175.method1195(40, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "Lob;")
    public static class141 field2598 = class175.method1195(40, " GMT");

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lob;")
    public static class141 field2592 = field2591;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Lob;")
    public static class141 field2600 = class175.method1195(40, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Lfd;")
    public static class55 field2584;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
    public static int[] field2593;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method854(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= class68.field1323 && field2590 >= arg5 && arg4 >= class68.field1323 && field2590 >= arg4 && arg9 >= class68.field1323 && field2590 >= arg9 && class68.field1323 <= arg2 && arg2 <= field2590 && arg7 >= class35.field698 && class130.field2470 >= arg7 && class35.field698 <= arg3 && class130.field2470 >= arg3 && class35.field698 <= arg1 && arg1 <= class130.field2470 && class35.field698 <= arg8 && arg8 <= class130.field2470) {
            class154.method1082(arg7, arg1, arg4, arg3, arg6, arg5, arg9, 121, arg8, arg2);
        } else {
            class215.method1403(arg2, arg9, arg1, arg7, arg6, (byte) 127, arg3, arg5, arg8, arg4);
        }
        field2585++;
        if (arg0 <= 30) {
            method856((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Z")
    public static final boolean method855(int arg0, int arg1) {
        field2589++;
        if (arg0 > -80) {
            method855(102, -121);
        }
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method856(byte arg0) {
        if (arg0 != 89) {
            field2591 = null;
        }
        field2591 = null;
        field2600 = null;
        field2593 = null;
        field2598 = null;
        field2588 = null;
        field2595 = null;
        field2592 = null;
        field2584 = null;
        field2596 = null;
    }
}
