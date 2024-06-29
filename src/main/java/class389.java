import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class389 extends class675 implements class624 {

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Z")
    private boolean field5416;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "Z")
    private boolean field5421;

    @OriginalMember(owner = "client!ah", name = "xb", descriptor = "Z")
    private boolean field5446;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "S")
    private short field5428;

    @OriginalMember(owner = "client!ah", name = "jb", descriptor = "B")
    private byte field5432;

    @OriginalMember(owner = "client!ah", name = "ib", descriptor = "B")
    private byte field5431;

    @OriginalMember(owner = "client!ah", name = "ob", descriptor = "Z")
    private boolean field5437;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lr;")
    private class184 field5424;

    @OriginalMember(owner = "client!ah", name = "mb", descriptor = "Lka;")
    public class475 field5435;

    @OriginalMember(owner = "client!ah", name = "yb", descriptor = "F")
    public static float field5447;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ah", name = "hb", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!ah", name = "kb", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ah", name = "lb", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!ah", name = "nb", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ah", name = "pb", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ah", name = "qb", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ah", name = "rb", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ah", name = "tb", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ah", name = "ub", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ah", name = "vb", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!ah", name = "wb", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!ah", name = "sb", descriptor = "Lck;")
    private class642 field5441;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLha;)Lck;")
    public final class642 method808(byte arg0, class59 arg1) {
        ++field5415;
        if (this.field5441 == null) {
            this.field5441 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, this.method2306(arg1, 0, -84));
        }
        if (arg0 > -86) {
            this.field5437 = true;
        }
        return this.field5441;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Z")
    public final boolean method1761(int arg0) {
        if (arg0 != -28823) {
            return false;
        } else {
            ++field5425;
            return this.field5437;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZLha;I)Lga;")
    private final class407 method2303(int arg0, boolean arg1, class59 arg2, int arg3) {
        ++field5445;
        class100 var5 = class462.field6333.method2008((byte) -95, this.field5428 & 65535);
        class282 var6;
        class282 var7;
        if (!this.field5421) {
            if (~super.field3515 > -4) {
                var6 = class113.field1866[super.field3515 + 1];
            } else {
                var6 = null;
            }
            var7 = class113.field1866[super.field3515];
        } else {
            var7 = class588.field7675[super.field3515];
            var6 = class113.field1866[0];
        }
        int var8 = 110 / ((arg3 - 61) / 39);
        return var5.method736(this.field5431 == 11 ? this.field5432 + 4 : this.field5432, arg1, (class379) null, arg0, super.field3510, arg2, (byte) 85, super.field3502, ~this.field5431 != -12 ? this.field5431 : 10, super.field3505, var7, var6);
    }

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)I")
    public final int method789(int arg0) {
        if (arg0 != -32768) {
            return -116;
        } else {
            ++field5440;
            return this.field5435 == null ? 0 : this.field5435.method180();
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)Z")
    public final boolean method801(boolean arg0) {
        ++field5430;
        if (this.field5435 != null) {
            return this.field5435.method159();
        } else {
            if (arg0) {
                this.field5424 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lha;IIB)Z")
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field5427;
        if (arg3 != 103) {
            this.method798(9);
        }
        class475 var5 = this.method2306(arg0, 131072, arg3 ^ -126);
        if (var5 != null) {
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return class540.field7159 ? var5.method203(arg2, arg1, var6, false, 0, class100.field1358) : var5.method158(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public final void method1754(boolean arg0) {
        ++field5420;
        if (arg0) {
            if (this.field5435 != null) {
                this.field5435.method181();
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
    public static final void method2304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5436;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg3 >= -96) {
            method2304(117, -23, -38, -38, -48, 125);
        }
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 + -1) * var15;
        class717.method4012(arg2, -81, -arg5 + arg4, class690.field9616[arg1], arg4 + arg5);
        while (var7 > 0) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
                ++var6;
            }
            var14 += -var18;
            var13 += -var20;
            --var7;
            var20 -= var15;
            var18 -= var15;
            int var21 = -var7 + arg1;
            int var22 = arg1 + var7;
            int var23 = arg4 + var6;
            int var24 = -var6 + arg4;
            class717.method4012(arg2, -126, var24, class690.field9616[var21], var23);
            class717.method4012(arg2, -89, var24, class690.field9616[var22], var23);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)I")
    public final int method1757(byte arg0) {
        ++field5418;
        int var2 = 109 / ((-57 - arg0) / 53);
        return this.field5431;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
    public final int method1759(byte arg0) {
        if (arg0 < 63) {
            this.method1757((byte) -54);
        }
        ++field5443;
        return this.field5428 & 65535;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
    public final boolean method798(int arg0) {
        int var2 = -75 / ((53 - arg0) / 45);
        ++field5417;
        return this.field5416;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lkf;Lha;IIIZI)V")
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 < 109) {
            this.field5437 = true;
        }
        if (arg0 instanceof class761) {
            class761 var8 = (class761) arg0;
            if (this.field5435 != null && var8.field10605 != null) {
                this.field5435.method170(var8.field10605, arg2, arg6, arg4, arg5);
            }
        } else if (arg0 instanceof class389) {
            class389 var9 = (class389) arg0;
            if (this.field5435 != null && var9.field5435 != null) {
                this.field5435.method170(var9.field5435, arg2, arg6, arg4, arg5);
            }
        }
        ++field5433;
    }

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "(I)I")
    public final int method2305(int arg0) {
        if (arg0 != -13876) {
            this.field5416 = true;
        }
        ++field5426;
        return this.field5435 == null ? 15 : this.field5435.method209() / 4;
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V")
    public final void method803(int arg0) {
        if (arg0 != 131072) {
            this.field5431 = -3;
        }
        this.field5416 = false;
        ++field5422;
        if (this.field5435 != null) {
            this.field5435.method190(this.field5435.method214() & -65537);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)I")
    public final int method1752(byte arg0) {
        ++field5419;
        return arg0 != -111 ? -9 : this.field5432;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILha;)V")
    public final void method1758(int arg0, class59 arg1) {
        ++field5439;
        Object var3 = null;
        if (arg0 != 6120) {
            this.method800(-125, (class59) null);
        }
        class184 var5;
        if (this.field5424 == null && this.field5437) {
            class407 var4 = this.method2303(262144, true, arg1, 100);
            var5 = var4 != null ? var4.field5657 : null;
        } else {
            var5 = this.field5424;
            this.field5424 = null;
        }
        if (var5 != null) {
            class562.method3115(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(B)Z")
    public final boolean method806(byte arg0) {
        ++field5434;
        int var2 = -71 / ((14 - arg0) / 57);
        if (this.field5435 != null) {
            return !this.field5435.method192();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(B)I")
    public final int method791(byte arg0) {
        ++field5442;
        if (arg0 <= 81) {
            this.field5437 = false;
        }
        return this.field5435 != null ? this.field5435.method167() : 0;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIIIIIIZ)V")
    public class389(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1290 == -2, class195.method1332(arg13, arg12, (byte) 55));
        this.field5416 = arg14;
        super.field3515 = (byte) arg3;
        this.field5421 = arg7;
        this.field5446 = ~arg1.field1363 != -1 && !arg7;
        this.field5428 = (short) arg1.field1301;
        this.field5432 = (byte) arg13;
        this.field5431 = (byte) arg12;
        this.field5437 = arg0.method468() && arg1.field1343 && !this.field5421 && class411.field5711.field3897.method1057(true) != 0;
        int var16 = 2048;
        if (this.field5416) {
            var16 |= 65536;
        }
        class407 var17 = this.method2303(var16, this.field5437, arg0, 100);
        if (var17 != null) {
            this.field5424 = var17.field5657;
            this.field5435 = var17.field5651;
            if (this.field5416) {
                this.field5435 = this.field5435.method171((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLha;)V")
    public final void method1756(boolean arg0, class59 arg1) {
        ++field5429;
        Object var3 = null;
        class184 var5;
        if (this.field5424 == null && this.field5437) {
            class407 var4 = this.method2303(262144, true, arg1, 5);
            var5 = var4 != null ? var4.field5657 : null;
        } else {
            var5 = this.field5424;
            this.field5424 = null;
        }
        if (var5 != null) {
            class265.method1601(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
        }
        if (!arg0) {
            this.method803(-67);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lha;B)V")
    public final void method792(class59 arg0, byte arg1) {
        if (arg1 < 121) {
            method2304(124, -54, 114, 103, -122, 127);
        }
        ++field5423;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lha;II)Lka;")
    private final class475 method2306(class59 arg0, int arg1, int arg2) {
        int var4 = 95 / ((arg2 - 33) / 35);
        ++field5438;
        if (this.field5435 != null && ~arg0.method405(this.field5435.method214(), arg1) == -1) {
            return this.field5435;
        } else {
            class407 var5 = this.method2303(arg1, false, arg0, 104);
            return var5 == null ? null : var5.field5651;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(ILha;)Lww;")
    public final class733 method800(int arg0, class59 arg1) {
        ++field5444;
        if (this.field5435 == null) {
            return null;
        } else {
            class333 var3 = arg1.method451();
            var3.method1727(super.field3505, super.field3510, super.field3502);
            class733 var4 = class397.method2338(this.field5446, (byte) 120, 1);
            if (arg0 != -1) {
                this.method803(80);
            }
            if (class540.field7159) {
                this.field5435.method160(var3, var4.field10150[0], class100.field1358, 0);
            } else {
                this.field5435.method155(var3, var4.field10150[0], 0);
            }
            return var4;
        }
    }
}
