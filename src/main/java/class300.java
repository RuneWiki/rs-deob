import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class300 {

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ljda;")
    private class239 field4340 = new class239(64);

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Laj;")
    private class333 field4345;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Laj;")
    private class333 field4339;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field4338 = -1;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Ljw;")
    public static class581 field4341 = new class581(103, 6);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4344;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Lfba;", line = 9)
    public final class27 method1897(byte arg0, int arg1) {
        field4337++;
        class27 var3 = (class27) this.field4340.method1541(-10, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field4339.method2095(arg1 & 0x7FFF, 0, 1);
        } else {
            var4 = this.field4345.method2095(arg1, 0, arg0 + 97);
        }
        class27 var5 = new class27();
        if (arg0 != -96) {
            method1898(-33, null);
        }
        if (var4 != null) {
            var5.method205(arg0 ^ 0x5419, new class376(var4));
        }
        if (arg1 >= 32768) {
            var5.method209(-98);
        }
        this.field4340.method1544(true, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILor;)V", line = 41)
    public static final void method1898(int arg0, class668 arg1) {
        if (arg0 < 95) {
            field4344 = null;
        }
        field4342++;
        class668 var2 = class749.method4140(1, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class140.field2048;
            var3 = class593.field8019;
        } else {
            var3 = var2.field9282;
            var4 = var2.field9297;
        }
        class121.method996(arg1, (byte) -119, false, var4, var3);
        class251.method1682(arg1, var4, var3, 2);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 84)
    public static void method1899(int arg0) {
        field4344 = null;
        field4341 = null;
        if (arg0 != 2) {
            field4341 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(ILaj;Laj;)V", line = 230)
    public class300(int arg0, class333 arg1, class333 arg2) {
        this.field4345 = arg1;
        this.field4339 = arg2;
        if (this.field4345 != null) {
            this.field4345.method2090(0, false);
        }
        if (this.field4339 != null) {
            this.field4339.method2090(0, false);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lgea;I)I", line = 107)
    public static final int method1900(class81 arg0, int arg1) {
        field4343++;
        if (arg1 == 2) {
            String var2 = class717.method4008(arg0, 76);
            return class548.field7413.method1702(arg1 ^ 0x490E, class688.field9677, var2);
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V", line = 121)
    public static final void method1901(int arg0, int arg1) {
        field4347++;
        if (class458.field6355 == arg0) {
            return;
        }
        if (arg0 == 13) {
            class586.method3252((byte) 116);
        }
        if (arg0 != 13 && class754.field10484 != null) {
            class754.field10484.method3027(2);
            class754.field10484 = null;
        }
        if (arg0 == 3) {
            class713.method3987(class739.field10206 != class69.field968, (byte) -46);
        }
        if (arg0 == 7) {
            class469.method2768(-127, class69.field968 != class604.field8207);
        }
        if (arg0 == 5 || arg0 == 12) {
            class479.method2791((byte) -67);
        } else if (arg0 == 6 || arg0 == 9) {
            class586.method3252((byte) 97);
        }
        if (class355.method2239(class458.field6355, -31175)) {
            class637.field8871.field4844 = 2;
            class473.field6529.field4844 = 2;
            class281.field4150.field4844 = 2;
            class108.field1492.field4844 = 2;
            class262.field3891.field4844 = 2;
            class33.field530.field4844 = 2;
            class598.field8141.field4844 = 2;
        }
        if (class355.method2239(arg0, arg1 - 31177)) {
            class733.field10170 = 1;
            class256.field3835 = 0;
            class405.field5881 = 1;
            class136.field2003 = 0;
            class418.field5996 = 0;
            class103.method796(true, (byte) -123);
            class637.field8871.field4844 = 1;
            class473.field6529.field4844 = 1;
            class281.field4150.field4844 = 1;
            class108.field1492.field4844 = 1;
            class262.field3891.field4844 = 1;
            class33.field530.field4844 = 1;
            class598.field8141.field4844 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class150.method1118(arg1 - 2);
        }
        boolean var2 = arg0 == arg1 || class71.method631(arg0, (byte) 91) || class779.method4306(arg0, 89);
        boolean var3 = class458.field6355 == 2 || class71.method631(class458.field6355, (byte) 53) || class779.method4306(class458.field6355, 113);
        if (var2 != var3) {
            if (var2) {
                class757.field10503 = class544.field7379;
                if (class712.field9959.field1308.method3352(90) == 0) {
                    class127.method1033((byte) 96, 2);
                } else {
                    class567.method3168(class544.field7379, class712.field9959.field1308.method3352(118), 0, false, false, class177.field2367, 2);
                    class237.method1532(0);
                }
                class647.field8984.method3277(false, 0);
            } else {
                class127.method1033((byte) -58, 2);
                class647.field8984.method3277(true, arg1 ^ 0x2);
            }
        }
        if (class355.method2239(arg0, arg1 ^ 0xFFFF863B) || arg0 == 13) {
            class379.field5542.method500();
        }
        class458.field6355 = arg0;
    }
}
