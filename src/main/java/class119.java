import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class137 {

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "[Z")
    public static boolean[] field2818 = new boolean[112];

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Laf;")
    private static class7 field2811 = class48.method406(40, "Loaded config");

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Laf;")
    public static class7 field2815 = class48.method406(40, "::clientdrop");

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "Laf;")
    public static class7 field2819 = class48.method406(40, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Laf;")
    public static class7 field2816 = field2811;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Laf;")
    public static class7 field2814 = class48.method406(40, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "[I")
    public static int[] field2822 = new int[128];

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Lr;")
    public class118 field2825;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lsa;")
    public class126 field2823;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[B")
    public byte[] field2824;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2822 = null;
        field2816 = null;
        field2819 = null;
        field2818 = null;
        if (arg0 <= 80) {
            field2811 = null;
        }
        field2811 = null;
        field2814 = null;
        field2815 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static final void method920(int arg0) {
        field2821++;
        for (class28 var1 = (class28) class75.field1748.method127(-75); var1 != null; var1 = (class28) class75.field1748.method123(false)) {
            int var2 = var1.field734;
            if (class9.method106(var2, (byte) 123)) {
                class103[] var3 = class52.field1251[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field2565;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field3261;
                    class103 var7 = class37.method328(0, var6);
                    if (var7 != null) {
                        class141.method1151(15569, var7);
                    }
                }
            }
        }
        if (arg0 <= 43) {
            field2819 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)I")
    public static final int method921(int arg0, int arg1, int arg2, int arg3) {
        field2813++;
        int var4 = arg3 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg3 & 0x7F;
        if (arg2 < 3 && (class25.field670[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var7) * class108.field2636[var6][var4][var5] + class108.field2636[var6][var4 + 1][var5] * var7 >> 7;
        if (arg1 != -21697) {
            field2814 = null;
        }
        int var10 = (128 - var7) * class108.field2636[var6][var4][var5 + 1] + class108.field2636[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)Z")
    public static final boolean method922(int arg0, byte arg1) {
        field2820++;
        int var2 = -85 / ((50 - arg1) / 41);
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
