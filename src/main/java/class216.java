import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class216 extends class172 {

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "[I")
    public static int[] field3808 = new int[2];

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "[Z")
    public static boolean[] field3819 = new boolean[100];

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "Lid;")
    private static class149 field3820 = class60.method382("Close", (byte) 54);

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lid;")
    public static class149 field3816 = field3820;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lid;")
    public class149 field3815;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lid;")
    public static final class149 method1454(int arg0) {
        ++field3811;
        class149 var1 = class245.field4307;
        if (class236.field4132 != 0) {
            var1 = class173.field3184;
        }
        class149 var2 = class171.field3158;
        if (arg0 != -8969) {
            return null;
        } else {
            if (class159.field2927 != null) {
                var2 = class237.method1603(new class149[] { class214.field3795, class159.field2927 }, arg0 ^ 9057);
            }
            return class237.method1603(new class149[] { class108.field1855, var1, class18.field265, class211.method1434(class39.field588, true), class151.field2757, class211.method1434(field3807, true), var2, class205.field3679 }, arg0 ^ 9081);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)I")
    public final int method1455(int arg0) {
        int var2 = -92 / ((-26 - arg0) / 59);
        ++field3814;
        return (int) (255L & super.field1148 >>> 32);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)I")
    public final int method1456(byte arg0) {
        if (arg0 <= 122) {
            return -123;
        } else {
            ++field3817;
            return (int) super.field1148;
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public final void method1457(int arg0) {
        if (arg0 == 0) {
            super.field3174 = class81.method608(arg0 ^ 19644) - -500L | super.field3174 & Long.MIN_VALUE;
            class90.field1612.method433(this, arg0 + -225);
            ++field3806;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)J")
    public final long method1458(byte arg0) {
        if (arg0 != -34) {
            this.method1456((byte) 107);
        }
        ++field3802;
        return Long.MAX_VALUE & super.field3174;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
    public final void method1459(boolean arg0) {
        super.field3174 |= Long.MIN_VALUE;
        if (!arg0) {
            field3812 = -4;
        }
        if (~this.method1458((byte) -34) == -1L) {
            class16.field225.method433(this, -225);
        }
        ++field3803;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)V")
    public static void method1460(byte arg0) {
        field3820 = null;
        if (arg0 >= -16) {
            method1461(-43, 97, -52, 44, (byte) 3);
        }
        field3816 = null;
        field3819 = null;
        field3808 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIB)V")
    public static final void method1461(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -102) {
            method1461(-85, 69, -76, -15, (byte) -3);
        }
        class216 var5 = class139.method972(arg1, false, 10);
        ++field3804;
        var5.method1459(true);
        var5.field3809 = arg3;
        var5.field3818 = arg2;
        var5.field3813 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
    public class216(int arg0, int arg1) {
        super.field1148 = (long) arg0 << 32 | (long) arg1;
    }
}
