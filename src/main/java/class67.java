import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class67 extends class65 {

    @OriginalMember(owner = "client!hk", name = "Db", descriptor = "[I")
    public static int[] field865 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!hk", name = "Hb", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!hk", name = "Ib", descriptor = "Lbg;")
    public static class324 field870 = new class324(100, 6);

    @OriginalMember(owner = "client!hk", name = "Ab", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!hk", name = "Bb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!hk", name = "Cb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!hk", name = "Eb", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!hk", name = "Fb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!hk", name = "Gb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!hk", name = "Jb", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FI)V", line = 6)
    public final void method651(float arg0, int arg1) {
        ++field863;
        if (arg1 != 1739667504) {
            method654((class364) null, 117);
        }
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field783[super.field827++] = (byte) var3;
        super.field783[super.field827++] = (byte) (var3 >> 8);
        super.field783[super.field827++] = (byte) (var3 >> 16);
        super.field783[super.field827++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "(I)[Lbg;", line = 22)
    public static final class324[] method652(int arg0) {
        int var1 = 114 % ((-72 - arg0) / 46);
        ++field866;
        return new class324[] { class205.field2995, class369.field5486, class475.field6998, class180.field2535, class213.field3062, class472.field6965, class296.field4250, class322.field4530, class385.field5651, class471.field6961, class410.field6102, class442.field6560, class136.field1959, class73.field998, class232.field3417, class375.field5555, class432.field6354, class375.field5554, class372.field5529, class500.field7419, class4.field69, class88.field1199, class410.field6097, class475.field6999, class34.field394, class39.field442, class483.field7111, class364.field5095, class84.field1151, class203.field2944, class427.field6300, class241.field3573, class212.field3053, class91.field1248, class428.field6309, class3.field34, class418.field6166, class485.field7131, class227.field3308, class9.field105, class263.field3864, class149.field2113, class185.field2592, class236.field3455, class413.field6141, class435.field6373, class429.field6313, class85.field1162, class377.field5579, class332.field4624, class321.field4528, class167.field2373, class517.field7614, class315.field4483, class60.field694, class389.field5747, class167.field2368, class386.field5692, class241.field3571, class122.field1789, class27.field324, class253.field3735, class493.field7216, class151.field2147, class53.field579, class223.field3276, class448.field6606, class353.field4930, class515.field7576, class200.field2933, class268.field3950, class490.field7193, class463.field6812, class305.field4331, class151.field2132, class39.field452, class25.field300, class37.field407, class109.field1545, class446.field6593, class97.field1310, class376.field5569, class480.field7062, class396.field5797, class405.field6033, class466.field6845, class162.field2293, class29.field359, class311.field4440, class299.field4301, class144.field2022, class250.field3688, class7.field83, class278.field4081, class402.field5966, class400.field5939, class402.field5955, class127.field1846, class489.field7186, class98.field1314, field870, class325.field4573, class530.field7760, class198.field2897, class92.field1265, class99.field1333, class273.field4031, class198.field2891, class359.field4998, class27.field322 };
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lya;B)V", line = 34)
    public static final void method653(class38 arg0, byte arg1) {
        ++field864;
        if (arg1 >= -127) {
            method653((class38) null, (byte) -37);
        }
        if (!class473.field6974) {
            class240.method1594((byte) -76, arg0);
        } else {
            class99.method842(arg0, 3);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Llh;I)V", line = 51)
    public static final void method654(class364 arg0, int arg1) {
        if (arg1 >= -93) {
            method653((class38) null, (byte) -4);
        }
        ++field871;
        class307 var2 = (class307) class453.field6669.method875((long) arg0.field1716, 126);
        if (var2 != null) {
            var2.method1903(-2212);
        } else {
            class477.method2886(arg0.field1777[0], -1, (class461) null, arg0, arg0.field1778[0], 0, arg0.field6328, (class222) null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(FB)V", line = 71)
    public final void method655(float arg0, byte arg1) {
        ++field862;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field783[super.field827++] = (byte) (var3 >> 24);
        super.field783[super.field827++] = (byte) (var3 >> 16);
        super.field783[super.field827++] = (byte) (var3 >> 8);
        if (arg1 == 98) {
            super.field783[super.field827++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "(I)V", line = 87)
    public static void method656(int arg0) {
        field865 = null;
        if (arg0 == -8625) {
            field870 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V", line = 98)
    public class67(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 106)
    public static final void method657(int arg0, int arg1, int arg2, int arg3) {
        ++field868;
        if (arg3 == 0) {
            class196 var4 = class435.field6370[arg0][arg1];
            class364.method2177(var4 != null ? var4 : class206.field3000, arg2, 103);
        }
    }
}
