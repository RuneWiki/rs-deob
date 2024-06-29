import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class316 {

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lgf;")
    private class183 field4217;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lza;")
    private class287 field4229;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4210 = 0;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Ljc;")
    public static class305 field4224 = new class305("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!la", name = "z", descriptor = "S")
    public static short field4231 = 1;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lwq;")
    public static class115 field4228 = new class115(8, 4);

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Z")
    public static boolean field4233 = false;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lfo;")
    public static class361 field4207;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public final void method1867(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field4215++;
        if (arg5 == null) {
            return;
        }
        this.method1886((byte) -118, arg0, arg3);
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method1871(null, null, arg7, var12, arg6 - (this.field4217.method1066(106, arg5) / arg1), -22833, arg5, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[Lo;ILta;Ljava/lang/String;[I)V")
    private final void method1868(int arg0, int arg1, int arg2, int arg3, class24[] arg4, int arg5, class144 arg6, String arg7, int[] arg8) {
        int var10 = arg1 - this.field4217.field2373;
        field4220++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class291.method1754(arg7.charAt(var14), 24391) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg7.substring(var11 + 1, var14);
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
                                    int var17 = class304.method1819((byte) -99, var16.substring(4));
                                    class24 var18 = arg4[var17];
                                    int var19 = arg8 == null ? var18.method153() : arg8[var17];
                                    if ((class282.field3741 & 0xFF000000) == -16777216) {
                                        var18.method12(arg5, var10 - (var19 - this.field4217.field2373), 1, 0, 1);
                                    } else {
                                        var18.method12(arg5, var10 + this.field4217.field2373 - var19, 0, class282.field3741 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg4[var17].method155();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1883((byte) -38, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field4217.method1062(var15, var12, (byte) 107);
                    }
                    if (var15 == ' ') {
                        if (class238.field3172 > 0) {
                            class465.field6929 += class238.field3172;
                            arg5 += class465.field6929 >> 8;
                            class465.field6929 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class246.field3236 & 0xFF000000) != 0) {
                            this.method423(var15, arg5 + 1, var10 + 1, class246.field3236, true);
                        }
                        this.method423(var15, arg5, var10, class282.field3741, false);
                    } else {
                        if ((class246.field3236 & 0xFF000000) != 0) {
                            this.method422(var15, arg5 + 1, var10 + 1, class246.field3236, true, arg6, arg3, arg0);
                        }
                        this.method422(var15, arg5, var10, class282.field3741, false, arg6, arg3, arg0);
                    }
                    int var20 = this.field4217.method1067(var15, 255);
                    if (class314.field4192 != -1) {
                        this.field4229.method1718(arg5, var20, var10 + ((int) ((double) this.field4217.field2373 * 0.7D)), class314.field4192, false);
                    }
                    if (class474.field7034 != -1) {
                        this.field4229.method1718(arg5, var20, var10 - (-this.field4217.field2373 - 1), class474.field7034, false);
                    }
                    arg5 += var20;
                    var12 = var15;
                }
            }
        }
        if (arg2 != 8364) {
            method1870(-7);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLlr;Z)V")
    public static final void method1869(byte arg0, class531 arg1, boolean arg2) {
        int var3 = 4 / ((-arg0 - 73) / 47);
        field4223++;
        if (class391.field5656 >= 400) {
            return;
        }
        if (class96.field1170 != arg1) {
            String var10;
            if (arg1.field7834 == 0) {
                boolean var4 = true;
                if (class96.field1170.field7810 != -1 && arg1.field7810 != -1) {
                    int var5 = arg1.field7793 >= class96.field1170.field7793 ? arg1.field7793 : class96.field1170.field7793;
                    int var6 = class96.field1170.field7810 >= arg1.field7810 ? arg1.field7810 : class96.field1170.field7810;
                    int var7 = (var5 * 10 / 100) + var6 + 5;
                    int var8 = class96.field1170.field7793 - arg1.field7793;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class381.field5520 == class373.field5065 ? class328.field4357.method1823(class374.field5072, (byte) -88) : class80.field979.method1823(class374.field5072, (byte) -88);
                if (arg1.field7793 >= arg1.field7809) {
                    var10 = arg1.method3158(true, 28451) + (var4 ? class460.method2830(arg1.field7793, -10, class96.field1170.field7793) : "<col=ffffff>") + " (" + var9 + arg1.field7793 + ")";
                } else {
                    var10 = arg1.method3158(true, 28451) + (var4 ? class460.method2830(arg1.field7793, -10, class96.field1170.field7793) : "<col=ffffff>") + " (" + var9 + arg1.field7793 + "+" + (arg1.field7809 - arg1.field7793) + ")";
                }
            } else {
                var10 = arg1.method3158(true, 28451) + " (" + class130.field1685.method1823(class374.field5072, (byte) -88) + arg1.field7834 + ")";
            }
            if (class323.field4302) {
                if (!arg2 && (class41.field448 & 0x8) != 0) {
                    class144.method878(-1, 0, 25, class48.field531, class191.field2465 + " -> <col=ffffff>" + var10, 0, class207.field2724, (long) arg1.field1211, true, false, (byte) -99);
                    class433.field6308++;
                }
            } else if (arg2) {
                class144.method878(0, 0, -1, "<col=cccccc>" + var10, "", 0, -1, 0L, false, true, (byte) -64);
            } else {
                for (int var11 = 7; var11 >= 0; var11--) {
                    if (class185.field2419[var11] != null) {
                        short var12 = 0;
                        if (class381.field5520 == class111.field1480 && class185.field2419[var11].equalsIgnoreCase(class167.field2158.method1823(class374.field5072, (byte) -88))) {
                            if (class96.field1170.field7793 < arg1.field7793) {
                                var12 = 2000;
                            }
                            if (class96.field1170.field7808 != 0 && arg1.field7808 != 0) {
                                if (class96.field1170.field7808 == arg1.field7808) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class155.field2040[var11]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class321.field4278[var11] + var12);
                        int var14 = class245.field3229[var11] == -1 ? class105.field1416 : class245.field3229[var11];
                        class144.method878(-1, 0, var13, class185.field2419[var11], "<col=ffffff>" + var10, 0, var14, (long) arg1.field1211, true, false, (byte) -115);
                        class75.field947++;
                    }
                }
            }
            if (!arg2) {
                for (class36 var15 = (class36) class69.field806.method970(12); var15 != null; var15 = (class36) class69.field806.method976((byte) 122)) {
                    if (var15.field361 == 5) {
                        var15.field369 = "<col=ffffff>" + var10;
                        return;
                    }
                }
            }
        } else if (class323.field4302 && (class41.field448 & 0x10) != 0) {
            class443.field6450++;
            class144.method878(-1, 0, 57, class48.field531, class191.field2465 + " -> <col=ffffff>" + class378.field5460.method1823(class374.field5072, (byte) -88), 0, class207.field2724, 0L, true, false, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1870(int arg0) {
        field4224 = null;
        int var1 = 10 % ((arg0 - 83) / 34);
        field4207 = null;
        field4228 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I[II[IIILjava/lang/String;[Lo;)V")
    private final void method1871(int[] arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, String arg6, class24[] arg7) {
        int var9 = arg2 - this.field4217.field2373;
        field4221++;
        if (arg5 != -22833) {
            this.method1884(null, -34, -20, -98, -5, 105, (byte) 96);
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class291.method1754(arg6.charAt(var14), 24391) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg6.substring(var10 + 1, var14);
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
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class304.method1819((byte) -100, var16.substring(4));
                                    class24 var20 = arg7[var19];
                                    int var21 = arg0 == null ? var20.method153() : arg0[var19];
                                    var20.method12(arg4 + var17, -var21 + this.field4217.field2373 + var9 + var18, 1, 0, 1);
                                    arg4 += arg7[var19].method155();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1883((byte) -121, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field4217.method1062(var15, var11, (byte) -101);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class246.field3236 & 0xFF000000) != 0) {
                            this.method423(var15, arg4 + var22 + 1, var9 + 1 + var23, class246.field3236, true);
                        }
                        this.method423(var15, arg4 + var22, var9 + var23, class282.field3741, false);
                    } else if (class238.field3172 > 0) {
                        class465.field6929 += class238.field3172;
                        arg4 += class465.field6929 >> 8;
                        class465.field6929 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4217.method1067(var15, 255);
                    if (class314.field4192 != -1) {
                        this.field4229.method1718(arg4, var24, (int) ((double) this.field4217.field2373 * 0.7D) + var9, class314.field4192, false);
                    }
                    if (class474.field7034 != -1) {
                        this.field4229.method1718(arg4, var24, this.field4217.field2373 + var9, class474.field7034, false);
                    }
                    var11 = var15;
                    arg4 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method422(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[I[Lo;Ljava/lang/String;ILjava/util/Random;I)I")
    public final int method1872(int arg0, int arg1, int arg2, int arg3, int[] arg4, class24[] arg5, String arg6, int arg7, Random arg8, int arg9) {
        field4208++;
        if (arg6 == null) {
            return 0;
        }
        arg8.setSeed((long) arg7);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method1886((byte) -120, var11 << 24 | arg3 & 0xFFFFFF, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 0;
        if (arg2 > -127) {
            return -119;
        }
        while (var15 < var12) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
            var15++;
        }
        this.method1871(arg4, var13, arg0, null, arg1, -22833, arg6, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JZ)V")
    public static final void method1873(long arg0, boolean arg1) {
        field4214++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class429.method2639(arg0 - 1L, (byte) -47);
            class429.method2639(1L, (byte) -86);
        } else {
            class429.method2639(arg0, (byte) -37);
        }
        if (arg1) {
            field4224 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method1874(int arg0, int arg1, String arg2) {
        if (arg1 <= 114) {
            field4210 = 23;
        }
        field4232++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg2.length(); var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class238.field3172 = (arg0 - this.field4217.method1066(-91, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([IIIIIIILjava/util/Random;[II[Lo;Ljava/lang/String;III)I")
    public final int method1875(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Random arg7, int[] arg8, int arg9, class24[] arg10, String arg11, int arg12, int arg13, int arg14) {
        if (arg3 != 4908) {
            field4207 = null;
        }
        field4222++;
        if (arg11 == null) {
            return 0;
        }
        arg7.setSeed((long) arg14);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method1886((byte) -120, arg6 & 0xFFFFFF | var16 << 24, arg2 & 0xFFFFFF | var16 << 24);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg12;
        int var22 = this.field4217.field2366 + arg9;
        if (arg1 == 1) {
            var22 += (arg13 - this.field4217.field2369 - this.field4217.field2366) / 2;
        } else if (arg1 == 2) {
            var22 = arg9 + arg13 - this.field4217.field2369;
        }
        int var23 = -1;
        if (arg5 == 1) {
            var23 = var19 + this.field4217.method1066(-124, arg11);
            var21 = (arg4 - var23) / 2 + arg12;
        } else if (arg5 == 2) {
            var23 = this.field4217.method1066(106, arg11) + var19;
            var21 = arg4 + arg12 - var23;
        }
        this.method1871(arg8, var18, var22, null, var21, -22833, arg11, arg10);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = this.field4217.method1066(-117, arg11) + var19;
            }
            arg0[1] = var22 - this.field4217.field2366;
            arg0[0] = var21;
            arg0[3] = this.field4217.field2369 + this.field4217.field2366;
            arg0[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[II[Lo;ILta;BIIIIILjava/lang/String;II)I")
    public final int method1876(int arg0, int arg1, int[] arg2, int arg3, class24[] arg4, int arg5, class144 arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12, String arg13, int arg14, int arg15) {
        int var17 = -103 % ((-arg7 - 54) / 32);
        field4219++;
        return this.method1881(arg10, arg13, (byte) -61, arg14, arg9, arg5, arg2, 0, arg4, arg15, arg0, arg12, arg1, arg6, arg8, arg11, arg3);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method1877(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field4212++;
        if (arg3 == null) {
            return;
        }
        this.method1886((byte) -126, arg2, arg5);
        this.method1868(0, arg4, 8364, 0, null, arg1 - this.field4217.method1066(-104, arg3), null, arg3, null);
        if (arg0 > -126) {
            field4230 = 117;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IIB)V")
    public final void method1878(int arg0, int arg1, String arg2, int arg3, int arg4, byte arg5) {
        field4213++;
        if (arg5 != -5) {
            method1873(-37L, true);
        }
        if (arg2 != null) {
            this.method1886((byte) -118, arg0, arg3);
            this.method1868(0, arg1, 8364, 0, null, arg4, null, arg2, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Lql;")
    public static final class519 method1879(boolean arg0) {
        field4211++;
        if (class416.field5994 == null || class71.field912 == null) {
            return null;
        }
        for (class519 var1 = (class519) class71.field912.method65((byte) -100); var1 != null; var1 = (class519) class71.field912.method65((byte) -104)) {
            class48 var2 = class416.field5987.method993(var1.field7646, -21143);
            if (var2 != null && var2.field515 && var2.method271(class416.field5985, (byte) 58)) {
                return var1;
            }
        }
        if (arg0) {
            field4233 = false;
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBILjava/lang/String;I)V")
    public final void method1880(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5, int arg6) {
        field4226++;
        if (arg5 == null) {
            return;
        }
        this.method1886((byte) -118, arg4, arg0);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1871(null, null, arg1, var9, arg2 - (this.field4217.method1066(68, arg5) / 2), -22833, arg5, null);
        if (arg3 <= 35) {
            this.method1883((byte) 44, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;BIII[II[Lo;IIIILta;III)I")
    public final int method1881(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, class24[] arg8, int arg9, int arg10, int arg11, int arg12, class144 arg13, int arg14, int arg15, int arg16) {
        field4225++;
        if (arg1 == null) {
            return 0;
        }
        this.method1886((byte) -125, arg14, arg9);
        if (arg2 >= -23) {
            this.field4217 = null;
        }
        if (arg16 == 0) {
            arg16 = this.field4217.field2373;
        }
        int[] var18;
        if (this.field4217.field2369 + this.field4217.field2366 + arg16 > arg10 && (arg16 + arg16) > arg10) {
            var18 = null;
        } else {
            var18 = new int[] { arg4 };
        }
        if (arg7 == -1) {
            arg7 = arg10 / arg16;
            if (arg7 <= 0) {
                arg7 = 1;
            }
        }
        int var19 = this.field4217.method1064((byte) -119, arg8, var18, class380.field5511, arg1);
        if (arg7 > 0 && var19 >= arg7) {
            class380.field5511[arg7 - 1] = this.field4217.method1057(arg4, arg8, -32, class380.field5511[arg7 - 1]);
            var19 = arg7;
        }
        if (arg0 == 3 && var19 == 1) {
            arg0 = 1;
        }
        int var20;
        if (arg0 == 0) {
            var20 = arg3 + this.field4217.field2366;
        } else if (arg0 == 1) {
            var20 = (arg10 - ((var19 - 1) * arg16) - this.field4217.field2366 - this.field4217.field2369) / 2 + this.field4217.field2366 + arg3;
        } else if (arg0 == 2) {
            var20 = arg3 + arg10 - this.field4217.field2369 - ((var19 + -1) * arg16);
        } else {
            int var21 = (arg10 - this.field4217.field2366 - this.field4217.field2369 - (var19 + -1) * arg16) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg3 + var21 + this.field4217.field2366;
            arg16 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg15 == 0) {
                this.method1868(arg11, var20, 8364, arg5, arg8, arg12, arg13, class380.field5511[var22], arg6);
            } else if (arg15 == 1) {
                this.method1868(arg11, var20, 8364, arg5, arg8, (arg4 - this.field4217.method1066(34, class380.field5511[var22])) / 2 + arg12, arg13, class380.field5511[var22], arg6);
            } else if (arg15 == 2) {
                this.method1868(arg11, var20, 8364, arg5, arg8, arg4 + arg12 - this.field4217.method1066(123, class380.field5511[var22]), arg13, class380.field5511[var22], arg6);
            } else if ((var19 - 1) == var22) {
                this.method1868(arg11, var20, 8364, arg5, arg8, arg12, arg13, class380.field5511[var22], arg6);
            } else {
                this.method1874(arg4, 117, class380.field5511[var22]);
                this.method1868(arg11, var20, 8364, arg5, arg8, arg12, arg13, class380.field5511[var22], arg6);
                class238.field3172 = 0;
            }
            var20 += arg16;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Lo;IIILjava/lang/String;[IBI)V")
    public final void method1882(class24[] arg0, int arg1, int arg2, int arg3, String arg4, int[] arg5, byte arg6, int arg7) {
        field4218++;
        if (arg4 == null) {
            return;
        }
        this.method1886((byte) -124, arg2, arg7);
        this.method1868(0, arg3, 8364, 0, arg0, arg1, null, arg4, arg5);
        if (arg6 <= 39) {
            field4231 = -15;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method1883(byte arg0, String arg1) {
        int var3 = 89 % ((38 - arg0) / 44);
        try {
            if (arg1.startsWith("col=")) {
                class282.field3741 = class282.field3741 & 0xFF000000 | class179.method1046(16, arg1.substring(4), (byte) 111) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class282.field3741 = class199.field2597 & 0xFFFFFF | class282.field3741 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class282.field3741 = class179.method1046(16, arg1.substring(5), (byte) 109);
            } else if (arg1.equals("/argb")) {
                class282.field3741 = class199.field2597;
            } else if (arg1.startsWith("str=")) {
                class314.field4192 = class282.field3741 & 0xFF000000 | class179.method1046(16, arg1.substring(4), (byte) 113);
            } else if (arg1.equals("str")) {
                class314.field4192 = class282.field3741 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class314.field4192 = -1;
            } else if (arg1.startsWith("u=")) {
                class474.field7034 = class282.field3741 & 0xFF000000 | class179.method1046(16, arg1.substring(2), (byte) 108);
            } else if (arg1.equals("u")) {
                class474.field7034 = class282.field3741 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class474.field7034 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class246.field3236 = 0;
            } else if (arg1.startsWith("shad=")) {
                class246.field3236 = class282.field3741 & 0xFF000000 | class179.method1046(16, arg1.substring(5), (byte) 103);
            } else if (arg1.equals("shad")) {
                class246.field3236 = class282.field3741 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class246.field3236 = class87.field1029;
            } else if (arg1.equals("br")) {
                this.method1886((byte) -128, class87.field1029, class199.field2597);
            }
        } catch (Exception var4) {
        }
        field4206++;
    }

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method423(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIIIB)V")
    public final void method1884(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4227++;
        if (arg0 == null) {
            return;
        }
        this.method1886((byte) -128, arg2, arg4);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        if (arg6 != -40) {
            return;
        }
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1871(null, var9, arg1, var10, arg3 - (this.field4217.method1066(-114, arg0) / 2), arg6 ^ 0x5917, arg0, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method1885(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field4216++;
        if (arg4 == null) {
            return;
        }
        if (arg1 != 4) {
            field4231 = 110;
        }
        this.method1886((byte) -123, arg0, arg2);
        this.method1868(0, arg5, 8364, 0, null, arg3 - (this.field4217.method1066(39, arg4) / 2), null, arg4, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V")
    private final void method1886(byte arg0, int arg1, int arg2) {
        class465.field6929 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class199.field2597 = arg2;
        class282.field3741 = arg2;
        if (arg0 >= -117) {
            return;
        }
        class238.field3172 = 0;
        class474.field7034 = -1;
        class314.field4192 = -1;
        field4209++;
        class87.field1029 = arg1;
        class246.field3236 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Lgf;)V")
    public class316(class287 arg0, class183 arg1) {
        this.field4217 = arg1;
        this.field4229 = arg0;
    }
}
