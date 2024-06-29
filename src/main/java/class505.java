import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class505 extends class778 {

    @OriginalMember(owner = "client!cga", name = "V", descriptor = "I")
    private int field7215 = 0;

    @OriginalMember(owner = "client!cga", name = "ib", descriptor = "I")
    private int field7227 = 0;

    @OriginalMember(owner = "client!cga", name = "gb", descriptor = "I")
    private int field7225 = 0;

    @OriginalMember(owner = "client!cga", name = "kb", descriptor = "I")
    private int field7229 = -1;

    @OriginalMember(owner = "client!cga", name = "db", descriptor = "I")
    private int field7222 = 0;

    @OriginalMember(owner = "client!cga", name = "eb", descriptor = "Z")
    private boolean field7223 = true;

    @OriginalMember(owner = "client!cga", name = "fb", descriptor = "I")
    private int field7224 = 0;

    @OriginalMember(owner = "client!cga", name = "vb", descriptor = "Z")
    public boolean field7240 = false;

    @OriginalMember(owner = "client!cga", name = "pb", descriptor = "I")
    private int field7234;

    @OriginalMember(owner = "client!cga", name = "wb", descriptor = "I")
    public int field7241;

    @OriginalMember(owner = "client!cga", name = "R", descriptor = "Lco;")
    private class129 field7211;

    @OriginalMember(owner = "client!cga", name = "sb", descriptor = "Lpd;")
    public static class267 field7237 = new class267();

    @OriginalMember(owner = "client!cga", name = "S", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!cga", name = "T", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!cga", name = "U", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!cga", name = "X", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!cga", name = "Y", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!cga", name = "Z", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!cga", name = "ab", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!cga", name = "bb", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!cga", name = "cb", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!cga", name = "hb", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!cga", name = "jb", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!cga", name = "lb", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!cga", name = "mb", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!cga", name = "nb", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!cga", name = "ob", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!cga", name = "qb", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!cga", name = "rb", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!cga", name = "ub", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!cga", name = "tb", descriptor = "Lqo;")
    private class24 field7238;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lha;I)V", line = 8)
    public final void method257(class66 arg0, int arg1) {
        if (arg1 >= 60) {
            ++field7226;
            class495 var3 = this.method2941(arg0, this.field7234, 0, (byte) 98);
            if (var3 != null) {
                class378 var4 = arg0.method433();
                var4.method1959(super.field7718, super.field7723, super.field7719);
                this.method2944(var4, var3, arg0, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 136)
    public class505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7234 = arg0;
        this.field7241 = arg1 + arg2;
        this.field7224 = arg12;
        class55 var14 = class87.field1131.method1548(64, this.field7234);
        int var15 = var14.field753;
        if (var15 != -1) {
            this.field7211 = class203.field2975.method1931((byte) -81, var15);
            this.field7240 = false;
        } else {
            this.field7240 = true;
        }
        if (~this.field7241 == ~arg2) {
            class524.method3048((byte) 17, this.field7227, this, this.field7211);
        }
    }

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "(I)Z", line = 35)
    public final boolean method244(int arg0) {
        ++field7235;
        int var2 = -28 % ((arg0 - -19) / 57);
        return false;
    }

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)I", line = 45)
    public final int method246(int arg0) {
        ++field7230;
        return arg0 > -104 ? -101 : this.field7215;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZLha;I)Z", line = 56)
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field7239;
        return !arg1;
    }

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "(I)I", line = 67)
    public final int method239(int arg0) {
        if (arg0 >= -9) {
            this.method246(50);
        }
        ++field7212;
        return this.field7225;
    }

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "(I)V", line = 80)
    public final void method240(int arg0) {
        ++field7216;
        if (arg0 != -1) {
            this.method258((class66) null, (byte) -17);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 94)
    public static void method2940(byte arg0) {
        field7237 = null;
        int var1 = -121 / ((arg0 - 31) / 35);
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)Z", line = 103)
    public final boolean method248(byte arg0) {
        ++field7221;
        if (arg0 != -55) {
            method2942(56, 120, -81, 2, -107, 63, 113, -117);
        }
        return this.field7223;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lha;IIB)Lka;", line = 114)
    private final class495 method2941(class66 arg0, int arg1, int arg2, byte arg3) {
        ++field7217;
        class55 var5 = class87.field1131.method1548(arg3 ^ 34, arg1);
        class292 var6 = class750.field10395[super.field7710];
        if (arg3 != 98) {
            this.method248((byte) 69);
        }
        class292 var7 = ~super.field7711 > -4 ? class750.field10395[super.field7711 + 1] : null;
        return !this.field7240 ? var5.method350(class203.field2975, var7, super.field7719, (byte) 2, this.field7222, this.field7229, super.field7718, var6, true, this.field7227, super.field7723, arg0, arg2) : var5.method350(class203.field2975, var7, super.field7719, (byte) 2, 0, -1, super.field7718, var6, true, -1, super.field7723, arg0, arg2);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lha;B)Lhq;", line = 167)
    public final class167 method258(class66 arg0, byte arg1) {
        ++field7218;
        class495 var3 = this.method2941(arg0, this.field7234, 2048 | (this.field7224 != 0 ? 5 : 0), (byte) 98);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field7224 != -1) {
                var3.method72(this.field7224 * 2048);
            }
            class378 var4 = arg0.method433();
            if (arg1 != 10) {
                this.method2944((class378) null, (class495) null, (class66) null, (byte) -110);
            }
            var4.method1959(super.field7718, super.field7723, super.field7719);
            this.method2944(var4, var3, arg0, (byte) 120);
            class167 var5 = class653.method3739(0, 1, false);
            if (!class475.field6760) {
                var3.method108(var4, var5.field2426[0], 0);
            } else {
                var3.method91(var4, var5.field2426[0], class412.field5822, 0);
            }
            if (this.field7238 != null) {
                class443 var6 = this.field7238.method184();
                if (!class475.field6760) {
                    arg0.method437(var6);
                } else {
                    arg0.method464(var6, class412.field5822);
                }
            }
            this.field7223 = var3.method88();
            this.field7215 = var3.method75();
            this.field7225 = var3.method67();
            return var5;
        }
    }

    @OriginalMember(owner = "client!cga", name = "finalize", descriptor = "()V", line = 215)
    protected final void finalize() {
        if (this.field7238 != null) {
            this.field7238.method186();
        }
        ++field7220;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIIII)V", line = 226)
    public static final void method2942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7213;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg7 - arg5;
        int var12 = arg6 - arg5;
        int var13 = arg7 * arg7;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 - 1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        if (arg0 != 2048) {
            method2942(62, -93, 94, 12, 60, -68, -66, 10);
        }
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg6 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class347.field5087[arg4];
        class382.method2347(-arg7 + arg3, var39, arg2, 7, arg3 - var11);
        class382.method2347(-var11 + arg3, var39, arg1, 7, arg3 + var11);
        class382.method2347(arg3 + var11, var39, arg2, 7, arg3 + arg7);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    ++var10;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                ++var8;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            --var9;
            var36 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 - -var9;
            int var43 = arg3 + var8;
            int var44 = -var8 + arg3;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = -var10 + arg3;
                class382.method2347(var44, class347.field5087[var41], arg2, arg0 ^ 2055, var46);
                class382.method2347(var46, class347.field5087[var41], arg1, arg0 + -2041, var45);
                class382.method2347(var45, class347.field5087[var41], arg2, arg0 ^ 2055, var43);
                class382.method2347(var44, class347.field5087[var42], arg2, 7, var46);
                class382.method2347(var46, class347.field5087[var42], arg1, 7, var45);
                class382.method2347(var45, class347.field5087[var42], arg2, 7, var43);
            } else {
                class382.method2347(var44, class347.field5087[var41], arg2, arg0 + -2041, var43);
                class382.method2347(var44, class347.field5087[var42], arg2, 7, var43);
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "(B)V", line = 399)
    public final void method2943(byte arg0) {
        ++field7219;
        if (this.field7238 != null) {
            this.field7238.method186();
        }
        int var2 = 5 % ((arg0 - 29) / 38);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Leh;Lka;Lha;B)V", line = 414)
    private final void method2944(class378 arg0, class495 arg1, class66 arg2, byte arg3) {
        if (arg3 == 120) {
            ++field7236;
            arg1.method63(arg0);
            class338[] var5 = arg1.method54();
            class92[] var6 = arg1.method116();
            if ((this.field7238 == null || this.field7238.field353) && (var5 != null || var6 != null)) {
                this.field7238 = class24.method185(class673.field9441, true);
            }
            if (this.field7238 != null) {
                this.field7238.method190(arg2, (long) class673.field9441, var5, var6, false);
                this.field7238.method176(super.field7710, super.field10733, super.field10727, super.field10730, super.field10736);
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)V", line = 440)
    public final void method2945(byte arg0, int arg1) {
        ++field7214;
        if (arg0 > -118) {
            this.field7227 = 13;
        }
        if (!this.field7240) {
            this.field7222 += arg1;
            while (~this.field7211.field1668[this.field7227] > ~this.field7222) {
                this.field7222 -= this.field7211.field1668[this.field7227];
                ++this.field7227;
                if (this.field7227 >= this.field7211.field1684.length) {
                    this.field7240 = true;
                    break;
                }
            }
            if (!this.field7240) {
                class524.method3048((byte) 17, this.field7227, this, this.field7211);
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILsf;Lha;BIIZ)V", line = 473)
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        ++field7232;
        if (arg3 != 0) {
            this.field7227 = 97;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(B)Z", line = 499)
    public final boolean method254(byte arg0) {
        ++field7228;
        return arg0 != 104 ? false : false;
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(Lha;B)Lpw;", line = 512)
    public final class733 method255(class66 arg0, byte arg1) {
        int var3 = -68 / ((-45 - arg1) / 63);
        ++field7231;
        return null;
    }
}
