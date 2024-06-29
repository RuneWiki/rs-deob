import java.io.File;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class200 {

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lkga;")
    private class511 field2908;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Loa;")
    private class651 field2907;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2921;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field2922;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;I[Lxa;I[IILfa;)V")
    private final void method1287(int arg0, int arg1, String arg2, int arg3, class468[] arg4, int arg5, int[] arg6, int arg7, class217 arg8) {
        int var10 = arg7 - this.field2908.field6820;
        field2920++;
        if (arg3 != 2) {
            return;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class350.method2086(arg2.charAt(var14), 3) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg2.substring(var11 + 1, var14);
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
                                    int var17 = class664.method3730(var16.substring(4), 126);
                                    class468 var18 = arg4[var17];
                                    int var19 = arg6 == null ? var18.method1030() : arg6[var17];
                                    if ((class545.field7268 & 0xFF000000) == -16777216) {
                                        var18.method271(arg5, this.field2908.field6820 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method271(arg5, var10 + this.field2908.field6820 - var19, 0, class545.field7268 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg5 += arg4[var17].method1025();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1292(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field2908.method2845(true, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class97.field1475 > 0) {
                            class621.field8239 += class97.field1475;
                            arg5 += class621.field8239 >> 8;
                            class621.field8239 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class168.field2605 & 0xFF000000) != 0) {
                            this.method134(var15, arg5 + 1, var10 + 1, class168.field2605, true);
                        }
                        this.method134(var15, arg5, var10, class545.field7268, false);
                    } else {
                        if ((class168.field2605 & 0xFF000000) != 0) {
                            this.method136(var15, arg5 + 1, var10 + 1, class168.field2605, true, arg8, arg0, arg1);
                        }
                        this.method136(var15, arg5, var10, class545.field7268, false, arg8, arg0, arg1);
                    }
                    int var20 = this.field2908.method2837(var15, false);
                    if (class665.field9435 != -1) {
                        this.field2907.method3570(arg5, 1, class665.field9435, (int) ((double) this.field2908.field6820 * 0.7D) + var10, var20);
                    }
                    if (class685.field9637 != -1) {
                        this.field2907.method3570(arg5, 1, class685.field9637, var10 + this.field2908.field6820 + 1, var20);
                    }
                    arg5 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIIILjava/lang/String;I)V")
    public final void method1288(byte arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field2904++;
        if (arg0 != 83) {
            this.field2908 = null;
        }
        if (arg4 != null) {
            this.method1295(arg2, arg3, arg0 - 67);
            this.method1287(0, 0, arg4, 2, null, arg1, null, arg5, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Z")
    public static final boolean method1289(Class arg0, String arg1, byte arg2) {
        field2900++;
        if (arg2 != 124) {
            return true;
        }
        Class var3 = (Class) class91.field1382.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        Object var4 = null;
        File var5 = (File) class400.field5311.get(arg1);
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg0, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class91.field1382.put(arg1, arg0);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class91.field1382.put(arg1, field2922 == null ? (field2922 = method1307("tw")) : field2922);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1290(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1290(-72, false, 47);
        }
        field2915++;
        return class156.method1091(arg0, -28635, arg2) || class271.method1648(0, arg2, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([II[I[Lxa;I[ILjava/lang/String;I)V")
    private final void method1291(int[] arg0, int arg1, int[] arg2, class468[] arg3, int arg4, int[] arg5, String arg6, int arg7) {
        if (arg7 > -30) {
            this.field2908 = null;
        }
        int var9 = arg1 - this.field2908.field6820;
        field2902++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class350.method2086(arg6.charAt(var14), 3) & 0xFF);
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
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class664.method3730(var16.substring(4), 124);
                                    class468 var20 = arg3[var19];
                                    int var21 = arg5 == null ? var20.method1030() : arg5[var19];
                                    var20.method271(arg4 + var17, this.field2908.field6820 + var9 + var18 - var21, 1, 0, 1);
                                    var11 = -1;
                                    arg4 += arg3[var19].method1025();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1292(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field2908.method2845(true, var11, var15);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    if (var15 != ' ') {
                        if ((class168.field2605 & 0xFF000000) != 0) {
                            this.method134(var15, arg4 + var22 + 1, var23 + 1 + var9, class168.field2605, true);
                        }
                        this.method134(var15, arg4 + var22, var9 + var23, class545.field7268, false);
                    } else if (class97.field1475 > 0) {
                        class621.field8239 += class97.field1475;
                        arg4 += class621.field8239 >> 8;
                        class621.field8239 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field2908.method2837(var15, false);
                    if (class665.field9435 != -1) {
                        this.field2907.method3570(arg4, 1, class665.field9435, (int) ((double) this.field2908.field6820 * 0.7D) + var9, var24);
                    }
                    if (class685.field9637 != -1) {
                        this.field2907.method3570(arg4, 1, class685.field9637, this.field2908.field6820 + var9, var24);
                    }
                    arg4 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    private final void method1292(String arg0, boolean arg1) {
        if (!arg1) {
            this.field2907 = null;
        }
        try {
            if (arg0.startsWith("col=")) {
                class545.field7268 = class545.field7268 & 0xFF000000 | class273.method1660(arg0.substring(4), 5, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class545.field7268 = class545.field7268 & 0xFF000000 | class645.field8658 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class545.field7268 = class273.method1660(arg0.substring(5), 5, 16);
            } else if (arg0.equals("/argb")) {
                class545.field7268 = class645.field8658;
            } else if (arg0.startsWith("str=")) {
                class665.field9435 = class545.field7268 & 0xFF000000 | class273.method1660(arg0.substring(4), 5, 16);
            } else if (arg0.equals("str")) {
                class665.field9435 = class545.field7268 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class665.field9435 = -1;
            } else if (arg0.startsWith("u=")) {
                class685.field9637 = class545.field7268 & 0xFF000000 | class273.method1660(arg0.substring(2), 5, 16);
            } else if (arg0.equals("u")) {
                class685.field9637 = class545.field7268 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class685.field9637 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class168.field2605 = 0;
            } else if (arg0.startsWith("shad=")) {
                class168.field2605 = class545.field7268 & 0xFF000000 | class273.method1660(arg0.substring(5), 5, 16);
            } else if (arg0.equals("shad")) {
                class168.field2605 = class545.field7268 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class168.field2605 = class588.field7794;
            } else if (arg0.equals("br")) {
                this.method1295(class645.field8658, class588.field7794, 16);
            }
        } catch (Exception var3) {
        }
        field2921++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1293(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field2913++;
        if (arg3 != 24386) {
            this.method1287(65, -109, null, -116, null, -4, null, -34, null);
        }
        if (arg2 != null) {
            this.method1295(arg5, arg1, 16);
            this.method1287(0, 0, arg2, 2, null, arg0 - this.field2908.method2847(arg2, (byte) -117), null, arg4, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;ILjava/lang/String;[IBIII[IIIIIILjava/util/Random;)I")
    public final int method1294(class468[] arg0, int arg1, String arg2, int[] arg3, byte arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, Random arg14) {
        field2905++;
        if (arg2 == null) {
            return 0;
        }
        arg14.setSeed((long) arg1);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        int var17 = -123 % ((48 - arg4) / 60);
        this.method1295(arg13 & 0xFFFFFF | var16 << 24, var16 << 24 | arg5 & 0xFFFFFF, 16);
        int var18 = arg2.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg14.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg7;
        int var23 = this.field2908.field6828 + arg11;
        int var24 = -1;
        if (arg6 == 1) {
            var23 += (arg12 - (this.field2908.field6828 + this.field2908.field6833)) / 2;
        } else if (arg6 == 2) {
            var23 = arg11 + arg12 - this.field2908.field6833;
        }
        if (arg9 == 1) {
            var24 = this.field2908.method2847(arg2, (byte) -123) + var20;
            var22 = (arg10 - var24) / 2 + arg7;
        } else if (arg9 == 2) {
            var24 = var20 + this.field2908.method2847(arg2, (byte) -120);
            var22 = arg10 + arg7 - var24;
        }
        this.method1291(var19, var23, null, arg0, var22, arg8, arg2, -59);
        if (arg3 != null) {
            if (var24 == -1) {
                var24 = var20 + this.field2908.method2847(arg2, (byte) -121);
            }
            arg3[3] = this.field2908.field6833 + this.field2908.field6828;
            arg3[1] = var23 - this.field2908.field6828;
            arg3[2] = var24;
            arg3[0] = var22;
        }
        return var20;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    private final void method1295(int arg0, int arg1, int arg2) {
        class665.field9435 = -1;
        field2903++;
        class685.field9637 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class621.field8239 = 0;
        if (arg2 != 16) {
            this.method1302(null, false, -128);
        }
        class97.field1475 = 0;
        class645.field8658 = arg0;
        class545.field7268 = arg0;
        class588.field7794 = arg1;
        class168.field2605 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[ILjava/util/Random;IILjava/lang/String;II[Lxa;)I")
    public final int method1296(int arg0, int arg1, int[] arg2, Random arg3, int arg4, int arg5, String arg6, int arg7, int arg8, class468[] arg9) {
        field2916++;
        if (arg6 == null) {
            return 0;
        }
        arg3.setSeed((long) arg8);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1295(arg5 & 0xFFFFFF | var11 << 24, var11 << 24 | arg0 & 0xFFFFFF, arg4 ^ 0xFFFFFFEF);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg4 != -1) {
            method1289(null, null, (byte) 51);
        }
        this.method1291(var13, arg7, null, arg9, arg1, arg2, arg6, -70);
        return var14;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILeh;)Lsd;")
    public static final class84 method1297(int arg0, class335 arg1) {
        field2906++;
        class84 var2 = new class84();
        if (arg0 == 0) {
            var2.field1295 = arg1.method2001((byte) -83);
            var2.field1290 = class29.field478.method3816(var2.field1295, true);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II[III[Lxa;IBIILfa;II)I")
    public final int method1298(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, class468[] arg9, int arg10, byte arg11, int arg12, int arg13, class217 arg14, int arg15, int arg16) {
        field2910++;
        if (arg3 == null) {
            return 0;
        }
        this.method1295(arg2, arg7, 16);
        if (arg11 != 72) {
            return 45;
        }
        if (arg4 == 0) {
            arg4 = this.field2908.field6820;
        }
        int[] var18;
        if (arg12 < this.field2908.field6828 + this.field2908.field6833 + arg4 && (arg4 + arg4) > arg12) {
            var18 = null;
        } else {
            var18 = new int[] { arg1 };
        }
        if (arg8 == -1) {
            arg8 = arg12 / arg4;
            if (arg8 <= 0) {
                arg8 = 1;
            }
        }
        int var19 = this.field2908.method2846(false, var18, class484.field6549, arg9, arg3);
        if (arg8 > 0 && var19 >= arg8) {
            var19 = arg8;
            class484.field6549[arg8 - 1] = this.field2908.method2836((byte) -123, class484.field6549[arg8 - 1], arg9, arg1);
        }
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var21;
        if (arg16 == 0) {
            var21 = this.field2908.field6828 + arg10;
        } else if (arg16 == 1) {
            var21 = arg10 + this.field2908.field6828 + ((-this.field2908.field6828 + arg12 + -((var19 + -1) * arg4) + -this.field2908.field6833) / 2);
        } else if (arg16 == 2) {
            var21 = arg10 + arg12 - this.field2908.field6833 - ((var19 + -1) * arg4);
        } else {
            int var20 = (arg12 - (var19 - 1) * arg4 - this.field2908.field6833 - this.field2908.field6828) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var21 = this.field2908.field6828 + arg10 + var20;
            arg4 += var20;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg0 == 0) {
                this.method1287(arg13, arg5, class484.field6549[var22], 2, arg9, arg15, arg6, var21, arg14);
            } else if (arg0 == 1) {
                this.method1287(arg13, arg5, class484.field6549[var22], 2, arg9, arg15 + (arg1 - this.field2908.method2847(class484.field6549[var22], (byte) -128)) / 2, arg6, var21, arg14);
            } else if (arg0 == 2) {
                this.method1287(arg13, arg5, class484.field6549[var22], 2, arg9, arg15 + arg1 - this.field2908.method2847(class484.field6549[var22], (byte) -125), arg6, var21, arg14);
            } else if (var19 - 1 == var22) {
                this.method1287(arg13, arg5, class484.field6549[var22], 2, arg9, arg15, arg6, var21, arg14);
            } else {
                this.method1302(class484.field6549[var22], true, arg1);
                this.method1287(arg13, arg5, class484.field6549[var22], arg11 - 70, arg9, arg15, arg6, var21, arg14);
                class97.field1475 = 0;
            }
            var21 += arg4;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Z")
    public static final boolean method1299(byte arg0, int arg1) {
        field2919++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return ~var2 > arg1 || var2 >= 160 || class104.field1562[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[Lxa;I[ILjava/lang/String;I)V")
    public final void method1300(int arg0, int arg1, int arg2, class468[] arg3, int arg4, int[] arg5, String arg6, int arg7) {
        field2901++;
        if (arg6 != null) {
            this.method1295(arg7, arg0, 16);
            this.method1287(arg4, 0, arg6, 2, arg3, arg2, arg5, arg1, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBIIILjava/lang/String;I[I[Lxa;IIIILfa;)I")
    public final int method1301(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, String arg7, int arg8, int[] arg9, class468[] arg10, int arg11, int arg12, int arg13, int arg14, class217 arg15) {
        field2909++;
        if (arg3 <= 126) {
            this.method1304(-25, null, 2, true, -61, 56, -56);
        }
        return this.method1298(arg14, arg12, arg13, arg7, arg5, arg11, arg9, arg0, 0, arg10, arg2, (byte) 72, arg4, arg8, arg15, arg6, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    private final void method1302(String arg0, boolean arg1, int arg2) {
        field2911++;
        int var4 = 0;
        boolean var5 = false;
        if (!arg1) {
            return;
        }
        for (int var6 = 0; var6 < arg0.length(); var6++) {
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
            class97.field1475 = (arg2 - this.field2908.method2847(arg0, (byte) -119) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1303(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2912++;
        if (arg4 != 8364) {
            this.method1293(87, 34, null, -2, 125, -22);
        }
        if (arg0 != null) {
            this.method1295(arg3, arg5, arg4 - 8348);
            this.method1287(0, 0, arg0, arg4 - 8362, null, arg1 - this.field2908.method2847(arg0, (byte) -120) / 2, null, arg2, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IZIII)V")
    public final void method1304(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2917++;
        if (arg1 == null) {
            return;
        }
        this.method1295(arg2, arg4, 16);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3) {
            return;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1291(var9, arg5, var10, null, arg0 - this.field2908.method2847(arg1, (byte) -128) / 2, null, arg1, -47);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Lkga;)V")
    public class200(class651 arg0, class511 arg1) {
        this.field2908 = arg1;
        this.field2907 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method1305(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field2914++;
        if (arg2 == null) {
            return;
        }
        int var8 = -50 % ((arg0 + 68) / 49);
        this.method1295(arg6, arg1, 16);
        int var9 = arg2.length();
        int[] var10 = new int[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method1291(null, arg4, var10, null, arg3 - (this.field2908.method2847(arg2, (byte) -128) / 2), null, arg2, -107);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;IIBIII)V")
    public final void method1306(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2918++;
        if (arg1 == null) {
            return;
        }
        this.method1295(arg2, arg0, 16);
        double var9 = 7.0D - (double) arg7 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        if (arg4 != -81) {
            this.method1305(-36, -104, null, 109, 66, -76, 127);
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg6));
        }
        this.method1291(null, arg3, var12, null, arg5 - (this.field2908.method2847(arg1, (byte) -126) / 2), null, arg1, arg4 ^ 0x8);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1307(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
