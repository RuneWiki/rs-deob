import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class313 extends class235 {

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "[I")
    private int[] field4486;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "[I")
    private int[] field4475;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lak;")
    private class220 field4489;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Lak;")
    private class220 field4479;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "Lak;")
    private class220 field4480;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "[Lak;")
    private class220[] field4487;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "Z")
    public static boolean field4483 = false;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field4484 = 0;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4478;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "[[B")
    public static byte[][] field4482;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[[I")
    public static int[][] field4477;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILfl;ZDILqj;B)[I")
    public final int[] method1953(int arg0, class386 arg1, boolean arg2, double arg3, int arg4, class238 arg5, byte arg6) {
        if (arg6 != -37) {
            this.field4479 = null;
        }
        class119.field1606 = arg5;
        class312.field4460 = arg1;
        field4492++;
        for (int var9 = 0; var9 < this.field4487.length; var9++) {
            this.field4487[var9].method1368(-94, arg0, arg4);
        }
        class353.method2322(true, arg3);
        class361.method2372(arg0, arg4, 100);
        int[] var10 = new int[arg0 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4479.field3131) {
                int[] var14 = this.field4479.method43(-11543, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4479.method1(var12, 0);
                var17 = var18[0];
                var15 = var18[2];
                var16 = var18[1];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4480.field3131) {
                var19 = this.field4480.method43(-11543, var12);
            } else {
                var19 = this.field4480.method1(var12, arg6 ^ 0xFFFFFFDB)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class327.field4703[var22];
                int var25 = class327.field4703[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class327.field4703[var23];
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
                var10[var11++] = (var27 << 24) + (var24 << 8) + (var25 << 16) + var26;
                if (arg2) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4487.length; var13++) {
            this.field4487[var13].method1367(arg6 ^ 0xFFFFFFD4);
        }
        return var10;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lro;ZII)V")
    public static final void method1954(class249 arg0, boolean arg1, int arg2, int arg3) {
        field4481++;
        class261.field3792 = arg3;
        class405.field6087 = arg2;
        class168.field2209 = arg0;
        if (!arg1) {
            field4484 = 116;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqj;IILfl;IZ)[F")
    public final float[] method1955(class238 arg0, int arg1, int arg2, class386 arg3, int arg4, boolean arg5) {
        class119.field1606 = arg0;
        field4485++;
        class312.field4460 = arg3;
        for (int var7 = 0; var7 < this.field4487.length; var7++) {
            this.field4487[var7].method1368(74, arg4, arg1);
        }
        class361.method2372(arg4, arg1, 73);
        float[] var8 = new float[arg1 * arg4 * 4];
        if (arg2 <= 119) {
            field4488 = -67;
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4479.field3131) {
                int[] var12 = this.field4479.method43(-11543, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4479.method1(var10, 0);
                var13 = var16[1];
                var15 = var16[2];
                var14 = var16[0];
            }
            int[] var17;
            if (this.field4480.field3131) {
                var17 = this.field4480.method43(-11543, var10);
            } else {
                var17 = this.field4480.method1(var10, 0)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4489.field3131) {
                var18 = this.field4489.method43(-11543, var10);
            } else {
                var18 = this.field4489.method1(var10, 0)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4487.length; var11++) {
            this.field4487[var11].method1367(15);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
    public static final void method1956(int arg0, int arg1) {
        field4490++;
        if (arg0 < arg1 || arg0 > 2) {
            arg0 = 0;
        }
        class39.field626 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILfl;Lqj;)Z")
    public final boolean method1957(int arg0, class386 arg1, class238 arg2) {
        field4476++;
        if (class145.field1912 > 0) {
            for (int var4 = 0; var4 < this.field4475.length; var4++) {
                if (!arg2.method1462(this.field4475[var4], class145.field1912, 111)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4475.length; var5++) {
                if (!arg2.method1451(-110, this.field4475[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4486.length; var6++) {
            if (!arg1.method1756(false, this.field4486[var6])) {
                return false;
            }
        }
        return arg0 <= 120 ? true : true;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Z)V")
    public static void method1958(boolean arg0) {
        if (!arg0) {
            method1956(88, -43);
        }
        field4482 = null;
        field4477 = null;
        field4478 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIDILqj;Lfl;ZZ)[I")
    public final int[] method1959(boolean arg0, int arg1, double arg2, int arg3, class238 arg4, class386 arg5, boolean arg6, boolean arg7) {
        field4491++;
        class312.field4460 = arg5;
        class119.field1606 = arg4;
        for (int var10 = 0; var10 < this.field4487.length; var10++) {
            this.field4487[var10].method1368(-107, arg1, arg3);
        }
        class353.method2322(!arg0, arg2);
        class361.method2372(arg1, arg3, 43);
        int[] var11 = new int[arg1 * arg3];
        byte var12;
        int var13;
        int var14;
        if (arg7) {
            var12 = -1;
            var13 = -1;
            var14 = arg3 - 1;
        } else {
            var14 = 0;
            var13 = arg3;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4479.field3131) {
                int[] var18 = this.field4479.method43(-11543, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4479.method1(var16, 0);
                var20 = var22[1];
                var21 = var22[2];
                var19 = var22[0];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class327.field4703[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class327.field4703[var24];
                int var29 = class327.field4703[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4487.length; var17++) {
            this.field4487[var17].method1367(15);
        }
        if (arg0) {
            field4478 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class313() {
        this.field4486 = new int[0];
        this.field4475 = new int[0];
        this.field4489 = new class154(0);
        this.field4489.field3128 = 1;
        this.field4479 = new class154();
        this.field4479.field3128 = 1;
        this.field4480 = new class154();
        this.field4487 = new class220[] { this.field4479, this.field4480, this.field4489 };
        this.field4480.field3128 = 1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lil;)V")
    public class313(class265 arg0) {
        int var2 = arg0.method1697(112);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4487 = new class220[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class220 var16 = class235.method1437(0, arg0);
            if (var16.method1363((byte) 122) >= 0) {
                var3++;
            }
            if (var16.method1362(-3) >= 0) {
                var4++;
            }
            int var17 = var16.field3139.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1697(105);
            }
            this.field4487[var6] = var16;
        }
        this.field4475 = new int[var3];
        int var7 = 0;
        this.field4486 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class220 var11 = this.field4487[var9];
            int var12 = var11.field3139.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3139[var13] = this.field4487[var5[var9][var13]];
            }
            int var14 = var11.method1363((byte) 117);
            int var15 = var11.method1362(-3);
            if (var14 > 0) {
                this.field4475[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4486[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4479 = this.field4487[arg0.method1697(-85)];
        this.field4480 = this.field4487[arg0.method1697(97)];
        this.field4489 = this.field4487[arg0.method1697(-54)];
        Object var10 = null;
    }
}
