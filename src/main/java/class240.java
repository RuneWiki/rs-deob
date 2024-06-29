import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class240 {

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field3968 = -1;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "Lph;")
    public static class229 field3974 = class266.method1858("mapflag", 0);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[Ljm;")
    public static class134[] field3967 = new class134[0];

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lsl;")
    public static class283 field3966;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[[S")
    public static short[][] field3971;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 11)
    public static final String method1689(Throwable arg0, byte arg1) throws IOException {
        String var2;
        if ((arg0 instanceof class196)) {
            class196 var3 = (class196) arg0;
            var2 = var3.field3279 + " | ";
            arg0 = var3.field3275;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        field3972++;
        PrintWriter var5 = new PrintWriter(var4);
        int var6 = 36 % ((-arg1 - 20) / 53);
        arg0.printStackTrace(var5);
        var5.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var2 + "| " + var9;
                }
                int var12 = var10.indexOf(40);
                int var13 = var10.indexOf(41, var12 + 1);
                if (var12 >= 0 && var13 >= 0) {
                    String var14 = var10.substring(var12 + 1, var13);
                    int var15 = var14.indexOf(".java:");
                    if (var15 >= 0) {
                        String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                        var2 = var2 + var16 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var12);
                }
                String var17 = var10.trim();
                String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                var2 = var2 + var19 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([[FI[[BII[[F[[I[[F[[B[Lla;[[B[[B)V", line = 84)
    public static final void method1690(float[][] arg0, int arg1, byte[][] arg2, int arg3, int arg4, float[][] arg5, int[][] arg6, float[][] arg7, byte[][] arg8, class195[] arg9, byte[][] arg10, byte[][] arg11) {
        if (arg3 != 1) {
            return;
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            class195 var13 = arg9[var12];
            if (var13.field3262 == arg4) {
                int var14 = 0;
                class35 var15 = new class35();
                int var16 = (var13.field3263 >> 7) - var13.field3264;
                if (var16 < 0) {
                    var14 -= var16;
                    var16 = 0;
                }
                int var17 = (var13.field3263 >> 7) + var13.field3264;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = (var13.field3244 >> 7) - var13.field3264;
                for (int var19 = var16; var19 <= var17; var19++) {
                    short var20 = var13.field3258[var14];
                    int var21 = (var20 >> 8) + var18;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg2[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg8[var23][var19] & 0xFF;
                        if (var26 == 0) {
                            if (var24 == 0) {
                                continue;
                            }
                            class282 var31 = class110.method838(var24 - 1, false);
                            if (var31.field4676 == -1) {
                                continue;
                            }
                            if (arg11[var23][var19] != 0) {
                                int[] var32 = class192.field3179[arg11[var23][var19]];
                                var15.field587 += (var32.length >> 1) * 3 - 6;
                                var15.field584 += var32.length >> 1;
                                continue;
                            }
                        } else if (var24 != 0) {
                            class282 var27 = class110.method838(var24 - 1, false);
                            if (var27.field4676 == -1) {
                                byte var28 = arg11[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class61.field881[var28];
                                    var15.field587 += ((var29.length >> 1) - 2) * 3;
                                    var15.field584 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg11[var23][var19];
                            if (var30 != 0) {
                                var25 = true;
                            }
                        }
                        class152 var33 = class149.method1086(arg4, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field2479 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field2479 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var45 = (var23 + 1) <= var22;
                                    boolean var46 = (var23 - 1) >= var21;
                                    if (!var46 && (var19 + 1) <= var17) {
                                        short var47 = var13.field3258[var14 + 1];
                                        int var48 = (var47 >> 8) + var18;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var23 > var48 && var49 > var23;
                                    }
                                    if (!var45 && (var19 - 1) >= var16) {
                                        short var50 = var13.field3258[var14 - 1];
                                        int var51 = (var50 >> 8) + var18;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var51 < var23 && var52 > var23;
                                    }
                                    if (var46 && var45) {
                                        var35 = class192.field3179[0];
                                    } else if (var46) {
                                        var35 = class192.field3179[1];
                                    } else if (var45) {
                                        var35 = class192.field3179[1];
                                    }
                                } else {
                                    boolean var37 = var21 <= (var23 - 1);
                                    boolean var38 = var22 >= (var23 + 1);
                                    if (!var37 && (var19 - 1) >= var16) {
                                        short var39 = var13.field3258[var14 - 1];
                                        int var40 = var18 + (var39 >> 8);
                                        int var41 = var40 + (var39 & 0xFF);
                                        var37 = var40 < var23 && var41 > var23;
                                    }
                                    if (!var38 && var19 + 1 <= var17) {
                                        short var42 = var13.field3258[var14 + 1];
                                        int var43 = (var42 >> 8) + var18;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var38 = var43 < var23 && var44 > var23;
                                    }
                                    if (var37 && var38) {
                                        var35 = class192.field3179[0];
                                    } else if (var37) {
                                        var35 = class192.field3179[1];
                                    } else if (var38) {
                                        var35 = class192.field3179[1];
                                    }
                                }
                                if (var35 != null) {
                                    var15.field587 += ((var35.length >> 1) - 2) * 3;
                                    var15.field584 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var54 = class192.field3179[arg11[var23][var19]];
                            int[] var55 = class61.field881[arg11[var23][var19]];
                            var15.field587 += (var54.length >> 1) * 3 - 6;
                            var15.field587 += (var55.length >> 1) * 3 - 6;
                            var15.field584 += var54.length >> 1;
                            var15.field584 += var55.length >> 1;
                        } else {
                            int[] var53 = class192.field3179[0];
                            var15.field587 += (var53.length >> 1) * 3 - 6;
                            var15.field584 += var53.length >> 1;
                        }
                    }
                    var14++;
                }
                var15.method285();
                int var56 = 0;
                if ((var13.field3263 >> 7) - var13.field3264 < 0) {
                    var56 -= (var13.field3263 >> 7) - var13.field3264;
                }
                for (int var57 = var16; var57 <= var17; var57++) {
                    short var58 = var13.field3258[var56];
                    int var59 = var18 + (var58 >> 8);
                    int var60 = var59 - (1 - (var58 & 0xFF));
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg10[var61][var57];
                        int var63 = arg8[var61][var57] & 0xFF;
                        int var64 = arg2[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class282 var66 = class110.method838(var64 - 1, false);
                            if (var66.field4676 == -1) {
                                continue;
                            }
                            if (arg11[var61][var57] != 0) {
                                class320.method2162(var15, class192.field3179[arg11[var61][var57]], arg7, var61, arg6, arg10[var61][var57], var57, arg5, arg0, var13, arg3 ^ 0xFFFFFF98);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class282 var67 = class110.method838(var64 - 1, false);
                            if (var67.field4676 == -1) {
                                class320.method2162(var15, class61.field881[arg11[var61][var57]], arg7, var61, arg6, arg10[var61][var57], var57, arg5, arg0, var13, -107);
                                continue;
                            }
                            byte var68 = arg11[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class152 var69 = class149.method1086(arg4, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field2479 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field2479 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var81 = var59 <= (var61 - 1);
                                    boolean var82 = (var61 + 1) <= var60;
                                    if (!var81 && var57 + 1 <= var17) {
                                        short var83 = var13.field3258[var56 + 1];
                                        int var84 = (var83 >> 8) + var18;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var85 > var61;
                                    }
                                    if (!var82 && var16 <= var57 - 1) {
                                        short var86 = var13.field3258[var56 - 1];
                                        int var87 = (var86 >> 8) + var18;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var72 = class192.field3179[0];
                                    } else if (var81) {
                                        var72 = class192.field3179[1];
                                        var62 = 1;
                                    } else if (var82) {
                                        var72 = class192.field3179[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = var61 - 1 >= var59;
                                    boolean var74 = var60 >= (var61 + 1);
                                    if (!var73 && var16 <= (var57 - 1)) {
                                        short var75 = var13.field3258[var56 - 1];
                                        int var76 = (var75 >> 8) + var18;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var61 > var76 && var61 < var77;
                                    }
                                    if (!var74 && var17 >= var57 + 1) {
                                        short var78 = var13.field3258[var56 + 1];
                                        int var79 = (var78 >> 8) + var18;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var72 = class192.field3179[0];
                                    } else if (var73) {
                                        var72 = class192.field3179[1];
                                        var62 = 0;
                                    } else if (var74) {
                                        var72 = class192.field3179[1];
                                        var62 = 2;
                                    }
                                }
                                if (var72 != null) {
                                    class320.method2162(var15, var72, arg7, var61, arg6, var62, var57, arg5, arg0, var13, -104);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class320.method2162(var15, class61.field881[arg11[var61][var57]], arg7, var61, arg6, arg10[var61][var57], var57, arg5, arg0, var13, -86);
                            class320.method2162(var15, class192.field3179[arg11[var61][var57]], arg7, var61, arg6, arg10[var61][var57], var57, arg5, arg0, var13, -119);
                        } else {
                            class320.method2162(var15, class192.field3179[0], arg7, var61, arg6, var62, var57, arg5, arg0, var13, -128);
                        }
                    }
                    var56++;
                }
                if (var15.field586 > 0 && var15.field588 > 0) {
                    var15.method288();
                    var13.field3255 = var15;
                }
            }
        }
        field3965++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 625)
    public static void method1691(int arg0) {
        field3966 = null;
        if (arg0 != 1) {
            method1691(90);
        }
        field3971 = (short[][]) null;
        field3974 = null;
        field3967 = null;
    }
}
