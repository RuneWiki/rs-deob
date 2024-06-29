import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class238 extends class494 {

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    private int field3454 = 0;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    private int field3458 = 0;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "Z")
    private boolean field3457 = true;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Z")
    public boolean field3464 = false;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    private int field3453 = 0;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
    private int field3469 = -1;

    @OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
    private int field3475 = 0;

    @OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lhg;")
    private class691 field3451;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lat;")
    public static class378 field3455 = null;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "Luj;")
    private class385 field3460;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[Lea;")
    public static class546[] field3449;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILha;)Ljda;")
    public final class228 method41(int arg0, class59 arg1) {
        ++field3471;
        class472 var3 = this.method1655(arg1, this.field3474, (~this.field3453 == -1 ? 0 : 5) | 2048, (byte) -82);
        if (var3 == null) {
            return null;
        } else {
            if (this.field3453 != 0) {
                var3.method524(this.field3453 * 2048);
            }
            class661 var4 = arg1.method322();
            var4.method744(super.field5922, super.field5927, super.field5933);
            this.method1657(var3, arg1, -1, var4);
            class228 var5 = class345.method2171(arg0, false, false);
            if (class458.field6459) {
                var3.method497(var4, var5.field3313[0], class58.field1146, 0);
            } else {
                var3.method521(var4, var5.field3313[0], 0);
            }
            if (this.field3460 != null) {
                class266 var6 = this.field3460.method2419();
                if (!class458.field6459) {
                    arg1.method208(var6);
                } else {
                    arg1.method295(var6, class58.field1146);
                }
            }
            this.field3457 = var3.method488();
            this.field3450 = var3.method486();
            this.field3475 = var3.method513();
            return var5;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        if (!arg0) {
            return 18;
        } else {
            ++field3456;
            return this.field3450;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lql;Z)V")
    public static final void method1651(class733 arg0, boolean arg1) {
        if (!arg1) {
            field3455 = null;
        }
        arg0.field9898 = null;
        ++field3480;
        if (~class575.field7893 > -21) {
            class554.field7660.method1298(-89, arg0);
            ++class575.field7893;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lha;IZLga;IBI)V")
    public final void method33(class59 arg0, int arg1, boolean arg2, class404 arg3, int arg4, byte arg5, int arg6) {
        ++field3466;
        if (arg5 > -106) {
            this.field3464 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3448;
        if (this.field3460 != null) {
            this.field3460.method2428();
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        ++field3462;
        if (!arg0) {
            this.field3451 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
    public static final int method1652(int arg0, int arg1, int arg2) {
        ++field3470;
        int var3 = class173.method1293(4, arg2 + 91923, (byte) 120, arg1 + 45365) - 128 + (class173.method1293(2, arg2 + 37821, (byte) 122, arg1 + 10294) - 128 >> 1) + (-128 + class173.method1293(1, arg2, (byte) 120, arg1) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (~var4 <= -11) {
            if (~var4 < -61) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        if (arg0 >= -35) {
            method1653(36, -58, (class158) null, 49, -2, 122);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        if (arg0 > -12) {
            return false;
        } else {
            ++field3481;
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILwea;III)Ljava/awt/Frame;")
    public static final Frame method1653(int arg0, int arg1, class158 arg2, int arg3, int arg4, int arg5) {
        ++field3463;
        if (!arg2.method1221(-4)) {
            return null;
        } else {
            if (~arg3 == -1) {
                class335[] var6 = class207.method1431((byte) -49, arg2);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
                    if (var6[var8].field4725 == arg1 && ~var6[var8].field4732 == ~arg0 && (~arg5 == -1 || ~var6[var8].field4730 == ~arg5) && (!var7 || ~arg3 > ~var6[var8].field4724)) {
                        arg3 = var6[var8].field4724;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class622 var9 = arg2.method1203(arg5, arg0, arg3, arg1, (byte) -11);
            while (~var9.field8462 == -1) {
                class700.method3916((byte) 19, 10L);
            }
            Frame var10 = (Frame) var9.field8463;
            if (var10 == null) {
                return null;
            } else if (arg4 != 14199) {
                return null;
            } else if (~var9.field8462 == -3) {
                class120.method1044(var10, arg2, false);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIIILha;ILd;)V")
    public static final void method1654(byte arg0, int arg1, int arg2, int arg3, class59 arg4, int arg5, class152 arg6) {
        ++field3476;
        if (~class362.field5203 > -101) {
            class434.method2638(arg6, arg4, arg0 ^ 116);
        }
        arg4.method303(arg1, arg5, arg1 + arg2, arg3 + arg5);
        if (~class362.field5203 > -101) {
            byte var7 = 20;
            int var8 = arg2 / 2 + arg1;
            int var9 = arg5 - -(arg3 / 2) - 18 - var7;
            arg4.method217(arg1, arg5, arg2, arg3, -16777216, 0);
            arg4.method288(var8 + -152, var9, 304, 34, class512.field7135[class260.field3724].getRGB(), 0);
            arg4.method217(var8 - 150, var9 + 2, class362.field5203 * 3, 30, class481.field6715[class260.field3724].getRGB(), 0);
            class168.field2634.method638((byte) -116, var8, class142.field2342[class260.field3724].getRGB(), class497.field6909.method2936(class607.field8336, arg0 + 551), -1, var7 + var9);
        } else {
            int var10 = -((int) ((float) arg2 / class489.field6769)) + class33.field850;
            int var11 = (int) ((float) arg3 / class489.field6769) + class614.field8388;
            int var12 = (int) ((float) arg2 / class489.field6769) + class33.field850;
            class659.field9029 = -((int) ((float) arg3 / class489.field6769)) + class614.field8388;
            class654.field8986 = -((int) ((float) arg2 / class489.field6769)) + class33.field850;
            int var13 = -((int) ((float) arg3 / class489.field6769)) + class614.field8388;
            class117.field1989 = (int) ((float) (arg3 * 2) / class489.field6769);
            class160.field2571 = (int) ((float) (arg2 * 2) / class489.field6769);
            class489.method2879(class489.field6788 + var10, class489.field6785 + var11, var12 - -class489.field6788, class489.field6785 + var13, arg1, arg5, arg1 + arg2, arg3 + arg5 + 1);
            class489.method2876(arg4);
            if (arg0 != -7) {
                method1652(63, -7, -14);
            }
            class168 var14 = class489.method2886(arg4);
            class604.method3441(-13084, 0, var14, 0, arg4);
            if (~class505.field7035 < -1) {
                --class723.field9806;
                if (~class723.field9806 == -1) {
                    --class505.field7035;
                    class723.field9806 = 20;
                }
            }
            if (class137.field2298) {
                int var15 = arg1 + -5 + arg2;
                int var16 = arg3 + -8 + arg5;
                class355.field5007.method632("Fps:" + class602.field8268, var16, 16776960, var15, arg0 + -116, -1);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() + -var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (var18 > 65536) {
                    var19 = 16711680;
                }
                class355.field5007.method632("Mem:" + var18 + "k", var20, var19, var15, -127, -1);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lha;IIB)Lka;")
    private final class472 method1655(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field3472;
        if (arg3 != -82) {
            return null;
        } else {
            class654 var5 = class104.field1840.method3016((byte) 122, arg1);
            class281 var6 = class465.field6517[super.field5926];
            class281 var7 = ~super.field5921 > -4 ? class465.field6517[super.field5921 + 1] : null;
            return !this.field3464 ? var5.method3697(this.field3458, this.field3454, super.field5927, arg2, true, arg0, this.field3469, super.field5922, -129, class456.field6436, var7, super.field5933, var6) : var5.method3697(0, -1, super.field5927, arg2, true, arg0, -1, super.field5922, -129, class456.field6436, var7, super.field5933, var6);
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)V")
    public final void method1656(boolean arg0) {
        if (!arg0) {
            if (this.field3460 != null) {
                this.field3460.method2428();
            }
            ++field3478;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Z")
    public final boolean method49(byte arg0) {
        ++field3477;
        if (arg0 != 122) {
            this.method35(-40);
        }
        return this.field3457;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lka;Lha;ILbca;)V")
    private final void method1657(class472 arg0, class59 arg1, int arg2, class661 arg3) {
        arg0.method523(arg3);
        ++field3479;
        class417[] var5 = arg0.method494();
        class755[] var6 = arg0.method525();
        if (arg2 == -1) {
            if ((this.field3460 == null || this.field3460.field5582) && (var5 != null || var6 != null)) {
                this.field3460 = class385.method2420(class641.field8810, true);
            }
            if (this.field3460 != null) {
                this.field3460.method2430(arg1, (long) class641.field8810, var5, var6, false);
                this.field3460.method2427(super.field5926, super.field6831, super.field6839, super.field6838, super.field6835);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)I")
    public final int method37(int arg0) {
        ++field3461;
        if (arg0 != -25675) {
            this.field3453 = 73;
        }
        return this.field3475;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lha;I)Lhw;")
    public final class132 method40(class59 arg0, int arg1) {
        if (arg1 != 7) {
            this.method31((class59) null, -106);
        }
        ++field3482;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        if (arg0 >= -65) {
            return false;
        } else {
            ++field3447;
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Lha;I)V")
    public final void method31(class59 arg0, int arg1) {
        if (arg1 >= -125) {
            this.field3450 = 38;
        }
        ++field3473;
        class472 var3 = this.method1655(arg0, this.field3474, 0, (byte) -82);
        if (var3 != null) {
            class661 var4 = arg0.method322();
            var4.method744(super.field5922, super.field5927, super.field5933);
            this.method1657(var3, arg0, -1, var4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field3465;
        return arg3 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static final void method1658(int arg0) {
        ++field3467;
        if (arg0 == 3613) {
            int var1 = 0;
            for (int var2 = 0; class376.field5325 > var2; ++var2) {
                for (int var3 = 0; class175.field2711 > var3; ++var3) {
                    if (class376.method2374(var3, class649.field8928, var2, 0, var1, true)) {
                        ++var1;
                    }
                    if (var1 >= 512) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(Z)V")
    public static void method1659(boolean arg0) {
        field3455 = null;
        if (arg0) {
            field3449 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3474 = arg0;
        this.field3453 = arg12;
        this.field3468 = arg1 + arg2;
        class654 var14 = class104.field1840.method3016((byte) 57, this.field3474);
        int var15 = var14.field8980;
        if (~var15 == 0) {
            this.field3464 = true;
        } else {
            this.field3451 = class456.field6436.method1021(var15, 7);
            this.field3464 = false;
        }
        if (this.field3468 == arg2) {
            class190.method1366(this, this.field3454, this.field3451, -99);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
    public final void method1660(int arg0, byte arg1) {
        if (arg1 <= -14) {
            ++field3452;
            if (!this.field3464) {
                this.field3458 += arg0;
                while (~this.field3458 < ~this.field3451.field9357[this.field3454]) {
                    this.field3458 -= this.field3451.field9357[this.field3454];
                    ++this.field3454;
                    if (this.field3451.field9327.length <= this.field3454) {
                        this.field3464 = true;
                        break;
                    }
                }
                if (!this.field3464) {
                    class190.method1366(this, this.field3454, this.field3451, -59);
                }
            }
        }
    }
}
