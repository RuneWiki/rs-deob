import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class212 {

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lhi;")
    public static class82 field3713 = class95.method664((byte) -64, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "J")
    public static volatile long field3712 = 0L;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field3708 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lam;")
    public static class277 field3706 = new class277();

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1522(int arg0) {
        class261.field4467 = 0;
        class233.field4023 = -1;
        class95.field1735 = -3;
        class36.field602 = false;
        if (arg0 != 6127) {
            field3713 = (class82) null;
        }
        field3716++;
        class80.field1362 = 1;
        class324.field5572 = 0;
        class31.field467 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIII)V", line = 23)
    public static final void method1523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= -47) {
            field3712 = 123L;
        }
        field3719++;
        if (arg1 == arg3 && arg0 == arg6 && arg4 == arg8 && arg2 == arg7) {
            class71.method448(arg4, (byte) -85, arg6, arg1, arg9, arg7);
            return;
        }
        int var10 = arg1;
        int var11 = arg6;
        int var12 = arg6 * 3;
        int var13 = arg1 * 3;
        int var14 = arg0 * 3;
        int var15 = arg8 * 3;
        int var16 = arg3 * 3;
        int var17 = arg4 + var16 - var15 - arg1;
        int var18 = arg2 * 3;
        int var19 = arg7 + var14 - var18 - arg6;
        int var20 = var18 + var12 - var14 - var14;
        int var21 = var15 - (var16 - var13) - var16;
        int var22 = var16 - var13;
        int var23 = var14 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var21 * var25;
            int var27 = var20 * var25;
            int var28 = var22 * var24;
            int var29 = var24 * var25 >> 12;
            int var30 = var19 * var29;
            int var31 = var17 * var29;
            int var32 = (var28 + var31 + var26 >> 12) + arg1;
            int var33 = var23 * var24;
            int var34 = arg6 + (var27 + var33 + var30 >> 12);
            class71.method448(var32, (byte) -106, var11, var10, arg9, var34);
            var10 = var32;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 99)
    public static void method1524(boolean arg0) {
        field3706 = null;
        field3713 = null;
        if (arg0) {
            field3713 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Z", line = 119)
    public static final boolean method1525(int arg0, int arg1) {
        field3710++;
        if (arg1 != 0) {
            field3708 = 114;
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILhi;Z)V", line = 141)
    public static final void method1526(int arg0, class82 arg1, boolean arg2) {
        class61.field957.method1504(168, -1);
        if (!arg2) {
            field3712 = 24L;
        }
        class203.field3537++;
        field3707++;
        class61.field957.method1074(arg1.method568(22476), 0);
        class61.field957.method1087(arg0, -540);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)V", line = 174)
    public static final void method1527(int arg0, long arg1) {
        field3717++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 < 115) {
            field3708 = 7;
        }
        for (int var3 = 0; var3 < class90.field1632; var3++) {
            if (class107.field1903[var3] == arg1) {
                class90.field1632--;
                for (int var4 = var3; var4 < class90.field1632; var4++) {
                    class222.field3882[var4] = class222.field3882[var4 + 1];
                    class139.field2386[var4] = class139.field2386[var4 + 1];
                    class198.field3390[var4] = class198.field3390[var4 + 1];
                    class107.field1903[var4] = class107.field1903[var4 + 1];
                    class317.field5436[var4] = class317.field5436[var4 + 1];
                    class160.field2780[var4] = class160.field2780[var4 + 1];
                }
                class232.field4012 = class157.field2726;
                class61.field957.method1504(136, -1);
                class61.field957.method1057((byte) 43, arg1);
                class203.field3518++;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
    public abstract void method1284(int arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    public abstract void method1283(int arg0, int arg1, int arg2);
}
