import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class384 extends class478 {

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    private int field5188 = 1;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    private int field5186 = 1;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "Lcq;")
    public static class110 field5185 = new class110(98, 2);

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "[[Z")
    public static boolean[][] field5191 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "F")
    public static float field5190;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)I")
    public static final int method2201(int arg0, int arg1) {
        ++field5183;
        if (arg0 != 4288) {
            method2201(37, 31);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public static void method2202(int arg0) {
        if (arg0 != 2) {
            field5191 = null;
        }
        field5185 = null;
        field5191 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZIII)V")
    public static final void method2203(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class206.field2456 = arg5;
        class129.field1453 = arg6;
        class555.field7930 = arg0;
        ++field5182;
        if (arg3) {
            class362.field4857 = arg2;
            class246.field3039 = arg4;
            class145.field1603 = arg1;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class384() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field5184;
        int[] var3 = super.field6886.method789(arg0, (byte) 123);
        if (arg1 != -11323) {
            field5191 = null;
        }
        if (super.field6886.field1592) {
            int var4 = this.field5188 + this.field5188 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5186 - (-this.field5186 + -1);
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field5188; var9 <= this.field5188 + arg0; ++var9) {
                int[] var13 = this.method2752(var9 & class156.field1746, -79, 0);
                int[] var14 = new int[class436.field6154];
                int var15 = 0;
                for (int var16 = -this.field5186; var16 <= this.field5186; ++var16) {
                    var15 += var13[var16 & class204.field2414];
                }
                int var17 = 0;
                while (class436.field6154 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class204.field2414 & -this.field5186 + var17];
                    ++var17;
                    var15 = var13[this.field5186 + var17 & class204.field2414] + var18;
                }
                var8[var9 - (-this.field5188 - -arg0)] = var14;
            }
            for (int var10 = 0; ~class436.field6154 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            field5185 = null;
        }
        ++field5189;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field6881 = arg1.method620((byte) -126) == 1;
                }
            } else {
                this.field5188 = arg1.method620((byte) -127);
            }
        } else {
            this.field5186 = arg1.method620((byte) -126);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        if (!arg0) {
            method2204(-59);
        }
        ++field5181;
        int[][] var3 = super.field6889.method2091(-14, arg1);
        if (super.field6889.field4765) {
            int var4 = this.field5188 + 1 - -this.field5188;
            int var5 = 65536 / var4;
            int var6 = this.field5186 + this.field5186 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field5188 + arg1; ~(this.field5188 + arg1) <= ~var9; ++var9) {
                int[][] var19 = this.method2753(0, class156.field1746 & var9, (byte) 11);
                int[][] var20 = new int[3][class436.field6154];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5186; ~var27 >= ~this.field5186; ++var27) {
                    int var37 = class204.field2414 & var27;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class436.field6154 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class204.field2414 & -this.field5186 + var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    ++var31;
                    int var36 = var31 - -this.field5186 & class204.field2414;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[-arg1 + var9 - -this.field5188] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class436.field6154 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
    public static final void method2204(int arg0) {
        ++field5187;
        try {
            if (class258.field3249 == 1) {
                int var1 = class291.field3642.method524((byte) -45);
                if (~var1 < -1 && class291.field3642.method513((byte) 83)) {
                    int var2 = var1 - class469.field6710;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class291.field3642.method514(false, var2);
                    return;
                }
                class291.field3642.method492((byte) -44);
                class291.field3642.method503((byte) -100);
                class549.field7864 = null;
                if (class25.field217 == null) {
                    class258.field3249 = 0;
                } else {
                    class258.field3249 = 2;
                }
                class226.field2800 = null;
            }
            if (~class258.field3249 == -4) {
                int var3 = class291.field3642.method524((byte) -45);
                if (~class168.field1878 < ~var3 && class291.field3642.method513((byte) 118)) {
                    int var4 = class105.field1130 + var3;
                    if (~var4 < ~class168.field1878) {
                        var4 = class168.field1878;
                    }
                    class291.field3642.method514(false, var4);
                    return;
                }
                class258.field3249 = 0;
                class105.field1130 = 0;
            }
            if (arg0 > -77) {
                field5185 = null;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class291.field3642.method492((byte) -44);
            class25.field217 = null;
            class258.field3249 = 0;
            class226.field2800 = null;
            class549.field7864 = null;
        }
    }
}
