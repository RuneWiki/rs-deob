import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class48 {

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[I")
    private int[] field870;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lij;")
    public static class50 field866 = class78.method578(126, "gleiten:");

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lij;")
    public static class50 field869 = class78.method578(122, "zap");

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field871 = -1;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lwi;")
    public static class21 field865;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method356(byte arg0) {
        field869 = null;
        field866 = null;
        field865 = null;
        if (arg0 != 0) {
            field867 = -65;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBIIII)V")
    public static final void method357(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field862++;
        class19.field400 = 0;
        for (int var7 = -1; var7 < class78.field1450 + class6.field77; var7++) {
            class237 var23;
            if (var7 == -1) {
                var23 = class239.field4067;
            } else if (class78.field1450 > var7) {
                var23 = class71.field1370[class60.field1116[var7]];
            } else {
                var23 = class41.field764[class153.field2678[var7 - class78.field1450]];
            }
            if (var23 != null && var23.method428((byte) 20)) {
                if (var23 instanceof class53) {
                    class62 var24 = ((class53) var23).field959;
                    if (var24.field1160 != null) {
                        var24 = var24.method486((byte) -68);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class78.field1450 <= var7) {
                    class62 var25 = ((class53) var23).field959;
                    if (var25.field1160 != null) {
                        var25 = var25.method486((byte) -70);
                    }
                    if (var25.field1171 >= 0 && class220.field3671.length > var25.field1171) {
                        class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(arg2 ^ 0xFFFFFFDA) + 15, (byte) -106, var23, arg6 >> 1);
                        if (class33.field660 > -1) {
                            class220.field3671[var25.field1171].method673(arg3 + class33.field660 - 12, arg4 - -class131.field2299 + -30);
                        }
                    }
                    int var26 = 0;
                    class141[] var27 = class36.field707;
                    while (var27.length > var26) {
                        class141 var28 = var27[var26];
                        if (var28 != null && var28.field2474 == 1 && class153.field2678[var7 - class78.field1450] == var28.field2471 && (class244.field4245 % 20) < 10) {
                            class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(0) + 15, (byte) -106, var23, arg6 >> 1);
                            if (class33.field660 > -1) {
                                class119.field2112[var28.field2465].method673(class33.field660 + arg3 - 12, arg4 + -28 - -class131.field2299);
                            }
                        }
                        var26++;
                    }
                } else {
                    int var29 = 30;
                    class187 var30 = (class187) var23;
                    if (var30.field3086 != -1 || var30.field3096 != -1) {
                        class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(0) + 15, (byte) -106, var23, arg6 >> 1);
                        if (class33.field660 > -1) {
                            if (var30.field3086 != -1) {
                                class87.field1679[var30.field3086].method673(class33.field660 + arg3 - 12, -var29 + arg4 + class131.field2299);
                                var29 += 25;
                            }
                            if (var30.field3096 != -1) {
                                class220.field3671[var30.field3096].method673(arg3 + class33.field660 - 12, class131.field2299 + arg4 + -var29);
                                var29 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class141[] var31 = class36.field707;
                        for (int var32 = 0; var32 < var31.length; var32++) {
                            class141 var33 = var31[var32];
                            if (var33 != null && var33.field2474 == 10 && class60.field1116[var7] == var33.field2471) {
                                class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(0) + 15, (byte) -106, var23, arg6 >> 1);
                                if (class33.field660 > -1) {
                                    class119.field2112[var33.field2465].method673(class33.field660 + arg3 - 12, arg4 - (-class131.field2299 - -var29));
                                }
                            }
                        }
                    }
                }
                if (var23.field4030 != null && (class78.field1450 <= var7 || class153.field2683 == 0 || class153.field2683 == 3 || class153.field2683 == 1 && class74.method556(((class187) var23).field3097, 110))) {
                    class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(0), (byte) -106, var23, arg6 >> 1);
                    if (class33.field660 > -1 && class19.field400 < class70.field1361) {
                        class70.field1347[class19.field400] = class57.field1029.method1081(var23.field4030) / 2;
                        class70.field1345[class19.field400] = class57.field1029.field2649;
                        class70.field1346[class19.field400] = class33.field660;
                        class70.field1355[class19.field400] = class131.field2299;
                        class70.field1336[class19.field400] = var23.field3988;
                        class70.field1352[class19.field400] = var23.field4019;
                        class70.field1338[class19.field400] = var23.field4017;
                        class70.field1353[class19.field400] = var23.field4030;
                        class19.field400++;
                    }
                }
                if (var23.field4016 > class244.field4245) {
                    class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(0) + 15, (byte) -106, var23, arg6 >> 1);
                    if (class33.field660 > -1) {
                        class158.method1104(arg3 - (15 - class33.field660), arg4 - -class131.field2299 + -3, var23.field3999, 5, 65280);
                        class158.method1104(arg3 + class33.field660 + (-15 - -var23.field3999), class131.field2299 + arg4 + -3, 30 - var23.field3999, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (var23.field3984[var34] > class244.field4245) {
                        class160.method1125(arg1, arg5 >> 1, arg0, var23.method1611(0) / 2, (byte) -106, var23, arg6 >> 1);
                        if (class33.field660 > -1) {
                            if (var34 == 1) {
                                class131.field2299 -= 20;
                            }
                            if (var34 == 2) {
                                class33.field660 -= 15;
                                class131.field2299 -= 10;
                            }
                            if (var34 == 3) {
                                class131.field2299 -= 10;
                                class33.field660 += 15;
                            }
                            class250.field4337[var23.field4026[var34]].method673(class33.field660 + arg3 - 12, arg4 + -12 - -class131.field2299);
                            class245.field4259.method1080(class78.method579(var23.field4007[var34], -26225), arg3 + class33.field660 - 1, class131.field2299 + arg4 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg2 != -38) {
            method358(-84, 127);
        }
        for (int var8 = 0; var8 < class19.field400; var8++) {
            int var9 = class70.field1346[var8];
            int var10 = class70.field1347[var8];
            int var11 = class70.field1355[var8];
            boolean var12 = true;
            int var13 = class70.field1345[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((class70.field1355[var22] - class70.field1345[var22]) < (var11 + 2) && var11 - var13 < class70.field1355[var22] + 2 && (class70.field1346[var22] + class70.field1347[var22]) > (var9 - var10) && (class70.field1346[var22] - class70.field1347[var22]) < (var9 + var10) && class70.field1355[var22] - class70.field1345[var22] < var11) {
                        var11 = class70.field1355[var22] - class70.field1345[var22];
                        var12 = true;
                    }
                }
            }
            class33.field660 = class70.field1346[var8];
            class131.field2299 = class70.field1355[var8] = var11;
            class50 var14 = class70.field1353[var8];
            if (class236.field3956 == 0) {
                int var15 = 16776960;
                if (class70.field1336[var8] < 6) {
                    var15 = class82.field1472[class70.field1336[var8]];
                }
                if (class70.field1336[var8] == 6) {
                    var15 = class6.field79 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class70.field1336[var8] == 7) {
                    var15 = (class6.field79 % 20) < 10 ? 255 : 65535;
                }
                if (class70.field1336[var8] == 8) {
                    var15 = class6.field79 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class70.field1336[var8] == 9) {
                    int var16 = 150 - class70.field1338[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var15 = ((var16 - 100) * 5) + 65280;
                    }
                }
                if (class70.field1336[var8] == 10) {
                    int var17 = 150 - class70.field1338[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 + 16384000 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 500 + 255 - (var17 * 5) - 32768000;
                    }
                }
                if (class70.field1336[var8] == 11) {
                    int var18 = 150 - class70.field1338[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 + 65280 - 16384250;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class70.field1352[var8] == 0) {
                    class57.field1029.method1080(var14, class33.field660 + arg3, class131.field2299 + arg4, var15, 0);
                }
                if (class70.field1352[var8] == 1) {
                    class57.field1029.method1077(var14, class33.field660 + arg3, class131.field2299 + arg4, var15, 0, class6.field79);
                }
                if (class70.field1352[var8] == 2) {
                    class57.field1029.method1061(var14, class33.field660 + arg3, class131.field2299 + arg4, var15, 0, class6.field79);
                }
                if (class70.field1352[var8] == 3) {
                    class57.field1029.method1078(var14, class33.field660 + arg3, class131.field2299 + arg4, var15, 0, class6.field79, 150 - class70.field1338[var8]);
                }
                if (class70.field1352[var8] == 4) {
                    int var19 = (150 - class70.field1338[var8]) * (class57.field1029.method1081(var14) + 100) / 150;
                    class158.method1110(arg3 - (50 - class33.field660), arg4, class33.field660 + arg3 + 50, arg4 + arg5);
                    class57.field1029.method1058(var14, arg3 + 50 - (-class33.field660 + var19), arg4 - -class131.field2299, var15, 0);
                    class158.method1105(arg3, arg4, arg3 + arg6, arg4 + arg5);
                }
                if (class70.field1352[var8] == 5) {
                    int var20 = 150 - class70.field1338[var8];
                    int var21 = 0;
                    class158.method1110(arg3, class131.field2299 + arg4 - class57.field1029.field2649 - 1, arg3 + arg6, arg4 - (-class131.field2299 - 5));
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class57.field1029.method1080(var14, class33.field660 + arg3, class131.field2299 - -var21 + arg4, var15, 0);
                    class158.method1105(arg3, arg4, arg3 + arg6, arg4 - -arg5);
                }
            } else {
                class57.field1029.method1080(var14, class33.field660 + arg3, arg4 - -class131.field2299, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[B")
    public static final byte[] method358(int arg0, int arg1) {
        field868++;
        if (arg0 != 50) {
            return null;
        }
        class8 var2 = (class8) class90.field1713.method912((long) arg1, (byte) 37);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class63.method494(var4, -32752, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class8(var3);
            class90.field1713.method913(var2, arg0 + 57, (long) arg1);
        }
        return var2.field119;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "([I)V")
    public class48(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field870 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field870[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field870[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field870[var5 + var5] = arg0[var4];
            this.field870[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)I")
    public final int method359(int arg0, int arg1) {
        field864++;
        int var3 = (this.field870.length >> 1) - 1;
        if (arg0 != 27585) {
            return -102;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field870[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field870[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }
}
