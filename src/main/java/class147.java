import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class147 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3587 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lec;")
    public static class32 field3589 = new class32();

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lrd;")
    public static class117 field3598 = class95.method812("chatback", (byte) 8);

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lrd;")
    private static class117 field3603 = class95.method812("You have only just left another world)3", (byte) 8);

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lrd;")
    public static class117 field3600 = field3603;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lga;")
    public static class44 field3597;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lga;")
    public static class44 field3602;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ll;")
    public static class76 field3588;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "[I")
    public static int[] field3593;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILcd;)V")
    public static final void method1183(int arg0, int arg1, int arg2, int arg3, class19 arg4) {
        field3602.method488(-7913);
        class14.field328.method929(0, 0);
        field3595++;
        arg4.method219(class110.field2759, 55, arg2, 16777215, true);
        if (arg3 == 0) {
            arg4.method219(class101.field2537, 55, 41, 65280, true);
        }
        if (arg3 == 1) {
            arg4.method219(class97.field2438, 55, 41, 16776960, true);
        }
        if (arg3 == 2) {
            arg4.method219(class119.field2932, 55, 41, 16711680, true);
        }
        if (arg3 == 3) {
            arg4.method219(class47.field1350, 55, 41, 65535, true);
        }
        arg4.method219(class38.field1098, 184, 28, 16777215, true);
        if (arg1 == 0) {
            arg4.method219(class101.field2537, 184, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg4.method219(class97.field2438, 184, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg4.method219(class119.field2932, 184, 41, 16711680, true);
        }
        arg4.method219(class39.field1132, 324, 28, 16777215, true);
        if (arg0 == 0) {
            arg4.method219(class101.field2537, 324, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg4.method219(class97.field2438, 324, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg4.method219(class119.field2932, 324, 41, 16711680, true);
        }
        arg4.method204(class45.field1267, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class42.field1216.getGraphics();
            field3602.method485(453, 0, -6898, var5);
        } catch (Exception var6) {
            class42.field1216.repaint();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method1184(byte arg0) {
        field3585++;
        class68.field1925 = false;
        if (arg0 != 61) {
            method1191((byte) -100, -30);
        }
        class30.field904 = false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static final void method1185(boolean arg0) {
        try {
            Graphics var1 = class42.field1216.getGraphics();
            if (arg0) {
                return;
            }
            class87.field2276.method485(357, 17, -6898, var1);
        } catch (Exception var2) {
            class42.field1216.repaint();
        }
        field3594++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method1186(int arg0, int arg1) {
        field3596++;
        if (arg1 == -1 && !class71.field1984) {
            class142.method1132(arg0 ^ 0xFFFF8C38);
        } else if (arg1 != -1 && class63.field1814 != arg1 && class16.field383 != 0 && !class71.field1984) {
            class67.method663(2, 0, arg1, class71.field1980, 1, class16.field383, false);
        }
        if (arg0 == -15377) {
            class63.field1814 = arg1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public static final int method1187(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg1 << 16) + arg2);
        field3591++;
        if (class90.field2315 != null && class90.field2315.field2048 == var3) {
            if (arg0 != 1) {
                method1190(-108);
            }
            return class58.field1595.field314 * 99 / (class58.field1595.field326.length - class90.field2315.field3314) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static final void method1188(boolean arg0) {
        field3586++;
        class99.method840((byte) 41, class17.field428);
        if (class100.field2495 != -1) {
            class99.method840((byte) 41, class100.field2495);
        }
        class77.field2094 = 0;
        if (arg0) {
            return;
        }
        class101.field2512.method488(-7913);
        class33.field987 = class129.method1053(class33.field987);
        class145.method1159();
        class84.method762(0, (byte) 120, 765, 503, class17.field428, 0, 0);
        if (class100.field2495 != -1) {
            class84.method762(0, (byte) 100, 765, 503, class100.field2495, 0, 0);
        }
        if (class15.field354) {
            class56.method593((byte) -89);
        } else {
            class135.method1101((byte) -89);
            class58.method600(-3);
        }
        try {
            Graphics var1 = class42.field1216.getGraphics();
            class101.field2512.method485(0, 0, -6898, var1);
        } catch (Exception var2) {
            class42.field1216.repaint();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLdc;I)V")
    public static final void method1189(byte arg0, class25 arg1, int arg2) {
        if (arg0 > -42) {
            method1185(false);
        }
        field3592++;
        class105.method872(arg2, arg1.field751, -1, arg1.field717);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1190(int arg0) {
        field3602 = null;
        field3603 = null;
        if (arg0 != 0) {
            field3603 = null;
        }
        field3598 = null;
        field3597 = null;
        field3600 = null;
        field3588 = null;
        field3589 = null;
        field3593 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lj;")
    public static final class62 method1191(byte arg0, int arg1) {
        field3590++;
        class62 var2 = (class62) class64.field1826.method774((long) arg1, 329);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class41.field1180.method526((byte) 120, 6, arg1);
        class62 var4 = new class62();
        var4.field1739 = arg1;
        if (var3 != null) {
            var4.method630((byte) -101, new class14(var3));
        }
        if (arg0 < 66) {
            method1187(-32, 82, -72);
        }
        var4.method631(0);
        if (var4.field1780) {
            var4.field1758 = false;
            var4.field1773 = false;
        }
        class64.field1826.method773((long) arg1, (byte) -17, var4);
        return var4;
    }
}
