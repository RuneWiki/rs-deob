import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class13 {

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public int field1317 = 0;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public int field1313 = -1;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public int field1337 = -1;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Z")
    public boolean field1339 = true;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[[B")
    public static byte[][] field1315 = new byte[1000][];

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Lec;")
    private static class32 field1326 = class73.method594("Prepared sound engine", true);

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Lec;")
    public static class32 field1327 = field1326;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "[Z")
    public static boolean[] field1319 = new boolean[100];

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lec;")
    public static class32 field1318 = class73.method594("gr-Un:", true);

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLqd;)V")
    public static final void method445(boolean arg0, class115 arg1) {
        if (arg0) {
            return;
        }
        field1325++;
        if (arg1.field2695 == 0) {
            return;
        }
        if (arg1.field2758 != -1 && arg1.field2758 < 32768) {
            class111 var2 = class14.field230[arg1.field2758];
            if (var2 != null) {
                int var3 = arg1.field2749 - var2.field2749;
                int var4 = arg1.field2700 - var2.field2700;
                if (var3 != 0 || var4 != 0) {
                    arg1.field2744 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2758 >= 32768) {
            int var5 = arg1.field2758 - 32768;
            if (class37.field892 == var5) {
                var5 = 2047;
            }
            class70 var6 = class52.field1176[var5];
            if (var6 != null) {
                int var7 = arg1.field2700 - var6.field2700;
                int var8 = arg1.field2749 - var6.field2749;
                if (var8 != 0 || var7 != 0) {
                    arg1.field2744 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2743 != 0 || arg1.field2699 != 0) && (arg1.field2698 == 0 || arg1.field2696 > 0)) {
            int var9 = arg1.field2749 - (arg1.field2743 - class72.field1701 - class72.field1701) * 64;
            int var10 = arg1.field2700 - (arg1.field2699 - class118.field2838 - class118.field2838) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2744 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2743 = 0;
            arg1.field2699 = 0;
        }
        int var11 = arg1.field2744 - arg1.field2747 & 0x7FF;
        if (var11 == 0) {
            arg1.field2754 = 0;
            return;
        }
        arg1.field2754++;
        if (var11 <= 1024) {
            arg1.field2747 += arg1.field2695;
            boolean var12 = true;
            if (arg1.field2695 > var11 || 2048 - arg1.field2695 < var11) {
                var12 = false;
                arg1.field2747 = arg1.field2744;
            }
            if (arg1.field2710 == arg1.field2689 && (arg1.field2754 > 25 || var12)) {
                if (arg1.field2718 == -1) {
                    arg1.field2710 = arg1.field2711;
                } else {
                    arg1.field2710 = arg1.field2718;
                }
            }
        } else {
            arg1.field2747 -= arg1.field2695;
            boolean var13 = true;
            if (arg1.field2695 > var11 || var11 > 2048 - arg1.field2695) {
                arg1.field2747 = arg1.field2744;
                var13 = false;
            }
            if (arg1.field2710 == arg1.field2689 && (arg1.field2754 > 25 || var13)) {
                if (arg1.field2746 == -1) {
                    arg1.field2710 = arg1.field2711;
                } else {
                    arg1.field2710 = arg1.field2746;
                }
            }
        }
        arg1.field2747 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljd;III)V")
    private final void method446(class66 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field1317 = arg0.method518((byte) 95);
        } else if (arg1 == 2) {
            this.field1337 = arg0.method533(255);
        } else if (arg1 == 5) {
            this.field1339 = false;
        } else if (arg1 == 7) {
            this.field1313 = arg0.method518((byte) 126);
        }
        if (arg2 != -1) {
            this.method448(-80, null, -37);
        }
        field1338++;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public final void method447(int arg0) {
        if (arg0 < 106) {
            field1322 = -9;
        }
        if (this.field1313 != -1) {
            this.method451(this.field1313, 3998);
            this.field1323 = this.field1331;
            this.field1336 = this.field1333;
            this.field1316 = this.field1334;
        }
        this.method451(this.field1317, 3998);
        field1324++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjd;I)V")
    public final void method448(int arg0, class66 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method533(255);
            if (var4 == 0) {
                if (arg0 != -28563) {
                    return;
                }
                field1329++;
                return;
            }
            this.method446(arg1, var4, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILea;I)Lkd;")
    public static final class73 method449(int arg0, class30 arg1, int arg2) {
        if (arg2 == 0) {
            field1335++;
            byte[] var3 = arg1.method218(-120, arg0);
            return var3 == null ? null : new class73(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method450(byte arg0) {
        field1321++;
        if (class154.field3531 && class43.field990 != class115.field2745) {
            class121.method957(class43.field990, class20.field373.field2738[0], class142.field3253, class62.field1423, (byte) -128, class20.field373.field2761[0]);
            return;
        }
        if (class5.field92 != class43.field990) {
            class5.field92 = class43.field990;
            class2.method7((byte) -123, class43.field990);
        }
        if (arg0 != -66) {
            method453(-95);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
    private final void method451(int arg0, int arg1) {
        field1332++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = 0.0D;
        double var9 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var11 = var9;
        double var13 = var9;
        if (var3 > var9) {
            var13 = var3;
        }
        if (var13 < var5) {
            var13 = var5;
        }
        double var15 = 0.0D;
        if (var3 < var9) {
            var11 = var3;
        }
        if (var11 > var5) {
            var11 = var5;
        }
        double var17 = (var11 + var13) / 2.0D;
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var11) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var11) / (2.0D - var13 - var11);
            }
            if (var9 == var13) {
                var7 = (var3 - var5) / (var13 - var11);
            } else if (var3 == var13) {
                var7 = (var5 - var9) / (var13 - var11) + 2.0D;
            } else if (var5 == var13) {
                var7 = (var9 - var3) / (-var11 + var13) + 4.0D;
            }
        }
        double var19 = var7 / 6.0D;
        this.field1333 = (int) (var19 * 256.0D);
        this.field1334 = (int) (var15 * 256.0D);
        this.field1331 = (int) (var17 * 256.0D);
        if (this.field1334 < 0) {
            this.field1334 = 0;
        } else if (this.field1334 > 255) {
            this.field1334 = 255;
        }
        if (arg1 != 3998) {
            this.field1337 = -104;
        }
        if (this.field1331 < 0) {
            this.field1331 = 0;
        } else if (this.field1331 > 255) {
            this.field1331 = 255;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIB)V")
    public static final void method452(int arg0, int arg1, int arg2, byte arg3) {
        field1314++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class70.field1631[arg2][arg0 + var4][arg1 + var7] = 0;
            }
        }
        if (arg3 <= 34) {
            field1320 = 29;
        }
        if (arg0 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class70.field1631[arg2][arg0][arg1 + var5] = class70.field1631[arg2][arg0 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class70.field1631[arg2][arg0 + var6][arg1] = class70.field1631[arg2][arg0 + var6][arg1 - 1];
            }
        }
        if (arg0 > 0 && class70.field1631[arg2][arg0 - 1][arg1] != 0) {
            class70.field1631[arg2][arg0][arg1] = class70.field1631[arg2][arg0 - 1][arg1];
        } else if (arg1 > 0 && class70.field1631[arg2][arg0][arg1 - 1] != 0) {
            class70.field1631[arg2][arg0][arg1] = class70.field1631[arg2][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && class70.field1631[arg2][arg0 - 1][arg1 - 1] != 0) {
            class70.field1631[arg2][arg0][arg1] = class70.field1631[arg2][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public static void method453(int arg0) {
        if (arg0 > -92) {
            return;
        }
        field1327 = null;
        field1326 = null;
        field1318 = null;
        field1319 = null;
        field1315 = null;
    }
}
