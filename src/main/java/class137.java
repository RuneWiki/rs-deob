import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class137 {

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
    private int[] field3441;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    private int[] field3437;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[B")
    private byte[] field3423;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "J")
    public static long field3421 = 0L;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lfc;")
    public static class39 field3434 = class90.method774("_", -89);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[[[B")
    public static byte[][][] field3424 = new byte[4][104][104];

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[B")
    public static byte[] field3438 = new byte[520];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lfc;")
    public static class39 field3427 = class90.method774("(Udns", -124);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lfc;")
    private static class39 field3430 = class90.method774("M", -106);

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lfc;")
    public static class39 field3433 = class90.method774("Freunde)2Server)3)3)3", -127);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lfc;")
    public static class39 field3432 = field3430;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lfc;")
    private static class39 field3444 = class90.method774("New User", -118);

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lfc;")
    public static class39 field3435 = field3444;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lfc;")
    private static class39 field3443 = class90.method774("Connecting to server)3)3)3", -80);

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lfc;")
    public static class39 field3440 = field3443;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lfc;")
    public static class39 field3428 = class90.method774("null", -94);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lp;")
    public static class104 field3426 = new class104(64);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB[BI[BI)I", line = 9)
    public final int method1109(int arg0, byte arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field3439++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field3441[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var11;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var12;
            if ((var12 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var12;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var13;
            if ((var13 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var13;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var14;
            if ((var14 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var14;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var15;
            if ((var15 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var15;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var16;
            if ((var16 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var16;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var17;
            if ((var17 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var17;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3441[var8];
            }
            int var18;
            if ((var18 = this.field3441[var8]) < 0) {
                arg2[arg5++] = (byte) ~var18;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        int var19 = -98 / ((-arg1 - 67) / 56);
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lfc;", line = 161)
    public static final class39 method1110(int arg0, int arg1) {
        if (arg0 != 30397) {
            field3435 = null;
        }
        class39 var2 = class86.method734(arg1, 2218);
        for (int var3 = var2.method437(-120) - 3; var3 > 0; var3 -= 3) {
            var2 = method1111(new class39[] { var2.method456(0, 0, var3), class72.field1685, var2.method469(var3, (byte) -100) }, (byte) -109);
        }
        field3436++;
        if (var2.method437(-93) > 8) {
            var2 = method1111(new class39[] { class118.field3093, var2.method456(0, 0, var2.method437(arg0 ^ 0x76C7) - 8), class27.field769, class68.field1619, var2, class29.field825 }, (byte) -68);
        } else if (var2.method437(arg0 ^ 0x7692) > 4) {
            var2 = method1111(new class39[] { class142.field3554, var2.method456(arg0 ^ 0x76BD, 0, var2.method437(-44) - 4), class1.field16, class68.field1619, var2, class29.field825 }, (byte) -92);
        }
        return method1111(new class39[] { class82.field1836, var2 }, (byte) -22);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lfc;B)Lfc;", line = 200)
    public static final class39 method1111(class39[] arg0, byte arg1) {
        field3429++;
        int var2 = 52 % ((arg1 - 26) / 47);
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class9.method128(0, arg0, -17838, arg0.length);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Lg;", line = 224)
    public static final class43 method1112(int arg0, int arg1) {
        class43 var2 = (class43) class88.field2056.method931(false, (long) arg1);
        field3425++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class14.field369.method839(5, 14, arg1);
        if (arg0 != -1) {
            return null;
        }
        class43 var4 = new class43();
        if (var3 != null) {
            var4.method508((byte) 120, new class25(var3));
        }
        class88.field2056.method934(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 259)
    public static final void method1113(byte arg0) {
        field3422++;
        if (class76.field1734 == 0) {
            return;
        }
        int var1 = 0;
        if (class120.field3131 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class112.field2936[var2] != null) {
                int var4 = class145.field3623[var2];
                class39 var5 = class139.field3515[var2];
                if (var5 != null && var5.method472(0, class89.field2091)) {
                    var5 = var5.method469(5, (byte) -118);
                }
                if (var5 != null && var5.method472(0, class43.field1177)) {
                    var5 = var5.method469(5, (byte) -112);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class92.field2164 == 0 || class92.field2164 == 1 && class35.method399(var5, 127))) {
                    int var6 = 329 - var1 * 13;
                    var1++;
                    if (class12.field314 > 4 && class131.field3322 - 4 > var6 - 10 && var6 + 3 >= class131.field3322 + -4) {
                        int var7 = class50.field1255.method707(method1111(new class39[] { class12.field321, class149.field3706, var5, class112.field2936[var2] }, (byte) 115)) + 25;
                        if (var7 > 450) {
                            var7 = 450;
                        }
                        if (class12.field314 < var7 + 4) {
                            class34.field898++;
                            class2.field38++;
                            if (class5.field178 >= 1) {
                                class92.method786(0, 2056, 0, 60, 0, method1111(new class39[] { class58.field1427, var5 }, (byte) -92), class3.field89);
                                class68.field1612++;
                            }
                            class92.method786(0, 2054, 0, 5, 0, method1111(new class39[] { class58.field1427, var5 }, (byte) -31), class13.field350);
                            class92.method786(0, 2004, 0, 15, 0, method1111(new class39[] { class58.field1427, var5 }, (byte) 105), class111.field2854);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var4 == 5 || var4 == 6) && class92.field2164 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        int var3 = 64 % ((-arg0 - 19) / 56);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 372)
    public static void method1114(int arg0) {
        field3440 = null;
        field3428 = null;
        field3426 = null;
        field3430 = null;
        field3435 = null;
        field3434 = null;
        field3427 = null;
        field3432 = null;
        field3438 = null;
        field3424 = null;
        field3444 = null;
        field3433 = null;
        field3443 = null;
        if (arg0 != 31105) {
            field3427 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[BII[B)I", line = 423)
    public final int method1115(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field3442++;
        int var7 = arg0 + arg3;
        int var8 = 0;
        int var9 = arg4 << 3;
        while (arg0 < var7) {
            int var11 = arg2[arg0] & 0xFF;
            int var12 = this.field3437[var11];
            byte var13 = this.field3423[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var8 & -var15 >> 31;
            int var17 = var14 + (var13 + var15 - 1 >> 3);
            var9 += var13;
            int var18 = var15 + 24;
            arg5[var14] = (byte) (var8 = class126.method1050(var16, var12 >>> var18));
            if (var14 < var17) {
                var15 = var18 - 8;
                var14++;
                arg5[var14] = (byte) (var8 = var12 >>> var15);
                if (var14 < var17) {
                    var15 -= 8;
                    var14++;
                    arg5[var14] = (byte) (var8 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg5[var14] = (byte) (var8 = var12 >>> var15);
                        if (var17 > var14) {
                            var14++;
                            var15 -= 8;
                            arg5[var14] = (byte) (var8 = var12 << -var15);
                        }
                    }
                }
            }
            arg0++;
        }
        int var10 = -88 / ((38 - arg1) / 44);
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 494)
    public static final void method1116(int arg0) {
        field3431++;
        class143.method1163(false, false);
        class3.field78 = 0;
        boolean var1 = true;
        if (arg0 != 16445) {
            return;
        }
        for (int var2 = 0; var2 < class146.field3641.length; var2++) {
            if (class58.field1428[var2] != -1 && class146.field3641[var2] == null) {
                class146.field3641[var2] = client.field557.method839(5, class58.field1428[var2], 0);
                if (class146.field3641[var2] == null) {
                    var1 = false;
                    class3.field78++;
                }
            }
            if (class16.field469[var2] != -1 && class120.field3119[var2] == null) {
                class120.field3119[var2] = client.field557.method841(class151.field3749[var2], class16.field469[var2], false, 0);
                if (class120.field3119[var2] == null) {
                    class3.field78++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class38.field1031 = 1;
            return;
        }
        boolean var3 = true;
        class120.field3126 = 0;
        for (int var4 = 0; var4 < class146.field3641.length; var4++) {
            byte[] var56 = class120.field3119[var4];
            if (var56 != null) {
                int var57 = (class9.field248[var4] >> 8) * 64 - class54.field1341;
                int var58 = (class9.field248[var4] & 0xFF) * 64 - class55.field1382;
                if (class6.field194) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class68.method640(false, var57, var56, var58);
            }
        }
        if (!var3) {
            class38.field1031 = 2;
            return;
        }
        if (class38.field1031 != 0) {
            class131.method1066(class86.field1951, class2.field45, true, 257);
        }
        class121.method1036((byte) 61);
        class58.method586(arg0 - 13782);
        class121.method1036((byte) 61);
        class139.field3503.method42();
        class121.method1036((byte) 61);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class117.field3077[var5].method875(16777215);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    field3424[var6][var54][var55] = 0;
                }
            }
        }
        class121.method1036((byte) 61);
        class27.method342(false);
        int var7 = class146.field3641.length;
        class103.method926((byte) -80);
        class143.method1163(false, true);
        if (!class6.field194) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class9.field248[var8] >> 8) * 64 - class54.field1341;
                byte[] var18 = class146.field3641[var8];
                int var19 = (class9.field248[var8] & 0xFF) * 64 - class55.field1382;
                if (var18 != null) {
                    class121.method1036((byte) 61);
                    class53.method560(0, var19, class117.field3077, class68.field1618 * 8 - 48, var18, var17, class28.field817 * 8 - 48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class9.field248[var9] >> 8) * 64 - class54.field1341;
                int var15 = (class9.field248[var9] & 0xFF) * 64 - class55.field1382;
                byte[] var16 = class146.field3641[var9];
                if (var16 == null && class28.field817 < 800) {
                    class121.method1036((byte) 61);
                    class126.method1045(64, 64, var15, 6337, var14);
                }
            }
            class143.method1163(false, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class120.field3119[var10];
                if (var11 != null) {
                    int var12 = (class9.field248[var10] & 0xFF) * 64 - class55.field1382;
                    int var13 = (class9.field248[var10] >> 8) * 64 - class54.field1341;
                    class121.method1036((byte) 61);
                    client.method229(-1, var13, var12, class139.field3503, class117.field3077, var11);
                }
            }
        }
        if (class6.field194) {
            for (int var20 = 0; var20 < 4; var20++) {
                class121.method1036((byte) 61);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class7.field235[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 14 & 0x3FF;
                            int var39 = var36 >> 24 & 0x3;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = var36 >> 1 & 0x3;
                            int var42 = (var38 / 8 << 8) + var40 / 8;
                            for (int var43 = 0; var43 < class9.field248.length; var43++) {
                                if (class9.field248[var43] == var42 && class146.field3641[var43] != null) {
                                    class92.method787((var40 & 0x7) * 8, var35 * 8, class117.field3077, var34 * 8, true, class146.field3641[var43], var39, var41, (var38 & 0x7) * 8, var20);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            client.method242(var34 * 8, var35 * 8, arg0 - 16341, var20);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class7.field235[0][var21][var32];
                    if (var33 == -1) {
                        class126.method1045(8, 8, var32 * 8, 6337, var21 * 8);
                    }
                }
            }
            class143.method1163(false, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class121.method1036((byte) 61);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class7.field235[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 24 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class9.field248.length; var31++) {
                                if (class9.field248[var31] == var30 && class120.field3119[var31] != null) {
                                    class88.method751((byte) -49, var22, var27, (var28 & 0x7) * 8, class139.field3503, (var29 & 0x7) * 8, class120.field3119[var31], var24 * 8, class117.field3077, var26, var23 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class143.method1163(false, true);
        class58.method586(2663);
        class121.method1036((byte) 61);
        class10.method142(class117.field3077, class139.field3503, 5100);
        class143.method1163(false, true);
        int var44 = class143.field3595;
        if (var44 > class24.field661) {
            var44 = class24.field661;
        }
        if (var44 < class24.field661 - 1) {
            int var45 = class24.field661 - 1;
        }
        if (class74.field1705) {
            class139.field3503.method65(class143.field3595);
        } else {
            class139.field3503.method65(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class9.method134(var53, var46, arg0 - 16526);
            }
        }
        class121.method1036((byte) 61);
        class7.method99(109);
        class79.field1788.method927(false);
        if (class87.field2010 != null) {
            class79.field1794.method393((byte) -14, 19);
            class151.field3746++;
            class79.field1794.method283(true, 1057001181);
        }
        if (!class6.field194) {
            int var47 = (class68.field1618 - 6) / 8;
            int var48 = (class68.field1618 + 6) / 8;
            int var49 = (class28.field817 - 6) / 8;
            int var50 = (class28.field817 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var51 > var48 || var49 > var52 || var52 > var50) {
                        client.field557.method852((byte) -117, method1111(new class39[] { class71.field1673, class86.method734(var51, 2218), field3434, class86.method734(var52, 2218) }, (byte) -67));
                        client.field557.method852((byte) -107, method1111(new class39[] { class55.field1380, class86.method734(var51, 2218), field3434, class86.method734(var52, 2218) }, (byte) 95));
                    }
                }
            }
        }
        if (class78.field1777 == -1) {
            class114.method990((byte) -114, 30);
        } else {
            class114.method990((byte) -105, 35);
        }
        class121.method1036((byte) 61);
        class145.method1165(-12761);
        class79.field1794.method393((byte) -14, 146);
        class131.method1069(-33);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V", line = 979)
    public class137(byte[] arg0) {
        int var2 = arg0.length;
        this.field3441 = new int[8];
        int[] var3 = new int[33];
        this.field3437 = new int[var2];
        int var4 = 0;
        this.field3423 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3437[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class126.method1050(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3441[var14] == 0) {
                            this.field3441[var14] = var4;
                        }
                        var14 = this.field3441[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3441.length <= var14) {
                        int[] var18 = new int[this.field3441.length * 2];
                        for (int var19 = 0; var19 < this.field3441.length; var19++) {
                            var18[var19] = this.field3441[var19];
                        }
                        this.field3441 = var18;
                    }
                }
                this.field3441[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
