import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    public static int[] field1685 = new int[2048];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lr;")
    public static class118 field1690 = class153.method1136(104, "<col=ffff00>");

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1691 = 1;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lr;")
    private static class118 field1696 = class153.method1136(95, "Members object");

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lr;")
    public static class118 field1689 = field1696;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lr;")
    private static class118 field1688 = class153.method1136(116, "Please reload this page)3");

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lr;")
    public static class118 field1697 = field1688;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lr;")
    public static class118 field1684 = class153.method1136(126, ")1j");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static final int method611(int arg0, int arg1) {
        field1682++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= arg1) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method612(int arg0, int arg1, int arg2) {
        field1692++;
        if (arg0 < 2) {
            if (arg1 != 20745) {
                method613(116, null);
            }
            return arg0 == 1 ? arg2 : 1;
        }
        int var3 = method612(arg0 >> 1, 20745, arg2 * arg2);
        if ((arg0 & 0x1) != 0) {
            var3 = arg2 * var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILff;)V")
    public static final void method613(int arg0, class42 arg1) {
        field1694++;
        if (arg0 != 5862) {
            field1685 = null;
        }
        class88.field2135 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method614(int arg0) {
        field1689 = null;
        field1684 = null;
        field1697 = null;
        if (arg0 == 112) {
            field1688 = null;
            field1696 = null;
            field1690 = null;
            field1685 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BILff;I)Lvd;")
    public static final class150 method615(byte arg0, int arg1, class42 arg2, int arg3) {
        field1686++;
        if (class9.method75(arg3, 1286850920, arg2, arg1)) {
            if (arg0 <= 5) {
                method613(-110, null);
            }
            return class124.method966(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method616(int arg0) {
        field1695++;
        if (arg0 != -23854) {
            field1687 = 62;
        }
        class59.field1363.method394(arg0 ^ 0xFFFF9347);
        class31.field792.method394(12693);
        class97.field2261.method394(12693);
    }
}
