import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YZXOZYLM")
public class class70 extends class1 {

    @OriginalMember(owner = "YZXOZYLM", name = "C", descriptor = "I")
    private int field1681 = 8;

    @OriginalMember(owner = "YZXOZYLM", name = "D", descriptor = "Z")
    private boolean field1682 = true;

    @OriginalMember(owner = "YZXOZYLM", name = "E", descriptor = "Z")
    private boolean field1683 = false;

    @OriginalMember(owner = "YZXOZYLM", name = "G", descriptor = "Z")
    private boolean field1685 = false;

    @OriginalMember(owner = "YZXOZYLM", name = "H", descriptor = "I")
    private int field1686 = 9561;

    @OriginalMember(owner = "YZXOZYLM", name = "I", descriptor = "Z")
    private boolean field1687 = false;

    @OriginalMember(owner = "YZXOZYLM", name = "J", descriptor = "I")
    private int field1688 = 679;

    @OriginalMember(owner = "YZXOZYLM", name = "K", descriptor = "[[B")
    public byte[][] field1689 = new byte[256][];

    @OriginalMember(owner = "YZXOZYLM", name = "L", descriptor = "[I")
    public int[] field1690 = new int[256];

    @OriginalMember(owner = "YZXOZYLM", name = "M", descriptor = "[I")
    public int[] field1691 = new int[256];

    @OriginalMember(owner = "YZXOZYLM", name = "N", descriptor = "[I")
    public int[] field1692 = new int[256];

    @OriginalMember(owner = "YZXOZYLM", name = "O", descriptor = "[I")
    public int[] field1693 = new int[256];

    @OriginalMember(owner = "YZXOZYLM", name = "P", descriptor = "[I")
    public int[] field1694 = new int[256];

    @OriginalMember(owner = "YZXOZYLM", name = "R", descriptor = "Ljava/util/Random;")
    public Random field1696 = new Random();

    @OriginalMember(owner = "YZXOZYLM", name = "S", descriptor = "Z")
    public boolean field1697 = false;

    @OriginalMember(owner = "YZXOZYLM", name = "Q", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "YZXOZYLM", name = "F", descriptor = "I")
    private int field1684;

    @OriginalMember(owner = "YZXOZYLM", name = "<init>", descriptor = "(LFIGUVTWB;BLjava/lang/String;Z)V")
    public class70(class15 arg0, byte arg1, String arg2, boolean arg3) {
        class33 var5 = new class33(this.field1681, arg0.method209(arg2 + ".dat", null));
        class33 var6 = new class33(this.field1681, arg0.method209("index.dat", null));
        boolean var7 = true;
        var6.field954 = var5.method294() + 4;
        int var8 = var6.method292();
        if (arg1 != -52) {
            throw new NullPointerException();
        }
        if (var8 > 0) {
            var6.field954 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1692[var9] = var6.method292();
            this.field1693[var9] = var6.method292();
            int var11 = this.field1690[var9] = var6.method294();
            int var12 = this.field1691[var9] = var6.method294();
            int var13 = var6.method292();
            int var14 = var11 * var12;
            this.field1689[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1689[var9][var15] = var5.method293();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1689[var9][var11 * var17 + var16] = var5.method293();
                    }
                }
            }
            if (var12 > this.field1695 && var9 < 128) {
                this.field1695 = var12;
            }
            this.field1692[var9] = 1;
            this.field1694[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1689[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1694[var9]--;
                this.field1692[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1689[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1694[var9]--;
            }
        }
        if (arg3) {
            this.field1694[32] = this.field1694[73];
        } else {
            this.field1694[32] = this.field1694[105];
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method572(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg4 != -6285) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method577(arg3, arg2, arg0 - this.method576(-4, arg2), arg1, this.field1685);
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method573(String arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method577(arg1, arg0, arg2 - this.method576(-4, arg0) / 2, arg4, this.field1685);
        if (arg3 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
    public void method574(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
        this.method581(this.field1686, arg3, arg1 - this.method575(true, arg2) / 2, arg0, arg5, arg2);
        if (arg4 < 6 || arg4 > 6) {
            this.field1683 = !this.field1683;
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method575(boolean arg0, String arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg1 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            if (arg1.charAt(var5) == '@' && var5 + 4 < arg1.length() && arg1.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.field1694[arg1.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method576(int arg0, String arg1) {
        if (arg0 >= 0) {
            return 3;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field1694[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public void method577(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg0 - this.field1695;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method584(this.field1689[var8], this.field1692[var8] + arg2, this.field1693[var8] + var6, this.field1690[var8], this.field1691[var8], arg3);
            }
            arg2 += this.field1694[var8];
        }
        if (arg4) {
            this.field1686 = 173;
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public void method578(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg3 != 0 || arg4 == null) {
            return;
        }
        int var7 = arg1 - this.method576(-4, arg4) / 2;
        int var8 = arg5 - this.field1695;
        for (int var9 = 0; var9 < arg4.length(); var9++) {
            char var10 = arg4.charAt(var9);
            if (var10 != ' ') {
                this.method584(this.field1689[var10], this.field1692[var10] + var7, this.field1693[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1690[var10], this.field1691[var10], arg0);
            }
            var7 += this.field1694[var10];
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public void method579(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg5 - this.method576(-4, arg0) / 2;
        if (arg4) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = arg3 - this.field1695;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method584(this.field1689[var11], this.field1692[var11] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field1693[var11] + var9 + (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field1690[var11], this.field1691[var11], arg2);
            }
            var7 += this.field1694[var11];
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IIIIIBLjava/lang/String;)V")
    public void method580(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method576(-4, arg6) / 2;
        if (arg5 != 8) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        int var12 = arg3 - this.field1695;
        for (int var13 = 0; var13 < arg6.length(); var13++) {
            char var14 = arg6.charAt(var13);
            if (var14 != ' ') {
                this.method584(this.field1689[var14], this.field1692[var14] + var10, this.field1693[var14] + var12 + (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var8), this.field1690[var14], this.field1691[var14], arg1);
            }
            var10 += this.field1694[var14];
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
    public void method581(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
        if (arg0 != 9561) {
            this.field1688 = -226;
        }
        this.field1697 = false;
        int var7 = arg2;
        if (arg5 == null) {
            return;
        }
        int var8 = arg1 - this.field1695;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method583(arg5.substring(var9 + 1, var9 + 4), this.field1687);
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg4) {
                        this.method584(this.field1689[var11], this.field1692[var11] + arg2 + 1, this.field1693[var11] + var8 + 1, this.field1690[var11], this.field1691[var11], 0);
                    }
                    this.method584(this.field1689[var11], this.field1692[var11] + arg2, this.field1693[var11] + var8, this.field1690[var11], this.field1691[var11], arg3);
                }
                arg2 += this.field1694[var11];
            }
        }
        if (this.field1697) {
            class1.method9(8388608, var7, this.field1684, (int) ((double) this.field1695 * 0.7D) + var8, arg2 - var7);
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IILjava/lang/String;IBIZ)V")
    public void method582(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        if (arg2 == null) {
            return;
        }
        this.field1696.setSeed((long) arg0);
        int var8 = (this.field1696.nextInt() & 0x1F) + 192;
        int var9 = arg5 - this.field1695;
        if (arg4 != 1) {
            return;
        }
        for (int var10 = 0; var10 < arg2.length(); var10++) {
            if (arg2.charAt(var10) == '@' && var10 + 4 < arg2.length() && arg2.charAt(var10 + 4) == '@') {
                int var11 = this.method583(arg2.substring(var10 + 1, var10 + 4), this.field1687);
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg2.charAt(var10);
                if (var12 != ' ') {
                    if (arg6) {
                        this.method586(192, 0, this.field1691[var12], this.field1692[var12] + arg3 + 1, this.field1693[var12] + var9 + 1, 965, this.field1690[var12], this.field1689[var12]);
                    }
                    this.method586(var8, arg1, this.field1691[var12], this.field1692[var12] + arg3, this.field1693[var12] + var9, 965, this.field1690[var12], this.field1689[var12]);
                }
                arg3 += this.field1694[var12];
                if ((this.field1696.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method583(String arg0, boolean arg1) {
        if (arg1) {
            this.field1682 = !this.field1682;
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
                this.field1697 = true;
            }
            if (arg0.equals("end")) {
                this.field1697 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "([BIIIII)V")
    private void method584(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class1.field10 * arg2 + arg1;
        int var8 = class1.field10 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class1.field12) {
            int var11 = class1.field12 - arg2;
            arg4 -= var11;
            arg2 = class1.field12;
            var10 += arg3 * var11;
            var7 += class1.field10 * var11;
        }
        if (arg2 + arg4 >= class1.field13) {
            arg4 -= arg2 + arg4 + 1 - class1.field13;
        }
        if (arg1 < class1.field14) {
            int var12 = class1.field14 - arg1;
            arg3 -= var12;
            arg1 = class1.field14;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class1.field15) {
            int var13 = arg1 + arg3 + 1 - class1.field15;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method585(class1.field9, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method585(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "(IIIIIII[B)V")
    private void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        int var9 = class1.field10 * arg4 + arg3;
        int var10 = class1.field10 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg4 < class1.field12) {
            int var13 = class1.field12 - arg4;
            arg2 -= var13;
            arg4 = class1.field12;
            var12 += arg6 * var13;
            var9 += class1.field10 * var13;
        }
        if (arg2 + arg4 >= class1.field13) {
            arg2 -= arg2 + arg4 + 1 - class1.field13;
        }
        if (arg3 < class1.field14) {
            int var14 = class1.field14 - arg3;
            arg6 -= var14;
            arg3 = class1.field14;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg6 >= class1.field15) {
            int var15 = arg3 + arg6 + 1 - class1.field15;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg2 > 0) {
            this.method587(arg7, var9, arg1, var10, true, class1.field9, arg6, arg2, arg0, var12, var11);
            int var16 = 61 / arg5;
        }
    }

    @OriginalMember(owner = "YZXOZYLM", name = "a", descriptor = "([BIIIZ[IIIIII)V")
    private void method587(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg4) {
            return;
        }
        int var12 = ((arg2 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg8 & 0xFF0000) >> 8;
        int var13 = 256 - arg8;
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg9++] == 0) {
                    arg1++;
                } else {
                    int var16 = arg5[arg1];
                    arg5[arg1++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg1 += arg3;
            arg9 += arg10;
        }
    }
}
