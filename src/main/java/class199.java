import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class199 {

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3209 = 3353893;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "J")
    public static long field3217 = 0L;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lac;")
    public class146 field3216;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3204;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public int[] field3196;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    public int[] field3197;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[I")
    public int[] field3200;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
    public int[] field3203;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
    public int[] field3207;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "[I")
    public int[] field3208;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[Lac;")
    public class146[] field3206;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[[I")
    public int[][] field3211;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "[[I")
    public int[][] field3213;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)V")
    private final void method1339(byte[] arg0, int arg1) {
        field3214++;
        class264 var3 = new class264(class98.method698(-100, arg0));
        int var4 = var3.method1779(-128);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3205 = 0;
        } else {
            this.field3205 = var3.method1765((byte) 121);
        }
        int var5 = var3.method1779(-113);
        int var6 = 0;
        int var7 = -1;
        this.field3218 = var3.method1777(-85);
        this.field3197 = new int[this.field3218];
        for (int var8 = 0; var8 < this.field3218; var8++) {
            this.field3197[var8] = var6 += var3.method1777(-84);
            if (var7 < this.field3197[var8]) {
                var7 = this.field3197[var8];
            }
        }
        if (arg1 > -11) {
            return;
        }
        this.field3201 = var7 + 1;
        this.field3203 = new int[this.field3201];
        this.field3207 = new int[this.field3201];
        this.field3213 = new int[this.field3201][];
        this.field3196 = new int[this.field3201];
        this.field3208 = new int[this.field3201];
        if (var5 != 0) {
            this.field3200 = new int[this.field3201];
            for (int var9 = 0; var9 < this.field3201; var9++) {
                this.field3200[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3218; var10++) {
                this.field3200[this.field3197[var10]] = var3.method1765((byte) 97);
            }
            this.field3216 = new class146(this.field3200);
        }
        for (int var11 = 0; var11 < this.field3218; var11++) {
            this.field3208[this.field3197[var11]] = var3.method1765((byte) 117);
        }
        for (int var12 = 0; var12 < this.field3218; var12++) {
            this.field3207[this.field3197[var12]] = var3.method1765((byte) 111);
        }
        for (int var13 = 0; var13 < this.field3218; var13++) {
            this.field3203[this.field3197[var13]] = var3.method1777(-112);
        }
        for (int var14 = 0; var14 < this.field3218; var14++) {
            int var21 = 0;
            int var22 = this.field3197[var14];
            int var23 = -1;
            int var24 = this.field3203[var22];
            this.field3213[var22] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field3213[var22][var25] = var21 += var3.method1777(-91);
                if (var23 < var26) {
                    var23 = var26;
                }
            }
            this.field3196[var22] = var23 + 1;
            if (var23 + 1 == var24) {
                this.field3213[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3211 = new int[var7 + 1][];
        this.field3206 = new class146[var7 + 1];
        for (int var15 = 0; var15 < this.field3218; var15++) {
            int var16 = this.field3197[var15];
            int var17 = this.field3203[var16];
            this.field3211[var16] = new int[this.field3196[var16]];
            for (int var18 = 0; var18 < this.field3196[var16]; var18++) {
                this.field3211[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3213[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3213[var16][var19];
                }
                this.field3211[var16][var20] = var3.method1765((byte) 101);
            }
            this.field3206[var16] = new class146(this.field3211[var16]);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
    public static final boolean method1340(int arg0) {
        field3202++;
        int var1 = -62 % ((arg0 + 29) / 58);
        if (class256.field4096) {
            try {
                if ((Boolean) class27.method184((byte) 89, "showingVideoAd", class250.field4006.field4090)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjj;)Lda;")
    public static final class107 method1341(int arg0, int arg1, class134 arg2) {
        field3212++;
        byte[] var3 = arg2.method939(true, arg0);
        if (var3 == null) {
            return null;
        } else if (arg1 == -1) {
            return new class107(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILeb;)V")
    public static final void method1342(int arg0, int arg1, int arg2, class103 arg3) {
        field3198++;
        if (arg2 != 3) {
            return;
        }
        if (arg3.field1554 == 1) {
            class38.method301(0, arg3.field1703, "", (short) 45, -1, arg2 + 54, 0L, arg3.field1659);
            class85.field1172++;
        }
        if (arg3.field1554 == 2 && !class290.field4632) {
            String var4 = class262.method1717(arg3, 124);
            if (var4 != null) {
                class268.field4347++;
                class38.method301(-1, var4, "<col=00ff00>" + arg3.field1710, (short) 47, -1, 63, 0L, arg3.field1659);
            }
        }
        if (arg3.field1554 == 3) {
            class38.method301(0, class51.field723, "", (short) 19, -1, 115, 0L, arg3.field1659);
            class129.field2145++;
        }
        if (arg3.field1554 == 4) {
            class81.field1124++;
            class38.method301(0, arg3.field1703, "", (short) 35, -1, 93, 0L, arg3.field1659);
        }
        if (arg3.field1554 == 5) {
            class228.field3623++;
            class38.method301(0, arg3.field1703, "", (short) 38, -1, 120, 0L, arg3.field1659);
        }
        if (arg3.field1554 == 6 && class247.field3969 == null) {
            class38.method301(-1, arg3.field1703, "", (short) 18, -1, arg2 ^ 0x68, 0L, arg3.field1659);
            class58.field816++;
        }
        if (arg3.field1655 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1626; var6++) {
                for (int var7 = 0; var7 < arg3.field1597; var7++) {
                    int var8 = (arg3.field1555 + 32) * var6;
                    int var9 = (arg3.field1569 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg3.field1566[var5];
                        var8 += arg3.field1662[var5];
                    }
                    if (arg0 >= var9 && var8 <= arg1 && (var9 + 32) > arg0 && (var8 + 32) > arg1) {
                        class269.field4360 = var5;
                        class230.field3654 = arg3;
                        if (arg3.field1547[var5] > 0) {
                            class29 var10 = client.method1511(arg3);
                            class208 var11 = class64.method514(arg3.field1547[var5] - 1, 0);
                            if (class262.field4151 == 1 && var10.method191(-2061)) {
                                if (class42.field496 != arg3.field1659 || class85.field1157 != var5) {
                                    class38.method301(var5, class46.field556, class74.field1010 + " -> <col=ff9040>" + var11.field3358, (short) 50, -1, arg2 + 90, (long) var11.field3428, arg3.field1659);
                                    class281.field4500++;
                                }
                            } else if (class290.field4632 && var10.method191(-2061)) {
                                class19 var12 = class274.field4429 == -1 ? null : class18.method129(11, class274.field4429);
                                if ((class125.field2098 & 0x10) != 0 && (var12 == null || var11.method1406(var12.field222, class274.field4429, false) != var12.field222)) {
                                    class38.method301(var5, class117.field1995, class21.field268 + " -> <col=ff9040>" + var11.field3358, (short) 46, class17.field201, 112, (long) var11.field3428, arg3.field1659);
                                    class6.field80++;
                                }
                            } else {
                                class288.field4615++;
                                String[] var13 = var11.field3387;
                                if (class71.field976) {
                                    var13 = class143.method969(var13, (byte) 85);
                                }
                                if (var10.method191(-2061)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class166.field2707++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 57;
                                            } else {
                                                var15 = 43;
                                            }
                                            class38.method301(var5, var13[var14], "<col=ff9040>" + var11.field3358, var15, -1, 111, (long) var11.field3428, arg3.field1659);
                                        }
                                    }
                                }
                                if (var10.method199((byte) 111)) {
                                    class38.method301(var5, class46.field556, "<col=ff9040>" + var11.field3358, (short) 26, class38.field466, arg2 ^ 0x73, (long) var11.field3428, arg3.field1659);
                                    class237.field3787++;
                                }
                                if (var10.method191(-2061) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class266.field4314++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 11;
                                            }
                                            if (var16 == 1) {
                                                var17 = 37;
                                            }
                                            if (var16 == 2) {
                                                var17 = 32;
                                            }
                                            class38.method301(var5, var13[var16], "<col=ff9040>" + var11.field3358, var17, -1, arg2 ^ 0x57, (long) var11.field3428, arg3.field1659);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field1708;
                                if (class71.field976) {
                                    var18 = class143.method969(var18, (byte) 85);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class113.field1938++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 39;
                                            }
                                            if (var19 == 1) {
                                                var20 = 17;
                                            }
                                            if (var19 == 2) {
                                                var20 = 44;
                                            }
                                            if (var19 == 3) {
                                                var20 = 8;
                                            }
                                            if (var19 == 4) {
                                                var20 = 25;
                                            }
                                            class38.method301(var5, var18[var19], "<col=ff9040>" + var11.field3358, var20, -1, 92, (long) var11.field3428, arg3.field1659);
                                        }
                                    }
                                }
                                class38.method301(var5, class45.field543, "<col=ff9040>" + var11.field3358, (short) 1002, class227.field3593, 113, (long) var11.field3428, arg3.field1659);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field1603) {
            return;
        }
        if (!class290.field4632) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class30.method206(-1, var21, arg3);
                if (var25 != null) {
                    class38.method301(arg3.field1680, var25, arg3.field1717, (short) 1007, class143.method973(arg3, arg2 - 4, var21), 112, (long) (var21 + 1), arg3.field1659);
                    class184.field2940++;
                }
            }
            String var22 = class262.method1717(arg3, arg2 ^ 0xFFFFFFA3);
            if (var22 != null) {
                class38.method301(arg3.field1680, var22, arg3.field1717, (short) 47, -1, 76, 0L, arg3.field1659);
                class268.field4347++;
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class30.method206(-1, var23, arg3);
                if (var24 != null) {
                    class184.field2940++;
                    class38.method301(arg3.field1680, var24, arg3.field1717, (short) 16, class143.method973(arg3, arg2 ^ 0xFFFFFFFC, var23), 118, (long) (var23 + 1), arg3.field1659);
                }
            }
            if (client.method1511(arg3).method197(1)) {
                class58.field816++;
                if (arg3.field1608 != null) {
                    class38.method301(arg3.field1680, arg3.field1608, "", (short) 18, -1, 116, 0L, arg3.field1659);
                    return;
                }
                class38.method301(arg3.field1680, class246.field3954, "", (short) 18, -1, arg2 ^ 0x58, 0L, arg3.field1659);
                return;
            }
            return;
        }
        if (client.method1511(arg3).method201((byte) 60) && (class125.field2098 & 0x20) != 0) {
            class38.method301(arg3.field1680, class117.field1995, class21.field268 + " -> " + arg3.field1717, (short) 33, class17.field201, 57, 0L, arg3.field1659);
            class66.field936++;
            return;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field3204 = null;
        if (arg0 < 78) {
            field3209 = 29;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBILhk;)V")
    public static final void method1344(int arg0, byte arg1, int arg2, class275 arg3) {
        if (arg3.field672 == arg0 && arg0 != -1) {
            class21 var4 = class267.method1812((byte) 89, arg0);
            int var5 = var4.field239;
            if (var5 == 1) {
                arg3.field642 = arg2;
                arg3.field681 = 0;
                arg3.field623 = 0;
                arg3.field607 = 0;
                arg3.field658 = 1;
                class150.method1022(var4, (byte) 126, arg3.field681, arg3.field613, false, arg3.field614);
            }
            if (var5 == 2) {
                arg3.field607 = 0;
            }
        } else if (arg0 == -1 || arg3.field672 == -1 || class267.method1812((byte) 89, arg0).field257 >= class267.method1812((byte) 89, arg3.field672).field257) {
            arg3.field642 = arg2;
            arg3.field607 = 0;
            arg3.field681 = 0;
            arg3.field658 = 1;
            arg3.field672 = arg0;
            arg3.field623 = 0;
            arg3.field637 = arg3.field644;
            if (arg3.field672 != -1) {
                class150.method1022(class267.method1812((byte) 89, arg3.field672), (byte) 126, arg3.field681, arg3.field613, false, arg3.field614);
            }
        }
        int var6 = -26 / ((arg1 + 73) / 49);
        field3210++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1345(int arg0, int arg1) {
        class237.field3791 = -1;
        class150.field2407 = -1;
        if (arg0 != 0) {
            method1345(-77, 55);
        }
        field3199++;
        class122.field2048 = arg1;
        class26.method180(94);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([BI)V")
    public class199(byte[] arg0, int arg1) {
        this.field3215 = class41.method320(true, arg0.length, arg0);
        if (this.field3215 != arg1) {
            throw new RuntimeException();
        }
        this.method1339(arg0, -71);
    }
}
