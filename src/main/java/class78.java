import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class78 {

    @OriginalMember(owner = "client!u", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1217 = new String[] { method821(method820("X\u0002hO")), method821(method820("MY*\rt")), method821(method820("CYF\u000b")), method821(method820("CYG\u000b")), method821(method820("CYE\u000b")), method821(method820("CY@\u000b")) };

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[Lbu;")
    public static class19[] field1214 = new class19[1024];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lhl;")
    public static class556 field1211 = new class556(80, 4);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "[I")
    public static int[] field1215 = new int[32];

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lhe;")
    public static class391 field1216;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 9)
    public static void method816(int arg0) {
        try {
            field1214 = null;
            field1216 = null;
            int var1 = -99 % ((24 - arg0) / 53);
            field1211 = null;
            field1215 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1217[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILhu;ZLhu;ZZ)I", line = 24)
    public static final int method817(int arg0, int arg1, class139 arg2, boolean arg3, class139 arg4, boolean arg5, boolean arg6) {
        try {
            field1213++;
            int var7 = class198.method1813(arg2, arg0, arg6, arg4, (byte) 45);
            if (var7 == 0) {
                if (arg5) {
                    field1216 = null;
                }
                if (arg1 == -1) {
                    return 0;
                } else {
                    int var8 = class198.method1813(arg2, arg1, arg3, arg4, (byte) 45);
                    return arg3 ? -var8 : var8;
                }
            } else if (arg6) {
                return -var7;
            } else {
                return var7;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field1217[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1217[0] : field1217[1]) + ',' + arg3 + ',' + (arg4 == null ? field1217[0] : field1217[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IIIIIIZ)V", line = 56)
    public static final void method818(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            field1210++;
            if (arg6 > 0 && !class46.method469(arg6, 1010)) {
                throw new IllegalArgumentException("");
            } else if (arg0 > 0 && !class46.method469(arg0, 1010)) {
                throw new IllegalArgumentException("");
            } else if (arg2 == 32993) {
                int var8 = 0;
                int var9 = arg0 > arg6 ? arg6 : arg0;
                int var10 = arg6 >> 1;
                if (arg7) {
                    field1211 = null;
                }
                int var11 = arg0 >> 1;
                int[] var12 = arg1;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg3, var8, arg5, arg6, arg0, 0, arg2, arg4, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg6 + var15;
                    for (int var17 = 0; var17 < var11; var17++) {
                        for (int var18 = 0; var18 < var10; var18++) {
                            int var19 = var12[var15++];
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var19 & 0xFF;
                            int var23 = var19 >> 24 & 0xFF;
                            int var24 = var19 >> 8 & 0xFF;
                            int var25 = var12[var16++];
                            int var26 = (var19 & 0xFFCB1C) >> 16;
                            int var27 = (var20 >> 16 & 0xFF) + var26;
                            int var28 = ((var20 & 0xFF44) >> 8) + var24;
                            int var29 = (var20 >> 24 & 0xFF) + var23;
                            int var30 = (var20 & 0xFF) + var22;
                            int var31 = (var21 >> 24 & 0xFF) + var29;
                            int var32 = ((var21 & 0xFF7DAF) >> 16) + var27;
                            int var33 = ((var21 & 0xFF33) >> 8) + var28;
                            int var34 = (var21 & 0xFF) + var30;
                            int var35 = (var25 >> 24 & 0xFF) + var31;
                            int var36 = (var25 & 0xFF) + var34;
                            int var37 = (var25 >> 8 & 0xFF) + var33;
                            int var38 = (var25 >> 16 & 0xFF) + var32;
                            var13[var14++] = class553.method4099(class292.method2485(var36, 1020) >> 2, class553.method4099(class553.method4099(class292.method2485(var38 << 14, 16711680), class292.method2485(-16777216, var35 << 22)), class292.method2485(var37 << 6, 65280)));
                        }
                        var16 += arg6;
                        var15 += arg6;
                    }
                    int[] var39 = var13;
                    var13 = var12;
                    var12 = var39;
                    arg0 = var11;
                    arg6 = var10;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                    var8++;
                    var10 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var41) {
            throw class590.method4333(var41, field1217[2] + arg0 + ',' + (arg1 == null ? field1217[0] : field1217[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 162)
    public static final void method819(int arg0) {
        try {
            field1212++;
            for (class195 var1 = (class195) class669.field9510.method3228(arg0 ^ 0x1642); var1 != null; var1 = (class195) class669.field9510.method3216(true)) {
                if (var1.field3085) {
                    var1.method1799((byte) -37);
                }
            }
            class195 var2 = (class195) class190.field3010.method3228(arg0 - 5694);
            if (arg0 != 5705) {
                field1215 = null;
            }
            while (var2 != null) {
                if (var2.field3085) {
                    var2.method1799((byte) -37);
                }
                var2 = (class195) class190.field3010.method3216(true);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1217[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!u", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method820(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!u", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method821(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
