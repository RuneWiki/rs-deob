import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class298 extends class240 {

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "[I")
    private int[] field5143 = new int[257];

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "Lcd;")
    public static class64 field5133 = class44.method335((byte) 71, "Konfig geladen)3");

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Lcd;")
    public static class64 field5128 = class44.method335((byte) 71, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "Lcd;")
    public static class64 field5139 = class44.method335((byte) 71, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "I")
    public static int field5144 = 0;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "F")
    public static float field5138;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Ljava/awt/Font;")
    public static Font field5135;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "[[I")
    private int[][] field5129;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "[[[Lbd;")
    public static class295[][][] field5146;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)Lpk;", line = 5)
    public static final class105 method2077(int arg0, int arg1) {
        class105 var2 = (class105) class77.field1447.method1194((long) arg0, (byte) -67);
        field5130++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -256) {
            field5138 = 1.5577543F;
        }
        byte[] var3 = class60.field1172.method1580(0, class222.method1590(1023, arg0), class8.method77(116, arg0));
        class105 var4 = new class105();
        if (var3 != null) {
            var4.method771((byte) 107, new class13(var3));
        }
        class77.field1447.method1190(12669, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILkh;)V", line = 27)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field5131++;
        if (arg0 != 2) {
            field5139 = (class64) null;
        }
        if (arg1 != 0) {
            return;
        }
        int var4 = arg2.method152((byte) -79);
        if (var4 != 0) {
            this.method2082(24204, var4);
            return;
        }
        this.field5129 = new int[arg2.method152((byte) -94)][4];
        for (int var5 = 0; var5 < this.field5129.length; var5++) {
            this.field5129[var5][0] = arg2.method112((byte) 92);
            this.field5129[var5][1] = arg2.method152((byte) -78) << 4;
            this.field5129[var5][2] = arg2.method152((byte) -111) << 4;
            this.field5129[var5][3] = arg2.method152((byte) -108) << 4;
        }
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V", line = 65)
    private final void method2078(int arg0) {
        field5147++;
        if (arg0 != 4096) {
            this.field5143 = (int[]) null;
        }
        int var2 = this.field5129.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && this.field5129[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field5129[var2 - 1];
                var8 = var7[1];
                var9 = var7[2];
                var10 = var7[3];
            } else {
                int[] var11 = this.field5129[var4];
                if (var4 <= 0) {
                    var10 = var11[3];
                    var8 = var11[1];
                    var9 = var11[2];
                } else {
                    int[] var12 = this.field5129[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                }
            }
            int var15 = var10 >> 4;
            int var16 = var8 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var9 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field5143[var3] = class11.method91(class11.method91(var17 << 8, var16 << 16), var15);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIII)V", line = 176)
    public static final void method2079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5136++;
        int var9 = arg7 - arg8;
        int var10 = arg1 - arg6;
        int var11 = (arg2 - arg3 << 16) / var9;
        int var12 = (arg4 - arg0 << 16) / var10;
        int var13 = 102 % ((arg5 - 4) / 58);
        class261.method1841(arg3, arg6, arg7, arg1, var11, 0, -1839311386, arg0, arg8, 0, var12);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[[I", line = 214)
    public final int[][] method286(byte arg0, int arg1) {
        field5142++;
        if (arg0 < 34) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4095.method1797(arg1, -122);
        if (this.field4095.field4355) {
            int[] var4 = this.method1745(arg1, 0, (byte) 123);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class169.field2936; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5143[var9];
                var5[var8] = class224.method1614(var10 >> 12, 4080);
                var6[var8] = class224.method1614(var10, 65280) >> 4;
                var7[var8] = class224.method1614(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[[IIB)I", line = 267)
    public static final int method2080(int arg0, int arg1, int arg2, int[][] arg3, int arg4, byte arg5) {
        if (arg5 > -33) {
            field5133 = (class64) null;
        }
        int var6 = (128 - arg1) * arg3[arg2][arg4] + (arg3[arg2 + 1][arg4] * arg1) >> 7;
        field5141++;
        int var7 = (128 - arg1) * arg3[arg2][arg4 + 1] + arg3[arg2 + 1][arg4 + 1] * arg1 >> 7;
        return (128 - arg0) * var6 + (arg0 * var7) >> 7;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIZII)V", line = 284)
    public static final void method2081(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class26.field426++;
        field5132++;
        if (!arg3) {
            class226.method1637(true, true);
            class216.method1513(true, 127);
            class226.method1637(true, false);
        }
        class216.method1513(false, 127);
        if (!arg3) {
            class102.method752(false);
        }
        if (!arg0) {
            return;
        }
        class246.method1784(60);
        if (class123.field2216) {
            class238.method1736(true, arg5, arg2, -119, arg4, arg1);
            arg4 = class250.field4353;
            arg1 = class60.field1030;
            arg5 = class229.field3885;
            arg2 = class259.field4468;
        }
        if (class238.field4054 == 1) {
            int var6 = class77.field1459;
            if (var6 < (class201.field3451 / 256)) {
                var6 = class201.field3451 / 256;
            }
            int var7 = class44.field720 + class241.field4157 & 0x7FF;
            if (class315.field5332[4] && class272.field4672[4] + 128 > var6) {
                var6 = class272.field4672[4] + 128;
            }
            class295.method2064(class15.method169(class139.field2472.field1865, 13257, class20.field364, class139.field2472.field1859) - 50, class48.field798, var6, var7, class108.field2006, arg4, (byte) 47, (var6 * 3) + 600);
        }
        int var8 = class99.field1791;
        int var9 = class268.field4622;
        int var10 = class131.field2336;
        int var11 = class119.field2156;
        int var12 = class181.field3102;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class315.field5332[var13]) {
                int var14 = (int) ((double) (-class173.field2987[var13]) + (double) (class173.field2987[var13] * 2 + 1) * Math.random() + Math.sin((double) class147.field2594[var13] / 100.0D * (double) class315.field5341[var13]) * (double) class272.field4672[var13]);
                if (var13 == 2) {
                    class119.field2156 += var14;
                }
                if (var13 == 4) {
                    class131.field2336 += var14;
                    if (class131.field2336 < 128) {
                        class131.field2336 = 128;
                    }
                    if (class131.field2336 > 383) {
                        class131.field2336 = 383;
                    }
                }
                if (var13 == 3) {
                    class181.field3102 = class181.field3102 + var14 & 0x7FF;
                }
                if (var13 == 0) {
                    class99.field1791 += var14;
                }
                if (var13 == 1) {
                    class268.field4622 += var14;
                }
            }
        }
        class309.method2144(2057790535);
        if (class123.field2216) {
            class21.method209(arg5, arg2, arg1 + arg5, arg2 + arg4);
            float var15 = (float) class131.field2336 * 0.17578125F;
            float var16 = (float) class181.field3102 * 0.17578125F;
            if (class238.field4054 == 3) {
                var15 = class267.field4606 * 360.0F / 6.2831855F;
                var16 = class125.field2252 * 360.0F / 6.2831855F;
            }
            class123.method886(arg5, arg2, arg1, arg4, arg5 + (arg1 / 2), arg4 / 2 + arg2, var15, var16, class172.field2970, class172.field2970);
        } else {
            class210.method1470(arg5, arg2, arg5 + arg1, arg2 + arg4);
            class50.method362();
        }
        if (class101.field1828 || class278.field4789 < arg5 || arg1 + arg5 <= class278.field4789 || arg2 > class245.field4259 || arg2 + arg4 <= class245.field4259) {
            class70.field1349 = 0;
            class234.field3960 = false;
        } else {
            class234.field3960 = true;
            int var17 = class290.field4964;
            class70.field1349 = 0;
            int var18 = class181.field3113;
            class71.field1364 = (class278.field4789 - arg5) * (var18 - var17) / arg1 + var17;
            int var19 = class61.field1186;
            int var20 = class66.field1307;
            class182.field3122 = (class245.field4259 - arg2) * (var20 - var19) / arg4 + var19;
        }
        class246.method1778(5);
        byte var21 = class110.method801(1) == 2 ? (byte) class26.field426 : 1;
        if (class123.field2216) {
            boolean var22 = false;
            class123.method888();
            class123.method865(true);
            class123.method895(true);
            int var23;
            if (class128.field2277 == 10) {
                var23 = class14.method164(class99.field1791 >> 10, class119.field2156 >> 10, class249.field4327, class201.field3441, 65536);
            } else {
                var23 = class14.method164(class139.field2472.field1876[0] >> 3, class139.field2472.field1898[0] >> 3, class249.field4327, class201.field3441, 65536);
            }
            class177.method1244(class29.field482, !class220.field3729);
            class123.method868(var23);
            class187.method1319(class268.field4622, class119.field2156, class181.field3102, class131.field2336, class99.field1791, (byte) -103);
            class123.field2226 = class29.field482;
            class62.method487(class99.field1791, class268.field4622, class119.field2156, class131.field2336, class181.field3102, class264.field4528, class138.field2455, class159.field2809, class103.field1869, class114.field2104, class211.field3568, class20.field364 + 1, var21, class139.field2472.field1859 >> 7, class139.field2472.field1865 >> 7);
            class149.field2617 = true;
            class177.method1242();
            class187.method1319(0, 0, 0, 0, 0, (byte) -105);
            class246.method1778(5);
            class130.method939();
            class70.method571(arg5, class172.field2970, class172.field2970, arg1, arg4, arg2, true);
            class69.method565(class172.field2970, arg4, class172.field2970, arg2, 139, arg1, arg5);
        } else {
            class210.method1469(arg5, arg2, arg1, arg4, 0);
            class62.method487(class99.field1791, class268.field4622, class119.field2156, class131.field2336, class181.field3102, class264.field4528, class138.field2455, class159.field2809, class103.field1869, class114.field2104, class211.field3568, class20.field364 + 1, var21, class139.field2472.field1859 >> 7, class139.field2472.field1865 >> 7);
            class246.method1778(5);
            class130.method939();
            class70.method571(arg5, 256, 256, arg1, arg4, arg2, true);
            class69.method565(256, arg4, 256, arg2, 139, arg1, arg5);
        }
        ((class241) class50.field816).method1750(class249.field4327, 0);
        class154.method1109(arg4, 2, arg5, arg1, arg2);
        class119.field2156 = var11;
        class131.field2336 = var10;
        class99.field1791 = var8;
        class268.field4622 = var9;
        class181.field3102 = var12;
        if (class188.field3217 && class111.field2055.method1307(-31382) == 0) {
            class188.field3217 = false;
        }
        if (class188.field3217) {
            if (class123.field2216) {
                class21.method208(arg5, arg2, arg1, arg4, 0);
            } else {
                class210.method1469(arg5, arg2, arg1, arg4, 0);
            }
            class78.method617(false, class139.field2466, (byte) -110);
        }
        if (!arg3 && !class188.field3217 && !class101.field1828 && class278.field4789 >= arg5 && class278.field4789 < (arg1 + arg5) && arg2 <= class245.field4259 && (arg2 + arg4) > class245.field4259) {
            class28.method246((byte) -104, arg1, arg2, arg5, class278.field4789, class245.field4259, arg4);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)V", line = 495)
    private final void method2082(int arg0, int arg1) {
        field5137++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field5129 = new int[2][4];
                this.field5129[0][3] = 0;
                this.field5129[0][2] = 0;
                this.field5129[1][2] = 4096;
                this.field5129[0][0] = 0;
                this.field5129[0][1] = 0;
                this.field5129[1][1] = 4096;
                this.field5129[1][0] = 4096;
                this.field5129[1][3] = 4096;
            } else if (arg1 == 2) {
                this.field5129 = new int[8][4];
                this.field5129[0][0] = 0;
                this.field5129[0][1] = 2650;
                this.field5129[1][0] = 2867;
                this.field5129[0][3] = 2361;
                this.field5129[1][3] = 1558;
                this.field5129[1][1] = 2313;
                this.field5129[2][3] = 1413;
                this.field5129[2][1] = 2618;
                this.field5129[3][3] = 947;
                this.field5129[4][3] = 722;
                this.field5129[2][0] = 3072;
                this.field5129[3][1] = 2296;
                this.field5129[4][1] = 2072;
                this.field5129[5][3] = 1766;
                this.field5129[0][2] = 2602;
                this.field5129[1][2] = 1799;
                this.field5129[2][2] = 1734;
                this.field5129[5][1] = 2730;
                this.field5129[6][1] = 2232;
                this.field5129[3][0] = 3276;
                this.field5129[6][3] = 915;
                this.field5129[7][1] = 1686;
                this.field5129[7][3] = 1140;
                this.field5129[4][0] = 3481;
                this.field5129[5][0] = 3686;
                this.field5129[6][0] = 3891;
                this.field5129[7][0] = 4096;
                this.field5129[3][2] = 1220;
                this.field5129[4][2] = 963;
                this.field5129[5][2] = 2152;
                this.field5129[6][2] = 1060;
                this.field5129[7][2] = 1413;
            } else if (arg1 == 3) {
                this.field5129 = new int[7][4];
                this.field5129[0][2] = 0;
                this.field5129[0][0] = 0;
                this.field5129[0][1] = 0;
                this.field5129[1][0] = 663;
                this.field5129[1][2] = 4096;
                this.field5129[0][3] = 4096;
                this.field5129[1][1] = 0;
                this.field5129[1][3] = 4096;
                this.field5129[2][2] = 4096;
                this.field5129[2][0] = 1363;
                this.field5129[3][0] = 2048;
                this.field5129[3][2] = 4096;
                this.field5129[2][3] = 0;
                this.field5129[2][1] = 0;
                this.field5129[3][3] = 0;
                this.field5129[4][2] = 0;
                this.field5129[4][3] = 0;
                this.field5129[4][0] = 2727;
                this.field5129[3][1] = 4096;
                this.field5129[4][1] = 4096;
                this.field5129[5][0] = 3411;
                this.field5129[5][1] = 4096;
                this.field5129[5][3] = 4096;
                this.field5129[5][2] = 0;
                this.field5129[6][3] = 4096;
                this.field5129[6][1] = 0;
                this.field5129[6][0] = 4096;
                this.field5129[6][2] = 0;
            } else if (arg1 == 4) {
                this.field5129 = new int[6][4];
                this.field5129[0][3] = 0;
                this.field5129[0][0] = 0;
                this.field5129[0][2] = 0;
                this.field5129[1][0] = 1843;
                this.field5129[2][0] = 2457;
                this.field5129[1][2] = 0;
                this.field5129[2][2] = 0;
                this.field5129[1][3] = 1493;
                this.field5129[0][1] = 0;
                this.field5129[3][2] = 1124;
                this.field5129[2][3] = 2939;
                this.field5129[3][0] = 2781;
                this.field5129[1][1] = 0;
                this.field5129[4][0] = 3481;
                this.field5129[2][1] = 0;
                this.field5129[3][1] = 0;
                this.field5129[4][1] = 546;
                this.field5129[5][0] = 4096;
                this.field5129[4][2] = 3084;
                this.field5129[5][1] = 4096;
                this.field5129[5][2] = 4096;
                this.field5129[3][3] = 3565;
                this.field5129[4][3] = 4031;
                this.field5129[5][3] = 4096;
            } else if (arg1 == 5) {
                this.field5129 = new int[16][4];
                this.field5129[0][3] = 321;
                this.field5129[0][0] = 0;
                this.field5129[1][3] = 562;
                this.field5129[1][0] = 155;
                this.field5129[2][0] = 389;
                this.field5129[3][0] = 671;
                this.field5129[2][3] = 803;
                this.field5129[3][3] = 1140;
                this.field5129[0][2] = 192;
                this.field5129[1][2] = 449;
                this.field5129[2][2] = 690;
                this.field5129[4][3] = 1509;
                this.field5129[0][1] = 80;
                this.field5129[1][1] = 321;
                this.field5129[3][2] = 995;
                this.field5129[4][2] = 1397;
                this.field5129[5][2] = 1429;
                this.field5129[2][1] = 578;
                this.field5129[5][3] = 1413;
                this.field5129[3][1] = 947;
                this.field5129[6][3] = 1333;
                this.field5129[4][0] = 897;
                this.field5129[5][0] = 1175;
                this.field5129[4][1] = 1285;
                this.field5129[5][1] = 1525;
                this.field5129[6][1] = 1734;
                this.field5129[7][1] = 1413;
                this.field5129[6][0] = 1368;
                this.field5129[7][0] = 1507;
                this.field5129[8][1] = 1108;
                this.field5129[9][1] = 1766;
                this.field5129[7][3] = 1702;
                this.field5129[6][2] = 1461;
                this.field5129[8][0] = 1736;
                this.field5129[8][3] = 2056;
                this.field5129[9][3] = 2666;
                this.field5129[10][1] = 2409;
                this.field5129[10][3] = 3276;
                this.field5129[7][2] = 1525;
                this.field5129[8][2] = 1590;
                this.field5129[9][0] = 2088;
                this.field5129[11][1] = 3116;
                this.field5129[12][1] = 3806;
                this.field5129[13][1] = 3437;
                this.field5129[9][2] = 2056;
                this.field5129[10][0] = 2355;
                this.field5129[14][1] = 3116;
                this.field5129[15][1] = 2377;
                this.field5129[11][3] = 3228;
                this.field5129[10][2] = 2586;
                this.field5129[11][0] = 2691;
                this.field5129[12][3] = 3196;
                this.field5129[11][2] = 3148;
                this.field5129[12][0] = 3031;
                this.field5129[13][0] = 3522;
                this.field5129[14][0] = 3727;
                this.field5129[15][0] = 4096;
                this.field5129[12][2] = 3710;
                this.field5129[13][2] = 3421;
                this.field5129[14][2] = 3148;
                this.field5129[13][3] = 3019;
                this.field5129[15][2] = 2505;
                this.field5129[14][3] = 3228;
                this.field5129[15][3] = 2746;
            } else if (arg1 == 6) {
                this.field5129 = new int[4][4];
                this.field5129[0][3] = 0;
                this.field5129[0][0] = 2048;
                this.field5129[0][1] = 0;
                this.field5129[0][2] = 4096;
                this.field5129[1][3] = 0;
                this.field5129[1][0] = 2867;
                this.field5129[1][2] = 4096;
                this.field5129[2][2] = 4096;
                this.field5129[2][3] = 0;
                this.field5129[2][0] = 3276;
                this.field5129[3][0] = 4096;
                this.field5129[1][1] = 4096;
                this.field5129[3][3] = 0;
                this.field5129[3][2] = 0;
                this.field5129[2][1] = 4096;
                this.field5129[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 != 24204) {
            method2085(-88);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 748)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(II)Z", line = 752)
    public static final boolean method2083(int arg0, int arg1) {
        field5148++;
        if (arg1 < 0) {
            return false;
        } else if (arg0 == 2047) {
            int var2 = class289.field4934[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1002;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLte;)V", line = 775)
    public static final void method2084(byte arg0, class282 arg1) {
        field5134++;
        class201.field3441 = 3;
        class11.method96(95, true);
        class163.field2865 = 255;
        class106.field1960 = 127;
        class268.field4616 = 0;
        class222.field3762 = true;
        class195.field3310 = 0;
        class109.field2015 = true;
        class275.field4718 = true;
        class57 var2 = null;
        class83.field1522 = true;
        class274.field4701 = true;
        class263.field4510 = true;
        class69.field1324 = true;
        class175.field3000 = true;
        class155.field2741 = 0;
        class250.field4342 = true;
        class58.field959 = 127;
        if (arg0 >= -73) {
            method2084((byte) -64, (class282) null);
        }
        class3.field31 = false;
        class244.field4251 = 2;
        class220.field3729 = true;
        class304.field5200 = 0;
        class289.field4937 = 0;
        class117.field2136 = true;
        try {
            class22 var3 = arg1.method1959(0, "runescape");
            while (var3.field375 == 0) {
                class267.method1871(10, 1L);
            }
            if (var3.field375 == 1) {
                var2 = (class57) var3.field377;
                byte[] var4 = new byte[(int) var2.method439(112)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method440(var4.length - var5, var4, true, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class134.method959(128, new class13(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method441(74);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V", line = 858)
    public static void method2085(int arg0) {
        field5146 = (class295[][][]) null;
        if (arg0 == 3) {
            field5128 = null;
            field5135 = null;
            field5133 = null;
            field5139 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V", line = 877)
    public final void method288(int arg0) {
        if (this.field5129 == null) {
            this.method2082(24204, 1);
        }
        field5145++;
        if (arg0 != 17772) {
            field5144 = 59;
        }
        this.method2078(4096);
    }
}
