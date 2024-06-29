import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class83 {

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lha;")
    public static class46 field1597 = class271.method1828("", -46);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[S")
    public static short[] field1599 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
    public static boolean field1591 = false;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
    public static int[] field1593 = new int[128];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lha;")
    public static class46 field1601 = class271.method1828("Fallen lassen", -46);

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
    public static boolean field1603 = false;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "F")
    public static float field1602;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Laj;")
    public static class109 field1595;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lhi;")
    public static class24 field1589;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field1594;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1594 = null;
        field1589 = null;
        if (arg0 != 0) {
            return;
        }
        field1595 = null;
        field1593 = null;
        field1601 = null;
        field1599 = null;
        field1597 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZLtg;)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3, boolean arg4, class269 arg5) {
        if (!arg4) {
            method660((class75) null, -19);
        }
        field1592++;
        if (arg5.field4643 == -1 && arg5.field4676 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg5.field4645) {
            var6 += arg1 - arg5.field4645;
        } else if (arg5.field4670 > arg1) {
            var6 += arg5.field4670 - arg1;
        }
        if (arg5.field4648 < arg2) {
            var6 += arg2 - arg5.field4648;
        } else if (arg5.field4675 > arg2) {
            var6 += arg5.field4675 - arg2;
        }
        if (arg5.field4674 == 0 || (var6 - 64) > arg5.field4674 || class135.field2452 == 0 || arg5.field4666 != arg3) {
            if (arg5.field4671 != null) {
                class236.field4116.method1711(arg5.field4671);
                arg5.field4671 = null;
            }
            if (arg5.field4668 != null) {
                class236.field4116.method1711(arg5.field4668);
                arg5.field4668 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field4674 - var6) * class135.field2452 / arg5.field4674;
        if (arg5.field4671 != null) {
            arg5.field4671.method872(var7);
        } else if (arg5.field4643 >= 0) {
            class44 var8 = class44.method295(class181.field3250, arg5.field4643, 0);
            if (var8 != null) {
                class224 var9 = var8.method296().method1538(class89.field1696);
                class110 var10 = class110.method895(var9, 100, var7);
                var10.method884(-1);
                class236.field4116.method1710(var10);
                arg5.field4671 = var10;
            }
        }
        if (arg5.field4668 != null) {
            arg5.field4668.method872(var7);
            if (arg5.field4668.method500((byte) 118)) {
                return;
            }
            arg5.field4668 = null;
        } else if (arg5.field4676 != null && (arg5.field4655 -= arg0) <= 0) {
            int var11 = (int) ((double) arg5.field4676.length * Math.random());
            class44 var12 = class44.method295(class181.field3250, arg5.field4676[var11], 0);
            if (var12 != null) {
                class224 var13 = var12.method296().method1538(class89.field1696);
                class110 var14 = class110.method895(var13, 100, var7);
                var14.method884(0);
                class236.field4116.method1710(var14);
                arg5.field4655 = arg5.field4667 + (int) ((double) (arg5.field4644 - arg5.field4667) * Math.random());
                arg5.field4668 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lwe;I)Laf;")
    public static final class61 method660(class75 arg0, int arg1) {
        field1596++;
        return arg1 == 0 ? new class61(arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method559(~arg1), arg0.method558(1)) : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public static final void method661(int arg0, int arg1) {
        field1590++;
        if (class135.field2448 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class135.field2448 == arg1) {
            class239.method1647(false);
        }
        if (arg0 == 40) {
            class87.method681(false);
        }
        if (arg0 != 40 && field1595 != null) {
            field1595.method852(5790);
            field1595 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class155.field2753 = 0;
            class139.field2501 = 1;
            class150.field2678 = 1;
            class33.field617 = 0;
            class3.field47 = 0;
            client.method1812((byte) 55);
        }
        if (arg0 == 5) {
            class205.method1450(2, class261.field4549);
        } else {
            class112.method915(128);
        }
        boolean var3 = class135.field2448 == 5 || class135.field2448 == 10 || class135.field2448 == 28;
        if (var2 != var3) {
            if (var2) {
                class51.field890 = class208.field3737;
                if (class205.field3685 == 0) {
                    class229.method1560(2, 5870);
                } else {
                    class175.method1256(0, arg1 ^ 0x42BD, class130.field2390, 2, false, 255, class208.field3737);
                }
                class205.field3677.method1243(false, (byte) 119);
            } else {
                class229.method1560(2, 5870);
                class205.field3677.method1243(true, (byte) 126);
            }
        }
        class135.field2448 = arg0;
    }
}
