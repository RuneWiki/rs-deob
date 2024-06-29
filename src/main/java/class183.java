import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class183 implements class153 {

    @OriginalMember(owner = "client!an", name = "s", descriptor = "Ljr;")
    private class357 field2408 = new class357(128);

    @OriginalMember(owner = "client!an", name = "g", descriptor = "[I")
    public int[] field2396 = new int[class251.field3196.field1471];

    @OriginalMember(owner = "client!an", name = "j", descriptor = "[I")
    private int[] field2399 = new int[class251.field3196.field1471];

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "F")
    public static float field2409;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "Lhb;")
    public static class250 field2407;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[I")
    public static int[] field2411;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(IB)I")
    public final int method1050(int arg0, byte arg1) {
        if (arg1 != 114) {
            method1211((byte) -73, null);
        }
        field2390++;
        return this.field2396[arg0];
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ldn;Ldn;B)I")
    public static final int method1206(class201 arg0, class201 arg1, byte arg2) {
        field2401++;
        int var3 = 0;
        int var4 = 19 % ((arg2 + 21) / 49);
        if (arg0.method1294(class356.field4575, (byte) -128)) {
            var3++;
        }
        if (arg0.method1294(class419.field5576, (byte) -115)) {
            var3++;
        }
        if (arg0.method1294(class187.field2444, (byte) -113)) {
            var3++;
        }
        if (arg1.method1294(class356.field4575, (byte) -119)) {
            var3++;
        }
        if (arg1.method1294(class419.field5576, (byte) -115)) {
            var3++;
        }
        if (arg1.method1294(class187.field2444, (byte) -115)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field2395++;
        if (arg5 != 90) {
            method1206(null, null, (byte) 72);
        }
        if (arg3 == arg4 && arg7 == arg9 && arg1 == arg6 && arg0 == arg8) {
            class505.method3010((byte) -50, arg8, arg6, arg4, arg9, arg2);
            return;
        }
        int var10 = arg4;
        int var11 = arg9;
        int var12 = arg4 * 3;
        int var13 = arg9 * 3;
        int var14 = arg3 * 3;
        int var15 = arg7 * 3;
        int var16 = arg1 * 3;
        int var17 = arg0 * 3;
        int var18 = arg6 + var14 - arg4 - var16;
        int var19 = arg8 + var15 - arg9 - var17;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 + var13 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var29 + var31 >> 12) + arg4;
            int var34 = (var28 + var30 + var32 >> 12) + arg9;
            class505.method3010((byte) -50, var34, var33, var10, var11, arg2);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public final void method1208(int arg0) {
        int var2 = 0;
        if (arg0 != -16337) {
            this.field2408 = null;
        }
        while (var2 < class251.field3196.field1471) {
            class481 var3 = class251.field3196.method713(var2, 16);
            if (var3 != null && var3.field7011 == 0) {
                this.field2399[var2] = 0;
                this.field2396[var2] = 0;
            }
            var2++;
        }
        field2392++;
        this.field2408 = new class357(128);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V")
    public final void method1209(int arg0, int arg1, int arg2) {
        field2402++;
        class51 var4 = class301.field3898.method1528(false, arg2);
        int var5 = var4.field700;
        int var6 = var4.field698;
        int var7 = var4.field703;
        int var8 = class354.field4536[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        if (arg0 < -117) {
            int var9 = var8 << var6;
            this.method1218(arg1 << var6 & var9 | this.field2399[var5] & ~var9, (byte) -125, var5);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BIIIII)V")
    public static final void method1210(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2394++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = -109 / ((7 - arg0) / 56);
        int var9 = arg1 * arg1;
        int var10 = arg3 * arg3;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg3 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg3 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg3 - 1) * var16;
        if (arg2 >= class418.field5559 && class456.field6365 >= arg2) {
            int var22 = class141.method970(arg1 + arg5, class281.field3589, 1150002076, class65.field827);
            int var23 = class141.method970(arg5 - arg1, class281.field3589, 1150002076, class65.field827);
            method1212(arg4, class333.field4265[arg2], true, var23, var22);
        }
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var20 += var17;
                    var6++;
                    var18 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var20 += var17;
                var18 += var17;
                var6++;
            }
            var14 += -var21;
            var15 += -var19;
            var21 -= var16;
            var19 -= var16;
            var7--;
            int var24 = arg2 - var7;
            int var25 = arg2 + var7;
            if (var25 >= class418.field5559 && class456.field6365 >= var24) {
                int var26 = class141.method970(arg5 + var6, class281.field3589, 1150002076, class65.field827);
                int var27 = class141.method970(arg5 - var6, class281.field3589, 1150002076, class65.field827);
                if (class418.field5559 <= var24) {
                    method1212(arg4, class333.field4265[var24], true, var27, var26);
                }
                if (var25 <= class456.field6365) {
                    method1212(arg4, class333.field4265[var25], true, var27, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)I")
    public final int method1049(int arg0, byte arg1) {
        field2393++;
        class51 var3 = class301.field3898.method1528(false, arg0);
        int var4 = var3.field700;
        int var5 = var3.field698;
        if (arg1 == 72) {
            int var6 = var3.field703;
            int var7 = class354.field4536[var6 - var5];
            return this.field2396[var4] >> var5 & var7;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLum;)Z")
    public static final boolean method1211(byte arg0, class82 arg1) {
        int var2 = 120 % ((arg0 + 59) / 63);
        field2403++;
        return class282.field3603 == arg1 || class524.field7764 == arg1 || class203.field2656 == arg1 || class89.field1237 == arg1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[IZII)V")
    public static final void method1212(int arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        field2404++;
        arg3--;
        int var8 = arg4 - 1;
        int var5 = var8 - 7;
        while (var5 > arg3) {
            int var6 = arg3 + 1;
            arg1[var6] = arg0;
            int var7 = var6 + 1;
            arg1[var7] = arg0;
            int var9 = var7 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg3 = var13 + 1;
            arg1[arg3] = arg0;
        }
        if (!arg2) {
            field2406 = 30;
        }
        while (arg3 < var8) {
            arg3++;
            arg1[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZI)V")
    public final void method1213(int arg0, boolean arg1, int arg2) {
        this.field2396[arg2] = arg0;
        field2397++;
        if (!arg1) {
            this.field2408 = null;
        }
        class365 var4 = (class365) this.field2408.method2085((long) arg2, -5423);
        if (var4 == null) {
            class365 var5 = new class365(class173.method1134(arg1) + 500L);
            this.field2408.method2096((long) arg2, var5, (byte) 76);
        } else {
            var4.field4698 = class173.method1134(arg1) + 500L;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIB)V")
    public final void method1214(int arg0, int arg1, byte arg2) {
        field2400++;
        if (arg2 != 84) {
            return;
        }
        class51 var4 = class301.field3898.method1528(false, arg0);
        int var5 = var4.field700;
        int var6 = var4.field698;
        int var7 = var4.field703;
        int var8 = class354.field4536[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1213(~var9 & this.field2396[var5] | var9 & arg1 << var6, true, var5);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZB)I")
    public final int method1215(boolean arg0, byte arg1) {
        field2398++;
        long var3 = class173.method1134(true);
        int var5 = -115 / ((-arg1 - 88) / 34);
        for (class365 var6 = arg0 ? (class365) this.field2408.method2087(0) : (class365) this.field2408.method2091(-123); var6 != null; var6 = (class365) this.field2408.method2091(-125)) {
            if ((var6.field4698 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var6.field4698 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field7456;
                    this.field2396[var7] = this.field2399[var7];
                    var6.method3021(-110);
                    return var7;
                }
                var6.method3021(43);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1216(boolean arg0, String arg1, int arg2) {
        field2391++;
        if (arg2 != 8) {
            return;
        }
        class114.field1565.field2617 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class89.field1238.field306; var6++) {
            class497 var9 = class89.field1238.method111(var6, -126);
            if ((!arg0 || var9.field7259) && var9.field7291 == -1 && var9.field7286 == -1 && var9.field7325 == 0 && var9.field7262.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class25.field439 = -1;
                    class252.field3200 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class476.field6953 = 0;
        class25.field439 = var5;
        class252.field3200 = var4;
        String[] var7 = new String[class25.field439];
        for (int var8 = 0; var8 < class25.field439; var8++) {
            var7[var8] = class89.field1238.method111(var4[var8], class10.method73(arg2, 96)).field7262;
        }
        class338.method1995(true, var7, class252.field3200);
        class114.field1565.method1319(arg2 ^ 0x43);
        class114.field1565.field2617 = 2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
    public static void method1217(boolean arg0) {
        field2407 = null;
        if (arg0) {
            field2411 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IBI)V")
    public final void method1218(int arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            method1216(false, null, 10);
        }
        field2405++;
        this.field2399[arg2] = arg0;
        class365 var4 = (class365) this.field2408.method2085((long) arg2, -5423);
        if (var4 == null) {
            class365 var5 = new class365(4611686018427387905L);
            this.field2408.method2096((long) arg2, var5, (byte) 76);
        } else if (var4.field4698 != 4611686018427387905L) {
            var4.field4698 = class173.method1134(true) + 500L | 0x4000000000000000L;
        }
    }

    static {
        new class169("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field2409 = 0.0F;
        field2407 = new class250(31, 8);
        field2410 = 0;
        field2411 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    }
}
