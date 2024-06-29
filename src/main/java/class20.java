import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class101 {

    @OriginalMember(owner = "client!ce", name = "zb", descriptor = "[Z")
    public static boolean[] field525 = new boolean[5];

    @OriginalMember(owner = "client!ce", name = "wb", descriptor = "[I")
    public static int[] field522 = new int[] { 6, 0, 0, -2, 0, 0, 0, -1, 0, 0, 3, 0, 5, 0, 2, 0, 5, 4, -1, 11, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 3, 3, 0, 0, 11, 0, 0, 0, 5, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 6, 7, 0, 0, 0, 0, 6, -2, -1, 0, 6, 4, -2, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 5, 0, 0, 0, 0, -2, 0, 7, 0, 2, 3, 2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 2, 12, 0, 0, 0, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 6, 4, 0, 0, 2, 0, -1, 0, 0, 0, -2, 6, 6, 0, 4, 2, 2, 1, 0, -2, 0, 0, 0, 0, 6, 0, 0, -2, 14, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 1, 2, 10, 0, 0, 2, 0, 0, 0, -2, 1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 6, 0, 2, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 15, 0, 0, -2, 0, 1, 7, 6, 0, 0, 0 };

    @OriginalMember(owner = "client!ce", name = "vb", descriptor = "I")
    public static volatile int field521 = 0;

    @OriginalMember(owner = "client!ce", name = "xb", descriptor = "Laf;")
    public static class7 field523 = class48.method406(40, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ce", name = "yb", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ce", name = "qb", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ce", name = "tb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ce", name = "Ab", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ce", name = "Bb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
    public static final void method187(int arg0, int arg1) {
        if (class148.field3479 == arg1) {
            class3.field22.method630(86, arg0);
        } else {
            class79.field1831 = arg0;
        }
        field519++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBI)I")
    public static final int method188(int arg0, byte arg1, int arg2) {
        field518++;
        if (arg2 >= 2) {
            int var3 = method188(arg0 * arg0, (byte) -116, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            return var3;
        } else if (arg1 >= -67) {
            return 3;
        } else if (arg2 == 1) {
            return arg0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILsa;Lr;)V")
    public static final void method189(int arg0, int arg1, class126 arg2, class118 arg3) {
        if (arg1 != 29095) {
            field524 = -42;
        }
        field526++;
        class119 var4 = new class119();
        var4.field3261 = arg0;
        var4.field2823 = arg2;
        var4.field2817 = 1;
        var4.field2825 = arg3;
        class94 var5 = class9.field240;
        synchronized (class9.field240) {
            class9.field240.method765(var4, arg1 - 29095);
        }
        class12.method129((byte) -28);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Leb;")
    public final class31 method190(int arg0) {
        if (arg0 == 1) {
            field515++;
            return class64.method526(false, this.field516).method1099(108, this.field514);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public static final void method191(int arg0) {
        if (arg0 >= -22) {
            field525 = null;
        }
        field520++;
        for (int var1 = 0; var1 < class98.field2325; var1++) {
            int var2 = class21.field537[var1];
            class92 var3 = class18.field425[var2];
            int var4 = class91.field2100.method931((byte) 124);
            if ((var4 & 0x2) != 0) {
                var4 += class91.field2100.method931((byte) 124) << 8;
            }
            class68.method548(1, var2, var4, var3);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
    public static final int method192(int arg0, int arg1, int arg2) {
        if (arg2 > -23) {
            return 48;
        }
        int var3 = class18.method174(4, 7157, arg1 + 91923, arg0 + 45365) + (class18.method174(2, 7157, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (class18.method174(1, 7157, arg1, arg0) - 128 >> 2) - 128;
        field527++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
    public static void method193(int arg0) {
        field523 = null;
        if (arg0 < 117) {
            method191(-90);
        }
        field525 = null;
        field522 = null;
    }
}
