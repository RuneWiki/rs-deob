import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class212 extends class200 {

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    private int field3665;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "Loa;")
    public class99 field3675;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "[Lpi;")
    public static class139[] field3666;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)Z")
    public final boolean method1415(int arg0) {
        if (arg0 == 11) {
            field3671++;
            return this.field3665 == 115;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Loa;I)V")
    public static final void method1416(class99 arg0, int arg1) {
        field3677++;
        int var2 = class3.method20(arg0, (byte) 124);
        if (~var2 != arg1) {
            class196.method1316(class127.field2206.field1517[var2], (byte) -111, class127.field2206.field1523[var2]);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BIII)V")
    public static final void method1417(byte arg0, int arg1, int arg2, int arg3) {
        field3676++;
        if (arg0 > -116) {
            field3669 = 72;
        }
        class65 var4 = class152.method1010(arg2, 11, (byte) -106);
        var4.method433(32);
        var4.field1094 = arg1;
        var4.field1092 = arg3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([IIJI)Loa;")
    public static final class99 method1418(int[] arg0, int arg1, long arg2, int arg3) {
        field3668++;
        if (class90.field1540 != null) {
            class99 var5 = class90.field1540.method4((byte) -108, arg1, arg0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return arg1 == arg3 ? class156.method1069(-118, arg2).method690(80) : class187.method1283((byte) -93, arg2);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lik;B)V")
    public final void method1419(class261 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1693((byte) 114);
            if (var3 == 0) {
                if (arg1 != 64) {
                    field3666 = null;
                }
                field3673++;
                return;
            }
            this.method1421(var3, arg0, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
    public static void method1420(byte arg0) {
        field3666 = null;
        int var1 = 61 / ((arg0 + 3) / 58);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILik;B)V")
    private final void method1421(int arg0, class261 arg1, byte arg2) {
        field3667++;
        if (arg0 == 1) {
            this.field3665 = arg1.method1693((byte) 76);
        } else if (arg0 == 2) {
            this.field3672 = arg1.method1712(-4);
        } else if (arg0 == 5) {
            this.field3675 = arg1.method1705(126);
        }
        if (arg2 <= 68) {
            field3669 = -61;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lik;I)Lll;")
    public static final class207 method1422(class261 arg0, int arg1) {
        field3674++;
        if (arg1 != 115) {
            method1418((int[]) null, -28, 116L, -90);
        }
        return new class207(arg0.method1751(128), arg0.method1751(128), arg0.method1751(128), arg0.method1751(128), arg0.method1747(false), arg0.method1693((byte) -125));
    }
}
