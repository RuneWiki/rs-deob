import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class68 extends class99 {

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "I")
    private int field1372 = 4096;

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "Z")
    private boolean field1370 = true;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Lr;")
    private static class66 field1357 = class93.method641(43, "Feb");

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "Lr;")
    private static class66 field1356 = class93.method641(43, "Dec");

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Lr;")
    private static class66 field1354 = class93.method641(43, "Sep");

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "Lr;")
    private static class66 field1365 = class93.method641(43, "Nov");

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lr;")
    private static class66 field1362 = class93.method641(43, "May");

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lr;")
    private static class66 field1361 = class93.method641(43, "Oct");

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lr;")
    private static class66 field1366 = class93.method641(43, "Jan");

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "Lr;")
    private static class66 field1371 = class93.method641(43, "Jun");

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "Lr;")
    private static class66 field1367 = class93.method641(43, "Apr");

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field1360 = 0;

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lr;")
    private static class66 field1369 = class93.method641(43, "Jul");

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Lr;")
    private static class66 field1358 = class93.method641(43, "Aug");

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "Lr;")
    private static class66 field1364 = class93.method641(43, "Mar");

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[Lr;")
    public static class66[] field1352 = new class66[] { field1366, field1357, field1364, field1367, field1362, field1371, field1369, field1358, field1354, field1361, field1365, field1356 };

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lr;")
    public static final class66 method496(int arg0, int arg1) {
        ++field1363;
        if (arg1 != -1) {
            method500(43, -92, 110);
        }
        return arg0 < 999999999 ? class144.method989(arg0, 0) : class138.field2543;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)[Ljb;")
    public static final class256[] method497(int arg0) {
        ++field1359;
        class256[] var1 = new class256[class249.field4397];
        int var2 = 0;
        if (arg0 != -21477) {
            field1369 = null;
        }
        while (class249.field4397 > var2) {
            int var3 = class2.field25[var2] * class199.field3443[var2];
            byte[] var4 = class44.field777[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var6 > ~var3; ++var6) {
                var5[var6] = class136.field2517[class115.method767(var4[var6], 255)];
            }
            var1[var2] = new class168(class11.field125, class54.field950, class36.field541[var2], class231.field4029[var2], class2.field25[var2], class199.field3443[var2], var5);
            ++var2;
        }
        class211.method1365((byte) -93);
        return var1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field1354 = null;
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field1370 = ~arg0.method1677(-6677) == -2;
            }
        } else {
            this.field1372 = arg0.method1674(1355769544);
        }
        ++field1351;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static void method498(byte arg0) {
        field1361 = null;
        field1371 = null;
        field1367 = null;
        field1362 = null;
        field1352 = null;
        field1365 = null;
        field1369 = null;
        field1358 = null;
        field1357 = null;
        field1354 = null;
        field1366 = null;
        field1356 = null;
        field1364 = null;
        if (arg0 != 126) {
            method500(69, 68, 57);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILaf;Laf;IIILha;)V")
    public static final void method499(byte arg0, int arg1, class39 arg2, class39 arg3, int arg4, int arg5, int arg6, class63 arg7) {
        ++field1368;
        class91.field1760 = arg4;
        class175.field3081 = arg1;
        class105.field2027 = arg6;
        class132.field2457 = arg5;
        class78.field1540 = arg7;
        if (class127.field2380 == null) {
            class97.field1896 = true;
            if (class193.field3343 == null) {
                class193.field3343 = class8.method33(class242.field4238, 0, class44.field785, (byte) 13);
            }
            if (class242.field4231 == null) {
                class242.field4231 = class138.method948(class242.field4238, 0, false, class52.field926);
            }
            if (class7.field71 == null) {
                class7.field71 = class138.method948(class242.field4238, 0, false, class153.field2737);
            }
            if (class194.field3353 == null) {
                class194.field3353 = class138.method948(class242.field4238, 0, false, class69.field1397);
            }
            int var8 = class91.field1760 / 5 * 4;
            int var9 = class91.field1760 / 5;
            if (arg0 != -38) {
                field1356 = null;
            }
            class235.method1554(class105.field2027, class175.field3081, class91.field1760, class132.field2457, 0, 168);
            class235.method1556(class105.field2027, class175.field3081, var9, 23, 12425273, 9135624);
            class235.method1556(class105.field2027 + var9, class175.field3081, var8, 23, 5197647, 2697513);
            arg2.method235(class107.field2089, var9 / 2 + class105.field2027, class175.field3081 + 15, 0, -1);
            if (class194.field3353 != null) {
                class194.field3353[1].method162(class105.field2027 + 2 - -var9, class175.field3081 - -1);
                arg3.method233(class143.field2618, class105.field2027 + 12 + var9, class175.field3081 + 10, 16777215, -1);
                class194.field3353[0].method162(class105.field2027 - -var9 + 2, class175.field3081 - -12);
                arg3.method233(class181.field3162, var9 + 12 + class105.field2027, class175.field3081 - -21, 16777215, -1);
            }
            if (class7.field71 != null) {
                int var10 = class105.field2027 - -var9 - -140;
                if (class135.field2504[0] == 0 && ~class222.field3790[0] == -1) {
                    class7.field71[2].method162(var10, class175.field3081 + 4);
                } else {
                    class7.field71[0].method162(var10, class175.field3081 + 4);
                }
                if (class135.field2504[0] == 0 && ~class222.field3790[0] == -2) {
                    class7.field71[3].method162(var10 + 15, class175.field3081 + 4);
                } else {
                    class7.field71[1].method162(var10 + 15, class175.field3081 + 4);
                }
                arg2.method233(class230.field3976, var10 + 32, class175.field3081 + 17, 16777215, -1);
                int var11 = class105.field2027 - (-var9 + -250);
                if (~class135.field2504[0] == -2 && class222.field3790[0] == 0) {
                    class7.field71[2].method162(var11, class175.field3081 + 4);
                } else {
                    class7.field71[0].method162(var11, class175.field3081 - -4);
                }
                if (class135.field2504[0] == 1 && class222.field3790[0] == 1) {
                    class7.field71[3].method162(var11 + 15, class175.field3081 + 4);
                } else {
                    class7.field71[1].method162(var11 + 15, class175.field3081 + 4);
                }
                arg2.method233(class192.field3331, var11 + 32, class175.field3081 + 17, 16777215, -1);
                int var12 = class105.field2027 - -var9 + 360;
                if (class135.field2504[0] == 2 && class222.field3790[0] == 0) {
                    class7.field71[2].method162(var12, class175.field3081 + 4);
                } else {
                    class7.field71[0].method162(var12, class175.field3081 + 4);
                }
                if (class135.field2504[0] == 2 && class222.field3790[0] == 1) {
                    class7.field71[3].method162(var12 + 15, class175.field3081 - -4);
                } else {
                    class7.field71[1].method162(var12 - -15, class175.field3081 + 4);
                }
                arg2.method233(class97.field1887, var12 + 32, class175.field3081 + 17, 16777215, -1);
                int var13 = class105.field2027 + 470 - -var9;
                if (class135.field2504[0] == 3 && ~class222.field3790[0] == -1) {
                    class7.field71[2].method162(var13, class175.field3081 + 4);
                } else {
                    class7.field71[0].method162(var13, class175.field3081 + 4);
                }
                if (class135.field2504[0] == 3 && ~class222.field3790[0] == -2) {
                    class7.field71[3].method162(var13 + 15, class175.field3081 + 4);
                } else {
                    class7.field71[1].method162(var13 + 15, class175.field3081 + 4);
                }
                arg2.method233(class94.field1810, var13 + 32, class175.field3081 + 17, 16777215, -1);
            }
            class235.method1558(class91.field1760 + -58 - 10, class175.field3081 + 4, 58, 16, 0);
            class31.field463 = -1;
            if (class193.field3343 != null) {
                byte var14 = 88;
                byte var15 = 19;
                int var16 = (class132.field2457 + -23) / (var15 + 1);
                int var17 = class91.field1760 / (var14 + 1);
                int var18;
                int var19;
                do {
                    var18 = var16;
                    var19 = var17;
                    if (~((var17 + -1) * var16) <= ~class199.field3445) {
                        --var17;
                    }
                    if (class199.field3445 <= (var16 + -1) * var17) {
                        --var16;
                    }
                    if (class199.field3445 <= (var16 + -1) * var17) {
                        --var16;
                    }
                } while (var16 != var18 || var17 != var19);
                int var20 = (-(var14 * var17) + class91.field1760) / (var17 + 1);
                if (~var20 < -6) {
                    var20 = 5;
                }
                int var21 = (-23 - var15 * var16 + class132.field2457) / (var16 + 1);
                if (~var21 < -6) {
                    var21 = 5;
                }
                int var22 = (class91.field1760 - var14 * var17 - (var17 + -1) * var20) / 2;
                int var23 = (class132.field2457 + -23 + -(var15 * var16) + -((var16 + -1) * var21)) / 2;
                int var24 = var23 + 23;
                int var25 = 0;
                int var26 = var22;
                for (int var27 = 0; ~var27 > ~class199.field3445; ++var27) {
                    class200 var28 = class107.field2045[var27];
                    boolean var29 = true;
                    class66 var30 = class144.method989(var28.field3451, 0);
                    if (~var28.field3451 != 0) {
                        if (var28.field3451 > 1980) {
                            var29 = false;
                            var30 = class72.field1428;
                        }
                    } else {
                        var29 = false;
                        var30 = class178.field3117;
                    }
                    if (~var26 >= ~class170.field3021 && var24 <= class50.field896 && class170.field3021 < var14 + var26 && ~class50.field896 > ~(var15 + var24) && var29) {
                        class31.field463 = var27;
                        class193.field3343[var28.field3447 ? 1 : 0].method1153(class105.field2027 - -var26, class175.field3081 - -var24, 128, 16777215);
                    } else {
                        class193.field3343[var28.field3447 ? 1 : 0].method980(class105.field2027 + var26, class175.field3081 - -var24);
                    }
                    if (class242.field4231 != null) {
                        class242.field4231[var28.field3452 + (!var28.field3447 ? 0 : class242.field4231.length / 2)].method162(class105.field2027 + var26 - -29, class175.field3081 + var24);
                    }
                    arg2.method235(class144.method989(var28.field3450, arg0 + 38), var26 - -15 + class105.field2027, class175.field3081 + var24 - -(var15 / 2) + 5, 0, -1);
                    arg3.method235(var30, var26 + 60 + class105.field2027, var24 - -(var15 / 2) + class175.field3081 + 5, 268435455, -1);
                    var24 += var21 - -var15;
                    ++var25;
                    if (var16 <= var25) {
                        var24 = var23 + 23;
                        var25 = 0;
                        var26 += var14 + var20;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)Lkk;")
    public static final class47 method500(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        return var3 == null ? null : var3.field205;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field1353;
        if (!arg1) {
            this.field1372 = 100;
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) -101);
        if (super.field1946.field2297) {
            int[] var4 = this.method682(0, class45.field833 & arg0 + -1, 29149);
            int[] var5 = this.method682(0, arg0, 29149);
            int[] var6 = this.method682(0, class45.field833 & arg0 - -1, 29149);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class199.field3432 < ~var10; ++var10) {
                int var11 = (var5[class98.field1914 & var10 + 1] - var5[class98.field1914 & var10 + -1]) * this.field1372;
                int var12 = (var6[var10] + -var4[var10]) * this.field1372;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var20 = var11 / var17;
                    var19 = 16777216 / var17;
                }
                if (this.field1370) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var18 = 2048 - -(var18 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }
}
