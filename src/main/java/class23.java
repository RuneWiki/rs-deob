import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JQUNTFOC")
public class class23 extends class29 {

    @OriginalMember(owner = "JQUNTFOC", name = "z", descriptor = "Z")
    private boolean field940 = false;

    @OriginalMember(owner = "JQUNTFOC", name = "A", descriptor = "I")
    private int field941 = -302;

    @OriginalMember(owner = "JQUNTFOC", name = "B", descriptor = "B")
    private byte field942 = 63;

    @OriginalMember(owner = "JQUNTFOC", name = "C", descriptor = "B")
    private byte field943 = 9;

    @OriginalMember(owner = "JQUNTFOC", name = "D", descriptor = "B")
    private byte field944 = 9;

    @OriginalMember(owner = "JQUNTFOC", name = "E", descriptor = "Z")
    private boolean field945 = false;

    @OriginalMember(owner = "JQUNTFOC", name = "F", descriptor = "[[B")
    public byte[][] field946 = new byte[256][];

    @OriginalMember(owner = "JQUNTFOC", name = "G", descriptor = "[I")
    public int[] field947 = new int[256];

    @OriginalMember(owner = "JQUNTFOC", name = "H", descriptor = "[I")
    public int[] field948 = new int[256];

    @OriginalMember(owner = "JQUNTFOC", name = "I", descriptor = "[I")
    public int[] field949 = new int[256];

    @OriginalMember(owner = "JQUNTFOC", name = "J", descriptor = "[I")
    public int[] field950 = new int[256];

    @OriginalMember(owner = "JQUNTFOC", name = "K", descriptor = "[I")
    public int[] field951 = new int[256];

    @OriginalMember(owner = "JQUNTFOC", name = "M", descriptor = "Ljava/util/Random;")
    public Random field953 = new Random();

    @OriginalMember(owner = "JQUNTFOC", name = "N", descriptor = "Z")
    public boolean field954 = false;

    @OriginalMember(owner = "JQUNTFOC", name = "L", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "JQUNTFOC", name = "<init>", descriptor = "(LLYZBHNJP;ZILjava/lang/String;)V")
    public class23(class31 arg0, boolean arg1, int arg2, String arg3) {
        class69 var5 = new class69(arg0.method290(arg3 + ".dat", null), this.field941);
        class69 var6 = new class69(arg0.method290("index.dat", null), this.field941);
        boolean var7 = true;
        var6.field1700 = var5.method549() + 4;
        int var8 = var6.method547();
        if (var8 > 0) {
            var6.field1700 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field949[var9] = var6.method547();
            this.field950[var9] = var6.method547();
            int var12 = this.field947[var9] = var6.method549();
            int var13 = this.field948[var9] = var6.method549();
            int var14 = var6.method547();
            int var15 = var12 * var13;
            this.field946[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field946[var9][var16] = var5.method548();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field946[var9][var12 * var18 + var17] = var5.method548();
                    }
                }
            }
            if (var13 > this.field952 && var9 < 128) {
                this.field952 = var13;
            }
            this.field949[var9] = 1;
            this.field951[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field946[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field951[var9]--;
                this.field949[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field946[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field951[var9]--;
            }
        }
        if (arg2 >= 0) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (arg1) {
            this.field951[32] = this.field951[73];
        } else {
            this.field951[32] = this.field951[105];
            if (class72.field1737) {
            }
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(Ljava/lang/String;IIZI)V")
    public void method236(String arg0, int arg1, int arg2, boolean arg3, int arg4) {
        this.method241(arg4, arg0, 3, arg1, arg2 - this.method240((byte) 63, arg0));
        if (!arg3) {
            ;
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(IILjava/lang/String;ZI)V")
    public void method237(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method241(arg1, arg2, 3, arg0, arg4 - this.method240((byte) 63, arg2) / 2);
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
    public void method238(int arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5) {
        this.method245(arg4 - this.method239(false, arg3) / 2, -224, arg3, arg5, arg1, arg0);
        if (arg2 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method239(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0) {
            return this.field941;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field951[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method240(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (this.field942 != arg0) {
            this.field940 = !this.field940;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field951[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method241(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field952;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method248(this.field946[var8], this.field949[var8] + arg4, this.field950[var8] + var6, this.field947[var8], this.field948[var8], arg0);
            }
            arg4 += this.field951[var8];
        }
        if (arg2 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
    public void method242(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method240((byte) 63, arg1) / 2;
        int var8 = arg5 - this.field952;
        if (arg0) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method248(this.field946[var10], this.field949[var10] + var7, this.field950[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field947[var10], this.field948[var10], arg4);
            }
            var7 += this.field951[var10];
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
    public void method243(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg0 - this.method240((byte) 63, arg1) / 2;
        if (!arg2) {
            this.field941 = -168;
        }
        int var8 = arg4 - this.field952;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method248(this.field946[var10], this.field949[var10] + var7 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field950[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field947[var10], this.field948[var10], arg5);
            }
            var7 += this.field951[var10];
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method244(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (arg0 <= 0) {
            this.field945 = !this.field945;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg1 - this.method240((byte) 63, arg3) / 2;
        int var11 = arg2 - this.field952;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method248(this.field946[var13], this.field949[var13] + var10, this.field950[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8), this.field947[var13], this.field948[var13], arg4);
            }
            var10 += this.field951[var13];
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
    public void method245(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
        this.field954 = false;
        int var7 = arg0;
        if (arg1 >= 0 || arg2 == null) {
            return;
        }
        int var8 = arg4 - this.field952;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method247(-5945, arg2.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg5 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg2.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method248(this.field946[var11], this.field949[var11] + arg0 + 1, this.field950[var11] + var8 + 1, this.field947[var11], this.field948[var11], 0);
                    }
                    this.method248(this.field946[var11], this.field949[var11] + arg0, this.field950[var11] + var8, this.field947[var11], this.field948[var11], arg5);
                }
                arg0 += this.field951[var11];
            }
        }
        if (this.field954) {
            class29.method272(8388608, -399, arg0 - var7, var7, (int) ((double) this.field952 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(IIIZILjava/lang/String;I)V")
    public void method246(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        this.field953.setSeed((long) arg6);
        int var8 = (this.field953.nextInt() & 0x1F) + 192;
        if (arg0 != -19642) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg4 - this.field952;
        for (int var11 = 0; var11 < arg5.length(); var11++) {
            if (arg5.charAt(var11) == '@' && var11 + 4 < arg5.length() && arg5.charAt(var11 + 4) == '@') {
                int var12 = this.method247(-5945, arg5.substring(var11 + 1, var11 + 4));
                if (var12 != -1) {
                    arg2 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg5.charAt(var11);
                if (var13 != ' ') {
                    if (arg3) {
                        this.method250(this.field943, this.field946[var13], 0, this.field948[var13], 192, this.field950[var13] + var10 + 1, this.field947[var13], this.field949[var13] + arg1 + 1);
                    }
                    this.method250(this.field943, this.field946[var13], arg2, this.field948[var13], var8, this.field950[var13] + var10, this.field947[var13], this.field949[var13] + arg1);
                }
                arg1 += this.field951[var13];
                if ((this.field953.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method247(int arg0, String arg1) {
        if (arg0 != -5945) {
            return this.field941;
        } else if (arg1.equals("red")) {
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
                this.field954 = true;
            }
            if (arg1.equals("end")) {
                this.field954 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "([BIIIII)V")
    private void method248(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class29.field1003 * arg2 + arg1;
        int var8 = class29.field1003 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class29.field1005) {
            int var11 = class29.field1005 - arg2;
            arg4 -= var11;
            arg2 = class29.field1005;
            var10 += arg3 * var11;
            var7 += class29.field1003 * var11;
        }
        if (arg2 + arg4 >= class29.field1006) {
            arg4 -= arg2 + arg4 + 1 - class29.field1006;
        }
        if (arg1 < class29.field1007) {
            int var12 = class29.field1007 - arg1;
            arg3 -= var12;
            arg1 = class29.field1007;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class29.field1008) {
            int var13 = arg1 + arg3 + 1 - class29.field1008;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method249(class29.field1002, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method249(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(B[BIIIIII)V")
    private void method250(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field944 != arg0) {
            this.field941 = 83;
        }
        int var9 = class29.field1003 * arg5 + arg7;
        int var10 = class29.field1003 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg5 < class29.field1005) {
            int var13 = class29.field1005 - arg5;
            arg3 -= var13;
            arg5 = class29.field1005;
            var12 += arg6 * var13;
            var9 += class29.field1003 * var13;
        }
        if (arg3 + arg5 >= class29.field1006) {
            arg3 -= arg3 + arg5 + 1 - class29.field1006;
        }
        if (arg7 < class29.field1007) {
            int var14 = class29.field1007 - arg7;
            arg6 -= var14;
            arg7 = class29.field1007;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg6 + arg7 >= class29.field1008) {
            int var15 = arg6 + arg7 + 1 - class29.field1008;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg3 > 0) {
            this.method251(var9, arg3, var10, arg1, var11, arg6, 0, var12, arg2, arg4, class29.field1002);
        }
    }

    @OriginalMember(owner = "JQUNTFOC", name = "a", descriptor = "(III[BIIIIII[I)V")
    private void method251(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = ((arg8 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var13 = 256 - arg9;
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg5; var15 < 0; var15++) {
                if (arg3[arg7++] == 0) {
                    arg0++;
                } else {
                    int var16 = arg10[arg0];
                    arg10[arg0++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg2;
            arg7 += arg4;
        }
        if (arg6 != 0) {
            this.field945 = !this.field945;
        }
    }
}
