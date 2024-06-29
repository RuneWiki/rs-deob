import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MGTPXZHY")
public class class33 extends class67 {

    @OriginalMember(owner = "client!MGTPXZHY", name = "y", descriptor = "I")
    private int field939 = 182;

    @OriginalMember(owner = "client!MGTPXZHY", name = "z", descriptor = "Z")
    private boolean field940 = false;

    @OriginalMember(owner = "client!MGTPXZHY", name = "A", descriptor = "I")
    private int field941 = 1;

    @OriginalMember(owner = "client!MGTPXZHY", name = "B", descriptor = "Z")
    private boolean field942 = false;

    @OriginalMember(owner = "client!MGTPXZHY", name = "C", descriptor = "I")
    private int field943 = -16;

    @OriginalMember(owner = "client!MGTPXZHY", name = "D", descriptor = "[[B")
    public byte[][] field944 = new byte[256][];

    @OriginalMember(owner = "client!MGTPXZHY", name = "E", descriptor = "[I")
    public int[] field945 = new int[256];

    @OriginalMember(owner = "client!MGTPXZHY", name = "F", descriptor = "[I")
    public int[] field946 = new int[256];

    @OriginalMember(owner = "client!MGTPXZHY", name = "G", descriptor = "[I")
    public int[] field947 = new int[256];

    @OriginalMember(owner = "client!MGTPXZHY", name = "H", descriptor = "[I")
    public int[] field948 = new int[256];

    @OriginalMember(owner = "client!MGTPXZHY", name = "I", descriptor = "[I")
    public int[] field949 = new int[256];

    @OriginalMember(owner = "client!MGTPXZHY", name = "K", descriptor = "Ljava/util/Random;")
    public Random field951 = new Random();

    @OriginalMember(owner = "client!MGTPXZHY", name = "L", descriptor = "Z")
    public boolean field952 = false;

    @OriginalMember(owner = "client!MGTPXZHY", name = "J", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!MGTPXZHY", name = "<init>", descriptor = "(Ljava/lang/String;BZLESUFCMYV;)V")
    public class33(String arg0, byte arg1, boolean arg2, class11 arg3) {
        class53 var5 = new class53(arg3.method205(arg0 + ".dat", null), (byte) -17);
        if (arg1 != -40) {
            this.field940 = !this.field940;
        }
        class53 var6 = new class53(arg3.method205("index.dat", null), (byte) -17);
        boolean var7 = true;
        var6.field1539 = var5.method457() + 4;
        int var8 = var6.method455();
        if (var8 > 0) {
            var6.field1539 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field947[var9] = var6.method455();
            this.field948[var9] = var6.method455();
            int var11 = this.field945[var9] = var6.method457();
            int var12 = this.field946[var9] = var6.method457();
            int var13 = var6.method455();
            int var14 = var11 * var12;
            this.field944[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field944[var9][var15] = var5.method456();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field944[var9][var11 * var17 + var16] = var5.method456();
                    }
                }
            }
            if (var12 > this.field950 && var9 < 128) {
                this.field950 = var12;
            }
            this.field947[var9] = 1;
            this.field949[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field944[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field949[var9]--;
                this.field947[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field944[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field949[var9]--;
            }
        }
        if (arg2) {
            this.field949[32] = this.field949[73];
        } else {
            this.field949[32] = this.field949[105];
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method270(int arg0, int arg1, String arg2, int arg3, int arg4) {
        this.method275(arg4, (byte) 118, arg2, arg0, arg1 - this.method274(-16, arg2));
        while (arg3 >= 0) {
            this.field942 = !this.field942;
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method271(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg1 == 41480) {
            this.method275(arg2, (byte) 118, arg3, arg4, arg0 - this.method274(-16, arg3) / 2);
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
    public void method272(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        this.method279(arg5, arg4 - this.method273(1, arg5) / 2, arg0, arg3, 0, arg1);
        if (arg2 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method273(int arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field949[arg1.charAt(var4)];
            }
        }
        if (arg0 >= this.field941 && arg0 <= this.field941) {
            return var3;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method274(int arg0, String arg1) {
        if (arg0 >= 0) {
            return 3;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field949[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IBLjava/lang/String;II)V")
    public void method275(int arg0, byte arg1, String arg2, int arg3, int arg4) {
        if (arg1 != 118 || arg2 == null) {
            return;
        }
        int var6 = arg3 - this.field950;
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 != ' ') {
                this.method282(this.field944[var8], this.field947[var8] + arg4, this.field948[var8] + var6, this.field945[var8], this.field946[var8], arg0);
            }
            arg4 += this.field949[var8];
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
    public void method276(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method274(-16, arg0) / 2;
        int var8 = arg3 - this.field950;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var12 = arg0.charAt(var9);
            if (var12 != ' ') {
                this.method282(this.field944[var12], this.field947[var12] + var7, this.field948[var12] + var8 + (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field945[var12], this.field946[var12], arg1);
            }
            var7 += this.field949[var12];
        }
        if (arg4 == 1) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method277(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg1 - this.method274(-16, arg4) / 2;
        if (arg3 <= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field950;
        for (int var10 = 0; var10 < arg4.length(); var10++) {
            char var11 = arg4.charAt(var10);
            if (var11 != ' ') {
                this.method282(this.field944[var11], this.field947[var11] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field948[var11] + var9 + (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field945[var11], this.field946[var11], arg5);
            }
            var7 += this.field949[var11];
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
    public void method278(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method274(-16, arg6) / 2;
        int var11 = arg3 - this.field950;
        for (int var12 = 0; var12 < arg6.length(); var12++) {
            char var13 = arg6.charAt(var12);
            if (var13 != ' ') {
                this.method282(this.field944[var13], this.field947[var13] + var10, this.field948[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8), this.field945[var13], this.field946[var13], arg2);
            }
            var10 += this.field949[var13];
        }
        if (arg0 == 102) {
            ;
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
    public void method279(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field952 = false;
        int var7 = arg1;
        if (arg4 != 0 || arg0 == null) {
            return;
        }
        int var8 = arg2 - this.field950;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            if (arg0.charAt(var9) == '@' && var9 + 4 < arg0.length() && arg0.charAt(var9 + 4) == '@') {
                int var10 = this.method281(arg0.substring(var9 + 1, var9 + 4), true);
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg0.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method282(this.field944[var11], this.field947[var11] + arg1 + 1, this.field948[var11] + var8 + 1, this.field945[var11], this.field946[var11], 0);
                    }
                    this.method282(this.field944[var11], this.field947[var11] + arg1, this.field948[var11] + var8, this.field945[var11], this.field946[var11], arg5);
                }
                arg1 += this.field949[var11];
            }
        }
        if (this.field952) {
            class67.method576(var7, arg1 - var7, 893, (int) ((double) this.field950 * 0.7D) + var8, 8388608);
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(ILjava/lang/String;IIZII)V")
    public void method280(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field951.setSeed((long) arg6);
        int var8 = 51 / arg2;
        int var9 = (this.field951.nextInt() & 0x1F) + 192;
        int var10 = arg0 - this.field950;
        for (int var11 = 0; var11 < arg1.length(); var11++) {
            if (arg1.charAt(var11) == '@' && var11 + 4 < arg1.length() && arg1.charAt(var11 + 4) == '@') {
                int var12 = this.method281(arg1.substring(var11 + 1, var11 + 4), true);
                if (var12 != -1) {
                    arg5 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg1.charAt(var11);
                if (var13 != ' ') {
                    if (arg4) {
                        this.method284(0, this.field947[var13] + arg3 + 1, this.field946[var13], this.field948[var13] + var10 + 1, this.field945[var13], 192, 0, this.field944[var13]);
                    }
                    this.method284(arg5, this.field947[var13] + arg3, this.field946[var13], this.field948[var13] + var10, this.field945[var13], var9, 0, this.field944[var13]);
                }
                arg3 += this.field949[var13];
                if ((this.field951.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method281(String arg0, boolean arg1) {
        if (!arg1) {
            this.field941 = 489;
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
                this.field952 = true;
            }
            if (arg0.equals("end")) {
                this.field952 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "([BIIIII)V")
    private void method282(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class67.field1688 * arg2 + arg1;
        int var8 = class67.field1688 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class67.field1690) {
            int var11 = class67.field1690 - arg2;
            arg4 -= var11;
            arg2 = class67.field1690;
            var10 += arg3 * var11;
            var7 += class67.field1688 * var11;
        }
        if (arg2 + arg4 >= class67.field1691) {
            arg4 -= arg2 + arg4 + 1 - class67.field1691;
        }
        if (arg1 < class67.field1692) {
            int var12 = class67.field1692 - arg1;
            arg3 -= var12;
            arg1 = class67.field1692;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class67.field1693) {
            int var13 = arg1 + arg3 + 1 - class67.field1693;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method283(class67.field1687, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method283(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "(IIIIIII[B)V")
    private void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        if (arg6 != 0) {
            this.field943 = -94;
        }
        int var9 = class67.field1688 * arg3 + arg1;
        int var10 = class67.field1688 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (arg3 < class67.field1690) {
            int var13 = class67.field1690 - arg3;
            arg2 -= var13;
            arg3 = class67.field1690;
            var12 += arg4 * var13;
            var9 += class67.field1688 * var13;
        }
        if (arg2 + arg3 >= class67.field1691) {
            arg2 -= arg2 + arg3 + 1 - class67.field1691;
        }
        if (arg1 < class67.field1692) {
            int var14 = class67.field1692 - arg1;
            arg4 -= var14;
            arg1 = class67.field1692;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg4 >= class67.field1693) {
            int var15 = arg1 + arg4 + 1 - class67.field1693;
            arg4 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 > 0 && arg2 > 0) {
            this.method285(arg7, arg4, arg0, var11, var10, arg5, arg2, 3, var12, class67.field1687, var9);
        }
    }

    @OriginalMember(owner = "client!MGTPXZHY", name = "a", descriptor = "([BIIIIIIII[II)V")
    private void method285(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
        if (arg7 != 3) {
            this.field939 = -12;
        }
        int var13 = 256 - arg5;
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                if (arg0[arg8++] == 0) {
                    arg10++;
                } else {
                    int var16 = arg9[arg10];
                    arg9[arg10++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg10 += arg4;
            arg8 += arg3;
        }
    }
}
