import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class101 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lhc;")
    public static class171 field1887 = new class171(64);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ltf;")
    public static class254 field1892 = new class254();

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lud;")
    public static class279 field1896 = class130.method1024("OK", 255);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field1894 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "[[Lvk;")
    public static class168[][] field1897;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLok;Lok;Z)V", line = 18)
    public static final void method856(boolean arg0, class149 arg1, class149 arg2, boolean arg3) {
        if (arg3) {
            field1892 = (class254) null;
        }
        class48.field974 = arg0;
        field1889++;
        class199.field3548 = arg2;
        class224.field3961 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lvh;I)V", line = 33)
    public static final void method857(class53 arg0, int arg1) {
        field1890++;
        byte[][] var2 = new byte[class121.field2180][class166.field3007];
        int var3 = class17.field537 >> 1;
        int var4 = class240.field4224 >> 2 << 10;
        while (arg0.field1168.length > arg0.field1142) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method483(-126) == 1) {
                var5 = true;
                var7 = arg0.method483(-108);
                var6 = arg0.method483(-116);
            }
            int var8 = arg0.method483(-109);
            int var9 = arg0.method483(-116);
            int var10 = var8 * 64 - class245.field4356;
            int var11 = class34.field777 + class166.field3007 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class121.field2180 > var10 + 63 && class166.field3007 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var2[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= (var7 * 8) && var7 * 8 + 8 > var12 && var14 >= (var6 * 8) && (var6 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg0.method494(false);
                        }
                    }
                }
            } else if (var5) {
                arg0.field1142 += 64;
            } else {
                arg0.field1142 += 4096;
            }
        }
        int var15 = -12 % ((43 - arg1) / 46);
        int var16 = class166.field3007;
        int var17 = class121.field2180;
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        int[] var22 = new int[var16];
        for (int var23 = -5; var23 < var17; var23++) {
            for (int var24 = 0; var24 < var16; var24++) {
                int var25 = var23 + 5;
                int var10002;
                if (var25 < var17) {
                    int var26 = var2[var25][var24] & 0xFF;
                    if (var26 > 0) {
                        class124 var27 = class41.method355(var26 - 1, (byte) 113);
                        var19[var24] += var27.field2253;
                        var18[var24] += var27.field2240;
                        var20[var24] += var27.field2242;
                        var21[var24] += var27.field2250;
                        var10002 = var22[var24]++;
                    }
                }
                int var28 = var23 - 5;
                if (var28 >= 0) {
                    int var29 = var2[var28][var24] & 0xFF;
                    if (var29 > 0) {
                        class124 var30 = class41.method355(var29 - 1, (byte) -127);
                        var19[var24] -= var30.field2253;
                        var18[var24] -= var30.field2240;
                        var20[var24] -= var30.field2242;
                        var21[var24] -= var30.field2250;
                        var10002 = var22[var24]--;
                    }
                }
            }
            if (var23 >= 0) {
                int[][] var31 = class232.field4067[var23 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = -5; var37 < var16; var37++) {
                    int var38 = var37 + 5;
                    int var39 = var37 - 5;
                    if (var38 < var16) {
                        var36 += var20[var38];
                        var33 += var18[var38];
                        var34 += var22[var38];
                        var32 += var19[var38];
                        var35 += var21[var38];
                    }
                    if (var39 >= 0) {
                        var35 -= var21[var39];
                        var32 -= var19[var39];
                        var36 -= var20[var39];
                        var34 -= var22[var39];
                        var33 -= var18[var39];
                    }
                    if (var37 >= 0 && var34 > 0) {
                        int[] var40 = var31[var37 >> 6];
                        int var41 = var35 == 0 ? 0 : class32.method294((byte) 105, var33 / var34, var32 * 256 / var35, var36 / var34);
                        if (var2[var23][var37] != 0) {
                            if (var40 == null) {
                                var40 = var31[var37 >> 6] = new int[4096];
                            }
                            int var42 = (var41 & 0x7F) + var3;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 > 127) {
                                var42 = 127;
                            }
                            int var43 = (var41 & 0x380) + (var41 + var4 & 0xFC00) + var42;
                            var40[class52.method442(63, var23) + (class52.method442(var37, 63) << 6)] = class27.field645[class310.method2208(var43, (byte) 102, 96)];
                        } else if (var40 != null) {
                            var40[class52.method442(var37 << 6, 4032) + class52.method442(63, var23)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lgf;I)V", line = 265)
    public static final void method858(int arg0, class8[] arg1, int arg2) {
        field1888++;
        int var3 = 0;
        int var4 = 113 % ((arg0 + 33) / 37);
        while (arg1.length > var3) {
            class8 var5 = arg1[var3];
            if (var5 != null && var5.field324 == arg2 && (!var5.field223 || !client.method1800(var5))) {
                label118: {
                    if (var5.field201 == 0) {
                        if (!var5.field223 && client.method1800(var5) && class111.field2048 != var5) {
                            break label118;
                        }
                        method858(42, arg1, var5.field299);
                        if (var5.field159 != null) {
                            method858(-121, var5.field159, var5.field299);
                        }
                        class176 var6 = (class176) class226.field3977.method610((long) var5.field299, -1);
                        if (var6 != null) {
                            class212.method1561(var6.field3165, -1);
                        }
                    }
                    if (var5.field201 == 6) {
                        if (var5.field191 != -1 || var5.field258 != -1) {
                            boolean var7 = class254.method1820(var5, -4);
                            int var8;
                            if (var7) {
                                var8 = var5.field258;
                            } else {
                                var8 = var5.field191;
                            }
                            if (var8 != -1) {
                                class182 var9 = class131.method1033((byte) -82, var8);
                                if (var9 != null) {
                                    var5.field222 += class121.field2187;
                                    while (var5.field222 > var9.field3318[var5.field217]) {
                                        var5.field222 -= var9.field3318[var5.field217];
                                        var5.field217++;
                                        if (var9.field3341.length <= var5.field217) {
                                            var5.field217 -= var9.field3350;
                                            if (var5.field217 < 0 || var5.field217 >= var9.field3341.length) {
                                                var5.field217 = 0;
                                            }
                                        }
                                        var5.field298 = var5.field217 + 1;
                                        if (var9.field3341.length <= var5.field298) {
                                            var5.field298 -= var9.field3350;
                                            if (var5.field298 < 0 || var5.field298 >= var9.field3341.length) {
                                                var5.field298 = -1;
                                            }
                                        }
                                        class50.method426(var5, false);
                                    }
                                }
                            }
                        }
                        if (var5.field290 != 0 && !var5.field223) {
                            int var10 = var5.field290 << 16 >> 16;
                            int var11 = class121.field2187 * var10;
                            var5.field227 = var5.field227 + var11 & 0x7FF;
                            int var12 = var5.field290 >> 16;
                            int var13 = class121.field2187 * var12;
                            var5.field237 = var5.field237 + var13 & 0x7FF;
                            class50.method426(var5, false);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 382)
    public static void method859(int arg0) {
        field1887 = null;
        field1897 = (class168[][]) null;
        field1896 = null;
        field1892 = null;
        if (arg0 >= -50) {
            method856(false, (class149) null, (class149) null, false);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lok;Lpa;Lok;I)V", line = 399)
    public static final void method860(class149 arg0, class2 arg1, class149 arg2, int arg3) {
        if (arg3 != 12658) {
            return;
        }
        field1885++;
        class45.field941 = arg1;
        class265.field4775 = arg0;
        class94.field1767 = arg2;
        if (class94.field1767 != null) {
            class250.field4459 = class94.field1767.method1174(1, arg3 - 30338);
        }
        if (class265.field4775 != null) {
            class324.field5668 = class265.field4775.method1174(1, arg3 - 30338);
        }
    }
}
