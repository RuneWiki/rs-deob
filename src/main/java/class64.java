import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class64 extends class72 {

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
    private int field1412 = 0;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Lae;")
    public static class6 field1396 = method474(115, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "[I")
    public static int[] field1394 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "[J")
    public static long[] field1402 = new long[100];

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "[I")
    public static int[] field1407 = new int[50];

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "Lae;")
    private static class6 field1397 = method474(111, "Public chat");

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field1406 = 127;

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lae;")
    public static class6 field1411 = method474(112, "*6n");

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "Lae;")
    public static class6 field1392 = field1397;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lae;")
    public static class6 field1414 = method474(127, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "Lae;")
    public static class6 field1415 = method474(109, " )2> @yel@");

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Led;")
    public static class31 field1391;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "[I")
    public static int[] field1388;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "[I")
    public static int[] field1403;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lae;ILae;Lbf;)Lq;", line = 18)
    public static final class101 method467(class6 arg0, int arg1, class6 arg2, class14 arg3) {
        field1401++;
        int var4 = arg3.method158(arg0, (byte) 30);
        if (arg1 != -12078) {
            field1402 = null;
        }
        int var5 = arg3.method138(100, var4, arg2);
        return class82.method702(arg3, var5, var4, false);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V", line = 37)
    public static void method468(int arg0) {
        field1396 = null;
        field1415 = null;
        field1388 = null;
        field1414 = null;
        field1392 = null;
        field1394 = null;
        field1391 = null;
        field1397 = null;
        field1402 = null;
        field1411 = null;
        field1403 = null;
        if (arg0 != -25312) {
            field1406 = -98;
        }
        field1407 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V", line = 61)
    private final void method469(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field1410++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        double var13 = var3;
        if (var3 < var5) {
            var13 = var5;
        }
        if (var7 > var13) {
            var13 = var7;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        double var15 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var3 == var13) {
                var11 = (var5 - var7) / (var13 - var9);
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field1389 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1389 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1389 < 1) {
            this.field1389 = 1;
        }
        this.field1408 = (int) (var15 * 256.0D);
        this.field1390 = (int) (var17 * 256.0D);
        double var19 = var11 / 6.0D;
        int var21 = -74 / ((-arg1 - 14) / 52);
        if (this.field1408 < 0) {
            this.field1408 = 0;
        } else if (this.field1408 > 255) {
            this.field1408 = 255;
        }
        if (this.field1390 < 0) {
            this.field1390 = 0;
        } else if (this.field1390 > 255) {
            this.field1390 = 255;
        }
        this.field1409 = (int) ((double) this.field1389 * var19);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lte;Z)Z", line = 150)
    public static final boolean method470(class121 arg0, boolean arg1) {
        field1393++;
        int var2 = arg0.field2953;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class90.field2156++;
            class95.field2243++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 >= 101) {
                var2 -= 101;
            } else {
                var2--;
            }
            class6.method26(0, class40.field892, 0, class85.method731(new class6[] { class42.field959, class41.field924[var2] }, 14569), (byte) -71, 0, 2);
            class6.method26(0, class7.field158, 0, class85.method731(new class6[] { class42.field959, class41.field924[var2] }, 14569), (byte) -90, 0, 10);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class6.method26(0, class40.field892, 0, class85.method731(new class6[] { class42.field959, arg0.field2889 }, 14569), (byte) -48, 0, 50);
            class16.field328++;
            return true;
        } else {
            if (!arg1) {
                field1394 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBLm;)V", line = 195)
    public final void method471(int arg0, byte arg1, class77 arg2) {
        field1405++;
        if (arg1 != 90) {
            field1392 = null;
        }
        while (true) {
            int var4 = arg2.method620((byte) -8);
            if (var4 == 0) {
                return;
            }
            this.method473(arg0, var4, (byte) 35, arg2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V", line = 224)
    public static final void method472(boolean arg0) {
        field1404++;
        class90.field2152.method129(27392);
        if (arg0) {
            field1400 = 72;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBLm;)V", line = 247)
    private final void method473(int arg0, int arg1, byte arg2, class77 arg3) {
        if (arg2 != 35) {
            method472(false);
        }
        field1395++;
        if (arg1 == 1) {
            this.field1412 = arg3.method629((byte) -62);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;)Lae;", line = 263)
    public static final class6 method474(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field1399++;
        int var3 = var2.length;
        class6 var4 = new class6();
        var4.field114 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field114[var4.field93++] = (byte) (var7 + var6 * 43 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field114[var4.field93++] = (byte) var6;
            }
        }
        var4.method46(21);
        if (arg0 < 102) {
            method470(null, false);
        }
        return var4.method28(-126);
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V", line = 336)
    public static final void method475(int arg0) {
        field1398++;
        if (arg0 != 701) {
            return;
        }
        int var1 = class56.field1229.method96(class62.field1365);
        for (int var2 = 0; var2 < class85.field2058; var2++) {
            int var10 = class56.field1229.method105(class57.field1247[var2]);
            if (var10 > var1) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class85.field2058 * 15 + 21;
        if (class52.field1170 > 4 && class116.field2728 > 4 && class52.field1170 < 516 && class116.field2728 < 338) {
            class67.field1473 = 0;
            class69.field1533 = class85.field2058 * 15 + 22;
            class125.field3052 = true;
            class20.field407 = var1;
            int var4 = class52.field1170 - var1 / 2 - 4;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            int var5 = class116.field2728 - 4;
            if (var5 + var3 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            class121.field2935 = var4;
            class65.field1425 = var5;
        }
        if (class52.field1170 > 553 && class116.field2728 > 205 && class52.field1170 < 743 && class116.field2728 < 466) {
            class69.field1533 = class85.field2058 * 15 + 22;
            class67.field1473 = 1;
            class125.field3052 = true;
            int var6 = class52.field1170 - var1 / 2 - 553;
            int var7 = class116.field2728 - 205;
            class20.field407 = var1;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var3 > 261) {
                var7 = 261 - var3;
            }
            class65.field1425 = var7;
            if (var6 < 0) {
                var6 = 0;
            } else if (var1 + var6 > 190) {
                var6 = 190 - var1;
            }
            class121.field2935 = var6;
        }
        if (class52.field1170 <= 17 || class116.field2728 <= 357 || class52.field1170 >= 496 || class116.field2728 >= 453) {
            return;
        }
        class67.field1473 = 2;
        class125.field3052 = true;
        class20.field407 = var1;
        class69.field1533 = class85.field2058 * 15 + 22;
        int var8 = class52.field1170 - var1 / 2 - 17;
        int var9 = class116.field2728 - 357;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class65.field1425 = var9;
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class121.field2935 = var8;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V", line = 463)
    public final void method476(int arg0) {
        this.method469(this.field1412, 91);
        field1413++;
        if (arg0 >= -46) {
            field1415 = null;
        }
    }
}
