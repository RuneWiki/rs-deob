import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class303 extends class128 {

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    private int field4710 = 6;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4707 = "glow3:";

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IB)V", line = 5)
    public static final void method2125(int arg0, byte arg1) {
        field4706++;
        if (!class285.method2039(arg0, arg1 - 32696)) {
            return;
        }
        class263[] var2 = class175.field2535[arg0];
        if (arg1 != 36) {
            method2127(-116, -100, 102, (class263) null, 60);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class263 var4 = var2[var3];
            if (var4 != null) {
                var4.field4153 = 0;
                var4.field4042 = 1;
                var4.field4050 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lhd;", line = 39)
    public static final class129 method2126(int arg0, int arg1) {
        field4714++;
        class129 var2 = (class129) class172.field2479.method1239((byte) -76, (long) arg1);
        if (arg0 < 1) {
            field4707 = (String) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field2111.method1199(28815, arg1, 3);
        class129 var4 = new class129();
        if (var3 != null) {
            var4.method865(new class107(var3), false);
        }
        class172.field2479.method1243(var4, (long) arg1, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(BI)[I", line = 64)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 <= 100) {
            field4711 = 62;
        }
        field4713++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -85, 0, arg1);
            int[] var5 = this.method851((byte) -96, 1, arg1);
            int var6 = this.field4710;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class10.field141; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class10.field141; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class10.field141; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class10.field141; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class10.field141; var10++) {
                    var3[var10] = 4096 - ((4096 - var5[var10]) * (4096 - var4[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class10.field141; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 < 2048 ? var4[var11] * var12 >> 11 : 4096 - ((4096 - var4[var11]) * (4096 - var12) >> 11);
                }
            } else if (var6 == 7) {
                for (int var13 = 0; var13 < class10.field141; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 4096 ? 4096 : (var5[var13] << 12) / (4096 - var14);
                }
            } else if (var6 == 8) {
                for (int var15 = 0; var15 < class10.field141; var15++) {
                    int var16 = var4[var15];
                    var3[var15] = var16 == 0 ? 0 : 4096 - ((4096 - var5[var15] << 12) / var16);
                }
            } else if (var6 == 9) {
                for (int var26 = 0; var26 < class10.field141; var26++) {
                    int var27 = var5[var26];
                    int var28 = var4[var26];
                    var3[var26] = var28 >= var27 ? var27 : var28;
                }
            } else if (var6 == 10) {
                for (int var23 = 0; var23 < class10.field141; var23++) {
                    int var24 = var4[var23];
                    int var25 = var5[var23];
                    var3[var23] = var24 <= var25 ? var25 : var24;
                }
            } else if (var6 == 11) {
                for (int var17 = 0; var17 < class10.field141; var17++) {
                    int var18 = var5[var17];
                    int var19 = var4[var17];
                    var3[var17] = var19 <= var18 ? var18 - var19 : -var18 + var19;
                }
            } else if (var6 == 12) {
                for (int var20 = 0; var20 < class10.field141; var20++) {
                    int var21 = var5[var20];
                    int var22 = var4[var20];
                    var3[var20] = var21 + var22 - (var21 * var22 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lp;II)V", line = 308)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field4709++;
        if (arg2 >= -85) {
            field4707 = (String) null;
        }
        if (arg1 == 0) {
            this.field4710 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field1753 = arg0.method661(-1) == 1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 344)
    public class303() {
        super(2, false);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIILcc;I)V", line = 349)
    public static final void method2127(int arg0, int arg1, int arg2, class263 arg3, int arg4) {
        field4712++;
        if (class250.field3787) {
            class306.method2149(arg2, arg1, arg3.field3989 + arg2, arg3.field4096 + arg1);
        }
        if (arg0 != 256) {
            method2125(54, (byte) -94);
        }
        if (class68.field894 >= 3) {
            if (class250.field3787) {
                class91 var5 = arg3.method1892(19709, false);
                if (var5 != null) {
                    var5.method531(arg2, arg1);
                }
            } else {
                class144.method957(arg2, arg1, 0, arg3.field4015, arg3.field4101);
            }
        } else if (class250.field3787) {
            ((class202) class188.field2711).method1383(arg2, arg1, arg3.field3989, arg3.field4096, class188.field2711.field1136 / 2, class188.field2711.field1144 / 2, (int) class280.field4344, 256, (class202) arg3.method1892(19709, false));
        } else {
            ((class189) class188.field2711).method1311(arg2, arg1, arg3.field3989, arg3.field4096, class188.field2711.field1136 / 2, class188.field2711.field1144 / 2, (int) class280.field4344, 256, arg3.field4015, arg3.field4101);
        }
        class211.field2985[arg4] = true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I", line = 390)
    public final int[][] method102(int arg0, int arg1) {
        field4708++;
        if (arg1 != 5110) {
            field4707 = (String) null;
        }
        int[][] var3 = this.field1755.method875(38, arg0);
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, arg0, 0);
            int[][] var5 = this.method855(arg1 ^ 0xFFFFE014, arg0, 1);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field4710;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class10.field141; var16++) {
                    var8[var16] = var9[var16] + var11[var16];
                    var7[var16] = var10[var16] + var14[var16];
                    var6[var16] = var12[var16] + var13[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class10.field141; var17++) {
                    var8[var17] = var9[var17] - var11[var17];
                    var7[var17] = var10[var17] - var14[var17];
                    var6[var17] = var12[var17] - var13[var17];
                }
            } else if (var15 == 3) {
                for (int var18 = 0; var18 < class10.field141; var18++) {
                    var8[var18] = var9[var18] * var11[var18] >> 12;
                    var7[var18] = var10[var18] * var14[var18] >> 12;
                    var6[var18] = var12[var18] * var13[var18] >> 12;
                }
            } else if (var15 == 4) {
                for (int var19 = 0; var19 < class10.field141; var19++) {
                    int var20 = var13[var19];
                    int var21 = var11[var19];
                    int var22 = var14[var19];
                    var8[var19] = var21 == 0 ? 4096 : (var9[var19] << 12) / var21;
                    var7[var19] = var22 == 0 ? 4096 : (var10[var19] << 12) / var22;
                    var6[var19] = var20 == 0 ? 4096 : (var12[var19] << 12) / var20;
                }
            } else if (var15 == 5) {
                for (int var23 = 0; var23 < class10.field141; var23++) {
                    var8[var23] = 4096 - ((4096 - var9[var23]) * (4096 - var11[var23]) >> 12);
                    var7[var23] = 4096 - ((4096 - var10[var23]) * (4096 - var14[var23]) >> 12);
                    var6[var23] = 4096 - ((4096 - var12[var23]) * (4096 - var13[var23]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var24 = 0; var24 < class10.field141; var24++) {
                    int var25 = var14[var24];
                    int var26 = var13[var24];
                    int var27 = var11[var24];
                    var8[var24] = var27 >= 2048 ? 4096 - ((4096 - var27) * (4096 - var9[var24]) >> 11) : var9[var24] * var27 >> 11;
                    var7[var24] = var25 < 2048 ? var10[var24] * var25 >> 11 : 4096 - ((4096 - var10[var24]) * (4096 - var25) >> 11);
                    var6[var24] = var26 >= 2048 ? 4096 - ((4096 - var12[var24]) * (4096 - var26) >> 11) : var12[var24] * var26 >> 11;
                }
            } else if (var15 == 7) {
                for (int var60 = 0; var60 < class10.field141; var60++) {
                    int var61 = var9[var60];
                    int var62 = var10[var60];
                    int var63 = var12[var60];
                    var8[var60] = var61 == 4096 ? 4096 : (var11[var60] << 12) / (4096 - var61);
                    var7[var60] = var62 == 4096 ? 4096 : (var14[var60] << 12) / (4096 - var62);
                    var6[var60] = var63 == 4096 ? 4096 : (var13[var60] << 12) / (4096 - var63);
                }
            } else if (var15 == 8) {
                for (int var56 = 0; var56 < class10.field141; var56++) {
                    int var57 = var12[var56];
                    int var58 = var9[var56];
                    int var59 = var10[var56];
                    var8[var56] = var58 == 0 ? 0 : 4096 - ((4096 - var11[var56] << 12) / var58);
                    var7[var56] = var59 == 0 ? 0 : 4096 - ((4096 - var14[var56] << 12) / var59);
                    var6[var56] = var57 == 0 ? 0 : 4096 - ((4096 - var13[var56] << 12) / var57);
                }
            } else if (var15 == 9) {
                for (int var49 = 0; var49 < class10.field141; var49++) {
                    int var50 = var13[var49];
                    int var51 = var11[var49];
                    int var52 = var12[var49];
                    int var53 = var14[var49];
                    int var54 = var10[var49];
                    int var55 = var9[var49];
                    var8[var49] = var51 > var55 ? var55 : var51;
                    var7[var49] = var53 <= var54 ? var53 : var54;
                    var6[var49] = var50 > var52 ? var52 : var50;
                }
            } else if (var15 == 10) {
                for (int var28 = 0; var28 < class10.field141; var28++) {
                    int var29 = var11[var28];
                    int var30 = var13[var28];
                    int var31 = var12[var28];
                    int var32 = var9[var28];
                    int var33 = var10[var28];
                    int var34 = var14[var28];
                    var8[var28] = var29 >= var32 ? var29 : var32;
                    var7[var28] = var33 > var34 ? var33 : var34;
                    var6[var28] = var30 < var31 ? var31 : var30;
                }
            } else if (var15 == 11) {
                for (int var42 = 0; var42 < class10.field141; var42++) {
                    int var43 = var12[var42];
                    int var44 = var10[var42];
                    int var45 = var9[var42];
                    int var46 = var11[var42];
                    int var47 = var13[var42];
                    int var48 = var14[var42];
                    var8[var42] = var46 < var45 ? var45 - var46 : -var45 + var46;
                    var7[var42] = var48 >= var44 ? var48 - var44 : var44 - var48;
                    var6[var42] = var43 > var47 ? var43 - var47 : -var43 + var47;
                }
            } else if (var15 == 12) {
                for (int var35 = 0; var35 < class10.field141; var35++) {
                    int var36 = var10[var35];
                    int var37 = var11[var35];
                    int var38 = var13[var35];
                    int var39 = var9[var35];
                    int var40 = var14[var35];
                    int var41 = var12[var35];
                    var8[var35] = var39 + var37 - (var37 * var39 >> 11);
                    var7[var35] = var40 + var36 - (var36 * var40 >> 11);
                    var6[var35] = var38 + var41 - (var38 * var41 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)V", line = 706)
    public static void method2128(boolean arg0) {
        if (arg0) {
            field4711 = 23;
        }
        field4707 = null;
    }
}
