import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class160 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[[I")
    private int[][] field2363;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lus;")
    public static class1 field2362 = new class1(95, 4);

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Z")
    public static boolean field2370 = true;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public static int[] field2368 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lkr;")
    public static class486 field2365 = new class486();

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[I")
    public static int[] field2375 = new int[32];

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Ldk;")
    public static class326 field2376 = new class326(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)I")
    public final int method993(byte arg0, int arg1) {
        if (arg0 != 87) {
            this.method998(41, 58);
        }
        field2366++;
        if (this.field2363 != null) {
            arg1 = (int) ((long) this.field2373 * (long) arg1 / (long) this.field2372);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method994(int arg0, String arg1) {
        field2371++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class237.field3564; var2++) {
            if (arg1.equalsIgnoreCase(class24.field310[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class492.field6935.field6277)) {
            return true;
        } else {
            return arg0 != 6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method995(int arg0) {
        field2364++;
        int var1 = class111.field1417 * 128 + 64;
        int var2 = class418.field5842 * 128 + 64;
        int var3 = class132.method835(var2, class29.field394, var1, 2002) - field2374;
        if (class396.field5646 >= 100) {
            class490.field6904 = class111.field1417 * 128 + 64;
            class343.field4996 = class418.field5842 * 128 + 64;
            class134.field1778 = class132.method835(class343.field4996, class29.field394, class490.field6904, 2002) - field2374;
        } else {
            if (var1 > class490.field6904) {
                class490.field6904 += (var1 - class490.field6904) * class396.field5646 / 1000 + class412.field5806;
                if (var1 < class490.field6904) {
                    class490.field6904 = var1;
                }
            }
            if (var3 > class134.field1778) {
                class134.field1778 += (var3 - class134.field1778) * class396.field5646 / 1000 + class412.field5806;
                if (class134.field1778 > var3) {
                    class134.field1778 = var3;
                }
            }
            if (var1 < class490.field6904) {
                class490.field6904 -= (class490.field6904 - var1) * class396.field5646 / 1000 + class412.field5806;
                if (class490.field6904 < var1) {
                    class490.field6904 = var1;
                }
            }
            if (class343.field4996 < var2) {
                class343.field4996 += (var2 - class343.field4996) * class396.field5646 / 1000 + class412.field5806;
                if (var2 < class343.field4996) {
                    class343.field4996 = var2;
                }
            }
            if (var3 < class134.field1778) {
                class134.field1778 -= (class134.field1778 - var3) * class396.field5646 / 1000 + class412.field5806;
                if (class134.field1778 < var3) {
                    class134.field1778 = var3;
                }
            }
            if (var2 < class343.field4996) {
                class343.field4996 -= (class343.field4996 - var2) * class396.field5646 / 1000 + class412.field5806;
                if (class343.field4996 < var2) {
                    class343.field4996 = var2;
                }
            }
        }
        int var4 = class39.field512 * 128 + 64;
        int var5 = class115.field1469 * 128 + 64;
        int var6 = class132.method835(var4, class29.field394, var5, arg0 ^ 0x43A) - class68.field858;
        int var7 = var5 - class490.field6904;
        int var8 = var6 - class134.field1778;
        int var9 = var4 - class343.field4996;
        if (arg0 != 1000) {
            field2375 = null;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class214.field3219 < var11) {
            class214.field3219 += (var11 - class214.field3219 >> 3) * class262.field3839 / 1000 + class311.field4399 << 3;
            if (class214.field3219 > var11) {
                class214.field3219 = var11;
            }
        }
        if (class214.field3219 > var11) {
            class214.field3219 -= (class214.field3219 - var11 >> 3) * class262.field3839 / 1000 + class311.field4399 << 3;
            if (var11 > class214.field3219) {
                class214.field3219 = var11;
            }
        }
        int var13 = var12 - class30.field407;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class30.field407 += class262.field3839 * var14 / 1000 + class311.field4399 << 3;
            class30.field407 &= 0x3FFF;
        }
        if (var14 < 0) {
            class30.field407 -= -var14 * class262.field3839 / 1000 + class311.field4399 << 3;
            class30.field407 &= 0x3FFF;
        }
        int var15 = var12 - class30.field407;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class140.field1861 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class30.field407 = var12;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static void method996(int arg0) {
        field2368 = null;
        field2362 = null;
        field2376 = null;
        if (arg0 > -97) {
            field2370 = false;
        }
        field2375 = null;
        field2365 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[B)[B")
    public final byte[] method997(byte arg0, byte[] arg1) {
        if (this.field2363 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2373 / (long) this.field2372) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2363[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2373 + var6;
                int var14 = var13 / this.field2372;
                var6 = var13 - this.field2372 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field2369++;
        return arg0 >= -90 ? null : arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
    public final int method998(int arg0, int arg1) {
        if (this.field2363 != null) {
            arg0 = (int) ((long) this.field2373 * (long) arg0 / (long) this.field2372) + 6;
        }
        if (arg1 != -1025) {
            field2370 = true;
        }
        field2367++;
        return arg0;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
    public class160(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class226.method1451(arg0, arg1, (byte) 127);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2372 = var4;
            this.field2373 = var5;
            this.field2363 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2363[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
