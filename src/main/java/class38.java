import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ONSICLVF")
public class class38 extends class8 {

    @OriginalMember(owner = "client!ONSICLVF", name = "w", descriptor = "I")
    private int field1153 = 9;

    @OriginalMember(owner = "client!ONSICLVF", name = "x", descriptor = "Z")
    private boolean field1154 = true;

    @OriginalMember(owner = "client!ONSICLVF", name = "y", descriptor = "B")
    private byte field1155 = 1;

    @OriginalMember(owner = "client!ONSICLVF", name = "z", descriptor = "B")
    private byte field1156 = 1;

    @OriginalMember(owner = "client!ONSICLVF", name = "A", descriptor = "Z")
    private boolean field1157 = false;

    @OriginalMember(owner = "client!ONSICLVF", name = "B", descriptor = "I")
    private int field1158 = 7;

    @OriginalMember(owner = "client!ONSICLVF", name = "C", descriptor = "[[B")
    public byte[][] field1159 = new byte[256][];

    @OriginalMember(owner = "client!ONSICLVF", name = "D", descriptor = "[I")
    public int[] field1160 = new int[256];

    @OriginalMember(owner = "client!ONSICLVF", name = "E", descriptor = "[I")
    public int[] field1161 = new int[256];

    @OriginalMember(owner = "client!ONSICLVF", name = "F", descriptor = "[I")
    public int[] field1162 = new int[256];

    @OriginalMember(owner = "client!ONSICLVF", name = "G", descriptor = "[I")
    public int[] field1163 = new int[256];

    @OriginalMember(owner = "client!ONSICLVF", name = "H", descriptor = "[I")
    public int[] field1164 = new int[256];

    @OriginalMember(owner = "client!ONSICLVF", name = "J", descriptor = "Ljava/util/Random;")
    public Random field1166 = new Random();

    @OriginalMember(owner = "client!ONSICLVF", name = "K", descriptor = "Z")
    public boolean field1167 = false;

    @OriginalMember(owner = "client!ONSICLVF", name = "I", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!ONSICLVF", name = "<init>", descriptor = "(BLWEMOPWVJ;ZLjava/lang/String;)V")
    public class38(byte arg0, class62 arg1, boolean arg2, String arg3) {
        class52 var5 = new class52(arg1.method559(arg3 + ".dat", null), true);
        class52 var6 = new class52(arg1.method559("index.dat", null), true);
        boolean var7 = true;
        if (this.field1155 != arg0) {
            this.field1157 = !this.field1157;
        }
        var6.field1434 = var5.method463() + 4;
        int var8 = var6.method461();
        if (var8 > 0) {
            var6.field1434 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1162[var9] = var6.method461();
            this.field1163[var9] = var6.method461();
            int var11 = this.field1160[var9] = var6.method463();
            int var12 = this.field1161[var9] = var6.method463();
            int var13 = var6.method461();
            int var14 = var11 * var12;
            this.field1159[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1159[var9][var15] = var5.method462();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1159[var9][var11 * var17 + var16] = var5.method462();
                    }
                }
            }
            if (var12 > this.field1165 && var9 < 128) {
                this.field1165 = var12;
            }
            this.field1162[var9] = 1;
            this.field1164[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1159[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1164[var9]--;
                this.field1162[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1159[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1164[var9]--;
            }
        }
        if (arg2) {
            this.field1164[32] = this.field1164[73];
        } else {
            this.field1164[32] = this.field1164[105];
            if (class31.field984) {
            }
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method359(int arg0, int arg1, String arg2, int arg3, int arg4) {
        this.method364(arg0, arg3, (byte) -120, arg4 - this.method363((byte) 0, arg2), arg2);
        if (arg1 <= 0) {
            this.field1157 = !this.field1157;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IBLjava/lang/String;II)V")
    public void method360(int arg0, byte arg1, String arg2, int arg3, int arg4) {
        if (arg1 != 33) {
            this.field1154 = !this.field1154;
        }
        this.method364(arg0, arg4, (byte) -120, arg3 - this.method363((byte) 0, arg2) / 2, arg2);
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public void method361(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        this.method368(arg5, arg4, arg2, -21100, arg0 - this.method362(arg2, 443) / 2, arg1);
        if (arg3 == -40792) {
            ;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method362(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1164[arg0.charAt(var4)];
            }
        }
        if (arg1 <= 0) {
            return 4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method363(byte arg0, String arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg1 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            var4 += this.field1164[arg1.charAt(var5)];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IIBILjava/lang/String;)V")
    public void method364(int arg0, int arg1, byte arg2, int arg3, String arg4) {
        if (arg4 == null) {
            return;
        }
        int var6 = arg0 - this.field1165;
        if (arg2 != -120) {
            return;
        }
        for (int var7 = 0; var7 < arg4.length(); var7++) {
            char var8 = arg4.charAt(var7);
            if (var8 != ' ') {
                this.method371(this.field1159[var8], this.field1162[var8] + arg3, this.field1163[var8] + var6, this.field1160[var8], this.field1161[var8], arg1);
            }
            arg3 += this.field1164[var8];
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method365(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg0 - this.method363((byte) 0, arg4) / 2;
        int var8 = arg5 - this.field1165;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method371(this.field1159[var10], this.field1162[var10] + var7, this.field1163[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1160[var10], this.field1161[var10], arg3);
            }
            var7 += this.field1164[var10];
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method366(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg4 - this.method363((byte) 0, arg0) / 2;
        int var8 = arg3 - this.field1165;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method371(this.field1159[var10], this.field1162[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1163[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1160[var10], this.field1161[var10], arg5);
            }
            var7 += this.field1164[var10];
        }
        if (arg2 <= 0) {
            this.field1153 = 358;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method367(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg5 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method363((byte) 0, arg3) / 2;
        int var11 = arg1 - this.field1165;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method371(this.field1159[var13], this.field1162[var13] + var10, this.field1163[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg4) * var8), this.field1160[var13], this.field1161[var13], arg2);
            }
            var10 += this.field1164[var13];
        }
        while (arg0 >= 0) {
            this.field1158 = -125;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public void method368(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -21100) {
            return;
        }
        this.field1167 = false;
        int var7 = arg4;
        if (arg2 == null) {
            return;
        }
        int var8 = arg5 - this.field1165;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method370(arg2.substring(var9 + 1, var9 + 4), -404);
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg2.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.method371(this.field1159[var11], this.field1162[var11] + arg4 + 1, this.field1163[var11] + var8 + 1, this.field1160[var11], this.field1161[var11], 0);
                    }
                    this.method371(this.field1159[var11], this.field1162[var11] + arg4, this.field1163[var11] + var8, this.field1160[var11], this.field1161[var11], arg0);
                }
                arg4 += this.field1164[var11];
            }
        }
        if (this.field1167) {
            class8.method167(var7, arg4 - var7, 0, 8388608, (int) ((double) this.field1165 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IILjava/lang/String;IIZZ)V")
    public void method369(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg2 == null) {
            return;
        }
        this.field1166.setSeed((long) arg3);
        int var8 = (this.field1166.nextInt() & 0x1F) + 192;
        int var9 = arg0 - this.field1165;
        if (!arg5) {
            return;
        }
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method370(arg2.substring(var10 + 1, var10 + 4), -404);
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method373(this.field1159[var12], 0, this.field1160[var12], this.field1161[var12], this.field1163[var12] + var9 + 1, this.field1162[var12] + arg4 + 1, 0, 192);
                    }
                    this.method373(this.field1159[var12], arg1, this.field1160[var12], this.field1161[var12], this.field1163[var12] + var9, this.field1162[var12] + arg4, 0, var8);
                }
                arg4 += this.field1164[var12];
                if ((this.field1166.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method370(String arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1157 = !this.field1157;
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
                this.field1167 = true;
            }
            if (arg0.equals("end")) {
                this.field1167 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "([BIIIII)V")
    private void method371(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class8.field582 * arg2 + arg1;
        int var8 = class8.field582 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class8.field584) {
            int var11 = class8.field584 - arg2;
            arg4 -= var11;
            arg2 = class8.field584;
            var10 += arg3 * var11;
            var7 += class8.field582 * var11;
        }
        if (arg2 + arg4 >= class8.field585) {
            arg4 -= arg2 + arg4 + 1 - class8.field585;
        }
        if (arg1 < class8.field586) {
            int var12 = class8.field586 - arg1;
            arg3 -= var12;
            arg1 = class8.field586;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class8.field587) {
            int var13 = arg1 + arg3 + 1 - class8.field587;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method372(class8.field581, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method372(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "([BIIIIIII)V")
    private void method373(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0) {
            this.field1154 = !this.field1154;
        }
        int var9 = class8.field582 * arg4 + arg5;
        int var10 = class8.field582 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg4 < class8.field584) {
            int var13 = class8.field584 - arg4;
            arg3 -= var13;
            arg4 = class8.field584;
            var12 += arg2 * var13;
            var9 += class8.field582 * var13;
        }
        if (arg3 + arg4 >= class8.field585) {
            arg3 -= arg3 + arg4 + 1 - class8.field585;
        }
        if (arg5 < class8.field586) {
            int var14 = class8.field586 - arg5;
            arg2 -= var14;
            arg5 = class8.field586;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg5 >= class8.field587) {
            int var15 = arg2 + arg5 + 1 - class8.field587;
            arg2 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg2 > 0 && arg3 > 0) {
            this.method374(var11, (byte) 1, arg7, arg3, var10, arg0, var9, class8.field581, arg2, var12, arg1);
        }
    }

    @OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IBIII[BI[IIII)V")
    private void method374(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (this.field1156 != arg1) {
            return;
        }
        int var12 = ((arg10 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg10 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        int var13 = 256 - arg2;
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = -arg8; var15 < 0; var15++) {
                if (arg5[arg9++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg7[arg6];
                    arg7[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg4;
            arg9 += arg0;
        }
    }
}
