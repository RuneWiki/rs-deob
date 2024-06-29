import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class466 extends class390 implements class210 {

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lgk;")
    public class374 field6567;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Z")
    private boolean field6558;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field6563 = 0;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field6576 = 1338;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6574 = new Rectangle[100];

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field6571 = -1;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "F")
    public static float field6568;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILvc;)Ln;", line = 3)
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        if (arg0 != -106) {
            this.field6558 = false;
        }
        ++field6559;
        return this.field6567.method2288(-1, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lvc;I)Lep;", line = 21)
    public final class309 method69(class89 arg0, int arg1) {
        ++field6578;
        class468 var3 = this.field6567.method2288(-1, arg0, true, 1024, super.field5386, super.field5391, false);
        if (var3 == null) {
            return null;
        } else {
            class257 var4 = arg0.method306();
            var4.method96(super.field5391, super.field5390, super.field5386);
            class309 var5 = null;
            if (this.field6558) {
                var5 = class163.method1205((byte) 40, 1);
            }
            if (this.field6567.field5163 == null) {
                var3.method1592(var4, var5 != null ? var5.field4383[0] : null, 0);
            } else {
                class404 var6 = this.field6567.field5163.method896();
                arg0.method384(var3, var6, var4, var5 == null ? null : var5.field4383[0], 0);
            }
            if (arg1 != 10228) {
                return null;
            } else {
                this.field6567.method2283(arg0, super.field5386 >> 7, super.field5391 >> 7, super.field5391 >> 7, super.field5386 >> 7, true, var3, (byte) -95);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I", line = 61)
    public final int method71(byte arg0) {
        if (arg0 < 81) {
            field6574 = null;
        }
        ++field6575;
        return this.field6567.field5171;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 72)
    public static final String method2776(String arg0, String arg1, int arg2, String arg3) {
        ++field6561;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, arg1.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(arg3.length() + var4);
        }
        return arg2 != 0 ? null : arg0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lvc;B)V", line = 91)
    public final void method85(class89 arg0, byte arg1) {
        this.field6567.method2281(arg0, 131072);
        if (arg1 == -24) {
            ++field6556;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I", line = 102)
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            field6571 = 118;
        }
        ++field6564;
        return this.field6567.field5156;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILvc;II)Z", line = 117)
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field6557;
        class468 var5 = this.field6567.method2288(-1, arg1, false, 65536, super.field5386, super.field5391, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method84(-5);
            }
            class257 var6 = arg1.method306();
            var6.method96(super.field5391, super.field5390, super.field5386);
            return var5.method1593(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIIII)V", line = 138)
    public static final void method2777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6566;
        class211.method1437(72, arg4);
        int var7 = 0;
        int var8 = arg4 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        if (arg3 == 6037) {
            int var13 = -1;
            int var14 = -1;
            if (~arg2 <= ~class444.field6338 && ~class151.field2091 <= ~arg2) {
                int[] var15 = class373.field5141[arg2];
                int var16 = class67.method630(arg3 + -6037, -arg4 + arg5, class103.field1457, class295.field4153);
                int var17 = class67.method630(0, arg4 + arg5, class103.field1457, class295.field4153);
                int var18 = class67.method630(0, arg5 - var8, class103.field1457, class295.field4153);
                int var19 = class67.method630(arg3 + -6037, arg5 + var8, class103.field1457, class295.field4153);
                class61.method558(var18, -10647, var15, var16, arg0);
                class61.method558(var19, -10647, var15, var18, arg1);
                class61.method558(var17, -10647, var15, var19, arg0);
            }
            while (var7 < var9) {
                var13 += 2;
                var14 += 2;
                var10 += var13;
                var12 += var14;
                if (var12 >= 0 && var11 >= 1) {
                    --var11;
                    class18.field195[var11] = var7;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (~var10 <= -1) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = -var9 + arg2;
                    int var21 = arg2 + var9;
                    if (~var21 <= ~class444.field6338 && ~class151.field2091 <= ~var20) {
                        if (var9 < var8) {
                            int var22 = class18.field195[var9];
                            int var23 = class67.method630(0, arg5 + var7, class103.field1457, class295.field4153);
                            int var24 = class67.method630(0, -var7 + arg5, class103.field1457, class295.field4153);
                            int var25 = class67.method630(0, arg5 - -var22, class103.field1457, class295.field4153);
                            int var26 = class67.method630(arg3 + -6037, -var22 + arg5, class103.field1457, class295.field4153);
                            if (class151.field2091 >= var21) {
                                int[] var27 = class373.field5141[var21];
                                class61.method558(var26, arg3 + -16684, var27, var24, arg0);
                                class61.method558(var25, -10647, var27, var26, arg1);
                                class61.method558(var23, -10647, var27, var25, arg0);
                            }
                            if (var20 >= class444.field6338) {
                                int[] var28 = class373.field5141[var20];
                                class61.method558(var26, arg3 + -16684, var28, var24, arg0);
                                class61.method558(var25, arg3 ^ -15876, var28, var26, arg1);
                                class61.method558(var23, arg3 + -16684, var28, var25, arg0);
                            }
                        } else {
                            int var29 = class67.method630(0, arg5 + var7, class103.field1457, class295.field4153);
                            int var30 = class67.method630(0, -var7 + arg5, class103.field1457, class295.field4153);
                            if (var21 <= class151.field2091) {
                                class61.method558(var29, -10647, class373.field5141[var21], var30, arg0);
                            }
                            if (~class444.field6338 >= ~var20) {
                                class61.method558(var29, -10647, class373.field5141[var20], var30, arg0);
                            }
                        }
                    }
                }
                int var31 = -var7 + arg2;
                int var32 = arg2 - -var7;
                if (class444.field6338 <= var32 && ~var31 >= ~class151.field2091) {
                    int var33 = arg5 + var9;
                    int var34 = -var9 + arg5;
                    if (~class295.field4153 >= ~var33 && ~class103.field1457 <= ~var34) {
                        int var35 = class67.method630(0, var33, class103.field1457, class295.field4153);
                        int var36 = class67.method630(arg3 ^ 6037, var34, class103.field1457, class295.field4153);
                        if (var7 < var8) {
                            int var37 = var7 > var11 ? class18.field195[var7] : var11;
                            int var38 = class67.method630(0, arg5 + var37, class103.field1457, class295.field4153);
                            int var39 = class67.method630(0, arg5 - var37, class103.field1457, class295.field4153);
                            if (class151.field2091 >= var32) {
                                int[] var40 = class373.field5141[var32];
                                class61.method558(var39, -10647, var40, var36, arg0);
                                class61.method558(var38, arg3 + -16684, var40, var39, arg1);
                                class61.method558(var35, -10647, var40, var38, arg0);
                            }
                            if (var31 >= class444.field6338) {
                                int[] var41 = class373.field5141[var31];
                                class61.method558(var39, -10647, var41, var36, arg0);
                                class61.method558(var38, arg3 ^ -15876, var41, var39, arg1);
                                class61.method558(var35, arg3 ^ -15876, var41, var38, arg0);
                            }
                        } else {
                            if (class151.field2091 >= var32) {
                                class61.method558(var35, -10647, class373.field5141[var32], var36, arg0);
                            }
                            if (var31 >= class444.field6338) {
                                class61.method558(var35, -10647, class373.field5141[var31], var36, arg0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)V", line = 325)
    public static void method2778(byte arg0) {
        field6574 = null;
        if (arg0 != -125) {
            field6563 = 37;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 336)
    public final void method84(int arg0) {
        ++field6562;
        if (arg0 != 16805) {
            method2776((String) null, (String) null, -79, (String) null);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILvc;IILuq;I)V", line = 350)
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        ++field6577;
        if (arg1 >= 40) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)I", line = 363)
    public final int method83(byte arg0) {
        ++field6565;
        if (arg0 < 70) {
            this.field6567 = null;
        }
        return this.field6567.field5172;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLvc;)V", line = 376)
    public final void method78(boolean arg0, class89 arg1) {
        if (!arg0) {
            this.field6567 = null;
        }
        this.field6567.method2278(arg1, 4);
        ++field6560;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)Z", line = 387)
    public final boolean method82(byte arg0) {
        if (arg0 < 89) {
            return false;
        } else {
            ++field6573;
            return this.field6567.method2279((byte) -97);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z", line = 399)
    public final boolean method68(int arg0) {
        int var2 = 95 % ((arg0 - 2) / 57);
        ++field6570;
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lvc;Lnm;IIIIIZII)V", line = 409)
    public class466(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field3852, arg1.field3861);
        this.field6567 = new class374(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field6558 = arg1.field3902 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 418)
    public final void method75(byte arg0) {
        if (arg0 != 111) {
            field6563 = 104;
        }
        ++field6572;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(ZLvc;)V", line = 430)
    public final void method86(boolean arg0, class89 arg1) {
        if (arg0) {
            this.method85((class89) null, (byte) -109);
        }
        ++field6569;
        class468 var3 = this.field6567.method2288(-1, arg1, true, 131072, super.field5386, super.field5391, true);
        if (var3 != null) {
            this.field6567.method2283(arg1, super.field5386 >> 7, super.field5391 >> 7, super.field5391 >> 7, super.field5386 >> 7, false, var3, (byte) -118);
        }
    }
}
