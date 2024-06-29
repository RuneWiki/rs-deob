import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UOINBUQD")
public class class60 extends class57 {

    @OriginalMember(owner = "client!UOINBUQD", name = "w", descriptor = "Z")
    private boolean field1560 = true;

    @OriginalMember(owner = "client!UOINBUQD", name = "x", descriptor = "I")
    private int field1561 = 976;

    @OriginalMember(owner = "client!UOINBUQD", name = "y", descriptor = "I")
    private int field1562 = 7;

    @OriginalMember(owner = "client!UOINBUQD", name = "z", descriptor = "Z")
    private boolean field1563 = false;

    @OriginalMember(owner = "client!UOINBUQD", name = "A", descriptor = "[[B")
    public byte[][] field1564 = new byte[256][];

    @OriginalMember(owner = "client!UOINBUQD", name = "B", descriptor = "[I")
    public int[] field1565 = new int[256];

    @OriginalMember(owner = "client!UOINBUQD", name = "C", descriptor = "[I")
    public int[] field1566 = new int[256];

    @OriginalMember(owner = "client!UOINBUQD", name = "D", descriptor = "[I")
    public int[] field1567 = new int[256];

    @OriginalMember(owner = "client!UOINBUQD", name = "E", descriptor = "[I")
    public int[] field1568 = new int[256];

    @OriginalMember(owner = "client!UOINBUQD", name = "F", descriptor = "[I")
    public int[] field1569 = new int[256];

    @OriginalMember(owner = "client!UOINBUQD", name = "H", descriptor = "Ljava/util/Random;")
    public Random field1571 = new Random();

    @OriginalMember(owner = "client!UOINBUQD", name = "I", descriptor = "Z")
    public boolean field1572 = false;

    @OriginalMember(owner = "client!UOINBUQD", name = "G", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!UOINBUQD", name = "<init>", descriptor = "(ZLAWEEREDT;ZLjava/lang/String;)V")
    public class60(boolean arg0, class2 arg1, boolean arg2, String arg3) {
        class25 var5 = new class25(arg1.method14(arg3 + ".dat", null), 713);
        if (arg2) {
            this.field1563 = !this.field1563;
        }
        class25 var6 = new class25(arg1.method14("index.dat", null), 713);
        boolean var7 = true;
        var6.field837 = var5.method247() + 4;
        int var8 = var6.method245();
        if (var8 > 0) {
            var6.field837 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1567[var9] = var6.method245();
            this.field1568[var9] = var6.method245();
            int var11 = this.field1565[var9] = var6.method247();
            int var12 = this.field1566[var9] = var6.method247();
            int var13 = var6.method245();
            int var14 = var11 * var12;
            this.field1564[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1564[var9][var15] = var5.method246();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1564[var9][var11 * var17 + var16] = var5.method246();
                    }
                }
            }
            if (var12 > this.field1570 && var9 < 128) {
                this.field1570 = var12;
            }
            this.field1567[var9] = 1;
            this.field1569[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1564[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1569[var9]--;
                this.field1567[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1564[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1569[var9]--;
            }
        }
        if (arg0) {
            this.field1569[32] = this.field1569[73];
        } else {
            this.field1569[32] = this.field1569[105];
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method501(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method506(arg0, arg1, arg2 - this.method505(arg1, 264), false, arg3);
        if (arg4 != 2) {
            this.field1560 = !this.field1560;
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method502(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg3 != 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method506(arg0, arg2, arg1 - this.method505(arg2, 264) / 2, false, arg4);
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
    public void method503(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 == 1) {
            this.method510(arg0, arg5, arg2 - this.method504(arg0, -665) / 2, arg1, arg4, 441);
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method504(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1569[arg0.charAt(var4)];
            }
        }
        if (arg1 >= 0) {
            return 1;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method505(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        int var4 = 41 / arg1;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var3 += this.field1569[arg0.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
    public void method506(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field1561 = -306;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = arg4 - this.field1570;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method513(this.field1564[var8], this.field1567[var8] + arg2, this.field1568[var8] + var6, this.field1565[var8], this.field1566[var8], arg0);
            }
            arg2 += this.field1569[var8];
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method507(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg0 - this.method505(arg1, 264) / 2;
        if (this.field1562 != arg3) {
            this.field1561 = 337;
        }
        int var8 = arg5 - this.field1570;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method513(this.field1564[var10], this.field1567[var10] + var7, this.field1568[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1565[var10], this.field1566[var10], arg4);
            }
            var7 += this.field1569[var10];
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
    public void method508(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg0 - this.method505(arg4, 264) / 2;
        int var8 = arg3 - this.field1570;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var12 = arg4.charAt(var9);
            if (var12 != ' ') {
                this.method513(this.field1564[var12], this.field1567[var12] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1568[var12] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1565[var12], this.field1566[var12], arg1);
            }
            var7 += this.field1569[var12];
        }
        if (arg5 == 0) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method509(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        int var8 = 18 / arg4;
        if (arg5 == null) {
            return;
        }
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2 - this.method505(arg5, 264) / 2;
        int var12 = arg1 - this.field1570;
        for (int var13 = 0; var13 < arg5.length(); var13++) {
            char var14 = arg5.charAt(var13);
            if (var14 != ' ') {
                this.method513(this.field1564[var14], this.field1567[var14] + var11, this.field1568[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9), this.field1565[var14], this.field1566[var14], arg0);
            }
            var11 += this.field1569[var14];
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
    public void method510(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1572 = false;
        if (arg5 <= 0) {
            return;
        }
        int var7 = arg2;
        if (arg0 == null) {
            return;
        }
        int var8 = arg4 - this.field1570;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method512(0, arg0.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg1) {
                        this.method513(this.field1564[var11], this.field1567[var11] + arg2 + 1, this.field1568[var11] + var8 + 1, this.field1565[var11], this.field1566[var11], 0);
                    }
                    this.method513(this.field1564[var11], this.field1567[var11] + arg2, this.field1568[var11] + var8, this.field1565[var11], this.field1566[var11], arg3);
                }
                arg2 += this.field1569[var11];
            }
        }
        if (this.field1572) {
            class57.method495(9, (int) ((double) this.field1570 * 0.7D) + var8, 8388608, var7, arg2 - var7);
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IIZLjava/lang/String;BII)V")
    public void method511(int arg0, int arg1, boolean arg2, String arg3, byte arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field1571.setSeed((long) arg0);
        int var8 = (this.field1571.nextInt() & 0x1F) + 192;
        if (arg4 != -11) {
            return;
        }
        int var9 = arg6 - this.field1570;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method512(0, arg3.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg5 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method515(this.field1567[var12] + arg1 + 1, -84, this.field1564[var12], 192, this.field1565[var12], this.field1568[var12] + var9 + 1, this.field1566[var12], 0);
                    }
                    this.method515(this.field1567[var12] + arg1, -84, this.field1564[var12], var8, this.field1565[var12], this.field1568[var12] + var9, this.field1566[var12], arg5);
                }
                arg1 += this.field1569[var12];
                if ((this.field1571.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method512(int arg0, String arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
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
                this.field1572 = true;
            }
            if (arg1.equals("end")) {
                this.field1572 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "([BIIIII)V")
    private void method513(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class57.field1530 * arg2 + arg1;
        int var8 = class57.field1530 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class57.field1532) {
            int var11 = class57.field1532 - arg2;
            arg4 -= var11;
            arg2 = class57.field1532;
            var10 += arg3 * var11;
            var7 += class57.field1530 * var11;
        }
        if (arg2 + arg4 >= class57.field1533) {
            arg4 -= arg2 + arg4 + 1 - class57.field1533;
        }
        if (arg1 < class57.field1534) {
            int var12 = class57.field1534 - arg1;
            arg3 -= var12;
            arg1 = class57.field1534;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class57.field1535) {
            int var13 = arg1 + arg3 + 1 - class57.field1535;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method514(class57.field1529, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method514(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(II[BIIIII)V")
    private void method515(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0) {
            return;
        }
        int var9 = class57.field1530 * arg5 + arg0;
        int var10 = class57.field1530 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (arg5 < class57.field1532) {
            int var13 = class57.field1532 - arg5;
            arg6 -= var13;
            arg5 = class57.field1532;
            var12 += arg4 * var13;
            var9 += class57.field1530 * var13;
        }
        if (arg5 + arg6 >= class57.field1533) {
            arg6 -= arg5 + arg6 + 1 - class57.field1533;
        }
        if (arg0 < class57.field1534) {
            int var14 = class57.field1534 - arg0;
            arg4 -= var14;
            arg0 = class57.field1534;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg4 >= class57.field1535) {
            int var15 = arg0 + arg4 + 1 - class57.field1535;
            arg4 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 > 0 && arg6 > 0) {
            this.method516(arg3, arg6, arg2, class57.field1529, var10, var11, 0, var9, arg7, var12, arg4);
        }
    }

    @OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(II[B[IIIIIIII)V")
    private void method516(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg8 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg0 & 0xFF0000) >> 8;
        int var13 = 256 - arg0;
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                if (arg2[arg9++] == 0) {
                    arg7++;
                } else {
                    int var16 = arg3[arg7];
                    arg3[arg7++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg7 += arg4;
            arg9 += arg5;
        }
        if (arg6 != 0) {
            this.field1562 = 42;
        }
    }
}
