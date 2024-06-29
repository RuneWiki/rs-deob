import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class151 extends class459 {

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "[I")
    private int[] field2112;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "[I")
    private int[] field2116;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "Lnt;")
    private class232 field2115;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "Lnt;")
    private class232 field2114;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "Lnt;")
    private class232 field2109;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "[Lnt;")
    private class232[] field2107;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field2120 = new String[] { method1378(method1377(",A|p")), method1378(method1377("/F>Zo")), method1378(method1377("9\u001a>2:")), method1378(method1377("/F>]o")), method1378(method1377("/F>_o")), method1378(method1377("/F>^o")), method1378(method1377("/F> .,]d\"o")), method1378(method1377("/F>[o")), method1378(method1377("/F>Yo")), method1378(method1377("/F>Xo")) };

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public static final void method1370(byte arg0) {
        try {
            field2108++;
            if (class9.field104 != 0) {
                class683.field9892.method1540(-61);
                class697.method5067(19653);
                class796.method5715((byte) 111);
            }
            int var1 = -127 % ((arg0 + 85) / 35);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2120[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lmj;BZ)V")
    public static final void method1371(class683 arg0, byte arg1, boolean arg2) {
        try {
            field2110++;
            int var3 = arg0.field9716 == 0 ? arg0.field9797 : arg0.field9716;
            int var4 = arg0.field9821 == 0 ? arg0.field9777 : arg0.field9821;
            if (arg1 <= -55) {
                class226.method1986(arg2, 0, class309.field5028[arg0.field9774 >> 16], arg0.field9774, var3, var4);
                if (arg0.field9825 != null) {
                    class226.method1986(arg2, 0, arg0.field9825, arg0.field9774, var3, var4);
                }
                class23 var5 = (class23) class632.field9082.method737((byte) -39, (long) arg0.field9774);
                if (var5 != null) {
                    class15.method107(var4, (byte) 116, var5.field219, var3, arg2);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2120[7] + (arg0 == null ? field2120[0] : field2120[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILgda;IZLd;ZD)[I")
    public final int[] method1372(int arg0, int arg1, class58 arg2, int arg3, boolean arg4, class158 arg5, boolean arg6, double arg7) {
        try {
            class15.field170 = arg5;
            if (arg1 != -17496) {
                method1371(null, (byte) 110, true);
            }
            class568.field8251 = arg2;
            field2113++;
            for (int var10 = 0; var10 < this.field2107.length; var10++) {
                this.field2107[var10].method2020(arg3, -76, arg0);
            }
            class673.method4871(arg1 ^ 0xFFFFBBED, arg7);
            class209.method1891(arg3, 119, arg0);
            int[] var11 = new int[arg0 * arg3];
            byte var12;
            int var13;
            int var14;
            if (arg4) {
                var12 = -1;
                var13 = arg0 - 1;
                var14 = -1;
            } else {
                var13 = 0;
                var12 = 1;
                var14 = arg0;
            }
            int var15 = 0;
            for (int var16 = 0; var16 < arg3; var16++) {
                if (arg6) {
                    var15 = var16;
                }
                int[] var18;
                int[] var19;
                int[] var20;
                if (this.field2114.field3605) {
                    int[] var17 = this.field2114.method66(var16, (byte) 123);
                    var18 = var17;
                    var19 = var17;
                    var20 = var17;
                } else {
                    int[][] var21 = this.field2114.method122(-3093, var16);
                    var19 = var21[2];
                    var20 = var21[0];
                    var18 = var21[1];
                }
                for (int var22 = var13; var22 != var14; var22 += var12) {
                    int var23 = var20[var22] >> 4;
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
                    int var25 = var19[var22] >> 4;
                    if (var25 > 255) {
                        var25 = 255;
                    }
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var26 = class606.field8730[var23];
                    int var27 = class606.field8730[var24];
                    int var28 = class606.field8730[var25];
                    int var29 = (var26 << 16) + (var27 << 8) + var28;
                    if (var29 != 0) {
                        var29 |= 0xFF000000;
                    }
                    var11[var15++] = var29;
                    if (arg6) {
                        var15 += arg0 - 1;
                    }
                }
            }
            for (int var30 = 0; var30 < this.field2107.length; var30++) {
                this.field2107[var30].method2024(12968);
            }
            return var11;
        } catch (RuntimeException var32) {
            throw class590.method4333(var32, field2120[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2120[0] : field2120[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field2120[0] : field2120[2]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lgda;BLgda;I)V")
    public static final void method1373(class58 arg0, byte arg1, class58 arg2, int arg3) {
        try {
            class449.field6960 = arg0;
            if (arg1 == -76) {
                field2111++;
                class199.field3152 = arg2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2120[5] + (arg0 == null ? field2120[0] : field2120[2]) + ',' + arg1 + ',' + (arg2 == null ? field2120[0] : field2120[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ld;Lgda;Z)Z")
    public final boolean method1374(class158 arg0, class58 arg1, boolean arg2) {
        try {
            field2117++;
            if (class393.field6255 >= 0) {
                for (int var4 = 0; var4 < this.field2116.length; var4++) {
                    if (!arg1.method586(class393.field6255, -25034, this.field2116[var4])) {
                        return false;
                    }
                }
            } else {
                for (int var5 = 0; var5 < this.field2116.length; var5++) {
                    if (!arg1.method595(-2, this.field2116[var5])) {
                        return false;
                    }
                }
            }
            for (int var6 = 0; var6 < this.field2112.length; var6++) {
                if (!arg0.method1417((byte) -68, this.field2112[var6])) {
                    return false;
                }
            }
            if (arg2) {
                this.field2109 = null;
            }
            return true;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2120[8] + (arg0 == null ? field2120[0] : field2120[2]) + ',' + (arg1 == null ? field2120[0] : field2120[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ld;IZIDLgda;I)[I")
    public final int[] method1375(class158 arg0, int arg1, boolean arg2, int arg3, double arg4, class58 arg5, int arg6) {
        try {
            field2118++;
            class15.field170 = arg0;
            class568.field8251 = arg5;
            for (int var9 = arg1; var9 < this.field2107.length; var9++) {
                this.field2107[var9].method2020(arg3, -109, arg6);
            }
            class673.method4871(arg1 + 86, arg4);
            class209.method1891(arg3, arg1 ^ 0xFFFFFF8E, arg6);
            int[] var10 = new int[arg3 * arg6];
            int var11 = 0;
            for (int var12 = 0; var12 < arg3; var12++) {
                int[] var14;
                int[] var15;
                int[] var16;
                if (this.field2114.field3605) {
                    int[] var17 = this.field2114.method66(var12, (byte) 123);
                    var16 = var17;
                    var14 = var17;
                    var15 = var17;
                } else {
                    int[][] var13 = this.field2114.method122(-3093, var12);
                    var14 = var13[1];
                    var15 = var13[2];
                    var16 = var13[0];
                }
                int[] var18;
                if (this.field2109.field3605) {
                    var18 = this.field2109.method66(var12, (byte) 123);
                } else {
                    var18 = this.field2109.method122(-3093, var12)[0];
                }
                if (arg2) {
                    var11 = var12;
                }
                for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                    int var20 = var16[var19] >> 4;
                    if (var20 > 255) {
                        var20 = 255;
                    }
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var21 = var14[var19] >> 4;
                    if (var21 > 255) {
                        var21 = 255;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var22 = var15[var19] >> 4;
                    if (var22 > 255) {
                        var22 = 255;
                    }
                    int var23 = class606.field8730[var20];
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    int var24 = class606.field8730[var21];
                    int var25 = class606.field8730[var22];
                    int var26;
                    if (var23 == 0 && var24 == 0 && var25 == 0) {
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
                    var10[var11++] = (var24 << 8) + (var26 << 24) + var25 + (var23 << 16);
                    if (arg2) {
                        var11 += arg6 - 1;
                    }
                }
            }
            for (int var27 = 0; var27 < this.field2107.length; var27++) {
                this.field2107[var27].method2024(arg1 ^ 0x32A8);
            }
            return var10;
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field2120[4] + (arg0 == null ? field2120[0] : field2120[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field2120[0] : field2120[2]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZIILgda;ILd;)[F")
    public final float[] method1376(boolean arg0, int arg1, int arg2, class58 arg3, int arg4, class158 arg5) {
        try {
            class15.field170 = arg5;
            field2119++;
            class568.field8251 = arg3;
            for (int var7 = 0; var7 < this.field2107.length; var7++) {
                this.field2107[var7].method2020(arg1, -116, arg2);
            }
            class209.method1891(arg1, arg4 + 23538, arg2);
            float[] var8 = new float[arg1 * arg2 * 4];
            int var9 = 0;
            for (int var10 = 0; var10 < arg1; var10++) {
                int[] var12;
                int[] var13;
                int[] var14;
                if (this.field2114.field3605) {
                    int[] var11 = this.field2114.method66(var10, (byte) 123);
                    var12 = var11;
                    var13 = var11;
                    var14 = var11;
                } else {
                    int[][] var15 = this.field2114.method122(-3093, var10);
                    var12 = var15[1];
                    var13 = var15[0];
                    var14 = var15[2];
                }
                int[] var16;
                if (this.field2109.field3605) {
                    var16 = this.field2109.method66(var10, (byte) 123);
                } else {
                    var16 = this.field2109.method122(-3093, var10)[0];
                }
                int[] var17;
                if (this.field2115.field3605) {
                    var17 = this.field2115.method66(var10, (byte) 123);
                } else {
                    var17 = this.field2115.method122(-3093, var10)[0];
                }
                if (arg0) {
                    var9 = var10 << 2;
                }
                for (int var18 = arg2 - 1; var18 >= 0; var18--) {
                    float var19 = (float) var16[var18] / 4096.0F;
                    float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                    if ((var19 < 0.0F)) {
                        var19 = 0.0F;
                    } else if (var19 > 1.0F) {
                        var19 = 1.0F;
                    }
                    var8[var9++] = (float) var13[var18] * var20;
                    var8[var9++] = (float) var12[var18] * var20;
                    var8[var9++] = (float) var14[var18] * var20;
                    var8[var9++] = var19;
                    if (arg0) {
                        var9 += (arg2 << 2) - 4;
                    }
                }
            }
            if (arg4 == -23416) {
                for (int var21 = 0; var21 < this.field2107.length; var21++) {
                    this.field2107[var21].method2024(12968);
                }
                return var8;
            } else {
                return null;
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field2120[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2120[0] : field2120[2]) + ',' + arg4 + ',' + (arg5 == null ? field2120[0] : field2120[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
    public class151() {
        try {
            this.field2112 = new int[0];
            this.field2116 = new int[0];
            this.field2115 = new class342(0);
            this.field2115.field3597 = 1;
            this.field2114 = new class342();
            this.field2114.field3597 = 1;
            this.field2109 = new class342();
            this.field2107 = new class232[] { this.field2114, this.field2109, this.field2115 };
            this.field2109.field3597 = 1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2120[6] + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lwq;)V")
    public class151(class176 arg0) {
        try {
            int var2 = arg0.method1645((byte) -70);
            int var3 = 0;
            int var4 = 0;
            int[][] var5 = new int[var2][];
            this.field2107 = new class232[var2];
            for (int var6 = 0; var6 < var2; var6++) {
                class232 var7 = class609.method4442((byte) 42, arg0);
                if (var7.method2025(-9801) >= 0) {
                    var3++;
                }
                if (var7.method2019(-107) >= 0) {
                    var4++;
                }
                int var8 = var7.field3595.length;
                var5[var6] = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    var5[var6][var9] = arg0.method1645((byte) -94);
                }
                this.field2107[var6] = var7;
            }
            this.field2116 = new int[var3];
            int var10 = 0;
            this.field2112 = new int[var4];
            int var11 = 0;
            for (int var12 = 0; var12 < var2; var12++) {
                class232 var13 = this.field2107[var12];
                int var14 = var13.field3595.length;
                for (int var15 = 0; var15 < var14; var15++) {
                    var13.field3595[var15] = this.field2107[var5[var12][var15]];
                }
                int var16 = var13.method2025(-9801);
                int var17 = var13.method2019(110);
                if (var16 > 0) {
                    this.field2116[var10++] = var16;
                }
                if (var17 > 0) {
                    this.field2112[var11++] = var17;
                }
                var5[var12] = null;
            }
            this.field2114 = this.field2107[arg0.method1645((byte) -106)];
            this.field2109 = this.field2107[arg0.method1645((byte) -113)];
            this.field2115 = this.field2107[arg0.method1645((byte) -109)];
            Object var18 = null;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field2120[6] + (arg0 == null ? field2120[0] : field2120[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1377(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1378(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
