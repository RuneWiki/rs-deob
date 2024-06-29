import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JDPYRDAS")
public class PixFont extends Draw2D {

    @OriginalMember(owner = "client!JDPYRDAS", name = "w", descriptor = "Z")
    private boolean field884 = true;

    @OriginalMember(owner = "client!JDPYRDAS", name = "x", descriptor = "Z")
    private boolean field885 = true;

    @OriginalMember(owner = "client!JDPYRDAS", name = "y", descriptor = "I")
    private int field886 = 3;

    @OriginalMember(owner = "client!JDPYRDAS", name = "z", descriptor = "I")
    private int field887 = 3;

    @OriginalMember(owner = "client!JDPYRDAS", name = "A", descriptor = "[[B")
    public byte[][] field888 = new byte[256][];

    @OriginalMember(owner = "client!JDPYRDAS", name = "B", descriptor = "[I")
    public int[] field889 = new int[256];

    @OriginalMember(owner = "client!JDPYRDAS", name = "C", descriptor = "[I")
    public int[] field890 = new int[256];

    @OriginalMember(owner = "client!JDPYRDAS", name = "D", descriptor = "[I")
    public int[] field891 = new int[256];

    @OriginalMember(owner = "client!JDPYRDAS", name = "E", descriptor = "[I")
    public int[] field892 = new int[256];

    @OriginalMember(owner = "client!JDPYRDAS", name = "F", descriptor = "[I")
    public int[] field893 = new int[256];

    @OriginalMember(owner = "client!JDPYRDAS", name = "H", descriptor = "Ljava/util/Random;")
    public Random field895 = new Random();

    @OriginalMember(owner = "client!JDPYRDAS", name = "I", descriptor = "Z")
    public boolean field896 = false;

    @OriginalMember(owner = "client!JDPYRDAS", name = "G", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!JDPYRDAS", name = "<init>", descriptor = "(ZLATJMVOZR;ILjava/lang/String;)V")
    public PixFont(boolean arg0, Jagfile arg1, int arg2, String arg3) {
        Packet var5 = new Packet(true, arg1.method2(arg3 + ".dat", null));
        Packet var6 = new Packet(true, arg1.method2("index.dat", null));
        boolean var7 = true;
        var6.pos = var5.g2() + 4;
        while (arg2 >= 0) {
            this.field884 = !this.field884;
        }
        int var8 = var6.g1();
        if (var8 > 0) {
            var6.pos += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field891[var9] = var6.g1();
            this.field892[var9] = var6.g1();
            int var11 = this.field889[var9] = var6.g2();
            int var12 = this.field890[var9] = var6.g2();
            int var13 = var6.g1();
            int var14 = var11 * var12;
            this.field888[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field888[var9][var15] = var5.g1b();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field888[var9][var11 * var17 + var16] = var5.g1b();
                    }
                }
            }
            if (var12 > this.field894 && var9 < 128) {
                this.field894 = var12;
            }
            this.field891[var9] = 1;
            this.field893[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field888[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field893[var9]--;
                this.field891[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field888[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field893[var9]--;
            }
        }
        if (arg0) {
            this.field893[32] = this.field893[73];
        } else {
            this.field893[32] = this.field893[105];
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ZLjava/lang/String;III)V")
    public void method243(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method248(2245, arg3 - this.method247(arg1, (byte) -53), arg2, arg4, arg1);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method244(int arg0, int arg1, int arg2, int arg3, String arg4) {
        this.method248(2245, arg0 - this.method247(arg4, (byte) -53) / 2, arg3, arg2, arg4);
        int var6 = 21 / arg1;
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ZIIIILjava/lang/String;)V")
    public void method245(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg1 >= this.field886 && arg1 <= this.field886) {
            this.method252(arg2, arg4 - this.method246((byte) 35, arg5) / 2, arg3, arg0, arg5, -39629);
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method246(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field893[arg1.charAt(var4)];
            }
        }
        if (arg0 != 35) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method247(String arg0, byte arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != -53) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            var3 += this.field893[arg0.charAt(var5)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "b", descriptor = "(IIIILjava/lang/String;)V")
    public void method248(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg0 != 2245) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg4 == null) {
            return;
        }
        int var7 = arg3 - this.field894;
        for (int var8 = 0; var8 < arg4.length(); var8++) {
            char var9 = arg4.charAt(var8);
            if (var9 != ' ') {
                this.method255(this.field888[var9], this.field891[var9] + arg1, this.field892[var9] + var7, this.field889[var9], this.field890[var9], arg2);
            }
            arg1 += this.field893[var9];
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IBILjava/lang/String;II)V")
    public void method249(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg4 - this.method247(arg3, (byte) -53) / 2;
        if (arg1 == 4) {
            boolean var8 = false;
        } else {
            this.field885 = !this.field885;
        }
        int var9 = arg0 - this.field894;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            char var11 = arg3.charAt(var10);
            if (var11 != ' ') {
                this.method255(this.field888[var11], this.field891[var11] + var7, this.field892[var11] + var9 + (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D), this.field889[var11], this.field890[var11], arg5);
            }
            var7 += this.field893[var11];
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIBLjava/lang/String;II)V")
    public void method250(int arg0, int arg1, byte arg2, String arg3, int arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg4 - this.method247(arg3, (byte) -53) / 2;
        if (arg2 != 1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg0 - this.field894;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            char var11 = arg3.charAt(var10);
            if (var11 != ' ') {
                this.method255(this.field888[var11], this.field891[var11] + var7 + (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field892[var11] + var9 + (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field889[var11], this.field890[var11], arg1);
            }
            var7 += this.field893[var11];
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public void method251(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg5 / 8.0D;
        while (arg0 >= 0) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg3 - this.method247(arg1, (byte) -53) / 2;
        int var11 = arg4 - this.field894;
        for (int var12 = 0; var12 < arg1.length(); var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 != ' ') {
                this.method255(this.field888[var13], this.field891[var13] + var10, this.field892[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field889[var13], this.field890[var13], arg2);
            }
            var10 += this.field893[var13];
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
    public void method252(int arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5) {
        this.field896 = false;
        if (arg5 != -39629) {
            return;
        }
        int var7 = arg1;
        if (arg4 == null) {
            return;
        }
        int var8 = arg2 - this.field894;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method254(this.field887, arg4.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method255(this.field888[var11], this.field891[var11] + arg1 + 1, this.field892[var11] + var8 + 1, this.field889[var11], this.field890[var11], 0);
                    }
                    this.method255(this.field888[var11], this.field891[var11] + arg1, this.field892[var11] + var8, this.field889[var11], this.field890[var11], arg0);
                }
                arg1 += this.field893[var11];
            }
        }
        if (this.field896) {
            Draw2D.method340(var7, 8388608, (int) ((double) this.field894 * 0.7D) + var8, arg1 - var7, true);
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ZIIIILjava/lang/String;I)V")
    public void method253(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        this.field895.setSeed((long) arg1);
        int var8 = (this.field895.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field894;
        if (arg6 != 0) {
            this.field887 = 489;
        }
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            if (arg5.charAt(var10) == '@' && var10 + 4 < arg5.length() && arg5.charAt(var10 + 4) == '@') {
                int var11 = this.method254(this.field887, arg5.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg5.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method257(this.field891[var12] + arg2 + 1, true, 0, this.field888[var12], this.field892[var12] + var9 + 1, this.field890[var12], this.field889[var12], 192);
                    }
                    this.method257(this.field891[var12] + arg2, true, arg3, this.field888[var12], this.field892[var12] + var9, this.field890[var12], this.field889[var12], var8);
                }
                arg2 += this.field893[var12];
                if ((this.field895.nextInt() & 0x3) == 0) {
                    arg2++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method254(int arg0, String arg1) {
        if (this.field887 != arg0) {
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
                this.field896 = true;
            }
            if (arg1.equals("end")) {
                this.field896 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "([BIIIII)V")
    private void method255(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Draw2D.field1095 * arg2 + arg1;
        int var8 = Draw2D.field1095 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Draw2D.field1097) {
            int var11 = Draw2D.field1097 - arg2;
            arg4 -= var11;
            arg2 = Draw2D.field1097;
            var10 += arg3 * var11;
            var7 += Draw2D.field1095 * var11;
        }
        if (arg2 + arg4 >= Draw2D.field1098) {
            arg4 -= arg2 + arg4 + 1 - Draw2D.field1098;
        }
        if (arg1 < Draw2D.field1099) {
            int var12 = Draw2D.field1099 - arg1;
            arg3 -= var12;
            arg1 = Draw2D.field1099;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= Draw2D.field1100) {
            int var13 = arg1 + arg3 + 1 - Draw2D.field1100;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method256(Draw2D.field1094, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method256(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IZI[BIIII)V")
    private void method257(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = Draw2D.field1095 * arg4 + arg0;
        int var10 = Draw2D.field1095 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (!arg1) {
            return;
        }
        if (arg4 < Draw2D.field1097) {
            int var13 = Draw2D.field1097 - arg4;
            arg5 -= var13;
            arg4 = Draw2D.field1097;
            var12 += arg6 * var13;
            var9 += Draw2D.field1095 * var13;
        }
        if (arg4 + arg5 >= Draw2D.field1098) {
            arg5 -= arg4 + arg5 + 1 - Draw2D.field1098;
        }
        if (arg0 < Draw2D.field1099) {
            int var14 = Draw2D.field1099 - arg0;
            arg6 -= var14;
            arg0 = Draw2D.field1099;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg6 >= Draw2D.field1100) {
            int var15 = arg0 + arg6 + 1 - Draw2D.field1100;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg5 > 0) {
            this.method258(var12, var10, var11, var9, arg7, Draw2D.field1094, arg2, 2, arg5, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!JDPYRDAS", name = "a", descriptor = "(IIIII[IIIII[B)V")
    private void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        if (arg7 < 2 || arg7 > 2) {
            this.field884 = !this.field884;
        }
        int var12 = ((arg6 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        int var13 = 256 - arg4;
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = -arg9; var15 < 0; var15++) {
                if (arg10[arg0++] == 0) {
                    arg3++;
                } else {
                    int var16 = arg5[arg3];
                    arg5[arg3++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg3 += arg1;
            arg0 += arg2;
        }
    }
}
