import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LICHOWDY")
public class class36 extends class26 {

    @OriginalMember(owner = "client!LICHOWDY", name = "z", descriptor = "Z")
    private boolean field1182 = true;

    @OriginalMember(owner = "client!LICHOWDY", name = "A", descriptor = "I")
    private int field1183 = 435;

    @OriginalMember(owner = "client!LICHOWDY", name = "B", descriptor = "I")
    private int field1184 = 712;

    @OriginalMember(owner = "client!LICHOWDY", name = "C", descriptor = "I")
    private int field1185 = 266;

    @OriginalMember(owner = "client!LICHOWDY", name = "D", descriptor = "[[B")
    public byte[][] field1186 = new byte[256][];

    @OriginalMember(owner = "client!LICHOWDY", name = "E", descriptor = "[I")
    public int[] field1187 = new int[256];

    @OriginalMember(owner = "client!LICHOWDY", name = "F", descriptor = "[I")
    public int[] field1188 = new int[256];

    @OriginalMember(owner = "client!LICHOWDY", name = "G", descriptor = "[I")
    public int[] field1189 = new int[256];

    @OriginalMember(owner = "client!LICHOWDY", name = "H", descriptor = "[I")
    public int[] field1190 = new int[256];

    @OriginalMember(owner = "client!LICHOWDY", name = "I", descriptor = "[I")
    public int[] field1191 = new int[256];

    @OriginalMember(owner = "client!LICHOWDY", name = "K", descriptor = "Ljava/util/Random;")
    public Random field1193 = new Random();

    @OriginalMember(owner = "client!LICHOWDY", name = "L", descriptor = "Z")
    public boolean field1194 = false;

    @OriginalMember(owner = "client!LICHOWDY", name = "J", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!LICHOWDY", name = "<init>", descriptor = "(ILJUPFHAZZ;Ljava/lang/String;Z)V")
    public class36(int arg0, class32 arg1, String arg2, boolean arg3) {
        int var5 = 38 / arg0;
        class59 var6 = new class59(859, arg1.method372(arg2 + ".dat", null));
        class59 var7 = new class59(859, arg1.method372("index.dat", null));
        boolean var8 = true;
        var7.field1589 = var6.method531() + 4;
        int var9 = var7.method529();
        if (var9 > 0) {
            var7.field1589 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field1189[var10] = var7.method529();
            this.field1190[var10] = var7.method529();
            int var12 = this.field1187[var10] = var7.method531();
            int var13 = this.field1188[var10] = var7.method531();
            int var14 = var7.method529();
            int var15 = var12 * var13;
            this.field1186[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field1186[var10][var16] = var6.method530();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field1186[var10][var12 * var18 + var17] = var6.method530();
                    }
                }
            }
            if (var13 > this.field1192 && var10 < 128) {
                this.field1192 = var13;
            }
            this.field1189[var10] = 1;
            this.field1191[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field1186[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field1191[var10]--;
                this.field1189[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field1186[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field1191[var10]--;
            }
        }
        if (arg3) {
            this.field1191[32] = this.field1191[73];
        } else {
            this.field1191[32] = this.field1191[105];
            if (class67.field1688) {
            }
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method379(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method384(arg3, arg2, arg4 - this.method383(arg3, -117), this.field1182, arg1);
        if (arg0 >= 0) {
            this.field1182 = !this.field1182;
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
    public void method380(String arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 0) {
            this.method384(arg0, arg3, arg2 - this.method383(arg0, -117) / 2, this.field1182, arg4);
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
    public void method381(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.method388(0, arg5 - this.method382(arg1, (byte) 3) / 2, arg3, arg4, arg2, arg1);
        if (arg0 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method382(String arg0, byte arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 == 3) {
            boolean var4 = false;
        } else {
            this.field1182 = !this.field1182;
        }
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field1191[arg0.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method383(String arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1182 = !this.field1182;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field1191[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
    public void method384(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.field1192;
        if (!arg3) {
            return;
        }
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method391(this.field1186[var8], this.field1189[var8] + arg2, this.field1190[var8] + var6, this.field1187[var8], this.field1188[var8], arg4);
            }
            arg2 += this.field1191[var8];
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method385(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg4 - this.method383(arg5, -117) / 2;
        if (arg0 >= 0) {
            return;
        }
        int var8 = arg1 - this.field1192;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method391(this.field1186[var10], this.field1189[var10] + var7, this.field1190[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1187[var10], this.field1188[var10], arg3);
            }
            var7 += this.field1191[var10];
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "b", descriptor = "(IIIIILjava/lang/String;)V")
    public void method386(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg1 <= 0) {
            this.field1183 = 163;
        }
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method383(arg5, -117) / 2;
        int var8 = arg2 - this.field1192;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method391(this.field1186[var10], this.field1189[var10] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1190[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1187[var10], this.field1188[var10], arg4);
            }
            var7 += this.field1191[var10];
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method387(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method383(arg3, -117) / 2;
        int var11 = arg5 - this.field1192;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method391(this.field1186[var13], this.field1189[var13] + var10, this.field1190[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field1187[var13], this.field1188[var13], arg0);
            }
            var10 += this.field1191[var13];
        }
        if (arg1 <= 0) {
            this.field1184 = -5;
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
    public void method388(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        this.field1194 = false;
        int var7 = arg1;
        if (arg0 < 0 || arg0 > 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg5 == null) {
            return;
        }
        int var9 = arg2 - this.field1192;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method390(arg5.substring(var10 + 1, var10 + 4), this.field1185);
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg4) {
                        this.method391(this.field1186[var12], this.field1189[var12] + arg1 + 1, this.field1190[var12] + var9 + 1, this.field1187[var12], this.field1188[var12], 0);
                    }
                    this.method391(this.field1186[var12], this.field1189[var12] + arg1, this.field1190[var12] + var9, this.field1187[var12], this.field1188[var12], arg3);
                }
                arg1 += this.field1191[var12];
            }
        }
        if (this.field1194) {
            class26.method259(arg1 - var7, var7, (int) ((double) this.field1192 * 0.7D) + var9, 8388608, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(IIIIZLjava/lang/String;I)V")
    public void method389(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        this.field1193.setSeed((long) arg0);
        int var8 = (this.field1193.nextInt() & 0x1F) + 192;
        int var9 = arg1 - this.field1192;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method390(arg5.substring(var10 + 1, var10 + 4), this.field1185);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg4) {
                        this.method393(this.field1190[var12] + var9 + 1, this.field1188[var12], this.field1186[var12], 0, this.field1189[var12] + arg3 + 1, 192, this.field1187[var12], true);
                    }
                    this.method393(this.field1190[var12] + var9, this.field1188[var12], this.field1186[var12], arg2, this.field1189[var12] + arg3, var8, this.field1187[var12], true);
                }
                arg3 += this.field1191[var12];
                if ((this.field1193.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
        if (arg6 == 21911) {
            ;
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method390(String arg0, int arg1) {
        int var3 = 17 / arg1;
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
                this.field1194 = true;
            }
            if (arg0.equals("end")) {
                this.field1194 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "([BIIIII)V")
    private void method391(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class26.field918 * arg2 + arg1;
        int var8 = class26.field918 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class26.field920) {
            int var11 = class26.field920 - arg2;
            arg4 -= var11;
            arg2 = class26.field920;
            var10 += arg3 * var11;
            var7 += class26.field918 * var11;
        }
        if (arg2 + arg4 >= class26.field921) {
            arg4 -= arg2 + arg4 + 1 - class26.field921;
        }
        if (arg1 < class26.field922) {
            int var12 = class26.field922 - arg1;
            arg3 -= var12;
            arg1 = class26.field922;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class26.field923) {
            int var13 = arg1 + arg3 + 1 - class26.field923;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method392(class26.field917, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method392(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "(II[BIIIIZ)V")
    private void method393(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            this.field1184 = 300;
        }
        int var9 = class26.field918 * arg0 + arg4;
        int var10 = class26.field918 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class26.field920) {
            int var13 = class26.field920 - arg0;
            arg1 -= var13;
            arg0 = class26.field920;
            var12 += arg6 * var13;
            var9 += class26.field918 * var13;
        }
        if (arg0 + arg1 >= class26.field921) {
            arg1 -= arg0 + arg1 + 1 - class26.field921;
        }
        if (arg4 < class26.field922) {
            int var14 = class26.field922 - arg4;
            arg6 -= var14;
            arg4 = class26.field922;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg6 >= class26.field923) {
            int var15 = arg4 + arg6 + 1 - class26.field923;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg1 > 0) {
            this.method394(arg2, var9, arg3, var12, var10, arg1, arg5, arg6, class26.field917, 0, var11);
        }
    }

    @OriginalMember(owner = "client!LICHOWDY", name = "a", descriptor = "([BIIIIIII[III)V")
    private void method394(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = ((arg2 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg6 & 0xFF0000) >> 8;
        if (arg9 != 0) {
            this.field1185 = -193;
        }
        int var13 = 256 - arg6;
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg0[arg3++] == 0) {
                    arg1++;
                } else {
                    int var16 = arg8[arg1];
                    arg8[arg1++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg4;
            arg3 += arg10;
        }
    }
}
