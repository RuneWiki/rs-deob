import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class13 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lgd;")
    public static class325 field286 = new class325(20);

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static volatile int field300 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lpk;")
    public static class120 field284;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lsn;")
    public class5 field295;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    public int[] field281;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public int[] field282;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[I")
    public int[] field285;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
    public int[] field287;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public int[] field298;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
    public int[] field299;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "[Lsn;")
    public class5[] field280;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[[I")
    public int[][] field288;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[[I")
    public int[][] field294;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 14)
    public static final void method175(int arg0) {
        field290++;
        int var1 = class37.field554;
        int var2 = class315.field4968;
        int var3 = class99.field1591;
        int var4 = class326.field5096;
        int var5 = 6116423;
        if (class162.field2623) {
            class114.method887(var1, var2, var3, var4, var5);
            class114.method887(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class114.method897(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class33.method288(var1, var2, var3, var4, var5);
            class33.method288(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class33.method293(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        }
        class146.field2392.method1480(class307.field4872, var1 + 3, var2 + 14, var5, -1);
        int var6 = class303.field4832;
        int var7 = class22.field389;
        for (int var8 = 0; var8 < class137.field2225; var8++) {
            int var9 = 16777215;
            int var10 = var2 + ((class137.field2225 - (var8 + 1)) * 15) + 31;
            if (var1 < var6 && var1 + var3 > var6 && var7 > (var10 - 13) && (var10 + 3) > var7) {
                var9 = 16776960;
            }
            class146.field2392.method1480(class71.method574(97, var8), var1 + 3, var10, var9, 0);
        }
        if (arg0 != -12081) {
            method175(76);
        }
        class280.method1972(class37.field554, class315.field4968, (byte) 107, class326.field5096, class99.field1591);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 73)
    public static void method176(int arg0) {
        if (arg0 == -6) {
            field286 = null;
            field284 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZII)V", line = 87)
    public static final void method177(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field289++;
        if (arg4 >= class310.field4897 && class180.field2862 >= arg4) {
            int var5 = class10.method151(class333.field5188, arg0, 122, class104.field1719);
            int var6 = class10.method151(class333.field5188, arg1, 114, class104.field1719);
            class141.method1083(var6, arg3, var5, arg4, (byte) -102);
        }
        if (arg2) {
            field286 = (class325) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lnj;", line = 104)
    public static final class241 method178(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class241 var4 = var3.field655;
            var3.field655 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BZ)V", line = 116)
    private final void method179(byte[] arg0, boolean arg1) {
        field279++;
        class1 var3 = new class1(class266.method1834(arg0, 1));
        int var4 = var3.method15((byte) -98);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 < 6) {
            this.field291 = 0;
        } else {
            this.field291 = var3.method33(false);
        }
        int var6 = var3.method15((byte) 94);
        this.field296 = var3.method56(19612);
        int var7 = -1;
        this.field282 = new int[this.field296];
        for (int var8 = 0; var8 < this.field296; var8++) {
            this.field282[var8] = var5 += var3.method56(19612);
            if (this.field282[var8] > var7) {
                var7 = this.field282[var8];
            }
        }
        this.field293 = var7 + 1;
        this.field285 = new int[this.field293];
        this.field287 = new int[this.field293];
        this.field299 = new int[this.field293];
        this.field294 = new int[this.field293][];
        this.field281 = new int[this.field293];
        if (var6 != 0) {
            this.field298 = new int[this.field293];
            for (int var9 = 0; var9 < this.field293; var9++) {
                this.field298[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field296; var10++) {
                this.field298[this.field282[var10]] = var3.method33(false);
            }
            this.field295 = new class5(this.field298);
        }
        for (int var11 = 0; var11 < this.field296; var11++) {
            this.field287[this.field282[var11]] = var3.method33(arg1);
        }
        for (int var12 = 0; var12 < this.field296; var12++) {
            this.field299[this.field282[var12]] = var3.method33(arg1);
        }
        for (int var13 = 0; var13 < this.field296; var13++) {
            this.field285[this.field282[var13]] = var3.method56(19612);
        }
        if (arg1) {
            method175(84);
        }
        for (int var14 = 0; var14 < this.field296; var14++) {
            int var15 = this.field282[var14];
            int var16 = 0;
            int var17 = this.field285[var15];
            int var18 = -1;
            this.field294[var15] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field294[var15][var19] = var16 += var3.method56(19612);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field281[var15] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field294[var15] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field280 = new class5[var7 + 1];
        this.field288 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field296; var21++) {
            int var22 = this.field282[var21];
            int var23 = this.field285[var22];
            this.field288[var22] = new int[this.field281[var22]];
            for (int var24 = 0; var24 < this.field281[var22]; var24++) {
                this.field288[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field294[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field294[var22][var25];
                }
                this.field288[var22][var26] = var3.method33(arg1);
            }
            this.field280[var22] = new class5(this.field288[var22]);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 296)
    public static final void method180(byte arg0) {
        boolean var1 = true;
        field292++;
        class117.method920(false, 25);
        class68.field1030 = 0;
        for (int var2 = 0; var2 < class14.field307.length; var2++) {
            if (class305.field4853[var2] != -1 && class14.field307[var2] == null) {
                class14.field307[var2] = class200.field3062.method967(class305.field4853[var2], 0, class85.method677(arg0, -65359));
                if (class14.field307[var2] == null) {
                    class68.field1030++;
                    var1 = false;
                }
            }
            if (class274.field4293[var2] != -1 && class115.field1862[var2] == null) {
                class115.field1862[var2] = class200.field3062.method936(class245.field3658[var2], class274.field4293[var2], 0, -2);
                if (class115.field1862[var2] == null) {
                    var1 = false;
                    class68.field1030++;
                }
            }
            if (class162.field2623) {
                if (class172.field2756[var2] != -1 && class126.field2020[var2] == null) {
                    class126.field2020[var2] = class200.field3062.method967(class172.field2756[var2], 0, 65280);
                    if (class126.field2020[var2] == null) {
                        class68.field1030++;
                        var1 = false;
                    }
                }
                if (class180.field2867[var2] != -1 && class338.field5222[var2] == null) {
                    class338.field5222[var2] = class200.field3062.method967(class180.field2867[var2], 0, 65280);
                    if (class338.field5222[var2] == null) {
                        var1 = false;
                        class68.field1030++;
                    }
                }
            }
            if (class67.field1017 != null && class15.field318[var2] == null && class67.field1017[var2] != -1) {
                class15.field318[var2] = class200.field3062.method936(class245.field3658[var2], class67.field1017[var2], 0, -2);
                if (class15.field318[var2] == null) {
                    class68.field1030++;
                    var1 = false;
                }
            }
        }
        if (class320.field5013 == null) {
            if (class37.field556 == null || !class73.field1113.method943(true, class37.field556.field1470 + "_labels")) {
                class320.field5013 = new class109(0);
            } else if (class73.field1113.method951(0, class37.field556.field1470 + "_labels")) {
                class320.field5013 = class327.method2300(class73.field1113, true, class37.field556.field1470 + "_labels");
            } else {
                class68.field1030++;
                var1 = false;
            }
        }
        if (!var1) {
            class270.field4168 = 1;
            return;
        }
        boolean var3 = true;
        class174.field2786 = 0;
        for (int var4 = 0; var4 < class14.field307.length; var4++) {
            byte[] var5 = class115.field1862[var4];
            if (var5 != null) {
                int var6 = (class338.field5218[var4] >> 8) * 64 - class117.field1902;
                int var7 = (class338.field5218[var4] & 0xFF) * 64 - class133.field2118;
                if (class208.field3279) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class331.method2328((byte) 60, var7, var5, var6);
            }
            if (class162.field2623) {
                byte[] var8 = class338.field5222[var4];
                if (var8 != null) {
                    int var9 = (class338.field5218[var4] >> 8) * 64 - class117.field1902;
                    int var10 = (class338.field5218[var4] & 0xFF) * 64 - class133.field2118;
                    if (class208.field3279) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class331.method2328((byte) 98, var10, var8, var9);
                }
            }
        }
        if (!var3) {
            class270.field4168 = 2;
            return;
        }
        boolean var11 = false;
        if (class270.field4168 != 0) {
            class121.method968(class244.field3655 + "<br>(100%)", (byte) 110, true);
        }
        class178.method1310(16);
        class242.method1714(false);
        if (class162.field2623 && class154.field2511) {
            for (int var12 = 0; var12 < class14.field307.length; var12++) {
                if (class338.field5222[var12] != null || class126.field2020[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class314.method2217(4, 104, 104, class162.field2623 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class166.field2686[var13].method437(false);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class332.field5184[var14][var15][var16] = 0;
                }
            }
        }
        class201.method1434(false, (byte) -128);
        if (class162.field2623) {
            class295.field4716.method1355();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class295.field4713[var17][var18].field3349 = true;
                }
            }
        }
        if (class162.field2623) {
            class219.method1585();
        }
        if (class162.field2623) {
            class67.method537(-28372);
        }
        class178.method1310(16);
        System.gc();
        class117.method920(true, 25);
        class149.method1130(false, 103);
        if (!class208.field3279) {
            class90.method715(false, true);
            class117.method920(true, arg0 ^ 0xFFFFFFA8);
            if (class162.field2623) {
                int var19 = class345.field5363.field4643[0] >> 3;
                int var20 = class345.field5363.field4619[0] >> 3;
                class47.method408(var20, (byte) 35, var19);
            }
            class141.method1086((byte) 39, false);
            if (class15.field318 != null) {
                class53.method441((byte) 50);
            }
        }
        if (class208.field3279) {
            class129.method1002(false, (byte) -124);
            class117.method920(true, 25);
            if (class162.field2623) {
                int var21 = class345.field5363.field4643[0] >> 3;
                int var22 = class345.field5363.field4619[0] >> 3;
                class47.method408(var22, (byte) 35, var21);
            }
            class272.method1943((byte) 105, false);
        }
        class242.method1714(false);
        if (arg0 != -79) {
            return;
        }
        class117.method920(true, 25);
        class301.method2126(class166.field2686, false, class208.field3279 ? class174.field2795 : (int[][][]) null, 128);
        if (class162.field2623) {
            class219.method1596();
        }
        class117.method920(true, 25);
        int var23 = class116.field1885;
        if (var23 > class75.field1153) {
            var23 = class75.field1153;
        }
        if (class75.field1153 - 1 > var23) {
            int var24 = class75.field1153 - 1;
        }
        if (class53.method450(2)) {
            class266.method1836(0);
        } else {
            class266.method1836(class116.field1885);
        }
        class103.method835(-6251);
        if (class162.field2623 && var11) {
            class124.method982(true);
            class149.method1130(true, 79);
            if (!class208.field3279) {
                class90.method715(true, true);
                class117.method920(true, 25);
                class141.method1086((byte) 97, true);
            }
            if (class208.field3279) {
                class129.method1002(true, (byte) -128);
                class117.method920(true, 25);
                class272.method1943((byte) 118, true);
            }
            class242.method1714(false);
            class117.method920(true, 25);
            class301.method2126(class166.field2686, true, class208.field3279 ? class174.field2795 : (int[][][]) null, arg0 ^ 0xFFFFFF31);
            class117.method920(true, 25);
            class103.method835(arg0 - 6172);
            class124.method982(false);
        }
        if (class162.field2623) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class295.field4713[var25][var26].method1560(class85.field1374[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class63.method504(var28, var27, true);
            }
        }
        class99.method799(126);
        class178.method1310(16);
        class90.method714((byte) -112);
        class242.method1714(false);
        class241.field3607 = false;
        if (class162.field2623) {
            class62.method500(true, true);
        }
        if (class139.field2247 != null && class319.field5005 != null && class289.field4548 == 25) {
            class247.field3677++;
            class209.field3305.method1808((byte) -74, 247);
            class209.field3305.method11(1057001181, 31932);
        }
        if (!class208.field3279) {
            int var29 = (class211.field3316 - 6) / 8;
            int var30 = (class211.field3316 + 6) / 8;
            int var31 = (client.field4119 - 6) / 8;
            int var32 = (client.field4119 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var29 > var33 || var33 > var30 || var31 > var34 || var34 > var32) {
                        class200.field3062.method938((byte) 117, "m" + var33 + "_" + var34);
                        class200.field3062.method938((byte) 77, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class289.field4548 == 28) {
            class117.method921((byte) -127, 10);
        } else {
            class117.method921((byte) 31, 30);
            if (class319.field5005 != null) {
                class209.field3305.method1808((byte) -74, 211);
            }
        }
        class47.method406(arg0 ^ 0x7911);
        class178.method1310(arg0 ^ 0xFFFFFFA1);
        class166.method1241(2);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([BI)V", line = 805)
    public class13(byte[] arg0, int arg1) {
        this.field283 = class233.method1680(-84, arg0, arg0.length);
        if (this.field283 != arg1) {
            throw new RuntimeException();
        }
        this.method179(arg0, false);
    }
}
