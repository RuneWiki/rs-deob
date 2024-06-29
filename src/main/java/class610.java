import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class610 extends class585 {

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    private int field8578;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lvv;")
    public static class343 field8580 = new class343();

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lbu;")
    public static class21 field8581 = new class21(63, -1);

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    public class610(int arg0) {
        super(0, true);
        this.field8578 = 4096;
        this.field8578 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
    public static void method3547(byte arg0) {
        field8580 = null;
        field8581 = null;
        if (arg0 != -15) {
            field8580 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3548(String arg0, byte arg1) {
        ++field8579;
        int var2 = -65 % ((arg1 - 57) / 58);
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; class47.field600 > var3; ++var3) {
                if (arg0.equalsIgnoreCase(class31.field431[var3])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class550.field7910[var3])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field8575;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            class595.method3470(var3, 0, class293.field4278, this.field8578);
        }
        return arg1 <= 123 ? null : var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            ++field8576;
            if (arg2 == 0) {
                this.field8578 = (arg0.method2964((byte) 57) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class610() {
        this(4096);
    }
}
