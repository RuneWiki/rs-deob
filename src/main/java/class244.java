import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class244 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lqk;")
    public static class207 field4426 = class24.method212(255, "(Udns");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLv;)V")
    public final void method1716(byte arg0, class149 arg1) {
        field4424++;
        while (true) {
            int var3 = arg1.method1045((byte) 90);
            if (var3 == 0) {
                if (arg0 == -44) {
                    return;
                } else {
                    method1722(true);
                    return;
                }
            }
            this.method1719(1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
    public static final int method1717(int arg0) {
        field4425++;
        if (arg0 != 15) {
            field4426 = null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lqk;")
    public static final class207 method1718(int arg0, int arg1) {
        field4431++;
        return class12.field167[arg0].method1450((byte) -122) <= arg1 ? class110.field1926[arg0] : class105.method757(false, new class207[] { class110.field1926[arg0], class220.field3961, class12.field167[arg0] });
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILv;I)V")
    private final void method1719(int arg0, class149 arg1, int arg2) {
        field4430++;
        if (arg0 == arg2) {
            this.field4432 = arg1.method1050(1272006568);
            this.field4423 = arg1.method1045((byte) -104);
            this.field4433 = arg1.method1045((byte) -112);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method1720(boolean arg0) {
        if (arg0) {
            field4426 = null;
        }
        field4426 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1721(int arg0, Component arg1) {
        arg1.removeMouseListener(class149.field2610);
        arg1.removeMouseMotionListener(class149.field2610);
        arg1.removeFocusListener(class149.field2610);
        field4427++;
        class158.field2791 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
    public static final void method1722(boolean arg0) {
        class231.field4239.method1390((byte) 122);
        field4434++;
        if (!arg0) {
            method1720(false);
        }
    }
}
