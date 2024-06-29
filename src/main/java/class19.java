import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class19 extends class187 {

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "[I")
    private int[] field194;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "[I")
    private int[] field186;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "Lmr;")
    private class83 field182;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "Lmr;")
    private class83 field183;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "Lmr;")
    private class83 field189;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "[Lmr;")
    private class83[] field193;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "[I")
    public static int[] field191 = new int[5];

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "[Z")
    public static boolean[] field192 = new boolean[8];

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "[S")
    public static short[] field184;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([ILur;B[I[I)V", line = 4)
    public static final void method87(int[] arg0, class91 arg1, byte arg2, int[] arg3, int[] arg4) {
        field181++;
        if (arg2 != 123) {
            field187 = 49;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg1.field6051.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field6051[var9] = null;
                    } else {
                        class208 var10 = class193.method1037(67, var6);
                        int var11 = var10.field2806;
                        class395 var12 = arg1.field6051[var9];
                        if (var12 != null) {
                            if (var12.field5685 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field6051[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5680 = 0;
                                    var12.field5681 = var8;
                                    var12.field5684 = 0;
                                    var12.field5691 = 0;
                                    var12.field5683 = 1;
                                    class320.method1848(false, -89, var10, 0, arg1.field152, arg1.field154);
                                } else if (var11 == 2) {
                                    var12.field5680 = 0;
                                }
                            } else if (var10.field2819 >= class193.method1037(124, var12.field5685).field2819) {
                                var12 = arg1.field6051[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class395 var13 = arg1.field6051[var9] = new class395();
                            var13.field5684 = 0;
                            var13.field5683 = 1;
                            var13.field5691 = 0;
                            var13.field5685 = var6;
                            var13.field5680 = 0;
                            var13.field5681 = var8;
                            class320.method1848(false, -67, var10, 0, arg1.field152, arg1.field154);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lal;IZLam;ZIID)[I", line = 105)
    public final int[] method88(class369 arg0, int arg1, boolean arg2, class286 arg3, boolean arg4, int arg5, int arg6, double arg7) {
        class58.field598 = arg3;
        class149.field1883 = arg0;
        field185++;
        for (int var10 = 0; var10 < this.field193.length; var10++) {
            this.field193[var10].method116(arg5, arg1, arg6 ^ 0x76);
        }
        class293.method1724(arg7, 122);
        class345.method2022(arg5, arg1, true);
        int[] var11 = new int[arg1 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = arg5 - 1;
            var14 = -1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = arg5;
            var14 = 1;
        }
        int var15 = 0;
        if (arg6 != 1) {
            this.field186 = null;
        }
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field183.field924) {
                int[] var22 = this.field183.method37(2, var16);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field183.method21(true, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class173.field2168[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class173.field2168[var24];
                int var29 = class173.field2168[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field193.length; var17++) {
            this.field193[var17].method114((byte) 127);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V", line = 253)
    public static void method89(int arg0) {
        field184 = null;
        field191 = null;
        field192 = null;
        if (arg0 != -1) {
            method87((int[]) null, (class91) null, (byte) 107, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lal;ILam;)Z", line = 275)
    public final boolean method90(class369 arg0, int arg1, class286 arg2) {
        field180++;
        if (class161.field2069 <= 0) {
            for (int var4 = 0; var4 < this.field186.length; var4++) {
                if (!arg2.method1673(-111, this.field186[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field186.length; var5++) {
                if (!arg2.method1675(this.field186[var5], class161.field2069, arg1)) {
                    return false;
                }
            }
        }
        for (int var6 = arg1; var6 < this.field194.length; var6++) {
            if (!arg0.method1665(this.field194[var6], (byte) -125)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lam;IZIILal;)[F", line = 327)
    public final float[] method91(class286 arg0, int arg1, boolean arg2, int arg3, int arg4, class369 arg5) {
        field190++;
        class149.field1883 = arg5;
        class58.field598 = arg0;
        for (int var7 = 0; var7 < this.field193.length; var7++) {
            this.field193[var7].method116(arg3, arg4, arg1 ^ 0x7C);
        }
        class345.method2022(arg3, arg4, true);
        float[] var8 = new float[arg4 * 4 * arg3];
        int var9 = 0;
        for (int var10 = arg1; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field183.field924) {
                int[] var12 = this.field183.method37(2, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field183.method21(true, var10);
                var14 = var16[2];
                var15 = var16[1];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field189.field924) {
                var17 = this.field189.method37(2, var10);
            } else {
                var17 = this.field189.method21(true, var10)[0];
            }
            int[] var18;
            if (this.field182.field924) {
                var18 = this.field182.method37(2, var10);
            } else {
                var18 = this.field182.method21(true, var10)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field193.length; var11++) {
            this.field193[var11].method114((byte) 112);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lam;IZBILal;D)[I", line = 437)
    public final int[] method92(class286 arg0, int arg1, boolean arg2, byte arg3, int arg4, class369 arg5, double arg6) {
        class149.field1883 = arg5;
        class58.field598 = arg0;
        field188++;
        for (int var9 = 0; var9 < this.field193.length; var9++) {
            this.field193[var9].method116(arg4, arg1, 113);
        }
        class293.method1724(arg6, 120);
        class345.method2022(arg4, arg1, true);
        int[] var10 = new int[arg1 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field183.field924) {
                int[] var18 = this.field183.method37(2, var12);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field183.method21(true, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field189.field924) {
                var19 = this.field189.method37(2, var12);
            } else {
                var19 = this.field189.method21(true, var12)[0];
            }
            if (arg2) {
                var11 = var12;
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class173.field2168[var22];
                int var25 = class173.field2168[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class173.field2168[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                if (arg2) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field193.length; var13++) {
            this.field193[var13].method114((byte) 124);
        }
        if (arg3 <= 17) {
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V", line = 578)
    public class19() {
        this.field194 = new int[0];
        this.field186 = new int[0];
        this.field182 = new class7(0);
        this.field182.field919 = 1;
        this.field183 = new class7();
        this.field183.field919 = 1;
        this.field189 = new class7();
        this.field193 = new class83[] { this.field183, this.field189, this.field182 };
        this.field189.field919 = 1;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ltq;)V", line = 593)
    public class19(class250 arg0) {
        int var2 = arg0.method1350(31351);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field193 = new class83[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class83 var16 = class143.method780(arg0, -78);
            if (var16.method159(true) >= 0) {
                var3++;
            }
            if (var16.method117((byte) 25) >= 0) {
                var4++;
            }
            int var17 = var16.field930.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1350(31351);
            }
            this.field193[var6] = var16;
        }
        this.field186 = new int[var3];
        int var7 = 0;
        this.field194 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class83 var11 = this.field193[var9];
            int var12 = var11.field930.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field930[var13] = this.field193[var5[var9][var13]];
            }
            int var14 = var11.method159(true);
            int var15 = var11.method117((byte) 25);
            if (var14 > 0) {
                this.field186[var7++] = var14;
            }
            if (var15 > 0) {
                this.field194[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field183 = this.field193[arg0.method1350(31351)];
        this.field189 = this.field193[arg0.method1350(31351)];
        this.field182 = this.field193[arg0.method1350(31351)];
        Object var10 = null;
    }
}
