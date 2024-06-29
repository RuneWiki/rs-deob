import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class432 extends class504 {

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    private int field5661 = -1;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "B")
    private byte field5669;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    private int field5668;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "Ljava/lang/String;")
    private String field5666;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final void method2482(int arg0) {
        field5665++;
        class485.field6252.method2986(1, class485.field6252.field6940, (byte) 75);
        class485.field6252.method2986(1, class485.field6252.field6942, (byte) -127);
        class485.field6252.method2986(2, class485.field6252.field6918, (byte) 68);
        class485.field6252.method2986(2, class485.field6252.field6954, (byte) -121);
        class485.field6252.method2986(1, class485.field6252.field6938, (byte) 82);
        class485.field6252.method2986(1, class485.field6252.field6915, (byte) -82);
        class485.field6252.method2986(arg0, class485.field6252.field6945, (byte) 126);
        class485.field6252.method2986(1, class485.field6252.field6906, (byte) -56);
        class485.field6252.method2986(1, class485.field6252.field6923, (byte) 126);
        class485.field6252.method2986(1, class485.field6252.field6913, (byte) -67);
        class485.field6252.method2986(1, class485.field6252.field6952, (byte) -109);
        class485.field6252.method2986(1, class485.field6252.field6947, (byte) 124);
        class485.field6252.method2986(0, class485.field6252.field6951, (byte) -73);
        class485.field6252.method2986(1, class485.field6252.field6920, (byte) -113);
        class485.field6252.method2986(0, class485.field6252.field6953, (byte) 91);
        class485.field6252.method2986(0, class485.field6252.field6939, (byte) -89);
        class485.field6252.method2986(1, class485.field6252.field6908, (byte) 99);
        class485.field6252.method2986(0, class485.field6252.field6916, (byte) -55);
        class485.field6252.method2986(0, class485.field6252.field6936, (byte) 112);
        class251.method1634(7);
        class485.field6252.method2986(1, class485.field6252.field6955, (byte) 69);
        class485.field6252.method2986(3, class485.field6252.field6933, (byte) -77);
        class723.method3873(false);
        class193.method1346((byte) -124);
        class459.field5997 = true;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BIZ)V")
    public static final void method2483(byte arg0, int arg1, boolean arg2) {
        if (arg0 == 76) {
            field5663++;
            class123.method730(arg2, 19892, arg1, class659.field8556.method3589(class496.field6338, arg0 ^ 0xFFFFA8C9));
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lqc;Z)V")
    public final void method1003(class400 arg0, boolean arg1) {
        field5667++;
        class746 var3 = arg0.field5293[this.field5661];
        var3.field10201 = this.field5668;
        var3.field10192 = this.field5669;
        var3.field10194 = this.field5666;
        if (arg1) {
            this.field5669 = -127;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILmc;)V")
    public final void method1006(int arg0, class234 arg1) {
        field5662++;
        if (arg0 != 1243) {
            this.method1006(-66, null);
        }
        this.field5661 = arg1.method1553((byte) 12);
        this.field5669 = arg1.method1554(arg0 ^ 0x6845);
        this.field5668 = arg1.method1553((byte) -119);
        arg1.method1516(arg0 ^ 0xFFFFD73D);
        this.field5666 = arg1.method1540((byte) -105);
    }
}
