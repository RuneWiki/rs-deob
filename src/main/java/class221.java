import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class221 extends class68 {

    @OriginalMember(owner = "client!de", name = "G", descriptor = "Lce;")
    public static class126 field3728 = class206.method1445(-7923, "::wm2");

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Lce;")
    public static class126 field3740 = class206.method1445(-7923, "hint_mapmarkers");

    @OriginalMember(owner = "client!de", name = "X", descriptor = "Lce;")
    public static class126 field3745 = class206.method1445(-7923, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Lce;")
    public static class126 field3730 = class206.method1445(-7923, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Lce;")
    public static class126 field3733 = class206.method1445(-7923, "hint_mapedge");

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "[I")
    public static int[] field3749 = new int[32];

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lbc;")
    public class150 field3718;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Loj;")
    public class156 field3737;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Lpf;")
    public class249 field3725;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "Ljk;")
    public static class273 field3720;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lqf;")
    public class295 field3717;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "[Ltm;")
    public static class161[] field3727;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILbb;)Lce;", line = 25)
    public static final class126 method1514(int arg0, int arg1, class134 arg2) {
        field3747++;
        try {
            if (arg0 != -8333) {
                method1515((class112) null, 24, -35, (class273) null, true, 38, 72);
            }
            class126 var3 = new class126();
            var3.field2140 = arg2.method930(-15535);
            if (arg1 < var3.field2140) {
                var3.field2140 = arg1;
            }
            var3.field2158 = new byte[var3.field2140];
            arg2.field2299 += class63.field1068.method1921(var3.field2140, var3.field2158, 0, arg2.field2282, arg0 + 8453, arg2.field2299);
            return var3;
        } catch (Exception var5) {
            return class1.field7;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lwd;IILjk;ZII)V", line = 56)
    public static final void method1515(class112 arg0, int arg1, int arg2, class273 arg3, boolean arg4, int arg5, int arg6) {
        field3726++;
        if (arg3 == null) {
            return;
        }
        int var7 = class144.field2618 + class180.field3134 & 0x7FF;
        int var8 = Math.max(arg0.field1766 / 2, arg0.field1753 / 2) + 10;
        int var9 = arg2 * arg2 + arg5 * arg5;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class236.field3985[var7];
        int var11 = var10 * 256 / (class234.field3951 + 256);
        int var12 = class236.field3971[var7];
        int var13 = var12 * 256 / (class234.field3951 + 256);
        if (!arg4) {
            field3740 = (class126) null;
        }
        int var14 = arg2 * var11 + arg5 * var13 >> 16;
        int var15 = arg2 * var13 - (arg5 * var11) >> 16;
        if (class56.field846) {
            ((class198) arg3).method1403(arg0.field1766 / 2 + arg1 + var14 - arg3.field4600 / 2, arg6 - -(arg0.field1753 / 2) + -var15 - arg3.field4597 / 2, (class198) arg0.method740(false, (byte) -23));
        } else {
            ((class184) arg3).method1335(arg0.field1766 / 2 + arg1 + var14 - (arg3.field4600 / 2), arg0.field1753 / 2 + -var15 + arg6 + -(arg3.field4597 / 2), arg0.field1796, arg0.field1772);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)I", line = 94)
    public static int method1516(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V", line = 105)
    public static final void method1517(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 566320496) {
            method1514(-76, -115, (class134) null);
        }
        field3715++;
        if (class69.field1144 == 0 || arg0 == 0 || class282.field4683 >= 50 || arg1 == -1) {
            return;
        }
        class91.field1428[class282.field4683] = arg1;
        class280.field4658[class282.field4683] = arg0;
        class160.field2902[class282.field4683] = arg3;
        class291.field4826[class282.field4683] = null;
        class318.field5445[class282.field4683] = 0;
        class282.field4683++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 128)
    public static final void method1518(int arg0) {
        field3743++;
        class98 var1 = new class98();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class243.field4121[var2][var3] = var1;
            }
        }
        if (arg0 >= -110) {
            method1518(-67);
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V", line = 164)
    public static final void method1519(byte arg0) {
        field3742++;
        if (arg0 != -128) {
            return;
        }
        for (int var1 = 0; var1 < class30.field425; var1++) {
            int var2 = class279.field4639[var1];
            class89 var3 = class199.field3391[var2];
            if (var3 != null) {
                class298.method2011(64, var3.field1389.field5109, var3);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 193)
    public static void method1520(int arg0) {
        field3745 = null;
        field3730 = null;
        field3720 = null;
        field3749 = null;
        field3727 = null;
        int var1 = -121 / ((arg0 - 16) / 59);
        field3733 = null;
        field3728 = null;
        field3740 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 218)
    public static final void method1521(boolean arg0) {
        if (!arg0) {
            method1521(false);
        }
        class136.field2362.method1178(-112);
        class41.field659.method1178(-114);
        field3746++;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 235)
    public final void method1522(int arg0) {
        field3748++;
        this.field3737 = null;
        this.field3725 = null;
        this.field3718 = null;
        if (arg0 != 2) {
            field3745 = (class126) null;
        }
        this.field3717 = null;
    }
}
