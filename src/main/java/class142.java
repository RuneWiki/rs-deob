import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class142 extends class170 {

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    private int field2428 = 6;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "Lmh;")
    public static class128 field2434 = class22.method156(126, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "Lmh;")
    public static class128 field2435 = class22.method156(123, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            field2435 = (class128) null;
        }
        field2429++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            int[] var5 = this.method1142((byte) 44, 1, arg1);
            int var6 = this.field2428;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class185.field3225; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var7 = 0; var7 < class185.field3225; var7++) {
                    var3[var7] = var4[var7] - var5[var7];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class185.field3225; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class185.field3225; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class185.field3225; var10++) {
                    var3[var10] = 4096 - ((4096 - var5[var10]) * (4096 - var4[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class185.field3225; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 >= 2048 ? 4096 - ((4096 - var4[var11]) * (4096 - var12) >> 11) : var4[var11] * var12 >> 11;
                }
            } else if (var6 == 7) {
                for (int var13 = 0; var13 < class185.field3225; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 4096 ? 4096 : (var5[var13] << 12) / (4096 - var14);
                }
            } else if (var6 == 8) {
                for (int var27 = 0; var27 < class185.field3225; var27++) {
                    int var28 = var4[var27];
                    var3[var27] = var28 == 0 ? 0 : 4096 - ((4096 - var5[var27] << 12) / var28);
                }
            } else if (var6 == 9) {
                for (int var24 = 0; var24 < class185.field3225; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var25 <= var26 ? var25 : var26;
                }
            } else if (var6 == 10) {
                for (int var21 = 0; var21 < class185.field3225; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var23 > var22 ? var23 : var22;
                }
            } else if (var6 == 11) {
                for (int var15 = 0; var15 < class185.field3225; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var17 < var16 ? var16 - var17 : -var16 + var17;
                }
            } else if (var6 == 12) {
                for (int var18 = 0; var18 < class185.field3225; var18++) {
                    int var19 = var4[var18];
                    int var20 = var5[var18];
                    var3[var18] = var20 + var19 - (var19 * var20 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILbg;B)V", line = 257)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            method947((class270) null, -109);
        }
        field2427++;
        if (arg0 == 0) {
            this.field2428 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field2970 = arg1.method1325(7627) == 1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lcb;I)V", line = 294)
    public static final void method947(class270 arg0, int arg1) {
        class68 var2 = null;
        field2433++;
        class254.field4378 = 3;
        class3.method17((byte) 59, true);
        class45.field908 = false;
        class121.field2039 = true;
        class22.field545 = true;
        class240.field4101 = true;
        class116.field1969 = true;
        class182.field3197 = 2;
        class271.field4693 = true;
        class196.field3435 = 0;
        class90.field1536 = true;
        class1.field12 = true;
        class114.field1916 = true;
        class206.field3629 = 0;
        class31.field689 = true;
        class260.field4512 = true;
        class214.field3778 = 127;
        class158.field2699 = 127;
        class221.field3885 = 0;
        class238.field4073 = 0;
        class139.field2391 = 255;
        class165.field2836 = 0;
        if (arg1 != -17667) {
            return;
        }
        class228.field3968 = true;
        try {
            class23 var3 = arg0.method1892(0, "runescape");
            while (var3.field560 == 0) {
                class177.method1213(0, 1L);
            }
            if (var3.field560 == 1) {
                var2 = (class68) var3.field562;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method454(-1)];
                while (var4 < var5.length) {
                    int var6 = var2.method455(var5, 0, var4, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class223.method1533(44, new class194(var5));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method457(arg1 + 17668);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V", line = 367)
    public static void method948(int arg0) {
        field2434 = null;
        field2435 = null;
        if (arg0 >= -3) {
            method947((class270) null, 77);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 381)
    public class142() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)I", line = 391)
    public static final int method949(byte arg0) {
        field2430++;
        if ((double) class3.field64 == 3.0D) {
            return 37;
        } else if ((double) class3.field64 == 4.0D) {
            return 50;
        } else if ((double) class3.field64 == 6.0D) {
            return 75;
        } else {
            int var1 = 104 / ((arg0 - 55) / 36);
            return 100;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIIIIIIII)V", line = 412)
    public static final void method950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2431++;
        if (class133.method890(false, arg6)) {
            class132.field2299 = null;
            if (arg3 != -13238) {
                method948(11);
            }
            class7.method61(arg0, arg5, arg7, arg1, false, arg8, arg2, arg4, class200.field3508[arg6], -1);
            if (class132.field2299 != null) {
                class7.method61(arg0, arg5, class240.field4093, arg1, false, class215.field3787, arg2, arg4, class132.field2299, -1412584499);
                class132.field2299 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class26.field581[var9] = true;
            }
        } else {
            class26.field581[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[[I", line = 452)
    public final int[][] method62(int arg0, int arg1) {
        field2426++;
        int var3 = -38 % ((-arg1 - 24) / 46);
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[][] var5 = this.method1139(0, arg0, 0);
            int[][] var6 = this.method1139(0, arg0, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field2428;
            if (var16 == 1) {
                for (int var17 = 0; var17 < class185.field3225; var17++) {
                    var7[var17] = var10[var17] + var13[var17];
                    var9[var17] = var11[var17] + var14[var17];
                    var8[var17] = var12[var17] + var15[var17];
                }
            } else if (var16 == 2) {
                for (int var64 = 0; var64 < class185.field3225; var64++) {
                    var7[var64] = var10[var64] - var13[var64];
                    var9[var64] = var11[var64] - var14[var64];
                    var8[var64] = var12[var64] - var15[var64];
                }
            } else if (var16 == 3) {
                for (int var63 = 0; var63 < class185.field3225; var63++) {
                    var7[var63] = var10[var63] * var13[var63] >> 12;
                    var9[var63] = var11[var63] * var14[var63] >> 12;
                    var8[var63] = var12[var63] * var15[var63] >> 12;
                }
            } else if (var16 == 4) {
                for (int var59 = 0; var59 < class185.field3225; var59++) {
                    int var60 = var14[var59];
                    int var61 = var15[var59];
                    int var62 = var13[var59];
                    var7[var59] = var62 == 0 ? 4096 : (var10[var59] << 12) / var62;
                    var9[var59] = var60 == 0 ? 4096 : (var11[var59] << 12) / var60;
                    var8[var59] = var61 == 0 ? 4096 : (var12[var59] << 12) / var61;
                }
            } else if (var16 == 5) {
                for (int var18 = 0; var18 < class185.field3225; var18++) {
                    var7[var18] = 4096 - ((4096 - var10[var18]) * (4096 - var13[var18]) >> 12);
                    var9[var18] = 4096 - ((4096 - var11[var18]) * (4096 - var14[var18]) >> 12);
                    var8[var18] = 4096 - ((4096 - var12[var18]) * (4096 - var15[var18]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var19 = 0; var19 < class185.field3225; var19++) {
                    int var20 = var14[var19];
                    int var21 = var13[var19];
                    int var22 = var15[var19];
                    var7[var19] = var21 < 2048 ? var10[var19] * var21 >> 11 : 4096 - ((4096 - var10[var19]) * (4096 - var21) >> 11);
                    var9[var19] = var20 < 2048 ? var11[var19] * var20 >> 11 : 4096 - ((4096 - var11[var19]) * (4096 - var20) >> 11);
                    var8[var19] = var22 >= 2048 ? 4096 - ((4096 - var12[var19]) * (4096 - var22) >> 11) : var12[var19] * var22 >> 11;
                }
            } else if (var16 == 7) {
                for (int var23 = 0; var23 < class185.field3225; var23++) {
                    int var24 = var11[var23];
                    int var25 = var12[var23];
                    int var26 = var10[var23];
                    var7[var23] = var26 == 4096 ? 4096 : (var13[var23] << 12) / (4096 - var26);
                    var9[var23] = var24 == 4096 ? 4096 : (var14[var23] << 12) / (4096 - var24);
                    var8[var23] = var25 == 4096 ? 4096 : (var15[var23] << 12) / (4096 - var25);
                }
            } else if (var16 == 8) {
                for (int var55 = 0; var55 < class185.field3225; var55++) {
                    int var56 = var11[var55];
                    int var57 = var10[var55];
                    int var58 = var12[var55];
                    var7[var55] = var57 == 0 ? 0 : 4096 - ((4096 - var13[var55] << 12) / var57);
                    var9[var55] = var56 == 0 ? 0 : 4096 - ((4096 - var14[var55] << 12) / var56);
                    var8[var55] = var58 == 0 ? 0 : 4096 - ((4096 - var15[var55] << 12) / var58);
                }
            } else if (var16 == 9) {
                for (int var48 = 0; var48 < class185.field3225; var48++) {
                    int var49 = var10[var48];
                    int var50 = var11[var48];
                    int var51 = var15[var48];
                    int var52 = var13[var48];
                    int var53 = var14[var48];
                    int var54 = var12[var48];
                    var7[var48] = var49 >= var52 ? var52 : var49;
                    var9[var48] = var50 < var53 ? var50 : var53;
                    var8[var48] = var51 <= var54 ? var51 : var54;
                }
            } else if (var16 == 10) {
                for (int var27 = 0; var27 < class185.field3225; var27++) {
                    int var28 = var14[var27];
                    int var29 = var12[var27];
                    int var30 = var15[var27];
                    int var31 = var11[var27];
                    int var32 = var13[var27];
                    int var33 = var10[var27];
                    var7[var27] = var33 > var32 ? var33 : var32;
                    var9[var27] = var28 >= var31 ? var28 : var31;
                    var8[var27] = var30 >= var29 ? var30 : var29;
                }
            } else if (var16 == 11) {
                for (int var34 = 0; var34 < class185.field3225; var34++) {
                    int var35 = var13[var34];
                    int var36 = var14[var34];
                    int var37 = var15[var34];
                    int var38 = var10[var34];
                    int var39 = var11[var34];
                    int var40 = var12[var34];
                    var7[var34] = var38 <= var35 ? var35 - var38 : var38 - var35;
                    var9[var34] = var39 > var36 ? var39 - var36 : var36 - var39;
                    var8[var34] = var37 >= var40 ? var37 - var40 : -var37 + var40;
                }
            } else if (var16 == 12) {
                for (int var41 = 0; var41 < class185.field3225; var41++) {
                    int var42 = var15[var41];
                    int var43 = var12[var41];
                    int var44 = var11[var41];
                    int var45 = var10[var41];
                    int var46 = var13[var41];
                    int var47 = var14[var41];
                    var7[var41] = var45 + var46 - (var45 * var46 >> 11);
                    var9[var41] = var44 + var47 - (var44 * var47 >> 11);
                    var8[var41] = var43 + var42 - (var42 * var43 >> 11);
                }
            }
        }
        return var4;
    }
}
