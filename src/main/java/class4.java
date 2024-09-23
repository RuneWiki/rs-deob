import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BFOGRMWS")
public class class4 extends class29 {

    @OriginalMember(owner = "BFOGRMWS", name = "w", descriptor = "Z")
    private boolean field42 = false;

    @OriginalMember(owner = "BFOGRMWS", name = "x", descriptor = "I")
    private int field43 = 6972;

    @OriginalMember(owner = "BFOGRMWS", name = "y", descriptor = "B")
    private byte field44 = 9;

    @OriginalMember(owner = "BFOGRMWS", name = "z", descriptor = "Z")
    private boolean field45 = true;

    @OriginalMember(owner = "BFOGRMWS", name = "A", descriptor = "Z")
    private boolean field46 = true;

    @OriginalMember(owner = "BFOGRMWS", name = "B", descriptor = "I")
    private int field47 = 8;

    @OriginalMember(owner = "BFOGRMWS", name = "C", descriptor = "[[B")
    public byte[][] field48 = new byte[256][];

    @OriginalMember(owner = "BFOGRMWS", name = "D", descriptor = "[I")
    public int[] field49 = new int[256];

    @OriginalMember(owner = "BFOGRMWS", name = "E", descriptor = "[I")
    public int[] field50 = new int[256];

    @OriginalMember(owner = "BFOGRMWS", name = "F", descriptor = "[I")
    public int[] field51 = new int[256];

    @OriginalMember(owner = "BFOGRMWS", name = "G", descriptor = "[I")
    public int[] field52 = new int[256];

    @OriginalMember(owner = "BFOGRMWS", name = "H", descriptor = "[I")
    public int[] field53 = new int[256];

    @OriginalMember(owner = "BFOGRMWS", name = "J", descriptor = "Ljava/util/Random;")
    public Random field55 = new Random();

    @OriginalMember(owner = "BFOGRMWS", name = "K", descriptor = "Z")
    public boolean field56 = false;

    @OriginalMember(owner = "BFOGRMWS", name = "I", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "BFOGRMWS", name = "<init>", descriptor = "(LCVNWKEAW;ZLjava/lang/String;Z)V")
    public class4(class7 arg0, boolean arg1, String arg2, boolean arg3) {
        class62 var5 = new class62(-417, arg0.method180(arg2 + ".dat", null));
        if (arg3) {
            throw new NullPointerException();
        }
        class62 var6 = new class62(-417, arg0.method180("index.dat", null));
        boolean var7 = true;
        var6.field1579 = var5.method523() + 4;
        int var8 = var6.method521();
        if (var8 > 0) {
            var6.field1579 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field51[var9] = var6.method521();
            this.field52[var9] = var6.method521();
            int var11 = this.field49[var9] = var6.method523();
            int var12 = this.field50[var9] = var6.method523();
            int var13 = var6.method521();
            int var14 = var11 * var12;
            this.field48[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field48[var9][var15] = var5.method522();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field48[var9][var11 * var17 + var16] = var5.method522();
                    }
                }
            }
            if (var12 > this.field54 && var9 < 128) {
                this.field54 = var12;
            }
            this.field51[var9] = 1;
            this.field53[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field48[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field53[var9]--;
                this.field51[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field48[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field53[var9]--;
            }
        }
        if (arg1) {
            this.field53[32] = this.field53[73];
        } else {
            this.field53[32] = this.field53[105];
            if (class54.field1472) {
            }
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(Ljava/lang/String;IZII)V")
    public void method14(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method19(arg0, arg4, arg1, arg3 - this.method18(arg0, 0), 6972);
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(IZIILjava/lang/String;)V")
    public void method15(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
        this.method19(arg4, arg3, arg0, arg2 - this.method18(arg4, 0) / 2, 6972);
        if (!arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
    public void method16(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method23(arg2 - this.method17(arg1, false) / 2, arg4, arg1, true, arg5, arg0);
        if (arg3 != -22293) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method17(String arg0, boolean arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field53[arg0.charAt(var4)];
            }
        }
        if (arg1) {
            return 2;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method18(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 == 0) {
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field53[arg0.charAt(var4)];
            }
            return var3;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method19(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg2 - this.field54;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var9 = arg0.charAt(var7);
            if (var9 != ' ') {
                this.method26(this.field48[var9], this.field51[var9] + arg3, this.field52[var9] + var6, this.field49[var9], this.field50[var9], arg1);
            }
            arg3 += this.field53[var9];
        }
        if (this.field43 != arg4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
    public void method20(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method18(arg0, 0) / 2;
        if (this.field44 != arg4) {
            return;
        }
        boolean var8 = false;
        int var9 = arg3 - this.field54;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method26(this.field48[var11], this.field51[var11] + var7, this.field52[var11] + var9 + (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field49[var11], this.field50[var11], arg5);
            }
            var7 += this.field53[var11];
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "b", descriptor = "(ZLjava/lang/String;IIII)V")
    public void method21(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            this.field42 = !this.field42;
        }
        if (arg1 == null) {
            return;
        }
        int var7 = arg5 - this.method18(arg1, 0) / 2;
        int var8 = arg2 - this.field54;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method26(this.field48[var10], this.field51[var10] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field52[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field49[var10], this.field50[var10], arg3);
            }
            var7 += this.field53[var10];
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public void method22(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method18(arg1, 0) / 2;
        int var11 = arg4 - this.field54;
        if (arg6 < 3 || arg6 > 3) {
            this.field43 = 286;
        }
        for (int var12 = 0; var12 < arg1.length(); var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 != ' ') {
                this.method26(this.field48[var13], this.field51[var13] + var10, this.field52[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field49[var13], this.field50[var13], arg0);
            }
            var10 += this.field53[var13];
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(IILjava/lang/String;ZIZ)V")
    public void method23(int arg0, int arg1, String arg2, boolean arg3, int arg4, boolean arg5) {
        this.field56 = false;
        if (!arg3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg0;
        if (arg2 == null) {
            return;
        }
        int var9 = arg1 - this.field54;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method25(this.field45, arg2.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method26(this.field48[var12], this.field51[var12] + arg0 + 1, this.field52[var12] + var9 + 1, this.field49[var12], this.field50[var12], 0);
                    }
                    this.method26(this.field48[var12], this.field51[var12] + arg0, this.field52[var12] + var9, this.field49[var12], this.field50[var12], arg4);
                }
                arg0 += this.field53[var12];
            }
        }
        if (this.field56) {
            class29.method325((byte) 3, 8388608, arg0 - var8, var8, (int) ((double) this.field54 * 0.7D) + var9);
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(Ljava/lang/String;IIIIIZ)V")
    public void method24(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 == null) {
            return;
        }
        this.field55.setSeed((long) arg2);
        int var8 = (this.field55.nextInt() & 0x1F) + 192;
        if (arg1 != 3) {
            this.field47 = -278;
        }
        int var9 = arg3 - this.field54;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var11 = this.method25(this.field45, arg0.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg0.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method28(this.field49[var12], this.field51[var12] + arg5 + 1, 0, true, this.field48[var12], this.field50[var12], this.field52[var12] + var9 + 1, 192);
                    }
                    this.method28(this.field49[var12], this.field51[var12] + arg5, arg4, true, this.field48[var12], this.field50[var12], this.field52[var12] + var9, var8);
                }
                arg5 += this.field53[var12];
                if ((this.field55.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method25(boolean arg0, String arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
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
                this.field56 = true;
            }
            if (arg1.equals("end")) {
                this.field56 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "([BIIIII)V")
    private void method26(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class29.field943 * arg2 + arg1;
        int var8 = class29.field943 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class29.field945) {
            int var11 = class29.field945 - arg2;
            arg4 -= var11;
            arg2 = class29.field945;
            var10 += arg3 * var11;
            var7 += class29.field943 * var11;
        }
        if (arg2 + arg4 >= class29.field946) {
            arg4 -= arg2 + arg4 + 1 - class29.field946;
        }
        if (arg1 < class29.field947) {
            int var12 = class29.field947 - arg1;
            arg3 -= var12;
            arg1 = class29.field947;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class29.field948) {
            int var13 = arg1 + arg3 + 1 - class29.field948;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method27(class29.field942, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method27(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(IIIZ[BIII)V")
    private void method28(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = class29.field943 * arg6 + arg1;
        int var11 = class29.field943 - arg0;
        int var12 = 0;
        int var13 = 0;
        if (arg6 < class29.field945) {
            int var14 = class29.field945 - arg6;
            arg5 -= var14;
            arg6 = class29.field945;
            var13 += arg0 * var14;
            var10 += class29.field943 * var14;
        }
        if (arg5 + arg6 >= class29.field946) {
            arg5 -= arg5 + arg6 + 1 - class29.field946;
        }
        if (arg1 < class29.field947) {
            int var15 = class29.field947 - arg1;
            arg0 -= var15;
            arg1 = class29.field947;
            var13 += var15;
            var10 += var15;
            var12 += var15;
            var11 += var15;
        }
        if (arg0 + arg1 >= class29.field948) {
            int var16 = arg0 + arg1 + 1 - class29.field948;
            arg0 -= var16;
            var12 += var16;
            var11 += var16;
        }
        if (arg0 > 0 && arg5 > 0) {
            this.method29(arg5, this.field46, var12, var11, arg0, arg4, var13, var10, arg7, arg2, class29.field942);
        }
    }

    @OriginalMember(owner = "BFOGRMWS", name = "a", descriptor = "(IZIII[BIIII[I)V")
    private void method29(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = ((arg9 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        int var13 = 256 - arg8;
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var16 = -arg4; var16 < 0; var16++) {
                if (arg5[arg6++] == 0) {
                    arg7++;
                } else {
                    int var17 = arg10[arg7];
                    arg10[arg7++] = (((var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var17 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg7 += arg3;
            arg6 += arg2;
        }
        if (!arg1) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }
}
