import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class246 extends class225 {

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    private final int field4078;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    private final int field4081;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    private final int field4087;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    private final int field4082;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lma;")
    public static class5 field4076 = class12.method119(")2", (byte) 54);

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lma;")
    public static class5 field4077 = class12.method119("blinken3:", (byte) 56);

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field4085 = 0;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 5)
    public static final void method1724(byte arg0, Component arg1) {
        arg1.removeKeyListener(class61.field954);
        field4079++;
        arg1.removeFocusListener(class61.field954);
        if (arg0 <= -43) {
            class15.field280 = -1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 18)
    public static final void method1725(int arg0) {
        class101.field1515.method523(125);
        class24.field412.method523(123);
        field4083++;
        if (arg0 != -1762745556) {
            field4085 = 15;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIB)V", line = 31)
    public final void method395(int arg0, int arg1, byte arg2) {
        field4080++;
        int var4 = this.field4078 * arg0 >> 12;
        int var5 = this.field4087 * arg0 >> 12;
        int var6 = this.field4082 * arg1 >> 12;
        int var7 = this.field4081 * arg1 >> 12;
        class297.method2003(var4, var7, var6, this.field3704, this.field3705, var5, -6376, this.field3706);
        if (arg2 != 29) {
            method1727(false);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIII)V", line = 60)
    public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4078 = arg0;
        this.field4081 = arg3;
        this.field4087 = arg2;
        this.field4082 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lvi;IILje;)V", line = 94)
    public static final void method1726(class211 arg0, int arg1, int arg2, class158 arg3) {
        class119 var4 = new class119();
        if (arg2 <= 116) {
            method1727(true);
        }
        var4.field1798 = 1;
        var4.field1799 = arg0;
        field4074++;
        var4.field1797 = arg3;
        var4.field5004 = (long) arg1;
        class218 var5 = class29.field477;
        synchronized (class29.field477) {
            class29.field477.method1485(-8564, var4);
        }
        class238.method1679((byte) -9);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V", line = 114)
    public static void method1727(boolean arg0) {
        field4077 = null;
        if (arg0) {
            method1727(true);
        }
        field4076 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V", line = 126)
    public final void method397(int arg0, int arg1, byte arg2) {
        int var4 = this.field4078 * arg0 >> 12;
        field4086++;
        if (arg2 > -104) {
            this.method393(27, 92, (byte) -59);
        }
        int var5 = this.field4087 * arg0 >> 12;
        int var6 = this.field4082 * arg1 >> 12;
        int var7 = this.field4081 * arg1 >> 12;
        class101.method642((byte) -98, var7, this.field3706, var4, var6, this.field3705, var5);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIB)V", line = 154)
    public final void method393(int arg0, int arg1, byte arg2) {
        field4075++;
        int var4 = this.field4078 * arg0 >> 12;
        int var5 = this.field4087 * arg0 >> 12;
        int var6 = this.field4082 * arg1 >> 12;
        if (arg2 != -3) {
            this.method393(97, -56, (byte) 71);
        }
        int var7 = this.field4081 * arg1 >> 12;
        class200.method1317(var4, var5, true, var7, var6, this.field3704);
    }
}
