import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class272 extends class152 {

    @OriginalMember(owner = "client!am", name = "U", descriptor = "[I")
    private int[] field4573 = new int[257];

    @OriginalMember(owner = "client!am", name = "T", descriptor = "Lce;")
    public static class126 field4572 = class206.method1445(-7923, "Regarder dans cette direction");

    @OriginalMember(owner = "client!am", name = "R", descriptor = "Lce;")
    public static class126 field4570 = class206.method1445(-7923, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!am", name = "db", descriptor = "J")
    public static volatile long field4582 = 0L;

    @OriginalMember(owner = "client!am", name = "gb", descriptor = "Lce;")
    public static class126 field4585 = class206.method1445(-7923, "::wm3");

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "Lce;")
    public static class126 field4580 = class206.method1445(-7923, "M");

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "I")
    public static int field4579 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!am", name = "eb", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!am", name = "hb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!am", name = "ib", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "Lha;")
    public static class26 field4574;

    @OriginalMember(owner = "client!am", name = "fb", descriptor = "Lcc;")
    public static class313 field4584;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "[[I")
    private int[][] field4576;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)V", line = 4)
    public final void method2(byte arg0) {
        if (this.field4576 == null) {
            this.method1825(true, 1);
        }
        int var2 = -74 / ((arg0 - 2) / 37);
        this.method1824(0);
        field4581++;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 19)
    public static void method1822(int arg0) {
        field4574 = null;
        field4584 = null;
        field4572 = null;
        field4585 = null;
        if (arg0 == 0) {
            field4580 = null;
            field4570 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(II)V", line = 34)
    public static final void method1823(int arg0, int arg1) {
        class209.field3594[2] = (float) class47.method289(255, arg1) / 255.0F;
        field4586++;
        class209.field3594[1] = (float) (class47.method289(65422, arg1) >> 8) / 255.0F;
        class209.field3594[0] = (float) (class47.method289(arg1, 16731500) >> 16) / 255.0F;
        if (arg0 > -5) {
            method1822(29);
        }
        class281.method1880(3, 0);
        class281.method1880(4, 0);
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V", line = 56)
    private final void method1824(int arg0) {
        field4578++;
        int var2 = this.field4576.length;
        if (arg0 >= var2) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field4576[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 < var2) {
                int[] var7 = this.field4576[var4];
                if (var4 <= 0) {
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field4576[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                    var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    var9 = var7[2] * var12 + (var11[2] * var13) >> 12;
                }
            } else {
                int[] var14 = this.field4576[var2 - 1];
                var10 = var14[3];
                var9 = var14[2];
                var8 = var14[1];
            }
            int var15 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var9 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field4573[var3] = class221.method1516(var15, class221.method1516(var17 << 16, var16 << 8));
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(ZI)V", line = 160)
    private final void method1825(boolean arg0, int arg1) {
        field4583++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4576 = new int[2][4];
                this.field4576[0][1] = 0;
                this.field4576[0][3] = 0;
                this.field4576[1][3] = 4096;
                this.field4576[1][1] = 4096;
                this.field4576[0][2] = 0;
                this.field4576[0][0] = 0;
                this.field4576[1][2] = 4096;
                this.field4576[1][0] = 4096;
            } else if (arg1 == 2) {
                this.field4576 = new int[8][4];
                this.field4576[0][1] = 2650;
                this.field4576[0][0] = 0;
                this.field4576[1][0] = 2867;
                this.field4576[0][2] = 2602;
                this.field4576[1][2] = 1799;
                this.field4576[2][2] = 1734;
                this.field4576[1][1] = 2313;
                this.field4576[2][1] = 2618;
                this.field4576[3][2] = 1220;
                this.field4576[3][1] = 2296;
                this.field4576[4][2] = 963;
                this.field4576[4][1] = 2072;
                this.field4576[5][1] = 2730;
                this.field4576[0][3] = 2361;
                this.field4576[2][0] = 3072;
                this.field4576[1][3] = 1558;
                this.field4576[2][3] = 1413;
                this.field4576[3][3] = 947;
                this.field4576[3][0] = 3276;
                this.field4576[5][2] = 2152;
                this.field4576[6][2] = 1060;
                this.field4576[7][2] = 1413;
                this.field4576[4][0] = 3481;
                this.field4576[4][3] = 722;
                this.field4576[6][1] = 2232;
                this.field4576[5][0] = 3686;
                this.field4576[5][3] = 1766;
                this.field4576[6][0] = 3891;
                this.field4576[7][0] = 4096;
                this.field4576[6][3] = 915;
                this.field4576[7][3] = 1140;
                this.field4576[7][1] = 1686;
            } else if (arg1 == 3) {
                this.field4576 = new int[7][4];
                this.field4576[0][1] = 0;
                this.field4576[0][3] = 4096;
                this.field4576[0][0] = 0;
                this.field4576[1][3] = 4096;
                this.field4576[1][1] = 0;
                this.field4576[2][1] = 0;
                this.field4576[3][1] = 4096;
                this.field4576[4][1] = 4096;
                this.field4576[1][0] = 663;
                this.field4576[2][0] = 1363;
                this.field4576[5][1] = 4096;
                this.field4576[3][0] = 2048;
                this.field4576[2][3] = 0;
                this.field4576[3][3] = 0;
                this.field4576[4][3] = 0;
                this.field4576[4][0] = 2727;
                this.field4576[6][1] = 0;
                this.field4576[5][3] = 4096;
                this.field4576[6][3] = 4096;
                this.field4576[0][2] = 0;
                this.field4576[1][2] = 4096;
                this.field4576[2][2] = 4096;
                this.field4576[3][2] = 4096;
                this.field4576[5][0] = 3411;
                this.field4576[4][2] = 0;
                this.field4576[5][2] = 0;
                this.field4576[6][0] = 4096;
                this.field4576[6][2] = 0;
            } else if (arg1 == 4) {
                this.field4576 = new int[6][4];
                this.field4576[0][2] = 0;
                this.field4576[0][3] = 0;
                this.field4576[1][3] = 1493;
                this.field4576[0][0] = 0;
                this.field4576[1][2] = 0;
                this.field4576[2][3] = 2939;
                this.field4576[0][1] = 0;
                this.field4576[1][0] = 1843;
                this.field4576[2][0] = 2457;
                this.field4576[3][3] = 3565;
                this.field4576[4][3] = 4031;
                this.field4576[5][3] = 4096;
                this.field4576[1][1] = 0;
                this.field4576[3][0] = 2781;
                this.field4576[2][2] = 0;
                this.field4576[3][2] = 1124;
                this.field4576[4][2] = 3084;
                this.field4576[5][2] = 4096;
                this.field4576[2][1] = 0;
                this.field4576[4][0] = 3481;
                this.field4576[3][1] = 0;
                this.field4576[4][1] = 546;
                this.field4576[5][1] = 4096;
                this.field4576[5][0] = 4096;
            } else if (arg1 == 5) {
                this.field4576 = new int[16][4];
                this.field4576[0][1] = 80;
                this.field4576[0][3] = 321;
                this.field4576[0][2] = 192;
                this.field4576[0][0] = 0;
                this.field4576[1][0] = 155;
                this.field4576[1][3] = 562;
                this.field4576[2][0] = 389;
                this.field4576[1][2] = 449;
                this.field4576[3][0] = 671;
                this.field4576[2][2] = 690;
                this.field4576[3][2] = 995;
                this.field4576[4][2] = 1397;
                this.field4576[5][2] = 1429;
                this.field4576[2][3] = 803;
                this.field4576[6][2] = 1461;
                this.field4576[1][1] = 321;
                this.field4576[7][2] = 1525;
                this.field4576[2][1] = 578;
                this.field4576[3][3] = 1140;
                this.field4576[3][1] = 947;
                this.field4576[4][1] = 1285;
                this.field4576[5][1] = 1525;
                this.field4576[4][0] = 897;
                this.field4576[8][2] = 1590;
                this.field4576[6][1] = 1734;
                this.field4576[4][3] = 1509;
                this.field4576[9][2] = 2056;
                this.field4576[10][2] = 2586;
                this.field4576[7][1] = 1413;
                this.field4576[8][1] = 1108;
                this.field4576[9][1] = 1766;
                this.field4576[5][3] = 1413;
                this.field4576[10][1] = 2409;
                this.field4576[11][1] = 3116;
                this.field4576[5][0] = 1175;
                this.field4576[6][0] = 1368;
                this.field4576[7][0] = 1507;
                this.field4576[12][1] = 3806;
                this.field4576[6][3] = 1333;
                this.field4576[11][2] = 3148;
                this.field4576[13][1] = 3437;
                this.field4576[14][1] = 3116;
                this.field4576[8][0] = 1736;
                this.field4576[15][1] = 2377;
                this.field4576[9][0] = 2088;
                this.field4576[10][0] = 2355;
                this.field4576[12][2] = 3710;
                this.field4576[7][3] = 1702;
                this.field4576[13][2] = 3421;
                this.field4576[11][0] = 2691;
                this.field4576[8][3] = 2056;
                this.field4576[9][3] = 2666;
                this.field4576[12][0] = 3031;
                this.field4576[10][3] = 3276;
                this.field4576[14][2] = 3148;
                this.field4576[13][0] = 3522;
                this.field4576[14][0] = 3727;
                this.field4576[15][2] = 2505;
                this.field4576[15][0] = 4096;
                this.field4576[11][3] = 3228;
                this.field4576[12][3] = 3196;
                this.field4576[13][3] = 3019;
                this.field4576[14][3] = 3228;
                this.field4576[15][3] = 2746;
            } else if (arg1 == 6) {
                this.field4576 = new int[4][4];
                this.field4576[0][0] = 2048;
                this.field4576[0][2] = 4096;
                this.field4576[1][2] = 4096;
                this.field4576[2][2] = 4096;
                this.field4576[3][2] = 0;
                this.field4576[1][0] = 2867;
                this.field4576[0][3] = 0;
                this.field4576[0][1] = 0;
                this.field4576[2][0] = 3276;
                this.field4576[3][0] = 4096;
                this.field4576[1][3] = 0;
                this.field4576[2][3] = 0;
                this.field4576[3][3] = 0;
                this.field4576[1][1] = 4096;
                this.field4576[2][1] = 4096;
                this.field4576[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILbb;)V", line = 424)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field4577++;
        if (arg0 != 8) {
            this.method1824(30);
        }
        if (arg1 != 0) {
            return;
        }
        int var4 = arg2.method948(-124);
        if (var4 != 0) {
            this.method1825(true, var4);
            return;
        }
        this.field4576 = new int[arg2.method948(-122)][4];
        for (int var5 = 0; var5 < this.field4576.length; var5++) {
            this.field4576[var5][0] = arg2.method942(true);
            this.field4576[var5][1] = arg2.method948(arg0 - 134) << 4;
            this.field4576[var5][2] = arg2.method948(-128) << 4;
            this.field4576[var5][3] = arg2.method948(arg0 - 133) << 4;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(II)[[I", line = 469)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method26(24, 1);
        }
        int[][] var3 = this.field2775.method319(102, arg1);
        if (this.field2775.field775) {
            int[] var4 = this.method1132(arg1, 33, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class244.field4133; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4573[var9];
                var5[var8] = class47.method289(4080, var10 >> 12);
                var7[var8] = class47.method289(var10 >> 4, 4080);
                var6[var8] = class47.method289(4080, var10 << 4);
            }
        }
        field4571++;
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 529)
    public static final String method1826(Throwable arg0, int arg1) throws IOException {
        field4575++;
        String var3;
        if (arg0 instanceof class132) {
            class132 var2 = (class132) arg0;
            arg0 = var2.field2268;
            var3 = var2.field2269 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 32) {
            return (String) null;
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var11 = var9.indexOf(40);
                int var12 = var9.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var9.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var11);
                }
                String var16 = var9.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 612)
    public class272() {
        super(1, false);
    }
}
