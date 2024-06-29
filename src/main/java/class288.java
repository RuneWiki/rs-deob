import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class288 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lve;")
    private static class255 field4953 = class87.method607(85, "Opened title screen");

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lve;")
    public static class255 field4954 = field4953;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Ltl;")
    public static class197 field4961 = null;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ltd;")
    public class229 field4952;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
    public static int[] field4957;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    public int[] field4958;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 10)
    public static final void method2041(int arg0) {
        field4956++;
        Container var1;
        if (class307.field5221 != null) {
            var1 = class307.field5221;
        } else if (class37.field561 == null) {
            var1 = class221.field3728.field626;
        } else {
            var1 = class37.field561;
        }
        class289.field4980 = var1.getSize().width;
        if (arg0 <= 41) {
            field4957 = (int[]) null;
        }
        class107.field1790 = var1.getSize().height;
        if (class37.field561 == var1) {
            Insets var2 = class37.field561.getInsets();
            class289.field4980 -= var2.left + var2.right;
            class107.field1790 -= var2.top + var2.bottom;
        }
        if (class261.method1820((byte) 114) < 2) {
            class201.field3479 = 503;
            class162.field2728 = 0;
            class210.field3589 = 765;
            class64.field965 = (class289.field4980 - 765) / 2;
        } else {
            class162.field2728 = 0;
            class210.field3589 = class289.field4980;
            class64.field965 = 0;
            class201.field3479 = class107.field1790;
        }
        if (class281.field4827) {
            class281.method1989(class210.field3589, class201.field3479);
        }
        class240.field3999.setSize(class210.field3589, class201.field3479);
        if (class37.field561 == var1) {
            Insets var3 = class37.field561.getInsets();
            class240.field3999.setLocation(class64.field965 + var3.left, class162.field2728 + var3.top);
        } else {
            class240.field3999.setLocation(class64.field965, class162.field2728);
        }
        if (class264.field4459 != -1) {
            class155.method1141(-126, true);
        }
        class252.method1726((byte) 124);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 81)
    public static void method2042(int arg0) {
        if (arg0 != 25352) {
            method2041(-95);
        }
        field4961 = null;
        field4953 = null;
        field4957 = null;
        field4954 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZII)V", line = 117)
    public static final void method2043(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4951++;
        int var6 = arg5 - arg1;
        int var7 = arg4 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class244.method1691(arg2, arg5, !arg3, arg1, arg0);
            }
        } else if (var6 == 0) {
            class238.method1647(arg2, arg4, arg1, (byte) -27, arg0);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg4;
                arg0 = arg1;
                arg4 = arg5;
                arg5 = var10;
                arg1 = var9;
            }
            if (arg4 < arg0) {
                int var11 = arg0;
                arg0 = arg4;
                int var12 = arg1;
                arg1 = arg5;
                arg5 = var12;
                arg4 = var11;
            }
            int var13 = arg1;
            if (!arg3) {
                method2042(-96);
            }
            int var14 = arg4 - arg0;
            int var15 = arg5 - arg1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg5 > arg1 ? 1 : -1;
            if (var8) {
                for (int var19 = arg0; var19 <= arg4; var19++) {
                    var16 += var15;
                    class250.field4213[var19][var13] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg4; var18++) {
                    class250.field4213[var13][var18] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }
}
