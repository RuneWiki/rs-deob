import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BKBLJVKV")
public class class5 extends class8 {

    @OriginalMember(owner = "client!BKBLJVKV", name = "w", descriptor = "Z")
    private boolean field77 = true;

    @OriginalMember(owner = "client!BKBLJVKV", name = "x", descriptor = "I")
    private int field78 = 2;

    @OriginalMember(owner = "client!BKBLJVKV", name = "y", descriptor = "I")
    private int field79 = -21443;

    @OriginalMember(owner = "client!BKBLJVKV", name = "A", descriptor = "B")
    private byte field81 = 8;

    @OriginalMember(owner = "client!BKBLJVKV", name = "C", descriptor = "[[B")
    public byte[][] field83 = new byte[256][];

    @OriginalMember(owner = "client!BKBLJVKV", name = "D", descriptor = "[I")
    public int[] field84 = new int[256];

    @OriginalMember(owner = "client!BKBLJVKV", name = "E", descriptor = "[I")
    public int[] field85 = new int[256];

    @OriginalMember(owner = "client!BKBLJVKV", name = "F", descriptor = "[I")
    public int[] field86 = new int[256];

    @OriginalMember(owner = "client!BKBLJVKV", name = "G", descriptor = "[I")
    public int[] field87 = new int[256];

    @OriginalMember(owner = "client!BKBLJVKV", name = "H", descriptor = "[I")
    public int[] field88 = new int[256];

    @OriginalMember(owner = "client!BKBLJVKV", name = "J", descriptor = "Ljava/util/Random;")
    public Random field90 = new Random();

    @OriginalMember(owner = "client!BKBLJVKV", name = "K", descriptor = "Z")
    public boolean field91 = false;

    @OriginalMember(owner = "client!BKBLJVKV", name = "I", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!BKBLJVKV", name = "z", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "client!BKBLJVKV", name = "B", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client!BKBLJVKV", name = "<init>", descriptor = "(Ljava/lang/String;ZILVSQMPWOM;)V")
    public class5(String arg0, boolean arg1, int arg2, class59 arg3) {
        class3 var5 = new class3(arg3.method526(arg0 + ".dat", null), -990);
        class3 var6 = new class3(arg3.method526("index.dat", null), -990);
        boolean var7 = true;
        var6.field50 = var5.method56() + 4;
        if (arg2 < 2 || arg2 > 2) {
            throw new NullPointerException();
        }
        int var8 = var6.method54();
        if (var8 > 0) {
            var6.field50 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field86[var9] = var6.method54();
            this.field87[var9] = var6.method54();
            int var11 = this.field84[var9] = var6.method56();
            int var12 = this.field85[var9] = var6.method56();
            int var13 = var6.method54();
            int var14 = var11 * var12;
            this.field83[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field83[var9][var15] = var5.method55();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field83[var9][var11 * var17 + var16] = var5.method55();
                    }
                }
            }
            if (var12 > this.field89 && var9 < 128) {
                this.field89 = var12;
            }
            this.field86[var9] = 1;
            this.field88[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field83[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field88[var9]--;
                this.field86[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field83[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field88[var9]--;
            }
        }
        if (arg1) {
            this.field88[32] = this.field88[73];
        } else {
            this.field88[32] = this.field88[105];
            if (class30.field1023) {
            }
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method95(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (this.field79 != arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method100(arg3, arg2, 20424, arg4 - this.method99(arg2, 0), arg1);
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IBILjava/lang/String;I)V")
    public void method96(int arg0, byte arg1, int arg2, String arg3, int arg4) {
        this.method100(arg0, arg3, 20424, arg4 - this.method99(arg3, 0) / 2, arg2);
        if (arg1 != 8) {
            this.field82 = 489;
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
    public void method97(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg2 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method104(arg0, arg4, arg5 - this.method98(arg1, 2) / 2, arg3, arg1, 4);
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method98(String arg0, int arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (this.field78 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var3 += this.field88[arg0.charAt(var5)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public int method99(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field77 = !this.field77;
        }
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field88[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method100(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 - this.field89;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method107(this.field83[var8], this.field86[var8] + arg3, this.field87[var8] + var6, this.field84[var8], this.field85[var8], arg4);
            }
            arg3 += this.field88[var8];
        }
        if (arg2 == 20424) {
            ;
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method101(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg2 - this.method99(arg1, 0) / 2;
        int var8 = arg0 - this.field89;
        if (arg4 != 0) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method107(this.field83[var10], this.field86[var10] + var7, this.field87[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field84[var10], this.field85[var10], arg5);
            }
            var7 += this.field88[var10];
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method102(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg4 - this.method99(arg5, 0) / 2;
        int var8 = 24 / arg1;
        int var9 = arg2 - this.field89;
        for (int var10 = 0; var10 < arg5.length(); var10++) {
            char var11 = arg5.charAt(var10);
            if (var11 != ' ') {
                this.method107(this.field83[var11], this.field86[var11] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field87[var11] + var9 + (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field84[var11], this.field85[var11], arg3);
            }
            var7 += this.field88[var11];
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method103(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (arg1 >= 0) {
            return;
        }
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg3 - this.method99(arg5, 0) / 2;
        int var11 = arg4 - this.field89;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method107(this.field83[var13], this.field86[var13] + var10, this.field87[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field84[var13], this.field85[var13], arg2);
            }
            var10 += this.field88[var13];
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(ZIIILjava/lang/String;I)V")
    public void method104(boolean arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        this.field91 = false;
        int var7 = arg2;
        if (arg4 == null) {
            return;
        }
        int var8 = arg1 - this.field89;
        if (arg5 < 4 || arg5 > 4) {
            return;
        }
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            if (arg4.charAt(var9) == '@' && var9 + 4 < arg4.length() && arg4.charAt(var9 + 4) == '@') {
                int var10 = this.method106(arg4.substring(var9 + 1, var9 + 4), -12688);
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg4.charAt(var9);
                if (var11 != ' ') {
                    if (arg0) {
                        this.method107(this.field83[var11], this.field86[var11] + arg2 + 1, this.field87[var11] + var8 + 1, this.field84[var11], this.field85[var11], 0);
                    }
                    this.method107(this.field83[var11], this.field86[var11] + arg2, this.field87[var11] + var8, this.field84[var11], this.field85[var11], arg3);
                }
                arg2 += this.field88[var11];
            }
        }
        if (this.field91) {
            class8.method146(-898, arg2 - var7, var7, 8388608, (int) ((double) this.field89 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
    public void method105(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6) {
        if (arg2 <= 0) {
            this.field80 = -79;
        }
        if (arg6 == null) {
            return;
        }
        this.field90.setSeed((long) arg0);
        int var8 = (this.field90.nextInt() & 0x1F) + 192;
        int var9 = arg1 - this.field89;
        for (int var10 = 0; var10 < arg6.length(); var10++) {
            if (arg6.charAt(var10) == '@' && var10 + 4 < arg6.length() && arg6.charAt(var10 + 4) == '@') {
                int var11 = this.method106(arg6.substring(var10 + 1, var10 + 4), -12688);
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg6.charAt(var10);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method109(this.field86[var12] + arg4 + 1, this.field85[var12], 0, this.field87[var12] + var9 + 1, this.field84[var12], (byte) 8, 192, this.field83[var12]);
                    }
                    this.method109(this.field86[var12] + arg4, this.field85[var12], arg3, this.field87[var12] + var9, this.field84[var12], (byte) 8, var8, this.field83[var12]);
                }
                arg4 += this.field88[var12];
                if ((this.field90.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public int method106(String arg0, int arg1) {
        if (arg1 != -12688) {
            this.field78 = 213;
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
                this.field91 = true;
            }
            if (arg0.equals("end")) {
                this.field91 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "([BIIIII)V")
    private void method107(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class8.field152 * arg2 + arg1;
        int var8 = class8.field152 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class8.field154) {
            int var11 = class8.field154 - arg2;
            arg4 -= var11;
            arg2 = class8.field154;
            var10 += arg3 * var11;
            var7 += class8.field152 * var11;
        }
        if (arg2 + arg4 >= class8.field155) {
            arg4 -= arg2 + arg4 + 1 - class8.field155;
        }
        if (arg1 < class8.field156) {
            int var12 = class8.field156 - arg1;
            arg3 -= var12;
            arg1 = class8.field156;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class8.field157) {
            int var13 = arg1 + arg3 + 1 - class8.field157;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method108(class8.field151, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method108(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(IIIIIBI[B)V")
    private void method109(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, byte[] arg7) {
        int var9 = class8.field152 * arg3 + arg0;
        int var10 = class8.field152 - arg4;
        int var11 = 0;
        int var12 = 0;
        if (this.field81 != arg5) {
            return;
        }
        if (arg3 < class8.field154) {
            int var13 = class8.field154 - arg3;
            arg1 -= var13;
            arg3 = class8.field154;
            var12 += arg4 * var13;
            var9 += class8.field152 * var13;
        }
        if (arg1 + arg3 >= class8.field155) {
            arg1 -= arg1 + arg3 + 1 - class8.field155;
        }
        if (arg0 < class8.field156) {
            int var14 = class8.field156 - arg0;
            arg4 -= var14;
            arg0 = class8.field156;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg0 + arg4 >= class8.field157) {
            int var15 = arg0 + arg4 + 1 - class8.field157;
            arg4 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 > 0 && arg1 > 0) {
            this.method110(var11, arg7, var9, 0, arg2, arg1, arg6, var10, class8.field151, var12, arg4);
        }
    }

    @OriginalMember(owner = "client!BKBLJVKV", name = "a", descriptor = "(I[BIIIIII[III)V")
    private void method110(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
        if (arg3 < 0 || arg3 > 0) {
            this.field77 = !this.field77;
        }
        int var13 = 256 - arg6;
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                if (arg1[arg9++] == 0) {
                    arg2++;
                } else {
                    int var16 = arg8[arg2];
                    arg8[arg2++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg2 += arg7;
            arg9 += arg0;
        }
    }
}
