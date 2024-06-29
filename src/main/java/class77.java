import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class77 extends class335 {

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "[I")
    private int[] field1248 = new int[257];

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Ll;")
    public static class133 field1240;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "[S")
    public static short[] field1235;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "[[I")
    private int[][] field1246;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lqh;III)V", line = 6)
    public static final void method563(class33 arg0, int arg1, int arg2, int arg3) {
        if ((arg1 & 0x8) != 0) {
            arg0.field1853 = class10.field132.method1148(-2123880488);
            if (arg0.field1853 == 65535) {
                arg0.field1853 = -1;
            }
        }
        field1237++;
        if ((arg1 & 0x2) != 0) {
            int var4 = class10.field132.method1178(0);
            byte[] var5 = new byte[var4];
            class166 var6 = new class166(var5);
            class10.field132.method1168(var4, var5, 0, (byte) 75);
            class254.field3998[arg3] = var6;
            arg0.method277(128, var6);
        }
        if ((arg1 & 0x10) != 0) {
            arg0.field1917 = class10.field132.method1180(128);
            arg0.field1929 = class10.field132.method1128((byte) -127);
        }
        if ((arg1 & 0x400) != 0) {
            arg0.field1915 = class10.field132.method1120(112);
            arg0.field1867 = class10.field132.method1120(110);
            arg0.field1894 = class10.field132.method1172(false);
            arg0.field1930 = class10.field132.method1172(false);
            arg0.field1870 = class10.field132.method1148(-2123880488) + class227.field3618;
            arg0.field1856 = class10.field132.method1151(arg2 - 66) + class227.field3618;
            arg0.field1860 = class10.field132.method1178(0);
            arg0.field1918 = 1;
            arg0.field1913 = 0;
        }
        if ((arg1 & 0x100) != 0) {
            int var7 = class10.field132.method1120(79);
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            for (int var11 = 0; var11 < var7; var11++) {
                int var12 = class10.field132.method1180(128);
                if (var12 == 65535) {
                    var12 = -1;
                }
                var9[var11] = var12;
                var8[var11] = class10.field132.method1172(false);
                var10[var11] = class10.field132.method1180(128);
            }
            class227.method1602(var10, var8, var9, false, arg0);
        }
        if ((arg1 & 0x20) != 0) {
            arg0.field1945 = class10.field132.method1179((byte) 65);
            if (arg0.field1945.charAt(0) == '~') {
                arg0.field1945 = arg0.field1945.substring(1);
                class29.method252(arg0.field1945, arg0.method272(27884), true, 2);
            } else if (class98.field1566 == arg0) {
                class29.method252(arg0.field1945, arg0.method272(27884), true, 2);
            }
            arg0.field1920 = 0;
            arg0.field1916 = 150;
            arg0.field1861 = 0;
        }
        if ((arg1 & 0x800) != 0) {
            int var13 = class10.field132.method1145(128);
            int var14 = class10.field132.method1178(0);
            arg0.method887(-127, var13, class227.field3618, var14);
        }
        if ((arg1 & 0x40) != 0) {
            int var15 = class10.field132.method1145(arg2 ^ 0xFFFFFF7F);
            int var16 = class10.field132.method1120(73);
            arg0.method887(-124, var15, class227.field3618, var16);
            arg0.field1902 = class227.field3618 + 300;
            arg0.field1859 = class10.field132.method1178(0);
        }
        if (~(arg1 & 0x4) != arg2) {
            int var17 = class10.field132.method1128((byte) -122);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class10.field132.method1153(arg2 + 15674);
            class200.method1421(var17, var18, arg0, (byte) 101);
        }
        if ((arg1 & 0x200) != 0) {
            int var19 = class10.field132.method1148(-2123880488);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class10.field132.method1147((byte) 101);
            boolean var21 = true;
            if (var19 != -1 && arg0.field1951 != -1 && class133.method948(class112.method831(var19, true).field4117, (byte) 33).field4344 < class133.method948(class112.method831(arg0.field1951, true).field4117, (byte) 33).field4344) {
                var21 = false;
            }
            if (var21) {
                arg0.field1951 = var19;
                arg0.field1895 = (var20 & 0xFFFF) + class227.field3618;
                arg0.field1885 = 0;
                arg0.field1866 = 1;
                if (arg0.field1895 > class227.field3618) {
                    arg0.field1885 = -1;
                }
                arg0.field1904 = 0;
                arg0.field1934 = var20 >> 16;
                if (arg0.field1951 != -1 && class227.field3618 == arg0.field1895) {
                    int var22 = class112.method831(arg0.field1951, true).field4117;
                    if (var22 != -1) {
                        class281 var23 = class133.method948(var22, (byte) 33);
                        if (var23 != null && var23.field4326 != null) {
                            class170.method1231(class98.field1566 == arg0, arg0.field1905, arg0.field1868, 0, var23, -24255);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x1) == 0) {
            return;
        }
        int var24 = class10.field132.method1151(-124);
        int var25 = class10.field132.method1178(0);
        int var26 = class10.field132.method1178(~arg2);
        int var27 = class10.field132.field2532;
        boolean var28 = (var24 & 0x8000) != 0;
        if (arg0.field477 != null && arg0.field499 != null) {
            long var29 = class128.method926(arg0.field477, (byte) -58);
            boolean var31 = false;
            if (var25 <= 1) {
                if (var28 || (!class73.field1203 || class148.field2250) && !class33.field504) {
                    for (int var32 = 0; var32 < class336.field5253; var32++) {
                        if (class337.field5277[var32] == var29) {
                            var31 = true;
                            break;
                        }
                    }
                } else {
                    var31 = true;
                }
            }
            if (!var31 && class214.field3255 == 0) {
                class279.field4298.field2532 = 0;
                class10.field132.method1124(0, var26, class279.field4298.field2500, 3);
                class279.field4298.field2532 = 0;
                int var33 = -1;
                String var34;
                if (var28) {
                    var24 &= 0x7FFF;
                    class289 var35 = class235.method1651((byte) -78, class279.field4298);
                    var33 = var35.field4504;
                    var34 = var35.field4501.method466(class279.field4298, (byte) -105);
                } else {
                    var34 = class329.method2232(class195.method1387(class67.method514(class279.field4298, 105), (byte) 122));
                }
                arg0.field1945 = var34.trim();
                arg0.field1920 = var24 >> 8;
                arg0.field1916 = 150;
                arg0.field1861 = var24 & 0xFF;
                if (var25 == 2) {
                    class321.method2186(var28 ? 17 : 1, "<img=1>" + arg0.method272(27884), (String) null, arg2 + 1, var34, var33);
                } else if (var25 == 1) {
                    class321.method2186(var28 ? 17 : 1, "<img=0>" + arg0.method272(27884), (String) null, arg2 + 1, var34, var33);
                } else {
                    class321.method2186(var28 ? 17 : 2, arg0.method272(arg2 ^ 0xFFFF9313), (String) null, 0, var34, var33);
                }
            }
        }
        class10.field132.field2532 = var27 + var26;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIILtb;IIII)V", line = 279)
    public static final void method564(byte arg0, int arg1, int arg2, class220 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 122) {
            method564((byte) 72, 102, -7, (class220) null, 48, 62, 11, -12);
        }
        field1244++;
        if (class223.field3550) {
            class87.field1411 = 32;
        } else {
            class87.field1411 = 0;
        }
        class223.field3550 = false;
        if (class256.field4016 != 0) {
            if (arg2 <= arg1 && arg2 + 16 > arg1 && arg6 <= arg4 && arg4 < (arg6 + 16)) {
                arg3.field3426 -= 4;
                class26.method241(arg0 + 2973, arg3);
            } else if (arg2 <= arg1 && arg1 < (arg2 + 16) && arg4 >= arg5 + arg6 - 16 && arg4 < arg5 + arg6) {
                arg3.field3426 += 4;
                class26.method241(3095, arg3);
            } else if (arg1 >= arg2 - class87.field1411 && arg1 < arg2 + class87.field1411 + 16 && arg4 >= arg6 + 16 && arg6 + arg5 - 16 > arg4) {
                int var8 = (arg5 - 32) * arg5 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - (var8 + 32);
                int var10 = arg4 - arg6 - (var8 / 2) - 16;
                arg3.field3426 = (arg7 - arg5) * var10 / var9;
                class26.method241(3095, arg3);
                class223.field3550 = true;
            }
        }
        if (class59.field946 == 0) {
            return;
        }
        int var11 = arg3.field3526;
        if (arg1 >= (arg2 - var11) && arg6 <= arg4 && arg1 < (arg2 + 16) && arg4 <= (arg5 + arg6)) {
            arg3.field3426 += class59.field946 * 45;
            class26.method241(arg0 + 2973, arg3);
        }
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V", line = 343)
    public static void method565(int arg0) {
        field1235 = null;
        field1240 = null;
        if (arg0 != 3421) {
            field1240 = (class133) null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V", line = 365)
    private final void method566(boolean arg0, int arg1) {
        field1241++;
        if (!arg0) {
            this.method249(-15, (byte) 125);
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field1246 = new int[2][4];
            this.field1246[0][2] = 0;
            this.field1246[0][0] = 0;
            this.field1246[1][0] = 4096;
            this.field1246[0][1] = 0;
            this.field1246[0][3] = 0;
            this.field1246[1][1] = 4096;
            this.field1246[1][2] = 4096;
            this.field1246[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field1246 = new int[8][4];
            this.field1246[0][0] = 0;
            this.field1246[0][3] = 2361;
            this.field1246[0][2] = 2602;
            this.field1246[1][2] = 1799;
            this.field1246[0][1] = 2650;
            this.field1246[1][0] = 2867;
            this.field1246[1][1] = 2313;
            this.field1246[2][0] = 3072;
            this.field1246[1][3] = 1558;
            this.field1246[2][1] = 2618;
            this.field1246[2][3] = 1413;
            this.field1246[3][1] = 2296;
            this.field1246[3][3] = 947;
            this.field1246[4][1] = 2072;
            this.field1246[2][2] = 1734;
            this.field1246[4][3] = 722;
            this.field1246[3][2] = 1220;
            this.field1246[3][0] = 3276;
            this.field1246[4][0] = 3481;
            this.field1246[5][0] = 3686;
            this.field1246[4][2] = 963;
            this.field1246[5][3] = 1766;
            this.field1246[5][2] = 2152;
            this.field1246[6][2] = 1060;
            this.field1246[5][1] = 2730;
            this.field1246[6][3] = 915;
            this.field1246[6][1] = 2232;
            this.field1246[7][3] = 1140;
            this.field1246[6][0] = 3891;
            this.field1246[7][1] = 1686;
            this.field1246[7][0] = 4096;
            this.field1246[7][2] = 1413;
        } else if (arg1 == 3) {
            this.field1246 = new int[7][4];
            this.field1246[0][1] = 0;
            this.field1246[0][3] = 4096;
            this.field1246[1][1] = 0;
            this.field1246[0][0] = 0;
            this.field1246[2][1] = 0;
            this.field1246[1][0] = 663;
            this.field1246[1][3] = 4096;
            this.field1246[2][0] = 1363;
            this.field1246[3][0] = 2048;
            this.field1246[3][1] = 4096;
            this.field1246[2][3] = 0;
            this.field1246[4][1] = 4096;
            this.field1246[3][3] = 0;
            this.field1246[4][3] = 0;
            this.field1246[0][2] = 0;
            this.field1246[5][1] = 4096;
            this.field1246[6][1] = 0;
            this.field1246[1][2] = 4096;
            this.field1246[5][3] = 4096;
            this.field1246[2][2] = 4096;
            this.field1246[6][3] = 4096;
            this.field1246[3][2] = 4096;
            this.field1246[4][0] = 2727;
            this.field1246[5][0] = 3411;
            this.field1246[6][0] = 4096;
            this.field1246[4][2] = 0;
            this.field1246[5][2] = 0;
            this.field1246[6][2] = 0;
        } else if (arg1 == 4) {
            this.field1246 = new int[6][4];
            this.field1246[0][2] = 0;
            this.field1246[0][3] = 0;
            this.field1246[1][2] = 0;
            this.field1246[2][2] = 0;
            this.field1246[0][0] = 0;
            this.field1246[3][2] = 1124;
            this.field1246[1][3] = 1493;
            this.field1246[0][1] = 0;
            this.field1246[1][0] = 1843;
            this.field1246[1][1] = 0;
            this.field1246[2][3] = 2939;
            this.field1246[3][3] = 3565;
            this.field1246[4][2] = 3084;
            this.field1246[4][3] = 4031;
            this.field1246[5][3] = 4096;
            this.field1246[2][1] = 0;
            this.field1246[5][2] = 4096;
            this.field1246[3][1] = 0;
            this.field1246[4][1] = 546;
            this.field1246[2][0] = 2457;
            this.field1246[3][0] = 2781;
            this.field1246[4][0] = 3481;
            this.field1246[5][1] = 4096;
            this.field1246[5][0] = 4096;
        } else if (arg1 == 5) {
            this.field1246 = new int[16][4];
            this.field1246[0][3] = 321;
            this.field1246[1][3] = 562;
            this.field1246[2][3] = 803;
            this.field1246[0][1] = 80;
            this.field1246[0][0] = 0;
            this.field1246[1][1] = 321;
            this.field1246[0][2] = 192;
            this.field1246[1][2] = 449;
            this.field1246[2][2] = 690;
            this.field1246[3][3] = 1140;
            this.field1246[3][2] = 995;
            this.field1246[4][2] = 1397;
            this.field1246[4][3] = 1509;
            this.field1246[5][3] = 1413;
            this.field1246[5][2] = 1429;
            this.field1246[1][0] = 155;
            this.field1246[6][2] = 1461;
            this.field1246[7][2] = 1525;
            this.field1246[6][3] = 1333;
            this.field1246[7][3] = 1702;
            this.field1246[8][2] = 1590;
            this.field1246[9][2] = 2056;
            this.field1246[8][3] = 2056;
            this.field1246[9][3] = 2666;
            this.field1246[10][2] = 2586;
            this.field1246[2][0] = 389;
            this.field1246[11][2] = 3148;
            this.field1246[2][1] = 578;
            this.field1246[3][1] = 947;
            this.field1246[10][3] = 3276;
            this.field1246[3][0] = 671;
            this.field1246[11][3] = 3228;
            this.field1246[4][0] = 897;
            this.field1246[5][0] = 1175;
            this.field1246[12][3] = 3196;
            this.field1246[6][0] = 1368;
            this.field1246[13][3] = 3019;
            this.field1246[12][2] = 3710;
            this.field1246[7][0] = 1507;
            this.field1246[8][0] = 1736;
            this.field1246[4][1] = 1285;
            this.field1246[5][1] = 1525;
            this.field1246[9][0] = 2088;
            this.field1246[14][3] = 3228;
            this.field1246[6][1] = 1734;
            this.field1246[13][2] = 3421;
            this.field1246[14][2] = 3148;
            this.field1246[15][2] = 2505;
            this.field1246[10][0] = 2355;
            this.field1246[15][3] = 2746;
            this.field1246[11][0] = 2691;
            this.field1246[7][1] = 1413;
            this.field1246[12][0] = 3031;
            this.field1246[13][0] = 3522;
            this.field1246[8][1] = 1108;
            this.field1246[14][0] = 3727;
            this.field1246[9][1] = 1766;
            this.field1246[10][1] = 2409;
            this.field1246[15][0] = 4096;
            this.field1246[11][1] = 3116;
            this.field1246[12][1] = 3806;
            this.field1246[13][1] = 3437;
            this.field1246[14][1] = 3116;
            this.field1246[15][1] = 2377;
        } else if (arg1 == 6) {
            this.field1246 = new int[4][4];
            this.field1246[0][3] = 0;
            this.field1246[0][2] = 4096;
            this.field1246[0][1] = 0;
            this.field1246[1][1] = 4096;
            this.field1246[1][2] = 4096;
            this.field1246[0][0] = 2048;
            this.field1246[2][1] = 4096;
            this.field1246[1][0] = 2867;
            this.field1246[2][2] = 4096;
            this.field1246[3][1] = 4096;
            this.field1246[2][0] = 3276;
            this.field1246[3][0] = 4096;
            this.field1246[1][3] = 0;
            this.field1246[2][3] = 0;
            this.field1246[3][3] = 0;
            this.field1246[3][2] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V", line = 618)
    private final void method567(int arg0) {
        field1242++;
        if (arg0 != 321) {
            field1239 = -32;
        }
        int var2 = this.field1246.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field1246[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 < var2) {
                int[] var7 = this.field1246[var4];
                if (var4 <= 0) {
                    var8 = var7[2];
                    var9 = var7[1];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field1246[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var8 = var7[2] * var12 + var11[2] * var13 >> 12;
                    var9 = var7[1] * var12 + var11[1] * var13 >> 12;
                    var10 = var7[3] * var12 + (var11[3] * var13) >> 12;
                }
            } else {
                int[] var14 = this.field1246[var2 - 1];
                var9 = var14[1];
                var8 = var14[2];
                var10 = var14[3];
            }
            int var15 = var9 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var10 >> 4;
            int var17 = var8 >> 4;
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
            this.field1248[var3] = class222.method1577(class222.method1577(var15 << 16, var17 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[[I", line = 722)
    public final int[][] method249(int arg0, byte arg1) {
        field1249++;
        if (arg1 != 51) {
            this.field1246 = (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[] var4 = this.method2330(arg0, true, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class105.field1630; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1248[var9];
                var6[var8] = class270.method1860(16711680, var10) >> 12;
                var5[var8] = class270.method1860(65280, var10) >> 4;
                var7[var8] = class270.method1860(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 773)
    public class77() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILkh;I)V", line = 777)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field1234++;
        if (arg2 < 51) {
            this.field1248 = (int[]) null;
        }
        if (arg0 != 0) {
            return;
        }
        int var4 = arg1.method1178(0);
        if (var4 != 0) {
            this.method566(true, var4);
            return;
        }
        this.field1246 = new int[arg1.method1178(0)][4];
        for (int var5 = 0; var5 < this.field1246.length; var5++) {
            this.field1246[var5][0] = arg1.method1151(-76);
            this.field1246[var5][1] = arg1.method1178(0) << 4;
            this.field1246[var5][2] = arg1.method1178(0) << 4;
            this.field1246[var5][3] = arg1.method1178(0) << 4;
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V", line = 814)
    public final void method381(int arg0) {
        field1247++;
        if (this.field1246 == null) {
            this.method566(true, 1);
        }
        this.method567(321);
        int var2 = -103 / ((arg0 - 44) / 35);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 829)
    public static final void method568() {
        if (class34.field528 != null) {
            for (int var0 = 0; var0 < class34.field528.length; var0++) {
                for (int var1 = 0; var1 < class50.field817; var1++) {
                    for (int var2 = 0; var2 < class267.field4171; var2++) {
                        class34.field528[var0][var1][var2] = null;
                    }
                }
            }
        }
        class184.field2766 = (class127[][]) null;
        if (class316.field4940 != null) {
            for (int var3 = 0; var3 < class316.field4940.length; var3++) {
                for (int var4 = 0; var4 < class50.field817; var4++) {
                    for (int var5 = 0; var5 < class267.field4171; var5++) {
                        class316.field4940[var3][var4][var5] = null;
                    }
                }
            }
        }
        class19.field254 = (class127[][]) null;
        class206.field3169 = 0;
        if (class175.field2650 != null) {
            for (int var6 = 0; var6 < class206.field3169; var6++) {
                class175.field2650[var6] = null;
            }
        }
        if (class51.field840 != null) {
            for (int var7 = 0; var7 < class65.field1018; var7++) {
                class51.field840[var7] = null;
            }
            class65.field1018 = 0;
        }
        if (class98.field1563 != null) {
            for (int var8 = 0; var8 < class98.field1563.length; var8++) {
                class98.field1563[var8] = null;
            }
        }
    }
}
