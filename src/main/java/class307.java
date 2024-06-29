import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class307 {

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "F")
    public static float field4786 = 128.0F;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4790 = "Loaded fonts";

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[Z")
    public static boolean[] field4791 = new boolean[5];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lmn;")
    public static class161 field4782;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ljd;")
    public static class95 field4785;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field4788;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    public static int[] field4784;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 13)
    public static final int method2102(int arg0) {
        if (arg0 == 5) {
            field4789++;
            return class83.field1221;
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I", line = 27)
    public static final int method2103(byte arg0) {
        int var1 = -33 / ((arg0 - 62) / 45);
        field4780++;
        return ((class71.field1022 == 0 ? 0 : 1) << 22) + ((class67.field972 ? 1 : 0) << 16) + (((class309.field4812 ? 1 : 0) << 13) + (class165.field2674 & 0x3 << 11) + ((class258.field3983 ? 1 : 0) << 9) + ((class284.field4430 ? 1 : 0) << 8) + ((class267.field4149 ? 1 : 0) << 7) + ((class255.field3884 ? 1 : 0) << 6) + (class102.field1482 & 0x7) + ((class314.field4871 ? 1 : 0) << 3) + (((class322.field4976 ? 1 : 0) << 4) - (-((class320.field4958 ? 1 : 0) << 5) + -((class134.field2036 ? 1 : 0) << 10) + -((class122.field1874 ? 1 : 0) << 15))) - (-(class245.field3705 << 17) + (-((class318.field4915 ? 1 : 0) << 19) - ((class311.field4833 == 0 ? 0 : 1) << 20)) - (((class59.field783 == 0 ? 0 : 1) << 21) - -(class249.method1704() << 23))));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V", line = 37)
    public static final void method2104(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == arg1) {
            class14.field191++;
            class85.field1236.method1141((byte) 82, 71);
            class85.field1236.method1752(5, -102);
        }
        if (arg0 == 1) {
            class85.field1236.method1141((byte) 96, 245);
            class85.field1236.method1752(19, -124);
            class133.field2030++;
        }
        class85.field1236.method1784(arg2 + class293.field4522, (byte) -93);
        field4781++;
        class85.field1236.method1726(26600, class180.field2860[82] ? 1 : 0);
        class85.field1236.method1784(class327.field5054 + arg3, (byte) -55);
        class163.field2641 = arg3;
        class260.field3999 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)I", line = 68)
    public static final int method2105(int arg0, byte arg1, int arg2) {
        if (arg1 < 27) {
            return -46;
        }
        field4787++;
        int var3 = class101.method760(1, arg2 - 1, arg0 - 1) + (class101.method760(1, arg2 - 1, arg0 + 1) + class101.method760(1, arg2 + 1, arg0 + -1) + class101.method760(1, arg2 + 1, arg0 - -1));
        int var4 = class101.method760(1, arg2, arg0 - 1) - (-class101.method760(1, arg2, arg0 + 1) - class101.method760(1, arg2 - 1, arg0) - class101.method760(1, arg2 - -1, arg0));
        int var5 = class101.method760(1, arg2, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 97)
    public static void method2106(byte arg0) {
        field4790 = null;
        int var1 = -50 / ((33 - arg0) / 54);
        field4782 = null;
        field4791 = null;
        field4785 = null;
        field4784 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 117)
    public static final void method2107(byte arg0) {
        field4783++;
        class160 var1 = (class160) class2.field28.method1954(-66);
        if (arg0 > -47) {
            method2105(-26, (byte) -118, -54);
        }
        while (var1 != null) {
            if (var1.field2426 == -1) {
                var1.field2421 = 0;
                class216.method1549(var1, (byte) 40);
            } else {
                var1.method39(10717);
            }
            var1 = (class160) class2.field28.method1950((byte) 94);
        }
    }
}
