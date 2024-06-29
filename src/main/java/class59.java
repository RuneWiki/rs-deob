import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class59 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lha;")
    private class58 field598;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lur;")
    private class535 field600;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Ldh;")
    public static class320 field611 = new class320(83, 10);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[I")
    public static int[] field617 = new int[256];

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIBI)V")
    public final void method441(int arg0, String arg1, int arg2, int arg3, byte arg4, int arg5) {
        field601++;
        if (arg4 == -47 && arg1 != null) {
            this.method446(arg0, arg3, 21559);
            this.method457(arg2, null, arg5 - this.field600.method3137((byte) -54, arg1), null, arg1, 0, 0, 44, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field607++;
        if (arg4 != null) {
            this.method446(arg3, arg1, 21559);
            this.method457(arg2, null, arg0, null, arg4, arg5, 0, arg5 ^ 0x52, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;III)V")
    public final void method443(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field612++;
        if (arg3 == null) {
            return;
        }
        this.method446(arg5, arg1, 21559);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        int var11 = 25 / ((arg0 - 28) / 61);
        this.method448(arg6 - this.field600.method3137((byte) -54, arg3) / 2, arg2, null, arg3, null, null, var9, true);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIII)V")
    public static final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 == 32) {
            field595++;
            for (int var6 = arg1; var6 <= arg4; var6++) {
                class223.method1297(class408.field5585[var6], arg2 ^ 0xFFFFFFD9, arg3, arg0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method445(int arg0) {
        int var1 = -125 % ((-arg0 - 10) / 58);
        field611 = null;
        field617 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
    private final void method446(int arg0, int arg1, int arg2) {
        class439.field6372 = 0;
        if (arg2 != 21559) {
            return;
        }
        field597++;
        class301.field3753 = arg0;
        class117.field1213 = arg0;
        class504.field7159 = -1;
        class520.field7396 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class102.field1061 = 0;
        class756.field10536 = arg1;
        class705.field9924 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method82(char arg0, int arg1, int arg2, int arg3, boolean arg4, class485 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/util/Random;ILjava/lang/String;IIIIII[I[Lhu;[III)I")
    public final int method447(int arg0, Random arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, class131[] arg11, int[] arg12, int arg13, int arg14) {
        field603++;
        if (arg3 == null) {
            return 0;
        } else if (arg0 <= 35) {
            return -21;
        } else {
            arg1.setSeed((long) arg2);
            int var16 = (arg1.nextInt() & 0x1F) + 192;
            this.method446(arg7 & 0xFFFFFF | var16 << 24, arg4 & 0xFFFFFF | var16 << 24, 21559);
            int var17 = arg3.length();
            int[] var18 = new int[var17];
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                var18[var20] = var19;
                if ((arg1.nextInt() & 0x3) == 0) {
                    var19++;
                }
            }
            int var21 = arg6;
            int var22 = arg13 + this.field600.field7741;
            if (arg8 == 1) {
                var22 += (arg9 - this.field600.field7741 - this.field600.field7728) / 2;
            } else if (arg8 == 2) {
                var22 = arg13 - (this.field600.field7728 - arg9);
            }
            int var23 = -1;
            if (arg5 == 1) {
                var23 = var19 + this.field600.method3137((byte) -54, arg3);
                var21 = (arg14 - var23) / 2 + arg6;
            } else if (arg5 == 2) {
                var23 = var19 + this.field600.method3137((byte) -54, arg3);
                var21 = arg14 + arg6 - var23;
            }
            this.method448(var21, var22, arg11, arg3, var18, arg10, null, true);
            if (arg12 != null) {
                if (var23 == -1) {
                    var23 = this.field600.method3137((byte) -54, arg3) + var19;
                }
                arg12[1] = var22 - this.field600.field7741;
                arg12[3] = this.field600.field7741 + this.field600.field7728;
                arg12[0] = var21;
                arg12[2] = var23;
            }
            return var19;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lhu;Ljava/lang/String;[I[I[IZ)V")
    private final void method448(int arg0, int arg1, class131[] arg2, String arg3, int[] arg4, int[] arg5, int[] arg6, boolean arg7) {
        field605++;
        int var9 = arg1 - this.field600.field7729;
        int var10 = -1;
        int var11 = -1;
        if (!arg7) {
            field611 = null;
        }
        int var12 = 0;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class628.method3601(arg3.charAt(var14), 1953684204) & 0xFF);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class219.method1282((byte) -47, var16.substring(4));
                                    class131 var20 = arg2[var19];
                                    int var21 = arg5 == null ? var20.method510() : arg5[var19];
                                    var20.method512(arg0 + var17, this.field600.field7729 + var9 + -var21 + var18, 1, 0, 1);
                                    arg0 += arg2[var19].method501();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method451(var16, -1);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field600.method3138(var15, var11, (byte) -101);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class705.field9924 & 0xFF000000) != 0) {
                            this.method80(var15, arg0 + var22 + 1, var9 + var23 + 1, class705.field9924, true);
                        }
                        this.method80(var15, arg0 + var22, var9 + var23, class117.field1213, false);
                    } else if (class439.field6372 > 0) {
                        class102.field1061 += class439.field6372;
                        arg0 += class102.field1061 >> 8;
                        class102.field1061 &= 0xFF;
                    }
                    int var24 = this.field600.method3144((byte) 102, var15);
                    if (class504.field7159 != -1) {
                        this.field598.method374(122, var24, arg0, var9 + ((int) ((double) this.field600.field7729 * 0.7D)), class504.field7159);
                    }
                    if (class520.field7396 != -1) {
                        this.field598.method374(120, var24, arg0, this.field600.field7729 + var9, class520.field7396);
                    }
                    var11 = var15;
                    arg0 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI[Lhu;IILjava/lang/String;IIIIILaa;I[III)I")
    public final int method449(int arg0, boolean arg1, int arg2, class131[] arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class485 arg12, int arg13, int[] arg14, int arg15, int arg16) {
        field610++;
        if (arg6 == null) {
            return 0;
        }
        this.method446(arg8, arg9, 21559);
        if (arg11 == 0) {
            arg11 = this.field600.field7729;
        }
        int[] var18;
        if (arg4 < this.field600.field7741 + arg11 + this.field600.field7728 && arg4 < arg11 + arg11) {
            var18 = null;
        } else {
            var18 = new int[] { arg16 };
        }
        int var19 = this.field600.method3142(class632.field9083, arg6, var18, arg3, 110);
        if (arg0 == -1) {
            arg0 = arg4 / arg11;
            if (arg0 <= 0) {
                arg0 = 1;
            }
        }
        if (arg1) {
            return -59;
        }
        if (arg0 > 0 && var19 >= arg0) {
            var19 = arg0;
            class632.field9083[arg0 - 1] = this.field600.method3140(arg3, class632.field9083[arg0 - 1], (byte) -125, arg16);
        }
        if (arg10 == 3 && var19 == 1) {
            arg10 = 1;
        }
        int var20;
        if (arg10 == 0) {
            var20 = this.field600.field7741 + arg7;
        } else if (arg10 == 1) {
            var20 = (arg4 - this.field600.field7741 - this.field600.field7728 - ((var19 - 1) * arg11)) / 2 + arg7 + this.field600.field7741;
        } else if (arg10 == 2) {
            var20 = arg4 + arg7 - ((var19 - 1) * arg11) - this.field600.field7728;
        } else {
            int var21 = (arg4 - (this.field600.field7741 + this.field600.field7728 + ((var19 + -1) * arg11))) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg7 + this.field600.field7741 + var21;
            arg11 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg5 == 0) {
                this.method457(var20, arg3, arg2, arg14, class632.field9083[var22], arg15, arg13, -116, arg12);
            } else if (arg5 == 1) {
                this.method457(var20, arg3, (arg16 - this.field600.method3137((byte) -54, class632.field9083[var22])) / 2 + arg2, arg14, class632.field9083[var22], arg15, arg13, 89, arg12);
            } else if (arg5 == 2) {
                this.method457(var20, arg3, arg2 - (this.field600.method3137((byte) -54, class632.field9083[var22]) - arg16), arg14, class632.field9083[var22], arg15, arg13, 33, arg12);
            } else if (var19 - 1 == var22) {
                this.method457(var20, arg3, arg2, arg14, class632.field9083[var22], arg15, arg13, -111, arg12);
            } else {
                this.method456(arg16, class632.field9083[var22], (byte) -88);
                this.method457(var20, arg3, arg2, arg14, class632.field9083[var22], arg15, arg13, -94, arg12);
                class439.field6372 = 0;
            }
            var20 += arg11;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lur;)V")
    public class59(class58 arg0, class535 arg1) {
        this.field598 = arg0;
        this.field600 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method450(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field613++;
        if (arg3 != null) {
            this.method446(arg1, arg0, arg2 ^ 0x5437);
            this.method457(arg5, null, arg4 - this.field600.method3137((byte) -54, arg3) / 2, null, arg3, 0, arg2, -115, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method451(String arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field608++;
        try {
            if (arg0.startsWith("col=")) {
                class117.field1213 = class117.field1213 & 0xFF000000 | class277.method1659(arg0.substring(4), (byte) 113, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class117.field1213 = class117.field1213 & 0xFF000000 | class301.field3753 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class117.field1213 = class277.method1659(arg0.substring(5), (byte) 115, 16);
            } else if (arg0.equals("/argb")) {
                class117.field1213 = class301.field3753;
            } else if (arg0.startsWith("str=")) {
                class504.field7159 = class117.field1213 & 0xFF000000 | class277.method1659(arg0.substring(4), (byte) 115, 16);
            } else if (arg0.equals("str")) {
                class504.field7159 = class117.field1213 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class504.field7159 = -1;
            } else if (arg0.startsWith("u=")) {
                class520.field7396 = class117.field1213 & 0xFF000000 | class277.method1659(arg0.substring(2), (byte) 108, 16);
            } else if (arg0.equals("u")) {
                class520.field7396 = class117.field1213 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class520.field7396 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class705.field9924 = 0;
            } else if (arg0.startsWith("shad=")) {
                class705.field9924 = class117.field1213 & 0xFF000000 | class277.method1659(arg0.substring(5), (byte) 123, 16);
            } else if (arg0.equals("shad")) {
                class705.field9924 = class117.field1213 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class705.field9924 = class756.field10536;
            } else if (arg0.equals("br")) {
                this.method446(class301.field3753, class756.field10536, 21559);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IILjava/lang/String;I[Lhu;BI)V")
    public final void method452(int arg0, int[] arg1, int arg2, String arg3, int arg4, class131[] arg5, byte arg6, int arg7) {
        field596++;
        if (arg3 != null) {
            int var9 = -11 % ((22 - arg6) / 60);
            this.method446(arg0, arg7, 21559);
            this.method457(arg2, arg5, arg4, arg1, arg3, 0, 0, 83, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;ILjava/util/Random;II[IIII[Lhu;)I")
    public final int method453(String arg0, int arg1, Random arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, class131[] arg9) {
        field616++;
        if (arg0 == null) {
            return 0;
        }
        arg2.setSeed((long) arg8);
        if (arg7 >= -123) {
            this.method459(-111, 43, null, null, 42, null, 62, -30, 8, -79, 49, 41, null, -84, -41, 8);
        }
        int var11 = (arg2.nextInt() & 0x1F) + 192;
        this.method446(arg4 & 0xFFFFFF | var11 << 24, var11 << 24 | arg3 & 0xFFFFFF, 21559);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg2.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method448(arg6, arg1, arg9, arg0, var13, arg5, null, true);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field615++;
        if (arg5 == null) {
            return;
        }
        this.method446(arg4, arg3, arg0 ^ 0x5432);
        int var8 = arg5.length();
        if (arg0 != 5) {
            field617 = null;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method448(arg2 - (this.field600.method3137((byte) -54, arg5) / 2), arg6, null, arg5, var9, null, var10, true);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Z")
    public static final boolean method455(byte arg0, int arg1) {
        field599++;
        if (arg0 < 9) {
            return false;
        } else if (arg1 == 20 || arg1 == 46 || arg1 == 10 || arg1 == 19 || arg1 == 1009) {
            return true;
        } else {
            return arg1 == 50 || arg1 == 1003;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)V")
    private final void method456(int arg0, String arg1, byte arg2) {
        field609++;
        int var4 = 0;
        if (arg2 != -88) {
            return;
        }
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
            class439.field6372 = (arg0 - this.field600.method3137((byte) -54, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lhu;I[ILjava/lang/String;IIILaa;)V")
    private final void method457(int arg0, class131[] arg1, int arg2, int[] arg3, String arg4, int arg5, int arg6, int arg7, class485 arg8) {
        int var10 = arg0 - this.field600.field7729;
        field606++;
        int var11 = -101 % ((-arg7 - 20) / 53);
        int var12 = -1;
        int var13 = -1;
        int var14 = arg4.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class628.method3601(arg4.charAt(var15), 1953684204) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg4.substring(var12 + 1, var15);
                    var12 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18 = class219.method1282((byte) -49, var17.substring(4));
                                    class131 var19 = arg1[var18];
                                    int var20 = arg3 == null ? var19.method510() : arg3[var18];
                                    if ((class117.field1213 & 0xFF000000) == -16777216) {
                                        var19.method512(arg2, this.field600.field7729 + var10 - var20, 1, 0, 1);
                                    } else {
                                        var19.method512(arg2, var10 + this.field600.field7729 - var20, 0, class117.field1213 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg2 += arg1[var18].method501();
                                    var13 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method451(var17, -1);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg2 += this.field600.method3138(var16, var13, (byte) -89);
                    }
                    if (var16 == ' ') {
                        if (class439.field6372 > 0) {
                            class102.field1061 += class439.field6372;
                            arg2 += class102.field1061 >> 8;
                            class102.field1061 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class705.field9924 & 0xFF000000) != 0) {
                            this.method80(var16, arg2 + 1, var10 - -1, class705.field9924, true);
                        }
                        this.method80(var16, arg2, var10, class117.field1213, false);
                    } else {
                        if ((class705.field9924 & 0xFF000000) != 0) {
                            this.method82(var16, arg2 + 1, var10 + 1, class705.field9924, true, arg8, arg6, arg5);
                        }
                        this.method82(var16, arg2, var10, class117.field1213, false, arg8, arg6, arg5);
                    }
                    int var21 = this.field600.method3144((byte) -84, var16);
                    if (class504.field7159 != -1) {
                        this.field598.method374(122, var21, arg2, (int) ((double) this.field600.field7729 * 0.7D) + var10, class504.field7159);
                    }
                    if (class520.field7396 != -1) {
                        this.field598.method374(127, var21, arg2, this.field600.field7729 + var10 + 1, class520.field7396);
                    }
                    arg2 += var21;
                    var13 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIIILjava/lang/String;)V")
    public final void method458(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field604++;
        if (arg7 == null) {
            return;
        }
        this.method446(arg3, arg1, 21559);
        double var9 = 7.0D - (double) arg4 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method448(arg2 - (this.field600.method3137((byte) -54, arg7) / 2), arg5, null, arg7, null, null, var12, arg0);
        if (!arg0) {
            field614 = 53;
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method80(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lhu;[IILaa;IIIIIILjava/lang/String;III)I")
    public final int method459(int arg0, int arg1, class131[] arg2, int[] arg3, int arg4, class485 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15) {
        if (arg15 != 0) {
            this.field598 = null;
        }
        field602++;
        return this.method449(0, false, arg9, arg2, arg13, arg1, arg12, arg14, arg8, arg0, arg6, arg11, arg5, arg10, arg3, arg7, arg4);
    }
}
