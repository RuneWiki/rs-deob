import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BTJUXBKR")
public class class4 extends class72 {

    @OriginalMember(owner = "client!BTJUXBKR", name = "z", descriptor = "I")
    private int field57 = 790;

    @OriginalMember(owner = "client!BTJUXBKR", name = "A", descriptor = "Z")
    private boolean field58 = false;

    @OriginalMember(owner = "client!BTJUXBKR", name = "B", descriptor = "I")
    private int field59 = -902;

    @OriginalMember(owner = "client!BTJUXBKR", name = "C", descriptor = "I")
    private int field60 = 7;

    @OriginalMember(owner = "client!BTJUXBKR", name = "D", descriptor = "I")
    private int field61 = -462;

    @OriginalMember(owner = "client!BTJUXBKR", name = "E", descriptor = "Z")
    private boolean field62 = true;

    @OriginalMember(owner = "client!BTJUXBKR", name = "F", descriptor = "[[B")
    public byte[][] field63 = new byte[256][];

    @OriginalMember(owner = "client!BTJUXBKR", name = "G", descriptor = "[I")
    public int[] field64 = new int[256];

    @OriginalMember(owner = "client!BTJUXBKR", name = "H", descriptor = "[I")
    public int[] field65 = new int[256];

    @OriginalMember(owner = "client!BTJUXBKR", name = "I", descriptor = "[I")
    public int[] field66 = new int[256];

    @OriginalMember(owner = "client!BTJUXBKR", name = "J", descriptor = "[I")
    public int[] field67 = new int[256];

    @OriginalMember(owner = "client!BTJUXBKR", name = "K", descriptor = "[I")
    public int[] field68 = new int[256];

    @OriginalMember(owner = "client!BTJUXBKR", name = "M", descriptor = "Ljava/util/Random;")
    public Random field70 = new Random();

    @OriginalMember(owner = "client!BTJUXBKR", name = "N", descriptor = "Z")
    public boolean field71 = false;

    @OriginalMember(owner = "client!BTJUXBKR", name = "L", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!BTJUXBKR", name = "<init>", descriptor = "(Ljava/lang/String;LRPFMUSNN;BZ)V")
    public class4(String arg0, class49 arg1, byte arg2, boolean arg3) {
        class63 var5 = new class63((byte) -58, arg1.method414(arg0 + ".dat", null));
        class63 var6 = new class63((byte) -58, arg1.method414("index.dat", null));
        boolean var7 = true;
        var6.field1571 = var5.method504() + 4;
        if (arg2 != -104) {
            throw new NullPointerException();
        }
        int var8 = var6.method502();
        if (var8 > 0) {
            var6.field1571 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field66[var9] = var6.method502();
            this.field67[var9] = var6.method502();
            int var11 = this.field64[var9] = var6.method504();
            int var12 = this.field65[var9] = var6.method504();
            int var13 = var6.method502();
            int var14 = var11 * var12;
            this.field63[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field63[var9][var15] = var5.method503();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field63[var9][var11 * var17 + var16] = var5.method503();
                    }
                }
            }
            if (var12 > this.field69 && var9 < 128) {
                this.field69 = var12;
            }
            this.field66[var9] = 1;
            this.field68[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field63[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field68[var9]--;
                this.field66[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field63[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field68[var9]--;
            }
        }
        if (arg3) {
            this.field68[32] = this.field68[73];
        } else {
            this.field68[32] = this.field68[105];
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method11(String arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method16(arg4 - this.method15(-162, arg0), arg1, arg0, arg3, this.field59);
        if (arg2 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method12(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method16(arg2 - this.method15(-162, arg1) / 2, arg3, arg1, arg0, this.field59);
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(Ljava/lang/String;ZIZII)V")
    public void method13(String arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.method20((byte) 1, arg3, arg2, arg5, arg4 - this.method14(this.field57, arg0) / 2, arg0);
        if (!arg1) {
            this.field62 = !this.field62;
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method14(int arg0, String arg1) {
        if (arg0 <= 0) {
            this.field58 = !this.field58;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field68[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method15(int arg0, String arg1) {
        if (arg0 >= 0) {
            return this.field59;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field68[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method16(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg3 - this.field69;
        if (arg4 >= 0) {
            return;
        }
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 != ' ') {
                this.method23(this.field63[var8], this.field66[var8] + arg0, this.field67[var8] + var6, this.field64[var8], this.field65[var8], arg1);
            }
            arg0 += this.field68[var8];
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method17(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg3 - this.method15(-162, arg1) / 2;
        int var8 = arg5 - this.field69;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method23(this.field63[var10], this.field66[var10] + var7, this.field67[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field64[var10], this.field65[var10], arg2);
            }
            var7 += this.field68[var10];
        }
        if (arg0 >= 0) {
            this.field58 = !this.field58;
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IIIBILjava/lang/String;)V")
    public void method18(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg0 - this.method15(-162, arg5) / 2;
        if (arg3 != 8) {
            this.field57 = -278;
        }
        int var8 = arg4 - this.field69;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method23(this.field63[var10], this.field66[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field67[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field64[var10], this.field65[var10], arg2);
            }
            var7 += this.field68[var10];
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public void method19(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        if (arg4 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method15(-162, arg4) / 2;
        int var11 = arg1 - this.field69;
        if (arg6 != 0) {
            this.field61 = -168;
        }
        for (int var12 = 0; var12 < arg4.length(); var12++) {
            char var13 = arg4.charAt(var12);
            if (var13 != ' ') {
                this.method23(this.field63[var13], this.field66[var13] + var10, this.field67[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg0) * var8), this.field64[var13], this.field65[var13], arg2);
            }
            var10 += this.field68[var13];
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(BZIIILjava/lang/String;)V")
    public void method20(byte arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5) {
        this.field71 = false;
        int var7 = arg4;
        if (arg5 == null) {
            return;
        }
        int var8 = arg2 - this.field69;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var12 = this.method22(354, arg5.substring(var9 + 1, var9 + 4));
                if (var12 != -1) {
                    arg3 = var12;
                }
                var9 += 4;
            } else {
                char var13 = arg5.charAt(var9);
                if (var13 != ' ') {
                    if (arg1) {
                        this.method23(this.field63[var13], this.field66[var13] + arg4 + 1, this.field67[var13] + var8 + 1, this.field64[var13], this.field65[var13], 0);
                    }
                    this.method23(this.field63[var13], this.field66[var13] + arg4, this.field67[var13] + var8, this.field64[var13], this.field65[var13], arg3);
                }
                arg4 += this.field68[var13];
            }
        }
        if (arg0 == 1) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (this.field71) {
            class72.method600(9916, (int) ((double) this.field69 * 0.7D) + var8, 8388608, arg4 - var7, var7);
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IBIZILjava/lang/String;I)V")
    public void method21(int arg0, byte arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        this.field70.setSeed((long) arg4);
        int var8 = (this.field70.nextInt() & 0x1F) + 192;
        int var9 = arg2 - this.field69;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method22(354, arg5.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg6 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method25(this.field67[var12] + var9 + 1, this.field60, this.field65[var12], this.field66[var12] + arg0 + 1, 192, 0, this.field64[var12], this.field63[var12]);
                    }
                    this.method25(this.field67[var12] + var9, this.field60, this.field65[var12], this.field66[var12] + arg0, var8, arg6, this.field64[var12], this.field63[var12]);
                }
                arg0 += this.field68[var12];
                if ((this.field70.nextInt() & 0x3) == 0) {
                    arg0++;
                }
            }
        }
        if (arg1 != 1) {
            this.field58 = !this.field58;
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "c", descriptor = "(ILjava/lang/String;)I")
    public int method22(int arg0, String arg1) {
        if (arg0 <= 0) {
            return this.field59;
        } else if (arg1.equals("red")) {
            return 16711680;
        } else if (arg1.equals("gre")) {
            return 65280;
        } else if (arg1.equals("blu")) {
            return 255;
        } else if (arg1.equals("yel")) {
            return 16776960;
        } else if (arg1.equals("cya")) {
            return 65535;
        } else if (arg1.equals("mag")) {
            return 16711935;
        } else if (arg1.equals("whi")) {
            return 16777215;
        } else if (arg1.equals("bla")) {
            return 0;
        } else if (arg1.equals("lre")) {
            return 16748608;
        } else if (arg1.equals("dre")) {
            return 8388608;
        } else if (arg1.equals("dbl")) {
            return 128;
        } else if (arg1.equals("or1")) {
            return 16756736;
        } else if (arg1.equals("or2")) {
            return 16740352;
        } else if (arg1.equals("or3")) {
            return 16723968;
        } else if (arg1.equals("gr1")) {
            return 12648192;
        } else if (arg1.equals("gr2")) {
            return 8453888;
        } else if (arg1.equals("gr3")) {
            return 4259584;
        } else {
            if (arg1.equals("str")) {
                this.field71 = true;
            }
            if (arg1.equals("end")) {
                this.field71 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "([BIIIII)V")
    private void method23(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class72.field1731 * arg2 + arg1;
        int var8 = class72.field1731 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class72.field1733) {
            int var11 = class72.field1733 - arg2;
            arg4 -= var11;
            arg2 = class72.field1733;
            var10 += arg3 * var11;
            var7 += class72.field1731 * var11;
        }
        if (arg2 + arg4 >= class72.field1734) {
            arg4 -= arg2 + arg4 + 1 - class72.field1734;
        }
        if (arg1 < class72.field1735) {
            int var12 = class72.field1735 - arg1;
            arg3 -= var12;
            arg1 = class72.field1735;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class72.field1736) {
            int var13 = arg1 + arg3 + 1 - class72.field1736;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method24(class72.field1730, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method24(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IIIIIII[B)V")
    private void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        int var9 = class72.field1731 * arg0 + arg3;
        int var10 = class72.field1731 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg1 != 7) {
            return;
        }
        if (arg0 < class72.field1733) {
            int var13 = class72.field1733 - arg0;
            arg2 -= var13;
            arg0 = class72.field1733;
            var12 += arg6 * var13;
            var9 += class72.field1731 * var13;
        }
        if (arg0 + arg2 >= class72.field1734) {
            arg2 -= arg0 + arg2 + 1 - class72.field1734;
        }
        if (arg3 < class72.field1735) {
            int var14 = class72.field1735 - arg3;
            arg6 -= var14;
            arg3 = class72.field1735;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg6 >= class72.field1736) {
            int var15 = arg3 + arg6 + 1 - class72.field1736;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg2 > 0) {
            this.method26((byte) 4, var9, class72.field1730, arg5, arg4, var11, var12, var10, arg6, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(BI[IIIIIII[BI)V")
    private void method26(byte arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        int var13 = 256 - arg4;
        if (arg0 == 4) {
            boolean var14 = false;
        } else {
            this.field58 = !this.field58;
        }
        for (int var15 = -arg10; var15 < 0; var15++) {
            for (int var16 = -arg8; var16 < 0; var16++) {
                if (arg9[arg6++] == 0) {
                    arg1++;
                } else {
                    int var17 = arg2[arg1];
                    arg2[arg1++] = (((var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var17 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg7;
            arg6 += arg5;
        }
    }
}
