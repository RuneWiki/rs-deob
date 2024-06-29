import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class73 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1047 = null;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[[I")
    public static int[][] field1051;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIIIIBI)V", line = 3)
    public static final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12) {
        field1049++;
        class5 var13 = new class5();
        var13.field52 = arg0;
        var13.field64 = arg12;
        if (arg11 != -119) {
            method534(32);
        }
        var13.field56 = arg7;
        var13.field59 = arg4;
        var13.field57 = arg10;
        var13.field55 = arg3;
        var13.field58 = arg9;
        var13.field60 = arg5;
        var13.field63 = arg2;
        var13.field53 = arg8;
        var13.field54 = arg1;
        var13.field68 = arg6;
        class395.field5837.method330(var13, -2130841184);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 29)
    public static void method534(int arg0) {
        field1051 = null;
        field1047 = null;
        if (arg0 != 4306) {
            field1047 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[BIILjava/lang/String;I)I", line = 43)
    public static final int method535(int arg0, byte[] arg1, int arg2, int arg3, String arg4, int arg5) {
        field1053++;
        int var6 = arg5 - arg2;
        if (arg0 != -9924) {
            method535(-6, (byte[]) null, -108, -83, (String) null, -57);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg3 + var7] = -97;
            } else {
                arg1[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I", line = 195)
    public static final int method536(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 14639) {
            field1051 = null;
        }
        field1050++;
        int var4 = 255 - arg2;
        int var5 = ((arg1 & 0xFF00) * arg2 & 0xFF0000 | (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
        return (((arg3 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg3 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 210)
    public static final void method537(int arg0) {
        field1048++;
        if (class349.field5050 != null) {
            return;
        }
        class349.field5050 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 != -340) {
            return;
        }
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var10 = var17;
                    var11 = var8;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class349.field5050[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBI)V", line = 331)
    public static final void method538(int arg0, int arg1, byte arg2, int arg3) {
        field1046++;
        if (class213.field2852 == null) {
            return;
        }
        long var4 = (long) (arg0 << 14 | arg3 << 28 | arg1);
        class38 var6 = (class38) class200.field2656.method384(var4, true);
        if (var6 == null) {
            class144.method916(arg3, arg1, arg0);
            return;
        }
        class200 var7 = (class200) var6.field533.method332(arg2 ^ 0x7F020E7C);
        if (var7 == null) {
            class144.method916(arg3, arg1, arg0);
            return;
        }
        class156 var8 = (class156) class144.method916(arg3, arg1, arg0);
        if (var8 == null) {
            var8 = new class156();
        } else {
            var8.field2111 = var8.field2106 = -1;
        }
        var8.field2105 = var7.field2658;
        var8.field2115 = var7.field2657;
        label48: while (true) {
            class200 var9 = (class200) var6.field533.method343((byte) -77);
            if (var9 == null) {
                break;
            }
            if (var8.field2105 != var9.field2658) {
                var8.field2111 = var9.field2658;
                var8.field2103 = var9.field2657;
                while (true) {
                    class200 var10 = (class200) var6.field533.method343((byte) -85);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field2105 != var10.field2658 && var8.field2111 != var10.field2658) {
                        var8.field2109 = var10.field2657;
                        var8.field2106 = var10.field2658;
                    }
                }
            }
        }
        if (arg2 != -36) {
            field1051 = null;
        }
        int var11 = class52.method359((byte) -116, (arg0 << 7) + 64, (arg1 << 7) + 64, arg3);
        class174.method1070(arg3, arg1, arg0, var11, var8);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 408)
    public static final void method539(byte arg0) {
        class6 var1 = (class6) class106.field1530.method1005(101);
        if (arg0 >= -108) {
            field1047 = null;
        }
        while (var1 != null) {
            var1.method41();
            var1 = (class6) class106.field1530.method1009(false);
        }
        field1052++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILud;IILps;BIII)V", line = 433)
    public static final void method540(int arg0, class2 arg1, int arg2, int arg3, class394 arg4, byte arg5, int arg6, int arg7, int arg8) {
        field1054++;
        int var9 = arg0 * arg0 + arg6 * arg6;
        if (var9 > arg3) {
            return;
        }
        int var10 = Math.min(arg4.field5773 / 2, arg4.field5672 / 2);
        if (var9 > var10 * var10) {
            var10 -= 10;
            int var11;
            if (class346.field4979 == 4) {
                var11 = (int) class396.field5847 & 0x3FFF;
            } else {
                var11 = (int) class396.field5847 + class399.field5948 & 0x3FFF;
            }
            int var12 = class117.field1644[var11];
            int var13 = class117.field1636[var11];
            if (class346.field4979 != 4) {
                var12 = var12 * 256 / (class364.field5261 + 256);
                var13 = var13 * 256 / (class364.field5261 + 256);
            }
            int var14 = arg0 * var13 + arg6 * var12 >> 15;
            int var15 = arg6 * var13 - (arg0 * var12) >> 15;
            double var16 = Math.atan2((double) var14, (double) var15);
            int var18 = (int) (Math.sin(var16) * (double) var10);
            int var19 = (int) ((double) var10 * Math.cos(var16));
            class62.field819[arg2].method448((float) arg4.field5773 / 2.0F + (float) arg7 + (float) var18, (float) arg4.field5672 / 2.0F + (float) arg8 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
        } else {
            class384.method2473(arg4, arg7, arg8, arg0, class1.field7[arg2], arg1, arg6, arg5 ^ 0xFFFFFF8D);
        }
        if (arg5 != 9) {
            method538(60, 103, (byte) -100, 42);
        }
    }
}
