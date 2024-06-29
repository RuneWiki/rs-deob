import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class631 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/awt/Component;)Lao;", line = 8)
    public static final class304 method3540(byte arg0, Component arg1) {
        if (arg0 != 24) {
            field8824 = 86;
        }
        field8823++;
        return new class109(arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method3541(int arg0, boolean arg1) {
        field8820++;
        if (class457.field6340 != null) {
            class457.field6340.method3027(2);
            class457.field6340 = null;
        }
        class608.method3365((byte) -109);
        class772.method4279((byte) -106);
        if (arg0 <= 43) {
            field8824 = 107;
        }
        class259.method1718();
        for (int var2 = 0; var2 < 4; var2++) {
            class514.field7038[var2].method2913(2097152);
        }
        class103.method796(false, (byte) -110);
        System.gc();
        class127.method1033((byte) -34, 2);
        class757.field10503 = -1;
        class645.field8963 = false;
        class237.method1532(0);
        class200.method1361(true, -79);
        class184.field2474 = 0;
        class364.field5298 = 0;
        class230.field3147 = 0;
        class351.field5157 = 0;
        class474.field6604 = 0;
        class121.field1765 = 0;
        for (int var3 = 0; var3 < class581.field7771.length; var3++) {
            class581.field7771[var3] = null;
        }
        class120.method991(16741381);
        for (int var4 = 0; var4 < 2048; var4++) {
            class599.field8149[var4] = null;
        }
        class688.field9678 = 0;
        class234.field3169.method3959(0);
        class184.field2457 = 0;
        class558.field7516.method3959(0);
        class574.method3209(27315);
        class599.field8150 = 0;
        class382.field5602.method2270(0);
        class12.method94((byte) 121);
        class164.method1186((byte) 64);
        class181.field2401 = null;
        class18.field272 = 0L;
        class495.field6848 = null;
        class285.field4208 = null;
        class66.field952 = null;
        class126.field1902 = null;
        if (arg1) {
            class300.method1901(12, 2);
            return;
        }
        class300.method1901(3, 2);
        try {
            class623.method3414(class735.field10183, "loggedout", (byte) 127);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILd;IILjava/awt/Canvas;)Lha;", line = 106)
    public static final class65 method3542(int arg0, class161 arg1, int arg2, int arg3, Canvas arg4) {
        field8822++;
        if (arg2 != 3) {
            field8824 = 51;
        }
        return new class221(arg4, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "toString", descriptor = "()Ljava/lang/String;", line = 117)
    public final String toString() {
        field8821++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I", line = 125)
    public final int method3543(int arg0, int arg1, int arg2) {
        field8825++;
        int var4 = class140.field2048 <= arg1 ? arg1 : class140.field2048;
        if (arg0 != 0) {
            method3541(44, true);
        }
        if (class62.field890 == this) {
            return 0;
        } else if (class180.field2395 == this) {
            return var4 - arg2;
        } else if (class572.field7685 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }
}
