import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class127 extends class82 {

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "[[I")
    public int[][] field3110;

    @OriginalMember(owner = "client!va", name = "mb", descriptor = "[I")
    public int[] field3120;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "La;")
    private static class1 field3114 = class113.method934(-11538, "Service unavailable)3");

    @OriginalMember(owner = "client!va", name = "nb", descriptor = "La;")
    public static class1 field3121 = class113.method934(-11538, "cross");

    @OriginalMember(owner = "client!va", name = "lb", descriptor = "Z")
    public static boolean field3119 = false;

    @OriginalMember(owner = "client!va", name = "pb", descriptor = "La;")
    public static class1 field3123 = class113.method934(-11538, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "La;")
    public static class1 field3118 = class113.method934(-11538, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!va", name = "rb", descriptor = "I")
    public static int field3125 = 0;

    @OriginalMember(owner = "client!va", name = "tb", descriptor = "La;")
    public static class1 field3127 = class113.method934(-11538, "Titelbild geladen)3");

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "La;")
    public static class1 field3116 = class113.method934(-11538, "rot:");

    @OriginalMember(owner = "client!va", name = "vb", descriptor = "La;")
    private static class1 field3129 = class113.method934(-11538, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!va", name = "wb", descriptor = "La;")
    public static class1 field3130 = field3129;

    @OriginalMember(owner = "client!va", name = "ub", descriptor = "La;")
    public static class1 field3128 = class113.method934(-11538, " hat sich eingeloggt)3");

    @OriginalMember(owner = "client!va", name = "xb", descriptor = "La;")
    public static class1 field3131 = field3114;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!va", name = "ob", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!va", name = "qb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!va", name = "sb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IIII)Ljd;", line = 15)
    public static final class58 method1010(int arg0, int arg1, int arg2, int arg3) {
        field3124++;
        if (arg3 == 0) {
            class58 var4 = (class58) class8.field254.method264((long) arg2, (byte) 56);
            if (var4 != null && var4.field1480 != arg1 && var4.field1480 != -1) {
                var4.method742(-1);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class115 var5 = class89.method763(arg2, 10);
        if (var5.field2865 == null) {
            arg1 = -1;
        }
        if (arg1 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg1 >= var5.field2868[var7] && var5.field2868[var7] != 0) {
                    var6 = var5.field2865[var7];
                }
            }
            if (var6 != -1) {
                var5 = class89.method763(var6, 10);
            }
        }
        class91 var8 = var5.method957(true, 1, 26910);
        if (var8 == null) {
            return null;
        }
        class58 var9 = null;
        if (var5.field2841 != -1) {
            var9 = method1010(-56, 10, var5.field2846, -1);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class111.field2750;
        int var11 = class111.field2753;
        int var12 = class111.field2752;
        int var13 = class111.field2755;
        int var14 = 16 / ((arg0 - 26) / 57);
        int var15 = class111.field2756;
        int var16 = class111.field2751;
        int var17 = class111.field2754;
        int[] var18 = class27.method368();
        int var19 = class27.field763;
        int var20 = class27.field778;
        class58 var21 = new class58(32, 32);
        class111.method929(var21.field1483, 32, 32);
        class116.field2912 = class27.method363(class116.field2912);
        class111.method916(0, 0, 32, 32, 0);
        int var22 = var5.field2851;
        if (arg3 == -1) {
            var22 = (int) ((double) var22 * 1.5D);
        }
        if (arg3 > 0) {
            var22 = (int) ((double) var22 * 1.04D);
        }
        class27.field777 = false;
        int var23 = class27.field776[var5.field2878] * var22 >> 16;
        int var24 = class27.field779[var5.field2878] * var22 >> 16;
        var8.method769();
        var8.method783(0, var5.field2864, var5.field2861, var5.field2878, var5.field2840, var8.field3138 / 2 + var5.field2844 + var23, var5.field2844 + var24);
        for (int var25 = 31; var25 >= 0; var25--) {
            for (int var32 = 31; var32 >= 0; var32--) {
                if (var21.field1483[var32 * 32 + var25] == 0) {
                    if (var25 > 0 && var21.field1483[var32 * 32 + var25 - 1] > 1) {
                        var21.field1483[var32 * 32 + var25] = 1;
                    } else if (var32 > 0 && var21.field1483[var25 + (var32 - 1) * 32] > 1) {
                        var21.field1483[var32 * 32 + var25] = 1;
                    } else if (var25 < 31 && var21.field1483[var32 * 32 + var25 + 1] > 1) {
                        var21.field1483[var32 * 32 + var25] = 1;
                    } else if (var32 < 31 && var21.field1483[(var32 + 1) * 32 + var25] > 1) {
                        var21.field1483[var32 * 32 + var25] = 1;
                    }
                }
            }
        }
        if (arg3 > 0) {
            for (int var26 = 31; var26 >= 0; var26--) {
                for (int var27 = 31; var27 >= 0; var27--) {
                    if (var21.field1483[var26 + var27 * 32] == 0) {
                        if (var26 > 0 && var21.field1483[var27 * 32 + var26 - 1] == 1) {
                            var21.field1483[var27 * 32 + var26] = arg3;
                        } else if (var27 > 0 && var21.field1483[var26 + (var27 - 1) * 32] == 1) {
                            var21.field1483[var26 + var27 * 32] = arg3;
                        } else if (var26 < 31 && var21.field1483[var26 + var27 * 32 + 1] == 1) {
                            var21.field1483[var26 + var27 * 32] = arg3;
                        } else if (var27 < 31 && var21.field1483[var27 * 32 + var26 + 32] == 1) {
                            var21.field1483[var27 * 32 + var26] = arg3;
                        }
                    }
                }
            }
        } else if (arg3 == 0) {
            for (int var28 = 31; var28 >= 0; var28--) {
                for (int var29 = 31; var29 >= 0; var29--) {
                    if (var21.field1483[var29 * 32 + var28] == 0 && var28 > 0 && var29 > 0 && var21.field1483[var28 + (var29 - 1) * 32 - 1] > 0) {
                        var21.field1483[var29 * 32 + var28] = 3153952;
                    }
                }
            }
        }
        if (var5.field2841 != -1) {
            int var30 = var9.field1480;
            int var31 = var9.field1482;
            var9.field1480 = 32;
            var9.field1482 = 32;
            var9.method554(0, 0);
            var9.field1482 = var31;
            var9.field1480 = var30;
        }
        if (arg3 == 0) {
            class8.field254.method263(-7208, (long) arg2, var21);
        }
        class111.method929(var10, var12, var11);
        class111.method915(var13, var16, var15, var17);
        class27.method363(var18);
        class27.field763 = var19;
        class27.field778 = var20;
        class27.method357();
        class27.field777 = true;
        if (var5.field2829 == 1) {
            var21.field1482 = 33;
        } else {
            var21.field1482 = 32;
        }
        var21.field1480 = arg1;
        return var21;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 274)
    public static void method1011(int arg0) {
        field3130 = null;
        field3123 = null;
        field3121 = null;
        field3128 = null;
        field3127 = null;
        field3118 = null;
        if (arg0 == 0) {
            field3114 = null;
            field3116 = null;
            field3131 = null;
            field3129 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILqd;)Lqd;", line = 293)
    public static final class100 method1012(int arg0, class100 arg1) {
        field3111++;
        int var2;
        if (arg1.field2498 < 0) {
            var2 = arg1.field2457 >> 16;
        } else {
            var2 = arg1.field2498 >> 16;
        }
        if (!class134.method1055(var2, 126)) {
            return null;
        }
        if (arg0 != -1598852880) {
            method1010(44, -123, -88, 35);
        }
        if (arg1.field2547 >= 0) {
            return class117.field2925[var2][arg1.field2547 & 0xFFFF];
        } else {
            class100 var3 = class117.field2925[var2][arg1.field2547 >> 15 & 0xFFFF];
            return var3.field2522[arg1.field2547 & 0x7FFF];
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILe;)V", line = 323)
    public static final void method1013(int arg0, class25 arg1) {
        field3112++;
        int var2 = 0;
        if (arg0 != -4487) {
            method1010(112, -38, -90, -56);
        }
        while (var2 < class102.field2573.length) {
            class102.field2573[var2] = 0;
            var2++;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class102.field2573[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class121.field3028[var15] = (class102.field2573[var15 + 1] + class102.field2573[var15 + 128] + class102.field2573[var15 - 128] + class102.field2573[var15 + -1]) / 4;
                }
            }
            int[] var13 = class102.field2573;
            class102.field2573 = class121.field3028;
            class121.field3028 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field750; var7++) {
            for (int var8 = 0; var8 < arg1.field745; var8++) {
                if (arg1.field749[var6++] != 0) {
                    int var9 = arg1.field751 + var7 + 16;
                    int var10 = var8 + arg1.field752 + 16;
                    int var11 = (var9 << 7) + var10;
                    class102.field2573[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)V", line = 425)
    public static final void method1014(byte arg0, int arg1, int arg2) {
        field3115++;
        class92 var3 = class17.field553[class2.field76][arg2][arg1];
        if (var3 == null) {
            class130.field3186.method82(class2.field76, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class59 var5 = null;
        for (class59 var6 = (class59) var3.method805((byte) -90); var6 != null; var6 = (class59) var3.method812(-4)) {
            class115 var11 = class89.method763(var6.field1502, 10);
            int var12 = var11.field2862;
            if (var11.field2829 == 1) {
                var12 = (var6.field1493 + 1) * var12;
            }
            if (var12 > var4) {
                var4 = var12;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class130.field3186.method82(class2.field76, arg2, arg1);
            return;
        }
        if (arg0 != -80) {
            field3129 = null;
        }
        class59 var7 = null;
        class59 var8 = null;
        var3.method808(0, var5);
        for (class59 var9 = (class59) var3.method805((byte) -90); var9 != null; var9 = (class59) var3.method812(-4)) {
            if (var5.field1502 != var9.field1502) {
                if (var8 == null) {
                    var8 = var9;
                }
                if (var8.field1502 != var9.field1502 && var7 == null) {
                    var7 = var9;
                }
            }
        }
        int var10 = (arg1 << 7) + arg2 + 1610612736;
        class130.field3186.method96(class2.field76, arg2, arg1, class78.method715((byte) -126, class2.field76, arg2 * 128 + 64, arg1 * 128 + 64), var5, var10, var8, var7);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I[B)V", line = 512)
    public class127(int arg0, byte[] arg1) {
        this.field3117 = arg0;
        class8 var3 = new class8(arg1);
        this.field3113 = var3.method145(false);
        this.field3110 = new int[this.field3113][];
        this.field3120 = new int[this.field3113];
        for (int var4 = 0; var4 < this.field3113; var4++) {
            this.field3120[var4] = var3.method145(false);
        }
        for (int var5 = 0; var5 < this.field3113; var5++) {
            this.field3110[var5] = new int[var3.method145(false)];
        }
        for (int var6 = 0; var6 < this.field3113; var6++) {
            for (int var7 = 0; var7 < this.field3110[var6].length; var7++) {
                this.field3110[var6][var7] = var3.method145(false);
            }
        }
    }
}
