import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class190 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "F")
    public static float field2855 = 0.0F;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2854 = -1;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILlf;)V", line = 5)
    private final void method1298(byte arg0, int arg1, class143 arg2) {
        if (arg0 >= -41) {
            return;
        }
        if (arg1 == 1) {
            this.field2850 = arg2.method1051(1);
            this.field2853 = arg2.method1043(true);
            this.field2857 = arg2.method1043(true);
        }
        field2861++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILlf;)V", line = 36)
    public final void method1299(int arg0, class143 arg1) {
        while (true) {
            int var3 = arg1.method1043(true);
            if (var3 == 0) {
                field2859++;
                if (arg0 != 12182) {
                    field2855 = 1.1847682F;
                }
                return;
            }
            this.method1298((byte) -70, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 57)
    public static final void method1300(byte arg0, Component arg1) {
        arg1.removeMouseListener(class101.field1354);
        if (arg0 != -18) {
            method1301(118, (class16) null, (class16) null, (class16) null, (class16) null);
        }
        field2856++;
        arg1.removeMouseMotionListener(class101.field1354);
        arg1.removeFocusListener(class101.field1354);
        class360.field5706 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILnk;Lnk;Lnk;Lnk;)V", line = 72)
    public static final void method1301(int arg0, class16 arg1, class16 arg2, class16 arg3, class16 arg4) {
        class151.field2400 = arg3;
        class161.field2473 = arg2;
        if (arg0 > -110) {
            return;
        }
        class226.field3406 = arg4;
        field2858++;
        class127.field1861 = arg1;
        class232.field3512 = new class323[class127.field1861.method122(-102)][];
        class251.field3975 = new boolean[class127.field1861.method122(-90)];
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Llk;", line = 100)
    public static final class309 method1302(int arg0, byte arg1) {
        field2852++;
        class309 var2 = (class309) class245.field3860.method380(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        int var3 = -91 / ((-arg1 - 69) / 42);
        byte[] var4 = class256.field4047.method100(class253.method1794(arg0, -85), class229.method1591(arg0, 2), (byte) -107);
        class309 var5 = new class309();
        var5.field4799 = arg0;
        if (var4 != null) {
            var5.method2178(new class143(var4), 31148);
        }
        var5.method2176(-38);
        if (var5.field4860 != -1) {
            var5.method2181(method1302(var5.field4860, (byte) -124), -118, method1302(var5.field4846, (byte) -119));
        }
        if (var5.field4840 != -1) {
            var5.method2187(method1302(var5.field4840, (byte) 15), method1302(var5.field4835, (byte) -124), (byte) 18);
        }
        if (!class242.field3766 && var5.field4867) {
            var5.field4858 = 0;
            var5.field4850 = class242.field3718;
            var5.field4824 = class334.field5334;
            var5.field4851 = false;
            var5.field4868 = class106.field1464;
        }
        class245.field3860.method377((long) arg0, var5, -1);
        return var5;
    }
}
