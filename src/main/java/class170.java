import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class170 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lij;")
    private static class50 field2848 = class78.method578(121, "Loaded input handler");

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field2852 = -1;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lij;")
    public static class50 field2853 = class78.method578(123, "(U4");

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lij;")
    public static class50 field2840 = field2848;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field2855 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[B")
    public byte[] field2846;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "[B")
    public byte[] field2850;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method1180(byte arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        if (arg0 >= -125) {
            field2841 = -32;
        }
        field2851++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBII)I")
    public static final int method1181(int arg0, byte arg1, int arg2, int arg3) {
        field2842++;
        if ((class210.field3495[arg2][arg0][arg3] & 0x8) == 0) {
            if (arg1 != 76) {
                method1182(6);
            }
            return arg2 <= 0 || (class210.field3495[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[Ljd;")
    public static final class85[] method1182(int arg0) {
        class85[] var1 = new class85[class190.field3151];
        field2849++;
        for (int var2 = 0; var2 < class190.field3151; var2++) {
            int var3 = class46.field836[var2] * class164.field2805[var2];
            byte[] var4 = class31.field628[var2];
            if (class240.field4132[var2]) {
                byte[] var5 = class174.field2911[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class29.method261(class51.method413(var5[var7], 255) << 24, class114.field1996[class51.method413(255, var4[var7])]);
                }
                var1[var2] = new class171(class89.field1707, class116.field2024, class20.field421[var2], class2.field27[var2], class46.field836[var2], class164.field2805[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class114.field1996[class51.method413(255, var4[var9])];
                }
                var1[var2] = new class169(class89.field1707, class116.field2024, class20.field421[var2], class2.field27[var2], class46.field836[var2], class164.field2805[var2], var8);
            }
        }
        class261.method1759(true);
        if (arg0 != -9527) {
            method1180((byte) 45);
        }
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method1183(int arg0) {
        if (arg0 >= 90) {
            field2848 = null;
            field2840 = null;
            field2853 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static final void method1184(int arg0) {
        if (arg0 > -111) {
            field2853 = null;
        }
        class151.field2622.method763(0);
        field2838++;
        class84.field1597.method763(0);
    }
}
