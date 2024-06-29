import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class397 {

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "[S")
    private short[] field57 = new short[257];

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "I")
    private int field55 = 0;

    @OriginalMember(owner = "client!ft", name = "bb", descriptor = "Lgn;")
    public static class475 field64 = new class475(23, -1);

    @OriginalMember(owner = "client!ft", name = "db", descriptor = "Lwt;")
    public static class194 field66 = new class194("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ft", name = "W", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ft", name = "X", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ft", name = "Z", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ft", name = "ab", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ft", name = "eb", descriptor = "Ljava/lang/Object;")
    public static Object field67;

    @OriginalMember(owner = "client!ft", name = "Y", descriptor = "[I")
    private int[] field61;

    @OriginalMember(owner = "client!ft", name = "cb", descriptor = "[I")
    private int[] field65;

    @OriginalMember(owner = "client!ft", name = "V", descriptor = "[[I")
    private int[][] field58;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
    public static void method21(int arg0) {
        if (arg0 >= 1) {
            field67 = null;
            field66 = null;
            field64 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(Z)V")
    private final void method22(boolean arg0) {
        ++field62;
        if (!arg0) {
            this.field65 = null;
        }
        int[] var2 = this.field58[0];
        int[] var3 = this.field58[1];
        int[] var4 = this.field58[this.field58.length + -2];
        int[] var5 = this.field58[this.field58.length - 1];
        this.field61 = new int[] { -var3[0] - (-var2[0] - var2[0]), var2[1] - (-var2[1] - -var3[1]) };
        this.field65 = new int[] { var4[0] - var5[0] - -var4[0], var4[1] - var5[1] - -var4[1] };
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
    private final void method23(int arg0) {
        if (arg0 != -7671) {
            this.method24(3);
        }
        int var2 = this.field55;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field58.length + -1) < ~var5 && ~var4 <= ~this.field58[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field58[var5 + -1];
                    int[] var7 = this.field58[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class150.field1944[var8 >> 5 & 255] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field57[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field58.length + -1) && ~this.field58[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field58[var14 + -1];
                    int[] var16 = this.field58[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field57[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field58.length + -1) && ~var21 <= ~this.field58[var22][0]; ++var22) {
                }
                int[] var23 = this.field58[var22 + -1];
                int[] var24 = this.field58[var22];
                int var25 = this.method29((byte) 63, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method29((byte) 63, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var26 + var28 + -var27 + -var25;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var36 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field57[var20] = (short) var38;
            }
        }
        ++field56;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (this.field58 == null) {
            this.field58 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field54;
        if (arg0 != 255) {
            method25(-111, false);
        }
        if (~this.field58.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field55 == 2) {
                this.method22(true);
            }
            class270.method1651((byte) -116);
            this.method23(-7671);
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)Lts;")
    public static final class356 method25(int arg0, boolean arg1) {
        ++field52;
        if (arg1) {
            method26((byte) 33);
        }
        int var2 = arg0 >> 16;
        int var3 = 65535 & arg0;
        if (class181.field2591[var2] == null || class181.field2591[var2][var3] == null) {
            boolean var4 = class322.method1928(var2, 7387);
            if (!var4) {
                return null;
            }
        }
        return class181.field2591[var2][var3];
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)[Lag;")
    public static final class463[] method26(byte arg0) {
        if (arg0 != -128) {
            return null;
        } else {
            ++field59;
            return new class463[] { class178.field2564, class26.field436, class507.field7729 };
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg0 == 0) {
            this.field55 = arg2.method941((byte) 123);
            this.field58 = new int[arg2.method941((byte) 124)][2];
            for (int var4 = 0; var4 < this.field58.length; ++var4) {
                this.field58[var4][0] = arg2.method993((byte) -83);
                this.field58[var4][1] = arg2.method993((byte) -65);
            }
        }
        if (arg1 == 80) {
            ++field51;
        }
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V")
    public static final void method28(int arg0) {
        ++field50;
        boolean var1 = ~class234.field3288.method939(49510128) == -2;
        int var2 = class234.field3288.method963(-113);
        if (arg0 != 27357) {
            method21(67);
        }
        int var3 = class234.field3288.method980(-19443);
        int var4 = class234.field3288.method993((byte) -79);
        class247.field3542 = class234.field3288.method939(arg0 ^ 49486893);
        class245.method1531(var3, -123);
        class234.field3288.method2217((byte) 117);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; var20 < class362.field5442 >> 3; ++var20) {
                for (int var21 = 0; class203.field2813 >> 3 > var21; ++var21) {
                    int var22 = class234.field3288.method2229(1, arg0 ^ -27358);
                    if (~var22 == -2) {
                        class159.field2072[var5][var20][var21] = class234.field3288.method2229(26, class17.method121(arg0, -27358));
                    } else {
                        class159.field2072[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class234.field3288.method2227(arg0 + -27349);
        int var6 = (-class234.field3288.field2018 + class359.field5330) / 16;
        class55.field855 = new int[var6][4];
        for (int var7 = 0; var7 < var6; ++var7) {
            for (int var19 = 0; var19 < 4; ++var19) {
                class55.field855[var7][var19] = class234.field3288.method950(186);
            }
        }
        class105.field1410 = new int[var6];
        class285.field4068 = new byte[var6][];
        class238.field3337 = null;
        class454.field6602 = new int[var6];
        class369.field5535 = new byte[var6][];
        class191.field2708 = new byte[var6][];
        class270.field3775 = new int[var6];
        class76.field1081 = new int[var6];
        class195.field2748 = new int[var6];
        class288.field4105 = null;
        class51.field761 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; ++var9) {
            for (int var10 = 0; var10 < class362.field5442 >> 3; ++var10) {
                for (int var11 = 0; ~var11 > ~(class203.field2813 >> 3); ++var11) {
                    int var12 = class159.field2072[var9][var10][var11];
                    if (~var12 != 0) {
                        int var13 = var12 >> 14 & 1023;
                        int var14 = var12 >> 3 & 2047;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var8 > var16; ++var16) {
                            if (class76.field1081[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class76.field1081[var8] = var15;
                            int var17 = (var15 & 65333) >> 8;
                            int var18 = var15 & 255;
                            class270.field3775[var8] = class67.field1004.method1444("m" + var17 + "_" + var18, (byte) 99);
                            class195.field2748[var8] = class67.field1004.method1444("l" + var17 + "_" + var18, (byte) 104);
                            class105.field1410[var8] = class67.field1004.method1444("um" + var17 + "_" + var18, (byte) 29);
                            class454.field6602[var8] = class67.field1004.method1444("ul" + var17 + "_" + var18, (byte) 77);
                            ++var8;
                        }
                    }
                }
            }
        }
        class478.method2791(var1, false, var2, 128, var4);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(BI)[I")
    private final int[] method29(byte arg0, int arg1) {
        ++field60;
        if (arg1 < 0) {
            return this.field61;
        } else if (~this.field58.length >= ~arg1) {
            return this.field65;
        } else {
            return arg0 != 63 ? null : this.field58[arg1];
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(IZ)I")
    public static final int method30(int arg0, boolean arg1) {
        int var2 = ((-1431655765 & arg0) >>> 1) + (arg0 & 1431655765);
        ++field53;
        int var3 = (858993459 & var2) - -(var2 >>> 2 & -214748365);
        if (arg1) {
            field67 = null;
        }
        int var4 = (var3 >>> 4) + var3 & 252645135;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return 255 & var6;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field63;
        int[] var3 = super.field5854.method465(arg1, 121);
        if (arg0 != -780833076) {
            this.field61 = null;
        }
        if (super.field5854.field991) {
            int[] var4 = this.method2376(56, 0, arg1);
            for (int var5 = 0; var5 < class164.field2152; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field57[var6];
            }
        }
        return var3;
    }
}
