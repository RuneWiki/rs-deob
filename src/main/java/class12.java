import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class12 {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
    public static int[] field136 = new int[2048];

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Z")
    public static boolean field133 = true;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lcf;")
    public static class166 field130;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lf;")
    public class231 field137;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lgk;")
    public class265 field128;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[[Z")
    public static boolean[][] field134;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 4)
    public static void method39(byte arg0) {
        field136 = null;
        if (arg0 != -2) {
            field133 = false;
        }
        field130 = null;
        field134 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z", line = 20)
    public static final boolean method40(int arg0, int arg1) {
        field132++;
        if (arg0 != 16) {
            method45(54, -42);
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 36)
    public static final void method41(int arg0) {
        if (arg0 < 2) {
            return;
        }
        field138++;
        if (class55.field704 != null) {
            class251 var1 = class55.field704;
            synchronized (class55.field704) {
                class55.field704 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)Z", line = 57)
    public static final boolean method42(int arg0, byte arg1) {
        if (arg1 == -101) {
            field131++;
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V", line = 68)
    public static final void method43(int arg0, int arg1, int arg2) {
        field135++;
        class26 var3 = class77.method455(arg2, arg2 - 56, arg0);
        var3.method137(255);
        var3.field325 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lde;IIIIIIZ)V", line = 91)
    public static final void method44(class4 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field42.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field42[var9] - class187.field2968;
            int var11 = arg0.field37[var9] - class140.field2153;
            int var12 = arg0.field34[var9] - class205.field3375;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field28 != null) {
                class4.field30[var9] = var13;
                class4.field25[var9] = var16;
                class4.field35[var9] = var17;
            }
            class4.field41[var9] = (var13 << 9) / var17 + class173.field2820;
            class4.field33[var9] = (var16 << 9) / var17 + class173.field2807;
        }
        class173.field2814 = 0;
        int var19 = arg0.field23.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field23[var20];
            int var22 = arg0.field39[var20];
            int var23 = arg0.field29[var20];
            int var24 = class4.field41[var21];
            int var25 = class4.field41[var22];
            int var26 = class4.field41[var23];
            int var27 = class4.field33[var21];
            int var28 = class4.field33[var22];
            int var29 = class4.field33[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0 && class72.field965 && class179.method1285(class173.field2820 + class140.field2175, class173.field2807 + class114.field1786, var27, var28, var29, var24, var25, var26)) {
                class114.field1783 = arg5;
                class261.field4433 = arg6;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V", line = 174)
    public static final void method45(int arg0, int arg1) {
        field127++;
        if (class18.method83((byte) -55, arg1)) {
            class178.method1276(class272.field4582[arg1], 76991056, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lwa;IILg;III)V", line = 186)
    public static final void method46(class284 arg0, int arg1, int arg2, class242 arg3, int arg4, int arg5, int arg6) {
        field129++;
        if (arg0 == null) {
            return;
        }
        int var7 = class71.field959 + class45.field551 & 0x7FF;
        int var8 = Math.max(arg3.field3989 / 2, arg3.field4057 / 2) + 10;
        int var9 = arg2 * arg2 + arg6 * arg6;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class173.field2818[var7];
        int var11 = class173.field2812[var7];
        int var12 = var10 * 256 / (class70.field934 + 256);
        if (arg5 == 848605840) {
            int var13 = var11 * 256 / (class70.field934 + 256);
            int var14 = arg2 * var13 + arg6 * var12 >> 16;
            int var15 = arg2 * var12 - (arg6 * var13) >> 16;
            ((class258) arg0).method1775(arg3.field3989 / 2 + arg4 + var14 - (arg0.field4817 / 2), arg3.field4057 / 2 + -(arg0.field4804 / 2) + -var15 + arg1, (class258) arg3.method1666(arg5 ^ 0xCD6B4D2E, false));
        }
    }
}
