import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class265 extends class264 {

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public int field3926 = 0;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public int field3934 = -1;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "J")
    public static long field3923;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "[I")
    public static int[] field3924;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "[I")
    public static int[] field3933;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public int field3917;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "[S")
    public static short[] field3925;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lkp;")
    public static final class10 method1824(int arg0, int arg1) {
        field3931++;
        class363 var2 = class227.field3408;
        class10 var3;
        synchronized (class227.field3408) {
            var3 = (class10) class227.field3408.method2310((byte) -128, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class416.field6020.method715(arg1, (byte) 92, arg0);
        class10 var5 = new class10();
        if (var4 != null) {
            var5.method171(new class256(var4), (byte) -110);
        }
        class363 var6 = class227.field3408;
        synchronized (class227.field3408) {
            class227.field3408.method2299(true, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V")
    public static final void method1825(int arg0, boolean arg1) {
        class138.field1895++;
        field3919++;
        class257.method1773((byte) -10, class275.field4078);
        for (class182 var2 = (class182) class252.field3703.method608((byte) 126); var2 != null; var2 = (class182) class252.field3703.method604(-123)) {
            if (!var2.method1822(-84)) {
                var2 = (class182) class252.field3703.method608((byte) 120);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2562 == 0) {
                class240.method1615(arg1, true, (byte) 127, var2);
            }
        }
        if (arg0 != 64) {
            field3923 = 31L;
        }
        if (class378.field5539 != null) {
            class15.method216((byte) 123, class378.field5539);
            class378.field5539 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILuq;)V")
    public static final void method1826(int arg0, class241 arg1) {
        arg1.field3573 = null;
        field3936++;
        int var2 = arg1.field3578.length;
        if (arg0 != 200) {
            method1824(-41, -97);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field3578[var3].field5759 = false;
        }
        class304[] var4 = class5.field84;
        synchronized (class5.field84) {
            if (class5.field84.length > var2 && class323.field4768[var2] < 200) {
                class5.field84[var2].method2024(10, arg1);
                int var10002 = class323.field4768[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lia;Z)Ljava/lang/String;")
    public static final String method1827(class375 arg0, boolean arg1) {
        field3918++;
        if (!arg1) {
            field3925 = null;
        }
        return arg0.field5477 == null || arg0.field5477.length() <= 0 ? arg0.field5467 : arg0.field5467 + class264.field3913.method2543(!arg1, class153.field2073) + arg0.field5477;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field3933 = null;
        if (arg0 != 1000) {
            field3925 = null;
        }
        field3924 = null;
        field3925 = null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
    public static final void method1829(int arg0, int arg1) {
        field3916++;
        if (arg1 != 1000) {
            field3923 = -101L;
        }
        class443.field6436.method2300(arg0, true);
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
    public static final void method1830(int arg0) {
        field3935++;
        int var1 = class2.field27 * 128 + 64;
        int var2 = class86.field1064 * 128 + 64;
        int var3 = class133.method889(class423.field6117, var1, var2, false) - class385.field5638;
        int var4 = 46 % (arg0 / 39);
        if (class417.field6030 >= 100) {
            class345.field5077 = class86.field1064 * 128 + 64;
            class298.field4343 = class2.field27 * 128 + 64;
            class164.field2171 = class133.method889(class423.field6117, class298.field4343, class345.field5077, false) - class385.field5638;
        } else {
            if (var1 > class298.field4343) {
                class298.field4343 += class296.field4322 + ((var1 - class298.field4343) * class417.field6030 / 1000);
                if (var1 < class298.field4343) {
                    class298.field4343 = var1;
                }
            }
            if (class298.field4343 > var1) {
                class298.field4343 -= (class298.field4343 - var1) * class417.field6030 / 1000 + class296.field4322;
                if (class298.field4343 < var1) {
                    class298.field4343 = var1;
                }
            }
            if (class164.field2171 < var3) {
                class164.field2171 += class296.field4322 + ((var3 - class164.field2171) * class417.field6030 / 1000);
                if (var3 < class164.field2171) {
                    class164.field2171 = var3;
                }
            }
            if (class164.field2171 > var3) {
                class164.field2171 -= class296.field4322 + ((class164.field2171 - var3) * class417.field6030 / 1000);
                if (var3 > class164.field2171) {
                    class164.field2171 = var3;
                }
            }
            if (class345.field5077 < var2) {
                class345.field5077 += class296.field4322 + ((var2 - class345.field5077) * class417.field6030 / 1000);
                if (class345.field5077 > var2) {
                    class345.field5077 = var2;
                }
            }
            if (var2 < class345.field5077) {
                class345.field5077 -= (class345.field5077 - var2) * class417.field6030 / 1000 + class296.field4322;
                if (var2 > class345.field5077) {
                    class345.field5077 = var2;
                }
            }
        }
        int var5 = class32.field444 * 128 + 64;
        int var6 = class93.field1159 * 128 + 64;
        int var7 = class133.method889(class423.field6117, var6, var5, false) - class308.field4554;
        int var8 = var6 - class298.field4343;
        int var9 = var7 - class164.field2171;
        int var10 = var5 - class345.field5077;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 0x3FFF;
        if (var12 < 1024) {
            var12 = 1024;
        }
        if (var12 > 3072) {
            var12 = 3072;
        }
        if (var12 > class103.field1341) {
            class103.field1341 += (var12 - class103.field1341 >> 3) * class359.field5225 / 1000 + class15.field238 << 3;
            if (var12 < class103.field1341) {
                class103.field1341 = var12;
            }
        }
        if (class103.field1341 > var12) {
            class103.field1341 -= class15.field238 + ((class103.field1341 - var12 >> 3) * class359.field5225 / 1000) << 3;
            if (class103.field1341 < var12) {
                class103.field1341 = var12;
            }
        }
        int var14 = var13 - class136.field1867;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (var15 > 0) {
            class136.field1867 += class359.field5225 * var15 / 1000 + class15.field238 << 3;
            class136.field1867 &= 0x3FFF;
        }
        if (var15 < 0) {
            class136.field1867 -= -var15 * class359.field5225 / 1000 + class15.field238 << 3;
            class136.field1867 &= 0x3FFF;
        }
        int var16 = var13 - class136.field1867;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        class86.field1067 = 0;
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            class136.field1867 = var13;
        }
    }

    static {
        new class409("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field3923 = -1L;
        field3930 = 0;
        field3924 = new int[5];
        field3933 = new int[50];
    }
}
