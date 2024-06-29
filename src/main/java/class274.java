import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class274 extends class36 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[I")
    private int[] field4104;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[I")
    private int[] field4114;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Llf;")
    private class317 field4118;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Llf;")
    private class317 field4103;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Llf;")
    private class317 field4117;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "[Llf;")
    private class317[] field4111;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4107 = "Face here";

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field4109 = 1;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lnc;")
    public static class161 field4105;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "[I")
    public static int[] field4115;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 4)
    public static final void method1882(int arg0) {
        class294.field4369 = -1;
        class90.field1264.field4777 = 0;
        class199.field2843 = -1;
        class149.field2065 = 0;
        class326.field4931 = -1;
        class167.field2278 = arg0;
        class72.field996 = 0;
        class204.field2938 = 0;
        class199.field2833 = 0;
        class157.field2165.field4777 = 0;
        class100.field1380 = false;
        class198.field2768 = 0;
        field4112++;
        class159.field2179 = -1;
        for (int var1 = 0; var1 < class169.field2306.length; var1++) {
            if (class169.field2306[var1] != null) {
                class169.field2306[var1].field3676 = -1;
            }
        }
        for (int var2 = 0; var2 < class42.field484.length; var2++) {
            if (class42.field484[var2] != null) {
                class42.field484[var2].field3676 = -1;
            }
        }
        class237.method1628((byte) -120);
        class343.field5168 = 1;
        class189.method1325(1, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class121.field1644[var3] = true;
        }
        class304.method2071(-13658);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 63)
    public static void method1883(boolean arg0) {
        field4105 = null;
        field4115 = null;
        field4107 = null;
        if (!arg0) {
            method1883(false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZBDLkm;Lrf;)Lkn;", line = 82)
    public final class178 method1884(int arg0, int arg1, boolean arg2, byte arg3, double arg4, class133 arg5, class263 arg6) {
        class141.method1016(arg4, (byte) -57);
        class237.field3365 = arg6;
        class42.field486 = arg5;
        if (arg3 <= 20) {
            this.method1888((class133) null, true, (class263) null);
        }
        class111.method810(arg1, arg0, -1);
        field4116++;
        class178 var9 = new class178(arg1, arg0);
        for (int var10 = 0; var10 < this.field4111.length; var10++) {
            this.field4111[var10].method2224(true, arg1, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4103.field4835) {
                int[] var17 = this.field4103.method140(542, var12);
                var14 = var17;
                var16 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field4103.method53(34, var12);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            for (int var18 = 0; var18 != arg1; var18++) {
                int var19 = var16[var18] >> 4;
                int var20 = var15[var18] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var22 = class296.field4395[var20];
                int var23 = class296.field4395[var19];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class296.field4395[var21];
                var9.field2403[var11++] = (var24 << 16) - (-(var22 << 8) - var23);
                if (arg2) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field4111.length; var25++) {
            this.field4111[var25].method379(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkm;Lrf;DIZII)Lsl;", line = 199)
    public final class114 method1885(class133 arg0, class263 arg1, double arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class141.method1016(arg2, (byte) -125);
        class237.field3365 = arg1;
        class42.field486 = arg0;
        class111.method810(arg5, arg3, -1);
        field4113++;
        class114 var9 = new class114(arg5, arg3);
        for (int var10 = 0; var10 < this.field4111.length; var10++) {
            this.field4111[var10].method2224(true, arg5, arg3);
        }
        if (arg6 > -107) {
            this.field4104 = (int[]) null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4103.field4835) {
                int[] var17 = this.field4103.method140(542, var12);
                var16 = var17;
                var14 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field4103.method53(-74, var12);
                var14 = var13[2];
                var15 = var13[0];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field4117.field4835) {
                var18 = this.field4117.method140(542, var12);
            } else {
                var18 = this.field4117.method53(-88, var12)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class296.field4395[var21];
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = var16[var19] >> 4;
                int var24 = class296.field4395[var20];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class296.field4395[var23];
                int var26;
                if (var24 == 0 && var25 == 0 && var22 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field2403[var11++] = (var24 << 16) + (var25 << 8) + (var26 << 24) + var22;
                if (arg4) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field4111.length; var27++) {
            this.field4111[var27].method379(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Llf;", line = 335)
    public static final class317 method1886(int arg0, int arg1) {
        field4102++;
        if (arg1 == 0) {
            return new class173();
        } else if (arg1 == 1) {
            return new class254();
        } else if (arg1 == 2) {
            return new class288();
        } else if (arg1 == 3) {
            return new class103();
        } else if (arg1 == 4) {
            return new class289();
        } else if (arg1 == 5) {
            return new class101();
        } else if (arg1 == 6) {
            return new class262();
        } else if (arg1 == 7) {
            return new class167();
        } else if (arg1 == 8) {
            return new class242();
        } else if (arg1 == 9) {
            return new class201();
        } else if (arg1 == 10) {
            return new class73();
        } else if (arg1 == 11) {
            return new class92();
        } else if (arg1 == 12) {
            return new class210();
        } else if (arg1 == 13) {
            return new class24();
        } else if (arg1 == 14) {
            return new class203();
        } else if (arg1 == 15) {
            return new class169();
        } else if (arg1 == 16) {
            return new class334();
        } else if (arg1 == 17) {
            return new class10();
        } else if (arg1 == 18) {
            return new class296();
        } else if (arg1 == 19) {
            return new class106();
        } else if (arg1 == 20) {
            return new class275();
        } else if (arg1 == 21) {
            return new class189();
        } else if (arg1 == 22) {
            return new class70();
        } else if (arg1 == 23) {
            return new class117();
        } else if (arg1 == 24) {
            return new class130();
        } else if (arg1 == 25) {
            return new class107();
        } else if (arg1 == 26) {
            return new class39();
        } else if (arg1 == 27) {
            return new class217();
        } else if (arg1 == 28) {
            return new class310();
        } else if (arg1 == 29) {
            return new class54();
        } else if (arg1 == 30) {
            return new class109();
        } else if (arg1 == 31) {
            return new class286();
        } else if (arg1 == 32) {
            return new class142();
        } else if (arg1 == 33) {
            return new class21();
        } else if (arg1 == 34) {
            return new class116();
        } else if (arg1 == 35) {
            return new class315();
        } else if (arg1 == 36) {
            return new class55();
        } else if (arg1 == 37) {
            return new class111();
        } else if (arg1 == 38) {
            return new class255();
        } else if (arg1 == 39) {
            return new class136();
        } else {
            if (arg0 != -25826) {
                field4105 = (class161) null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIILrf;Lkm;)[F", line = 653)
    public final float[] method1887(boolean arg0, int arg1, int arg2, int arg3, class263 arg4, class133 arg5) {
        class42.field486 = arg5;
        field4100++;
        float[] var7 = new float[arg1 * 4 * arg3];
        class237.field3365 = arg4;
        class111.method810(arg3, arg1, -1);
        for (int var8 = 0; var8 < this.field4111.length; var8++) {
            this.field4111[var8].method2224(true, arg3, arg1);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field4103.field4835) {
                int[] var15 = this.field4103.method140(542, var10);
                var13 = var15;
                var12 = var15;
                var14 = var15;
            } else {
                int[][] var11 = this.field4103.method53(29, var10);
                var12 = var11[1];
                var13 = var11[0];
                var14 = var11[2];
            }
            int[] var16;
            if (this.field4117.field4835) {
                var16 = this.field4117.method140(542, var10);
            } else {
                var16 = this.field4117.method53(-100, var10)[0];
            }
            int[] var17;
            if (this.field4118.field4835) {
                var17 = this.field4118.method140(542, var10);
            } else {
                var17 = this.field4118.method53(-73, var10)[0];
            }
            for (int var18 = arg3 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = var19;
                if (arg0) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        if (arg2 > -9) {
            this.method1885((class133) null, (class263) null, -1.545417053190664D, 126, false, 126, -47);
        }
        for (int var21 = 0; var21 < this.field4111.length; var21++) {
            this.field4111[var21].method379(true);
        }
        return var7;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkm;ZLrf;)Z", line = 765)
    public final boolean method1888(class133 arg0, boolean arg1, class263 arg2) {
        field4101++;
        if (class21.field273 > 0) {
            for (int var4 = 0; var4 < this.field4104.length; var4++) {
                if (!arg0.method975((byte) 126, this.field4104[var4], class21.field273)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4104.length; var5++) {
                if (!arg0.method961(this.field4104[var5], (byte) -128)) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg1) {
            this.field4114 = (int[]) null;
        }
        while (var6 < this.field4114.length) {
            if (!arg2.method1508(this.field4114[var6], (byte) -76)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkm;IIZDLrf;IZ)[I", line = 822)
    public final int[] method1889(class133 arg0, int arg1, int arg2, boolean arg3, double arg4, class263 arg5, int arg6, boolean arg7) {
        class141.method1016(arg4, (byte) 97);
        class42.field486 = arg0;
        field4110++;
        if (arg2 > -83) {
            return (int[]) null;
        }
        class237.field3365 = arg5;
        int[] var10 = new int[arg1 * arg6];
        class111.method810(arg1, arg6, -1);
        for (int var11 = 0; var11 < this.field4111.length; var11++) {
            this.field4111[var11].method2224(true, arg1, arg6);
        }
        int var12;
        byte var13;
        int var14;
        if (arg3) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4103.field4835) {
                int[] var21 = this.field4103.method140(542, var16);
                var20 = var21;
                var18 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field4103.method53(76, var16);
                var18 = var17[1];
                var19 = var17[0];
                var20 = var17[2];
            }
            for (int var22 = var12; var22 != var14; var22 += var13) {
                int var23 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class296.field4395[var24];
                int var26 = var20[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class296.field4395[var23];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class296.field4395[var26];
                var10[var15++] = (var27 << 16) - (-(var25 << 8) - var28);
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field4111.length; var29++) {
            this.field4111[var29].method379(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(DLrf;IZLkm;BI)[I", line = 955)
    public final int[] method1890(double arg0, class263 arg1, int arg2, boolean arg3, class133 arg4, byte arg5, int arg6) {
        class141.method1016(arg0, (byte) 52);
        class42.field486 = arg4;
        field4108++;
        class237.field3365 = arg1;
        class111.method810(arg2, arg6, -1);
        int[] var9 = new int[arg6 * 4 * arg2];
        for (int var10 = 0; var10 < this.field4111.length; var10++) {
            this.field4111[var10].method2224(true, arg2, arg6);
        }
        int var11 = 0;
        int var12 = 0;
        int var13 = 102 / ((-arg5 - 25) / 60);
        while (var12 < arg6) {
            if (arg3) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4103.field4835) {
                int[] var14 = this.field4103.method140(542, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4103.method53(-77, var12);
                var17 = var18[1];
                var15 = var18[2];
                var16 = var18[0];
            }
            int[] var19;
            if (this.field4117.field4835) {
                var19 = this.field4117.method140(542, var12);
            } else {
                var19 = this.field4117.method53(51, var12)[0];
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                int var22 = var17[var20] >> 4;
                int var23 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class296.field4395[var21];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class296.field4395[var23];
                int var26 = class296.field4395[var22];
                int var27;
                if (var25 == 0 && var26 == 0 && var24 == 0) {
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
                var9[var11++] = (var25 << 16) + (var26 << 8) + (var27 << 24) + var24;
                if (arg3) {
                    var11 += arg2 - 1;
                }
            }
            var12++;
        }
        for (int var28 = 0; var28 < this.field4111.length; var28++) {
            this.field4111[var28].method379(true);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 1101)
    public class274() {
        this.field4104 = new int[0];
        this.field4114 = new int[0];
        this.field4118 = new class173(0);
        this.field4118.field4830 = 1;
        this.field4103 = new class173();
        this.field4103.field4830 = 1;
        this.field4117 = new class173();
        this.field4111 = new class317[] { this.field4103, this.field4117, this.field4118 };
        this.field4117.field4830 = 1;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lcg;)V", line = 1116)
    public class274(class316 arg0) {
        int var2 = arg0.method2219(16448);
        int var3 = 0;
        this.field4111 = new class317[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class317 var7 = class55.method378(arg0, true);
            if (var7.method990(-103) >= 0) {
                var3++;
            }
            if (var7.method377(14118) >= 0) {
                var4++;
            }
            int var8 = var7.field4842.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method2219(16448);
            }
            this.field4111[var6] = var7;
        }
        this.field4104 = new int[var3];
        this.field4114 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class317 var13 = this.field4111[var12];
            int var14 = var13.field4842.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4842[var15] = this.field4111[var5[var12][var15]];
            }
            int var16 = var13.method990(-107);
            int var17 = var13.method377(14118);
            if (var16 > 0) {
                this.field4104[var11++] = var16;
            }
            if (var17 > 0) {
                this.field4114[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field4103 = this.field4111[arg0.method2219(16448)];
        this.field4117 = this.field4111[arg0.method2219(16448)];
        this.field4118 = this.field4111[arg0.method2219(16448)];
        int[][] var18 = (int[][]) null;
    }
}
