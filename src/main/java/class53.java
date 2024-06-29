import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TJCUOFPI")
public class class53 extends class61 {

    @OriginalMember(owner = "client!TJCUOFPI", name = "B", descriptor = "Z")
    private boolean field1236 = true;

    @OriginalMember(owner = "client!TJCUOFPI", name = "C", descriptor = "B")
    private byte field1237 = 48;

    @OriginalMember(owner = "client!TJCUOFPI", name = "D", descriptor = "I")
    private int field1238 = 9;

    @OriginalMember(owner = "client!TJCUOFPI", name = "E", descriptor = "Z")
    private boolean field1239 = false;

    @OriginalMember(owner = "client!TJCUOFPI", name = "F", descriptor = "I")
    private int field1240 = -16070;

    @OriginalMember(owner = "client!TJCUOFPI", name = "G", descriptor = "[[B")
    public byte[][] field1241 = new byte[256][];

    @OriginalMember(owner = "client!TJCUOFPI", name = "H", descriptor = "[I")
    public int[] field1242 = new int[256];

    @OriginalMember(owner = "client!TJCUOFPI", name = "I", descriptor = "[I")
    public int[] field1243 = new int[256];

    @OriginalMember(owner = "client!TJCUOFPI", name = "J", descriptor = "[I")
    public int[] field1244 = new int[256];

    @OriginalMember(owner = "client!TJCUOFPI", name = "K", descriptor = "[I")
    public int[] field1245 = new int[256];

    @OriginalMember(owner = "client!TJCUOFPI", name = "L", descriptor = "[I")
    public int[] field1246 = new int[256];

    @OriginalMember(owner = "client!TJCUOFPI", name = "N", descriptor = "Ljava/util/Random;")
    public Random field1248 = new Random();

    @OriginalMember(owner = "client!TJCUOFPI", name = "O", descriptor = "Z")
    public boolean field1249 = false;

    @OriginalMember(owner = "client!TJCUOFPI", name = "M", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!TJCUOFPI", name = "<init>", descriptor = "(LRSPRYUFS;ZBLjava/lang/String;)V")
    public class53(class49 arg0, boolean arg1, byte arg2, String arg3) {
        class36 var5 = new class36(-587, arg0.method427(arg3 + ".dat", null));
        class36 var6 = new class36(-587, arg0.method427("index.dat", null));
        boolean var7 = true;
        var6.field1072 = var5.method341() + 4;
        int var8 = var6.method339();
        if (arg2 == 8) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (var8 > 0) {
            var6.field1072 += (var8 - 1) * 3;
        }
        for (int var11 = 0; var11 < 256; var11++) {
            this.field1244[var11] = var6.method339();
            this.field1245[var11] = var6.method339();
            int var13 = this.field1242[var11] = var6.method341();
            int var14 = this.field1243[var11] = var6.method341();
            int var15 = var6.method339();
            int var16 = var13 * var14;
            this.field1241[var11] = new byte[var16];
            if (var15 == 0) {
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field1241[var11][var17] = var5.method340();
                }
            } else if (var15 == 1) {
                for (int var18 = 0; var18 < var13; var18++) {
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field1241[var11][var13 * var19 + var18] = var5.method340();
                    }
                }
            }
            if (var14 > this.field1247 && var11 < 128) {
                this.field1247 = var14;
            }
            this.field1244[var11] = 1;
            this.field1246[var11] = var13 + 2;
            int var20 = 0;
            for (int var21 = var14 / 7; var21 < var14; var21++) {
                var20 += this.field1241[var11][var13 * var21];
            }
            int var10002;
            if (var20 <= var14 / 7) {
                var10002 = this.field1246[var11]--;
                this.field1244[var11] = 0;
            }
            int var22 = 0;
            for (int var23 = var14 / 7; var23 < var14; var23++) {
                var22 += this.field1241[var11][var13 * var23 + var13 - 1];
            }
            if (var22 <= var14 / 7) {
                var10002 = this.field1246[var11]--;
            }
        }
        if (arg1) {
            this.field1246[32] = this.field1246[73];
        } else {
            this.field1246[32] = this.field1246[105];
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method434(String arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg2 >= 0) {
            this.field1238 = 237;
        }
        this.method439(arg4, arg0, arg3 - this.method438((byte) 5, arg0), arg1, this.field1237);
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method435(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg2 == 0) {
            this.method439(arg0, arg3, arg4 - this.method438((byte) 5, arg3) / 2, arg1, this.field1237);
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
    public void method436(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
        if (arg2 == 0) {
            this.method443(arg1, arg4, (byte) -11, arg0, arg5 - this.method437(8, arg3) / 2, arg3);
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method437(int arg0, String arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field1240 = 467;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1246[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method438(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 == 5) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            var3 += this.field1246[arg1.charAt(var6)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
    public void method439(int arg0, String arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 48 || arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field1247;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method446(this.field1241[var8], this.field1244[var8] + arg2, this.field1245[var8] + var6, this.field1242[var8], this.field1243[var8], arg0);
            }
            arg2 += this.field1246[var8];
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public void method440(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg2 == null) {
            return;
        }
        int var7 = arg0 - this.method438((byte) 5, arg2) / 2;
        int var8 = arg1 - this.field1247;
        if (arg4 < 9 || arg4 > 9) {
            return;
        }
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            char var10 = arg2.charAt(var9);
            if (var10 != ' ') {
                this.method446(this.field1241[var10], this.field1244[var10] + var7, this.field1245[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1242[var10], this.field1243[var10], arg5);
            }
            var7 += this.field1246[var10];
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
    public void method441(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method438((byte) 5, arg1) / 2;
        if (!arg3) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field1247;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            char var11 = arg1.charAt(var10);
            if (var11 != ' ') {
                this.method446(this.field1241[var11], this.field1244[var11] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field1245[var11] + var9 + (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field1242[var11], this.field1243[var11], arg5);
            }
            var7 += this.field1246[var11];
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(BIIILjava/lang/String;II)V")
    public void method442(byte arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        if (arg4 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (arg0 != 14) {
            this.field1240 = 55;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method438((byte) 5, arg4) / 2;
        int var11 = arg1 - this.field1247;
        for (int var12 = 0; var12 < arg4.length(); var12++) {
            char var13 = arg4.charAt(var12);
            if (var13 != ' ') {
                this.method446(this.field1241[var13], this.field1244[var13] + var10, this.field1245[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field1242[var13], this.field1243[var13], arg3);
            }
            var10 += this.field1246[var13];
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IZBIILjava/lang/String;)V")
    public void method443(int arg0, boolean arg1, byte arg2, int arg3, int arg4, String arg5) {
        this.field1249 = false;
        int var7 = arg4;
        if (arg2 != -11 || arg5 == null) {
            return;
        }
        int var8 = arg3 - this.field1247;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method445(arg5.substring(var9 + 1, var9 + 4), -400);
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.method446(this.field1241[var11], this.field1244[var11] + arg4 + 1, this.field1245[var11] + var8 + 1, this.field1242[var11], this.field1243[var11], 0);
                    }
                    this.method446(this.field1241[var11], this.field1244[var11] + arg4, this.field1245[var11] + var8, this.field1242[var11], this.field1243[var11], arg0);
                }
                arg4 += this.field1246[var11];
            }
        }
        if (this.field1249) {
            class61.method550(8388608, 0, (int) ((double) this.field1247 * 0.7D) + var8, var7, arg4 - var7);
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
    public void method444(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field1248.setSeed((long) arg4);
        if (arg6 != 0) {
            this.field1236 = !this.field1236;
        }
        int var8 = (this.field1248.nextInt() & 0x1F) + 192;
        int var9 = arg1 - this.field1247;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method445(arg3.substring(var10 + 1, var10 + 4), -400);
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method448(this.field1243[var12], 0, this.field1245[var12] + var9 + 1, this.field1241[var12], this.field1242[var12], this.field1244[var12] + arg5 + 1, (byte) -56, 192);
                    }
                    this.method448(this.field1243[var12], arg2, this.field1245[var12] + var9, this.field1241[var12], this.field1242[var12], this.field1244[var12] + arg5, (byte) -56, var8);
                }
                arg5 += this.field1246[var12];
                if ((this.field1248.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method445(String arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1238 = 146;
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
                this.field1249 = true;
            }
            if (arg0.equals("end")) {
                this.field1249 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "([BIIIII)V")
    private void method446(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class61.field1499 * arg2 + arg1;
        int var8 = class61.field1499 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class61.field1501) {
            int var11 = class61.field1501 - arg2;
            arg4 -= var11;
            arg2 = class61.field1501;
            var10 += arg3 * var11;
            var7 += class61.field1499 * var11;
        }
        if (arg2 + arg4 >= class61.field1502) {
            arg4 -= arg2 + arg4 + 1 - class61.field1502;
        }
        if (arg1 < class61.field1503) {
            int var12 = class61.field1503 - arg1;
            arg3 -= var12;
            arg1 = class61.field1503;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class61.field1504) {
            int var13 = arg1 + arg3 + 1 - class61.field1504;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method447(class61.field1498, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method447(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(III[BIIBI)V")
    private void method448(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var9 = class61.field1499 * arg2 + arg5;
        int var10 = class61.field1499 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class61.field1501) {
            int var13 = class61.field1501 - arg2;
            arg0 -= var13;
            arg2 = class61.field1501;
            var12 += arg4 * var13;
            var9 += class61.field1499 * var13;
        }
        if (arg0 + arg2 >= class61.field1502) {
            arg0 -= arg0 + arg2 + 1 - class61.field1502;
        }
        if (arg5 < class61.field1503) {
            int var14 = class61.field1503 - arg5;
            arg4 -= var14;
            arg5 = class61.field1503;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg5 >= class61.field1504) {
            int var15 = arg4 + arg5 + 1 - class61.field1504;
            arg4 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 <= 0 || arg0 <= 0) {
            return;
        }
        this.method449(arg0, arg7, var11, arg4, arg1, class61.field1498, var9, var12, var10, true, arg3);
        if (arg6 != -56) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "client!TJCUOFPI", name = "a", descriptor = "(IIIII[IIIIZ[B)V")
    private void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, boolean arg9, byte[] arg10) {
        int var12 = ((arg4 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg1 & 0xFF0000) >> 8;
        if (!arg9) {
            this.field1239 = !this.field1239;
        }
        int var13 = 256 - arg1;
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = -arg3; var15 < 0; var15++) {
                if (arg10[arg7++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg5[arg6];
                    arg5[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg8;
            arg7 += arg2;
        }
    }
}
