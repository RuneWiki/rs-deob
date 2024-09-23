import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FDMAFIMR")
public class class22 extends class46 {

    @OriginalMember(owner = "FDMAFIMR", name = "z", descriptor = "I")
    private int field711 = -6;

    @OriginalMember(owner = "FDMAFIMR", name = "A", descriptor = "Z")
    private boolean field712 = false;

    @OriginalMember(owner = "FDMAFIMR", name = "B", descriptor = "I")
    private int field713 = -11820;

    @OriginalMember(owner = "FDMAFIMR", name = "C", descriptor = "Z")
    private boolean field714 = true;

    @OriginalMember(owner = "FDMAFIMR", name = "D", descriptor = "I")
    private int field715 = 2;

    @OriginalMember(owner = "FDMAFIMR", name = "F", descriptor = "[[B")
    public byte[][] field717 = new byte[256][];

    @OriginalMember(owner = "FDMAFIMR", name = "G", descriptor = "[I")
    public int[] field718 = new int[256];

    @OriginalMember(owner = "FDMAFIMR", name = "H", descriptor = "[I")
    public int[] field719 = new int[256];

    @OriginalMember(owner = "FDMAFIMR", name = "I", descriptor = "[I")
    public int[] field720 = new int[256];

    @OriginalMember(owner = "FDMAFIMR", name = "J", descriptor = "[I")
    public int[] field721 = new int[256];

    @OriginalMember(owner = "FDMAFIMR", name = "K", descriptor = "[I")
    public int[] field722 = new int[256];

    @OriginalMember(owner = "FDMAFIMR", name = "M", descriptor = "Ljava/util/Random;")
    public Random field724 = new Random();

    @OriginalMember(owner = "FDMAFIMR", name = "N", descriptor = "Z")
    public boolean field725 = false;

    @OriginalMember(owner = "FDMAFIMR", name = "L", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "FDMAFIMR", name = "E", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "FDMAFIMR", name = "<init>", descriptor = "(LVSUYIIVA;Ljava/lang/String;ZZ)V")
    public class22(class62 arg0, String arg1, boolean arg2, boolean arg3) {
        class8 var5 = new class8(arg0.method570(arg1 + ".dat", null), 792);
        class8 var6 = new class8(arg0.method570("index.dat", null), 792);
        boolean var7 = true;
        if (!arg3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        var6.field72 = var5.method32() + 4;
        int var9 = var6.method30();
        if (var9 > 0) {
            var6.field72 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field720[var10] = var6.method30();
            this.field721[var10] = var6.method30();
            int var12 = this.field718[var10] = var6.method32();
            int var13 = this.field719[var10] = var6.method32();
            int var14 = var6.method30();
            int var15 = var12 * var13;
            this.field717[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field717[var10][var16] = var5.method31();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field717[var10][var12 * var18 + var17] = var5.method31();
                    }
                }
            }
            if (var13 > this.field723 && var10 < 128) {
                this.field723 = var13;
            }
            this.field720[var10] = 1;
            this.field722[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field717[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field722[var10]--;
                this.field720[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field717[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field722[var10]--;
            }
        }
        if (arg2) {
            this.field722[32] = this.field722[73];
        } else {
            this.field722[32] = this.field722[105];
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
    public void method277(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
        this.method282(arg1, arg2 - this.method281(arg1, 987), arg4, 619, arg0);
        if (arg3) {
            this.field714 = !this.field714;
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method278(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method282(arg1, arg3 - this.method281(arg1, 987) / 2, arg2, 619, arg0);
        if (arg4 < this.field715 || arg4 > this.field715) {
            this.field713 = -399;
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
    public void method279(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method286(arg0, arg1, arg5 - this.method280(498, arg1) / 2, arg4, arg3, 0);
        int var7 = 26 / arg2;
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method280(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 <= 0) {
            return 2;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field722[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method281(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 94 / arg1;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var3 += this.field722[arg0.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method282(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg4 - this.field723;
        int var7 = 84 / arg3;
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 != ' ') {
                this.method289(this.field717[var9], this.field720[var9] + arg1, this.field721[var9] + var6, this.field718[var9], this.field719[var9], arg2);
            }
            arg1 += this.field722[var9];
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
    public void method283(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method281(arg0, 987) / 2;
        if (arg5 != 39) {
            this.field711 = 490;
        }
        int var8 = arg4 - this.field723;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method289(this.field717[var10], this.field720[var10] + var7, this.field721[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field718[var10], this.field719[var10], arg1);
            }
            var7 += this.field722[var10];
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method284(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method281(arg0, 987) / 2;
        int var8 = arg4 - this.field723;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method289(this.field717[var10], this.field720[var10] + var7 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field721[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field718[var10], this.field719[var10], arg2);
            }
            var7 += this.field722[var10];
        }
        if (arg3 < 9 || arg3 > 9) {
            this.field712 = !this.field712;
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0 - this.method281(arg6, 987) / 2;
        int var11 = arg5 - this.field723;
        for (int var12 = 0; var12 < arg6.length(); var12++) {
            char var14 = arg6.charAt(var12);
            if (var14 != ' ') {
                this.method289(this.field717[var14], this.field720[var14] + var10, this.field721[var14] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field718[var14], this.field719[var14], arg2);
            }
            var10 += this.field722[var14];
        }
        if (arg1 != 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
    public void method286(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field725 = false;
        if (arg5 != 0) {
            return;
        }
        int var7 = arg2;
        if (arg1 == null) {
            return;
        }
        int var8 = arg4 - this.field723;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
                int var10 = this.method288(this.field716, arg1.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg1.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method289(this.field717[var11], this.field720[var11] + arg2 + 1, this.field721[var11] + var8 + 1, this.field718[var11], this.field719[var11], 0);
                    }
                    this.method289(this.field717[var11], this.field720[var11] + arg2, this.field721[var11] + var8, this.field718[var11], this.field719[var11], arg0);
                }
                arg2 += this.field722[var11];
            }
        }
        if (this.field725) {
            class46.method439(arg2 - var7, (int) ((double) this.field723 * 0.7D) + var8, true, 8388608, var7);
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V")
    public void method287(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field724.setSeed((long) arg3);
        int var8 = (this.field724.nextInt() & 0x1F) + 192;
        int var9 = arg2 - this.field723;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method288(this.field716, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg4 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method291(this.field720[var12] + arg6 + 1, 401, this.field717[var12], this.field721[var12] + var9 + 1, this.field718[var12], 0, this.field719[var12], 192);
                    }
                    this.method291(this.field720[var12] + arg6, 401, this.field717[var12], this.field721[var12] + var9, this.field718[var12], arg4, this.field719[var12], var8);
                }
                arg6 += this.field722[var12];
                if ((this.field724.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method288(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field711 = 294;
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
                this.field725 = true;
            }
            if (arg1.equals("end")) {
                this.field725 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "([BIIIII)V")
    private void method289(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class46.field1162 * arg2 + arg1;
        int var8 = class46.field1162 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class46.field1164) {
            int var11 = class46.field1164 - arg2;
            arg4 -= var11;
            arg2 = class46.field1164;
            var10 += arg3 * var11;
            var7 += class46.field1162 * var11;
        }
        if (arg2 + arg4 >= class46.field1165) {
            arg4 -= arg2 + arg4 + 1 - class46.field1165;
        }
        if (arg1 < class46.field1166) {
            int var12 = class46.field1166 - arg1;
            arg3 -= var12;
            arg1 = class46.field1166;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class46.field1167) {
            int var13 = arg1 + arg3 + 1 - class46.field1167;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method290(class46.field1161, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method290(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "(II[BIIIII)V")
    private void method291(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class46.field1162 * arg3 + arg0;
        int var10 = class46.field1162 - arg4;
        int var11 = 0;
        int var12 = 0;
        int var13 = 31 / arg1;
        if (arg3 < class46.field1164) {
            int var14 = class46.field1164 - arg3;
            arg6 -= var14;
            arg3 = class46.field1164;
            var12 += arg4 * var14;
            var9 += class46.field1162 * var14;
        }
        if (arg3 + arg6 >= class46.field1165) {
            arg6 -= arg3 + arg6 + 1 - class46.field1165;
        }
        if (arg0 < class46.field1166) {
            int var15 = class46.field1166 - arg0;
            arg4 -= var15;
            arg0 = class46.field1166;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg0 + arg4 >= class46.field1167) {
            int var16 = arg0 + arg4 + 1 - class46.field1167;
            arg4 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg4 > 0 && arg6 > 0) {
            this.method292(arg2, var9, arg5, var12, var10, false, arg4, var11, arg7, class46.field1161, arg6);
        }
    }

    @OriginalMember(owner = "FDMAFIMR", name = "a", descriptor = "([BIIIIZIII[II)V")
    private void method292(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = ((arg2 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        int var13 = 256 - arg8;
        if (arg5) {
            return;
        }
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg3++] == 0) {
                    arg1++;
                } else {
                    int var16 = arg9[arg1];
                    arg9[arg1++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg4;
            arg3 += arg7;
        }
    }
}
