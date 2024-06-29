import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class130 {

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Lqe;")
    public static class168 field2300 = class66.method448(")3runescape)3com", -117);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lwd;")
    public static class67 field2293;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
    public static int[] field2299;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method882(byte arg0, String arg1) throws ClassNotFoundException {
        field2295++;
        if (arg0 != 16) {
            method886(null, -66);
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2299 = null;
        field2293 = null;
        if (arg0 >= -110) {
            method885(-1, 46, -8, -21, null);
        }
        field2300 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lrd;ILt;I)V")
    public static final void method884(class207 arg0, int arg1, class206 arg2, int arg3) {
        field2294++;
        byte[] var4 = null;
        class47 var5 = class169.field2941;
        synchronized (class169.field2941) {
            for (class19 var6 = (class19) class169.field2941.method315(-31594); var6 != null; var6 = (class19) class169.field2941.method312(1012)) {
                if ((long) arg3 == var6.field3308 && var6.field229 == arg2 && var6.field230 == 0) {
                    var4 = var6.field237;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg0.method1346(255, var4, arg2, true, arg3);
            return;
        }
        byte[] var7 = arg2.method1334(0, arg3);
        arg0.method1346(255, var7, arg2, true, arg3);
        if (arg1 != -29023) {
            method883(80);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII[[[Ldf;)V")
    public static final void method885(int arg0, int arg1, int arg2, int arg3, class177[][][] arg4) {
        field2296++;
        byte var5 = (byte) (class237.field4073 & 0xFF);
        int var6 = 126 % ((arg2 + 15) / 55);
        if (class198.field3418[class196.field3401][arg1][arg0] == var5) {
            return;
        }
        byte var7 = 0;
        class126.field2102[var7] = arg1;
        int var8 = 0;
        int var31 = var7 + 1;
        class166.field2825[var7] = arg0;
        class198.field3418[class196.field3401][arg1][arg0] = var5;
        while (var31 != var8) {
            int var9 = class126.field2102[var8] & 0xFFFF;
            int var10 = class126.field2102[var8] >> 16 & 0xFF;
            int var11 = class126.field2102[var8] >> 24 & 0xFF;
            int var12 = class166.field2825[var8] & 0xFFFF;
            boolean var13 = false;
            if ((class205.field3561[class196.field3401][var9][var12] & 0x4) == 0) {
                var13 = true;
            }
            int var14 = class166.field2825[var8] >> 16 & 0xFF;
            var8 = var8 + 1 & 0xFFF;
            boolean var15 = false;
            label216: for (int var16 = class196.field3401 + 1; var16 <= 3; var16++) {
                if ((class205.field3561[var16][var9][var12] & 0x8) == 0) {
                    if (var13 && arg4[var16][var9][var12] != null) {
                        if (arg4[var16][var9][var12].field3116 != null) {
                            int var19 = class56.method389(var10, (byte) 85);
                            if (arg4[var16][var9][var12].field3116.field2773 == var19 || arg4[var16][var9][var12].field3116.field2774 == var19) {
                                continue;
                            }
                            if (var11 != 0) {
                                int var20 = class56.method389(var11, (byte) 118);
                                if (arg4[var16][var9][var12].field3116.field2773 == var20 || arg4[var16][var9][var12].field3116.field2774 == var20) {
                                    continue;
                                }
                            }
                            if (var14 != 0) {
                                int var21 = class56.method389(var14, (byte) 103);
                                if (arg4[var16][var9][var12].field3116.field2773 == var21 || arg4[var16][var9][var12].field3116.field2774 == var21) {
                                    continue;
                                }
                            }
                        }
                        if (arg4[var16][var9][var12].field3090 != null) {
                            for (int var22 = 0; var22 < arg4[var16][var9][var12].field3115; var22++) {
                                int var23 = (int) (arg4[var16][var9][var12].field3090[var22].field2937 >> 14 & 0x3FL);
                                int var24 = (int) (arg4[var16][var9][var12].field3090[var22].field2937 >> 20 & 0x3L);
                                if (var23 == 21) {
                                    var23 = 19;
                                }
                                int var25 = var24 << 6 | var23;
                                if (var10 == var25 || var11 != 0 && var11 == var25 || var14 != 0 && var14 == var25) {
                                    continue label216;
                                }
                            }
                        }
                    }
                    class177 var26 = arg4[var16][var9][var12];
                    var15 = true;
                    if (var26 != null && var26.field3115 > 0) {
                        for (int var27 = 0; var27 < var26.field3115; var27++) {
                            class169 var28 = var26.field3090[var27];
                            if (var28.field2939 != var28.field2932 || var28.field2936 != var28.field2923) {
                                for (int var29 = var28.field2939; var29 <= var28.field2932; var29++) {
                                    for (int var30 = var28.field2923; var30 <= var28.field2936; var30++) {
                                        class198.field3418[var16][var29][var30] = var5;
                                    }
                                }
                            }
                        }
                    }
                    class198.field3418[var16][var9][var12] = var5;
                }
            }
            if (var15) {
                if (class208.field3608[arg3] < class23.field275[class196.field3401 + 1][var9][var12]) {
                    class208.field3608[arg3] = class23.field275[class196.field3401 + 1][var9][var12];
                }
                int var17 = var12 << 7;
                int var18 = var9 << 7;
                if (class200.field3453[arg3] > var18) {
                    class200.field3453[arg3] = var18;
                } else if (class31.field373[arg3] < var18) {
                    class31.field373[arg3] = var18;
                }
                if (class176.field3086[arg3] > var17) {
                    class176.field3086[arg3] = var17;
                } else if (class19.field233[arg3] < var17) {
                    class19.field233[arg3] = var17;
                }
            }
            if (!var13) {
                if (var9 >= 1 && class198.field3418[class196.field3401][var9 - 1][var12] != var5) {
                    class126.field2102[var31] = class102.method675(class102.method675(1179648, var9 - 1), -754974720);
                    class166.field2825[var31] = class102.method675(1245184, var12);
                    class198.field3418[class196.field3401][var9 - 1][var12] = var5;
                    var31 = var31 + 1 & 0xFFF;
                }
                var12++;
                if (var12 < 104) {
                    if (var9 - 1 >= 0 && class198.field3418[class196.field3401][var9 - 1][var12] != var5 && (class205.field3561[class196.field3401][var9][var12] & 0x4) == 0 && (class205.field3561[class196.field3401][var9 - 1][var12 - 1] & 0x4) == 0) {
                        class126.field2102[var31] = class102.method675(1375731712, class102.method675(var9 - 1, 1179648));
                        class166.field2825[var31] = class102.method675(var12, 1245184);
                        class198.field3418[class196.field3401][var9 - 1][var12] = var5;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    if (class198.field3418[class196.field3401][var9][var12] != var5) {
                        class126.field2102[var31] = class102.method675(class102.method675(5373952, var9), 318767104);
                        class166.field2825[var31] = class102.method675(5439488, var12);
                        class198.field3418[class196.field3401][var9][var12] = var5;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    if (var9 + 1 < 104 && class198.field3418[class196.field3401][var9 + 1][var12] != var5 && (class205.field3561[class196.field3401][var9][var12] & 0x4) == 0 && (class205.field3561[class196.field3401][var9 + 1][var12 - 1] & 0x4) == 0) {
                        class126.field2102[var31] = class102.method675(-1845493760, class102.method675(5373952, var9 + 1));
                        class166.field2825[var31] = class102.method675(var12, 5439488);
                        class198.field3418[class196.field3401][var9 + 1][var12] = var5;
                        var31 = var31 + 1 & 0xFFF;
                    }
                }
                var12--;
                if (var9 + 1 < 104 && class198.field3418[class196.field3401][var9 + 1][var12] != var5) {
                    class126.field2102[var31] = class102.method675(class102.method675(var9 + 1, 9568256), 1392508928);
                    class166.field2825[var31] = class102.method675(9633792, var12);
                    class198.field3418[class196.field3401][var9 + 1][var12] = var5;
                    var31 = var31 + 1 & 0xFFF;
                }
                var12--;
                if (var12 >= 0) {
                    if (var9 - 1 >= 0 && class198.field3418[class196.field3401][var9 - 1][var12] != var5 && (class205.field3561[class196.field3401][var9][var12] & 0x4) == 0 && (class205.field3561[class196.field3401][var9 - 1][var12 + 1] & 0x4) == 0) {
                        class126.field2102[var31] = class102.method675(301989888, class102.method675(var9 - 1, 13762560));
                        class166.field2825[var31] = class102.method675(13828096, var12);
                        class198.field3418[class196.field3401][var9 - 1][var12] = var5;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    if (class198.field3418[class196.field3401][var9][var12] != var5) {
                        class126.field2102[var31] = class102.method675(class102.method675(var9, 13762560), -1828716544);
                        class166.field2825[var31] = class102.method675(13828096, var12);
                        class198.field3418[class196.field3401][var9][var12] = var5;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    if (var9 + 1 < 104 && class198.field3418[class196.field3401][var9 + 1][var12] != var5 && (class205.field3561[class196.field3401][var9][var12] & 0x4) == 0 && (class205.field3561[class196.field3401][var9 + 1][var12 + 1] & 0x4) == 0) {
                        class126.field2102[var31] = class102.method675(class102.method675(var9 + 1, 9568256), -771751936);
                        class166.field2825[var31] = class102.method675(var12, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class198.field3418[class196.field3401][var9 + 1][var12] = var5;
                    }
                }
            }
        }
        if (class208.field3608[arg3] == -1000000) {
            return;
        }
        class208.field3608[arg3] += 10;
        class200.field3453[arg3] -= 50;
        class31.field373[arg3] += 50;
        class19.field233[arg3] += 50;
        class176.field3086[arg3] -= 50;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([BI)V")
    public static final void method886(byte[] arg0, int arg1) {
        if (arg1 != -21658) {
            field2293 = null;
        }
        field2298++;
        byte[][] var2 = new byte[class79.field1189][class42.field552];
        int var3 = class193.field3365 >> 2 << 10;
        int var4 = class247.field4279 >> 1;
        int var5 = 0;
        while (true) {
            while (var5 < arg0.length) {
                int var34 = (arg0[var5++] & 0xFF) * 64 - class232.field3935;
                int var35 = (arg0[var5++] & 0xFF) * 64 - class162.field2781;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class79.field1189 && var35 + 64 < class42.field552) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        int var37 = class42.field552 - var35 - 1;
                        byte[] var38 = var2[var36 + var34];
                        for (int var39 = -64; var39 < 0; var39++) {
                            var38[var37--] = arg0[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class79.field1189;
            int var7 = class42.field552;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var6 > var28) {
                        int var29 = var2[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class123 var30 = class223.method1461(var29 - 1, false);
                            var8[var14] += var30.field2037;
                            var9[var14] += var30.field2039;
                            var11[var14] += var30.field2025;
                            var10[var14] += var30.field2029;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var2[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class123 var33 = class223.method1461(var32 - 1, false);
                            var8[var14] -= var33.field2037;
                            var9[var14] -= var33.field2039;
                            var11[var14] -= var33.field2025;
                            var10[var14] -= var33.field2029;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class32.field389[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < var7) {
                            var20 += var12[var22];
                            var18 += var9[var22];
                            var16 += var8[var22];
                            var19 += var10[var22];
                            var17 += var11[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var18 -= var9[var23];
                            var20 -= var12[var23];
                            var16 -= var8[var23];
                            var17 -= var11[var23];
                            var19 -= var10[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var19 == 0 ? 0 : class242.method1592(var18 / var20, -13646, var17 / var20, var16 * 256 / var19);
                            if (var2[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class32.field389[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var4;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var3 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class86.method571(var21 << 6, 4032) + class86.method571(var13, 63)] = class248.field4296[class120.method820(96, var27, (byte) -94)];
                            } else if (var15[var24] != null) {
                                var15[var24][class86.method571(var21 << 6, 4032) + class86.method571(63, var13)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
