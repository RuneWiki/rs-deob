import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class211 extends class313 {

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public int field3518 = -1;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Z")
    private boolean field3511 = false;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    private int field3527 = 0;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public int field3531 = -1;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public int field3533 = 0;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "Lfa;")
    public static class214 field3517;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIII)V")
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)I")
    public final int method406(byte arg0) {
        if (arg0 <= 108) {
            this.field3529 = -124;
        }
        ++field3530;
        return this.field3527;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[FI)[F")
    public static final float[] method1599(byte arg0, float[] arg1, int arg2) {
        ++field3516;
        float[] var3 = new float[arg2];
        if (arg0 <= 48) {
            return null;
        } else {
            class398.method2563(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Z")
    public final boolean method414(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field3528;
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILol;IIIIIILol;)V")
    public static final void method1600(int arg0, int arg1, class260 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class260 arg9) {
        ++field3525;
        int var10 = arg9.method1847(92160000);
        if (~var10 != 0) {
            Object var11 = null;
            class702 var12 = (class702) class10.field173.method560(false, (long) var10);
            if (var12 == null) {
                class284[] var13 = class284.method2018(class158.field2699, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class627.field8857.method265(var13[0], true);
                class10.field173.method559(var12, (long) var10, 0);
            }
            class466.method2906(arg3 >> 1, arg0, arg2.field9695, (byte) -29, arg1, arg2.field9705, arg2.field9696, arg5 >> 1, arg8 * arg2.method1841(20744), 0);
            int var14 = arg4 + -18 - -class321.field5031[0];
            int var15 = arg6 / 4 * 18 + var14;
            int var16 = class321.field5031[1] + -16 + arg7 + -54;
            int var17 = arg6 % 4 * 18 + var16;
            var12.method3960(var15, var17);
            if (arg2 == arg9) {
                class627.field8857.method1353(-256, 18, 18, var15 - 1, true, var17 + -1);
            }
            class349 var18 = class392.method2544(16278);
            var18.field5583 = var17;
            var18.field5581 = var15;
            var18.field5579 = var15 + 16;
            var18.field5582 = arg9;
            var18.field5585 = var17 + 16;
            class490.field7162.method2757(var18, -1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        if (arg0 != -20030) {
            field3512 = 40;
        }
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class532.field7753[var1] = true;
        }
        ++field3513;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLr;)Lll;")
    public final class334 method408(byte arg0, class167 arg1) {
        if (arg0 != 111) {
            method1599((byte) 121, (float[]) null, -49);
        }
        ++field3520;
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILr;)Lod;")
    public final class468 method403(int arg0, class167 arg1) {
        ++field3526;
        class531 var3 = class203.method1574(super.field9695, super.field9696 >> class439.field6699, super.field9705 >> class439.field6699);
        if (var3 != null && var3.field7739.field6877) {
            int var4 = var3.field7739.method393(0);
            if (~this.field3533 != ~var4) {
                super.field9701 -= this.field3533;
                this.field3533 = var4;
                super.field9701 += var4;
            }
        }
        class393 var5 = arg1.method339();
        var5.method504();
        if (var3 == null || !var3.field7739.field6877) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class37 var9 = class587.field8346[super.field9703];
            int var10 = this.field3527 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method477(-1, super.field9705 - -var13, super.field9696 + var12);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method477(-1, super.field9705 + var16, super.field9696 + var15);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method477(-1, super.field9705 + var19, super.field9696 - -var18);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method477(-1, super.field9705 + var22, super.field9696 - -var21);
            int var24 = var14 < var17 ? var14 : var17;
            int var25 = ~var20 <= ~var23 ? var23 : var20;
            int var26 = ~var23 < ~var17 ? var17 : var23;
            if (~var10 != -1) {
                int var27 = (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var24), (double) var10)) & 16383;
                if (var27 != 0) {
                    var5.method517(var27);
                }
            }
            int var28 = var20 > var14 ? var14 : var20;
            int var29 = var14 + var23;
            if (~var10 != -1) {
                int var30 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var28), (double) var10));
                if (~var30 != -1) {
                    var5.method515(-var30);
                }
            }
            if (~(var17 + var20) > ~var29) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field9701;
            if (var31 != 0) {
                var5.method505(0, var31, 0);
            }
        }
        var5.method505(super.field9696, super.field9701 + -10, super.field9705);
        class468 var32 = class429.method2720(3, 0);
        this.field3527 = 0;
        this.field3511 = false;
        if (this.field3518 != -1) {
            class55 var33 = class91.field1083.method2859(this.field3518, (byte) 126).method1050((class144) null, this.field3522, -16083, 2048, 0, 0, -1, arg1, (class428) null);
            if (var33 != null) {
                if (!class534.field7778) {
                    var33.method606(var5, var32.field6948[2], 0);
                } else {
                    var33.method613(var5, var32.field6948[2], class609.field8652, 0);
                }
                this.field3511 |= var33.method614();
                this.field3527 = var33.method612();
            }
        }
        if (arg0 > -38) {
            this.field3518 = 100;
        }
        if (~this.field3531 != 0) {
            class55 var34 = class91.field1083.method2859(this.field3531, (byte) 125).method1050((class144) null, this.field3529, -16083, 2048, 0, 0, -1, arg1, (class428) null);
            if (var34 != null) {
                if (class534.field7778) {
                    var34.method613(var5, var32.field6948[1], class609.field8652, 0);
                } else {
                    var34.method606(var5, var32.field6948[1], 0);
                }
                this.field3511 |= var34.method614();
                if (~var34.method612() < ~this.field3527) {
                    this.field3527 = var34.method612();
                }
            }
        }
        class55 var35 = class91.field1083.method2859(this.field3524, (byte) 126).method1050((class144) null, this.field3510, -16083, 2048, 0, 0, -1, arg1, (class428) null);
        if (var35 != null) {
            if (!class534.field7778) {
                var35.method606(var5, var32.field6948[0], 0);
            } else {
                var35.method613(var5, var32.field6948[0], class609.field8652, 0);
            }
            this.field3511 |= var35.method614();
            if (var35.method612() > this.field3527) {
                this.field3527 = var35.method612();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lr;Z)V")
    public final void method412(class167 arg0, boolean arg1) {
        ++field3521;
        if (arg1) {
            method1603((byte) -71);
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I")
    public final int method393(int arg0) {
        ++field3515;
        if (arg0 != 0) {
            this.method392(true, 25, (class167) null, -8);
        }
        return -10;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZILr;I)Z")
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field3514;
        class393 var5 = arg2.method339();
        var5.method503(super.field9696, super.field9701 - 10, super.field9705);
        if (arg0) {
            return true;
        } else {
            class55 var6 = class91.field1083.method2859(this.field3524, (byte) 122).method1050((class144) null, this.field3510, -16083, 131072, 0, 0, -1, arg2, (class428) null);
            if (var6 != null && (!class534.field7778 ? var6.method648(arg3, arg1, var5, true) : var6.method598(arg3, arg1, var5, true, class609.field8652))) {
                return true;
            } else {
                if (this.field3531 != -1) {
                    class55 var7 = class91.field1083.method2859(this.field3531, (byte) 123).method1050((class144) null, this.field3529, -16083, 131072, 0, 0, -1, arg2, (class428) null);
                    if (var7 != null && (class534.field7778 ? var7.method598(arg3, arg1, var5, true, class609.field8652) : var7.method648(arg3, arg1, var5, true))) {
                        return true;
                    }
                }
                if (~this.field3518 != 0) {
                    class55 var8 = class91.field1083.method2859(this.field3518, (byte) 125).method1050((class144) null, this.field3522, -16083, 131072, 0, 0, -1, arg2, (class428) null);
                    if (var8 != null && (class534.field7778 ? var8.method598(arg3, arg1, var5, true, class609.field8652) : var8.method648(arg3, arg1, var5, true))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)Z")
    public final boolean method402(int arg0) {
        ++field3519;
        return arg0 != 623404585 ? false : this.field3511;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method1602(int arg0) {
        int var1 = 66 / ((arg0 - 21) / 39);
        field3517 = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static final void method1603(byte arg0) {
        class473.field7005 = -1;
        ++field3523;
        if (arg0 != -39) {
            method1599((byte) 11, (float[]) null, 45);
        }
        class106.field1720 = 0;
        class43.field599 = -1;
    }
}
