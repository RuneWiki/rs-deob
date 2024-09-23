import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EXARMWSO")
public class class11 extends class39 {

    @OriginalMember(owner = "EXARMWSO", name = "w", descriptor = "Z")
    private boolean field714 = false;

    @OriginalMember(owner = "EXARMWSO", name = "x", descriptor = "I")
    private int field715 = -719;

    @OriginalMember(owner = "EXARMWSO", name = "y", descriptor = "Z")
    private boolean field716 = true;

    @OriginalMember(owner = "EXARMWSO", name = "z", descriptor = "I")
    private int field717 = 6;

    @OriginalMember(owner = "EXARMWSO", name = "A", descriptor = "I")
    private int field718 = 624;

    @OriginalMember(owner = "EXARMWSO", name = "B", descriptor = "[[B")
    public byte[][] field719 = new byte[256][];

    @OriginalMember(owner = "EXARMWSO", name = "C", descriptor = "[I")
    public int[] field720 = new int[256];

    @OriginalMember(owner = "EXARMWSO", name = "D", descriptor = "[I")
    public int[] field721 = new int[256];

    @OriginalMember(owner = "EXARMWSO", name = "E", descriptor = "[I")
    public int[] field722 = new int[256];

    @OriginalMember(owner = "EXARMWSO", name = "F", descriptor = "[I")
    public int[] field723 = new int[256];

    @OriginalMember(owner = "EXARMWSO", name = "G", descriptor = "[I")
    public int[] field724 = new int[256];

    @OriginalMember(owner = "EXARMWSO", name = "I", descriptor = "Ljava/util/Random;")
    public Random field726 = new Random();

    @OriginalMember(owner = "EXARMWSO", name = "J", descriptor = "Z")
    public boolean field727 = false;

    @OriginalMember(owner = "EXARMWSO", name = "H", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "EXARMWSO", name = "<init>", descriptor = "(IZLSYUGXMZF;Ljava/lang/String;)V")
    public class11(int arg0, boolean arg1, class55 arg2, String arg3) {
        class30 var5 = new class30(arg2.method551(arg3 + ".dat", null), -982);
        class30 var6 = new class30(arg2.method551("index.dat", null), -982);
        boolean var7 = true;
        var6.field1065 = var5.method351() + 4;
        if (arg0 != 28290) {
            throw new NullPointerException();
        }
        int var8 = var6.method349();
        if (var8 > 0) {
            var6.field1065 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field722[var9] = var6.method349();
            this.field723[var9] = var6.method349();
            int var11 = this.field720[var9] = var6.method351();
            int var12 = this.field721[var9] = var6.method351();
            int var13 = var6.method349();
            int var14 = var11 * var12;
            this.field719[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field719[var9][var15] = var5.method350();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field719[var9][var11 * var17 + var16] = var5.method350();
                    }
                }
            }
            if (var12 > this.field725 && var9 < 128) {
                this.field725 = var12;
            }
            this.field722[var9] = 1;
            this.field724[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field719[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field724[var9]--;
                this.field722[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field719[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field724[var9]--;
            }
        }
        if (arg1) {
            this.field724[32] = this.field724[73];
        } else {
            this.field724[32] = this.field724[105];
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IIBLjava/lang/String;I)V")
    public void method247(int arg0, int arg1, byte arg2, String arg3, int arg4) {
        if (arg2 != 7) {
            this.field716 = !this.field716;
        }
        this.method252(671, arg1, arg4 - this.method251(arg3, 0), arg3, arg0);
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method248(int arg0, int arg1, String arg2, int arg3, int arg4) {
        this.method252(671, arg4, arg3 - this.method251(arg2, 0) / 2, arg2, arg1);
        if (arg0 < 1 || arg0 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(Ljava/lang/String;ZZIII)V")
    public void method249(String arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.method256(arg5, arg4, arg2, arg3 - this.method250(arg0, 0) / 2, arg0, (byte) 2);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method250(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field724[arg0.charAt(var4)];
            }
        }
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var3;
    }

    @OriginalMember(owner = "EXARMWSO", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method251(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != 0) {
            this.field716 = !this.field716;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field724[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method252(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg4 - this.field725;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            char var8 = arg3.charAt(var7);
            if (var8 != ' ') {
                this.method259(this.field719[var8], this.field722[var8] + arg2, this.field723[var8] + var6, this.field720[var8], this.field721[var8], arg1);
            }
            arg2 += this.field724[var8];
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method253(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method251(arg5, 0) / 2;
        int var8 = arg2 - this.field725;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method259(this.field719[var10], this.field722[var10] + var7, this.field723[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field720[var10], this.field721[var10], arg4);
            }
            var7 += this.field724[var10];
        }
        if (arg0 <= 0) {
            this.field716 = !this.field716;
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method254(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg5 >= 0) {
            this.field718 = -319;
        }
        if (arg1 == null) {
            return;
        }
        int var7 = arg0 - this.method251(arg1, 0) / 2;
        int var8 = arg4 - this.field725;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method259(this.field719[var10], this.field722[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field723[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field720[var10], this.field721[var10], arg3);
            }
            var7 += this.field724[var10];
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IZIIIILjava/lang/String;)V")
    public void method255(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg2 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method251(arg6, 0) / 2;
        if (arg1) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg4 - this.field725;
        for (int var13 = 0; var13 < arg6.length(); var13++) {
            char var14 = arg6.charAt(var13);
            if (var14 != ' ') {
                this.method259(this.field719[var14], this.field722[var14] + var10, this.field723[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg3) * var8), this.field720[var14], this.field721[var14], arg0);
            }
            var10 += this.field724[var14];
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IIZILjava/lang/String;B)V")
    public void method256(int arg0, int arg1, boolean arg2, int arg3, String arg4, byte arg5) {
        this.field727 = false;
        int var7 = arg3;
        if (arg4 == null) {
            return;
        }
        int var8 = arg1 - this.field725;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var12 = this.method258(arg4.substring(var9 + 1, var9 + 4), true);
                if (var12 != -1) {
                    arg0 = var12;
                }
                var9 += 4;
            } else {
                char var13 = arg4.charAt(var9);
                if (var13 != ' ') {
                    if (arg2) {
                        this.method259(this.field719[var13], this.field722[var13] + arg3 + 1, this.field723[var13] + var8 + 1, this.field720[var13], this.field721[var13], 0);
                    }
                    this.method259(this.field719[var13], this.field722[var13] + arg3, this.field723[var13] + var8, this.field720[var13], this.field721[var13], arg0);
                }
                arg3 += this.field724[var13];
            }
        }
        if (arg5 == 2) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (this.field727) {
            class39.method423((int) ((double) this.field725 * 0.7D) + var8, 265, arg3 - var7, var7, 8388608);
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IIZIILjava/lang/String;I)V")
    public void method257(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg0 < this.field717 || arg0 > this.field717) {
            this.field715 = 225;
        }
        if (arg5 == null) {
            return;
        }
        this.field726.setSeed((long) arg3);
        int var8 = (this.field726.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field725;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method258(arg5.substring(var10 + 1, var10 + 4), true);
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method261(192, 0, this.field719[var12], this.field720[var12], this.field721[var12], this.field723[var12] + var9 + 1, 0, this.field722[var12] + arg6 + 1);
                    }
                    this.method261(var8, 0, this.field719[var12], this.field720[var12], this.field721[var12], this.field723[var12] + var9, arg1, this.field722[var12] + arg6);
                }
                arg6 += this.field724[var12];
                if ((this.field726.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method258(String arg0, boolean arg1) {
        if (!arg1) {
            this.field718 = 470;
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
                this.field727 = true;
            }
            if (arg0.equals("end")) {
                this.field727 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "([BIIIII)V")
    private void method259(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class39.field1203 * arg2 + arg1;
        int var8 = class39.field1203 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class39.field1205) {
            int var11 = class39.field1205 - arg2;
            arg4 -= var11;
            arg2 = class39.field1205;
            var10 += arg3 * var11;
            var7 += class39.field1203 * var11;
        }
        if (arg2 + arg4 >= class39.field1206) {
            arg4 -= arg2 + arg4 + 1 - class39.field1206;
        }
        if (arg1 < class39.field1207) {
            int var12 = class39.field1207 - arg1;
            arg3 -= var12;
            arg1 = class39.field1207;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class39.field1208) {
            int var13 = arg1 + arg3 + 1 - class39.field1208;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method260(class39.field1202, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method260(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(II[BIIIII)V")
    private void method261(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class39.field1203 * arg5 + arg7;
        int var10 = class39.field1203 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg5 < class39.field1205) {
            int var13 = class39.field1205 - arg5;
            arg4 -= var13;
            arg5 = class39.field1205;
            var12 += arg3 * var13;
            var9 += class39.field1203 * var13;
        }
        if (arg4 + arg5 >= class39.field1206) {
            arg4 -= arg4 + arg5 + 1 - class39.field1206;
        }
        if (arg7 < class39.field1207) {
            int var14 = class39.field1207 - arg7;
            arg3 -= var14;
            arg7 = class39.field1207;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg7 >= class39.field1208) {
            int var15 = arg3 + arg7 + 1 - class39.field1208;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method262(arg6, arg4, var10, -11125, var9, arg3, arg0, arg2, class39.field1202, var11, var12);
            if (arg1 < 0 || arg1 > 0) {
                this.field714 = !this.field714;
            }
        }
    }

    @OriginalMember(owner = "EXARMWSO", name = "a", descriptor = "(IIIIIII[B[III)V")
    private void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int[] arg8, int arg9, int arg10) {
        int var12 = ((arg0 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg6 & 0xFF0000) >> 8;
        int var13 = 256 - arg6;
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                if (arg7[arg10++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg8[arg4];
                    arg8[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg2;
            arg10 += arg9;
        }
        if (arg3 != -11125) {
            this.field715 = -165;
        }
    }
}
