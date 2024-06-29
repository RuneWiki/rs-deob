import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 extends class124 {

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public int field3443 = -1;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "Z")
    public boolean field3448 = false;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public int field3447 = -1;

    @OriginalMember(owner = "client!w", name = "mb", descriptor = "I")
    public int field3466 = 2;

    @OriginalMember(owner = "client!w", name = "jb", descriptor = "I")
    public int field3463 = 99;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public int field3446 = -1;

    @OriginalMember(owner = "client!w", name = "sb", descriptor = "I")
    public int field3472 = 5;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public int field3441 = -1;

    @OriginalMember(owner = "client!w", name = "Eb", descriptor = "I")
    public int field3484 = -1;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public static int field3450 = 0;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    public static int field3458 = 0;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "Lr;")
    public static class118 field3457 = method1136(118, "scrollen:");

    @OriginalMember(owner = "client!w", name = "qb", descriptor = "I")
    public static int field3470 = 0;

    @OriginalMember(owner = "client!w", name = "xb", descriptor = "Lr;")
    public static class118 field3477 = method1136(82, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!w", name = "zb", descriptor = "Lr;")
    public static class118 field3479 = method1136(112, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
    public static int field3460 = 0;

    @OriginalMember(owner = "client!w", name = "Bb", descriptor = "I")
    public static int field3481 = 0;

    @OriginalMember(owner = "client!w", name = "tb", descriptor = "Lr;")
    public static class118 field3473 = method1136(110, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "Lr;")
    public static class118 field3455 = method1136(81, "Hier wechseln");

    @OriginalMember(owner = "client!w", name = "Db", descriptor = "Lr;")
    public static class118 field3483 = method1136(101, "null");

    @OriginalMember(owner = "client!w", name = "lb", descriptor = "[I")
    public static int[] field3465 = new int[1000];

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!w", name = "hb", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!w", name = "pb", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!w", name = "ub", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!w", name = "vb", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!w", name = "wb", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!w", name = "Ab", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!w", name = "Cb", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "Lvd;")
    public static class150 field3449;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "[I")
    private int[] field3456;

    @OriginalMember(owner = "client!w", name = "ib", descriptor = "[I")
    public int[] field3462;

    @OriginalMember(owner = "client!w", name = "kb", descriptor = "[I")
    public int[] field3464;

    @OriginalMember(owner = "client!w", name = "nb", descriptor = "[I")
    public static int[] field3467;

    @OriginalMember(owner = "client!w", name = "ob", descriptor = "[I")
    public static int[] field3468;

    @OriginalMember(owner = "client!w", name = "rb", descriptor = "[I")
    private int[] field3471;

    @OriginalMember(owner = "client!w", name = "yb", descriptor = "[I")
    public int[] field3478;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1133(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        field3453++;
        if (arg0 == -7) {
            byte[] var3 = new byte[var2];
            class57.method504(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILwb;)Lwb;")
    public final class155 method1134(int arg0, int arg1, class155 arg2) {
        field3459++;
        int var4 = this.field3464[arg1];
        if (arg0 != -10046) {
            this.field3448 = true;
        }
        class72 var5 = class79.method671(-111, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1210(true);
        } else {
            class155 var7 = arg2.method1210(!var5.method606(18342, var6));
            var7.method1205(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwb;IB)Lwb;")
    public final class155 method1135(class155 arg0, int arg1, byte arg2) {
        field3442++;
        int var4 = this.field3464[arg1];
        class72 var5 = class79.method671(-87, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1214(true);
        }
        if (arg2 >= -41) {
            this.method1144(-40);
        }
        class72 var7 = null;
        int var8 = 0;
        if (this.field3456 != null && arg1 < this.field3456.length) {
            int var9 = this.field3456[arg1];
            var7 = class79.method671(-126, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class155 var11 = arg0.method1214(!var5.method606(18342, var6));
            var11.method1205(var5, var6);
            return var11;
        } else {
            class155 var10 = arg0.method1214(!var5.method606(18342, var6) & !var7.method606(18342, var8));
            var10.method1205(var5, var6);
            var10.method1205(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;)Lr;")
    public static final class118 method1136(int arg0, String arg1) {
        field3480++;
        if (arg0 <= 73) {
            method1133(-85, null);
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class118 var5 = new class118();
        var5.field2746 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var4) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field2746[var5.field2743++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field2746[var5.field2743++] = (byte) var6;
            }
        }
        var5.method920((byte) -94);
        return var5.method934((byte) -40);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwb;II)Lwb;")
    public final class155 method1137(class155 arg0, int arg1, int arg2) {
        int var4 = this.field3464[arg1];
        field3475++;
        if (arg2 != -1931831664) {
            field3479 = null;
        }
        class72 var5 = class79.method671(-112, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1214(true);
        } else {
            class155 var7 = arg0.method1214(!var5.method606(arg2 ^ 0x8CDAD136, var6));
            var7.method1205(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwb;III)Lwb;")
    public final class155 method1138(class155 arg0, int arg1, int arg2, int arg3) {
        field3444++;
        int var5 = this.field3464[arg1];
        class72 var6 = class79.method671(-115, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method1214(true);
        }
        int var8 = arg2 & 0x3;
        class155 var9 = arg0.method1214(!var6.method606(18342, var7));
        if (var8 == 1) {
            var9.method1215();
        } else if (var8 == 2) {
            var9.method1203();
        } else if (var8 == 3) {
            var9.method1198();
        }
        var9.method1205(var6, var7);
        int var10 = -101 % ((arg3 - 7) / 50);
        if (var8 == 1) {
            var9.method1198();
        } else if (var8 == 2) {
            var9.method1203();
        } else if (var8 == 3) {
            var9.method1215();
        }
        return var9;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lpa;II)V")
    private final void method1139(class105 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var11 = arg0.method838((byte) 5);
            this.field3478 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3478[var12] = arg0.method838((byte) 5);
            }
            this.field3464 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field3464[var13] = arg0.method838((byte) 5);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field3464[var14] += arg0.method838((byte) 5) << 16;
            }
        } else if (arg2 == 2) {
            this.field3443 = arg0.method838((byte) 5);
        } else if (arg2 == 3) {
            int var4 = arg0.method831((byte) 76);
            this.field3471 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3471[var5] = arg0.method831((byte) 76);
            }
            this.field3471[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field3448 = true;
        } else if (arg2 == 5) {
            this.field3472 = arg0.method831((byte) 76);
        } else if (arg2 == 6) {
            this.field3446 = arg0.method838((byte) 5);
        } else if (arg2 == 7) {
            this.field3484 = arg0.method838((byte) 5);
        } else if (arg2 == 8) {
            this.field3463 = arg0.method831((byte) 76);
        } else if (arg2 == 9) {
            this.field3447 = arg0.method831((byte) 76);
        } else if (arg2 == 10) {
            this.field3441 = arg0.method831((byte) 76);
        } else if (arg2 == 11) {
            this.field3466 = arg0.method831((byte) 76);
        } else if (arg2 == 12) {
            int var8 = arg0.method831((byte) 76);
            this.field3456 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3456[var9] = arg0.method838((byte) 5);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3456[var10] = (arg0.method838((byte) 5) << 16) + this.field3456[var10];
            }
        } else if (arg2 == 13) {
            int var6 = arg0.method831((byte) 76);
            this.field3462 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3462[var7] = arg0.method799(-1);
            }
        }
        if (arg1 == -9) {
            field3469++;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLpa;)V")
    public final void method1140(byte arg0, class105 arg1) {
        if (arg0 >= -118) {
            field3458 = 89;
        }
        while (true) {
            int var3 = arg1.method831((byte) 76);
            if (var3 == 0) {
                field3476++;
                return;
            }
            this.method1139(arg1, -9, var3);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field3449 = null;
        field3473 = null;
        if (arg0 > -62) {
            method1133(98, null);
        }
        field3468 = null;
        field3455 = null;
        field3479 = null;
        field3465 = null;
        field3467 = null;
        field3477 = null;
        field3457 = null;
        field3483 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)V")
    public static final void method1142(byte[] arg0, int arg1) {
        class105 var2 = new class105(arg0);
        var2.field2404 = arg0.length - 2;
        class95.field2246 = var2.method838((byte) 5);
        class74.field1830 = new byte[class95.field2246][];
        field3467 = new int[class95.field2246];
        field3474++;
        class54.field1293 = new int[class95.field2246];
        class56.field1313 = new int[class95.field2246];
        class65.field1488 = new int[class95.field2246];
        var2.field2404 = arg0.length - class95.field2246 * 8 - 7;
        class105.field2458 = var2.method838((byte) 5);
        class106.field2476 = var2.method838((byte) 5);
        int var3 = (var2.method831((byte) 76) & 0xFF) + 1;
        if (arg1 != -23279) {
            return;
        }
        for (int var4 = 0; var4 < class95.field2246; var4++) {
            field3467[var4] = var2.method838((byte) 5);
        }
        for (int var5 = 0; var5 < class95.field2246; var5++) {
            class54.field1293[var5] = var2.method838((byte) 5);
        }
        for (int var6 = 0; var6 < class95.field2246; var6++) {
            class65.field1488[var6] = var2.method838((byte) 5);
        }
        for (int var7 = 0; var7 < class95.field2246; var7++) {
            class56.field1313[var7] = var2.method838((byte) 5);
        }
        var2.field2404 = arg0.length - (var3 - 1) * 3 - class95.field2246 * 8 - 7;
        class127.field2904 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class127.field2904[var8] = var2.method799(-1);
            if (class127.field2904[var8] == 0) {
                class127.field2904[var8] = 1;
            }
        }
        var2.field2404 = 0;
        for (int var9 = 0; var9 < class95.field2246; var9++) {
            int var10 = class56.field1313[var9];
            int var11 = class65.field1488[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class74.field1830[var9] = var13;
            int var14 = var2.method831((byte) 76);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method807(false);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var16 + var11 * var17] = var2.method807(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwb;IIILw;)Lwb;")
    public final class155 method1143(class155 arg0, int arg1, int arg2, int arg3, class153 arg4) {
        field3461++;
        int var6 = this.field3464[arg3];
        class72 var7 = class79.method671(-110, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1137(arg0, arg1, -1931831664);
        }
        int var9 = arg4.field3464[arg1];
        class72 var10 = class79.method671(-108, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class155 var12 = arg0.method1214(!var7.method606(18342, var8));
            var12.method1205(var7, var8);
            return var12;
        } else if (arg2 <= 68) {
            return null;
        } else {
            class155 var13 = arg0.method1214(!var7.method606(18342, var8) & !var10.method606(18342, var11));
            var13.method1201(var7, var8, var10, var11, this.field3471);
            return var13;
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public final void method1144(int arg0) {
        if (this.field3441 == -1) {
            if (this.field3471 == null) {
                this.field3441 = 0;
            } else {
                this.field3441 = 2;
            }
        }
        if (this.field3447 == -1) {
            if (this.field3471 == null) {
                this.field3447 = 0;
            } else {
                this.field3447 = 2;
            }
        }
        if (arg0 != 16528) {
            field3473 = null;
        }
        field3451++;
    }
}
