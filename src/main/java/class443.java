import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class443 extends class46 {

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "[I")
    private int[] field6511;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "[I")
    private int[] field6516;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Lrfa;")
    private class211 field6515;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Lrfa;")
    private class211 field6514;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lrfa;")
    private class211 field6510;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "[Lrfa;")
    private class211[] field6509;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field6519 = new String[] { method3409(method3408("W\u0019n-")), method3409(method3408("BB,o$")), method3409(method3408("P\u0006,\tq")), method3409(method3408("P\u0006,\u0007q")), method3409(method3408("P\u0006,\nq")), method3409(method3408("P\u0006,}0W\u0005v\u007fq")), method3409(method3408("P\u0006,\bq")), method3409(method3408("P\u0006,\u0006q")), method3409(method3408("P\u0006,\u000bq")), method3409(method3408("P\u0006,\rq")) };

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field6517 = 100;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "[Luf;")
    public static class471[] field6518 = new class471[8];

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "Lla;")
    public static class476 field6513;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "[[[Liia;")
    public static class96[][][] field6508;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method3401(int arg0) throws IOException {
        try {
            if (class629.field9198 != null && class90.field1034 > 0) {
                class381.field5777.field2201 = 0;
                while (true) {
                    class280 var1 = (class280) class383.field5800.method3863((byte) 64);
                    if (var1 == null || class381.field5777.field2209.length - class381.field5777.field2201 < var1.field4200) {
                        class629.field9198.method2703(-44, class381.field5777.field2209, class381.field5777.field2201, 0);
                        class311.field4932 += class381.field5777.field2201;
                        class157.field1961 = 0;
                        break;
                    }
                    class381.field5777.method1454(var1.field4200, 0, var1.field4197.field2209, (byte) 122);
                    class90.field1034 -= var1.field4200;
                    var1.method1824(1);
                    var1.field4197.method1404(-957401312);
                    var1.method2295(-24822);
                }
            }
            field6502++;
            if (arg0 != -1) {
                method3404(-20, 21, -85);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6519[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lla;ILd;DIIZZ)[I")
    public final int[] method3402(class476 arg0, int arg1, class160 arg2, double arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        try {
            class560.field8337 = arg2;
            field6507++;
            class214.field3266 = arg0;
            for (int var10 = 0; var10 < this.field6509.length; var10++) {
                this.field6509[var10].method1858(16, arg5, arg4);
            }
            class431.method3303(-55, arg3);
            class383.method3069(arg5, 54, arg4);
            int[] var11 = new int[arg4 * arg5];
            int var12 = -124 / ((34 - arg1) / 35);
            int var13;
            byte var14;
            int var15;
            if (arg6) {
                var13 = arg4 - 1;
                var14 = -1;
                var15 = -1;
            } else {
                var14 = 1;
                var13 = 0;
                var15 = arg4;
            }
            int var16 = 0;
            for (int var17 = 0; var17 < arg5; var17++) {
                int[] var19;
                int[] var20;
                int[] var21;
                if (this.field6514.field3235) {
                    int[] var22 = this.field6514.method197(8217, var17);
                    var20 = var22;
                    var21 = var22;
                    var19 = var22;
                } else {
                    int[][] var18 = this.field6514.method234(var17, -86);
                    var19 = var18[2];
                    var20 = var18[1];
                    var21 = var18[0];
                }
                if (arg7) {
                    var16 = var17;
                }
                for (int var23 = var13; var23 != var15; var23 += var14) {
                    int var24 = var21[var23] >> 4;
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
                    int var26 = var19[var23] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    int var27 = class669.field9722[var24];
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    int var28 = class669.field9722[var25];
                    int var29 = class669.field9722[var26];
                    int var30 = (var28 << 8) + (var27 << 16) + var29;
                    if (var30 != 0) {
                        var30 |= 0xFF000000;
                    }
                    var11[var16++] = var30;
                    if (arg7) {
                        var16 += arg4 - 1;
                    }
                }
            }
            for (int var31 = 0; var31 < this.field6509.length; var31++) {
                this.field6509[var31].method679((byte) 65);
            }
            return var11;
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field6519[9] + (arg0 == null ? field6519[0] : field6519[1]) + ',' + arg1 + ',' + (arg2 == null ? field6519[0] : field6519[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(DILd;Lla;ZII)[I")
    public final int[] method3403(double arg0, int arg1, class160 arg2, class476 arg3, boolean arg4, int arg5, int arg6) {
        try {
            if (arg6 >= -85) {
                this.field6515 = null;
            }
            class560.field8337 = arg2;
            field6503++;
            class214.field3266 = arg3;
            for (int var9 = 0; var9 < this.field6509.length; var9++) {
                this.field6509[var9].method1858(28, arg5, arg1);
            }
            class431.method3303(126, arg0);
            class383.method3069(arg5, 104, arg1);
            int[] var10 = new int[arg1 * arg5];
            int var11 = 0;
            for (int var12 = 0; var12 < arg5; var12++) {
                int[] var14;
                int[] var15;
                int[] var16;
                if (this.field6514.field3235) {
                    int[] var13 = this.field6514.method197(8217, var12);
                    var14 = var13;
                    var15 = var13;
                    var16 = var13;
                } else {
                    int[][] var17 = this.field6514.method234(var12, -81);
                    var14 = var17[1];
                    var15 = var17[2];
                    var16 = var17[0];
                }
                if (arg4) {
                    var11 = var12;
                }
                int[] var18;
                if (this.field6510.field3235) {
                    var18 = this.field6510.method197(8217, var12);
                } else {
                    var18 = this.field6510.method234(var12, -62)[0];
                }
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
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
                    int var23 = class669.field9722[var20];
                    int var24 = class669.field9722[var21];
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    int var25 = class669.field9722[var22];
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
                    var10[var11++] = (var24 << 8) + (var26 << 24) + (var23 << 16) + var25;
                    if (arg4) {
                        var11 += arg1 - 1;
                    }
                }
            }
            for (int var27 = 0; var27 < this.field6509.length; var27++) {
                this.field6509[var27].method679((byte) 65);
            }
            return var10;
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field6519[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6519[0] : field6519[1]) + ',' + (arg3 == null ? field6519[0] : field6519[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
    public static final boolean method3404(int arg0, int arg1, int arg2) {
        try {
            field6505++;
            if (arg0 != 7275) {
                field6513 = null;
            }
            return (arg2 & 0x10) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6519[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILd;Lla;ZI)[F")
    public final float[] method3405(int arg0, int arg1, class160 arg2, class476 arg3, boolean arg4, int arg5) {
        try {
            class214.field3266 = arg3;
            field6506++;
            class560.field8337 = arg2;
            for (int var7 = 0; var7 < this.field6509.length; var7++) {
                this.field6509[var7].method1858(121, arg5, arg0);
            }
            class383.method3069(arg5, 50, arg0);
            float[] var8 = new float[arg0 * arg5 * 4];
            int var9 = 0;
            if (arg1 >= -52) {
                this.method3402(null, -95, null, 0.4971580910332832D, 120, -106, false, false);
            }
            for (int var10 = 0; var10 < arg5; var10++) {
                int[] var12;
                int[] var13;
                int[] var14;
                if (this.field6514.field3235) {
                    int[] var11 = this.field6514.method197(8217, var10);
                    var12 = var11;
                    var13 = var11;
                    var14 = var11;
                } else {
                    int[][] var15 = this.field6514.method234(var10, -55);
                    var12 = var15[1];
                    var13 = var15[2];
                    var14 = var15[0];
                }
                int[] var16;
                if (this.field6510.field3235) {
                    var16 = this.field6510.method197(8217, var10);
                } else {
                    var16 = this.field6510.method234(var10, -113)[0];
                }
                int[] var17;
                if (this.field6515.field3235) {
                    var17 = this.field6515.method197(8217, var10);
                } else {
                    var17 = this.field6515.method234(var10, -82)[0];
                }
                if (arg4) {
                    var9 = var10 << 2;
                }
                for (int var18 = arg0 - 1; var18 >= 0; var18--) {
                    float var19 = (float) var16[var18] / 4096.0F;
                    if (var19 < 0.0F) {
                        var19 = 0.0F;
                    } else if (var19 > 1.0F) {
                        var19 = 1.0F;
                    }
                    float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                    var8[var9++] = (float) var14[var18] * var20;
                    var8[var9++] = (float) var12[var18] * var20;
                    var8[var9++] = (float) var13[var18] * var20;
                    var8[var9++] = var19;
                    if (arg4) {
                        var9 += (arg0 << 2) - 4;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field6509.length; var21++) {
                this.field6509[var21].method679((byte) 65);
            }
            return var8;
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field6519[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6519[0] : field6519[1]) + ',' + (arg3 == null ? field6519[0] : field6519[1]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ld;Lla;I)Z")
    public final boolean method3406(class160 arg0, class476 arg1, int arg2) {
        try {
            field6504++;
            if (class671.field9744 >= 0) {
                for (int var4 = 0; var4 < this.field6516.length; var4++) {
                    if (!arg1.method3621(this.field6516[var4], -126, class671.field9744)) {
                        return false;
                    }
                }
            } else {
                for (int var5 = 0; var5 < this.field6516.length; var5++) {
                    if (!arg1.method3618(this.field6516[var5], 50)) {
                        return false;
                    }
                }
            }
            if (arg2 != 6775) {
                field6512 = 16;
            }
            for (int var6 = 0; var6 < this.field6511.length; var6++) {
                if (!arg0.method1363(this.field6511[var6], (byte) -94)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6519[4] + (arg0 == null ? field6519[0] : field6519[1]) + ',' + (arg1 == null ? field6519[0] : field6519[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method3407(boolean arg0) {
        try {
            if (arg0) {
                field6508 = null;
            }
            field6518 = null;
            field6508 = null;
            field6513 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6519[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class443() {
        try {
            this.field6511 = new int[0];
            this.field6516 = new int[0];
            this.field6515 = new class678(0);
            this.field6515.field3238 = 1;
            this.field6514 = new class678();
            this.field6514.field3238 = 1;
            this.field6510 = new class678();
            this.field6509 = new class211[] { this.field6514, this.field6510, this.field6515 };
            this.field6510.field3238 = 1;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6519[5] + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lib;)V")
    public class443(class163 arg0) {
        try {
            int var2 = arg0.method1455((byte) 62);
            int var3 = 0;
            int var4 = 0;
            this.field6509 = new class211[var2];
            int[][] var5 = new int[var2][];
            for (int var6 = 0; var6 < var2; var6++) {
                class211 var7 = class37.method246(arg0, (byte) -110);
                if (var7.method681((byte) -36) >= 0) {
                    var3++;
                }
                if (var7.method1857(-122) >= 0) {
                    var4++;
                }
                int var8 = var7.field3240.length;
                var5[var6] = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    var5[var6][var9] = arg0.method1455((byte) 62);
                }
                this.field6509[var6] = var7;
            }
            this.field6516 = new int[var3];
            int var10 = 0;
            this.field6511 = new int[var4];
            int var11 = 0;
            for (int var12 = 0; var12 < var2; var12++) {
                class211 var13 = this.field6509[var12];
                int var14 = var13.field3240.length;
                for (int var15 = 0; var15 < var14; var15++) {
                    var13.field3240[var15] = this.field6509[var5[var12][var15]];
                }
                int var16 = var13.method681((byte) -36);
                int var17 = var13.method1857(-78);
                if (var16 > 0) {
                    this.field6516[var10++] = var16;
                }
                if (var17 > 0) {
                    this.field6511[var11++] = var17;
                }
                var5[var12] = null;
            }
            this.field6514 = this.field6509[arg0.method1455((byte) 62)];
            this.field6510 = this.field6509[arg0.method1455((byte) 62)];
            Object var18 = null;
            this.field6515 = this.field6509[arg0.method1455((byte) 62)];
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field6519[5] + (arg0 == null ? field6519[0] : field6519[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3408(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3409(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
