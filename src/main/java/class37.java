import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class37 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Li;")
    private static class88 field664 = class208.method1425(105, "Please enter your password)3");

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Li;")
    public static class88 field665 = class208.method1425(105, ":clanreq:");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Li;")
    public static class88 field662 = field664;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Li;")
    private static class88 field668 = class208.method1425(105, "flash1:");

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Li;")
    public static class88 field669 = field668;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Li;")
    public static class88 field663 = field668;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lnb;")
    public static class144 field672;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIBI)V")
    public static final void method248(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field667++;
        class210.field3992++;
        class164.method1130(true, (byte) 127);
        class149.method1025(true, -11654);
        class164.method1130(false, (byte) 111);
        class149.method1025(false, -11654);
        class39.method256(-98);
        class199.method1372(-1);
        if (!class179.field3569) {
            int var5 = class64.field1173;
            int var6 = class98.field1797 + class207.field3932 & 0x7FF;
            if (class71.field1328 / 256 > var5) {
                var5 = class71.field1328 / 256;
            }
            if (class233.field4370[4] && class66.field1194[4] + 128 > var5) {
                var5 = class66.field1194[4] + 128;
            }
            class47.method359(-114, field666, class239.method1586(class240.field4458.field4138, class240.field4458.field4123, 2, class149.field2909) - 50, var6, var5, var5 * 3 + 600, arg2, class233.field4368);
        }
        int var7;
        if (class179.field3569) {
            var7 = class152.method1042(-121);
        } else {
            var7 = class131.method887((byte) 39);
        }
        int var8 = class108.field1956;
        if (arg3 < 40) {
            field666 = -23;
        }
        int var9 = class207.field3936;
        int var10 = class79.field1428;
        int var11 = class184.field3610;
        int var12 = class170.field3259;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class233.field4370[var13]) {
                int var21 = (int) (Math.random() * (double) (class201.field3836[var13] * 2 + 1) + Math.sin((double) class194.field3716[var13] / 100.0D * (double) class190.field3676[var13]) * (double) class66.field1194[var13] - (double) class201.field3836[var13]);
                if (var13 == 3) {
                    class170.field3259 = class170.field3259 + var21 & 0x7FF;
                }
                if (var13 == 4) {
                    class207.field3936 += var21;
                    if (class207.field3936 < 128) {
                        class207.field3936 = 128;
                    }
                    if (class207.field3936 > 383) {
                        class207.field3936 = 383;
                    }
                }
                if (var13 == 2) {
                    class184.field3610 += var21;
                }
                if (var13 == 1) {
                    class108.field1956 += var21;
                }
                if (var13 == 0) {
                    class79.field1428 += var21;
                }
            }
        }
        class72.method480(arg1, arg4, arg0 + arg1, arg2 + arg4);
        class173.method1237();
        boolean var14 = false;
        int var15 = class28.field471;
        int var16 = class239.field4451;
        if (var15 >= arg1 && arg1 + arg0 > var15 && arg4 <= var16 && var16 < arg2 + arg4) {
            class53.field997 = true;
            class161.field3103 = 0;
            int var17 = class147.field2768;
            int var18 = class151.field2933;
            int var19 = class58.field1102;
            class141.field2612 = (class28.field471 - arg1) * (var18 - var17) / arg0 + var17;
            int var20 = class217.field4057;
            class184.field3606 = (class239.field4451 - arg4) * (var20 - var19) / arg2 + var19;
        } else {
            class53.field997 = false;
            class161.field3103 = 0;
        }
        class219.method1481(2);
        class72.method478(arg1, arg4, arg0, arg2, 0);
        if (!var14) {
            class113.method774(class79.field1428, class108.field1956, class184.field3610, class207.field3936, class170.field3259, var7, null, null, null, null, null, null, 0, (byte) 0, class240.field4458.field4138 >> 7, class240.field4458.field4123 >> 7);
        }
        class219.method1481(2);
        class110.method765();
        class53.method391(arg1, arg4, 256, 256, arg2, 125, arg0);
        class148.method995(arg1, arg4, 256, 256, -96, arg2, arg0);
        ((class68) class173.field3358).method466(class17.field261, 28948);
        class11.method53(arg1, arg2, arg4, arg0, (byte) -83);
        class170.field3259 = var12;
        class207.field3936 = var9;
        class79.field1428 = var10;
        class108.field1956 = var8;
        class184.field3610 = var11;
        if (class154.field2982 && class158.method1069(true, 0, false) == 0) {
            class154.field2982 = false;
        }
        if (class154.field2982) {
            class72.method478(arg1, arg4, arg0, arg2, 0);
            client.method221(class242.field4480, false, -22717);
        }
        if (!class154.field2982 && !class108.field1960 && arg1 <= var15 && var15 < arg0 + arg1 && arg4 <= var16 && var16 < arg2 + arg4) {
            class204.method1400(var16, arg1, arg2, arg0, arg4, var15, -1450689187);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method249(int arg0) {
        field663 = null;
        field662 = null;
        if (arg0 != 256) {
            return;
        }
        field664 = null;
        field669 = null;
        field665 = null;
        field672 = null;
        field668 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lnb;BI)Lpf;")
    public static final class169 method250(class144 arg0, byte arg1, int arg2) {
        field670++;
        if (arg1 != 0) {
            field668 = null;
        }
        return class212.method1453((byte) 53, arg2, arg0) ? class237.method1573(-1) : null;
    }
}
