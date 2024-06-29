import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class28 {

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field783 = 128;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lpd;")
    public static class94 field791 = method249(104, "scrollen:");

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lvc;")
    public static class128 field793 = new class128(50);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Lpd;")
    private static class94 field800 = method249(-109, "Login limit exceeded)3");

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lpd;")
    public static class94 field804 = field800;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "Lpd;")
    private static class94 field807 = method249(-125, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lpd;")
    private static class94 field805 = method249(99, "Checking for updates )2 ");

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lpd;")
    public static class94 field808 = method249(55, "titlebox");

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lpd;")
    public static class94 field811 = field805;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Lpd;")
    public static class94 field810 = method249(-100, "mapfunction");

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Lpd;")
    public static class94 field806 = field807;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "[Lnc;")
    public static class80[] field803 = new class80[32768];

    @OriginalMember(owner = "client!e", name = "N", descriptor = "[I")
    public static int[] field812 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Z")
    public static boolean field813 = false;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Lla;")
    public static class66 field815;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Z")
    public static boolean field809;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 4)
    public static final void method248(int arg0) {
        field778++;
        if (arg0 != -8455) {
            field805 = null;
        }
        if (class64.field1595 > 0) {
            class76.method564(false);
        } else {
            class1.method6(false, 40);
            class113.field2890 = class1.field47;
            class1.field47 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/String;)Lpd;", line = 23)
    public static final class94 method249(int arg0, String arg1) {
        field787++;
        int var2 = 0;
        byte[] var3 = arg1.getBytes();
        int var4 = var3.length;
        class94 var5 = new class94();
        var5.field2382 = new byte[var4];
        while (var2 < var4) {
            int var6 = var3[var2++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var2 >= var4) {
                    break;
                }
                int var7 = var3[var2++] & 0xFF;
                var5.field2382[var5.field2396++] = (byte) (var6 * 43 + var7 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field2382[var5.field2396++] = (byte) var6;
            }
        }
        var5.method699((byte) -95);
        int var8 = 63 / ((arg0 + 14) / 33);
        return var5.method697((byte) -119);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)V", line = 67)
    public static final void method250(int arg0, boolean arg1) {
        field776++;
        if (class39.field1017 == null || !arg1) {
            return;
        }
        if (class4.field93 != 0) {
            if (class54.field1365 == null) {
                return;
            }
            class119.field2968 = arg0;
        } else if (class86.field2194 >= 0) {
            class86.field2194 = arg0;
            class39.field1017.method388(arg0, (byte) -87, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 110)
    public static void method251(byte arg0) {
        field811 = null;
        field791 = null;
        field812 = null;
        if (arg0 != 43) {
            field804 = null;
        }
        field803 = null;
        field815 = null;
        field806 = null;
        field804 = null;
        field805 = null;
        field810 = null;
        field800 = null;
        field807 = null;
        field808 = null;
        field793 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ls;BLs;Ls;)V", line = 132)
    public static final void method252(class111 arg0, byte arg1, class111 arg2, class111 arg3) {
        class122.field3043 = arg0;
        class6.field122 = arg3;
        class72.field1716 = arg2;
        field773++;
        if (arg1 < 0) {
            class108.field2673 = new class77[class6.field122.method814(-118)][];
            class51.field1276 = new boolean[class6.field122.method814(-88)];
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILga;)V", line = 248)
    public static final void method253(int arg0, class37 arg1) {
        field774++;
        int var2 = 0;
        if (arg1.field964 == 0) {
            var2 = class64.field1585.method182(arg1.field952, arg1.field967, arg1.field962);
        }
        if (arg1.field964 == 1) {
            var2 = class64.field1585.method172(arg1.field952, arg1.field967, arg1.field962);
        }
        if (arg0 != -8868) {
            method248(-53);
        }
        int var3 = -1;
        if (arg1.field964 == 2) {
            var2 = class64.field1585.method217(arg1.field952, arg1.field967, arg1.field962);
        }
        if (arg1.field964 == 3) {
            var2 = class64.field1585.method198(arg1.field952, arg1.field967, arg1.field962);
        }
        int var4 = 0;
        int var5 = 0;
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class64.field1585.method175(arg1.field952, arg1.field967, arg1.field962, var2);
            var5 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg1.field976 = var5;
        arg1.field974 = var4;
        arg1.field961 = var3;
    }
}
