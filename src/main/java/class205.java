import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class205 {

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3585 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljd;")
    public static class85 field3586 = class221.method1499("null", (byte) 108);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3580 = -2;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lwe;")
    public static class15 field3581 = new class15();

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Z")
    public static boolean field3589 = true;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Ljd;")
    public static class85 field3590 = class221.method1499("mapscene", (byte) -71);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Lge;")
    public static class68 field3588;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "[Lfg;")
    public static class12[] field3587;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)V")
    public static final void method1401(int arg0, int arg1, byte arg2) {
        field3583++;
        if (class222.method1508(0, arg1)) {
            if (arg2 > -86) {
                method1401(-66, 86, (byte) 48);
            }
            class58.method387(class215.field3774[arg1], -128, arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3587 = null;
        field3581 = null;
        field3588 = null;
        field3586 = null;
        if (arg0 != 255) {
            method1401(98, 92, (byte) 40);
        }
        field3590 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I")
    public static final int method1403(byte arg0, int arg1) {
        if (arg0 <= 97) {
            field3590 = null;
        }
        field3582++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjd;Ljd;ILjd;)V")
    public static final void method1404(int arg0, class85 arg1, class85 arg2, int arg3, class85 arg4) {
        if (arg0 == 0) {
            class32.method222(-1, arg1, -100, arg2, arg4, arg3);
            field3584++;
        }
    }
}
