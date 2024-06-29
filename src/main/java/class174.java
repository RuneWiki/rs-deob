import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class174 {

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[I")
    public static int[] field2832 = new int[2];

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Led;")
    public static class187 field2834 = new class187();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field2831;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public int field2846;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Lje;")
    public static class188 field2845;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method1311(byte arg0) {
        field2843++;
        class53 var1 = (class53) class11.field130.method1384(2);
        if (arg0 > -55) {
            return;
        }
        while (var1 != null) {
            class195 var2 = var1.field772;
            if (class58.field826 != var2.field3173 || var2.field3129 < class264.field4290) {
                var1.method1922(-1);
            } else if (var2.field3149 <= class264.field4290) {
                if (var2.field3168 > 0) {
                    class18 var3 = class169.field2730[var2.field3168 - 1];
                    if (var3 != null && var3.field1979 >= 0 && var3.field1979 < 13312 && var3.field1910 >= 0 && var3.field1910 < 13312) {
                        var2.method1449(var3.field1979, class129.method930(var3.field1910, var3.field1979, 82, var2.field3173) - var2.field3169, class264.field4290, 0, var3.field1910);
                    }
                }
                if (var2.field3168 < 0) {
                    int var4 = -var2.field3168 - 1;
                    class29 var5;
                    if (class40.field569 == var4) {
                        var5 = class186.field2993;
                    } else {
                        var5 = class92.field1374[var4];
                    }
                    if (var5 != null && var5.field1979 >= 0 && var5.field1979 < 13312 && var5.field1910 >= 0 && var5.field1910 < 13312) {
                        var2.method1449(var5.field1979, class129.method930(var5.field1910, var5.field1979, 99, var2.field3173) - var2.field3169, class264.field4290, 0, var5.field1910);
                    }
                }
                var2.method1444(class161.field2628, (byte) -56);
                class254.method1798(class58.field826, (int) var2.field3134, (int) var2.field3135, (int) var2.field3158, 60, var2, var2.field3150, -1L, false);
            }
            var1 = (class53) class11.field130.method1388((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static void method1312(byte arg0) {
        field2832 = null;
        if (arg0 != 68) {
            field2834 = null;
        }
        field2834 = null;
        field2845 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)I")
    public static final int method1313(boolean arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        field2836++;
        int var3 = arg1 >> 6 & 0x3;
        if (arg0) {
            method1313(true, -94);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
