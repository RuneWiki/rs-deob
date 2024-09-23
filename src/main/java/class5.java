import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BDJKVJZU")
public class class5 extends class12 {

    @OriginalMember(owner = "BDJKVJZU", name = "x", descriptor = "I")
    private int field36 = -166;

    @OriginalMember(owner = "BDJKVJZU", name = "y", descriptor = "Z")
    private boolean field37 = true;

    @OriginalMember(owner = "BDJKVJZU", name = "z", descriptor = "B")
    private byte field38 = 1;

    @OriginalMember(owner = "BDJKVJZU", name = "A", descriptor = "Z")
    private boolean field39 = true;

    @OriginalMember(owner = "BDJKVJZU", name = "B", descriptor = "I")
    private int field40 = -274;

    @OriginalMember(owner = "BDJKVJZU", name = "C", descriptor = "Z")
    private boolean field41 = false;

    @OriginalMember(owner = "BDJKVJZU", name = "D", descriptor = "I")
    private int field42 = -52;

    @OriginalMember(owner = "BDJKVJZU", name = "E", descriptor = "[[B")
    public byte[][] field43 = new byte[256][];

    @OriginalMember(owner = "BDJKVJZU", name = "F", descriptor = "[I")
    public int[] field44 = new int[256];

    @OriginalMember(owner = "BDJKVJZU", name = "G", descriptor = "[I")
    public int[] field45 = new int[256];

    @OriginalMember(owner = "BDJKVJZU", name = "H", descriptor = "[I")
    public int[] field46 = new int[256];

    @OriginalMember(owner = "BDJKVJZU", name = "I", descriptor = "[I")
    public int[] field47 = new int[256];

    @OriginalMember(owner = "BDJKVJZU", name = "J", descriptor = "[I")
    public int[] field48 = new int[256];

    @OriginalMember(owner = "BDJKVJZU", name = "L", descriptor = "Ljava/util/Random;")
    public Random field50 = new Random();

    @OriginalMember(owner = "BDJKVJZU", name = "M", descriptor = "Z")
    public boolean field51 = false;

    @OriginalMember(owner = "BDJKVJZU", name = "K", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "BDJKVJZU", name = "<init>", descriptor = "(IZLTXPLZUUI;Ljava/lang/String;)V")
    public class5(int arg0, boolean arg1, class60 arg2, String arg3) {
        class43 var5 = new class43(arg2.method506(arg3 + ".dat", null), 0);
        if (arg0 != 26521) {
            throw new NullPointerException();
        }
        class43 var6 = new class43(arg2.method506("index.dat", null), 0);
        boolean var7 = true;
        var6.field1105 = var5.method332() + 4;
        int var8 = var6.method330();
        if (var8 > 0) {
            var6.field1105 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field46[var9] = var6.method330();
            this.field47[var9] = var6.method330();
            int var11 = this.field44[var9] = var6.method332();
            int var12 = this.field45[var9] = var6.method332();
            int var13 = var6.method330();
            int var14 = var11 * var12;
            this.field43[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field43[var9][var15] = var5.method331();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field43[var9][var11 * var17 + var16] = var5.method331();
                    }
                }
            }
            if (var12 > this.field49 && var9 < 128) {
                this.field49 = var12;
            }
            this.field46[var9] = 1;
            this.field48[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field43[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field48[var9]--;
                this.field46[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field43[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field48[var9]--;
            }
        }
        if (arg1) {
            this.field48[32] = this.field48[73];
        } else {
            this.field48[32] = this.field48[105];
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method8(String arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            this.field37 = !this.field37;
        }
        this.method13(arg3 - this.method12(12043, arg0), (byte) 1, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
    public void method9(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field42 = 419;
        }
        this.method13(arg1 - this.method12(12043, arg2) / 2, (byte) 1, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
    public void method10(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.method17(arg3, true, arg0 - this.method11(arg1, false) / 2, arg5, arg1, arg2);
        while (arg4 >= 0) {
            this.field42 = 210;
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method11(String arg0, boolean arg1) {
        if (arg1) {
            return 0;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field48[arg0.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method12(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 != 12043) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            var3 += this.field48[arg1.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IBLjava/lang/String;II)V")
    public void method13(int arg0, byte arg1, String arg2, int arg3, int arg4) {
        if (this.field38 != arg1 || arg2 == null) {
            return;
        }
        int var6 = arg4 - this.field49;
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 != ' ') {
                this.method20(this.field43[var8], this.field46[var8] + arg0, this.field47[var8] + var6, this.field44[var8], this.field45[var8], arg3);
            }
            arg0 += this.field48[var8];
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public void method14(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 22561 || arg2 == null) {
            return;
        }
        int var7 = arg5 - this.method12(12043, arg2) / 2;
        int var8 = arg4 - this.field49;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method20(this.field43[var10], this.field46[var10] + var7, this.field47[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field44[var10], this.field45[var10], arg1);
            }
            var7 += this.field48[var10];
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IZIILjava/lang/String;I)V")
    public void method15(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg0 - this.method12(12043, arg4) / 2;
        int var8 = arg2 - this.field49;
        if (!arg1) {
            this.field36 = 51;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method20(this.field43[var10], this.field46[var10] + var7 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field47[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field44[var10], this.field45[var10], arg5);
            }
            var7 += this.field48[var10];
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method16(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg5 / 8.0D;
        if (arg6 != 0) {
            return;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method12(12043, arg3) / 2;
        int var11 = arg2 - this.field49;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method20(this.field43[var13], this.field46[var13] + var10, this.field47[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg1) * var8), this.field44[var13], this.field45[var13], arg0);
            }
            var10 += this.field48[var13];
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IZIILjava/lang/String;Z)V")
    public void method17(int arg0, boolean arg1, int arg2, int arg3, String arg4, boolean arg5) {
        this.field51 = false;
        if (!arg1) {
            this.field37 = !this.field37;
        }
        int var7 = arg2;
        if (arg4 == null) {
            return;
        }
        int var8 = arg0 - this.field49;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method19(arg4.substring(var9 + 1, var9 + 4), false);
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg5) {
                        this.method20(this.field43[var11], this.field46[var11] + arg2 + 1, this.field47[var11] + var8 + 1, this.field44[var11], this.field45[var11], 0);
                    }
                    this.method20(this.field43[var11], this.field46[var11] + arg2, this.field47[var11] + var8, this.field44[var11], this.field45[var11], arg3);
                }
                arg2 += this.field48[var11];
            }
        }
        if (this.field51) {
            class12.method205(arg2 - var7, 8388608, (byte) -92, var7, (int) ((double) this.field49 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IIIZLjava/lang/String;II)V")
    public void method18(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5, int arg6) {
        if (arg4 == null) {
            return;
        }
        this.field50.setSeed((long) arg0);
        int var8 = (this.field50.nextInt() & 0x1F) + 192;
        while (arg1 >= 0) {
            this.field41 = !this.field41;
        }
        int var9 = arg5 - this.field49;
        for (int var10 = 0; var10 < arg4.length(); var10++) {
            if (arg4.charAt(var10) == '@' && var10 + 4 < arg4.length() && arg4.charAt(var10 + 4) == '@') {
                int var11 = this.method19(arg4.substring(var10 + 1, var10 + 4), false);
                if (var11 != -1) {
                    arg6 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg4.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method22(this.field47[var12] + var9 + 1, this.field46[var12] + arg2 + 1, true, this.field44[var12], this.field43[var12], this.field45[var12], 192, 0);
                    }
                    this.method22(this.field47[var12] + var9, this.field46[var12] + arg2, true, this.field44[var12], this.field43[var12], this.field45[var12], var8, arg6);
                }
                arg2 += this.field48[var12];
                if ((this.field50.nextInt() & 0x3) == 0) {
                    arg2++;
                }
            }
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "b", descriptor = "(Ljava/lang/String;Z)I")
    public int method19(String arg0, boolean arg1) {
        if (arg1) {
            this.field36 = -361;
        }
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
                this.field51 = true;
            }
            if (arg0.equals("end")) {
                this.field51 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "([BIIIII)V")
    private void method20(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class12.field635 * arg2 + arg1;
        int var8 = class12.field635 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class12.field637) {
            int var11 = class12.field637 - arg2;
            arg4 -= var11;
            arg2 = class12.field637;
            var10 += arg3 * var11;
            var7 += class12.field635 * var11;
        }
        if (arg2 + arg4 >= class12.field638) {
            arg4 -= arg2 + arg4 + 1 - class12.field638;
        }
        if (arg1 < class12.field639) {
            int var12 = class12.field639 - arg1;
            arg3 -= var12;
            arg1 = class12.field639;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class12.field640) {
            int var13 = arg1 + arg3 + 1 - class12.field640;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method21(class12.field634, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method21(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(IIZI[BIII)V")
    private void method22(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (!arg2) {
            return;
        }
        int var9 = class12.field635 * arg0 + arg1;
        int var10 = class12.field635 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class12.field637) {
            int var13 = class12.field637 - arg0;
            arg5 -= var13;
            arg0 = class12.field637;
            var12 += arg3 * var13;
            var9 += class12.field635 * var13;
        }
        if (arg0 + arg5 >= class12.field638) {
            arg5 -= arg0 + arg5 + 1 - class12.field638;
        }
        if (arg1 < class12.field639) {
            int var14 = class12.field639 - arg1;
            arg3 -= var14;
            arg1 = class12.field639;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg3 >= class12.field640) {
            int var15 = arg1 + arg3 + 1 - class12.field640;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg5 > 0) {
            this.method23(var12, var10, class12.field634, var11, arg5, arg4, arg7, arg6, var9, -713, arg3);
        }
    }

    @OriginalMember(owner = "BDJKVJZU", name = "a", descriptor = "(II[III[BIIIII)V")
    private void method23(int arg0, int arg1, int[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg6 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg7 & 0xFF0000) >> 8;
        if (arg9 >= 0) {
            return;
        }
        int var13 = 256 - arg7;
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                if (arg5[arg0++] == 0) {
                    arg8++;
                } else {
                    int var16 = arg2[arg8];
                    arg2[arg8++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg8 += arg1;
            arg0 += arg3;
        }
    }
}
