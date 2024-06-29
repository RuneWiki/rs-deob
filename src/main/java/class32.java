import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class32 extends class264 {

    @OriginalMember(owner = "client!na", name = "zc", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!na", name = "jc", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!na", name = "kc", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!na", name = "lc", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!na", name = "mc", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!na", name = "nc", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!na", name = "oc", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!na", name = "pc", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!na", name = "qc", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!na", name = "rc", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!na", name = "uc", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!na", name = "vc", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!na", name = "wc", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!na", name = "xc", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!na", name = "yc", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!na", name = "Ac", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!na", name = "sc", descriptor = "Luf;")
    public static class176 field517;

    @OriginalMember(owner = "client!na", name = "tc", descriptor = "Llf;")
    public class217 field518;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Z")
    public final boolean method229(int arg0) {
        ++field511;
        if (this.field518 == null) {
            return false;
        } else {
            return arg0 != -18109 ? true : true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILuf;)I")
    public static final int method254(int arg0, class176 arg1) {
        ++field513;
        int var2 = 0;
        int var3 = -107 % ((65 - arg0) / 49);
        if (arg1.method1147(class45.field718, -85)) {
            ++var2;
        }
        if (arg1.method1147(class255.field3910, -53)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        ++field508;
        if (arg0 != 82) {
            method258(82, (class168) null);
        }
        if (!class209.field3246) {
            class216.field3333 = true;
            if (class195.field3070) {
                class161.field2460 = (float) ((int) class161.field2460 + 47 & -16);
            } else {
                class26.field400 += (-class26.field400 + 12.0F) / 2.0F;
            }
            class209.field3246 = true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I")
    public final int method218(byte arg0) {
        ++field520;
        if (~class154.field2352 != -1 && this.field518.field3405 != null) {
            class217 var2 = this.field518.method1446(arg0 ^ -21);
            if (var2 != null && var2.field3361 != -1) {
                return var2.field3361;
            }
        }
        if (arg0 != -51) {
            field524 = -35;
        }
        return super.field4203;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()I")
    public final int method223() {
        ++field514;
        return super.field4177;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method256(boolean arg0) {
        field517 = null;
        if (!arg0) {
            method260(94, true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        if (arg4 < 121) {
            field517 = null;
        }
        ++field515;
        int var9 = arg0;
        int var10 = 0;
        int var11 = -arg7 + arg1;
        int var12 = -arg7 + arg0;
        int var13 = arg0 * arg0;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var13 << 1;
        int var17 = var12 * var12;
        int var18 = var15 << 1;
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = arg0 << 1;
        int var22 = (-var21 + 1) * var14 + var16;
        int var23 = -((var21 + -1) * var19) + var13;
        int var24 = var12 << 1;
        int var25 = var14 << 2;
        int var26 = (-var24 + 1) * var15 - -var20;
        int var27 = var17 - (var24 + -1) * var18;
        int var28 = var15 << 2;
        int var29 = var13 << 2;
        int var30 = var16 * 3;
        int var31 = var17 << 2;
        int var32 = (var21 - 3) * var19;
        int var33 = var20 * 3;
        int var34 = var29;
        int var35 = (arg0 + -1) * var25;
        int var36 = (var24 + -3) * var18;
        int var37 = (var12 + -1) * var28;
        int[] var38 = class156.field2379[arg2];
        class263.method1788(-arg1 + arg3, -18732, arg5, var38, arg3 - var11);
        int var39 = var31;
        class263.method1788(arg3 - var11, -18732, arg6, var38, arg3 - -var11);
        class263.method1788(arg3 + var11, -18732, arg5, var38, arg3 - -arg1);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            --var9;
            if (var22 < 0) {
                while (var22 < 0) {
                    var23 += var34;
                    var22 += var30;
                    var30 += var29;
                    ++var8;
                    var34 += var29;
                }
            }
            if (~var23 > -1) {
                var22 += var30;
                var30 += var29;
                ++var8;
                var23 += var34;
                var34 += var29;
            }
            var23 += -var32;
            var32 -= var25;
            if (var40) {
                if (~var26 > -1) {
                    while (var26 < 0) {
                        var26 += var33;
                        var27 += var39;
                        ++var10;
                        var33 += var31;
                        var39 += var31;
                    }
                }
                if (var27 < 0) {
                    var27 += var39;
                    var26 += var33;
                    ++var10;
                    var33 += var31;
                    var39 += var31;
                }
                var26 += -var37;
                var27 += -var36;
                var36 -= var28;
                var37 -= var28;
            }
            var22 += -var35;
            int var41 = arg2 + var9;
            int var42 = arg3 + var8;
            int var43 = -var8 + arg3;
            var35 -= var25;
            int var44 = -var9 + arg2;
            if (!var40) {
                class263.method1788(var43, -18732, arg5, class156.field2379[var44], var42);
                class263.method1788(var43, -18732, arg5, class156.field2379[var41], var42);
            } else {
                int var45 = arg3 + var10;
                int var46 = -var10 + arg3;
                class263.method1788(var43, -18732, arg5, class156.field2379[var44], var46);
                class263.method1788(var46, -18732, arg6, class156.field2379[var44], var45);
                class263.method1788(var45, -18732, arg5, class156.field2379[var44], var42);
                class263.method1788(var43, -18732, arg5, class156.field2379[var41], var46);
                class263.method1788(var46, -18732, arg6, class156.field2379[var41], var45);
                class263.method1788(var45, -18732, arg5, class156.field2379[var41], var42);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILcg;)V")
    public static final void method258(int arg0, class168 arg1) {
        ++field519;
        for (int var2 = 0; ~var2 > ~class65.field1028.length; ++var2) {
            class65.field1028[var2] = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = -21 % ((-79 - arg0) / 37);
        while (var4 < 5000) {
            int var17 = (int) (128.0D * Math.random() * (double) var3);
            class65.field1028[var17] = (int) (Math.random() * 284.0D);
            ++var4;
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; ~var13 > ~(var3 + -1); ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    class161.field2470[var16] = (class65.field1028[var16 - -1] + class65.field1028[var16 + -1] + class65.field1028[var16 - 128] + class65.field1028[var16 - -128]) / 4;
                }
            }
            int[] var14 = class65.field1028;
            class65.field1028 = class161.field2470;
            class161.field2470 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; ~arg1.field2676 < ~var8; ++var8) {
                for (int var9 = 0; ~arg1.field2670 < ~var9; ++var9) {
                    if (~arg1.field2531[var7++] != -1) {
                        int var10 = var9 + 16 - -arg1.field2671;
                        int var11 = 16 - -arg1.field2673 + var8;
                        int var12 = (var11 << 7) + var10;
                        class65.field1028[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Llf;I)V")
    public final void method259(class217 arg0, int arg1) {
        this.field518 = arg0;
        if (super.field4144 != null) {
            super.field4144.method1624();
        }
        if (arg1 != -2308) {
            this.finalize();
        }
        ++field522;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10) {
        ++field509;
        if (this.field518 != null) {
            class223 var13 = ~super.field4210 != 0 && super.field4179 == 0 ? class28.method224(super.field4210, 119) : null;
            class223 var14 = ~super.field4148 == 0 || ~super.field4148 == ~this.method1801((byte) 126).field142 && var13 != null ? null : class28.method224(super.field4148, 126);
            class233 var15 = this.field518.method1450(super.field4196, 0, super.field4215, super.field4194, var14, super.field4164, super.field4185, super.field4175, var13, super.field4192);
            if (var15 != null) {
                super.field4177 = var15.method223();
                class217 var16 = this.field518;
                if (var16.field3405 != null) {
                    var16 = var16.method1446(-123);
                }
                if (class272.field4299 && var16.field3350) {
                    class233 var17 = class263.method1786(super.field4176, super.field4187, this.field518.field3367, var14 == null ? super.field4185 : super.field4164, this.field518.field3353, var15, super.field4157, super.field4123, 16777215, this.field518.field3346, var14 == null ? var13 : var14, this.field518.field3387, arg0, this.field518.field3352);
                    var17.method225(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4144);
                }
                this.method1800(var15, 43);
                this.method1802(arg0, 0, var15);
                class233 var18 = null;
                if (super.field4135 != -1 && ~super.field4188 != 0) {
                    class259 var19 = class23.method189(super.field4135, (byte) -122);
                    var18 = var19.method1717(super.field4206, super.field4136, super.field4188, -29868);
                    if (var18 != null) {
                        var18.method1549(0, -super.field4137, 0);
                        if (var19.field3960) {
                            if (class271.field4283 != 0) {
                                var18.method1553(class271.field4283);
                            }
                            if (~class253.field3892 != -1) {
                                var18.method1546(class253.field3892);
                            }
                            if (class257.field3947 != 0) {
                                var18.method1549(0, class257.field3947, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class281) var15).method1891(var18);
                }
                if (~this.field518.field3352 == -2) {
                    var15.field3609 = true;
                }
                var15.method225(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4144);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field523;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Lfd;")
    public static final class123 method260(int arg0, boolean arg1) {
        ++field525;
        class123 var2 = (class123) class294.field4625.method1780((long) arg0, (byte) -115);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class169.field2533.method1163(class94.method736(-1677178904, arg0), class44.method368(arg0, (byte) 18), 48);
            class123 var4 = new class123();
            var4.field1934 = arg0;
            if (var3 != null) {
                var4.method888((byte) 82, new class37(var3));
            }
            var4.method880(0);
            if (!arg1) {
                method258(87, (class168) null);
            }
            if (var4.field1922 != -1) {
                var4.method883((byte) -41, method260(var4.field1901, true), method260(var4.field1922, true));
            }
            if (var4.field1887 != -1) {
                var4.method877(method260(var4.field1935, true), 32621, method260(var4.field1887, arg1));
            }
            if (!class216.field3343 && var4.field1917) {
                var4.field1908 = class147.field2280;
                var4.field1927 = 0;
                var4.field1885 = class163.field2481;
                var4.field1926 = class15.field251;
                var4.field1900 = false;
            }
            class294.field4625.method1784(var4, !arg1, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field521;
        if (this.field518 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(III)Lag;")
    public static final class188 method261(int arg0, int arg1, int arg2) {
        if (arg2 <= 12) {
            method261(8, 120, -118);
        }
        ++field512;
        class188 var3 = class5.method57((byte) -117, arg0);
        if (arg1 == -1) {
            return var3;
        } else {
            return var3 != null && var3.field2968 != null && ~var3.field2968.length < ~arg1 ? var3.field2968[arg1] : null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Luf;I)V")
    public static final void method262(class176 arg0, int arg1) {
        class69.field1095 = arg0;
        ++field510;
        if (arg1 != -29708) {
            field517 = null;
        }
    }
}
