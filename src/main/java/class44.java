import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NSKCCMMO")
public class class44 extends class36 {

    @OriginalMember(owner = "NSKCCMMO", name = "z", descriptor = "I")
    private int field1149 = 564;

    @OriginalMember(owner = "NSKCCMMO", name = "A", descriptor = "I")
    private int field1150 = 5;

    @OriginalMember(owner = "NSKCCMMO", name = "C", descriptor = "Z")
    private boolean field1152 = true;

    @OriginalMember(owner = "NSKCCMMO", name = "D", descriptor = "Z")
    private boolean field1153 = true;

    @OriginalMember(owner = "NSKCCMMO", name = "E", descriptor = "I")
    private int field1154 = 123;

    @OriginalMember(owner = "NSKCCMMO", name = "F", descriptor = "I")
    private int field1155 = 123;

    @OriginalMember(owner = "NSKCCMMO", name = "G", descriptor = "[[B")
    public byte[][] field1156 = new byte[256][];

    @OriginalMember(owner = "NSKCCMMO", name = "H", descriptor = "[I")
    public int[] field1157 = new int[256];

    @OriginalMember(owner = "NSKCCMMO", name = "I", descriptor = "[I")
    public int[] field1158 = new int[256];

    @OriginalMember(owner = "NSKCCMMO", name = "J", descriptor = "[I")
    public int[] field1159 = new int[256];

    @OriginalMember(owner = "NSKCCMMO", name = "K", descriptor = "[I")
    public int[] field1160 = new int[256];

    @OriginalMember(owner = "NSKCCMMO", name = "L", descriptor = "[I")
    public int[] field1161 = new int[256];

    @OriginalMember(owner = "NSKCCMMO", name = "N", descriptor = "Ljava/util/Random;")
    public Random field1163 = new Random();

    @OriginalMember(owner = "NSKCCMMO", name = "O", descriptor = "Z")
    public boolean field1164 = false;

    @OriginalMember(owner = "NSKCCMMO", name = "M", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "NSKCCMMO", name = "B", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "NSKCCMMO", name = "<init>", descriptor = "(Ljava/lang/String;ZLXMRRKSSB;I)V")
    public class44(String arg0, boolean arg1, class60 arg2, int arg3) {
        class62 var5 = new class62(arg2.method465(arg0 + ".dat", null), 49938);
        class62 var6 = new class62(arg2.method465("index.dat", null), 49938);
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        boolean var7 = true;
        var6.field1542 = var5.method480() + 4;
        int var8 = var6.method478();
        if (var8 > 0) {
            var6.field1542 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1159[var9] = var6.method478();
            this.field1160[var9] = var6.method478();
            int var11 = this.field1157[var9] = var6.method480();
            int var12 = this.field1158[var9] = var6.method480();
            int var13 = var6.method478();
            int var14 = var11 * var12;
            this.field1156[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1156[var9][var15] = var5.method479();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1156[var9][var11 * var17 + var16] = var5.method479();
                    }
                }
            }
            if (var12 > this.field1162 && var9 < 128) {
                this.field1162 = var12;
            }
            this.field1159[var9] = 1;
            this.field1161[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1156[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1161[var9]--;
                this.field1159[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1156[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1161[var9]--;
            }
        }
        if (arg1) {
            this.field1161[32] = this.field1161[73];
        } else {
            this.field1161[32] = this.field1161[105];
            if (class15.field717) {
            }
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(ILjava/lang/String;BII)V")
    public void method369(int arg0, String arg1, byte arg2, int arg3, int arg4) {
        this.method374(0, arg4, arg1, arg3 - this.method373(arg1, (byte) 3), arg0);
        if (arg2 != 7) {
            this.field1151 = -54;
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;IZII)V")
    public void method370(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.method374(0, arg4, arg0, arg1 - this.method373(arg0, (byte) 3) / 2, arg3);
        if (!arg2) {
            ;
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public void method371(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        this.method378(arg2, arg4, arg1 - this.method372(arg2, 23764) / 2, this.field1153, arg3, arg0);
        if (arg5 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method372(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != 23764) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field1161[arg0.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method373(String arg0, byte arg1) {
        if (arg1 != 3) {
            return 4;
        }
        boolean var3 = false;
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var4 += this.field1161[arg0.charAt(var5)];
        }
        return var4;
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method374(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg1 - this.field1162;
        if (arg0 != 0) {
            this.field1153 = !this.field1153;
        }
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 != ' ') {
                this.method381(this.field1156[var8], this.field1159[var8] + arg3, this.field1160[var8] + var6, this.field1157[var8], this.field1158[var8], arg4);
            }
            arg3 += this.field1161[var8];
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
    public void method375(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method373(arg0, (byte) 3) / 2;
        if (!arg5) {
            this.field1150 = 12;
        }
        int var8 = arg4 - this.field1162;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method381(this.field1156[var10], this.field1159[var10] + var7, this.field1160[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1157[var10], this.field1158[var10], arg3);
            }
            var7 += this.field1161[var10];
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
    public void method376(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg4 - this.method373(arg0, (byte) 3) / 2;
        if (arg2 != 9) {
            return;
        }
        int var8 = arg5 - this.field1162;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method381(this.field1156[var10], this.field1159[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1160[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1157[var10], this.field1158[var10], arg3);
            }
            var7 += this.field1161[var10];
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
    public void method377(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg2 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg3 - this.method373(arg0, (byte) 3) / 2;
        int var11 = arg6 - this.field1162;
        for (int var12 = 0; var12 < arg0.length(); var12++) {
            char var14 = arg0.charAt(var12);
            if (var14 != ' ') {
                this.method381(this.field1156[var14], this.field1159[var14] + var10, this.field1160[var14] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg1) * var8), this.field1157[var14], this.field1158[var14], arg5);
            }
            var10 += this.field1161[var14];
        }
        if (arg4 == 6) {
            boolean var13 = false;
        } else {
            this.field1149 = 85;
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(Ljava/lang/String;ZIZII)V")
    public void method378(String arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field1164 = false;
        if (!arg3) {
            this.field1151 = -119;
        }
        int var7 = arg2;
        if (arg0 == null) {
            return;
        }
        int var8 = arg4 - this.field1162;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method380(this.field1154, arg0.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.method381(this.field1156[var11], this.field1159[var11] + arg2 + 1, this.field1160[var11] + var8 + 1, this.field1157[var11], this.field1158[var11], 0);
                    }
                    this.method381(this.field1156[var11], this.field1159[var11] + arg2, this.field1160[var11] + var8, this.field1157[var11], this.field1158[var11], arg5);
                }
                arg2 += this.field1161[var11];
            }
        }
        if (this.field1164) {
            class36.method347(arg2 - var7, (int) ((double) this.field1162 * 0.7D) + var8, 0, 8388608, var7);
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(IZIIILjava/lang/String;I)V")
    public void method379(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        this.field1163.setSeed((long) arg4);
        int var8 = (this.field1163.nextInt() & 0x1F) + 192;
        if (arg2 >= 0) {
            return;
        }
        int var9 = arg3 - this.field1162;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method380(this.field1154, arg5.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg0 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method383(this.field1160[var12] + var9 + 1, true, this.field1156[var12], this.field1157[var12], 0, this.field1159[var12] + arg6 + 1, this.field1158[var12], 192);
                    }
                    this.method383(this.field1160[var12] + var9, true, this.field1156[var12], this.field1157[var12], arg0, this.field1159[var12] + arg6, this.field1158[var12], var8);
                }
                arg6 += this.field1161[var12];
                if ((this.field1163.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method380(int arg0, String arg1) {
        int var3 = 52 / arg0;
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
                this.field1164 = true;
            }
            if (arg1.equals("end")) {
                this.field1164 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "([BIIIII)V")
    private void method381(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class36.field1089 * arg2 + arg1;
        int var8 = class36.field1089 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class36.field1091) {
            int var11 = class36.field1091 - arg2;
            arg4 -= var11;
            arg2 = class36.field1091;
            var10 += arg3 * var11;
            var7 += class36.field1089 * var11;
        }
        if (arg2 + arg4 >= class36.field1092) {
            arg4 -= arg2 + arg4 + 1 - class36.field1092;
        }
        if (arg1 < class36.field1093) {
            int var12 = class36.field1093 - arg1;
            arg3 -= var12;
            arg1 = class36.field1093;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class36.field1094) {
            int var13 = arg1 + arg3 + 1 - class36.field1094;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method382(class36.field1088, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method382(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "(IZ[BIIIII)V")
    private void method383(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class36.field1089 * arg0 + arg5;
        int var10 = class36.field1089 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class36.field1091) {
            int var13 = class36.field1091 - arg0;
            arg6 -= var13;
            arg0 = class36.field1091;
            var12 += arg3 * var13;
            var9 += class36.field1089 * var13;
        }
        if (arg0 + arg6 >= class36.field1092) {
            arg6 -= arg0 + arg6 + 1 - class36.field1092;
        }
        if (arg5 < class36.field1093) {
            int var14 = class36.field1093 - arg5;
            arg3 -= var14;
            arg5 = class36.field1093;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg5 >= class36.field1094) {
            int var15 = arg3 + arg5 + 1 - class36.field1094;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 <= 0 || arg6 <= 0) {
            return;
        }
        this.method384(arg2, var11, arg7, class36.field1088, var9, var10, (byte) 6, arg3, arg6, arg4, var12);
        if (!arg1) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "NSKCCMMO", name = "a", descriptor = "([BII[IIIBIIII)V")
    private void method384(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg9 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        if (arg6 != 6) {
            return;
        }
        int var13 = 256 - arg2;
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg0[arg10++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg3[arg4];
                    arg3[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg5;
            arg10 += arg1;
        }
    }
}
