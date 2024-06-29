import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class319 extends class167 {

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "B")
    public byte field4586;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "Z")
    public boolean field4591;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "S")
    public short field4590;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "S")
    public short field4600;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "S")
    public short field4585;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "S")
    public short field4595;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "[I")
    public static int[] field4598 = new int[4];

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "Lmga;")
    public static class739 field4589 = new class739(27, 3);

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Ljw;")
    public static class581 field4603 = new class581(35, 4);

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "(I)V")
    public void method226(int arg0) {
        ++field4594;
        if (arg0 > -122) {
            this.field4595 = 76;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B[Luca;)I")
    public final int method43(byte arg0, class540[] arg1) {
        ++field4588;
        int var3 = 0;
        label118: for (int var4 = this.field4600; this.field4595 >= var4; ++var4) {
            label116: for (int var5 = this.field4590; ~this.field4585 <= ~var5; ++var5) {
                long var6 = class608.field8264[super.field2250][var4][var5];
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
                        class700 var11 = class369.field5356[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg1[var12] == var11.field9828) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field9828;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg0 > -20) {
            return 59;
        } else {
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg1[var13] = null;
            }
            if (~this.field4586 != -1) {
                int var14 = -class331.field4776 + this.field4600;
                int var15 = this.field4590 - class76.field1102;
                int var16;
                int var17;
                short var18;
                short var19;
                if (this.field4586 == 1) {
                    if (~var14 > ~var15) {
                        var16 = this.field4590 + -1;
                        var17 = this.field4600 + 1;
                        var18 = this.field4600;
                        var19 = this.field4590;
                    } else {
                        var16 = this.field4590 + 1;
                        var18 = this.field4600;
                        var17 = this.field4600 - 1;
                        var19 = this.field4590;
                    }
                } else if (-var14 < var15) {
                    var19 = this.field4590;
                    var16 = this.field4590 - 1;
                    var17 = this.field4600 + -1;
                    var18 = this.field4600;
                } else {
                    var17 = this.field4600 - -1;
                    var18 = this.field4600;
                    var16 = this.field4590 + 1;
                    var19 = this.field4590;
                }
                label82: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                    long var21 = class608.field8264[super.field2250][var18][var16];
                    while (var21 != 0L) {
                        class700 var27 = class369.field5356[(int) ((65535L & var21) + -1L)];
                        var21 >>>= 16;
                        if (arg1[var20] == var27.field9828) {
                            continue label82;
                        }
                    }
                    long var23 = class608.field8264[super.field2250][var17][var19];
                    while (~var23 != -1L) {
                        class700 var26 = class369.field5356[(int) ((65535L & var23) + -1L)];
                        var23 >>>= 16;
                        if (arg1[var20] == var26.field9828) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; var25 < var3 - 1; ++var25) {
                        arg1[var25] = arg1[var25 - -1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(CZ)C")
    public static final char method2025(char arg0, boolean arg1) {
        ++field4596;
        if (~arg0 == -199) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (arg0 == 338) {
            return 'E';
        } else if (~arg0 == -340) {
            return 'e';
        } else {
            return (char) (arg1 ? 'c' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        ++field4592;
        if (arg0 < 103) {
            return true;
        } else {
            for (int var2 = this.field4600; ~this.field4595 <= ~var2; ++var2) {
                for (int var3 = this.field4590; var3 <= this.field4585; ++var3) {
                    int var4 = class174.field2337 + var2 - class331.field4776;
                    if (var4 >= 0 && var4 < class79.field1122.length) {
                        int var5 = -class76.field1102 + var3 + class174.field2337;
                        if (~var5 <= -1 && ~class79.field1122.length < ~var5 && class79.field1122[var4][var5]) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "(I)V")
    public static final void method2026(int arg0) {
        if (arg0 != 6817) {
            method2026(50);
        }
        ++field4587;
        if (!class574.field7712) {
            class757.field10501 = true;
            class574.field7712 = true;
            class282.field4157 += (-class282.field4157 + 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
    public static final void method2027(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class751.field10384 = arg1;
        class417.field5978 = arg4;
        class419.field6024 = arg0;
        if (arg2 != 3) {
            method2026(-10);
        }
        ++field4597;
        class334.field4856 = arg3;
    }

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "(I)V")
    public static void method2028(int arg0) {
        field4603 = null;
        int var1 = -24 % ((arg0 - -25) / 33);
        field4589 = null;
        field4598 = null;
    }

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "(I)V")
    public static final void method2029(int arg0) {
        int var1 = 37 / ((arg0 - 12) / 52);
        ++field4593;
        if (class664.field9184 != -1) {
            class685.method3806(class664.field9184, -1, -1, false, false);
            class664.field9184 = -1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILha;)Z")
    public final boolean method41(int arg0, class65 arg1) {
        if (arg0 != 101) {
            return true;
        } else {
            ++field4599;
            return class160.method1169(this.field4595, -101, this.method27(arg1, (byte) -126), this.field4590, this.field4585, super.field2244, this.field4600);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field2244 = (byte) arg1;
        super.field2257 = arg2;
        super.field2250 = (byte) arg0;
        this.field4586 = arg10;
        this.field4591 = arg9;
        this.field4590 = (short) arg7;
        super.field2246 = arg3;
        this.field4600 = (short) arg5;
        super.field2259 = arg4;
        this.field4585 = (short) arg8;
        this.field4595 = (short) arg6;
    }
}
