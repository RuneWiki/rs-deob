import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZFUOSNLM")
public class class70 extends class36 {

    @OriginalMember(owner = "client!ZFUOSNLM", name = "z", descriptor = "I")
    private int field1733 = 16067;

    @OriginalMember(owner = "client!ZFUOSNLM", name = "A", descriptor = "I")
    private int field1734 = 22125;

    @OriginalMember(owner = "client!ZFUOSNLM", name = "B", descriptor = "I")
    private int field1735 = 907;

    @OriginalMember(owner = "client!ZFUOSNLM", name = "C", descriptor = "Z")
    private boolean field1736 = true;

    @OriginalMember(owner = "client!ZFUOSNLM", name = "D", descriptor = "[[B")
    public byte[][] field1737 = new byte[256][];

    @OriginalMember(owner = "client!ZFUOSNLM", name = "E", descriptor = "[I")
    public int[] field1738 = new int[256];

    @OriginalMember(owner = "client!ZFUOSNLM", name = "F", descriptor = "[I")
    public int[] field1739 = new int[256];

    @OriginalMember(owner = "client!ZFUOSNLM", name = "G", descriptor = "[I")
    public int[] field1740 = new int[256];

    @OriginalMember(owner = "client!ZFUOSNLM", name = "H", descriptor = "[I")
    public int[] field1741 = new int[256];

    @OriginalMember(owner = "client!ZFUOSNLM", name = "I", descriptor = "[I")
    public int[] field1742 = new int[256];

    @OriginalMember(owner = "client!ZFUOSNLM", name = "K", descriptor = "Ljava/util/Random;")
    public Random field1744 = new Random();

    @OriginalMember(owner = "client!ZFUOSNLM", name = "L", descriptor = "Z")
    public boolean field1745 = false;

    @OriginalMember(owner = "client!ZFUOSNLM", name = "J", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!ZFUOSNLM", name = "<init>", descriptor = "(ZLXOJZVVDK;ZLjava/lang/String;)V")
    public class70(boolean arg0, class60 arg1, boolean arg2, String arg3) {
        if (!arg2) {
            this.field1736 = !this.field1736;
        }
        class41 var5 = new class41(888, arg1.method560(arg3 + ".dat", null));
        class41 var6 = new class41(888, arg1.method560("index.dat", null));
        boolean var7 = true;
        var6.field1241 = var5.method342() + 4;
        int var8 = var6.method340();
        if (var8 > 0) {
            var6.field1241 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1740[var9] = var6.method340();
            this.field1741[var9] = var6.method340();
            int var11 = this.field1738[var9] = var6.method342();
            int var12 = this.field1739[var9] = var6.method342();
            int var13 = var6.method340();
            int var14 = var11 * var12;
            this.field1737[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1737[var9][var15] = var5.method341();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1737[var9][var11 * var17 + var16] = var5.method341();
                    }
                }
            }
            if (var12 > this.field1743 && var9 < 128) {
                this.field1743 = var12;
            }
            this.field1740[var9] = 1;
            this.field1742[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1737[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1742[var9]--;
                this.field1740[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1737[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1742[var9]--;
            }
        }
        if (arg0) {
            this.field1742[32] = this.field1742[73];
        } else {
            this.field1742[32] = this.field1742[105];
            if (class8.field622) {
            }
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public void method585(int arg0, int arg1, int arg2, String arg3, int arg4) {
        this.method590(arg3, arg4, true, arg1, arg2 - this.method589(22125, arg3));
        if (this.field1733 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public void method586(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 == 8) {
            this.method590(arg0, arg4, true, arg3, arg1 - this.method589(22125, arg0) / 2);
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
    public void method587(int arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
        this.method594(arg0 - this.method588(arg3, true) / 2, arg3, arg2, arg1, this.field1735, arg4);
        if (arg5 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method588(String arg0, boolean arg1) {
        if (!arg1) {
            return 0;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field1742[arg0.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method589(int arg0, String arg1) {
        if (this.field1734 != arg0) {
            this.field1734 = -388;
        }
        if (arg1 == null) {
            return 0;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var3 += this.field1742[arg1.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;IZII)V")
    public void method590(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.field1743;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 != ' ') {
                this.method597(this.field1737[var8], this.field1740[var8] + arg4, this.field1741[var8] + var6, this.field1738[var8], this.field1739[var8], arg3);
            }
            arg4 += this.field1742[var8];
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method591(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        int var7 = arg1 - this.method589(22125, arg0) / 2;
        int var8 = arg5 - this.field1743;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method597(this.field1737[var10], this.field1740[var10] + var7, this.field1741[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1738[var10], this.field1739[var10], arg2);
            }
            var7 += this.field1742[var10];
        }
        if (arg4 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
    public void method592(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5) {
        if (arg3 == null) {
            return;
        }
        int var7 = arg5 - this.method589(22125, arg3) / 2;
        int var8 = arg1 - this.field1743;
        if (arg4 != 9) {
            this.field1733 = -268;
        }
        for (int var9 = 0; var9 < arg3.length(); var9++) {
            char var10 = arg3.charAt(var9);
            if (var10 != ' ') {
                this.method597(this.field1737[var10], this.field1740[var10] + var7 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1741[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1738[var10], this.field1739[var10], arg0);
            }
            var7 += this.field1742[var10];
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public void method593(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg4 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg5 - this.method589(22125, arg3) / 2;
        if (arg0 != 45739) {
            return;
        }
        int var11 = arg1 - this.field1743;
        for (int var12 = 0; var12 < arg3.length(); var12++) {
            char var13 = arg3.charAt(var12);
            if (var13 != ' ') {
                this.method597(this.field1737[var13], this.field1740[var13] + var10, this.field1741[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field1738[var13], this.field1739[var13], arg6);
            }
            var10 += this.field1742[var13];
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(ILjava/lang/String;IIIZ)V")
    public void method594(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 99 / arg4;
        this.field1745 = false;
        int var8 = arg0;
        if (arg1 == null) {
            return;
        }
        int var9 = arg2 - this.field1743;
        for (int var10 = 0; var10 < arg1.length(); var10++) {
            if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
                int var11 = this.method596(-690, arg1.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg3 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg1.charAt(var10);
                if (var12 != ' ') {
                    if (arg5) {
                        this.method597(this.field1737[var12], this.field1740[var12] + arg0 + 1, this.field1741[var12] + var9 + 1, this.field1738[var12], this.field1739[var12], 0);
                    }
                    this.method597(this.field1737[var12], this.field1740[var12] + arg0, this.field1741[var12] + var9, this.field1738[var12], this.field1739[var12], arg3);
                }
                arg0 += this.field1742[var12];
            }
        }
        if (this.field1745) {
            class36.method294(var8, (int) ((double) this.field1743 * 0.7D) + var9, arg0 - var8, 0, 8388608);
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IZZLjava/lang/String;III)V")
    public void method595(int arg0, boolean arg1, boolean arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field1744.setSeed((long) arg4);
        int var8 = (this.field1744.nextInt() & 0x1F) + 192;
        int var9 = arg6 - this.field1743;
        for (int var10 = 0; var10 < arg3.length(); var10++) {
            if (arg3.charAt(var10) == '@' && var10 + 4 < arg3.length() && arg3.charAt(var10 + 4) == '@') {
                int var11 = this.method596(-690, arg3.substring(var10 + 1, var10 + 4));
                if (var11 != -1) {
                    arg0 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg3.charAt(var10);
                if (var12 != ' ') {
                    if (arg1) {
                        this.method599(192, this.field1741[var12] + var9 + 1, 0, this.field1739[var12], this.field1740[var12] + arg5 + 1, this.field1737[var12], this.field1738[var12], 0);
                    }
                    this.method599(var8, this.field1741[var12] + var9, arg0, this.field1739[var12], this.field1740[var12] + arg5, this.field1737[var12], this.field1738[var12], 0);
                }
                arg5 += this.field1742[var12];
                if ((this.field1744.nextInt() & 0x3) == 0) {
                    arg5++;
                }
            }
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "b", descriptor = "(ILjava/lang/String;)I")
    public int method596(int arg0, String arg1) {
        while (arg0 >= 0) {
            this.field1733 = -5;
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
                this.field1745 = true;
            }
            if (arg1.equals("end")) {
                this.field1745 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "([BIIIII)V")
    private void method597(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class36.field1150 * arg2 + arg1;
        int var8 = class36.field1150 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class36.field1152) {
            int var11 = class36.field1152 - arg2;
            arg4 -= var11;
            arg2 = class36.field1152;
            var10 += arg3 * var11;
            var7 += class36.field1150 * var11;
        }
        if (arg2 + arg4 >= class36.field1153) {
            arg4 -= arg2 + arg4 + 1 - class36.field1153;
        }
        if (arg1 < class36.field1154) {
            int var12 = class36.field1154 - arg1;
            arg3 -= var12;
            arg1 = class36.field1154;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class36.field1155) {
            int var13 = arg1 + arg3 + 1 - class36.field1155;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method598(class36.field1149, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method598(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIIII[BII)V")
    private void method599(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        int var9 = class36.field1150 * arg1 + arg4;
        int var10 = class36.field1150 - arg6;
        int var11 = 0;
        int var12 = 0;
        if (arg7 != 0) {
            return;
        }
        if (arg1 < class36.field1152) {
            int var13 = class36.field1152 - arg1;
            arg3 -= var13;
            arg1 = class36.field1152;
            var12 += arg6 * var13;
            var9 += class36.field1150 * var13;
        }
        if (arg1 + arg3 >= class36.field1153) {
            arg3 -= arg1 + arg3 + 1 - class36.field1153;
        }
        if (arg4 < class36.field1154) {
            int var14 = class36.field1154 - arg4;
            arg6 -= var14;
            arg4 = class36.field1154;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg4 + arg6 >= class36.field1155) {
            int var15 = arg4 + arg6 + 1 - class36.field1155;
            arg6 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg6 > 0 && arg3 > 0) {
            this.method600(arg0, arg6, class36.field1149, arg3, 3, var12, var9, arg2, var10, arg5, var11);
        }
    }

    @OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(II[IIIIIII[BI)V")
    private void method600(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = ((arg7 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg0 & 0xFF0000) >> 8;
        int var13 = 256 - arg0;
        if (arg4 != 3) {
            this.field1735 = 495;
        }
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = -arg1; var15 < 0; var15++) {
                if (arg9[arg5++] == 0) {
                    arg6++;
                } else {
                    int var16 = arg2[arg6];
                    arg2[arg6++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg6 += arg8;
            arg5 += arg10;
        }
    }
}
