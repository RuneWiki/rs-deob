import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class327 {

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lfo;")
    private class473 field4253;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Low;")
    private class314 field4257;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[B")
    public byte[] field4250;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4260 = 0;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field4262 = 0;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[[Lcu;")
    private class201[][] field4256;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[[ZIZZI)V", line = 7)
    public final void method1849(int arg0, boolean[][] arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        this.field4253.method2702(false, (byte) 95);
        field4258++;
        this.field4253.method2716(arg3, false);
        this.field4253.method2750(1, (byte) -73);
        this.field4253.method2725(1, -31628);
        this.field4253.method2733(-2, 86, false, false);
        float var7 = 1.0F / (float) (this.field4253.field6791 * 128);
        if (arg4) {
            for (int var26 = 0; var26 < this.field4247; var26++) {
                int var27 = var26 << this.field4259;
                int var28 = var26 + 1 << this.field4259;
                label91: for (int var29 = 0; var29 < this.field4255; var29++) {
                    if (this.field4256[var29][var26] != null) {
                        int var30 = var29 << this.field4259;
                        int var31 = var29 + 1 << this.field4259;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if (var32 - arg0 >= -arg2 && (var32 - arg0) <= arg2) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((-arg2) <= (var33 - arg5) && arg2 >= (var33 - arg5) && arg1[arg2 + var32 - arg0][arg2 + var33 - arg5]) {
                                        class667 var34 = this.field4253.method2730(114);
                                        var34.method3759(var7, var7, (byte) 43, 1.0F);
                                        var34.method235(-var29, -var26, 0);
                                        this.field4253.method2689(false, class170.field2044);
                                        this.field4256[var29][var26].method1227(-12447);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4247; var8++) {
                int var9 = var8 << this.field4259;
                int var10 = var8 + 1 << this.field4259;
                for (int var11 = 0; var11 < this.field4255; var11++) {
                    class201 var12 = this.field4256[var11][var8];
                    if (var12 != null) {
                        class180 var13 = this.field4253.method2698(-95, var12.field2454 * 3);
                        Buffer var14 = var13.method167(18829, true);
                        if (var14 != null) {
                            Stream var15 = this.field4253.method2714(var14, (byte) 7);
                            int var16 = 0;
                            int var17 = var11 << this.field4259;
                            int var18 = var11 + 1 << this.field4259;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (-arg2 <= var19 - arg5 && arg2 >= var19 - arg5) {
                                    int var21 = this.field4257.field1558 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg0) >= (-arg2) && (var22 - arg0) <= arg2 && arg1[var22 + arg2 - arg0][var19 + arg2 - arg5]) {
                                            short[] var23 = this.field4257.field4076[var21];
                                            if (var23 != null) {
                                                if (Stream.method3440()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method3435(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method3439(var23[var25] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3434();
                            if (var13.method170(9406) && var16 > 0) {
                                class667 var20 = this.field4253.method2730(93);
                                var20.method3759(var7, var7, (byte) 43, 1.0F);
                                var20.method235(-var11, -var8, 0);
                                this.field4253.method2689(false, class170.field2044);
                                var12.method1228(var13, 28339, var16 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field4253.method2699((byte) -51);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILw;II)V", line = 204)
    public final void method1850(int arg0, class269 arg1, int arg2, int arg3) {
        field4248++;
        if (arg3 != 29668) {
            this.method1852(-46, 54, null, (byte) 105);
        }
        class490 var5 = (class490) arg1;
        int var6 = var5.field7114 + arg0 + 1;
        int var7 = var5.field7106 + arg2 + 1;
        int var8 = this.field4263 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7105;
        int var11 = var5.field7103;
        int var12 = this.field4263 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var8 += this.field4263 * var14;
            var9 += var11 * var14;
        }
        if ((var7 + var10) >= this.field4254) {
            int var15 = var7 + var10 - (this.field4254 + -1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var13 += var16;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
            var6 = 1;
        }
        if (this.field4263 <= (var6 + var11)) {
            int var17 = var6 - (this.field4263 - var11 - 1);
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class403.method2191(var8, var11, var9, var10, var13, this.field4250, 0, var12, var5.field7113);
            this.method1851(var6, 35, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V", line = 278)
    private final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4251++;
        if (this.field4256 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg4 + arg0 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        int var10 = -20 / ((-arg1 - 3) / 37);
        for (int var11 = var6; var11 <= var7; var11++) {
            class201[] var12 = this.field4256[var11];
            for (int var13 = var8; var13 <= var9; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field2466 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILw;B)Z", line = 333)
    public final boolean method1852(int arg0, int arg1, class269 arg2, byte arg3) {
        field4261++;
        class490 var5 = (class490) arg2;
        int var6 = var5.field7114 + arg0 + 1;
        int var7 = var5.field7106 + arg1 + 1;
        int var8 = var6 + (this.field4263 * var7);
        int var9 = var5.field7105;
        int var10 = var5.field7103;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var9 -= var11;
            var8 += this.field4263 * var11;
        }
        int var12 = this.field4263 - var10;
        if (arg3 != 65) {
            this.method1850(118, null, 88, -72);
        }
        if ((var7 + var9) >= this.field4254) {
            int var13 = var7 + var9 + 1 - this.field4254;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var12 += var14;
            var6 = 1;
            var8 += var14;
        }
        if (var6 + var10 >= this.field4263) {
            int var15 = var6 + var10 + 1 - this.field4263;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4263 + var12;
            return class534.method3041(var8, var10, 0, this.field4250, var17, var9, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lw;BII)V", line = 410)
    public final void method1853(class269 arg0, byte arg1, int arg2, int arg3) {
        field4252++;
        class490 var5 = (class490) arg0;
        int var6 = var5.field7114 + arg3 + 1;
        if (arg1 != -101) {
            this.method1853(null, (byte) 82, -23, -104);
        }
        int var7 = var5.field7106 + arg2 + 1;
        int var8 = var6 + (this.field4263 * var7);
        int var9 = 0;
        int var10 = var5.field7105;
        int var11 = var5.field7103;
        int var12 = this.field4263 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field4263 * var13;
            var7 = 1;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field4254 <= (var7 + var10)) {
            int var15 = var7 - this.field4254 - (-var10 + -1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var11 -= var16;
            var14 += var16;
            var6 = 1;
            var8 += var16;
            var9 += var16;
        }
        if ((var6 + var11) >= this.field4263) {
            int var17 = var6 + var11 + 1 - this.field4263;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class651.method3674(this.field4250, var10, var12, var11, var9, -128, var14, var8, var5.field7113);
            this.method1851(var6, 125, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 488)
    public final void method1854(byte arg0) {
        this.field4256 = new class201[this.field4255][this.field4247];
        field4249++;
        for (int var2 = 0; var2 < this.field4247; var2++) {
            for (int var3 = 0; var3 < this.field4255; var3++) {
                this.field4256[var3][var2] = new class201(this.field4253, this, this.field4257, var3, var2, this.field4259, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field4256[var3][var2].field2454 == 0) {
                    this.field4256[var3][var2] = null;
                }
            }
        }
        if (arg0 != -65) {
            this.method1849(9, null, 32, true, true, 127);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lfo;Low;)V", line = 519)
    public class327(class473 arg0, class314 arg1) {
        this.field4253 = arg0;
        this.field4257 = arg1;
        this.field4263 = (this.field4257.field1561 * this.field4257.field1558 >> this.field4253.field6795) + 2;
        this.field4254 = (this.field4257.field1562 * this.field4257.field1561 >> this.field4253.field6795) + 2;
        this.field4259 = this.field4253.field6795 + 7 - this.field4257.field1560;
        this.field4250 = new byte[this.field4263 * this.field4254];
        this.field4255 = this.field4257.field1558 >> this.field4259;
        this.field4247 = this.field4257.field1562 >> this.field4259;
    }
}
