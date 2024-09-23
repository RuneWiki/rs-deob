import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DBRMEPJQ")
public class class11 extends class50 {

    @OriginalMember(owner = "DBRMEPJQ", name = "D", descriptor = "I")
    private int field708 = -558;

    @OriginalMember(owner = "DBRMEPJQ", name = "E", descriptor = "I")
    private int field709 = 68;

    @OriginalMember(owner = "DBRMEPJQ", name = "F", descriptor = "Z")
    private boolean field710 = false;

    @OriginalMember(owner = "DBRMEPJQ", name = "G", descriptor = "B")
    private byte field711 = 2;

    @OriginalMember(owner = "DBRMEPJQ", name = "H", descriptor = "Z")
    private boolean field712 = true;

    @OriginalMember(owner = "DBRMEPJQ", name = "I", descriptor = "Z")
    private boolean field713 = true;

    @OriginalMember(owner = "DBRMEPJQ", name = "J", descriptor = "[[B")
    public byte[][] field714 = new byte[256][];

    @OriginalMember(owner = "DBRMEPJQ", name = "K", descriptor = "[I")
    public int[] field715 = new int[256];

    @OriginalMember(owner = "DBRMEPJQ", name = "L", descriptor = "[I")
    public int[] field716 = new int[256];

    @OriginalMember(owner = "DBRMEPJQ", name = "M", descriptor = "[I")
    public int[] field717 = new int[256];

    @OriginalMember(owner = "DBRMEPJQ", name = "N", descriptor = "[I")
    public int[] field718 = new int[256];

    @OriginalMember(owner = "DBRMEPJQ", name = "O", descriptor = "[I")
    public int[] field719 = new int[256];

    @OriginalMember(owner = "DBRMEPJQ", name = "Q", descriptor = "Ljava/util/Random;")
    public Random field721 = new Random();

    @OriginalMember(owner = "DBRMEPJQ", name = "R", descriptor = "Z")
    public boolean field722 = false;

    @OriginalMember(owner = "DBRMEPJQ", name = "P", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "DBRMEPJQ", name = "C", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "DBRMEPJQ", name = "<init>", descriptor = "(Ljava/lang/String;IZLXRWUKRPO;)V")
    public class11(String arg0, int arg1, boolean arg2, class65 arg3) {
        class21 var5 = new class21(arg3.method581(arg0 + ".dat", null), -49015);
        class21 var6 = new class21(arg3.method581("index.dat", null), -49015);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        boolean var7 = true;
        var6.field818 = var5.method246() + 4;
        int var8 = var6.method244();
        if (var8 > 0) {
            var6.field818 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field717[var9] = var6.method244();
            this.field718[var9] = var6.method244();
            int var11 = this.field715[var9] = var6.method246();
            int var12 = this.field716[var9] = var6.method246();
            int var13 = var6.method244();
            int var14 = var11 * var12;
            this.field714[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field714[var9][var15] = var5.method245();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field714[var9][var11 * var17 + var16] = var5.method245();
                    }
                }
            }
            if (var12 > this.field720 && var9 < 128) {
                this.field720 = var12;
            }
            this.field717[var9] = 1;
            this.field719[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field714[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field719[var9]--;
                this.field717[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field714[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field719[var9]--;
            }
        }
        if (arg2) {
            this.field719[32] = this.field719[73];
        } else {
            this.field719[32] = this.field719[105];
            if (class62.field1590) {
            }
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method189(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg0 < 0) {
            this.method194((byte) 22, arg4, arg1, arg3 - this.method193(arg4, this.field709), arg2);
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method190(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method194((byte) 22, arg3, arg4, arg2 - this.method193(arg3, this.field709) / 2, arg1);
        if (arg0 != 1) {
            this.field707 = 118;
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void method191(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        this.method198(arg3, arg1, true, arg5, arg0 - this.method192(arg3, -989) / 2, arg2);
        if (arg4 < 0 || arg4 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method192(String arg0, int arg1) {
        label38: while (true) {
            if (arg1 >= 0) {
                int var5 = 1;
                while (true) {
                    if (var5 <= 0) {
                        continue label38;
                    }
                    var5++;
                }
            }
            if (arg0 == null) {
                return 0;
            }
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field719[arg0.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method193(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 65 / arg1;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var3 += this.field719[arg0.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(BLjava/lang/String;III)V")
    public void method194(byte arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 22) {
            this.field713 = !this.field713;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = arg4 - this.field720;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method201(this.field714[var8], this.field717[var8] + arg3, this.field718[var8] + var6, this.field715[var8], this.field716[var8], arg2);
            }
            arg3 += this.field719[var8];
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public void method195(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        if (!arg1 || arg2 == null) {
            return;
        }
        int var7 = arg0 - this.method193(arg2, this.field709) / 2;
        int var8 = arg3 - this.field720;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method201(this.field714[var10], this.field717[var10] + var7, this.field718[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field715[var10], this.field716[var10], arg4);
            }
            var7 += this.field719[var10];
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
    public void method196(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (arg0 == null) {
            return;
        }
        int var8 = arg5 - this.method193(arg0, this.field709) / 2;
        int var9 = arg4 - this.field720;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method201(this.field714[var11], this.field717[var11] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field718[var11] + var9 + (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field715[var11], this.field716[var11], arg1);
            }
            var8 += this.field719[var11];
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(IIILjava/lang/String;IBI)V")
    public void method197(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -26 || arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method193(arg3, this.field709) / 2;
        int var11 = arg4 - this.field720;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method201(this.field714[var13], this.field717[var13] + var10, this.field718[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field715[var13], this.field716[var13], arg1);
            }
            var10 += this.field719[var13];
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;IZZII)V")
    public void method198(String arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        this.field722 = false;
        int var7 = arg4;
        if (arg0 == null) {
            return;
        }
        int var8 = arg1 - this.field720;
        if (!arg2) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method200(arg0.substring(var9 + 1, var9 + 4), (byte) 2);
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method201(this.field714[var11], this.field717[var11] + arg4 + 1, this.field718[var11] + var8 + 1, this.field715[var11], this.field716[var11], 0);
                    }
                    this.method201(this.field714[var11], this.field717[var11] + arg4, this.field718[var11] + var8, this.field715[var11], this.field716[var11], arg5);
                }
                arg4 += this.field719[var11];
            }
        }
        if (this.field722) {
            class50.method481(var7, 8388608, arg4 - var7, 2, (int) ((double) this.field720 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(IZILjava/lang/String;ZII)V")
    public void method199(int arg0, boolean arg1, int arg2, String arg3, boolean arg4, int arg5, int arg6) {
        if (arg4 || arg3 == null) {
            return;
        }
        this.field721.setSeed((long) arg0);
        int var8 = (this.field721.nextInt() & 0x1F) + 192;
        int var9 = arg2 - this.field720;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method200(arg3.substring(var10 + 1, var10 + 4), (byte) 2);
                if (var11 != -1) {
                    arg6 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method203(this.field716[var12], 192, this.field718[var12] + var9 + 1, this.field714[var12], this.field715[var12], false, 0, this.field717[var12] + arg5 + 1);
                    }
                    this.method203(this.field716[var12], var8, this.field718[var12] + var9, this.field714[var12], this.field715[var12], false, arg6, this.field717[var12] + arg5);
                }
                arg5 += this.field719[var12];
                if ((this.field721.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method200(String arg0, byte arg1) {
        if (this.field711 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
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
                this.field722 = true;
            }
            if (arg0.equals("end")) {
                this.field722 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "([BIIIII)V")
    private void method201(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class50.field1279 * arg2 + arg1;
        int var8 = class50.field1279 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class50.field1281) {
            int var11 = class50.field1281 - arg2;
            arg4 -= var11;
            arg2 = class50.field1281;
            var10 += arg3 * var11;
            var7 += class50.field1279 * var11;
        }
        if (arg2 + arg4 >= class50.field1282) {
            arg4 -= arg2 + arg4 + 1 - class50.field1282;
        }
        if (arg1 < class50.field1283) {
            int var12 = class50.field1283 - arg1;
            arg3 -= var12;
            arg1 = class50.field1283;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class50.field1284) {
            int var13 = arg1 + arg3 + 1 - class50.field1284;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method202(class50.field1278, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method202(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(III[BIZII)V")
    private void method203(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int var9 = class50.field1279 * arg2 + arg7;
        int var10 = class50.field1279 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (arg5) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (arg2 < class50.field1281) {
            int var14 = class50.field1281 - arg2;
            arg0 -= var14;
            arg2 = class50.field1281;
            var12 += arg4 * var14;
            var9 += class50.field1279 * var14;
        }
        if (arg0 + arg2 >= class50.field1282) {
            arg0 -= arg0 + arg2 + 1 - class50.field1282;
        }
        if (arg7 < class50.field1283) {
            int var15 = class50.field1283 - arg7;
            arg4 -= var15;
            arg7 = class50.field1283;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 + arg7 >= class50.field1284) {
            int var16 = arg4 + arg7 + 1 - class50.field1284;
            arg4 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg4 > 0 && arg0 > 0) {
            this.method204(var9, class50.field1278, var11, arg3, arg0, true, var10, arg4, arg1, var12, arg6);
        }
    }

    @OriginalMember(owner = "DBRMEPJQ", name = "a", descriptor = "(I[II[BIZIIIII)V")
    private void method204(int arg0, int[] arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg10 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg10 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        int var13 = 256 - arg8;
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg3[arg9++] == 0) {
                    arg0++;
                } else {
                    int var17 = arg1[arg0];
                    arg1[arg0++] = (((var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var17 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg6;
            arg9 += arg2;
        }
        if (!arg5) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }
}
