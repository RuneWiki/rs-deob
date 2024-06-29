import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class203 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field3708 = -1;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lfl;")
    public static class191 field3717 = new class191();

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lli;")
    public static class185 field3723 = class245.method1649("Angreifen", 122);

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3724 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lfl;")
    public static class191 field3721 = new class191();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lle;")
    public class207 field3714;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lhi;")
    public static class250 field3712;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
    public int[] field3718;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[Lli;")
    public class185[] field3709;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "[Ldd;")
    public static class211[] field3722;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
    public static final int method1443(int arg0, boolean arg1) {
        field3719++;
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        if (arg1) {
            method1445(122, -78, (class185) null);
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public static final void method1444(int arg0, int arg1, int arg2) {
        field3711++;
        if (arg0 != 26817) {
            field3724 = 35;
        }
        for (int var3 = 0; var3 < class273.field4839; var3++) {
            class117 var4 = class202.method1440(var3, true);
            if (var4 != null) {
                int var5 = var4.field2078;
                if (var5 >= 0 && !class167.field3116.method380(var5, false)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field2089 >= 0) {
                    int var10 = var4.field2089;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (var10 + arg1 & 0xFC00) + var11;
                    var6 = class167.field3114[class178.method1253(true, 96, var12)];
                } else if (var5 >= 0) {
                    var6 = class167.field3114[class178.method1253(true, 96, class167.field3116.method385(1, var5))];
                } else if (var4.field2093 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field2093;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg1 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class167.field3114[class178.method1253(true, 96, var9)];
                }
                class40.field637[var3 + 1] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILli;)V")
    public static final void method1445(int arg0, int arg1, class185 arg2) {
        class182.field3349.method577(137, 0);
        class182.field3349.method846(arg0, true);
        class182.field3349.method870(arg2.method1327((byte) 101), (byte) 122);
        if (arg1 <= -18) {
            field3715++;
            class39.field612++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method1446(byte arg0) {
        int var1 = 74 / ((-arg0 - 54) / 45);
        if (class160.field3031.toLowerCase().indexOf("microsoft") == -1) {
            class194.field3577[44] = 71;
            class194.field3577[46] = 72;
            class194.field3577[45] = 26;
            if (class160.field3035 == null) {
                class194.field3577[222] = 59;
                class194.field3577[192] = 58;
            } else {
                class194.field3577[520] = 59;
                class194.field3577[192] = 28;
                class194.field3577[222] = 58;
            }
            class194.field3577[93] = 43;
            class194.field3577[92] = 74;
            class194.field3577[47] = 73;
            class194.field3577[91] = 42;
            class194.field3577[61] = 27;
            class194.field3577[59] = 57;
        } else {
            class194.field3577[223] = 28;
            class194.field3577[192] = 58;
            class194.field3577[191] = 73;
            class194.field3577[186] = 57;
            class194.field3577[188] = 71;
            class194.field3577[187] = 27;
            class194.field3577[190] = 72;
            class194.field3577[189] = 26;
            class194.field3577[220] = 74;
            class194.field3577[222] = 59;
            class194.field3577[219] = 42;
            class194.field3577[221] = 43;
        }
        field3720++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lhi;IILhi;I)Ltg;")
    public static final class270 method1447(class250 arg0, int arg1, int arg2, class250 arg3, int arg4) {
        field3710++;
        if (arg2 >= -9) {
            return null;
        } else if (class224.method1551(arg1, arg4, arg0, (byte) -94)) {
            return class175.method1240((byte) 121, arg3.method1688(0, arg1, arg4));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
    public static final int method1448(int arg0) {
        field3707++;
        if (class215.field3955 == null) {
            return -1;
        }
        while (class262.field4657 < class215.field3955.field3133) {
            if (class215.field3955.method1213((byte) 119, class262.field4657)) {
                return class262.field4657++;
            }
            class262.field4657++;
        }
        return arg0 == 93 ? -1 : 107;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public static void method1449(byte arg0) {
        field3722 = null;
        field3717 = null;
        int var1 = 58 % ((14 - arg0) / 63);
        field3721 = null;
        field3712 = null;
        field3723 = null;
    }
}
