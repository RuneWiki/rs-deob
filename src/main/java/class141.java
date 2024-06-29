import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class141 {

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field2625 = 0;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public int field2629 = 0;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lsg;")
    public static class169 field2628 = class165.method1060("<br>(X", 1536);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lrg;")
    public static class160 field2621 = new class160(5000);

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field2630 = 0;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Lsg;")
    public static class169 field2633 = class165.method1060(")1j", 1536);

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lbg;")
    public static class18 field2620;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Lac;")
    public class4 field2634;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method936(int arg0) {
        for (int var1 = -1; var1 < field2631; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class202.field3932[var1];
            }
            class196 var7 = class65.field1213[var6];
            if (var7 != null && var7.field3723 > 0) {
                var7.field3723--;
                if (var7.field3723 == 0) {
                    var7.field3726 = null;
                }
            }
        }
        int var2 = -30 / ((arg0 + 51) / 33);
        for (int var3 = 0; var3 < class164.field3149; var3++) {
            int var4 = class182.field3547[var3];
            class197 var5 = class54.field992[var4];
            if (var5 != null && var5.field3723 > 0) {
                var5.field3723--;
                if (var5.field3723 == 0) {
                    var5.field3726 = null;
                }
            }
        }
        field2613++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field2621 = null;
        field2620 = null;
        if (arg0 == -102) {
            field2633 = null;
            field2628 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLv;)V")
    public static final void method938(byte arg0, class189 arg1) {
        field2624++;
        if (arg1.field3695 == 0) {
            return;
        }
        if (arg1.field3701 != -1 && arg1.field3701 < 32768) {
            class197 var2 = class54.field992[arg1.field3701];
            if (var2 != null) {
                int var3 = arg1.field3679 - var2.field3679;
                int var4 = arg1.field3698 - var2.field3698;
                if (var4 != 0 || var3 != 0) {
                    arg1.field3681 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3701 >= 32768) {
            int var5 = arg1.field3701 - 32768;
            if (class206.field4041 == var5) {
                var5 = 2047;
            }
            class196 var6 = class65.field1213[var5];
            if (var6 != null) {
                int var7 = arg1.field3698 - var6.field3698;
                int var8 = arg1.field3679 - var6.field3679;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3681 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3721 != 0 || arg1.field3662 != 0) && (arg1.field3702 == 0 || arg1.field3670 > 0)) {
            int var9 = arg1.field3679 - (arg1.field3662 - class191.field3761 - class191.field3761) * 64;
            int var10 = arg1.field3698 - (arg1.field3721 - class179.field3489 - class179.field3489) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field3681 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field3662 = 0;
            arg1.field3721 = 0;
        }
        if (arg0 < 111) {
            method936(55);
        }
        int var11 = arg1.field3681 - arg1.field3719 & 0x7FF;
        if (var11 == 0) {
            arg1.field3720 = 0;
            return;
        }
        arg1.field3720++;
        if (var11 > 1024) {
            arg1.field3719 -= arg1.field3695;
            boolean var12 = true;
            if (var11 < arg1.field3695 || 2048 - arg1.field3695 < var11) {
                var12 = false;
                arg1.field3719 = arg1.field3681;
            }
            if (arg1.field3716 == arg1.field3683 && (arg1.field3720 > 25 || var12)) {
                if (arg1.field3722 == -1) {
                    arg1.field3683 = arg1.field3673;
                } else {
                    arg1.field3683 = arg1.field3722;
                }
            }
        } else {
            arg1.field3719 += arg1.field3695;
            boolean var13 = true;
            if (var11 < arg1.field3695 || var11 > 2048 - arg1.field3695) {
                var13 = false;
                arg1.field3719 = arg1.field3681;
            }
            if (arg1.field3716 == arg1.field3683 && (arg1.field3720 > 25 || var13)) {
                if (arg1.field3715 == -1) {
                    arg1.field3683 = arg1.field3673;
                } else {
                    arg1.field3683 = arg1.field3715;
                }
            }
        }
        arg1.field3719 &= 0x7FF;
    }
}
