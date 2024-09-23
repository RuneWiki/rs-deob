import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JLICUWSE")
public class class35 extends class53 {

    @OriginalMember(owner = "JLICUWSE", name = "A", descriptor = "I")
    private int field1184 = 1;

    @OriginalMember(owner = "JLICUWSE", name = "B", descriptor = "Z")
    private boolean field1185 = true;

    @OriginalMember(owner = "JLICUWSE", name = "C", descriptor = "I")
    private int field1186 = 411;

    @OriginalMember(owner = "JLICUWSE", name = "D", descriptor = "Z")
    private boolean field1187 = true;

    @OriginalMember(owner = "JLICUWSE", name = "E", descriptor = "B")
    private byte field1188 = 9;

    @OriginalMember(owner = "JLICUWSE", name = "F", descriptor = "I")
    private int field1189 = 4;

    @OriginalMember(owner = "JLICUWSE", name = "G", descriptor = "Z")
    private boolean field1190 = true;

    @OriginalMember(owner = "JLICUWSE", name = "H", descriptor = "B")
    private byte field1191 = 4;

    @OriginalMember(owner = "JLICUWSE", name = "I", descriptor = "[[B")
    public byte[][] field1192 = new byte[256][];

    @OriginalMember(owner = "JLICUWSE", name = "J", descriptor = "[I")
    public int[] field1193 = new int[256];

    @OriginalMember(owner = "JLICUWSE", name = "K", descriptor = "[I")
    public int[] field1194 = new int[256];

    @OriginalMember(owner = "JLICUWSE", name = "L", descriptor = "[I")
    public int[] field1195 = new int[256];

    @OriginalMember(owner = "JLICUWSE", name = "M", descriptor = "[I")
    public int[] field1196 = new int[256];

    @OriginalMember(owner = "JLICUWSE", name = "N", descriptor = "[I")
    public int[] field1197 = new int[256];

    @OriginalMember(owner = "JLICUWSE", name = "P", descriptor = "Ljava/util/Random;")
    public Random field1199 = new Random();

    @OriginalMember(owner = "JLICUWSE", name = "Q", descriptor = "Z")
    public boolean field1200 = false;

    @OriginalMember(owner = "JLICUWSE", name = "O", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "JLICUWSE", name = "<init>", descriptor = "(Ljava/lang/String;ZLDYBMLHQM;B)V")
    public class35(String arg0, boolean arg1, class16 arg2, byte arg3) {
        class29 var5 = new class29((byte) -28, arg2.method248(arg0 + ".dat", null));
        class29 var6 = new class29((byte) -28, arg2.method248("index.dat", null));
        boolean var7 = true;
        var6.field1107 = var5.method310() + 4;
        int var8 = var6.method308();
        if (var8 > 0) {
            var6.field1107 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1195[var9] = var6.method308();
            this.field1196[var9] = var6.method308();
            int var13 = this.field1193[var9] = var6.method310();
            int var14 = this.field1194[var9] = var6.method310();
            int var15 = var6.method308();
            int var16 = var13 * var14;
            this.field1192[var9] = new byte[var16];
            if (var15 == 0) {
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field1192[var9][var17] = var5.method309();
                }
            } else if (var15 == 1) {
                for (int var18 = 0; var18 < var13; var18++) {
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field1192[var9][var13 * var19 + var18] = var5.method309();
                    }
                }
            }
            if (var14 > this.field1198 && var9 < 128) {
                this.field1198 = var14;
            }
            this.field1195[var9] = 1;
            this.field1197[var9] = var13 + 2;
            int var20 = 0;
            for (int var21 = var14 / 7; var21 < var14; var21++) {
                var20 += this.field1192[var9][var13 * var21];
            }
            int var10002;
            if (var20 <= var14 / 7) {
                var10002 = this.field1197[var9]--;
                this.field1195[var9] = 0;
            }
            int var22 = 0;
            for (int var23 = var14 / 7; var23 < var14; var23++) {
                var22 += this.field1192[var9][var13 * var23 + var13 - 1];
            }
            if (var22 <= var14 / 7) {
                var10002 = this.field1197[var9]--;
            }
        }
        if (arg3 == 9) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        if (arg1) {
            this.field1197[32] = this.field1197[73];
        } else {
            this.field1197[32] = this.field1197[105];
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method355(String arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method360(true, arg3 - this.method359(arg0, -529), arg1, arg0, arg2);
        if (arg4 >= 0) {
            this.field1184 = -236;
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method356(int arg0, int arg1, int arg2, String arg3, int arg4) {
        int var6 = 57 / arg0;
        this.method360(true, arg4 - this.method359(arg3, -529) / 2, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(ZIILjava/lang/String;II)V")
    public void method357(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        this.method364(arg2, arg4, (byte) 9, arg1 - this.method358(this.field1187, arg3) / 2, arg0, arg3);
        if (this.field1189 != arg5) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method358(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field1197[arg1.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method359(String arg0, int arg1) {
        if (arg1 >= 0) {
            return 2;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field1197[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(ZIILjava/lang/String;I)V")
    public void method360(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg4 - this.field1198;
        if (!arg0) {
            this.field1187 = !this.field1187;
        }
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            char var8 = arg3.charAt(var7);
            if (var8 != ' ') {
                this.method367(this.field1192[var8], this.field1195[var8] + arg1, this.field1196[var8] + var6, this.field1193[var8], this.field1194[var8], arg2);
            }
            arg1 += this.field1197[var8];
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method361(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method359(arg1, -529) / 2;
        int var8 = arg4 - this.field1198;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method367(this.field1192[var10], this.field1195[var10] + var7, this.field1196[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1193[var10], this.field1194[var10], arg5);
            }
            var7 += this.field1197[var10];
        }
        if (arg3 == -44040) {
            ;
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "b", descriptor = "(ILjava/lang/String;IIII)V")
    public void method362(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg5 - this.method359(arg1, -529) / 2;
        if (arg4 != 7) {
            this.field1185 = !this.field1185;
        }
        int var8 = arg2 - this.field1198;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method367(this.field1192[var10], this.field1195[var10] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1196[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1193[var10], this.field1194[var10], arg3);
            }
            var7 += this.field1197[var10];
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method363(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg2 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method359(arg5, -529) / 2;
        int var11 = arg1 - this.field1198;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method367(this.field1192[var13], this.field1195[var13] + var10, this.field1196[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg0) * var8), this.field1193[var13], this.field1194[var13], arg3);
            }
            var10 += this.field1197[var13];
        }
        if (arg4 != 0) {
            this.field1186 = 426;
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(IIBIZLjava/lang/String;)V")
    public void method364(int arg0, int arg1, byte arg2, int arg3, boolean arg4, String arg5) {
        this.field1200 = false;
        if (arg2 != 9) {
            return;
        }
        int var7 = arg3;
        if (arg5 == null) {
            return;
        }
        int var8 = arg1 - this.field1198;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method366(this.field1191, arg5.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg4) {
                        this.method367(this.field1192[var11], this.field1195[var11] + arg3 + 1, this.field1196[var11] + var8 + 1, this.field1193[var11], this.field1194[var11], 0);
                    }
                    this.method367(this.field1192[var11], this.field1195[var11] + arg3, this.field1196[var11] + var8, this.field1193[var11], this.field1194[var11], arg0);
                }
                arg3 += this.field1197[var11];
            }
        }
        if (this.field1200) {
            class53.method461(arg3 - var7, this.field1188, var7, (int) ((double) this.field1198 * 0.7D) + var8, 8388608);
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(IZLjava/lang/String;IIII)V")
    public void method365(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == null) {
            return;
        }
        this.field1199.setSeed((long) arg5);
        int var8 = (this.field1199.nextInt() & 0x1F) + 192;
        int var9 = arg0 - this.field1198;
        if (arg4 != 1) {
            return;
        }
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method366(this.field1191, arg2.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method369(this.field1196[var12] + var9 + 1, this.field1195[var12] + arg6 + 1, 5, this.field1192[var12], 0, 192, this.field1193[var12], this.field1194[var12]);
                    }
                    this.method369(this.field1196[var12] + var9, this.field1195[var12] + arg6, 5, this.field1192[var12], arg3, var8, this.field1193[var12], this.field1194[var12]);
                }
                arg6 += this.field1197[var12];
                if ((this.field1199.nextInt() & 0x3) == 0) {
                    arg6++;
                }
            }
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method366(byte arg0, String arg1) {
        if (arg0 != 4) {
            return 4;
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
                this.field1200 = true;
            }
            if (arg1.equals("end")) {
                this.field1200 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "([BIIIII)V")
    private void method367(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class53.field1382 * arg2 + arg1;
        int var8 = class53.field1382 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class53.field1384) {
            int var11 = class53.field1384 - arg2;
            arg4 -= var11;
            arg2 = class53.field1384;
            var10 += arg3 * var11;
            var7 += class53.field1382 * var11;
        }
        if (arg2 + arg4 >= class53.field1385) {
            arg4 -= arg2 + arg4 + 1 - class53.field1385;
        }
        if (arg1 < class53.field1386) {
            int var12 = class53.field1386 - arg1;
            arg3 -= var12;
            arg1 = class53.field1386;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class53.field1387) {
            int var13 = arg1 + arg3 + 1 - class53.field1387;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method368(class53.field1381, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method368(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(III[BIIII)V")
    private void method369(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class53.field1382 * arg0 + arg1;
        int var10 = class53.field1382 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class53.field1384) {
            int var13 = class53.field1384 - arg0;
            arg7 -= var13;
            arg0 = class53.field1384;
            var12 += arg6 * var13;
            var9 += class53.field1382 * var13;
        }
        if (arg0 + arg7 >= class53.field1385) {
            arg7 -= arg0 + arg7 + 1 - class53.field1385;
        }
        if (arg1 < class53.field1386) {
            int var14 = class53.field1386 - arg1;
            arg6 -= var14;
            arg1 = class53.field1386;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg6 >= class53.field1387) {
            int var15 = arg1 + arg6 + 1 - class53.field1387;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg7 > 0) {
            this.method370(var12, arg3, arg6, class53.field1381, arg4, var10, arg5, 247, var11, var9, arg7);
            if (arg2 == 5) {
                ;
            }
        }
    }

    @OriginalMember(owner = "JLICUWSE", name = "a", descriptor = "(I[BI[IIIIIIII)V")
    private void method370(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg7 <= 0) {
            return;
        }
        int var12 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
        int var13 = 256 - arg6;
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                if (arg1[arg0++] == 0) {
                    arg9++;
                } else {
                    int var16 = arg3[arg9];
                    arg3[arg9++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg9 += arg5;
            arg0 += arg8;
        }
    }
}
