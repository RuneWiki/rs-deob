import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class35 {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lmb;")
    public static class132 field565 = class166.method1092("(U", 127);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lmb;")
    private static class132 field569 = class166.method1092("Unable to connect)3", 114);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lmb;")
    public static class132 field563 = field569;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lmb;")
    public static class132 field572 = field569;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lmb;")
    public static class132 field566 = class166.method1092("Bitte benutzen Sie eine andere Welt)3", 122);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lmb;")
    public static class132 field574 = class166.method1092("Clientscript error in: ", 126);

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "J")
    public static long field564;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lii;BIII)V")
    public static final void method248(class96 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field573++;
        if (class8.field72 >= 3) {
            class239.method1521(arg4, arg2, 0, arg0.field1795, arg0.field1747);
        } else {
            ((class18) class218.field3993).method97(arg4, arg2, arg0.field1830, arg0.field1740, class218.field3993.field4207 / 2, class218.field3993.field4204 / 2, class230.field4153, 256, arg0.field1795, arg0.field1747);
        }
        if (arg1 <= 24) {
            field572 = null;
        }
        class36.field603[arg3] = true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILmf;IJZ)Z")
    public static final boolean method249(int arg0, int arg1, int arg2, int arg3, int arg4, class136 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class123.method814(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIILog;)V")
    public static final void method250(boolean arg0, int arg1, int arg2, class159 arg3) {
        if (!arg0) {
            field566 = null;
        }
        if (arg3.field695 == arg2 && arg2 != -1) {
            class236 var4 = class99.method619(arg2, 4);
            int var5 = var4.field4273;
            if (var5 == 1) {
                arg3.field688 = 0;
                arg3.field699 = 0;
                arg3.field713 = arg1;
                arg3.field670 = 0;
                class168.method1101(arg3.field699, var4, arg3.field673, class210.field3854 == arg3, arg3.field723, 1497181864);
            }
            if (var5 == 2) {
                arg3.field670 = 0;
            }
        } else if (arg2 == -1 || arg3.field695 == -1 || class99.method619(arg2, 4).field4271 >= class99.method619(arg3.field695, 4).field4271) {
            arg3.field713 = arg1;
            arg3.field670 = 0;
            arg3.field695 = arg2;
            arg3.field688 = 0;
            arg3.field699 = 0;
            arg3.field725 = arg3.field697;
            if (arg3.field695 != -1) {
                class168.method1101(arg3.field699, class99.method619(arg3.field695, 4), arg3.field673, class210.field3854 == arg3, arg3.field723, 1497181864);
            }
        }
        field568++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static void method251(boolean arg0) {
        field565 = null;
        if (arg0) {
            field563 = null;
        }
        field574 = null;
        field566 = null;
        field569 = null;
        field572 = null;
        field563 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLkd;)Ldi;")
    public static final class43 method252(byte arg0, class112 arg1) {
        arg1.method716(-1308);
        int var2 = arg1.method716(-1308);
        class43 var3 = class46.method309(62, var2);
        var3.field744 = arg1.method716(-1308);
        field571++;
        int var4 = arg1.method716(-1308);
        int var5 = 0;
        if (arg0 >= -27) {
            method253(29, 29, (byte) 107, -25);
        }
        while (var5 < var4) {
            int var6 = arg1.method716(-1308);
            var3.method200(var6, (byte) -73, arg1);
            var5++;
        }
        var3.method234(69);
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)I")
    public static final int method253(int arg0, int arg1, byte arg2, int arg3) {
        field570++;
        int var4 = 256 - arg0;
        if (arg2 != 31) {
            field569 = null;
        }
        return ((arg1 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg0 & 0xFF0000) >> 8;
    }
}
