import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class68 {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[I")
    private int[] field956;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    private int[] field955;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Leg;")
    private class286 field957;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Leg;")
    private class286 field952;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[Leg;")
    private class286[] field967;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lbe;")
    private static class283 field953 = class153.method941(126, "Type");

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lbe;")
    public static class283 field961 = class153.method941(11, "lila:");

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lbe;")
    public static class283 field969 = field953;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[[S")
    public static short[][] field962 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lbe;")
    public static class283 field963 = class153.method941(-73, "hint_mapedge");

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Loh;")
    public static class15 field966 = new class15(64);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[Lqb;")
    public static class95[] field970;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 6)
    public static final void method429(int arg0) {
        field951++;
        int var1 = class240.field4056.method1656(class301.field5076);
        for (int var2 = 0; var2 < class42.field589; var2++) {
            int var3 = class240.field4056.method1656(class183.method1207(var2, (byte) -92));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        int var4 = class42.field589 * 15 + 21;
        var1 += 8;
        int var5 = class262.field4447;
        if (var4 + var5 > class48.field655) {
            var5 = class48.field655 - var4;
        }
        if (arg0 != 15303) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class194.field3320 - var1 / 2;
        if (var1 + var6 > class115.field1945) {
            var6 = class115.field1945 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class47.field648 == 1) {
            if (class217.field3681 == class194.field3320 && class262.field4447 == class174.field3008) {
                class31.field473 = class42.field589 * 15 + 22;
                class87.field1472 = var5;
                class47.field648 = 0;
                class47.field653 = var1;
                class2.field14 = var6;
                class306.field5253 = true;
            }
        } else if (class47.field647 == class194.field3320 && class269.field4537 == class262.field4447) {
            class87.field1472 = var5;
            class47.field648 = 0;
            class306.field5253 = true;
            class2.field14 = var6;
            class47.field653 = var1;
            class31.field473 = class42.field589 * 15 + 22;
        } else {
            class217.field3681 = class47.field647;
            class47.field648 = 1;
            class174.field3008 = class269.field4537;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 110)
    public static final void method430(byte arg0) {
        field960++;
        int var1 = (class213.field3624.field1210 >> 7) + class107.field1833;
        int var2 = (class213.field3624.field1193 >> 7) + class214.field3637;
        if (arg0 != 92) {
            method429(-71);
        }
        class37.field539 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class37.field539 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class37.field539 = 1;
        }
        if (class37.field539 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class37.field539 = 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZLek;Lfd;D)[B", line = 139)
    public final byte[] method431(int arg0, int arg1, int arg2, boolean arg3, class172 arg4, class230 arg5, double arg6) {
        field958++;
        byte[] var9 = new byte[arg0 * arg1 * 4];
        class1.method4(arg6, (byte) 107);
        class237.field3964 = arg4;
        class34.field515 = arg5;
        class138.method857(arg1, arg0, -117);
        for (int var10 = 0; var10 < this.field967.length; var10++) {
            this.field967[var10].method1962(-256, arg1, arg0);
        }
        int var11 = 0;
        if (arg2 > -29) {
            method432((byte) 91);
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field957.field4876) {
                int[] var13 = this.field957.method14(-85, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field957.method16(var12, (byte) -19);
                var16 = var17[0];
                var15 = var17[2];
                var14 = var17[1];
            }
            int[] var18;
            if (this.field952.field4876) {
                var18 = this.field952.method14(-104, var12);
            } else {
                var18 = this.field952.method16(var12, (byte) -19)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = class287.field4885[var20];
                int var22 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class287.field4885[var22];
                int var24 = var14[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class287.field4885[var24];
                int var26;
                if (var21 == 0 && var25 == 0 && var23 == 0) {
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
                var9[var11++] = (byte) var21;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var26;
                if (arg3) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field967.length; var27++) {
            this.field967[var27].method536(-103);
        }
        return var9;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 286)
    public static void method432(byte arg0) {
        if (arg0 != -5) {
            method435(-71);
        }
        field961 = null;
        field963 = null;
        field953 = null;
        field970 = null;
        field962 = (short[][]) null;
        field966 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 326)
    public class68() {
        this.field956 = new int[0];
        this.field955 = new int[0];
        this.field957 = new class45();
        this.field957.field4869 = 1;
        this.field952 = new class45();
        this.field952.field4869 = 1;
        this.field967 = new class286[] { this.field957, this.field952 };
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lfd;Lek;I)Z", line = 344)
    public final boolean method433(class230 arg0, class172 arg1, int arg2) {
        field959++;
        for (int var4 = 0; var4 < this.field955.length; var4++) {
            if (!arg1.method1109((byte) -108, this.field955[var4])) {
                return false;
            }
        }
        for (int var5 = arg2; var5 < this.field956.length; var5++) {
            if (!arg0.method639(this.field956[var5], 255)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLek;IZBDLfd;)[I", line = 375)
    public final int[] method434(int arg0, boolean arg1, class172 arg2, int arg3, boolean arg4, byte arg5, double arg6, class230 arg7) {
        field965++;
        if (arg5 != 76) {
            method432((byte) -65);
        }
        class1.method4(arg6, (byte) 98);
        class34.field515 = arg7;
        int[] var10 = new int[arg0 * arg3];
        class237.field3964 = arg2;
        class138.method857(arg0, arg3, 82);
        for (int var11 = 0; var11 < this.field967.length; var11++) {
            this.field967[var11].method1962(-256, arg0, arg3);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var14 = -1;
            var12 = arg0 - 1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = arg0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field957.field4876) {
                int[] var17 = this.field957.method14(-64, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field957.method16(var16, (byte) -19);
                var20 = var21[0];
                var19 = var21[2];
                var18 = var21[1];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var19[var22] >> 4;
                int var25 = var18[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = class287.field4885[var23];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class287.field4885[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class287.field4885[var24];
                var10[var15++] = (var26 << 16) + (var27 << 8) + var28;
                if (arg1) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field967.length; var29++) {
            this.field967[var29].method536(-80);
        }
        return var10;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 509)
    public static final void method435(int arg0) {
        field968++;
        if (class195.field3332 != null) {
            return;
        }
        int var1 = 2 % ((arg0 - 23) / 33);
        if (class20.field274 != null) {
            return;
        }
        int var2 = class61.field859;
        if (class306.field5253) {
            if (var2 != 1) {
                int var7 = class109.field1849;
                int var8 = class163.field2700;
                if ((class2.field14 - 10) > var7 || (class47.field653 + class2.field14 + 10) < var7 || (class87.field1472 - 10) > var8 || var8 > class87.field1472 + class31.field473 + 10) {
                    class306.field5253 = false;
                    class277.method1849(class47.field653, 1, class2.field14, class87.field1472, class31.field473);
                }
            }
            if (var2 == 1) {
                int var9 = class2.field14;
                int var10 = class87.field1472;
                int var11 = class47.field647;
                int var12 = -1;
                int var13 = class47.field653;
                int var14 = class269.field4537;
                for (int var15 = 0; var15 < class42.field589; var15++) {
                    int var16 = (class42.field589 - var15 - 1) * 15 + var10 + 31;
                    if (var9 < var11 && var9 + var13 > var11 && (var16 - 13) < var14 && var14 < var16 + 3) {
                        var12 = var15;
                    }
                }
                if (var12 != -1) {
                    class141.method889(121, var12);
                }
                class306.field5253 = false;
                class277.method1849(class47.field653, 1, class2.field14, class87.field1472, class31.field473);
            }
            return;
        }
        if (var2 == 1 && class42.field589 > 0) {
            short var3 = class110.field1868[class42.field589 - 1];
            if (var3 == 58 || var3 == 8 || var3 == 15 || var3 == 40 || var3 == 11 || var3 == 50 || var3 == 12 || var3 == 16 || var3 == 32 || var3 == 23 || var3 == 29 || var3 == 1001) {
                int var4 = class135.field2257[class42.field589 - 1];
                int var5 = class215.field3647[class42.field589 - 1];
                class69 var6 = class65.method418(-8429, var5);
                if (class65.method413(client.method1601(var6), -66) || class111.method732(-1, client.method1601(var6))) {
                    class124.field2066 = false;
                    class72.field1276 = 0;
                    if (class195.field3332 != null) {
                        class272.method1834(class195.field3332, 0);
                    }
                    class195.field3332 = class65.method418(-8429, var5);
                    class134.field2242 = var4;
                    class114.field1918 = class269.field4537;
                    class291.field4932 = class47.field647;
                    class272.method1834(class195.field3332, 0);
                    return;
                }
            }
        }
        if (var2 == 1 && (class61.field856 == 1 && class42.field589 > 2 || class77.method502(class42.field589 - 1, true))) {
            var2 = 2;
        }
        if (var2 == 2 && class42.field589 > 0 || class47.field648 == 1) {
            method429(15303);
        }
        if (var2 == 1 && class42.field589 > 0 || class47.field648 == 2) {
            class49.method287(15);
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lfe;)V", line = 637)
    public class68(class229 arg0) {
        int var2 = 0;
        int var3 = arg0.method1535((byte) 115);
        int var4 = 0;
        this.field967 = new class286[var3];
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class286 var7 = class200.method1287(arg0, 0);
            if (var7.method1222(-128) >= 0) {
                var4++;
            }
            if (var7.method537(-24963) >= 0) {
                var2++;
            }
            int var8 = var7.field4880.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1535((byte) 122);
            }
            this.field967[var6] = var7;
        }
        this.field956 = new int[var2];
        int var10 = 0;
        this.field955 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class286 var13 = this.field967[var12];
            int var14 = var13.field4880.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4880[var15] = this.field967[var5[var12][var15]];
            }
            int var16 = var13.method1222(-127);
            int var17 = var13.method537(-24963);
            if (var16 > 0) {
                this.field955[var11++] = var16;
            }
            if (var17 > 0) {
                this.field956[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field957 = this.field967[arg0.method1535((byte) 110)];
        int[][] var18 = (int[][]) null;
        this.field952 = this.field967[arg0.method1535((byte) 80)];
    }
}
