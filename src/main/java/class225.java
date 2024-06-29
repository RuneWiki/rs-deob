import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class225 extends class306 {

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    private int field3394 = 0;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    private int field3401 = 20;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    private int field3404 = 1365;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    private int field3399 = 0;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "[I")
    public static int[] field3392 = new int[1024];

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Lvh;")
    public static class62 field3397 = new class62(64);

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "Z")
    public static boolean field3396;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "[[[B")
    public static byte[][][] field3398;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 344)
    public class225() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I", line = 21)
    public final int[] method47(int arg0, int arg1) {
        field3403++;
        int[] var3 = this.field4757.method903(arg0, -55);
        if (this.field4757.field1898) {
            for (int var4 = 0; var4 < class31.field367; var4++) {
                int var5 = (class111.field1553[arg0] << 12) / this.field3404 + this.field3399;
                int var6 = (class25.field288[var4] << 12) / this.field3404 + this.field3394;
                int var7 = var6;
                int var8 = var6 * var6 >> 12;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var5;
                int var13 = 0;
                while (var8 + var11 < 16384 && this.field3401 > var13) {
                    var12 = (var10 * var12 >> 12) * 2 + var9;
                    var10 = var8 + var7 - var11;
                    var11 = var12 * var12 >> 12;
                    var13++;
                    var8 = var10 * var10 >> 12;
                }
                var3[var4] = this.field3401 - 1 > var13 ? (var13 << 12) / this.field3401 : 0;
            }
        }
        if (arg1 != -1546337535) {
            method1562(-70);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V", line = 82)
    public static final void method1562(int arg0) {
        field3395++;
        if (class336.field5347 == null) {
            return;
        }
        if (class140.field2091 < 10) {
            if (!class336.field5345.method99(class336.field5347.field3232, (byte) 107)) {
                class140.field2091 = class308.field4782.method98(class336.field5347.field3232, -1) / 10;
                return;
            }
            class199.method1381(-21212);
            class140.field2091 = 10;
        }
        if (arg0 != 91) {
            method1562(-65);
        }
        if (class140.field2091 == 10) {
            class336.field5354 = class336.field5347.field3234 >> 6 << 6;
            class336.field5350 = (class336.field5347.field3218 >> 6 << 6) + 64 - class336.field5354;
            int var1 = -1;
            int[] var2 = new int[3];
            class336.field5346 = class336.field5347.field3235 >> 6 << 6;
            int var3 = -1;
            class336.field5356 = (class336.field5347.field3225 >> 6 << 6) + 64 - class336.field5346;
            if (class336.field5347.method1479(class219.field3290, (class11.field113.field3763 >> 7) + class16.field160, (byte) 33, var2, (class11.field113.field3767 >> 7) + class322.field4999)) {
                var3 = class336.field5350 - (var2[2] + 1 - class336.field5354);
                var1 = var2[1] - class336.field5346;
            }
            if (!class62.field743 && var1 >= 0 && class336.field5356 > var1 && var3 >= 0 && var3 < class336.field5350) {
                int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
                class315.field4950 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class63.field752 = var5;
            } else if (class314.field4932 == -1 || class125.field1774 == -1) {
                class336.field5347.method1482(class336.field5347.field3215 & 0x3FFF, 117, var2, class336.field5347.field3215 >> 14 & 0x3FFF);
                class315.field4950 = var2[1] - class336.field5346;
                class63.field752 = class336.field5354 + class336.field5350 - var2[2] - 1;
            } else {
                class336.field5347.method1482(class125.field1774, 118, var2, class314.field4932);
                class62.field743 = false;
                class125.field1774 = -1;
                class314.field4932 = -1;
                if (var2 != null) {
                    class315.field4950 = var2[1] - class336.field5346;
                    class63.field752 = class336.field5354 + class336.field5350 - var2[2] - 1;
                }
            }
            if (class336.field5347.field3233 == 37) {
                class336.field5351 = 3.0F;
                class336.field5349 = 3.0F;
            } else if (class336.field5347.field3233 == 50) {
                class336.field5351 = 4.0F;
                class336.field5349 = 4.0F;
            } else if (class336.field5347.field3233 == 75) {
                class336.field5351 = 6.0F;
                class336.field5349 = 6.0F;
            } else if (class336.field5347.field3233 == 100) {
                class336.field5351 = 8.0F;
                class336.field5349 = 8.0F;
            } else if (class336.field5347.field3233 == 200) {
                class336.field5351 = 16.0F;
                class336.field5349 = 16.0F;
            } else {
                class336.field5351 = 8.0F;
                class336.field5349 = 8.0F;
            }
            class349.method2424((byte) 121);
            int var6 = class336.field5356 >> 6;
            int var7 = class336.field5350 >> 6;
            class336.field5357 = new byte[var6][var7][];
            class336.field5361 = new int[class234.field3575 + 1];
            class336.field5363 = new int[var6][var7][];
            class336.field5364 = new byte[var6][var7][];
            class336.field5370 = new int[var6][var7][];
            class336.field5369 = new byte[var6][var7][];
            class336.field5372 = new byte[var6][var7][];
            class336.field5371 = new byte[var6][var7][];
            class233.field3526 = new class257();
            class99.field1338 = new class5();
            int var8 = class6.field71 >> 1;
            int var9 = class237.field3639 >> 2 << 10;
            class336.method2311(var9, var8);
            class140.method966(256, (byte) -125, 1024);
            class236.method1631((byte) -49, 256);
            class140.field2091 = 20;
        } else if (class140.field2091 == 20) {
            class27.method199((byte) 93, new class143(class336.field5345.method119(class336.field5347.field3232, "underlay", arg0 + 34)));
            class140.field2091 = 30;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 30) {
            class336.method2322(new class143(class336.field5345.method119(class336.field5347.field3232, "overlay", 1)));
            class140.field2091 = 40;
            class227.method1577(-8588);
        } else if (class140.field2091 == 40) {
            class336.method2317(new class143(class336.field5345.method119(class336.field5347.field3232, "overlay2", arg0 ^ 0xFFFFFFE7)));
            class140.field2091 = 50;
            class227.method1577(arg0 - 8679);
        } else if (class140.field2091 == 50) {
            class336.method2320(new class143(class336.field5345.method119(class336.field5347.field3232, "loc", -79)), class33.field387);
            class140.field2091 = 60;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 60) {
            if (class336.field5345.method105(112, class336.field5347.field3232 + "_labels")) {
                if (!class336.field5345.method99(class336.field5347.field3232 + "_labels", (byte) -126)) {
                    return;
                }
                class336.field5353 = class277.method1981(class336.field5347.field3232 + "_labels", class336.field5345, class33.field387, arg0 - 203);
            } else {
                class336.field5353 = new class301(0);
            }
            class336.method2316();
            class140.field2091 = 70;
            class227.method1577(-8588);
        } else if (class140.field2091 == 70) {
            class360.field5701 = new class249(11, true, class328.field5287);
            class140.field2091 = 73;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 73) {
            class262.field4141 = new class249(12, true, class328.field5287);
            class140.field2091 = 76;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 76) {
            class176.field2668 = new class249(14, true, class328.field5287);
            class140.field2091 = 79;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 79) {
            class132.field1905 = new class249(17, true, class328.field5287);
            class140.field2091 = 82;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 82) {
            class293.field4620 = new class249(19, true, class328.field5287);
            class140.field2091 = 85;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 85) {
            class27.field326 = new class249(22, true, class328.field5287);
            class140.field2091 = 88;
            class143.method1025(true, -1);
            class227.method1577(-8588);
        } else if (class140.field2091 == 88) {
            class107.field1477 = new class249(26, true, class328.field5287);
            class140.field2091 = 91;
            class143.method1025(true, -1);
            class227.method1577(arg0 - 8679);
        } else {
            class55.field646 = new class249(30, true, class328.field5287);
            class140.field2091 = 100;
            class143.method1025(true, -1);
            class227.method1577(-8588);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V", line = 330)
    public static void method1563(byte arg0) {
        field3398 = (byte[][][]) null;
        field3392 = null;
        field3397 = null;
        if (arg0 != 5) {
            method1564(-22, 127, (byte) 17, -54, -49);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILlf;I)V", line = 354)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field3400++;
        if (arg2 == 0) {
            this.field3404 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field3401 = arg1.method1051(1);
        } else if (arg2 == 2) {
            this.field3394 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field3399 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            field3397 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBII)I", line = 413)
    public static final int method1564(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 2 / ((arg2 + 15) / 55);
        field3405++;
        int var6 = 65536 - class104.field1435[arg3 * 1024 / arg4] >> 1;
        return ((65536 - var6) * arg0 >> 16) + (arg1 * var6 >> 16);
    }
}
