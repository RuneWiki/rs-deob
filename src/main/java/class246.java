import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class246 extends class268 {

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    private int field3754 = 0;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    private int field3776 = -1;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    private int field3772 = -32768;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Z")
    public boolean field3753 = false;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private int field3766 = 0;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    private int field3756;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lgj;")
    private class240 field3764;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3762 = " is already on your ignore list.";

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Z")
    public static boolean field3763 = true;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Lhc;")
    public static class235 field3768;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Lhc;")
    public static class235 field3780;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Lnl;")
    private class97 field3779;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()I")
    public final int method106() {
        field3778++;
        return this.field3772;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3765++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lke;")
    public static final class110 method1654(byte arg0) {
        field3751++;
        byte[] var1 = class140.field1956[0];
        int var2 = class50.field729[0] * class39.field576[0];
        int[] var3 = new int[var2];
        if (arg0 != -6) {
            method1654((byte) 109);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class9.field79[class235.method1572(var1[var4], 255)];
        }
        class128 var5 = new class128(class21.field296, class287.field4535, class273.field4208[0], class198.field2749[0], class50.field729[0], class39.field576[0], var3);
        class15.method88(arg0 - 15965);
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(IB)V")
    public final void method1655(int arg0, byte arg1) {
        field3775++;
        if (this.field3753) {
            return;
        }
        this.field3766 += arg0;
        if (arg1 != 109) {
            field3768 = null;
        }
        while (this.field3766 > this.field3764.field3673[this.field3754]) {
            this.field3766 -= this.field3764.field3673[this.field3754];
            this.field3754++;
            if (this.field3764.field3665.length <= this.field3754) {
                this.field3753 = true;
                break;
            }
        }
        if (!this.field3753) {
            class116.method781(this.field3770, arg1 + 127, this.field3771, false, this.field3754, this.field3764);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method1656(int arg0) {
        if (arg0 != -1) {
            method1660(94, -14, 62, -37, -84, -44, 33, 125);
        }
        field3762 = null;
        field3768 = null;
        field3780 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class97 arg10) {
        field3767++;
        class25 var13 = this.method1658(26051);
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3779);
            this.field3772 = var13.method106();
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIII)V")
    public static final void method1657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = arg0;
        field3761++;
        int var8 = arg2 * arg2;
        int var9 = var8 << 1;
        int var10 = arg0 << 1;
        int var11 = arg0 * arg0;
        int var12 = var11 << 1;
        int var13 = (1 - var10) * var8 + var12;
        int var14 = var11 << 2;
        int var15 = var8 << 2;
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = ((arg0 << 1) - 3) * var9;
        int var18 = var11 - ((var10 - 1) * var9);
        int var19 = (arg0 - 1) * var15;
        int var20 = (var6 + 1) * var14;
        if (arg4 >= class273.field4228 && arg4 <= class127.field1782) {
            int var21 = class148.method996(class93.field1294, arg2 + arg3, 7585, class296.field4668);
            int var22 = class148.method996(class93.field1294, arg3 - arg2, 7585, class296.field4668);
            class154.method1028(-353, class216.field3264[arg4], arg1, var22, var21);
        }
        while (var7 > 0) {
            var7--;
            int var23 = arg4 - var7;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var18 += var20;
                    var13 += var16;
                    var20 += var14;
                    var16 += var14;
                }
            }
            int var24 = arg4 + var7;
            if (var18 < 0) {
                var18 += var20;
                var13 += var16;
                var6++;
                var20 += var14;
                var16 += var14;
            }
            if (var24 >= class273.field4228 && class127.field1782 >= var23) {
                int var25 = class148.method996(class93.field1294, arg3 + var6, 7585, class296.field4668);
                int var26 = class148.method996(class93.field1294, arg3 - var6, 7585, class296.field4668);
                if (var23 >= class273.field4228) {
                    class154.method1028(-353, class216.field3264[var23], arg1, var26, var25);
                }
                if (var24 <= class127.field1782) {
                    class154.method1028(-353, class216.field3264[var24], arg1, var26, var25);
                }
            }
            var13 += -var19;
            var18 += -var17;
            var17 -= var15;
            var19 -= var15;
        }
        if (arg5 <= 105) {
            method1654((byte) 108);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lgh;")
    private final class25 method1658(int arg0) {
        field3758++;
        class191 var2 = class82.method512(this.field3756, (byte) 88);
        if (arg0 != 26051) {
            this.field3753 = false;
        }
        class25 var3;
        if (this.field3753) {
            var3 = var2.method1225(-1, -1, 0, false);
        } else {
            var3 = var2.method1225(this.field3776, this.field3754, this.field3766, false);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(JI)V")
    public static final void method1659(long arg0, int arg1) {
        class281.field4359.field3402 = 0;
        field3752++;
        class281.field4359.method1447(21, 17363472);
        class281.field4359.method1451(arg0, (byte) -24);
        class227.field3441 = 0;
        class66.field896 = 0;
        if (arg1 == 2) {
            class253.field3871 = 1;
            class35.field540 = -3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3757++;
        if (arg1 >= 1 && arg2 >= 1 && arg1 <= 102 && arg2 <= 102) {
            if (!class34.method231(122) && (class230.field3489[0][arg1][arg2] & 0x2) == 0) {
                int var8 = arg3;
                if ((class230.field3489[arg3][arg1][arg2] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class281.field4361 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class230.field3489[1][arg1][arg2] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class274.method1827(arg0, class122.field1703[arg3], var9, arg1, (byte) -96, arg3, arg2);
            if (arg6 >= 0) {
                boolean var10 = class75.field1053;
                class75.field1053 = true;
                class21.method160(false, false, class122.field1703[arg3], (byte) 124, arg2, arg3, arg5, arg1, var9, arg7, arg6);
                class75.field1053 = var10;
            }
        }
        if (arg4 != 3) {
            method1657(113, 66, 33, -84, 77, -54);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public static final void method1661(int arg0, int arg1, int arg2) {
        field3774++;
        class280 var3 = class181.method1180(arg1, 0, 7);
        var3.method1876(arg0 ^ 0x924CF5C6);
        var3.field4330 = arg2;
        if (arg0 != -11290) {
            field3780 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIII)V")
    public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3756 = arg0;
        this.field3755 = arg1;
        this.field3771 = arg2;
        this.field3759 = arg5 + arg6;
        this.field3777 = arg4;
        this.field3770 = arg3;
        int var8 = class82.method512(this.field3756, (byte) 124).field2638;
        if (var8 == -1) {
            this.field3753 = true;
        } else {
            this.field3753 = false;
            this.field3764 = class132.method905(true, var8);
        }
        if (this.field3759 == arg6) {
            class116.method781(this.field3770, 236, this.field3771, false, this.field3754, this.field3764);
        }
    }
}
