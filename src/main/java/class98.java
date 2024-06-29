import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class98 extends class285 {

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "[S")
    private short[] field1396 = new short[512];

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "[B")
    private byte[] field1395 = new byte[512];

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    private int field1398 = 2;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    private int field1389 = 2048;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    private int field1397 = 5;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    private int field1390 = 5;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    private int field1402 = 0;

    @OriginalMember(owner = "client!bh", name = "ib", descriptor = "I")
    private int field1409 = 1;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "Z")
    public static boolean field1399 = false;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Lhh;")
    public static class169 field1392 = new class169();

    @OriginalMember(owner = "client!bh", name = "jb", descriptor = "I")
    public static int field1410 = 0;

    @OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
    public static int field1408 = 0;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 6)
    public final void method361(int arg0) {
        int var2 = 98 % ((42 - arg0) / 36);
        field1401++;
        this.field1395 = class34.method183(this.field1402, -14115);
        this.method670((byte) -128);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLjj;I)V", line = 16)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field1403++;
        if (!arg0) {
            method665((byte) -26);
        }
        if (arg2 == 0) {
            this.field1390 = this.field1397 = arg1.method286((byte) -95);
        } else if (arg2 == 1) {
            this.field1402 = arg1.method286((byte) -65);
        } else if (arg2 == 2) {
            this.field1389 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field1398 = arg1.method286((byte) -104);
        } else if (arg2 == 4) {
            this.field1409 = arg1.method286((byte) -119);
        } else if (arg2 == 5) {
            this.field1390 = arg1.method286((byte) -116);
        } else if (arg2 == 6) {
            this.field1397 = arg1.method286((byte) -97);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjj;Ljava/lang/String;)I", line = 101)
    public static final int method664(int arg0, class44 arg1, String arg2) {
        field1405++;
        int var3 = arg1.field586;
        byte[] var4 = class256.method1833(arg2, 112);
        arg1.method225(false, var4.length);
        if (arg0 != 5) {
            field1408 = -9;
        }
        arg1.field586 += class18.field254.method974(255, arg1.field573, 0, var4.length, arg1.field586, var4);
        return arg1.field586 - var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[I", line = 122)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            method667(125, (class157) null, 17, 43);
        }
        field1400++;
        int[] var3 = this.field4573.method1116(111, arg1);
        if (this.field4573.field2420) {
            int var4 = class27.field382[arg1] * this.field1397 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class287.field4599; var7++) {
                class224.field3582 = Integer.MAX_VALUE;
                class155.field2376 = Integer.MAX_VALUE;
                class196.field3192 = Integer.MAX_VALUE;
                class297.field4694 = Integer.MAX_VALUE;
                int var8 = class48.field669[var7] * this.field1390 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field1395[(this.field1397 <= var11 ? var11 - this.field1397 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field1395[(var13 < this.field1390 ? var13 : var13 - this.field1390) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field1396[var14];
                        int var16 = var4 - this.field1396[var27] - (var11 << 12);
                        int var17 = this.field1409;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var19 = var15 >= 0 ? var15 : -var15;
                            int var20 = var16 >= 0 ? var16 : -var16;
                            var18 = var19 > var20 ? var19 : var20;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var18 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var16 * var16;
                            int var22 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class297.field4694 > var18) {
                            class224.field3582 = class155.field2376;
                            class155.field2376 = class196.field3192;
                            class196.field3192 = class297.field4694;
                            class297.field4694 = var18;
                        } else if (class196.field3192 > var18) {
                            class224.field3582 = class155.field2376;
                            class155.field2376 = class196.field3192;
                            class196.field3192 = var18;
                        } else if (class155.field2376 > var18) {
                            class224.field3582 = class155.field2376;
                            class155.field2376 = var18;
                        } else if (var18 < class224.field3582) {
                            class224.field3582 = var18;
                        }
                    }
                }
                int var26 = this.field1398;
                if (var26 == 0) {
                    var3[var7] = class297.field4694;
                } else if (var26 == 1) {
                    var3[var7] = class196.field3192;
                } else if (var26 == 3) {
                    var3[var7] = class155.field2376;
                } else if (var26 == 4) {
                    var3[var7] = class224.field3582;
                } else if (var26 == 2) {
                    var3[var7] = class196.field3192 - class297.field4694;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 342)
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V", line = 349)
    public static void method665(byte arg0) {
        if (arg0 != 113) {
            method669(false, (class172) null);
        }
        field1392 = null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)Lbo;", line = 360)
    public static final class256 method666(byte arg0, int arg1) {
        field1404++;
        class256 var2 = (class256) class158.field2613.method704((byte) 42, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class121.field1882.method1287(class27.method156(arg1, false), class245.method1750(arg1, true), -1);
        class256 var4 = new class256();
        if (arg0 != -65) {
            method669(false, (class172) null);
        }
        var4.field4106 = arg1;
        if (var3 != null) {
            var4.method1832(new class44(var3), false);
        }
        var4.method1839(70);
        class158.field2613.method703(var4, (long) arg1, (byte) 101);
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILog;II)V", line = 394)
    public static final void method667(int arg0, class157 arg1, int arg2, int arg3) {
        field1393++;
        if (class307.field4783 != null || class196.field3204 || arg1 == null || class259.method1855(arg1, (byte) -111) == null) {
            return;
        }
        class307.field4783 = arg1;
        class194.field3181 = class259.method1855(arg1, (byte) -111);
        class307.field4792 = arg2;
        int var4 = -116 / ((arg0 + 16) / 55);
        class76.field1067 = arg3;
        class344.field5355 = false;
        class333.field5189 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII[Log;I)V", line = 424)
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class157[] arg8, int arg9) {
        if (class232.field3690) {
            class75.method506(arg5, arg7, arg3, arg4);
        } else {
            class59.method389(arg5, arg7, arg3, arg4);
            class170.method1250();
        }
        int var10 = 0;
        if (arg9 != -1) {
            method665((byte) -70);
        }
        while (var10 < arg8.length) {
            class157 var11 = arg8[var10];
            if (var11 != null && (var11.field2463 == arg6 || arg6 == -1412584499 && class307.field4783 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class81.field1146[class20.field291] = var11.field2519 + arg2;
                    class213.field3481[class20.field291] = var11.field2517 + arg0;
                    class197.field3215[class20.field291] = var11.field2468;
                    class323.field5013[class20.field291] = var11.field2520;
                    var12 = class20.field291++;
                } else {
                    var12 = arg1;
                }
                var11.field2512 = var12;
                var11.field2450 = class240.field3818;
                if (!var11.field2421 || !client.method777(var11)) {
                    label1139: {
                        if (var11.field2467 > 0) {
                            class190.method1407(var11, -96);
                        }
                        int var13 = var11.field2572;
                        int var14 = var11.field2519 + arg2;
                        int var15 = var11.field2517 + arg0;
                        if (class301.field4727 && (client.method766(var11).field4503 != 0 || var11.field2478 == 0) && var13 > 127) {
                            var13 = 127;
                        }
                        if (class307.field4783 == var11) {
                            if (arg6 != -1412584499 && !var11.field2585) {
                                class270.field4360 = arg8;
                                class39.field496 = arg0;
                                class287.field4597 = arg2;
                                break label1139;
                            }
                            if (!var11.field2585) {
                                var13 = 128;
                            }
                            if (class344.field5355 && class31.field424) {
                                int var16 = class233.field3738;
                                int var17 = class70.field995;
                                int var18 = var17 - class76.field1067;
                                int var19 = var16 - class307.field4792;
                                if (class158.field2608 > var18) {
                                    var18 = class158.field2608;
                                }
                                if (var18 + var11.field2468 > class158.field2608 - -class194.field3181.field2468) {
                                    var18 = class158.field2608 + class194.field3181.field2468 - var11.field2468;
                                }
                                if (var19 < class276.field4459) {
                                    var19 = class276.field4459;
                                }
                                if ((var11.field2520 + var19) > (class276.field4459 + class194.field3181.field2520)) {
                                    var19 = class276.field4459 + class194.field3181.field2520 - var11.field2520;
                                }
                                var14 = var18;
                                var15 = var19;
                            }
                        }
                        int var21;
                        int var23;
                        int var24;
                        int var25;
                        if (var11.field2478 == 2) {
                            var21 = arg5;
                            var23 = arg4;
                            var24 = arg3;
                            var25 = arg7;
                        } else {
                            int var20 = var15 + var11.field2520;
                            var21 = arg5 < var14 ? var14 : arg5;
                            int var22 = var11.field2468 + var14;
                            if (var11.field2478 == 9) {
                                var22++;
                                var20++;
                            }
                            var23 = var20 < arg4 ? var20 : arg4;
                            var24 = arg3 <= var22 ? arg3 : var22;
                            var25 = arg7 >= var15 ? arg7 : var15;
                        }
                        if (!var11.field2421 || var24 > var21 && var25 < var23) {
                            label1151: {
                                if (var11.field2467 != 0) {
                                    if (var11.field2467 == 1337 || var11.field2467 == 1403) {
                                        class89.field1234 = var11;
                                        class331.field5161 = var14;
                                        class111.field1653 = var15;
                                        class43.method219(var15, var11.field2467 == 1403, 0, var11.field2468, var11.field2520, var14);
                                        class174.field2884[var12] = true;
                                        if (class232.field3690) {
                                            class75.method506(arg5, arg7, arg3, arg4);
                                        } else {
                                            class59.method389(arg5, arg7, arg3, arg4);
                                        }
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1338) {
                                        if (!var11.method1126(false)) {
                                            break label1151;
                                        }
                                        class14.method83(var12, var15, var14, -1, var11);
                                        if (class232.field3690) {
                                            class75.method506(arg5, arg7, arg3, arg4);
                                        } else {
                                            class59.method389(arg5, arg7, arg3, arg4);
                                        }
                                        if (client.field1658 != 0 && client.field1658 != 3 || class196.field3204 || var21 > class200.field3248 || var25 > class222.field3554 || var24 <= class200.field3248 || class222.field3554 >= var23) {
                                            break label1151;
                                        }
                                        int var26 = class200.field3248 - var14;
                                        int var27 = class222.field3554 - var15;
                                        int var28 = var11.field2502[var27];
                                        if (var26 < var28 || var26 > var28 + var11.field2582[var27]) {
                                            break label1151;
                                        }
                                        int var29 = var26 - var11.field2468 / 2;
                                        int var30 = var27 - var11.field2520 / 2;
                                        int var31 = (int) class330.field5090 + class69.field983 & 0x7FF;
                                        int var32 = class170.field2810[var31];
                                        int var33 = (class320.field4963 + 256) * var32 >> 8;
                                        int var34 = class170.field2801[var31];
                                        int var35 = (class320.field4963 + 256) * var34 >> 8;
                                        int var36 = var29 * var33 + var30 * var35 >> 11;
                                        int var37 = var30 * var33 - (var29 * var35) >> 11;
                                        int var38 = class191.field3129.field4255 + var36 + 64 - class191.field3129.method1881(arg9 ^ 0x4FAA) * 64 >> 7;
                                        int var39 = class191.field3129.field4264 + (-var37 - (class191.field3129.method1881(-20395) * 64 - 64)) >> 7;
                                        if (class142.field2216 && (class158.field2615 & 0x40) != 0) {
                                            class157 var40 = class275.method1996(124, class182.field3013, class311.field4851);
                                            if (var40 == null) {
                                                class106.method733(-1);
                                            } else {
                                                class20.method111(class141.field2204, var39, var38, " ->", (short) 40, class331.field5165, arg9 ^ 0xFFFFFFFE, 1L);
                                            }
                                            break label1151;
                                        }
                                        if (class15.field169 == 1) {
                                            class20.method111(class323.field5028, var39, var38, "", (short) 32, -1, 1, 1L);
                                        }
                                        class20.method111(class344.field5357, var39, var38, "", (short) 14, -1, 1, 1L);
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1339) {
                                        if (var11.method1126(false)) {
                                            class43.method217(var15, arg9 + 3, var14, var12, var11);
                                            if (class232.field3690) {
                                                class75.method506(arg5, arg7, arg3, arg4);
                                            } else {
                                                class59.method389(arg5, arg7, arg3, arg4);
                                            }
                                        }
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1400) {
                                        class27.method155(var15, var14, var11.field2520, var11.field2468, 2);
                                        class174.field2884[var12] = true;
                                        class127.field1991[var12] = true;
                                        if (class232.field3690) {
                                            class75.method506(arg5, arg7, arg3, arg4);
                                        } else {
                                            class59.method389(arg5, arg7, arg3, arg4);
                                        }
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1401) {
                                        class147.method1079(var14, -11, var11.field2468, var11.field2520, var15);
                                        class174.field2884[var12] = true;
                                        class127.field1991[var12] = true;
                                        if (class232.field3690) {
                                            class75.method506(arg5, arg7, arg3, arg4);
                                        } else {
                                            class59.method389(arg5, arg7, arg3, arg4);
                                        }
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1402) {
                                        if (!class232.field3690) {
                                            class301.method2147(false, var15, var14);
                                            class174.field2884[var12] = true;
                                            class127.field1991[var12] = true;
                                        }
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1405) {
                                        if (!class247.field3899) {
                                            break label1151;
                                        }
                                        int var41 = var11.field2468 + var14;
                                        int var42 = var15 + 15;
                                        class296.field4688.method1813("Fps:" + class145.field2257, var41, var42, 16776960, -1);
                                        int var142 = var42 + 15;
                                        Runtime var43 = Runtime.getRuntime();
                                        int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                        int var45 = 16776960;
                                        if (var44 > 65536) {
                                            var45 = 16711680;
                                        }
                                        class296.field4688.method1813("Mem:" + var44 + "k", var41, var142, var45, -1);
                                        var42 = var142 + 15;
                                        if (class232.field3690) {
                                            int var46 = (class230.field3660 + class230.field3663 + class230.field3662) / 1024;
                                            int var47 = 16776960;
                                            if (var46 > 65536) {
                                                var47 = 16711680;
                                            }
                                            class296.field4688.method1813("Card:" + var46 + "k", var41, var42, var47, -1);
                                            var42 += 15;
                                        }
                                        int var48 = 0;
                                        int var49 = 16776960;
                                        int var50 = 0;
                                        int var51 = 0;
                                        for (int var52 = 0; var52 < 29; var52++) {
                                            var48 += class333.field5192[var52].method1994(0);
                                            var50 += class333.field5192[var52].method1989((byte) 107);
                                            var51 += class333.field5192[var52].method1988((byte) -101);
                                        }
                                        int var53 = var50 * 10000 / var48;
                                        int var54 = var51 * 100 / var48;
                                        String var55 = "Cache:" + class194.method1432(0, (long) var53, true, 2, (byte) 106) + "% (" + var54 + "%)";
                                        class2.field30.method1813(var55, var41, var42, var49, -1);
                                        var42 += 12;
                                        class174.field2884[var12] = true;
                                        class127.field1991[var12] = true;
                                        break label1151;
                                    }
                                    if (var11.field2467 == 1406) {
                                        class205.field3372 = var14;
                                        class61.field868 = var15;
                                        class174.field2878 = var11;
                                        break label1151;
                                    }
                                }
                                if (!class196.field3204) {
                                    if (var11.field2478 == 0 && var11.field2422 && var21 <= class200.field3248 && class222.field3554 >= var25 && var24 > class200.field3248 && class222.field3554 < var23 && !class301.field4727) {
                                        class168.field2777[0] = class81.field1132;
                                        class185.field3070 = 1;
                                        class113.field1727[0] = 1003;
                                        class212.field3474[0] = class222.field3560;
                                        class157.field2458[0] = "";
                                    }
                                    if (class200.field3248 >= var21 && var25 <= class222.field3554 && class200.field3248 < var24 && class222.field3554 < var23) {
                                        class144.method1061(class222.field3554 - var15, 1, var11, class200.field3248 - var14);
                                    }
                                }
                                if (var11.field2478 == 0) {
                                    if (!var11.field2421 && client.method777(var11) && class256.field4101 != var11) {
                                        break label1151;
                                    }
                                    if (!var11.field2421) {
                                        if (var11.field2528 - var11.field2520 < var11.field2591) {
                                            var11.field2591 = var11.field2528 - var11.field2520;
                                        }
                                        if (var11.field2591 < 0) {
                                            var11.field2591 = 0;
                                        }
                                    }
                                    if (class232.field3690 && var11.field2467 == 1407) {
                                        class269.method1918(var14, var15, var11.field2468, var11.field2520);
                                    }
                                    method668(var15 - var11.field2591, var12, var14 - var11.field2499, var24, var23, var21, var11.field2486, var25, arg8, arg9 ^ 0x0);
                                    if (var11.field2472 != null) {
                                        method668(var15 - var11.field2591, var12, var14 - var11.field2499, var24, var23, var21, var11.field2486, var25, var11.field2472, -1);
                                    }
                                    class90 var56 = (class90) class243.field3842.method451((long) var11.field2486, (byte) 100);
                                    if (var56 != null) {
                                        if (var56.field1247 == 0 && !class196.field3204 && class200.field3248 >= var21 && var25 <= class222.field3554 && var24 > class200.field3248 && var23 > class222.field3554 && !class301.field4727) {
                                            class168.field2777[0] = class81.field1132;
                                            class185.field3070 = 1;
                                            class212.field3474[0] = class222.field3560;
                                            class157.field2458[0] = "";
                                            class113.field1727[0] = 1003;
                                        }
                                        class43.method215(var21, 0, var23, var15, var12, var56.field1249, var14, var24, var25);
                                    }
                                    if (class232.field3690 && var11.field2467 == 1407) {
                                        class269.method1910();
                                    }
                                    if (class232.field3690) {
                                        class75.method506(arg5, arg7, arg3, arg4);
                                    } else {
                                        class59.method389(arg5, arg7, arg3, arg4);
                                        class170.method1250();
                                    }
                                }
                                if (class45.field638[var12] || class130.field2055 > 1) {
                                    if (var11.field2478 == 0 && !var11.field2421 && var11.field2528 > var11.field2520) {
                                        class187.method1395(var11.field2520, -124, var11.field2591, var15, var11.field2468 + var14, var11.field2528);
                                    }
                                    if (var11.field2478 != 1) {
                                        if (var11.field2478 == 2) {
                                            int var125 = 0;
                                            for (int var126 = 0; var126 < var11.field2424; var126++) {
                                                for (int var127 = 0; var127 < var11.field2428; var127++) {
                                                    int var128 = (var11.field2590 + 32) * var127 + var14;
                                                    int var129 = var15 + ((var11.field2454 + 32) * var126);
                                                    if (var125 < 20) {
                                                        var129 += var11.field2427[var125];
                                                        var128 += var11.field2442[var125];
                                                    }
                                                    if (var11.field2483[var125] > 0) {
                                                        boolean var130 = false;
                                                        boolean var131 = false;
                                                        int var132 = var11.field2483[var125] - 1;
                                                        if (arg5 < var128 + 32 && var128 < arg3 && (var129 + 32) > arg7 && var129 < arg4 || class279.field4504 == var11 && class175.field2909 == var125) {
                                                            class58 var133;
                                                            if (class8.field119 == 1 && class231.field3674 == var125 && class223.field3563 == var11.field2486) {
                                                                var133 = class165.method1215(var11.field2566, var11.field2542[var125], 28572, (class106) null, var132, 0, 2);
                                                            } else {
                                                                var133 = class165.method1215(var11.field2566, var11.field2542[var125], 28572, (class106) null, var132, 3153952, 1);
                                                            }
                                                            if (class170.field2807) {
                                                                class174.field2884[var12] = true;
                                                            }
                                                            if (var133 == null) {
                                                                class320.method2252(var11, 0);
                                                            } else if (class279.field4504 == var11 && class175.field2909 == var125) {
                                                                int var134 = class70.field995 - class208.field3415;
                                                                int var135 = class233.field3738 - class113.field1718;
                                                                if (var135 < 5 && var135 > -5) {
                                                                    var135 = 0;
                                                                }
                                                                if (var134 < 5 && var134 > -5) {
                                                                    var134 = 0;
                                                                }
                                                                if (class335.field5247 < 5) {
                                                                    var135 = 0;
                                                                    var134 = 0;
                                                                }
                                                                var133.method368(var128 + var134, var129 + var135, 128);
                                                                if (arg6 != -1) {
                                                                    class157 var136 = arg8[arg6 & 0xFFFF];
                                                                    int var137;
                                                                    int var138;
                                                                    if (class232.field3690) {
                                                                        var137 = class75.field1055;
                                                                        var138 = class75.field1054;
                                                                    } else {
                                                                        var137 = class59.field826;
                                                                        var138 = class59.field832;
                                                                    }
                                                                    if ((var129 + var135) < var138 && var136.field2591 > 0) {
                                                                        int var139 = (var138 - var135 - var129) * class36.field477 / 3;
                                                                        if (var139 > class36.field477 * 10) {
                                                                            var139 = class36.field477 * 10;
                                                                        }
                                                                        if (var136.field2591 < var139) {
                                                                            var139 = var136.field2591;
                                                                        }
                                                                        var136.field2591 -= var139;
                                                                        class113.field1718 += var139;
                                                                        class320.method2252(var136, 0);
                                                                    }
                                                                    if (var137 < (var129 - (-var135 - 32)) && var136.field2591 < var136.field2528 - var136.field2520) {
                                                                        int var140 = (var129 + var135 + 32 - var137) * class36.field477 / 3;
                                                                        if (var140 > (class36.field477 * 10)) {
                                                                            var140 = class36.field477 * 10;
                                                                        }
                                                                        if (var136.field2528 - var136.field2591 - var136.field2520 < var140) {
                                                                            var140 = var136.field2528 - var136.field2520 - var136.field2591;
                                                                        }
                                                                        var136.field2591 += var140;
                                                                        class113.field1718 -= var140;
                                                                        class320.method2252(var136, 0);
                                                                    }
                                                                }
                                                            } else if (class103.field1498 == var11 && class321.field4980 == var125) {
                                                                var133.method368(var128, var129, 128);
                                                            } else {
                                                                var133.method375(var128, var129);
                                                            }
                                                        }
                                                    } else if (var11.field2571 != null && var125 < 20) {
                                                        class58 var141 = var11.method1134(-7, var125);
                                                        if (var141 != null) {
                                                            var141.method375(var128, var129);
                                                        } else if (class321.field4974) {
                                                            class320.method2252(var11, 0);
                                                        }
                                                    }
                                                    var125++;
                                                }
                                            }
                                        } else if (var11.field2478 == 3) {
                                            int var57;
                                            if (class103.method709(11, var11)) {
                                                var57 = var11.field2439;
                                                if (class256.field4101 == var11 && var11.field2448 != 0) {
                                                    var57 = var11.field2448;
                                                }
                                            } else {
                                                var57 = var11.field2436;
                                                if (class256.field4101 == var11 && var11.field2524 != 0) {
                                                    var57 = var11.field2524;
                                                }
                                            }
                                            if (var13 == 0) {
                                                if (var11.field2561) {
                                                    if (class232.field3690) {
                                                        class75.method505(var14, var15, var11.field2468, var11.field2520, var57);
                                                    } else {
                                                        class59.method382(var14, var15, var11.field2468, var11.field2520, var57);
                                                    }
                                                } else if (class232.field3690) {
                                                    class75.method507(var14, var15, var11.field2468, var11.field2520, var57);
                                                } else {
                                                    class59.method390(var14, var15, var11.field2468, var11.field2520, var57);
                                                }
                                            } else if (var11.field2561) {
                                                if (class232.field3690) {
                                                    class75.method510(var14, var15, var11.field2468, var11.field2520, var57, 256 - (var13 & 0xFF));
                                                } else {
                                                    class59.method394(var14, var15, var11.field2468, var11.field2520, var57, 256 - (var13 & 0xFF));
                                                }
                                            } else if (class232.field3690) {
                                                class75.method501(var14, var15, var11.field2468, var11.field2520, var57, 256 - (var13 & 0xFF));
                                            } else {
                                                class59.method398(var14, var15, var11.field2468, var11.field2520, var57, 256 - (var13 & 0xFF));
                                            }
                                        } else if (var11.field2478 == 4) {
                                            class251 var58 = var11.method1136(class99.field1416, (byte) 95);
                                            if (var58 != null) {
                                                String var59 = var11.field2493;
                                                int var60;
                                                if (class103.method709(-125, var11)) {
                                                    var60 = var11.field2439;
                                                    if (class256.field4101 == var11 && var11.field2448 != 0) {
                                                        var60 = var11.field2448;
                                                    }
                                                    if (var11.field2547.length() > 0) {
                                                        var59 = var11.field2547;
                                                    }
                                                } else {
                                                    var60 = var11.field2436;
                                                    if (class256.field4101 == var11 && var11.field2524 != 0) {
                                                        var60 = var11.field2524;
                                                    }
                                                }
                                                if (var11.field2421 && var11.field2487 != -1) {
                                                    class330 var61 = class285.method2054(var11.field2487, 0);
                                                    var59 = var61.field5135;
                                                    if (var59 == null) {
                                                        var59 = "null";
                                                    }
                                                    if ((var61.field5097 == 1 || var11.field2593 != 1) && var11.field2593 != -1) {
                                                        var59 = "<col=ff9040>" + var59 + "</col> x" + class190.method1408(var11.field2593, 150);
                                                    }
                                                }
                                                if (class52.field740 == var11) {
                                                    var60 = var11.field2436;
                                                    var59 = class99.field1427;
                                                }
                                                if (!var11.field2421) {
                                                    var59 = class342.method2376(true, var11, var59);
                                                }
                                                var58.method1802(var59, var14, var15, var11.field2468, var11.field2520, var60, var11.field2587 ? 0 : -1, var11.field2599, var11.field2551, var11.field2498);
                                            } else if (class321.field4974) {
                                                class320.method2252(var11, 0);
                                            }
                                        } else if (var11.field2478 == 5) {
                                            if (!var11.field2421) {
                                                class58 var108 = var11.method1130(115, class103.method709(arg9 + 128, var11));
                                                if (var108 != null) {
                                                    var108.method375(var14, var15);
                                                } else if (class321.field4974) {
                                                    class320.method2252(var11, ~arg9);
                                                }
                                            } else if (var11.field2445 >= 0) {
                                                class266 var124 = var11.method1135(arg9 + 27480);
                                                if (class232.field3690) {
                                                    var124.method1891(0, var14, var15, var11.field2468, var11.field2520, var11.field2490, var11.field2481, 0);
                                                } else {
                                                    var124.method1890(0, var14, var15, var11.field2468, var11.field2520, var11.field2490, var11.field2481, 0);
                                                }
                                            } else {
                                                class58 var109;
                                                if (var11.field2487 == -1) {
                                                    var109 = var11.method1130(109, false);
                                                } else if (var11.field2583 && class191.field3129.field5224 != null) {
                                                    var109 = class165.method1215(var11.field2566, var11.field2593, 28572, class191.field3129.field5224, var11.field2487, var11.field2496, var11.field2503);
                                                } else {
                                                    var109 = class165.method1215(var11.field2566, var11.field2593, 28572, (class106) null, var11.field2487, var11.field2496, var11.field2503);
                                                }
                                                if (var109 != null) {
                                                    int var110 = var109.field813;
                                                    int var111 = var109.field817;
                                                    if (var11.field2456) {
                                                        int var112 = (var11.field2468 + var110 - 1) / var110;
                                                        int var113 = (var111 + var11.field2520 - 1) / var111;
                                                        if (class232.field3690) {
                                                            class75.method497(var14, var15, var11.field2468 + var14, var15 - -var11.field2520);
                                                            boolean var114 = class60.method408(var109.field825, true);
                                                            class314 var115 = (class314) var109;
                                                            boolean var116 = class60.method408(var109.field816, true);
                                                            if (var114 && var116) {
                                                                if (var13 == 0) {
                                                                    var115.method2206(var14, var15, var112, var113);
                                                                } else {
                                                                    var115.method2209(var14, var15, 256 - (var13 & 0xFF), var112, var113);
                                                                }
                                                            } else if (var114) {
                                                                for (int var120 = 0; var120 < var113; var120++) {
                                                                    if (var13 == 0) {
                                                                        var115.method2206(var14, var111 * var120 + var15, var112, 1);
                                                                    } else {
                                                                        var115.method2209(var14, var111 * var120 + var15, -(var13 & 0xFF) + 256, var112, 1);
                                                                    }
                                                                }
                                                            } else if (var116) {
                                                                for (int var119 = 0; var119 < var112; var119++) {
                                                                    if (var13 == 0) {
                                                                        var115.method2206(var110 * var119 + var14, var15, 1, var113);
                                                                    } else {
                                                                        var115.method2209(var14 + (var110 * var119), var15, 256 - (var13 & 0xFF), 1, var113);
                                                                    }
                                                                }
                                                            } else {
                                                                for (int var117 = 0; var117 < var112; var117++) {
                                                                    for (int var118 = 0; var118 < var113; var118++) {
                                                                        if (var13 == 0) {
                                                                            var109.method375(var110 * var117 + var14, var111 * var118 + var15);
                                                                        } else {
                                                                            var109.method368(var110 * var117 + var14, var111 * var118 + var15, 256 - (var13 & 0xFF));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            class75.method506(arg5, arg7, arg3, arg4);
                                                        } else {
                                                            class59.method386(var14, var15, var14 + var11.field2468, var11.field2520 + var15);
                                                            int var121 = 0;
                                                            while (true) {
                                                                if (var121 >= var112) {
                                                                    class59.method389(arg5, arg7, arg3, arg4);
                                                                    break;
                                                                }
                                                                for (int var122 = 0; var122 < var113; var122++) {
                                                                    if (var11.field2537 != 0) {
                                                                        var109.method371((byte) 95, 4096, var111 * var122 + var111 / 2 + var15, var110 * var121 + var110 / 2 + var14, var11.field2537);
                                                                    } else if (var13 == 0) {
                                                                        var109.method375(var110 * var121 + var14, var15 - -(var111 * var122));
                                                                    } else {
                                                                        var109.method368(var14 + (var110 * var121), var111 * var122 + var15, 256 - (var13 & 0xFF));
                                                                    }
                                                                }
                                                                var121++;
                                                            }
                                                        }
                                                    } else {
                                                        int var123 = var11.field2468 * 4096 / var110;
                                                        if (var11.field2537 != 0) {
                                                            var109.method371((byte) 90, var123, var15 + (var11.field2520 / 2), var11.field2468 / 2 + var14, var11.field2537);
                                                        } else if (var13 != 0) {
                                                            var109.method380(var14, var15, var11.field2468, var11.field2520, 256 - (var13 & 0xFF));
                                                        } else if (var11.field2468 == var110 && var11.field2520 == var111) {
                                                            var109.method375(var14, var15);
                                                        } else {
                                                            var109.method376(var14, var15, var11.field2468, var11.field2520);
                                                        }
                                                    }
                                                } else if (class321.field4974) {
                                                    class320.method2252(var11, 0);
                                                }
                                            }
                                        } else if (var11.field2478 == 6) {
                                            boolean var89 = class103.method709(95, var11);
                                            int var90;
                                            if (var89) {
                                                var90 = var11.field2545;
                                            } else {
                                                var90 = var11.field2581;
                                            }
                                            class262 var91 = null;
                                            int var92 = 0;
                                            if (var11.field2487 != -1) {
                                                class330 var97 = class285.method2054(var11.field2487, ~arg9);
                                                if (var97 != null) {
                                                    class330 var98 = var97.method2304((byte) -90, var11.field2593);
                                                    class202 var99 = var90 == -1 ? null : class325.method2274(var90, -79);
                                                    if (var11.field2583 && class191.field3129.field5224 != null) {
                                                        var91 = var98.method2318(class191.field3129.field5224, var11.field2497, var99, var11.field2476, 1, var11.field2584, (byte) 106);
                                                    } else {
                                                        var91 = var98.method2318((class106) null, var11.field2497, var99, var11.field2476, 1, var11.field2584, (byte) 97);
                                                    }
                                                    if (var91 == null) {
                                                        class320.method2252(var11, 0);
                                                    } else {
                                                        var92 = -var91.method33() / 2;
                                                    }
                                                }
                                            } else if (var11.field2516 == 5) {
                                                if (var11.field2455 == -1) {
                                                    var91 = class282.field4531.method725((class202) null, true, (class240[]) null, -1, -1, -1, -1, (class202) null, 0, 0, (byte) 100);
                                                } else {
                                                    int var94 = var11.field2455 & 0x7FF;
                                                    if (class234.field3758 == var94) {
                                                        var94 = 2047;
                                                    }
                                                    class334 var95 = class74.field1049[var94];
                                                    class202 var96 = var90 == -1 ? null : class325.method2274(var90, arg9 - 111);
                                                    if (var95 != null && (int) class204.method1491(-26916, var95.field5216) << 11 == (var11.field2455 & 0xFFFFF800)) {
                                                        var91 = var95.field5224.method725(var96, true, (class240[]) null, -1, var11.field2497, -1, 0, (class202) null, 0, 0, (byte) 100);
                                                    }
                                                }
                                            } else if (var90 == -1) {
                                                var91 = var11.method1132(0, -1, var89, (class202) null, class191.field3129.field5224, -27954, -1);
                                                if (var91 == null && class321.field4974) {
                                                    class320.method2252(var11, 0);
                                                }
                                            } else {
                                                class202 var93 = class325.method2274(var90, arg9 ^ 0x4E);
                                                var91 = var11.method1132(var11.field2476, var11.field2584, var89, var93, class191.field3129.field5224, -27954, var11.field2497);
                                                if (var91 == null && class321.field4974) {
                                                    class320.method2252(var11, 0);
                                                }
                                            }
                                            if (var91 != null) {
                                                int var100;
                                                if (var11.field2464 > 0) {
                                                    var100 = (var11.field2468 << 8) / var11.field2464;
                                                } else {
                                                    var100 = 256;
                                                }
                                                int var101;
                                                if (var11.field2548 > 0) {
                                                    var101 = (var11.field2520 << 8) / var11.field2548;
                                                } else {
                                                    var101 = 256;
                                                }
                                                int var102 = (var11.field2603 * var101 >> 8) + var11.field2520 / 2 + var15;
                                                int var103 = (var11.field2539 * var100 >> 8) + (var14 + (var11.field2468 / 2));
                                                if (class232.field3690) {
                                                    if (var11.field2563) {
                                                        class232.method1665(var103, var102, var11.field2449, var11.field2544, var100, var101);
                                                    } else {
                                                        class232.method1657(var103, var102, var100, var101);
                                                        class232.method1680((float) var11.field2526, (float) var11.field2544 * 1.5F);
                                                    }
                                                    class232.method1648();
                                                    class232.method1674(true);
                                                    class232.method1647(false);
                                                    class317.method2234(class149.field2311, (byte) -112);
                                                    if (class185.field3067) {
                                                        class75.method508();
                                                        class232.method1670();
                                                        class75.method506(arg5, arg7, arg3, arg4);
                                                        class185.field3067 = false;
                                                    }
                                                    if (var11.field2580) {
                                                        class232.method1673();
                                                    }
                                                    int var106 = class170.field2801[var11.field2492] * var11.field2449 >> 16;
                                                    int var107 = class170.field2810[var11.field2492] * var11.field2449 >> 16;
                                                    if (var11.field2421) {
                                                        var91.method1171(0, var11.field2574, var11.field2602, var11.field2492, var11.field2578, var11.field2435 + var106 + var92, var11.field2435 + var107, -1L);
                                                    } else {
                                                        var91.method1171(0, var11.field2574, 0, var11.field2492, 0, var106, var107, -1L);
                                                    }
                                                    if (var11.field2580) {
                                                        class232.method1681();
                                                    }
                                                } else {
                                                    class170.method1247(var103, var102);
                                                    int var104 = class170.field2801[var11.field2492] * var11.field2449 >> 16;
                                                    int var105 = class170.field2810[var11.field2492] * var11.field2449 >> 16;
                                                    if (!var11.field2421) {
                                                        var91.method1171(0, var11.field2574, 0, var11.field2492, 0, var104, var105, -1L);
                                                    } else if (var11.field2563) {
                                                        ((class250) var91).method1776(0, var11.field2574, var11.field2602, var11.field2492, var11.field2578, var11.field2435 + var104 + var92, var11.field2435 + var105, var11.field2449);
                                                    } else {
                                                        var91.method1171(0, var11.field2574, var11.field2602, var11.field2492, var11.field2578, var92 + var104 + var11.field2435, var105 - -var11.field2435, -1L);
                                                    }
                                                    class170.method1262();
                                                }
                                            }
                                        } else {
                                            label1073: {
                                                if (var11.field2478 == 7) {
                                                    class251 var62 = var11.method1136(class99.field1416, (byte) 103);
                                                    if (var62 == null) {
                                                        if (class321.field4974) {
                                                            class320.method2252(var11, 0);
                                                        }
                                                        break label1073;
                                                    }
                                                    int var63 = 0;
                                                    for (int var64 = 0; var64 < var11.field2424; var64++) {
                                                        for (int var65 = 0; var65 < var11.field2428; var65++) {
                                                            if (var11.field2483[var63] > 0) {
                                                                class330 var66 = class285.method2054(var11.field2483[var63] - 1, 0);
                                                                String var67;
                                                                if (var66.field5097 != 1 && var11.field2542[var63] == 1) {
                                                                    var67 = "<col=ff9040>" + var66.field5135 + "</col>";
                                                                } else {
                                                                    var67 = "<col=ff9040>" + var66.field5135 + "</col> x" + class190.method1408(var11.field2542[var63], 150);
                                                                }
                                                                int var68 = (var11.field2590 + 115) * var65 + var14;
                                                                int var69 = (var11.field2454 + 12) * var64 + var15;
                                                                if (var11.field2599 == 0) {
                                                                    var62.method1808(var67, var68, var69, var11.field2436, var11.field2587 ? 0 : -1);
                                                                } else if (var11.field2599 == 1) {
                                                                    var62.method1796(var67, var68 + 57, var69, var11.field2436, var11.field2587 ? 0 : -1);
                                                                } else {
                                                                    var62.method1813(var67, var68 + 115 - 1, var69, var11.field2436, var11.field2587 ? 0 : -1);
                                                                }
                                                            }
                                                            var63++;
                                                        }
                                                    }
                                                }
                                                if (var11.field2478 == 8 && class52.field742 == var11 && class7.field108 == class131.field2072) {
                                                    int var70 = 0;
                                                    int var71 = 0;
                                                    String var72 = var11.field2493;
                                                    class251 var73 = class296.field4688;
                                                    String var74 = class342.method2376(true, var11, var72);
                                                    while (var74.length() > 0) {
                                                        int var75 = var74.indexOf("<br>");
                                                        String var76;
                                                        if (var75 == -1) {
                                                            var76 = var74;
                                                            var74 = "";
                                                        } else {
                                                            var76 = var74.substring(0, var75);
                                                            var74 = var74.substring(var75 + 4);
                                                        }
                                                        int var77 = var73.method1804(var76);
                                                        if (var77 > var70) {
                                                            var70 = var77;
                                                        }
                                                        var71 += var73.field4016 + 1;
                                                    }
                                                    var71 += 7;
                                                    var70 += 6;
                                                    int var78 = var11.field2468 + var14 - var70 - 5;
                                                    if (var78 < (var14 + 5)) {
                                                        var78 = var14 + 5;
                                                    }
                                                    int var79 = var11.field2520 + var15 + 5;
                                                    if ((var70 + var78) > arg3) {
                                                        var78 = arg3 - var70;
                                                    }
                                                    if (arg4 < (var71 + var79)) {
                                                        var79 = arg4 - var71;
                                                    }
                                                    if (class232.field3690) {
                                                        class75.method505(var78, var79, var70, var71, 16777120);
                                                        class75.method507(var78, var79, var70, var71, 0);
                                                    } else {
                                                        class59.method382(var78, var79, var70, var71, 16777120);
                                                        class59.method390(var78, var79, var70, var71, 0);
                                                    }
                                                    String var80 = var11.field2493;
                                                    int var81 = var79 + var73.field4016 + 2;
                                                    String var82 = class342.method2376(true, var11, var80);
                                                    while (var82.length() > 0) {
                                                        int var83 = var82.indexOf("<br>");
                                                        String var84;
                                                        if (var83 == -1) {
                                                            var84 = var82;
                                                            var82 = "";
                                                        } else {
                                                            var84 = var82.substring(0, var83);
                                                            var82 = var82.substring(var83 + 4);
                                                        }
                                                        var73.method1808(var84, var78 + 3, var81, 0, -1);
                                                        var81 += var73.field4016 + 1;
                                                    }
                                                }
                                                if (var11.field2478 == 9) {
                                                    int var85;
                                                    int var86;
                                                    int var87;
                                                    int var88;
                                                    if (var11.field2601) {
                                                        var85 = var14;
                                                        var86 = var15;
                                                        var87 = var11.field2468 + var14;
                                                        var88 = var11.field2520 + var15;
                                                    } else {
                                                        var87 = var11.field2468 + var14;
                                                        var86 = var11.field2520 + var15;
                                                        var85 = var14;
                                                        var88 = var15;
                                                    }
                                                    if (var11.field2453 == 1) {
                                                        if (class232.field3690) {
                                                            class75.method509(var85, var88, var87, var86, var11.field2436);
                                                        } else {
                                                            class59.method403(var85, var88, var87, var86, var11.field2436);
                                                        }
                                                    } else if (class232.field3690) {
                                                        class75.method498(var85, var88, var87, var86, var11.field2436, var11.field2453);
                                                    } else {
                                                        class59.method397(var85, var88, var87, var86, var11.field2436, var11.field2453);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
        field1407++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLak;)V", line = 1739)
    public static final void method669(boolean arg0, class172 arg1) {
        field1406++;
        if (arg0) {
            field1399 = false;
        }
        class194.field3171 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)V", line = 1750)
    private final void method670(byte arg0) {
        field1394++;
        Random var2 = new Random((long) this.field1402);
        this.field1396 = new short[512];
        if (arg0 > -125) {
            this.field1397 = -54;
        }
        if (this.field1389 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field1396[var3] = (short) class158.method1138(this.field1389, true, var2);
            }
        }
    }
}
