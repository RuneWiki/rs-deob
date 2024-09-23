import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IDBGYHWK")
public class class20 extends class53 {

    @OriginalMember(owner = "IDBGYHWK", name = "z", descriptor = "Z")
    private boolean field758 = true;

    @OriginalMember(owner = "IDBGYHWK", name = "A", descriptor = "I")
    private int field759 = -592;

    @OriginalMember(owner = "IDBGYHWK", name = "B", descriptor = "I")
    private int field760 = 737;

    @OriginalMember(owner = "IDBGYHWK", name = "C", descriptor = "B")
    private byte field761 = 2;

    @OriginalMember(owner = "IDBGYHWK", name = "D", descriptor = "B")
    private byte field762 = -77;

    @OriginalMember(owner = "IDBGYHWK", name = "E", descriptor = "[[B")
    public byte[][] field763 = new byte[256][];

    @OriginalMember(owner = "IDBGYHWK", name = "F", descriptor = "[I")
    public int[] field764 = new int[256];

    @OriginalMember(owner = "IDBGYHWK", name = "G", descriptor = "[I")
    public int[] field765 = new int[256];

    @OriginalMember(owner = "IDBGYHWK", name = "H", descriptor = "[I")
    public int[] field766 = new int[256];

    @OriginalMember(owner = "IDBGYHWK", name = "I", descriptor = "[I")
    public int[] field767 = new int[256];

    @OriginalMember(owner = "IDBGYHWK", name = "J", descriptor = "[I")
    public int[] field768 = new int[256];

    @OriginalMember(owner = "IDBGYHWK", name = "L", descriptor = "Ljava/util/Random;")
    public Random field770 = new Random();

    @OriginalMember(owner = "IDBGYHWK", name = "M", descriptor = "Z")
    public boolean field771 = false;

    @OriginalMember(owner = "IDBGYHWK", name = "K", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "IDBGYHWK", name = "<init>", descriptor = "(Ljava/lang/String;LRVLWVPJQ;ZI)V")
    public class20(String arg0, class50 arg1, boolean arg2, int arg3) {
        class55 var5 = new class55(741, arg1.method424(arg0 + ".dat", null));
        class55 var6 = new class55(741, arg1.method424("index.dat", null));
        boolean var7 = true;
        var6.field1456 = var5.method457() + 4;
        int var8 = var6.method455();
        if (var8 > 0) {
            var6.field1456 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field766[var9] = var6.method455();
            this.field767[var9] = var6.method455();
            int var12 = this.field764[var9] = var6.method457();
            int var13 = this.field765[var9] = var6.method457();
            int var14 = var6.method455();
            int var15 = var12 * var13;
            this.field763[var9] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field763[var9][var16] = var5.method456();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field763[var9][var12 * var18 + var17] = var5.method456();
                    }
                }
            }
            if (var13 > this.field769 && var9 < 128) {
                this.field769 = var13;
            }
            this.field766[var9] = 1;
            this.field768[var9] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field763[var9][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field768[var9]--;
                this.field766[var9] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field763[var9][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field768[var9]--;
            }
        }
        if (arg3 != 8801) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (arg2) {
            this.field768[32] = this.field768[73];
        } else {
            this.field768[32] = this.field768[105];
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method240(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 0) {
            this.field759 = 13;
        }
        this.method245(arg3, arg2 - this.method244(arg0, false), arg4, arg0, (byte) 2);
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method241(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg3 == 0) {
            this.method245(arg4, arg1 - this.method244(arg2, false) / 2, arg0, arg2, (byte) 2);
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
    public void method242(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
        if (arg0 >= 0) {
            this.field760 = -406;
        }
        this.method249(arg2, 7, arg3, arg1, arg4 - this.method243(arg3, true) / 2, arg5);
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method243(String arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.field768[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "IDBGYHWK", name = "b", descriptor = "(Ljava/lang/String;Z)I")
    public int method244(String arg0, boolean arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1) {
            return this.field759;
        } else {
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                var3 += this.field768[arg0.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(IIILjava/lang/String;B)V")
    public void method245(int arg0, int arg1, int arg2, String arg3, byte arg4) {
        if (this.field761 != arg4) {
            this.field758 = !this.field758;
        }
        if (arg3 == null) {
            return;
        }
        int var6 = arg2 - this.field769;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            char var8 = arg3.charAt(var7);
            if (var8 != ' ') {
                this.method252(this.field763[var8], this.field766[var8] + arg1, this.field767[var8] + var6, this.field764[var8], this.field765[var8], arg0);
            }
            arg1 += this.field768[var8];
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method246(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg5 - this.method244(arg1, false) / 2;
        if (arg2 >= 0) {
            return;
        }
        int var8 = arg0 - this.field769;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method252(this.field763[var10], this.field766[var10] + var7, this.field767[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field764[var10], this.field765[var10], arg4);
            }
            var7 += this.field768[var10];
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method247(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg4 == null) {
            return;
        }
        int var7 = arg5 - this.method244(arg4, false) / 2;
        int var8 = arg3 - this.field769;
        if (arg0 != 0) {
            this.field760 = -347;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method252(this.field763[var10], this.field766[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field767[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field764[var10], this.field765[var10], arg1);
            }
            var7 += this.field768[var10];
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method248(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method244(arg3, false) / 2;
        int var11 = arg6 - this.field769;
        if (arg5 != 0) {
            this.field760 = -244;
        }
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method252(this.field763[var13], this.field766[var13] + var10, this.field767[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg0) * var8), this.field764[var13], this.field765[var13], arg1);
            }
            var10 += this.field768[var13];
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(ZILjava/lang/String;III)V")
    public void method249(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        this.field771 = false;
        if (arg1 != 7) {
            return;
        }
        int var7 = arg4;
        if (arg2 == null) {
            return;
        }
        int var8 = arg5 - this.field769;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method251(false, arg2.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg2.charAt(var9);
                if (var11 != ' ') {
                    if (arg0) {
                        this.method252(this.field763[var11], this.field766[var11] + arg4 + 1, this.field767[var11] + var8 + 1, this.field764[var11], this.field765[var11], 0);
                    }
                    this.method252(this.field763[var11], this.field766[var11] + arg4, this.field767[var11] + var8, this.field764[var11], this.field765[var11], arg3);
                }
                arg4 += this.field768[var11];
            }
        }
        if (this.field771) {
            class53.method435((byte) 1, (int) ((double) this.field769 * 0.7D) + var8, arg4 - var7, 8388608, var7);
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
    public void method250(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == null) {
            return;
        }
        this.field770.setSeed((long) arg0);
        int var8 = (this.field770.nextInt() & 0x1F) + 192;
        int var9 = arg5 - this.field769;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method251(false, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg2 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method254(this.field764[var12], this.field763[var12], this.field766[var12] + arg4 + 1, 0, 192, this.field765[var12], 35418, this.field767[var12] + var9 + 1);
                    }
                    this.method254(this.field764[var12], this.field763[var12], this.field766[var12] + arg4, arg2, var8, this.field765[var12], 35418, this.field767[var12] + var9);
                }
                arg4 += this.field768[var12];
                if ((this.field770.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
        if (arg3 <= 0) {
            this.field759 = 72;
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method251(boolean arg0, String arg1) {
        if (arg0) {
            return 4;
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
                this.field771 = true;
            }
            if (arg1.equals("end")) {
                this.field771 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "([BIIIII)V")
    private void method252(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class53.field1372 * arg2 + arg1;
        int var8 = class53.field1372 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class53.field1374) {
            int var11 = class53.field1374 - arg2;
            arg4 -= var11;
            arg2 = class53.field1374;
            var10 += arg3 * var11;
            var7 += class53.field1372 * var11;
        }
        if (arg2 + arg4 >= class53.field1375) {
            arg4 -= arg2 + arg4 + 1 - class53.field1375;
        }
        if (arg1 < class53.field1376) {
            int var12 = class53.field1376 - arg1;
            arg3 -= var12;
            arg1 = class53.field1376;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class53.field1377) {
            int var13 = arg1 + arg3 + 1 - class53.field1377;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method253(class53.field1371, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method253(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "(I[BIIIIII)V")
    private void method254(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 35418) {
            this.field759 = 131;
        }
        int var9 = class53.field1372 * arg7 + arg2;
        int var10 = class53.field1372 - arg0;
        int var11 = 0;
        int var12 = 0;
        if (arg7 < class53.field1374) {
            int var13 = class53.field1374 - arg7;
            arg5 -= var13;
            arg7 = class53.field1374;
            var12 += arg0 * var13;
            var9 += class53.field1372 * var13;
        }
        if (arg5 + arg7 >= class53.field1375) {
            arg5 -= arg5 + arg7 + 1 - class53.field1375;
        }
        if (arg2 < class53.field1376) {
            int var14 = class53.field1376 - arg2;
            arg0 -= var14;
            arg2 = class53.field1376;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg2 >= class53.field1377) {
            int var15 = arg0 + arg2 + 1 - class53.field1377;
            arg0 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg0 > 0 && arg5 > 0) {
            this.method255(class53.field1371, var12, arg5, arg3, var11, arg1, var9, var10, arg0, arg4, this.field762);
        }
    }

    @OriginalMember(owner = "IDBGYHWK", name = "a", descriptor = "([IIIII[BIIIIB)V")
    private void method255(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        int var12 = ((arg3 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        if (arg10 != -77) {
            this.field758 = !this.field758;
        }
        int var13 = 256 - arg9;
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg8; var15 < 0; var15++) {
                if (arg5[arg1++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg0[arg6];
                    arg0[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg7;
            arg1 += arg4;
        }
    }
}
