import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class214 extends class71 {

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public int field3757 = 4;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public int field3761 = 0;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "Z")
    public boolean field3770 = true;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public int field3768 = 4;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public int field3771 = 1638;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public int field3767 = 4;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "[B")
    private byte[] field3777 = new byte[512];

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Lok;")
    public static class149 field3765;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "Lqc;")
    public static class4 field3759;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "[S")
    private short[] field3763;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "[S")
    private short[] field3775;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "[[[B")
    public static byte[][][] field3774;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)I", line = 8)
    private final int method1569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3762++;
        int var8 = arg1 - 4096;
        int var9 = arg0 >> 12;
        int var10 = var9 + 1;
        int var11 = arg0 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = this.field3777[var12 + arg3] & 0x3;
        if (var10 >= arg4) {
            var10 = 0;
        }
        int var14 = var10 & 0xFF;
        int var15 = class88.field1680[var11];
        int var16 = var11 - 4096;
        int var17;
        if (var13 > 1) {
            var17 = var13 == 2 ? var11 - arg1 : -arg1 + -var11;
        } else {
            var17 = var13 == 0 ? arg1 + var11 : -var11 + arg1;
        }
        int var18 = this.field3777[arg3 + var14] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var16 - arg1 : -arg1 + -var16;
        } else {
            var19 = var18 == 0 ? arg1 + var16 : -var16 + arg1;
        }
        int var20 = this.field3777[arg5 + var12] & 0x3;
        int var21 = var17 + ((var19 - var17) * var15 >> 12);
        if (arg6 != -10649) {
            method1570(75, (byte) -101);
        }
        int var22;
        if (var20 > 1) {
            var22 = var20 == 2 ? var11 - var8 : -var11 - var8;
        } else {
            var22 = var20 == 0 ? var11 + var8 : -var11 + var8;
        }
        int var23 = this.field3777[arg5 + var14] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var16 : -var16 + var8;
        } else {
            var24 = var23 == 2 ? var16 - var8 : -var16 - var8;
        }
        int var25 = var22 + ((var24 - var22) * var15 >> 12);
        return ((var25 - var21) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(IB)V", line = 81)
    public static final void method1570(int arg0, byte arg1) {
        field3766++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class143.field2587 += arg0 * 128;
        if (class143.field2587 > class26.field625.length) {
            class143.field2587 -= class26.field625.length;
            int var3 = (int) (Math.random() * 12.0D);
            class246.method1763(class78.field1502[var3], (byte) -42);
        }
        int var4 = (var2 - arg0) * 128;
        int var5 = arg0 * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = class59.field1238[var5 + var6] - class26.field625[class143.field2587 + var6 & class26.field625.length + -1] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class59.field1238[var6++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class59.field1238[var11 + var10] = 255;
                } else {
                    class59.field1238[var10 + var11] = 0;
                }
            }
        }
        if (arg1 != 4) {
            field3758 = -9;
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class236.field4116[var13] = class236.field4116[var13 + arg0];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class236.field4116[var14] = (int) (Math.sin((double) class153.field2786 / 14.0D) * 16.0D + Math.sin((double) class153.field2786 / 15.0D) * 14.0D + Math.sin((double) class153.field2786 / 16.0D) * 12.0D);
            class153.field2786++;
        }
        class202.field3600 += arg0;
        int var15 = ((class8.field279 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class202.field3600; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class59.field1238[(var18 << 7) + var17] = 192;
        }
        class202.field3600 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class59.field1238[var21 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class59.field1238[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class85.field1606[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class85.field1606[var23 + var26 + (var15 * 128)];
                }
                if ((var25 - (var15 + 1)) >= 0) {
                    var24 -= class85.field1606[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class59.field1238[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 256)
    public class214() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II[I)V", line = 266)
    public final void method1571(int arg0, int arg1, int[] arg2) {
        field3760++;
        int var4 = class200.field3574[arg0] * this.field3768;
        if (arg1 != -16421) {
            return;
        }
        if (this.field3767 == 1) {
            short var38 = this.field3775[0];
            int var39 = this.field3763[0] << 12;
            int var40 = this.field3757 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = var41 >> 12;
            int var43 = this.field3768 * var39 >> 12;
            int var44 = var42 + 1;
            if (var44 >= var43) {
                var44 = 0;
            }
            int var45 = this.field3777[var42 & 0xFF] & 0xFF;
            int var46 = var41 & 0xFFF;
            int var47 = this.field3777[var44 & 0xFF] & 0xFF;
            int var48 = class88.field1680[var46];
            if (this.field3770) {
                for (int var52 = 0; var52 < class215.field3787; var52++) {
                    int var53 = class133.field2424[var52] * this.field3757;
                    int var54 = this.method1569(var39 * var53 >> 12, var46, var48, var45, var40, var47, -10649);
                    int var55 = var38 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class215.field3787; var49++) {
                    int var50 = class133.field2424[var49] * this.field3757;
                    int var51 = this.method1569(var39 * var50 >> 12, var46, var48, var45, var40, var47, -10649);
                    arg2[var49] = var38 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field3775[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field3763[0] << 12;
            int var7 = this.field3757 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = var8 >> 12;
            int var10 = this.field3768 * var6 >> 12;
            int var11 = var8 & 0xFFF;
            int var12 = class88.field1680[var11];
            int var13 = this.field3777[var9 & 0xFF] & 0xFF;
            int var14 = var9 + 1;
            if (var10 <= var14) {
                var14 = 0;
            }
            int var15 = this.field3777[var14 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class215.field3787; var16++) {
                int var17 = class133.field2424[var16] * this.field3757;
                int var18 = this.method1569(var6 * var17 >> 12, var11, var12, var13, var7, var15, -10649);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field3767; var19++) {
            short var20 = this.field3775[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field3763[var19] << 12;
                int var22 = this.field3768 * var21 >> 12;
                int var23 = this.field3757 * var21 >> 12;
                int var24 = var4 * var21 >> 12;
                int var25 = var24 >> 12;
                int var26 = var24 & 0xFFF;
                int var27 = class88.field1680[var26];
                int var28 = var25 + 1;
                if (var22 <= var28) {
                    var28 = 0;
                }
                int var29 = this.field3777[var28 & 0xFF] & 0xFF;
                int var30 = this.field3777[var25 & 0xFF] & 0xFF;
                if (this.field3770 && (this.field3767 - 1) == var19) {
                    for (int var31 = 0; var31 < class215.field3787; var31++) {
                        int var32 = class133.field2424[var31] * this.field3757;
                        int var33 = this.method1569(var21 * var32 >> 12, var26, var27, var30, var23, var29, -10649);
                        int var34 = (var20 * var33 >> 12) + arg2[var31];
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class215.field3787; var35++) {
                        int var36 = class133.field2424[var35] * this.field3757;
                        int var37 = this.method1569(var21 * var36 >> 12, var26, var27, var30, var23, var29, -10649);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLvh;)V", line = 444)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field3779++;
        if (!arg1) {
            this.method1571(25, 107, (int[]) null);
        }
        if (arg0 == 0) {
            this.field3770 = arg2.method483(-116) == 1;
        } else if (arg0 == 1) {
            this.field3767 = arg2.method483(-117);
        } else if (arg0 == 2) {
            this.field3771 = arg2.method495((byte) -108);
            if (this.field3771 < 0) {
                this.field3775 = new short[this.field3767];
                for (int var5 = 0; var5 < this.field3767; var5++) {
                    this.field3775[var5] = (short) arg2.method495((byte) 96);
                }
            }
        } else if (arg0 == 3) {
            this.field3757 = this.field3768 = arg2.method483(-117);
        } else if (arg0 == 4) {
            this.field3761 = arg2.method483(-113);
        } else if (arg0 == 5) {
            this.field3757 = arg2.method483(-103);
        } else if (arg0 == 6) {
            this.field3768 = arg2.method483(-114);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([Lgf;IZIII)V", line = 541)
    public static final void method1572(class8[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 < arg0.length; var6++) {
            class8 var7 = arg0[var6];
            if (var7 != null && var7.field324 == arg5) {
                class109.method899(arg3, var7, arg4, arg2, 0);
                class117.method940(arg3, var7, arg4, -99);
                if (var7.field168 - var7.field220 < var7.field212) {
                    var7.field212 = var7.field168 - var7.field220;
                }
                if (var7.field267 - var7.field297 < var7.field243) {
                    var7.field243 = var7.field267 - var7.field297;
                }
                if (var7.field212 < 0) {
                    var7.field212 = 0;
                }
                if (var7.field243 < 0) {
                    var7.field243 = 0;
                }
                if (var7.field201 == 0) {
                    class50.method424(var7, arg2, -1);
                }
            }
        }
        field3778++;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 591)
    public final void method627(int arg0) {
        this.field3777 = class140.method1080(this.field3761, (byte) -121);
        field3773++;
        this.method1574(true);
        for (int var2 = this.field3767 - 1; var2 >= 1; var2--) {
            short var3 = this.field3775[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3767--;
        }
        if (arg0 != 7) {
            this.method1571(-23, -61, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ln;IIIIIIZ)V", line = 623)
    public static final void method1573(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field5026.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field5026[var9] - class306.field5430;
            int var11 = arg0.field5021[var9] - class318.field5581;
            int var12 = arg0.field5017[var9] - class233.field4083;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field5015 != null) {
                class281.field5031[var9] = var13;
                class281.field5018[var9] = var16;
                class281.field5027[var9] = var17;
            }
            class281.field5010[var9] = (var13 << 9) / var17 + class27.field643;
            class281.field5029[var9] = (var16 << 9) / var17 + class27.field655;
        }
        class27.field646 = 0;
        int var19 = arg0.field5022.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field5022[var20];
            int var22 = arg0.field5011[var20];
            int var23 = arg0.field5020[var20];
            int var24 = class281.field5010[var21];
            int var25 = class281.field5010[var22];
            int var26 = class281.field5010[var23];
            int var27 = class281.field5029[var21];
            int var28 = class281.field5029[var22];
            int var29 = class281.field5029[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class322.field5625 && class310.method2203(class27.field643 + class26.field635, class27.field655 + class192.field3472, var27, var28, var29, var24, var25, var26)) {
                    class289.field5146 = arg5;
                    class276.field4889 = arg6;
                }
                if (!class97.field1824 && !arg7) {
                    class27.field651 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class27.field657 || var25 > class27.field657 || var26 > class27.field657) {
                        class27.field651 = true;
                    }
                    if (arg0.field5015 == null || arg0.field5015[var20] == -1) {
                        if (arg0.field5023[var20] != 12345678) {
                            class27.method235(var27, var28, var29, var24, var25, var26, arg0.field5023[var20], arg0.field5013[var20], arg0.field5025[var20]);
                        }
                    } else if (!class198.field3536) {
                        int var30 = class27.field656.method316(false, arg0.field5015[var20]);
                        class27.method235(var27, var28, var29, var24, var25, var26, class37.method331(var30, arg0.field5023[var20]), class37.method331(var30, arg0.field5013[var20]), class37.method331(var30, arg0.field5025[var20]));
                    } else if (arg0.field5016) {
                        class27.method247(var27, var28, var29, var24, var25, var26, arg0.field5023[var20], arg0.field5013[var20], arg0.field5025[var20], class281.field5031[0], class281.field5031[1], class281.field5031[3], class281.field5018[0], class281.field5018[1], class281.field5018[3], class281.field5027[0], class281.field5027[1], class281.field5027[3], arg0.field5015[var20]);
                    } else {
                        class27.method247(var27, var28, var29, var24, var25, var26, arg0.field5023[var20], arg0.field5013[var20], arg0.field5025[var20], class281.field5031[var21], class281.field5031[var22], class281.field5031[var23], class281.field5018[var21], class281.field5018[var22], class281.field5018[var23], class281.field5027[var21], class281.field5027[var22], class281.field5027[var23], arg0.field5015[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V", line = 748)
    private final void method1574(boolean arg0) {
        if (!arg0) {
            this.method1571(-128, 81, (int[]) null);
        }
        if (this.field3771 > 0) {
            this.field3775 = new short[this.field3767];
            this.field3763 = new short[this.field3767];
            for (int var3 = 0; var3 < this.field3767; var3++) {
                this.field3775[var3] = (short) ((int) (Math.pow((double) ((float) this.field3771 / 4096.0F), (double) var3) * 4096.0D));
                this.field3763[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3775 != null && this.field3775.length == this.field3767) {
            this.field3763 = new short[this.field3767];
            for (int var2 = 0; var2 < this.field3767; var2++) {
                this.field3763[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field3776++;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(Z)V", line = 792)
    public static void method1575(boolean arg0) {
        field3759 = null;
        field3774 = (byte[][][]) null;
        field3765 = null;
        if (!arg0) {
            method1572((class8[]) null, -99, true, -36, -7, -38);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IB)[I", line = 804)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            return (int[]) null;
        }
        field3769++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            this.method1571(arg0, -16421, var3);
        }
        return var3;
    }
}
