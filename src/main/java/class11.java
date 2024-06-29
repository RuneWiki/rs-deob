import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CWXRTTYV")
public class class11 extends class6 {

    @OriginalMember(owner = "client!CWXRTTYV", name = "y", descriptor = "I")
    private int field659 = 536;

    @OriginalMember(owner = "client!CWXRTTYV", name = "z", descriptor = "I")
    private int field660 = -400;

    @OriginalMember(owner = "client!CWXRTTYV", name = "A", descriptor = "I")
    private int field661 = -703;

    @OriginalMember(owner = "client!CWXRTTYV", name = "B", descriptor = "I")
    private int field662 = -12929;

    @OriginalMember(owner = "client!CWXRTTYV", name = "C", descriptor = "I")
    private int field663 = 7;

    @OriginalMember(owner = "client!CWXRTTYV", name = "D", descriptor = "Z")
    private boolean field664 = false;

    @OriginalMember(owner = "client!CWXRTTYV", name = "E", descriptor = "Z")
    private boolean field665 = false;

    @OriginalMember(owner = "client!CWXRTTYV", name = "F", descriptor = "Z")
    private boolean field666 = false;

    @OriginalMember(owner = "client!CWXRTTYV", name = "G", descriptor = "[[B")
    public byte[][] field667 = new byte[256][];

    @OriginalMember(owner = "client!CWXRTTYV", name = "H", descriptor = "[I")
    public int[] field668 = new int[256];

    @OriginalMember(owner = "client!CWXRTTYV", name = "I", descriptor = "[I")
    public int[] field669 = new int[256];

    @OriginalMember(owner = "client!CWXRTTYV", name = "J", descriptor = "[I")
    public int[] field670 = new int[256];

    @OriginalMember(owner = "client!CWXRTTYV", name = "K", descriptor = "[I")
    public int[] field671 = new int[256];

    @OriginalMember(owner = "client!CWXRTTYV", name = "L", descriptor = "[I")
    public int[] field672 = new int[256];

    @OriginalMember(owner = "client!CWXRTTYV", name = "N", descriptor = "Ljava/util/Random;")
    public Random field674 = new Random();

    @OriginalMember(owner = "client!CWXRTTYV", name = "O", descriptor = "Z")
    public boolean field675 = false;

    @OriginalMember(owner = "client!CWXRTTYV", name = "M", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!CWXRTTYV", name = "<init>", descriptor = "(ZLjava/lang/String;ZLUUIGNTAD;)V")
    public class11(boolean arg0, String arg1, boolean arg2, class59 arg3) {
        class10 var5 = new class10(arg3.method545(arg1 + ".dat", null), this.field659);
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        class10 var7 = new class10(arg3.method545("index.dat", null), this.field659);
        boolean var8 = true;
        var7.field646 = var5.method196() + 4;
        int var9 = var7.method194();
        if (var9 > 0) {
            var7.field646 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field670[var10] = var7.method194();
            this.field671[var10] = var7.method194();
            int var12 = this.field668[var10] = var7.method196();
            int var13 = this.field669[var10] = var7.method196();
            int var14 = var7.method194();
            int var15 = var12 * var13;
            this.field667[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field667[var10][var16] = var5.method195();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field667[var10][var12 * var18 + var17] = var5.method195();
                    }
                }
            }
            if (var13 > this.field673 && var10 < 128) {
                this.field673 = var13;
            }
            this.field670[var10] = 1;
            this.field672[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field667[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field672[var10]--;
                this.field670[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field667[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field672[var10]--;
            }
        }
        if (arg0) {
            this.field672[32] = this.field672[73];
        } else {
            this.field672[32] = this.field672[105];
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIBLjava/lang/String;)V")
    public void method231(int arg0, int arg1, int arg2, byte arg3, String arg4) {
        this.method236(arg2 - this.method235((byte) -120, arg4), false, arg0, arg4, arg1);
        if (arg3 != 25) {
            this.field661 = -110;
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIZILjava/lang/String;)V")
    public void method232(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
        this.method236(arg1 - this.method235((byte) -120, arg4) / 2, false, arg0, arg4, arg3);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIZILjava/lang/String;Z)V")
    public void method233(int arg0, int arg1, boolean arg2, int arg3, String arg4, boolean arg5) {
        if (arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method240(0, arg3 - this.method234(arg4, (byte) -86) / 2, arg0, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method234(String arg0, byte arg1) {
        if (arg1 != -86) {
            this.field663 = -95;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field672[arg0.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method235(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 != -120) {
            this.field659 = -4;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field672[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IZILjava/lang/String;I)V")
    public void method236(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg4 - this.field673;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            char var8 = arg3.charAt(var7);
            if (var8 != ' ') {
                this.method243(this.field667[var8], this.field670[var8] + arg0, this.field671[var8] + var6, this.field668[var8], this.field669[var8], arg2);
            }
            arg0 += this.field672[var8];
        }
        if (arg1) {
            this.field664 = !this.field664;
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method237(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg0 - this.method235((byte) -120, arg4) / 2;
        if (arg3 != -47669) {
            return;
        }
        int var8 = arg5 - this.field673;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method243(this.field667[var10], this.field670[var10] + var7, this.field671[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field668[var10], this.field669[var10], arg2);
            }
            var7 += this.field672[var10];
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method238(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg1 - this.method235((byte) -120, arg5) / 2;
        if (arg2 != -38706) {
            return;
        }
        int var8 = arg4 - this.field673;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method243(this.field667[var10], this.field670[var10] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field671[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field668[var10], this.field669[var10], arg3);
            }
            var7 += this.field672[var10];
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (this.field662 != arg5) {
            this.field659 = -405;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg1 - this.method235((byte) -120, arg6) / 2;
        int var11 = arg2 - this.field673;
        for (int var12 = 0; var12 < arg6.length(); var12++) {
            char var13 = arg6.charAt(var12);
            if (var13 != ' ') {
                this.method243(this.field667[var13], this.field670[var13] + var10, this.field671[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg3) * var8), this.field668[var13], this.field669[var13], arg0);
            }
            var10 += this.field672[var13];
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
    public void method240(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5) {
        if (arg0 != 0) {
            this.field665 = !this.field665;
        }
        this.field675 = false;
        int var7 = arg1;
        if (arg4 == null) {
            return;
        }
        int var8 = arg2 - this.field673;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method242(0, arg4.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method243(this.field667[var11], this.field670[var11] + arg1 + 1, this.field671[var11] + var8 + 1, this.field668[var11], this.field669[var11], 0);
                    }
                    this.method243(this.field667[var11], this.field670[var11] + arg1, this.field671[var11] + var8, this.field668[var11], this.field669[var11], arg5);
                }
                arg1 += this.field672[var11];
            }
        }
        if (this.field675) {
            class6.method25(arg1 - var7, var7, 8388608, 31754, (int) ((double) this.field673 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
    public void method241(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == null) {
            return;
        }
        this.field674.setSeed((long) arg2);
        if (arg5 < 2 || arg5 > 2) {
            this.field666 = !this.field666;
        }
        int var8 = (this.field674.nextInt() & 0x1F) + 192;
        int var9 = arg0 - this.field673;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method242(0, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method245(0, this.field668[var12], this.field671[var12] + var9 + 1, this.field669[var12], 192, this.field667[var12], -812, this.field670[var12] + arg3 + 1);
                    }
                    this.method245(arg4, this.field668[var12], this.field671[var12] + var9, this.field669[var12], var8, this.field667[var12], -812, this.field670[var12] + arg3);
                }
                arg3 += this.field672[var12];
                if ((this.field674.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method242(int arg0, String arg1) {
        if (arg0 != 0) {
            return this.field660;
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
                this.field675 = true;
            }
            if (arg1.equals("end")) {
                this.field675 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "([BIIIII)V")
    private void method243(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class6.field49 * arg2 + arg1;
        int var8 = class6.field49 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class6.field51) {
            int var11 = class6.field51 - arg2;
            arg4 -= var11;
            arg2 = class6.field51;
            var10 += arg3 * var11;
            var7 += class6.field49 * var11;
        }
        if (arg2 + arg4 >= class6.field52) {
            arg4 -= arg2 + arg4 + 1 - class6.field52;
        }
        if (arg1 < class6.field53) {
            int var12 = class6.field53 - arg1;
            arg3 -= var12;
            arg1 = class6.field53;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class6.field54) {
            int var13 = arg1 + arg3 + 1 - class6.field54;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method244(class6.field48, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method244(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIII[BII)V")
    private void method245(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        if (arg6 >= 0) {
            return;
        }
        int var9 = class6.field49 * arg2 + arg7;
        int var10 = class6.field49 - arg1;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class6.field51) {
            int var13 = class6.field51 - arg2;
            arg3 -= var13;
            arg2 = class6.field51;
            var12 += arg1 * var13;
            var9 += class6.field49 * var13;
        }
        if (arg2 + arg3 >= class6.field52) {
            arg3 -= arg2 + arg3 + 1 - class6.field52;
        }
        if (arg7 < class6.field53) {
            int var14 = class6.field53 - arg7;
            arg1 -= var14;
            arg7 = class6.field53;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg7 >= class6.field54) {
            int var15 = arg1 + arg7 + 1 - class6.field54;
            arg1 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg1 > 0 && arg3 > 0) {
            this.method246(arg0, arg5, var11, class6.field48, var9, var10, var12, arg1, arg3, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(I[BI[IIIIIIII)V")
    private void method246(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg0 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var13 = 256 - arg9;
        if (arg10 != 0) {
            this.field659 = 222;
        }
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg1[arg6++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg3[arg4];
                    arg3[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg5;
            arg6 += arg2;
        }
    }
}
