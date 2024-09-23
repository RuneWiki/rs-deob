import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UMCYZJWP")
public class class60 extends class22 {

    @OriginalMember(owner = "UMCYZJWP", name = "z", descriptor = "I")
    private int field1490 = -510;

    @OriginalMember(owner = "UMCYZJWP", name = "A", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "UMCYZJWP", name = "B", descriptor = "I")
    private int field1492 = 2088;

    @OriginalMember(owner = "UMCYZJWP", name = "C", descriptor = "I")
    private int field1493 = 9;

    @OriginalMember(owner = "UMCYZJWP", name = "E", descriptor = "Z")
    private boolean field1495 = true;

    @OriginalMember(owner = "UMCYZJWP", name = "F", descriptor = "Z")
    private boolean field1496 = false;

    @OriginalMember(owner = "UMCYZJWP", name = "G", descriptor = "[[B")
    public byte[][] field1497 = new byte[256][];

    @OriginalMember(owner = "UMCYZJWP", name = "H", descriptor = "[I")
    public int[] field1498 = new int[256];

    @OriginalMember(owner = "UMCYZJWP", name = "I", descriptor = "[I")
    public int[] field1499 = new int[256];

    @OriginalMember(owner = "UMCYZJWP", name = "J", descriptor = "[I")
    public int[] field1500 = new int[256];

    @OriginalMember(owner = "UMCYZJWP", name = "K", descriptor = "[I")
    public int[] field1501 = new int[256];

    @OriginalMember(owner = "UMCYZJWP", name = "L", descriptor = "[I")
    public int[] field1502 = new int[256];

    @OriginalMember(owner = "UMCYZJWP", name = "N", descriptor = "Ljava/util/Random;")
    public Random field1504 = new Random();

    @OriginalMember(owner = "UMCYZJWP", name = "O", descriptor = "Z")
    public boolean field1505 = false;

    @OriginalMember(owner = "UMCYZJWP", name = "M", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "UMCYZJWP", name = "D", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "UMCYZJWP", name = "<init>", descriptor = "(Ljava/lang/String;ZILQKFGLETG;)V")
    public class60(String arg0, boolean arg1, int arg2, class50 arg3) {
        class68 var5 = new class68((byte) 9, arg3.method402(arg0 + ".dat", null));
        class68 var6 = new class68((byte) 9, arg3.method402("index.dat", null));
        boolean var7 = true;
        var6.field1643 = var5.method536() + 4;
        int var8 = var6.method534();
        if (var8 > 0) {
            var6.field1643 += (var8 - 1) * 3;
        }
        for (int var9 = 0; var9 < 256; var9++) {
            this.field1500[var9] = var6.method534();
            this.field1501[var9] = var6.method534();
            int var11 = this.field1498[var9] = var6.method536();
            int var12 = this.field1499[var9] = var6.method536();
            int var13 = var6.method534();
            int var14 = var11 * var12;
            this.field1497[var9] = new byte[var14];
            if (var13 == 0) {
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field1497[var9][var15] = var5.method535();
                }
            } else if (var13 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        this.field1497[var9][var11 * var17 + var16] = var5.method535();
                    }
                }
            }
            if (var12 > this.field1503 && var9 < 128) {
                this.field1503 = var12;
            }
            this.field1500[var9] = 1;
            this.field1502[var9] = var11 + 2;
            int var18 = 0;
            for (int var19 = var12 / 7; var19 < var12; var19++) {
                var18 += this.field1497[var9][var11 * var19];
            }
            int var10002;
            if (var18 <= var12 / 7) {
                var10002 = this.field1502[var9]--;
                this.field1500[var9] = 0;
            }
            int var20 = 0;
            for (int var21 = var12 / 7; var21 < var12; var21++) {
                var20 += this.field1497[var9][var11 * var21 + var11 - 1];
            }
            if (var20 <= var12 / 7) {
                var10002 = this.field1502[var9]--;
            }
        }
        if (arg2 >= 0) {
            this.field1496 = !this.field1496;
        }
        if (arg1) {
            this.field1502[32] = this.field1502[73];
        } else {
            this.field1502[32] = this.field1502[105];
            if (class47.field1218) {
            }
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(IIIILjava/lang/String;)V")
    public void method465(int arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.method470(arg0 - this.method469(0, arg4), arg4, arg1, arg3, 1);
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public void method466(int arg0, String arg1, int arg2, int arg3, int arg4) {
        this.method470(arg3 - this.method469(0, arg1) / 2, arg1, arg2, arg0, 1);
        if (arg4 != 5) {
            this.field1490 = -294;
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;ZZII)V")
    public void method467(int arg0, String arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        this.method474(arg5, arg4, arg1, arg3, arg0 - this.method468(arg1, (byte) 12) / 2, (byte) 3);
        if (!arg2) {
            this.field1491 = !this.field1491;
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public int method468(String arg0, byte arg1) {
        if (arg1 != 12) {
            return 4;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg0.length(); var4++) {
                if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
                    var4 += 4;
                } else {
                    var3 += this.field1502[arg0.charAt(var4)];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;)I")
    public int method469(int arg0, String arg1) {
        if (arg0 != 0) {
            return this.field1492;
        } else if (arg1 == null) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < arg1.length(); var4++) {
                var3 += this.field1502[arg1.charAt(var4)];
            }
            return var3;
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "b", descriptor = "(ILjava/lang/String;III)V")
    public void method470(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg1 == null) {
            return;
        }
        int var6 = arg3 - this.field1503;
        for (int var7 = 0; var7 < arg1.length(); var7++) {
            char var8 = arg1.charAt(var7);
            if (var8 != ' ') {
                this.method477(this.field1497[var8], this.field1500[var8] + arg0, this.field1501[var8] + var6, this.field1498[var8], this.field1499[var8], arg2);
            }
            arg0 += this.field1502[var8];
        }
        if (arg4 < 1 || arg4 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public void method471(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == null) {
            return;
        }
        int var7 = arg3 - this.method469(0, arg1) / 2;
        if (arg5 <= 0) {
            this.field1495 = !this.field1495;
        }
        int var8 = arg4 - this.field1503;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            char var10 = arg1.charAt(var9);
            if (var10 != ' ') {
                this.method477(this.field1497[var10], this.field1500[var10] + var7, this.field1501[var10] + var8 + (int) (Math.sin((double) arg2 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field1498[var10], this.field1499[var10], arg0);
            }
            var7 += this.field1502[var10];
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public void method472(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            this.field1493 = 220;
        }
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.method469(0, arg0) / 2;
        int var8 = arg1 - this.field1503;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            char var10 = arg0.charAt(var9);
            if (var10 != ' ') {
                this.method477(this.field1497[var10], this.field1500[var10] + var7 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 5.0D) * 5.0D), this.field1501[var10] + var8 + (int) (Math.sin((double) arg3 / 5.0D + (double) var9 / 3.0D) * 5.0D), this.field1498[var10], this.field1499[var10], arg4);
            }
            var7 += this.field1502[var10];
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public void method473(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg5 == null) {
            return;
        }
        double var8 = 7.0D - (double) arg1 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0 - this.method469(0, arg5) / 2;
        if (arg3 < 5 || arg3 > 5) {
            return;
        }
        int var11 = arg6 - this.field1503;
        for (int var12 = 0; var12 < arg5.length(); var12++) {
            char var13 = arg5.charAt(var12);
            if (var13 != ' ') {
                this.method477(this.field1497[var13], this.field1500[var13] + var10, this.field1501[var13] + var11 + (int) (Math.sin((double) var12 / 1.5D + (double) arg2) * var8), this.field1498[var13], this.field1499[var13], arg4);
            }
            var10 += this.field1502[var13];
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(IILjava/lang/String;ZIB)V")
    public void method474(int arg0, int arg1, String arg2, boolean arg3, int arg4, byte arg5) {
        this.field1505 = false;
        int var7 = arg4;
        if (arg2 == null) {
            return;
        }
        int var8 = arg0 - this.field1503;
        if (arg5 != 3) {
            return;
        }
        for (int var9 = 0; var9 < arg2.length(); var9++) {
            if (arg2.charAt(var9) == '@' && var9 + 4 < arg2.length() && arg2.charAt(var9 + 4) == '@') {
                int var10 = this.method476(arg2.substring(var9 + 1, var9 + 4), this.field1494);
                if (var10 != -1) {
                    arg1 = var10;
                }
                var9 += 4;
            } else {
                char var11 = arg2.charAt(var9);
                if (var11 != ' ') {
                    if (arg3) {
                        this.method477(this.field1497[var11], this.field1500[var11] + arg4 + 1, this.field1501[var11] + var8 + 1, this.field1498[var11], this.field1499[var11], 0);
                    }
                    this.method477(this.field1497[var11], this.field1500[var11] + arg4, this.field1501[var11] + var8, this.field1498[var11], this.field1499[var11], arg1);
                }
                arg4 += this.field1502[var11];
            }
        }
        if (this.field1505) {
            class22.method287(8388608, (int) ((double) this.field1503 * 0.7D) + var8, -166, arg4 - var7, var7);
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;IZIZII)V")
    public void method475(String arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.field1504.setSeed((long) arg5);
        int var8 = (this.field1504.nextInt() & 0x1F) + 192;
        if (arg4) {
            return;
        }
        int var9 = arg6 - this.field1503;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) == '@' && var10 + 4 < arg0.length() && arg0.charAt(var10 + 4) == '@') {
                int var11 = this.method476(arg0.substring(var10 + 1, var10 + 4), this.field1494);
                if (var11 != -1) {
                    arg1 = var11;
                }
                var10 += 4;
            } else {
                char var12 = arg0.charAt(var10);
                if (var12 != ' ') {
                    if (arg2) {
                        this.method479(this.field1499[var12], this.field1498[var12], this.field1497[var12], 192, 0, this.field1500[var12] + arg3 + 1, this.field1501[var12] + var9 + 1, 0);
                    }
                    this.method479(this.field1499[var12], this.field1498[var12], this.field1497[var12], var8, arg1, this.field1500[var12] + arg3, this.field1501[var12] + var9, 0);
                }
                arg3 += this.field1502[var12];
                if ((this.field1504.nextInt() & 0x3) == 0) {
                    arg3++;
                }
            }
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public int method476(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field1491 = !this.field1491;
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
                this.field1505 = true;
            }
            if (arg0.equals("end")) {
                this.field1505 = false;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "([BIIIII)V")
    private void method477(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class22.field841 * arg2 + arg1;
        int var8 = class22.field841 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class22.field843) {
            int var11 = class22.field843 - arg2;
            arg4 -= var11;
            arg2 = class22.field843;
            var10 += arg3 * var11;
            var7 += class22.field841 * var11;
        }
        if (arg2 + arg4 >= class22.field844) {
            arg4 -= arg2 + arg4 + 1 - class22.field844;
        }
        if (arg1 < class22.field845) {
            int var12 = class22.field845 - arg1;
            arg3 -= var12;
            arg1 = class22.field845;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 >= class22.field846) {
            int var13 = arg1 + arg3 + 1 - class22.field846;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method478(class22.field840, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "([I[BIIIIIII)V")
    private void method478(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(II[BIIIII)V")
    private void method479(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = class22.field841 * arg6 + arg5;
        int var10 = class22.field841 - arg1;
        int var11 = 0;
        int var12 = 0;
        if (arg7 != 0) {
            return;
        }
        if (arg6 < class22.field843) {
            int var13 = class22.field843 - arg6;
            arg0 -= var13;
            arg6 = class22.field843;
            var12 += arg1 * var13;
            var9 += class22.field841 * var13;
        }
        if (arg0 + arg6 >= class22.field844) {
            arg0 -= arg0 + arg6 + 1 - class22.field844;
        }
        if (arg5 < class22.field845) {
            int var14 = class22.field845 - arg5;
            arg1 -= var14;
            arg5 = class22.field845;
            var12 += var14;
            var9 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (arg1 + arg5 >= class22.field846) {
            int var15 = arg1 + arg5 + 1 - class22.field846;
            arg1 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (arg1 > 0 && arg0 > 0) {
            this.method480(var9, var10, arg0, arg2, arg4, 0, class22.field840, arg1, var12, var11, arg3);
        }
    }

    @OriginalMember(owner = "UMCYZJWP", name = "a", descriptor = "(III[BII[IIIII)V")
    private void method480(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = ((arg4 & 0xFF00FF) * arg10 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg10 & 0xFF0000) >> 8;
        int var13 = 256 - arg10;
        if (arg5 != 0) {
            this.field1491 = !this.field1491;
        }
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = -arg7; var15 < 0; var15++) {
                if (arg3[arg8++] == 0) {
                    arg0++;
                } else {
                    int var16 = arg6[arg0];
                    arg6[arg0++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
                }
            }
            arg0 += arg1;
            arg8 += arg9;
        }
    }
}
