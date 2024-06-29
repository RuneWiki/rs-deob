import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class728 implements class158 {

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "Lv;")
    private class606 field10665 = new class606(256);

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "Lgda;")
    private class58 field10664;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "Lgda;")
    private class58 field10657;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    private int field10667;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "[Lbq;")
    private class304[] field10672;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10676 = new String[] { method5286(method5285(" #\u000f;.{")), method5286(method5285("=3\u0002y")), method5286(method5285("(h@;\u0017")), method5286(method5285(" #\u000f;V:(\u0007aT{")), method5286(method5285(" #\u000f;+{")), method5286(method5285(" #\u000f;){")), method5286(method5285("\u0000.\u000fq\u000f!f\u0002|\u00048/\u0000rJ5'\u0007y\u000f7|")), method5286(method5285(" #\u000f;!{")), method5286(method5285(" #\u000f;-{")), method5286(method5285(" #\u000f; {")), method5286(method5285(" #\u000f;,{")), method5286(method5285(" #\u000f;&{")), method5286(method5285(" #\u000f;/{")), method5286(method5285(" #\u000f;\"{")), method5286(method5285(" #\u000f;({")), method5286(method5285(" #\u000f;#{")) };

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field10658 = -1;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field10659;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field10660;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field10661;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field10662;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field10666;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field10668;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field10669;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field10670;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field10671;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field10673;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field10674;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field10675;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "Lat;")
    public static class398 field10663;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "Ljava/lang/String;")
    public static String field10656;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "([Llo;ILvf;)Lir;", line = 3)
    public static final class25 method5279(class789[] arg0, int arg1, class159 arg2) {
        try {
            field10671++;
            for (int var3 = 0; var3 < arg0.length; var3++) {
                if (arg0[var3] == null || arg0[var3].field11527 <= 0L) {
                    return null;
                }
            }
            if (arg1 != 3) {
                field10658 = 96;
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; var6 < arg0.length; var6++) {
                OpenGL.glAttachObjectARB(var4, arg0[var6].field11527);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class272.field4379, 0);
            if (class272.field4379[0] == 0) {
                if (class272.field4379[0] == 0) {
                    System.out.println(field10676[6]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class272.field4379, 1);
                if (class272.field4379[1] > 1) {
                    byte[] var7 = new byte[class272.field4379[1]];
                    OpenGL.glGetInfoLogARB(var4, class272.field4379[1], class272.field4379, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (class272.field4379[0] == 0) {
                    for (int var8 = 0; var8 < arg0.length; var8++) {
                        OpenGL.glDetachObjectARB(var4, arg0[var8].field11527);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class25(arg2, var4, arg0);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field10676[7] + (arg0 == null ? field10676[1] : field10676[2]) + ',' + arg1 + ',' + (arg2 == null ? field10676[1] : field10676[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)V", line = 71)
    public static void method5280(int arg0) {
        try {
            field10656 = null;
            field10663 = null;
            if (arg0 > -92) {
                method5281(21, 113, 24, 102, 25, 39, 47, -20, 11, -14);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10676[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Lbq;", line = 84)
    public final class304 method1419(int arg0, int arg1) {
        try {
            if (arg1 >= -81) {
                field10658 = -35;
            }
            field10660++;
            return this.field10672[arg0];
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10676[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZIIFI)[I", line = 96)
    public final int[] method1420(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        try {
            field10662++;
            return arg5 == -7385 ? this.method5283(arg3, 0).method1372(arg0, arg5 ^ 0x588F, this.field10657, arg2, arg1, this, this.field10672[arg3].field4910, (double) arg4) : null;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10676[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIIIIIII)Z", line = 107)
    public static final boolean method5281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field10670++;
            if (!class30.method315(-1, arg8, arg5, arg1)) {
                return false;
            }
            int var20 = class173.field2768[2];
            int var14 = class173.field2768[0];
            int var18 = class173.field2768[1];
            if (!class30.method315(-1, arg4, arg9, arg0)) {
                return false;
            }
            int var17 = class173.field2768[2];
            int var10 = 34 / ((arg7 + 47) / 42);
            int var21 = class173.field2768[1];
            int var13 = class173.field2768[0];
            if (class30.method315(-1, arg3, arg6, arg2)) {
                int var19 = class173.field2768[1];
                int var16 = class173.field2768[2];
                int var15 = class173.field2768[0];
                return class486.method3691(var21, var18, var13, var15, (byte) 91, var17, var14, var16, var20, var19);
            } else {
                return false;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field10676[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BI)Z", line = 145)
    public final boolean method1417(byte arg0, int arg1) {
        try {
            int var3 = 35 / ((arg0 - 37) / 54);
            field10674++;
            class151 var4 = this.method5283(arg1, 0);
            return var4 != null && var4.method1374(this, this.field10657, false);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10676[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)I", line = 157)
    public static final int method5282(int arg0) {
        try {
            if (arg0 != 3) {
                return -45;
            }
            field10673++;
            if (class360.field5806 == null) {
                if (!class16.field177 && class750.field11049 != null) {
                    return class750.field11049.field766;
                }
                int var1 = class15.field174.method5051(arg0 - 3);
                int var2 = class15.field174.method5048(true);
                if (class595.field8598) {
                    if (class65.field897 < var1 && (class65.field897 + class489.field7379) > var1) {
                        int var17 = -1;
                        for (int var18 = 0; var18 < class681.field9707; var18++) {
                            if (class793.field11597) {
                                int var20 = var18 * 16 + (class606.field8725 + 33);
                                if (var2 > (var20 - 13) && var2 <= var20 + 3) {
                                    var17 = var18;
                                }
                            } else {
                                int var19 = class606.field8725 + (var18 * 16) + 31;
                                if ((var19 - 13) < var2 && var2 <= var19 + 3) {
                                    var17 = var18;
                                }
                            }
                        }
                        if (var17 != -1) {
                            int var21 = 0;
                            class137 var22 = new class137(class580.field8365);
                            for (class603 var23 = (class603) var22.method1275((byte) 76); var23 != null; var23 = (class603) var22.method1277(57)) {
                                if ((var21++) == var17) {
                                    return ((class59) var23.field8713.field10193.field7074).field766;
                                }
                            }
                        }
                    } else if (class116.field1694 != null && var1 > class452.field6990 && (class452.field6990 + class630.field9060) > var1) {
                        int var10 = -1;
                        for (int var11 = 0; var11 < class116.field1694.field8711; var11++) {
                            if (class793.field11597) {
                                int var13 = class270.field4346 - (-(var11 * 16) - 33);
                                if ((var13 - 13) < var2 && (var13 + 3) >= var2) {
                                    var10 = var11;
                                }
                            } else {
                                int var12 = (var11 * 16) + class270.field4346 + 31;
                                if (var2 > (var12 - 13) && (var12 + 3) >= var2) {
                                    var10 = var11;
                                }
                            }
                        }
                        if (var10 != -1) {
                            int var14 = 0;
                            class137 var15 = new class137(class116.field1694.field8713);
                            for (class59 var16 = (class59) var15.method1275((byte) 76); var16 != null; var16 = (class59) var15.method1277(arg0 + 54)) {
                                if (var14++ == var10) {
                                    return var16.field766;
                                }
                            }
                        }
                    }
                } else if (class65.field897 < var1 && var1 < (class65.field897 + class489.field7379)) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class320.field5213; var4++) {
                        if (class793.field11597) {
                            int var6 = (class320.field5213 - var4 - 1) * 16 + (class606.field8725 + 33);
                            if (var2 > var6 - 13 && var2 <= (var6 + 3)) {
                                var3 = var4;
                            }
                        } else {
                            int var5 = (class320.field5213 - var4 - 1) * 16 + class606.field8725 + 31;
                            if (var2 > var5 - 13 && var2 <= (var5 + 3)) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var7 = 0;
                        class570 var8 = new class570(class439.field6858);
                        for (class59 var9 = (class59) var8.method4203((byte) 126); var9 != null; var9 = (class59) var8.method4201((byte) 112)) {
                            if (var3 == var7++) {
                                return var9.field766;
                            }
                        }
                    }
                }
            }
            return -1;
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field10676[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IFIIIZ)[I", line = 350)
    public final int[] method1415(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            field10666++;
            if (arg4 != 28039) {
                this.field10657 = null;
            }
            return this.method5283(arg0, 0).method1375(this, 0, this.field10672[arg0].field4910, arg2, (double) arg1, this.field10657, arg3);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10676[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(II)Lmr;", line = 361)
    private final class151 method5283(int arg0, int arg1) {
        try {
            field10668++;
            class459 var3 = this.field10665.method4427(95, (long) arg0);
            if (arg1 != 0) {
                method5279(null, -10, null);
            }
            if (var3 != null) {
                return (class151) var3;
            }
            byte[] var4 = this.field10664.method587(arg0, true);
            if (var4 == null) {
                return null;
            } else {
                class151 var5 = new class151(new class176(var4));
                this.field10665.method4428((byte) 108, var5, (long) arg0);
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10676[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)I", line = 395)
    public final int method1416(int arg0) {
        try {
            if (arg0 != -26879) {
                this.field10667 = 90;
            }
            field10659++;
            return this.field10667;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10676[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lgda;Lgda;Lgda;)V", line = 482)
    public class728(class58 arg0, class58 arg1, class58 arg2) {
        try {
            this.field10664 = arg1;
            this.field10657 = arg2;
            class176 var4 = new class176(arg0.method604((byte) 90, 0, 0));
            this.field10667 = var4.method1687((byte) -105);
            this.field10672 = new class304[this.field10667];
            for (int var5 = 0; var5 < this.field10667; var5++) {
                if (var4.method1645((byte) -98) == 1) {
                    this.field10672[var5] = new class304();
                }
            }
            for (int var6 = 0; var6 < this.field10667; var6++) {
                if (this.field10672[var6] != null) {
                    this.field10672[var6].field4890 = var4.method1645((byte) -93) == 0;
                }
            }
            for (int var7 = 0; var7 < this.field10667; var7++) {
                if (this.field10672[var7] != null) {
                    this.field10672[var7].field4911 = var4.method1645((byte) -117) == 1;
                }
            }
            for (int var8 = 0; var8 < this.field10667; var8++) {
                if (this.field10672[var8] != null) {
                    this.field10672[var8].field4900 = var4.method1645((byte) -107) == 1;
                }
            }
            for (int var9 = 0; var9 < this.field10667; var9++) {
                if (this.field10672[var9] != null) {
                    this.field10672[var9].field4905 = var4.method1672(-11);
                }
            }
            for (int var10 = 0; var10 < this.field10667; var10++) {
                if (this.field10672[var10] != null) {
                    this.field10672[var10].field4893 = var4.method1672(101);
                }
            }
            for (int var11 = 0; var11 < this.field10667; var11++) {
                if (this.field10672[var11] != null) {
                    this.field10672[var11].field4913 = var4.method1672(-70);
                }
            }
            for (int var12 = 0; var12 < this.field10667; var12++) {
                if (this.field10672[var12] != null) {
                    this.field10672[var12].field4901 = var4.method1672(-22);
                }
            }
            for (int var13 = 0; var13 < this.field10667; var13++) {
                if (this.field10672[var13] != null) {
                    this.field10672[var13].field4894 = (short) var4.method1687((byte) -123);
                }
            }
            for (int var14 = 0; var14 < this.field10667; var14++) {
                if (this.field10672[var14] != null) {
                    this.field10672[var14].field4899 = var4.method1672(-112);
                }
            }
            for (int var15 = 0; var15 < this.field10667; var15++) {
                if (this.field10672[var15] != null) {
                    this.field10672[var15].field4902 = var4.method1672(-10);
                }
            }
            for (int var16 = 0; var16 < this.field10667; var16++) {
                if (this.field10672[var16] != null) {
                    this.field10672[var16].field4906 = var4.method1645((byte) -110) == 1;
                }
            }
            for (int var17 = 0; var17 < this.field10667; var17++) {
                if (this.field10672[var17] != null) {
                    this.field10672[var17].field4910 = var4.method1645((byte) -85) == 1;
                }
            }
            for (int var18 = 0; var18 < this.field10667; var18++) {
                if (this.field10672[var18] != null) {
                    this.field10672[var18].field4904 = var4.method1672(115);
                }
            }
            for (int var19 = 0; var19 < this.field10667; var19++) {
                if (this.field10672[var19] != null) {
                    this.field10672[var19].field4912 = var4.method1645((byte) -122) == 1;
                }
            }
            for (int var20 = 0; var20 < this.field10667; var20++) {
                if (this.field10672[var20] != null) {
                    this.field10672[var20].field4909 = var4.method1645((byte) -83) == 1;
                }
            }
            for (int var21 = 0; var21 < this.field10667; var21++) {
                if (this.field10672[var21] != null) {
                    this.field10672[var21].field4898 = var4.method1645((byte) -91) == 1;
                }
            }
            for (int var22 = 0; var22 < this.field10667; var22++) {
                if (this.field10672[var22] != null) {
                    this.field10672[var22].field4896 = var4.method1645((byte) -106);
                }
            }
            for (int var23 = 0; var23 < this.field10667; var23++) {
                if (this.field10672[var23] != null) {
                    this.field10672[var23].field4907 = var4.method1622(-18712);
                }
            }
            for (int var24 = 0; var24 < this.field10667; var24++) {
                if (this.field10672[var24] != null) {
                    this.field10672[var24].field4892 = var4.method1645((byte) -114);
                }
            }
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field10676[3] + (arg0 == null ? field10676[1] : field10676[2]) + ',' + (arg1 == null ? field10676[1] : field10676[2]) + ',' + (arg2 == null ? field10676[1] : field10676[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V", line = 412)
    public static final void method5284(byte arg0) {
        try {
            field10675++;
            int var1 = class691.field9962;
            int[] var2 = class239.field3685;
            if (arg0 == 84) {
                for (int var3 = 0; var3 < var1; var3++) {
                    class738 var4 = class33.field395[var2[var3]];
                    if (var4 != null && var4.field1168 > 0) {
                        var4.field1168--;
                        if (var4.field1168 == 0) {
                            var4.field1173 = null;
                        }
                    }
                }
                for (int var5 = 0; var5 < class632.field9088; var5++) {
                    long var6 = (long) class263.field4278[var5];
                    class19 var8 = (class19) class176.field2797.method737((byte) -39, var6);
                    if (var8 != null) {
                        class426 var9 = var8.field194;
                        if (var9.field1168 > 0) {
                            var9.field1168--;
                            if (var9.field1168 == 0) {
                                var9.field1173 = null;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field10676[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIFZI)[F", line = 472)
    public final float[] method1418(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        try {
            field10669++;
            if (arg1 != 31922) {
                this.field10657 = null;
            }
            return this.method5283(arg2, 0).method1376(this.field10672[arg2].field4910, arg0, arg5, this.field10657, -23416, this);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10676[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5285(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5286(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
