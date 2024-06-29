import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class177 extends class139 {

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "Z")
    public boolean field2868 = true;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field2866 = 0;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "[I")
    public int[] field2855;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "[I")
    private int[] field2861;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field2864;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[[I")
    private int[][] field2862;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public final void method1318(byte arg0) {
        if (arg0 >= -47) {
            return;
        }
        if (this.field2855 != null) {
            for (int var2 = 0; var2 < this.field2855.length; var2++) {
                this.field2855[var2] = class244.method1747(this.field2855[var2], 32768);
            }
        }
        field2859++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
    public final int method1319(byte arg0, int arg1) {
        field2871++;
        if (this.field2861 == null || arg1 < 0 || arg1 > this.field2861.length) {
            return -1;
        } else {
            if (arg0 < 122) {
                field2866 = 13;
            }
            return this.field2861[arg1];
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 > -124) {
            return;
        }
        if (class63.field941 == 0) {
            int var7 = class126.field1857;
            int var8 = class179.field2892;
            int var9 = (arg0 - arg3) * (var8 - var7) / arg5 + var7;
            int var10 = class260.field4253;
            int var11 = class123.field1800;
            int var12 = (var11 - var10) * (arg4 - arg2) / arg6 + var10;
            if (class131.field2131 && (class111.field1599 & 0x40) != 0) {
                class131 var13 = class161.method1200((byte) 74, class126.field1862, class34.field436);
                if (var13 == null) {
                    class243.method1723(-1);
                } else {
                    class42.method321(class293.field4659, (byte) 72, class161.field2636, var12, (short) 4, 0L, " ->", var9);
                }
            } else {
                if (class175.field2850 == 1) {
                    class42.method321(class166.field2694, (byte) 72, -1, var12, (short) 48, 0L, "", var9);
                }
                class42.method321(class178.field2887, (byte) 72, -1, var12, (short) 49, 0L, "", var9);
                class80.field1156++;
            }
        }
        field2857++;
        long var14 = -1L;
        for (int var16 = 0; var16 < class228.field3671; var16++) {
            long var17 = class124.field1816[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = ((int) var17 & 0x3FA7) >> 7;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class265.method1849(class58.field826, var19, var21, var17)) {
                    class36 var23 = class134.method970(var22, 0);
                    if (var23.field471 != null) {
                        var23 = var23.method277(27981);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class63.field941 == 1) {
                        class39.field559++;
                        class42.method321(class146.field2391, (byte) 72, class239.field3818, var21, (short) 23, var17, class297.field4709 + " -> <col=00ffff>" + var23.field490, var19);
                    } else if (class131.field2131) {
                        class150 var28 = class135.field2209 == -1 ? null : class153.method1140(11, class135.field2209);
                        if ((class111.field1599 & 0x4) != 0 && (var28 == null || var23.method285(-1, class135.field2209, var28.field2440) != var28.field2440)) {
                            class102.field1503++;
                            class42.method321(class293.field4659, (byte) 72, class161.field2636, var21, (short) 14, var17, class77.field1117 + " -> <col=00ffff>" + var23.field490, var19);
                        }
                    } else {
                        class52.field751++;
                        String[] var24 = var23.field467;
                        if (class23.field273) {
                            var24 = class149.method1056(var24, (byte) -126);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class25.field293++;
                                    int var26 = -1;
                                    if (var23.field482 == var25) {
                                        var26 = var23.field466;
                                    }
                                    short var27 = 0;
                                    if (var23.field462 == var25) {
                                        var26 = var23.field470;
                                    }
                                    if (var25 == 0) {
                                        var27 = 57;
                                    }
                                    if (var25 == 1) {
                                        var27 = 45;
                                    }
                                    if (var25 == 2) {
                                        var27 = 31;
                                    }
                                    if (var25 == 3) {
                                        var27 = 1;
                                    }
                                    if (var25 == 4) {
                                        var27 = 1006;
                                    }
                                    class42.method321(var24[var25], (byte) 72, var26, var21, var27, var17, "<col=00ffff>" + var23.field490, var19);
                                }
                            }
                        }
                        class42.method321(class109.field1575, (byte) 72, class276.field4433, var21, (short) 1007, (long) var23.field477, "<col=00ffff>" + var23.field490, var19);
                    }
                }
                if (var20 == 1) {
                    class18 var29 = class169.field2730[var22];
                    if ((var29.field205.field3997 & 0x1) == 0 && (var29.field1979 & 0x7F) == 0 && (var29.field1910 & 0x7F) == 0 || (var29.field205.field3997 & 0x1) == 1 && (var29.field1979 & 0x7F) == 64 && (var29.field1910 & 0x7F) == 64) {
                        int var30 = var29.field1979 + 64 - (var29.field205.field3997 * 64);
                        int var31 = -(var29.field205.field3997 * 64) - (-var29.field1910 - 64);
                        for (int var32 = 0; var32 < class21.field235; var32++) {
                            class18 var37 = class169.field2730[class39.field556[var32]];
                            if (var37 != null && !var37.field1922 && var29 != var37 && var37.field1976) {
                                int var38 = var37.field1979 + 64 - (var37.field205.field3997 * 64);
                                int var39 = var37.field1910 + 64 - var37.field205.field3997 * 64;
                                if (var30 <= var38 && (var29.field205.field3997 - (var38 - var30 >> 7)) >= var37.field205.field3997 && var31 <= var39 && var37.field205.field3997 <= var29.field205.field3997 - (var39 - var31 >> 7)) {
                                    class244.method1745(var37.field205, 30, var19, var21, class39.field556[var32]);
                                    var37.field1922 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class121.field1772; var33++) {
                            class29 var34 = class92.field1374[class207.field3326[var33]];
                            if (var34 != null && !var34.field1922 && var34.field1976) {
                                int var35 = var34.field1979 - (var34.method205(-98) - 1) * 64;
                                int var36 = var34.field1910 - (var34.method205(116) - 1) * 64;
                                if (var30 <= var35 && var34.method205(112) <= (var29.field205.field3997 - (var35 - var30 >> 7)) && var36 >= var31 && var34.method205(66) <= (var29.field205.field3997 - (var36 - var31 >> 7))) {
                                    class124.method901(var21, 60, var34, var19, class207.field3326[var33]);
                                    var34.field1922 = true;
                                }
                            }
                        }
                    }
                    if (var29.field1922) {
                        continue;
                    }
                    class244.method1745(var29.field205, 30, var19, var21, var22);
                    var29.field1922 = true;
                }
                if (var20 == 0) {
                    class29 var40 = class92.field1374[var22];
                    if ((var40.field1979 & 0x7F) == 64 && (var40.field1910 & 0x7F) == 64) {
                        int var41 = var40.field1979 - (var40.method205(75) * 64 - 64);
                        int var42 = var40.field1910 - ((var40.method205(115) - 1) * 64);
                        for (int var43 = 0; var43 < class21.field235; var43++) {
                            class18 var48 = class169.field2730[class39.field556[var43]];
                            if (var48 != null && !var48.field1922 && var48.field1976) {
                                int var49 = var48.field1979 + 64 - (var48.field205.field3997 * 64);
                                int var50 = var48.field1910 + 64 - (var48.field205.field3997 * 64);
                                if (var49 >= var41 && var48.field205.field3997 <= var40.method205(-94) - (var49 - var41 >> 7) && var42 <= var50 && var48.field205.field3997 <= (var40.method205(-74) - (var50 - var42 >> 7))) {
                                    class244.method1745(var48.field205, 30, var19, var21, class39.field556[var43]);
                                    var48.field1922 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class121.field1772; var44++) {
                            class29 var45 = class92.field1374[class207.field3326[var44]];
                            if (var45 != null && !var45.field1922 && var40 != var45 && var45.field1976) {
                                int var46 = var45.field1979 - ((var45.method205(-126) - 1) * 64);
                                int var47 = var45.field1910 + 64 - (var45.method205(-95) * 64);
                                if (var46 >= var41 && var45.method205(86) <= var40.method205(78) - (var46 - var41 >> 7) && var47 >= var42 && var45.method205(76) <= (var40.method205(-104) - (var47 - var42 >> 7))) {
                                    class124.method901(var21, -93, var45, var19, class207.field3326[var44]);
                                    var45.field1922 = true;
                                }
                            }
                        }
                    }
                    if (var40.field1922) {
                        continue;
                    }
                    class124.method901(var21, -84, var40, var19, var22);
                    var40.field1922 = true;
                }
                if (var20 == 3) {
                    class187 var51 = class43.field627[class58.field826][var19][var21];
                    if (var51 != null) {
                        for (class109 var52 = (class109) var51.method1390((byte) -118); var52 != null; var52 = (class109) var51.method1386((byte) -17)) {
                            int var53 = var52.field1578.field4172;
                            class62 var54 = class254.method1800(var53, 15017);
                            if (class63.field941 == 1) {
                                class42.method321(class146.field2391, (byte) 72, class239.field3818, var21, (short) 37, (long) var53, class297.field4709 + " -> <col=ff9040>" + var54.field910, var19);
                                class26.field295++;
                            } else if (class131.field2131) {
                                class150 var59 = class135.field2209 == -1 ? null : class153.method1140(11, class135.field2209);
                                if ((class111.field1599 & 0x1) != 0 && (var59 == null || var54.method446(var59.field2440, (byte) 102, class135.field2209) != var59.field2440)) {
                                    class253.field4178++;
                                    class42.method321(class293.field4659, (byte) 72, class161.field2636, var21, (short) 28, (long) var53, class77.field1117 + " -> <col=ff9040>" + var54.field910, var19);
                                }
                            } else {
                                class82.field1189++;
                                String[] var55 = var54.field931;
                                if (class23.field273) {
                                    var55 = class149.method1056(var55, (byte) -125);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class134.field2200++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 15;
                                        }
                                        int var58 = -1;
                                        if (var56 == 1) {
                                            var57 = 7;
                                        }
                                        if (var54.field920 == var56) {
                                            var58 = var54.field899;
                                        }
                                        if (var56 == 2) {
                                            var57 = 6;
                                        }
                                        if (var56 == 3) {
                                            var57 = 20;
                                        }
                                        if (var54.field904 == var56) {
                                            var58 = var54.field917;
                                        }
                                        if (var56 == 4) {
                                            var57 = 50;
                                        }
                                        class42.method321(var55[var56], (byte) 72, var58, var21, var57, (long) var53, "<col=ff9040>" + var54.field910, var19);
                                    }
                                }
                                class42.method321(class109.field1575, (byte) 72, class276.field4433, var21, (short) 1002, (long) var53, "<col=ff9040>" + var54.field910, var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I")
    public final int method1321(byte arg0) {
        if (arg0 <= 17) {
            this.field2864 = null;
        }
        field2863++;
        return this.field2861 == null ? 0 : this.field2861.length;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lv;I)V")
    public final void method1322(class152 arg0, int arg1) {
        field2867++;
        while (true) {
            int var3 = arg0.method1111(255);
            if (var3 == 0) {
                if (arg1 == 16295) {
                    return;
                } else {
                    this.method1323((class152) null, -24, true);
                    return;
                }
            }
            this.method1323(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lv;IZ)V")
    private final void method1323(class152 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field2864 = class259.method1825(-23348, arg0.method1078(-1), '<');
        } else if (arg1 == 2) {
            int var4 = arg0.method1111(255);
            this.field2855 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2855[var5] = arg0.method1126(arg2);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1111(255);
            this.field2862 = new int[var6][];
            this.field2861 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1126(false);
                this.field2861[var7] = var8;
                this.field2862[var7] = new int[class146.field2389[var8]];
                for (int var9 = 0; var9 < class146.field2389[var8]; var9++) {
                    this.field2862[var7][var9] = arg0.method1126(arg2);
                }
            }
        } else if (arg1 == 4) {
            this.field2868 = false;
        }
        field2856++;
        if (arg2) {
            this.field2855 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)I")
    public final int method1324(int arg0, int arg1, int arg2) {
        field2872++;
        if (arg2 < 117) {
            this.field2864 = null;
        }
        if (this.field2861 == null || arg0 < 0 || arg0 > this.field2861.length) {
            return -1;
        } else if (this.field2862[arg0] == null || arg1 < 0 || this.field2862[arg0].length < arg1) {
            return -1;
        } else {
            return this.field2862[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lsg;)V")
    public static final void method1325(class166 arg0) {
        for (int var1 = arg0.field2678; var1 <= arg0.field2688; var1++) {
            for (int var2 = arg0.field2684; var2 <= arg0.field2692; var2++) {
                class286 var3 = class220.field3525[arg0.field2680][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4541; var4++) {
                        if (var3.field4530[var4] == arg0) {
                            var3.field4541--;
                            for (int var5 = var4; var5 < var3.field4541; var5++) {
                                var3.field4530[var5] = var3.field4530[var5 + 1];
                                var3.field4536[var5] = var3.field4536[var5 + 1];
                            }
                            var3.field4530[var3.field4541] = null;
                            break;
                        }
                    }
                    var3.field4519 = 0;
                    for (int var6 = 0; var6 < var3.field4541; var6++) {
                        var3.field4519 |= var3.field4536[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method1326(int arg0) {
        field2870++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 >= -53) {
            method1320(99, 103, -91, 60, 125, -32, -46);
        }
        if (this.field2864 == null) {
            return "";
        }
        var2.append(this.field2864[0]);
        for (int var3 = 1; var3 < this.field2864.length; var3++) {
            var2.append("...");
            var2.append(this.field2864[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(BI)V")
    public static final void method1327(byte arg0, int arg1) {
        field2858++;
        if (arg1 >= 0 && arg1 < class11.field132.length) {
            int var2 = 49 / ((33 - arg0) / 49);
            class11.field132[arg1] = !class11.field132[arg1];
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[ILv;)V")
    public final void method1328(int arg0, int[] arg1, class152 arg2) {
        field2869++;
        if (this.field2861 == null) {
            return;
        }
        for (int var4 = 0; this.field2861.length > var4 && arg1.length > var4; var4++) {
            int var5 = class78.field1132[this.method1319((byte) 127, var4)];
            if (var5 > 0) {
                arg2.method1110((byte) 65, var5, (long) arg1[var4]);
            }
        }
        if (arg0 > -74) {
            method1327((byte) -52, 63);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILv;)Ljava/lang/String;")
    public final String method1329(int arg0, class152 arg1) {
        if (arg0 != -6359) {
            method1327((byte) 37, -88);
        }
        field2865++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2861 != null) {
            for (int var4 = 0; var4 < this.field2861.length; var4++) {
                var3.append(this.field2864[var4]);
                var3.append(class55.method411(2, arg1.method1095(class195.field3139[this.field2861[var4]], true), this.field2861[var4], this.field2862[var4]));
            }
        }
        var3.append(this.field2864[this.field2864.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([IIIII)V")
    public static final void method1330(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 32232) {
            field2866 = 66;
        }
        field2860++;
        arg1--;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            arg1 = var12 + 1;
            arg0[arg1] = arg2;
        }
        while (var13 > arg1) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }
}
