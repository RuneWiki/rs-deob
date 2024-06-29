import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class145 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lla;")
    public class145 field1907;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lao;")
    public class116 field1903;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1912 = -1;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
    public static int[] field1904;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I", line = 3)
    public static final int method968(byte arg0) {
        field1906++;
        return arg0 == 59 ? ((~class407.field6101 == -1 ? 0 : 1) << 21) + ((class101.field1366 ? 1 : 0) << 19) + (class445.field6478 << 17) + ((class273.field4024 ? 1 : 0) << 15) + ((class417.field6217 ? 1 : 0) << 13) + ((class176.field2300 & 0x3) << 11) + ((class451.field6576 ? 1 : 0) << 10) + ((class261.field3804 ? 1 : 0) << 9) + ((class449.field6561 ? 1 : 0) << 6) + ((class258.field3768 ? 1 : 0) << 5) + ((class357.field5234 & 0x7) - -((class17.field203 ? 1 : 0) << 3)) - (-((class161.field2103 ? 1 : 0) << 4) + -((class158.field2076 ? 1 : 0) << 8) + -((class413.field6165 ? 1 : 0) << 16) - ((~class23.field409 == -1 ? 0 : 1) << 20) + -((~class358.field5243 == -1 ? 0 : 1) << 22) + -(class135.method909(72) << 23) + -(class264.field3845 << 25) + -((class363.field5313 ? 1 : 0) << 27) + -(class215.field3082 << 28)) : -81;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 18)
    public static final void method969(int arg0, Component arg1) {
        field1901++;
        arg1.addMouseListener(class126.field1672);
        arg1.addMouseMotionListener(class126.field1672);
        if (arg0 == -12951) {
            arg1.addFocusListener(class126.field1672);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 44)
    public static void method970(int arg0) {
        if (arg0 <= 88) {
            method968((byte) 35);
        }
        field1904 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V", line = 55)
    public class145(int arg0, int arg1) {
        this.field1905 = arg0;
        this.field1909 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lla;I)V", line = 70)
    public class145(class145 arg0, int arg1) {
        this.field1907 = arg0;
        this.field1905 = this.field1907.field1905;
        this.field1903 = this.field1907.field1903;
        this.field1909 = this.field1907.field1909 + arg1;
    }
}
