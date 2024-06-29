import java.awt.Canvas;
import java.io.DataInputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class181 extends class214 {

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
    private int[] field2630 = new int[257];

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2623 = "";

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field2624 = new String[100];

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field2629 = 1;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Lfn;")
    public static class52 field2619 = new class52(86, -2);

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lbr;")
    public static class416 field2632;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field2637;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field2638;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field2639;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
    public static int[] field2625;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "[[I")
    private int[][] field2628;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field2618;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            this.method15((class425) null, 25, -56);
        }
        if (super.field3030.field6644) {
            int[] var4 = this.method1352(arg0, 0, arg1 + -149);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class399.field5585 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2630[var9];
                var5[var8] = class347.method2074(var10, 16711680) >> 12;
                var6[var8] = class347.method2074(4080, var10 >> 4);
                var7[var8] = class347.method2074(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
    private final void method1184(int arg0, int arg1) {
        ++field2617;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field2628 = new int[4][4];
                                this.field2628[0][3] = 0;
                                this.field2628[0][2] = 4096;
                                this.field2628[0][0] = 2048;
                                this.field2628[0][1] = 0;
                                this.field2628[1][0] = 2867;
                                this.field2628[1][1] = 4096;
                                this.field2628[1][3] = 0;
                                this.field2628[1][2] = 4096;
                                this.field2628[2][2] = 4096;
                                this.field2628[2][1] = 4096;
                                this.field2628[2][3] = 0;
                                this.field2628[2][0] = 3276;
                                this.field2628[3][1] = 4096;
                                this.field2628[3][2] = 0;
                                this.field2628[3][3] = 0;
                                this.field2628[3][0] = 4096;
                            } else {
                                this.field2628 = new int[16][4];
                                this.field2628[0][1] = 80;
                                this.field2628[0][2] = 192;
                                this.field2628[0][0] = 0;
                                this.field2628[0][3] = 321;
                                this.field2628[1][1] = 321;
                                this.field2628[1][3] = 562;
                                this.field2628[1][2] = 449;
                                this.field2628[1][0] = 155;
                                this.field2628[2][0] = 389;
                                this.field2628[2][2] = 690;
                                this.field2628[2][1] = 578;
                                this.field2628[2][3] = 803;
                                this.field2628[3][0] = 671;
                                this.field2628[3][2] = 995;
                                this.field2628[3][3] = 1140;
                                this.field2628[3][1] = 947;
                                this.field2628[4][1] = 1285;
                                this.field2628[4][0] = 897;
                                this.field2628[4][2] = 1397;
                                this.field2628[4][3] = 1509;
                                this.field2628[5][0] = 1175;
                                this.field2628[5][1] = 1525;
                                this.field2628[5][2] = 1429;
                                this.field2628[5][3] = 1413;
                                this.field2628[6][2] = 1461;
                                this.field2628[6][0] = 1368;
                                this.field2628[6][1] = 1734;
                                this.field2628[6][3] = 1333;
                                this.field2628[7][3] = 1702;
                                this.field2628[7][2] = 1525;
                                this.field2628[7][0] = 1507;
                                this.field2628[7][1] = 1413;
                                this.field2628[8][1] = 1108;
                                this.field2628[8][0] = 1736;
                                this.field2628[8][2] = 1590;
                                this.field2628[8][3] = 2056;
                                this.field2628[9][3] = 2666;
                                this.field2628[9][2] = 2056;
                                this.field2628[9][1] = 1766;
                                this.field2628[9][0] = 2088;
                                this.field2628[10][3] = 3276;
                                this.field2628[10][1] = 2409;
                                this.field2628[10][0] = 2355;
                                this.field2628[10][2] = 2586;
                                this.field2628[11][2] = 3148;
                                this.field2628[11][3] = 3228;
                                this.field2628[11][1] = 3116;
                                this.field2628[11][0] = 2691;
                                this.field2628[12][2] = 3710;
                                this.field2628[12][0] = 3031;
                                this.field2628[12][3] = 3196;
                                this.field2628[12][1] = 3806;
                                this.field2628[13][1] = 3437;
                                this.field2628[13][3] = 3019;
                                this.field2628[13][2] = 3421;
                                this.field2628[13][0] = 3522;
                                this.field2628[14][2] = 3148;
                                this.field2628[14][1] = 3116;
                                this.field2628[14][0] = 3727;
                                this.field2628[14][3] = 3228;
                                this.field2628[15][2] = 2505;
                                this.field2628[15][3] = 2746;
                                this.field2628[15][1] = 2377;
                                this.field2628[15][0] = 4096;
                            }
                        } else {
                            this.field2628 = new int[6][4];
                            this.field2628[0][0] = 0;
                            this.field2628[0][3] = 0;
                            this.field2628[0][1] = 0;
                            this.field2628[0][2] = 0;
                            this.field2628[1][2] = 0;
                            this.field2628[1][3] = 1493;
                            this.field2628[1][0] = 1843;
                            this.field2628[1][1] = 0;
                            this.field2628[2][3] = 2939;
                            this.field2628[2][1] = 0;
                            this.field2628[2][0] = 2457;
                            this.field2628[2][2] = 0;
                            this.field2628[3][2] = 1124;
                            this.field2628[3][1] = 0;
                            this.field2628[3][3] = 3565;
                            this.field2628[3][0] = 2781;
                            this.field2628[4][3] = 4031;
                            this.field2628[4][1] = 546;
                            this.field2628[4][0] = 3481;
                            this.field2628[4][2] = 3084;
                            this.field2628[5][2] = 4096;
                            this.field2628[5][0] = 4096;
                            this.field2628[5][1] = 4096;
                            this.field2628[5][3] = 4096;
                        }
                    } else {
                        this.field2628 = new int[7][4];
                        this.field2628[0][3] = 4096;
                        this.field2628[0][2] = 0;
                        this.field2628[0][0] = 0;
                        this.field2628[0][1] = 0;
                        this.field2628[1][1] = 0;
                        this.field2628[1][0] = 663;
                        this.field2628[1][3] = 4096;
                        this.field2628[1][2] = 4096;
                        this.field2628[2][0] = 1363;
                        this.field2628[2][2] = 4096;
                        this.field2628[2][1] = 0;
                        this.field2628[2][3] = 0;
                        this.field2628[3][2] = 4096;
                        this.field2628[3][0] = 2048;
                        this.field2628[3][3] = 0;
                        this.field2628[3][1] = 4096;
                        this.field2628[4][0] = 2727;
                        this.field2628[4][1] = 4096;
                        this.field2628[4][3] = 0;
                        this.field2628[4][2] = 0;
                        this.field2628[5][0] = 3411;
                        this.field2628[5][2] = 0;
                        this.field2628[5][1] = 4096;
                        this.field2628[5][3] = 4096;
                        this.field2628[6][0] = 4096;
                        this.field2628[6][1] = 0;
                        this.field2628[6][2] = 0;
                        this.field2628[6][3] = 4096;
                    }
                } else {
                    this.field2628 = new int[8][4];
                    this.field2628[0][3] = 2361;
                    this.field2628[0][1] = 2650;
                    this.field2628[0][0] = 0;
                    this.field2628[0][2] = 2602;
                    this.field2628[1][3] = 1558;
                    this.field2628[1][2] = 1799;
                    this.field2628[1][1] = 2313;
                    this.field2628[1][0] = 2867;
                    this.field2628[2][0] = 3072;
                    this.field2628[2][1] = 2618;
                    this.field2628[2][3] = 1413;
                    this.field2628[2][2] = 1734;
                    this.field2628[3][0] = 3276;
                    this.field2628[3][2] = 1220;
                    this.field2628[3][1] = 2296;
                    this.field2628[3][3] = 947;
                    this.field2628[4][2] = 963;
                    this.field2628[4][3] = 722;
                    this.field2628[4][0] = 3481;
                    this.field2628[4][1] = 2072;
                    this.field2628[5][0] = 3686;
                    this.field2628[5][2] = 2152;
                    this.field2628[5][1] = 2730;
                    this.field2628[5][3] = 1766;
                    this.field2628[6][1] = 2232;
                    this.field2628[6][3] = 915;
                    this.field2628[6][2] = 1060;
                    this.field2628[6][0] = 3891;
                    this.field2628[7][0] = 4096;
                    this.field2628[7][2] = 1413;
                    this.field2628[7][3] = 1140;
                    this.field2628[7][1] = 1686;
                }
            } else {
                this.field2628 = new int[2][4];
                this.field2628[0][3] = 0;
                this.field2628[0][0] = 0;
                this.field2628[0][1] = 0;
                this.field2628[0][2] = 0;
                this.field2628[1][0] = 4096;
                this.field2628[1][1] = 4096;
                this.field2628[1][2] = 4096;
                this.field2628[1][3] = 4096;
            }
        }
        if (arg0 != 14463) {
            this.field2630 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILbc;BLdq;Ljava/awt/Canvas;)Lkm;")
    public static final class487 method1185(int arg0, int arg1, class187 arg2, byte arg3, class14 arg4, Canvas arg5) {
        ++field2621;
        if (arg3 != 63) {
            field2626 = -17;
        }
        try {
            Class var6 = Class.forName("qi");
            Constructor var7 = var6.getConstructor(field2637 != null ? field2637 : (field2637 = method1193("java.awt.Canvas")), field2638 != null ? field2638 : (field2638 = method1193("bc")), Integer.TYPE, Integer.TYPE, field2639 != null ? field2639 : (field2639 = method1193("dq")));
            return (class487) var7.newInstance(arg5, arg2, new Integer(arg0), new Integer(arg1), arg4);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    private final void method1186(int arg0) {
        ++field2627;
        if (arg0 <= 97) {
            this.field2628 = null;
        }
        int var2 = this.field2628.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field2628[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (~var2 < ~var4) {
                    int[] var7 = this.field2628[var4];
                    if (~var4 < -1) {
                        int[] var8 = this.field2628[var4 - 1];
                        int var9 = (var5 - var8[0] << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                        var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var13 = var7[2];
                        var12 = var7[1];
                        var11 = var7[3];
                    }
                } else {
                    int[] var14 = this.field2628[var2 - 1];
                    var12 = var14[1];
                    var11 = var14[3];
                    var13 = var14[2];
                }
                int var15 = var13 >> 4;
                int var16 = var12 >> 4;
                int var17 = var11 >> 4;
                if (var17 >= 0) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field2630[var3] = class366.method2215(class366.method2215(var15 << 8, var16 << 16), var17);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public static final void method1187(int arg0) {
        ++field2622;
        if (arg0 > 95) {
            for (class229 var1 = (class229) class346.field4724.method1544(-105); var1 != null; var1 = (class229) class346.field4724.method1546((byte) -42)) {
                class233 var2 = var1.field3237;
                if (!var2.field3305) {
                    if (~var2.field3304 >= ~class356.field4972) {
                        var2.method1468(class42.field717, false);
                        if (var2.field3305) {
                            var1.method1182(28818);
                        } else {
                            class249.method1542(var2, true);
                        }
                    }
                } else {
                    var1.method1182(28818);
                    var2.method1465(68);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method2503(true);
            if (~var4 == -1) {
                this.field2628 = new int[arg0.method2503(true)][4];
                for (int var5 = 0; ~var5 > ~this.field2628.length; ++var5) {
                    this.field2628[var5][0] = arg0.method2508(true);
                    this.field2628[var5][1] = arg0.method2503(true) << 4;
                    this.field2628[var5][2] = arg0.method2503(true) << 4;
                    this.field2628[var5][3] = arg0.method2503(true) << 4;
                }
            } else {
                this.method1184(14463, var4);
            }
        }
        ++field2636;
        if (arg1 > -114) {
            field2619 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static final void method1188(byte arg0) {
        if (arg0 == 78) {
            ++field2635;
            if (class96.field1373 != class280.field3859) {
                try {
                    class207.method1299(class334.field4582, 19639, "tbrefresh");
                } catch (Throwable var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(CI)Z")
    public static final boolean method1189(char arg0, int arg1) {
        ++field2620;
        if (arg1 > -25) {
            field2619 = null;
        }
        return ~arg0 <= -66 && ~arg0 >= -91 || ~arg0 <= -98 && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1190(byte arg0, String arg1, Throwable arg2) {
        ++field2634;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class378.method2252(arg2, -83);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class200.method1274(var3, true);
            String var4 = class163.method995(var3, (byte) 60, ":", "%3a");
            String var5 = class163.method995(var4, (byte) 105, "@", "%40");
            String var6 = class163.method995(var5, (byte) -105, "&", "%26");
            String var7 = class163.method995(var6, (byte) -64, "#", "%23");
            if (class133.field1876.field234 != null) {
                class420 var8 = class133.field1876.method127(new URL(class133.field1876.field234.getCodeBase(), "clienterror.ws?c=" + class248.field3486 + "&u=" + class79.field1203 + "&v1=" + class14.field221 + "&v2=" + class14.field220 + "&e=" + var7), (byte) 105);
                while (~var8.field5789 == -1) {
                    class258.method1603(-649, 1L);
                }
                if (var8.field5789 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field5791;
                    var9.read();
                    var9.close();
                }
                int var10 = 50 % ((66 - arg0) / 50);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        if (this.field2628 == null) {
            this.method1184(arg0 ^ 20891, 1);
        }
        ++field2631;
        if (arg0 == 27108) {
            this.method1186(arg0 + -26997);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class181() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public static void method1191(int arg0) {
        if (arg0 != 28931) {
            field2626 = -106;
        }
        field2619 = null;
        field2623 = null;
        field2624 = null;
        field2625 = null;
        field2632 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IB)V")
    public static final void method1192(int arg0, byte arg1) {
        if (arg1 <= 1) {
            field2626 = 55;
        }
        ++field2633;
        class265 var2 = class440.method2554(arg0, 2, 8);
        var2.method1677(21748);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1193(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
