import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class206 extends class189 {

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
    public static int field4054 = 1;

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "I")
    public static int field4056 = 0;

    @OriginalMember(owner = "client!wh", name = "nb", descriptor = "Lch;")
    public static class29 field4058 = new class29(100);

    @OriginalMember(owner = "client!wh", name = "rb", descriptor = "[I")
    public static int[] field4062 = new int[100];

    @OriginalMember(owner = "client!wh", name = "qb", descriptor = "Lgg;")
    public static class63 field4061 = class116.method911(43, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!wh", name = "ob", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!wh", name = "pb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wh", name = "sb", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "Lcf;")
    public static class27 field4053;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "[[I")
    private int[][] field4052;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class206() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 > 32) {
            ++field4051;
            if (~arg0 == -1) {
                int var4 = arg2.method64(31790);
                if (var4 != 0) {
                    this.method1356(var4, 0);
                } else {
                    this.field4052 = new int[arg2.method64(31790)][4];
                    for (int var5 = 0; ~var5 > ~this.field4052.length; ++var5) {
                        this.field4052[var5][0] = arg2.method46((byte) 65);
                        this.field4052[var5][1] = arg2.method64(31790) << 4;
                        this.field4052[var5][2] = arg2.method64(31790) << 4;
                        this.field4052[var5][3] = arg2.method64(31790) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lff;IIIIIII)V")
    public static final void method1354(class54 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class9.field208) {
            class26.field584 = 0;
        } else {
            class26.field584 = 32;
        }
        class9.field208 = false;
        if (arg1 == 541) {
            ++field4055;
            if (class168.field3471 != 0) {
                if (arg3 >= arg7 && arg7 + 16 > arg3 && arg2 >= arg6 && ~(arg6 + 16) < ~arg2) {
                    arg0.field1405 -= 4;
                    class113.method901(0, arg0);
                } else if (arg3 >= arg7 && arg3 < arg7 + 16 && arg2 >= arg6 + -16 - -arg5 && ~arg2 > ~(arg6 - -arg5)) {
                    arg0.field1405 += 4;
                    class113.method901(0, arg0);
                } else if (-class26.field584 + arg7 <= arg3 && arg3 < arg7 + 16 - -class26.field584 && ~(arg6 - -16) >= ~arg2 && ~arg2 > ~(arg6 - -arg5 + -16)) {
                    int var8 = (arg5 + -32) * arg5 / arg4;
                    if (~var8 > -9) {
                        var8 = 8;
                    }
                    int var9 = arg2 + -16 + -(var8 / 2) + -arg6;
                    int var10 = arg5 + -32 + -var8;
                    arg0.field1405 = (-arg5 + arg4) * var9 / var10;
                    class113.method901(0, arg0);
                    class9.field208 = true;
                }
            }
            if (~class164.field3384 != -1) {
                int var11 = arg0.field1302;
                if (~(-var11 + arg7) >= ~arg3 && ~arg6 >= ~arg2 && arg7 + 16 > arg3 && ~arg2 >= ~(arg5 + arg6)) {
                    arg0.field1405 += class164.field3384 * 45;
                    class113.method901(0, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field4059;
        if (this.field4052 == null) {
            this.method1356(1, 0);
        }
        if (!arg0) {
            this.method84(true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1355(Throwable arg0, int arg1) throws IOException {
        ++field4060;
        String var2;
        if (!(arg0 instanceof class35)) {
            var2 = "";
        } else {
            class35 var3 = (class35) arg0;
            arg0 = var3.field816;
            var2 = var3.field827 + " | ";
        }
        int var4 = 70 % ((arg1 - -9) / 34);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg0.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var2 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (~var14 <= -1) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(1 + var16.lastIndexOf(32));
                String var18 = var17.substring(1 + var17.lastIndexOf(9));
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        if (arg1 <= 34) {
            return null;
        } else {
            ++field4063;
            int[][] var3 = super.field3808.method237(-1, arg0);
            if (super.field3808.field561) {
                int var4 = this.field4052.length;
                int[] var5 = this.method1245(0, arg0, 11433);
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                int[] var8 = var3[1];
                if (var4 > 0) {
                    for (int var9 = 0; class54.field1430 > var9; ++var9) {
                        int var10 = 0;
                        int var11 = var5[var9];
                        for (int var12 = 0; var12 < var4 && var11 >= this.field4052[var12][0]; ++var12) {
                            ++var10;
                        }
                        if (var10 >= var4) {
                            int[] var13 = this.field4052[var4 + -1];
                            var6[var9] = var13[1];
                            var8[var9] = var13[2];
                            var7[var9] = var13[3];
                        } else {
                            int[] var14 = this.field4052[var10];
                            if (var10 > 0) {
                                int[] var15 = this.field4052[var10 - 1];
                                int var16 = (-var15[0] + var11 << 12) / (var14[0] + -var15[0]);
                                int var17 = 4096 - var16;
                                var6[var9] = var14[1] * var16 + var15[1] * var17 >> 12;
                                var8[var9] = var14[2] * var16 - -(var15[2] * var17) >> 12;
                                var7[var9] = var14[3] * var16 - -(var15[3] * var17) >> 12;
                            } else {
                                var6[var9] = var14[1];
                                var8[var9] = var14[2];
                                var7[var9] = var14[3];
                            }
                        }
                    }
                } else {
                    for (int var18 = 0; class54.field1430 > var18; ++var18) {
                        var6[var18] = 0;
                        var8[var18] = 0;
                        var7[var18] = 0;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)V")
    private final void method1356(int arg0, int arg1) {
        ++field4057;
        if (arg0 != arg1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field4052 = new int[4][4];
                                    this.field4052[0][3] = 0;
                                    this.field4052[0][1] = 0;
                                    this.field4052[0][0] = 2048;
                                    this.field4052[1][1] = 4096;
                                    this.field4052[2][1] = 4096;
                                    this.field4052[1][0] = 2867;
                                    this.field4052[1][3] = 0;
                                    this.field4052[0][2] = 4096;
                                    this.field4052[3][1] = 4096;
                                    this.field4052[2][3] = 0;
                                    this.field4052[2][0] = 3276;
                                    this.field4052[1][2] = 4096;
                                    this.field4052[3][3] = 0;
                                    this.field4052[3][0] = 4096;
                                    this.field4052[2][2] = 4096;
                                    this.field4052[3][2] = 0;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field4052 = new int[16][4];
                                this.field4052[0][2] = 192;
                                this.field4052[0][3] = 321;
                                this.field4052[0][0] = 0;
                                this.field4052[1][3] = 562;
                                this.field4052[2][3] = 803;
                                this.field4052[3][3] = 1140;
                                this.field4052[1][2] = 449;
                                this.field4052[4][3] = 1509;
                                this.field4052[2][2] = 690;
                                this.field4052[1][0] = 155;
                                this.field4052[3][2] = 995;
                                this.field4052[5][3] = 1413;
                                this.field4052[4][2] = 1397;
                                this.field4052[0][1] = 80;
                                this.field4052[2][0] = 389;
                                this.field4052[1][1] = 321;
                                this.field4052[2][1] = 578;
                                this.field4052[5][2] = 1429;
                                this.field4052[3][0] = 671;
                                this.field4052[4][0] = 897;
                                this.field4052[6][2] = 1461;
                                this.field4052[7][2] = 1525;
                                this.field4052[8][2] = 1590;
                                this.field4052[9][2] = 2056;
                                this.field4052[5][0] = 1175;
                                this.field4052[6][3] = 1333;
                                this.field4052[10][2] = 2586;
                                this.field4052[11][2] = 3148;
                                this.field4052[3][1] = 947;
                                this.field4052[4][1] = 1285;
                                this.field4052[12][2] = 3710;
                                this.field4052[7][3] = 1702;
                                this.field4052[8][3] = 2056;
                                this.field4052[6][0] = 1368;
                                this.field4052[5][1] = 1525;
                                this.field4052[7][0] = 1507;
                                this.field4052[8][0] = 1736;
                                this.field4052[13][2] = 3421;
                                this.field4052[6][1] = 1734;
                                this.field4052[7][1] = 1413;
                                this.field4052[8][1] = 1108;
                                this.field4052[9][0] = 2088;
                                this.field4052[14][2] = 3148;
                                this.field4052[9][1] = 1766;
                                this.field4052[10][0] = 2355;
                                this.field4052[10][1] = 2409;
                                this.field4052[15][2] = 2505;
                                this.field4052[11][1] = 3116;
                                this.field4052[12][1] = 3806;
                                this.field4052[9][3] = 2666;
                                this.field4052[10][3] = 3276;
                                this.field4052[11][0] = 2691;
                                this.field4052[13][1] = 3437;
                                this.field4052[12][0] = 3031;
                                this.field4052[11][3] = 3228;
                                this.field4052[13][0] = 3522;
                                this.field4052[12][3] = 3196;
                                this.field4052[14][1] = 3116;
                                this.field4052[13][3] = 3019;
                                this.field4052[14][0] = 3727;
                                this.field4052[14][3] = 3228;
                                this.field4052[15][3] = 2746;
                                this.field4052[15][0] = 4096;
                                this.field4052[15][1] = 2377;
                            }
                        } else {
                            this.field4052 = new int[6][4];
                            this.field4052[0][1] = 0;
                            this.field4052[0][0] = 0;
                            this.field4052[0][2] = 0;
                            this.field4052[1][2] = 0;
                            this.field4052[2][2] = 0;
                            this.field4052[0][3] = 0;
                            this.field4052[1][0] = 1843;
                            this.field4052[1][1] = 0;
                            this.field4052[2][0] = 2457;
                            this.field4052[1][3] = 1493;
                            this.field4052[2][3] = 2939;
                            this.field4052[2][1] = 0;
                            this.field4052[3][0] = 2781;
                            this.field4052[3][2] = 1124;
                            this.field4052[3][3] = 3565;
                            this.field4052[4][2] = 3084;
                            this.field4052[3][1] = 0;
                            this.field4052[4][0] = 3481;
                            this.field4052[5][2] = 4096;
                            this.field4052[4][3] = 4031;
                            this.field4052[4][1] = 546;
                            this.field4052[5][1] = 4096;
                            this.field4052[5][0] = 4096;
                            this.field4052[5][3] = 4096;
                        }
                    } else {
                        this.field4052 = new int[7][4];
                        this.field4052[0][1] = 0;
                        this.field4052[0][3] = 4096;
                        this.field4052[0][0] = 0;
                        this.field4052[1][3] = 4096;
                        this.field4052[1][0] = 663;
                        this.field4052[0][2] = 0;
                        this.field4052[2][3] = 0;
                        this.field4052[1][2] = 4096;
                        this.field4052[3][3] = 0;
                        this.field4052[1][1] = 0;
                        this.field4052[4][3] = 0;
                        this.field4052[2][0] = 1363;
                        this.field4052[5][3] = 4096;
                        this.field4052[2][2] = 4096;
                        this.field4052[6][3] = 4096;
                        this.field4052[3][2] = 4096;
                        this.field4052[3][0] = 2048;
                        this.field4052[4][0] = 2727;
                        this.field4052[4][2] = 0;
                        this.field4052[2][1] = 0;
                        this.field4052[5][2] = 0;
                        this.field4052[5][0] = 3411;
                        this.field4052[6][0] = 4096;
                        this.field4052[3][1] = 4096;
                        this.field4052[4][1] = 4096;
                        this.field4052[6][2] = 0;
                        this.field4052[5][1] = 4096;
                        this.field4052[6][1] = 0;
                    }
                } else {
                    this.field4052 = new int[8][4];
                    this.field4052[0][2] = 2602;
                    this.field4052[0][0] = 0;
                    this.field4052[1][0] = 2867;
                    this.field4052[1][2] = 1799;
                    this.field4052[2][0] = 3072;
                    this.field4052[0][1] = 2650;
                    this.field4052[0][3] = 2361;
                    this.field4052[1][1] = 2313;
                    this.field4052[3][0] = 3276;
                    this.field4052[4][0] = 3481;
                    this.field4052[2][2] = 1734;
                    this.field4052[1][3] = 1558;
                    this.field4052[2][3] = 1413;
                    this.field4052[5][0] = 3686;
                    this.field4052[3][3] = 947;
                    this.field4052[6][0] = 3891;
                    this.field4052[7][0] = 4096;
                    this.field4052[2][1] = 2618;
                    this.field4052[4][3] = 722;
                    this.field4052[3][2] = 1220;
                    this.field4052[5][3] = 1766;
                    this.field4052[3][1] = 2296;
                    this.field4052[4][2] = 963;
                    this.field4052[4][1] = 2072;
                    this.field4052[6][3] = 915;
                    this.field4052[5][2] = 2152;
                    this.field4052[6][2] = 1060;
                    this.field4052[5][1] = 2730;
                    this.field4052[6][1] = 2232;
                    this.field4052[7][2] = 1413;
                    this.field4052[7][1] = 1686;
                    this.field4052[7][3] = 1140;
                }
            } else {
                this.field4052 = new int[2][4];
                this.field4052[0][2] = 0;
                this.field4052[0][0] = 0;
                this.field4052[0][1] = 0;
                this.field4052[0][3] = 0;
                this.field4052[1][0] = 4096;
                this.field4052[1][2] = 4096;
                this.field4052[1][3] = 4096;
                this.field4052[1][1] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field4062 = null;
        field4061 = null;
        if (arg0 == 28123) {
            field4053 = null;
            field4058 = null;
        }
    }
}
