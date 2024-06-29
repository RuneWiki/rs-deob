import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class696 extends class498 {

    @OriginalMember(owner = "client!lv", name = "F", descriptor = "Z")
    private boolean field9756 = false;

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "I")
    private int field9759 = 0;

    @OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
    public int field9758 = 0;

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
    public int field9761 = -1;

    @OriginalMember(owner = "client!lv", name = "U", descriptor = "I")
    public int field9770 = -1;

    @OriginalMember(owner = "client!lv", name = "W", descriptor = "Lwa;")
    public static class661 field9772 = new class661(16);

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!lv", name = "L", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!lv", name = "M", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!lv", name = "N", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!lv", name = "P", descriptor = "I")
    public int field9765;

    @OriginalMember(owner = "client!lv", name = "Q", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!lv", name = "R", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!lv", name = "S", descriptor = "I")
    public int field9768;

    @OriginalMember(owner = "client!lv", name = "T", descriptor = "I")
    public int field9769;

    @OriginalMember(owner = "client!lv", name = "V", descriptor = "I")
    public int field9771;

    @OriginalMember(owner = "client!lv", name = "X", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!lv", name = "Z", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!lv", name = "Y", descriptor = "Lfg;")
    public static class174 field9774;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "(I)Z", line = 3)
    public final boolean method177(int arg0) {
        if (arg0 > -103) {
            field9772 = null;
        }
        ++field9757;
        return this.field9756;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 17)
    public static void method3826(byte arg0) {
        field9772 = null;
        if (arg0 != 21) {
            field9774 = null;
        }
        field9774 = null;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIII)V", line = 28)
    public class696(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "(I)Z", line = 31)
    public final boolean method180(int arg0) {
        ++field9766;
        if (arg0 != -1) {
            this.field9765 = 78;
        }
        return false;
    }

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)I", line = 47)
    public final int method179(int arg0) {
        ++field9762;
        return arg0 != 3370 ? 79 : -10;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lr;III)Z", line = 68)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field9763;
        class490 var5 = arg0.method950();
        var5.method23(super.field5179, super.field5178 + -10, super.field5176);
        class473 var6 = class19.field153.method272(this.field9765, -11824).method2830(131072, arg2, (class257) null, (class158) null, 0, -1, this.field9769, 122, arg0);
        if (var6 != null && (!class460.field6553 ? var6.method1867(arg1, arg3, var5, true) : var6.method1896(arg1, arg3, var5, true, class682.field9623))) {
            return true;
        } else {
            if (~this.field9770 != 0) {
                class473 var7 = class19.field153.method272(this.field9770, -11824).method2830(131072, 0, (class257) null, (class158) null, 0, -1, this.field9771, -116, arg0);
                if (var7 != null && (!class460.field6553 ? var7.method1867(arg1, arg3, var5, true) : var7.method1896(arg1, arg3, var5, true, class682.field9623))) {
                    return true;
                }
            }
            if (~this.field9761 != 0) {
                class473 var8 = class19.field153.method272(this.field9761, arg2 ^ -11824).method2830(131072, 0, (class257) null, (class158) null, 0, -1, this.field9768, -103, arg0);
                if (var8 != null && (class460.field6553 ? var8.method1896(arg1, arg3, var5, true, class682.field9623) : var8.method1867(arg1, arg3, var5, true))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(Lr;I)Lwj;", line = 106)
    public final class315 method182(class564 arg0, int arg1) {
        ++field9764;
        class245 var3 = class319.method1819(super.field5166, super.field5179 >> class559.field7984, super.field5176 >> class559.field7984);
        if (var3 != null && var3.field3029.field8629) {
            int var4 = var3.field3029.method179(3370);
            if (~this.field9758 != ~var4) {
                super.field5178 -= this.field9758;
                super.field5178 += var4;
                this.field9758 = var4;
            }
        }
        class490 var5 = arg0.method950();
        var5.method22();
        if (var3 == null || !var3.field3029.field8629) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class274 var9 = class156.field1743[super.field5169];
            int var10 = this.field9759 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1610(super.field5179 + var12, 121, super.field5176 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1610(super.field5179 + var15, 126, super.field5176 + var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1610(super.field5179 + var18, arg1 + 108, super.field5176 - -var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1610(super.field5179 + var21, 113, super.field5176 + var22);
            int var24 = var14 < var17 ? var14 : var17;
            int var25 = var23 > var20 ? var20 : var23;
            int var26 = ~var23 >= ~var17 ? var23 : var17;
            int var27 = var20 > var14 ? var14 : var20;
            if (var10 != 0) {
                int var28 = (int) (Math.atan2((double) (var24 - var25), (double) var10) * 2607.5945876176133D) & 16383;
                if (var28 != 0) {
                    var5.method18(var28);
                }
            }
            int var29 = var14 - -var23;
            if (~var10 != -1) {
                int var30 = 16383 & (int) (Math.atan2((double) (var27 - var26), (double) var10) * 2607.5945876176133D);
                if (~var30 != -1) {
                    var5.method26(-var30);
                }
            }
            if (~var29 < ~(var17 - -var20)) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field5178;
            if (var31 != 0) {
                var5.method30(0, var31, 0);
            }
        }
        var5.method30(super.field5179, super.field5178 - 10, super.field5176);
        class315 var32 = class419.method2349((byte) 121, 3);
        this.field9759 = 0;
        this.field9756 = false;
        if (~this.field9761 != 0) {
            class473 var33 = class19.field153.method272(this.field9761, -11824).method2830(2048, 0, (class257) null, (class158) null, 0, -1, this.field9768, 97, arg0);
            if (var33 != null) {
                if (!class460.field6553) {
                    var33.method1914(var5, var32.field3912[2], 0);
                } else {
                    var33.method1875(var5, var32.field3912[2], class682.field9623, 0);
                }
                this.field9756 |= var33.method1913();
                this.field9759 = var33.method1868();
            }
        }
        if (this.field9770 != -1) {
            class473 var34 = class19.field153.method272(this.field9770, -11824).method2830(2048, 0, (class257) null, (class158) null, 0, -1, this.field9771, 85, arg0);
            if (var34 != null) {
                if (class460.field6553) {
                    var34.method1875(var5, var32.field3912[1], class682.field9623, 0);
                } else {
                    var34.method1914(var5, var32.field3912[1], 0);
                }
                this.field9756 |= var34.method1913();
                if (~var34.method1868() < ~this.field9759) {
                    this.field9759 = var34.method1868();
                }
            }
        }
        class473 var35 = class19.field153.method272(this.field9765, -11824).method2830(2048, arg1, (class257) null, (class158) null, 0, -1, this.field9769, -86, arg0);
        if (var35 != null) {
            if (class460.field6553) {
                var35.method1875(var5, var32.field3912[0], class682.field9623, 0);
            } else {
                var35.method1914(var5, var32.field3912[0], 0);
            }
            this.field9756 |= var35.method1913();
            if (var35.method1868() > this.field9759) {
                this.field9759 = var35.method1868();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLrn;)V", line = 272)
    public static final void method3827(byte arg0, class336 arg1) {
        if (arg0 >= -42) {
            field9774 = null;
        }
        ++field9755;
        if (!class188.field2148) {
            arg1.method1922(77);
            --class661.field9266;
        }
    }

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "(B)I", line = 291)
    public final int method175(byte arg0) {
        if (arg0 <= 119) {
            this.field9765 = -116;
        }
        ++field9767;
        return this.field9759;
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "(Lr;I)Llf;", line = 302)
    public final class676 method185(class564 arg0, int arg1) {
        ++field9773;
        if (arg1 <= 42) {
            this.method180(45);
        }
        return null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lr;Z)V", line = 325)
    public final void method172(class564 arg0, boolean arg1) {
        ++field9760;
        if (arg1) {
            this.field9771 = 47;
        }
    }
}
