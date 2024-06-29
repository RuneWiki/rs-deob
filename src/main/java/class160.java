import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class160 extends class223 {

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "[I")
    public static int[] field2823 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lcd;")
    public static class64 field2825 = class44.method335((byte) 71, "zap");

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
    public static int[] field2824 = new int[25];

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "[Lcd;")
    public static class64[] field2826;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1154(int arg0, int arg1) {
        if (class276.field4753 == arg1 && arg1 != 0) {
            class73 var2 = class62.field1210[arg1];
            var2.method557(class226.field3855);
        }
        field2820++;
        if (arg0 != 5405) {
            method1155(-74, -65, -4, -36);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)I", line = 37)
    public static final int method1155(int arg0, int arg1, int arg2, int arg3) {
        field2819++;
        if (arg2 == 268435455) {
            return arg1 <= arg3 ? (arg3 <= arg0 ? arg3 : arg0) : arg1;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 59)
    public static void method1156(int arg0) {
        field2824 = null;
        field2825 = null;
        if (arg0 == 16711680) {
            field2823 = null;
            field2826 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIB)V", line = 85)
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2821++;
        if (class123.field2216) {
            class21.method209(arg1, arg3, arg1 + arg0, arg3 - -arg2);
            class21.method208(arg1, arg3, arg0, arg2, 0);
        } else {
            class210.method1470(arg1, arg3, arg1 + arg0, arg3 - -arg2);
            class210.method1469(arg1, arg3, arg0, arg2, 0);
        }
        if (class276.field4745 < 100) {
            return;
        }
        if (class118.field2147 == null || class118.field2147.field627 != arg0 || class118.field2147.field629 != arg2) {
            class127 var5 = new class127(arg0, arg2);
            class210.method1466(var5.field2274, arg0, arg2);
            class306.method2131(0, 0, arg0, 0, 12800, arg2, class233.field3934, 0, class226.field3845);
            if (class123.field2216) {
                class118.field2147 = new class136(var5);
            } else {
                class118.field2147 = var5;
            }
            if (class123.field2216) {
                class210.field3529 = null;
            } else {
                class183.field3130.method765(0);
            }
        }
        class118.field2147.method314(arg1, arg3);
        if (arg4 > -85) {
            return;
        }
        int var6 = class101.field1818 * arg2 / class233.field3934 + arg3;
        int var7 = class232.field3921 * arg0 / class226.field3845;
        int var8 = class288.field4916 * arg0 / class226.field3845 + arg1;
        int var9 = class154.field2729 * arg2 / class233.field3934;
        if (class123.field2216) {
            class21.method206(var8, var6, var7, var9, 16711680, 128);
            class21.method212(var8, var6, var7, var9, 16711680);
        } else {
            class210.method1464(var8, var6, var7, var9, 16711680, 128);
            class210.method1468(var8, var6, var7, var9, 16711680);
        }
        if (class200.field3434 <= 0 || (class200.field3434 % 10) >= 5) {
            return;
        }
        for (class27 var10 = (class27) class117.field2134.method778(0); var10 != null; var10 = (class27) class117.field2134.method775(26517)) {
            if (class278.field4795 == var10.field437) {
                int var11 = var10.field440 * arg0 / class226.field3845 + arg1;
                int var12 = var10.field444 * arg2 / class233.field3934 + arg3;
                if (class123.field2216) {
                    class21.method208(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class210.method1469(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V", line = 173)
    public static final void method1158(byte arg0, int arg1) {
        field2822++;
        class122.field2190.method1197((byte) 122, arg1);
        class27.field435.method1197((byte) 115, arg1);
        int var2 = -7 % ((arg0 + 32) / 47);
    }
}
