import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class85 {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lhi;")
    private class365 field1049;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lfp;")
    private class9 field1044;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field1050;

    static {
        new class409(" days.", " Tage.", " jours.", " dias.");
        new class409("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/util/Random;ILjava/lang/String;[Lae;IIIII[I)I", line = 4)
    public final int method562(Random arg0, int arg1, String arg2, class285[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field1045++;
        if (arg2 == null) {
            return 0;
        }
        arg0.setSeed((long) arg4);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        if (arg6 != -7848) {
            return 68;
        }
        this.method572(var11 << 24 | arg8 & 0xFFFFFF, arg5 & 0xFFFFFF | var11 << 24, -50);
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method577(arg9, arg3, arg1, arg7, 0, var13, (int[]) null, arg2);
        return var14;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILjava/lang/String;III)V", line = 43)
    public final void method563(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field1040++;
        if (arg4 == null) {
            return;
        }
        this.method572(arg2, arg3, -110);
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        if (arg6 != -16702) {
            this.field1049 = null;
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9);
        }
        this.method577((int[]) null, (class285[]) null, arg7, arg1 - this.field1049.method2333(arg6 ^ 0x414B, arg4) / 2, 0, (int[]) null, var12, arg4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 75)
    private final void method564(int arg0, String arg1, int arg2) {
        field1048++;
        if (arg2 != -61) {
            this.field1044 = null;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class132.field1809 = (arg0 - this.field1049.method2333(arg2 ^ 0x58, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 120)
    public final void method565(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field1043++;
        if (arg3 == null) {
            return;
        }
        if (arg1 != 9865) {
            this.method573(-77, (String) null, (class285[]) null, -23, -86, 10, (int[]) null, 111);
        }
        this.method572(arg4, arg0, -25);
        this.method570((class285[]) null, (class195) null, arg2, 0, arg3, (int[]) null, false, 0, arg5);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 137)
    public final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field1047++;
        if (arg5 != null) {
            this.method572(arg3, arg4, -113);
            this.method570((class285[]) null, (class195) null, arg0, arg1, arg5, (int[]) null, false, 0, arg2 - this.field1049.method2333(125, arg5));
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII[IZII[Lae;IILtm;ILjava/lang/String;I)I", line = 151)
    public final int method567(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, class285[] arg9, int arg10, int arg11, class195 arg12, int arg13, String arg14, int arg15) {
        field1037++;
        if (arg14 == null) {
            return 0;
        }
        this.method572(arg7, arg0, -47);
        if (arg3 == 0) {
            arg3 = this.field1049.field5274;
        }
        if (!arg6) {
            return -6;
        }
        int[] var17;
        if (this.field1049.field5284 + arg3 + this.field1049.field5268 > arg13 && arg3 + arg3 > arg13) {
            var17 = null;
        } else {
            var17 = new int[] { arg11 };
        }
        int var18 = this.field1049.method2330(arg9, 0, var17, class74.field948, arg14);
        if (arg4 == 3 && var18 == 1) {
            arg4 = 1;
        }
        int var19;
        if (arg4 == 0) {
            var19 = this.field1049.field5284 + arg1;
        } else if (arg4 == 1) {
            var19 = (arg13 - this.field1049.field5268 - this.field1049.field5284 - (var18 + -1) * arg3) / 2 + this.field1049.field5284 + arg1;
        } else if (arg4 == 2) {
            var19 = arg1 + arg13 - ((var18 - 1) * arg3) - this.field1049.field5268;
        } else {
            int var20 = (arg13 - this.field1049.field5284 - this.field1049.field5268 - ((var18 - 1) * arg3)) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg3 += var20;
            var19 = arg1 - (-this.field1049.field5284 - var20);
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg15 == 0) {
                this.method570(arg9, arg12, var19, arg2, class74.field948[var21], arg5, !arg6, arg8, arg10);
            } else if (arg15 == 1) {
                this.method570(arg9, arg12, var19, arg2, class74.field948[var21], arg5, false, arg8, (arg11 - this.field1049.method2333(-32, class74.field948[var21])) / 2 + arg10);
            } else if (arg15 == 2) {
                this.method570(arg9, arg12, var19, arg2, class74.field948[var21], arg5, false, arg8, arg10 + arg11 - this.field1049.method2333(125, class74.field948[var21]));
            } else if ((var18 - 1) == var21) {
                this.method570(arg9, arg12, var19, arg2, class74.field948[var21], arg5, false, arg8, arg10);
            } else {
                this.method564(arg11, class74.field948[var21], -61);
                this.method570(arg9, arg12, var19, arg2, class74.field948[var21], arg5, !arg6, arg8, arg10);
                class132.field1809 = 0;
            }
            var19 += arg3;
        }
        return var18;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 245)
    private final void method568(String arg0, int arg1) {
        field1033++;
        try {
            if (arg0.startsWith("col=")) {
                class417.field6029 = class417.field6029 & 0xFF000000 | class192.method1339(true, 16, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class417.field6029 = class466.field6863 & 0xFFFFFF | class417.field6029 & 0xFF000000;
            }
            if (arg1 == 30423) {
                if (arg0.startsWith("argb=")) {
                    class417.field6029 = class192.method1339(true, 16, arg0.substring(5));
                } else if (arg0.equals("/argb")) {
                    class417.field6029 = class466.field6863;
                } else if (arg0.startsWith("str=")) {
                    class294.field4277 = class192.method1339(true, 16, arg0.substring(4)) | 0xFF000000;
                } else if (arg0.equals("str")) {
                    class294.field4277 = -8388608;
                } else if (arg0.equals("/str")) {
                    class294.field4277 = -1;
                } else if (arg0.startsWith("u=")) {
                    class295.field4302 = class192.method1339(true, 16, arg0.substring(2)) | 0xFF000000;
                } else if (arg0.equals("u")) {
                    class295.field4302 = -16777216;
                } else if (arg0.equals("/u")) {
                    class295.field4302 = -1;
                } else if (arg0.equalsIgnoreCase("shad=-1")) {
                    class59.field796 = 0;
                } else if (arg0.startsWith("shad=")) {
                    class59.field796 = class192.method1339(true, 16, arg0.substring(5)) | 0xFF000000;
                } else if (arg0.equals("shad")) {
                    class59.field796 = -16777216;
                } else if (arg0.equals("/shad")) {
                    class59.field796 = class76.field977;
                } else if (arg0.equals("br")) {
                    this.method572(class466.field6863, class76.field977, -12);
                    return;
                }
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 318)
    public final void method569(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field1034++;
        if (arg4 == null) {
            return;
        }
        this.method572(arg2, arg6, -117);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        if (arg0 != 100) {
            return;
        }
        while (var8 > var10) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            var10++;
        }
        this.method577((int[]) null, (class285[]) null, arg3, arg1 - (this.field1049.method2333(111, arg4) / 2), 0, (int[]) null, var9, arg4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([Lae;Ltm;IILjava/lang/String;[IZII)V", line = 352)
    private final void method570(class285[] arg0, class195 arg1, int arg2, int arg3, String arg4, int[] arg5, boolean arg6, int arg7, int arg8) {
        int var10 = arg2 - this.field1049.field5274;
        field1039++;
        if (arg6) {
            return;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class420.method2594(-84, arg4.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg4.substring(var11 + 1, var14);
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
                                    int var17 = class92.method627(var16.substring(4), (byte) 104);
                                    class285 var18 = arg0[var17];
                                    int var19 = arg5 == null ? var18.method1860() : arg5[var17];
                                    if ((class417.field6029 & 0xFF000000) == -16777216) {
                                        var18.method927(arg8, this.field1049.field5274 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method927(arg8, var10 + this.field1049.field5274 - var19, 1, class417.field6029 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg8 += arg0[var17].method1861();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method568(var16, 30423);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field1049.method2327(var15, var12, arg6);
                    }
                    if (var15 == ' ') {
                        if (class132.field1809 > 0) {
                            class332.field4930 += class132.field1809;
                            arg8 += class332.field4930 >> 8;
                            class332.field4930 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class59.field796 & 0xFF000000) != 0) {
                            this.method475(var15, arg8 + 1, var10 + 1, class59.field796, true);
                        }
                        this.method475(var15, arg8, var10, class417.field6029, false);
                    } else {
                        if ((class59.field796 & 0xFF000000) != 0) {
                            this.method474(var15, arg8 + 1, var10 - -1, class59.field796, true, arg1, arg7, arg3);
                        }
                        this.method474(var15, arg8, var10, class417.field6029, false, arg1, arg7, arg3);
                    }
                    int var20 = this.field1049.method2322(var15, 0);
                    if (class294.field4277 != -1) {
                        this.field1044.method126(arg8, class294.field4277, var20, 2702, (int) ((double) this.field1049.field5274 * 0.7D) + var10);
                    }
                    if (class295.field4302 != -1) {
                        this.field1044.method126(arg8, class295.field4302, var20, 2702, var10 + this.field1049.field5274 + 1);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 504)
    public static final void method571(int arg0) {
        field1035++;
        if (arg0 != 12531) {
            method571(-58);
        }
        if (!class118.method807(true)) {
            return;
        }
        if (class206.field2886 == null) {
            class322.method2117((byte) 120);
        }
        class342.field5039 = true;
        class217.field3091 = 0;
        class169.field2215 = new boolean[100];
        class184.field2580 = new int[100];
        class271.field4016 = new int[100];
        class296.field4313 = new int[100];
        for (int var1 = 0; var1 < 100; var1++) {
            class296.field4313[var1] = (int) (Math.random() * (double) class214.field3016);
            class184.field2580[var1] = (int) (Math.random() * 350.0D);
            class271.field4016[var1] = (int) (Math.random() * 102.0D);
            class169.field2215[var1] = Math.random() < 0.5D;
        }
        try {
            class446.field6502 = class401.field5797.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 543)
    private final void method572(int arg0, int arg1, int arg2) {
        if (arg2 >= -5) {
            this.field1044 = null;
        }
        class295.field4302 = -1;
        class466.field6863 = arg0;
        class417.field6029 = arg0;
        field1032++;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class294.field4277 = -1;
        class132.field1809 = 0;
        class332.field4930 = 0;
        class76.field977 = arg1;
        class59.field796 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;[Lae;III[II)V", line = 567)
    public final void method573(int arg0, String arg1, class285[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field1042++;
        if (arg1 == null) {
            return;
        }
        this.method572(arg7, arg5, -48);
        if (arg4 > -122) {
            this.method577((int[]) null, (class285[]) null, -96, -95, -3, (int[]) null, (int[]) null, (String) null);
        }
        this.method570(arg2, (class195) null, arg0, 0, arg1, arg6, false, 0, arg3);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[Lae;IIIIIBILjava/util/Random;ILjava/lang/String;I[I[I)I", line = 587)
    public final int method574(int arg0, class285[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, Random arg9, int arg10, String arg11, int arg12, int[] arg13, int[] arg14) {
        field1036++;
        if (arg11 == null) {
            return 0;
        }
        arg9.setSeed((long) arg5);
        int var16 = (arg9.nextInt() & 0x1F) + 192;
        this.method572(arg0 & 0xFFFFFF | var16 << 24, arg2 & 0xFFFFFF | var16 << 24, -92);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (arg7 != 49) {
            this.field1044 = null;
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg9.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = arg3 + this.field1049.field5284;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg6 - this.field1049.field5268 - this.field1049.field5284) / 2;
        } else if (arg12 == 2) {
            var22 = arg3 + arg6 - this.field1049.field5268;
        }
        if (arg8 == 1) {
            var23 = this.field1049.method2333(94, arg11) + var19;
            var21 = (arg10 - var23) / 2 + arg4;
        } else if (arg8 == 2) {
            var23 = this.field1049.method2333(106, arg11) + var19;
            var21 = arg10 + arg4 - var23;
        }
        this.method577(arg14, arg1, var22, var21, 0, var18, (int[]) null, arg11);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field1049.method2333(-54, arg11);
            }
            arg13[0] = var21;
            arg13[1] = var22 - this.field1049.field5284;
            arg13[2] = var23;
            arg13[3] = this.field1049.field5284 + this.field1049.field5268;
        }
        return var19;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lfp;ILct;Lct;)V", line = 667)
    public static final void method575(class9 arg0, int arg1, class104 arg2, class104 arg3) {
        field1038++;
        class119.field1603 = class378.method2393(arg2, (byte) 122, 0, class93.field1157);
        class55.field675 = arg0.method122(class119.field1603, class144.method993(arg3, class93.field1157, arg1), true);
        class328.field4885 = class378.method2393(arg2, (byte) 111, 0, class359.field5224);
        class13.field215 = arg0.method122(class328.field4885, class144.method993(arg3, class359.field5224, 0), true);
        class233.field3502 = class378.method2393(arg2, (byte) 108, 0, class152.field2060);
        class111.field1540 = arg0.method122(class233.field3502, class144.method993(arg3, class152.field2060, 0), true);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/lang/String;ZII)V", line = 689)
    public final void method576(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
        field1050++;
        if (arg3 && arg2 != null) {
            this.method572(arg0, arg4, -90);
            this.method570((class285[]) null, (class195) null, arg1, 0, arg2, (int[]) null, !arg3, 0, arg5 - (this.field1049.method2333(113, arg2) / 2));
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I[Lae;III[I[ILjava/lang/String;)V", line = 704)
    private final void method577(int[] arg0, class285[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, String arg7) {
        int var9 = arg2 - this.field1049.field5274;
        field1046++;
        int var10 = -1;
        int var11 = -1;
        int var12 = arg4;
        int var13 = arg7.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class420.method2594(-65, arg7.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
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
                                    if (arg5 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg5[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class92.method627(var16.substring(4), (byte) 126);
                                    class285 var20 = arg1[var19];
                                    int var21 = arg0 == null ? var20.method1860() : arg0[var19];
                                    var20.method927(arg3 + var17, -var21 + var18 + this.field1049.field5274 + var9, 0, 0, 1);
                                    var11 = -1;
                                    arg3 += arg1[var19].method1861();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method568(var16, arg4 + 30423);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field1049.method2327(var15, var11, false);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class59.field796 & 0xFF000000) != 0) {
                            this.method475(var15, arg3 + var22 + 1, var9 + var23 + 1, class59.field796, true);
                        }
                        this.method475(var15, arg3 + var22, var9 + var23, class417.field6029, false);
                    } else if (class132.field1809 > 0) {
                        class332.field4930 += class132.field1809;
                        arg3 += class332.field4930 >> 8;
                        class332.field4930 &= 0xFF;
                    }
                    int var24 = this.field1049.method2322(var15, arg4);
                    if (class294.field4277 != -1) {
                        this.field1044.method126(arg3, class294.field4277, var24, arg4 ^ 0xA8E, (int) ((double) this.field1049.field5274 * 0.7D) + var9);
                    }
                    if (class295.field4302 != -1) {
                        this.field1044.method126(arg3, class295.field4302, var24, 2702, this.field1049.field5274 + var9);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lfp;Lhi;)V", line = 864)
    public class85(class9 arg0, class365 arg1) {
        this.field1049 = arg1;
        this.field1044 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 874)
    public final void method578(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1041++;
        if (arg3 == null) {
            return;
        }
        this.method572(arg6, arg4, -75);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method577((int[]) null, (class285[]) null, arg0, arg2 - this.field1049.method2333(105, arg3) / 2, 0, var9, var10, arg3);
        if (arg1 >= -22) {
            this.method578(-5, 22, 86, (String) null, -13, 71, -76);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(CIIIZLtm;II)V")
    public abstract void method474(char arg0, int arg1, int arg2, int arg3, boolean arg4, class195 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method475(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
