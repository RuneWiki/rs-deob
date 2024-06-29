import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class289 extends class157 {

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    private int field5096 = 2048;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    private int field5094 = 1024;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    private int field5104 = 3072;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "Lcc;")
    public static class209 field5095 = class95.method669(125, "hint_headicons");

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "Lcc;")
    public static class209 field5099 = class95.method669(106, "comp-Btence ");

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "Lcc;")
    public static class209 field5102 = class95.method669(93, "<col=ff7000>");

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "Lcc;")
    public static class209 field5100 = class95.method669(89, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "[Lcc;")
    public static class209[] field5106 = new class209[1000];

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field5097;
        if (arg0 != -98) {
            field5095 = null;
        }
        int[] var3 = super.field2879.method1269(arg1, arg0 ^ -17853);
        if (super.field2879.field3363) {
            int[] var4 = this.method1097((byte) 75, 0, arg1);
            for (int var5 = 0; ~class226.field4124 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field5096 >> 12) + this.field5094;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([IIIIII)V")
    public static final void method1941(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class109 var6 = class106.field2089[arg3][arg4][arg5];
        if (var6 != null) {
            class56 var7 = var6.field2217;
            if (var7 == null) {
                class107 var10 = var6.field2214;
                if (var10 != null) {
                    int var11 = var10.field2132;
                    int var12 = var10.field2134;
                    int var13 = var10.field2119;
                    int var14 = var10.field2127;
                    int[] var15 = class6.field96[var11];
                    int[] var16 = class63.field1242[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field1159;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 >= -29) {
            this.field5104 = -71;
        }
        ++field5103;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2877 = arg2.method774((byte) 99) == 1;
                }
            } else {
                this.field5104 = arg2.method736(123);
            }
        } else {
            this.field5094 = arg2.method736(125);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            int[][] var3 = super.field2872.method533(arg1, 3);
            ++field5105;
            if (super.field2872.field1434) {
                int[][] var4 = this.method1093(arg1, 0, 64);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var4[2];
                int[] var10 = var3[2];
                for (int var11 = 0; class226.field4124 > var11; ++var11) {
                    var7[var11] = this.field5094 - -(var5[var11] * this.field5096 >> 12);
                    var8[var11] = (var6[var11] * this.field5096 >> 12) + this.field5094;
                    var10[var11] = this.field5094 - -(var9[var11] * this.field5096 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field5096 = this.field5104 - this.field5094;
        int var2 = -119 % ((arg0 - -51) / 52);
        ++field5101;
    }

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "(I)V")
    public static void method1942(int arg0) {
        field5095 = null;
        field5106 = null;
        field5100 = null;
        field5099 = null;
        if (arg0 != 340) {
            field5095 = null;
        }
        field5102 = null;
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)Lmc;")
    public static final class195 method1943(int arg0) {
        ++field5093;
        if (arg0 != 6500) {
            return null;
        } else {
            class195 var1 = (class195) class213.field3851.method503(19852);
            if (var1 != null) {
                var1.method269(-214950896);
                var1.method1796(arg0 + -6617);
                return var1;
            } else {
                class195 var2;
                do {
                    var2 = (class195) class256.field4618.method503(19852);
                    if (var2 == null) {
                        return null;
                    }
                    if (var2.method1343(29406) > class180.method1236(100)) {
                        return null;
                    }
                    var2.method269(-214950896);
                    var2.method1796(-82);
                } while ((var2.field4681 & Long.MIN_VALUE) == 0L);
                return var2;
            }
        }
    }
}
