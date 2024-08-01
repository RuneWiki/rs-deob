import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class class193 extends class149 {

    @OriginalMember(owner = "v", name = "kb", descriptor = "Lrc;")
    public static class160 field3685 = new class160(64);

    @OriginalMember(owner = "v", name = "ob", descriptor = "Llf;")
    public static class109 field3689 = class35.method275("AUS", 2);

    @OriginalMember(owner = "v", name = "nb", descriptor = "I")
    public static int field3688 = -1;

    @OriginalMember(owner = "v", name = "qb", descriptor = "Lrc;")
    public static class160 field3691 = new class160(260);

    @OriginalMember(owner = "v", name = "rb", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "v", name = "sb", descriptor = "Ltf;")
    public static class181 field3693 = new class181();

    @OriginalMember(owner = "v", name = "ub", descriptor = "[I")
    public static int[] field3695 = new int[256];

    @OriginalMember(owner = "v", name = "tb", descriptor = "I")
    public static int field3694 = 0;

    @OriginalMember(owner = "v", name = "fb", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "v", name = "gb", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "v", name = "hb", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "v", name = "ib", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "v", name = "jb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "v", name = "lb", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "v", name = "mb", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "v", name = "pb", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "v", name = "vb", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "v", name = "wb", descriptor = "Lbg;")
    public static class18 field3697;

    @OriginalMember(owner = "v", name = "f", descriptor = "(I)V")
    public static final void method1293(int arg0) {
        ++field3690;
        class83.field1688.method1088(-51);
        if (arg0 != 64) {
            method1297(-25, 114);
        }
    }

    @OriginalMember(owner = "v", name = "a", descriptor = "(IIIII)V")
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 188) {
            field3697 = null;
        }
        ++field3680;
        for (int var5 = 0; ~class113.field2239 < ~var5; ++var5) {
            if (~(class60.field1176[var5] + class200.field3956[var5]) < ~arg2 && ~(arg2 + arg3) < ~class60.field1176[var5] && ~arg1 > ~(class68.field1317[var5] + class27.field587[var5]) && ~(arg0 + arg1) < ~class27.field587[var5]) {
                class194.field3721[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "v", name = "a", descriptor = "(Llf;I)Z")
    public static final boolean method1295(class109 arg0, int arg1) {
        ++field3687;
        if (arg0 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg1 < 58) {
                field3685 = null;
            }
            while (class19.field426 > var2) {
                if (arg0.method778((byte) -121, class31.field741[var2])) {
                    return true;
                }
                ++var2;
            }
            return false;
        }
    }

    @OriginalMember(owner = "v", name = "a", descriptor = "(JI)V")
    public static final void method1296(long arg0, int arg1) {
        ++field3686;
        if (arg0 != 0L) {
            ++class81.field1594;
            class200.field3850.method1339((byte) 81, 188);
            class200.field3850.method592(arg0, -562765672);
            if (arg1 != -22946) {
                method1295((class109) null, -50);
            }
        }
    }

    @OriginalMember(owner = "v", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field3684;
        if (arg1 != 2177) {
            field3691 = null;
        }
        int[][] var3 = super.field1719.method673((byte) -128, arg0);
        if (super.field1719.field1926 && this.method1041((byte) 116)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % super.field2881 * super.field2881;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class57.field1152; ++var8) {
                int var9 = super.field2874[var8 % super.field2877 + var6];
                var7[var8] = class170.method1140(255, var9) << 4;
                var5[var8] = class170.method1140(65280, var9) >> 4;
                var4[var8] = class170.method1140(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "v", name = "c", descriptor = "(II)Llh;")
    public static final class111 method1297(int arg0, int arg1) {
        ++field3683;
        class111 var2 = (class111) class41.field869.method1086((long) arg0, -112);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class7.field105.method147(0, arg0, 13);
            class111 var4 = new class111();
            var4.field2191 = arg0;
            if (var3 != null) {
                var4.method824(new class86(var3), true);
            }
            class41.field869.method1082((long) arg0, -124, var4);
            if (arg1 != -18753) {
                method1296(-99L, -61);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "v", name = "e", descriptor = "(B)V")
    public static void method1298(byte arg0) {
        field3685 = null;
        field3695 = null;
        int var1 = 0 / ((-26 - arg0) / 60);
        field3689 = null;
        field3697 = null;
        field3691 = null;
        field3693 = null;
    }

    @OriginalMember(owner = "v", name = "b", descriptor = "(Z)I")
    public static final int method1299(boolean arg0) {
        ++field3682;
        if (!arg0) {
            field3697 = null;
        }
        return class74.field1420++;
    }
}
