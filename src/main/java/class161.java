import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class161 extends class349 {

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    private int field2039 = 0;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    private int field2041 = 2048;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    private int field2040 = 10;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field2038 = -1;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "[I")
    private int[] field2034;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "[I")
    private int[] field2036;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[I")
    public static int[] field2043;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "[Lxa;")
    public static class424[] field2033;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V", line = 6)
    private final void method1093(int arg0) {
        ++field2032;
        this.field2036 = new int[this.field2040 + 1];
        this.field2034 = new int[this.field2040 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field2040;
        int var4 = this.field2041 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2040; ++var5) {
            this.field2036[var5] = var2;
            this.field2034[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != 8) {
            this.field2036 = null;
        }
        this.field2036[this.field2040] = 4096;
        this.field2034[this.field2040] = this.field2034[0] + 4096;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(BI)[I", line = 37)
    public final int[] method13(byte arg0, int arg1) {
        ++field2042;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int var4 = class54.field709[arg1];
            if (~this.field2039 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field2040; ++var6) {
                    if (~var4 <= ~this.field2036[var6] && var4 < this.field2036[var6 - -1]) {
                        if (var4 < this.field2034[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class657.method3634(var3, 0, class39.field497, var5);
            } else {
                for (int var7 = 0; class39.field497 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class29.field283[var7];
                    int var11 = this.field2039;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field2040 > var12; ++var12) {
                        if (this.field2036[var12] <= var8 && this.field2036[var12 + 1] > var8) {
                            if (var8 < this.field2034[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        int var13 = 122 / ((56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V", line = 154)
    public static final void method1094(int arg0) {
        ++field2044;
        boolean var1 = ~class164.field2068.method942(124) == -2;
        int var2 = class164.field2068.method948(false);
        int var3 = 47 % ((42 - arg0) / 39);
        int var4 = class164.field2068.method948(false);
        class429.field5954 = class164.field2068.method942(119);
        int var5 = class164.field2068.method957((byte) -92);
        class184.method1187(103);
        class588.method3286(0, var5);
        class164.field2068.method745(8);
        for (int var6 = 0; var6 < 4; ++var6) {
            for (int var21 = 0; class588.field8082 >> 3 > var21; ++var21) {
                for (int var22 = 0; class12.field113 >> 3 > var22; ++var22) {
                    int var23 = class164.field2068.method752(0, 1);
                    if (var23 != 1) {
                        class185.field2273[var6][var21][var22] = -1;
                    } else {
                        class185.field2273[var6][var21][var22] = class164.field2068.method752(0, 26);
                    }
                }
            }
        }
        class164.field2068.method751(-91);
        int var7 = (-class164.field2068.field1745 + field2037) / 16;
        class244.field3288 = new int[var7][4];
        for (int var8 = 0; var7 > var8; ++var8) {
            for (int var20 = 0; ~var20 > -5; ++var20) {
                class244.field3288[var8][var20] = class164.field2068.method943(-76);
            }
        }
        class683.field9707 = new int[var7];
        class93.field1153 = new byte[var7][];
        class552.field7552 = null;
        class73.field940 = new byte[var7][];
        class448.field6135 = new int[var7];
        class681.field9677 = new byte[var7][];
        field2043 = null;
        class339.field4957 = new int[var7];
        class480.field6461 = new int[var7];
        class80.field1012 = new int[var7];
        class278.field3768 = new byte[var7][];
        int var9 = 0;
        for (int var10 = 0; var10 < 4; ++var10) {
            for (int var11 = 0; ~(class588.field8082 >> 3) < ~var11; ++var11) {
                for (int var12 = 0; ~var12 > ~(class12.field113 >> 3); ++var12) {
                    int var13 = class185.field2273[var10][var11][var12];
                    if (var13 != -1) {
                        int var14 = var13 >> 14 & 1023;
                        int var15 = var13 >> 3 & 2047;
                        int var16 = (var14 / 8 << 8) + var15 / 8;
                        for (int var17 = 0; ~var17 > ~var9; ++var17) {
                            if (~class339.field4957[var17] == ~var16) {
                                var16 = -1;
                                break;
                            }
                        }
                        if (~var16 != 0) {
                            class339.field4957[var9] = var16;
                            int var18 = (var16 & 65494) >> 8;
                            int var19 = 255 & var16;
                            class480.field6461[var9] = class397.field5664.method1090("m" + var18 + "_" + var19, (byte) 23);
                            class448.field6135[var9] = class397.field5664.method1090("l" + var18 + "_" + var19, (byte) 31);
                            class80.field1012[var9] = class397.field5664.method1090("um" + var18 + "_" + var19, (byte) -110);
                            class683.field9707[var9] = class397.field5664.method1090("ul" + var18 + "_" + var19, (byte) 104);
                            ++var9;
                        }
                    }
                }
            }
        }
        class286.method1717(var1, 12, var4, 11, var2);
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V", line = 303)
    public static void method1095(int arg0) {
        if (arg0 > 7) {
            field2033 = null;
            field2043 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V", line = 317)
    public final void method11(byte arg0) {
        this.method1093(8);
        if (arg0 >= -51) {
            this.method5(-96, 63, (class138) null);
        }
        ++field2035;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 393)
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILdga;)V", line = 340)
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field2031;
        if (arg0 == 4095) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field2039 = arg2.method957((byte) -105);
                    }
                } else {
                    this.field2041 = arg2.method922((byte) -118);
                }
            } else {
                this.field2040 = arg2.method957((byte) -69);
            }
        }
    }
}
