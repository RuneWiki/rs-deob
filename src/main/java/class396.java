import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class396 extends class618 implements class532 {

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "Lwc;")
    public class62 field5261;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "Z")
    private boolean field5256;

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
    public static int field5263 = 0;

    @OriginalMember(owner = "client!ifa", name = "M", descriptor = "[I")
    public static int[] field5277 = new int[1];

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "Ldd;")
    private class660 field5271;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5270;
        class287.method1782(arg0, -13805);
        int var7 = arg4;
        int var8 = -arg6 + arg0;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (~class310.field4279 >= ~arg1 && ~arg1 >= ~class442.field6058) {
            int[] var14 = class236.field3325[arg1];
            int var15 = class300.method1829(class600.field7959, -arg0 + arg5, 111, class366.field4956);
            int var16 = class300.method1829(class600.field7959, arg0 + arg5, 109, class366.field4956);
            int var17 = class300.method1829(class600.field7959, -var8 + arg5, -83, class366.field4956);
            int var18 = class300.method1829(class600.field7959, arg5 - -var8, -43, class366.field4956);
            class475.method2668(arg2, var17, 7, var14, var15);
            class475.method2668(arg3, var18, 7, var14, var17);
            class475.method2668(arg2, var16, 7, var14, var18);
        }
        int var19 = -1;
        while (~var9 < ~var7) {
            var13 += 2;
            var19 += 2;
            var10 += var13;
            var12 += var19;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                var12 -= var11 << 1;
                class661.field9394[var11] = var7;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg1;
                int var21 = arg1 + var9;
                if (~var21 <= ~class310.field4279 && var20 <= class442.field6058) {
                    if (~var8 < ~var9) {
                        int var22 = class661.field9394[var9];
                        int var23 = class300.method1829(class600.field7959, arg5 + var7, 118, class366.field4956);
                        int var24 = class300.method1829(class600.field7959, -var7 + arg5, -96, class366.field4956);
                        int var25 = class300.method1829(class600.field7959, arg5 + var22, -42, class366.field4956);
                        int var26 = class300.method1829(class600.field7959, -var22 + arg5, 118, class366.field4956);
                        if (~var21 >= ~class442.field6058) {
                            int[] var27 = class236.field3325[var21];
                            class475.method2668(arg2, var26, 7, var27, var24);
                            class475.method2668(arg3, var25, 7, var27, var26);
                            class475.method2668(arg2, var23, arg4 ^ 7, var27, var25);
                        }
                        if (class310.field4279 <= var20) {
                            int[] var28 = class236.field3325[var20];
                            class475.method2668(arg2, var26, 7, var28, var24);
                            class475.method2668(arg3, var25, 7, var28, var26);
                            class475.method2668(arg2, var23, 7, var28, var25);
                        }
                    } else {
                        int var29 = class300.method1829(class600.field7959, arg5 + var7, 115, class366.field4956);
                        int var30 = class300.method1829(class600.field7959, arg5 - var7, 117, class366.field4956);
                        if (~class442.field6058 <= ~var21) {
                            class475.method2668(arg2, var29, 7, class236.field3325[var21], var30);
                        }
                        if (class310.field4279 <= var20) {
                            class475.method2668(arg2, var29, 7, class236.field3325[var20], var30);
                        }
                    }
                }
            }
            int var31 = -var7 + arg1;
            int var32 = arg1 - -var7;
            if (~var32 <= ~class310.field4279 && ~var31 >= ~class442.field6058) {
                int var33 = arg5 + var9;
                int var34 = -var9 + arg5;
                if (~class600.field7959 >= ~var33 && ~var34 >= ~class366.field4956) {
                    int var35 = class300.method1829(class600.field7959, var33, 114, class366.field4956);
                    int var36 = class300.method1829(class600.field7959, var34, -82, class366.field4956);
                    if (~var8 >= ~var7) {
                        if (class442.field6058 >= var32) {
                            class475.method2668(arg2, var35, arg4 ^ 7, class236.field3325[var32], var36);
                        }
                        if (class310.field4279 <= var31) {
                            class475.method2668(arg2, var35, arg4 ^ 7, class236.field3325[var31], var36);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class661.field9394[var7];
                        int var38 = class300.method1829(class600.field7959, arg5 + var37, -87, class366.field4956);
                        int var39 = class300.method1829(class600.field7959, -var37 + arg5, 111, class366.field4956);
                        if (~var32 >= ~class442.field6058) {
                            int[] var40 = class236.field3325[var32];
                            class475.method2668(arg2, var39, 7, var40, var36);
                            class475.method2668(arg3, var38, 7, var40, var39);
                            class475.method2668(arg2, var35, 7, var40, var38);
                        }
                        if (~class310.field4279 >= ~var31) {
                            int[] var41 = class236.field3325[var31];
                            class475.method2668(arg2, var39, arg4 ^ 7, var41, var36);
                            class475.method2668(arg3, var38, arg4 ^ 7, var41, var39);
                            class475.method2668(arg2, var35, 7, var41, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Z")
    public final boolean method150(byte arg0) {
        if (arg0 >= -34) {
            return false;
        } else {
            ++field5266;
            return this.field5261.method502((byte) 17);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Loa;B)V")
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            this.method148((class651) null, (byte) -4);
        }
        this.field5261.method505(-30964, arg0);
        ++field5258;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
    public final void method144(boolean arg0) {
        ++field5269;
        if (arg0) {
            this.field5261 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Loa;Lbd;IIIIIZII)V")
    public class396(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field895, arg1.field904, arg1.field850);
        this.field5261 = new class62(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field5256 = ~arg1.field816 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)V")
    public static final void method2274(int arg0, int arg1) {
        ++field5272;
        if (arg1 < 86) {
            field5263 = -83;
        }
        class382 var2 = method2276(117, 10, arg0);
        var2.method2228((byte) -55);
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
    public static void method2275(int arg0) {
        if (arg0 != -1) {
            field5277 = null;
        }
        field5277 = null;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Z)I")
    public final int method146(boolean arg0) {
        ++field5262;
        return arg0 ? -78 : this.field5261.field947;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Loa;I)V")
    public final void method138(class651 arg0, int arg1) {
        if (arg1 != 2215) {
            this.field5271 = null;
        }
        ++field5257;
        this.field5261.method497(true, arg0);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLoa;)Lpe;")
    public final class571 method145(byte arg0, class651 arg1) {
        ++field5255;
        class358 var3 = this.field5261.method499(arg1, super.field8197, 2048, false, true, super.field8203, arg0 + 25754);
        if (var3 == null) {
            return null;
        } else {
            class397 var4 = arg1.method455();
            if (arg0 != 124) {
                method2276(-19, 42, 102);
            }
            var4.method576(super.field8203, super.field8198, super.field8197);
            class571 var5 = null;
            if (this.field5256) {
                var5 = class157.method1100((byte) -121, 1);
            }
            int var6 = super.field8203 >> 9;
            int var7 = super.field8197 >> 9;
            this.field5261.method495(var4, var7, arg1, true, true, var3, var6, var7, var6);
            if (this.field5261.field943 == null) {
                var3.method1947(var4, var5 == null ? null : var5.field7581[0], 0);
            } else {
                class174 var8 = this.field5261.field943.method2711();
                arg1.method392(var3, var8, var4, var5 == null ? null : var5.field7581[0], 0);
            }
            if (this.field5271 == null) {
                this.field5271 = class516.method2881(super.field8198, true, var3, super.field8203, super.field8197);
            } else {
                class587.method3229(super.field8197, 2, super.field8203, super.field8198, this.field5271, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Z)I")
    public final int method152(boolean arg0) {
        ++field5268;
        return !arg0 ? 42 : this.field5261.field952;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            method2273(-86, 16, 9, -123, -86, 98, -100);
        }
        ++field5274;
        return this.field5261.method499(arg0, 0, arg2, false, false, 0, arg1 ^ -25913);
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field5276;
        if (arg0 != -77) {
            field5277 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)I")
    public final int method151(byte arg0) {
        ++field5265;
        if (arg0 != 78) {
            this.method144(false);
        }
        return this.field5261.field953;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Z")
    public final boolean method139(int arg0) {
        ++field5260;
        return arg0 != 2;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Lfr;")
    public static final class382 method2276(int arg0, int arg1, int arg2) {
        ++field5267;
        class382 var3 = (class382) class508.field6774.method2918((long) arg1 << 32 | (long) arg2, (byte) 84);
        int var4 = 93 % ((arg0 - 48) / 37);
        if (var3 == null) {
            var3 = new class382(arg1, arg2);
            class508.field6774.method2911(var3.field6724, var3, (byte) -28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(JJ)J")
    public static long method2277(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILoa;ILni;ZZI)V")
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        ++field5264;
        if (!arg5) {
            field5263 = 49;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILoa;)Ldd;")
    public final class660 method143(int arg0, class651 arg1) {
        ++field5259;
        return arg0 != 31358 ? null : this.field5271;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Loa;Z)V")
    public final void method147(class651 arg0, boolean arg1) {
        ++field5273;
        class358 var3 = this.field5261.method499(arg0, super.field8197, 262144, true, arg1, super.field8203, 25878);
        if (var3 != null) {
            int var4 = super.field8203 >> 9;
            int var5 = super.field8197 >> 9;
            class397 var6 = arg0.method455();
            var6.method576(super.field8203, super.field8198, super.field8197);
            this.field5261.method495(var6, var5, arg0, true, false, var3, var4, var5, var4);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = -121 % ((-26 - arg0) / 38);
        ++field5275;
        class358 var6 = this.field5261.method499(arg2, super.field8197, 131072, false, false, super.field8203, 25878);
        if (var6 == null) {
            return false;
        } else {
            class397 var7 = arg2.method455();
            var7.method576(super.field8203, super.field8198, super.field8197);
            return var6.method1931(arg3, arg1, var7, false);
        }
    }
}
