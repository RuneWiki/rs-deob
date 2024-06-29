import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class280 extends class200 {

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Lrc;")
    public class67 field4902;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "Loa;")
    public static class99 field4900 = class221.method1463(2844, "comp-Btence ");

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "Loa;")
    public static class99 field4904 = class221.method1463(2844, "blinken2:");

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "Loa;")
    public static class99 field4907 = class221.method1463(2844, "blinken3:");

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "F")
    public static float field4912;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "Ltg;")
    public static class182 field4908;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "Ltg;")
    public static class182 field4913;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "[I")
    public static int[] field4903;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILtf;)V")
    public static final void method1842(int arg0, int arg1, int arg2, class107 arg3) {
        field4906++;
        if (class42.field717 != null || class244.field4209 || arg3 == null || class152.method1011(arg3, (byte) 115) == null) {
            return;
        }
        class42.field717 = arg3;
        class149.field2616 = class152.method1011(arg3, (byte) 50);
        class220.field3823 = false;
        if (arg2 != -129) {
            field4903 = null;
        }
        class139.field2466 = arg1;
        class90.field1537 = arg0;
        class11.field84 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZBII)V")
    public static final void method1843(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field4905++;
        class55.field904++;
        if (!arg2) {
            class232.method1514(true, true);
            class130.method860(true, 102);
            class232.method1514(true, false);
        }
        class130.method860(false, 92);
        if (!arg2) {
            class97.method648(-124);
        }
        class137.method938(89);
        if (arg3 > -1) {
            return;
        }
        class136.field2376 = arg5;
        class136.field2378 = arg1;
        if (class141.field2481 == 1) {
            int var6 = class160.field2843;
            if (class194.field3407 / 256 > var6) {
                var6 = class194.field3407 / 256;
            }
            int var7 = class239.field4129 + class223.field3880 & 0x7FF;
            if (class197.field3426[4] && var6 < class22.field262[4] + 128) {
                var6 = class22.field262[4] + 128;
            }
            class65.method430(class221.field3843, var6 * 3 + 600, class53.field875, class115.method777(-1, class168.field3006.field1301, class255.field4407, class168.field3006.field1325) - 50, arg0, var7, var6, -127);
        }
        int var8 = class24.field367;
        int var9 = class221.field3850;
        int var10 = class2.field13;
        int var11 = class267.field4709;
        int var12 = class173.field3061;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class197.field3426[var13]) {
                int var19 = (int) ((double) (-class130.field2269[var13]) + Math.random() * (double) (class130.field2269[var13] * 2 + 1) + Math.sin((double) class237.field4107[var13] / 100.0D * (double) class197.field3430[var13]) * (double) class22.field262[var13]);
                if (var13 == 1) {
                    class24.field367 += var19;
                }
                if (var13 == 0) {
                    class2.field13 += var19;
                }
                if (var13 == 4) {
                    class267.field4709 += var19;
                    if (class267.field4709 < 128) {
                        class267.field4709 = 128;
                    }
                    if (class267.field4709 > 383) {
                        class267.field4709 = 383;
                    }
                }
                if (var13 == 2) {
                    class221.field3850 += var19;
                }
                if (var13 == 3) {
                    class173.field3061 = class173.field3061 + var19 & 0x7FF;
                }
            }
        }
        class253.method1638((byte) -123);
        class68.method453(arg1, arg5, arg1 + arg4, arg5 - -arg0);
        class134.method900();
        if (class244.field4209 || arg1 > class1.field10 || arg1 + arg4 <= class1.field10 || arg5 > class20.field237 || class20.field237 >= arg0 + arg5) {
            class9.field73 = false;
            class32.field569 = 0;
        } else {
            int var14 = class86.field1492;
            class32.field569 = 0;
            class9.field73 = true;
            int var15 = class119.field2108;
            int var16 = class238.field4119;
            class225.field3906 = (class1.field10 - arg1) * (var16 - var14) / arg4 + var14;
            int var17 = class254.field4386;
            class138.field2450 = (class20.field237 - arg5) * (var17 - var15) / arg0 + var15;
        }
        class225.method1485(0);
        byte var18 = class94.method635(-69) == 2 ? (byte) class55.field904 : 1;
        class68.method465(arg1, arg5, arg4, arg0, 0);
        class289.method1940(class2.field13, class24.field367, class221.field3850, class267.field4709, class173.field3061, class228.field3951, class55.field898, class151.field2650, class270.field4762, class223.field3875, class174.field3071, class255.field4407 + 1, var18, class168.field3006.field1325 >> 7, class168.field3006.field1301 >> 7);
        class225.method1485(0);
        class1.method6();
        class143.method970((byte) -60, 256, arg4, arg1, arg5, 256, arg0);
        class110.method760(arg4, 256, 256, arg1, 1588033089, arg5, arg0);
        ((class145) class134.field2338).method988(0, class224.field3889);
        class145.method990(arg5, 102, arg4, arg0, arg1);
        class221.field3850 = var9;
        class2.field13 = var10;
        class24.field367 = var8;
        class173.field3061 = var12;
        class267.field4709 = var11;
        if (class130.field2265 && class58.field975.method1400(127) == 0) {
            class130.field2265 = false;
        }
        if (class130.field2265) {
            class68.method465(arg1, arg5, arg4, arg0, 0);
            class99.method672(class251.field4324, false, true);
        }
        if (!arg2 && !class130.field2265 && !class244.field4209 && class1.field10 >= arg1 && class1.field10 < (arg1 + arg4) && class20.field237 >= arg5 && class20.field237 < arg5 + arg0) {
            class123.method811(arg4, arg5, arg0, arg1, (byte) -125, class1.field10, class20.field237);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lrc;)V")
    public class280(class67 arg0) {
        this.field4902 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public static void method1844(int arg0) {
        field4900 = null;
        field4913 = null;
        field4903 = null;
        if (arg0 >= -77) {
            method1843(-68, 36, false, (byte) -66, -16, -89);
        }
        field4907 = null;
        field4908 = null;
        field4904 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lcg;")
    public static final class167 method1845(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3762;
    }
}
