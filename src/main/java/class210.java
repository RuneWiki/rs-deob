import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class210 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lvf;")
    public static class265 field3772 = class87.method582(-46, ":tradereq:");

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lvf;")
    private static class265 field3770 = class87.method582(-46, " ");

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
    public static int[] field3775 = new int[50];

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lvf;")
    public static class265 field3780 = class87.method582(-46, "::rect_debug");

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lvf;")
    public static class265 field3779 = field3770;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[[[Lch;")
    public static class117[][][] field3768 = new class117[4][104][104];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lek;")
    public static class156 field3782 = null;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lvf;")
    public static class265 field3783 = class87.method582(-46, "Fallen lassen");

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lfl;")
    public static class192 field3781;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[Lvf;")
    public static class265[] field3778;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[[Z")
    public static boolean[][] field3776;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lr;")
    public static final class229 method1438(int arg0) {
        int var1 = -11 / ((arg0 - 67) / 55);
        field3773++;
        return class52.field1091.length > class18.field486 ? class52.field1091[class18.field486++] : null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILgk;III)V")
    public static final void method1439(int arg0, int arg1, int arg2, class6 arg3, int arg4, int arg5, int arg6) {
        field3777++;
        int var7 = arg1 * arg1 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field89 / arg5, arg3.field84 / 2);
        if ((var8 * var8) >= var7) {
            class89.method609(-85, arg0, arg4, arg3, arg1, class95.field1678[arg6], arg2);
            return;
        }
        var8 -= 10;
        int var9 = class79.field1500 + class122.field2180 & 0x7FF;
        int var10 = class247.field4289[var9];
        int var11 = var10 * 256 / (class39.field908 + 256);
        int var12 = class247.field4298[var9];
        int var13 = var12 * 256 / (class39.field908 + 256);
        int var14 = arg1 * var11 + arg4 * var13 >> 16;
        int var15 = arg1 * var13 - (arg4 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class88) class6.field154[arg6]).method587(arg3.field89 / 2 + arg0 + var18 - 10, arg3.field84 / 2 + -var19 + arg2 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lvk;")
    public static final class144 method1440(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class144 var4 = var3.field2518;
            var3.field2518 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lfe;")
    public static final class206 method1441(int arg0, int arg1) {
        class206 var2 = (class206) class8.field267.method1887(118, (long) arg0);
        if (arg1 != -1999596368) {
            return null;
        }
        field3785++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class258.field4440.method1332(true, class206.method1412(arg0, 23190), class188.method1283(arg0, false));
        class206 var4 = new class206();
        var4.field3697 = arg0;
        if (var3 != null) {
            var4.method1410(new class135(var3), (byte) -17);
        }
        class8.field267.method1892(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method1442(byte arg0) {
        field3771++;
        class70.field1321.method1893(-43);
        int var1 = 92 % ((70 - arg0) / 55);
        class55.field1125.method1893(-100);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method1443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class263.field4590 = class155.field2871 * arg0 / arg1;
        class278.field4911 = class213.field3824 * arg3 / arg4;
        class36.field842 = -1;
        field3784++;
        class174.field3125 = -1;
        if (arg2 > -105) {
            field3768 = null;
        }
        class30.method246(44);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method1444(boolean arg0) {
        field3770 = null;
        field3782 = null;
        field3776 = null;
        field3783 = null;
        field3780 = null;
        field3768 = null;
        field3778 = null;
        if (!arg0) {
            field3781 = null;
        }
        field3775 = null;
        field3772 = null;
        field3779 = null;
        field3781 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    public static final void method1445(int arg0, boolean arg1) {
        field3774++;
        for (class242 var2 = (class242) class7.field250.method789((byte) -74); var2 != null; var2 = (class242) class7.field250.method787((byte) -76)) {
            if (var2.field4203 != null) {
                class49.field1039.method1660(var2.field4203);
                var2.field4203 = null;
            }
            if (var2.field4217 != null) {
                class49.field1039.method1660(var2.field4217);
                var2.field4217 = null;
            }
            var2.method97(158);
        }
        if (arg0 > -121) {
            field3775 = null;
        }
        if (!arg1) {
            return;
        }
        for (class242 var3 = (class242) class240.field4197.method789((byte) -120); var3 != null; var3 = (class242) class240.field4197.method787((byte) -76)) {
            if (var3.field4203 != null) {
                class49.field1039.method1660(var3.field4203);
                var3.field4203 = null;
            }
            var3.method97(158);
        }
        for (class242 var4 = (class242) class32.field804.method1851(false); var4 != null; var4 = (class242) class32.field804.method1847(false)) {
            if (var4.field4203 != null) {
                class49.field1039.method1660(var4.field4203);
                var4.field4203 = null;
            }
            var4.method97(158);
        }
    }
}
