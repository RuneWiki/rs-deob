import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class34 extends class101 {

    @OriginalMember(owner = "client!kb", name = "Lb", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!kb", name = "Qb", descriptor = "I")
    public static int field571 = 0;

    @OriginalMember(owner = "client!kb", name = "Eb", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!kb", name = "Fb", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!kb", name = "Gb", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!kb", name = "Hb", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!kb", name = "Ib", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!kb", name = "Jb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!kb", name = "Kb", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!kb", name = "Mb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!kb", name = "Nb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!kb", name = "Ob", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!kb", name = "Pb", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!kb", name = "Sb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!kb", name = "Tb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!kb", name = "Vb", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!kb", name = "Ub", descriptor = "Lwi;")
    private class263 field575;

    @OriginalMember(owner = "client!kb", name = "Rb", descriptor = "Lja;")
    public static class64 field572;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(SILjava/lang/String;IIBLjava/lang/String;J)V", line = 4)
    public static final void method236(short arg0, int arg1, String arg2, int arg3, int arg4, byte arg5, String arg6, long arg7) {
        field574++;
        if (class243.field3754) {
            return;
        }
        if (arg5 != 40) {
            field572 = (class64) null;
        }
        if (class65.field1062 >= 500) {
            return;
        }
        class298.field4711[class65.field1062] = arg2;
        class13.field246[class65.field1062] = arg6;
        class40.field728[class65.field1062] = arg4 == -1 ? class273.field4240 : arg4;
        class12.field233[class65.field1062] = arg0;
        class311.field4888[class65.field1062] = arg7;
        class156.field2492[class65.field1062] = arg3;
        class59.field930[class65.field1062] = arg1;
        class65.field1062++;
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(BI)I", line = 31)
    public final int method237(byte arg0, int arg1) {
        field560++;
        int var3 = 72 % ((-arg0 - 23) / 54);
        return arg1 * 8 - this.field559;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V", line = 45)
    public class34(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "(I)V", line = 50)
    public final void method238(int arg0) {
        field576++;
        this.field1667 = (this.field559 + arg0) / 8;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)J", line = 60)
    public static final long method239(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        return var3 == null || var3.field4213 == null ? 0L : var3.field4213.field1338;
    }

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "(II)I", line = 72)
    public final int method240(int arg0, int arg1) {
        int var3 = this.field559 >> 3;
        if (arg1 >= -18) {
            return -6;
        }
        int var4 = 0;
        int var5 = 8 - (this.field559 & 0x7);
        this.field559 += arg0;
        field573++;
        while (var5 < arg0) {
            var4 += (class125.field1998[var5] & this.field1661[var3++]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 == var5) {
            var6 = (class125.field1998[var5] & this.field1661[var3]) + var4;
        } else {
            var6 = (this.field1661[var3] >> var5 - arg0 & class125.field1998[arg0]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "(I)I", line = 104)
    public final int method241(int arg0) {
        if (arg0 != 255) {
            this.field559 = -77;
        }
        field565++;
        return this.field1661[this.field1667++] - this.field575.method1870(255) & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[I)V", line = 117)
    public final void method242(int arg0, int[] arg1) {
        this.field575 = new class263(arg1);
        field570++;
        if (arg0 != 0) {
            this.method241(20);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lpe;I)V", line = 134)
    public static final void method243(class101 arg0, int arg1) {
        if (arg1 != -1) {
            field571 = -33;
        }
        field563++;
        while (true) {
            while (arg0.field1667 < arg0.field1661.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method741(84) == 1) {
                    var3 = arg0.method741(53);
                    var2 = true;
                    var4 = arg0.method741(120);
                }
                int var5 = arg0.method741(93);
                int var6 = arg0.method741(arg1 ^ 0xFFFFFFDF);
                int var7 = var5 * 64 - class310.field4885;
                int var8 = -(var6 * 64) - (-class70.field1107 - (class279.field4316 - 1));
                if (var7 >= 0 && (var8 - 63) >= 0 && class79.field1208 > var7 + 63 && var8 < class279.field4316) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && (var3 * 8 + 8) > var11 && (var4 * 8) <= var12 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method741(70);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method741(101);
                                        if (class151.field2432[var10][var9] == null) {
                                            class151.field2432[var10][var9] = new byte[4096];
                                        }
                                        class151.field2432[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method776(arg1 - 1574267375);
                                        if (class210.field3362[var10][var9] == null) {
                                            class210.field3362[var10][var9] = new int[4096];
                                        }
                                        class210.field3362[var10][var9][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method776(-1574267376);
                                        if (class148.field2387[var10][var9] == null) {
                                            class148.field2387[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class6 var17 = class28.method190(-117, var16);
                                        if (var17.field56 != null) {
                                            var17 = var17.method19(false);
                                            if (var17 == null || var17.field104 == -1) {
                                                continue;
                                            }
                                        }
                                        class148.field2387[var10][var9][(63 - var12 << 6) + var11] = var17.field106 + 1;
                                        class26 var18 = new class26();
                                        var18.field430 = var8;
                                        var18.field437 = var17.field104;
                                        var18.field438 = var7;
                                        class219.field3499.method1493(-93, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method741(115);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1667++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1667 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1667 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "(I)V", line = 279)
    public static void method244(int arg0) {
        if (arg0 != -16157) {
            method239(0, -25, 99);
        }
        field572 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([[FILci;[IILc;I[[I[[FI[[F)V", line = 294)
    public static final void method245(float[][] arg0, int arg1, class201 arg2, int[] arg3, int arg4, class306 arg5, int arg6, int[][] arg7, float[][] arg8, int arg9, float[][] arg10) {
        int[] var11 = new int[arg3.length / 2];
        field569++;
        if (arg1 != 1) {
            field571 = -20;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg3[var12 + var12];
            int var14 = arg3[var12 + var12 + 1];
            if (arg4 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg4 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg4 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg8[arg9][arg6];
                var18 = arg0[arg9][arg6];
                var19 = arg10[arg9][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg0[arg9 + 1][arg6];
                var19 = arg10[arg9 + 1][arg6];
                var17 = arg8[arg9 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg10[arg9 + 1][arg6 + 1];
                var18 = arg0[arg9 + 1][arg6 + 1];
                var17 = arg8[arg9 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg0[arg9][arg6 + 1];
                var17 = arg8[arg9][arg6 + 1];
                var19 = arg10[arg9][arg6 + 1];
            } else {
                float var20 = arg0[arg9][arg6];
                float var21 = arg8[arg9][arg6];
                float var22 = arg10[arg9][arg6];
                float var23 = (float) var13 / 128.0F;
                float var24 = (float) var14 / 128.0F;
                float var25 = (arg10[arg9 + 1][arg6] - var22) * var23 + var22;
                float var26 = (arg0[arg9 + 1][arg6] - var20) * var23 + var20;
                float var27 = (arg8[arg9 + 1][arg6] - var21) * var23 + var21;
                float var28 = arg10[arg9][arg6 + 1];
                float var29 = (arg10[arg9 + 1][arg6 + 1] - var28) * var23 + var28;
                float var30 = arg0[arg9][arg6 + 1];
                var19 = (var29 - var25) * var24 + var25;
                float var31 = (arg0[arg9 + 1][arg6 + 1] - var30) * var23 + var30;
                float var32 = arg8[arg9][arg6 + 1];
                var18 = (var31 - var26) * var24 + var26;
                float var33 = (arg8[arg9 + 1][arg6 + 1] - var32) * var23 + var32;
                var17 = (var33 - var27) * var24 + var27;
            }
            int var34 = (arg9 << 7) + var13;
            int var35 = (arg6 << 7) + var14;
            int var36 = class205.method1500(1164571624, var13, arg9, var14, arg7, arg6);
            var11[var12] = arg2.method1460(arg5, var34, var36, var35, var19, var18, var17);
        }
        arg2.method1462(var11);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V", line = 413)
    public final void method246(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1661[this.field1667++] = (byte) (arg1 + this.field575.method1870(255));
            field561++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII[B)V", line = 425)
    public final void method247(byte arg0, int arg1, int arg2, byte[] arg3) {
        field568++;
        int var5 = 0;
        if (arg0 <= -103) {
            while (var5 < arg1) {
                arg3[arg2 + var5] = (byte) (this.field1661[this.field1667++] - this.field575.method1870(255));
                var5++;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "(I)Z", line = 444)
    public static final boolean method248(int arg0) {
        if (arg0 >= -108) {
            return true;
        } else {
            field567++;
            return class265.field4126 ? true : class65.field1064;
        }
    }

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "(I)V", line = 460)
    public final void method249(int arg0) {
        this.field559 = this.field1667 * 8;
        field562++;
        if (arg0 != 0) {
            field564 = 75;
        }
    }
}
