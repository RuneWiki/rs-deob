import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class57 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lmd;")
    private class212 field780 = new class212();

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Z")
    public static boolean field781 = false;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lqe;")
    private static class168 field788 = class66.method448("Loaded wordpack", 76);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[I")
    public static int[] field792 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field793 = 500;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lqe;")
    public static class168 field790 = field788;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public final void method393(byte arg0) {
        field783++;
        while (true) {
            class212 var2 = this.field780.field3660;
            if (this.field780 == var2) {
                if (arg0 > -45) {
                    this.method396((byte) -126);
                    return;
                } else {
                    return;
                }
            }
            var2.method1369(-127);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Loe;ILoe;)V")
    public static final void method394(class256 arg0, int arg1, class256 arg2) {
        class166.field2832 = class163.method1054(arg2, 0, -137675668, arg0, class251.field4347);
        field787++;
        class173.field3022 = (class11) class166.field2832;
        class199.field3434 = class163.method1054(arg2, 0, arg1 ^ 0xF7CB3C6C, arg0, class253.field4373);
        class123.field2028 = class163.method1054(arg2, arg1, -137675668, arg0, class143.field2517);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILoe;)V")
    public static final void method395(int arg0, class256 arg1) {
        field789++;
        class103.field1664 = arg1;
        if (arg0 != 1) {
            field793 = -117;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Lmd;")
    public final class212 method396(byte arg0) {
        field786++;
        class212 var2 = this.field780.field3660;
        if (this.field780 == var2) {
            return null;
        }
        if (arg0 >= -82) {
            this.method393((byte) -115);
        }
        var2.method1369(-128);
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Lmd;")
    public final class212 method397(boolean arg0) {
        if (!arg0) {
            method395(-67, null);
        }
        class212 var2 = this.field780.field3660;
        field791++;
        return this.field780 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILmd;)V")
    public final void method398(int arg0, class212 arg1) {
        field784++;
        if (arg1.field3662 != null) {
            arg1.method1369(-121);
        }
        int var3 = -71 % ((arg0 - 8) / 36);
        arg1.field3662 = this.field780;
        arg1.field3660 = this.field780.field3660;
        arg1.field3662.field3660 = arg1;
        arg1.field3660.field3662 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V")
    public static void method399(byte arg0) {
        if (arg0 < -34) {
            field790 = null;
            field792 = null;
            field788 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class57() {
        this.field780.field3660 = this.field780;
        this.field780.field3662 = this.field780;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLmd;)V")
    public final void method400(byte arg0, class212 arg1) {
        field785++;
        if (arg1.field3662 != null) {
            arg1.method1369(-121);
        }
        arg1.field3662 = this.field780.field3662;
        arg1.field3660 = this.field780;
        int var3 = -76 % ((arg0 + 83) / 39);
        arg1.field3662.field3660 = arg1;
        arg1.field3660.field3662 = arg1;
    }
}
