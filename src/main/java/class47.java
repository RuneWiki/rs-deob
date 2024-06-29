import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class28 {

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "[J")
    public static long[] field1077 = new long[100];

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "Ljava/util/zip/CRC32;")
    private static CRC32 field1087 = new CRC32();

    @OriginalMember(owner = "client!ge", name = "tb", descriptor = "I")
    public static volatile int field1093 = 0;

    @OriginalMember(owner = "client!ge", name = "ub", descriptor = "Z")
    public static boolean field1094 = false;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "Lja;")
    public class62 field1069;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "[I")
    public int[] field1078;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "[I")
    public int[] field1089;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "[Lja;")
    public class62[] field1090;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method331(boolean arg0) {
        field1085++;
        if (!arg0) {
            method334(null, false, -73, null);
        }
        while (true) {
            class105 var1 = class36.field863;
            class144 var2;
            synchronized (class36.field863) {
                var2 = (class144) class53.field1203.method853(-32);
            }
            if (var2 == null) {
                return;
            }
            var2.field3360.method229(false, var2.field3369, var2.field3367, 24352, (int) var2.field3493);
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)Z")
    public static final boolean method332(byte arg0) {
        field1088++;
        long var1 = class26.method209((byte) 114);
        int var3 = (int) (var1 - class149.field3519);
        class149.field3519 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        int var4 = 110 % ((26 - arg0) / 54);
        class128.field2924 += var3;
        if (class155.field3603 == 0 && class18.field401 == 0 && class5.field66 == 0 && class1.field8 == 0) {
            return true;
        } else if (class126.field2840 == null) {
            return false;
        } else {
            try {
                if (class128.field2924 > 30000) {
                    throw new IOException();
                }
                while (class18.field401 < 20 && class1.field8 > 0) {
                    class50 var5 = (class50) class17.field388.method531(102);
                    class128 var6 = new class128(4);
                    var6.method1010(1, 32768);
                    var6.method1003(109, (int) var5.field3493);
                    class126.field2840.method979(4, 19770, var6.field2874, 0);
                    class124.field2820.method538(var5, (byte) -27, var5.field3493);
                    class18.field401++;
                    class1.field8--;
                }
                while (class155.field3603 < 20 && class5.field66 > 0) {
                    class50 var7 = (class50) class96.field2249.method71(true);
                    class128 var8 = new class128(4);
                    var8.method1010(0, 32768);
                    var8.method1003(111, (int) var7.field3493);
                    class126.field2840.method979(4, 19770, var8.field2874, 0);
                    var7.method228((byte) 127);
                    class96.field2246.method538(var7, (byte) -27, var7.field3493);
                    class155.field3603++;
                    class5.field66--;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class126.field2840.method982(-111);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    class128.field2924 = 0;
                    byte var11 = 0;
                    if (class9.field242 == null) {
                        var11 = 8;
                    } else if (class82.field1971 == 0) {
                        var11 = 1;
                    }
                    if (var11 <= 0) {
                        int var12 = class146.field3438.field2874.length - class9.field242.field1166;
                        int var13 = 512 - class82.field1971;
                        if (var13 > var12 - class146.field3438.field2873) {
                            var13 = var12 - class146.field3438.field2873;
                        }
                        if (var10 < var13) {
                            var13 = var10;
                        }
                        class126.field2840.method974(var13, class146.field3438.field2873, -71, class146.field3438.field2874);
                        if (class133.field3054 != 0) {
                            for (int var14 = 0; var14 < var13; var14++) {
                                class146.field3438.field2874[class146.field3438.field2873 + var14] = (byte) class36.method277(class146.field3438.field2874[class146.field3438.field2873 + var14], class133.field3054);
                            }
                        }
                        class146.field3438.field2873 += var13;
                        class82.field1971 += var13;
                        if (class146.field3438.field2873 == var12) {
                            if (class9.field242.field3493 == 16711935L) {
                                class60.field1476 = class146.field3438;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class29 var16 = class29.field707[var15];
                                    if (var16 != null) {
                                        class60.field1476.field2873 = var15 * 8 + 5;
                                        int var17 = class60.field1476.method1037(18834);
                                        int var18 = class60.field1476.method1037(18834);
                                        var16.method240(true, var17, var18);
                                    }
                                }
                            } else {
                                field1087.reset();
                                field1087.update(class146.field3438.field2874, 0, var12);
                                int var19 = (int) field1087.getValue();
                                if (class9.field242.field1167 != var19) {
                                    try {
                                        class126.field2840.method978(67);
                                    } catch (Exception var31) {
                                    }
                                    class126.field2840 = null;
                                    class133.field3054 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class155.field3602++;
                                    return false;
                                }
                                class75.field1865 = 0;
                                class155.field3602 = 0;
                                class9.field242.field1149.method237((byte) -80, (class9.field242.field3493 & 0xFF0000L) == 16711680L, class146.field3438.field2874, class141.field3292, (int) (class9.field242.field3493 & 0xFFFFL));
                            }
                            class9.field242.method1176((byte) -123);
                            if (class141.field3292) {
                                class18.field401--;
                            } else {
                                class155.field3603--;
                            }
                            class146.field3438 = null;
                            class82.field1971 = 0;
                            class9.field242 = null;
                        } else {
                            if (class82.field1971 != 512) {
                                break;
                            }
                            class82.field1971 = 0;
                        }
                    } else {
                        int var20 = var11 - class81.field1953.field2873;
                        if (var10 < var20) {
                            var20 = var10;
                        }
                        class126.field2840.method974(var20, class81.field1953.field2873, -89, class81.field1953.field2874);
                        if (class133.field3054 != 0) {
                            for (int var21 = 0; var21 < var20; var21++) {
                                class81.field1953.field2874[class81.field1953.field2873 + var21] = (byte) class36.method277(class81.field1953.field2874[class81.field1953.field2873 + var21], class133.field3054);
                            }
                        }
                        class81.field1953.field2873 += var20;
                        if (var11 > class81.field1953.field2873) {
                            break;
                        }
                        if (class9.field242 == null) {
                            class81.field1953.field2873 = 0;
                            int var22 = class81.field1953.method1025(255);
                            int var23 = class81.field1953.method1041(212464720);
                            int var24 = class81.field1953.method1025(255);
                            int var25 = class81.field1953.method1037(18834);
                            long var26 = (long) ((var22 << 16) + var23);
                            class50 var28 = (class50) class124.field2820.method537(-1, var26);
                            class141.field3292 = true;
                            if (var28 == null) {
                                var28 = (class50) class96.field2246.method537(-1, var26);
                                class141.field3292 = false;
                            }
                            if (var28 == null) {
                                throw new IOException();
                            }
                            class9.field242 = var28;
                            int var29 = var24 == 0 ? 5 : 9;
                            class146.field3438 = new class128(var25 + class9.field242.field1166 + var29);
                            class146.field3438.method1010(var24, 32768);
                            class146.field3438.method1040(var25, -1308601992);
                            class82.field1971 = 8;
                            class81.field1953.field2873 = 0;
                        } else if (class82.field1971 == 0) {
                            if (class81.field1953.field2874[0] == -1) {
                                class81.field1953.field2873 = 0;
                                class82.field1971 = 1;
                            } else {
                                class9.field242 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var32) {
                try {
                    class126.field2840.method978(83);
                } catch (Exception var30) {
                }
                class126.field2840 = null;
                class75.field1865++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[Lja;)Lja;")
    public static final class62 method333(int arg0, int arg1, int arg2, class62[] arg3) {
        field1070++;
        int var4 = 0;
        int var5 = -39 / ((arg1 + 59) / 46);
        for (int var6 = 0; var6 < arg0; var6++) {
            if (arg3[arg2 + var6] == null) {
                arg3[arg2 + var6] = class32.field776;
            }
            var4 += arg3[arg2 + var6].field1538;
        }
        byte[] var7 = new byte[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0; var9++) {
            class62 var11 = arg3[arg2 + var9];
            class78.method624(var11.field1504, 0, var7, var8, var11.field1538);
            var8 += var11.field1538;
        }
        class62 var10 = new class62();
        var10.field1538 = var4;
        var10.field1504 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lfe;ZILs;)V")
    public static final void method334(class41 arg0, boolean arg1, int arg2, class128 arg3) {
        field1081++;
        class147 var4 = new class147();
        var4.field3458 = arg3.method1025(255);
        var4.field3463 = arg3.method1037(18834);
        var4.field3477 = new int[var4.field3458];
        var4.field3461 = new int[var4.field3458];
        var4.field3471 = new byte[var4.field3458][][];
        var4.field3467 = new class21[var4.field3458];
        var4.field3475 = new int[var4.field3458];
        var4.field3462 = new class21[var4.field3458];
        for (int var5 = 0; var5 < var4.field3458; var5++) {
            try {
                int var6 = arg3.method1025(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method1015((byte) -128).method472(1));
                    int var18 = 0;
                    String var19 = new String(arg3.method1015((byte) -93).method472(1));
                    if (var6 == 1) {
                        var18 = arg3.method1037(18834);
                    }
                    var4.field3461[var5] = var6;
                    var4.field3475[var5] = var18;
                    var4.field3462[var5] = arg0.method307(class135.method1088(var17, (byte) -24), -25357, var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method1015((byte) -104).method472(1));
                    String var8 = new String(arg3.method1015((byte) -72).method472(1));
                    int var9 = arg3.method1025(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method1015((byte) -102).method472(1));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method1037(18834);
                            var12[var13] = new byte[var14];
                            arg3.method1034(var12[var13], var14, 0, (byte) -18);
                        }
                    }
                    var4.field3461[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class135.method1088(var10[var16], (byte) -24);
                    }
                    var4.field3467[var5] = arg0.method305(var15, class135.method1088(var7, (byte) -24), -101, var8);
                    var4.field3471[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3477[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3477[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3477[var5] = -3;
            } catch (Exception var23) {
                var4.field3477[var5] = -4;
            } catch (Throwable var24) {
                var4.field3477[var5] = -5;
            }
        }
        if (arg1) {
            method331(false);
        }
        class12.field264.method847(var4, (byte) 127);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lja;ZLs;)I")
    public static final int method335(class62 arg0, boolean arg1, class128 arg2) {
        field1092++;
        if (!arg1) {
            method333(-48, -72, -53, null);
        }
        int var3 = arg2.field2873;
        arg2.method1011(arg0.field1538, (byte) 124);
        arg2.field2873 += class120.field2756.method597(215231619, 0, arg0.field1538, arg2.field2874, arg2.field2873, arg0.field1504);
        return arg2.field2873 - var3;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
    public static final void method336(int arg0, int arg1) {
        field1084++;
        if (!class29.method241(arg1, -1)) {
            return;
        }
        class54[] var2 = class131.field2990[arg1];
        if (arg0 != 24880) {
            field1091 = 101;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class54 var4 = var2[var3];
            if (var4 != null) {
                var4.field1280 = 0;
                var4.field1348 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1082++;
        if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
            if (class144.field3361 && class155.field3598 != arg4) {
                return;
            }
            boolean var8 = true;
            int var9 = 0;
            boolean var10 = false;
            if (arg7 == 0) {
                var9 = class119.field2703.method570(arg4, arg3, arg6);
            }
            boolean var11 = false;
            if (arg7 == 1) {
                var9 = class119.field2703.method558(arg4, arg3, arg6);
            }
            if (arg7 == 2) {
                var9 = class119.field2703.method588(arg4, arg3, arg6);
            }
            if (arg7 == 3) {
                var9 = class119.field2703.method584(arg4, arg3, arg6);
            }
            if (var9 != 0) {
                int var12 = class119.field2703.method546(arg4, arg3, arg6, var9);
                int var13 = var12 & 0x1F;
                int var14 = var12 >> 6 & 0x3;
                int var15 = var9 >> 14 & 0x7FFF;
                if (arg7 == 0) {
                    class119.field2703.method559(arg4, arg3, arg6);
                    class65 var16 = class84.method653(6, var15);
                    if (var16.field1603 != 0) {
                        class131.field2991[arg4].method1200(var16.field1592, arg6, var14, var13, 21698, arg3);
                    }
                }
                if (arg7 == 1) {
                    class119.field2703.method554(arg4, arg3, arg6);
                }
                if (arg7 == 2) {
                    class119.field2703.method592(arg4, arg3, arg6);
                    class65 var17 = class84.method653(arg5 ^ 0xFFFF92A3, var15);
                    if (var17.field1612 + arg3 > 103 || var17.field1612 + arg6 > 103 || var17.field1615 + arg3 > 103 || var17.field1615 + arg6 > 103) {
                        return;
                    }
                    if (var17.field1603 != 0) {
                        class131.field2991[arg4].method1204(arg6, (byte) 103, var17.field1592, arg3, var14, var17.field1615, var17.field1612);
                    }
                }
                if (arg7 == 3) {
                    class119.field2703.method548(arg4, arg3, arg6);
                    class65 var18 = class84.method653(6, var15);
                    if (var18.field1603 == 1) {
                        class131.field2991[arg4].method1203(arg6, (byte) 103, arg3);
                    }
                }
            }
            if (arg0 >= 0) {
                int var19 = arg4;
                if (arg4 < 3 && (class155.field3581[1][arg3][arg6] & 0x2) == 2) {
                    var19 = arg4 + 1;
                }
                class59.method427(arg1, var19, arg6, arg0, (byte) 118, arg2, arg4, class131.field2991[arg4], arg3, class119.field2703);
            }
        }
        if (arg5 != -27995) {
            field1077 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)V")
    public static final void method338(byte arg0) {
        class12.field264 = new class105();
        if (arg0 == -49) {
            field1086++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public static void method339(int arg0) {
        field1087 = null;
        if (arg0 != 0) {
            field1094 = true;
        }
        field1077 = null;
    }
}
