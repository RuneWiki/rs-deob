import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class394 extends class213 {

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
    public int field5650 = -1;

    @OriginalMember(owner = "client!dda", name = "db", descriptor = "I")
    public int field5668 = 0;

    @OriginalMember(owner = "client!dda", name = "Y", descriptor = "I")
    private int field5663 = 0;

    @OriginalMember(owner = "client!dda", name = "Z", descriptor = "I")
    public int field5664 = -1;

    @OriginalMember(owner = "client!dda", name = "bb", descriptor = "Z")
    private boolean field5666 = false;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!dda", name = "S", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!dda", name = "T", descriptor = "I")
    public int field5658;

    @OriginalMember(owner = "client!dda", name = "U", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!dda", name = "V", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!dda", name = "W", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!dda", name = "X", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!dda", name = "ab", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!dda", name = "cb", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!dda", name = "eb", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!dda", name = "fb", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!dda", name = "gb", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!dda", name = "hb", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZZ)V")
    public static final void method2462(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            --class371.field5239;
            if (class371.field5239 == 0) {
                class320.field4444 = null;
            }
        }
        if (arg2) {
            --class462.field6422;
            if (~class462.field6422 == -1) {
                class577.field7932 = null;
            }
        }
        int var3 = -85 % ((arg0 - -41) / 58);
        ++field5660;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLha;)V")
    public final void method659(boolean arg0, class548 arg1) {
        ++field5651;
        if (arg0) {
            this.field5661 = 109;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(JB)V")
    public static final void method2463(long arg0, byte arg1) {
        ++field5659;
        int var3 = class43.field532;
        if (class316.field4388 != var3) {
            int var4 = var3 - class316.field4388;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (~var4 >= -1) {
                if (var5 != 0) {
                    if (~var5 > ~var4) {
                        var5 = var4;
                    }
                } else {
                    var5 = -1;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (~var5 < ~var4) {
                var5 = var4;
            }
            class316.field4388 += var5;
        }
        int var6 = class544.field7541;
        class589.field8028 += (float) arg0 * class679.field9449 / 40.0F * 8.0F;
        class596.field8093 += (float) arg0 * class244.field3622 / 40.0F * 8.0F;
        if (class357.field5123 != var6) {
            int var7 = -class357.field5123 + var6;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (~var8 != -1) {
                    if (var7 > var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (~var8 == -1) {
                var8 = 1;
            } else if (~var8 < ~var7) {
                var8 = var7;
            }
            class357.field5123 += var8;
        }
        if (arg1 != -81) {
            method2462(-72, false, false);
        }
        class391.method2454(-67);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILha;IB)Z")
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        ++field5656;
        class744 var5 = arg1.method1404();
        var5.method905(super.field4410, super.field4413 + -10, super.field4418);
        class671 var6 = class291.field4179.method1313(this.field5672, true);
        class284 var7 = var6.method3797((class57) null, -1, this.field5670, arg1, 122, (class41) null, 131072, 0, 0);
        if (arg3 > -58) {
            method2465(77, (class755) null);
        }
        if (var7 != null && (!class301.field4261 ? var7.method1669(arg0, arg2, var5, true, var6.field9320) : var7.method1653(arg0, arg2, var5, true, var6.field9320, class3.field30))) {
            return true;
        } else {
            if (~this.field5664 != 0) {
                class671 var8 = class291.field4179.method1313(this.field5664, true);
                class284 var9 = var8.method3797((class57) null, -1, this.field5661, arg1, 94, (class41) null, 131072, 0, 0);
                if (var9 != null && (class301.field4261 ? var9.method1653(arg0, arg2, var5, true, var8.field9320, class3.field30) : var9.method1669(arg0, arg2, var5, true, var8.field9320))) {
                    return true;
                }
            }
            if (~this.field5650 != 0) {
                class671 var10 = class291.field4179.method1313(this.field5650, true);
                class284 var11 = var10.method3797((class57) null, -1, this.field5658, arg1, 114, (class41) null, 131072, 0, 0);
                if (var11 != null && (class301.field4261 ? var11.method1653(arg0, arg2, var5, true, var10.field9320, class3.field30) : var11.method1669(arg0, arg2, var5, true, var10.field9320))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/net/Socket;ZI)Lnh;")
    public static final class758 method2464(Socket arg0, boolean arg1, int arg2) throws IOException {
        if (arg1) {
            return null;
        } else {
            ++field5653;
            return new class348(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)Z")
    public final boolean method783(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field5671;
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Lha;B)Liha;")
    public final class613 method653(class548 arg0, byte arg1) {
        ++field5654;
        if (arg1 != 13) {
            this.field5666 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)I")
    public final int method2058(int arg0) {
        ++field5657;
        if (arg0 != 0) {
            return -87;
        } else {
            class671 var2 = class291.field4179.method1313(this.field5672, true);
            int var3 = var2.field9320;
            if (this.field5664 != -1) {
                class671 var4 = class291.field4179.method1313(this.field5664, true);
                if (var4.field9320 > var3) {
                    var3 = var4.field9320;
                }
            }
            if (this.field5650 != -1) {
                class671 var5 = class291.field4179.method1313(this.field5650, true);
                if (~var5.field9320 < ~var3) {
                    var3 = var5.field9320;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(IIIII)V")
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;I)Lua;")
    public final class3 method660(class548 arg0, int arg1) {
        ++field5655;
        class638 var3 = class65.method527(super.field4408, super.field4410 >> class371.field5241, super.field4418 >> class371.field5241);
        class441 var4 = class134.method851(super.field4408, super.field4410 >> class371.field5241, super.field4418 >> class371.field5241);
        int var5 = 0;
        if (var3 != null && var3.field8567.field5675) {
            var5 = var3.field8567.method790(arg1 ^ 11691);
        }
        if (var4 != null && ~(-var5) > ~var4.field6133) {
            var5 = -var4.field6133;
        }
        if (this.field5668 != var5) {
            super.field4413 -= this.field5668;
            super.field4413 += var5;
            this.field5668 = var5;
        }
        class744 var6 = arg0.method1404();
        var6.method889();
        if (this.field5668 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class341 var10 = class433.field6043[super.field4419];
            int var11 = this.field5663 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method2172(super.field4410 - -var13, -1, super.field4418 + var14);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method2172(super.field4410 + var16, -1, super.field4418 + var17);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method2172(super.field4410 + var19, -1, super.field4418 + var20);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method2172(super.field4410 + var22, -1, super.field4418 + var23);
            int var25 = var18 <= var15 ? var18 : var15;
            int var26 = ~var21 <= ~var24 ? var24 : var21;
            int var27 = var24 > var18 ? var18 : var24;
            int var28 = var21 > var15 ? var15 : var21;
            if (var11 != 0) {
                int var29 = 16383 & (int) (Math.atan2((double) (-var26 + var25), (double) var11) * 2607.5945876176133D);
                if (var29 != 0) {
                    var6.method902(var29);
                }
            }
            if (~var11 != -1) {
                int var30 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var28), (double) var11));
                if (var30 != 0) {
                    var6.method898(-var30);
                }
            }
            int var31 = var15 + var24;
            if (~var31 < ~(var18 + var21)) {
                var31 = var18 + var21;
            }
            int var32 = (var31 >> 1) - super.field4413;
            if (~var32 != -1) {
                var6.method882(0, var32, 0);
            }
        }
        var6.method882(super.field4410, super.field4413 + -10, super.field4418);
        class3 var33 = class682.method3841(3, true, 28389);
        this.field5666 = false;
        this.field5663 = 0;
        if (this.field5650 != arg1) {
            class284 var34 = class291.field4179.method1313(this.field5650, true).method3797((class57) null, -1, this.field5658, arg0, 127, (class41) null, 2048, 0, 0);
            if (var34 != null) {
                if (!class301.field4261) {
                    var34.method1686(var6, var33.field18[2], 0);
                } else {
                    var34.method1682(var6, var33.field18[2], class3.field30, 0);
                }
                this.field5666 |= var34.method1673();
                this.field5663 = var34.method1697();
            }
        }
        if (~this.field5664 != 0) {
            class284 var35 = class291.field4179.method1313(this.field5664, true).method3797((class57) null, -1, this.field5661, arg0, 76, (class41) null, 2048, 0, 0);
            if (var35 != null) {
                if (!class301.field4261) {
                    var35.method1686(var6, var33.field18[1], 0);
                } else {
                    var35.method1682(var6, var33.field18[1], class3.field30, 0);
                }
                this.field5666 |= var35.method1673();
                if (~var35.method1697() < ~this.field5663) {
                    this.field5663 = var35.method1697();
                }
            }
        }
        class284 var36 = class291.field4179.method1313(this.field5672, true).method3797((class57) null, -1, this.field5670, arg0, 89, (class41) null, 2048, 0, 0);
        if (var36 != null) {
            if (!class301.field4261) {
                var36.method1686(var6, var33.field18[0], 0);
            } else {
                var36.method1682(var6, var33.field18[0], class3.field30, 0);
            }
            this.field5666 |= var36.method1673();
            if (~var36.method1697() < ~this.field5663) {
                this.field5663 = var36.method1697();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILuv;)V")
    public static final void method2465(int arg0, class755 arg1) {
        ++field5669;
        class755 var2 = class528.method3138(arg0, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class553.field7716;
            var4 = class118.field1561;
        } else {
            var4 = var2.field10393;
            var3 = var2.field10501;
        }
        class652.method3646(var4, false, arg1, true, var3);
        class459.method2801(var3, var4, arg0 + 85, arg1);
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)I")
    public final int method793(byte arg0) {
        if (arg0 != -86) {
            method2463(-78L, (byte) -123);
        }
        ++field5667;
        return this.field5663;
    }

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "(I)I")
    public final int method790(int arg0) {
        if (arg0 != -11692) {
            this.field5664 = -60;
        }
        ++field5652;
        return -10;
    }

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "(I)Z")
    public final boolean method785(int arg0) {
        ++field5662;
        return arg0 >= -117 ? true : this.field5666;
    }
}
