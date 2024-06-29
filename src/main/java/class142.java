import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class142 extends class310 {

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "[I")
    private int[] field2321 = new int[257];

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "[I")
    public static int[] field2320;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "[[I")
    private int[][] field2319;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 3)
    public class142() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lqm;II)V", line = 7)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method1720((byte) -22);
            if (var4 == 0) {
                this.field2319 = new int[arg0.method1720((byte) -68)][4];
                for (int var5 = 0; var5 < this.field2319.length; var5++) {
                    this.field2319[var5][0] = arg0.method1765(true);
                    this.field2319[var5][1] = arg0.method1720((byte) -27) << 4;
                    this.field2319[var5][2] = arg0.method1720((byte) -83) << 4;
                    this.field2319[var5][3] = arg0.method1720((byte) -127) << 4;
                }
            } else {
                this.method1096(-29361, var4);
            }
        }
        field2315++;
        if (arg1 != -2470) {
            this.field2319 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lth;Lof;ILth;Lth;)Z", line = 48)
    public static final boolean method1091(class57 arg0, class222 arg1, int arg2, class57 arg3, class57 arg4) {
        class109.field1795 = arg4;
        class36.field535 = arg1;
        class223.field3700 = arg3;
        field2322++;
        if (arg2 != 0) {
            field2323 = 62;
        }
        class260.field4387 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 65)
    public static final String method1092(int arg0, Throwable arg1) throws IOException {
        field2325++;
        if (arg0 <= 79) {
            field2323 = -11;
        }
        String var3;
        if (arg1 instanceof class293) {
            class293 var2 = (class293) arg1;
            arg1 = var2.field4733;
            var3 = var2.field4734 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 139)
    public static void method1093(int arg0) {
        if (arg0 != 1) {
            method1091((class57) null, (class222) null, -124, (class57) null, (class57) null);
        }
        field2320 = null;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V", line = 150)
    public final void method553(byte arg0) {
        field2324++;
        if (this.field2319 == null) {
            this.method1096(-29361, 1);
        }
        this.method1094((byte) -74);
        if (arg0 >= -82) {
            this.method75((class227) null, 111, 78);
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V", line = 166)
    private final void method1094(byte arg0) {
        field2316++;
        if (arg0 != -74) {
            this.method1094((byte) 127);
        }
        int var2 = this.field2319.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field2319[var6][0]; var6++) {
                var4++;
            }
            int var11;
            int var12;
            int var13;
            if (var2 > var4) {
                int[] var7 = this.field2319[var4];
                if (var4 > 0) {
                    int[] var8 = this.field2319[var4 - 1];
                    int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                    int var10 = 4096 - var9;
                    var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                    var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                    var13 = var7[1] * var9 + var8[1] * var10 >> 12;
                } else {
                    var13 = var7[1];
                    var11 = var7[2];
                    var12 = var7[3];
                }
            } else {
                int[] var14 = this.field2319[var2 - 1];
                var11 = var14[2];
                var12 = var14[3];
                var13 = var14[1];
            }
            int var15 = var12 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var13 >> 4;
            int var17 = var11 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2321[var3] = class75.method624(class75.method624(var16 << 16, var17 << 8), var15);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILhd;Lhd;IIIIJ)V", line = 271)
    public static final void method1095(int arg0, int arg1, int arg2, int arg3, class161 arg4, class161 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class339 var12 = new class339();
        var12.field5406 = arg10;
        var12.field5404 = arg1 * 128 + 64;
        var12.field5401 = arg2 * 128 + 64;
        var12.field5399 = arg3;
        var12.field5400 = arg4;
        var12.field5410 = arg5;
        var12.field5415 = arg6;
        var12.field5403 = arg7;
        var12.field5398 = arg8;
        var12.field5405 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class129.field2184[var13][arg1][arg2] == null) {
                class129.field2184[var13][arg1][arg2] = new class36(var13, arg1, arg2);
            }
        }
        class129.field2184[arg0][arg1][arg2].field526 = var12;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V", line = 299)
    private final void method1096(int arg0, int arg1) {
        field2317++;
        if (arg0 != -29361) {
            method1091((class57) null, (class222) null, 45, (class57) null, (class57) null);
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field2319 = new int[2][4];
            this.field2319[0][3] = 0;
            this.field2319[0][2] = 0;
            this.field2319[0][0] = 0;
            this.field2319[0][1] = 0;
            this.field2319[1][3] = 4096;
            this.field2319[1][2] = 4096;
            this.field2319[1][0] = 4096;
            this.field2319[1][1] = 4096;
        } else if (arg1 == 2) {
            this.field2319 = new int[8][4];
            this.field2319[0][1] = 2650;
            this.field2319[0][3] = 2361;
            this.field2319[1][3] = 1558;
            this.field2319[0][0] = 0;
            this.field2319[2][3] = 1413;
            this.field2319[1][0] = 2867;
            this.field2319[1][1] = 2313;
            this.field2319[2][0] = 3072;
            this.field2319[3][0] = 3276;
            this.field2319[0][2] = 2602;
            this.field2319[4][0] = 3481;
            this.field2319[2][1] = 2618;
            this.field2319[3][1] = 2296;
            this.field2319[5][0] = 3686;
            this.field2319[4][1] = 2072;
            this.field2319[1][2] = 1799;
            this.field2319[3][3] = 947;
            this.field2319[6][0] = 3891;
            this.field2319[5][1] = 2730;
            this.field2319[2][2] = 1734;
            this.field2319[4][3] = 722;
            this.field2319[6][1] = 2232;
            this.field2319[3][2] = 1220;
            this.field2319[5][3] = 1766;
            this.field2319[6][3] = 915;
            this.field2319[7][0] = 4096;
            this.field2319[7][1] = 1686;
            this.field2319[7][3] = 1140;
            this.field2319[4][2] = 963;
            this.field2319[5][2] = 2152;
            this.field2319[6][2] = 1060;
            this.field2319[7][2] = 1413;
        } else if (arg1 == 3) {
            this.field2319 = new int[7][4];
            this.field2319[0][0] = 0;
            this.field2319[0][2] = 0;
            this.field2319[0][3] = 4096;
            this.field2319[1][2] = 4096;
            this.field2319[1][3] = 4096;
            this.field2319[0][1] = 0;
            this.field2319[2][3] = 0;
            this.field2319[2][2] = 4096;
            this.field2319[3][3] = 0;
            this.field2319[3][2] = 4096;
            this.field2319[1][0] = 663;
            this.field2319[4][2] = 0;
            this.field2319[2][0] = 1363;
            this.field2319[3][0] = 2048;
            this.field2319[4][0] = 2727;
            this.field2319[5][0] = 3411;
            this.field2319[5][2] = 0;
            this.field2319[1][1] = 0;
            this.field2319[6][0] = 4096;
            this.field2319[6][2] = 0;
            this.field2319[2][1] = 0;
            this.field2319[4][3] = 0;
            this.field2319[5][3] = 4096;
            this.field2319[3][1] = 4096;
            this.field2319[4][1] = 4096;
            this.field2319[5][1] = 4096;
            this.field2319[6][1] = 0;
            this.field2319[6][3] = 4096;
        } else if (arg1 == 4) {
            this.field2319 = new int[6][4];
            this.field2319[0][1] = 0;
            this.field2319[0][0] = 0;
            this.field2319[0][2] = 0;
            this.field2319[1][1] = 0;
            this.field2319[2][1] = 0;
            this.field2319[1][0] = 1843;
            this.field2319[1][2] = 0;
            this.field2319[3][1] = 0;
            this.field2319[4][1] = 546;
            this.field2319[5][1] = 4096;
            this.field2319[2][2] = 0;
            this.field2319[0][3] = 0;
            this.field2319[3][2] = 1124;
            this.field2319[2][0] = 2457;
            this.field2319[3][0] = 2781;
            this.field2319[1][3] = 1493;
            this.field2319[2][3] = 2939;
            this.field2319[4][0] = 3481;
            this.field2319[3][3] = 3565;
            this.field2319[4][2] = 3084;
            this.field2319[4][3] = 4031;
            this.field2319[5][0] = 4096;
            this.field2319[5][3] = 4096;
            this.field2319[5][2] = 4096;
        } else if (arg1 == 5) {
            this.field2319 = new int[16][4];
            this.field2319[0][0] = 0;
            this.field2319[0][3] = 321;
            this.field2319[1][0] = 155;
            this.field2319[2][0] = 389;
            this.field2319[1][3] = 562;
            this.field2319[3][0] = 671;
            this.field2319[0][1] = 80;
            this.field2319[2][3] = 803;
            this.field2319[4][0] = 897;
            this.field2319[0][2] = 192;
            this.field2319[3][3] = 1140;
            this.field2319[1][1] = 321;
            this.field2319[2][1] = 578;
            this.field2319[3][1] = 947;
            this.field2319[1][2] = 449;
            this.field2319[4][1] = 1285;
            this.field2319[5][1] = 1525;
            this.field2319[4][3] = 1509;
            this.field2319[6][1] = 1734;
            this.field2319[5][3] = 1413;
            this.field2319[2][2] = 690;
            this.field2319[3][2] = 995;
            this.field2319[7][1] = 1413;
            this.field2319[4][2] = 1397;
            this.field2319[5][0] = 1175;
            this.field2319[6][3] = 1333;
            this.field2319[6][0] = 1368;
            this.field2319[7][0] = 1507;
            this.field2319[8][1] = 1108;
            this.field2319[5][2] = 1429;
            this.field2319[8][0] = 1736;
            this.field2319[6][2] = 1461;
            this.field2319[9][0] = 2088;
            this.field2319[9][1] = 1766;
            this.field2319[10][1] = 2409;
            this.field2319[11][1] = 3116;
            this.field2319[10][0] = 2355;
            this.field2319[7][3] = 1702;
            this.field2319[12][1] = 3806;
            this.field2319[8][3] = 2056;
            this.field2319[13][1] = 3437;
            this.field2319[9][3] = 2666;
            this.field2319[7][2] = 1525;
            this.field2319[10][3] = 3276;
            this.field2319[11][3] = 3228;
            this.field2319[8][2] = 1590;
            this.field2319[12][3] = 3196;
            this.field2319[11][0] = 2691;
            this.field2319[14][1] = 3116;
            this.field2319[13][3] = 3019;
            this.field2319[9][2] = 2056;
            this.field2319[12][0] = 3031;
            this.field2319[13][0] = 3522;
            this.field2319[14][3] = 3228;
            this.field2319[14][0] = 3727;
            this.field2319[15][0] = 4096;
            this.field2319[15][3] = 2746;
            this.field2319[10][2] = 2586;
            this.field2319[11][2] = 3148;
            this.field2319[15][1] = 2377;
            this.field2319[12][2] = 3710;
            this.field2319[13][2] = 3421;
            this.field2319[14][2] = 3148;
            this.field2319[15][2] = 2505;
        } else if (arg1 == 6) {
            this.field2319 = new int[4][4];
            this.field2319[0][0] = 2048;
            this.field2319[0][1] = 0;
            this.field2319[0][2] = 4096;
            this.field2319[0][3] = 0;
            this.field2319[1][2] = 4096;
            this.field2319[2][2] = 4096;
            this.field2319[1][1] = 4096;
            this.field2319[1][0] = 2867;
            this.field2319[2][1] = 4096;
            this.field2319[3][1] = 4096;
            this.field2319[1][3] = 0;
            this.field2319[2][3] = 0;
            this.field2319[3][2] = 0;
            this.field2319[2][0] = 3276;
            this.field2319[3][0] = 4096;
            this.field2319[3][3] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[[I", line = 563)
    public final int[][] method391(int arg0, boolean arg1) {
        field2326++;
        if (!arg1) {
            this.field2321 = (int[]) null;
        }
        int[][] var3 = this.field4942.method10((byte) -125, arg0);
        if (this.field4942.field30) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class261.field4405; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2321[var9];
                var6[var8] = class343.method2418(16711680, var10) >> 12;
                var5[var8] = class343.method2418(var10, 65280) >> 4;
                var7[var8] = class343.method2418(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(II)V", line = 611)
    public static final void method1097(int arg0, int arg1) {
        field2318++;
        class354 var2 = (class354) class329.field5229.method1268(arg0 + 14000, (long) arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field5617.length; var3++) {
            var2.field5617[var3] = -1;
            var2.field5622[var3] = 0;
        }
        if (arg0 != -14113) {
            method1095(20, -32, 1, 105, (class161) null, (class161) null, 54, 90, -48, -36, -69L);
        }
    }
}
