import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class258 {

    @OriginalMember(owner = "client!at", name = "p", descriptor = "[I")
    private int[] field3951 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!at", name = "o", descriptor = "[I")
    private int[] field3950 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!at", name = "D", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lcq;")
    private class329 field3940;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "Lr;")
    private class124 field3947;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "Z")
    public boolean field3957;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "[[[B")
    public byte[][][] field3969;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "[[[B")
    private byte[][][] field3968;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "[[[B")
    private byte[][][] field3944;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "[[[I")
    public int[][][] field3946;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "[[[B")
    private byte[][][] field3956;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "[[[B")
    private byte[][][] field3960;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Lhn;")
    public static class509 field3943 = new class509(39, 8);

    @OriginalMember(owner = "client!at", name = "B", descriptor = "Lak;")
    public static class234 field3963 = new class234("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!at", name = "F", descriptor = "Z")
    public static boolean field3967 = false;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
    public static int[] field3971;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "[[[B")
    public byte[][][] field3964;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "[[[Lfq;")
    public static class138[][][] field3939;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I[[II)V", line = 7)
    public final void method1719(int arg0, int[][] arg1, int arg2) {
        if (arg2 != 27571) {
            this.field3948 = 43;
        }
        field3954++;
        int[][] var4 = this.field3946[arg0];
        for (int var5 = 0; var5 < this.field3965 + 1; var5++) {
            for (int var6 = 0; var6 < this.field3948 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1720(int arg0) {
        class13 var1 = class298.field4532;
        synchronized (class298.field4532) {
            int var2 = -123 % ((-arg0 - 3) / 44);
            class298.field4532.method88(102);
        }
        field3949++;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V", line = 50)
    public static void method1721(int arg0) {
        field3963 = null;
        if (arg0 >= -35) {
            method1721(40);
        }
        field3971 = null;
        field3939 = null;
        field3943 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)V", line = 66)
    public static final void method1722(byte arg0, int arg1) {
        class324.field4851 = 100;
        class197.field3283 = 3;
        if (arg0 > -15) {
            method1722((byte) -124, 8);
        }
        class71.field1026 = -1;
        field3942++;
        class458.field6663 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I[Lpd;ILhp;IIBIII)V", line = 82)
    public final void method1723(int arg0, class172[] arg1, int arg2, class217 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field3966++;
        int var11 = (arg5 & 0x7) * 8;
        if (!this.field3957) {
            class172 var12 = arg1[arg9];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg4 + class323.method2056(var13 & 0x7, true, arg8, var14 & 0x7);
                    int var16 = arg7 + class251.method1694(-1, var13 & 0x7, arg8, var14 & 0x7);
                    if (var15 > 0 && this.field3965 - 1 > var15 && var16 > 0 && (this.field3948 - 1) > var16) {
                        var12.method1158(var15, var16, 2883842);
                    }
                }
            }
        }
        int var17 = (arg2 & 0x7) * 8;
        int var18 = arg5 & 0x1FFFFFF8 << 3;
        int var19 = -32 % ((-arg6 - 20) / 62);
        int var20 = (arg2 & 0xFFFFFFF8) << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg8 == 1) {
            var22 = 1;
        } else if (arg8 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < this.field3959; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg0 != var23 || var11 > var24 || var24 > var11 + 8 || var25 < var17 || var17 + 8 < var25) {
                        this.method1726(0, 0, 0, 0, arg3, 0, -1, -20413, false, 0, -1);
                    } else if (var11 + 8 == var24 || var17 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg8 == 0) {
                            var32 = var24 + arg4 - var11;
                            var33 = arg7 + var25 - var17;
                        } else if (arg8 == 1) {
                            var33 = arg7 + var11 + 8 - var24;
                            var32 = arg4 + var25 - var17;
                        } else if (arg8 == 2) {
                            var33 = var17 + arg7 + 8 - var25;
                            var32 = arg4 + var11 + 8 - var24;
                        } else {
                            var32 = arg4 - (var25 - var17 - 8);
                            var33 = var24 + arg7 - var11;
                        }
                        this.method1726(var18 + var24, var20 + var25, arg9, 0, arg3, 0, var33, -20413, true, 0, var32);
                    } else {
                        int var26 = class323.method2056(var24 & 0x7, true, arg8, var25 & 0x7) + arg4;
                        int var27 = class251.method1694(-1, var24 & 0x7, arg8, var25 & 0x7) + arg7;
                        this.method1726(var18 + var24, var20 + var25, arg9, arg8, arg3, var21, var27, -20413, false, var22, var26);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg8 == 0) {
                                var30 = var28 + arg4 - var11;
                                var31 = var29 + arg7 - var17;
                            } else if (arg8 == 1) {
                                var30 = var29 + arg4 - var17;
                                var31 = arg7 - (-(var11 - var28) - 8);
                            } else if (arg8 == 2) {
                                var31 = var17 + arg7 + 8 - var29;
                                var30 = var11 + arg4 + 8 - var28;
                            } else {
                                var31 = arg7 + var28 - var11;
                                var30 = -var29 - (-var17 - arg4 - 8);
                            }
                            if (var30 >= 0 && this.field3965 > var30 && var31 >= 0 && this.field3948 > var31) {
                                this.field3946[arg9][var30][var31] = this.field3946[arg9][var26 + var21][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lta;ILya;Lta;Lta;I[[I)V", line = 257)
    private final void method1724(class145 arg0, int arg1, class38 arg2, class145 arg3, class145 arg4, int arg5, int[][] arg6) {
        for (int var8 = 0; var8 < this.field3965; var8++) {
            for (int var9 = 0; var9 < this.field3948; var9++) {
                if (class334.field4991 == -1 || class408.method2570(false, var8, arg1, class334.field4991, var9)) {
                    byte var10 = this.field3944[arg1][var8][var9];
                    byte var11 = this.field3960[arg1][var8][var9];
                    int var12 = this.field3956[arg1][var8][var9] & 0xFF;
                    int var13 = this.field3968[arg1][var8][var9] & 0xFF;
                    class300 var14 = var12 == 0 ? null : this.field3940.method2089(var12 - 1, (byte) 101);
                    class63 var15 = var13 == 0 ? null : this.field3947.method919(1, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class371.field5531[var10];
                        var16 = var15 == null ? 0 : class42.field550[var10];
                    } else if (var14 != null) {
                        var17 = class371.field5531[var10];
                    } else if (var15 != null) {
                        var16 = class371.field5531[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4554 == -1 && var14.field4566 == -1 && var14.field4547 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg2.method347() ? var14.field4547 : var14.field4557;
                            if (class34.field393) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4558;
                                if (var14.field4554 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4554;
                                }
                                if (var14.field4566 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field4566;
                                }
                                var19++;
                            }
                            if (!this.field3957 && arg1 == 0) {
                                class316.method2023(var8, var9, var14.field4562, var14.field4559 * 8, var14.field4551);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field774;
                            if (class34.field393) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field773;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field3951.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg4 == null ? null : new int[var31];
                        int[] var35 = arg4 == null && arg3 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field3951[var36];
                            int var46 = this.field3950[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class495.field7136[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg4.method412(var49, var50) - arg0.method412(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg4 != null && !class495.field7136[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method412(var51, var52) - arg4.method412(var51, var52);
                                } else if (arg3 != null && !class435.field6434[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method412(var53, var54) - arg0.method412(var53, var54);
                                }
                            }
                        }
                        int var37 = arg0.method411(var8, var9);
                        int var38 = arg0.method411(var8 + 1, var9);
                        int var39 = arg0.method411(var8 + 1, var9 + 1);
                        int var40 = arg0.method411(var8, var9 + 1);
                        if (arg1 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4556) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field3969[arg1][var8][var9] = (byte) class264.method1763(this.field3969[arg1][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field3957) {
                            var42 = class102.method811(var8, var9);
                            var43 = class500.method2959(var8, var9);
                            var44 = class424.method2651(var8, var9);
                        }
                        arg0.method403(var8, var9, var32, var34, var33, var35, class185.field2802[var10], class58.field697[var10], class329.field4950[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class229.method1621(arg1, var8, var9);
                    }
                }
            }
        }
        field3961++;
        if (arg5 != 20927) {
            method1720(18);
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIZLcq;Lr;)V", line = 2542)
    public class258(int arg0, int arg1, int arg2, boolean arg3, class329 arg4, class124 arg5) {
        this.field3965 = arg1;
        this.field3940 = arg4;
        this.field3948 = arg2;
        this.field3959 = arg0;
        this.field3947 = arg5;
        this.field3957 = arg3;
        this.field3969 = new byte[this.field3959][this.field3965 + 1][this.field3948 + 1];
        this.field3968 = new byte[this.field3959][this.field3965][this.field3948];
        this.field3944 = new byte[this.field3959][this.field3965][this.field3948];
        this.field3946 = new int[this.field3959][this.field3965 + 1][this.field3948 + 1];
        this.field3956 = new byte[this.field3959][this.field3965][this.field3948];
        this.field3960 = new byte[this.field3959][this.field3965][this.field3948];
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLta;Lya;Lta;)V", line = 577)
    public final void method1725(boolean arg0, class145 arg1, class38 arg2, class145 arg3) {
        if (arg0) {
            return;
        }
        field3958++;
        if (class458.field6665 == null || class458.field6665.length != this.field3948) {
            class458.field6665 = new int[this.field3948];
            class55.field686 = new int[this.field3948];
            class334.field4992 = new int[this.field3948];
            class151.field2254 = new int[this.field3948];
            class505.field7384 = new int[this.field3948];
        }
        int[][] var5 = new int[this.field3965][this.field3948];
        for (int var6 = 0; var6 < this.field3959; var6++) {
            for (int var8 = 0; var8 < this.field3948; var8++) {
                class458.field6665[var8] = 0;
                class334.field4992[var8] = 0;
                class151.field2254[var8] = 0;
                class505.field7384[var8] = 0;
                class55.field686[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field3965; var9++) {
                for (int var10 = 0; var10 < this.field3948; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field3965 > var19) {
                        int var20 = this.field3968[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class63 var21 = this.field3947.method919(1, var20 - 1);
                            class458.field6665[var10] += var21.field770;
                            class334.field4992[var10] += var21.field769;
                            class151.field2254[var10] += var21.field777;
                            class505.field7384[var10] += var21.field775;
                            var10002 = class55.field686[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field3968[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class63 var24 = this.field3947.method919(1, var23 - 1);
                            class458.field6665[var10] -= var24.field770;
                            class334.field4992[var10] -= var24.field769;
                            class151.field2254[var10] -= var24.field777;
                            class505.field7384[var10] -= var24.field775;
                            var10002 = class55.field686[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field3948; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field3948) {
                            var11 += class458.field6665[var17];
                            var13 += class151.field2254[var17];
                            var15 += class55.field686[var17];
                            var14 += class505.field7384[var17];
                            var12 += class334.field4992[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var12 -= class334.field4992[var18];
                            var11 -= class458.field6665[var18];
                            var13 -= class151.field2254[var18];
                            var14 -= class505.field7384[var18];
                            var15 -= class55.field686[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class485.method2901(var12 / var15, var11 * 256 / var14, var13 / var15, (byte) 38);
                        }
                    }
                }
            }
            if (class171.field2539) {
                this.method1731(var5, arg2, var6 == 0 ? arg1 : null, 100, class491.field7059[var6], var6 == 0 ? arg3 : null, var6);
            } else {
                this.method1724(class491.field7059[var6], var6, arg2, var6 == 0 ? arg3 : null, var6 == 0 ? arg1 : null, 20927, var5);
            }
            this.field3968[var6] = null;
            this.field3956[var6] = null;
            this.field3944[var6] = null;
            this.field3960[var6] = null;
        }
        if (!this.field3957) {
            if (class13.field188 != 0) {
                class131.method966();
            }
            if (class533.field7845) {
                class481.method2886();
            }
        }
        for (int var7 = 0; var7 < this.field3959; var7++) {
            class491.field7059[var7].method407();
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIILhp;IIIZII)V", line = 755)
    private final void method1726(int arg0, int arg1, int arg2, int arg3, class217 arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (arg7 != -20413) {
            method1720(-55);
        }
        if (arg3 == 1) {
            arg9 = 1;
        } else if (arg3 == 2) {
            arg5 = 1;
            arg9 = 1;
        } else if (arg3 == 3) {
            arg5 = 1;
        }
        field3938++;
        if (arg10 < 0 || arg10 >= this.field3965 || arg6 < 0 || this.field3948 <= arg6) {
            while (true) {
                int var14 = arg4.method1515((byte) 126);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg4.method1515((byte) 122);
                    return;
                }
                if (var14 <= 49) {
                    arg4.method1515((byte) 126);
                }
            }
        }
        if (!this.field3957 && !arg8) {
            class476.field6873[arg2][arg10][arg6] = 0;
        }
        while (true) {
            int var12 = arg4.method1515((byte) 122);
            if (var12 == 0) {
                if (this.field3957) {
                    this.field3946[0][arg10 + arg5][arg6 + arg9] = 0;
                    return;
                } else if (arg2 == 0) {
                    this.field3946[0][arg5 + arg10][arg6 + arg9] = -class165.method1101((byte) -22, arg1 + 556238, arg0 + 932731) * 8 << 0;
                    return;
                } else {
                    this.field3946[arg2][arg5 + arg10][arg6 + arg9] = this.field3946[arg2 - 1][arg10 + arg5][arg6 + arg9] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg4.method1515((byte) 124);
                if (!this.field3957) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg2 == 0) {
                        this.field3946[0][arg5 + arg10][arg6 + arg9] = -var13 * 8 << 0;
                        return;
                    }
                    this.field3946[arg2][arg10 + arg5][arg6 + arg9] = this.field3946[arg2 - 1][arg10 + arg5][arg6 + arg9] - (var13 * 8 << 0);
                    return;
                }
                this.field3946[0][arg5 + arg10][arg6 + arg9] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg8) {
                    arg4.method1515((byte) 127);
                } else {
                    this.field3956[arg2][arg10][arg6] = arg4.method1565(true);
                    this.field3944[arg2][arg10][arg6] = (byte) ((var12 - 2) / 4);
                    this.field3960[arg2][arg10][arg6] = (byte) class74.method644(var12 + arg3 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field3957 && !arg8) {
                    class476.field6873[arg2][arg10][arg6] = (byte) (var12 - 49);
                }
            } else if (!arg8) {
                this.field3968[arg2][arg10][arg6] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II[Lpd;BIILhp;)V", line = 880)
    public final void method1727(int arg0, int arg1, class172[] arg2, byte arg3, int arg4, int arg5, class217 arg6) {
        field3962++;
        if (!this.field3957) {
            for (int var8 = 0; var8 < 4; var8++) {
                class172 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field3965 > var12 && var13 >= 0 && var13 < this.field3948) {
                            var9.method1158(var12, var13, 2883842);
                        }
                    }
                }
            }
        }
        if (arg3 <= 110) {
            field3953 = -57;
        }
        int var14 = arg1 + arg5;
        int var15 = arg0 + arg4;
        for (int var16 = 0; var16 < this.field3959; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1726(var14 + var17, var15 + var18, var16, 0, arg6, 0, var18 + arg4, -20413, false, 0, arg1 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B[Lpd;Lya;[[[I)V", line = 958)
    public final void method1728(byte arg0, class172[] arg1, class38 arg2, int[][][] arg3) {
        if (!this.field3957) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field3965; var6++) {
                    for (int var7 = 0; var7 < this.field3948; var7++) {
                        if ((class476.field6873[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class476.field6873[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1151(var6, 20, var7);
                            }
                        }
                    }
                }
            }
        }
        field3937++;
        if (arg0 < 69) {
            field3971 = null;
        }
        for (int var9 = 0; var9 < this.field3959; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field3957) {
                if (class444.field6527) {
                    var11 |= 0x8;
                }
                if (class533.field7845) {
                    var10 |= 0x2;
                }
                if (class13.field188 != 0) {
                    if (class263.field4048 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class533.field7845) {
                var11 |= 0x7;
            }
            if (!class497.field7151) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || arg3.length <= var9 ? this.field3946[var9] : arg3[var9];
            class125.method923(var9, arg2.method361(this.field3965, this.field3948, this.field3946[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBIII)V", line = 1068)
    public final void method1729(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = 0;
        if (arg1 != 34) {
            this.field3948 = -40;
        }
        while (this.field3959 > var6) {
            this.method1732(arg3, arg2, arg4, arg0, 115, var6);
            var6++;
        }
        field3936++;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLjava/lang/String;ZLla;)V", line = 1088)
    public static final void method1730(boolean arg0, String arg1, boolean arg2, class317 arg3) {
        field3970++;
        if (!arg2) {
            return;
        }
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class401.field5963.method2172((byte) 121, 250, null, arg1);
        int var8 = class401.field5963.method2166(250, null, arg1, (byte) 94) * 13;
        class377.field5692.method284(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class377.field5692.method293(var5 - var4, -var4 + var6, var7 - (-var4 - var4), var4 + var8 + var4, -1, 0);
        arg3.method2043(0, 1, 0, var7, null, arg1, -1, null, null, var8, 0, 0, var5, var6, 1, -1);
        class107.method827(0, var6 - var4, var7 - -var4 + var4, var5 - var4, var8 - -var4 + var4);
        if (arg0) {
            class377.field5692.method357();
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([[ILya;Lta;ILta;Lta;I)V", line = 1122)
    private final void method1731(int[][] arg0, class38 arg1, class145 arg2, int arg3, class145 arg4, class145 arg5, int arg6) {
        field3955++;
        byte[][] var8 = this.field3944[arg6];
        byte[][] var9 = this.field3960[arg6];
        byte[][] var10 = this.field3968[arg6];
        if (arg3 <= 56) {
            return;
        }
        byte[][] var11 = this.field3956[arg6];
        for (int var12 = 0; var12 < this.field3965; var12++) {
            int var13 = var12 >= this.field3965 - 1 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field3948; var14++) {
                int var15 = var14 >= this.field3948 - 1 ? var14 : var14 + 1;
                if (class334.field4991 == -1 || class408.method2570(false, var12, arg6, class334.field4991, var14)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class300 var26 = var21 == 0 ? null : this.field3940.method2089(var21 - 1, (byte) 114);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class63 var27 = var22 == 0 ? null : this.field3947.method919(1, var22 - 1);
                        class300 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4554 == -1 && var26.field4566 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4555;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field3965 && this.field3948 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var36--;
                                var32--;
                            }
                            int var37 = var32 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method411(var12, var14) - arg4.method411(var13, var15);
                                var38 = arg4.method411(var13, var14) - arg4.method411(var12, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class239.field3825[var39] = -1;
                            class532.field7842[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4555 ? class231.field3744[var19] : class331.field4966[var19];
                        this.method1733(var19, var8, var9, var11, var26, var12, var20, arg1, -1, var18, var27, var14, this.field3965, this.field3948);
                        boolean var41 = var26 != null && var26.field4566 != var26.field4554;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class239.field3825[var42] >= 0 && class506.field7400[var42] != class172.field2570[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class1.method3(var18[1], class74.method644(class532.field7842[2], class532.field7842[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class1.method3(var18[3], class74.method644(class532.field7842[0], class532.field7842[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class1.method3(var18[0], class74.method644(class532.field7842[0], class532.field7842[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class1.method3(var18[2], class74.method644(class532.field7842[6], class532.field7842[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class371.field5531[var19];
                            var48 = class329.field4950[var19];
                            var47 = var27 == null ? 0 : class42.field550[var19];
                            var49 = class185.field2802[var19];
                            var46 = class58.field697[var19];
                        } else if (var17) {
                            var48 = class172.field2568[var19];
                            var49 = class405.field6006[var19];
                            var45 = var26 == null ? 0 : class238.field3816[var19];
                            var44 = class286.field4334[var19];
                            var47 = var27 == null ? 0 : class160.field2393[var19];
                            var46 = class506.field7397[var19];
                        } else {
                            var45 = var26 == null ? 0 : class475.field6864[var19];
                            var46 = class331.field4963[var19];
                            var47 = var27 == null ? 0 : class49.field628[var19];
                            var48 = class167.field2464[var19];
                            var49 = class500.field7175[var19];
                            var44 = class20.field249[var19];
                        }
                        int var50 = var45 + var47;
                        if (var50 <= 0) {
                            class229.method1621(arg6, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg2 == null ? null : new int[var53];
                            int[] var61 = arg2 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field4554;
                                var63 = arg1.method347() ? var26.field4547 : var26.field4557;
                                var64 = var26.field4558;
                                int var65 = class362.method2272(var26, 119, arg1);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 1;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 1;
                                        class534.field7847[4] = var46[var51];
                                        var68 = 6;
                                        class534.field7847[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 5;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 5;
                                        class534.field7847[4] = var46[var51];
                                        class534.field7847[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 3;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 3;
                                        class534.field7847[4] = var46[var51];
                                        var68 = 6;
                                        class534.field7847[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 7;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 7;
                                        class534.field7847[4] = var46[var51];
                                        var68 = 6;
                                        class534.field7847[5] = var48[var51];
                                    } else {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = var46[var51];
                                        class534.field7847[2] = var48[var51];
                                        var68 = 3;
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class534.field7847[var69];
                                        int var71 = var70 - var20 * 2 & 0x7;
                                        int var72 = this.field3951[var70];
                                        int var73 = this.field3950[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 128 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var75 = 128 - var73;
                                            var74 = 128 - var72;
                                        } else if (var20 == 3) {
                                            var74 = 128 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class495.field7136[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg2.method412(var76, var77) - arg4.method412(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class495.field7136[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg4.method412(var78, var79) - arg2.method412(var78, var79);
                                            } else if (arg5 != null && !class435.field6434[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg5.method412(var80, var81) - arg4.method412(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class239.field3825[var71] > var26.field4560) {
                                            if (var54 != null) {
                                                var54[var52] = class172.field2570[var71];
                                            }
                                            var59[var52] = class425.field6333[var71];
                                            var58[var52] = class509.field7456[var71];
                                            var57[var52] = class506.field7400[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg1.method347() ? var26.field4547 : var26.field4557;
                                            var59[var52] = var26.field4558;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field3957 && arg6 == 0) {
                                    class316.method2023(var12, var14, var26.field4562, var26.field4559 * 8, var26.field4551);
                                }
                                if (var19 != 12 && var26.field4554 != -1 && var26.field4563) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class371.field5531[var19];
                            } else if (var17) {
                                var51 += class238.field3816[var19];
                            } else {
                                var51 += class475.field6864[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class63 var82 = this.field3947.method919(1, var22 - 1);
                                class63 var83 = this.field3947.method919(1, var23 - 1);
                                class63 var84 = this.field3947.method919(1, var24 - 1);
                                class63 var85 = this.field3947.method919(1, var25 - 1);
                                for (int var86 = 0; var86 < var47; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 1;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 1;
                                        class534.field7847[4] = var46[var51];
                                        var88 = 6;
                                        class534.field7847[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 5;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 5;
                                        class534.field7847[4] = var46[var51];
                                        var88 = 6;
                                        class534.field7847[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 3;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 3;
                                        class534.field7847[4] = var46[var51];
                                        class534.field7847[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = 7;
                                        class534.field7847[2] = var48[var51];
                                        class534.field7847[3] = 7;
                                        class534.field7847[4] = var46[var51];
                                        var88 = 6;
                                        class534.field7847[5] = var48[var51];
                                    } else {
                                        class534.field7847[0] = var49[var51];
                                        class534.field7847[1] = var46[var51];
                                        var88 = 3;
                                        class534.field7847[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class534.field7847[var89];
                                        int var91 = var90 - var20 * 2 & 0x7;
                                        int var92 = this.field3951[var90];
                                        int var93 = this.field3950[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var95 = var93;
                                            var94 = 128 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 128 - var93;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class495.field7136[var19][var90]) {
                                            int var96 = (var12 << 7) + var95;
                                            int var97 = (var14 << 7) + var94;
                                            var60[var52] = arg2.method412(var96, var97) - arg4.method412(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class495.field7136[var19][var90]) {
                                                int var98 = (var12 << 7) + var95;
                                                int var99 = (var14 << 7) + var94;
                                                var61[var52] = arg4.method412(var98, var99) - arg2.method412(var98, var99);
                                            } else if (arg5 != null && !class435.field6434[var19][var90]) {
                                                int var100 = (var12 << 7) + var95;
                                                int var101 = (var14 << 7) + var94;
                                                var61[var52] = arg5.method412(var100, var101) - arg4.method412(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class239.field3825[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class172.field2570[var91];
                                            }
                                            var59[var52] = class425.field6333[var91];
                                            var58[var52] = class509.field7456[var91];
                                            var57[var52] = class506.field7400[var91];
                                        } else {
                                            if (var17 && class495.field7136[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg0[var12][var14];
                                                var58[var52] = var82.field774;
                                                var59[var52] = var82.field773;
                                            } else if (var95 == 0 && var94 == 128) {
                                                var57[var52] = arg0[var12][var15];
                                                var58[var52] = var83.field774;
                                                var59[var52] = var83.field773;
                                            } else if (var95 == 128 && var94 == 128) {
                                                var57[var52] = arg0[var13][var15];
                                                var58[var52] = var84.field774;
                                                var59[var52] = var84.field773;
                                            } else if (var95 == 128 && var94 == 0) {
                                                var57[var52] = arg0[var13][var14];
                                                var58[var52] = var85.field774;
                                                var59[var52] = var85.field773;
                                            } else {
                                                if (var95 >= 64) {
                                                    if (var94 >= 64) {
                                                        var58[var52] = var84.field774;
                                                        var59[var52] = var84.field773;
                                                    } else {
                                                        var58[var52] = var85.field774;
                                                        var59[var52] = var85.field773;
                                                    }
                                                } else if (var94 < 64) {
                                                    var58[var52] = var82.field774;
                                                    var59[var52] = var82.field773;
                                                } else {
                                                    var58[var52] = var83.field774;
                                                    var59[var52] = var83.field773;
                                                }
                                                int var102 = class8.method61(var95 << 7 >> 7, arg0[var13][var14], arg0[var12][var14], 122);
                                                int var103 = class8.method61(var95 << 7 >> 7, arg0[var13][var15], arg0[var12][var15], 127);
                                                var57[var52] = class8.method61(var94 << 7 >> 7, var103, var102, 108);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field766) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg4.method411(var12, var14);
                            int var105 = arg4.method411(var13, var14);
                            int var106 = arg4.method411(var13, var15);
                            int var107 = arg4.method411(var12, var15);
                            if (arg6 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field4556) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field3969[arg6][var12][var14] = (byte) class264.method1763(this.field3969[arg6][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field3957) {
                                var109 = class102.method811(var12, var14);
                                var110 = class500.method2959(var12, var14);
                                var111 = class424.method2651(var12, var14);
                            }
                            arg4.method414(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class229.method1621(arg6, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIII)V", line = 1985)
    public final void method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < (arg1 + arg3); var7++) {
            for (int var10 = arg2; var10 < (arg0 + arg2); var10++) {
                if (var10 >= 0 && this.field3965 > var10 && var7 >= 0 && var7 < this.field3948) {
                    this.field3946[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field3946[arg5 - 1][var10][var7] - 240;
                }
            }
        }
        field3952++;
        if (arg2 > 0 && this.field3965 > arg2) {
            for (int var8 = arg3 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && this.field3948 > var8) {
                    this.field3946[arg5][arg2][var8] = this.field3946[arg5][arg2 - 1][var8];
                }
            }
        }
        if (arg4 < 111) {
            this.field3940 = null;
        }
        if (arg3 > 0 && arg3 < this.field3948) {
            for (int var9 = arg2 + 1; var9 < (arg0 + arg2); var9++) {
                if (var9 >= 0 && var9 < this.field3965) {
                    this.field3946[arg5][var9][arg3] = this.field3946[arg5][var9][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || arg2 >= this.field3965 || arg3 >= this.field3948) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 > 0 && this.field3946[arg5][arg2 - 1][arg3] != 0) {
                this.field3946[arg5][arg2][arg3] = this.field3946[arg5][arg2 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field3946[arg5][arg2][arg3 - 1] != 0) {
                this.field3946[arg5][arg2][arg3] = this.field3946[arg5][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field3946[arg5][arg2 - 1][arg3 - 1] != 0) {
                this.field3946[arg5][arg2][arg3] = this.field3946[arg5][arg2 - 1][arg3 - 1];
                return;
            }
        } else if (arg2 <= 0 || this.field3946[arg5 - 1][arg2 - 1][arg3] == this.field3946[arg5][arg2 - 1][arg3]) {
            if (arg3 > 0 && this.field3946[arg5 - 1][arg2][arg3 - 1] != this.field3946[arg5][arg2][arg3 - 1]) {
                this.field3946[arg5][arg2][arg3] = this.field3946[arg5][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && this.field3946[arg5][arg2 - 1][arg3 - 1] != this.field3946[arg5 - 1][arg2 - 1][arg3 - 1]) {
                this.field3946[arg5][arg2][arg3] = this.field3946[arg5][arg2 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            this.field3946[arg5][arg2][arg3] = this.field3946[arg5][arg2 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I[[B[[B[[BLst;IILya;I[ZLsd;III)V", line = 2083)
    private final void method1733(int arg0, byte[][] arg1, byte[][] arg2, byte[][] arg3, class300 arg4, int arg5, int arg6, class38 arg7, int arg8, boolean[] arg9, class63 arg10, int arg11, int arg12, int arg13) {
        field3945++;
        boolean[] var15 = arg4 != null && arg4.field4555 ? class231.field3744[arg0] : class331.field4966[arg0];
        if (~arg11 < arg8) {
            if (arg5 > 0) {
                int var16 = arg3[arg5 - 1][arg11 - 1] & 0xFF;
                if (var16 > 0) {
                    class300 var17 = this.field3940.method2089(var16 - 1, (byte) 101);
                    if (var17.field4554 != -1 && var17.field4555) {
                        byte var18 = arg1[arg5 - 1][arg11 - 1];
                        int var19 = arg2[arg5 - 1][arg11 - 1] * 2 + 4 & 0x7;
                        int var20 = class362.method2272(var17, 80, arg7);
                        if (class495.field7136[var18][var19]) {
                            class506.field7400[0] = var17.field4554;
                            class172.field2570[0] = var20;
                            class509.field7456[0] = arg7.method347() ? var17.field4547 : var17.field4557;
                            class425.field6333[0] = var17.field4558;
                            class239.field3825[0] = var17.field4560;
                            class532.field7842[0] = 256;
                        }
                    }
                }
            }
            if (arg12 - 1 > arg5) {
                int var21 = arg3[arg5 + 1][arg11 - 1] & 0xFF;
                if (var21 > 0) {
                    class300 var22 = this.field3940.method2089(var21 - 1, (byte) 82);
                    if (var22.field4554 != -1 && var22.field4555) {
                        byte var23 = arg1[arg5 + 1][arg11 - 1];
                        int var24 = arg2[arg5 + 1][arg11 - 1] * 2 + 6 & 0x7;
                        int var25 = class362.method2272(var22, arg8 + 13, arg7);
                        if (class495.field7136[var23][var24]) {
                            class506.field7400[2] = var22.field4554;
                            class172.field2570[2] = var25;
                            class509.field7456[2] = arg7.method347() ? var22.field4547 : var22.field4557;
                            class425.field6333[2] = var22.field4558;
                            class239.field3825[2] = var22.field4560;
                            class532.field7842[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg11 < arg13 - 1) {
            if (arg5 > 0) {
                int var26 = arg3[arg5 - 1][arg11 + 1] & 0xFF;
                if (var26 > 0) {
                    class300 var27 = this.field3940.method2089(var26 - 1, (byte) 31);
                    if (var27.field4554 != -1 && var27.field4555) {
                        byte var28 = arg1[arg5 - 1][arg11 + 1];
                        int var29 = arg2[arg5 - 1][arg11 + 1] * 2 + 2 & 0x7;
                        int var30 = class362.method2272(var27, -117, arg7);
                        if (class495.field7136[var28][var29]) {
                            class506.field7400[6] = var27.field4554;
                            class172.field2570[6] = var30;
                            class509.field7456[6] = arg7.method347() ? var27.field4547 : var27.field4557;
                            class425.field6333[6] = var27.field4558;
                            class239.field3825[6] = var27.field4560;
                            class532.field7842[6] = 64;
                        }
                    }
                }
            }
            if ((arg12 - 1) > arg5) {
                int var31 = arg3[arg5 + 1][arg11 + 1] & 0xFF;
                if (var31 > 0) {
                    class300 var32 = this.field3940.method2089(var31 - 1, (byte) 122);
                    if (var32.field4554 != -1 && var32.field4555) {
                        byte var33 = arg1[arg5 + 1][arg11 + 1];
                        int var34 = arg2[arg5 + 1][arg11 + 1] * 2 & 0x7;
                        int var35 = class362.method2272(var32, -116, arg7);
                        if (class495.field7136[var33][var34]) {
                            class506.field7400[4] = var32.field4554;
                            class172.field2570[4] = var35;
                            class509.field7456[4] = arg7.method347() ? var32.field4547 : var32.field4557;
                            class425.field6333[4] = var32.field4558;
                            class239.field3825[4] = var32.field4560;
                            class532.field7842[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var36 = arg3[arg5][arg11 - 1] & 0xFF;
            if (var36 > 0) {
                class300 var37 = this.field3940.method2089(var36 - 1, (byte) 47);
                if (var37.field4554 != -1) {
                    byte var38 = arg1[arg5][arg11 - 1];
                    byte var39 = arg2[arg5][arg11 - 1];
                    if (var37.field4555) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class362.method2272(var37, arg8 - 116, arg7);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class495.field7136[var38][var41] && class239.field3825[var40] <= var37.field4560) {
                                class506.field7400[var40] = var37.field4554;
                                class172.field2570[var40] = var42;
                                class509.field7456[var40] = arg7.method347() ? var37.field4547 : var37.field4557;
                                class425.field6333[var40] = var37.field4558;
                                if (class239.field3825[var40] == var37.field4560) {
                                    class532.field7842[var40] = class264.method1763(class532.field7842[var40], 32);
                                } else {
                                    class532.field7842[var40] = 32;
                                }
                                class239.field3825[var40] = var37.field4560;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[-(-arg6) & 0x3]) {
                            arg9[0] = class231.field3744[var38][class74.method644(3, var39 + 2)];
                        }
                    } else if (!var15[-(-arg6) & 0x3]) {
                        arg9[0] = class331.field4966[var38][class74.method644(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg13 - 1 > arg11) {
            int var44 = arg3[arg5][arg11 + 1] & 0xFF;
            if (var44 > 0) {
                class300 var45 = this.field3940.method2089(var44 - 1, (byte) 83);
                if (var45.field4554 != -1) {
                    byte var46 = arg1[arg5][arg11 + 1];
                    byte var47 = arg2[arg5][arg11 + 1];
                    if (var45.field4555) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class362.method2272(var45, -118, arg7);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class495.field7136[var46][var49] && var45.field4560 >= class239.field3825[var48]) {
                                class506.field7400[var48] = var45.field4554;
                                class172.field2570[var48] = var50;
                                class509.field7456[var48] = arg7.method347() ? var45.field4547 : var45.field4557;
                                class425.field6333[var48] = var45.field4558;
                                if (class239.field3825[var48] == var45.field4560) {
                                    class532.field7842[var48] = class264.method1763(class532.field7842[var48], 16);
                                } else {
                                    class532.field7842[var48] = 16;
                                }
                                class239.field3825[var48] = var45.field4560;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg6 + 2 & 0x3]) {
                            arg9[2] = class231.field3744[var46][class74.method644(var47, 3)];
                        }
                    } else if (!var15[arg6 + 2 & 0x3]) {
                        arg9[2] = class331.field4966[var46][class74.method644(3, var47)];
                    }
                }
            }
        }
        if (arg5 > 0) {
            int var52 = arg3[arg5 - 1][arg11] & 0xFF;
            if (var52 > 0) {
                class300 var53 = this.field3940.method2089(var52 - 1, (byte) 85);
                if (var53.field4554 != -1) {
                    byte var54 = arg1[arg5 - 1][arg11];
                    byte var55 = arg2[arg5 - 1][arg11];
                    if (var53.field4555) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class362.method2272(var53, arg8 ^ 0x77, arg7);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class495.field7136[var54][var57] && var53.field4560 >= class239.field3825[var56]) {
                                class506.field7400[var56] = var53.field4554;
                                class172.field2570[var56] = var58;
                                class509.field7456[var56] = arg7.method347() ? var53.field4547 : var53.field4557;
                                class425.field6333[var56] = var53.field4558;
                                if (class239.field3825[var56] == var53.field4560) {
                                    class532.field7842[var56] = class264.method1763(class532.field7842[var56], 8);
                                } else {
                                    class532.field7842[var56] = 8;
                                }
                                class239.field3825[var56] = var53.field4560;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg6 + 3 & 0x3]) {
                            arg9[3] = class231.field3744[var54][class74.method644(var55 + 1, 3)];
                        }
                    } else if (!var15[arg6 + 3 & 0x3]) {
                        arg9[3] = class331.field4966[var54][class74.method644(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg5 < (arg12 - 1)) {
            int var60 = arg3[arg5 + 1][arg11] & 0xFF;
            if (var60 > 0) {
                class300 var61 = this.field3940.method2089(var60 - 1, (byte) 110);
                if (var61.field4554 != -1) {
                    byte var62 = arg1[arg5 + 1][arg11];
                    byte var63 = arg2[arg5 + 1][arg11];
                    if (var61.field4555) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class362.method2272(var61, 59, arg7);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class495.field7136[var62][var65] && class239.field3825[var64] <= var61.field4560) {
                                class506.field7400[var64] = var61.field4554;
                                class172.field2570[var64] = var66;
                                class509.field7456[var64] = arg7.method347() ? var61.field4547 : var61.field4557;
                                class425.field6333[var64] = var61.field4558;
                                if (class239.field3825[var64] == var61.field4560) {
                                    class532.field7842[var64] = class264.method1763(class532.field7842[var64], 4);
                                } else {
                                    class532.field7842[var64] = 4;
                                }
                                class239.field3825[var64] = var61.field4560;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg6 + 1 & 0x3]) {
                            arg9[1] = class231.field3744[var62][class74.method644(3, var63 + 3)];
                        }
                    } else if (!var15[arg6 + 1 & 0x3]) {
                        arg9[1] = class331.field4966[var62][class74.method644(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg4 == null) {
            return;
        }
        int var68 = class362.method2272(arg4, -125, arg7);
        if (!arg4.field4555) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg6 * 2) & 0x7;
            if (class495.field7136[arg0][var69] && class239.field3825[var70] <= arg4.field4560) {
                class506.field7400[var70] = arg4.field4554;
                class172.field2570[var70] = var68;
                class509.field7456[var70] = arg7.method347() ? arg4.field4547 : arg4.field4557;
                class425.field6333[var70] = arg4.field4558;
                if (class239.field3825[var70] == arg4.field4560) {
                    class532.field7842[var70] = class264.method1763(class532.field7842[var70], 2);
                } else {
                    class532.field7842[var70] = 2;
                }
                class239.field3825[var70] = arg4.field4560;
            }
        }
        return;
    }
}
