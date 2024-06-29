import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZGPIKWUW")
public class class71 extends class35 {

    @OriginalMember(owner = "client!ZGPIKWUW", name = "y", descriptor = "[[B")
    public byte[][] field1745 = new byte[256][];

    @OriginalMember(owner = "client!ZGPIKWUW", name = "z", descriptor = "[I")
    public int[] field1746 = new int[256];

    @OriginalMember(owner = "client!ZGPIKWUW", name = "A", descriptor = "[I")
    public int[] field1747 = new int[256];

    @OriginalMember(owner = "client!ZGPIKWUW", name = "B", descriptor = "[I")
    public int[] field1748 = new int[256];

    @OriginalMember(owner = "client!ZGPIKWUW", name = "C", descriptor = "[I")
    public int[] field1749 = new int[256];

    @OriginalMember(owner = "client!ZGPIKWUW", name = "D", descriptor = "[I")
    public int[] field1750 = new int[256];

    @OriginalMember(owner = "client!ZGPIKWUW", name = "F", descriptor = "Ljava/util/Random;")
    public Random field1752 = new Random();

    @OriginalMember(owner = "client!ZGPIKWUW", name = "G", descriptor = "Z")
    public boolean field1753 = false;

    @OriginalMember(owner = "client!ZGPIKWUW", name = "E", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ZGPIKWUW", name = "x", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!ZGPIKWUW", name = "<init>", descriptor = "(LSXKKBWPU;BLjava/lang/String;Z)V")
    public class71(class50 arg0, byte arg1, String arg2, boolean arg3) {
        class53 var5 = new class53(arg0.method442(arg2 + ".dat", null), -631);
        class53 var6 = new class53(arg0.method442("index.dat", null), -631);
        boolean var7 = true;
        var6.field1457 = var5.method470() + 4;
        int var8 = var6.method468();
        if (var8 > 0) {
            var6.field1457 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1748[var9] = var6.method468();
            this.field1749[var9] = var6.method468();
            int var11 = this.field1746[var9] = var6.method470();
            int var12 = this.field1747[var9] = var6.method470();
            int var13 = var6.method468();
            int var14 = var11 * var12;
            this.field1745[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1745[var9][var15] = var5.method469();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1745[var9][var11 * var17 + var16] = var5.method469();
                    }
                }
            }
            if (var12 > this.field1751 && var9 < 128) {
                this.field1751 = var12;
            }
            this.field1748[var9] = 1;
            this.field1750[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1745[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1750[var9]--;
                this.field1748[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1745[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1750[var9]--;
            }
        }
        if (arg1 != -3) {
            throw new NullPointerException();
        } else if (arg3) {
            this.field1750[32] = this.field1750[73];
        } else {
            this.field1750[32] = this.field1750[105];
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public void method589(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field1744 = 267;
        }
        this.method594(arg0, arg3, arg1, 914, arg2 - this.method593(arg1, 0));
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method590(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method594(arg4, arg1, arg3, 914, arg2 - this.method593(arg3, 0) / 2);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
    public void method591(int arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5) {
        if (arg3 < 0) {
            this.method598(0, arg5, arg1 - this.method592(-6377, arg4) / 2, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method592(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1750[arg1.charAt(var4)];
            }
        }
        if (arg0 != -6377) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method593(String arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var4 += this.field1750[arg0.charAt(var5)];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method594(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null) {
            return;
        }
        int var6 = arg0 - this.field1751;
        if (arg3 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < arg2.length(); var8++) {
            char var9 = arg2.charAt(var8);
            if (var9 != ' ') {
                this.method601(this.field1745[var9], this.field1748[var9] + arg4, this.field1749[var9] + var6, this.field1746[var9], this.field1747[var9], arg1);
            }
            arg4 += this.field1750[var9];
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public void method595(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg1 - this.method593(arg3, 0) / 2;
        int var8 = arg0 - this.field1751;
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method601(this.field1745[var10], this.field1748[var10] + var7, this.field1749[var10] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1746[var10], this.field1747[var10], arg2);
            }
            var7 += this.field1750[var10];
        }
        if (arg4 != 0) {
            this.field1744 = 266;
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void method596(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg1 - this.method593(arg3, 0) / 2;
        int var8 = arg2 - this.field1751;
        if (!arg5) {
            return;
        }
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method601(this.field1745[var10], this.field1748[var10] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1749[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1746[var10], this.field1747[var10], arg4);
            }
            var7 += this.field1750[var10];
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public void method597(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg6 - this.method593(arg1, 0) / 2;
        int var11 = arg2 - this.field1751;
        if (arg0 != -34278) {
            return;
        }
        for (int var12 = 0; var12 < arg1.length(); var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 != ' ') {
                this.method601(this.field1745[var13], this.field1748[var13] + var10, this.field1749[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg3) * var8), this.field1746[var13], this.field1747[var13], arg5);
            }
            var10 += this.field1750[var13];
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
    public void method598(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        this.field1753 = false;
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = arg2;
        if (arg5 == null) {
            return;
        }
        int var9 = arg4 - this.field1751;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method600(arg5.substring(var10 + 1, var10 + 4), (byte) 0);
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method601(this.field1745[var12], this.field1748[var12] + arg2 + 1, this.field1749[var12] + var9 + 1, this.field1746[var12], this.field1747[var12], 0);
                    }
                    this.method601(this.field1745[var12], this.field1748[var12] + arg2, this.field1749[var12] + var9, this.field1746[var12], this.field1747[var12], arg1);
                }
                arg2 += this.field1750[var12];
            }
        }
        if (this.field1753) {
            class35.method348(0, 8388608, (int) ((double) this.field1751 * 0.7D) + var9, var8, arg2 - var8);
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;BIZII)V")
    public void method599(int arg0, String arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field1752.setSeed((long) arg0);
        int var8 = (this.field1752.nextInt() & 0x1F) + 192;
        if (arg2 == 8) {
            boolean var9 = false;
        } else {
            this.field1744 = -38;
        }
        int var10 = arg5 - this.field1751;
        for (int var11 = 0; var11 < arg1.length(); var11++) {
            if (arg1.charAt(var11) == '@' && var11 + 4 < arg1.length() && arg1.charAt(var11 + 4) == '@') {
                int var12 = this.method600(arg1.substring(var11 + 1, var11 + 4), (byte) 0);
                if (var12 != -1) {
                    arg6 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg1.charAt(var11);
                if (var13 != ' ') {
                    if (arg4) {
                        this.method603((byte) 6, this.field1749[var13] + var10 + 1, 192, this.field1748[var13] + arg3 + 1, this.field1745[var13], this.field1746[var13], this.field1747[var13], 0);
                    }
                    this.method603((byte) 6, this.field1749[var13] + var10, var8, this.field1748[var13] + arg3, this.field1745[var13], this.field1746[var13], this.field1747[var13], arg6);
                }
                arg3 += this.field1750[var13];
                if ((this.field1752.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method600(String arg0, byte arg1) {
        if (arg1 == 0) {
            boolean var3 = false;
        } else {
            this.field1744 = -482;
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
                this.field1753 = true;
            }
            if (arg0.equals("end")) {
                this.field1753 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "([BIIIII)V")
    private void method601(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class35.field1111 * arg2 + arg1;
        int var8 = class35.field1111 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class35.field1113) {
            int var11 = class35.field1113 - arg2;
            arg4 -= var11;
            arg2 = class35.field1113;
            var10 += arg3 * var11;
            var7 += class35.field1111 * var11;
        }
        if (arg2 + arg4 >= class35.field1114) {
            arg4 -= arg2 + arg4 + 1 - class35.field1114;
        }
        if (arg1 < class35.field1115) {
            int var12 = class35.field1115 - arg1;
            arg3 -= var12;
            arg1 = class35.field1115;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class35.field1116) {
            int var13 = arg1 + arg3 + 1 - class35.field1116;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method602(class35.field1110, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method602(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(BIII[BIII)V")
    private void method603(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        int var9 = class35.field1111 * arg1 + arg3;
        int var10 = class35.field1111 - arg5;
        int var11 = 0;
        int var12 = 0;
        if (arg0 != 6) {
            return;
        }
        if (arg1 < class35.field1113) {
            int var13 = class35.field1113 - arg1;
            arg6 -= var13;
            arg1 = class35.field1113;
            var12 += arg5 * var13;
            var9 += class35.field1111 * var13;
        }
        if (arg1 + arg6 >= class35.field1114) {
            arg6 -= arg1 + arg6 + 1 - class35.field1114;
        }
        if (arg3 < class35.field1115) {
            int var14 = class35.field1115 - arg3;
            arg5 -= var14;
            arg3 = class35.field1115;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg5 >= class35.field1116) {
            int var15 = arg3 + arg5 + 1 - class35.field1116;
            arg5 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg5 > 0 && arg6 > 0) {
            this.method604(arg6, arg7, arg4, (byte) 10, var9, var11, arg5, var12, class35.field1110, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(II[BBIIII[III)V")
    private void method604(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = ((arg1 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        if (arg3 != 10) {
            return;
        }
        int var13 = 256 - arg10;
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg2[arg7++] == 0) {
                    arg4++;
                } else {
                    int var16 = arg8[arg4];
                    arg8[arg4++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg4 += arg9;
            arg7 += arg5;
        }
    }
}
