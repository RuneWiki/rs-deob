import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 extends class93 {

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[J")
    private long[] field416 = new long[10];

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lqc;")
    public static class97 field410 = new class97(64);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Lo;")
    public static class84 field417 = class15.method124("huffman", 255);

    @OriginalMember(owner = "client!e", name = "I", descriptor = "Lo;")
    public static class84 field424 = class15.method124("flash1:", 255);

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lo;")
    public static class84 field428 = class15.method124("@or3@", 255);

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field431 = 0;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "Lo;")
    public static class84 field429 = class15.method124("@or1@", 255);

    @OriginalMember(owner = "client!e", name = "T", descriptor = "Lo;")
    public static class84 field435 = class15.method124(":0", 255);

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
    public static int[] field433 = new int[5];

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lod;")
    public static class88 field421 = new class88();

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field437 = -1;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Z")
    public static boolean field438 = false;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "J")
    private long field412;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Lp;")
    public static class89 field436;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "[I")
    public static int[] field426;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "[I")
    public static int[] field432;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)I", line = 7)
    public final int method183(byte arg0, int arg1, int arg2) {
        field434++;
        int var4 = this.field423;
        this.field423 = 300;
        int var5 = this.field418;
        this.field418 = 1;
        this.field412 = System.currentTimeMillis();
        if (this.field416[this.field419] == 0L) {
            this.field418 = var5;
            this.field423 = var4;
        } else if (this.field412 > this.field416[this.field419]) {
            this.field423 = (int) ((long) (arg1 * 2560) / (this.field412 - this.field416[this.field419]));
        }
        if (this.field423 < 25) {
            this.field423 = 25;
        }
        if (this.field423 > 256) {
            this.field423 = 256;
            this.field418 = (int) ((long) arg1 - (this.field412 - this.field416[this.field419]) / 10L);
        }
        if (this.field418 > arg1) {
            this.field418 = arg1;
        }
        if (arg0 < 59) {
            this.method187(true);
        }
        this.field416[this.field419] = this.field412;
        this.field419 = (this.field419 + 1) % 10;
        if (this.field418 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field416[var6] != 0L) {
                    this.field416[var6] -= -((long) this.field418);
                }
            }
        }
        if (arg2 > this.field418) {
            this.field418 = arg2;
        }
        class113.method873(true, (long) this.field418);
        int var7 = 0;
        while (this.field411 < 256) {
            this.field411 += this.field423;
            var7++;
        }
        this.field411 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 80)
    public static void method184(byte arg0) {
        field428 = null;
        field410 = null;
        field421 = null;
        field435 = null;
        field417 = null;
        field433 = null;
        if (arg0 != -6) {
            method185(-38, 58, true);
        }
        field429 = null;
        field432 = null;
        field426 = null;
        field436 = null;
        field424 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)I", line = 110)
    public static final int method185(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method184((byte) -71);
        }
        int var3 = class5.method31(arg0 - 1, arg1 - 1, 1376312589) + class5.method31(arg0 + 1, arg1 + -1, 1376312589) + class5.method31(arg0 - 1, arg1 - -1, 1376312589) + class5.method31(arg0 + 1, arg1 - -1, 1376312589);
        field430++;
        int var4 = class5.method31(arg0 - 1, arg1, 1376312589) + class5.method31(arg0 + 1, arg1, 1376312589) + class5.method31(arg0, arg1 + -1, 1376312589) + class5.method31(arg0, arg1 + 1, 1376312589);
        int var5 = class5.method31(arg0, arg1, 1376312589);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 207)
    public class25() {
        this.method186(7971);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 166)
    public final void method186(int arg0) {
        this.field418 = 1;
        field413++;
        this.field423 = 256;
        this.field411 = 0;
        this.field412 = System.currentTimeMillis();
        for (int var2 = 0; var2 < 10; var2++) {
            this.field416[var2] = this.field412;
        }
        if (arg0 != 7971) {
            field437 = 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 189)
    public final void method187(boolean arg0) {
        field427++;
        if (arg0) {
            method188(12);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field416[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 228)
    private static final void method188(int arg0) {
        int var1 = -1;
        if (arg0 != 127) {
            field431 = 88;
        }
        field409++;
        if (class93.field2048 == 0 && class30.field601 == 0) {
            class122.field2723++;
            class26.method196(class39.field796, 24, class119.field2644, class38.field748, false, 0);
        }
        for (int var2 = 0; var2 < class83.field1834; var2++) {
            int var3 = class83.field1837[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 14 & 0x7FFF;
            int var7 = var3 >> 29 & 0x3;
            if (var1 != var3) {
                var1 = var3;
                if (var7 == 2 && class112.field2427.method835(class1.field11, var4, var5, var3) >= 0) {
                    class49 var8 = class110.method856((byte) -111, var6);
                    if (var8.field1041 != null) {
                        var8 = var8.method415(false);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class93.field2048 == 1) {
                        class80.field1706++;
                        class26.method196(class97.method746(arg0 ^ 0x7F, new class84[] { class33.field643, class106.field2255, class65.field1402, var8.field1019 }), 9, var5, var4, false, var3);
                    } else if (class30.field601 != 1) {
                        class19.field356++;
                        class84[] var9 = var8.field1069;
                        if (class42.field866) {
                            var9 = class106.method790((byte) 112, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class104.field2194++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 34;
                                    }
                                    if (var10 == 1) {
                                        var11 = 41;
                                    }
                                    if (var10 == 2) {
                                        var11 = 10;
                                    }
                                    if (var10 == 3) {
                                        var11 = 5;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1004;
                                    }
                                    class26.method196(class97.method746(0, new class84[] { var9[var10], class107.field2256, var8.field1019 }), var11, var5, var4, false, var3);
                                }
                            }
                        }
                        class26.method196(class97.method746(0, new class84[] { class44.field890, var8.field1019 }), 1005, var5, var4, false, var8.field1024 << 14);
                    } else if ((class105.field2220 & 0x4) == 4) {
                        class19.field365++;
                        class26.method196(class97.method746(0, new class84[] { class101.field2141, class107.field2256, var8.field1019 }), 6, var5, var4, false, var3);
                    }
                }
                if (var7 == 1) {
                    class115 var12 = class3.field30[var6];
                    if (var12.field2501.field754 == 1 && (var12.field1380 & 0x7F) == 64 && (var12.field1391 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class85.field1933; var13++) {
                            class115 var16 = class3.field30[class75.field1571[var13]];
                            if (var16 != null && var12 != var16 && var16.field2501.field754 == 1 && var12.field1380 == var16.field1380 && var12.field1391 == var16.field1391) {
                                class57.method466(class75.field1571[var13], var4, var16.field2501, 112, var5);
                            }
                        }
                        for (int var14 = 0; var14 < class107.field2257; var14++) {
                            class63 var15 = class119.field2643[class85.field1949[var14]];
                            if (var15 != null && var12.field1380 == var15.field1380 && var12.field1391 == var15.field1391) {
                                class122.method952(var5, var15, var4, 1000, class85.field1949[var14]);
                            }
                        }
                    }
                    class57.method466(var6, var4, var12.field2501, 81, var5);
                }
                if (var7 == 0) {
                    class63 var17 = class119.field2643[var6];
                    if ((var17.field1380 & 0x7F) == 64 && (var17.field1391 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class85.field1933; var18++) {
                            class115 var21 = class3.field30[class75.field1571[var18]];
                            if (var21 != null && var21.field2501.field754 == 1 && var17.field1380 == var21.field1380 && var17.field1391 == var21.field1391) {
                                class57.method466(class75.field1571[var18], var4, var21.field2501, 85, var5);
                            }
                        }
                        for (int var19 = 0; var19 < class107.field2257; var19++) {
                            class63 var20 = class119.field2643[class85.field1949[var19]];
                            if (var20 != null && var17 != var20 && var17.field1380 == var20.field1380 && var17.field1391 == var20.field1391) {
                                class122.method952(var5, var20, var4, 1000, class85.field1949[var19]);
                            }
                        }
                    }
                    class122.method952(var5, var17, var4, 1000, var6);
                }
                if (var7 == 3) {
                    class88 var22 = class110.field2379[class1.field11][var4][var5];
                    if (var22 != null) {
                        for (class67 var23 = (class67) var22.method697((byte) -68); var23 != null; var23 = (class67) var22.method696(arg0 ^ 0xFFFFFFEA)) {
                            class44 var24 = class126.method970(arg0 ^ 0xFFFFFFE1, var23.field1459);
                            if (class93.field2048 == 1) {
                                class26.method196(class97.method746(0, new class84[] { class33.field643, class106.field2255, class105.field2219, var24.field921 }), 11, var5, var4, false, var23.field1459);
                                class79.field1691++;
                            } else if (class30.field601 != 1) {
                                class11.field210++;
                                class84[] var25 = var24.field904;
                                if (class42.field866) {
                                    var25 = class106.method790((byte) 112, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        field415++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 50;
                                        }
                                        if (var26 == 1) {
                                            var27 = 13;
                                        }
                                        if (var26 == 2) {
                                            var27 = 16;
                                        }
                                        if (var26 == 3) {
                                            var27 = 14;
                                        }
                                        if (var26 == 4) {
                                            var27 = 3;
                                        }
                                        class26.method196(class97.method746(0, new class84[] { var25[var26], class104.field2196, var24.field921 }), var27, var5, var4, false, var23.field1459);
                                    } else if (var26 == 2) {
                                        class26.method196(class97.method746(0, new class84[] { class57.field1184, var24.field921 }), 16, var5, var4, false, var23.field1459);
                                        class100.field2116++;
                                    }
                                }
                                class26.method196(class97.method746(0, new class84[] { class14.field255, var24.field921 }), 1001, var5, var4, false, var23.field1459);
                            } else if ((class105.field2220 & 0x1) == 1) {
                                class26.method196(class97.method746(0, new class84[] { class101.field2141, class104.field2196, var24.field921 }), 48, var5, var4, false, var23.field1459);
                                class11.field204++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 519)
    public static final void method189(int arg0) {
        field420++;
        if (class107.field2268 != 0) {
            return;
        }
        class21.field385[0] = class61.field1266;
        class63.field1306[0] = 1003;
        class40.field805 = 1;
        if (class103.field2165 != -1) {
            class103.field2177 = -1;
            class45.field965 = -1;
            class93.method719(class119.field2644, 0, (byte) -102, class103.field2165, 765, 0, 0, class38.field748, 503, -1, 0);
            class48.field1003 = class103.field2177;
            class36.field706 = class45.field965;
            return;
        }
        class105.method780(true);
        class45.field965 = -1;
        class103.field2177 = -1;
        if (class38.field748 > 4 && class119.field2644 > 4 && class38.field748 < 516 && class119.field2644 < 338) {
            if (class27.field528 == -1) {
                method188(127);
            } else {
                class93.method719(class119.field2644, 4, (byte) -118, class27.field528, 516, 0, 0, class38.field748, 338, -1, 4);
            }
        }
        class36.field706 = class45.field965;
        class48.field1003 = class103.field2177;
        if (arg0 >= -73) {
            return;
        }
        class103.field2177 = -1;
        class45.field965 = -1;
        if (class38.field748 > 553 && class119.field2644 > 205 && class38.field748 < 743 && class119.field2644 < 466) {
            if (class78.field1657 != -1) {
                class93.method719(class119.field2644, 553, (byte) -109, class78.field1657, 743, 0, 1, class38.field748, 466, -1, 205);
            } else if (class3.field32[class74.field1546] != -1) {
                class93.method719(class119.field2644, 553, (byte) -99, class3.field32[class74.field1546], 743, 0, 1, class38.field748, 466, -1, 205);
            }
        }
        if (class67.field1471 != class45.field965) {
            class39.field798 = true;
            class67.field1471 = class45.field965;
        }
        class45.field965 = -1;
        if (class115.field2509 != class103.field2177) {
            class39.field798 = true;
            class115.field2509 = class103.field2177;
        }
        boolean var1 = false;
        class103.field2177 = -1;
        if (class38.field748 > 17 && class119.field2644 > 357 && class38.field748 < 496 && class119.field2644 < 453) {
            if (class104.field2202 != -1) {
                class93.method719(class119.field2644, 17, (byte) -102, class104.field2202, 496, 0, 2, class38.field748, 453, -1, 357);
            } else if (class45.field962 != -1) {
                class93.method719(class119.field2644, 17, (byte) -88, class45.field962, 496, 0, 3, class38.field748, 453, -1, 357);
            } else if (class119.field2644 < 434 && class38.field748 < 426) {
                class120.method935(class119.field2644 - 357, -115, class38.field748 - 17);
            }
        }
        if ((class104.field2202 != -1 || class45.field962 != -1) && class45.field965 != class122.field2718) {
            class85.field1927 = true;
            class122.field2718 = class45.field965;
        }
        if ((class104.field2202 != -1 || class45.field962 != -1) && class69.field1477 != class103.field2177) {
            class69.field1477 = class103.field2177;
            class85.field1927 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class40.field805 - 1; var2++) {
                if (class63.field1306[var2] < 1000 && class63.field1306[var2 + 1] > 1000) {
                    class84 var3 = class21.field385[var2];
                    var1 = false;
                    class21.field385[var2] = class21.field385[var2 + 1];
                    class21.field385[var2 + 1] = var3;
                    int var4 = class63.field1306[var2];
                    class63.field1306[var2] = class63.field1306[var2 + 1];
                    class63.field1306[var2 + 1] = var4;
                    int var5 = class41.field835[var2];
                    class41.field835[var2] = class41.field835[var2 + 1];
                    class41.field835[var2 + 1] = var5;
                    int var6 = class42.field864[var2];
                    class42.field864[var2] = class42.field864[var2 + 1];
                    class42.field864[var2 + 1] = var6;
                    int var7 = class107.field2286[var2];
                    class107.field2286[var2] = class107.field2286[var2 + 1];
                    class107.field2286[var2 + 1] = var7;
                }
            }
        }
    }
}
