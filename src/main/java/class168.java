import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class168 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    public static int[] field3046;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
    public static final boolean method1108(int arg0, int arg1, int arg2) {
        if (arg0 != -9) {
            field3046 = null;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        field3051++;
        class130 var3 = class84.method574(-127, arg1);
        return var3.method862(arg2, -116);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lvf;I)V")
    public static final void method1109(class265 arg0, int arg1) {
        class163.field2963 = arg0;
        field3048++;
        if (class281.field4957.field4024 == null) {
            return;
        }
        try {
            class265 var2 = class96.field1688.method1803(arg1 ^ 0xFFFFFF9B, class281.field4957.field4024);
            class265 var3 = class214.field3845.method1803(-115, class281.field4957.field4024);
            class265 var4 = class148.method1022(10, new class265[] { var2, class30.field764, arg0, class21.field609, var3 });
            class265 var5;
            if (arg0.method1808((byte) -15) == arg1) {
                var5 = class148.method1022(10, new class265[] { var4, class12.field399 });
            } else {
                var5 = class148.method1022(10, new class265[] { var4, class239.field4182, class197.method1359(10, class136.method950(8954) + 94608000000L), class56.field1143, class120.method807(-778089108, 94608000L) });
            }
            class148.method1022(10, new class265[] { class140.field2612, var5, class214.field3828 }).method1796(102, class281.field4957.field4024);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBI)V")
    public static final void method1110(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 16) {
            return;
        }
        field3047++;
        if ((arg0 - arg4) >= class107.field1890 && arg0 + arg4 <= class79.field1510 && class81.field1521 <= arg2 - arg4 && class205.field3681 >= (arg2 + arg4)) {
            class134.method887(arg4, arg0, -1, arg1, arg2);
        } else {
            class219.method1503(true, arg0, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLfl;)V")
    public static final void method1111(byte arg0, class192 arg1) {
        class211.field3797 = arg1;
        if (arg0 >= -23) {
            method1110(115, 121, -28, (byte) 55, -82);
        }
        field3050++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1112(int arg0, int[] arg1) {
        int var2 = -40 % ((-arg0 - 9) / 47);
        field3049++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var3 = new int[arg1.length];
            class194.method1340(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1113(byte arg0) {
        if (arg0 == 58) {
            field3046 = null;
        }
    }
}
