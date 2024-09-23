import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GCURPWTI")
public class class13 extends class36 {

    @OriginalMember(owner = "GCURPWTI", name = "w", descriptor = "Z")
    private boolean field751 = true;

    @OriginalMember(owner = "GCURPWTI", name = "x", descriptor = "I")
    private int field752 = 5;

    @OriginalMember(owner = "GCURPWTI", name = "y", descriptor = "Z")
    private boolean field753 = true;

    @OriginalMember(owner = "GCURPWTI", name = "z", descriptor = "[[B")
    public byte[][] field754 = new byte[256][];

    @OriginalMember(owner = "GCURPWTI", name = "A", descriptor = "[I")
    public int[] field755 = new int[256];

    @OriginalMember(owner = "GCURPWTI", name = "B", descriptor = "[I")
    public int[] field756 = new int[256];

    @OriginalMember(owner = "GCURPWTI", name = "C", descriptor = "[I")
    public int[] field757 = new int[256];

    @OriginalMember(owner = "GCURPWTI", name = "D", descriptor = "[I")
    public int[] field758 = new int[256];

    @OriginalMember(owner = "GCURPWTI", name = "E", descriptor = "[I")
    public int[] field759 = new int[256];

    @OriginalMember(owner = "GCURPWTI", name = "G", descriptor = "Ljava/util/Random;")
    public Random field761 = new Random();

    @OriginalMember(owner = "GCURPWTI", name = "H", descriptor = "Z")
    public boolean field762 = false;

    @OriginalMember(owner = "GCURPWTI", name = "F", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "GCURPWTI", name = "<init>", descriptor = "(LINOFEYKQ;IZLjava/lang/String;)V")
    public class13(class21 arg0, int arg1, boolean arg2, String arg3) {
        class35 var5 = new class35((byte) -103, arg0.method277(arg3 + ".dat", null));
        if (arg1 != 38414) {
            this.field752 = 238;
        }
        class35 var6 = new class35((byte) -103, arg0.method277("index.dat", null));
        boolean var7 = true;
        var6.field1107 = var5.method351() + 4;
        int var8 = var6.method349();
        if (var8 > 0) {
            var6.field1107 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field757[var9] = var6.method349();
            this.field758[var9] = var6.method349();
            int var11 = this.field755[var9] = var6.method351();
            int var12 = this.field756[var9] = var6.method351();
            int var13 = var6.method349();
            int var14 = var11 * var12;
            this.field754[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field754[var9][var15] = var5.method350();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field754[var9][var11 * var17 + var16] = var5.method350();
                    }
                }
            }
            if (var12 > this.field760 && var9 < 128) {
                this.field760 = var12;
            }
            this.field757[var9] = 1;
            this.field759[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field754[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field759[var9]--;
                this.field757[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field754[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field759[var9]--;
            }
        }
        if (arg2) {
            this.field759[32] = this.field759[73];
        } else {
            this.field759[32] = this.field759[105];
            if (class34.field1089) {
            }
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(IZILjava/lang/String;I)V")
    public void method211(int arg0, boolean arg1, int arg2, String arg3, int arg4) {
        this.method216(arg3, arg0 - this.method215(arg3, (byte) 2), (byte) 2, arg2, arg4);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(IILjava/lang/String;BI)V")
    public void method212(int arg0, int arg1, String arg2, byte arg3, int arg4) {
        if (arg3 == 6) {
            this.method216(arg2, arg1 - this.method215(arg2, (byte) 2) / 2, (byte) 2, arg4, arg0);
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(IZZIILjava/lang/String;)V")
    public void method213(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, String arg5) {
        if (!arg2) {
            this.method220(arg4, arg5, false, arg1, arg0, arg3 - this.method214(0, arg5) / 2);
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method214(int arg0, String arg1) {
        if (arg0 != 0) {
            return this.field752;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                if (arg1.charAt(var4) == '@' && var4 + 4 < arg1.length() && arg1.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field759[arg1.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method215(String arg0, byte arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (arg1 != 2) {
            this.field752 = 131;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field759[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;IBII)V")
    public void method216(String arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg3 - this.field760;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method223(this.field754[var8], this.field757[var8] + arg1, this.field758[var8] + var6, this.field755[var8], this.field756[var8], arg4);
            }
            arg1 += this.field759[var8];
        }
        if (arg2 != 2) {
            this.field752 = -18;
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public void method217(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg3 - this.method215(arg5, (byte) 2) / 2;
        int var8 = arg1 - this.field760;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method223(this.field754[var10], this.field757[var10] + var7, this.field758[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field755[var10], this.field756[var10], arg2);
            }
            var7 += this.field759[var10];
        }
        if (arg4 >= 0) {
            this.field753 = !this.field753;
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method218(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method215(arg0, (byte) 2) / 2;
        int var8 = arg3 - this.field760;
        if (arg2 >= 0) {
            return;
        }
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method223(this.field754[var10], this.field757[var10] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field758[var10] + var8 + (int) (Math.sin((double) arg4 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field755[var10], this.field756[var10], arg5);
            }
            var7 += this.field759[var10];
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(IIIIZLjava/lang/String;I)V")
    public void method219(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg0 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg2 - this.method215(arg5, (byte) 2) / 2;
        int var11 = arg6 - this.field760;
        if (arg4) {
            return;
        }
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method223(this.field754[var13], this.field757[var13] + var10, this.field758[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg1) * var8), this.field755[var13], this.field756[var13], arg3);
            }
            var10 += this.field759[var13];
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(ILjava/lang/String;ZZII)V")
    public void method220(int arg0, String arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        this.field762 = false;
        int var7 = arg5;
        if (arg1 == null) {
            return;
        }
        int var8 = arg0 - this.field760;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
                int var11 = this.method222(arg1.substring(var9 + 1, var9 + 4), -960);
                if (var11 != -1) {
                    arg4 = var11;
                }
                var9 += 4;
            } else {
                char var12 = arg1.charAt(var9);
                if (var12 != ' ') {
                    if (arg3) {
                        this.method223(this.field754[var12], this.field757[var12] + arg5 + 1, this.field758[var12] + var8 + 1, this.field755[var12], this.field756[var12], 0);
                    }
                    this.method223(this.field754[var12], this.field757[var12] + arg5, this.field758[var12] + var8, this.field755[var12], this.field756[var12], arg4);
                }
                arg5 += this.field759[var12];
            }
        }
        if (arg2) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        if (this.field762) {
            class36.method396((int) ((double) this.field760 * 0.7D) + var8, 8388608, var7, 0, arg5 - var7);
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(IIZIZILjava/lang/String;)V")
    public void method221(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, String arg6) {
        if (!arg2 || arg6 == null) {
            return;
        }
        this.field761.setSeed((long) arg1);
        int var8 = (this.field761.nextInt() & 0x1F) + 192;
        int var9 = arg0 - this.field760;
        for (int var10 = 0; var10 < arg6.length(); var10++) {
            if (arg6.charAt(var10) == '@' && var10 + 4 < arg6.length() && arg6.charAt(var10 + 4) == '@') {
                int var11 = this.method222(arg6.substring(var10 + 1, var10 + 4), -960);
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg6.charAt(var10);
                if (var12 != ' ') {
                    if (arg4) {
                        this.method225(this.field758[var12] + var9 + 1, this.field756[var12], 192, this.field754[var12], (byte) -105, 0, this.field755[var12], this.field757[var12] + arg5 + 1);
                    }
                    this.method225(this.field758[var12] + var9, this.field756[var12], var8, this.field754[var12], (byte) -105, arg3, this.field755[var12], this.field757[var12] + arg5);
                }
                arg5 += this.field759[var12];
                if ((this.field761.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method222(String arg0, int arg1) {
        if (arg1 >= 0) {
            return this.field752;
        } else if (arg0.equals("red")) {
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
                this.field762 = true;
            }
            if (arg0.equals("end")) {
                this.field762 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "([BIIIII)V")
    private void method223(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class36.field1125 * arg2 + arg1;
        int var8 = class36.field1125 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class36.field1127) {
            int var11 = class36.field1127 - arg2;
            arg4 -= var11;
            arg2 = class36.field1127;
            var10 += arg3 * var11;
            var7 += class36.field1125 * var11;
        }
        if (arg2 + arg4 >= class36.field1128) {
            arg4 -= arg2 + arg4 + 1 - class36.field1128;
        }
        if (arg1 < class36.field1129) {
            int var12 = class36.field1129 - arg1;
            arg3 -= var12;
            arg1 = class36.field1129;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class36.field1130) {
            int var13 = arg1 + arg3 + 1 - class36.field1130;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method224(class36.field1124, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method224(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(III[BBIII)V")
    private void method225(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -105) {
            return;
        }
        int var9 = class36.field1125 * arg0 + arg7;
        int var10 = class36.field1125 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg0 < class36.field1127) {
            int var13 = class36.field1127 - arg0;
            arg1 -= var13;
            arg0 = class36.field1127;
            var12 += arg6 * var13;
            var9 += class36.field1125 * var13;
        }
        if (arg0 + arg1 >= class36.field1128) {
            arg1 -= arg0 + arg1 + 1 - class36.field1128;
        }
        if (arg7 < class36.field1129) {
            int var14 = class36.field1129 - arg7;
            arg6 -= var14;
            arg7 = class36.field1129;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg6 + arg7 >= class36.field1130) {
            int var15 = arg6 + arg7 + 1 - class36.field1130;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg1 > 0) {
            this.method226(var11, var9, arg6, arg3, arg1, arg5, var10, arg2, class36.field1124, true, var12);
        }
    }

    @OriginalMember(owner = "GCURPWTI", name = "a", descriptor = "(III[BIIII[IZI)V")
    private void method226(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, boolean arg9, int arg10) {
        if (!arg9) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = ((arg5 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg7 & 0xFF0000) >> 8;
        int var14 = 256 - arg7;
        for (int var15 = -arg4; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                if (arg3[arg10++] == 0) {
                    arg1++;
                } else {
                    int var17 = arg8[arg1];
                    arg8[arg1++] = (((var17 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var17 & 0xFF00) * var14 & 0xFF0000) >> 8) + var13;
                }
            }
            arg1 += arg6;
            arg10 += arg0;
        }
    }
}
