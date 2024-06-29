import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class429 extends class525 {

    @OriginalMember(owner = "client!et", name = "B", descriptor = "[I")
    private int[] field6168;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "[I")
    private int[] field6171;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "Lpn;")
    private class535 field6178;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "Lpn;")
    private class535 field6172;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "Lpn;")
    private class535 field6167;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "[Lpn;")
    private class535[] field6169;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "[I")
    public static int[] field6173 = new int[256];

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "Ldl;")
    public static class45 field6177;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6173[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BIZLl;ILci;)[F", line = 4)
    public final float[] method2545(byte arg0, int arg1, boolean arg2, class16 arg3, int arg4, class320 arg5) {
        class402.field5711 = arg3;
        field6170++;
        class224.field3404 = arg5;
        for (int var7 = 0; var7 < this.field6169.length; var7++) {
            this.field6169[var7].method742(arg4, false, arg1);
        }
        class203.method1401((byte) 55, arg1, arg4);
        float[] var8 = new float[arg1 * arg4 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6172.field7878) {
                int[] var16 = this.field6172.method65(var10, 1);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field6172.method61(-117, var10);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field6167.field7878) {
                var17 = this.field6167.method65(var10, 1);
            } else {
                var17 = this.field6167.method61(-128, var10)[0];
            }
            int[] var18;
            if (this.field6178.field7878) {
                var18 = this.field6178.method65(var10, 1);
            } else {
                var18 = this.field6178.method61(-119, var10)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg0 < 59) {
            this.method2545((byte) 28, 35, true, null, 49, null);
        }
        for (int var11 = 0; var11 < this.field6169.length; var11++) {
            this.field6169[var11].method484(806);
        }
        return var8;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BILl;Lci;DZI)[I", line = 116)
    public final int[] method2546(byte arg0, int arg1, class16 arg2, class320 arg3, double arg4, boolean arg5, int arg6) {
        class224.field3404 = arg3;
        class402.field5711 = arg2;
        field6175++;
        for (int var9 = 0; var9 < this.field6169.length; var9++) {
            this.field6169[var9].method742(arg1, false, arg6);
        }
        class356.method2215(arg4, (byte) -78);
        class203.method1401((byte) 55, arg6, arg1);
        int[] var10 = new int[arg1 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field6172.field7878) {
                int[] var15 = this.field6172.method65(var12, 1);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field6172.method61(-118, var12);
                var17 = var19[0];
                var16 = var19[2];
                var18 = var19[1];
            }
            int[] var20;
            if (this.field6167.field7878) {
                var20 = this.field6167.method65(var12, 1);
            } else {
                var20 = this.field6167.method61(-117, var12)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var21 = arg6 - 1; var21 >= 0; var21--) {
                int var22 = var17[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var16[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class477.field6950[var22];
                int var26 = class477.field6950[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class477.field6950[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var10[var11++] = (var26 << 8) + var27 + (var25 << 16) + (var28 << 24);
                if (arg5) {
                    var11 += arg6 - 1;
                }
            }
        }
        int var13 = -82 / ((-arg0 - 19) / 41);
        for (int var14 = 0; var14 < this.field6169.length; var14++) {
            this.field6169[var14].method484(806);
        }
        return var10;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IBZIDZLci;Ll;)[I", line = 256)
    public final int[] method2547(int arg0, byte arg1, boolean arg2, int arg3, double arg4, boolean arg5, class320 arg6, class16 arg7) {
        class402.field5711 = arg7;
        int var10 = 92 % (-arg1 / 34);
        field6174++;
        class224.field3404 = arg6;
        for (int var11 = 0; var11 < this.field6169.length; var11++) {
            this.field6169[var11].method742(arg3, false, arg0);
        }
        class356.method2215(arg4, (byte) -78);
        class203.method1401((byte) 55, arg0, arg3);
        int[] var12 = new int[arg0 * arg3];
        int var13;
        byte var14;
        int var15;
        if (arg5) {
            var14 = -1;
            var15 = arg0 - 1;
            var13 = -1;
        } else {
            var13 = arg0;
            var14 = 1;
            var15 = 0;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg3; var17++) {
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field6172.field7878) {
                int[] var23 = this.field6172.method65(var17, 1);
                var22 = var23;
                var21 = var23;
                var20 = var23;
            } else {
                int[][] var19 = this.field6172.method61(-119, var17);
                var20 = var19[1];
                var21 = var19[2];
                var22 = var19[0];
            }
            if (arg2) {
                var16 = var17;
            }
            for (int var24 = var15; var24 != var13; var24 += var14) {
                int var25 = var22[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var21[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class477.field6950[var25];
                int var29 = class477.field6950[var26];
                int var30 = class477.field6950[var27];
                int var31 = (var29 << 8) + (var28 << 16) + var30;
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var12[var16++] = var31;
                if (arg2) {
                    var16 += arg0 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field6169.length; var18++) {
            this.field6169[var18].method484(806);
        }
        return var12;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V", line = 399)
    public static void method2548(byte arg0) {
        field6173 = null;
        if (arg0 != 75) {
            field6176 = -19;
        }
        field6177 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ll;Lci;Z)Z", line = 442)
    public final boolean method2549(class16 arg0, class320 arg1, boolean arg2) {
        field6179++;
        if (class467.field6788 >= 0) {
            for (int var4 = 0; var4 < this.field6168.length; var4++) {
                if (!arg1.method2019(class467.field6788, this.field6168[var4], 111)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6168.length; var5++) {
                if (!arg1.method2035(this.field6168[var5], (byte) -94)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field6171.length; var6++) {
            if (!arg0.method92(12624, this.field6171[var6])) {
                return false;
            }
        }
        if (arg2) {
            field6176 = 103;
        }
        return true;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 494)
    public class429() {
        this.field6168 = new int[0];
        this.field6171 = new int[0];
        this.field6178 = new class228(0);
        this.field6178.field7889 = 1;
        this.field6172 = new class228();
        this.field6172.field7889 = 1;
        this.field6167 = new class228();
        this.field6167.field7889 = 1;
        this.field6169 = new class535[] { this.field6172, this.field6167, this.field6178 };
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lwn;)V", line = 509)
    public class429(class519 arg0) {
        int var2 = arg0.method3072((byte) -122);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field6169 = new class535[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class535 var16 = class540.method3178(arg0, 0);
            if (var16.method485(-85) >= 0) {
                var3++;
            }
            if (var16.method740((byte) 97) >= 0) {
                var4++;
            }
            int var17 = var16.field7886.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3072((byte) -121);
            }
            this.field6169[var6] = var16;
        }
        this.field6168 = new int[var3];
        int var7 = 0;
        this.field6171 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class535 var11 = this.field6169[var9];
            int var12 = var11.field7886.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field7886[var13] = this.field6169[var5[var9][var13]];
            }
            int var14 = var11.method485(-115);
            int var15 = var11.method740((byte) 87);
            if (var14 > 0) {
                this.field6168[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6171[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6172 = this.field6169[arg0.method3072((byte) -125)];
        this.field6167 = this.field6169[arg0.method3072((byte) -123)];
        Object var10 = null;
        this.field6178 = this.field6169[arg0.method3072((byte) -119)];
    }
}
