import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class294 extends class227 {

    @OriginalMember(owner = "client!iw", name = "C", descriptor = "Lcga;")
    public static class449 field3736 = new class449(21, -1);

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!iw", name = "A", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!iw", name = "G", descriptor = "[Lxa;")
    public static class468[] field3738;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1773(int arg0, int arg1, int arg2) {
        int var3 = class188.field2224[arg0][arg1][arg2];
        if (-class58.field745 == var3) {
            return false;
        } else if (class58.field745 == var3) {
            return true;
        } else {
            int var4 = arg1 << class480.field5972;
            int var5 = arg2 << class480.field5972;
            if (class224.method1354(var4 + 1, class299.field3801[arg0].method201(arg1, arg2), var5 + 1) && class224.method1354(class97.field1256 + var4 - 1, class299.field3801[arg0].method201(arg1 + 1, arg2), var5 + 1) && class224.method1354(class97.field1256 + var4 - 1, class299.field3801[arg0].method201(arg1 + 1, arg2 + 1), class97.field1256 + var5 - 1) && class224.method1354(var4 + 1, class299.field3801[arg0].method201(arg1, arg2 + 1), class97.field1256 + var5 - 1) && class224.method1354(class660.field8949 + var4, class299.field3801[arg0].method201(arg1, arg2), var5 + 1) && class224.method1354(class97.field1256 + var4 - 1, class299.field3801[arg0].method201(arg1 + 1, arg2), class660.field8949 + var5) && class224.method1354(class660.field8949 + var4, class299.field3801[arg0].method201(arg1, arg2 + 1), class97.field1256 + var5 - 1) && class224.method1354(class97.field1256 + var4 - 1, class299.field3801[arg0].method201(arg1, arg2), class660.field8949 + var5) && class224.method1354(class660.field8949 + var4, class299.field3801[arg0].method201(arg1, arg2), class660.field8949 + var5)) {
                class188.field2224[arg0][arg1][arg2] = class58.field745;
                return true;
            } else {
                class188.field2224[arg0][arg1][arg2] = -class58.field745;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILac;)I", line = 29)
    public static final int method1774(int arg0, class506 arg1) {
        ++field3735;
        if (arg0 >= -121) {
            field3738 = null;
        }
        class689 var2 = arg1.field6326;
        if (var2.field9546 != null) {
            var2 = var2.method3812(class327.field4084, -120);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field9505;
        class403 var4 = arg1.method209(2);
        if (arg1.field488) {
            var3 = var2.field9534;
        } else if (~arg1.field465 != ~var4.field5205 && ~arg1.field465 != ~var4.field5202 && ~arg1.field465 != ~var4.field5189 && arg1.field465 != var4.field5168) {
            if (arg1.field465 == var4.field5186 || ~arg1.field465 == ~var4.field5204 || arg1.field465 == var4.field5165 || ~arg1.field465 == ~var4.field5209) {
                var3 = var2.field9498;
            }
        } else {
            var3 = var2.field9519;
        }
        return var3;
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(B)V", line = 68)
    public static void method1775(byte arg0) {
        field3736 = null;
        field3738 = null;
        if (arg0 != -116) {
            field3736 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(FZ)V", line = 79)
    public final void method118(float arg0, boolean arg1) {
        super.field2933 = arg0;
        if (!arg1) {
            ++field3737;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)Ljg;", line = 94)
    public static final class317 method1776(boolean arg0, int arg1) {
        ++field3733;
        class317 var2 = (class317) class269.field3394.method1046(100, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class261.field3309.method1659(102, 0, arg1);
            if (var3 != null && var3.length > 1) {
                class317 var4 = class22.method141(var3, 111);
                class269.field3394.method1042((long) arg1, var4, arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIII)V", line = 116)
    public final void method116(byte arg0, int arg1, int arg2, int arg3) {
        super.field2936 = arg2;
        int var5 = 51 / ((47 - arg0) / 34);
        super.field2929 = arg1;
        ++field3734;
        super.field2931 = arg3;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(IIIIIF)V", line = 130)
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
