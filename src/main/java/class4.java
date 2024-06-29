import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AWMLZOXZ")
public class class4 extends class15 {

    @OriginalMember(owner = "client!AWMLZOXZ", name = "v", descriptor = "I")
    private int field64 = 3;

    @OriginalMember(owner = "client!AWMLZOXZ", name = "x", descriptor = "B")
    private byte field66 = 2;

    @OriginalMember(owner = "client!AWMLZOXZ", name = "y", descriptor = "Z")
    private boolean field67 = false;

    @OriginalMember(owner = "client!AWMLZOXZ", name = "z", descriptor = "[[B")
    public byte[][] field68 = new byte[256][];

    @OriginalMember(owner = "client!AWMLZOXZ", name = "A", descriptor = "[I")
    public int[] field69 = new int[256];

    @OriginalMember(owner = "client!AWMLZOXZ", name = "B", descriptor = "[I")
    public int[] field70 = new int[256];

    @OriginalMember(owner = "client!AWMLZOXZ", name = "C", descriptor = "[I")
    public int[] field71 = new int[256];

    @OriginalMember(owner = "client!AWMLZOXZ", name = "D", descriptor = "[I")
    public int[] field72 = new int[256];

    @OriginalMember(owner = "client!AWMLZOXZ", name = "E", descriptor = "[I")
    public int[] field73 = new int[256];

    @OriginalMember(owner = "client!AWMLZOXZ", name = "G", descriptor = "Ljava/util/Random;")
    public Random field75 = new Random();

    @OriginalMember(owner = "client!AWMLZOXZ", name = "H", descriptor = "Z")
    public boolean field76 = false;

    @OriginalMember(owner = "client!AWMLZOXZ", name = "F", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!AWMLZOXZ", name = "w", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!AWMLZOXZ", name = "<init>", descriptor = "(Ljava/lang/String;LIEMHZJLX;ZZ)V")
    public class4(String arg0, class23 arg1, boolean arg2, boolean arg3) {
        class38 var5 = new class38(0, arg1.method242(arg0 + ".dat", null));
        class38 var6 = new class38(0, arg1.method242("index.dat", null));
        boolean var7 = true;
        if (!arg2) {
            this.field64 = 157;
        }
        var6.field1161 = var5.method359() + 4;
        int var8 = var6.method357();
        if (var8 > 0) {
            var6.field1161 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field71[var9] = var6.method357();
            this.field72[var9] = var6.method357();
            int var11 = this.field69[var9] = var6.method359();
            int var12 = this.field70[var9] = var6.method359();
            int var13 = var6.method357();
            int var14 = var11 * var12;
            this.field68[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field68[var9][var15] = var5.method358();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field68[var9][var11 * var17 + var16] = var5.method358();
                    }
                }
            }
            if (var12 > this.field74 && var9 < 128) {
                this.field74 = var12;
            }
            this.field71[var9] = 1;
            this.field73[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field68[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field73[var9]--;
                this.field71[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field68[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field73[var9]--;
            }
        }
        if (arg3) {
            this.field73[32] = this.field73[73];
        } else {
            this.field73[32] = this.field73[105];
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
    public void method17(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
        this.method22((byte) 6, arg3, arg2, arg0 - this.method21(arg2, 0), arg1);
        if (arg4) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method18(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method22((byte) 6, arg2, arg1, arg3 - this.method21(arg1, 0) / 2, arg0);
        if (this.field65 == arg4) {
            ;
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
    public void method19(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == 0) {
            this.method26(arg5 - this.method20(0, arg0) / 2, -968, arg2, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method20(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field65 = -422;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field73[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method21(String arg0, int arg1) {
        if (arg1 != 0) {
            return this.field65;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field73[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(BILjava/lang/String;II)V")
    public void method22(byte arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg1 - this.field74;
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var9 = arg2.charAt(var7);
            if (var9 != ' ') {
                this.method29(this.field68[var9], this.field71[var9] + arg3, this.field72[var9] + var6, this.field69[var9], this.field70[var9], arg4);
            }
            arg3 += this.field73[var9];
        }
        if (arg0 == 6) {
            boolean var8 = false;
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method23(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg0 - this.method21(arg1, 0) / 2;
        int var8 = arg4 - this.field74;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var11 = arg1.charAt(var9);
            if (var11 != ' ') {
                this.method29(this.field68[var11], this.field71[var11] + var7, this.field72[var11] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field69[var11], this.field70[var11], arg2);
            }
            var7 += this.field73[var11];
        }
        if (arg3 < 0 || arg3 > 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(BIIIILjava/lang/String;)V")
    public void method24(byte arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method21(arg5, 0) / 2;
        if (arg0 != -114) {
            this.field64 = 353;
        }
        int var8 = arg2 - this.field74;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method29(this.field68[var10], this.field71[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field72[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field69[var10], this.field70[var10], arg4);
            }
            var7 += this.field73[var10];
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IZIIILjava/lang/String;I)V")
    public void method25(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (!arg1) {
            return;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method21(arg5, 0) / 2;
        int var11 = arg0 - this.field74;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method29(this.field68[var13], this.field71[var13] + var10, this.field72[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg3) * var8), this.field69[var13], this.field70[var13], arg6);
            }
            var10 += this.field73[var13];
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
    public void method26(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5) {
        this.field76 = false;
        int var7 = arg0;
        if (arg4 == null) {
            return;
        }
        int var8 = arg2 - this.field74;
        if (arg1 >= 0) {
            return;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method28((byte) 6, arg4.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method29(this.field68[var11], this.field71[var11] + arg0 + 1, this.field72[var11] + var8 + 1, this.field69[var11], this.field70[var11], 0);
                    }
                    this.method29(this.field68[var11], this.field71[var11] + arg0, this.field72[var11] + var8, this.field69[var11], this.field70[var11], arg5);
                }
                arg0 += this.field73[var11];
            }
        }
        if (this.field76) {
            class15.method217(var7, (int) ((double) this.field74 * 0.7D) + var8, -368, 8388608, arg0 - var7);
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IILjava/lang/String;IZBI)V")
    public void method27(int arg0, int arg1, String arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        if (this.field66 == arg5) {
            boolean var8 = false;
        } else {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg2 == null) {
            return;
        }
        this.field75.setSeed((long) arg6);
        int var10 = (this.field75.nextInt() & 0x1F) + 192;
        int var11 = arg3 - this.field74;
        for (int var12 = 0; var12 < arg2.length(); var12++) {
            if (arg2.charAt(var12) == '@' && var12 + 4 < arg2.length() && arg2.charAt(var12 + 4) == '@') {
                int var13 = this.method28((byte) 6, arg2.substring(var12 + 1, var12 + 4));
                if (var13 != -1) {
                    arg0 = var13;
                }
                var12 += 4;
            } else {
                char var14 = arg2.charAt(var12);
                if (var14 != ' ') {
                    if (arg4) {
                        this.method31(192, this.field71[var14] + arg1 + 1, this.field69[var14], this.field70[var14], this.field68[var14], 0, 0, this.field72[var14] + var11 + 1);
                    }
                    this.method31(var10, this.field71[var14] + arg1, this.field69[var14], this.field70[var14], this.field68[var14], arg0, 0, this.field72[var14] + var11);
                }
                arg1 += this.field73[var14];
                if ((this.field75.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method28(byte arg0, String arg1) {
        if (arg0 != 6) {
            return 1;
        }
        boolean var3 = false;
        if (arg1.equals("red")) {
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
                this.field76 = true;
            }
            if (arg1.equals("end")) {
                this.field76 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "([BIIIII)V")
    private void method29(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class15.field723 * arg2 + arg1;
        int var8 = class15.field723 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class15.field725) {
            int var11 = class15.field725 - arg2;
            arg4 -= var11;
            arg2 = class15.field725;
            var10 += arg3 * var11;
            var7 += class15.field723 * var11;
        }
        if (arg2 + arg4 >= class15.field726) {
            arg4 -= arg2 + arg4 + 1 - class15.field726;
        }
        if (arg1 < class15.field727) {
            int var12 = class15.field727 - arg1;
            arg3 -= var12;
            arg1 = class15.field727;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class15.field728) {
            int var13 = arg1 + arg3 + 1 - class15.field728;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method30(class15.field722, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method30(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IIII[BIII)V")
    private void method31(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        int var9 = class15.field723 * arg7 + arg1;
        int var10 = class15.field723 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg7 < class15.field725) {
            int var13 = class15.field725 - arg7;
            arg3 -= var13;
            arg7 = class15.field725;
            var12 += arg2 * var13;
            var9 += class15.field723 * var13;
        }
        if (arg3 + arg7 >= class15.field726) {
            arg3 -= arg3 + arg7 + 1 - class15.field726;
        }
        if (arg1 < class15.field727) {
            int var14 = class15.field727 - arg1;
            arg2 -= var14;
            arg1 = class15.field727;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg2 >= class15.field728) {
            int var15 = arg1 + arg2 + 1 - class15.field728;
            arg2 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 > 0 && arg3 > 0) {
            this.method32(var9, arg5, var10, var11, var12, (byte) -65, arg0, arg2, arg3, arg4, class15.field722);
            if (arg6 != 0) {
                this.field67 = !this.field67;
            }
        }
    }

    @OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IIIIIBIII[B[I)V")
    private void method32(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, byte[] arg9, int[] arg10) {
        int var12 = ((arg1 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg6 & 0xFF0000) >> 8;
        int var13 = 256 - arg6;
        if (arg5 != -65) {
            this.field67 = !this.field67;
        }
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg9[arg4++] == 0) {
                    arg0++;
                } else {
                    int var16 = arg10[arg0];
                    arg10[arg0++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg2;
            arg4 += arg3;
        }
    }
}
