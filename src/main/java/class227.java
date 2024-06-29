import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class227 extends class217 {

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public int field3392 = 0;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "Z")
    private boolean field3387 = false;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    private int field3397 = 0;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public int field3386 = -1;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public int field3398 = -1;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        ++field3395;
        class208 var3 = class482.method2953(super.field3920, super.field3923 >> class639.field9095, super.field3916 >> class639.field9095);
        if (var3 != null && var3.field3144.field9040) {
            int var4 = var3.field3144.method595(32767);
            if (~this.field3392 != ~var4) {
                super.field3922 -= this.field3392;
                super.field3922 += var4;
                this.field3392 = var4;
            }
        }
        class121 var5 = arg1.method342();
        var5.method851();
        if (var3 == null || !var3.field3144.field9040) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class339 var9 = class95.field1372[super.field3924];
            int var10 = this.field3397 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method2089(26448, super.field3923 + var12, super.field3916 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method2089(26448, super.field3923 + var15, super.field3916 - -var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method2089(26448, super.field3923 + var18, super.field3916 + var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method2089(26448, super.field3923 + var21, super.field3916 - -var22);
            int var24 = ~var17 < ~var14 ? var14 : var17;
            int var25 = var20 >= var23 ? var23 : var20;
            int var26 = var23 > var17 ? var17 : var23;
            if (var10 != 0) {
                int var27 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var24), (double) var10));
                if (~var27 != -1) {
                    var5.method860(var27);
                }
            }
            int var28 = var20 <= var14 ? var20 : var14;
            int var29 = var14 - -var23;
            if (var10 != 0) {
                int var30 = (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var28), (double) var10)) & 16383;
                if (~var30 != -1) {
                    var5.method857(-var30);
                }
            }
            if (var29 > var17 - -var20) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field3922;
            if (var31 != 0) {
                var5.method849(0, var31, 0);
            }
        }
        if (arg0 <= 76) {
            field3384 = -93;
        }
        var5.method849(super.field3923, super.field3922 - 10, super.field3916);
        class603 var32 = class6.method26(true, 119, 3);
        this.field3387 = false;
        this.field3397 = 0;
        if (this.field3398 != -1) {
            class282 var33 = class425.field6147.method4144(this.field3398, 125).method2633((class132) null, -1, 2048, 0, this.field3399, 0, arg1, -1, (class131) null);
            if (var33 != null) {
                if (!class100.field1447) {
                    var33.method533(var5, var32.field8543[2], 0);
                } else {
                    var33.method503(var5, var32.field8543[2], class680.field9660, 0);
                }
                this.field3387 |= var33.method497();
                this.field3397 = var33.method507();
            }
        }
        if (~this.field3386 != 0) {
            class282 var34 = class425.field6147.method4144(this.field3386, 127).method2633((class132) null, -1, 2048, 0, this.field3383, 0, arg1, -1, (class131) null);
            if (var34 != null) {
                if (!class100.field1447) {
                    var34.method533(var5, var32.field8543[1], 0);
                } else {
                    var34.method503(var5, var32.field8543[1], class680.field9660, 0);
                }
                this.field3387 |= var34.method497();
                if (~var34.method507() < ~this.field3397) {
                    this.field3397 = var34.method507();
                }
            }
        }
        class282 var35 = class425.field6147.method4144(this.field3394, 123).method2633((class132) null, -1, 2048, 0, this.field3388, 0, arg1, -1, (class131) null);
        if (var35 != null) {
            if (class100.field1447) {
                var35.method503(var5, var32.field8543[0], class680.field9660, 0);
            } else {
                var35.method533(var5, var32.field8543[0], 0);
            }
            this.field3387 |= var35.method497();
            if (var35.method507() > this.field3397) {
                this.field3397 = var35.method507();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        int var2 = 70 % ((arg0 - -38) / 63);
        ++field3381;
        return this.field3387;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)I")
    public final int method1582(boolean arg0) {
        ++field3385;
        class424 var2 = class425.field6147.method4144(this.field3394, 124);
        int var3 = var2.field6138;
        if (~this.field3386 != 0) {
            class424 var4 = class425.field6147.method4144(this.field3386, 126);
            if (var3 < var4.field6138) {
                var3 = var4.field6138;
            }
        }
        if (this.field3398 != -1) {
            class424 var5 = class425.field6147.method4144(this.field3398, 124);
            if (var5.field6138 > var3) {
                var3 = var5.field6138;
            }
        }
        if (!arg0) {
            this.field3383 = -11;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        ++field3403;
        if (arg0 < 51) {
            this.method599((byte) -63);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Lmfa;")
    public static final class407 method1583(byte arg0, int arg1) {
        ++field3393;
        class407[] var2 = class740.method4131(102);
        for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
            class407 var4 = var2[var3];
            if (~var4.field5801 == ~arg1) {
                return var4;
            }
        }
        if (arg0 != -57) {
            field3390 = -66;
        }
        return null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field3404;
        class121 var5 = arg3.method342();
        var5.method845(super.field3923, super.field3922 + -10, super.field3916);
        class424 var6 = class425.field6147.method4144(this.field3394, 123);
        if (arg2 != 1) {
            return true;
        } else {
            class282 var7 = var6.method2633((class132) null, arg2 + -2, 131072, 0, this.field3388, 0, arg3, -1, (class131) null);
            if (var7 != null && (class100.field1447 ? var7.method538(arg1, arg0, var5, true, var6.field6138, class680.field9660) : var7.method496(arg1, arg0, var5, true, var6.field6138))) {
                return true;
            } else {
                if (~this.field3386 != 0) {
                    class424 var8 = class425.field6147.method4144(this.field3386, arg2 + 125);
                    class282 var9 = var8.method2633((class132) null, -1, 131072, 0, this.field3383, 0, arg3, -1, (class131) null);
                    if (var9 != null && (class100.field1447 ? var9.method538(arg1, arg0, var5, true, var8.field6138, class680.field9660) : var9.method496(arg1, arg0, var5, true, var8.field6138))) {
                        return true;
                    }
                }
                if (~this.field3398 != 0) {
                    class424 var10 = class425.field6147.method4144(this.field3398, arg2 + 125);
                    class282 var11 = var10.method2633((class132) null, -1, 131072, 0, this.field3399, 0, arg3, -1, (class131) null);
                    if (var11 != null && (!class100.field1447 ? var11.method496(arg1, arg0, var5, true, var10.field6138) : var11.method538(arg1, arg0, var5, true, var10.field6138, class680.field9660))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIII)V")
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        int var2 = 7 % ((arg0 - 27) / 62);
        ++field3401;
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 >= -114) {
            return null;
        } else {
            ++field3382;
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            return 42;
        } else {
            ++field3402;
            return -10;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBII)I")
    public static final int method1584(int arg0, byte arg1, int arg2, int arg3) {
        ++field3391;
        if (class499.field7172 < 100) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class664.field9502 + arg2;
            if (arg1 < 76) {
                field3384 = 82;
            }
            int var7 = arg3 - class664.field9498;
            for (class241 var8 = (class241) class664.field9495.method3565(-65); var8 != null; var8 = (class241) class664.field9495.method3561((byte) 52)) {
                if (var8.field3562 == arg0) {
                    int var9 = var8.field3571;
                    int var10 = var8.field3568;
                    int var11 = class664.field9498 + var10 | class664.field9502 + var9 << 14;
                    int var12 = (-var9 + var6) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (var4 < 0 || var12 < var5) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        if (arg0 >= -4) {
            this.method1582(false);
        }
        ++field3400;
        return this.field3397;
    }
}
