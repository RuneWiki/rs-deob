import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class33 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lse;")
    private class4 field508;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lqa;")
    private class496 field514;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lcm;")
    public static class449 field502 = new class449(38, 2);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lqo;")
    public static class141 field515 = new class141(16);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field521 = 1;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
    public static int[] field525 = new int[32];

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lns;")
    public static class438 field522;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 12)
    public final void method235(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 29451) {
            this.method235(null, 8, -118, -11, 104, -119);
        }
        field504++;
        if (arg0 != null) {
            this.method237(true, arg1, arg3);
            this.method250(arg2, null, arg0, 0, null, (byte) 121, null, arg5, 0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lf;[IIILjava/lang/String;[II[I)V", line = 32)
    private final void method236(class191[] arg0, int[] arg1, int arg2, int arg3, String arg4, int[] arg5, int arg6, int[] arg7) {
        field507++;
        int var9 = arg6 - this.field508.field53;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class227.method1559((byte) -79, arg4.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg4.substring(var10 + 1, var14);
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
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class188.method1320(var16.substring(4), -111);
                                    class191 var20 = arg0[var19];
                                    int var21 = arg1 == null ? var20.method219() : arg1[var19];
                                    var20.method32(arg3 + var17, this.field508.field53 + var9 + -var21 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg3 += arg0[var19].method209();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method246(-64, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg3 += this.field508.method39(var15, var11, 93);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class427.field6354 & 0xFF000000) != 0) {
                            this.method249(var15, arg3 + var22 + 1, var9 - -var23 + 1, class427.field6354, true);
                        }
                        this.method249(var15, arg3 + var22, var9 + var23, class391.field5948, false);
                    } else if (class486.field7131 > 0) {
                        class35.field547 += class486.field7131;
                        arg3 += class35.field547 >> 8;
                        class35.field547 &= 0xFF;
                    }
                    int var24 = this.field508.method40(var15, (byte) 82);
                    if (class189.field2649 != -1) {
                        this.field514.method2947(arg3, class189.field2649, (int) ((double) this.field508.field53 * 0.7D) + var9, (byte) 114, var24);
                    }
                    if (class120.field1697 != -1) {
                        this.field514.method2947(arg3, class120.field1697, this.field508.field53 + var9, (byte) 92, var24);
                    }
                    arg3 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg2 < 19) {
            field502 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)V", line = 197)
    private final void method237(boolean arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            arg2 = 0;
        }
        class120.field1697 = -1;
        field512++;
        class486.field7131 = 0;
        class35.field547 = 0;
        class189.field2649 = -1;
        class507.field7547 = arg1;
        class391.field5948 = arg1;
        if (arg0) {
            class370.field5687 = arg2;
            class427.field6354 = arg2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 222)
    public final void method238(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field506++;
        if (arg5 == null) {
            return;
        }
        this.method237(true, arg3, arg0);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method236(null, null, arg1 + 24, arg4 + -(this.field508.method45(arg5, (byte) -49) / arg1), arg5, null, arg6, var9);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 246)
    public final void method239(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 14144) {
            return;
        }
        field517++;
        if (arg2 != null) {
            this.method237(true, arg3, arg0);
            this.method250(arg4 - this.field508.method45(arg2, (byte) -120) / 2, null, arg2, 0, null, (byte) 122, null, arg5, 0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;IBI)V", line = 262)
    public final void method240(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5) {
        field510++;
        if (arg2 == null) {
            return;
        }
        if (arg4 <= 45) {
            this.method243((char) 65412, -100, -4, -93, false, null, -35, 127);
        }
        this.method237(true, arg3, arg5);
        this.method250(arg1 - this.field508.method45(arg2, (byte) -45), null, arg2, 0, null, (byte) 122, null, arg0, 0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;II[I[Lf;II)V", line = 282)
    public final void method241(int arg0, String arg1, int arg2, int arg3, int[] arg4, class191[] arg5, int arg6, int arg7) {
        field501++;
        if (arg1 == null) {
            return;
        }
        this.method237(true, arg6, arg7);
        if (arg3 != -18066) {
            field522 = null;
        }
        this.method250(arg2, arg4, arg1, 0, null, (byte) 122, arg5, arg0, 0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 298)
    private final void method242(int arg0, String arg1, int arg2) {
        field500++;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 != 60) {
            return;
        }
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
            class486.field7131 = (arg2 - this.field508.method45(arg1, (byte) -86) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[Lf;IBLea;IIIIIIIILjava/lang/String;I)I", line = 338)
    public final int method244(int arg0, int arg1, int[] arg2, class191[] arg3, int arg4, byte arg5, class15 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, String arg15, int arg16) {
        field513++;
        if (arg15 == null) {
            return 0;
        }
        int var18 = 111 % ((arg5 + 5) / 35);
        this.method237(true, arg0, arg10);
        if (arg8 == 0) {
            arg8 = this.field508.field53;
        }
        int[] var19;
        if (this.field508.field58 + this.field508.field44 + arg8 > arg7 && arg7 < (arg8 + arg8)) {
            var19 = null;
        } else {
            var19 = new int[] { arg4 };
        }
        int var20 = this.field508.method35(160, var19, class10.field159, arg15, arg3);
        if (arg9 == -1) {
            arg9 = arg7 / arg8;
            if (arg9 <= 0) {
                arg9 = 1;
            }
        }
        if (arg9 > 0 && arg9 <= var20) {
            class10.field159[arg9 - 1] = this.field508.method41(-52, arg3, arg4, class10.field159[arg9 - 1]);
            var20 = arg9;
        }
        if (arg12 == 3 && var20 == 1) {
            arg12 = 1;
        }
        int var21;
        if (arg12 == 0) {
            var21 = this.field508.field58 + arg14;
        } else if (arg12 == 1) {
            var21 = (arg7 - this.field508.field44 - (var20 + -1) * arg8 - this.field508.field58) / 2 + this.field508.field58 + arg14;
        } else if (arg12 == 2) {
            var21 = arg7 + arg14 - ((var20 - 1) * arg8) - this.field508.field44;
        } else {
            int var22 = (arg7 - this.field508.field44 - this.field508.field58 - ((var20 + -1) * arg8)) / (var20 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            arg8 += var22;
            var21 = this.field508.field58 + arg14 + var22;
        }
        for (int var23 = 0; var23 < var20; var23++) {
            if (arg13 == 0) {
                this.method250(arg11, arg2, class10.field159[var23], arg1, arg6, (byte) 116, arg3, var21, arg16);
            } else if (arg13 == 1) {
                this.method250((arg4 - this.field508.method45(class10.field159[var23], (byte) -69)) / 2 + arg11, arg2, class10.field159[var23], arg1, arg6, (byte) 126, arg3, var21, arg16);
            } else if (arg13 == 2) {
                this.method250(arg4 + arg11 - this.field508.method45(class10.field159[var23], (byte) -49), arg2, class10.field159[var23], arg1, arg6, (byte) 122, arg3, var21, arg16);
            } else if ((var20 - 1) == var23) {
                this.method250(arg11, arg2, class10.field159[var23], arg1, arg6, (byte) 120, arg3, var21, arg16);
            } else {
                this.method242(60, class10.field159[var23], arg4);
                this.method250(arg11, arg2, class10.field159[var23], arg1, arg6, (byte) 127, arg3, var21, arg16);
                class486.field7131 = 0;
            }
            var21 += arg8;
        }
        return var20;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Lse;)V", line = 439)
    public class33(class496 arg0, class4 arg1) {
        this.field508 = arg1;
        this.field514 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII[IILea;I[Lf;IILjava/lang/String;II)I", line = 448)
    public final int method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, class15 arg8, int arg9, class191[] arg10, int arg11, int arg12, String arg13, int arg14, int arg15) {
        if (arg7 != 0) {
            field522 = null;
        }
        field519++;
        return this.method244(arg1, arg2, arg6, arg10, arg14, (byte) 87, arg8, arg0, arg15, 0, arg9, arg12, arg5, arg4, arg11, arg13, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 459)
    private final void method246(int arg0, String arg1) {
        if (arg0 > -2) {
            this.method254(10, 112, 94, null, 108, -50, false, 23);
        }
        field503++;
        try {
            if (arg1.startsWith("col=")) {
                class391.field5948 = class391.field5948 & 0xFF000000 | class192.method1349(16, arg1.substring(4), 104) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class391.field5948 = class507.field7547 & 0xFFFFFF | class391.field5948 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class391.field5948 = class192.method1349(16, arg1.substring(5), 80);
            } else if (arg1.equals("/argb")) {
                class391.field5948 = class507.field7547;
            } else if (arg1.startsWith("str=")) {
                class189.field2649 = class192.method1349(16, arg1.substring(4), 103) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class189.field2649 = -8388608;
            } else if (arg1.equals("/str")) {
                class189.field2649 = -1;
            } else if (arg1.startsWith("u=")) {
                class120.field1697 = class192.method1349(16, arg1.substring(2), 88) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class120.field1697 = -16777216;
            } else if (arg1.equals("/u")) {
                class120.field1697 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class427.field6354 = 0;
            } else if (arg1.startsWith("shad=")) {
                class427.field6354 = class192.method1349(16, arg1.substring(5), 106) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class427.field6354 = -16777216;
            } else if (arg1.equals("/shad")) {
                class427.field6354 = class370.field5687;
            } else if (arg1.equals("br")) {
                this.method237(true, class507.field7547, class370.field5687);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 532)
    public static final void method247(int arg0) {
        field511++;
        class143.field2068.method1015((byte) 81);
        int var1 = 55 % (-arg0 / 41);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;II[IIIII[Lf;II[ILjava/util/Random;I)I", line = 544)
    public final int method248(int arg0, String arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, class191[] arg9, int arg10, int arg11, int[] arg12, Random arg13, int arg14) {
        field509++;
        if (arg1 == null) {
            return 0;
        }
        arg13.setSeed((long) arg0);
        int var16 = (arg13.nextInt() & 0x1F) + 192;
        this.method237(true, var16 << 24 | arg6 & 0xFFFFFF, var16 << 24 | arg7 & 0xFFFFFF);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg13.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg11;
        int var22 = this.field508.field58 + arg14;
        if (arg2 == 1) {
            var22 += (arg3 - this.field508.field58 - this.field508.field44) / 2;
        } else if (arg2 == 2) {
            var22 = arg3 + arg14 - this.field508.field44;
        }
        int var23 = arg5;
        if (arg10 == 1) {
            var23 = this.field508.method45(arg1, (byte) -51) + var19;
            var21 = (arg8 - var23) / 2 + arg11;
        } else if (arg10 == 2) {
            var23 = var19 + this.field508.method45(arg1, (byte) -105);
            var21 = arg8 + arg11 - var23;
        }
        this.method236(arg9, arg12, 34, var21, arg1, var18, var22, null);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field508.method45(arg1, (byte) -77);
            }
            arg4[3] = this.field508.field58 + this.field508.field44;
            arg4[2] = var23;
            arg4[1] = var22 - this.field508.field58;
            arg4[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[ILjava/lang/String;ILea;B[Lf;II)V", line = 623)
    private final void method250(int arg0, int[] arg1, String arg2, int arg3, class15 arg4, byte arg5, class191[] arg6, int arg7, int arg8) {
        int var10 = arg7 - this.field508.field53;
        field520++;
        if (arg5 < 115) {
            this.method240(-87, 52, null, 60, (byte) 78, -13);
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class227.method1559((byte) -79, arg2.charAt(var14)) & 0xFF);
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
                                    int var17 = class188.method1320(var16.substring(4), 12);
                                    class191 var18 = arg6[var17];
                                    int var19 = arg1 == null ? var18.method219() : arg1[var17];
                                    if ((class391.field5948 & 0xFF000000) == -16777216) {
                                        var18.method32(arg0, var10 + this.field508.field53 - var19, 1, 0, 1);
                                    } else {
                                        var18.method32(arg0, var10 + this.field508.field53 - var19, 0, class391.field5948 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg0 += arg6[var17].method209();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method246(-58, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field508.method39(var15, var12, 110);
                    }
                    if (var15 == ' ') {
                        if (class486.field7131 > 0) {
                            class35.field547 += class486.field7131;
                            arg0 += class35.field547 >> 8;
                            class35.field547 &= 0xFF;
                        }
                    } else if (arg4 == null) {
                        if ((class427.field6354 & 0xFF000000) != 0) {
                            this.method249(var15, arg0 + 1, var10 + 1, class427.field6354, true);
                        }
                        this.method249(var15, arg0, var10, class391.field5948, false);
                    } else {
                        if ((class427.field6354 & 0xFF000000) != 0) {
                            this.method243(var15, arg0 + 1, var10 + 1, class427.field6354, true, arg4, arg8, arg3);
                        }
                        this.method243(var15, arg0, var10, class391.field5948, false, arg4, arg8, arg3);
                    }
                    int var20 = this.field508.method40(var15, (byte) 105);
                    if (class189.field2649 != -1) {
                        this.field514.method2947(arg0, class189.field2649, (int) ((double) this.field508.field53 * 0.7D) + var10, (byte) 95, var20);
                    }
                    if (class120.field1697 != -1) {
                        this.field514.method2947(arg0, class120.field1697, var10 + this.field508.field53 + 1, (byte) 86, var20);
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;BIIII)V", line = 773)
    public final void method251(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field516++;
        if (arg1 == null) {
            return;
        }
        this.method237(true, arg3, arg6);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg2 != 40) {
            return;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method236(null, null, 69, arg4 - (this.field508.method45(arg1, (byte) -97) / 2), arg1, var9, arg5, var10);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I[III[Lf;ILjava/util/Random;II)I", line = 804)
    public final int method252(String arg0, int arg1, int[] arg2, int arg3, int arg4, class191[] arg5, int arg6, Random arg7, int arg8, int arg9) {
        field518++;
        if (arg0 == null) {
            return 0;
        }
        arg7.setSeed((long) arg8);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method237(true, arg4 & 0xFFFFFF | var11 << 24, var11 << 24 | arg3 & 0xFFFFFF);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 0;
        if (arg9 >= -64) {
            field522 = null;
        }
        while (var15 < var12) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
            var15++;
        }
        this.method236(arg5, arg2, 27, arg6, arg0, var13, arg1, null);
        return var14;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 841)
    public static void method253(int arg0) {
        field525 = null;
        field502 = null;
        field515 = null;
        field522 = null;
        if (arg0 != 1) {
            field522 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/String;IIZI)V", line = 857)
    public final void method254(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field505++;
        if (arg3 == null) {
            return;
        }
        this.method237(arg6, arg0, arg5);
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg3.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method236(null, null, 47, arg1 - (this.field508.method45(arg3, (byte) -65) / 2), arg3, null, arg7, var12);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method243(char arg0, int arg1, int arg2, int arg3, boolean arg4, class15 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method249(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
