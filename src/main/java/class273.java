import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class273 extends class390 {

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
    public static int[] field3786 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[Lne;")
    public static class173[] field3788 = new class173[29];

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "[I")
    public static int[] field3793 = new int[4096];

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field3779;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public int field3785;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1780(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 30346) {
            field3793 = null;
        }
        field3790++;
        if (class371.field5212 == 0 || arg3 == 0 || class108.field1556 >= 50 || arg0 == -1) {
            return;
        }
        class406.field5777[class108.field1556] = arg0;
        class59.field810[class108.field1556] = arg3;
        class156.field2199[class108.field1556] = arg4;
        class228.field3321[class108.field1556] = null;
        class428.field6063[class108.field1556] = 0;
        class123.field1702[class108.field1556] = arg2;
        class108.field1556++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIZI)V", line = 41)
    public static final void method1781(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class46.field648.field191 = 0;
        field3781++;
        class46.field648.method173(20, 255);
        class46.field648.method173(arg2, 255);
        class46.field648.method173(arg1, 255);
        class46.field648.method191(arg0, -94);
        class46.field648.method191(arg4, -107);
        class145.field2063 = 0;
        class19.field367 = 1;
        if (arg3) {
            field3786 = null;
        }
        class401.field5703 = 0;
        class438.field6170 = -3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLjava/lang/String;)I", line = 76)
    public static final int method1782(byte arg0, String arg1) {
        field3789++;
        return arg0 == 25 ? arg1.length() + 1 : -81;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBII)V", line = 90)
    public static final void method1783(int arg0, byte arg1, int arg2, int arg3) {
        field3782++;
        if (arg0 == 0) {
            class46.field648.method1178(63, 54);
            class347.field4731++;
        }
        if (arg0 == 1) {
            class46.field648.method1178(63, 134);
            class250.field3532++;
        }
        int var4 = -93 / ((arg1 + 39) / 51);
        class46.field648.method197(class203.field2790.method1872(82, 4463) ? 1 : 0, -16651);
        class46.field648.method191(class212.field2968 + arg3, -116);
        class46.field648.method183(arg2 + class447.field6269, true);
        class50.field697 = arg3;
        class376.field5371 = false;
        class251.field3547 = arg2;
        class280.method1827(true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 122)
    public static final boolean method1784(String arg0, int arg1) {
        field3780++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class197.field2709; var2++) {
            if (arg0.equalsIgnoreCase(class303.field4182[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class69.field1017[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V", line = 148)
    public static void method1785(byte arg0) {
        field3788 = null;
        int var1 = -69 / (-arg0 / 52);
        field3786 = null;
        field3793 = null;
    }
}
