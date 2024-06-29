import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class451 extends class201 implements class526 {

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "B")
    private byte field6219;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "Z")
    private boolean field6208;

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "Z")
    private boolean field6220;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "B")
    private byte field6212;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Z")
    private boolean field6186;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "S")
    private short field6215;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Z")
    private boolean field6198;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lda;")
    public class55 field6189;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "Lha;")
    private class54 field6216;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field6206 = -1;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lpga;")
    public static class495 field6190;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lcr;")
    private class533 field6195;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lr;Z)V", line = 4)
    public final void method220(class166 arg0, boolean arg1) {
        if (!arg1) {
            this.field6212 = 43;
        }
        ++field6192;
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V", line = 14)
    public final void method227(int arg0) {
        ++field6214;
        if (arg0 >= -115) {
            this.field6212 = 10;
        }
        this.field6220 = false;
        if (this.field6189 != null) {
            this.field6189.method452(this.field6189.method422() & -65537);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILr;)Lda;", line = 28)
    private final class55 method2563(int arg0, int arg1, class166 arg2) {
        ++field6191;
        if (this.field6189 != null && arg2.method134(this.field6189.method422(), arg0) == 0) {
            return this.field6189;
        } else if (arg1 > -114) {
            return null;
        } else {
            class604 var4 = this.method2567(false, 83, arg2, arg0);
            return var4 == null ? null : var4.field8408;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([FIIIFIIIFII)V", line = 49)
    public static final void method2564(float[] arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10) {
        ++field6203;
        int var11 = arg10 - arg9;
        int var12 = arg1 - arg6;
        int var13 = arg7 - arg3;
        float var14 = arg0[2] * (float) var11 + arg0[0] * (float) var13 + arg0[1] * (float) var12;
        float var15 = arg0[5] * (float) var11 + arg0[3] * (float) var13 + arg0[4] * (float) var12;
        float var16 = arg0[8] * (float) var11 + arg0[7] * (float) var12 + arg0[6] * (float) var13;
        float var17 = 0.5F + (float) Math.atan2((double) var14, (double) var16) / 6.2831855F;
        if (arg2 == -18692) {
            if (arg4 != 1.0F) {
                var17 = arg4 * var17;
            }
            float var18 = var15 + 0.5F + arg8;
            if (arg5 == 1) {
                float var19 = var17;
                var17 = -var18;
                var18 = var19;
            } else if (arg5 == 2) {
                var18 = -var18;
                var17 = -var17;
            } else if (~arg5 == -4) {
                float var20 = var17;
                var17 = var18;
                var18 = -var20;
            }
            class90.field1295 = var17;
            class560.field7542 = var18;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I", line = 103)
    public final int method213(byte arg0) {
        ++field6204;
        return arg0 <= 39 ? 127 : this.field6219;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I", line = 117)
    public final int method217(int arg0) {
        if (arg0 <= 29) {
            return -22;
        } else {
            ++field6194;
            return this.field6189 != null ? this.field6189.method463() : 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 128)
    public final void method208(int arg0) {
        if (this.field6189 != null) {
            this.field6189.method432();
        }
        ++field6193;
        if (arg0 != -18279) {
            this.field6189 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)Lba;", line = 142)
    public static final class352 method2565(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 262144) {
            method2564((float[]) null, -121, 102, 95, -0.25277197F, 108, 10, 28, -1.54123F, 101, 113);
        }
        ++field6209;
        class352 var4 = null;
        if (arg1 == 0) {
            var4 = class290.method1786(98, class199.field2836, class162.field2332);
            ++class206.field2882;
        }
        if (arg1 == 1) {
            ++class533.field7212;
            var4 = class290.method1786(98, class199.field2836, class159.field2316);
        }
        var4.field4686.method2812(109, arg2 - -class498.field6774);
        var4.field4686.method2812(73, class613.field8555 + arg0);
        var4.field4686.method2817(!class353.field4698.method34(82, arg3 ^ -278359) ? 0 : 1, true);
        class525.field7124 = arg2;
        class583.field8209 = false;
        class289.field3961 = arg0;
        class428.method2458((byte) -105);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z", line = 175)
    public final boolean method219(int arg0) {
        int var2 = 87 % ((28 - arg0) / 40);
        ++field6202;
        return this.field6198;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIIZ)V", line = 187)
    public class451(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class257.method1577(arg9, arg8, 1));
        this.field6219 = (byte) arg9;
        this.field6208 = ~arg1.field4164 != -1 && !arg7;
        this.field6220 = arg10;
        super.field4042 = arg4;
        this.field6212 = (byte) arg8;
        super.field4047 = arg6;
        this.field6186 = arg7;
        this.field6215 = (short) arg1.field4131;
        this.field6198 = arg0.method94() && arg1.field4128 && !this.field6186 && class366.field4875.method3770(class503.field6917, true) != 0;
        int var12 = 2048;
        if (this.field6220) {
            var12 |= 65536;
        }
        class604 var13 = this.method2567(this.field6198, 85, arg0, var12);
        if (var13 != null) {
            this.field6189 = var13.field8408;
            this.field6216 = var13.field8406;
            if (this.field6220) {
                this.field6189 = this.field6189.method462((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lr;I)V", line = 227)
    public final void method225(class166 arg0, int arg1) {
        if (arg1 != -32013) {
            field6206 = 120;
        }
        ++field6201;
        Object var3 = null;
        class54 var5;
        if (this.field6216 == null && this.field6198) {
            class604 var4 = this.method2567(true, 103, arg0, 262144);
            var5 = var4 == null ? null : var4.field8406;
        } else {
            var5 = this.field6216;
            this.field6216 = null;
        }
        if (var5 != null) {
            class482.method2706(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)Z", line = 255)
    public final boolean method209(byte arg0) {
        int var2 = -80 % ((31 - arg0) / 42);
        ++field6213;
        return this.field6189 == null ? false : this.field6189.method430();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLr;)V", line = 269)
    public final void method210(byte arg0, class166 arg1) {
        ++field6188;
        Object var3 = null;
        if (arg0 != 12) {
            field6190 = null;
        }
        class54 var5;
        if (this.field6216 == null && this.field6198) {
            class604 var4 = this.method2567(true, 82, arg1, 262144);
            var5 = var4 == null ? null : var4.field8406;
        } else {
            var5 = this.field6216;
            this.field6216 = null;
        }
        if (var5 != null) {
            class403.method2350(var5, super.field4050, super.field4042, super.field4047, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lvv;IIZLr;II)V", line = 296)
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg0 instanceof class451) {
            class451 var8 = (class451) arg0;
            if (this.field6189 != null && var8.field6189 != null) {
                this.field6189.method467(var8.field6189, arg5, arg1, arg2, arg3);
            }
        } else if (arg0 instanceof class22) {
            class22 var9 = (class22) arg0;
            if (this.field6189 != null && var9.field272 != null) {
                this.field6189.method467(var9.field272, arg5, arg1, arg2, arg3);
            }
        }
        if (arg6 != 0) {
            this.field6198 = false;
        }
        ++field6200;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Z", line = 328)
    public final boolean method216(boolean arg0) {
        ++field6211;
        if (!arg0) {
            this.field6186 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V", line = 340)
    public static void method2566(int arg0) {
        if (arg0 == 14995) {
            field6190 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZILr;I)Lfh;", line = 351)
    private final class604 method2567(boolean arg0, int arg1, class166 arg2, int arg3) {
        ++field6199;
        class301 var5 = class475.field6543.method2685(65535 & this.field6215, -52);
        class37 var6;
        class37 var7;
        if (this.field6186) {
            var6 = class52.field606[super.field4050];
            var7 = class497.field6766[0];
        } else {
            var6 = class497.field6766[super.field4050];
            if (~super.field4050 > -4) {
                var7 = class497.field6766[super.field4050 + 1];
            } else {
                var7 = null;
            }
        }
        if (arg1 < 73) {
            this.field6212 = -91;
        }
        return var5.method1826(super.field4042, 11553, super.field4047, var7, arg0, arg3, arg2, var6, this.field6212, super.field4052, this.field6219);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I", line = 381)
    public final int method211(byte arg0) {
        int var2 = 50 / ((arg0 - 38) / 41);
        ++field6217;
        return this.field6215 & 65535;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)Z", line = 396)
    public final boolean method215(int arg0) {
        ++field6187;
        if (arg0 < 49) {
            this.field6212 = -94;
        }
        return this.field6220;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lr;I)Lbca;", line = 411)
    public final class614 method221(class166 arg0, int arg1) {
        ++field6205;
        if (this.field6189 == null) {
            return null;
        } else {
            class392 var3 = arg0.method166();
            if (arg1 != -5) {
                this.field6220 = false;
            }
            var3.method689(super.field4042, super.field4052, super.field4047);
            class614 var4 = null;
            if (this.field6208) {
                var4 = class524.method2987(6257, 1);
            }
            if (class340.field4563) {
                this.field6189.method453(var3, var4 != null ? var4.field8572[0] : null, class22.field250, 0);
            } else {
                this.field6189.method465(var3, var4 == null ? null : var4.field8572[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)I", line = 442)
    public final int method222(boolean arg0) {
        if (!arg0) {
            return -7;
        } else {
            ++field6207;
            return this.field6212;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I", line = 457)
    public final int method226(int arg0) {
        ++field6210;
        if (arg0 != 6329) {
            return 26;
        } else {
            return this.field6189 == null ? 0 : this.field6189.method426();
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILr;)Z", line = 468)
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field6196;
        if (arg1 != 0) {
            return true;
        } else {
            class55 var5 = this.method2563(131072, -121, arg3);
            if (var5 != null) {
                class392 var6 = arg3.method166();
                var6.method689(super.field4042, super.field4052, super.field4047);
                return class340.field4563 ? var5.method419(arg2, arg0, var6, false, class22.field250) : var5.method448(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILr;)Lcr;", line = 496)
    public final class533 method214(int arg0, class166 arg1) {
        ++field6185;
        int var3 = -90 % ((81 - arg0) / 43);
        if (this.field6195 == null) {
            this.field6195 = class333.method1966(super.field4042, 16, super.field4052, this.method2563(0, -128, arg1), super.field4047);
        }
        return this.field6195;
    }
}
