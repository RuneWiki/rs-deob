import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class215 extends class86 {

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "Z")
    public static boolean field3316 = false;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3315 = "Choose Option";

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
    public static int[] field3320 = new int[1000];

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Luf;")
    public static class176 field3313;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[I")
    public int[] field3310;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "[I")
    public static int[] field3318;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "[I")
    public int[] field3321;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[I")
    public int[] field3324;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[Lfl;")
    public class248[] field3311;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "[Lfl;")
    public class248[] field3317;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[Lqd;")
    public static class3[] field3312;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[[[B")
    public byte[][][] field3323;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
    public static final int method1431(int arg0) {
        if (arg0 < 97) {
            method1434((byte[]) null, (byte) -31, 1, -36);
        }
        field3322++;
        if ((double) class62.field1003 == 3.0D) {
            return 37;
        } else if ((double) class62.field1003 == 4.0D) {
            return 50;
        } else if ((double) class62.field1003 == 6.0D) {
            return 75;
        } else if ((double) class62.field1003 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    public static final void method1432(int arg0, int arg1) {
        field3314++;
        int var2 = class295.field4631;
        int var3 = class266.field4245;
        if (arg1 != -16543) {
            field3316 = false;
        }
        int var4 = class69.field1100;
        int var5 = class142.field2182;
        int var6 = class25.field373;
        int var7 = (int) class276.field4334 + class208.field3238 & 0x7FF;
        int var8 = (int) class161.field2460;
        if (class85.field1403 / 256 > var8) {
            var8 = class85.field1403 / 256;
        }
        if (class98.field1567[4] && (class160.field2450[4] + 128) > var8) {
            var8 = class160.field2450[4] + 128;
        }
        class212.method1422(var7, arg0, var8, (byte) -60, var8 * 3 + 600, class136.field2117, class224.method1502((byte) -126, class274.field4318, class261.field4058.field4123, class261.field4058.field4176) - 50, class262.field4095);
        if (class266.field4245 == var3 && class295.field4631 == var2 && class69.field1100 == var4 && class25.field373 == var6 && class142.field2182 == var5) {
            class6.field111 = 1;
            return;
        }
        class111.field1754 = 10;
        class123.field1895 = 10;
        class189.field3014 = 10;
        class28.field415 = 10;
        if (class69.field1100 > var4) {
            var4 += class111.field1754 + ((class69.field1100 - var4) * class28.field415 / 1000);
            if (var4 < class69.field1100) {
                class69.field1100 = var4;
            }
        }
        if (var2 < class295.field4631) {
            var2 += (class295.field4631 - var2) * class28.field415 / 1000 + class111.field1754;
            if (class295.field4631 > var2) {
                class295.field4631 = var2;
            }
        }
        if (class295.field4631 < var2) {
            int var9 = var2 - (class111.field1754 + ((var2 - class295.field4631) * class28.field415 / 1000));
            if (var9 > class295.field4631) {
                class295.field4631 = var9;
            }
        }
        if (var3 < class266.field4245) {
            var3 += (class266.field4245 - var3) * class28.field415 / 1000 + class111.field1754;
            if (var3 < class266.field4245) {
                class266.field4245 = var3;
            }
        }
        if (var3 > class266.field4245) {
            int var10 = var3 - ((var3 - class266.field4245) * class28.field415 / 1000 + class111.field1754);
            if (class266.field4245 < var10) {
                class266.field4245 = var10;
            }
        }
        if (class69.field1100 < var4) {
            int var11 = var4 - (class111.field1754 + ((var4 - class69.field1100) * class28.field415 / 1000));
            if (var11 > class69.field1100) {
                class69.field1100 = var11;
            }
        }
        int var12 = class142.field2182 - var5;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (class25.field373 > var6) {
            var6 += (class25.field373 - var6) * class189.field3014 / 1000 + class123.field1895;
            if (var6 < class25.field373) {
                class25.field373 = var6;
            }
        }
        if (var12 > 0) {
            int var13 = class189.field3014 * var12 / 1000 + class123.field1895 + var5;
            var5 = var13 & 0x7FF;
        }
        if (var6 > class25.field373) {
            int var14 = var6 - (class123.field1895 + ((var6 - class25.field373) * class189.field3014 / 1000));
            if (var14 > class25.field373) {
                class25.field373 = var14;
            }
        }
        if (var12 < 0) {
            int var15 = var5 - (-var12 * class189.field3014 / 1000 + class123.field1895);
            var5 = var15 & 0x7FF;
        }
        int var16 = class142.field2182 - var5;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var12 <= 0 || var16 > 0 && var12 < 0) {
            class142.field2182 = var5;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3318 = null;
        field3315 = null;
        field3312 = null;
        field3320 = null;
        if (arg0 != 11492) {
            method1433(-63);
        }
        field3313 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BBII)Z")
    public static final boolean method1434(byte[] arg0, byte arg1, int arg2, int arg3) {
        field3326++;
        boolean var4 = true;
        if (arg1 >= -27) {
            method1431(9);
        }
        class37 var5 = new class37(arg0);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method317(-122);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            boolean var9 = false;
            var6 += var7;
            while (true) {
                while (!var9) {
                    int var11 = var5.method285((byte) 35);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = (var8 & 0xFF2) >> 6;
                    int var14 = var13 + arg2;
                    int var15 = var5.method333((byte) -59) >> 2;
                    int var16 = arg3 + var12;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class73 var17 = class85.method690(2276, var6);
                        if (var15 != 22 || class1.field16 || var17.field1206 != 0 || var17.field1208 == 1 || var17.field1166) {
                            if (!var17.method581(121)) {
                                class244.field3788++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method285((byte) 35);
                if (var10 == 0) {
                    break;
                }
                var5.method333((byte) -59);
            }
        }
    }
}
