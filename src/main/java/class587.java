import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class587 {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lqp;")
    public static class586 field8716 = new class586(78, -2);

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[Z")
    public static boolean[] field8718 = new boolean[100];

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field8720 = 0;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field8719 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZLbr;Z)V")
    public static final void method3424(int arg0, boolean arg1, class184 arg2, boolean arg3) {
        field8713++;
        int var4 = arg2.field2796;
        int var5 = (int) arg2.field7465;
        arg2.method2997(1);
        if (arg0 != 544) {
            field8720 = -24;
        }
        if (arg1) {
            class59.method378(var4, (byte) 71);
        }
        class441.method2690((byte) -105, var4);
        class311 var6 = class436.method2659(true, var5);
        if (var6 != null) {
            class619.method3586(arg0 ^ 0x252, var6);
        }
        class613.method3571(arg0 ^ 0x25C);
        if (!arg3 && class540.field8007 != -1) {
            class35.method176(1, -115, class540.field8007);
        }
        class133 var7 = new class133(class600.field8865);
        for (class184 var8 = (class184) var7.method817(26858); var8 != null; var8 = (class184) var7.method813(105)) {
            if (!var8.method2994(arg0 - 513)) {
                var8 = (class184) var7.method817(26858);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2795 == 3) {
                int var9 = (int) var8.field7465;
                if (var9 >>> 16 == var4) {
                    method3424(544, true, var8, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
    public static final boolean method3425(int arg0, int arg1, int arg2) {
        if (arg2 <= 42) {
            return true;
        } else {
            field8712++;
            return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method3426(int arg0) {
        field8714++;
        class233.field3437 = class629.method3667(8, true, 8, 4, 2048, 1, 0.4F, 35);
        if (arg0 < 38) {
            field8716 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZZ)V")
    public static final void method3427(boolean arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            field8720 = 52;
        }
        field8717++;
        if (arg0) {
            class647.field9383++;
            class474.method2886(-108);
        }
        if (arg2) {
            class165.field2236++;
            class32.method146(11894);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static void method3428(int arg0) {
        field8718 = null;
        field8716 = null;
        if (arg0 != 8) {
            method3427(false, false, false);
        }
    }
}
