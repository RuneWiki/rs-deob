import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class92 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lqa;")
    private class208 field1371;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Llg;")
    private class352 field1386;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[[S")
    public static short[][] field1390 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "F")
    public static float field1389 = 0.0F;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lgaa;")
    public static class248 field1377;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
    public static int[] field1374;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;IIIII[IILpa;IIBIIILjava/lang/String;)I", line = 6)
    public final int method717(class53[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, class311 arg8, int arg9, int arg10, byte arg11, int arg12, int arg13, int arg14, String arg15) {
        field1376++;
        int var17 = -111 / ((arg11 + 28) / 47);
        return this.method730(arg15, arg12, arg8, arg10, arg2, arg9, arg5, arg4, arg6, arg1, 0, arg3, arg14, arg7, arg13, arg0, 126);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/util/Random;[Lha;II[ILjava/lang/String;III)I", line = 16)
    public final int method718(int arg0, Random arg1, class53[] arg2, int arg3, int arg4, int[] arg5, String arg6, int arg7, int arg8, int arg9) {
        field1372++;
        if (arg6 == null) {
            return 0;
        }
        arg1.setSeed((long) arg9);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method727(12659, var11 << 24 | arg8 & 0xFFFFFF, var11 << 24 | arg7 & 0xFFFFFF);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 25 % ((arg4 - 44) / 38);
        for (int var16 = 0; var16 < var12; var16++) {
            var13[var16] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method720(var13, arg0, arg2, arg6, null, arg3, 0, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 52)
    public static void method719(byte arg0) {
        field1377 = null;
        field1374 = null;
        field1390 = null;
        if (arg0 >= -76) {
            field1390 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([II[Lha;Ljava/lang/String;[III[I)V", line = 65)
    private final void method720(int[] arg0, int arg1, class53[] arg2, String arg3, int[] arg4, int arg5, int arg6, int[] arg7) {
        int var9 = arg1 - this.field1386.field4791;
        field1375++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg6 != 0) {
            method719((byte) -70);
        }
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class520.method3074(arg3.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg3.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class197.method1327(var16.substring(4), arg6 ^ 0xFFFFFFAB);
                                    class53 var20 = arg2[var19];
                                    int var21 = arg7 == null ? var20.method322() : arg7[var19];
                                    var20.method333(arg5 + var17, this.field1386.field4791 + var9 + -var21 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg5 += arg2[var19].method326();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method721(true, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field1386.method2132(var15, (byte) -27, var11);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    if (var15 != ' ') {
                        if ((class542.field8124 & 0xFF000000) != 0) {
                            this.method216(var15, arg5 + var22 + 1, var9 + var23 - -1, class542.field8124, true);
                        }
                        this.method216(var15, arg5 + var22, var9 + var23, class321.field4424, false);
                    } else if (class141.field1991 > 0) {
                        class306.field4205 += class141.field1991;
                        arg5 += class306.field4205 >> 8;
                        class306.field4205 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field1386.method2134(var15, 123);
                    if (class143.field2008 != -1) {
                        this.field1371.method1371(arg5, var24, 1, class143.field2008, (int) ((double) this.field1386.field4791 * 0.7D) + var9);
                    }
                    if (class431.field5779 != -1) {
                        this.field1371.method1371(arg5, var24, 1, class431.field5779, var9 + this.field1386.field4791);
                    }
                    arg5 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 228)
    private final void method721(boolean arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class321.field4424 = class321.field4424 & 0xFF000000 | class311.method1896(arg1.substring(4), -1, 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class321.field4424 = class139.field1982 & 0xFFFFFF | class321.field4424 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class321.field4424 = class311.method1896(arg1.substring(5), -1, 16);
            } else if (arg1.equals("/argb")) {
                class321.field4424 = class139.field1982;
            } else if (arg1.startsWith("str=")) {
                class143.field2008 = class321.field4424 & 0xFF000000 | class311.method1896(arg1.substring(4), -1, 16);
            } else if (arg1.equals("str")) {
                class143.field2008 = class321.field4424 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class143.field2008 = -1;
            } else if (arg1.startsWith("u=")) {
                class431.field5779 = class321.field4424 & 0xFF000000 | class311.method1896(arg1.substring(2), -1, 16);
            } else if (arg1.equals("u")) {
                class431.field5779 = class321.field4424 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class431.field5779 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class542.field8124 = 0;
            } else if (arg1.startsWith("shad=")) {
                class542.field8124 = class321.field4424 & 0xFF000000 | class311.method1896(arg1.substring(5), -1, 16);
            } else if (arg1.equals("shad")) {
                class542.field8124 = class321.field4424 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class542.field8124 = class302.field4137;
            } else if (arg1.equals("br")) {
                this.method727(12659, class139.field1982, class302.field4137);
            }
        } catch (Exception var3) {
        }
        field1378++;
        if (!arg0) {
            this.method734(3, null, 117, -25, 40, 13);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V", line = 304)
    public final void method722(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1379++;
        if (arg0 == null) {
            return;
        }
        this.method727(12659, arg3, arg7);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg2));
        }
        this.method720(null, arg1, null, arg0, var12, arg5 - this.field1386.method2126((byte) 69, arg0) / 2, (short) arg6, null);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lpa;Ljava/lang/String;I[III[Lha;ZI)V", line = 341)
    private final void method723(class311 arg0, String arg1, int arg2, int[] arg3, int arg4, int arg5, class53[] arg6, boolean arg7, int arg8) {
        field1391++;
        int var10 = arg8 - this.field1386.field4791;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        int var14 = 0;
        if (!arg7) {
            return;
        }
        while (var14 < var13) {
            char var15 = (char) (class520.method3074(arg1.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg1.substring(var11 + 1, var14);
                        var11 = -1;
                        if (var16.equals("lt")) {
                            var15 = '<';
                        } else if (var16.equals("gt")) {
                            var15 = '>';
                        } else if (var16.equals("nbsp")) {
                            var15 = ' ';
                        } else if (var16.equals("shy")) {
                            var15 = '\u00AD';
                        } else if (var16.equals("times")) {
                            var15 = '×';
                        } else if (var16.equals("euro")) {
                            var15 = '€';
                        } else if (var16.equals("copy")) {
                            var15 = '©';
                        } else {
                            if (!var16.equals("reg")) {
                                if (var16.startsWith("img=")) {
                                    try {
                                        int var17 = class197.method1327(var16.substring(4), -93);
                                        class53 var18 = arg6[var17];
                                        int var19 = arg3 == null ? var18.method322() : arg3[var17];
                                        if ((class321.field4424 & 0xFF000000) == -16777216) {
                                            var18.method333(arg5, var10 + this.field1386.field4791 - var19, 1, 0, 1);
                                        } else {
                                            var18.method333(arg5, this.field1386.field4791 + var10 - var19, 0, class321.field4424 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        var12 = -1;
                                        arg5 += arg6[var17].method326();
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method721(true, var16);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg5 += this.field1386.method2132(var15, (byte) -72, var12);
                        }
                        if (var15 == ' ') {
                            if (class141.field1991 > 0) {
                                class306.field4205 += class141.field1991;
                                arg5 += class306.field4205 >> 8;
                                class306.field4205 &= 0xFF;
                            }
                        } else if (arg0 == null) {
                            if ((class542.field8124 & 0xFF000000) != 0) {
                                this.method216(var15, arg5 + 1, var10 + 1, class542.field8124, true);
                            }
                            this.method216(var15, arg5, var10, class321.field4424, false);
                        } else {
                            if ((class542.field8124 & 0xFF000000) != 0) {
                                this.method213(var15, arg5 + 1, var10 + 1, class542.field8124, true, arg0, arg2, arg4);
                            }
                            this.method213(var15, arg5, var10, class321.field4424, false, arg0, arg2, arg4);
                        }
                        int var20 = this.field1386.method2134(var15, -75);
                        if (class143.field2008 != -1) {
                            this.field1371.method1371(arg5, var20, 1, class143.field2008, var10 + ((int) ((double) this.field1386.field4791 * 0.7D)));
                        }
                        if (class431.field5779 != -1) {
                            this.field1371.method1371(arg5, var20, 1, class431.field5779, this.field1386.field4791 + var10 + 1);
                        }
                        arg5 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 502)
    private final void method724(int arg0, String arg1, int arg2) {
        field1369++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg2 != -23898) {
            this.method721(true, null);
        }
        while (arg1.length() > var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
            var6++;
        }
        if (var4 > 0) {
            class141.field1991 = (arg0 - this.field1386.method2126((byte) 67, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 547)
    public final void method725(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1370++;
        if (arg0 == null) {
            return;
        }
        this.method727(12659, arg1, arg3);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method720(var9, arg5, null, arg0, var10, arg2 - (this.field1386.method2126((byte) 121, arg0) / arg6), 0, null);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ZIII)V", line = 576)
    public final void method726(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1387++;
        if (arg1 != null) {
            this.method727(12659, arg4, arg3);
            this.method723(null, arg1, 0, null, 0, arg0, null, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V", line = 588)
    private final void method727(int arg0, int arg1, int arg2) {
        class139.field1982 = arg1;
        class321.field4424 = arg1;
        class141.field1991 = 0;
        field1383++;
        class431.field5779 = -1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        if (arg0 != 12659) {
            field1368 = -15;
        }
        class306.field4205 = 0;
        class143.field2008 = -1;
        class302.field4137 = arg2;
        class542.field8124 = arg2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IZIII)V", line = 610)
    public final void method728(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1388++;
        if (arg2) {
            field1368 = 39;
        }
        if (arg0 != null) {
            this.method727(12659, arg4, arg3);
            this.method723(null, arg0, 0, null, 0, arg5 - this.field1386.method2126((byte) 110, arg0), null, true, arg1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[IILjava/lang/String;II[II[Lha;IIIIILjava/util/Random;)I", line = 626)
    public final int method729(int arg0, int[] arg1, int arg2, String arg3, int arg4, int arg5, int[] arg6, int arg7, class53[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, Random arg14) {
        field1380++;
        if (arg3 == null) {
            return 0;
        }
        arg14.setSeed((long) arg11);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        this.method727(12659, var16 << 24 | arg9 & 0xFFFFFF, arg4 & 0xFFFFFF | var16 << 24);
        int var17 = arg3.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg13;
        int var22 = this.field1386.field4788 + arg5;
        if (arg2 == 1) {
            var22 += (arg12 - this.field1386.field4788 - this.field1386.field4792) / 2;
        } else if (arg2 == 2) {
            var22 = arg5 + arg12 - this.field1386.field4792;
        }
        if (arg10 != 30524) {
            this.field1386 = null;
        }
        int var23 = -1;
        if (arg0 == 1) {
            var23 = var19 + this.field1386.method2126((byte) 126, arg3);
            var21 = (arg7 - var23) / 2 + arg13;
        } else if (arg0 == 2) {
            var23 = var19 + this.field1386.method2126((byte) 101, arg3);
            var21 = arg7 + arg13 - var23;
        }
        this.method720(var18, var22, arg8, arg3, null, var21, 0, arg1);
        if (arg6 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field1386.method2126((byte) 77, arg3);
            }
            arg6[1] = var22 - this.field1386.field4788;
            arg6[2] = var23;
            arg6[0] = var21;
            arg6[3] = this.field1386.field4792 + this.field1386.field4788;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ILpa;IIIII[IIIIIII[Lha;I)I", line = 702)
    public final int method730(String arg0, int arg1, class311 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class53[] arg15, int arg16) {
        field1382++;
        if (arg0 == null) {
            return 0;
        }
        this.method727(12659, arg5, arg6);
        if (arg7 == 0) {
            arg7 = this.field1386.field4791;
        }
        int[] var18;
        if (arg4 < (this.field1386.field4788 + arg7 + this.field1386.field4792) && (arg7 + arg7) > arg4) {
            var18 = null;
        } else {
            var18 = new int[] { arg9 };
        }
        if (arg10 == -1) {
            arg10 = arg4 / arg7;
            if (arg10 <= 0) {
                arg10 = 1;
            }
        }
        int var19 = this.field1386.method2129((byte) -112, arg15, class522.field7467, var18, arg0);
        if (arg10 > 0 && arg10 <= var19) {
            class522.field7467[arg10 - 1] = this.field1386.method2127(class522.field7467[arg10 - 1], arg15, false, arg9);
            var19 = arg10;
        }
        if (arg3 == 3 && var19 == 1) {
            arg3 = 1;
        }
        int var21;
        if (arg3 == 0) {
            var21 = arg12 + this.field1386.field4788;
        } else if (arg3 == 1) {
            var21 = arg12 - (-((arg4 - this.field1386.field4788 - (this.field1386.field4792 - -((var19 - 1) * arg7))) / 2) - this.field1386.field4788);
        } else if (arg3 == 2) {
            var21 = arg4 + arg12 - ((var19 - 1) * arg7) - this.field1386.field4792;
        } else {
            int var20 = (arg4 - this.field1386.field4788 - this.field1386.field4792 - ((var19 - 1) * arg7)) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var21 = this.field1386.field4788 + arg12 + var20;
            arg7 += var20;
        }
        if (arg16 <= 120) {
            method733(29);
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg1 == 0) {
                this.method723(arg2, class522.field7467[var22], arg14, arg8, arg11, arg13, arg15, true, var21);
            } else if (arg1 == 1) {
                this.method723(arg2, class522.field7467[var22], arg14, arg8, arg11, arg13 + ((arg9 - this.field1386.method2126((byte) 81, class522.field7467[var22])) / 2), arg15, true, var21);
            } else if (arg1 == 2) {
                this.method723(arg2, class522.field7467[var22], arg14, arg8, arg11, arg13 + arg9 - this.field1386.method2126((byte) 89, class522.field7467[var22]), arg15, true, var21);
            } else if (var19 - 1 == var22) {
                this.method723(arg2, class522.field7467[var22], arg14, arg8, arg11, arg13, arg15, true, var21);
            } else {
                this.method724(arg9, class522.field7467[var22], -23898);
                this.method723(arg2, class522.field7467[var22], arg14, arg8, arg11, arg13, arg15, true, var21);
                class141.field1991 = 0;
            }
            var21 += arg7;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 804)
    public final void method731(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1381++;
        if (arg3 == null) {
            return;
        }
        this.method727(12659, arg4, arg5);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        if (arg6 > -63) {
            field1390 = null;
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method720(null, arg1, null, arg3, var9, arg0 - (this.field1386.method2126((byte) 118, arg3) / 2), 0, null);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[Lha;BLjava/lang/String;[III)V", line = 832)
    public final void method732(int arg0, int arg1, class53[] arg2, byte arg3, String arg4, int[] arg5, int arg6, int arg7) {
        field1385++;
        if (arg4 != null) {
            this.method727(12659, arg1, arg6);
            if (arg3 < -95) {
                this.method723(null, arg4, 0, arg5, 0, arg7, arg2, true, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 848)
    public static final void method733(int arg0) {
        field1373++;
        class581.field8544.method837(arg0 ^ 0x7D);
        if (arg0 != 0) {
            field1374 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 860)
    public final void method734(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field1384++;
        if (arg1 == null) {
            return;
        }
        if (arg2 <= 88) {
            field1374 = null;
        }
        this.method727(12659, arg3, arg5);
        this.method723(null, arg1, 0, null, 0, arg4 - (this.field1386.method2126((byte) 101, arg1) / 2), null, true, arg0);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Llg;)V", line = 881)
    public class92(class208 arg0, class352 arg1) {
        this.field1371 = arg0;
        this.field1386 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
    public abstract void method216(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLpa;II)V")
    public abstract void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class311 arg5, int arg6, int arg7);
}
