import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SSVSGKGT")
public class class50 extends class56 {

    @OriginalMember(owner = "SSVSGKGT", name = "y", descriptor = "Z")
    private boolean field1415 = true;

    @OriginalMember(owner = "SSVSGKGT", name = "A", descriptor = "I")
    private int field1417 = 106;

    @OriginalMember(owner = "SSVSGKGT", name = "B", descriptor = "B")
    private byte field1418 = -61;

    @OriginalMember(owner = "SSVSGKGT", name = "C", descriptor = "I")
    private int field1419 = 10744;

    @OriginalMember(owner = "SSVSGKGT", name = "D", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "SSVSGKGT", name = "E", descriptor = "[[B")
    public byte[][] field1421 = new byte[256][];

    @OriginalMember(owner = "SSVSGKGT", name = "F", descriptor = "[I")
    public int[] field1422 = new int[256];

    @OriginalMember(owner = "SSVSGKGT", name = "G", descriptor = "[I")
    public int[] field1423 = new int[256];

    @OriginalMember(owner = "SSVSGKGT", name = "H", descriptor = "[I")
    public int[] field1424 = new int[256];

    @OriginalMember(owner = "SSVSGKGT", name = "I", descriptor = "[I")
    public int[] field1425 = new int[256];

    @OriginalMember(owner = "SSVSGKGT", name = "J", descriptor = "[I")
    public int[] field1426 = new int[256];

    @OriginalMember(owner = "SSVSGKGT", name = "L", descriptor = "Ljava/util/Random;")
    public Random field1428 = new Random();

    @OriginalMember(owner = "SSVSGKGT", name = "M", descriptor = "Z")
    public boolean field1429 = false;

    @OriginalMember(owner = "SSVSGKGT", name = "K", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "SSVSGKGT", name = "z", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "SSVSGKGT", name = "<init>", descriptor = "(ILjava/lang/String;ZLGWOEELWB;)V")
    public class50(int arg0, String arg1, boolean arg2, class18 arg3) {
        class30 var5 = new class30(true, arg3.method249(arg1 + ".dat", null));
        class30 var6 = new class30(true, arg3.method249("index.dat", null));
        boolean var7 = true;
        var6.field1092 = var5.method298() + 4;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var8 = var6.method296();
        if (var8 > 0) {
            var6.field1092 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1424[var9] = var6.method296();
            this.field1425[var9] = var6.method296();
            int var11 = this.field1422[var9] = var6.method298();
            int var12 = this.field1423[var9] = var6.method298();
            int var13 = var6.method296();
            int var14 = var11 * var12;
            this.field1421[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1421[var9][var15] = var5.method297();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1421[var9][var11 * var17 + var16] = var5.method297();
                    }
                }
            }
            if (var12 > this.field1427 && var9 < 128) {
                this.field1427 = var12;
            }
            this.field1424[var9] = 1;
            this.field1426[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1421[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1426[var9]--;
                this.field1424[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1421[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1426[var9]--;
            }
        }
        if (arg2) {
            this.field1426[32] = this.field1426[73];
        } else {
            this.field1426[32] = this.field1426[105];
            if (class38.field1221) {
            }
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method453(int arg0, int arg1, int arg2, int arg3, String arg4) {
        this.method458((byte) -61, arg3, arg1 - this.method457(arg4, 106), arg2, arg4);
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "b", descriptor = "(IIIILjava/lang/String;)V")
    public void method454(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg0 >= 1 && arg0 <= 1) {
            this.method458((byte) -61, arg1, arg3 - this.method457(arg4, 106) / 2, arg2, arg4);
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
    public void method455(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            this.field1420 = !this.field1420;
        }
        this.method462(arg4 - this.method456(arg0, 9) / 2, arg5, arg3, 14904, arg0, arg1);
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method456(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 < 9 || arg1 > 9) {
            this.field1420 = !this.field1420;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1426[arg0.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "SSVSGKGT", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method457(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 78 / arg1;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var3 += this.field1426[arg0.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(BIIILjava/lang/String;)V")
    public void method458(byte arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg4 == null) {
            return;
        }
        int var6 = arg3 - this.field1427;
        if (this.field1418 != arg0) {
            this.field1416 = 482;
        }
        for (int var7 = 0; var7 < arg4.length(); var7++) {
            char var8 = arg4.charAt(var7);
            if (var8 != ' ') {
                this.method465(this.field1421[var8], this.field1424[var8] + arg2, this.field1425[var8] + var6, this.field1422[var8], this.field1423[var8], arg1);
            }
            arg2 += this.field1426[var8];
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method459(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg3 - this.method457(arg4, 106) / 2;
        int var8 = arg1 - this.field1427;
        while (arg5 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method465(this.field1421[var10], this.field1424[var10] + var7, this.field1425[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1422[var10], this.field1423[var10], arg2);
            }
            var7 += this.field1426[var10];
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method460(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg2 - this.method457(arg3, 106) / 2;
        if (arg4 != -3443) {
            this.field1420 = !this.field1420;
        }
        int var8 = arg0 - this.field1427;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method465(this.field1421[var10], this.field1424[var10] + var7 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1425[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1422[var10], this.field1423[var10], arg1);
            }
            var7 += this.field1426[var10];
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public void method461(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method457(arg2, 106) / 2;
        int var11 = arg4 - this.field1427;
        for (int var12 = 0; var12 < arg2.length(); var12++) {
            char var13 = arg2.charAt(var12);
            if (var13 != ' ') {
                this.method465(this.field1421[var13], this.field1424[var13] + var10, this.field1425[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8), this.field1422[var13], this.field1423[var13], arg0);
            }
            var10 += this.field1426[var13];
        }
        if (arg1 >= 0) {
            this.field1415 = !this.field1415;
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
    public void method462(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
        if (arg3 != 14904) {
            return;
        }
        this.field1429 = false;
        int var7 = arg0;
        if (arg4 == null) {
            return;
        }
        int var8 = arg5 - this.field1427;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method464(0, arg4.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg1 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg2) {
                        this.method465(this.field1421[var11], this.field1424[var11] + arg0 + 1, this.field1425[var11] + var8 + 1, this.field1422[var11], this.field1423[var11], 0);
                    }
                    this.method465(this.field1421[var11], this.field1424[var11] + arg0, this.field1425[var11] + var8, this.field1422[var11], this.field1423[var11], arg1);
                }
                arg0 += this.field1426[var11];
            }
        }
        if (this.field1429) {
            class56.method549(0, 8388608, (int) ((double) this.field1427 * 0.7D) + var8, arg0 - var7, var7);
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
    public void method463(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == null) {
            return;
        }
        this.field1428.setSeed((long) arg4);
        int var8 = (this.field1428.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field1427;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method464(0, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg5 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method467(0, 192, this.field1423[var12], this.field1425[var12] + var9 + 1, this.field1424[var12] + arg2 + 1, this.field1422[var12], this.field1421[var12], 359);
                    }
                    this.method467(arg5, var8, this.field1423[var12], this.field1425[var12] + var9, this.field1424[var12] + arg2, this.field1422[var12], this.field1421[var12], 359);
                }
                arg2 += this.field1426[var12];
                if ((this.field1428.nextInt() & 0x3) == 0) {
                    arg2++;
                }
            }
        }
        if (arg0 != 1) {
            this.field1420 = !this.field1420;
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method464(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field1416 = -314;
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
                this.field1429 = true;
            }
            if (arg1.equals("end")) {
                this.field1429 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "([BIIIII)V")
    private void method465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class56.field1556 * arg2 + arg1;
        int var8 = class56.field1556 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class56.field1558) {
            int var11 = class56.field1558 - arg2;
            arg4 -= var11;
            arg2 = class56.field1558;
            var10 += arg3 * var11;
            var7 += class56.field1556 * var11;
        }
        if (arg2 + arg4 >= class56.field1559) {
            arg4 -= arg2 + arg4 + 1 - class56.field1559;
        }
        if (arg1 < class56.field1560) {
            int var12 = class56.field1560 - arg1;
            arg3 -= var12;
            arg1 = class56.field1560;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class56.field1561) {
            int var13 = arg1 + arg3 + 1 - class56.field1561;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method466(class56.field1555, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method466(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IIIIII[BI)V")
    private void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        int var9 = class56.field1556 * arg3 + arg4;
        int var10 = class56.field1556 - arg5;
        int var11 = 0;
        int var12 = 0;
        if (arg3 < class56.field1558) {
            int var13 = class56.field1558 - arg3;
            arg2 -= var13;
            arg3 = class56.field1558;
            var12 += arg5 * var13;
            var9 += class56.field1556 * var13;
        }
        if (arg2 + arg3 >= class56.field1559) {
            arg2 -= arg2 + arg3 + 1 - class56.field1559;
        }
        if (arg4 < class56.field1560) {
            int var14 = class56.field1560 - arg4;
            arg5 -= var14;
            arg4 = class56.field1560;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg5 >= class56.field1561) {
            int var15 = arg4 + arg5 + 1 - class56.field1561;
            arg5 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg5 > 0 && arg2 > 0) {
            this.method468(arg2, arg1, var10, this.field1419, var11, var9, arg6, arg0, var12, class56.field1555, arg5);
            int var16 = 47 / arg7;
        }
    }

    @OriginalMember(owner = "SSVSGKGT", name = "a", descriptor = "(IIIIII[BII[II)V")
    private void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = ((arg7 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg1 & 0xFF0000) >> 8;
        int var13 = 256 - arg1;
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                if (arg6[arg8++] == 0) {
                    arg5++;
                } else {
                    int var16 = arg9[arg5];
                    arg9[arg5++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg5 += arg2;
            arg8 += arg4;
        }
        if (arg3 == 10744) {
            ;
        }
    }
}
