import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class161 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lhb;")
    public static class155 field2553 = new class155(16);

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field2557 = -1;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2560 = "Loading world list data";

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
    public static boolean field2561 = false;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lag;")
    public static class211 field2559;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static void method1104(boolean arg0) {
        field2560 = null;
        if (arg0) {
            field2554 = -109;
        }
        field2559 = null;
        field2553 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
    public static final int method1105(int arg0, int arg1) {
        if (class208.field3298 != null) {
            class208.field3298.method974((byte) 124);
            class208.field3298 = null;
        }
        field2556++;
        if (arg1 != 8) {
            method1106(-53, -42, -62);
        }
        class256.field4147++;
        if (class256.field4147 > 4) {
            class227.field3668 = 0;
            class256.field4147 = 0;
            return arg0;
        }
        class227.field3668 = 0;
        if (class55.field915 == class220.field3606) {
            class55.field915 = class63.field1045;
        } else {
            class55.field915 = class220.field3606;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
    public static final boolean method1106(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class49.field814; var3++) {
            class229 var4 = class65.field1085[var3];
            if (var4.field3712 == 1) {
                int var5 = var4.field3716 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3700 * var5 >> 8) + var4.field3693;
                    int var7 = (var4.field3719 * var5 >> 8) + var4.field3703;
                    int var8 = (var4.field3701 * var5 >> 8) + var4.field3707;
                    int var9 = (var4.field3710 * var5 >> 8) + var4.field3711;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3712 == 2) {
                int var10 = arg0 - var4.field3716;
                if (var10 > 0) {
                    int var11 = (var4.field3700 * var10 >> 8) + var4.field3693;
                    int var12 = (var4.field3719 * var10 >> 8) + var4.field3703;
                    int var13 = (var4.field3701 * var10 >> 8) + var4.field3707;
                    int var14 = (var4.field3710 * var10 >> 8) + var4.field3711;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3712 == 3) {
                int var15 = var4.field3693 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3692 * var15 >> 8) + var4.field3716;
                    int var17 = (var4.field3718 * var15 >> 8) + var4.field3706;
                    int var18 = (var4.field3701 * var15 >> 8) + var4.field3707;
                    int var19 = (var4.field3710 * var15 >> 8) + var4.field3711;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3712 == 4) {
                int var20 = arg2 - var4.field3693;
                if (var20 > 0) {
                    int var21 = (var4.field3692 * var20 >> 8) + var4.field3716;
                    int var22 = (var4.field3718 * var20 >> 8) + var4.field3706;
                    int var23 = (var4.field3701 * var20 >> 8) + var4.field3707;
                    int var24 = (var4.field3710 * var20 >> 8) + var4.field3711;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3712 == 5) {
                int var25 = arg1 - var4.field3707;
                if (var25 > 0) {
                    int var26 = (var4.field3692 * var25 >> 8) + var4.field3716;
                    int var27 = (var4.field3718 * var25 >> 8) + var4.field3706;
                    int var28 = (var4.field3700 * var25 >> 8) + var4.field3693;
                    int var29 = (var4.field3719 * var25 >> 8) + var4.field3703;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
