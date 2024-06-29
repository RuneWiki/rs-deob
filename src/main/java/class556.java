import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class556 extends class435 {

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Z")
    public boolean field7735;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "B")
    public byte field7738;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "S")
    public short field7741;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "S")
    public short field7734;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "S")
    public short field7746;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "S")
    public short field7744;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
    public static int field7743 = 0;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "[I")
    public static int[] field7733 = new int[32];

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Lkg;")
    public static class275 field7737 = new class275(98, 12);

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Z")
    public static boolean field7748 = false;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([Llaa;Z)I", line = 4)
    public final int method916(class123[] arg0, boolean arg1) {
        ++field7747;
        int var3 = 0;
        label118: for (int var4 = this.field7734; var4 <= this.field7741; ++var4) {
            label116: for (int var5 = this.field7746; this.field7744 >= var5; ++var5) {
                long var6 = class454.field6070[super.field5796][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label116;
                        }
                        class667 var11 = class58.field808[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg0[var12] == var11.field9381) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg0[var3++] = var11.field9381;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (!arg1) {
            this.field7746 = -124;
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg0[var13] = null;
        }
        if (~this.field7738 != -1) {
            int var14 = -class428.field5737 + this.field7734;
            int var15 = -class216.field2924 + this.field7746;
            short var16;
            int var17;
            int var18;
            short var19;
            if (this.field7738 == 1) {
                if (~var15 < ~var14) {
                    var16 = this.field7734;
                    var17 = this.field7734 + 1;
                    var18 = this.field7746 + -1;
                    var19 = this.field7746;
                } else {
                    var16 = this.field7734;
                    var18 = this.field7746 + 1;
                    var19 = this.field7746;
                    var17 = this.field7734 - 1;
                }
            } else if (-var14 >= var15) {
                var17 = this.field7734 + 1;
                var19 = this.field7746;
                var18 = this.field7746 + 1;
                var16 = this.field7734;
            } else {
                var18 = this.field7746 + -1;
                var16 = this.field7734;
                var19 = this.field7746;
                var17 = this.field7734 + -1;
            }
            label82: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                long var21 = class454.field6070[super.field5796][var16][var18];
                while (~var21 != -1L) {
                    class667 var27 = class58.field808[(int) ((65535L & var21) + -1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field9381) {
                        continue label82;
                    }
                }
                long var23 = class454.field6070[super.field5796][var17][var19];
                while (~var23 != -1L) {
                    class667 var26 = class58.field808[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field9381) {
                        continue label82;
                    }
                }
                for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                    arg0[var25] = arg0[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)V", line = 175)
    public void method80(int arg0) {
        ++field7745;
        if (arg0 != -1) {
            this.method918(12, (class60) null);
        }
    }

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "(I)V", line = 191)
    public static void method3211(int arg0) {
        int var1 = 110 % ((-35 - arg0) / 44);
        field7737 = null;
        field7733 = null;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)Z", line = 201)
    public final boolean method914(byte arg0) {
        ++field7740;
        for (int var2 = this.field7734; this.field7741 >= var2; ++var2) {
            for (int var3 = this.field7746; ~this.field7744 <= ~var3; ++var3) {
                int var4 = -class428.field5737 + class593.field8294 + var2;
                if (~var4 <= -1 && ~var4 > ~class449.field5945.length) {
                    int var5 = -class216.field2924 + class593.field8294 + var3;
                    if (~var5 <= -1 && ~class449.field5945.length < ~var5 && class449.field5945[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (arg0 != 31) {
            this.method80(35);
        }
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lbm;", line = 243)
    public static final class115 method3212(int arg0, int arg1) {
        ++field7739;
        class115 var2 = (class115) class214.field2842.method3079((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class353.field4541.method3153(arg1, arg0, arg0);
            class115 var4 = new class115();
            if (var3 != null) {
                var4.method901(new class461(var3), (byte) -24);
            }
            var4.method899((byte) 125);
            class214.field2842.method3077((byte) -72, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(ILha;)Z", line = 266)
    public final boolean method918(int arg0, class60 arg1) {
        ++field7736;
        if (arg0 != -5) {
            method3213((byte) -61);
        }
        return class150.method1057(super.field5793, this.field7734, this.field7744, this.method750(arg0 + -105, arg1), (byte) 82, this.field7741, this.field7746);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 289)
    public class556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field7735 = arg9;
        super.field5801 = arg2;
        this.field7738 = arg10;
        super.field5796 = (byte) arg0;
        this.field7741 = (short) arg6;
        super.field5800 = arg3;
        super.field5793 = (byte) arg1;
        this.field7734 = (short) arg5;
        this.field7746 = (short) arg7;
        super.field5797 = arg4;
        this.field7744 = (short) arg8;
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(B)V", line = 316)
    public static final void method3213(byte arg0) {
        if (arg0 <= 34) {
            method3211(43);
        }
        class327.field4198 = true;
        ++field7749;
    }
}
