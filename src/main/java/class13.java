import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EOVZRNPE")
public class class13 extends class62 {

    @OriginalMember(owner = "EOVZRNPE", name = "x", descriptor = "Z")
    private boolean field660 = true;

    @OriginalMember(owner = "EOVZRNPE", name = "y", descriptor = "Z")
    private boolean field661 = false;

    @OriginalMember(owner = "EOVZRNPE", name = "B", descriptor = "B")
    private byte field664 = -90;

    @OriginalMember(owner = "EOVZRNPE", name = "C", descriptor = "[[B")
    public byte[][] field665 = new byte[256][];

    @OriginalMember(owner = "EOVZRNPE", name = "D", descriptor = "[I")
    public int[] field666 = new int[256];

    @OriginalMember(owner = "EOVZRNPE", name = "E", descriptor = "[I")
    public int[] field667 = new int[256];

    @OriginalMember(owner = "EOVZRNPE", name = "F", descriptor = "[I")
    public int[] field668 = new int[256];

    @OriginalMember(owner = "EOVZRNPE", name = "G", descriptor = "[I")
    public int[] field669 = new int[256];

    @OriginalMember(owner = "EOVZRNPE", name = "H", descriptor = "[I")
    public int[] field670 = new int[256];

    @OriginalMember(owner = "EOVZRNPE", name = "J", descriptor = "Ljava/util/Random;")
    public Random field672 = new Random();

    @OriginalMember(owner = "EOVZRNPE", name = "K", descriptor = "Z")
    public boolean field673 = false;

    @OriginalMember(owner = "EOVZRNPE", name = "I", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "EOVZRNPE", name = "z", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "EOVZRNPE", name = "A", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "EOVZRNPE", name = "<init>", descriptor = "(Ljava/lang/String;ZZLFNOQZAYQ;)V")
    public class13(String arg0, boolean arg1, boolean arg2, class14 arg3) {
        class11 var5 = new class11(arg3.method246(arg0 + ".dat", null), this.field660);
        class11 var6 = new class11(arg3.method246("index.dat", null), this.field660);
        boolean var7 = true;
        if (arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        var6.field643 = var5.method191() + 4;
        int var9 = var6.method189();
        if (var9 > 0) {
            var6.field643 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field668[var10] = var6.method189();
            this.field669[var10] = var6.method189();
            int var12 = this.field666[var10] = var6.method191();
            int var13 = this.field667[var10] = var6.method191();
            int var14 = var6.method189();
            int var15 = var12 * var13;
            this.field665[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field665[var10][var16] = var5.method190();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field665[var10][var12 * var18 + var17] = var5.method190();
                    }
                }
            }
            if (var13 > this.field671 && var10 < 128) {
                this.field671 = var13;
            }
            this.field668[var10] = 1;
            this.field670[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field665[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field670[var10]--;
                this.field668[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field665[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field670[var10]--;
            }
        }
        if (arg2) {
            this.field670[32] = this.field670[73];
        } else {
            this.field670[32] = this.field670[105];
            if (class2.field14) {
            }
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method229(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg2 == 0) {
            this.method234(arg4 - this.method233(-267, arg3), arg3, arg0, 988, arg1);
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IILjava/lang/String;BI)V")
    public void method230(int arg0, int arg1, String arg2, byte arg3, int arg4) {
        if (this.field664 == arg3) {
            this.method234(arg1 - this.method233(-267, arg2) / 2, arg2, arg0, 988, arg4);
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
    public void method231(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.method238(arg5 - this.method232(arg1, 410) / 2, 30867, arg1, arg2, arg3, arg4);
        if (arg0 == 27826) {
            ;
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method232(String arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.field670[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method233(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field670[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method234(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg4 - this.field671;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var9 = arg1.charAt(var7);
            if (var9 != ' ') {
                this.method241(this.field665[var9], this.field668[var9] + arg0, this.field669[var9] + var6, this.field666[var9], this.field667[var9], arg2);
            }
            arg0 += this.field670[var9];
        }
        int var8 = 28 / arg3;
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method235(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg3 - this.method233(-267, arg1) / 2;
        int var8 = arg2 - this.field671;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method241(this.field665[var10], this.field668[var10] + var7, this.field669[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field666[var10], this.field667[var10], arg0);
            }
            var7 += this.field670[var10];
        }
        if (arg5 != 0) {
            this.field660 = !this.field660;
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IBLjava/lang/String;III)V")
    public void method236(int arg0, byte arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg3 - this.method233(-267, arg2) / 2;
        if (arg1 != 81) {
            return;
        }
        int var8 = arg0 - this.field671;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method241(this.field665[var10], this.field668[var10] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field669[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field666[var10], this.field667[var10], arg5);
            }
            var7 += this.field670[var10];
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method237(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (arg0 != 6) {
            this.field661 = !this.field661;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method233(-267, arg5) / 2;
        int var11 = arg1 - this.field671;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method241(this.field665[var13], this.field668[var13] + var10, this.field669[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field666[var13], this.field667[var13], arg3);
            }
            var10 += this.field670[var13];
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
    public void method238(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
        this.field673 = false;
        int var7 = arg0;
        if (arg2 == null) {
            return;
        }
        int var8 = arg4 - this.field671;
        if (arg1 != 30867) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method240(arg2.substring(var10 + 1, var10 + 4), 7);
                if (var11 != -1) {
                    arg5 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method241(this.field665[var12], this.field668[var12] + arg0 + 1, this.field669[var12] + var8 + 1, this.field666[var12], this.field667[var12], 0);
                    }
                    this.method241(this.field665[var12], this.field668[var12] + arg0, this.field669[var12] + var8, this.field666[var12], this.field667[var12], arg5);
                }
                arg0 += this.field670[var12];
            }
        }
        if (this.field673) {
            class62.method520((int) ((double) this.field671 * 0.7D) + var8, arg0 - var7, var7, 8388608, this.field662);
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(ILjava/lang/String;ZZIII)V")
    public void method239(int arg0, String arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field672.setSeed((long) arg5);
        if (!arg3) {
            this.field663 = -478;
        }
        int var8 = (this.field672.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field671;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method240(arg1.substring(var10 + 1, var10 + 4), 7);
                if (var11 != -1) {
                    arg6 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method243(259, this.field668[var12] + arg0 + 1, 0, 192, this.field669[var12] + var9 + 1, this.field665[var12], this.field667[var12], this.field666[var12]);
                    }
                    this.method243(259, this.field668[var12] + arg0, arg6, var8, this.field669[var12] + var9, this.field665[var12], this.field667[var12], this.field666[var12]);
                }
                arg0 += this.field670[var12];
                if ((this.field672.nextInt() & 0x3) == 0) {
                    arg0++;
                }
            }
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method240(String arg0, int arg1) {
        if (arg1 != 7) {
            return this.field663;
        } else if (arg0.equals("red")) {
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
                this.field673 = true;
            }
            if (arg0.equals("end")) {
                this.field673 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "([BIIIII)V")
    private void method241(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class62.field1529 * arg2 + arg1;
        int var8 = class62.field1529 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class62.field1531) {
            int var11 = class62.field1531 - arg2;
            arg4 -= var11;
            arg2 = class62.field1531;
            var10 += arg3 * var11;
            var7 += class62.field1529 * var11;
        }
        if (arg2 + arg4 >= class62.field1532) {
            arg4 -= arg2 + arg4 + 1 - class62.field1532;
        }
        if (arg1 < class62.field1533) {
            int var12 = class62.field1533 - arg1;
            arg3 -= var12;
            arg1 = class62.field1533;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class62.field1534) {
            int var13 = arg1 + arg3 + 1 - class62.field1534;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method242(class62.field1528, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method242(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IIIII[BII)V")
    private void method243(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        int var9 = class62.field1529 * arg4 + arg1;
        int var10 = class62.field1529 - arg7;
        int var11 = 0;
        int var12 = 0;
        if (arg4 < class62.field1531) {
            int var13 = class62.field1531 - arg4;
            arg6 -= var13;
            arg4 = class62.field1531;
            var12 += arg7 * var13;
            var9 += class62.field1529 * var13;
        }
        if (arg4 + arg6 >= class62.field1532) {
            arg6 -= arg4 + arg6 + 1 - class62.field1532;
        }
        if (arg1 < class62.field1533) {
            int var14 = class62.field1533 - arg1;
            arg7 -= var14;
            arg1 = class62.field1533;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg7 >= class62.field1534) {
            int var15 = arg1 + arg7 + 1 - class62.field1534;
            arg7 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg7 > 0 && arg6 > 0) {
            this.method244(arg2, var10, arg3, arg7, arg6, var11, arg5, 400, var9, class62.field1528, var12);
            int var16 = 14 / arg0;
        }
    }

    @OriginalMember(owner = "EOVZRNPE", name = "a", descriptor = "(IIIIII[BII[II)V")
    private void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        int var13 = 256 - arg2;
        if (arg7 != 400) {
            return;
        }
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = -arg3; var15 < 0; var15++) {
                if (arg6[arg10++] == 0) {
                    arg8++;
                } else {
                    int var16 = arg9[arg8];
                    arg9[arg8++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg8 += arg1;
            arg10 += arg5;
        }
    }
}
