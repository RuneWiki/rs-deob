import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[S")
    public static short[] field7 = new short[256];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Loh;")
    public static class15 field5;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1(int arg0) {
        if (arg0 != 29659) {
            field5 = (class15) null;
        }
        field4++;
        class121.field1985 = true;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 20)
    public static void method2(int arg0) {
        field7 = null;
        if (arg0 != 1) {
            field3 = 107;
        }
        field5 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V", line = 35)
    public static final void method3(int arg0) {
        field1++;
        class87.field1381.method791(8);
        class305.field5214.method791(8);
        if (arg0 <= 77) {
            method4(7, 95);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 58)
    public static final void method4(int arg0, int arg1) {
        field6++;
        if (class238.field3973 == arg1) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (class238.field3973 == 0) {
            class102.method700(125);
        }
        if (~arg1 == arg0) {
            class159.method1248(false);
        }
        if (arg1 != 40 && class3.field27 != null) {
            class3.field27.method284((byte) 97);
            class3.field27 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class214.field3529 = 0;
            class306.field5236 = 0;
            class303.field5193 = 0;
            class113.field1811 = 1;
            class273.field4706 = 1;
            class57.method451(true, -85);
        }
        if (arg1 == 25 || arg1 == 10) {
            class192.method1488((byte) 115);
        }
        if (arg1 == 5) {
            class50.method410(class196.field3273, true);
        } else {
            class95.method652(arg0 - 15);
        }
        boolean var3 = class238.field3973 == 5 || class238.field3973 == 10 || class238.field3973 == 28;
        if (var2 != var3) {
            if (var2) {
                class174.field2910 = class225.field3755;
                if (class27.field479 == 0) {
                    class203.method1549(2, (byte) 85);
                } else {
                    class98.method682(class116.field1865, 0, -98, class225.field3755, false, 255, 2);
                }
                class70.field1139.method1212((byte) -119, false);
            } else {
                class203.method1549(2, (byte) 98);
                class70.field1139.method1212((byte) -116, true);
            }
        }
        if (class271.field4640 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class271.method1961();
        }
        class238.field3973 = arg1;
    }
}
