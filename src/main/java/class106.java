import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class106 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBI)V", line = 4)
    public static final void method790(int arg0, int arg1, byte arg2, int arg3) {
        field1543++;
        if (arg2 >= -69) {
            field1541 = -20;
        }
        String var4 = "::tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class110.method842(var4, -23198);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lt;B)V", line = 18)
    public static final void method791(class305 arg0, byte arg1) {
        field1542++;
        int var2 = arg0.field4746 - class233.field3542;
        int var3 = arg0.field4771 * 128 + (arg0.method1897(8) * 64);
        int var4 = arg0.field4725 * 128 + arg0.method1897(8) * 64;
        if (arg0.field4756 == 0) {
            arg0.field4674 = 1024;
        }
        int var5 = 65 / ((-arg1 - 29) / 38);
        arg0.field4731 += (var4 - arg0.field4731) / var2;
        arg0.field4713 += (var3 - arg0.field4713) / var2;
        arg0.field4764 = 0;
        if (arg0.field4756 == 1) {
            arg0.field4674 = 1536;
        }
        if (arg0.field4756 == 2) {
            arg0.field4674 = 0;
        }
        if (arg0.field4756 == 3) {
            arg0.field4674 = 512;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lfk;", line = 53)
    public static final class299 method792(int arg0, int arg1) {
        class299 var2 = (class299) class40.field586.method747((long) arg0, (byte) 108);
        field1539++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == 0) {
            byte[] var3 = class218.field3332.method696(arg0, (byte) 114, 4);
            class299 var4 = new class299();
            if (var3 != null) {
                var4.method2058(new class254(var3), false, arg0);
            }
            class40.field586.method744(var4, -15692, (long) arg0);
            return var4;
        } else {
            return (class299) null;
        }
    }
}
