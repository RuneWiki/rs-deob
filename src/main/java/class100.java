import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class100 extends class161 {

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[[I")
    public int[][] field1624;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
    public int[] field1627;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[Z")
    public boolean[] field1628;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Lp;")
    public static class280 field1635 = class18.method140((byte) -126, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Lp;")
    public static class280 field1633 = class18.method140((byte) -126, "blaugr-Un:");

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Lp;")
    public static class280 field1629 = class18.method140((byte) -127, "_");

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Ltg;")
    public static class180 field1625;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lg;")
    public static class272 field1626;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "[[Z")
    public static boolean[][] field1639;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)V")
    public static final void method710(int arg0, boolean arg1) {
        class55.field906 = null;
        class74.field1236 = null;
        class250.field4378 = 0;
        class80.field1313 = null;
        class113.field2029 = null;
        class116.field2097 = null;
        class145.field2532 = null;
        class243.field4265 = null;
        class229.field3960 = null;
        if (arg1 && class90.field1460 != null) {
            class147.field2561 = class90.field1460.field1716;
        } else {
            class147.field2561 = null;
        }
        field1636++;
        class55.field902 = null;
        class280.field4944 = null;
        class90.field1460 = null;
        class244.field4290.method639(98);
        class81.field1337 = null;
        class149.field2577 = null;
        class97.field1558 = -1;
        class224.field3884 = null;
        class79.field1301 = null;
        class109.field1825 = null;
        class173.field3012 = null;
        class14.field280 = null;
        class212.field3646 = null;
        class277.field4818 = -1;
        class40.field686 = null;
        if (arg0 == 5147) {
            class131.field2335 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method711(byte arg0) {
        if (arg0 > -126) {
            method714(97, (class162[][][]) null, -100, -12, true, 34);
        }
        field1635 = null;
        field1625 = null;
        field1639 = null;
        field1633 = null;
        field1629 = null;
        field1626 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZII)V")
    public static final void method712(int arg0, boolean arg1, int arg2, int arg3) {
        field1637++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class245.field4299 = arg0;
        class204.field3549 = arg2;
        if (arg3 > -78) {
            field1629 = null;
        }
        class283.field4981 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILoe;II)V")
    public static final void method713(int arg0, class142 arg1, int arg2, int arg3) {
        field1634++;
        if (arg3 != -1) {
            method713(114, (class142) null, -48, -27);
        }
        if (arg1.field4853 == arg0 && arg0 != -1) {
            class78 var4 = class207.method1401((byte) -22, arg0);
            int var5 = var4.field1290;
            if (var5 == 1) {
                arg1.field4821 = arg2;
                arg1.field4801 = 0;
                arg1.field4830 = 0;
                arg1.field4861 = 0;
                class150.method1034(arg1.field4793, false, var4, arg1.field4830, arg1.field4791, class262.field4631 == arg1);
            }
            if (var5 == 2) {
                arg1.field4801 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field4853 == -1 || class207.method1401((byte) -22, arg0).field1288 >= class207.method1401((byte) -22, arg1.field4853).field1288) {
            arg1.field4801 = 0;
            arg1.field4821 = arg2;
            arg1.field4861 = 0;
            arg1.field4864 = arg1.field4816;
            arg1.field4830 = 0;
            arg1.field4853 = arg0;
            if (arg1.field4853 != -1) {
                class150.method1034(arg1.field4793, false, class207.method1401((byte) -22, arg1.field4853), arg1.field4830, arg1.field4791, class262.field4631 == arg1);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[[[Lsg;IIZI)Z")
    public static final boolean method714(int arg0, class162[][][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1632++;
        byte var6 = arg4 ? 1 : (byte) (class102.field1665 & 0xFF);
        if (class268.field4705[class231.field4013][arg5][arg3] == var6) {
            return false;
        } else if ((class259.field4598[class231.field4013][arg5][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg0 != -1) {
                method711((byte) -59);
            }
            class250.field4385[var7] = arg5;
            int var8 = 0;
            int var31 = var7 + 1;
            class241.field4218[var7] = arg3;
            class268.field4705[class231.field4013][arg5][arg3] = var6;
            while (var31 != var8) {
                int var9 = class250.field4385[var8] & 0xFFFF;
                int var10 = (class250.field4385[var8] & 0xFF5705) >> 16;
                int var11 = class241.field4218[var8] & 0xFFFF;
                int var12 = class241.field4218[var8] >> 16 & 0xFF;
                boolean var13 = false;
                if ((class259.field4598[class231.field4013][var9][var11] & 0x4) == 0) {
                    var13 = true;
                }
                boolean var14 = false;
                int var15 = class250.field4385[var8] >> 24 & 0xFF;
                label229: for (int var16 = class231.field4013 + 1; var16 <= 3; var16++) {
                    if ((class259.field4598[var16][var9][var11] & 0x8) == 0) {
                        if (var13 && arg1[var16][var9][var11] != null) {
                            if (arg1[var16][var9][var11].field2849 != null) {
                                int var19 = class36.method293((byte) -103, var10);
                                if (arg1[var16][var9][var11].field2849.field2867 == var19 || arg1[var16][var9][var11].field2849.field2860 == var19) {
                                    continue;
                                }
                                if (var15 != 0) {
                                    int var20 = class36.method293((byte) -110, var15);
                                    if (arg1[var16][var9][var11].field2849.field2867 == var20 || arg1[var16][var9][var11].field2849.field2860 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class36.method293((byte) -120, var12);
                                    if (arg1[var16][var9][var11].field2849.field2867 == var21 || arg1[var16][var9][var11].field2849.field2860 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var11].field2845 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var9][var11].field2841; var22++) {
                                    int var23 = (int) (arg1[var16][var9][var11].field2845[var22].field2805 >> 14 & 0x3FL);
                                    int var24 = (int) (arg1[var16][var9][var11].field2845[var22].field2805 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var15 != 0 && var15 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class162 var26 = arg1[var16][var9][var11];
                        if (var26 != null && var26.field2841 > 0) {
                            for (int var27 = 0; var27 < var26.field2841; var27++) {
                                class160 var28 = var26.field2845[var27];
                                if (var28.field2814 != var28.field2790 || var28.field2796 != var28.field2788) {
                                    for (int var29 = var28.field2814; var29 <= var28.field2790; var29++) {
                                        for (int var30 = var28.field2796; var30 <= var28.field2788; var30++) {
                                            class268.field4705[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class268.field4705[var16][var9][var11] = var6;
                    }
                }
                if (var14) {
                    if (class145.field2529[class231.field4013 + 1][var9][var11] > class54.field879[arg2]) {
                        class54.field879[arg2] = class145.field2529[class231.field4013 + 1][var9][var11];
                    }
                    int var17 = var9 << 7;
                    if (var17 < class109.field1826[arg2]) {
                        class109.field1826[arg2] = var17;
                    } else if (class275.field4769[arg2] < var17) {
                        class275.field4769[arg2] = var17;
                    }
                    int var18 = var11 << 7;
                    if (var18 < class194.field3419[arg2]) {
                        class194.field3419[arg2] = var18;
                    } else if (class8.field177[arg2] < var18) {
                        class8.field177[arg2] = var18;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (!var13) {
                    if (var9 >= 1 && class268.field4705[class231.field4013][var9 - 1][var11] != var6) {
                        class250.field4385[var31] = class160.method1143(-754974720, class160.method1143(1179648, var9 - 1));
                        class241.field4218[var31] = class160.method1143(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class268.field4705[class231.field4013][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class268.field4705[class231.field4013][var9 - 1][var11] != var6 && (class259.field4598[class231.field4013][var9][var11] & 0x4) == 0 && (class259.field4598[class231.field4013][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class250.field4385[var31] = class160.method1143(class160.method1143(1179648, var9 - 1), 1375731712);
                            class241.field4218[var31] = class160.method1143(1245184, var11);
                            class268.field4705[class231.field4013][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class268.field4705[class231.field4013][var9][var11] != var6) {
                            class250.field4385[var31] = class160.method1143(class160.method1143(var9, 5373952), 318767104);
                            class241.field4218[var31] = class160.method1143(5439488, var11);
                            class268.field4705[class231.field4013][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class268.field4705[class231.field4013][var9 + 1][var11] != var6 && (class259.field4598[class231.field4013][var9][var11] & 0x4) == 0 && (class259.field4598[class231.field4013][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class250.field4385[var31] = class160.method1143(-1845493760, class160.method1143(5373952, var9 + 1));
                            class241.field4218[var31] = class160.method1143(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class268.field4705[class231.field4013][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if ((var9 + 1) < 104 && class268.field4705[class231.field4013][var9 + 1][var11] != var6) {
                        class250.field4385[var31] = class160.method1143(class160.method1143(var9 + 1, 9568256), 1392508928);
                        class241.field4218[var31] = class160.method1143(var11, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class268.field4705[class231.field4013][var9 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class268.field4705[class231.field4013][var9 - 1][var11] != var6 && (class259.field4598[class231.field4013][var9][var11] & 0x4) == 0 && (class259.field4598[class231.field4013][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class250.field4385[var31] = class160.method1143(class160.method1143(var9 - 1, 13762560), 301989888);
                            class241.field4218[var31] = class160.method1143(var11, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class268.field4705[class231.field4013][var9 - 1][var11] = var6;
                        }
                        if (class268.field4705[class231.field4013][var9][var11] != var6) {
                            class250.field4385[var31] = class160.method1143(class160.method1143(var9, 13762560), -1828716544);
                            class241.field4218[var31] = class160.method1143(var11, 13828096);
                            class268.field4705[class231.field4013][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class268.field4705[class231.field4013][var9 + 1][var11] != var6 && (class259.field4598[class231.field4013][var9][var11] & 0x4) == 0 && (class259.field4598[class231.field4013][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class250.field4385[var31] = class160.method1143(-771751936, class160.method1143(var9 + 1, 9568256));
                            class241.field4218[var31] = class160.method1143(9633792, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class268.field4705[class231.field4013][var9 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class54.field879[arg2] != -1000000) {
                class54.field879[arg2] += 10;
                class109.field1826[arg2] -= 50;
                class275.field4769[arg2] += 50;
                class8.field177[arg2] += 50;
                class194.field3419[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I[B)V")
    public class100(int arg0, byte[] arg1) {
        this.field1638 = arg0;
        class25 var3 = new class25(arg1);
        this.field1631 = var3.method189((byte) -103);
        this.field1624 = new int[this.field1631][];
        this.field1627 = new int[this.field1631];
        this.field1628 = new boolean[this.field1631];
        for (int var4 = 0; var4 < this.field1631; var4++) {
            this.field1627[var4] = var3.method189((byte) -103);
        }
        for (int var5 = 0; var5 < this.field1631; var5++) {
            this.field1628[var5] = var3.method189((byte) -103) == 1;
        }
        for (int var6 = 0; var6 < this.field1631; var6++) {
            this.field1624[var6] = new int[var3.method189((byte) -103)];
        }
        for (int var7 = 0; var7 < this.field1631; var7++) {
            for (int var8 = 0; var8 < this.field1624[var7].length; var8++) {
                this.field1624[var7][var8] = var3.method189((byte) -103);
            }
        }
    }
}
