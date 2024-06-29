import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class287 extends class476 {

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "J")
    public long field3883;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Lhv;")
    public static class149 field3885;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lfs;")
    public class287 field3888;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lfs;")
    public class287 field3890;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V", line = 3)
    public final void method1645(int arg0) {
        field3886++;
        if (this.field3890 == null) {
            return;
        }
        this.field3890.field3888 = this.field3888;
        this.field3888.field3890 = this.field3890;
        this.field3888 = null;
        int var2 = 90 % ((-arg0 - 40) / 63);
        this.field3890 = null;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V", line = 22)
    public static void method1646(int arg0) {
        field3885 = null;
        if (arg0 != 128) {
            field3885 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIZIIII)V", line = 36)
    public static final void method1647(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg6 && arg3 == arg8 && arg4 == arg7 && arg1 == arg9) {
            class467.method2717(arg2, arg9, arg0, -123, arg4, arg8);
        } else {
            int var10 = arg2;
            int var11 = arg8;
            int var12 = arg2 * 3;
            int var13 = arg8 * 3;
            int var14 = arg6 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg1 * 3;
            int var18 = arg4 + var14 - var16 - arg2;
            int var19 = arg9 + var15 - var17 - arg8;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg2;
                int var34 = arg8 + (var28 - (-var30 - var32) >> 12);
                class467.method2717(var10, var34, arg0, -126, var33, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg5) {
            method1647(-42, 64, 66, -103, 85, false, 1, 72, -29, 109);
        }
        field3889++;
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)Z", line = 112)
    public final boolean method1648(int arg0) {
        field3887++;
        if (arg0 == 3) {
            return this.field3890 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)V", line = 126)
    public static final void method1649(int arg0) {
        if (class223.field3146 != null) {
            class223.field3146.method3015(arg0 - 841283500);
        }
        field3884++;
        if (class515.field7534 != null) {
            class515.field7534.method3015(0);
        }
        if (arg0 != 841283500) {
            method1649(67);
        }
    }
}
