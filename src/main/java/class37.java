import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class37 extends class124 {

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    private int field670 = 4096;

    @OriginalMember(owner = "client!ej", name = "fb", descriptor = "I")
    private int field682 = 0;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Le;")
    public static class191 field669 = class54.method368("k", 2047);

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!ej", name = "cb", descriptor = "Le;")
    private static class191 field679 = class54.method368("Drop", 2047);

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Le;")
    public static class191 field674 = field679;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "Lhd;")
    public static class270 field677 = new class270();

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ej", name = "db", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!ej", name = "eb", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ej", name = "gb", descriptor = "Lng;")
    public static class121 field683;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "[Lmh;")
    public static class232[] field671;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Le;I)I")
    public static final int method252(class191 arg0, int arg1) {
        ++field667;
        if (arg1 != 4291) {
            method256((byte) 126);
        }
        if (arg0.method1304(63) == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class110.field1849.field816; ++var2) {
                if (class110.field1849.field825[var2].method1321(false, class123.field2040, class13.field160).method1342(90, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)V")
    public static final void method253(boolean arg0, int arg1) {
        ++field668;
        if (!arg0) {
            field678 = 100;
        }
        class241 var2 = class14.method97(8, arg1, -101);
        var2.method1691(0);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIB)V")
    public static final void method254(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 24) {
            method253(false, -121);
        }
        if (arg1 >= field678 && class207.field3680 >= arg1) {
            int var5 = class213.method1459(arg2, (byte) -34, class242.field4314, class99.field1584);
            int var6 = class213.method1459(arg3, (byte) -17, class242.field4314, class99.field1584);
            class176.method1179(var6, arg0, (byte) 77, arg1, var5);
        }
        ++field675;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2063 = arg1.method1580(-76) == 1;
                }
            } else {
                this.field670 = arg1.method1593(arg2);
            }
        } else {
            this.field682 = arg1.method1593(true);
        }
        if (!arg2) {
            method253(false, -116);
        }
        ++field676;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZII)V")
    public static final void method255(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 > 82) {
            ++field673;
            if (class127.method858(arg4, 67)) {
                class211.method1455(arg0, -1, (byte) 95, arg1, class242.field4325[arg4], arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        int[][] var3 = super.field2053.method1775((byte) -116, arg0);
        ++field680;
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -96, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; class64.field1132 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field682) {
                    if (var12 <= this.field670) {
                        var9[var11] = var12;
                    } else {
                        var9[var11] = this.field670;
                    }
                } else {
                    var9[var11] = this.field682;
                }
                if (var13 >= this.field682) {
                    if (~this.field670 > ~var13) {
                        var10[var11] = this.field670;
                    } else {
                        var10[var11] = var13;
                    }
                } else {
                    var10[var11] = this.field682;
                }
                if (~var14 > ~this.field682) {
                    var8[var11] = this.field682;
                } else if (~var14 >= ~this.field670) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field670;
                }
            }
        }
        if (arg1 != -7) {
            field669 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)V")
    public static void method256(byte arg0) {
        field679 = null;
        field677 = null;
        field671 = null;
        field669 = null;
        field674 = null;
        if (arg0 != -125) {
            field669 = null;
        }
        field683 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field672;
        if (arg0 < 68) {
            field683 = null;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 102, arg1);
            for (int var5 = 0; class64.field1132 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field682 > var6) {
                    var3[var5] = this.field682;
                } else if (var6 <= this.field670) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field670;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class37() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 3) {
            field671 = null;
        }
        if (arg0 == arg4 && arg8 == arg9 && ~arg1 == ~arg3 && ~arg2 == ~arg6) {
            class236.method1668(arg7 ^ 2, arg3, arg9, arg2, arg5, arg0);
        } else {
            int var10 = arg0;
            int var11 = arg9;
            int var12 = arg0 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg8 * 3;
            int var16 = arg1 * 3;
            int var17 = arg6 * 3;
            int var18 = -arg0 + var14 + -var16 + arg3;
            int var19 = -var14 + -var14 + var12 + var16;
            int var20 = -arg9 + -var17 + arg2 + var15;
            int var21 = -var12 + var14;
            int var22 = var17 - -var13 + -var15 + -var15;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var19 * var25;
                int var29 = var22 * var25;
                int var30 = var18 * var26;
                int var31 = var23 * var24;
                int var32 = (var29 + var31 + var27 >> 12) + arg9;
                int var33 = var21 * var24;
                int var34 = (var30 - (-var28 + -var33) >> 12) + arg0;
                class236.method1668(1, var34, var11, var32, arg5, var10);
                var10 = var34;
                var11 = var32;
            }
        }
        ++field681;
    }
}
