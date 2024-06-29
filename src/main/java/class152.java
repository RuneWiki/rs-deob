import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class152 extends class687 {

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "[I")
    private int[] field1945;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "[I")
    private int[] field1939;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Lqfa;")
    private class518 field1941;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Lqfa;")
    private class518 field1940;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "Lqfa;")
    private class518 field1938;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "[Lqfa;")
    private class518[] field1950;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field1952 = new String[] { method1295(method1294("#\u0019\u00165\u0006")), method1295(method1294("#\u0019\u00160\u0006")), method1295(method1294("\"\u001dT\u001f")), method1295(method1294("#\u0019\u00161\u0006")), method1295(method1294("7F\u0016]S")), method1295(method1294("#\u0019\u0016OG\"\u0001LM\u0006")), method1295(method1294("#\u0019\u00166\u0006")), method1295(method1294("#\u0019\u00167\u0006")), method1295(method1294("#\u0019\u00162\u0006")) };

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "Z")
    public static boolean field1947;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IDLd;ILlga;IZZ)[I", line = 5)
    public final int[] method1288(int arg0, double arg1, class673 arg2, int arg3, class47 arg4, int arg5, boolean arg6, boolean arg7) {
        try {
            if (arg0 != 255) {
                this.field1939 = null;
            }
            class24.field292 = arg2;
            class38.field594 = arg4;
            field1946++;
            for (int var10 = 0; var10 < this.field1950.length; var10++) {
                this.field1950[var10].method352(arg3, arg5, -256);
            }
            class648.method4724(arg1, arg0 - 381);
            class184.method1518(arg3, (byte) 26, arg5);
            int[] var11 = new int[arg3 * arg5];
            int var12;
            byte var13;
            int var14;
            if (arg6) {
                var12 = -1;
                var13 = -1;
                var14 = arg3 - 1;
            } else {
                var13 = 1;
                var12 = arg3;
                var14 = 0;
            }
            int var15 = 0;
            for (int var16 = 0; var16 < arg5; var16++) {
                if (arg7) {
                    var15 = var16;
                }
                int[] var18;
                int[] var19;
                int[] var20;
                if (this.field1940.field7565) {
                    int[] var21 = this.field1940.method14(var16, -118);
                    var19 = var21;
                    var18 = var21;
                    var20 = var21;
                } else {
                    int[][] var17 = this.field1940.method349(0, var16);
                    var18 = var17[1];
                    var19 = var17[2];
                    var20 = var17[0];
                }
                for (int var22 = var14; var22 != var12; var22 += var13) {
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
                    int var26 = class777.field11075[var24];
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var27 = class777.field11075[var23];
                    int var28 = class777.field11075[var25];
                    int var29 = (var26 << 8) + (var27 << 16) + var28;
                    if (var29 != 0) {
                        var29 |= 0xFF000000;
                    }
                    var11[var15++] = var29;
                    if (arg7) {
                        var15 += arg3 - 1;
                    }
                }
            }
            for (int var30 = 0; var30 < this.field1950.length; var30++) {
                this.field1950[var30].method351(-1);
            }
            return var11;
        } catch (RuntimeException var32) {
            throw class665.method4799(var32, field1952[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1952[2] : field1952[4]) + ',' + arg3 + ',' + (arg4 == null ? field1952[2] : field1952[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(DIZLd;ZLlga;I)[I", line = 144)
    public final int[] method1289(double arg0, int arg1, boolean arg2, class673 arg3, boolean arg4, class47 arg5, int arg6) {
        try {
            field1949++;
            class38.field594 = arg5;
            class24.field292 = arg3;
            for (int var9 = 0; var9 < this.field1950.length; var9++) {
                this.field1950[var9].method352(arg1, arg6, -256);
            }
            class648.method4724(arg0, -114);
            class184.method1518(arg1, (byte) -128, arg6);
            int[] var10 = new int[arg1 * arg6];
            int var11 = 0;
            for (int var12 = 0; var12 < arg6; var12++) {
                int[] var14;
                int[] var15;
                int[] var16;
                if (this.field1940.field7565) {
                    int[] var17 = this.field1940.method14(var12, -1);
                    var14 = var17;
                    var15 = var17;
                    var16 = var17;
                } else {
                    int[][] var13 = this.field1940.method349(0, var12);
                    var14 = var13[2];
                    var15 = var13[1];
                    var16 = var13[0];
                }
                int[] var18;
                if (this.field1938.field7565) {
                    var18 = this.field1938.method14(var12, -117);
                } else {
                    var18 = this.field1938.method349(0, var12)[0];
                }
                if (arg2) {
                    var11 = var12;
                }
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                    int var20 = var16[var19] >> 4;
                    if (var20 > 255) {
                        var20 = 255;
                    }
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var21 = var15[var19] >> 4;
                    if (var21 > 255) {
                        var21 = 255;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var22 = var14[var19] >> 4;
                    if (var22 > 255) {
                        var22 = 255;
                    }
                    int var23 = class777.field11075[var21];
                    int var24 = class777.field11075[var20];
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    int var25 = class777.field11075[var22];
                    int var26;
                    if (var24 == 0 && var23 == 0 && var25 == 0) {
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
                    var10[var11++] = (var23 << 8) + (var26 << 24) + (var24 << 16) + var25;
                    if (arg2) {
                        var11 += arg1 - 1;
                    }
                }
            }
            for (int var27 = 0; var27 < this.field1950.length; var27++) {
                this.field1950[var27].method351(-1);
            }
            if (arg4) {
                return var10;
            } else {
                return null;
            }
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field1952[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1952[2] : field1952[4]) + ',' + arg4 + ',' + (arg5 == null ? field1952[2] : field1952[4]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZILd;IILlga;)[F", line = 295)
    public final float[] method1290(boolean arg0, int arg1, class673 arg2, int arg3, int arg4, class47 arg5) {
        try {
            class38.field594 = arg5;
            field1948++;
            class24.field292 = arg2;
            for (int var7 = arg1; var7 < this.field1950.length; var7++) {
                this.field1950[var7].method352(arg4, arg3, arg1 - 256);
            }
            class184.method1518(arg4, (byte) 123, arg3);
            float[] var8 = new float[arg4 * 4 * arg3];
            int var9 = 0;
            for (int var10 = 0; var10 < arg3; var10++) {
                int[] var12;
                int[] var13;
                int[] var14;
                if (this.field1940.field7565) {
                    int[] var15 = this.field1940.method14(var10, 109);
                    var12 = var15;
                    var14 = var15;
                    var13 = var15;
                } else {
                    int[][] var11 = this.field1940.method349(0, var10);
                    var12 = var11[1];
                    var13 = var11[0];
                    var14 = var11[2];
                }
                int[] var16;
                if (this.field1938.field7565) {
                    var16 = this.field1938.method14(var10, arg1 ^ 0x7F);
                } else {
                    var16 = this.field1938.method349(0, var10)[0];
                }
                int[] var17;
                if (this.field1941.field7565) {
                    var17 = this.field1941.method14(var10, arg1 ^ 0xFFFFFF90);
                } else {
                    var17 = this.field1941.method349(0, var10)[0];
                }
                if (arg0) {
                    var9 = var10 << 2;
                }
                for (int var18 = arg4 - 1; var18 >= 0; var18--) {
                    float var19 = (float) var16[var18] / 4096.0F;
                    if (var19 < 0.0F) {
                        var19 = 0.0F;
                    } else if (var19 > 1.0F) {
                        var19 = 1.0F;
                    }
                    float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                    var8[var9++] = (float) var13[var18] * var20;
                    var8[var9++] = (float) var12[var18] * var20;
                    var8[var9++] = (float) var14[var18] * var20;
                    var8[var9++] = var19;
                    if (arg0) {
                        var9 += (arg4 << 2) - 4;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field1950.length; var21++) {
                this.field1950[var21].method351(-1);
            }
            return var8;
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field1952[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1952[2] : field1952[4]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field1952[2] : field1952[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(CB)B", line = 403)
    public static final byte method1291(char arg0, byte arg1) {
        try {
            field1943++;
            if (arg1 != -9) {
                return 118;
            }
            byte var2;
            if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
                var2 = (byte) arg0;
            } else if (arg0 == '€') {
                var2 = -128;
            } else if (arg0 == '‚') {
                var2 = -126;
            } else if (arg0 == 'ƒ') {
                var2 = -125;
            } else if (arg0 == '„') {
                var2 = -124;
            } else if (arg0 == '…') {
                var2 = -123;
            } else if (arg0 == '†') {
                var2 = -122;
            } else if (arg0 == '‡') {
                var2 = -121;
            } else if (arg0 == 'ˆ') {
                var2 = -120;
            } else if (arg0 == '‰') {
                var2 = -119;
            } else if (arg0 == 'Š') {
                var2 = -118;
            } else if (arg0 == '‹') {
                var2 = -117;
            } else if (arg0 == 'Œ') {
                var2 = -116;
            } else if (arg0 == 'Ž') {
                var2 = -114;
            } else if (arg0 == '‘') {
                var2 = -111;
            } else if (arg0 == '’') {
                var2 = -110;
            } else if (arg0 == '“') {
                var2 = -109;
            } else if (arg0 == '”') {
                var2 = -108;
            } else if (arg0 == '•') {
                var2 = -107;
            } else if (arg0 == '–') {
                var2 = -106;
            } else if (arg0 == '—') {
                var2 = -105;
            } else if (arg0 == '˜') {
                var2 = -104;
            } else if (arg0 == '™') {
                var2 = -103;
            } else if (arg0 == 'š') {
                var2 = -102;
            } else if (arg0 == '›') {
                var2 = -101;
            } else if (arg0 == 'œ') {
                var2 = -100;
            } else if (arg0 == 'ž') {
                var2 = -98;
            } else if (arg0 == 'Ÿ') {
                var2 = -97;
            } else {
                var2 = 63;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1952[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Llga;ILd;)Z", line = 530)
    public final boolean method1292(class47 arg0, int arg1, class673 arg2) {
        try {
            field1951++;
            if (class576.field8327 >= 0) {
                for (int var4 = 0; var4 < this.field1939.length; var4++) {
                    if (!arg0.method506(-85, class576.field8327, this.field1939[var4])) {
                        return false;
                    }
                }
            } else {
                for (int var5 = 0; var5 < this.field1939.length; var5++) {
                    if (!arg0.method530(false, this.field1939[var5])) {
                        return false;
                    }
                }
            }
            if (arg1 != 255) {
                this.method1292(null, 92, null);
            }
            for (int var6 = 0; var6 < this.field1945.length; var6++) {
                if (!arg2.method4504(this.field1945[var6], -31410)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1952[8] + (arg0 == null ? field1952[2] : field1952[4]) + ',' + arg1 + ',' + (arg2 == null ? field1952[2] : field1952[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIII)I", line = 583)
    public static final int method1293(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field1942++;
            int var6 = arg3 & 0x3;
            if (arg0 > -60) {
                return 24;
            } else if (var6 == 0) {
                return arg2;
            } else if (var6 == 1) {
                return arg1;
            } else if (var6 == 2) {
                return 7 - arg2;
            } else {
                return 7 - arg1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1952[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V", line = 606)
    public class152() {
        try {
            this.field1945 = new int[0];
            this.field1939 = new int[0];
            this.field1941 = new class693(0);
            this.field1941.field7571 = 1;
            this.field1940 = new class693();
            this.field1940.field7571 = 1;
            this.field1938 = new class693();
            this.field1950 = new class518[] { this.field1940, this.field1938, this.field1941 };
            this.field1938.field7571 = 1;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1952[5] + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljc;)V", line = 621)
    public class152(class711 arg0) {
        try {
            int var2 = arg0.method5128(0);
            int var3 = 0;
            int var4 = 0;
            int[][] var5 = new int[var2][];
            this.field1950 = new class518[var2];
            for (int var6 = 0; var6 < var2; var6++) {
                class518 var7 = class611.method4517(0, arg0);
                if (var7.method1319((byte) 81) >= 0) {
                    var3++;
                }
                if (var7.method350(3) >= 0) {
                    var4++;
                }
                int var8 = var7.field7570.length;
                var5[var6] = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    var5[var6][var9] = arg0.method5128(0);
                }
                this.field1950[var6] = var7;
            }
            this.field1939 = new int[var3];
            this.field1945 = new int[var4];
            int var10 = 0;
            int var11 = 0;
            for (int var12 = 0; var12 < var2; var12++) {
                class518 var13 = this.field1950[var12];
                int var14 = var13.field7570.length;
                for (int var15 = 0; var15 < var14; var15++) {
                    var13.field7570[var15] = this.field1950[var5[var12][var15]];
                }
                int var16 = var13.method1319((byte) 103);
                int var17 = var13.method350(3);
                if (var16 > 0) {
                    this.field1939[var10++] = var16;
                }
                if (var17 > 0) {
                    this.field1945[var11++] = var17;
                }
                var5[var12] = null;
            }
            this.field1940 = this.field1950[arg0.method5128(0)];
            this.field1938 = this.field1950[arg0.method5128(0)];
            Object var18 = null;
            this.field1941 = this.field1950[arg0.method5128(0)];
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field1952[5] + (arg0 == null ? field1952[2] : field1952[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1294(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1295(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
