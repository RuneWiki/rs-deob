import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CAMKASVY")
public class class4 extends class5 {

    @OriginalMember(owner = "client!CAMKASVY", name = "z", descriptor = "Z")
    private boolean field26 = false;

    @OriginalMember(owner = "client!CAMKASVY", name = "A", descriptor = "Z")
    private boolean field27 = true;

    @OriginalMember(owner = "client!CAMKASVY", name = "C", descriptor = "I")
    private int field29 = 779;

    @OriginalMember(owner = "client!CAMKASVY", name = "D", descriptor = "[[B")
    public byte[][] field30 = new byte[256][];

    @OriginalMember(owner = "client!CAMKASVY", name = "E", descriptor = "[I")
    public int[] field31 = new int[256];

    @OriginalMember(owner = "client!CAMKASVY", name = "F", descriptor = "[I")
    public int[] field32 = new int[256];

    @OriginalMember(owner = "client!CAMKASVY", name = "G", descriptor = "[I")
    public int[] field33 = new int[256];

    @OriginalMember(owner = "client!CAMKASVY", name = "H", descriptor = "[I")
    public int[] field34 = new int[256];

    @OriginalMember(owner = "client!CAMKASVY", name = "I", descriptor = "[I")
    public int[] field35 = new int[256];

    @OriginalMember(owner = "client!CAMKASVY", name = "K", descriptor = "Ljava/util/Random;")
    public Random field37 = new Random();

    @OriginalMember(owner = "client!CAMKASVY", name = "L", descriptor = "Z")
    public boolean field38 = false;

    @OriginalMember(owner = "client!CAMKASVY", name = "J", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!CAMKASVY", name = "B", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!CAMKASVY", name = "<init>", descriptor = "(LAKPFVPPG;Ljava/lang/String;ZZ)V")
    public class4(class2 arg0, String arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            throw new NullPointerException();
        }
        class13 var5 = new class13(arg0.method7(arg1 + ".dat", null), (byte) 3);
        class13 var6 = new class13(arg0.method7("index.dat", null), (byte) 3);
        boolean var7 = true;
        var6.field643 = var5.method215() + 4;
        int var8 = var6.method213();
        if (var8 > 0) {
            var6.field643 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field33[var9] = var6.method213();
            this.field34[var9] = var6.method213();
            int var11 = this.field31[var9] = var6.method215();
            int var12 = this.field32[var9] = var6.method215();
            int var13 = var6.method213();
            int var14 = var11 * var12;
            this.field30[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field30[var9][var15] = var5.method214();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field30[var9][var11 * var17 + var16] = var5.method214();
                    }
                }
            }
            if (var12 > this.field36 && var9 < 128) {
                this.field36 = var12;
            }
            this.field33[var9] = 1;
            this.field35[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field30[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field35[var9]--;
                this.field33[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field30[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field35[var9]--;
            }
        }
        if (arg3) {
            this.field35[32] = this.field35[73];
        } else {
            this.field35[32] = this.field35[105];
            if (class41.field1195) {
            }
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
    public void method12(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        if (arg2 == 63) {
            this.method17(779, arg3, arg0 - this.method16(this.field28, arg3), arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
    public void method13(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field26 = !this.field26;
        }
        this.method17(779, arg2, arg0 - this.method16(this.field28, arg2) / 2, arg1, arg3);
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ZIILjava/lang/String;II)V")
    public void method14(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        this.method21(arg1 - this.method15(false, arg3) / 2, arg4, arg0, (byte) 6, arg3, arg5);
        if (arg2 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method15(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field35[arg1.charAt(var4)];
            }
        }
        if (arg0) {
            return this.field28;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method16(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            var3 += this.field35[arg1.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method17(int arg0, String arg1, int arg2, int arg3, int arg4) {
        int var6 = 78 / arg0;
        if (arg1 == null) {
            return;
        }
        int var7 = arg3 - this.field36;
        for (int var8 = 0; var8 < arg1.length(); var8++) {
            char var9 = arg1.charAt(var8);
            if (var9 != ' ') {
                this.method24(this.field30[var9], this.field33[var9] + arg2, this.field34[var9] + var7, this.field31[var9], this.field32[var9], arg4);
            }
            arg2 += this.field35[var9];
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method18(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method16(this.field28, arg1) / 2;
        int var8 = arg3 - this.field36;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method24(this.field30[var10], this.field33[var10] + var7, this.field34[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field31[var10], this.field32[var10], arg4);
            }
            var7 += this.field35[var10];
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
    public void method19(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg3 - this.method16(this.field28, arg2) / 2;
        int var8 = arg0 - this.field36;
        if (arg5) {
            this.field28 = 277;
        }
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method24(this.field30[var10], this.field33[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field34[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field31[var10], this.field32[var10], arg4);
            }
            var7 += this.field35[var10];
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IZIILjava/lang/String;II)V")
    public void method20(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        if (arg1) {
            this.field27 = !this.field27;
        }
        if (arg4 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method16(this.field28, arg4) / 2;
        int var11 = arg2 - this.field36;
        for (int var12 = 0; var12 < arg4.length(); var12++) {
            char var13 = arg4.charAt(var12);
            if (var13 != ' ') {
                this.method24(this.field30[var13], this.field33[var13] + var10, this.field34[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field31[var13], this.field32[var13], arg3);
            }
            var10 += this.field35[var13];
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(IIZBLjava/lang/String;I)V")
    public void method21(int arg0, int arg1, boolean arg2, byte arg3, String arg4, int arg5) {
        this.field38 = false;
        int var7 = arg0;
        if (arg4 == null) {
            return;
        }
        int var8 = arg1 - this.field36;
        if (arg3 != 6) {
            return;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method23(-33649, arg4.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg2) {
                        this.method24(this.field30[var11], this.field33[var11] + arg0 + 1, this.field34[var11] + var8 + 1, this.field31[var11], this.field32[var11], 0);
                    }
                    this.method24(this.field30[var11], this.field33[var11] + arg0, this.field34[var11] + var8, this.field31[var11], this.field32[var11], arg5);
                }
                arg0 += this.field35[var11];
            }
        }
        if (this.field38) {
            class5.method36(0, (int) ((double) this.field36 * 0.7D) + var8, var7, 8388608, arg0 - var7);
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(ILjava/lang/String;IZIZI)V")
    public void method22(int arg0, String arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field37.setSeed((long) arg0);
        int var8 = (this.field37.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.field36;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var12 = this.method23(-33649, arg1.substring(var10 + 1, var10 + 4));
                if (var12 != -1) {
                    arg4 = var12;
                }
                var10 += 4;
            } else {
                char var13 = arg1.charAt(var10);
                if (var13 != ' ') {
                    if (arg3) {
                        this.method26(this.field30[var13], 192, this.field33[var13] + arg2 + 1, true, this.field31[var13], 0, this.field34[var13] + var9 + 1, this.field32[var13]);
                    }
                    this.method26(this.field30[var13], var8, this.field33[var13] + arg2, true, this.field31[var13], arg4, this.field34[var13] + var9, this.field32[var13]);
                }
                arg2 += this.field35[var13];
                if ((this.field37.nextInt() & 0x3) == 0) {
                    arg2++;
                }
            }
        }
        if (!arg5) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method23(int arg0, String arg1) {
        if (arg0 != -33649) {
            return this.field29;
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
                this.field38 = true;
            }
            if (arg1.equals("end")) {
                this.field38 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "([BIIIII)V")
    private void method24(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class5.field46 * arg2 + arg1;
        int var8 = class5.field46 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class5.field48) {
            int var11 = class5.field48 - arg2;
            arg4 -= var11;
            arg2 = class5.field48;
            var10 += arg3 * var11;
            var7 += class5.field46 * var11;
        }
        if (arg2 + arg4 >= class5.field49) {
            arg4 -= arg2 + arg4 + 1 - class5.field49;
        }
        if (arg1 < class5.field50) {
            int var12 = class5.field50 - arg1;
            arg3 -= var12;
            arg1 = class5.field50;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class5.field51) {
            int var13 = arg1 + arg3 + 1 - class5.field51;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method25(class5.field45, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method25(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "([BIIZIIII)V")
    private void method26(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class5.field46 * arg6 + arg2;
        int var10 = class5.field46 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (!arg3) {
            return;
        }
        if (arg6 < class5.field48) {
            int var13 = class5.field48 - arg6;
            arg7 -= var13;
            arg6 = class5.field48;
            var12 += arg4 * var13;
            var9 += class5.field46 * var13;
        }
        if (arg6 + arg7 >= class5.field49) {
            arg7 -= arg6 + arg7 + 1 - class5.field49;
        }
        if (arg2 < class5.field50) {
            int var14 = class5.field50 - arg2;
            arg4 -= var14;
            arg2 = class5.field50;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg4 >= class5.field51) {
            int var15 = arg2 + arg4 + 1 - class5.field51;
            arg4 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 > 0 && arg7 > 0) {
            this.method27(var9, arg4, class5.field45, 418, var12, var11, arg5, arg7, var10, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!CAMKASVY", name = "a", descriptor = "(II[IIIIIIII[B)V")
    private void method27(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        int var12 = ((arg6 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var13 = 96 / arg3;
        int var14 = 256 - arg9;
        for (int var15 = -arg7; var15 < 0; var15++) {
            for (int var16 = -arg1; var16 < 0; var16++) {
                if (arg10[arg4++] == 0) {
                    arg0++;
                } else {
                    int var17 = arg2[arg0];
                    arg2[arg0++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg8;
            arg4 += arg5;
        }
    }
}
