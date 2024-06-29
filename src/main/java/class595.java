import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class595 extends class270 {

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public int field8438 = 0;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public int field8439 = -1;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "Lvj;")
    public static class402 field8446 = new class402(1);

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "Lqv;")
    public static class406 field8451 = new class406(7, 1);

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "Lpr;")
    public static class407 field8452 = new class407(57, -2);

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public int field8436;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public int field8437;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public int field8441;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public int field8442;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public int field8443;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public int field8444;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    public int field8445;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "I")
    public int field8447;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
    public int field8448;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "[Lxa;")
    public static class458[] field8449;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 9)
    public static void method3332(int arg0) {
        field8446 = null;
        field8451 = null;
        field8452 = null;
        if (arg0 != -1) {
            method3332(31);
        }
        field8449 = null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 27)
    public static final void method3333(int arg0) {
        field8440++;
        if (class533.field7629) {
            return;
        }
        if (arg0 > -100) {
            method3332(123);
        }
        class565.method3197(class678.field9612, -9655);
        if (class631.field8958 != null) {
            class565.method3197(class631.field8958, -9655);
        }
        class533.field7629 = true;
    }
}
