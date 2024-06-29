import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YCYYIGLM")
public class class72 extends class32 {

    @OriginalMember(owner = "client!YCYYIGLM", name = "w", descriptor = "Z")
    private boolean field1741 = false;

    @OriginalMember(owner = "client!YCYYIGLM", name = "y", descriptor = "Z")
    private boolean field1743 = false;

    @OriginalMember(owner = "client!YCYYIGLM", name = "z", descriptor = "Z")
    private boolean field1744 = true;

    @OriginalMember(owner = "client!YCYYIGLM", name = "A", descriptor = "[[B")
    public byte[][] field1745 = new byte[256][];

    @OriginalMember(owner = "client!YCYYIGLM", name = "B", descriptor = "[I")
    public int[] field1746 = new int[256];

    @OriginalMember(owner = "client!YCYYIGLM", name = "C", descriptor = "[I")
    public int[] field1747 = new int[256];

    @OriginalMember(owner = "client!YCYYIGLM", name = "D", descriptor = "[I")
    public int[] field1748 = new int[256];

    @OriginalMember(owner = "client!YCYYIGLM", name = "E", descriptor = "[I")
    public int[] field1749 = new int[256];

    @OriginalMember(owner = "client!YCYYIGLM", name = "F", descriptor = "[I")
    public int[] field1750 = new int[256];

    @OriginalMember(owner = "client!YCYYIGLM", name = "H", descriptor = "Ljava/util/Random;")
    public Random field1752 = new Random();

    @OriginalMember(owner = "client!YCYYIGLM", name = "I", descriptor = "Z")
    public boolean field1753 = false;

    @OriginalMember(owner = "client!YCYYIGLM", name = "G", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!YCYYIGLM", name = "x", descriptor = "I")
    private int field1742;

    @OriginalMember(owner = "client!YCYYIGLM", name = "<init>", descriptor = "(ZLLKPVZAQN;Ljava/lang/String;B)V")
    public class72(boolean arg0, class33 arg1, String arg2, byte arg3) {
        class58 var5 = new class58((byte) -115, arg1.method323(arg2 + ".dat", null));
        class58 var6 = new class58((byte) -115, arg1.method323("index.dat", null));
        if (arg3 != 9) {
            throw new NullPointerException();
        }
        boolean var7 = true;
        var6.field1615 = var5.method517() + 4;
        int var8 = var6.method515();
        if (var8 > 0) {
            var6.field1615 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1748[var9] = var6.method515();
            this.field1749[var9] = var6.method515();
            int var11 = this.field1746[var9] = var6.method517();
            int var12 = this.field1747[var9] = var6.method517();
            int var13 = var6.method515();
            int var14 = var11 * var12;
            this.field1745[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1745[var9][var15] = var5.method516();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1745[var9][var11 * var17 + var16] = var5.method516();
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
        if (arg0) {
            this.field1750[32] = this.field1750[73];
        } else {
            this.field1750[32] = this.field1750[105];
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method588(int arg0, int arg1, String arg2, int arg3, int arg4) {
        this.method593(false, arg0, arg3, arg2, arg1 - this.method592(0, arg2));
        if (arg4 != 5) {
            this.field1743 = !this.field1743;
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method589(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg4 == -27242) {
            this.method593(false, arg1, arg0, arg3, arg2 - this.method592(0, arg3) / 2);
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public void method590(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.method597((byte) 3, arg1, arg2, arg3 - this.method591(false, arg2) / 2, arg0, arg4);
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public int method591(boolean arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg0) {
            this.field1743 = !this.field1743;
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                var4 += 4;
            } else {
                var3 += this.field1750[arg1.charAt(var4)];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method592(int arg0, String arg1) {
        if (arg0 != 0) {
            return this.field1742;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field1750[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(ZIILjava/lang/String;I)V")
    public void method593(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg0 || arg3 == null) {
            return;
        }
        int var6 = arg2 - this.field1751;
        for (int var7 = 0; var7 < arg3.length(); var7++) {
            char var8 = arg3.charAt(var7);
            if (var8 != ' ') {
                this.method600(this.field1745[var8], this.field1748[var8] + arg4, this.field1749[var8] + var6, this.field1746[var8], this.field1747[var8], arg1);
            }
            arg4 += this.field1750[var8];
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method594(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            this.field1742 = -40;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = arg3 - this.method592(0, arg0) / 2;
        int var8 = arg1 - this.field1751;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method600(this.field1745[var10], this.field1748[var10] + var7, this.field1749[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1746[var10], this.field1747[var10], arg4);
            }
            var7 += this.field1750[var10];
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method595(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg3 != 0) {
            this.field1744 = !this.field1744;
        }
        if (arg5 == null) {
            return;
        }
        int var7 = arg1 - this.method592(0, arg5) / 2;
        int var8 = arg2 - this.field1751;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method600(this.field1745[var10], this.field1748[var10] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1749[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1746[var10], this.field1747[var10], arg0);
            }
            var7 += this.field1750[var10];
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIZIILjava/lang/String;)V")
    public void method596(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, String arg6) {
        if (arg3 || arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg5 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method592(0, arg6) / 2;
        int var11 = arg1 - this.field1751;
        for (int var12 = 0; var12 < arg6.length(); var12++) {
            char var13 = arg6.charAt(var12);
            if (var13 != ' ') {
                this.method600(this.field1745[var13], this.field1748[var13] + var10, this.field1749[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field1746[var13], this.field1747[var13], arg0);
            }
            var10 += this.field1750[var13];
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(BZLjava/lang/String;III)V")
    public void method597(byte arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        this.field1753 = false;
        int var7 = arg3;
        if (arg2 == null) {
            return;
        }
        int var8 = arg5 - this.field1751;
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var11 = this.method599(arg2.substring(var9 + 1, var9 + 4), false);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var9 += 4;
            } else {
                char var12 = arg2.charAt(var9);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method600(this.field1745[var12], this.field1748[var12] + arg3 + 1, this.field1749[var12] + var8 + 1, this.field1746[var12], this.field1747[var12], 0);
                    }
                    this.method600(this.field1745[var12], this.field1748[var12] + arg3, this.field1749[var12] + var8, this.field1746[var12], this.field1747[var12], arg4);
                }
                arg3 += this.field1750[var12];
            }
        }
        if (arg0 == 3) {
            boolean var10 = false;
            if (this.field1753) {
                class32.method318((int) ((double) this.field1751 * 0.7D) + var8, arg3 - var7, true, var7, 8388608);
            }
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(Ljava/lang/String;ZIIIII)V")
    public void method598(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.field1752.setSeed((long) arg6);
        if (arg3 != 0) {
            return;
        }
        int var8 = (this.field1752.nextInt() & 0x1F) + 192;
        int var9 = arg4 - this.field1751;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var11 = this.method599(arg0.substring(var10 + 1, var10 + 4), false);
                if (var11 != -1) {
                    arg5 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg0.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method602(this.field1747[var12], this.field1748[var12] + arg2 + 1, this.field1746[var12], 0, this.field1749[var12] + var9 + 1, 3, 192, this.field1745[var12]);
                    }
                    this.method602(this.field1747[var12], this.field1748[var12] + arg2, this.field1746[var12], arg5, this.field1749[var12] + var9, 3, var8, this.field1745[var12]);
                }
                arg2 += this.field1750[var12];
                if ((this.field1752.nextInt() & 0x3) == 0) {
                    arg2++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method599(String arg0, boolean arg1) {
        if (arg1) {
            this.field1742 = -145;
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

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "([BIIIII)V")
    private void method600(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class32.field1093 * arg2 + arg1;
        int var8 = class32.field1093 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class32.field1095) {
            int var11 = class32.field1095 - arg2;
            arg4 -= var11;
            arg2 = class32.field1095;
            var10 += arg3 * var11;
            var7 += class32.field1093 * var11;
        }
        if (arg2 + arg4 >= class32.field1096) {
            arg4 -= arg2 + arg4 + 1 - class32.field1096;
        }
        if (arg1 < class32.field1097) {
            int var12 = class32.field1097 - arg1;
            arg3 -= var12;
            arg1 = class32.field1097;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class32.field1098) {
            int var13 = arg1 + arg3 + 1 - class32.field1098;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method601(class32.field1092, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method601(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIIIII[B)V")
    private void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        int var9 = class32.field1093 * arg4 + arg1;
        int var10 = class32.field1093 - arg2;
        int var11 = 0;
        int var12 = 0;
        if (arg5 != 3) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (arg4 < class32.field1095) {
            int var14 = class32.field1095 - arg4;
            arg0 -= var14;
            arg4 = class32.field1095;
            var12 += arg2 * var14;
            var9 += class32.field1093 * var14;
        }
        if (arg0 + arg4 >= class32.field1096) {
            arg0 -= arg0 + arg4 + 1 - class32.field1096;
        }
        if (arg1 < class32.field1097) {
            int var15 = class32.field1097 - arg1;
            arg2 -= var15;
            arg1 = class32.field1097;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg1 + arg2 >= class32.field1098) {
            int var16 = arg1 + arg2 + 1 - class32.field1098;
            arg2 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg2 > 0 && arg0 > 0) {
            this.method603(arg3, arg0, arg6, -4, var11, arg7, var12, arg2, var9, class32.field1092, var10);
        }
    }

    @OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIII[BIII[II)V")
    private void method603(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg3 >= 0) {
            this.field1741 = !this.field1741;
        }
        int var12 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        int var13 = 256 - arg2;
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg5[arg6++] == 0) {
                    arg8++;
                } else {
                    int var16 = arg9[arg8];
                    arg9[arg8++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg8 += arg10;
            arg6 += arg4;
        }
    }
}
