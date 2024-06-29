import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class679 {

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field9641 = 1339;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "Ltt;")
    public static class338 field9645 = new class338(34, -1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public int field9643;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public int field9646;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "[Ldba;")
    public class236[] field9640;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)V", line = 3)
    public static final void method3869(int arg0, int arg1) {
        if (arg0 > 0) {
            method3869(-86, -108);
        }
        field9642++;
        class256 var2 = class592.method3279((byte) -83, 3, arg1);
        var2.method1546((byte) -67);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V", line = 18)
    public static void method3870(byte arg0) {
        if (arg0 > -95) {
            field9645 = null;
        }
        field9645 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLio;)V", line = 28)
    public final void method3871(byte arg0, class157 arg1) {
        this.field9646 = arg1.method933((byte) 1);
        if (arg0 != -108) {
            method3870((byte) 6);
        }
        field9644++;
        this.field9643 = arg1.method963(-126);
        this.field9640 = new class236[arg1.method930(arg0 ^ 0xFFFFFF6B)];
        class141[] var3 = class21.method130(128);
        for (int var4 = 0; var4 < this.field9640.length; var4++) {
            this.field9640[var4] = this.method3872(arg1, arg0 + 111, var3[arg1.method930(255)]);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lio;ILtca;)Ldba;", line = 58)
    private final class236 method3872(class157 arg0, int arg1, class141 arg2) {
        field9639++;
        if (class165.field2368 == arg2) {
            return class302.method1779(arg1 ^ 0x303, arg0);
        } else if (class98.field1188 == arg2) {
            return class50.method269(arg0, -256);
        } else if (class484.field6729 == arg2) {
            return class54.method315(arg0, arg1 ^ 0x2);
        } else if (class104.field1230 == arg2) {
            return class558.method3101(arg0, (byte) 19);
        } else if (class545.field7457 == arg2) {
            return class289.method1719(arg0, (byte) 81);
        } else {
            if (arg1 != 3) {
                field9641 = -11;
            }
            if (class692.field9759 == arg2) {
                return class183.method1217(arg0, -116);
            } else if (class315.field4228 == arg2) {
                return class6.method40(arg1 - 18257, arg0);
            } else if (class632.field8743 == arg2) {
                return class643.method3578(arg0, (byte) 73);
            } else if (class300.field3976 == arg2) {
                return class94.method536((byte) -34, arg0);
            } else if (class360.field4775 == arg2) {
                return class527.method2977(arg0, -123);
            } else {
                return null;
            }
        }
    }
}
