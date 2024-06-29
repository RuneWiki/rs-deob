import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class124 {

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public int field1396 = -1;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Z")
    public boolean field1393 = true;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public int field1392 = -1;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public int field1406 = 0;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "Z")
    public static boolean field1398 = false;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "Lr;")
    public static class118 field1397 = class153.method1136(125, "Hierhin gehen");

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BIIII)V")
    public static final void method534(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class153.field3481; var5++) {
            if (class91.field2183[var5] + class63.field1447[var5] > arg3 && class91.field2183[var5] < arg3 + arg4 && class89.field2144[var5] + class44.field1059[var5] > arg1 && class44.field1059[var5] < arg1 + arg2) {
                class67.field1555[var5] = true;
            }
        }
        if (arg0 != -19) {
            method539((byte) -59);
        }
        field1402++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
    private final void method535(int arg0, int arg1) {
        field1403++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        if (var3 > var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = var3;
        if (var9 > var7) {
            var9 = var7;
        }
        if (var5 > var3) {
            var15 = var5;
        }
        if (var7 > var15) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        this.field1399 = (int) (var17 * 256.0D);
        if (this.field1399 < 0) {
            this.field1399 = 0;
        } else if (this.field1399 > 255) {
            this.field1399 = 255;
        }
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var3 == var15) {
                var11 = (var5 - var7) / (var15 - var9);
            } else if (var5 == var15) {
                var11 = (var7 - var3) / (-var9 + var15) + 2.0D;
            } else if (var7 == var15) {
                var11 = (var3 - var5) / (var15 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field1404 = (int) (var13 * 256.0D);
        if (this.field1404 < 0) {
            this.field1404 = 0;
        } else if (this.field1404 > 255) {
            this.field1404 = 255;
        }
        if (arg0 >= -125) {
            this.method541(null, 49, 84, (byte) 37);
        }
        double var19 = var11 / 6.0D;
        this.field1400 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
    public final void method536(byte arg0) {
        if (this.field1396 != -1) {
            this.method535(-127, this.field1396);
            this.field1389 = this.field1399;
            this.field1391 = this.field1400;
            this.field1394 = this.field1404;
        }
        this.method535(-127, this.field1406);
        field1388++;
        if (arg0 <= 18) {
            this.field1400 = -88;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILpa;)V")
    public final void method537(int arg0, int arg1, class105 arg2) {
        field1390++;
        while (true) {
            int var4 = arg2.method831((byte) 76);
            if (var4 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.field1406 = -1;
                    return;
                }
            }
            this.method541(arg2, var4, arg0, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static final void method538(int arg0) {
        field1405++;
        short var1 = 256;
        if (class42.field1006 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class42.field1006 > 768) {
                    class94.field2225[var4] = class20.method183(arg0 - 150, class126.field2885[var4], 1024 - class42.field1006, class62.field1439[var4]);
                } else if (class42.field1006 > 256) {
                    class94.field2225[var4] = class62.field1439[var4];
                } else {
                    class94.field2225[var4] = class20.method183(58, class62.field1439[var4], 256 - class42.field1006, class126.field2885[var4]);
                }
            }
        } else if (class69.field1599 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class94.field2225[var2] = class126.field2885[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class69.field1599 > 768) {
                    class94.field2225[var3] = class20.method183(-71, class126.field2885[var3], 1024 - class69.field1599, class47.field1128[var3]);
                } else if (class69.field1599 <= 256) {
                    class94.field2225[var3] = class20.method183(-91, class47.field1128[var3], 256 - class69.field1599, class126.field2885[var3]);
                } else {
                    class94.field2225[var3] = class47.field1128[var3];
                }
            }
        }
        int var5 = 0;
        int var6 = class61.field1422.field3366 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var21 = (var1 - var8) * class45.field1080[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class158.field3647[var5++];
                int var25 = class61.field1422.field3367[var6++];
                if (var24 == 0) {
                    class35.field891.field3367[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class94.field2225[var24];
                    class35.field891.field3367[var7++] = class79.method669(-16711936, class79.method669(var25, 16711935) * var27 + var24 * class79.method669(16711935, var28)) + class79.method669(16711680, class79.method669(var25, 65280) * var27 + var24 * class79.method669(65280, var28)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class35.field891.field3367[var7++] = class61.field1422.field3367[var6++];
            }
            var6 += class61.field1422.field3366 - 128;
        }
        int var9 = 0;
        int var10 = 0;
        class35.field891.method1114(0, 9);
        int var11 = class61.field1422.field3366 * 9 + 128;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class45.field1080[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var10++;
                var11--;
                class112.field2614.field3367[var10001] = class61.field1422.field3367[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class158.field3647[var9++];
                var11--;
                int var17 = class61.field1422.field3367[var11];
                if (var16 == 0) {
                    class112.field2614.field3367[var10++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class94.field2225[var16];
                    class112.field2614.field3367[var10++] = class79.method669(-16711936, var16 * class79.method669(16711935, var20) + var19 * class79.method669(var17, 16711935)) + class79.method669(var16 * class79.method669(65280, var20) + class79.method669(65280, var17) * var19, 16711680) >> 8;
                }
            }
            var9 += var13;
            var11 += class61.field1422.field3366 + 128;
        }
        class112.field2614.method1114(637, 9);
        if (arg0 != 256) {
            method539((byte) 123);
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
    public static void method539(byte arg0) {
        field1397 = null;
        if (arg0 != 113) {
            method540(null, 33);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lke;I)Lr;")
    public static final class118 method540(class74 arg0, int arg1) {
        field1401++;
        if (class30.method258(-101, class46.method384(arg0, 0)) == 0) {
            return null;
        } else if (arg0.field1782 == null || arg0.field1782.method918(false).method935(-75) == 0) {
            return class33.field844 ? class74.field1723 : null;
        } else {
            int var2 = -25 / ((-arg1 - 3) / 62);
            return arg0.field1782;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lpa;IIB)V")
    private final void method541(class105 arg0, int arg1, int arg2, byte arg3) {
        field1395++;
        if (arg3 != 7) {
            method538(97);
        }
        if (arg1 == 1) {
            this.field1406 = arg0.method799(-1);
        } else if (arg1 == 2) {
            this.field1392 = arg0.method831((byte) 76);
        } else if (arg1 == 3) {
            this.field1392 = arg0.method838((byte) 5);
            if (this.field1392 == 65535) {
                this.field1392 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field1393 = false;
            return;
        } else if (arg1 == 7) {
            this.field1396 = arg0.method799(-1);
        } else {
            return;
        }
    }
}
