import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class315 {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Lki;")
    public static class498 field4490 = new class498(62, 0);

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "[I")
    public static int[] field4499 = new int[4096];

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Lri;")
    public static class73 field4497 = new class73(7, -2);

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "[Z")
    public static boolean[] field4503 = new boolean[100];

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "[Lf;")
    public static class529[] field4502;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1968(int arg0) {
        class401.field6030 = -1;
        if (arg0 >= -73) {
            method1968(-47);
        }
        class425.field6375 = 0;
        class523.field7749 = -1;
        field4491++;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lnp;", line = 21)
    public static final class338 method1969(int arg0) {
        field4493++;
        if (arg0 <= 100) {
            method1973(85, null, 103, -121);
        }
        class338 var1 = (class338) class94.field1399.method514((byte) 125);
        if (var1 != null) {
            var1.method2049(-126);
            var1.method1783((byte) -99);
            return var1;
        }
        class338 var2;
        do {
            var2 = (class338) class225.field3302.method514((byte) 104);
            if (var2 == null) {
                return null;
            }
            if (var2.method2056(true) > class256.method1708((byte) 118)) {
                return null;
            }
            var2.method2049(-83);
            var2.method1783((byte) -126);
        } while ((var2.field3936 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I", line = 68)
    public static int method1970(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V", line = 76)
    public static void method1971(int arg0) {
        field4497 = null;
        field4503 = null;
        if (arg0 == 4096) {
            field4502 = null;
            field4490 = null;
            field4499 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILic;)V", line = 91)
    public static final void method1972(int arg0, class491 arg1) {
        if (arg0 != -13427) {
            method1973(29, null, -103, -70);
        }
        class365.field5581 = arg1;
        field4501++;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILic;II)Luq;", line = 103)
    public static final class111 method1973(int arg0, class491 arg1, int arg2, int arg3) {
        field4489++;
        class209 var4 = new class209(arg1.method2945(arg3, arg2, true));
        class111 var5 = new class111(arg2, var4.method1449(38), var4.method1449(88), var4.method1452(65280), var4.method1452(65280), var4.method1428(32122) == 1, var4.method1428(32122), var4.method1428(32122));
        int var6 = var4.method1428(32122);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field1580.method809(new class306(var4.method1428(32122), var4.method1450((byte) 94), var4.method1450((byte) 53), var4.method1450((byte) 39), var4.method1450((byte) 57), var4.method1450((byte) 62), var4.method1450((byte) 60), var4.method1450((byte) 72), var4.method1450((byte) 108)), false);
        }
        if (arg0 <= 50) {
            field4503 = null;
        }
        var5.method678(true);
        return var5;
    }
}
