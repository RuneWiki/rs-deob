import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class468 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lkg;")
    public static class275 field6277 = new class275(106, 11);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "[Liea;")
    public static class481[] field6279;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method2661(byte arg0) {
        field6279 = null;
        if (arg0 == -103) {
            field6277 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILei;I)V")
    public static final void method2662(int arg0, class180 arg1, int arg2) {
        field6276++;
        boolean var3 = arg1.method1235(1, -4080) == 1;
        if (var3) {
            class85.field1165[class322.field4152++] = arg2;
        }
        int var4 = arg1.method1235(2, -4080);
        class724 var5 = class5.field49[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field10058 = false;
            } else if (class54.field755 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class124 var6 = class32.field531[arg2] = new class124();
                var6.field1790 = (var5.field5796 << 28) + (var5.field264[0] + class332.field4232 >> 6 << 14) + (var5.field260[0] + class447.field5936 >> 6);
                if (var5.field10101 == -1) {
                    var6.field1787 = var5.field256.method1044((byte) 19);
                } else {
                    var6.field1787 = var5.field10101;
                }
                var6.field1786 = var5.field221;
                var6.field1785 = var5.field10074;
                if (var5.field10080 > 0) {
                    class332.method1920(76, var5);
                }
                class5.field49[arg2] = null;
                if (arg1.method1235(1, -4080) != 0) {
                    class429.method2457(arg2, arg1, 639365768);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method1235(3, -4080);
            int var8 = var5.field264[0];
            int var9 = var5.field260[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field10078 = var9;
                var5.field10058 = true;
                var5.field10083 = var8;
            } else {
                var5.method4042(var8, var9, (byte) -110, class182.field2548[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method1235(4, -4080);
            int var11 = var5.field264[0];
            int var12 = var5.field260[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field10058 = true;
                var5.field10083 = var11;
                var5.field10078 = var12;
            } else {
                var5.method4042(var11, var12, (byte) -122, class182.field2548[arg2]);
            }
        } else {
            int var13 = arg1.method1235(1, -4080);
            if (var13 == 0) {
                int var14 = arg1.method1235(12, -4080);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F6) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field264[0] + var16;
                int var19 = var5.field260[0] + var17;
                if (var3) {
                    var5.field10058 = true;
                    var5.field10078 = var19;
                    var5.field10083 = var18;
                } else {
                    var5.method4042(var18, var19, (byte) -105, class182.field2548[arg2]);
                }
                var5.field5796 = var5.field5793 = (byte) (var5.field5796 + var15 & 0x3);
                if (class99.method797(var19, 1, var18)) {
                    var5.field5793++;
                }
                if (class54.field755 == arg2) {
                    if (class472.field6329 != var5.field5796) {
                        class563.field7924 = true;
                    }
                    class472.field6329 = var5.field5796;
                }
            } else {
                int var20 = arg1.method1235(30, -4080);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field264[0] + class332.field4232 + var22 & 0x3FFF) - class332.field4232;
                int var25 = (var5.field260[0] + class447.field5936 + var23 & 0x3FFF) - class447.field5936;
                if (var3) {
                    var5.field10083 = var24;
                    var5.field10058 = true;
                    var5.field10078 = var25;
                } else {
                    var5.method4042(var24, var25, (byte) -104, class182.field2548[arg2]);
                }
                var5.field5796 = var5.field5793 = (byte) (var5.field5796 + var21 & 0x3);
                if (class99.method797(var25, 1, var24)) {
                    var5.field5793++;
                }
                if (class54.field755 == arg2) {
                    class472.field6329 = var5.field5796;
                }
                if (arg0 < 117) {
                    method2663(null, 84, null, 90, -33, 82, 109);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lha;ILd;IIII)V")
    public static final void method2663(class60 arg0, int arg1, class153 arg2, int arg3, int arg4, int arg5, int arg6) {
        field6278++;
        if (class553.field7719 < 100) {
            class131.method979(arg2, 1, arg0);
        }
        arg0.method534(arg4, arg3, arg1 + arg4, arg3 + arg5);
        if (class553.field7719 < 100) {
            byte var7 = 20;
            int var8 = arg4 + (arg1 / 2);
            int var9 = arg5 / 2 + arg3 - var7 - 18;
            arg0.method528(arg4, arg3, arg1, arg5, -16777216, 0);
            arg0.method460(var8 - 152, var9, 304, 34, class527.field7357[class758.field10583].getRGB(), 0);
            arg0.method528(var8 - 150, var9 + 2, class553.field7719 * 3, 30, class16.field317[class758.field10583].getRGB(), 0);
            class242.field3132.method563(var8, -1, -18, class69.field972[class758.field10583].getRGB(), var7 + var9, class454.field6021.method2547(-51, class243.field3143));
            return;
        }
        int var10 = class756.field10543 - ((int) ((float) arg1 / class73.field1021));
        int var11 = (int) ((float) arg5 / class73.field1021) + class687.field9571;
        int var12 = (int) ((float) arg1 / class73.field1021) + class756.field10543;
        class475.field6390 = (int) ((float) (arg1 * 2) / class73.field1021);
        class170.field2361 = class687.field9571 - (int) ((float) arg5 / class73.field1021);
        class179.field2501 = class756.field10543 - ((int) ((float) arg1 / class73.field1021));
        class172.field2372 = (int) ((float) (arg5 * 2) / class73.field1021);
        int var13 = class687.field9571 - (int) ((float) arg5 / class73.field1021);
        class73.method652(class73.field1041 + var10, class73.field1042 + var11, var12 + class73.field1041, class73.field1042 + var13, arg4, arg3, arg1 + arg4, arg3 + arg5 + 1);
        class73.method647(arg0);
        class653 var14 = class73.method661(arg0);
        class234.method1473((byte) 90, 0, 0, arg0, var14);
        if (class35.field563 > 0) {
            class601.field8362--;
            if (class601.field8362 == 0) {
                class35.field563--;
                class601.field8362 = 20;
            }
        }
        if (class556.field7748) {
            int var15 = arg1 + arg4 - 5;
            int var16 = arg3 + arg5 - 8;
            class372.field4774.method559(16776960, (byte) -110, "Fps:" + class5.field54, var15, -1, var16);
            int var20 = var16 - 15;
            Runtime var17 = Runtime.getRuntime();
            int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
            int var19 = 16776960;
            if (var18 > 65536) {
                var19 = 16711680;
            }
            class372.field4774.method559(var19, (byte) -86, "Mem:" + var18 + "k", var15, -1, var20);
            var16 = var20 - 15;
        }
        if (arg6 < 116) {
            method2663(null, 94, null, 52, 85, 112, 100);
        }
    }
}
