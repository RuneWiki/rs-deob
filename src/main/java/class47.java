import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RGWSJTPO")
public class class47 extends class23 {

    @OriginalMember(owner = "RGWSJTPO", name = "w", descriptor = "Z")
    private boolean field1150 = false;

    @OriginalMember(owner = "RGWSJTPO", name = "x", descriptor = "I")
    private int field1151 = -14123;

    @OriginalMember(owner = "RGWSJTPO", name = "z", descriptor = "I")
    private int field1153 = 8;

    @OriginalMember(owner = "RGWSJTPO", name = "A", descriptor = "I")
    private int field1154 = 832;

    @OriginalMember(owner = "RGWSJTPO", name = "B", descriptor = "I")
    private int field1155 = 832;

    @OriginalMember(owner = "RGWSJTPO", name = "C", descriptor = "[[B")
    public byte[][] field1156 = new byte[256][];

    @OriginalMember(owner = "RGWSJTPO", name = "D", descriptor = "[I")
    public int[] field1157 = new int[256];

    @OriginalMember(owner = "RGWSJTPO", name = "E", descriptor = "[I")
    public int[] field1158 = new int[256];

    @OriginalMember(owner = "RGWSJTPO", name = "F", descriptor = "[I")
    public int[] field1159 = new int[256];

    @OriginalMember(owner = "RGWSJTPO", name = "G", descriptor = "[I")
    public int[] field1160 = new int[256];

    @OriginalMember(owner = "RGWSJTPO", name = "H", descriptor = "[I")
    public int[] field1161 = new int[256];

    @OriginalMember(owner = "RGWSJTPO", name = "J", descriptor = "Ljava/util/Random;")
    public Random field1163 = new Random();

    @OriginalMember(owner = "RGWSJTPO", name = "K", descriptor = "Z")
    public boolean field1164 = false;

    @OriginalMember(owner = "RGWSJTPO", name = "I", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "RGWSJTPO", name = "y", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "RGWSJTPO", name = "<init>", descriptor = "(Ljava/lang/String;ZLCXFTMSCH;I)V")
    public class47(String arg0, boolean arg1, class8 arg2, int arg3) {
        if (arg3 != 0) {
            this.field1151 = 60;
        }
        class33 var5 = new class33(true, arg2.method176(arg0 + ".dat", null));
        class33 var6 = new class33(true, arg2.method176("index.dat", null));
        boolean var7 = true;
        var6.field945 = var5.method327() + 4;
        int var8 = var6.method325();
        if (var8 > 0) {
            var6.field945 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1159[var9] = var6.method325();
            this.field1160[var9] = var6.method325();
            int var11 = this.field1157[var9] = var6.method327();
            int var12 = this.field1158[var9] = var6.method327();
            int var13 = var6.method325();
            int var14 = var11 * var12;
            this.field1156[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1156[var9][var15] = var5.method326();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1156[var9][var11 * var17 + var16] = var5.method326();
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
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method457(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method462(arg0, arg2, 0, arg3, arg4 - this.method461(arg2, 7));
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method458(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg4 == 0) {
            this.method462(arg1, arg3, 0, arg0, arg2 - this.method461(arg3, 7) / 2);
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(Ljava/lang/String;IZIBI)V")
    public void method459(String arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == -38) {
            this.method466(arg5, 8, arg2, arg0, arg3 - this.method460(arg0, 5) / 2, arg1);
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method460(String arg0, int arg1) {
        if (arg1 != 5) {
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
                var4 += this.field1161[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "RGWSJTPO", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method461(String arg0, int arg1) {
        if (arg1 != 7) {
            this.field1150 = !this.field1150;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field1161[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method462(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            this.field1150 = !this.field1150;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field1162;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method469(this.field1156[var8], this.field1159[var8] + arg4, this.field1160[var8] + var6, this.field1157[var8], this.field1158[var8], arg0);
            }
            arg4 += this.field1161[var8];
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method463(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg1 - this.method461(arg3, 7) / 2;
        int var8 = arg4 - this.field1162;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method469(this.field1156[var10], this.field1159[var10] + var7, this.field1160[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1157[var10], this.field1158[var10], arg2);
            }
            var7 += this.field1161[var10];
        }
        while (arg5 >= 0) {
            this.field1150 = !this.field1150;
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method464(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg1 - this.method461(arg5, 7) / 2;
        if (arg4 != 0) {
            return;
        }
        int var8 = arg0 - this.field1162;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method469(this.field1156[var10], this.field1159[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1160[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1157[var10], this.field1158[var10], arg3);
            }
            var7 += this.field1161[var10];
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method465(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg3 - this.method461(arg5, 7) / 2;
        int var11 = arg4 - this.field1162;
        if (arg1 != -49901) {
            return;
        }
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method469(this.field1156[var13], this.field1159[var13] + var10, this.field1160[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg0) * var8), this.field1157[var13], this.field1158[var13], arg2);
            }
            var10 += this.field1161[var13];
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
    public void method466(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
        this.field1164 = false;
        if (this.field1153 != arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg4;
        if (arg3 == null) {
            return;
        }
        int var9 = arg0 - this.field1162;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method468(arg3.substring(var10 + 1, var10 + 4), this.field1154);
                if (var11 != -1) {
                    arg5 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method469(this.field1156[var12], this.field1159[var12] + arg4 + 1, this.field1160[var12] + var9 + 1, this.field1157[var12], this.field1158[var12], 0);
                    }
                    this.method469(this.field1156[var12], this.field1159[var12] + arg4, this.field1160[var12] + var9, this.field1157[var12], this.field1158[var12], arg5);
                }
                arg4 += this.field1161[var12];
            }
        }
        if (this.field1164) {
            class23.method261(8388608, (byte) 6, var8, arg4 - var8, (int) ((double) this.field1162 * 0.7D) + var9);
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(Ljava/lang/String;BZIIII)V")
    public void method467(String arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.field1163.setSeed((long) arg6);
        int var8 = (this.field1163.nextInt() & 0x1F) + 192;
        int var9 = arg5 - this.field1162;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var12 = this.method468(arg0.substring(var10 + 1, var10 + 4), this.field1154);
                if (var12 != -1) {
                    arg4 = var12;
                }
                var10 += 4;
            } else {
                char var13 = arg0.charAt(var10);
                if (var13 != ' ') {
                    if (arg2) {
                        this.method471(this.field1157[var13], this.field1159[var13] + arg3 + 1, false, this.field1158[var13], 192, this.field1156[var13], 0, this.field1160[var13] + var9 + 1);
                    }
                    this.method471(this.field1157[var13], this.field1159[var13] + arg3, false, this.field1158[var13], var8, this.field1156[var13], arg4, this.field1160[var13] + var9);
                }
                arg3 += this.field1161[var13];
                if ((this.field1163.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
        if (arg1 == 2) {
            boolean var11 = false;
        } else {
            this.field1154 = -474;
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public int method468(String arg0, int arg1) {
        if (arg1 <= 0) {
            return this.field1152;
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
                this.field1164 = true;
            }
            if (arg0.equals("end")) {
                this.field1164 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "([BIIIII)V")
    private void method469(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class23.field783 * arg2 + arg1;
        int var8 = class23.field783 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class23.field785) {
            int var11 = class23.field785 - arg2;
            arg4 -= var11;
            arg2 = class23.field785;
            var10 += arg3 * var11;
            var7 += class23.field783 * var11;
        }
        if (arg2 + arg4 >= class23.field786) {
            arg4 -= arg2 + arg4 + 1 - class23.field786;
        }
        if (arg1 < class23.field787) {
            int var12 = class23.field787 - arg1;
            arg3 -= var12;
            arg1 = class23.field787;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class23.field788) {
            int var13 = arg1 + arg3 + 1 - class23.field788;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method470(class23.field782, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method470(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IIZII[BII)V")
    private void method471(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        if (arg2) {
            this.field1150 = !this.field1150;
        }
        int var9 = class23.field783 * arg7 + arg1;
        int var10 = class23.field783 - arg0;
        int var11 = 0;
        int var12 = 0;
        if (arg7 < class23.field785) {
            int var13 = class23.field785 - arg7;
            arg3 -= var13;
            arg7 = class23.field785;
            var12 += arg0 * var13;
            var9 += class23.field783 * var13;
        }
        if (arg3 + arg7 >= class23.field786) {
            arg3 -= arg3 + arg7 + 1 - class23.field786;
        }
        if (arg1 < class23.field787) {
            int var14 = class23.field787 - arg1;
            arg0 -= var14;
            arg1 = class23.field787;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg1 >= class23.field788) {
            int var15 = arg0 + arg1 + 1 - class23.field788;
            arg0 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg0 > 0 && arg3 > 0) {
            this.method472(arg4, (byte) 3, arg3, var9, var10, class23.field782, arg5, var12, arg0, arg6, var11);
        }
    }

    @OriginalMember(owner = "RGWSJTPO", name = "a", descriptor = "(IBIII[I[BIIII)V")
    private void method472(int arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg9 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg0 & 0xFF0000) >> 8;
        if (arg1 != 3) {
            return;
        }
        int var13 = 256 - arg0;
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg8; var15 < 0; var15++) {
                if (arg6[arg7++] == 0) {
                    arg3++;
                } else {
                    int var16 = arg5[arg3];
                    arg5[arg3++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg3 += arg4;
            arg7 += arg10;
        }
    }
}
