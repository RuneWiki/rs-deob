import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class134 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Z")
    public static boolean field2619 = false;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Llk;")
    public static class232 field2621 = new class232(64);

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lsg;")
    public static class30 field2628 = class167.method1221((byte) 33, "; Expires=");

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lmc;")
    public static class151 field2625;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Z")
    public static boolean field2618;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        field2621 = null;
        field2625 = null;
        field2628 = null;
        if (arg0 != -114) {
            field2619 = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Ldc;")
    public static final class88 method1009(byte arg0, int arg1) {
        field2626++;
        class88 var2 = (class88) class123.field2419.method1644((byte) -127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 19) {
            field2618 = false;
        }
        byte[] var3 = class91.field1837.method1115(arg1, (byte) -91, 16);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method732(12986, new class8(var3));
        }
        class123.field2419.method1646((long) arg1, var4, -121);
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lce;ILce;IZ)I")
    public static final int method1010(class205 arg0, int arg1, class205 arg2, int arg3, boolean arg4) {
        field2627++;
        if (arg3 == 1) {
            int var5 = arg2.field2178;
            int var6 = arg0.field2178;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg3 == 2) {
            return arg0.method1443((byte) 117).field3813.method275(arg2.method1443((byte) 117).field3813, (byte) -105);
        } else if (arg3 == 3) {
            if (arg0.field3665.method267(-52, class231.field4116)) {
                if (arg2.field3665.method267(-52, class231.field4116)) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3665.method267(-52, class231.field4116)) {
                return arg4 ? 1 : -1;
            } else {
                return arg0.field3665.method275(arg2.field3665, (byte) -105);
            }
        } else if (arg3 != 4) {
            if (arg1 != -24019) {
                method1008((byte) -25);
            }
            if (arg3 == 5) {
                if (arg0.method860(false)) {
                    return arg2.method860(false) ? 0 : 1;
                } else if (arg2.method860(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg0.method856(arg1 + 24023)) {
                    return arg2.method856(4) ? 0 : 1;
                } else if (arg2.method856(arg1 + 24023)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 != 7) {
                return arg0.field3673 - arg2.field3673;
            } else if (arg0.method854(-4851)) {
                return arg2.method854(arg1 + 19168) ? 0 : 1;
            } else if (arg2.method854(-4851)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0.method852((byte) 88)) {
            return arg2.method852((byte) 88) ? 0 : 1;
        } else if (arg2.method852((byte) 88)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
    public static final int method1011(int arg0, byte arg1) {
        field2624++;
        int var2 = 79 / ((-arg1 - 35) / 51);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILaa;)Lah;")
    public static final class170 method1012(int arg0, class8 arg1) {
        field2623++;
        return arg0 == -20477 ? new class170(arg1.method74(118), arg1.method74(119), arg1.method74(arg0 ^ 0xFFFFB05D), arg1.method74(arg0 + 20583), arg1.method60(23888), arg1.method63((byte) 114)) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class48.field1096 <= arg2 && class252.field4458 >= arg2) {
            int var5 = class68.method609(class275.field4804, 22050, class167.field3064, arg1);
            int var6 = class68.method609(class275.field4804, 22050, class167.field3064, arg4);
            class70.method654(var5, arg3, var6, -12586, arg2);
        }
        if (arg0 > -65) {
            method1011(-105, (byte) 77);
        }
        field2620++;
    }
}
