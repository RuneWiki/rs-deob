import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class455 extends class43 {

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "S")
    public short field6584;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "F")
    public static float field6583 = 1.0F;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "Z")
    public static boolean field6588 = false;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "Lqe;")
    public static class465 field6585 = new class465(68, 1);

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)V", line = 3)
    public static void method2781(int arg0) {
        if (arg0 < 64) {
            method2781(4);
        }
        field6585 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([BIIBII)Z", line = 15)
    public static final boolean method2782(byte[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field6581;
        boolean var6 = true;
        if (arg3 >= -37) {
            return true;
        } else {
            class35 var7 = new class35(arg0);
            int var8 = -1;
            label74: while (true) {
                int var9 = var7.method235(-951);
                if (~var9 == -1) {
                    return var6;
                }
                var8 += var9;
                int var10 = 0;
                boolean var11 = false;
                while (true) {
                    int var15;
                    class414 var18;
                    do {
                        int var16;
                        int var17;
                        do {
                            do {
                                do {
                                    do {
                                        while (var11) {
                                            int var19 = var7.method232((byte) -126);
                                            if (~var19 == -1) {
                                                continue label74;
                                            }
                                            var7.method273(255);
                                        }
                                        int var12 = var7.method232((byte) -128);
                                        if (var12 == 0) {
                                            continue label74;
                                        }
                                        var10 += var12 + -1;
                                        int var13 = 63 & var10;
                                        int var14 = (4050 & var10) >> 6;
                                        var15 = var7.method273(255) >> 2;
                                        var16 = arg2 + var14;
                                        var17 = var13 - -arg5;
                                    } while (~var16 >= -1);
                                } while (~var17 >= -1);
                            } while (arg1 + -1 <= var16);
                        } while (~var17 <= ~(arg4 + -1));
                        var18 = class66.field1181.method131(2, var8);
                    } while (~var15 == -23 && ~class471.field6781.field6665.method3026(27669) == -1 && ~var18.field5737 == -1 && ~var18.field5803 != -2 && !var18.field5747);
                    if (!var18.method2522(-34)) {
                        var6 = false;
                        ++class32.field435;
                    }
                    var11 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)Z", line = 98)
    public final boolean method403(int arg0) {
        if (arg0 != -28694) {
            this.method407((class36[]) null, 24);
        }
        ++field6586;
        return class533.field7539[(super.field644 >> class440.field6142) + -class155.field2331 + class235.field3337][(super.field648 >> class440.field6142) + class235.field3337 - class214.field3065];
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[FI[FIIIII[II[I)V", line = 109)
    public static final void method2783(int arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int[] arg12) {
        ++field6587;
        int var13 = arg0 * arg5 + arg11;
        int var14 = arg1 * arg8 - -arg6;
        if (arg3 != 0) {
            field6583 = 0.19545776F;
        }
        int var15 = -arg7 + arg0;
        int var16 = arg8 - arg7;
        if (arg10 == null) {
            for (int var17 = 0; ~var17 > ~arg9; ++var17) {
                int var18 = var13 - -arg7;
                while (~var13 > ~var18) {
                    arg4[var14++] = arg2[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg2 == null) {
            for (int var19 = 0; arg9 > var19; ++var19) {
                int var20 = arg7 + var13;
                while (var13 < var20) {
                    arg12[var14++] = arg10[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var21 = 0; ~var21 > ~arg9; ++var21) {
                int var22 = var13 - -arg7;
                while (var13 < var22) {
                    arg12[var14] = arg10[var13];
                    arg4[var14++] = arg2[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lbh;I)I", line = 191)
    public final int method407(class36[] arg0, int arg1) {
        ++field6582;
        int var3 = super.field644 >> class440.field6142;
        int var4 = super.field648 >> class440.field6142;
        int var5 = 0;
        if (class155.field2331 != var3) {
            if (class155.field2331 < var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class214.field3065 != ~var4) {
            if (~class214.field3065 < ~var4) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class685.field9663[var5];
        if (~(this.field6584 & var6) != -1) {
            return this.method406(arg0, (byte) -104, var3, var4);
        } else if (~this.field6584 == -2 && ~var3 < -1) {
            return this.method406(arg0, (byte) -103, var3 - 1, var4);
        } else if (~this.field6584 == -5 && class613.field8871 >= var3) {
            return this.method406(arg0, (byte) -94, var3 + 1, var4);
        } else if (this.field6584 == 8 && var4 > 0) {
            return this.method406(arg0, (byte) -105, var3, var4 + -1);
        } else if (this.field6584 == 2 && class453.field6328 >= var4) {
            return this.method406(arg0, (byte) -98, var3, var4 + 1);
        } else if (this.field6584 == 16 && ~var3 < -1 && ~class453.field6328 <= ~var4) {
            return this.method406(arg0, (byte) -96, var3 - 1, var4 + 1);
        } else if (this.field6584 == 32 && var3 <= class613.field8871 && class453.field6328 >= var4) {
            return this.method406(arg0, (byte) -84, var3 - -1, var4 + 1);
        } else if (~this.field6584 == -129 && var3 > 0 && ~var4 < -1) {
            return this.method406(arg0, (byte) -124, var3 + -1, var4 + -1);
        } else {
            int var7 = -60 / ((arg1 - -32) / 53);
            if (this.field6584 == 64 && var3 <= class613.field8871 && ~var4 < -1) {
                return this.method406(arg0, (byte) -100, var3 + 1, var4 + -1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I", line = 275)
    public static final int method2784(int arg0, int arg1) {
        if (arg0 != 31322) {
            field6583 = 0.5546512F;
        }
        ++field6589;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIII)V", line = 291)
    public class455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field651 = arg1;
        super.field659 = (byte) arg4;
        super.field648 = arg2;
        this.field6584 = (short) arg5;
        super.field644 = arg0;
        super.field649 = (byte) arg3;
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)Z", line = 305)
    public final boolean method391(int arg0) {
        if (arg0 != 0) {
            method2782((byte[]) null, 42, 87, (byte) 103, -17, 42);
        }
        ++field6580;
        return class139.method1102(super.field648 >> class440.field6142, this, super.field644 >> class440.field6142, super.field659, (byte) 53);
    }
}
