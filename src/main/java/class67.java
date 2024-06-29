import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XZMPLIVN")
public class class67 extends class52 {

    @OriginalMember(owner = "client!XZMPLIVN", name = "x", descriptor = "Z")
    private boolean field1698 = false;

    @OriginalMember(owner = "client!XZMPLIVN", name = "y", descriptor = "I")
    private int field1699 = 111;

    @OriginalMember(owner = "client!XZMPLIVN", name = "z", descriptor = "I")
    private int field1700 = -413;

    @OriginalMember(owner = "client!XZMPLIVN", name = "A", descriptor = "I")
    private int field1701 = -953;

    @OriginalMember(owner = "client!XZMPLIVN", name = "B", descriptor = "[[B")
    public byte[][] field1702 = new byte[256][];

    @OriginalMember(owner = "client!XZMPLIVN", name = "C", descriptor = "[I")
    public int[] field1703 = new int[256];

    @OriginalMember(owner = "client!XZMPLIVN", name = "D", descriptor = "[I")
    public int[] field1704 = new int[256];

    @OriginalMember(owner = "client!XZMPLIVN", name = "E", descriptor = "[I")
    public int[] field1705 = new int[256];

    @OriginalMember(owner = "client!XZMPLIVN", name = "F", descriptor = "[I")
    public int[] field1706 = new int[256];

    @OriginalMember(owner = "client!XZMPLIVN", name = "G", descriptor = "[I")
    public int[] field1707 = new int[256];

    @OriginalMember(owner = "client!XZMPLIVN", name = "I", descriptor = "Ljava/util/Random;")
    public Random field1709 = new Random();

    @OriginalMember(owner = "client!XZMPLIVN", name = "J", descriptor = "Z")
    public boolean field1710 = false;

    @OriginalMember(owner = "client!XZMPLIVN", name = "H", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!XZMPLIVN", name = "<init>", descriptor = "(LNXFIIFAD;ZILjava/lang/String;)V")
    public class67(class41 arg0, boolean arg1, int arg2, String arg3) {
        class37 var5 = new class37(arg0.method431(arg3 + ".dat", null), -670);
        class37 var6 = new class37(arg0.method431("index.dat", null), -670);
        boolean var7 = true;
        var6.field1212 = var5.method388() + 4;
        int var8 = 24 / arg2;
        int var9 = var6.method386();
        if (var9 > 0) {
            var6.field1212 += (var9 - 1) * 3;
        }
        for (int var10 = 0; var10 < 256; var10++) {
            this.field1705[var10] = var6.method386();
            this.field1706[var10] = var6.method386();
            int var12 = this.field1703[var10] = var6.method388();
            int var13 = this.field1704[var10] = var6.method388();
            int var14 = var6.method386();
            int var15 = var12 * var13;
            this.field1702[var10] = new byte[var15];
            if (var14 == 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    this.field1702[var10][var16] = var5.method387();
                }
            } else if (var14 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var13; var18++) {
                        this.field1702[var10][var12 * var18 + var17] = var5.method387();
                    }
                }
            }
            if (var13 > this.field1708 && var10 < 128) {
                this.field1708 = var13;
            }
            this.field1705[var10] = 1;
            this.field1707[var10] = var12 + 2;
            int var19 = 0;
            for (int var20 = var13 / 7; var20 < var13; var20++) {
                var19 += this.field1702[var10][var12 * var20];
            }
            int var10002;
            if (var19 <= var13 / 7) {
                var10002 = this.field1707[var10]--;
                this.field1705[var10] = 0;
            }
            int var21 = 0;
            for (int var22 = var13 / 7; var22 < var13; var22++) {
                var21 += this.field1702[var10][var12 * var22 + var12 - 1];
            }
            if (var21 <= var13 / 7) {
                var10002 = this.field1707[var10]--;
            }
        }
        if (arg1) {
            this.field1707[32] = this.field1707[73];
        } else {
            this.field1707[32] = this.field1707[105];
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public void method584(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method589(arg4, arg2, arg3 - this.method588(arg2, true), arg1, -312);
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method585(int arg0, int arg1, int arg2, int arg3, String arg4) {
        this.method589(arg0, arg4, arg3 - this.method588(arg4, true) / 2, arg2, -312);
        if (arg1 != 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IZIBILjava/lang/String;)V")
    public void method586(int arg0, boolean arg1, int arg2, byte arg3, int arg4, String arg5) {
        if (arg3 != 5) {
            this.field1699 = 266;
        }
        this.method593((byte) 104, arg0, arg4 - this.method587(arg5, -24375) / 2, arg1, arg2, arg5);
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method587(String arg0, int arg1) {
        if (arg1 != -24375) {
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
                var4 += this.field1707[arg0.charAt(var5)];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public int method588(String arg0, boolean arg1) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = 0;
        if (!arg1) {
            this.field1699 = -81;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3 += this.field1707[arg0.charAt(var4)];
        }
        return var3;
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method589(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= 0) {
            this.field1699 = -46;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field1708;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method596(this.field1702[var8], this.field1705[var8] + arg2, this.field1706[var8] + var6, this.field1703[var8], this.field1704[var8], arg0);
            }
            arg2 += this.field1707[var8];
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method590(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg0 - this.method588(arg1, true) / 2;
        int var8 = arg5 - this.field1708;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var11 = arg1.charAt(var9);
            if (var11 != ' ') {
                this.method596(this.field1702[var11], this.field1705[var11] + var7, this.field1706[var11] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1703[var11], this.field1704[var11], arg2);
            }
            var7 += this.field1707[var11];
        }
        int var10 = 62 / arg4;
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIZIILjava/lang/String;)V")
    public void method591(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5) {
        if (arg5 == null) {
            return;
        }
        int var7 = arg1 - this.method588(arg5, true) / 2;
        if (arg2) {
            return;
        }
        int var8 = arg4 - this.field1708;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            char var10 = arg5.charAt(var9);
            if (var10 != ' ') {
                this.method596(this.field1702[var10], this.field1705[var10] + var7 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1706[var10] + var8 + (int) (Math.sin((double) arg0 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1703[var10], this.field1704[var10], arg3);
            }
            var7 += this.field1707[var10];
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIZIIILjava/lang/String;)V")
    public void method592(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg6 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg4 - this.method588(arg6, true) / 2;
        int var11 = arg3 - this.field1708;
        for (int var12 = 0; var12 < arg6.length(); var12++) {
            char var13 = arg6.charAt(var12);
            if (var13 != ' ') {
                this.method596(this.field1702[var13], this.field1705[var13] + var10, this.field1706[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg5) * var8), this.field1703[var13], this.field1704[var13], arg0);
            }
            var10 += this.field1707[var13];
        }
        if (arg2) {
            this.field1701 = 60;
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(BIIZILjava/lang/String;)V")
    public void method593(byte arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        this.field1710 = false;
        int var7 = arg2;
        if (arg5 == null) {
            return;
        }
        int var8 = arg4 - this.field1708;
        for (int var9 = 0; var9 < arg5.length(); var9++) {
            if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
                int var10 = this.method595((byte) 79, arg5.substring(var9 + 1, var9 + 4));
                if (var10 != -1) {
                    arg1 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg5.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method596(this.field1702[var11], this.field1705[var11] + arg2 + 1, this.field1706[var11] + var8 + 1, this.field1703[var11], this.field1704[var11], 0);
                    }
                    this.method596(this.field1702[var11], this.field1705[var11] + arg2, this.field1706[var11] + var8, this.field1703[var11], this.field1704[var11], arg1);
                }
                arg2 += this.field1707[var11];
            }
        }
        if (arg0 != 104) {
            this.field1698 = !this.field1698;
        }
        if (this.field1710) {
            class52.method487(var7, -115, 8388608, arg2 - var7, (int) ((double) this.field1708 * 0.7D) + var8);
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
    public void method594(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg3 == null) {
            return;
        }
        this.field1709.setSeed((long) arg5);
        int var8 = (this.field1709.nextInt() & 0x1F) + 192;
        if (arg2 < 8 || arg2 > 8) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        int var10 = arg6 - this.field1708;
        for (int var11 = 0; var11 < arg3.length(); var11++) {
            if (arg3.charAt(var11) == '@' && var11 + 4 < arg3.length() && arg3.charAt(var11 + 4) == '@') {
                int var12 = this.method595((byte) 79, arg3.substring(var11 + 1, var11 + 4));
                if (var12 != -1) {
                    arg4 = var12;
                }
                var11 += 4;
            } else {
                char var13 = arg3.charAt(var11);
                if (var13 != ' ') {
                    if (arg0) {
                        this.method598(0, this.field1704[var13], this.field1706[var13] + var10 + 1, this.field1703[var13], this.field1705[var13] + arg1 + 1, this.field1702[var13], this.field1700, 192);
                    }
                    this.method598(arg4, this.field1704[var13], this.field1706[var13] + var10, this.field1703[var13], this.field1705[var13] + arg1, this.field1702[var13], this.field1700, var8);
                }
                arg1 += this.field1707[var13];
                if ((this.field1709.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(BLjava/lang/String;)I")
    public int method595(byte arg0, String arg1) {
        if (arg0 != 79) {
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
                this.field1710 = true;
            }
            if (arg1.equals("end")) {
                this.field1710 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "([BIIIII)V")
    private void method596(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class52.field1437 * arg2 + arg1;
        int var8 = class52.field1437 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class52.field1439) {
            int var11 = class52.field1439 - arg2;
            arg4 -= var11;
            arg2 = class52.field1439;
            var10 += arg3 * var11;
            var7 += class52.field1437 * var11;
        }
        if (arg2 + arg4 >= class52.field1440) {
            arg4 -= arg2 + arg4 + 1 - class52.field1440;
        }
        if (arg1 < class52.field1441) {
            int var12 = class52.field1441 - arg1;
            arg3 -= var12;
            arg1 = class52.field1441;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class52.field1442) {
            int var13 = arg1 + arg3 + 1 - class52.field1442;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method597(class52.field1436, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method597(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIIII[BII)V")
    private void method598(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
        while (arg6 >= 0) {
            this.field1701 = -269;
        }
        int var9 = class52.field1437 * arg2 + arg4;
        int var10 = class52.field1437 - arg3;
        int var11 = 0;
        int var12 = 0;
        if (arg2 < class52.field1439) {
            int var13 = class52.field1439 - arg2;
            arg1 -= var13;
            arg2 = class52.field1439;
            var12 += arg3 * var13;
            var9 += class52.field1437 * var13;
        }
        if (arg1 + arg2 >= class52.field1440) {
            arg1 -= arg1 + arg2 + 1 - class52.field1440;
        }
        if (arg4 < class52.field1441) {
            int var14 = class52.field1441 - arg4;
            arg3 -= var14;
            arg4 = class52.field1441;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg3 + arg4 >= class52.field1442) {
            int var15 = arg3 + arg4 + 1 - class52.field1442;
            arg3 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg3 > 0 && arg1 > 0) {
            this.method599(var9, arg1, arg3, arg0, arg7, (byte) 7, class52.field1436, arg5, var10, var11, var12);
        }
    }

    @OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIIIIB[I[BIII)V")
    private void method599(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
        if (arg5 == 7) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        int var15 = 256 - arg4;
        for (int var16 = -arg1; var16 < 0; var16++) {
            for (int var17 = -arg2; var17 < 0; var17++) {
                if (arg7[arg10++] == 0) {
                    arg0++;
                } else {
                    int var18 = arg6[arg0];
                    arg6[arg0++] = (((var18 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var18 & 0xFF00) * var15 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg8;
            arg10 += arg9;
        }
    }
}
