import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class60 {

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Loea;")
    private class597 field1193;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lha;")
    private class59 field1178;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Loaa;")
    public static class290 field1192 = new class290(2, 4, 4, 0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lmi;[II[I[IILjava/lang/String;I)V", line = 5)
    private final void method629(class496[] arg0, int[] arg1, int arg2, int[] arg3, int[] arg4, int arg5, String arg6, int arg7) {
        int var9 = arg5 - this.field1193.field8159;
        field1188++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg7 != 174) {
            return;
        }
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class299.method1953(arg6.charAt(var14), false) & 0xFF);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class432.method2626(true, var16.substring(4));
                                    class496 var20 = arg0[var19];
                                    int var21 = arg3 == null ? var20.method1614() : arg3[var19];
                                    var20.method1200(arg2 + var17, var9 - -var18 + -var21 + this.field1193.field8159, 1, 0, 1);
                                    arg2 += arg0[var19].method1618();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method636((byte) -92, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field1193.method3388(var11, (byte) -104, var15);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    if (var15 != ' ') {
                        if ((class66.field1257 & 0xFF000000) != 0) {
                            this.method130(var15, arg2 + var22 + 1, var9 - -1 + var23, class66.field1257, true);
                        }
                        this.method130(var15, arg2 + var22, var9 + var23, class506.field7041, false);
                    } else if (class461.field6492 > 0) {
                        class36.field867 += class461.field6492;
                        arg2 += class36.field867 >> 8;
                        class36.field867 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field1193.method3390((byte) -48, var15);
                    if (class598.field8212 != -1) {
                        this.field1178.method617((byte) -103, var24, var9 + ((int) ((double) this.field1193.field8159 * 0.7D)), class598.field8212, arg2);
                    }
                    if (class341.field4802 != -1) {
                        this.field1178.method617((byte) -96, var24, this.field1193.field8159 + var9, class341.field4802, arg2);
                    }
                    var11 = var15;
                    arg2 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;BIII[Lmi;[I)V", line = 167)
    public final void method630(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, class496[] arg6, int[] arg7) {
        field1186++;
        if (arg2 > 114 && arg1 != null) {
            this.method641(arg4, -78, arg3);
            this.method645(0, arg0, 0, arg6, null, arg1, arg7, 25625, arg5);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIBLaa;I[Lmi;IIIILjava/lang/String;IIIIII)I", line = 182)
    public final int method631(int[] arg0, int arg1, byte arg2, class487 arg3, int arg4, class496[] arg5, int arg6, int arg7, int arg8, int arg9, String arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field1184++;
        if (arg10 == null) {
            return 0;
        }
        this.method641(arg14, -76, arg6);
        if (arg16 == 0) {
            arg16 = this.field1193.field8159;
        }
        int[] var18;
        if (this.field1193.field8160 + this.field1193.field8155 + arg16 > arg1 && arg1 < (arg16 + arg16)) {
            var18 = null;
        } else {
            var18 = new int[] { arg8 };
        }
        int var19 = this.field1193.method3394(arg10, var18, class444.field6312, (byte) 87, arg5);
        if (arg15 == -1) {
            arg15 = arg1 / arg16;
            if (arg15 <= 0) {
                arg15 = 1;
            }
        }
        if (arg15 > 0 && var19 >= arg15) {
            class444.field6312[arg15 - 1] = this.field1193.method3387(arg5, arg8, class444.field6312[arg15 - 1], (byte) 55);
            var19 = arg15;
        }
        if (arg9 == 3 && var19 == 1) {
            arg9 = 1;
        }
        int var20 = -116 % ((arg2 + 28) / 43);
        int var21;
        if (arg9 == 0) {
            var21 = this.field1193.field8155 + arg7;
        } else if (arg9 == 1) {
            var21 = (arg1 - this.field1193.field8155 - ((var19 + -1) * arg16) - this.field1193.field8160) / 2 + this.field1193.field8155 + arg7;
        } else if (arg9 == 2) {
            var21 = arg7 + arg1 - (var19 - 1) * arg16 - this.field1193.field8160;
        } else {
            int var22 = (arg1 - this.field1193.field8160 - this.field1193.field8155 - ((var19 + -1) * arg16)) / (var19 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            arg16 += var22;
            var21 = arg7 + var22 + this.field1193.field8155;
        }
        for (int var23 = 0; var23 < var19; var23++) {
            if (arg13 == 0) {
                this.method645(arg11, var21, arg4, arg5, arg3, class444.field6312[var23], arg0, 25625, arg12);
            } else if (arg13 == 1) {
                this.method645(arg11, var21, arg4, arg5, arg3, class444.field6312[var23], arg0, 25625, (arg8 - this.field1193.method3389(true, class444.field6312[var23])) / 2 + arg12);
            } else if (arg13 == 2) {
                this.method645(arg11, var21, arg4, arg5, arg3, class444.field6312[var23], arg0, 25625, arg8 + arg12 - this.field1193.method3389(true, class444.field6312[var23]));
            } else if (var19 - 1 == var23) {
                this.method645(arg11, var21, arg4, arg5, arg3, class444.field6312[var23], arg0, 25625, arg12);
            } else {
                this.method642(class444.field6312[var23], 0, arg8);
                this.method645(arg11, var21, arg4, arg5, arg3, class444.field6312[var23], arg0, 25625, arg12);
                class461.field6492 = 0;
            }
            var21 += arg16;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 287)
    public final void method632(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1182++;
        if (arg4 >= -119) {
            this.method634(-128, -30, null, null, -107, -80, null, -6, -122, null);
        }
        if (arg0 != null) {
            this.method641(arg5, 122, arg2);
            this.method645(0, arg1, 0, null, null, arg0, null, 25625, arg3 - this.field1193.method3389(true, arg0));
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lat;", line = 310)
    public static final class378 method633(int arg0, int arg1) {
        field1185++;
        if (arg0 != 1512932720) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class396.field5798[var2] == null || class396.field5798[var2][var3] == null) {
            boolean var4 = class722.method4007(var2, (byte) 84);
            if (!var4) {
                return null;
            }
        }
        return class396.field5798[var2][var3];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;II[Lmi;IILjava/util/Random;)I", line = 338)
    public final int method634(int arg0, int arg1, int[] arg2, String arg3, int arg4, int arg5, class496[] arg6, int arg7, int arg8, Random arg9) {
        field1177++;
        if (arg3 == null) {
            return 0;
        }
        arg9.setSeed((long) arg1);
        int var11 = (arg9.nextInt() & 0x1F) + 192;
        this.method641(var11 << 24 | arg5 & 0xFFFFFF, arg0 ^ 0xFFFFFF86, var11 << 24 | arg4 & 0xFFFFFF);
        int var12 = arg3.length();
        if (arg0 != -1) {
            field1192 = null;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg9.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method629(arg6, null, arg8, arg2, var13, arg7, arg3, 174);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 377)
    public static void method635(byte arg0) {
        field1192 = null;
        if (arg0 != 23) {
            field1192 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V", line = 387)
    private final void method636(byte arg0, String arg1) {
        field1176++;
        try {
            if (arg0 <= -78) {
                if (arg1.startsWith("col=")) {
                    class506.field7041 = class506.field7041 & 0xFF000000 | class606.method3447(-20188, arg1.substring(4), 16) & 0xFFFFFF;
                } else if (arg1.equals("/col")) {
                    class506.field7041 = class506.field7041 & 0xFF000000 | class453.field6387 & 0xFFFFFF;
                }
                if (arg1.startsWith("argb=")) {
                    class506.field7041 = class606.method3447(-20188, arg1.substring(5), 16);
                } else if (arg1.equals("/argb")) {
                    class506.field7041 = class453.field6387;
                } else if (arg1.startsWith("str=")) {
                    class598.field8212 = class506.field7041 & 0xFF000000 | class606.method3447(-20188, arg1.substring(4), 16);
                } else if (arg1.equals("str")) {
                    class598.field8212 = class506.field7041 & 0xFF000000 | 0x800000;
                } else if (arg1.equals("/str")) {
                    class598.field8212 = -1;
                } else if (arg1.startsWith("u=")) {
                    class341.field4802 = class506.field7041 & 0xFF000000 | class606.method3447(-20188, arg1.substring(2), 16);
                } else if (arg1.equals("u")) {
                    class341.field4802 = class506.field7041 & 0xFF000000;
                } else if (arg1.equals("/u")) {
                    class341.field4802 = -1;
                } else if (arg1.equalsIgnoreCase("shad=-1")) {
                    class66.field1257 = 0;
                } else if (arg1.startsWith("shad=")) {
                    class66.field1257 = class506.field7041 & 0xFF000000 | class606.method3447(-20188, arg1.substring(5), 16);
                } else if (arg1.equals("shad")) {
                    class66.field1257 = class506.field7041 & 0xFF000000;
                } else if (arg1.equals("/shad")) {
                    class66.field1257 = class256.field3702;
                } else if (arg1.equals("br")) {
                    this.method641(class256.field3702, 117, class453.field6387);
                    return;
                }
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIZ)V", line = 464)
    public final void method637(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1189++;
        if (arg2 == null) {
            return;
        }
        this.method641(arg4, 108, arg0);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        if (arg6) {
            this.field1178 = null;
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method629(null, var9, arg3 - (this.field1193.method3389(!arg6, arg2) / 2), null, null, arg1, arg2, 174);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;II)V", line = 491)
    public final void method638(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field1190++;
        if (arg3 != null) {
            this.method641(arg4, 115, arg2);
            this.method645(0, arg5, 0, null, null, arg3, null, 25625, arg1 - (this.field1193.method3389(true, arg3) / 2));
            int var7 = 7 % ((66 - arg0) / 44);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Ljava/lang/String;IIIII)V", line = 507)
    public final void method639(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -108) {
            return;
        }
        field1175++;
        if (arg0 != null) {
            this.method641(arg4, 110, arg1);
            this.method645(0, arg2, 0, null, null, arg0, null, 25625, arg3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIII)V", line = 523)
    public final void method640(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1181++;
        if (arg2 == null) {
            return;
        }
        this.method641(arg4, -104, arg3);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        if (arg7 != -20509) {
            this.method130((char) 65523, -40, -44, -36, true);
        }
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var9);
        }
        this.method629(null, var12, arg6 - (this.field1193.method3389(true, arg2) / 2), null, null, arg1, arg2, 174);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 558)
    private final void method641(int arg0, int arg1, int arg2) {
        class341.field4802 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class453.field6387 = arg2;
        class506.field7041 = arg2;
        class36.field867 = 0;
        class461.field6492 = 0;
        int var4 = -28 / ((56 - arg1) / 49);
        field1183++;
        class598.field8212 = -1;
        class256.field3702 = arg0;
        class66.field1257 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 578)
    private final void method642(String arg0, int arg1, int arg2) {
        field1194++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = arg1; var6 < arg0.length(); var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class461.field6492 = (arg2 - this.field1193.method3389(true, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V", line = 615)
    public final void method643(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1179++;
        if (arg0 == null) {
            return;
        }
        this.method641(arg5, 117, arg1);
        if (arg4 > -12) {
            this.field1193 = null;
        }
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method629(null, var10, arg6 - (this.field1193.method3389(true, arg0) / 2), null, var9, arg3, arg0, 174);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lbga;[Lifa;I)Llha;", line = 648)
    public static final class625 method644(class358 arg0, class428[] arg1, int arg2) {
        field1195++;
        if (arg2 != -2113) {
            field1192 = null;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field6142 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field6142);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class2.field17, 0);
        if (class2.field17[0] == 0) {
            if (class2.field17[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class2.field17, 1);
            if (class2.field17[1] > 1) {
                byte[] var7 = new byte[class2.field17[1]];
                OpenGL.glGetInfoLogARB(var4, class2.field17[1], class2.field17, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class2.field17[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field6142);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class625(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[Lmi;Laa;Ljava/lang/String;[III)V", line = 717)
    private final void method645(int arg0, int arg1, int arg2, class496[] arg3, class487 arg4, String arg5, int[] arg6, int arg7, int arg8) {
        int var10 = arg1 - this.field1193.field8159;
        field1191++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg5.length();
        if (arg7 != 25625) {
            return;
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class299.method1953(arg5.charAt(var14), false) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg5.substring(var11 + 1, var14);
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
                                    int var17 = class432.method2626(true, var16.substring(4));
                                    class496 var18 = arg3[var17];
                                    int var19 = arg6 == null ? var18.method1614() : arg6[var17];
                                    if ((class506.field7041 & 0xFF000000) == -16777216) {
                                        var18.method1200(arg8, var10 + this.field1193.field8159 - var19, 1, 0, 1);
                                    } else {
                                        var18.method1200(arg8, this.field1193.field8159 + var10 - var19, 0, class506.field7041 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg8 += arg3[var17].method1618();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method636((byte) -118, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg8 += this.field1193.method3388(var12, (byte) -90, var15);
                    }
                    if (var15 == ' ') {
                        if (class461.field6492 > 0) {
                            class36.field867 += class461.field6492;
                            arg8 += class36.field867 >> 8;
                            class36.field867 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class66.field1257 & 0xFF000000) != 0) {
                            this.method130(var15, arg8 + 1, var10 + 1, class66.field1257, true);
                        }
                        this.method130(var15, arg8, var10, class506.field7041, false);
                    } else {
                        if ((class66.field1257 & 0xFF000000) != 0) {
                            this.method132(var15, arg8 + 1, var10 + 1, class66.field1257, true, arg4, arg2, arg0);
                        }
                        this.method132(var15, arg8, var10, class506.field7041, false, arg4, arg2, arg0);
                    }
                    int var20 = this.field1193.method3390((byte) -48, var15);
                    if (class598.field8212 != -1) {
                        this.field1178.method617((byte) -119, var20, (int) ((double) this.field1193.field8159 * 0.7D) + var10, class598.field8212, arg8);
                    }
                    if (class341.field4802 != -1) {
                        this.field1178.method617((byte) -114, var20, var10 + this.field1193.field8159 + 1, class341.field4802, arg8);
                    }
                    arg8 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Loea;)V", line = 867)
    public class60(class59 arg0, class597 arg1) {
        this.field1193 = arg1;
        this.field1178 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([III[Lmi;IIILaa;IIIIIZILjava/lang/String;)I", line = 882)
    public final int method646(int[] arg0, int arg1, int arg2, class496[] arg3, int arg4, int arg5, int arg6, class487 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14, String arg15) {
        if (arg13) {
            method633(-23, 41);
        }
        field1187++;
        return this.method631(arg0, arg6, (byte) 97, arg7, arg9, arg3, arg4, arg8, arg11, arg5, arg15, arg10, arg12, arg14, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([II[Lmi;IIIILjava/util/Random;IIIIILjava/lang/String;[I)I", line = 894)
    public final int method647(int[] arg0, int arg1, class496[] arg2, int arg3, int arg4, int arg5, int arg6, Random arg7, int arg8, int arg9, int arg10, int arg11, int arg12, String arg13, int[] arg14) {
        field1180++;
        if (arg13 == null) {
            return 0;
        }
        arg7.setSeed((long) arg10);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method641(var16 << 24 | arg6 & 0xFFFFFF, -45, arg4 & 0xFFFFFF | var16 << 24);
        int var17 = arg13.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg12;
        int var22 = this.field1193.field8155 + arg9;
        int var23 = -1;
        if (arg3 == 1) {
            var22 += (arg5 - this.field1193.field8155 - this.field1193.field8160) / 2;
        } else if (arg3 == 2) {
            var22 = arg5 + arg9 - this.field1193.field8160;
        }
        if (arg11 != -33) {
            this.method132((char) 65534, 83, -110, 26, true, null, 113, 97);
        }
        if (arg8 == 1) {
            var23 = this.field1193.method3389(true, arg13) + var19;
            var21 = (arg1 - var23) / 2 + arg12;
        } else if (arg8 == 2) {
            var23 = this.field1193.method3389(true, arg13) + var19;
            var21 = arg1 + arg12 - var23;
        }
        this.method629(arg2, null, var21, arg0, var18, var22, arg13, 174);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = this.field1193.method3389(true, arg13) + var19;
            }
            arg14[2] = var23;
            arg14[3] = this.field1193.field8160 + this.field1193.field8155;
            arg14[0] = var21;
            arg14[1] = var22 - this.field1193.field8155;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method130(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7);
}
