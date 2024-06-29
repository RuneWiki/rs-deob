import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class238 extends class188 {

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field3659 = 0;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "[I")
    public static int[] field3664 = new int[2];

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "Lvh;")
    public static class62 field3655 = new class62(64);

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1648(byte arg0, int arg1) {
        field3657++;
        class347.field5503.method387(arg1, false);
        if (arg0 < 44) {
            method1650(102);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([[II)V", line = 16)
    public static final void method1649(int[][] arg0, int arg1) {
        class347.field5501 = arg0;
        if (arg1 != -1184675184) {
            field3655 = (class62) null;
        }
        field3656++;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 32)
    public static void method1650(int arg0) {
        field3664 = null;
        field3655 = null;
        int var1 = -91 % ((8 - arg0) / 45);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILhi;IBIII)V", line = 43)
    public static final void method1651(int arg0, int arg1, class323 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3661++;
        if (arg4 <= 74) {
            return;
        }
        int var8 = arg1 * arg1 + arg6 * arg6;
        if (var8 > arg7) {
            return;
        }
        int var9 = Math.min(arg2.field5169 / 2, arg2.field5174 / 2);
        if ((var9 * var9) >= var8) {
            class105.method683(arg0, arg3, arg2, arg1, class189.field2848[arg5], -43, arg6);
            return;
        }
        var9 -= 10;
        int var10 = (int) class190.field2855 + class132.field1912 & 0x7FF;
        int var11 = class104.field1435[var10];
        int var12 = class104.field1426[var10];
        int var13 = var12 * 256 / (class67.field831 + 256);
        int var14 = var11 * 256 / (class67.field831 + 256);
        int var15 = arg1 * var14 - (arg6 * var13) >> 16;
        int var16 = arg1 * var13 + arg6 * var14 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class272.field4317) {
            ((class200) class161.field2478[arg5]).method1392(240, 240, (arg2.field5169 / 2 + var19 + arg3) * 16, (arg2.field5174 / 2 + arg0 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class158) class161.field2478[arg5]).method1132(arg3 + (arg2.field5169 / 2) + var19 - 10, arg2.field5174 / 2 + (arg0 - var20) + -10, 20, 20, 15, 15, var17, 256);
        }
    }
}
