import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class543 extends class493 implements class231 {

    @OriginalMember(owner = "client!oca", name = "L", descriptor = "Z")
    private boolean field7570;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "Z")
    private boolean field7554;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "B")
    private byte field7547;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "Z")
    private boolean field7549;

    @OriginalMember(owner = "client!oca", name = "H", descriptor = "S")
    private short field7566;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "B")
    private byte field7568;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "Z")
    private boolean field7564;

    @OriginalMember(owner = "client!oca", name = "N", descriptor = "Lr;")
    private class519 field7572;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "Lk;")
    private class88 field7555;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!oca", name = "M", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!oca", name = "O", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "Lkm;")
    private class120 field7563;

    @OriginalMember(owner = "client!oca", name = "P", descriptor = "[[B")
    public static byte[][] field7574;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZLqa;)V", line = 4)
    public final void method268(boolean arg0, class167 arg1) {
        ++field7556;
        if (!arg0) {
            method3044(112, -87, 16, 50, -33, 81, -59, 12, -60, -34);
        }
        Object var3 = null;
        class88 var5;
        if (this.field7555 == null && this.field7564) {
            class380 var4 = this.method3043(262144, (byte) -111, true, arg1);
            var5 = var4 == null ? null : var4.field5591;
        } else {
            var5 = this.field7555;
            this.field7555 = null;
        }
        if (var5 != null) {
            class246.method1566(var5, this.field7547, super.field6918, super.field6919, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)I", line = 38)
    public final int method269(int arg0) {
        if (arg0 != -13265) {
            this.method3043(-69, (byte) -115, false, (class167) null);
        }
        ++field7567;
        return 22;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILqa;Z)Lr;", line = 49)
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        if (arg2) {
            this.field7555 = null;
        }
        ++field7551;
        return this.method3042(arg1, (byte) -64, arg0);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BZILqa;IILcea;)V", line = 62)
    public final void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6) {
        if (arg6 instanceof class543) {
            class543 var8 = (class543) arg6;
            if (this.field7572 != null && var8.field7572 != null) {
                this.field7572.method1363(var8.field7572, arg4, arg2, arg5, arg1);
            }
        }
        if (arg0 == -84) {
            ++field7545;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lqa;B)V", line = 83)
    public final void method266(class167 arg0, byte arg1) {
        if (arg1 == -40) {
            ++field7546;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILqa;)V", line = 97)
    public final void method255(int arg0, class167 arg1) {
        ++field7560;
        Object var3 = null;
        class88 var5;
        if (this.field7555 == null && this.field7564) {
            class380 var4 = this.method3043(262144, (byte) -111, true, arg1);
            var5 = var4 != null ? var4.field5591 : null;
        } else {
            var5 = this.field7555;
            this.field7555 = null;
        }
        if (var5 != null) {
            class371.method2255(var5, this.field7547, super.field6918, super.field6919, (boolean[]) null);
        }
        int var6 = 51 % ((-46 - arg0) / 42);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLqa;II)Z", line = 123)
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        if (arg0 != 29) {
            this.field7566 = -58;
        }
        ++field7550;
        class519 var5 = this.method3042(arg1, (byte) -64, 131072);
        if (var5 != null) {
            class105 var6 = arg1.method637();
            var6.method884(super.field6918, super.field6921, super.field6919);
            return var5.method1399(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lqa;I)Lbi;", line = 147)
    public final class465 method267(class167 arg0, int arg1) {
        ++field7565;
        if (this.field7572 == null) {
            return null;
        } else {
            class105 var3 = arg0.method637();
            var3.method884(super.field6918, super.field6921, super.field6919);
            class465 var4 = null;
            if (arg1 != 2) {
                this.field7566 = -23;
            }
            if (this.field7570) {
                var4 = class603.method3437((byte) -22, 1);
            }
            this.field7572.method1379(var3, var4 != null ? var4.field6707[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lqa;BI)Lr;", line = 174)
    private final class519 method3042(class167 arg0, byte arg1, int arg2) {
        if (arg1 != -64) {
            this.field7566 = -35;
        }
        ++field7553;
        if (this.field7572 != null && arg0.method560(this.field7572.method1373(), arg2) == 0) {
            return this.field7572;
        } else {
            class380 var4 = this.method3043(arg2, (byte) -111, false, arg0);
            return var4 != null ? var4.field5589 : null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)Z", line = 195)
    public final boolean method262(int arg0) {
        ++field7548;
        return arg0 != -21131 ? true : this.field7564;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lqa;Ltk;IIIIZIZ)V", line = 208)
    public class543(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5306, arg1.field5264, arg1.field5297);
        this.field7570 = arg1.field5276 != 0 && !arg6;
        super.field6919 = arg5;
        this.field7554 = arg6;
        super.field6918 = arg3;
        this.field7547 = (byte) arg2;
        this.field7549 = arg8;
        this.field7566 = (short) arg1.field5335;
        this.field7568 = (byte) arg7;
        this.field7564 = arg0.method594() && arg1.field5353 && !this.field7554 && ~class202.field2854.method3143(class646.field9388, 0) != -1;
        int var10 = 2048;
        if (this.field7549) {
            var10 |= 65536;
        }
        class380 var11 = this.method3043(var10, (byte) -111, this.field7564, arg0);
        if (var11 != null) {
            this.field7572 = var11.field5589;
            this.field7555 = var11.field5591;
            if (this.field7549) {
                this.field7572 = this.field7572.method765((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)I", line = 243)
    public final int method258(byte arg0) {
        if (arg0 != -36) {
            this.field7570 = true;
        }
        ++field7573;
        return this.field7568;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)Z", line = 257)
    public final boolean method868(boolean arg0) {
        if (arg0) {
            this.method255(-94, (class167) null);
        }
        ++field7562;
        return this.field7549;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBZLqa;)Lep;", line = 273)
    private final class380 method3043(int arg0, byte arg1, boolean arg2, class167 arg3) {
        ++field7571;
        class370 var5 = class552.field7819.method2890(arg1 + 111, this.field7566 & 65535);
        if (arg1 != -111) {
            return null;
        } else {
            class542 var6;
            class542 var7;
            if (this.field7554) {
                var6 = class587.field8363[0];
                var7 = class73.field1360[this.field7547];
            } else {
                var7 = class587.field8363[this.field7547];
                if (this.field7547 < 3) {
                    var6 = class587.field8363[this.field7547 + 1];
                } else {
                    var6 = null;
                }
            }
            return var5.method2246(96, 22, var7, var6, this.field7568, super.field6918, arg2, super.field6919, arg0, arg3, super.field6921);
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)I", line = 305)
    public final int method264(int arg0) {
        ++field7559;
        if (arg0 != -25792) {
            method3045(-117, 5);
        }
        return this.field7566 & 65535;
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V", line = 316)
    public final void method270(int arg0) {
        ++field7557;
        int var2 = -6 % ((-1 - arg0) / 47);
        if (this.field7572 != null) {
            this.field7572.method1357();
        }
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V", line = 328)
    public final void method867(int arg0) {
        ++field7552;
        this.field7549 = false;
        if (arg0 >= 12) {
            if (this.field7572 != null) {
                this.field7572.method1405(-65537 & this.field7572.method1373());
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(ILqa;)Lkm;", line = 343)
    public final class120 method260(int arg0, class167 arg1) {
        if (this.field7563 == null) {
            this.field7563 = class577.method3298(this.method3042(arg1, (byte) -64, 0), super.field6918, super.field6919, (byte) 79, super.field6921);
        }
        if (arg0 >= -50) {
            this.field7564 = true;
        }
        ++field7569;
        return this.field7563;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIIIIIII)V", line = 357)
    public static final void method3044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg8 && arg0 == arg6 && ~arg1 == ~arg5 && arg7 == arg9) {
            class109.method914(arg4, -17852, arg7, arg1, arg3, arg0);
        } else {
            int var10 = arg4;
            int var11 = arg0;
            int var12 = arg4 * 3;
            int var13 = arg0 * 3;
            int var14 = arg8 * 3;
            int var15 = arg6 * 3;
            int var16 = arg5 * 3;
            int var17 = arg9 * 3;
            int var18 = arg1 - arg4 + -var16 + var14;
            int var19 = -arg0 + var15 + -var17 + arg7;
            int var20 = -var14 - var14 + var16 + var12;
            int var21 = -var15 + var17 + -var15 + var13;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg4;
                int var34 = (var28 + var30 + var32 >> 12) + arg0;
                class109.method914(var10, -17852, var34, var33, arg3, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        ++field7561;
        if (arg2 < 44) {
            method3044(-15, 3, -101, -18, -68, -127, -110, -9, -93, 11);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)Z", line = 432)
    public static final boolean method3045(int arg0, int arg1) {
        if (arg1 != -29039) {
            field7574 = null;
        }
        ++field7558;
        if (class408.field6063[arg0]) {
            return true;
        } else if (!class448.field6526.method3192((byte) -11, arg0)) {
            return false;
        } else {
            int var2 = class448.field6526.method3164(arg0, true);
            if (var2 == 0) {
                class408.field6063[arg0] = true;
                return true;
            } else {
                if (class177.field2593[arg0] == null) {
                    class177.field2593[arg0] = new class549[var2];
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class177.field2593[arg0][var3] == null) {
                        byte[] var4 = class448.field6526.method3175(var3, (byte) -53, arg0);
                        if (var4 != null) {
                            class549 var5 = class177.field2593[arg0][var3] = new class549();
                            var5.field7734 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method3083(new class268(var4), 9702);
                        }
                    }
                }
                class408.field6063[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "(I)V", line = 489)
    public static void method3046(int arg0) {
        if (arg0 == 262144) {
            field7574 = null;
        }
    }
}
