import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class106 extends class27 {

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Lkb;")
    private static class93 field1930 = class76.method390("You are standing in a members)2only area)3", 0);

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Lkb;")
    public static class93 field1934 = class76.method390("<col=ffffff>", 0);

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field1933 = 0;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lkb;")
    public static class93 field1939 = field1930;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Lrd;")
    public static class158 field1937 = new class158(8);

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Ldd;")
    public static class34 field1940;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class106() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lmc;I)V")
    public static final void method581(class112 arg0, int arg1) {
        arg0.field2043 = 0;
        ++field1936;
        if (~arg0.field2061 == -1) {
            arg0.field2071 = 1024;
        }
        if (arg1 != 1536) {
            field1939 = null;
        }
        if (~arg0.field2061 == -2) {
            arg0.field2071 = 1536;
        }
        if (arg0.field2061 == 2) {
            arg0.field2071 = 0;
        }
        if (arg0.field2061 == 3) {
            arg0.field2071 = 512;
        }
        int var2 = -class21.field338 + arg0.field2056;
        int var3 = arg0.field2046 * 64 + arg0.field2035 * 128;
        int var4 = arg0.field2046 * 64 + arg0.field2027 * 128;
        arg0.field2045 += (-arg0.field2045 + var3) / var2;
        arg0.field2032 += (-arg0.field2032 + var4) / var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 >= -74) {
            field1940 = null;
        }
        int var7 = arg5 & 3;
        if (~(1 & arg1) == -2) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        ++field1935;
        if (~var7 == -1) {
            return arg3;
        } else if (var7 == 1) {
            return -arg4 + 7 + -arg2 + 1;
        } else {
            return ~var7 == -3 ? 1 - arg0 + -arg3 + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static void method583(byte arg0) {
        field1940 = null;
        field1939 = null;
        field1934 = null;
        field1930 = null;
        if (arg0 > -19) {
            field1937 = null;
        }
        field1937 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IBI)V")
    public static final void method584(int arg0, byte arg1, int arg2) {
        ++field1929;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg0;
        var4[0] = arg2;
        int var5 = 1;
        int var6 = 0;
        if (arg1 == -65) {
            while (~var6 > -5) {
                if (~class95.field1765[var6] != ~arg0) {
                    var3[var5] = class95.field1765[var6];
                    var4[var5] = class152.field2936[var6];
                    ++var5;
                }
                ++var6;
            }
            class95.field1765 = var3;
            class152.field2936 = var4;
            class111.method602(-31721, class183.field3615, class152.field2936, class183.field3615.length + -1, class95.field1765, 0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1931;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            class90.method474(var3, 0, class159.field3209, class142.field2781[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IBI)V")
    public static final void method585(int arg0, byte arg1, int arg2) {
        ++field1932;
        if (class37.field629 == 2) {
            if (arg1 != -7) {
                method583((byte) -128);
            }
            class12.method63((-class68.field1242 + class39.field642 << 7) + class68.field1251, class41.field681 * 2, (class18.field311 - class49.field787 << 7) + class175.field3452, 1118300112);
            if (class26.field415 > -1 && ~(class21.field338 % 20) > -11) {
                class116.field2175[0].method737(class26.field415 + arg0 + -12, class36.field586 + arg2 - 28);
            }
        }
    }
}
