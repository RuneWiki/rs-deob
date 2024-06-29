import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class476 extends class320 {

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public int field7109;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
    public boolean field7111;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public int field7113;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Liv;")
    public static class64 field7107 = new class64(66, 6);

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Liv;")
    public static class64 field7114 = new class64(92, 5);

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Log;")
    public static class457 field7115 = null;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field7117 = 0;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "J")
    public static long field7118;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[Lpd;")
    public static class168[] field7116;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static final void method2849(int arg0) {
        field7108++;
        if (!class443.field6623.method2840(255, class169.field2624) && class430.field6392 != class163.field2525) {
            class364.method2282(false, class185.field2771, false, class187.field2781, arg0 ^ 0x1C07);
            return;
        }
        class323.method2098(class4.field109, -14494);
        if (arg0 != 5) {
            method2851((byte) -80, null);
        }
        if (class428.field6358 != class163.field2525) {
            class80.method642(-26522);
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method2850(int arg0) {
        field7107 = null;
        if (arg0 != 19467) {
            method2850(-9);
        }
        field7116 = null;
        field7114 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLbu;)I")
    public static final int method2851(byte arg0, class17 arg1) {
        field7112++;
        int var2 = 0;
        if (arg1.method129(true, class398.field6005)) {
            var2++;
        }
        if (arg1.method129(true, class284.field4057)) {
            var2++;
        }
        if (arg1.method129(true, class76.field1277)) {
            var2++;
        }
        int var3 = 79 / ((arg0 + 31) / 32);
        if (arg1.method129(true, class77.field1300)) {
            var2++;
        }
        if (arg1.method129(true, class333.field5038)) {
            var2++;
        }
        if (arg1.method129(true, class463.field6932)) {
            var2++;
        }
        if (arg1.method129(true, class349.field5210)) {
            var2++;
        }
        if (arg1.method129(true, class491.field7264)) {
            var2++;
        }
        if (arg1.method129(true, class470.field7058)) {
            var2++;
        }
        if (arg1.method129(true, class263.field3799)) {
            var2++;
        }
        if (arg1.method129(true, class104.field1728)) {
            var2++;
        }
        if (arg1.method129(true, class100.field1647)) {
            var2++;
        }
        if (arg1.method129(true, class296.field4209)) {
            var2++;
        }
        if (arg1.method129(true, class19.field330)) {
            var2++;
        }
        if (arg1.method129(true, class173.field2665)) {
            var2++;
        }
        if (arg1.method129(true, class271.field3919)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIZ)V")
    public class476(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7109 = arg1;
        this.field7111 = arg5;
        this.field7110 = arg2;
        this.field7105 = arg4;
        this.field7106 = arg3;
        this.field7113 = arg0;
    }
}
