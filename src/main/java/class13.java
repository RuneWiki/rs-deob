import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EDIBXOXE")
public class class13 extends class45 {

    @OriginalMember(owner = "client!EDIBXOXE", name = "w", descriptor = "Z")
    private boolean field662 = false;

    @OriginalMember(owner = "client!EDIBXOXE", name = "x", descriptor = "Z")
    private boolean field663 = false;

    @OriginalMember(owner = "client!EDIBXOXE", name = "y", descriptor = "Z")
    private boolean field664 = true;

    @OriginalMember(owner = "client!EDIBXOXE", name = "z", descriptor = "Z")
    private boolean field665 = true;

    @OriginalMember(owner = "client!EDIBXOXE", name = "B", descriptor = "[[B")
    public byte[][] field667 = new byte[256][];

    @OriginalMember(owner = "client!EDIBXOXE", name = "C", descriptor = "[I")
    public int[] field668 = new int[256];

    @OriginalMember(owner = "client!EDIBXOXE", name = "D", descriptor = "[I")
    public int[] field669 = new int[256];

    @OriginalMember(owner = "client!EDIBXOXE", name = "E", descriptor = "[I")
    public int[] field670 = new int[256];

    @OriginalMember(owner = "client!EDIBXOXE", name = "F", descriptor = "[I")
    public int[] field671 = new int[256];

    @OriginalMember(owner = "client!EDIBXOXE", name = "G", descriptor = "[I")
    public int[] field672 = new int[256];

    @OriginalMember(owner = "client!EDIBXOXE", name = "I", descriptor = "Ljava/util/Random;")
    public Random field674 = new Random();

    @OriginalMember(owner = "client!EDIBXOXE", name = "J", descriptor = "Z")
    public boolean field675 = false;

    @OriginalMember(owner = "client!EDIBXOXE", name = "H", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!EDIBXOXE", name = "A", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!EDIBXOXE", name = "<init>", descriptor = "(LFXNTEMPE;ILjava/lang/String;Z)V")
    public class13(class18 arg0, int arg1, String arg2, boolean arg3) {
        class50 var5 = new class50(arg0.method212(arg2 + ".dat", null), -46859);
        if (arg1 != -20267) {
            throw new NullPointerException();
        }
        class50 var6 = new class50(arg0.method212("index.dat", null), -46859);
        boolean var7 = true;
        var6.field1225 = var5.method390() + 4;
        int var8 = var6.method388();
        if (var8 > 0) {
            var6.field1225 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field670[var9] = var6.method388();
            this.field671[var9] = var6.method388();
            int var11 = this.field668[var9] = var6.method390();
            int var12 = this.field669[var9] = var6.method390();
            int var13 = var6.method388();
            int var14 = var11 * var12;
            this.field667[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field667[var9][var15] = var5.method389();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field667[var9][var11 * var17 + var16] = var5.method389();
                    }
                }
            }
            if (var12 > this.field673 && var9 < 128) {
                this.field673 = var12;
            }
            this.field670[var9] = 1;
            this.field672[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field667[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field672[var9]--;
                this.field670[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field667[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field672[var9]--;
            }
        }
        if (arg3) {
            this.field672[32] = this.field672[73];
        } else {
            this.field672[32] = this.field672[105];
            if (class8.field113) {
            }
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method178(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method183(arg3 - this.method182(162, arg1), (byte) 0, arg2, arg4, arg1);
        if (arg0 != -44393) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method179(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg0 != -35070) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method183(arg2 - this.method182(162, arg4) / 2, (byte) 0, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ZILjava/lang/String;III)V")
    public void method180(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 3) {
            this.field663 = !this.field663;
        }
        this.method187(arg5 - this.method181(0, arg2) / 2, arg2, -129, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method181(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field672[arg1.charAt(var4)];
            }
        }
        if (arg0 == 0) {
            return var3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method182(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 10 / arg0;
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            var3 += this.field672[arg1.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IBIILjava/lang/String;)V")
    public void method183(int arg0, byte arg1, int arg2, int arg3, String arg4) {
        if (arg1 != 0) {
            this.field663 = !this.field663;
        }
        if (arg4 == null) {
            return;
        }
        int var6 = arg3 - this.field673;
        for (int var7 = 0; var7 < arg4.length(); var7++) {
            char var8 = arg4.charAt(var7);
            if (var8 != ' ') {
                this.method190(this.field667[var8], this.field670[var8] + arg0, this.field671[var8] + var6, this.field668[var8], this.field669[var8], arg2);
            }
            arg0 += this.field672[var8];
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public void method184(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg5 - this.method182(162, arg0) / 2;
        if (!arg4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg1 - this.field673;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method190(this.field667[var11], this.field670[var11] + var7, this.field671[var11] + var9 + (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field668[var11], this.field669[var11], arg2);
            }
            var7 += this.field672[var11];
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "b", descriptor = "(ZILjava/lang/String;III)V")
    public void method185(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg3 - this.method182(162, arg2) / 2;
        int var8 = arg5 - this.field673;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var11 = arg2.charAt(var9);
            if (var11 != ' ') {
                this.method190(this.field667[var11], this.field670[var11] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field671[var11] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field668[var11], this.field669[var11], arg4);
            }
            var7 += this.field672[var11];
        }
        if (!arg0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method186(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method182(162, arg3) / 2;
        int var11 = arg2 - this.field673;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method190(this.field667[var13], this.field670[var13] + var10, this.field671[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg1) * var8), this.field668[var13], this.field669[var13], arg4);
            }
            var10 += this.field672[var13];
        }
        if (arg6 != 4410) {
            this.field662 = !this.field662;
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
    public void method187(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field675 = false;
        int var7 = arg0;
        if (arg1 == null) {
            return;
        }
        int var8 = arg5 - this.field673;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
                int var10 = this.method189(arg1.substring(var9 + 1, var9 + 4), 513);
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg1.charAt(var9);
                if (var11 != ' ') {
                    if (arg4) {
                        this.method190(this.field667[var11], this.field670[var11] + arg0 + 1, this.field671[var11] + var8 + 1, this.field668[var11], this.field669[var11], 0);
                    }
                    this.method190(this.field667[var11], this.field670[var11] + arg0, this.field671[var11] + var8, this.field668[var11], this.field669[var11], arg3);
                }
                arg0 += this.field672[var11];
            }
        }
        while (arg2 >= 0) {
            this.field665 = !this.field665;
        }
        if (this.field675) {
            class45.method347((int) ((double) this.field673 * 0.7D) + var8, 160, 8388608, var7, arg0 - var7);
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ZIZIILjava/lang/String;I)V")
    public void method188(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg0) {
            this.field666 = -479;
        }
        if (arg5 == null) {
            return;
        }
        this.field674.setSeed((long) arg6);
        int var8 = (this.field674.nextInt() & 0x1F) + 192;
        int var9 = arg1 - this.field673;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method189(arg5.substring(var10 + 1, var10 + 4), 513);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method192(false, this.field667[var12], 0, this.field668[var12], this.field670[var12] + arg3 + 1, this.field669[var12], 192, this.field671[var12] + var9 + 1);
                    }
                    this.method192(false, this.field667[var12], arg4, this.field668[var12], this.field670[var12] + arg3, this.field669[var12], var8, this.field671[var12] + var9);
                }
                arg3 += this.field672[var12];
                if ((this.field674.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method189(String arg0, int arg1) {
        int var3 = 38 / arg1;
        if (arg0.equals("red")) {
            return 16711680;
        } else if (arg0.equals("gre")) {
            return 65280;
        } else if (arg0.equals("blu")) {
            return 255;
        } else if (arg0.equals("yel")) {
            return 16776960;
        } else if (arg0.equals("cya")) {
            return 65535;
        } else if (arg0.equals("mag")) {
            return 16711935;
        } else if (arg0.equals("whi")) {
            return 16777215;
        } else if (arg0.equals("bla")) {
            return 0;
        } else if (arg0.equals("lre")) {
            return 16748608;
        } else if (arg0.equals("dre")) {
            return 8388608;
        } else if (arg0.equals("dbl")) {
            return 128;
        } else if (arg0.equals("or1")) {
            return 16756736;
        } else if (arg0.equals("or2")) {
            return 16740352;
        } else if (arg0.equals("or3")) {
            return 16723968;
        } else if (arg0.equals("gr1")) {
            return 12648192;
        } else if (arg0.equals("gr2")) {
            return 8453888;
        } else if (arg0.equals("gr3")) {
            return 4259584;
        } else {
            if (arg0.equals("str")) {
                this.field675 = true;
            }
            if (arg0.equals("end")) {
                this.field675 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "([BIIIII)V")
    private void method190(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class45.field1110 * arg2 + arg1;
        int var8 = class45.field1110 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class45.field1112) {
            int var11 = class45.field1112 - arg2;
            arg4 -= var11;
            arg2 = class45.field1112;
            var10 += arg3 * var11;
            var7 += class45.field1110 * var11;
        }
        if (arg2 + arg4 >= class45.field1113) {
            arg4 -= arg2 + arg4 + 1 - class45.field1113;
        }
        if (arg1 < class45.field1114) {
            int var12 = class45.field1114 - arg1;
            arg3 -= var12;
            arg1 = class45.field1114;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class45.field1115) {
            int var13 = arg1 + arg3 + 1 - class45.field1115;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method191(class45.field1109, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method191(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(Z[BIIIIII)V")
    private void method192(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class45.field1110 * arg7 + arg4;
        int var10 = class45.field1110 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (arg7 < class45.field1112) {
            int var14 = class45.field1112 - arg7;
            arg5 -= var14;
            arg7 = class45.field1112;
            var12 += arg3 * var14;
            var9 += class45.field1110 * var14;
        }
        if (arg5 + arg7 >= class45.field1113) {
            arg5 -= arg5 + arg7 + 1 - class45.field1113;
        }
        if (arg4 < class45.field1114) {
            int var15 = class45.field1114 - arg4;
            arg3 -= var15;
            arg4 = class45.field1114;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 + arg4 >= class45.field1115) {
            int var16 = arg3 + arg4 + 1 - class45.field1115;
            arg3 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg3 > 0 && arg5 > 0) {
            this.method193(arg5, var12, 0, var9, var11, var10, class45.field1109, arg2, arg3, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IIIIII[IIII[B)V")
    private void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        int var12 = ((arg7 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var13 = 256 - arg9;
        if (arg2 != 0) {
            return;
        }
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = -arg8; var15 < 0; var15++) {
                if (arg10[arg1++] == 0) {
                    arg3++;
                } else {
                    int var16 = arg6[arg3];
                    arg6[arg3++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg3 += arg5;
            arg1 += arg4;
        }
    }
}
