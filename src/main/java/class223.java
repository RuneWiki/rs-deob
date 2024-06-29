import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class223 extends class1 {

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field3724 = -1;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lqb;")
    public static class209 field3718 = new class209(20);

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field3733 = 0;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lbd;")
    public static class162 field3736 = class17.method142(0, "<col=80ff00>");

    @OriginalMember(owner = "client!af", name = "L", descriptor = "Lbd;")
    public static class162 field3737 = class17.method142(0, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!af", name = "J", descriptor = "Lbd;")
    private static class162 field3735 = class17.method142(0, " from your ignore list first)3");

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Lbd;")
    public static class162 field3732 = field3735;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "Lbd;")
    public class162 field3730;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "Lbd;")
    public class162 field3731;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "Ljava/awt/Image;")
    public static Image field3728;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lkm;", line = 14)
    public static final class123 method1612(int arg0, int arg1) {
        class123 var2 = (class123) class80.field1388.method1536((long) arg0, -100);
        field3726++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class187.field3233.method1128(arg0, 0, arg1);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method995(new class94(var3), arg1 + 37);
        }
        class80.field1388.method1532((long) arg0, -47, var4);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Luh;", line = 34)
    public static final class83 method1613(int arg0, boolean arg1) {
        field3722++;
        if (arg1) {
            return (class83) null;
        }
        class83 var2 = (class83) class233.field3888.method1536((long) arg0, -90);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field2045.method1128(class218.method1580(arg0, 102), 0, class154.method1203((byte) -126, arg0));
        class83 var4 = new class83();
        var4.field1443 = arg0;
        if (var3 != null) {
            var4.method639(0, new class94(var3));
        }
        var4.method641(-1);
        class233.field3888.method1532((long) arg0, -120, var4);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(B)V", line = 59)
    public static void method1614(byte arg0) {
        field3737 = null;
        field3736 = null;
        field3718 = null;
        field3735 = null;
        field3732 = null;
        if (arg0 >= -28) {
            method1615(-16, (class94) null);
        }
        field3728 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILb;)Lbd;", line = 78)
    public static final class162 method1615(int arg0, class94 arg1) {
        field3729++;
        if (arg0 != 19314) {
            method1619(-20, 3);
        }
        return class305.method2078(32767, arg1, false);
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(B)Z", line = 99)
    public static final boolean method1616(byte arg0) {
        field3720++;
        if (class9.field105 == 0) {
            if (arg0 != -13) {
                field3733 = 98;
            }
            return class48.field764.method1922(true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lni;", line = 115)
    public final class59 method1617(int arg0) {
        if (arg0 > -122) {
            field3734 = -41;
        }
        field3719++;
        return class58.field899[this.field12];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIBIIII)V", line = 130)
    public static final void method1618(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class117.field2159) {
            int var8 = arg4 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class291.field4901 - class20.field317) * var8 / 100 + class20.field317;
            arg7 = arg7 * var9 >> 8;
        }
        field3727++;
        int var10 = 2048 - arg0 & 0x7FF;
        int var11 = 2048 - arg1 & 0x7FF;
        int var12 = 0;
        int var13 = arg7;
        int var14 = 0;
        if (var10 != 0) {
            int var15 = class312.field5262[var10];
            var14 = -arg7 * var15 >> 16;
            int var16 = class312.field5269[var10];
            var13 = arg7 * var16 >> 16;
        }
        if (arg3 < 50) {
            method1612(41, 126);
        }
        if (var11 != 0) {
            int var17 = class312.field5262[var11];
            int var18 = class312.field5269[var11];
            var12 = var13 * var17 >> 16;
            var13 = var13 * var18 >> 16;
        }
        class67.field1083 = arg5 - var13;
        class180.field3088 = arg1;
        class216.field3613 = arg0;
        class160.field2800 = arg2 - var12;
        class18.field294 = arg6 - var14;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)Z", line = 197)
    public static final boolean method1619(int arg0, int arg1) {
        if (arg1 >= -81) {
            method1615(-100, (class94) null);
        }
        field3723++;
        return (-arg0 & arg0) == arg0;
    }
}
