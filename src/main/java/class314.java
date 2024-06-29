import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class314 extends class6 {

    @OriginalMember(owner = "client!cb", name = "vc", descriptor = "[[B")
    public static byte[][] field5111 = new byte[50][];

    @OriginalMember(owner = "client!cb", name = "uc", descriptor = "I")
    public static int field5110 = 0;

    @OriginalMember(owner = "client!cb", name = "nc", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!cb", name = "oc", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!cb", name = "pc", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!cb", name = "qc", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!cb", name = "sc", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!cb", name = "tc", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!cb", name = "wc", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!cb", name = "xc", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!cb", name = "yc", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!cb", name = "Ac", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!cb", name = "Bc", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!cb", name = "Cc", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!cb", name = "zc", descriptor = "Ljj;")
    public static class168 field5115;

    @OriginalMember(owner = "client!cb", name = "rc", descriptor = "Lvm;")
    public class88 field5107;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I", line = 4)
    public final int method340() {
        field5116++;
        return this.field185;
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() {
        if (this.field207 != null) {
            this.field207.method1486();
        }
        field5117++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILhb;IIIIIIIIZIILmi;)Lhb;", line = 26)
    public static final class42 method2269(int arg0, class42 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, class300 arg13) {
        long var14 = ((long) arg4 << 48) + (long) (arg0 - (-(arg9 << 24) - (arg12 << 16))) + ((long) arg2 << 32);
        field5108++;
        class42 var16 = (class42) class345.field5444.method893(var14, arg7 + 15);
        if (var16 == null) {
            int[] var17 = new int[] { 64, 96, 128 };
            byte var18;
            if (arg0 == 1) {
                var18 = 9;
            } else if (arg0 == 2) {
                var18 = 12;
            } else if (arg0 == 3) {
                var18 = 15;
            } else if (arg0 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            byte var19 = 3;
            class48 var20 = new class48(var18 * var19 + 1, var18 * 2 * var19 - var18, 0);
            int var21 = var20.method403(0, 0, 0);
            int[][] var22 = new int[var19][var18];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var17[var23];
                int var25 = var17[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = class305.field4957[var27] * var25 + arg5 >> 16;
                    int var29 = class305.field4959[var27] * var24 + arg3 >> 16;
                    var22[var23][var26] = var20.method403(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg9 * var31 + arg12 * var32 >> 8);
                short var34 = (short) (((arg2 & 0x7F) * var32 + (arg4 & 0x7F) * var31 & 0x7F00) + ((arg2 & 0x380) * var32 + (arg4 & 0x380) * var31 & 0x38000) + ((arg2 & 0xFC00) * var32 + (arg4 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var20.method406(var21, var22[0][(var35 + 1) % var18], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method406(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var18], var22[var30][(var35 + 1) % var18], (byte) 1, var34, var33);
                        var20.method406(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var18], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method424(64, 768, -50, -10, -50);
            class345.field5444.method888(var14, var16, 41);
        }
        int var36 = arg0 * arg7 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg1.method356();
        int var41 = var36;
        if (arg10) {
            if (arg11 > 1152 && arg11 < 1920) {
                var39 = var36 + 128;
            }
            if (arg11 > 1664 || arg11 < 384) {
                var38 -= 128;
            }
            if (arg11 > 128 && arg11 < 896) {
                var37 -= 128;
            }
            if (arg11 > 640 && arg11 < 1408) {
                var41 = var36 + 128;
            }
        }
        if (var40 < var37) {
            var40 = var37;
        }
        int var42 = arg1.method339();
        if (var39 < var42) {
            var42 = var39;
        }
        int var43 = arg1.method346();
        class133 var44 = null;
        if (var43 < var38) {
            var43 = var38;
        }
        int var45 = arg1.method350();
        if (arg13 != null) {
            int var46 = arg13.field4885[arg6];
            var44 = class198.method1354(var46 >> 16, (byte) 74);
            arg6 = var46 & 0xFFFF;
        }
        if (var45 > var41) {
            var45 = var41;
        }
        class42 var47;
        if (var44 == null) {
            var47 = var16.method355(true, true, true);
            var47.method351((var42 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method353((var40 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method355(!var44.method936(21603, arg6), !var44.method939(arg6, 120), true);
            var47.method351((var42 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method353((var40 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method352(var44, arg6);
        }
        if (arg11 != 0) {
            var47.method345(arg11);
        }
        if (class241.field4016) {
            class294 var50 = (class294) var47;
            if (arg8 != class21.method189((byte) -103, arg5 + var43, arg3 - -var40, class276.field4506) || arg8 != class21.method189((byte) 103, arg5 + var45, arg3 - -var42, class276.field4506)) {
                for (int var51 = 0; var51 < var50.field4792; var51++) {
                    var50.field4759[var51] += class21.method189((byte) 106, var50.field4762[var51] + arg5, var50.field4753[var51] - -arg3, class276.field4506) - arg8;
                }
                var50.field4763.field4608 = false;
                var50.field4781.field4169 = false;
            }
        } else {
            class95 var48 = (class95) var47;
            if (class21.method189((byte) -59, arg5 + var43, arg3 - -var40, class276.field4506) != arg8 || class21.method189((byte) -81, arg5 + var45, arg3 + var42, class276.field4506) != arg8) {
                for (int var49 = 0; var49 < var48.field1689; var49++) {
                    var48.field1677[var49] += class21.method189((byte) 93, var48.field1688[var49] + arg5, var48.field1698[var49] + arg3, class276.field4506) - arg8;
                }
                var48.field1670 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V", line = 249)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5118++;
        if (this.field5107 == null) {
            return;
        }
        if (!this.field142) {
            class300 var6 = this.field166 != -1 && this.field180 == 0 ? class258.method1807(this.field166, 127) : null;
            class300 var7 = this.field206 == -1 || this.field206 == this.method60(true).field106 && var6 != null ? null : class258.method1807(this.field206, 107);
            class42 var8 = this.field5107.method680(var7, var6, this.field150, this.field220, this.field210, this.field167, this.field149, this.field203, this.field177, (byte) 124);
            if (var8 == null) {
                return;
            }
            this.method53(var8, (class42) null, (byte) 99);
        }
        if (this.field207 != null) {
            this.field207.method1483(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I", line = 285)
    public final int method56(int arg0) {
        field5114++;
        if (this.field5107.field1552 != null) {
            class88 var2 = this.field5107.method681((byte) 15);
            if (var2 != null && var2.field1580 != -1) {
                return var2.field1580;
            }
        }
        int var3 = -25 / ((68 - arg0) / 33);
        return this.field5107.field1580;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lek;III)Lbn;", line = 317)
    public static final class75 method2270(class206 arg0, int arg1, int arg2, int arg3) {
        int var4 = -67 / ((arg3 - 68) / 40);
        field5113++;
        return class76.method581(arg0, 52, arg1, arg2) ? class68.method531(29121) : null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILvm;)V", line = 331)
    public final void method2271(int arg0, class88 arg1) {
        this.field5107 = arg1;
        int var3 = 51 % ((31 - arg0) / 36);
        if (this.field207 != null) {
            this.field207.method1480();
        }
        field5103++;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 348)
    public static final void method2272(int arg0) {
        field5105++;
        if (class19.field501 == -1 || class272.field4427 == -1) {
            return;
        }
        int var1 = ((class202.field3388 - class308.field5027) * class273.field4457 >> 16) + class308.field5027;
        class273.field4457 += var1;
        int var2 = class201.field3375 * 2;
        if (class273.field4457 < 65535) {
            class177.field2931 = false;
            class197.field3301 = false;
        } else {
            if (class177.field2931) {
                class197.field3301 = false;
            } else {
                class197.field3301 = true;
            }
            class177.field2931 = true;
            class273.field4457 = 65535;
        }
        float[] var3 = new float[3];
        float var4 = (float) class273.field4457 / 65535.0F;
        int var5 = 0;
        if (arg0 != 23549) {
            field5110 = 121;
        }
        while (var5 < 3) {
            int var6 = class56.field1101[class19.field501][var2][var5] * 3;
            int var7 = class56.field1101[class19.field501][var2 + 1][var5] * 3;
            int var8 = (class56.field1101[class19.field501][var2 + 2][var5] + class56.field1101[class19.field501][var2 + 2][var5] - class56.field1101[class19.field501][var2 + 3][var5]) * 3;
            int var9 = class56.field1101[class19.field501][var2][var5];
            int var10 = var7 - var6;
            int var11 = class56.field1101[class19.field501][var2 + 2][var5] + var7 - (var8 + var9);
            int var12 = var6 + var8 - (var7 * 2);
            var3[var5] = (((float) var11 * var4 + (float) var12) * var4 + (float) var10) * var4 + (float) var9;
            var5++;
        }
        class141.field2380 = (int) var3[1] * -1;
        class16.field462 = (int) var3[2] - class21.field543 * 128;
        float[] var13 = new float[3];
        class223.field3693 = (int) var3[0] - class272.field4426 * 128;
        int var14 = class98.field1778 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class56.field1101[class272.field4427][var14 + 1][var15] * 3;
            int var17 = class56.field1101[class272.field4427][var14][var15] * 3;
            int var18 = var16 - var17;
            int var19 = (class56.field1101[class272.field4427][var14 + 2][var15] + class56.field1101[class272.field4427][var14 + 2][var15] - class56.field1101[class272.field4427][var14 + 3][var15]) * 3;
            int var20 = class56.field1101[class272.field4427][var14][var15];
            int var21 = var17 - (var16 * 2 - var19);
            int var22 = class56.field1101[class272.field4427][var14 + 2][var15] - var20 - (-var16 - -var19);
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var18) * var4 + (float) var20;
        }
        float var23 = var13[0] - var3[0];
        float var24 = (var13[1] - var3[1]) * -1.0F;
        float var25 = var13[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class180.field2963 = (float) Math.atan2((double) var24, var26);
        class23.field571 = -((float) Math.atan2((double) var23, (double) var25));
        class18.field500 = (int) ((double) class23.field571 * 325.949D) & 0x7FF;
        class298.field4847 = (int) ((double) class180.field2963 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I", line = 453)
    public final int method54(boolean arg0) {
        if (arg0) {
            method2272(127);
        }
        field5112++;
        if (this.field5107.field1552 != null) {
            class88 var2 = this.field5107.method681((byte) 15);
            if (var2 != null && var2.field1534 != -1) {
                return var2.field1534;
            }
        }
        return this.field175;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z", line = 478)
    public final boolean method45(byte arg0) {
        field5106++;
        if (arg0 != -95) {
            field5115 = (class168) null;
        }
        return this.field5107 != null;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V", line = 498)
    public static void method2273(byte arg0) {
        field5115 = null;
        if (arg0 > 53) {
            field5111 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 511)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        field5104++;
        if (this.field5107 == null) {
            return;
        }
        class300 var13 = this.field166 != -1 && this.field180 == 0 ? class258.method1807(this.field166, 65) : null;
        class300 var14 = this.field206 == -1 || this.field206 == this.method60(true).field106 && var13 != null ? null : class258.method1807(this.field206, 90);
        class42 var15 = this.field5107.method680(var14, var13, this.field150, this.field220, this.field210, this.field167, this.field149, this.field203, this.field177, (byte) 119);
        if (var15 == null) {
            return;
        }
        this.field185 = var15.method340();
        class88 var16 = this.field5107;
        if (var16.field1552 != null) {
            var16 = var16.method681((byte) 15);
        }
        if (class252.field4143 && var16.field1559) {
            class42 var17 = method2269(this.field5107.field1565, var15, this.field5107.field1578, this.field199, this.field5107.field1595, this.field213, var14 == null ? this.field220 : this.field150, 64, this.field136, this.field5107.field1553, this.field189, arg0, this.field5107.field1598, var14 == null ? var13 : var14);
            if (class241.field4016) {
                float var18 = class241.method1722();
                float var19 = class241.method1706();
                class241.method1689();
                class241.method1698(var18, var19 - 150.0F);
                var17.method327(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field207);
                class241.method1700();
                class241.method1698(var18, var19);
            } else {
                var17.method327(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field207);
            }
        }
        this.method59(-92, var15);
        class42 var20 = null;
        this.method58(4, var15, arg0);
        if (this.field127 != -1 && this.field147 != -1) {
            class198 var21 = class134.method944(1, this.field127);
            var20 = var21.method1357(this.field147, this.field153, this.field204, -11);
            if (var20 != null) {
                var20.method353(0, -this.field159, 0);
                if (var21.field3328) {
                    if (class190.field3226 != 0) {
                        var20.method344(class190.field3226);
                    }
                    if (class54.field1084 != 0) {
                        var20.method329(class54.field1084);
                    }
                    if (class318.field5175 != 0) {
                        var20.method353(0, class318.field5175, 0);
                    }
                }
            }
        }
        if (!class241.field4016) {
            if (var20 != null) {
                var15 = ((class95) var15).method725(var20);
            }
            this.method53(var15, var20, (byte) 100);
            if (this.field5107.field1565 == 1) {
                var15.field895 = true;
            }
            var15.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field207);
            return;
        }
        this.method53(var15, var20, (byte) 72);
        if (this.field5107.field1565 == 1) {
            var15.field895 = true;
        }
        var15.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field207);
        if (var20 == null) {
            return;
        }
        if (this.field5107.field1565 == 1) {
            var20.field895 = true;
        }
        if (this.field207 != null) {
            class294 var22 = (class294) var20;
            this.field207.method1491(var22.field4780, var22.field4772, true, var22.field4753, var22.field4759, var22.field4762);
        }
        var20.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field207);
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)I", line = 631)
    public final int method55(byte arg0) {
        field5109++;
        if (this.field5107.field1552 != null) {
            class88 var2 = this.field5107.method681((byte) 15);
            if (var2 != null && var2.field1563 != -1) {
                return var2.field1563;
            }
        }
        if (arg0 < 22) {
            return 50;
        } else if (this.field5107.field1563 == -1) {
            return super.method55((byte) 55);
        } else {
            return this.field5107.field1563;
        }
    }
}
