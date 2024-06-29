import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class221 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lhi;")
    private static class82 field3823 = class95.method664((byte) -83, "wave2:");

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lhi;")
    public static class82 field3831 = field3823;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lhi;")
    public static class82 field3830 = class95.method664((byte) -39, "brillant1:");

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lhi;")
    public static class82 field3825 = field3823;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lmm;")
    public static class117 field3822 = new class117();

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lme;")
    public static class75 field3832;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 12)
    public static void method1563(byte arg0) {
        field3822 = null;
        if (arg0 != -44) {
            method1565(-35, 87);
        }
        field3831 = null;
        field3832 = null;
        field3825 = null;
        field3823 = null;
        field3830 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 73)
    public static final void method1564(int arg0) {
        field3827++;
        if (arg0 != 0) {
            method1565(-115, -120);
        }
        if (class254.field4368 != null) {
            class133 var1 = class254.field4368;
            synchronized (class254.field4368) {
                class254.field4368 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 102)
    public static final void method1565(int arg0, int arg1) {
        if (arg1 != 0) {
            method1563((byte) -36);
        }
        field3834++;
        class90.field1625.method2177(arg0, arg1 ^ 0xFFFFFF82);
    }
}
