import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class272 implements class47 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lke;")
    public static class256 field4648 = class316.method2202(" de votre liste noire)3", 27626);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lke;")
    private static class256 field4649 = class316.method2202(" is already on your friend list)3", 27626);

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Lke;")
    public static class256 field4650 = field4649;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lke;")
    public static class256 field4655 = class316.method2202("rect_debug=", 27626);

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field4654 = 0;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "Lke;")
    public static class256 field4657 = class316.method2202("voudrait faire un -Bchange avec vous)3", 27626);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lff;")
    public static class4 field4658;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIJ[I)Lke;", line = 4)
    public final class256 method382(int arg0, int arg1, long arg2, int[] arg3) {
        field4656++;
        if (arg0 >= -32) {
            field4654 = 29;
        }
        if (arg1 == 0) {
            class292 var6 = class137.method990(10474, arg3[0]);
            return var6.method2029((int) arg2, -64);
        } else if (arg1 == 1 || arg1 == 10) {
            class36 var7 = class254.method1753((int) arg2, true);
            return var7.field591;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class137.method990(10474, arg3[0]).method2029((int) arg2, -64);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lng;I)V", line = 59)
    public static final void method1874(class138 arg0, int arg1) {
        if (arg1 > -42) {
            method1878(false, (class138) null);
        }
        class83.field1519 = arg0;
        field4651++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILrb;)V", line = 75)
    public static final void method1875(int arg0, class144 arg1) {
        if (arg0 != 0) {
            return;
        }
        field4647++;
        class187 var2 = (class187) class31.field498.method1744((byte) 125, arg1.field2532.method1780(true));
        if (var2 == null) {
            class22.method143((class279) null, arg1.field1254[0], 0, arg1.field1215[0], (class273) null, class255.field4377, arg1, 128);
        } else {
            var2.method1352(128);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 102)
    public static void method1876(int arg0) {
        field4649 = null;
        field4657 = null;
        field4655 = null;
        field4648 = null;
        field4650 = null;
        int var1 = -114 / ((-arg0) / 44);
        field4658 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZIIIZII)V", line = 122)
    public static final void method1877(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg3 != 2) {
            return;
        }
        field4652++;
        if (arg1 <= arg6) {
            return;
        }
        int var7 = (arg6 + arg1) / 2;
        int var8 = arg6;
        class182 var9 = class288.field4988[var7];
        class288.field4988[var7] = class288.field4988[arg1];
        class288.field4988[arg1] = var9;
        for (int var10 = arg6; var10 < arg1; var10++) {
            if (class22.method139(false, arg4, arg5, arg2, var9, arg0, class288.field4988[var10]) <= 0) {
                class182 var11 = class288.field4988[var10];
                class288.field4988[var10] = class288.field4988[var8];
                class288.field4988[var8++] = var11;
            }
        }
        class288.field4988[arg1] = class288.field4988[var8];
        class288.field4988[var8] = var9;
        method1877(arg0, var8 - 1, arg2, 2, arg4, arg5, arg6);
        method1877(arg0, arg1, arg2, 2, arg4, arg5, var8 + 1);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLng;)V", line = 165)
    public static final void method1878(boolean arg0, class138 arg1) {
        class237.field4043 = arg1;
        if (!arg0) {
            method1874((class138) null, -69);
        }
        field4653++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 176)
    public static final void method1879(int arg0, int arg1) {
        field4659++;
        if (~arg1 <= arg0 && arg1 < class196.field3592.length) {
            class196.field3592[arg1] = !class196.field3592[arg1];
        }
    }
}
