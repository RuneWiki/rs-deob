import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RLQTDOAP")
public class class55 extends class35 {

    @OriginalMember(owner = "RLQTDOAP", name = "z", descriptor = "Z")
    private boolean field1475 = true;

    @OriginalMember(owner = "RLQTDOAP", name = "A", descriptor = "Z")
    private boolean field1476 = true;

    @OriginalMember(owner = "RLQTDOAP", name = "C", descriptor = "[[B")
    public byte[][] field1478 = new byte[256][];

    @OriginalMember(owner = "RLQTDOAP", name = "D", descriptor = "[I")
    public int[] field1479 = new int[256];

    @OriginalMember(owner = "RLQTDOAP", name = "E", descriptor = "[I")
    public int[] field1480 = new int[256];

    @OriginalMember(owner = "RLQTDOAP", name = "F", descriptor = "[I")
    public int[] field1481 = new int[256];

    @OriginalMember(owner = "RLQTDOAP", name = "G", descriptor = "[I")
    public int[] field1482 = new int[256];

    @OriginalMember(owner = "RLQTDOAP", name = "H", descriptor = "[I")
    public int[] field1483 = new int[256];

    @OriginalMember(owner = "RLQTDOAP", name = "J", descriptor = "Ljava/util/Random;")
    public Random field1485 = new Random();

    @OriginalMember(owner = "RLQTDOAP", name = "K", descriptor = "Z")
    public boolean field1486 = false;

    @OriginalMember(owner = "RLQTDOAP", name = "I", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "RLQTDOAP", name = "B", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "RLQTDOAP", name = "<init>", descriptor = "(ZLjava/lang/String;ILTKEGJSFV;)V")
    public class55(boolean arg0, String arg1, int arg2, class58 arg3) {
        class15 var5 = new class15(arg3.method542(arg1 + ".dat", null), false);
        class15 var6 = new class15(arg3.method542("index.dat", null), false);
        if (arg2 < 0 || arg2 > 0) {
            throw new NullPointerException();
        }
        boolean var7 = true;
        var6.field709 = var5.method263() + 4;
        int var8 = var6.method261();
        if (var8 > 0) {
            var6.field709 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1481[var9] = var6.method261();
            this.field1482[var9] = var6.method261();
            int var11 = this.field1479[var9] = var6.method263();
            int var12 = this.field1480[var9] = var6.method263();
            int var13 = var6.method261();
            int var14 = var11 * var12;
            this.field1478[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1478[var9][var15] = var5.method262();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1478[var9][var11 * var17 + var16] = var5.method262();
                    }
                }
            }
            if (var12 > this.field1484 && var9 < 128) {
                this.field1484 = var12;
            }
            this.field1481[var9] = 1;
            this.field1483[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1478[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1483[var9]--;
                this.field1481[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1478[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1483[var9]--;
            }
        }
        if (arg0) {
            this.field1483[32] = this.field1483[73];
        } else {
            this.field1483[32] = this.field1483[105];
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method525(int arg0, String arg1, int arg2, int arg3, int arg4) {
        int var6 = 95 / arg4;
        this.method530(arg2, arg1, arg0 - this.method529(37461, arg1), arg3, 411);
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method526(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg1 == 3) {
            this.method530(arg2, arg4, arg3 - this.method529(37461, arg4) / 2, arg0, 411);
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(IIIZZLjava/lang/String;)V")
    public void method527(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, String arg5) {
        this.method534(arg5, arg1, arg0, -964, arg2 - this.method528(arg5, 555) / 2, arg3);
        if (arg4) {
            ;
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method528(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 43 / arg1;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field1483[arg0.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method529(int arg0, String arg1) {
        if (arg0 != 37461) {
            return this.field1477;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field1483[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "b", descriptor = "(ILjava/lang/String;III)V")
    public void method530(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 - this.field1484;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var9 = arg1.charAt(var7);
            if (var9 != ' ') {
                this.method537(this.field1478[var9], this.field1481[var9] + arg2, this.field1482[var9] + var6, this.field1479[var9], this.field1480[var9], arg3);
            }
            arg2 += this.field1483[var9];
        }
        if (arg4 <= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method531(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg4 - this.method529(37461, arg3) / 2;
        if (arg2 != 42587) {
            this.field1475 = !this.field1475;
        }
        int var8 = arg5 - this.field1484;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method537(this.field1478[var10], this.field1481[var10] + var7, this.field1482[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1479[var10], this.field1480[var10], arg1);
            }
            var7 += this.field1483[var10];
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
    public void method532(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg4 - this.method529(37461, arg0) / 2;
        if (arg2 == 0) {
            boolean var8 = false;
        } else {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg3 - this.field1484;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            char var12 = arg0.charAt(var11);
            if (var12 != ' ') {
                this.method537(this.field1478[var12], this.field1481[var12] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D), this.field1482[var12] + var10 + (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D), this.field1479[var12], this.field1480[var12], arg5);
            }
            var7 += this.field1483[var12];
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(IIZIILjava/lang/String;I)V")
    public void method533(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method529(37461, arg5) / 2;
        int var11 = arg0 - this.field1484;
        if (arg2) {
            this.field1475 = !this.field1475;
        }
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method537(this.field1478[var13], this.field1481[var13] + var10, this.field1482[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field1479[var13], this.field1480[var13], arg3);
            }
            var10 += this.field1483[var13];
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
    public void method534(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1486 = false;
        int var7 = arg4;
        while (arg3 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (arg0 == null) {
            return;
        }
        int var8 = arg2 - this.field1484;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method536(arg0.substring(var9 + 1, var9 + 4), true);
                if (var10 != -1) {
                    arg1 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg5) {
                        this.method537(this.field1478[var11], this.field1481[var11] + arg4 + 1, this.field1482[var11] + var8 + 1, this.field1479[var11], this.field1480[var11], 0);
                    }
                    this.method537(this.field1478[var11], this.field1481[var11] + arg4, this.field1482[var11] + var8, this.field1479[var11], this.field1480[var11], arg1);
                }
                arg4 += this.field1483[var11];
            }
        }
        if (this.field1486) {
            class35.method388(-532, (int) ((double) this.field1484 * 0.7D) + var8, var7, arg4 - var7, 8388608);
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(IILjava/lang/String;IIIZ)V")
    public void method535(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg2 == null) {
            return;
        }
        this.field1485.setSeed((long) arg1);
        int var8 = (this.field1485.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field1484;
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method536(arg2.substring(var10 + 1, var10 + 4), true);
                if (var11 != -1) {
                    arg0 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method539(this.field1478[var12], true, this.field1482[var12] + var9 + 1, 0, this.field1480[var12], this.field1481[var12] + arg5 + 1, this.field1479[var12], 192);
                    }
                    this.method539(this.field1478[var12], true, this.field1482[var12] + var9, arg0, this.field1480[var12], this.field1481[var12] + arg5, this.field1479[var12], var8);
                }
                arg5 += this.field1483[var12];
                if ((this.field1485.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
        if (arg4 != 7) {
            this.field1475 = !this.field1475;
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method536(String arg0, boolean arg1) {
        if (!arg1) {
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
                this.field1486 = true;
            }
            if (arg0.equals("end")) {
                this.field1486 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "([BIIIII)V")
    private void method537(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class35.field1020 * arg2 + arg1;
        int var8 = class35.field1020 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class35.field1022) {
            int var11 = class35.field1022 - arg2;
            arg4 -= var11;
            arg2 = class35.field1022;
            var10 += arg3 * var11;
            var7 += class35.field1020 * var11;
        }
        if (arg2 + arg4 >= class35.field1023) {
            arg4 -= arg2 + arg4 + 1 - class35.field1023;
        }
        if (arg1 < class35.field1024) {
            int var12 = class35.field1024 - arg1;
            arg3 -= var12;
            arg1 = class35.field1024;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class35.field1025) {
            int var13 = arg1 + arg3 + 1 - class35.field1025;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method538(class35.field1019, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method538(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "([BZIIIIII)V")
    private void method539(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg1) {
            this.field1477 = 266;
        }
        int var9 = class35.field1020 * arg2 + arg5;
        int var10 = class35.field1020 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class35.field1022) {
            int var13 = class35.field1022 - arg2;
            arg4 -= var13;
            arg2 = class35.field1022;
            var12 += arg6 * var13;
            var9 += class35.field1020 * var13;
        }
        if (arg2 + arg4 >= class35.field1023) {
            arg4 -= arg2 + arg4 + 1 - class35.field1023;
        }
        if (arg5 < class35.field1024) {
            int var14 = class35.field1024 - arg5;
            arg6 -= var14;
            arg5 = class35.field1024;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg5 + arg6 >= class35.field1025) {
            int var15 = arg5 + arg6 + 1 - class35.field1025;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg4 > 0) {
            this.method540(arg3, var10, arg4, 0, arg7, arg0, class35.field1019, var11, var12, arg6, var9);
        }
    }

    @OriginalMember(owner = "RLQTDOAP", name = "a", descriptor = "(IIIII[B[IIIII)V")
    private void method540(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg3 != 0) {
            return;
        }
        int var12 = ((arg0 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        int var13 = 256 - arg4;
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg9; var15 < 0; var15++) {
                if (arg5[arg8++] == 0) {
                    arg10++;
                } else {
                    int var16 = arg6[arg10];
                    arg6[arg10++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg10 += arg1;
            arg8 += arg7;
        }
    }
}
