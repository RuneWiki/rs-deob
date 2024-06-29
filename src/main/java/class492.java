import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class492 {

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "Lmj;")
    private class114 field6749;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "Lsl;")
    private class99 field6741;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
    public int field6751;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    private int field6742;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "[B")
    public byte[] field6750;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    private int field6747;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    private int field6744;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field6745 = 100;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "Lsaa;")
    public static class657 field6753 = new class657();

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "[[Lku;")
    private class219[][] field6739;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public final void method2870(int arg0) {
        field6748++;
        if (arg0 < 119) {
            this.field6744 = -88;
        }
        this.field6739 = new class219[this.field6747][this.field6744];
        for (int var2 = 0; var2 < this.field6744; var2++) {
            for (int var3 = 0; var3 < this.field6747; var3++) {
                this.field6739[var3][var2] = new class219(this.field6749, this, this.field6741, var3, var2, this.field6742, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field6739[var3][var2].field3205 == 0) {
                    this.field6739[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
    public static final void method2871(boolean arg0) {
        for (int var1 = 0; var1 < class393.field5456; var1++) {
            class792.field10863[var1] = null;
        }
        field6738++;
        class393.field5456 = 0;
        for (int var2 = 0; var2 < class169.field2565; var2++) {
            for (int var42 = 0; var42 < class42.field520; var42++) {
                for (int var43 = 0; var43 < class681.field9665; var43++) {
                    class172 var44 = class514.field7096[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field2601 > 0) {
                            var44.field2601 = (short) (var44.field2601 * -1);
                        }
                        if (var44.field2597 > 0) {
                            var44.field2597 = (short) (var44.field2597 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class169.field2565; var3++) {
            for (int var4 = 0; var4 < class42.field520; var4++) {
                for (int var5 = 0; var5 < class681.field9665; var5++) {
                    class172 var6 = class514.field7096[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class514.field7096[0][var5][var4] != null && class514.field7096[0][var5][var4].field2592 != null;
                        if (var6.field2597 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class172 var12 = class514.field7096[var3][var5][var4 - 1];
                            int var13 = class495.field6799[var3].method2476(var4, var5, -1);
                            while (var8 > 0 && var12 != null && var12.field2597 < 0 && var6.field2597 == var12.field2597 && var6.field2602 == var12.field2602 && class495.field6799[var3].method2476(var8 - 1, var5, -1) == var13 && ((var8 - 1) <= 0 || var13 == class495.field6799[var3].method2476(var8 - 2, var5, -1))) {
                                var8--;
                                var12 = class514.field7096[var3][var5][var8 - 1];
                            }
                            for (class172 var14 = class514.field7096[var3][var5][var4 + 1]; var9 < class681.field9665 && var14 != null && var14.field2597 < 0 && var6.field2597 == var14.field2597 && var6.field2602 == var14.field2602 && class495.field6799[var3].method2476(var9 + 1, var5, -1) == var13 && ((var9 + 1) >= class681.field9665 || var13 == class495.field6799[var3].method2476(var9 + 2, var5, -1)); var14 = class514.field7096[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class495.field6799[var7 ? var3 + 1 : var3].method2476(var8, var5, -1);
                            int var17 = var6.field2597 * var15 + var16;
                            int var18 = class495.field6799[var7 ? var3 + 1 : var3].method2476(var9 + 1, var5, -1);
                            int var19 = var18 + (var6.field2597 * var15);
                            int var20 = var5 << class679.field9600;
                            int var21 = var8 << class679.field9600;
                            int var22 = (var9 << class679.field9600) + class253.field3624;
                            class792.field10863[class393.field5456++] = new class131(1, var3, var6.field2602 + var20, var6.field2602 + var20, var6.field2602 + var20, var20 - -var6.field2602, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class514.field7096[var23][var5][var24].field2597 = (short) (class514.field7096[var23][var5][var24].field2597 * -1);
                                }
                            }
                        }
                        if (var6.field2601 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class172 var29 = class514.field7096[var3][var5 - 1][var4];
                            int var30 = class495.field6799[var3].method2476(var4, var5, -1);
                            while (var25 > 0 && var29 != null && var29.field2601 < 0 && var6.field2601 == var29.field2601 && var6.field2596 == var29.field2596 && class495.field6799[var3].method2476(var4, var25 - 1, -1) == var30 && (var25 - 1 <= 0 || var30 == class495.field6799[var3].method2476(var4, var25 - 2, -1))) {
                                var25--;
                                var29 = class514.field7096[var3][var25 - 1][var4];
                            }
                            for (class172 var31 = class514.field7096[var3][var5 + 1][var4]; class42.field520 > var26 && var31 != null && var31.field2601 < 0 && var6.field2601 == var31.field2601 && var6.field2596 == var31.field2596 && class495.field6799[var3].method2476(var4, var26 + 1, -1) == var30 && (class42.field520 <= (var26 + 1) || class495.field6799[var3].method2476(var4, var26 + 2, -1) == var30); var31 = class514.field7096[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class495.field6799[var7 ? var3 + 1 : var3].method2476(var4, var25, -1);
                            int var34 = var6.field2601 * var32 + var33;
                            int var35 = class495.field6799[var7 ? var3 + 1 : var3].method2476(var4, var26 + 1, -1);
                            int var36 = var35 + (var6.field2601 * var32);
                            int var37 = var25 << class679.field9600;
                            int var38 = (var26 << class679.field9600) + class253.field3624;
                            int var39 = var4 << class679.field9600;
                            class792.field10863[class393.field5456++] = new class131(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field2596 + var39, var39 - -var6.field2596, var6.field2596 + var39, var6.field2596 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class514.field7096[var40][var41][var4].field2601 = (short) (class514.field7096[var40][var41][var4].field2601 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class401.field5524 = arg0;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public static void method2872(int arg0) {
        field6753 = null;
        int var1 = -59 % ((arg0 - 78) / 46);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I[[ZZIII)V")
    public final void method2873(int arg0, boolean[][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6752++;
        this.field6749.method946(-1, false);
        this.field6749.method960(false, 0);
        this.field6749.method1022(-93, 1);
        this.field6749.method949(1, (byte) 57);
        int var7 = -57 / ((1 - arg4) / 47);
        this.field6749.method963(-2, false, (byte) -124, false);
        float var8 = 1.0F / (float) (this.field6749.field1872 * 128);
        if (arg2) {
            for (int var9 = 0; var9 < this.field6744; var9++) {
                int var10 = var9 << this.field6742;
                int var11 = var9 + 1 << this.field6742;
                label142: for (int var12 = 0; var12 < this.field6747; var12++) {
                    if (this.field6739[var12][var9] != null) {
                        int var13 = var12 << this.field6742;
                        int var14 = var12 + 1 << this.field6742;
                        for (int var15 = var13; var15 < var14; var15++) {
                            if (var15 - arg3 >= -arg0 && (var15 - arg3) <= arg0) {
                                for (int var16 = var10; var16 < var11; var16++) {
                                    if ((var16 - arg5) >= (-arg0) && var16 - arg5 <= arg0 && arg1[var15 + arg0 - arg3][arg0 + var16 - arg5]) {
                                        class742 var17 = this.field6749.method943(-23324);
                                        var17.method4086(var8, 0, 1.0F, var8);
                                        var17.method1558(-var12, -var9, 0);
                                        this.field6749.method983(79, class608.field8647);
                                        this.field6739[var12][var9].method1511(false);
                                        continue label142;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < this.field6744; var18++) {
                int var19 = var18 << this.field6742;
                int var20 = var18 + 1 << this.field6742;
                for (int var21 = 0; var21 < this.field6747; var21++) {
                    class219 var22 = this.field6739[var21][var18];
                    if (var22 != null) {
                        class463 var23 = this.field6749.method942(var22.field3205 * 3, (byte) 83);
                        Buffer var24 = var23.method1440(true, -15169);
                        if (var24 != null) {
                            Stream var25 = this.field6749.method1007(1, var24);
                            int var26 = 0;
                            int var27 = var21 << this.field6742;
                            int var28 = var21 + 1 << this.field6742;
                            for (int var29 = var19; var29 < var20; var29++) {
                                if ((-arg0) <= (var29 - arg5) && (var29 - arg5) <= arg0) {
                                    int var31 = this.field6741.field5808 * var29 + var27;
                                    for (int var32 = var27; var32 < var28; var32++) {
                                        if (var32 - arg3 >= -arg0 && arg0 >= (var32 - arg3) && arg1[arg0 + var32 - arg3][var29 + arg0 - arg5]) {
                                            short[] var33 = this.field6741.field1460[var31];
                                            if (var33 != null) {
                                                if (Stream.method2263()) {
                                                    for (int var34 = 0; var34 < var33.length; var34++) {
                                                        var25.method2259(var33[var34] & 0xFFFF);
                                                        var26++;
                                                    }
                                                } else {
                                                    for (int var35 = 0; var35 < var33.length; var35++) {
                                                        var26++;
                                                        var25.method2252(var33[var35] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var31++;
                                    }
                                }
                            }
                            var25.method2255();
                            if (var23.method1441(32416) && var26 > 0) {
                                class742 var30 = this.field6749.method943(-23324);
                                var30.method4086(var8, 0, 1.0F, var8);
                                var30.method1558(-var21, -var18, 0);
                                this.field6749.method983(87, class608.field8647);
                                var22.method1507(var23, var26 / 3, 94);
                            }
                        }
                    }
                }
            }
        }
        this.field6749.method1013(true);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lr;III)V")
    public final void method2874(class115 arg0, int arg1, int arg2, int arg3) {
        field6737++;
        class401 var5 = (class401) arg0;
        int var6 = var5.field5523 + arg3 + 1;
        int var7 = var5.field5536 + arg2 + 1;
        int var8 = this.field6751 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5527;
        int var11 = var5.field5529;
        int var12 = this.field6751 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field6751 * var14;
            var10 -= var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        if (this.field6746 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field6746;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var7 = 1;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
        }
        if (var7 + var11 >= this.field6751) {
            int var17 = var11 + var7 + 1 - this.field6751;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class322.method1950(var12, var9, var13, this.field6750, var8, var10, var11, -24962, var5.field5528);
        this.method2877(var7, var6, var11, var10, 104);
        if (arg1 > -57) {
            method2871(true);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILr;I)V")
    public final void method2875(int arg0, int arg1, class115 arg2, int arg3) {
        field6754++;
        class401 var5 = (class401) arg2;
        int var6 = var5.field5523 + arg0 + 1;
        if (arg3 <= 121) {
            return;
        }
        int var7 = var5.field5536 + arg1 + 1;
        int var8 = this.field6751 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5527;
        int var11 = var5.field5529;
        int var12 = this.field6751 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field6751 * var13;
        }
        int var14 = 0;
        if (this.field6746 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field6746;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var9 += var16;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field6751 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field6751;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class778.method4278(var12, var8, var14, var9, this.field6750, 23068, var5.field5528, var11, var10);
            this.method2877(var7, var6, var11, var10, -97);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BIILr;)Z")
    public final boolean method2876(byte arg0, int arg1, int arg2, class115 arg3) {
        field6743++;
        class401 var5 = (class401) arg3;
        int var6 = var5.field5536 + arg1 + 1;
        int var7 = var5.field5523 + arg2 + 1;
        if (arg0 >= -123) {
            method2872(-115);
        }
        int var8 = this.field6751 * var7 + var6;
        int var9 = var5.field5527;
        int var10 = var5.field5529;
        int var11 = this.field6751 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var7 = 1;
            var8 += this.field6751 * var12;
        }
        if (this.field6746 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field6746;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var11 += var14;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field6751) {
            int var15 = var6 + var10 + 1 - this.field6751;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6751 + var11;
            return class416.method2442(var10, var8, var16, -26065, this.field6750, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIII)V")
    private final void method2877(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6740++;
        if (this.field6739 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg2 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 - (1 + 1 - arg3) >> 7;
        int var10 = 123 / ((43 - arg4) / 61);
        for (int var11 = var6; var11 <= var7; var11++) {
            class219[] var12 = this.field6739[var11];
            for (int var13 = var8; var13 <= var9; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field3204 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lmj;Lsl;)V")
    public class492(class114 arg0, class99 arg1) {
        this.field6749 = arg0;
        this.field6741 = arg1;
        this.field6751 = (this.field6741.field5808 * this.field6741.field5805 >> this.field6749.field1892) + 2;
        this.field6746 = (this.field6741.field5809 * this.field6741.field5805 >> this.field6749.field1892) + 2;
        this.field6742 = this.field6749.field1892 + 7 - this.field6741.field5807;
        this.field6750 = new byte[this.field6751 * this.field6746];
        this.field6747 = this.field6741.field5808 >> this.field6742;
        this.field6744 = this.field6741.field5809 >> this.field6742;
    }
}
