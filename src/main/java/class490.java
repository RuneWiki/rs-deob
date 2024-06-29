import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class490 {

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lqa;")
    private class162 field7151;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lgv;")
    private class56 field7148;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field7156;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field7157;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2891(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;III)V", line = 5)
    public final void method2873(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        field7140++;
        if (arg4 == null) {
            return;
        }
        this.method2874(arg0 ^ 0x1F64, arg1, arg6);
        double var9 = 7.0D - ((double) arg5 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (arg0 != -1) {
            return;
        }
        int var11 = arg4.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        this.method2887(arg2, null, arg3 - (this.field7148.method362(arg4, (byte) 93) / 2), null, var12, arg4, null, 62);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 38)
    private final void method2874(int arg0, int arg1, int arg2) {
        if (arg0 != -8037) {
            this.field7148 = null;
        }
        field7154++;
        class380.field5368 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class511.field7520 = -1;
        class507.field7458 = arg2;
        class202.field2879 = arg2;
        class442.field6434 = 0;
        class387.field5442 = 0;
        class365.field5099 = arg1;
        class217.field3069 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 58)
    private final void method2875(String arg0, int arg1, byte arg2) {
        field7150++;
        int var4 = 0;
        boolean var5 = false;
        if (arg2 > -15) {
            this.field7151 = null;
        }
        for (int var6 = 0; arg0.length() > var6; var6++) {
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
            class442.field6434 = (arg1 - this.field7148.method362(arg0, (byte) 83) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/Class;)Lbt;", line = 98)
    public static final class33 method2876(int arg0, int arg1, int arg2, Class arg3) {
        class61 var4 = class385.field5410[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class302 var5 = var4.field819; var5 != null; var5 = var5.field4140) {
            class33 var6 = var5.field4136;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field463 == arg1 && var6.field468 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII[Lf;ILjava/lang/String;Ljava/util/Random;IB[II[II)I", line = 122)
    public final int method2877(int arg0, int arg1, int arg2, int arg3, int arg4, class529[] arg5, int arg6, String arg7, Random arg8, int arg9, byte arg10, int[] arg11, int arg12, int[] arg13, int arg14) {
        if (arg10 < 79) {
            this.method2874(4, 35, 20);
        }
        field7139++;
        if (arg7 == null) {
            return 0;
        }
        arg8.setSeed((long) arg14);
        int var16 = (arg8.nextInt() & 0x1F) + 192;
        this.method2874(-8037, var16 << 24 | arg0 & 0xFFFFFF, var16 << 24 | arg9 & 0xFFFFFF);
        int var17 = arg7.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg8.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg2;
        int var22 = this.field7148.field776 + arg12;
        int var23 = -1;
        if (arg4 == 1) {
            var22 += (arg3 - this.field7148.field774 - this.field7148.field776) / 2;
        } else if (arg4 == 2) {
            var22 = arg12 + arg3 - this.field7148.field774;
        }
        if (arg6 == 1) {
            var23 = this.field7148.method362(arg7, (byte) 95) + var19;
            var21 = (arg1 - var23) / 2 + arg2;
        } else if (arg6 == 2) {
            var23 = this.field7148.method362(arg7, (byte) 60) + var19;
            var21 = arg1 + arg2 - var23;
        }
        this.method2887(var22, arg11, var21, var18, null, arg7, arg5, 62);
        if (arg13 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field7148.method362(arg7, (byte) 107);
            }
            arg13[2] = var23;
            arg13[0] = var21;
            arg13[1] = var22 - this.field7148.field776;
            arg13[3] = this.field7148.field776 + this.field7148.field774;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 204)
    private final void method2878(int arg0, String arg1) {
        field7155++;
        try {
            if (arg1.startsWith("col=")) {
                class202.field2879 = class202.field2879 & 0xFF000000 | class204.method1242(arg1.substring(4), 16, 3289650) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class202.field2879 = class507.field7458 & 0xFFFFFF | class202.field2879 & 0xFF000000;
            }
            if (arg0 != 1) {
                method2879(null, 33, 85, -32, -8, -97, -27, (byte) -105, 101);
            }
            if (arg1.startsWith("argb=")) {
                class202.field2879 = class204.method1242(arg1.substring(5), 16, 3289650);
            } else if (arg1.equals("/argb")) {
                class202.field2879 = class507.field7458;
            } else if (arg1.startsWith("str=")) {
                class511.field7520 = class204.method1242(arg1.substring(4), 16, 3289650) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class511.field7520 = -8388608;
            } else if (arg1.equals("/str")) {
                class511.field7520 = -1;
            } else if (arg1.startsWith("u=")) {
                class380.field5368 = class204.method1242(arg1.substring(2), 16, 3289650) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class380.field5368 = -16777216;
            } else if (arg1.equals("/u")) {
                class380.field5368 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class217.field3069 = 0;
            } else if (arg1.startsWith("shad=")) {
                class217.field3069 = class204.method1242(arg1.substring(5), 16, 3289650) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class217.field3069 = -16777216;
            } else if (arg1.equals("/shad")) {
                class217.field3069 = class365.field5099;
            } else if (arg1.equals("br")) {
                this.method2874(-8037, class365.field5099, class507.field7458);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqa;IIIIIIBI)V", line = 284)
    public static final void method2879(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 <= 49) {
            return;
        }
        field7146++;
        class55 var9 = (class55) class195.method1184(arg3, arg2, arg6);
        if (var9 != null) {
            class132 var10 = class82.field1154.method2121(var9.method354((byte) -62), true);
            int var11 = var9.method359((byte) -8) & 0x3;
            int var12 = var9.method355(13599);
            if (var10.field1887 == -1) {
                int var13 = arg1;
                if (var10.field1850 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1002(arg8, 4, var13, arg5, 10);
                    } else if (var11 == 1) {
                        arg0.method999(arg8, var13, arg5, 20754, 4);
                    } else if (var11 == 2) {
                        arg0.method1002(arg8, 4, var13, arg5 + 3, 98);
                    } else if (var11 == 3) {
                        arg0.method999(arg8 + 3, var13, arg5, 20754, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method1006(arg5, var13, arg8, 1, 1, 1);
                    } else if (var11 == 1) {
                        arg0.method1006(arg5 + 3, var13, arg8, 1, 1, 1);
                    } else if (var11 == 2) {
                        arg0.method1006(arg5 + 3, var13, arg8 + 3, 1, 1, 1);
                    } else if (var11 == 3) {
                        arg0.method1006(arg5, var13, arg8 + 3, 1, 1, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method999(arg8, var13, arg5, 20754, 4);
                    } else if (var11 == 1) {
                        arg0.method1002(arg8, 4, var13, arg5 + 3, -124);
                    } else if (var11 == 2) {
                        arg0.method999(arg8 + 3, var13, arg5, 20754, 4);
                    } else if (var11 == 3) {
                        arg0.method1002(arg8, 4, var13, arg5, 109);
                    }
                }
            } else {
                class145.method933((byte) 82, arg5, var10, var11, arg0, arg8);
            }
        }
        class55 var14 = (class55) method2876(arg3, arg2, arg6, field7157 == null ? (field7157 = method2891("jv")) : field7157);
        if (var14 != null) {
            class132 var15 = class82.field1154.method2121(var14.method354((byte) 126), true);
            int var16 = var14.method359((byte) -8) & 0x3;
            int var17 = var14.method355(13599);
            if (var15.field1887 != -1) {
                class145.method933((byte) 90, arg5, var15, var16, arg0, arg8);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1850 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method1008(arg8, (byte) 13, arg8 + 3, arg5 + 3, var18, arg5);
                } else {
                    arg0.method1008(arg8 + 3, (byte) -92, arg8, arg5 + 3, var18, arg5);
                }
            }
        }
        class55 var19 = (class55) class391.method2240(arg3, arg2, arg6);
        if (var19 == null) {
            return;
        }
        class132 var20 = class82.field1154.method2121(var19.method354((byte) 127), true);
        int var21 = var19.method359((byte) -8) & 0x3;
        if (var20.field1887 != -1) {
            class145.method933((byte) 112, arg5, var20, var21, arg0, arg8);
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V", line = 424)
    public final void method2880(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6) {
        field7141++;
        if (arg6 == null) {
            return;
        }
        this.method2874(-8037, arg1, arg3);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2887(arg2, null, arg4 - (this.field7148.method362(arg6, (byte) 122) / 2), var9, var10, arg6, null, 62);
        if (arg5) {
            method2879(null, -44, -76, 90, 17, -56, -39, (byte) 43, -42);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;BIIII)V", line = 457)
    public final void method2881(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field7156++;
        if (arg1 < -113 && arg0 != null) {
            this.method2874(-8037, arg4, arg2);
            this.method2885(0, arg3, arg0, arg5, 0, null, (byte) -105, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IILjava/lang/String;I[Lf;II)V", line = 476)
    public final void method2882(int arg0, int[] arg1, int arg2, String arg3, int arg4, class529[] arg5, int arg6, int arg7) {
        int var9 = -106 % ((51 - arg4) / 57);
        field7142++;
        if (arg3 != null) {
            this.method2874(-8037, arg0, arg7);
            this.method2885(0, arg6, arg3, arg2, 0, arg5, (byte) -104, null, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 490)
    public final void method2883(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field7138++;
        if (arg3 == null) {
            return;
        }
        this.method2874(-8037, arg5, arg0);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int var10 = 0;
        if (arg1 <= 109) {
            this.method2883(-46, 9, -80, null, 123, -16, 34);
        }
        while (var10 < var8) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            var10++;
        }
        this.method2887(arg4, null, arg6 - (this.field7148.method362(arg3, (byte) 114) / 2), null, var9, arg3, null, 62);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 520)
    public final void method2884(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field7149++;
        if (arg5 == null) {
            return;
        }
        this.method2874(-8037, arg4, arg2);
        if (arg3 >= -98) {
            this.method2883(10, -42, -73, null, 52, 52, 13);
        }
        this.method2885(0, arg1 - (this.field7148.method362(arg5, (byte) 64) / 2), arg5, arg0, 0, null, (byte) -118, null, null);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;II[Lf;BLea;[I)V", line = 537)
    private final void method2885(int arg0, int arg1, String arg2, int arg3, int arg4, class529[] arg5, byte arg6, class382 arg7, int[] arg8) {
        int var10 = arg3 - this.field7148.field757;
        field7147++;
        int var11 = -1;
        if (arg6 >= -96) {
            return;
        }
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class509.method2990(arg2.charAt(var14), (byte) -123) & 0xFF);
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
                                    int var17 = class47.method298(false, var16.substring(4));
                                    class529 var18 = arg5[var17];
                                    int var19 = arg8 == null ? var18.method121() : arg8[var17];
                                    if ((class202.field2879 & 0xFF000000) == -16777216) {
                                        var18.method130(arg1, var10 + this.field7148.field757 - var19, 1, 0, 1);
                                    } else {
                                        var18.method130(arg1, this.field7148.field757 + var10 - var19, 0, class202.field2879 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg1 += arg5[var17].method126();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2878(1, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field7148.method366(var15, 62, var12);
                    }
                    if (var15 == ' ') {
                        if (class442.field6434 > 0) {
                            class387.field5442 += class442.field6434;
                            arg1 += class387.field5442 >> 8;
                            class387.field5442 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class217.field3069 & 0xFF000000) != 0) {
                            this.method544(var15, arg1 + 1, var10 + 1, class217.field3069, true);
                        }
                        this.method544(var15, arg1, var10, class202.field2879, false);
                    } else {
                        if ((class217.field3069 & 0xFF000000) != 0) {
                            this.method547(var15, arg1 + 1, var10 + 1, class217.field3069, true, arg7, arg0, arg4);
                        }
                        this.method547(var15, arg1, var10, class202.field2879, false, arg7, arg0, arg4);
                    }
                    int var20 = this.field7148.method370(false, var15);
                    if (class511.field7520 != -1) {
                        this.field7151.method999(var10 + ((int) ((double) this.field7148.field757 * 0.7D)), class511.field7520, arg1, 20754, var20);
                    }
                    if (class380.field5368 != -1) {
                        this.field7151.method999(this.field7148.field757 + var10 + 1, class380.field5368, arg1, 20754, var20);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILea;BI[IIIII[Lf;IIILjava/lang/String;II)I", line = 688)
    public final int method2886(int arg0, class382 arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, class529[] arg9, int arg10, int arg11, int arg12, String arg13, int arg14, int arg15) {
        field7144++;
        int var17 = -106 / ((arg2 - 67) / 59);
        return this.method2889(arg13, arg11, arg12, arg3, arg6, arg14, arg4, 5327, 0, arg15, arg5, arg7, arg0, arg10, arg8, arg9, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Lgv;)V", line = 697)
    public class490(class162 arg0, class56 arg1) {
        this.field7151 = arg0;
        this.field7148 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[II[I[ILjava/lang/String;[Lf;I)V", line = 710)
    private final void method2887(int arg0, int[] arg1, int arg2, int[] arg3, int[] arg4, String arg5, class529[] arg6, int arg7) {
        if (arg7 != 62) {
            return;
        }
        int var9 = arg0 - this.field7148.field757;
        field7143++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class509.method2990(arg5.charAt(var14), (byte) 6) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg5.substring(var10 + 1, var14);
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
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class47.method298(false, var16.substring(4));
                                    class529 var20 = arg6[var19];
                                    int var21 = arg1 == null ? var20.method121() : arg1[var19];
                                    var20.method130(arg2 + var17, this.field7148.field757 + var9 - var21 - -var18, 1, 0, 1);
                                    var11 = -1;
                                    arg2 += arg6[var19].method126();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2878(arg7 ^ 0x3F, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field7148.method366(var15, 62, var11);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class217.field3069 & 0xFF000000) != 0) {
                            this.method544(var15, arg2 + var22 + 1, var9 - (-var23 + -1), class217.field3069, true);
                        }
                        this.method544(var15, arg2 + var22, var9 + var23, class202.field2879, false);
                    } else if (class442.field6434 > 0) {
                        class387.field5442 += class442.field6434;
                        arg2 += class387.field5442 >> 8;
                        class387.field5442 &= 0xFF;
                    }
                    int var24 = this.field7148.method370(false, var15);
                    if (class511.field7520 != -1) {
                        this.field7151.method999((int) ((double) this.field7148.field757 * 0.7D) + var9, class511.field7520, arg2, arg7 ^ 0x512C, var24);
                    }
                    if (class380.field5368 != -1) {
                        this.field7151.method999(this.field7148.field757 + var9, class380.field5368, arg2, 20754, var24);
                    }
                    var11 = var15;
                    arg2 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;[Lf;I[IILjava/util/Random;III)I", line = 872)
    public final int method2888(int arg0, String arg1, class529[] arg2, int arg3, int[] arg4, int arg5, Random arg6, int arg7, int arg8, int arg9) {
        field7145++;
        if (arg1 == null) {
            return 0;
        }
        arg6.setSeed((long) arg0);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method2874(arg5 ^ 0x2EF5, arg8 & 0xFFFFFF | var11 << 24, arg3 & 0xFFFFFF | var11 << 24);
        if (arg5 != -12690) {
            return 68;
        }
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg6.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2887(arg9, arg4, arg7, var13, null, arg1, arg2, 62);
        return var14;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII[IIIIIIIII[Lf;Lea;)I", line = 915)
    public final int method2889(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class529[] arg15, class382 arg16) {
        field7153++;
        if (arg0 == null) {
            return 0;
        }
        this.method2874(-8037, arg1, arg12);
        if (arg3 == 0) {
            arg3 = this.field7148.field757;
        }
        if (arg7 != 5327) {
            this.field7151 = null;
        }
        int[] var18;
        if (arg10 < this.field7148.field776 + this.field7148.field774 + arg3 && arg3 + arg3 > arg10) {
            var18 = null;
        } else {
            var18 = new int[] { arg5 };
        }
        if (arg8 == -1) {
            arg8 = arg10 / arg3;
            if (arg8 <= 0) {
                arg8 = 1;
            }
        }
        int var19 = this.field7148.method367(arg15, var18, arg0, false, class142.field2015);
        if (arg8 > 0 && var19 >= arg8) {
            var19 = arg8;
            class142.field2015[arg8 - 1] = this.field7148.method368(arg5, arg7 - 5327, arg15, class142.field2015[arg8 - 1]);
        }
        if (arg13 == 3 && var19 == 1) {
            arg13 = 1;
        }
        int var21;
        if (arg13 == 0) {
            var21 = this.field7148.field776 + arg9;
        } else if (arg13 == 1) {
            var21 = (arg10 - this.field7148.field776 - ((var19 - 1) * arg3) - this.field7148.field774) / 2 + arg9 + this.field7148.field776;
        } else if (arg13 == 2) {
            var21 = arg10 + arg9 - this.field7148.field774 - ((var19 + -1) * arg3);
        } else {
            int var20 = (arg10 - ((var19 - 1) * arg3) - this.field7148.field774 - this.field7148.field776) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg3 += var20;
            var21 = this.field7148.field776 + arg9 + var20;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg4 == 0) {
                this.method2885(arg11, arg14, class142.field2015[var22], var21, arg2, arg15, (byte) -112, arg16, arg6);
            } else if (arg4 == 1) {
                this.method2885(arg11, arg14 + (arg5 - this.field7148.method362(class142.field2015[var22], (byte) 121)) / 2, class142.field2015[var22], var21, arg2, arg15, (byte) -105, arg16, arg6);
            } else if (arg4 == 2) {
                this.method2885(arg11, arg5 + arg14 - this.field7148.method362(class142.field2015[var22], (byte) 73), class142.field2015[var22], var21, arg2, arg15, (byte) -99, arg16, arg6);
            } else if (var19 - 1 == var22) {
                this.method2885(arg11, arg14, class142.field2015[var22], var21, arg2, arg15, (byte) -104, arg16, arg6);
            } else {
                this.method2875(class142.field2015[var22], arg5, (byte) -105);
                this.method2885(arg11, arg14, class142.field2015[var22], var21, arg2, arg15, (byte) -103, arg16, arg6);
                class442.field6434 = 0;
            }
            var21 += arg3;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 1017)
    public final void method2890(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field7152++;
        if (arg5 != -4907) {
            this.method547((char) 65427, 108, -55, 49, true, null, -57, 102);
        }
        if (arg1 != null) {
            this.method2874(-8037, arg0, arg2);
            this.method2885(0, arg4 - this.field7148.method362(arg1, (byte) 111), arg1, arg3, 0, null, (byte) -108, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method547(char arg0, int arg1, int arg2, int arg3, boolean arg4, class382 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method544(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
