import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class65 extends class53 {

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "I")
    private int field1132 = 6;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Lwa;")
    private static class75 field1118 = class66.method560("yellow:", false);

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "Lwa;")
    public static class75 field1121 = field1118;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "[I")
    public static int[] field1131 = new int[2048];

    @OriginalMember(owner = "client!om", name = "U", descriptor = "Lwa;")
    public static class75 field1125 = field1118;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "Lwa;")
    private static class75 field1130 = class66.method560("Select a world", false);

    @OriginalMember(owner = "client!om", name = "O", descriptor = "Lwa;")
    public static class75 field1119 = field1130;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[I")
    public static int[] field1123;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "[Lre;")
    public static class262[] field1126;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IIII)Z", line = 6)
    public static final boolean method553(int arg0, int arg1, int arg2, int arg3) {
        if (!class3.method18(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class53.field879[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class199.field3347) {
                    if (!class2.method9(var4, var6, var5)) {
                        return false;
                    }
                    if (!class2.method9(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method9(var4, var7, var5)) {
                        return false;
                    }
                    if (!class2.method9(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class2.method9(var4, var8, var5)) {
                    return false;
                }
                if (!class2.method9(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class207.field3509) {
                    if (!class2.method9(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class2.method9(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method9(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class2.method9(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class2.method9(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class2.method9(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class199.field3347) {
                    if (!class2.method9(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class2.method9(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method9(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class2.method9(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class2.method9(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class2.method9(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class207.field3509) {
                    if (!class2.method9(var4, var6, var5)) {
                        return false;
                    }
                    if (!class2.method9(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method9(var4, var7, var5)) {
                        return false;
                    }
                    if (!class2.method9(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class2.method9(var4, var8, var5)) {
                    return false;
                }
                if (!class2.method9(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class2.method9(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class2.method9(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class2.method9(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class2.method9(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class2.method9(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[I", line = 198)
    public final int[] method59(int arg0, int arg1) {
        int[] var3 = this.field878.method1603(arg1, (byte) 123);
        field1117++;
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, arg0 + 15196, arg1);
            int[] var5 = this.method391(1, 0, arg1);
            int var6 = this.field1132;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class269.field4644; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var30 = 0; var30 < class269.field4644; var30++) {
                    var3[var30] = var4[var30] - var5[var30];
                }
            } else if (var6 == 3) {
                for (int var29 = 0; var29 < class269.field4644; var29++) {
                    var3[var29] = var4[var29] * var5[var29] >> 12;
                }
            } else if (var6 == 4) {
                for (int var27 = 0; var27 < class269.field4644; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 == 0 ? 4096 : (var4[var27] << 12) / var28;
                }
            } else if (var6 == 5) {
                for (int var26 = 0; var26 < class269.field4644; var26++) {
                    var3[var26] = 4096 - ((4096 - var4[var26]) * (4096 - var5[var26]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var8 = 0; var8 < class269.field4644; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 < 2048 ? var4[var8] * var9 >> 11 : 4096 - ((4096 - var9) * (4096 - var4[var8]) >> 11);
                }
            } else if (var6 == 7) {
                for (int var10 = 0; var10 < class269.field4644; var10++) {
                    int var11 = var4[var10];
                    var3[var10] = var11 == 4096 ? 4096 : (var5[var10] << 12) / (4096 - var11);
                }
            } else if (var6 == 8) {
                for (int var12 = 0; var12 < class269.field4644; var12++) {
                    int var13 = var4[var12];
                    var3[var12] = var13 == 0 ? 0 : 4096 - ((4096 - var5[var12] << 12) / var13);
                }
            } else if (var6 == 9) {
                for (int var14 = 0; var14 < class269.field4644; var14++) {
                    int var15 = var4[var14];
                    int var16 = var5[var14];
                    var3[var14] = var16 > var15 ? var15 : var16;
                }
            } else if (var6 == 10) {
                for (int var23 = 0; var23 < class269.field4644; var23++) {
                    int var24 = var5[var23];
                    int var25 = var4[var23];
                    var3[var23] = var24 >= var25 ? var24 : var25;
                }
            } else if (var6 == 11) {
                for (int var17 = 0; var17 < class269.field4644; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var19 >= var18 ? var19 - var18 : -var19 + var18;
                }
            } else if (var6 == 12) {
                for (int var20 = 0; var20 < class269.field4644; var20++) {
                    int var21 = var5[var20];
                    int var22 = var4[var20];
                    var3[var20] = var21 + var22 - (var21 * var22 >> 11);
                }
            }
        }
        if (arg0 != -15196) {
            this.method54(3, (class60) null, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILja;Z)V", line = 443)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field1122++;
        if (!arg2) {
            field1130 = (class75) null;
        }
        if (arg0 == 0) {
            this.field1132 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field880 = arg1.method501(0) == 1;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 491)
    public static final void method554(boolean arg0) {
        if (!arg0) {
            field1123 = (int[]) null;
        }
        field1128++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class126.field2188 - 1); var2++) {
                if (class99.field1646[var2] < 1000 && class99.field1646[var2 + 1] > 1000) {
                    var1 = false;
                    class75 var3 = class94.field1521[var2];
                    class94.field1521[var2] = class94.field1521[var2 + 1];
                    class94.field1521[var2 + 1] = var3;
                    class75 var4 = class272.field4692[var2];
                    class272.field4692[var2] = class272.field4692[var2 + 1];
                    class272.field4692[var2 + 1] = var4;
                    int var5 = class171.field2884[var2];
                    class171.field2884[var2] = class171.field2884[var2 + 1];
                    class171.field2884[var2 + 1] = var5;
                    int var6 = class16.field216[var2];
                    class16.field216[var2] = class16.field216[var2 + 1];
                    class16.field216[var2 + 1] = var6;
                    short var7 = class99.field1646[var2];
                    class99.field1646[var2] = class99.field1646[var2 + 1];
                    class99.field1646[var2 + 1] = var7;
                    long var8 = class86.field1417[var2];
                    class86.field1417[var2] = class86.field1417[var2 + 1];
                    class86.field1417[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 545)
    public static void method555(byte arg0) {
        if (arg0 >= -70) {
            method553(-15, -23, 40, -56);
        }
        field1131 = null;
        field1121 = null;
        field1126 = null;
        field1123 = null;
        field1118 = null;
        field1119 = null;
        field1125 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 561)
    public class65() {
        super(2, false);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(II)Llk;", line = 567)
    public static final class263 method556(int arg0, int arg1) {
        class263 var2 = (class263) class213.field3623.method1193((long) arg0, -101);
        field1124++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 43 / ((arg1 - 28) / 59);
        byte[] var4 = class132.field2282.method1911(class144.method1108(0, arg0), class274.method1956((byte) 1, arg0), -103);
        class263 var5 = new class263();
        var5.field4569 = arg0;
        if (var4 != null) {
            var5.method1884(new class60(var4), true);
        }
        class213.field3623.method1194(var5, (long) arg0, false);
        return var5;
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V", line = 624)
    public static final void method557(int arg0) {
        field1120++;
        class41.method281(5, -1);
        class67.method572(5, (byte) -75);
        class17.method106(5, (byte) -98);
        if (arg0 != -11953) {
            field1129 = 90;
        }
        class118.method903(arg0 ^ 0x2EFF, 5);
        class34.method223(5, -38);
        class275.method1960((byte) -96, 5);
        class70.method589((byte) 99, 5);
        class93.method723(5, -83);
        class67.method569(arg0 + 11884, 5);
        class96.method742((byte) -116, 5);
        class162.method1210(125, 5);
        class125.method968(50, (byte) 83);
        class132.method1028(5, (byte) 6);
        class297.method2057(arg0 + 8189, 5);
        class134.field2307.method1199(5, 123);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[[I", line = 653)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = 116 / ((arg1 - 76) / 42);
        field1133++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(123, 0, arg0);
            int[][] var6 = this.method388(119, 1, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var5[0];
            int[] var10 = var4[2];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field1132;
            if (var16 == 1) {
                for (int var17 = 0; var17 < class269.field4644; var17++) {
                    var7[var17] = var9[var17] + var13[var17];
                    var8[var17] = var11[var17] + var14[var17];
                    var10[var17] = var12[var17] + var15[var17];
                }
            } else if (var16 == 2) {
                for (int var18 = 0; var18 < class269.field4644; var18++) {
                    var7[var18] = var9[var18] - var13[var18];
                    var8[var18] = var11[var18] - var14[var18];
                    var10[var18] = var12[var18] - var15[var18];
                }
            } else if (var16 == 3) {
                for (int var64 = 0; var64 < class269.field4644; var64++) {
                    var7[var64] = var9[var64] * var13[var64] >> 12;
                    var8[var64] = var11[var64] * var14[var64] >> 12;
                    var10[var64] = var12[var64] * var15[var64] >> 12;
                }
            } else if (var16 == 4) {
                for (int var60 = 0; var60 < class269.field4644; var60++) {
                    int var61 = var13[var60];
                    int var62 = var14[var60];
                    int var63 = var15[var60];
                    var7[var60] = var61 == 0 ? 4096 : (var9[var60] << 12) / var61;
                    var8[var60] = var62 == 0 ? 4096 : (var11[var60] << 12) / var62;
                    var10[var60] = var63 == 0 ? 4096 : (var12[var60] << 12) / var63;
                }
            } else if (var16 == 5) {
                for (int var19 = 0; var19 < class269.field4644; var19++) {
                    var7[var19] = 4096 - ((4096 - var9[var19]) * (4096 - var13[var19]) >> 12);
                    var8[var19] = 4096 - ((4096 - var14[var19]) * (4096 - var11[var19]) >> 12);
                    var10[var19] = 4096 - ((4096 - var12[var19]) * (4096 - var15[var19]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var56 = 0; var56 < class269.field4644; var56++) {
                    int var57 = var15[var56];
                    int var58 = var14[var56];
                    int var59 = var13[var56];
                    var7[var56] = var59 < 2048 ? var9[var56] * var59 >> 11 : 4096 - ((4096 - var9[var56]) * (4096 - var59) >> 11);
                    var8[var56] = var58 >= 2048 ? 4096 - ((4096 - var11[var56]) * (4096 - var58) >> 11) : var11[var56] * var58 >> 11;
                    var10[var56] = var57 >= 2048 ? 4096 - ((4096 - var12[var56]) * (4096 - var57) >> 11) : var12[var56] * var57 >> 11;
                }
            } else if (var16 == 7) {
                for (int var52 = 0; var52 < class269.field4644; var52++) {
                    int var53 = var9[var52];
                    int var54 = var11[var52];
                    int var55 = var12[var52];
                    var7[var52] = var53 == 4096 ? 4096 : (var13[var52] << 12) / (4096 - var53);
                    var8[var52] = var54 == 4096 ? 4096 : (var14[var52] << 12) / (4096 - var54);
                    var10[var52] = var55 == 4096 ? 4096 : (var15[var52] << 12) / (4096 - var55);
                }
            } else if (var16 == 8) {
                for (int var20 = 0; var20 < class269.field4644; var20++) {
                    int var21 = var11[var20];
                    int var22 = var9[var20];
                    int var23 = var12[var20];
                    var7[var20] = var22 == 0 ? 0 : 4096 - ((4096 - var13[var20] << 12) / var22);
                    var8[var20] = var21 == 0 ? 0 : 4096 - ((4096 - var14[var20] << 12) / var21);
                    var10[var20] = var23 == 0 ? 0 : 4096 - (4096 - var15[var20] << 12) / var23;
                }
            } else if (var16 == 9) {
                for (int var24 = 0; var24 < class269.field4644; var24++) {
                    int var25 = var13[var24];
                    int var26 = var15[var24];
                    int var27 = var12[var24];
                    int var28 = var11[var24];
                    int var29 = var9[var24];
                    int var30 = var14[var24];
                    var7[var24] = var29 < var25 ? var29 : var25;
                    var8[var24] = var28 >= var30 ? var30 : var28;
                    var10[var24] = var27 < var26 ? var27 : var26;
                }
            } else if (var16 == 10) {
                for (int var45 = 0; var45 < class269.field4644; var45++) {
                    int var46 = var13[var45];
                    int var47 = var12[var45];
                    int var48 = var14[var45];
                    int var49 = var9[var45];
                    int var50 = var11[var45];
                    int var51 = var15[var45];
                    var7[var45] = var46 >= var49 ? var46 : var49;
                    var8[var45] = var48 < var50 ? var50 : var48;
                    var10[var45] = var47 > var51 ? var47 : var51;
                }
            } else if (var16 == 11) {
                for (int var31 = 0; var31 < class269.field4644; var31++) {
                    int var32 = var12[var31];
                    int var33 = var9[var31];
                    int var34 = var15[var31];
                    int var35 = var13[var31];
                    int var36 = var11[var31];
                    int var37 = var14[var31];
                    var7[var31] = var33 <= var35 ? var35 - var33 : -var35 + var33;
                    var8[var31] = var37 >= var36 ? var37 - var36 : -var37 + var36;
                    var10[var31] = var34 >= var32 ? var34 - var32 : -var34 + var32;
                }
            } else if (var16 == 12) {
                for (int var38 = 0; var38 < class269.field4644; var38++) {
                    int var39 = var12[var38];
                    int var40 = var15[var38];
                    int var41 = var14[var38];
                    int var42 = var11[var38];
                    int var43 = var9[var38];
                    int var44 = var13[var38];
                    var7[var38] = var44 + var43 - (var43 * var44 >> 11);
                    var8[var38] = var41 + var42 - (var41 * var42 >> 11);
                    var10[var38] = var39 + var40 - (var39 * var40 >> 11);
                }
            }
        }
        return var4;
    }
}
