import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class335 {

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lvq;")
    private class269 field4857;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lbb;")
    private class182 field4859;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4856 = 0;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Lan;")
    public static class17 field4873 = null;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lkn;")
    public static class442 field4860 = new class442();

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Z")
    public static boolean field4874 = false;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI[ILjava/lang/String;IIILsg;[Lvj;)V")
    private final void method2192(byte arg0, int arg1, int[] arg2, String arg3, int arg4, int arg5, int arg6, class226 arg7, class256[] arg8) {
        field4871++;
        int var10 = arg5 - this.field4859.field2567;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        if (arg0 >= -107) {
            this.method2200(-124, (String) null);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class73.method441(arg3.charAt(var14), (byte) 100) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg3.substring(var11 + 1, var14);
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
                                    int var17 = class333.method2184(-1, var16.substring(4));
                                    class256 var18 = arg8[var17];
                                    int var19 = arg2 == null ? var18.method75() : arg2[var17];
                                    if ((class261.field3859 & 0xFF000000) == -16777216) {
                                        var18.method86(arg1, var10 + this.field4859.field2567 - var19, 0, 0, 1);
                                    } else {
                                        var18.method86(arg1, var10 + this.field4859.field2567 - var19, 1, class261.field3859 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg1 += arg8[var17].method83();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2200(121, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field4859.method1301(false, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class30.field364 > 0) {
                            class110.field1425 += class30.field364;
                            arg1 += class110.field1425 >> 8;
                            class110.field1425 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class190.field2724 & 0xFF000000) != 0) {
                            this.method1808(var15, arg1 + 1, var10 + 1, class190.field2724, true);
                        }
                        this.method1808(var15, arg1, var10, class261.field3859, false);
                    } else {
                        if ((class190.field2724 & 0xFF000000) != 0) {
                            this.method1809(var15, arg1 + 1, var10 + 1, class190.field2724, true, arg7, arg6, arg4);
                        }
                        this.method1809(var15, arg1, var10, class261.field3859, false, arg7, arg6, arg4);
                    }
                    int var20 = this.field4859.method1304(0, var15);
                    if (class340.field4923 != -1) {
                        this.field4857.method1841((byte) -20, arg1, class340.field4923, var20, var10 + ((int) ((double) this.field4859.field2567 * 0.7D)));
                    }
                    if (class352.field5117 != -1) {
                        this.field4857.method1841((byte) -20, arg1, class352.field5117, var20, this.field4859.field2567 + var10 + 1);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method2193(int arg0, String arg1, int arg2) {
        field4868++;
        if (arg2 <= 47) {
            field4874 = true;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
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
            class30.field364 = (arg0 - this.field4859.method1309((byte) 125, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method2194(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field4872++;
        if (arg3 == null) {
            return;
        }
        this.method2203((byte) -79, arg4, arg1);
        this.method2192((byte) -127, arg5 - this.field4859.method1309((byte) 125, arg3) / 2, (int[]) null, arg3, 0, arg2, 0, (class226) null, (class256[]) null);
        if (arg0 != -21811) {
            this.method2204(27, -37, -73, (String) null, 1, -3, -70, -107, (class226) null, -51, -22, -98, (int[]) null, -57, 23, (class256[]) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII[III[Lvj;I[IIILjava/util/Random;ILjava/lang/String;)I")
    public final int method2195(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, class256[] arg7, int arg8, int[] arg9, int arg10, int arg11, Random arg12, int arg13, String arg14) {
        field4864++;
        if (arg14 == null) {
            return 0;
        }
        arg12.setSeed((long) arg0);
        int var16 = (arg12.nextInt() & 0x1F) + 192;
        this.method2203((byte) -127, var16 << 24 | arg11 & 0xFFFFFF, arg10 & 0xFFFFFF | var16 << 24);
        int var17 = arg14.length();
        int var18 = -105 % ((56 - arg2) / 50);
        int[] var19 = new int[var17];
        int var20 = 0;
        for (int var21 = 0; var21 < var17; var21++) {
            var19[var21] = var20;
            if ((arg12.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg8;
        int var23 = this.field4859.field2574 + arg3;
        int var24 = -1;
        if (arg1 == 1) {
            var23 += (arg13 - this.field4859.field2574 - this.field4859.field2575) / 2;
        } else if (arg1 == 2) {
            var23 = arg3 + arg13 - this.field4859.field2575;
        }
        if (arg6 == 1) {
            var24 = this.field4859.method1309((byte) 125, arg14) + var20;
            var22 = (arg5 - var24) / 2 + arg8;
        } else if (arg6 == 2) {
            var24 = this.field4859.method1309((byte) 125, arg14) + var20;
            var22 = arg5 + arg8 - var24;
        }
        this.method2201(var19, arg7, arg4, true, var22, (int[]) null, arg14, var23);
        if (arg9 != null) {
            if (var24 == -1) {
                var24 = var20 + this.field4859.method1309((byte) 125, arg14);
            }
            arg9[1] = var23 - this.field4859.field2574;
            arg9[2] = var24;
            arg9[3] = this.field4859.field2575 + this.field4859.field2574;
            arg9[0] = var22;
        }
        return var20;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lvq;Lbb;)V")
    public class335(class269 arg0, class182 arg1) {
        this.field4857 = arg0;
        this.field4859 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[I[Lvj;IILjava/lang/String;I)V")
    public final void method2196(int arg0, int arg1, int[] arg2, class256[] arg3, int arg4, int arg5, String arg6, int arg7) {
        field4867++;
        if (arg6 == null) {
            return;
        }
        this.method2203((byte) -104, arg7, arg5);
        if (arg4 != -2401) {
            this.field4857 = null;
        }
        this.method2192((byte) -126, arg1, arg2, arg6, 0, arg0, 0, (class226) null, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method1808(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIBLjava/lang/String;I)V")
    public final void method2197(int arg0, int arg1, int arg2, byte arg3, String arg4, int arg5) {
        field4858++;
        int var7 = -66 % ((-arg3 - 24) / 41);
        if (arg4 != null) {
            this.method2203((byte) -87, arg1, arg0);
            this.method2192((byte) -123, arg2, (int[]) null, arg4, 0, arg5, 0, (class226) null, (class256[]) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII[[[BIIIIBILvq;I)V")
    public static final void method2198(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, class269 arg11, int arg12) {
        field4855++;
        if (arg2 == 0 || arg6 == 0) {
            return;
        }
        if (arg2 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg2 = 1;
        }
        if (arg9 != 57) {
            return;
        }
        if (arg2 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg2 = 1;
        }
        if (arg2 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg2 = 8;
        }
        arg11.method955(arg3, arg10, arg12, arg8, arg5, arg7, arg4[arg2 - 1][arg0], arg6, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public final void method2199(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4861++;
        if (arg0 == null) {
            return;
        }
        this.method2203((byte) -122, arg6, arg5);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        if (arg2 == -25029) {
            for (int var13 = 0; var13 < var11; var13++) {
                var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg4));
            }
            this.method2201((int[]) null, (class256[]) null, (int[]) null, true, arg7 - this.field4859.method1309((byte) 125, arg0) / 2, var12, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method2200(int arg0, String arg1) {
        field4853++;
        try {
            if (arg1.startsWith("col=")) {
                class261.field3859 = class261.field3859 & 0xFF000000 | class47.method307(arg1.substring(4), 31460, 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class261.field3859 = class261.field3859 & 0xFF000000 | class318.field4665 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class261.field3859 = class47.method307(arg1.substring(5), 31460, 16);
            } else if (arg1.equals("/argb")) {
                class261.field3859 = class318.field4665;
            } else if (arg1.startsWith("str=")) {
                class340.field4923 = class47.method307(arg1.substring(4), 31460, 16) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class340.field4923 = -8388608;
            } else if (arg1.equals("/str")) {
                class340.field4923 = -1;
            } else if (arg1.startsWith("u=")) {
                class352.field5117 = class47.method307(arg1.substring(2), 31460, 16) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class352.field5117 = -16777216;
            } else if (arg1.equals("/u")) {
                class352.field5117 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class190.field2724 = 0;
            } else if (arg1.startsWith("shad=")) {
                class190.field2724 = class47.method307(arg1.substring(5), 31460, 16) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class190.field2724 = -16777216;
            } else if (arg1.equals("/shad")) {
                class190.field2724 = class426.field6085;
            } else if (arg1.equals("br")) {
                this.method2203((byte) -119, class426.field6085, class318.field4665);
            }
        } catch (Exception var3) {
        }
        if (arg0 <= 53) {
            this.method1808((char) 65515, 79, 68, -123, true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([I[Lvj;[IZI[ILjava/lang/String;I)V")
    private final void method2201(int[] arg0, class256[] arg1, int[] arg2, boolean arg3, int arg4, int[] arg5, String arg6, int arg7) {
        field4862++;
        int var9 = arg7 - this.field4859.field2567;
        if (!arg3) {
            field4860 = null;
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class73.method441(arg6.charAt(var14), (byte) 100) & 0xFF);
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
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var12];
                                    }
                                    var12++;
                                    int var19 = class333.method2184(-1, var16.substring(4));
                                    class256 var20 = arg1[var19];
                                    int var21 = arg2 == null ? var20.method75() : arg2[var19];
                                    var20.method86(arg4 + var17, this.field4859.field2567 + var9 - (-var18 + var21), 0, 0, 1);
                                    var11 = -1;
                                    arg4 += arg1[var19].method83();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2200(115, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field4859.method1301(false, var15, var11);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class190.field2724 & 0xFF000000) != 0) {
                            this.method1808(var15, var22 + arg4 + 1, var9 + var23 + 1, class190.field2724, true);
                        }
                        this.method1808(var15, arg4 + var22, var9 + var23, class261.field3859, false);
                    } else if (class30.field364 > 0) {
                        class110.field1425 += class30.field364;
                        arg4 += class110.field1425 >> 8;
                        class110.field1425 &= 0xFF;
                    }
                    int var24 = this.field4859.method1304(0, var15);
                    if (class340.field4923 != -1) {
                        this.field4857.method1841((byte) -20, arg4, class340.field4923, var24, (int) ((double) this.field4859.field2567 * 0.7D) + var9);
                    }
                    if (class352.field5117 != -1) {
                        this.field4857.method1841((byte) -20, arg4, class352.field5117, var24, var9 + this.field4859.field2567);
                    }
                    var11 = var15;
                    arg4 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public final void method2202(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4870++;
        if (arg1 == null) {
            return;
        }
        this.method2203((byte) -98, arg0, arg3);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2201(var9, (class256[]) null, (int[]) null, true, arg2 - this.field4859.method1309((byte) 125, arg1) / arg5, var10, arg1, arg6);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
    private final void method2203(byte arg0, int arg1, int arg2) {
        class318.field4665 = arg2;
        class261.field3859 = arg2;
        field4866++;
        class110.field1425 = 0;
        class30.field364 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class340.field4923 = -1;
        if (arg0 > -78) {
            this.field4857 = null;
        }
        class352.field5117 = -1;
        class426.field6085 = arg1;
        class190.field2724 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;IIIILsg;III[III[Lvj;)I")
    public final int method2204(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7, class226 arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14, class256[] arg15) {
        field4869++;
        if (arg3 == null) {
            return 0;
        }
        this.method2203((byte) -90, arg10, arg2);
        if (arg7 != 16777215) {
            return 78;
        }
        if (arg0 == 0) {
            arg0 = this.field4859.field2567;
        }
        int[] var17;
        if (this.field4859.field2575 + arg0 + this.field4859.field2574 > arg6 && arg6 < (arg0 + arg0)) {
            var17 = null;
        } else {
            var17 = new int[] { arg14 };
        }
        int var18 = this.field4859.method1310(var17, class324.field4718, arg15, arg3, true);
        if (arg4 == 3 && var18 == 1) {
            arg4 = 1;
        }
        int var19;
        if (arg4 == 0) {
            var19 = this.field4859.field2574 + arg9;
        } else if (arg4 == 1) {
            var19 = (arg6 - ((var18 - 1) * arg0) - this.field4859.field2575 - this.field4859.field2574) / 2 + this.field4859.field2574 + arg9;
        } else if (arg4 == 2) {
            var19 = arg6 + arg9 - this.field4859.field2575 - (var18 - 1) * arg0;
        } else {
            int var20 = (arg6 - ((var18 - 1) * arg0) - this.field4859.field2575 - this.field4859.field2574) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = this.field4859.field2574 + arg9 + var20;
            arg0 += var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg1 == 0) {
                this.method2192((byte) -119, arg5, arg12, class324.field4718[var21], arg13, var19, arg11, arg8, arg15);
            } else if (arg1 == 1) {
                this.method2192((byte) -114, (arg14 - this.field4859.method1309((byte) 125, class324.field4718[var21])) / 2 + arg5, arg12, class324.field4718[var21], arg13, var19, arg11, arg8, arg15);
            } else if (arg1 == 2) {
                this.method2192((byte) -122, arg14 + arg5 - this.field4859.method1309((byte) 125, class324.field4718[var21]), arg12, class324.field4718[var21], arg13, var19, arg11, arg8, arg15);
            } else if ((var18 - 1) == var21) {
                this.method2192((byte) -116, arg5, arg12, class324.field4718[var21], arg13, var19, arg11, arg8, arg15);
            } else {
                this.method2193(arg14, class324.field4718[var21], 73);
                this.method2192((byte) -109, arg5, arg12, class324.field4718[var21], arg13, var19, arg11, arg8, arg15);
                class30.field364 = 0;
            }
            var19 += arg0;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/lang/String;BII)V")
    public final void method2205(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5, int arg6) {
        field4854++;
        if (arg3 == null) {
            return;
        }
        this.method2203((byte) -118, arg2, arg0);
        int var8 = arg3.length();
        int var9 = 40 % ((arg4 - 4) / 63);
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method2201((int[]) null, (class256[]) null, (int[]) null, true, arg1 - (this.field4859.method1309((byte) 125, arg3) / 2), var10, arg3, arg6);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(CIIIZLsg;II)V")
    public abstract void method1809(char arg0, int arg1, int arg2, int arg3, boolean arg4, class226 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILjava/lang/String;BII)V")
    public final void method2206(int arg0, int arg1, String arg2, byte arg3, int arg4, int arg5) {
        field4865++;
        if (arg2 == null) {
            return;
        }
        if (arg3 != 81) {
            this.field4857 = null;
        }
        this.method2203((byte) -98, arg1, arg5);
        this.method2192((byte) -127, arg0 - this.field4859.method1309((byte) 125, arg2), (int[]) null, arg2, 0, arg4, 0, (class226) null, (class256[]) null);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;I[Lvj;[IILjava/util/Random;IIII)I")
    public final int method2207(String arg0, int arg1, class256[] arg2, int[] arg3, int arg4, Random arg5, int arg6, int arg7, int arg8, int arg9) {
        field4863++;
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg1);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method2203((byte) -84, arg9 & 0xFFFFFF | var11 << 24, arg6 & 0xFFFFFF | var11 << 24);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg8 >= -61) {
            field4874 = false;
        }
        this.method2201(var13, arg2, arg3, true, arg4, (int[]) null, arg0, arg7);
        return var14;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method2208(byte arg0) {
        if (arg0 != 81) {
            field4856 = 114;
        }
        field4873 = null;
        field4860 = null;
    }
}
