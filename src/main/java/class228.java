import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class228 {

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[I")
    private int[] field3740;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    private int[] field3736;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Lkm;")
    private class59 field3733;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lkm;")
    private class59 field3739;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[Lkm;")
    private class59[] field3747;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3746 = 0;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Lph;")
    public static class229 field3742 = class266.method1858("T", 0);

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lph;")
    public static class229 field3750 = class266.method1858(" (X", 0);

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[[I")
    public static int[][] field3748 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lph;")
    public static class229 field3741 = class266.method1858("Chargement des textures )2 ", 0);

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public static int field3751 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Lsi;")
    public static class66 field3752;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3744;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLsi;IZLin;ZID)[I", line = 9)
    public final int[] method1585(byte arg0, class66 arg1, int arg2, boolean arg3, class106 arg4, boolean arg5, int arg6, double arg7) {
        int[] var10 = new int[arg2 * arg6];
        class107.method807(arg7, -93);
        field3731++;
        class225.field3706 = arg1;
        class298.field4845 = arg4;
        class176.method1268(arg6, false, arg2);
        for (int var11 = 0; var11 < this.field3747.length; var11++) {
            this.field3747[var11].method391(arg6, arg2, -256);
        }
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = 1;
            var14 = arg2;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3733.field841) {
                int[] var17 = this.field3733.method63(true, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field3733.method116(var16, 4588);
                var20 = var21[2];
                var19 = var21[1];
                var18 = var21[0];
            }
            if (arg5) {
                var15 = var16;
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var19[var22] >> 4;
                int var24 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class245.field4052[var23];
                int var26 = var20[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class245.field4052[var26];
                int var28 = class245.field4052[var24];
                var10[var15++] = (var28 << 16) + ((var25 << 8) + var27);
                if (arg5) {
                    var15 += arg2 - 1;
                }
            }
        }
        if (arg0 >= -65) {
            field3752 = (class66) null;
        }
        for (int var29 = 0; var29 < this.field3747.length; var29++) {
            this.field3747[var29].method398(105);
        }
        return var10;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIZ)V", line = 151)
    public static final void method1586(int arg0, int arg1, int arg2, boolean arg3) {
        field3749++;
        if (class265.field4462 != 0 && arg0 != 0 && class189.field3063 < 50 && arg2 != -1) {
            class262.field4376[class189.field3063] = arg2;
            class219.field3597[class189.field3063] = arg0;
            class153.field2484[class189.field3063] = arg1;
            class275.field4597[class189.field3063] = null;
            class165.field2700[class189.field3063] = 0;
            class189.field3063++;
        }
        if (arg3) {
            method1593(98);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z", line = 174)
    public static final boolean method1587(int arg0, int arg1) {
        field3745++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            if (arg1 != 31007) {
                field3748 = (int[][]) ((int[][]) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BIII)Z", line = 198)
    public static final boolean method1588(byte[] arg0, int arg1, int arg2, int arg3) {
        field3738++;
        boolean var4 = true;
        if (arg3 < 56) {
            method1592(96);
        }
        int var5 = -1;
        class164 var6 = new class164(arg0);
        label61: while (true) {
            int var7 = var6.method1154((byte) 86);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method1209(-128);
                    if (var11 == 0) {
                        continue label61;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var6.method1178(8) >> 2;
                    int var14 = var8 >> 6 & 0x3F;
                    int var15 = arg1 + var14;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class83 var17 = class260.method1807(false, var5);
                        if (var13 != 22 || class120.field2017 || var17.field1390 != 0 || var17.field1378 == 1 || var17.field1381) {
                            if (!var17.method610(-4)) {
                                var4 = false;
                                class295.field4828++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method1209(-128);
                if (var10 == 0) {
                    break;
                }
                var6.method1178(8);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lsi;Lin;I)Z", line = 288)
    public final boolean method1589(class66 arg0, class106 arg1, int arg2) {
        field3735++;
        if (class110.field1858 > 0) {
            for (int var4 = 0; var4 < this.field3740.length; var4++) {
                if (!arg0.method521(class110.field1858, true, this.field3740[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3740.length; var5++) {
                if (!arg0.method494(this.field3740[var5], false)) {
                    return false;
                }
            }
        }
        if (arg2 != -5726) {
            this.method1591(false, -71, 52, 111, -0.6591807197042779D, (class66) null, (class106) null);
        }
        for (int var6 = 0; var6 < this.field3736.length; var6++) {
            if (!arg1.method92(this.field3736[var6], arg2 ^ 0xFFFFE9A2)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 342)
    public static final void method1590(byte arg0) {
        field3732++;
        class139 var1 = new class139();
        if (arg0 != 121) {
            field3748 = (int[][]) ((int[][]) null);
        }
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class313.field5311[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIIIDLsi;Lin;)[B", line = 385)
    public final byte[] method1591(boolean arg0, int arg1, int arg2, int arg3, double arg4, class66 arg5, class106 arg6) {
        field3737++;
        class107.method807(arg4, 126);
        class298.field4845 = arg6;
        class225.field3706 = arg5;
        class176.method1268(arg3, false, arg2);
        for (int var9 = 0; var9 < this.field3747.length; var9++) {
            this.field3747[var9].method391(arg3, arg2, -256);
        }
        byte[] var10 = new byte[arg2 * 4 * arg3];
        if (arg1 != 2) {
            return (byte[]) null;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3733.field841) {
                int[] var13 = this.field3733.method63(true, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3733.method116(var12, 4588);
                var14 = var17[1];
                var15 = var17[0];
                var16 = var17[2];
            }
            int[] var18;
            if (this.field3739.field841) {
                var18 = this.field3739.method63(true, var12);
            } else {
                var18 = this.field3739.method116(var12, arg1 ^ 0x11EE)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var22 = var16[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class245.field4052[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                int var24 = class245.field4052[var22];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class245.field4052[var21];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var10[var11++] = (byte) var23;
                var10[var11++] = (byte) var25;
                var10[var11++] = (byte) var24;
                var10[var11++] = (byte) var26;
                if (arg0) {
                    var11 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3747.length; var27++) {
            this.field3747[var27].method398(105);
        }
        return var10;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 523)
    public static final void method1592(int arg0) {
        field3734++;
        if (class253.field4234 != null || class233.field3851 != null) {
            return;
        }
        int var1 = class209.field3459;
        if (class186.field3027) {
            if (var1 != 1) {
                int var6 = class118.field1985;
                int var7 = class220.field3617;
                if (var6 < class36.field595 - 10 || var6 > class108.field1845 + class36.field595 + 10 || (class304.field5078 - 10) > var7 || (class156.field2537 + class304.field5078 + 10) < var7) {
                    class186.field3027 = false;
                    class329.method2253(class108.field1845, false, class156.field2537, class36.field595, class304.field5078);
                }
            }
            if (var1 == 1) {
                int var8 = class36.field595;
                int var9 = class108.field1845;
                int var10 = class48.field697;
                int var11 = class304.field5078;
                int var12 = class220.field3613;
                int var13 = -1;
                for (int var14 = 0; var14 < class314.field5337; var14++) {
                    int var15 = var11 + ((class314.field5337 + -1 + -var14) * 15) + 31;
                    if (var10 > var8 && var10 < (var8 + var9) && (var15 - 13) < var12 && (var15 + 3) > var12) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class108.method832(var13, 0);
                }
                class186.field3027 = false;
                class329.method2253(class108.field1845, false, class156.field2537, class36.field595, class304.field5078);
            }
        } else {
            if (var1 == 1 && class314.field5337 > 0) {
                short var2 = class53.field748[class314.field5337 - 1];
                if (var2 == 29 || var2 == 4 || var2 == 59 || var2 == 26 || var2 == 51 || var2 == 44 || var2 == 24 || var2 == 39 || var2 == 31 || var2 == 16 || var2 == 30 || var2 == 1001) {
                    int var3 = class255.field4263[class314.field5337 - 1];
                    int var4 = class293.field4788[class314.field5337 - 1];
                    class301 var5 = class206.method1440(var4, (byte) -68);
                    if (class263.method1833(client.method2168(var5), -128) || class95.method709(658667091, client.method2168(var5))) {
                        class118.field1987 = 0;
                        class65.field997 = false;
                        if (class253.field4234 != null) {
                            class296.method2006(class253.field4234, 120);
                        }
                        class253.field4234 = class206.method1440(var4, (byte) -68);
                        class108.field1821 = class48.field697;
                        class244.field4032 = class220.field3613;
                        class8.field105 = var3;
                        class296.method2006(class253.field4234, 122);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class256.field4270 == 1 && class314.field5337 > 2 || class24.method151(-124, class314.field5337 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class314.field5337 > 0 || class145.field2351 == 1) {
                class181.method1288(false);
            }
            if (var1 == 1 && class314.field5337 > 0 || class145.field2351 == 2) {
                class30.method237((byte) -57);
            }
        }
        if (arg0 > -67) {
            method1592(87);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 660)
    public class228() {
        this.field3740 = new int[0];
        this.field3736 = new int[0];
        this.field3733 = new class185();
        this.field3733.field839 = 1;
        this.field3739 = new class185();
        this.field3747 = new class59[] { this.field3733, this.field3739 };
        this.field3739.field839 = 1;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lhb;)V", line = 680)
    public class228(class164 arg0) {
        int var2 = arg0.method1178(8);
        int var3 = 0;
        this.field3747 = new class59[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class59 var7 = class301.method2036(-2, arg0);
            if (var7.method390(-66) >= 0) {
                var3++;
            }
            if (var7.method399((byte) 86) >= 0) {
                var4++;
            }
            int var8 = var7.field833.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1178(8);
            }
            this.field3747[var6] = var7;
        }
        this.field3740 = new int[var3];
        this.field3736 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class59 var13 = this.field3747[var12];
            int var14 = var13.field833.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field833[var15] = this.field3747[var5[var12][var15]];
            }
            int var16 = var13.method390(-108);
            int var17 = var13.method399((byte) 91);
            if (var16 > 0) {
                this.field3740[var10++] = var16;
            }
            if (var17 > 0) {
                this.field3736[var11++] = var17;
            }
            var5[var12] = null;
        }
        this.field3733 = this.field3747[arg0.method1178(8)];
        int[][] var18 = (int[][]) null;
        this.field3739 = this.field3747[arg0.method1178(8)];
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 770)
    public static void method1593(int arg0) {
        if (arg0 != 1) {
            field3744 = (FontMetrics) null;
        }
        field3752 = null;
        field3748 = (int[][]) null;
        field3742 = null;
        field3750 = null;
        field3741 = null;
        field3744 = null;
    }
}
