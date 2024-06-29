import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class122 extends class232 {

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "[I")
    private int[] field2140 = new int[257];

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Lhi;")
    public static class82 field2129 = class95.method664((byte) -63, "null");

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Llg;")
    public static class177 field2132;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2134;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "[[I")
    private int[][] field2130;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lme;B)Z", line = 8)
    public static final boolean method832(class75 arg0, byte arg1) {
        field2131++;
        if (arg1 != -46) {
            method835(2);
        }
        if (arg0.field1210 == 205) {
            class309.field5277 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 29)
    private final void method833(byte arg0) {
        field2136++;
        if (arg0 != 118) {
            method837(-79, (byte) -67, -3);
        }
        int var2 = this.field2130.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field2130[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 > var4) {
                int[] var7 = this.field2130[var4];
                if (var4 <= 0) {
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field2130[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                    var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                    var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                }
            } else {
                int[] var14 = this.field2130[var2 - 1];
                var10 = var14[3];
                var9 = var14[2];
                var8 = var14[1];
            }
            int var15 = var9 >> 4;
            int var16 = var10 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2140[var3] = class98.method674(class98.method674(var17 << 16, var15 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBLbc;)V", line = 141)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method1082(arg1 ^ 0x3E);
            if (var4 == 0) {
                this.field2130 = new int[arg2.method1082(-55)][4];
                for (int var5 = 0; var5 < this.field2130.length; var5++) {
                    this.field2130[var5][0] = arg2.method1090(false);
                    this.field2130[var5][1] = arg2.method1082(-88) << 4;
                    this.field2130[var5][2] = arg2.method1082(-46) << 4;
                    this.field2130[var5][3] = arg2.method1082(-45) << 4;
                }
            } else {
                this.method834(var4, -15652);
            }
        }
        field2135++;
        if (arg1 != -19) {
            method832((class75) null, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V", line = 186)
    public final void method144(int arg0) {
        field2139++;
        if (this.field2130 == null) {
            this.method834(1, -15652);
        }
        if (arg0 <= 48) {
            field2134 = (Canvas) null;
        }
        this.method833((byte) 118);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V", line = 204)
    private final void method834(int arg0, int arg1) {
        field2133++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2130 = new int[2][4];
                this.field2130[0][3] = 0;
                this.field2130[0][0] = 0;
                this.field2130[1][3] = 4096;
                this.field2130[0][2] = 0;
                this.field2130[1][2] = 4096;
                this.field2130[1][0] = 4096;
                this.field2130[0][1] = 0;
                this.field2130[1][1] = 4096;
            } else if (arg0 == 2) {
                this.field2130 = new int[8][4];
                this.field2130[0][1] = 2650;
                this.field2130[0][0] = 0;
                this.field2130[0][2] = 2602;
                this.field2130[1][0] = 2867;
                this.field2130[2][0] = 3072;
                this.field2130[3][0] = 3276;
                this.field2130[4][0] = 3481;
                this.field2130[1][2] = 1799;
                this.field2130[0][3] = 2361;
                this.field2130[1][3] = 1558;
                this.field2130[5][0] = 3686;
                this.field2130[2][3] = 1413;
                this.field2130[1][1] = 2313;
                this.field2130[6][0] = 3891;
                this.field2130[2][1] = 2618;
                this.field2130[7][0] = 4096;
                this.field2130[2][2] = 1734;
                this.field2130[3][1] = 2296;
                this.field2130[3][3] = 947;
                this.field2130[4][1] = 2072;
                this.field2130[4][3] = 722;
                this.field2130[5][1] = 2730;
                this.field2130[6][1] = 2232;
                this.field2130[5][3] = 1766;
                this.field2130[3][2] = 1220;
                this.field2130[4][2] = 963;
                this.field2130[7][1] = 1686;
                this.field2130[5][2] = 2152;
                this.field2130[6][2] = 1060;
                this.field2130[6][3] = 915;
                this.field2130[7][2] = 1413;
                this.field2130[7][3] = 1140;
            } else if (arg0 == 3) {
                this.field2130 = new int[7][4];
                this.field2130[0][0] = 0;
                this.field2130[0][2] = 0;
                this.field2130[1][2] = 4096;
                this.field2130[2][2] = 4096;
                this.field2130[0][1] = 0;
                this.field2130[0][3] = 4096;
                this.field2130[3][2] = 4096;
                this.field2130[1][3] = 4096;
                this.field2130[1][1] = 0;
                this.field2130[2][3] = 0;
                this.field2130[2][1] = 0;
                this.field2130[3][3] = 0;
                this.field2130[1][0] = 663;
                this.field2130[2][0] = 1363;
                this.field2130[3][1] = 4096;
                this.field2130[4][2] = 0;
                this.field2130[4][3] = 0;
                this.field2130[5][2] = 0;
                this.field2130[6][2] = 0;
                this.field2130[4][1] = 4096;
                this.field2130[5][3] = 4096;
                this.field2130[3][0] = 2048;
                this.field2130[5][1] = 4096;
                this.field2130[6][3] = 4096;
                this.field2130[6][1] = 0;
                this.field2130[4][0] = 2727;
                this.field2130[5][0] = 3411;
                this.field2130[6][0] = 4096;
            } else if (arg0 == 4) {
                this.field2130 = new int[6][4];
                this.field2130[0][2] = 0;
                this.field2130[1][2] = 0;
                this.field2130[0][0] = 0;
                this.field2130[1][0] = 1843;
                this.field2130[0][3] = 0;
                this.field2130[2][0] = 2457;
                this.field2130[2][2] = 0;
                this.field2130[3][0] = 2781;
                this.field2130[0][1] = 0;
                this.field2130[1][3] = 1493;
                this.field2130[4][0] = 3481;
                this.field2130[2][3] = 2939;
                this.field2130[1][1] = 0;
                this.field2130[3][3] = 3565;
                this.field2130[3][2] = 1124;
                this.field2130[2][1] = 0;
                this.field2130[5][0] = 4096;
                this.field2130[4][3] = 4031;
                this.field2130[4][2] = 3084;
                this.field2130[5][2] = 4096;
                this.field2130[5][3] = 4096;
                this.field2130[3][1] = 0;
                this.field2130[4][1] = 546;
                this.field2130[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field2130 = new int[16][4];
                this.field2130[0][2] = 192;
                this.field2130[1][2] = 449;
                this.field2130[0][3] = 321;
                this.field2130[0][0] = 0;
                this.field2130[1][0] = 155;
                this.field2130[2][2] = 690;
                this.field2130[2][0] = 389;
                this.field2130[1][3] = 562;
                this.field2130[0][1] = 80;
                this.field2130[1][1] = 321;
                this.field2130[2][3] = 803;
                this.field2130[3][0] = 671;
                this.field2130[3][3] = 1140;
                this.field2130[4][0] = 897;
                this.field2130[2][1] = 578;
                this.field2130[5][0] = 1175;
                this.field2130[6][0] = 1368;
                this.field2130[4][3] = 1509;
                this.field2130[7][0] = 1507;
                this.field2130[5][3] = 1413;
                this.field2130[3][2] = 995;
                this.field2130[3][1] = 947;
                this.field2130[4][2] = 1397;
                this.field2130[6][3] = 1333;
                this.field2130[7][3] = 1702;
                this.field2130[4][1] = 1285;
                this.field2130[8][3] = 2056;
                this.field2130[5][1] = 1525;
                this.field2130[8][0] = 1736;
                this.field2130[6][1] = 1734;
                this.field2130[7][1] = 1413;
                this.field2130[5][2] = 1429;
                this.field2130[6][2] = 1461;
                this.field2130[8][1] = 1108;
                this.field2130[9][1] = 1766;
                this.field2130[9][0] = 2088;
                this.field2130[9][3] = 2666;
                this.field2130[10][3] = 3276;
                this.field2130[7][2] = 1525;
                this.field2130[11][3] = 3228;
                this.field2130[10][1] = 2409;
                this.field2130[8][2] = 1590;
                this.field2130[9][2] = 2056;
                this.field2130[12][3] = 3196;
                this.field2130[11][1] = 3116;
                this.field2130[10][2] = 2586;
                this.field2130[12][1] = 3806;
                this.field2130[13][1] = 3437;
                this.field2130[14][1] = 3116;
                this.field2130[11][2] = 3148;
                this.field2130[13][3] = 3019;
                this.field2130[15][1] = 2377;
                this.field2130[14][3] = 3228;
                this.field2130[10][0] = 2355;
                this.field2130[12][2] = 3710;
                this.field2130[15][3] = 2746;
                this.field2130[13][2] = 3421;
                this.field2130[14][2] = 3148;
                this.field2130[15][2] = 2505;
                this.field2130[11][0] = 2691;
                this.field2130[12][0] = 3031;
                this.field2130[13][0] = 3522;
                this.field2130[14][0] = 3727;
                this.field2130[15][0] = 4096;
            } else if (arg0 == 6) {
                this.field2130 = new int[4][4];
                this.field2130[0][2] = 4096;
                this.field2130[0][3] = 0;
                this.field2130[1][3] = 0;
                this.field2130[2][3] = 0;
                this.field2130[0][0] = 2048;
                this.field2130[0][1] = 0;
                this.field2130[3][3] = 0;
                this.field2130[1][1] = 4096;
                this.field2130[1][0] = 2867;
                this.field2130[2][1] = 4096;
                this.field2130[3][1] = 4096;
                this.field2130[2][0] = 3276;
                this.field2130[1][2] = 4096;
                this.field2130[2][2] = 4096;
                this.field2130[3][0] = 4096;
                this.field2130[3][2] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != -15652) {
            this.field2140 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[[I", line = 458)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            method835(34);
        }
        field2137++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[] var4 = this.method1649(0, (byte) 63, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class54.field858; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2140[var9];
                var5[var8] = class277.method1935(var10 >> 12, 4080);
                var6[var8] = class277.method1935(var10, 65280) >> 4;
                var7[var8] = class277.method1935(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V", line = 507)
    public static void method835(int arg0) {
        field2132 = null;
        field2129 = null;
        field2134 = null;
        if (arg0 >= -76) {
            method836(-28, -106);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 519)
    public class122() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)Lj;", line = 531)
    public static final class232 method836(int arg0, int arg1) {
        field2141++;
        if (arg1 != -10) {
            field2132 = (class177) null;
        }
        if (arg0 == 0) {
            return new class62();
        } else if (arg0 == 1) {
            return new class201();
        } else if (arg0 == 2) {
            return new class265();
        } else if (arg0 == 3) {
            return new class184();
        } else if (arg0 == 4) {
            return new class237();
        } else if (arg0 == 5) {
            return new class311();
        } else if (arg0 == 6) {
            return new class217();
        } else if (arg0 == 7) {
            return new class314();
        } else if (arg0 == 8) {
            return new class279();
        } else if (arg0 == 9) {
            return new class286();
        } else if (arg0 == 10) {
            return new class122();
        } else if (arg0 == 11) {
            return new class149();
        } else if (arg0 == 12) {
            return new class99();
        } else if (arg0 == 13) {
            return new class166();
        } else if (arg0 == 14) {
            return new class47();
        } else if (arg0 == 15) {
            return new class289();
        } else if (arg0 == 16) {
            return new class14();
        } else if (arg0 == 17) {
            return new class95();
        } else if (arg0 == 18) {
            return new class264();
        } else if (arg0 == 19) {
            return new class21();
        } else if (arg0 == 20) {
            return new class55();
        } else if (arg0 == 21) {
            return new class104();
        } else if (arg0 == 22) {
            return new class78();
        } else if (arg0 == 23) {
            return new class214();
        } else if (arg0 == 24) {
            return new class43();
        } else if (arg0 == 25) {
            return new class283();
        } else if (arg0 == 26) {
            return new class200();
        } else if (arg0 == 27) {
            return new class197();
        } else if (arg0 == 28) {
            return new class195();
        } else if (arg0 == 29) {
            return new class171();
        } else if (arg0 == 30) {
            return new class308();
        } else if (arg0 == 31) {
            return new class136();
        } else if (arg0 == 32) {
            return new class107();
        } else if (arg0 == 33) {
            return new class98();
        } else if (arg0 == 34) {
            return new class323();
        } else if (arg0 == 35) {
            return new class129();
        } else if (arg0 == 36) {
            return new class191();
        } else if (arg0 == 37) {
            return new class54();
        } else if (arg0 == 38) {
            return new class207();
        } else if (arg0 == 39) {
            return new class230();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IBI)V", line = 853)
    public static final void method837(int arg0, byte arg1, int arg2) {
        field2138++;
        class277 var3 = class107.field1889[class297.field5058][arg0][arg2];
        if (var3 == null) {
            class199.method1400(class297.field5058, arg0, arg2);
            return;
        }
        int var4 = -99999999;
        class315 var5 = null;
        for (class315 var6 = (class315) var3.method1936(16173); var6 != null; var6 = (class315) var3.method1926((byte) 90)) {
            class312 var7 = class273.method1912(var6.field5428.field4840, -60);
            int var8 = var7.field5373;
            if (var7.field5357 == 1) {
                var8 = (var6.field5428.field4844 + 1) * var8;
            }
            if (var8 > var4) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class199.method1400(class297.field5058, arg0, arg2);
            return;
        }
        class288 var9 = null;
        var3.method1933(9988, var5);
        class315 var10 = (class315) var3.method1936(16173);
        class288 var11 = null;
        while (var10 != null) {
            class288 var12 = var10.field5428;
            if (var5.field5428.field4840 != var12.field4840) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field4840 != var12.field4840 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class315) var3.method1926((byte) 90);
        }
        if (arg1 <= 3) {
            field2134 = (Canvas) null;
        }
        long var13 = (long) (arg0 + (arg2 << 7) + 1610612736);
        class67.method424(class297.field5058, arg0, arg2, class21.method145(arg0 * 128 + 64, arg2 * 128 + 64, class297.field5058, (byte) 104), var5.field5428, var13, var9, var11);
    }
}
