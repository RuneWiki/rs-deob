import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class185 extends class46 {

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field3390 = -1;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "[Lmb;")
    public class132[] field3392 = new class132[5];

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    private int field3391 = 128;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "S")
    public short field3402 = 0;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Z")
    public boolean field3407 = true;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Z")
    public boolean field3395 = true;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public int field3399 = -1;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    private int field3405 = 0;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public int field3404 = -1;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public int field3401 = -1;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public int field3408 = -1;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "Z")
    public boolean field3414 = true;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "S")
    public short field3411 = 0;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public int field3417 = 32;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    public int field3425 = -1;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lmb;")
    public class132 field3420 = class128.field2376;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public int field3400 = -1;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public int field3398 = -1;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    private int field3421 = -1;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    private int field3429 = 0;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public int field3430 = -1;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    private int field3428 = 128;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public int field3422 = 1;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    private int field3418 = -1;

    @OriginalMember(owner = "client!ra", name = "vb", descriptor = "Z")
    public boolean field3437 = false;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "[[B")
    public static byte[][] field3397 = new byte[50][];

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lmb;")
    public static class132 field3427 = class166.method1092("Hidden)2use", 126);

    @OriginalMember(owner = "client!ra", name = "tb", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "Lpa;")
    public static class164 field3424 = new class164(0, 0);

    @OriginalMember(owner = "client!ra", name = "wb", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ra", name = "ub", descriptor = "[B")
    private byte[] field3436;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "[I")
    public int[] field3394;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "[I")
    private int[] field3409;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "[I")
    private int[] field3415;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "[S")
    private short[] field3393;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "[S")
    private short[] field3396;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "[S")
    private short[] field3406;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "[S")
    private short[] field3413;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Z")
    public final boolean method1181(int arg0) {
        field3426++;
        if (this.field3394 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field3418 != -1) {
            var2 = class96.method592((byte) -107, this.field3418);
        } else if (this.field3421 != -1) {
            var2 = class77.field1315[this.field3421];
        }
        if (var2 < 0 || var2 >= this.field3394.length || this.field3394[var2] == -1) {
            return false;
        } else {
            if (arg0 <= 99) {
                field3435 = 92;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILwb;BILwb;)Lug;")
    public final class221 method1182(int arg0, class236 arg1, byte arg2, int arg3, class236 arg4) {
        field3410++;
        if (this.field3394 != null) {
            class185 var6 = this.method1188(24);
            return var6 == null ? null : var6.method1182(arg0, arg1, (byte) 49, arg3, arg4);
        }
        class221 var7 = (class221) class180.field3301.method1138((long) this.field3431, (byte) 99);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field3409.length; var9++) {
                if (!class174.field3249.method1091(-123, 0, this.field3409[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class76[] var10 = new class76[this.field3409.length];
            for (int var11 = 0; var11 < this.field3409.length; var11++) {
                var10[var11] = class76.method466(class174.field3249, this.field3409[var11], 0);
            }
            class76 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class76(var10, var10.length);
            }
            if (this.field3413 != null) {
                for (int var13 = 0; var13 < this.field3413.length; var13++) {
                    if (this.field3436 == null || var13 >= this.field3436.length) {
                        var12.method465(this.field3413[var13], this.field3393[var13]);
                    } else {
                        var12.method465(this.field3413[var13], class145.field2703[this.field3436[var13] & 0xFF]);
                    }
                }
            }
            if (this.field3396 != null) {
                for (int var14 = 0; var14 < this.field3396.length; var14++) {
                    var12.method453(this.field3396[var14], this.field3406[var14]);
                }
            }
            var7 = var12.method471(this.field3429 + 64, 850 - -this.field3405, -30, -50, -30);
            class180.field3301.method1135((long) this.field3431, var7, true);
        }
        class221 var15;
        if (arg1 != null && arg4 != null) {
            var15 = arg1.method1495(arg3, var7, arg4, (byte) 125, arg0);
        } else if (arg1 != null) {
            var15 = arg1.method1493(var7, arg3, (byte) -120);
        } else if (arg4 == null) {
            var15 = var7.method1378(true);
        } else {
            var15 = arg4.method1493(var7, arg0, (byte) -120);
        }
        if (arg2 != 49) {
            this.method1188(-99);
        }
        if (this.field3428 != 128 || this.field3391 != 128) {
            var15.method1383(this.field3428, this.field3391, this.field3428);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static void method1183(int arg0) {
        field3397 = null;
        field3427 = null;
        field3424 = null;
        int var1 = -11 / ((arg0 - 53) / 50);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lpb;Lpb;Lpb;BLpb;)V")
    public static final void method1184(class165 arg0, class165 arg1, class165 arg2, byte arg3, class165 arg4) {
        field3403++;
        class33.field521 = arg4;
        class194.field3613 = arg1;
        class134.field2524 = arg0;
        if (arg3 < 73) {
            method1183(-62);
        }
        class106.field1983 = arg2;
        class97.field1866 = new class96[class134.field2524.method1084(75)][];
        class208.field3796 = new boolean[class134.field2524.method1084(18)];
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILwb;)Lug;")
    public final class221 method1185(int arg0, int arg1, class236 arg2) {
        field3433++;
        if (this.field3394 != null) {
            class185 var4 = this.method1188(108);
            return var4 == null ? null : var4.method1185(arg0, 3741, arg2);
        }
        if (arg1 != 3741) {
            this.field3408 = 16;
        }
        if (this.field3415 == null) {
            return null;
        }
        class221 var5 = (class221) class92.field1627.method1138((long) this.field3431, (byte) 114);
        if (var5 == null) {
            boolean var6 = false;
            for (int var7 = 0; var7 < this.field3415.length; var7++) {
                if (!class174.field3249.method1091(-124, 0, this.field3415[var7])) {
                    var6 = true;
                }
            }
            if (var6) {
                return null;
            }
            class76[] var8 = new class76[this.field3415.length];
            for (int var9 = 0; var9 < this.field3415.length; var9++) {
                var8[var9] = class76.method466(class174.field3249, this.field3415[var9], 0);
            }
            class76 var10;
            if (var8.length == 1) {
                var10 = var8[0];
            } else {
                var10 = new class76(var8, var8.length);
            }
            if (this.field3413 != null) {
                for (int var11 = 0; var11 < this.field3413.length; var11++) {
                    if (this.field3436 == null || this.field3436.length <= var11) {
                        var10.method465(this.field3413[var11], this.field3393[var11]);
                    } else {
                        var10.method465(this.field3413[var11], class145.field2703[this.field3436[var11] & 0xFF]);
                    }
                }
            }
            if (this.field3396 != null) {
                for (int var12 = 0; var12 < this.field3396.length; var12++) {
                    var10.method453(this.field3396[var12], this.field3406[var12]);
                }
            }
            var5 = var10.method471(64, 768, -50, -10, -50);
            class92.field1627.method1135((long) this.field3431, var5, true);
        }
        if (arg2 != null) {
            var5 = arg2.method1502(var5, arg1 - 3683, arg0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public final void method1186(int arg0) {
        field3419++;
        if (arg0 != -102) {
            this.method1188(127);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lpb;I)V")
    public static final void method1187(class165 arg0, int arg1) {
        field3434++;
        if (arg1 != -1104) {
            method1184(null, null, null, (byte) -5, null);
        }
        class110.field2069 = arg0;
        class72.field1207 = class110.field2069.method1068(4, 0);
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)Lra;")
    public final class185 method1188(int arg0) {
        field3432++;
        int var2 = -1;
        if (this.field3418 != -1) {
            var2 = class96.method592((byte) -107, this.field3418);
        } else if (this.field3421 != -1) {
            var2 = class77.field1315[this.field3421];
        }
        if (var2 < 0 || this.field3394.length <= var2 || this.field3394[var2] == -1) {
            return null;
        } else {
            if (arg0 <= 4) {
                this.field3391 = -98;
            }
            return class189.method1209((byte) 113, this.field3394[var2]);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lkd;II)V")
    private final void method1189(class112 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var14 = arg0.method716(-1308);
            this.field3409 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3409[var15] = arg0.method739(-123);
            }
        } else if (arg2 == 2) {
            this.field3420 = arg0.method720((byte) 101);
        } else if (arg2 == 12) {
            this.field3422 = arg0.method716(-1308);
        } else if (arg2 == 13) {
            this.field3399 = arg0.method739(53);
        } else if (arg2 == 14) {
            this.field3400 = arg0.method739(37);
        } else if (arg2 == 15) {
            this.field3425 = arg0.method739(-128);
        } else if (arg2 == 16) {
            this.field3401 = arg0.method739(109);
        } else if (arg2 == 17) {
            this.field3400 = arg0.method739(-124);
            this.field3390 = arg0.method739(-123);
            this.field3398 = arg0.method739(-126);
            this.field3430 = arg0.method739(-123);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field3392[arg2 - 30] = arg0.method720((byte) 24);
            if (this.field3392[arg2 - 30].method882(24493, class115.field2195)) {
                this.field3392[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var4 = arg0.method716(-1308);
            this.field3393 = new short[var4];
            this.field3413 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3413[var5] = (short) arg0.method739(111);
                this.field3393[var5] = (short) arg0.method739(-124);
            }
        } else if (arg2 == 41) {
            int var12 = arg0.method716(-1308);
            this.field3406 = new short[var12];
            this.field3396 = new short[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3396[var13] = (short) arg0.method739(-126);
                this.field3406[var13] = (short) arg0.method739(66);
            }
        } else if (arg2 == 42) {
            int var6 = arg0.method716(-1308);
            this.field3436 = new byte[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3436[var7] = arg0.method734(true);
            }
        } else if (arg2 == 60) {
            int var8 = arg0.method716(-1308);
            this.field3415 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3415[var9] = arg0.method739(1);
            }
        } else if (arg2 == 93) {
            this.field3395 = false;
        } else if (arg2 == 95) {
            this.field3404 = arg0.method739(73);
        } else if (arg2 == 97) {
            this.field3428 = arg0.method739(-123);
        } else if (arg2 == 98) {
            this.field3391 = arg0.method739(106);
        } else if (arg2 == 99) {
            this.field3437 = true;
        } else if (arg2 == 100) {
            this.field3429 = arg0.method734(true);
        } else if (arg2 == 101) {
            this.field3405 = arg0.method734(true) * 5;
        } else if (arg2 == 102) {
            this.field3408 = arg0.method739(-126);
        } else if (arg2 == 103) {
            this.field3417 = arg0.method739(-11);
        } else if (arg2 == 106) {
            this.field3418 = arg0.method739(96);
            if (this.field3418 == 65535) {
                this.field3418 = -1;
            }
            this.field3421 = arg0.method739(-123);
            if (this.field3421 == 65535) {
                this.field3421 = -1;
            }
            int var10 = arg0.method716(-1308);
            this.field3394 = new int[var10 + 1];
            for (int var11 = 0; var11 <= var10; var11++) {
                this.field3394[var11] = arg0.method739(-128);
                if (this.field3394[var11] == 65535) {
                    this.field3394[var11] = -1;
                }
            }
        } else if (arg2 == 107) {
            this.field3414 = false;
        } else if (arg2 == 109) {
            this.field3407 = false;
        } else if (arg2 != 111) {
            if (arg2 == 113) {
                arg0.method739(-127);
                arg0.method739(-26);
            } else if (arg2 == 114) {
                arg0.method734(true);
                arg0.method734(true);
            } else if (arg2 == 115) {
                this.field3402 = (short) (arg0.method716(-1308) * 4);
                this.field3411 = (short) (arg0.method716(-1308) * 4);
            }
        }
        field3412++;
        int var16 = -78 % ((50 - arg1) / 52);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lkd;I)V")
    public final void method1190(class112 arg0, int arg1) {
        field3416++;
        while (true) {
            int var3 = arg0.method716(-1308);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.field3418 = -83;
                    return;
                }
            }
            this.method1189(arg0, 123, var3);
        }
    }
}
