import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NEJZODYM")
public class class39 extends class13 {

    @OriginalMember(owner = "NEJZODYM", name = "v", descriptor = "I")
    private int field1229 = 566;

    @OriginalMember(owner = "NEJZODYM", name = "w", descriptor = "Z")
    private boolean field1230 = false;

    @OriginalMember(owner = "NEJZODYM", name = "x", descriptor = "I")
    private int field1231 = -550;

    @OriginalMember(owner = "NEJZODYM", name = "y", descriptor = "Z")
    private boolean field1232 = true;

    @OriginalMember(owner = "NEJZODYM", name = "z", descriptor = "Z")
    private boolean field1233 = true;

    @OriginalMember(owner = "NEJZODYM", name = "A", descriptor = "I")
    private int field1234 = 3;

    @OriginalMember(owner = "NEJZODYM", name = "B", descriptor = "[[B")
    public byte[][] field1235 = new byte[256][];

    @OriginalMember(owner = "NEJZODYM", name = "C", descriptor = "[I")
    public int[] field1236 = new int[256];

    @OriginalMember(owner = "NEJZODYM", name = "D", descriptor = "[I")
    public int[] field1237 = new int[256];

    @OriginalMember(owner = "NEJZODYM", name = "E", descriptor = "[I")
    public int[] field1238 = new int[256];

    @OriginalMember(owner = "NEJZODYM", name = "F", descriptor = "[I")
    public int[] field1239 = new int[256];

    @OriginalMember(owner = "NEJZODYM", name = "G", descriptor = "[I")
    public int[] field1240 = new int[256];

    @OriginalMember(owner = "NEJZODYM", name = "I", descriptor = "Ljava/util/Random;")
    public Random field1242 = new Random();

    @OriginalMember(owner = "NEJZODYM", name = "J", descriptor = "Z")
    public boolean field1243 = false;

    @OriginalMember(owner = "NEJZODYM", name = "H", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "NEJZODYM", name = "<init>", descriptor = "(LMNPBQFWE;ZILjava/lang/String;)V")
    public class39(class37 arg0, boolean arg1, int arg2, String arg3) {
        class3 var5 = new class3(false, arg0.method429(arg3 + ".dat", null));
        class3 var6 = new class3(false, arg0.method429("index.dat", null));
        boolean var7 = true;
        var6.field20 = var5.method17() + 4;
        int var8 = var6.method15();
        if (var8 > 0) {
            var6.field20 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1238[var9] = var6.method15();
            this.field1239[var9] = var6.method15();
            int var11 = this.field1236[var9] = var6.method17();
            int var12 = this.field1237[var9] = var6.method17();
            int var13 = var6.method15();
            int var14 = var11 * var12;
            this.field1235[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1235[var9][var15] = var5.method16();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1235[var9][var11 * var17 + var16] = var5.method16();
                    }
                }
            }
            if (var12 > this.field1241 && var9 < 128) {
                this.field1241 = var12;
            }
            this.field1238[var9] = 1;
            this.field1240[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1235[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1240[var9]--;
                this.field1238[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1235[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1240[var9]--;
            }
        }
        if (arg2 != 0) {
            this.field1229 = -352;
        }
        if (arg1) {
            this.field1240[32] = this.field1240[73];
        } else {
            this.field1240[32] = this.field1240[105];
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(BIILjava/lang/String;I)V")
    public void method431(byte arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg0 == -13) {
            this.method436((byte) 0, arg4, arg1, arg3, arg2 - this.method435(arg3, 0));
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method432(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method436((byte) 0, arg4, arg1, arg3, arg0 - this.method435(arg3, 0) / 2);
        if (arg2 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(ILjava/lang/String;ZIIZ)V")
    public void method433(int arg0, String arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        this.method440(arg1, arg4, arg0, arg3 - this.method434(this.field1232, arg1) / 2, 696, arg5);
        if (!arg2) {
            this.field1230 = !this.field1230;
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method434(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1240[arg1.charAt(var4)];
            }
        }
        if (arg0) {
            return var3;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method435(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 == 0) {
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field1240[arg0.charAt(var4)];
            }
            return var3;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "b", descriptor = "(BIILjava/lang/String;I)V")
    public void method436(byte arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg3 == null) {
            return;
        }
        int var6 = arg2 - this.field1241;
        if (arg0 == 0) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method443(this.field1235[var10], this.field1238[var10] + arg4, this.field1239[var10] + var6, this.field1236[var10], this.field1237[var10], arg1);
            }
            arg4 += this.field1240[var10];
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method437(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method435(arg1, 0) / 2;
        int var8 = arg0 - this.field1241;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method443(this.field1235[var10], this.field1238[var10] + var7, this.field1239[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1236[var10], this.field1237[var10], arg5);
            }
            var7 += this.field1240[var10];
        }
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method438(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg2 != 28025 || arg3 == null) {
            return;
        }
        int var7 = arg0 - this.method435(arg3, 0) / 2;
        int var8 = arg4 - this.field1241;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method443(this.field1235[var10], this.field1238[var10] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1239[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1236[var10], this.field1237[var10], arg5);
            }
            var7 += this.field1240[var10];
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg5 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0 - this.method435(arg6, 0) / 2;
        int var11 = arg3 - this.field1241;
        if (arg4 >= 0) {
            this.field1233 = !this.field1233;
        }
        for (int var12 = 0; var12 < arg6.length(); var12++) {
            char var13 = arg6.charAt(var12);
            if (var13 != ' ') {
                this.method443(this.field1235[var13], this.field1238[var13] + var10, this.field1239[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field1236[var13], this.field1237[var13], arg1);
            }
            var10 += this.field1240[var13];
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
    public void method440(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1243 = false;
        int var7 = arg3;
        int var8 = 62 / arg4;
        if (arg0 == null) {
            return;
        }
        int var9 = arg1 - this.field1241;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var11 = this.method442(arg0.substring(var10 + 1, var10 + 4), (byte) 99);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg0.charAt(var10);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method443(this.field1235[var12], this.field1238[var12] + arg3 + 1, this.field1239[var12] + var9 + 1, this.field1236[var12], this.field1237[var12], 0);
                    }
                    this.method443(this.field1235[var12], this.field1238[var12] + arg3, this.field1239[var12] + var9, this.field1236[var12], this.field1237[var12], arg2);
                }
                arg3 += this.field1240[var12];
            }
        }
        if (this.field1243) {
            class13.method231(var7, arg3 - var7, (byte) 31, (int) ((double) this.field1241 * 0.7D) + var9, 8388608);
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(ZILjava/lang/String;IIII)V")
    public void method441(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == null) {
            return;
        }
        this.field1242.setSeed((long) arg1);
        int var8 = (this.field1242.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field1241;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method442(arg2.substring(var10 + 1, var10 + 4), (byte) 99);
                if (var11 != -1) {
                    arg6 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method445(this.field1235[var12], this.field1236[var12], this.field1238[var12] + arg5 + 1, 192, 0, this.field1237[var12], this.field1239[var12] + var9 + 1, -35);
                    }
                    this.method445(this.field1235[var12], this.field1236[var12], this.field1238[var12] + arg5, var8, arg6, this.field1237[var12], this.field1239[var12] + var9, -35);
                }
                arg5 += this.field1240[var12];
                if ((this.field1242.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method442(String arg0, byte arg1) {
        if (arg1 != 99) {
            return this.field1231;
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
                this.field1243 = true;
            }
            if (arg0.equals("end")) {
                this.field1243 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "([BIIIII)V")
    private void method443(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class13.field710 * arg2 + arg1;
        int var8 = class13.field710 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class13.field712) {
            int var11 = class13.field712 - arg2;
            arg4 -= var11;
            arg2 = class13.field712;
            var10 += arg3 * var11;
            var7 += class13.field710 * var11;
        }
        if (arg2 + arg4 >= class13.field713) {
            arg4 -= arg2 + arg4 + 1 - class13.field713;
        }
        if (arg1 < class13.field714) {
            int var12 = class13.field714 - arg1;
            arg3 -= var12;
            arg1 = class13.field714;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class13.field715) {
            int var13 = arg1 + arg3 + 1 - class13.field715;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method444(class13.field709, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method444(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "([BIIIIIII)V")
    private void method445(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class13.field710 * arg6 + arg2;
        int var10 = class13.field710 - arg1;
        int var11 = 0;
        int var12 = 0;
        if (arg6 < class13.field712) {
            int var13 = class13.field712 - arg6;
            arg5 -= var13;
            arg6 = class13.field712;
            var12 += arg1 * var13;
            var9 += class13.field710 * var13;
        }
        if (arg5 + arg6 >= class13.field713) {
            arg5 -= arg5 + arg6 + 1 - class13.field713;
        }
        if (arg2 < class13.field714) {
            int var14 = class13.field714 - arg2;
            arg1 -= var14;
            arg2 = class13.field714;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg2 >= class13.field715) {
            int var15 = arg1 + arg2 + 1 - class13.field715;
            arg1 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg1 > 0 && arg5 > 0) {
            this.method446(var12, var11, var10, var9, arg1, arg3, arg4, arg0, 4, arg5, class13.field709);
            if (arg7 >= 0) {
                this.field1234 = -386;
            }
        }
    }

    @OriginalMember(owner = "NEJZODYM", name = "a", descriptor = "(IIIIIII[BII[I)V")
    private void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int[] arg10) {
        int var12 = ((arg6 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg5 & 0xFF0000) >> 8;
        int var13 = 256 - arg5;
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var15 = -arg4; var15 < 0; var15++) {
                if (arg7[arg0++] == 0) {
                    arg3++;
                } else {
                    int var16 = arg10[arg3];
                    arg10[arg3++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg3 += arg2;
            arg0 += arg1;
        }
        if (arg8 < 4 || arg8 > 4) {
            this.field1231 = -55;
        }
    }
}
