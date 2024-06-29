import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lmh;")
    public static class128 field487 = class22.method156(122, "leuchten1:");

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field486 = 0;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Lmh;")
    public static class128 field498 = class22.method156(125, ")3");

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Lmh;")
    private static class128 field500 = class22.method156(122, "wave:");

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lmh;")
    public static class128 field495 = field500;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Z")
    public static boolean field493 = true;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lmh;")
    public static class128 field494 = class22.method156(127, "<col=ff7000>");

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Z")
    public static boolean field496 = true;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lmh;")
    public static class128 field489 = field500;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lqf;", line = 15)
    public static final class140 method130(byte arg0) {
        field490++;
        int var1 = 89 % ((48 - arg0) / 46);
        return class219.field3862.length <= class47.field953 ? null : class219.field3862[class47.field953++];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)V", line = 46)
    public static final void method131(byte arg0, int arg1) {
        if (arg0 == -60) {
            class276.field4783 = arg1;
            field492++;
            class84.method534(false, 3);
            class84.method534(false, 4);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 91)
    public static void method132(byte arg0) {
        field487 = null;
        field500 = null;
        field494 = null;
        field498 = null;
        field489 = null;
        field495 = null;
        if (arg0 > -59) {
            field500 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 158)
    public static final void method133(byte arg0) {
        field483++;
        for (int var1 = 0; var1 < 5; var1++) {
            class183.field3217[var1] = false;
        }
        class157.field2691 = -1;
        if (arg0 == 115) {
            class86.field1500 = -1;
            class1.field21 = 1;
        }
    }
}
