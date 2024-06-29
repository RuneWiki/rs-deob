import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class84 extends class144 {

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    private int field1162 = 0;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "[S")
    private short[] field1170 = new short[257];

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1163 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lbd;")
    public static class81 field1159;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[I")
    private int[] field1157;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "[I")
    private int[] field1171;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[[I")
    private int[][] field1164;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method501(boolean arg0) {
        if (arg0) {
            field1169 = -47;
        }
        field1159 = null;
        field1163 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILtl;I)V")
    public static final void method502(int arg0, int arg1, int arg2, class240 arg3, int arg4) {
        ++field1165;
        if (class177.field2507 != arg3) {
            if (class112.field1496 < 400) {
                String var5;
                if (arg3.field3467 != 0) {
                    var5 = arg3.method1557(104) + " (" + class167.field2410 + arg3.field3467 + ")";
                } else {
                    boolean var6 = true;
                    if (~class177.field2507.field3486 != 0 && ~arg3.field3486 != 0) {
                        int var7 = class177.field2507.field3472 <= arg3.field3472 ? arg3.field3472 : class177.field2507.field3472;
                        int var8 = ~arg3.field3486 >= ~class177.field2507.field3486 ? arg3.field3486 : class177.field2507.field3486;
                        int var9 = var7 * 10 / 100 + var8 + 5;
                        int var10 = -arg3.field3472 + class177.field2507.field3472;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        if (var9 < var10) {
                            var6 = false;
                        }
                    }
                    String var11 = ~class5.field67 != -2 ? class61.field724 : class120.field1718;
                    if (~arg3.field3495 >= ~arg3.field3472) {
                        var5 = arg3.method1557(104) + (var6 ? class61.method379((byte) 119, class177.field2507.field3472, arg3.field3472) : "<col=ffffff>") + " (" + var11 + arg3.field3472 + ")";
                    } else {
                        var5 = arg3.method1557(104) + (var6 ? class61.method379((byte) 81, class177.field2507.field3472, arg3.field3472) : "<col=ffffff>") + " (" + var11 + arg3.field3472 + "+" + (-arg3.field3472 + arg3.field3495) + ")";
                    }
                }
                if (~class196.field2790 == -2) {
                    class176.method1143(4, arg0, (short) 26, arg2, class167.field2403, class107.field1444 + " -> <col=ffffff>" + var5, class26.field314, (long) arg1);
                    ++class263.field3807;
                } else if (class267.field3857) {
                    if (~(class282.field4263 & 8) != -1) {
                        ++class217.field3076;
                        class176.method1143(arg4 + -4, arg0, (short) 59, arg2, class268.field3916, class48.field560 + " -> <col=ffffff>" + var5, class133.field1945, (long) arg1);
                    }
                } else {
                    for (int var12 = 7; var12 >= 0; --var12) {
                        if (class211.field2968[var12] != null) {
                            boolean var14 = false;
                            short var15 = 0;
                            ++class122.field1751;
                            if (~class5.field67 == -1 && class211.field2968[var12].equalsIgnoreCase(class180.field2554)) {
                                if (class177.field2507.field3472 < arg3.field3472) {
                                    var15 = 2000;
                                }
                                if (~class177.field2507.field3465 != -1 && arg3.field3465 != 0) {
                                    if (~class177.field2507.field3465 != ~arg3.field3465) {
                                        var15 = 0;
                                    } else {
                                        var15 = 2000;
                                    }
                                }
                            } else if (class193.field2773[var12]) {
                                var15 = 2000;
                            }
                            short var16 = class212.field2970[var12];
                            short var17 = (short) (var15 + var16);
                            class176.method1143(4, arg0, var17, arg2, class22.field272[var12], "<col=ffffff>" + var5, class211.field2968[var12], (long) arg1);
                        }
                    }
                }
                if (arg4 == 8) {
                    for (int var13 = 0; ~class112.field1496 < ~var13; ++var13) {
                        if (class190.field2749[var13] == 24) {
                            class240.field3482[var13] = "<col=ffffff>" + var5;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
    private final void method503(boolean arg0) {
        if (!arg0) {
            int[] var2 = this.field1164[0];
            ++field1153;
            int[] var3 = this.field1164[this.field1164.length + -2];
            int[] var4 = this.field1164[1];
            int[] var5 = this.field1164[this.field1164.length - 1];
            this.field1157 = new int[] { var2[0] - var4[0] - -var2[0], var2[1] + -var4[1] + var2[1] };
            this.field1171 = new int[] { var3[0] - -var3[0] + -var5[0], var3[1] + -var5[1] + var3[1] };
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1162 = arg1.method1407(arg2 + -20519);
            this.field1164 = new int[arg1.method1407(105)][2];
            for (int var4 = 0; ~this.field1164.length < ~var4; ++var4) {
                this.field1164[var4][0] = arg1.method1380(true);
                this.field1164[var4][1] = arg1.method1380(true);
            }
        }
        ++field1167;
        if (arg2 != 20630) {
            this.field1164 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static final void method504(int arg0) {
        class204.field2898.method67((byte) -126);
        if (arg0 < -49) {
            ++field1158;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            field1159 = null;
        }
        int[] var3 = super.field2069.method425(true, arg0);
        ++field1168;
        if (super.field2069.field820) {
            int[] var4 = this.method934(-18877, 0, arg0);
            for (int var5 = 0; ~var5 > ~class104.field1411; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1170[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(BI)[I")
    private final int[] method505(byte arg0, int arg1) {
        if (arg0 < 79) {
            return null;
        } else {
            ++field1155;
            if (arg1 < 0) {
                return this.field1157;
            } else {
                return this.field1164.length <= arg1 ? this.field1171 : this.field1164[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
    private final void method506(boolean arg0) {
        ++field1160;
        if (arg0) {
            int var2 = this.field1162;
            if (~var2 != -3) {
                if (var2 == 1) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~(this.field1164.length + -1) < ~var5 && this.field1164[var5][0] <= var4; ++var5) {
                        }
                        int[] var6 = this.field1164[var5 + -1];
                        int[] var7 = this.field1164[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = -class9.field135[255 & var8 >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (var11 >= 32768) {
                            var11 = 32767;
                        }
                        this.field1170[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; var14 < this.field1164.length + -1 && this.field1164[var14][0] <= var13; ++var14) {
                        }
                        int[] var15 = this.field1164[var14];
                        int[] var16 = this.field1164[var14 + -1];
                        int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field1170[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field1164.length - 1) && ~var21 <= ~this.field1164[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field1164[var22];
                    int[] var24 = this.field1164[var22 + -1];
                    int var25 = this.method505((byte) 107, var22 + -2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method505((byte) 82, var22 + 1)[1];
                    int var29 = var28 - (-var27 + var26) + -var25;
                    int var30 = (var21 - var24[0] << 12) / (var23[0] + -var24[0]);
                    int var31 = var30 * var30 >> 12;
                    int var32 = -var27 + -var29 + var25;
                    int var34 = var31 * var32 >> 12;
                    int var35 = -var25 + var26;
                    int var36 = (var29 * var30 >> 12) * var31 >> 12;
                    int var37 = var30 * var35 >> 12;
                    int var38 = var36 - (-var27 + -var34) + var37;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field1170[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        if (this.field1164 == null) {
            this.field1164 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1161;
        if (arg0 > -109) {
            this.field1170 = null;
        }
        if (~this.field1164.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1162 == -3) {
                this.method503(false);
            }
            class175.method1131((byte) -126);
            this.method506(true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILwe;IIIII)V")
    public static final void method507(byte arg0, int arg1, class82 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class296.field4678) {
            class293.field4634 = 32;
        } else {
            class293.field4634 = 0;
        }
        class296.field4678 = false;
        if (arg0 > -70) {
            method501(false);
        }
        ++field1156;
        if (~class151.field2193 != -1) {
            if (arg1 <= arg5 && arg1 - -16 > arg5 && arg3 >= arg6 && arg3 < arg6 + 16) {
                arg2.field1018 -= 4;
                class255.method1632(16711680, arg2);
            } else if (arg1 <= arg5 && arg5 < arg1 + 16 && ~arg3 <= ~(arg7 + -16 + arg6) && ~(arg6 + arg7) < ~arg3) {
                arg2.field1018 += 4;
                class255.method1632(16711680, arg2);
            } else if (~(-class293.field4634 + arg1) >= ~arg5 && ~arg5 > ~(class293.field4634 + 16 + arg1) && arg6 + 16 <= arg3 && arg6 + arg7 + -16 > arg3) {
                int var8 = (arg7 + -32) * arg7 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -arg6 + -16 + arg3 - var8 / 2;
                int var10 = arg7 + -32 + -var8;
                arg2.field1018 = (arg4 - arg7) * var9 / var10;
                class255.method1632(16711680, arg2);
                class296.field4678 = true;
            }
        }
        if (class161.field2320 != 0) {
            int var11 = arg2.field1131;
            if (-var11 + arg1 <= arg5 && arg6 <= arg3 && ~arg5 > ~(arg1 + 16) && ~(arg6 + arg7) <= ~arg3) {
                arg2.field1018 += class161.field2320 * 45;
                class255.method1632(16711680, arg2);
                return;
            }
        }
    }
}
