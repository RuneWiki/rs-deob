import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class144 extends class283 {

    @OriginalMember(owner = "client!um", name = "bb", descriptor = "[I")
    private int[] field2196 = new int[257];

    @OriginalMember(owner = "client!um", name = "V", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2190 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!um", name = "Y", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!um", name = "Z", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!um", name = "ab", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "Ldd;")
    public static class248 field2189;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[[I")
    private int[][] field2186;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V", line = 6)
    public final void method130(int arg0) {
        if (arg0 != 16251) {
            this.field2196 = (int[]) null;
        }
        if (this.field2186 == null) {
            this.method955(1, false);
        }
        this.method956(114);
        field2187++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V", line = 20)
    private final void method955(int arg0, boolean arg1) {
        field2184++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2186 = new int[2][4];
                this.field2186[0][1] = 0;
                this.field2186[0][0] = 0;
                this.field2186[1][0] = 4096;
                this.field2186[0][3] = 0;
                this.field2186[1][1] = 4096;
                this.field2186[0][2] = 0;
                this.field2186[1][2] = 4096;
                this.field2186[1][3] = 4096;
            } else if (arg0 == 2) {
                this.field2186 = new int[8][4];
                this.field2186[0][0] = 0;
                this.field2186[1][0] = 2867;
                this.field2186[2][0] = 3072;
                this.field2186[0][2] = 2602;
                this.field2186[3][0] = 3276;
                this.field2186[0][3] = 2361;
                this.field2186[1][3] = 1558;
                this.field2186[4][0] = 3481;
                this.field2186[5][0] = 3686;
                this.field2186[2][3] = 1413;
                this.field2186[3][3] = 947;
                this.field2186[4][3] = 722;
                this.field2186[6][0] = 3891;
                this.field2186[1][2] = 1799;
                this.field2186[7][0] = 4096;
                this.field2186[5][3] = 1766;
                this.field2186[2][2] = 1734;
                this.field2186[3][2] = 1220;
                this.field2186[4][2] = 963;
                this.field2186[5][2] = 2152;
                this.field2186[6][3] = 915;
                this.field2186[7][3] = 1140;
                this.field2186[0][1] = 2650;
                this.field2186[6][2] = 1060;
                this.field2186[1][1] = 2313;
                this.field2186[2][1] = 2618;
                this.field2186[3][1] = 2296;
                this.field2186[4][1] = 2072;
                this.field2186[7][2] = 1413;
                this.field2186[5][1] = 2730;
                this.field2186[6][1] = 2232;
                this.field2186[7][1] = 1686;
            } else if (arg0 == 3) {
                this.field2186 = new int[7][4];
                this.field2186[0][0] = 0;
                this.field2186[0][3] = 4096;
                this.field2186[1][3] = 4096;
                this.field2186[2][3] = 0;
                this.field2186[1][0] = 663;
                this.field2186[0][1] = 0;
                this.field2186[3][3] = 0;
                this.field2186[1][1] = 0;
                this.field2186[2][0] = 1363;
                this.field2186[2][1] = 0;
                this.field2186[4][3] = 0;
                this.field2186[5][3] = 4096;
                this.field2186[6][3] = 4096;
                this.field2186[3][0] = 2048;
                this.field2186[4][0] = 2727;
                this.field2186[5][0] = 3411;
                this.field2186[6][0] = 4096;
                this.field2186[3][1] = 4096;
                this.field2186[4][1] = 4096;
                this.field2186[5][1] = 4096;
                this.field2186[6][1] = 0;
                this.field2186[0][2] = 0;
                this.field2186[1][2] = 4096;
                this.field2186[2][2] = 4096;
                this.field2186[3][2] = 4096;
                this.field2186[4][2] = 0;
                this.field2186[5][2] = 0;
                this.field2186[6][2] = 0;
            } else if (arg0 == 4) {
                this.field2186 = new int[6][4];
                this.field2186[0][3] = 0;
                this.field2186[0][0] = 0;
                this.field2186[0][2] = 0;
                this.field2186[1][0] = 1843;
                this.field2186[1][2] = 0;
                this.field2186[2][2] = 0;
                this.field2186[1][3] = 1493;
                this.field2186[2][3] = 2939;
                this.field2186[3][3] = 3565;
                this.field2186[3][2] = 1124;
                this.field2186[4][3] = 4031;
                this.field2186[0][1] = 0;
                this.field2186[1][1] = 0;
                this.field2186[5][3] = 4096;
                this.field2186[4][2] = 3084;
                this.field2186[2][0] = 2457;
                this.field2186[2][1] = 0;
                this.field2186[3][0] = 2781;
                this.field2186[4][0] = 3481;
                this.field2186[3][1] = 0;
                this.field2186[4][1] = 546;
                this.field2186[5][2] = 4096;
                this.field2186[5][0] = 4096;
                this.field2186[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field2186 = new int[16][4];
                this.field2186[0][3] = 321;
                this.field2186[0][0] = 0;
                this.field2186[0][2] = 192;
                this.field2186[1][0] = 155;
                this.field2186[1][3] = 562;
                this.field2186[1][2] = 449;
                this.field2186[2][0] = 389;
                this.field2186[3][0] = 671;
                this.field2186[2][2] = 690;
                this.field2186[0][1] = 80;
                this.field2186[1][1] = 321;
                this.field2186[4][0] = 897;
                this.field2186[3][2] = 995;
                this.field2186[4][2] = 1397;
                this.field2186[2][1] = 578;
                this.field2186[2][3] = 803;
                this.field2186[5][0] = 1175;
                this.field2186[6][0] = 1368;
                this.field2186[5][2] = 1429;
                this.field2186[3][1] = 947;
                this.field2186[7][0] = 1507;
                this.field2186[4][1] = 1285;
                this.field2186[6][2] = 1461;
                this.field2186[8][0] = 1736;
                this.field2186[3][3] = 1140;
                this.field2186[9][0] = 2088;
                this.field2186[7][2] = 1525;
                this.field2186[4][3] = 1509;
                this.field2186[5][1] = 1525;
                this.field2186[6][1] = 1734;
                this.field2186[5][3] = 1413;
                this.field2186[8][2] = 1590;
                this.field2186[10][0] = 2355;
                this.field2186[9][2] = 2056;
                this.field2186[7][1] = 1413;
                this.field2186[11][0] = 2691;
                this.field2186[12][0] = 3031;
                this.field2186[6][3] = 1333;
                this.field2186[10][2] = 2586;
                this.field2186[11][2] = 3148;
                this.field2186[13][0] = 3522;
                this.field2186[14][0] = 3727;
                this.field2186[7][3] = 1702;
                this.field2186[8][1] = 1108;
                this.field2186[9][1] = 1766;
                this.field2186[10][1] = 2409;
                this.field2186[15][0] = 4096;
                this.field2186[12][2] = 3710;
                this.field2186[11][1] = 3116;
                this.field2186[13][2] = 3421;
                this.field2186[12][1] = 3806;
                this.field2186[13][1] = 3437;
                this.field2186[14][1] = 3116;
                this.field2186[15][1] = 2377;
                this.field2186[8][3] = 2056;
                this.field2186[9][3] = 2666;
                this.field2186[14][2] = 3148;
                this.field2186[15][2] = 2505;
                this.field2186[10][3] = 3276;
                this.field2186[11][3] = 3228;
                this.field2186[12][3] = 3196;
                this.field2186[13][3] = 3019;
                this.field2186[14][3] = 3228;
                this.field2186[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field2186 = new int[4][4];
                this.field2186[0][3] = 0;
                this.field2186[0][2] = 4096;
                this.field2186[1][3] = 0;
                this.field2186[0][1] = 0;
                this.field2186[2][3] = 0;
                this.field2186[3][3] = 0;
                this.field2186[0][0] = 2048;
                this.field2186[1][1] = 4096;
                this.field2186[1][0] = 2867;
                this.field2186[2][1] = 4096;
                this.field2186[1][2] = 4096;
                this.field2186[2][2] = 4096;
                this.field2186[3][1] = 4096;
                this.field2186[2][0] = 3276;
                this.field2186[3][2] = 0;
                this.field2186[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1) {
            field2189 = (class248) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 268)
    public class144() {
        super(1, false);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILwa;Z)V", line = 272)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field2194++;
        if (arg0 != 0) {
            return;
        }
        int var4 = arg1.method642((byte) -68);
        if (var4 != 0) {
            this.method955(var4, false);
            return;
        }
        this.field2186 = new int[arg1.method642((byte) -126)][4];
        for (int var5 = 0; var5 < this.field2186.length; var5++) {
            this.field2186[var5][0] = arg1.method576(1);
            this.field2186[var5][1] = arg1.method642((byte) -81) << 4;
            this.field2186[var5][2] = arg1.method642((byte) -63) << 4;
            this.field2186[var5][3] = arg1.method642((byte) -28) << 4;
        }
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)V", line = 316)
    private final void method956(int arg0) {
        field2191++;
        if (arg0 <= 95) {
            method960((byte) -28, -113);
        }
        int var2 = this.field2186.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field2186[var6][0]; var6++) {
                var4++;
            }
            int var11;
            int var12;
            int var13;
            if (var2 > var4) {
                int[] var7 = this.field2186[var4];
                if (var4 > 0) {
                    int[] var8 = this.field2186[var4 - 1];
                    int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                    int var10 = 4096 - var9;
                    var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                    var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                    var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                } else {
                    var12 = var7[1];
                    var11 = var7[3];
                    var13 = var7[2];
                }
            } else {
                int[] var14 = this.field2186[var2 - 1];
                var11 = var14[3];
                var13 = var14[2];
                var12 = var14[1];
            }
            int var15 = var12 >> 4;
            int var16 = var13 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var11 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2196[var3] = class240.method1652(var17, class240.method1652(var16 << 8, var15 << 16));
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 422)
    public static final void method957(boolean arg0) {
        class166.field2573 = 0;
        field2193++;
        if (!arg0) {
            method957(true);
        }
        int var1 = (class13.field221.field3962 >> 7) + class12.field157;
        int var2 = (class13.field221.field3972 >> 7) + class165.field2568;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class166.field2573 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class166.field2573 = 1;
        }
        if (class166.field2573 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class166.field2573 = 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)[[I", line = 458)
    public final int[][] method3(int arg0, int arg1) {
        field2185++;
        int[][] var3 = this.field4719.method2182((byte) 90, arg1);
        if (arg0 != -1) {
            this.method1(-71, (class82) null, false);
        }
        if (this.field4719.field5381) {
            int[] var4 = this.method1990(0, arg1, 32755);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class101.field1632; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2196[var9];
                var6[var8] = class4.method23(var10, 16711680) >> 12;
                var5[var8] = class4.method23(4080, var10 >> 4);
                var7[var8] = class4.method23(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V", line = 509)
    public static void method958(int arg0) {
        if (arg0 >= 7) {
            field2189 = null;
            field2190 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Z", line = 526)
    public static final boolean method959(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class136.field2086; var3++) {
            class101 var4 = class21.field296[var3];
            if (var4.field1637 == 1) {
                int var5 = var4.field1635 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1627 * var5 >> 8) + var4.field1633;
                    int var7 = (var4.field1623 * var5 >> 8) + var4.field1622;
                    int var8 = (var4.field1634 * var5 >> 8) + var4.field1616;
                    int var9 = (var4.field1638 * var5 >> 8) + var4.field1620;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1637 == 2) {
                int var10 = arg0 - var4.field1635;
                if (var10 > 0) {
                    int var11 = (var4.field1627 * var10 >> 8) + var4.field1633;
                    int var12 = (var4.field1623 * var10 >> 8) + var4.field1622;
                    int var13 = (var4.field1634 * var10 >> 8) + var4.field1616;
                    int var14 = (var4.field1638 * var10 >> 8) + var4.field1620;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1637 == 3) {
                int var15 = var4.field1633 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1621 * var15 >> 8) + var4.field1635;
                    int var17 = (var4.field1630 * var15 >> 8) + var4.field1617;
                    int var18 = (var4.field1634 * var15 >> 8) + var4.field1616;
                    int var19 = (var4.field1638 * var15 >> 8) + var4.field1620;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1637 == 4) {
                int var20 = arg2 - var4.field1633;
                if (var20 > 0) {
                    int var21 = (var4.field1621 * var20 >> 8) + var4.field1635;
                    int var22 = (var4.field1630 * var20 >> 8) + var4.field1617;
                    int var23 = (var4.field1634 * var20 >> 8) + var4.field1616;
                    int var24 = (var4.field1638 * var20 >> 8) + var4.field1620;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1637 == 5) {
                int var25 = arg1 - var4.field1616;
                if (var25 > 0) {
                    int var26 = (var4.field1621 * var25 >> 8) + var4.field1635;
                    int var27 = (var4.field1630 * var25 >> 8) + var4.field1617;
                    int var28 = (var4.field1627 * var25 >> 8) + var4.field1633;
                    int var29 = (var4.field1623 * var25 >> 8) + var4.field1622;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Lwl;", line = 651)
    public static final class89 method960(byte arg0, int arg1) {
        class89 var2 = (class89) class252.field4132.method1989((long) arg1, (byte) 121);
        field2195++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 70 % ((arg0 - 43) / 57);
        byte[] var4 = class132.field2000.method1889(4, (byte) -122, arg1);
        class89 var5 = new class89();
        if (var4 != null) {
            var5.method698(24559, new class82(var4), arg1);
        }
        class252.field4132.method1978((byte) -109, var5, (long) arg1);
        return var5;
    }
}
