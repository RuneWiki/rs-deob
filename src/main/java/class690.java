import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class690 extends class213 {

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "Lhea;")
    public class385 field9740;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "[J")
    public static long[] field9739 = new long[32];

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "J")
    public static long field9742;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3826(String arg0, byte arg1) {
        field9741++;
        if (arg1 != -19) {
            method3828();
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method3827(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field9743++;
        int var8 = arg5 - arg3;
        int var9 = arg0 + arg3;
        for (int var10 = arg0; var10 < var9; var10++) {
            class445.method2463(arg1, 102, arg7, arg6, class156.field1755[var10]);
        }
        int var11 = arg7 - arg3;
        int var12 = -49 / ((1 - arg4) / 42);
        int var13 = arg1 + arg3;
        for (int var14 = arg5; var14 > var8; var14--) {
            class445.method2463(arg1, 118, arg7, arg6, class156.field1755[var14]);
        }
        for (int var15 = var9; var15 <= var8; var15++) {
            int[] var16 = class156.field1755[var15];
            class445.method2463(arg1, 125, var13, arg6, var16);
            class445.method2463(var13, 95, var11, arg2, var16);
            class445.method2463(var11, 116, arg7, arg6, var16);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lap;II[B)V")
    public class690(class435 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9740 = class387.method2118(false, arg3, arg1, arg0, 6406, 6406, arg2, 34037);
        this.field9740.method2467(false, false, 106);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "()V")
    public static final void method3828() {
        class461.field6405 = 0;
        label212: for (int var0 = 0; var0 < class80.field849; var0++) {
            class32 var1 = class295.field3873[var0];
            if (class177.field2162 != null) {
                for (int var2 = 0; var2 < class177.field2162.length; var2++) {
                    if (class177.field2162[var2] != -1000000 && (var1.field370 <= class177.field2162[var2] || var1.field371 <= class177.field2162[var2]) && (var1.field374 <= class587.field8340[var2] || var1.field373 <= class587.field8340[var2]) && (var1.field374 >= class598.field8504[var2] || var1.field373 >= class598.field8504[var2]) && (var1.field376 <= class583.field8298[var2] || var1.field375 <= class583.field8298[var2]) && (var1.field376 >= class36.field409[var2] || var1.field375 >= class36.field409[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field379 == 1) {
                int var3 = var1.field366 + class658.field9390 - class325.field4238;
                if (var3 >= 0 && var3 <= class658.field9390 + class658.field9390) {
                    int var4 = var1.field359 + class658.field9390 - class75.field789;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class658.field9390 + class658.field9390) {
                        continue;
                    }
                    int var5 = var1.field367 + class658.field9390 - class75.field789;
                    if (var5 > class658.field9390 + class658.field9390) {
                        var5 = class658.field9390 + class658.field9390;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class581.field8258[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class461.field6410 - var1.field374;
                        if (var7 > class32.field361) {
                            var1.field372 = 1;
                        } else {
                            if (var7 >= -class32.field361) {
                                continue;
                            }
                            var1.field372 = 2;
                            var7 = -var7;
                        }
                        var1.field369 = (var1.field376 - class351.field4599 << 8) / var7;
                        var1.field357 = (var1.field375 - class351.field4599 << 8) / var7;
                        var1.field368 = (var1.field370 - class46.field504 << 8) / var7;
                        var1.field360 = (var1.field371 - class46.field504 << 8) / var7;
                        class476.field6930[class461.field6405++] = var1;
                    }
                }
            } else if (var1.field379 == 2) {
                int var8 = var1.field359 + class658.field9390 - class75.field789;
                if (var8 >= 0 && var8 <= class658.field9390 + class658.field9390) {
                    int var9 = var1.field366 + class658.field9390 - class325.field4238;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class658.field9390 + class658.field9390) {
                        continue;
                    }
                    int var10 = var1.field377 + class658.field9390 - class325.field4238;
                    if (var10 > class658.field9390 + class658.field9390) {
                        var10 = class658.field9390 + class658.field9390;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class581.field8258[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class351.field4599 - var1.field376;
                        if (var12 > class32.field361) {
                            var1.field372 = 3;
                        } else {
                            if (var12 >= -class32.field361) {
                                continue;
                            }
                            var1.field372 = 4;
                            var12 = -var12;
                        }
                        var1.field356 = (var1.field374 - class461.field6410 << 8) / var12;
                        var1.field365 = (var1.field373 - class461.field6410 << 8) / var12;
                        var1.field368 = (var1.field370 - class46.field504 << 8) / var12;
                        var1.field360 = (var1.field371 - class46.field504 << 8) / var12;
                        class476.field6930[class461.field6405++] = var1;
                    }
                }
            } else if (var1.field379 == 4) {
                int var13 = var1.field370 - class46.field504;
                if (var13 > class457.field6381) {
                    int var14 = var1.field359 + class658.field9390 - class75.field789;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class658.field9390 + class658.field9390) {
                        continue;
                    }
                    int var15 = var1.field367 + class658.field9390 - class75.field789;
                    if (var15 > class658.field9390 + class658.field9390) {
                        var15 = class658.field9390 + class658.field9390;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field366 + class658.field9390 - class325.field4238;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class658.field9390 + class658.field9390) {
                        continue;
                    }
                    int var17 = var1.field377 + class658.field9390 - class325.field4238;
                    if (var17 > class658.field9390 + class658.field9390) {
                        var17 = class658.field9390 + class658.field9390;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class581.field8258[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field372 = 5;
                        var1.field356 = (var1.field374 - class461.field6410 << 8) / var13;
                        var1.field365 = (var1.field373 - class461.field6410 << 8) / var13;
                        var1.field369 = (var1.field376 - class351.field4599 << 8) / var13;
                        var1.field357 = (var1.field375 - class351.field4599 << 8) / var13;
                        class476.field6930[class461.field6405++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V")
    public static void method3829(int arg0) {
        if (arg0 != 8) {
            method3826(null, (byte) 3);
        }
        field9739 = null;
    }
}
