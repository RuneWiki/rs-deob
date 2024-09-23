import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("THSQSAVT")
public class class47 extends class20 {

    @OriginalMember(owner = "THSQSAVT", name = "x", descriptor = "Z")
    private boolean field1451 = false;

    @OriginalMember(owner = "THSQSAVT", name = "y", descriptor = "Z")
    private boolean field1452 = true;

    @OriginalMember(owner = "THSQSAVT", name = "z", descriptor = "I")
    private int field1453 = -459;

    @OriginalMember(owner = "THSQSAVT", name = "A", descriptor = "B")
    private byte field1454 = -115;

    @OriginalMember(owner = "THSQSAVT", name = "B", descriptor = "I")
    private int field1455 = -73;

    @OriginalMember(owner = "THSQSAVT", name = "C", descriptor = "[[B")
    public byte[][] field1456 = new byte[256][];

    @OriginalMember(owner = "THSQSAVT", name = "D", descriptor = "[I")
    public int[] field1457 = new int[256];

    @OriginalMember(owner = "THSQSAVT", name = "E", descriptor = "[I")
    public int[] field1458 = new int[256];

    @OriginalMember(owner = "THSQSAVT", name = "F", descriptor = "[I")
    public int[] field1459 = new int[256];

    @OriginalMember(owner = "THSQSAVT", name = "G", descriptor = "[I")
    public int[] field1460 = new int[256];

    @OriginalMember(owner = "THSQSAVT", name = "H", descriptor = "[I")
    public int[] field1461 = new int[256];

    @OriginalMember(owner = "THSQSAVT", name = "J", descriptor = "Ljava/util/Random;")
    public Random field1463 = new Random();

    @OriginalMember(owner = "THSQSAVT", name = "K", descriptor = "Z")
    public boolean field1464 = false;

    @OriginalMember(owner = "THSQSAVT", name = "I", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "THSQSAVT", name = "<init>", descriptor = "(LDTIATKJO;Ljava/lang/String;ZI)V")
    public class47(class8 arg0, String arg1, boolean arg2, int arg3) {
        class14 var5 = new class14(-527, arg0.method168(arg1 + ".dat", null));
        class14 var6 = new class14(-527, arg0.method168("index.dat", null));
        boolean var7 = true;
        int var8 = 46 / arg3;
        var6.field769 = var5.method204() + 4;
        int var9 = var6.method202();
        if (var9 > 0) {
            var6.field769 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field1459[var10] = var6.method202();
            this.field1460[var10] = var6.method202();
            int var12 = this.field1457[var10] = var6.method204();
            int var13 = this.field1458[var10] = var6.method204();
            int var14 = var6.method202();
            int var15 = var12 * var13;
            this.field1456[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field1456[var10][var16] = var5.method203();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field1456[var10][var12 * var18 + var17] = var5.method203();
                    }
                }
            }
            if (var13 > this.field1462 && var10 < 128) {
                this.field1462 = var13;
            }
            this.field1459[var10] = 1;
            this.field1461[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field1456[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field1461[var10]--;
                this.field1459[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field1456[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field1461[var10]--;
            }
        }
        if (arg2) {
            this.field1461[32] = this.field1461[73];
        } else {
            this.field1461[32] = this.field1461[105];
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method472(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg3 == 17401) {
            this.method477(arg0, arg4, 3, arg2, arg1 - this.method476(-7791, arg4));
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method473(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg4 == 6600) {
            this.method477(arg2, arg3, 3, arg0, arg1 - this.method476(-7791, arg3) / 2);
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(ZIIILjava/lang/String;I)V")
    public void method474(boolean arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        this.method481(arg5 - this.method475(arg4, 0) / 2, arg4, arg1, arg3, arg0, false);
        if (arg2 != 0) {
            this.field1455 = 447;
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method475(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1461[arg0.charAt(var4)];
            }
        }
        if (arg1 != 0) {
            this.field1451 = !this.field1451;
        }
        return var3;
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method476(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0 != -7791) {
            this.field1452 = !this.field1452;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field1461[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method477(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 3 || arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field1462;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method484(this.field1456[var8], this.field1459[var8] + arg4, this.field1460[var8] + var6, this.field1457[var8], this.field1458[var8], arg0);
            }
            arg4 += this.field1461[var8];
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
    public void method478(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg2 - this.method476(-7791, arg3) / 2;
        int var8 = arg1 - this.field1462;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method484(this.field1456[var10], this.field1459[var10] + var7, this.field1460[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1457[var10], this.field1458[var10], arg5);
            }
            var7 += this.field1461[var10];
        }
        if (arg4) {
            ;
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
    public void method479(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg1 - this.method476(-7791, arg3) / 2;
        if (arg4 != 0) {
            return;
        }
        boolean var8 = false;
        int var9 = arg2 - this.field1462;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            char var11 = arg3.charAt(var10);
            if (var11 != ' ') {
                this.method484(this.field1456[var11], this.field1459[var11] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field1460[var11] + var9 + (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field1457[var11], this.field1458[var11], arg5);
            }
            var7 += this.field1461[var11];
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method480(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method476(-7791, arg5) / 2;
        if (arg1 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg0 - this.field1462;
        for (int var13 = 0; var13 < arg5.length(); var13++) {
            char var14 = arg5.charAt(var13);
            if (var14 != ' ') {
                this.method484(this.field1456[var14], this.field1459[var14] + var10, this.field1460[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var8), this.field1457[var14], this.field1458[var14], arg6);
            }
            var10 += this.field1461[var14];
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(ILjava/lang/String;IIZZ)V")
    public void method481(int arg0, String arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field1464 = false;
        int var7 = arg0;
        if (arg1 == null) {
            return;
        }
        int var8 = arg3 - this.field1462;
        if (arg5) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
                int var10 = this.method483(5, arg1.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg2 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg1.charAt(var9);
                if (var11 != ' ') {
                    if (arg4) {
                        this.method484(this.field1456[var11], this.field1459[var11] + arg0 + 1, this.field1460[var11] + var8 + 1, this.field1457[var11], this.field1458[var11], 0);
                    }
                    this.method484(this.field1456[var11], this.field1459[var11] + arg0, this.field1460[var11] + var8, this.field1457[var11], this.field1458[var11], arg2);
                }
                arg0 += this.field1461[var11];
            }
        }
        if (this.field1464) {
            class20.method291(var7, -729, arg0 - var7, 8388608, (int) ((double) this.field1462 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIZILjava/lang/String;ZI)V")
    public void method482(int arg0, int arg1, boolean arg2, int arg3, String arg4, boolean arg5, int arg6) {
        if (!arg5 || arg4 == null) {
            return;
        }
        this.field1463.setSeed((long) arg0);
        int var8 = (this.field1463.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.field1462;
        for (int var10 = 0; var10 < arg4.length(); var10++) {
            if (arg4.charAt(var10) == '@' && var10 + 4 < arg4.length() && arg4.charAt(var10 + 4) == '@') {
                int var11 = this.method483(5, arg4.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg4.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method486(this.field1460[var12] + var9 + 1, 192, this.field1459[var12] + arg3 + 1, (byte) -115, this.field1458[var12], this.field1456[var12], this.field1457[var12], 0);
                    }
                    this.method486(this.field1460[var12] + var9, var8, this.field1459[var12] + arg3, (byte) -115, this.field1458[var12], this.field1456[var12], this.field1457[var12], arg1);
                }
                arg3 += this.field1461[var12];
                if ((this.field1463.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method483(int arg0, String arg1) {
        if (arg0 != 5) {
            this.field1452 = !this.field1452;
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
                this.field1464 = true;
            }
            if (arg1.equals("end")) {
                this.field1464 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "([BIIIII)V")
    private void method484(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class20.field933 * arg2 + arg1;
        int var8 = class20.field933 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class20.field935) {
            int var11 = class20.field935 - arg2;
            arg4 -= var11;
            arg2 = class20.field935;
            var10 += arg3 * var11;
            var7 += class20.field933 * var11;
        }
        if (arg2 + arg4 >= class20.field936) {
            arg4 -= arg2 + arg4 + 1 - class20.field936;
        }
        if (arg1 < class20.field937) {
            int var12 = class20.field937 - arg1;
            arg3 -= var12;
            arg1 = class20.field937;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class20.field938) {
            int var13 = arg1 + arg3 + 1 - class20.field938;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method485(class20.field932, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method485(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(IIIBI[BII)V")
    private void method486(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        int var9 = class20.field933 * arg0 + arg2;
        int var10 = class20.field933 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (this.field1454 != arg3) {
            return;
        }
        if (arg0 < class20.field935) {
            int var13 = class20.field935 - arg0;
            arg4 -= var13;
            arg0 = class20.field935;
            var12 += arg6 * var13;
            var9 += class20.field933 * var13;
        }
        if (arg0 + arg4 >= class20.field936) {
            arg4 -= arg0 + arg4 + 1 - class20.field936;
        }
        if (arg2 < class20.field937) {
            int var14 = class20.field937 - arg2;
            arg6 -= var14;
            arg2 = class20.field937;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg2 + arg6 >= class20.field938) {
            int var15 = arg2 + arg6 + 1 - class20.field938;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg4 > 0) {
            this.method487(true, var10, arg6, var12, arg5, var11, var9, arg1, arg4, class20.field932, arg7);
        }
    }

    @OriginalMember(owner = "THSQSAVT", name = "a", descriptor = "(ZIII[BIIII[II)V")
    private void method487(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = ((arg10 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg10 & 0xFF00) * arg7 & 0xFF0000) >> 8;
        if (!arg0) {
            return;
        }
        int var13 = 256 - arg7;
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                if (arg4[arg3++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg9[arg6];
                    arg9[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg1;
            arg3 += arg5;
        }
    }
}
