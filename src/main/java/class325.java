import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class325 extends class326 {

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    private int field5102 = 6;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
    public static int[] field5100 = new int[14];

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "[J")
    public static long[] field5103 = new long[100];

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Ljava/lang/String;")
    public static String field5095 = "red:";

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method103(int arg0, int arg1) {
        field5093++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 >= -25) {
            return (int[]) null;
        }
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1, -3896);
            int[] var5 = this.method2287(1, arg1, -3896);
            int var6 = this.field5102;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class166.field2731; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class166.field2731; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var28 = 0; var28 < class166.field2731; var28++) {
                    var3[var28] = var4[var28] * var5[var28] >> 12;
                }
            } else if (var6 == 4) {
                for (int var7 = 0; var7 < class166.field2731; var7++) {
                    int var8 = var5[var7];
                    var3[var7] = var8 == 0 ? 4096 : (var4[var7] << 12) / var8;
                }
            } else if (var6 == 5) {
                for (int var9 = 0; var9 < class166.field2731; var9++) {
                    var3[var9] = 4096 - ((4096 - var4[var9]) * (4096 - var5[var9]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var10 = 0; var10 < class166.field2731; var10++) {
                    int var11 = var5[var10];
                    var3[var10] = var11 < 2048 ? var4[var10] * var11 >> 11 : 4096 - ((4096 - var4[var10]) * (4096 - var11) >> 11);
                }
            } else if (var6 == 7) {
                for (int var26 = 0; var26 < class166.field2731; var26++) {
                    int var27 = var4[var26];
                    var3[var26] = var27 == 4096 ? 4096 : (var5[var26] << 12) / (4096 - var27);
                }
            } else if (var6 == 8) {
                for (int var24 = 0; var24 < class166.field2731; var24++) {
                    int var25 = var4[var24];
                    var3[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var5[var24] << 12) / var25);
                }
            } else if (var6 == 9) {
                for (int var12 = 0; var12 < class166.field2731; var12++) {
                    int var13 = var4[var12];
                    int var14 = var5[var12];
                    var3[var12] = var13 < var14 ? var13 : var14;
                }
            } else if (var6 == 10) {
                for (int var21 = 0; var21 < class166.field2731; var21++) {
                    int var22 = var4[var21];
                    int var23 = var5[var21];
                    var3[var21] = var23 >= var22 ? var23 : var22;
                }
            } else if (var6 == 11) {
                for (int var18 = 0; var18 < class166.field2731; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var19 < var20 ? var20 - var19 : -var20 + var19;
                }
            } else if (var6 == 12) {
                for (int var15 = 0; var15 < class166.field2731; var15++) {
                    int var16 = var4[var15];
                    int var17 = var5[var15];
                    var3[var15] = var16 + var17 - (var16 * var17 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZLvl;)V", line = 251)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field5097++;
        if (arg0 == 0) {
            this.field5102 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        if (arg1) {
            method2283((byte) 98, (Object) null, (class137) null);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLjava/lang/Object;Lvc;)V", line = 287)
    public static final void method2283(byte arg0, Object arg1, class137 arg2) {
        field5098++;
        if (arg0 != -122) {
            method2283((byte) 52, (Object) null, (class137) null);
        }
        if (arg2.field2187 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2187.peekEvent() != null; var3++) {
            class272.method1918((byte) 22, 1L);
        }
        if (arg1 != null) {
            arg2.field2187.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 313)
    public static void method2284(int arg0) {
        field5095 = null;
        field5103 = null;
        field5100 = null;
        if (arg0 != 26631) {
            method2284(-106);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Z", line = 327)
    public static final boolean method2285(int arg0, boolean arg1) {
        field5101++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1) {
            field5103 = (long[]) null;
        }
        int var2 = class282.field4365[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[[I", line = 360)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = -35 % ((arg1 - 60) / 51);
        field5091++;
        int[][] var4 = this.field5104.method2365((byte) -94, arg0);
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, arg0, 0);
            int[][] var6 = this.method2293(-15033, arg0, 1);
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var5[1];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field5102;
            if (var16 == 1) {
                for (int var64 = 0; var64 < class166.field2731; var64++) {
                    var9[var64] = var10[var64] + var12[var64];
                    var7[var64] = var13[var64] + var14[var64];
                    var8[var64] = var11[var64] + var15[var64];
                }
            } else if (var16 == 2) {
                for (int var63 = 0; var63 < class166.field2731; var63++) {
                    var9[var63] = var10[var63] - var12[var63];
                    var7[var63] = var13[var63] - var14[var63];
                    var8[var63] = var11[var63] - var15[var63];
                }
            } else if (var16 == 3) {
                for (int var62 = 0; var62 < class166.field2731; var62++) {
                    var9[var62] = var10[var62] * var12[var62] >> 12;
                    var7[var62] = var13[var62] * var14[var62] >> 12;
                    var8[var62] = var11[var62] * var15[var62] >> 12;
                }
            } else if (var16 == 4) {
                for (int var58 = 0; var58 < class166.field2731; var58++) {
                    int var59 = var15[var58];
                    int var60 = var12[var58];
                    int var61 = var14[var58];
                    var9[var58] = var60 == 0 ? 4096 : (var10[var58] << 12) / var60;
                    var7[var58] = var61 == 0 ? 4096 : (var13[var58] << 12) / var61;
                    var8[var58] = var59 == 0 ? 4096 : (var11[var58] << 12) / var59;
                }
            } else if (var16 == 5) {
                for (int var57 = 0; var57 < class166.field2731; var57++) {
                    var9[var57] = 4096 - ((4096 - var10[var57]) * (4096 - var12[var57]) >> 12);
                    var7[var57] = 4096 - ((4096 - var13[var57]) * (4096 - var14[var57]) >> 12);
                    var8[var57] = 4096 - ((4096 - var15[var57]) * (4096 - var11[var57]) >> 12);
                }
            } else if (var16 == 6) {
                for (int var53 = 0; var53 < class166.field2731; var53++) {
                    int var54 = var12[var53];
                    int var55 = var15[var53];
                    int var56 = var14[var53];
                    var9[var53] = var54 >= 2048 ? 4096 - ((4096 - var54) * (4096 - var10[var53]) >> 11) : var10[var53] * var54 >> 11;
                    var7[var53] = var56 < 2048 ? var13[var53] * var56 >> 11 : 4096 - ((4096 - var13[var53]) * (4096 - var56) >> 11);
                    var8[var53] = var55 >= 2048 ? 4096 - ((4096 - var11[var53]) * (4096 - var55) >> 11) : var11[var53] * var55 >> 11;
                }
            } else if (var16 == 7) {
                for (int var17 = 0; var17 < class166.field2731; var17++) {
                    int var18 = var10[var17];
                    int var19 = var11[var17];
                    int var20 = var13[var17];
                    var9[var17] = var18 == 4096 ? 4096 : (var12[var17] << 12) / (4096 - var18);
                    var7[var17] = var20 == 4096 ? 4096 : (var14[var17] << 12) / (4096 - var20);
                    var8[var17] = var19 == 4096 ? 4096 : (var15[var17] << 12) / (4096 - var19);
                }
            } else if (var16 == 8) {
                for (int var49 = 0; var49 < class166.field2731; var49++) {
                    int var50 = var10[var49];
                    int var51 = var11[var49];
                    int var52 = var13[var49];
                    var9[var49] = var50 == 0 ? 0 : 4096 - ((4096 - var12[var49] << 12) / var50);
                    var7[var49] = var52 == 0 ? 0 : 4096 - ((4096 - var14[var49] << 12) / var52);
                    var8[var49] = var51 == 0 ? 0 : 4096 - ((4096 - var15[var49] << 12) / var51);
                }
            } else if (var16 == 9) {
                for (int var42 = 0; var42 < class166.field2731; var42++) {
                    int var43 = var13[var42];
                    int var44 = var15[var42];
                    int var45 = var10[var42];
                    int var46 = var11[var42];
                    int var47 = var14[var42];
                    int var48 = var12[var42];
                    var9[var42] = var45 >= var48 ? var48 : var45;
                    var7[var42] = var43 >= var47 ? var47 : var43;
                    var8[var42] = var44 > var46 ? var46 : var44;
                }
            } else if (var16 == 10) {
                for (int var21 = 0; var21 < class166.field2731; var21++) {
                    int var22 = var14[var21];
                    int var23 = var10[var21];
                    int var24 = var11[var21];
                    int var25 = var15[var21];
                    int var26 = var13[var21];
                    int var27 = var12[var21];
                    var9[var21] = var23 > var27 ? var23 : var27;
                    var7[var21] = var22 < var26 ? var26 : var22;
                    var8[var21] = var24 > var25 ? var24 : var25;
                }
            } else if (var16 == 11) {
                for (int var35 = 0; var35 < class166.field2731; var35++) {
                    int var36 = var12[var35];
                    int var37 = var15[var35];
                    int var38 = var13[var35];
                    int var39 = var10[var35];
                    int var40 = var11[var35];
                    int var41 = var14[var35];
                    var9[var35] = var39 > var36 ? var39 - var36 : -var39 + var36;
                    var7[var35] = var41 >= var38 ? var41 - var38 : -var41 + var38;
                    var8[var35] = var37 < var40 ? var40 - var37 : var37 - var40;
                }
            } else if (var16 == 12) {
                for (int var28 = 0; var28 < class166.field2731; var28++) {
                    int var29 = var10[var28];
                    int var30 = var12[var28];
                    int var31 = var13[var28];
                    int var32 = var15[var28];
                    int var33 = var11[var28];
                    int var34 = var14[var28];
                    var9[var28] = var30 + var29 - (var29 * var30 >> 11);
                    var7[var28] = var31 + var34 - (var31 * var34 >> 11);
                    var8[var28] = var33 + var32 - (var32 * var33 >> 11);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 674)
    public class325() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V", line = 695)
    public static final void method2286(int arg0) {
        int var1 = -19 / ((arg0 + 3) / 63);
        for (class25 var2 = (class25) class210.field3304.method2174(256); var2 != null; var2 = (class25) class210.field3304.method2164((byte) 96)) {
            int var3 = var2.field376;
            if (class286.method2022((byte) -33, var3)) {
                class136[] var4 = class269.field4182[var3];
                boolean var5 = true;
                for (int var6 = 0; var6 < var4.length; var6++) {
                    if (var4[var6] != null) {
                        var5 = var4[var6].field2164;
                        break;
                    }
                }
                if (!var5) {
                    int var7 = (int) var2.field4430;
                    class136 var8 = class14.method140(var7, 1036508464);
                    if (var8 != null) {
                        class167.method1250(var8, 412);
                    }
                }
            }
        }
        field5096++;
    }
}
