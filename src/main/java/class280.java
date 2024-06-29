import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class280 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "S")
    public static short field3833 = 320;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
    public static int[] field3831 = new int[2];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lih;", line = 5)
    public static final class651 method1724(int arg0) {
        field3829++;
        class651 var1 = (class651) class507.field6948.method3901(arg0 + arg0);
        if (var1 == null) {
            return new class651();
        } else {
            class554.field7475--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBZLr;)Lhr;", line = 23)
    public static final class486 method1725(int arg0, byte arg1, boolean arg2, class166 arg3) {
        field3830++;
        if (arg0 == -1) {
            return null;
        }
        if (class523.field7103 != null) {
            for (int var4 = 0; var4 < class523.field7103.length; var4++) {
                if (class523.field7103[var4] == arg0) {
                    return class558.field7522[var4];
                }
            }
        }
        int var5 = -5 % ((72 - arg1) / 41);
        class486 var6 = (class486) class193.field2746.method3747((byte) -66, (long) arg0);
        if (var6 != null) {
            if (arg2 && var6.field6680 == null) {
                class283 var7 = class699.method3918(arg0, 123, class417.field5891);
                if (var7 == null) {
                    return null;
                }
                var6.field6680 = var7;
            }
            return var6;
        }
        class168[] var8 = class168.method1190(class587.field8255, arg0);
        if (var8 == null) {
            return null;
        }
        class283 var9 = class699.method3918(arg0, -71, class417.field5891);
        if (var9 == null) {
            return null;
        }
        class486 var10;
        if (arg2) {
            var10 = new class486(arg3.method129(var9, var8, true), var9);
        } else {
            var10 = new class486(arg3.method129(var9, var8, true));
        }
        class193.field2746.method3748((long) arg0, var10, 12537);
        return var10;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 99)
    public static void method1726(int arg0) {
        field3831 = null;
        if (arg0 != 0) {
            field3833 = 69;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIII)I", line = 109)
    public static final int method1727(byte arg0, int arg1, int arg2, int arg3) {
        field3832++;
        if (arg0 != 94) {
            method1725(71, (byte) -44, false, null);
        }
        if (arg3 < arg2) {
            return arg2;
        } else if (arg1 < arg3) {
            return arg1;
        } else {
            return arg3;
        }
    }
}
