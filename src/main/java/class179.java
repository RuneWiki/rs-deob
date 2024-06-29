import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class179 extends class326 {

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2905 = "wave:";

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2913 = "Loaded wordpack";

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "Lrm;")
    public static class184 field2911 = new class184(200);

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2919 = "Discard";

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2907;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "[Ldi;")
    private class51[] field2903;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[[I)V", line = 7)
    private final void method1320(int arg0, int[][] arg1) {
        int var3 = class302.field4637;
        if (arg0 > -5) {
            return;
        }
        int var4 = class166.field2731;
        field2908++;
        class317.method2222(arg1, 500);
        class187.method1375(0, (byte) -98, 0, class215.field3397, class29.field427);
        if (this.field2903 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2903.length; var5++) {
            class51 var6 = this.field2903[var5];
            int var7 = var6.field652;
            int var8 = var6.field647;
            if (var8 < 0) {
                if (var7 >= 0) {
                    var6.method234((byte) -86, var3, var4);
                }
            } else if (var7 < 0) {
                var6.method230(118, var3, var4);
            } else {
                var6.method229(var3, 0, var4);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLvl;)V", line = 62)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg0 == 0) {
            this.field2903 = new class51[arg2.method58(-288140008)];
            for (int var4 = 0; var4 < this.field2903.length; var4++) {
                int var5 = arg2.method58(-288140008);
                if (var5 == 0) {
                    this.field2903[var4] = class263.method1886(22300, arg2);
                } else if (var5 == 1) {
                    this.field2903[var4] = class30.method273(arg2, false);
                } else if (var5 == 2) {
                    this.field2903[var4] = class58.method469(-64, arg2);
                } else if (var5 == 3) {
                    this.field2903[var4] = class68.method540(80, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field5121 = arg2.method58(-288140008) == 1;
        }
        if (!arg1) {
            field2916++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[[I", line = 146)
    public final int[][] method253(int arg0, byte arg1) {
        int var3 = 38 % ((60 - arg1) / 51);
        field2906++;
        int[][] var4 = this.field5104.method2365((byte) -82, arg0);
        if (this.field5104.field5325) {
            int var5 = class166.field2731;
            int var6 = class302.field4637;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field5104.method2366(-501);
            this.method1320(-115, var7);
            for (int var9 = 0; var9 < class302.field4637; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[2];
                int[] var13 = var11[1];
                int[] var14 = var11[0];
                for (int var15 = 0; var15 < class166.field2731; var15++) {
                    int var16 = var10[var15];
                    var12[var15] = class333.method2319(var16, 255) << 4;
                    var13[var15] = class333.method2319(var16 >> 4, 4080);
                    var14[var15] = class333.method2319(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 206)
    public static final void method1321(int arg0) {
        field2915++;
        if (class124.field1797 == 0 || class124.field1797 == 5) {
            return;
        }
        try {
            if ((++class156.field2415) > 2000) {
                if (class275.field4247 != null) {
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                }
                if (class343.field5328 >= 1) {
                    class124.field1797 = 0;
                    class91.field1216 = -5;
                    return;
                }
                class343.field5328++;
                if (class334.field5197 == class277.field4286) {
                    class277.field4286 = class21.field316;
                } else {
                    class277.field4286 = class334.field5197;
                }
                class156.field2415 = 0;
                class124.field1797 = 1;
            }
            if (class124.field1797 == 1) {
                class1.field7 = class42.field581.method1011(class9.field170, class277.field4286, (byte) -8);
                class124.field1797 = 2;
            }
            if (class124.field1797 == 2) {
                if (class1.field7.field1595 == 2) {
                    throw new IOException();
                }
                if (class1.field7.field1595 != 1) {
                    return;
                }
                class275.field4247 = new class22((Socket) class1.field7.field1591, class42.field581);
                class1.field7 = null;
                long var1 = class237.field3718 = class83.method608(class336.field5243, (byte) -126);
                class183.field2965.field111 = 0;
                class183.field2965.method81((byte) -112, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class183.field2965.method81((byte) -118, var3);
                class275.field4247.method221(120, class183.field2965.field115, 0, 2);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(arg0 ^ 0xFFFF9A6F);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(arg0 - 26179);
                }
                int var4 = class275.field4247.method214((byte) 83);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(106);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(97);
                }
                if (var4 != 0) {
                    class91.field1216 = var4;
                    class124.field1797 = 0;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    return;
                }
                class124.field1797 = 3;
            }
            if (class124.field1797 == 3) {
                if (class275.field4247.method217(30000) < 8) {
                    return;
                }
                class275.field4247.method219(8, 0, class111.field1544.field115, (byte) 24);
                class111.field1544.field111 = 0;
                class130.field1916 = class111.field1544.method37(-1513731168);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, (int) (class130.field1916 >> 32), (int) class130.field1916 };
                class183.field2965.field111 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class183.field2965.method81((byte) -111, 10);
                class183.field2965.method34(var5[0], 294335144);
                class183.field2965.method34(var5[1], 294335144);
                class183.field2965.method34(var5[2], 294335144);
                class183.field2965.method34(var5[3], 294335144);
                class183.field2965.method53((byte) 112, class83.method608(class336.field5243, (byte) 62));
                class183.field2965.method48(128, class181.field2940);
                class183.field2965.method76(class80.field1087, class95.field1257, -71);
                class261.field4100.field111 = 0;
                if (class105.field1388 == 40) {
                    class261.field4100.method81((byte) -117, 18);
                } else {
                    class261.field4100.method81((byte) -125, 16);
                }
                class261.field4100.method65((byte) -9, class183.field2965.field111 + class159.method1182(class315.field4933, 109) + 163);
                class261.field4100.method34(536, 294335144);
                class261.field4100.method81((byte) -115, class254.field4016);
                class261.field4100.method81((byte) -122, class62.field914 ? 1 : 0);
                class261.field4100.method81((byte) -100, 1);
                class261.field4100.method81((byte) -116, class113.method800((byte) -10));
                class261.field4100.method65((byte) -9, class127.field1841);
                class261.field4100.method65((byte) -9, class95.field1258);
                class261.field4100.method81((byte) -121, class196.field3127);
                class95.method679(class261.field4100, -77);
                class261.field4100.method48(arg0 - 25935, class315.field4933);
                class261.field4100.method34(class105.field1393, 294335144);
                class261.field4100.method34(class136.method1003(0), 294335144);
                class129.field1892 = true;
                class261.field4100.method65((byte) -9, class246.field3841);
                class261.field4100.method34(class145.field2293.method1814(106), arg0 ^ 0x118B5767);
                class261.field4100.method34(class78.field1051.method1814(125), 294335144);
                class261.field4100.method34(class160.field2542.method1814(127), 294335144);
                class261.field4100.method34(class237.field3716.method1814(110), arg0 ^ 0x118B5767);
                class261.field4100.method34(class18.field301.method1814(108), 294335144);
                class261.field4100.method34(class290.field4476.method1814(arg0 - 25950), arg0 ^ 0x118B5767);
                class261.field4100.method34(class249.field3913.method1814(92), 294335144);
                class261.field4100.method34(class171.field2826.method1814(arg0 ^ 0x65A3), 294335144);
                class261.field4100.method34(class256.field4042.method1814(arg0 - 25945), 294335144);
                class261.field4100.method34(class119.field1657.method1814(103), 294335144);
                class261.field4100.method34(class138.field2208.method1814(96), arg0 ^ 0x118B5767);
                class261.field4100.method34(class175.field2873.method1814(102), 294335144);
                class261.field4100.method34(class206.field3258.method1814(124), 294335144);
                class261.field4100.method34(class18.field285.method1814(123), 294335144);
                class261.field4100.method34(class198.field3162.method1814(105), arg0 ^ 0x118B5767);
                class261.field4100.method34(class156.field2419.method1814(arg0 - 25951), arg0 + 294309081);
                class261.field4100.method34(class128.field1888.method1814(123), 294335144);
                class261.field4100.method34(class202.field3216.method1814(95), 294335144);
                class261.field4100.method34(class205.field3249.method1814(103), arg0 + 294309081);
                class261.field4100.method34(class62.field915.method1814(95), 294335144);
                class261.field4100.method34(class339.field5295.method1814(126), 294335144);
                class261.field4100.method34(class237.field3719.method1814(118), 294335144);
                class261.field4100.method34(class221.field3495.method1814(91), 294335144);
                class261.field4100.method34(class23.field354.method1814(116), arg0 ^ 0x118B5767);
                class261.field4100.method34(class4.field41.method1814(125), arg0 + 294309081);
                class261.field4100.method34(class286.field4425.method1814(115), 294335144);
                class261.field4100.method34(class15.field255.method1814(127), 294335144);
                class261.field4100.method34(class212.field3345.method1814(arg0 ^ 0x65BD), 294335144);
                class261.field4100.method34(class205.field3251.method1814(99), arg0 + 294309081);
                class261.field4100.method67(class183.field2965.field111, 0, (byte) -126, class183.field2965.field115);
                class275.field4247.method221(-86, class261.field4100.field115, 0, class261.field4100.field111);
                class183.field2965.method1949(var5, (byte) -38);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class111.field1544.method1949(var5, (byte) -47);
                class124.field1797 = 4;
            }
            if (class124.field1797 == 4) {
                if (class275.field4247.method217(30000) < 1) {
                    return;
                }
                int var7 = class275.field4247.method214((byte) 83);
                if (var7 == 21) {
                    class124.field1797 = 7;
                } else if (var7 == 29) {
                    class124.field1797 = 10;
                } else if (var7 == 1) {
                    class124.field1797 = 5;
                    class91.field1216 = var7;
                    return;
                } else if (var7 == 2) {
                    class124.field1797 = 8;
                } else if (var7 == 15) {
                    class124.field1797 = 0;
                    class91.field1216 = var7;
                    return;
                } else if (var7 == 23 && class343.field5328 < 1) {
                    class156.field2415 = 0;
                    class343.field5328++;
                    class124.field1797 = 1;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    return;
                } else {
                    class124.field1797 = 0;
                    class91.field1216 = var7;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    return;
                }
            }
            if (class124.field1797 == 6) {
                class183.field2965.field111 = 0;
                class183.field2965.method1947((byte) 84, 17);
                class275.field4247.method221(-97, class183.field2965.field115, 0, class183.field2965.field111);
                class124.field1797 = 4;
                return;
            }
            if (class124.field1797 == 7) {
                if (class275.field4247.method217(30000) >= 1) {
                    class81.field1110 = (class275.field4247.method214((byte) 83) + 3) * 60;
                    class91.field1216 = 21;
                    class124.field1797 = 0;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    return;
                }
                return;
            }
            if (class124.field1797 == 10) {
                if (class275.field4247.method217(30000) < 1) {
                    return;
                }
                class135.field1981 = class275.field4247.method214((byte) 83);
                class91.field1216 = 29;
                class124.field1797 = 0;
                class275.field4247.method218(true);
                class275.field4247 = null;
                return;
            }
            if (class124.field1797 == 8) {
                if (class275.field4247.method217(30000) < 14) {
                    return;
                }
                class275.field4247.method219(14, 0, class111.field1544.field115, (byte) 24);
                class111.field1544.field111 = 0;
                client.field1905 = class111.field1544.method58(-288140008);
                class305.field4772 = class111.field1544.method58(-288140008);
                class336.field5241 = class111.field1544.method58(-288140008) == 1;
                class26.field392 = class111.field1544.method58(-288140008) == 1;
                class158.field2447 = class111.field1544.method58(-288140008) == 1;
                class83.field1136 = class111.field1544.method58(-288140008) == 1;
                class154.field2387 = class111.field1544.method58(-288140008) == 1;
                class92.field1231 = class111.field1544.method39((byte) 94);
                class47.field613 = class111.field1544.method58(arg0 - 288166071) == 1;
                class7.field156 = class111.field1544.method58(-288140008) == 1;
                class77.method578(class7.field156, -16711936);
                class326.method2288((byte) 14, class7.field156);
                if (!class62.field914) {
                    if ((!class336.field5241 || class158.field2447) && !class47.field613) {
                        try {
                            class209.method1531("unzap", arg0 - 26035, class42.field581.field2181);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class209.method1531("zap", 31, class42.field581.field2181);
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class209.method1531("loggedin", arg0 - 25948, class42.field581.field2181);
                } catch (Throwable var12) {
                }
                class30.field449 = class111.field1544.method1951(-92);
                class61.field899 = class111.field1544.method39((byte) 78);
                class124.field1797 = 9;
            }
            if (class124.field1797 == 9) {
                if (class275.field4247.method217(30000) >= class61.field899) {
                    class111.field1544.field111 = 0;
                    class275.field4247.method219(class61.field899, 0, class111.field1544.field115, (byte) 24);
                    class91.field1216 = 2;
                    class124.field1797 = 0;
                    class223.method1632(31932);
                    class78.field1052 = -1;
                    class213.method1557(false, 0);
                    class30.field449 = -1;
                    return;
                }
                return;
            }
            if (arg0 != 26063) {
                field2911 = (class184) null;
            }
        } catch (IOException var15) {
            if (class275.field4247 != null) {
                class275.field4247.method218(true);
                class275.field4247 = null;
            }
            if (class343.field5328 >= 1) {
                class91.field1216 = -4;
                class124.field1797 = 0;
            } else {
                class124.field1797 = 1;
                if (class334.field5197 == class277.field4286) {
                    class277.field4286 = class21.field316;
                } else {
                    class277.field4286 = class334.field5197;
                }
                class343.field5328++;
                class156.field2415 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V", line = 587)
    public static final void method1322(byte arg0, int arg1) {
        class10.field191.method1353(-1, arg1);
        field2912++;
        class317.field5015.method1353(-1, arg1);
        class231.field3604.method1353(-1, arg1);
        int var2 = 82 / ((arg0 + 81) / 33);
        class258.field4070.method1353(-1, arg1);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Z", line = 601)
    public static final boolean method1323(int arg0, int arg1) {
        field2914++;
        if (class36.field519 == arg0) {
            return false;
        }
        class339.field5298 = new int[arg1][13][13];
        class235.field3675 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class134.field1970[var2] = new class200(104, 104);
        }
        class304.field4750 = new class5[4][104][104];
        class134.field1969 = new byte[4][104][104];
        class214.field3376 = new byte[4][104][104];
        if (class109.field1458) {
            class176.method1304(4, 104, 104);
            class8.method118(104, 104);
            class215.field3396 = new class254[13][13];
        }
        class36.field519 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I", line = 640)
    public final int[] method103(int arg0, int arg1) {
        field2910++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (arg0 >= -25) {
            return (int[]) null;
        } else {
            if (this.field5112.field3583) {
                this.method1320(-86, this.field5112.method1650((byte) -68));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 666)
    public static void method1324(int arg0) {
        field2905 = null;
        field2911 = null;
        field2913 = null;
        field2919 = null;
        field2907 = null;
        if (arg0 != 4) {
            method1325(true, (long[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z[J[I)V", line = 680)
    public static final void method1325(boolean arg0, long[] arg1, int[] arg2) {
        if (!arg0) {
            method1325(true, (long[]) null, (int[]) null);
        }
        class314.method2188(arg1.length - 1, (byte) -46, arg1, 0, arg2);
        field2917++;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 698)
    public class179() {
        super(0, true);
    }
}
