import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class166 extends class170 {

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    private int field2848 = 4096;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
    private int field2857 = 0;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "Lmh;")
    public static class128 field2851 = class22.method156(123, "Abbrechen");

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "Lmh;")
    private static class128 field2858 = class22.method156(127, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "I")
    public static int field2855 = -1;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "Lmh;")
    public static class128 field2846 = field2858;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!rk", name = "eb", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!rk", name = "fb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 6)
    public class166() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILbg;B)V", line = 10)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field2856++;
        if (arg0 == 0) {
            this.field2857 = arg1.method1308(-90);
        } else if (arg0 == 1) {
            this.field2848 = arg1.method1308(-118);
        }
        if (arg2 != 13) {
            method1087(63, 127, 21);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IFIIIIIZ)[I", line = 66)
    public static final int[] method1085(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int[] var8 = new int[arg0];
        class279 var9 = new class279();
        var9.field4810 = arg6;
        var9.field4819 = arg7;
        var9.field4830 = arg5;
        var9.field4820 = arg3;
        field2859++;
        var9.field4808 = arg2;
        var9.field4821 = (int) (arg1 * 4096.0F);
        var9.method267(arg4 ^ 0x3E52);
        class158.method1044(arg0, (byte) -90, 1);
        if (arg4 != -13520) {
            method1085(-109, -0.8041568F, 70, -99, 116, -8, 96, false);
        }
        var9.method1946(var8, 0, -128);
        return var8;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V", line = 89)
    public static void method1086(int arg0) {
        if (arg0 != 1) {
            field2855 = 4;
        }
        field2858 = null;
        field2851 = null;
        field2846 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(III)I", line = 106)
    public static final int method1087(int arg0, int arg1, int arg2) {
        field2852++;
        if (arg2 == -1) {
            return 12345678;
        } else if (arg0 == 126) {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(III)V", line = 131)
    public static final void method1088(int arg0, int arg1, int arg2) {
        int var3 = 13 % ((arg1 - 89) / 37);
        if (class139.field2391 != 0 && arg2 != -1) {
            class140.method923(false, class139.field2391, -50, arg2, 0, class104.field1781);
            class64.field1205 = true;
        }
        field2853++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)[I", line = 163)
    public final int[] method69(byte arg0, int arg1) {
        field2860++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (arg0 != 85) {
            field2858 = (class128) null;
        }
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field2857 <= var6 && var6 <= this.field2848 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)I", line = 207)
    public static final int method1089(int arg0) {
        if (arg0 != 2) {
            method1089(37);
        }
        field2854++;
        if (class114.field1924 != null) {
            return 3;
        } else if (class247.field4247 && class45.field901) {
            return 2;
        } else if (class247.field4247 && !class45.field901) {
            return 1;
        } else {
            return 0;
        }
    }
}
