import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZTYSAOXK")
public class class71 extends class21 {

    @OriginalMember(owner = "client!ZTYSAOXK", name = "x", descriptor = "B")
    private byte field1719 = 1;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "y", descriptor = "B")
    private byte field1720 = 119;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "z", descriptor = "B")
    private byte field1721 = 107;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "A", descriptor = "Z")
    private boolean field1722 = true;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "B", descriptor = "I")
    private int field1723 = 709;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "C", descriptor = "Z")
    private boolean field1724 = false;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "D", descriptor = "[[B")
    public byte[][] field1725 = new byte[256][];

    @OriginalMember(owner = "client!ZTYSAOXK", name = "E", descriptor = "[I")
    public int[] field1726 = new int[256];

    @OriginalMember(owner = "client!ZTYSAOXK", name = "F", descriptor = "[I")
    public int[] field1727 = new int[256];

    @OriginalMember(owner = "client!ZTYSAOXK", name = "G", descriptor = "[I")
    public int[] field1728 = new int[256];

    @OriginalMember(owner = "client!ZTYSAOXK", name = "H", descriptor = "[I")
    public int[] field1729 = new int[256];

    @OriginalMember(owner = "client!ZTYSAOXK", name = "I", descriptor = "[I")
    public int[] field1730 = new int[256];

    @OriginalMember(owner = "client!ZTYSAOXK", name = "K", descriptor = "Ljava/util/Random;")
    public Random field1732 = new Random();

    @OriginalMember(owner = "client!ZTYSAOXK", name = "L", descriptor = "Z")
    public boolean field1733 = false;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "J", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ZTYSAOXK", name = "<init>", descriptor = "(ZLjava/lang/String;LFUZJMGZB;I)V")
    public class71(boolean arg0, String arg1, class19 arg2, int arg3) {
        class32 var5 = new class32((byte) 114, arg2.method277(arg1 + ".dat", null));
        class32 var6 = new class32((byte) 114, arg2.method277("index.dat", null));
        boolean var7 = true;
        var6.field1032 = var5.method371() + 4;
        while (arg3 >= 0) {
            this.field1724 = !this.field1724;
        }
        int var8 = var6.method369();
        if (var8 > 0) {
            var6.field1032 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1728[var9] = var6.method369();
            this.field1729[var9] = var6.method369();
            int var11 = this.field1726[var9] = var6.method371();
            int var12 = this.field1727[var9] = var6.method371();
            int var13 = var6.method369();
            int var14 = var11 * var12;
            this.field1725[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1725[var9][var15] = var5.method370();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1725[var9][var11 * var17 + var16] = var5.method370();
                    }
                }
            }
            if (var12 > this.field1731 && var9 < 128) {
                this.field1731 = var12;
            }
            this.field1728[var9] = 1;
            this.field1730[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1725[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1730[var9]--;
                this.field1728[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1725[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1730[var9]--;
            }
        }
        if (arg0) {
            this.field1730[32] = this.field1730[73];
        } else {
            this.field1730[32] = this.field1730[105];
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method588(int arg0, int arg1, int arg2, int arg3, String arg4) {
        this.method593(arg4, arg0, arg2 - this.method592((byte) 107, arg4), arg3, -32001);
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIILjava/lang/String;B)V")
    public void method589(int arg0, int arg1, int arg2, String arg3, byte arg4) {
        this.method593(arg3, arg2, arg1 - this.method592((byte) 107, arg3) / 2, arg0, -32001);
        if (this.field1720 != arg4) {
            this.field1724 = !this.field1724;
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ZLjava/lang/String;BIII)V")
    public void method590(boolean arg0, String arg1, byte arg2, int arg3, int arg4, int arg5) {
        this.method597(arg3, arg1, arg0, arg5 - this.method591(arg1, this.field1719) / 2, this.field1722, arg4);
        if (arg2 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method591(String arg0, byte arg1) {
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            this.field1723 = -482;
        }
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            if (arg0.charAt(var5) == '@' && var5 + 4 < arg0.length() && arg0.charAt(var5 + 4) == '@') {
                var5 += 4;
            } else {
                var4 += this.field1730[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method592(byte arg0, String arg1) {
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        if (this.field1721 == arg0) {
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field1730[arg1.charAt(var4)];
            }
            return var3;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method593(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.field1731;
        if (arg4 != -32001) {
            return;
        }
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method600(this.field1725[var8], this.field1728[var8] + arg2, this.field1729[var8] + var6, this.field1726[var8], this.field1727[var8], arg3);
            }
            arg2 += this.field1730[var8];
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method594(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method592((byte) 107, arg0) / 2;
        int var8 = arg3 - this.field1731;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method600(this.field1725[var10], this.field1728[var10] + var7, this.field1729[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1726[var10], this.field1727[var10], arg4);
            }
            var7 += this.field1730[var10];
        }
        if (arg5 != 0) {
            this.field1724 = !this.field1724;
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
    public void method595(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg3 - this.method592((byte) 107, arg0) / 2;
        if (arg4 != 2) {
            return;
        }
        boolean var8 = false;
        int var9 = arg5 - this.field1731;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            char var11 = arg0.charAt(var10);
            if (var11 != ' ') {
                this.method600(this.field1725[var11], this.field1728[var11] + var7 + (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 5.0D) * 5.0D), this.field1729[var11] + var9 + (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 3.0D) * 5.0D), this.field1726[var11], this.field1727[var11], arg2);
            }
            var7 += this.field1730[var11];
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IBIIII)V")
    public void method596(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 4 || arg0 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg3 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method592((byte) 107, arg0) / 2;
        int var11 = arg1 - this.field1731;
        for (int var12 = 0; var12 < arg0.length(); var12++) {
            char var13 = arg0.charAt(var12);
            if (var13 != ' ') {
                this.method600(this.field1725[var13], this.field1728[var13] + var10, this.field1729[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg6) * var8), this.field1726[var13], this.field1727[var13], arg5);
            }
            var10 += this.field1730[var13];
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ILjava/lang/String;ZIZI)V")
    public void method597(int arg0, String arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        this.field1733 = false;
        int var7 = arg3;
        if (!arg4 || arg1 == null) {
            return;
        }
        int var8 = arg5 - this.field1731;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
                int var10 = this.method599(0, arg1.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg0 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg1.charAt(var9);
                if (var11 != ' ') {
                    if (arg2) {
                        this.method600(this.field1725[var11], this.field1728[var11] + arg3 + 1, this.field1729[var11] + var8 + 1, this.field1726[var11], this.field1727[var11], 0);
                    }
                    this.method600(this.field1725[var11], this.field1728[var11] + arg3, this.field1729[var11] + var8, this.field1726[var11], this.field1727[var11], arg0);
                }
                arg3 += this.field1730[var11];
            }
        }
        if (this.field1733) {
            class21.method292(arg3 - var7, var7, 0, (int) ((double) this.field1731 * 0.7D) + var8, 8388608);
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
    public void method598(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null) {
            return;
        }
        this.field1732.setSeed((long) arg5);
        if (arg2 != 3169) {
            return;
        }
        int var8 = (this.field1732.nextInt() & 0x1F) + 192;
        int var9 = arg3 - this.field1731;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method599(0, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg6 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg0) {
                        this.method602(192, this.field1729[var12] + var9 + 1, true, 0, this.field1728[var12] + arg4 + 1, this.field1726[var12], this.field1727[var12], this.field1725[var12]);
                    }
                    this.method602(var8, this.field1729[var12] + var9, true, arg6, this.field1728[var12] + arg4, this.field1726[var12], this.field1727[var12], this.field1725[var12]);
                }
                arg4 += this.field1730[var12];
                if ((this.field1732.nextInt() & 0x3) == 0) {
                    arg4++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method599(int arg0, String arg1) {
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
                this.field1733 = true;
            }
            if (arg1.equals("end")) {
                this.field1733 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "([BIIIII)V")
    private void method600(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class21.field932 * arg2 + arg1;
        int var8 = class21.field932 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class21.field934) {
            int var11 = class21.field934 - arg2;
            arg4 -= var11;
            arg2 = class21.field934;
            var10 += arg3 * var11;
            var7 += class21.field932 * var11;
        }
        if (arg2 + arg4 >= class21.field935) {
            arg4 -= arg2 + arg4 + 1 - class21.field935;
        }
        if (arg1 < class21.field936) {
            int var12 = class21.field936 - arg1;
            arg3 -= var12;
            arg1 = class21.field936;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class21.field937) {
            int var13 = arg1 + arg3 + 1 - class21.field937;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method601(class21.field931, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "([I[BIIIIIII)V")
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

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIZIIII[B)V")
    private void method602(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        int var9 = class21.field932 * arg1 + arg4;
        int var10 = class21.field932 - arg5;
        int var11 = 0;
        int var12 = 0;
        if (!arg2) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        if (arg1 < class21.field934) {
            int var14 = class21.field934 - arg1;
            arg6 -= var14;
            arg1 = class21.field934;
            var12 += arg5 * var14;
            var9 += class21.field932 * var14;
        }
        if (arg1 + arg6 >= class21.field935) {
            arg6 -= arg1 + arg6 + 1 - class21.field935;
        }
        if (arg4 < class21.field936) {
            int var15 = class21.field936 - arg4;
            arg5 -= var15;
            arg4 = class21.field936;
            var12 += var15;
            var9 += var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg4 + arg5 >= class21.field937) {
            int var16 = arg4 + arg5 + 1 - class21.field937;
            arg5 -= var16;
            var11 += var16;
            var10 += var16;
        }
        if (arg5 > 0 && arg6 > 0) {
            this.method603(var9, var12, arg6, arg3, -2270, arg0, arg5, var11, class21.field931, var10, arg7);
        }
    }

    @OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIIIIIII[II[B)V")
    private void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, byte[] arg10) {
        int var12 = ((arg3 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg5 & 0xFF0000) >> 8;
        int var13 = 256 - arg5;
        if (arg4 != -2270) {
            return;
        }
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg10[arg1++] == 0) {
                    arg0++;
                } else {
                    int var16 = arg8[arg0];
                    arg8[arg0++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg9;
            arg1 += arg7;
        }
    }
}
