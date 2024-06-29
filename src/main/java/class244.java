import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class244 {

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lbf;")
    public static class202 field4381 = new class202(64);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Leg;")
    public static class37 field4383 = class174.method1167("leuchten3:", -74);

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Leg;")
    private static class37 field4388 = class174.method1167("Drop", 93);

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "[I")
    public static int[] field4395 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[Leg;")
    public static class37[] field4399 = new class37[100];

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Leg;")
    public static class37 field4402 = field4388;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Leg;")
    public static class37 field4400 = class174.method1167("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 96);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lml;")
    public class147 field4391;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lkk;")
    public static class65 field4397;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public int[] field4378;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public int[] field4380;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
    public int[] field4389;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[I")
    public int[] field4390;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "[I")
    public int[] field4393;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[I")
    public int[] field4401;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[Lml;")
    public class147[] field4382;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[[I")
    public int[][] field4376;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[[I")
    public int[][] field4377;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method1679(byte arg0) {
        field4397 = null;
        if (arg0 < 38) {
            return;
        }
        field4383 = null;
        field4395 = null;
        field4400 = null;
        field4388 = null;
        field4399 = null;
        field4402 = null;
        field4381 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method1680(int arg0) {
        field4398++;
        if (class4.field71 != null) {
            class19 var1 = class4.field71;
            synchronized (class4.field71) {
                class4.field71 = null;
            }
        }
        if (arg0 < 99) {
            method1683(-57, -91, -114, -30, 107, -26, 62);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([BZ)V")
    private final void method1681(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class187 var3 = new class187(class242.method1672((byte) 4, arg0));
        int var4 = var3.method1268(255);
        field4386++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4384 = 0;
        } else {
            this.field4384 = var3.method1290((byte) 90);
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method1268(255);
        this.field4385 = var3.method1244(false);
        this.field4378 = new int[this.field4385];
        for (int var8 = 0; var8 < this.field4385; var8++) {
            this.field4378[var8] = var5 += var3.method1244(false);
            if (var6 < this.field4378[var8]) {
                var6 = this.field4378[var8];
            }
        }
        this.field4387 = var6 + 1;
        this.field4393 = new int[this.field4387];
        this.field4376 = new int[this.field4387][];
        this.field4390 = new int[this.field4387];
        this.field4380 = new int[this.field4387];
        this.field4401 = new int[this.field4387];
        if (var7 != 0) {
            this.field4389 = new int[this.field4387];
            for (int var9 = 0; var9 < this.field4387; var9++) {
                this.field4389[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4385; var10++) {
                this.field4389[this.field4378[var10]] = var3.method1290((byte) 90);
            }
            this.field4391 = new class147(this.field4389);
        }
        for (int var11 = 0; var11 < this.field4385; var11++) {
            this.field4390[this.field4378[var11]] = var3.method1290((byte) 90);
        }
        for (int var12 = 0; var12 < this.field4385; var12++) {
            this.field4393[this.field4378[var12]] = var3.method1290((byte) 90);
        }
        for (int var13 = 0; var13 < this.field4385; var13++) {
            this.field4380[this.field4378[var13]] = var3.method1244(false);
        }
        for (int var14 = 0; var14 < this.field4385; var14++) {
            int var21 = 0;
            int var22 = this.field4378[var14];
            int var23 = this.field4380[var22];
            int var24 = -1;
            this.field4376[var22] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field4376[var22][var25] = var21 += var3.method1244(false);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field4401[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field4376[var22] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field4377 = new int[var6 + 1][];
        this.field4382 = new class147[var6 + 1];
        for (int var15 = 0; var15 < this.field4385; var15++) {
            int var16 = this.field4378[var15];
            int var17 = this.field4380[var16];
            this.field4377[var16] = new int[this.field4401[var16]];
            for (int var18 = 0; var18 < this.field4401[var16]; var18++) {
                this.field4377[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4376[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4376[var16][var19];
                }
                this.field4377[var16][var20] = var3.method1290((byte) 90);
            }
            this.field4382[var16] = new class147(this.field4377[var16]);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4394++;
        if (class23.field292 == 0) {
            class170.field2847++;
            int var7 = class202.field3455;
            int var8 = class81.field1269;
            int var9 = class86.field1368;
            int var10 = class240.field4271;
            int var11 = (var8 - var9) * (arg4 - arg0) / arg5 + var9;
            int var12 = (arg1 - arg2) * (var7 - var10) / arg3 + var10;
            if (class174.field2924 && (class274.field4807 & 0x40) == 64) {
                class237 var13 = class47.method309(128, class129.field2150, class45.field709);
                if (var13 == null) {
                    class138.method973((byte) 77);
                } else {
                    class87.method583(var12, var11, class140.field2415, 29782, (short) 23, 0L, class147.field2497);
                }
            } else {
                if (class132.field2221 == 1) {
                    class87.method583(var12, var11, class179.field2989, 29782, (short) 47, 0L, class139.field2394);
                }
                class87.method583(var12, var11, class179.field2989, 29782, (short) 36, 0L, class200.field3399);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class126.field2125; var16++) {
            long var18 = class201.field3428[var16];
            int var20 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var21 = ((int) var18 & 0x3FCD) >> 7;
            int var22 = (int) var18 & 0x7F;
            int var23 = (int) var18 >> 29 & 0x3;
            if (var14 != var18) {
                var14 = var18;
                if (var23 == 2 && class291.method1950(class237.field4140, var22, var21, var18)) {
                    class133 var24 = class178.method1186(var20, 0);
                    if (var24.field2303 != null) {
                        var24 = var24.method962(-128);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class23.field292 == 1) {
                        class287.field5052++;
                        class87.method583(var21, var22, class156.method1061((byte) -123, new class37[] { class150.field2523, class73.field1153, var24.field2268 }), 29782, (short) 14, var18, class86.field1365);
                    } else if (!class174.field2924) {
                        class37.field561++;
                        class37[] var25 = var24.field2310;
                        if (class146.field2489) {
                            var25 = class129.method919(var25, 2047);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class260.field4599++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 7;
                                    }
                                    if (var26 == 1) {
                                        var27 = 18;
                                    }
                                    if (var26 == 2) {
                                        var27 = 25;
                                    }
                                    if (var26 == 3) {
                                        var27 = 50;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1003;
                                    }
                                    class87.method583(var21, var22, class156.method1061((byte) 125, new class37[] { class55.field842, var24.field2268 }), 29782, var27, var18, var25[var26]);
                                }
                            }
                        }
                        class87.method583(var21, var22, class156.method1061((byte) -81, new class37[] { class55.field842, var24.field2268 }), 29782, (short) 1005, (long) var24.field2304, class47.field753);
                    } else if ((class274.field4807 & 0x4) == 4) {
                        class176.field2943++;
                        class87.method583(var21, var22, class156.method1061((byte) 31, new class37[] { class93.field1464, class73.field1153, var24.field2268 }), 29782, (short) 42, var18, class147.field2497);
                    }
                }
                if (var23 == 1) {
                    class163 var28 = class55.field833[var20];
                    if (var28.field2691.field4839 == 1 && (var28.field1799 & 0x7F) == 64 && (var28.field1793 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class46.field729; var29++) {
                            class163 var32 = class55.field833[class98.field1525[var29]];
                            if (var32 != null && var28 != var32 && var32.field2691.field4839 == 1 && var28.field1799 == var32.field1799 && var28.field1793 == var32.field1793) {
                                class21.method131(var32.field2691, var21, class98.field1525[var29], 121, var22);
                            }
                        }
                        for (int var30 = 0; var30 < class138.field2360; var30++) {
                            class188 var31 = class98.field1526[class285.field5020[var30]];
                            if (var31 != null && var28.field1799 == var31.field1799 && var28.field1793 == var31.field1793) {
                                class276.method1861(var31, var21, class285.field5020[var30], var22, -32497);
                            }
                        }
                    }
                    class21.method131(var28.field2691, var21, var20, 118, var22);
                }
                if (var23 == 0) {
                    class188 var33 = class98.field1526[var20];
                    if ((var33.field1799 & 0x7F) == 64 && (var33.field1793 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class46.field729; var34++) {
                            class163 var37 = class55.field833[class98.field1525[var34]];
                            if (var37 != null && var37.field2691.field4839 == 1 && var33.field1799 == var37.field1799 && var33.field1793 == var37.field1793) {
                                class21.method131(var37.field2691, var21, class98.field1525[var34], 105, var22);
                            }
                        }
                        for (int var35 = 0; var35 < class138.field2360; var35++) {
                            class188 var36 = class98.field1526[class285.field5020[var35]];
                            if (var36 != null && var33 != var36 && var33.field1799 == var36.field1799 && var33.field1793 == var36.field1793) {
                                class276.method1861(var36, var21, class285.field5020[var35], var22, -32497);
                            }
                        }
                    }
                    class276.method1861(var33, var21, var20, var22, -32497);
                }
                if (var23 == 3) {
                    class226 var38 = class210.field3621[class237.field4140][var22][var21];
                    if (var38 != null) {
                        for (class61 var39 = (class61) var38.method1572((byte) 43); var39 != null; var39 = (class61) var38.method1568(-1)) {
                            int var40 = var39.field995.field739;
                            class241 var41 = class9.method52(true, var40);
                            if (class23.field292 == 1) {
                                class35.field500++;
                                class87.method583(var21, var22, class156.method1061((byte) -75, new class37[] { class150.field2523, class107.field1672, var41.field4325 }), 29782, (short) 26, (long) var40, class86.field1365);
                            } else if (!class174.field2924) {
                                class93.field1465++;
                                class37[] var42 = var41.field4292;
                                if (class146.field2489) {
                                    var42 = class129.method919(var42, 2047);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        class272.field4773++;
                                        byte var44 = 0;
                                        if (var43 == 0) {
                                            var44 = 46;
                                        }
                                        if (var43 == 1) {
                                            var44 = 58;
                                        }
                                        if (var43 == 2) {
                                            var44 = 38;
                                        }
                                        if (var43 == 3) {
                                            var44 = 34;
                                        }
                                        if (var43 == 4) {
                                            var44 = 22;
                                        }
                                        class87.method583(var21, var22, class156.method1061((byte) -50, new class37[] { class203.field3461, var41.field4325 }), 29782, var44, (long) var40, var42[var43]);
                                    } else if (var43 == 2) {
                                        class87.method583(var21, var22, class156.method1061((byte) -62, new class37[] { class203.field3461, var41.field4325 }), 29782, (short) 38, (long) var40, class22.field285);
                                        class214.field3712++;
                                    }
                                }
                                class87.method583(var21, var22, class156.method1061((byte) 104, new class37[] { class203.field3461, var41.field4325 }), 29782, (short) 1006, (long) var40, class47.field753);
                            } else if ((class274.field4807 & 0x1) == 1) {
                                class87.method583(var21, var22, class156.method1061((byte) 67, new class37[] { class93.field1464, class107.field1672, var41.field4325 }), 29782, (short) 30, (long) var40, class147.field2497);
                                class29.field422++;
                            }
                        }
                    }
                }
            }
        }
        int var17 = 110 / ((arg6 - 15) / 50);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIIIIII)V")
    public static final void method1683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class178.field2972 <= arg3 - arg6 && arg3 + arg6 <= class217.field3741 && (arg0 - arg6) >= class286.field5050 && class96.field1507 >= (arg0 + arg6)) {
            class252.method1726(arg6, arg2, (byte) -105, arg1, arg3, arg0, arg5);
        } else {
            class52.method339(arg2, (byte) -114, arg1, arg5, arg3, arg0, arg6);
        }
        if (arg4 == 0) {
            field4379++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([BI)V")
    public class244(byte[] arg0, int arg1) {
        this.field4396 = class24.method145(true, arg0.length, arg0);
        if (this.field4396 != arg1) {
            throw new RuntimeException();
        }
        this.method1681(arg0, true);
    }
}
