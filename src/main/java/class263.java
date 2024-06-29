import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class263 extends class240 {

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    private int field4508 = 6;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Lcd;")
    public static class64 field4507 = class44.method335((byte) 71, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "Lja;")
    public static class60 field4511 = null;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Z")
    public static boolean field4510 = true;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Lcd;")
    public static class64 field4519 = class44.method335((byte) 71, "settings=");

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Ljava/awt/Frame;")
    public static Frame field4514;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I", line = 14)
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = this.field4094.method179(arg1, true);
        field4516++;
        if (arg0 != 64) {
            field4507 = (class64) null;
        }
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 127);
            int[] var5 = this.method1745(arg1, 1, (byte) 126);
            int var6 = this.field4508;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class169.field2936; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class169.field2936; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var30 = 0; var30 < class169.field2936; var30++) {
                    var3[var30] = var4[var30] * var5[var30] >> 12;
                }
            } else if (var6 == 4) {
                for (int var9 = 0; var9 < class169.field2936; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 == 0 ? 4096 : (var4[var9] << 12) / var10;
                }
            } else if (var6 == 5) {
                for (int var11 = 0; var11 < class169.field2936; var11++) {
                    var3[var11] = 4096 - ((4096 - var4[var11]) * (4096 - var5[var11]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var12 = 0; var12 < class169.field2936; var12++) {
                    int var13 = var5[var12];
                    var3[var12] = var13 >= 2048 ? 4096 - ((4096 - var4[var12]) * (4096 - var13) >> 11) : var4[var12] * var13 >> 11;
                }
            } else if (var6 == 7) {
                for (int var28 = 0; var28 < class169.field2936; var28++) {
                    int var29 = var4[var28];
                    var3[var28] = var29 == 4096 ? 4096 : (var5[var28] << 12) / (4096 - var29);
                }
            } else if (var6 == 8) {
                for (int var26 = 0; var26 < class169.field2936; var26++) {
                    int var27 = var4[var26];
                    var3[var26] = var27 == 0 ? 0 : 4096 - ((4096 - var5[var26] << 12) / var27);
                }
            } else if (var6 == 9) {
                for (int var14 = 0; var14 < class169.field2936; var14++) {
                    int var15 = var4[var14];
                    int var16 = var5[var14];
                    var3[var14] = var16 <= var15 ? var16 : var15;
                }
            } else if (var6 == 10) {
                for (int var23 = 0; var23 < class169.field2936; var23++) {
                    int var24 = var4[var23];
                    int var25 = var5[var23];
                    var3[var23] = var24 > var25 ? var24 : var25;
                }
            } else if (var6 == 11) {
                for (int var20 = 0; var20 < class169.field2936; var20++) {
                    int var21 = var5[var20];
                    int var22 = var4[var20];
                    var3[var20] = var22 > var21 ? var22 - var21 : -var22 + var21;
                }
            } else if (var6 == 12) {
                for (int var17 = 0; var17 < class169.field2936; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var18 + var19 - (var18 * var19 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 272)
    public class263() {
        super(2, false);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V", line = 260)
    public static final void method1846(int arg0, int arg1) {
        field4517++;
        class299 var2 = class158.method1135(arg0, arg1 - 118, arg1);
        var2.method2093((byte) -61);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)V", line = 278)
    public static void method1847(byte arg0) {
        field4519 = null;
        field4514 = null;
        field4511 = null;
        field4507 = null;
        if (arg0 > -16) {
            method1848(103, 111, -49);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)[[I", line = 304)
    public final int[][] method286(byte arg0, int arg1) {
        field4513++;
        int[][] var3 = this.field4095.method1797(arg1, -75);
        if (arg0 < 34) {
            method1846(-3, 106);
        }
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(31, arg1, 0);
            int[][] var5 = this.method1746(36, arg1, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field4508;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class169.field2936; var63++) {
                    var8[var63] = var9[var63] + var12[var63];
                    var6[var63] = var10[var63] + var14[var63];
                    var7[var63] = var11[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class169.field2936; var16++) {
                    var8[var16] = var9[var16] - var12[var16];
                    var6[var16] = var10[var16] - var14[var16];
                    var7[var16] = var11[var16] - var13[var16];
                }
            } else if (var15 == 3) {
                for (int var62 = 0; var62 < class169.field2936; var62++) {
                    var8[var62] = var9[var62] * var12[var62] >> 12;
                    var6[var62] = var10[var62] * var14[var62] >> 12;
                    var7[var62] = var11[var62] * var13[var62] >> 12;
                }
            } else if (var15 == 4) {
                for (int var58 = 0; var58 < class169.field2936; var58++) {
                    int var59 = var13[var58];
                    int var60 = var14[var58];
                    int var61 = var12[var58];
                    var8[var58] = var61 == 0 ? 4096 : (var9[var58] << 12) / var61;
                    var6[var58] = var60 == 0 ? 4096 : (var10[var58] << 12) / var60;
                    var7[var58] = var59 == 0 ? 4096 : (var11[var58] << 12) / var59;
                }
            } else if (var15 == 5) {
                for (int var17 = 0; var17 < class169.field2936; var17++) {
                    var8[var17] = 4096 - ((4096 - var9[var17]) * (4096 - var12[var17]) >> 12);
                    var6[var17] = 4096 - ((4096 - var10[var17]) * (4096 - var14[var17]) >> 12);
                    var7[var17] = 4096 - ((4096 - var11[var17]) * (4096 - var13[var17]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var54 = 0; var54 < class169.field2936; var54++) {
                    int var55 = var14[var54];
                    int var56 = var13[var54];
                    int var57 = var12[var54];
                    var8[var54] = var57 < 2048 ? var9[var54] * var57 >> 11 : 4096 - ((4096 - var57) * (4096 - var9[var54]) >> 11);
                    var6[var54] = var55 < 2048 ? var10[var54] * var55 >> 11 : 4096 - ((4096 - var10[var54]) * (4096 - var55) >> 11);
                    var7[var54] = var56 < 2048 ? var11[var54] * var56 >> 11 : 4096 - ((4096 - var56) * (4096 - var11[var54]) >> 11);
                }
            } else if (var15 == 7) {
                for (int var18 = 0; var18 < class169.field2936; var18++) {
                    int var19 = var10[var18];
                    int var20 = var11[var18];
                    int var21 = var9[var18];
                    var8[var18] = var21 == 4096 ? 4096 : (var12[var18] << 12) / (4096 - var21);
                    var6[var18] = var19 == 4096 ? 4096 : (var14[var18] << 12) / (4096 - var19);
                    var7[var18] = var20 == 4096 ? 4096 : (var13[var18] << 12) / (4096 - var20);
                }
            } else if (var15 == 8) {
                for (int var22 = 0; var22 < class169.field2936; var22++) {
                    int var23 = var11[var22];
                    int var24 = var9[var22];
                    int var25 = var10[var22];
                    var8[var22] = var24 == 0 ? 0 : 4096 - ((4096 - var12[var22] << 12) / var24);
                    var6[var22] = var25 == 0 ? 0 : 4096 - (4096 - var14[var22] << 12) / var25;
                    var7[var22] = var23 == 0 ? 0 : 4096 - (4096 - var13[var22] << 12) / var23;
                }
            } else if (var15 == 9) {
                for (int var47 = 0; var47 < class169.field2936; var47++) {
                    int var48 = var11[var47];
                    int var49 = var13[var47];
                    int var50 = var9[var47];
                    int var51 = var10[var47];
                    int var52 = var14[var47];
                    int var53 = var12[var47];
                    var8[var47] = var50 >= var53 ? var53 : var50;
                    var6[var47] = var52 <= var51 ? var52 : var51;
                    var7[var47] = var49 <= var48 ? var49 : var48;
                }
            } else if (var15 == 10) {
                for (int var26 = 0; var26 < class169.field2936; var26++) {
                    int var27 = var9[var26];
                    int var28 = var13[var26];
                    int var29 = var12[var26];
                    int var30 = var10[var26];
                    int var31 = var14[var26];
                    int var32 = var11[var26];
                    var8[var26] = var27 <= var29 ? var29 : var27;
                    var6[var26] = var31 >= var30 ? var31 : var30;
                    var7[var26] = var32 > var28 ? var32 : var28;
                }
            } else if (var15 == 11) {
                for (int var40 = 0; var40 < class169.field2936; var40++) {
                    int var41 = var13[var40];
                    int var42 = var9[var40];
                    int var43 = var10[var40];
                    int var44 = var12[var40];
                    int var45 = var14[var40];
                    int var46 = var11[var40];
                    var8[var40] = var42 > var44 ? var42 - var44 : -var42 + var44;
                    var6[var40] = var45 < var43 ? var43 - var45 : -var43 + var45;
                    var7[var40] = var46 > var41 ? var46 - var41 : -var46 + var41;
                }
            } else if (var15 == 12) {
                for (int var33 = 0; var33 < class169.field2936; var33++) {
                    int var34 = var14[var33];
                    int var35 = var12[var33];
                    int var36 = var9[var33];
                    int var37 = var13[var33];
                    int var38 = var10[var33];
                    int var39 = var11[var33];
                    var8[var33] = var35 + var36 - (var35 * var36 >> 11);
                    var6[var33] = var38 + var34 - (var34 * var38 >> 11);
                    var7[var33] = var37 + var39 - (var37 * var39 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILkh;)V", line = 621)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            this.method16(-62, -43, (class13) null);
        }
        if (arg1 == 0) {
            this.field4508 = arg2.method152((byte) -69);
        } else if (arg1 == 1) {
            this.field4113 = arg2.method152((byte) -104) == 1;
        }
        field4509++;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(III)V", line = 660)
    public static final void method1848(int arg0, int arg1, int arg2) {
        class76.field1440 = class157.field2770[arg2][arg1].field5314;
        class247.field4298 = class157.field2770[arg2][arg1].field5302;
        field4515++;
        class273.field4687 = class157.field2770[arg2][arg1].field5313;
        if (arg0 == 4096) {
            class52.method392((float) class76.field1440, (float) class247.field4298, (float) class273.field4687);
        }
    }
}
