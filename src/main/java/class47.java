import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class47 extends class171 {

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "[I")
    public static int[] field682 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
    public static int[] field687 = new int[256];

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Ljava/lang/String;")
    public static String field691 = "Loaded wordpack";

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Lse;")
    public static class211 field690 = null;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Ljava/lang/String;")
    public static String field692 = "Loading world list data";

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIII)V")
    public static final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field693++;
        if (arg4 == arg5) {
            class215.method1401(arg2, arg3, arg0, -11687, arg5);
            return;
        }
        int var6 = 115 % ((33 - arg1) / 37);
        if (class93.field1294 <= arg3 - arg5 && class296.field4668 >= arg3 + arg5 && arg2 - arg4 >= class273.field4228 && class127.field1782 >= arg2 + arg4) {
            class145.method973(arg2, arg4, arg0, arg3, -2001417599, arg5);
        } else {
            class246.method1657(arg4, arg0, arg5, arg3, arg2, 111);
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public static void method307(int arg0) {
        field682 = null;
        field691 = null;
        field692 = null;
        field687 = null;
        field690 = null;
        if (arg0 != 65535) {
            field682 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILde;I)V")
    public static final void method308(int arg0, int arg1, int arg2, class111 arg3, int arg4) {
        field686++;
        if (arg1 != 27260) {
            field687 = null;
        }
        for (class71 var5 = (class71) class34.field524.method990(-124); var5 != null; var5 = (class71) class34.field524.method993(arg1 - 27305)) {
            if (var5.field988 == arg0 && (arg2 * 128) == var5.field980 && arg4 * 128 == var5.field970 && var5.field986.field1579 == arg3.field1579) {
                if (var5.field989 != null) {
                    class21.field298.method360(var5.field989);
                    var5.field989 = null;
                }
                if (var5.field992 != null) {
                    class21.field298.method360(var5.field992);
                    var5.field992 = null;
                }
                var5.method1115(-125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static final void method309(byte arg0) {
        field684++;
        if (arg0 <= 99) {
            return;
        }
        for (int var1 = 0; var1 < class242.field3711; var1++) {
            int var2 = class63.field870[var1];
            class140 var3 = class119.field1679[var2];
            int var4 = class233.field3518.method1453((byte) -127);
            if ((var4 & 0x2) != 0) {
                var4 += class233.field3518.method1453((byte) -128) << 8;
            }
            if ((var4 & 0x200) != 0) {
                var3.field4026 = class233.field3518.method1465(-1691509480);
                var3.field4060 = class233.field3518.method1445(false);
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class233.field3518.method1453((byte) -128);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class233.field3518.method1445(false);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class233.field3518.method1460(2095725128);
                    var8[var9] = class233.field3518.method1465(-1691509480);
                }
                class172.method1128(var3, 3354, var7, var8, var6);
            }
            if ((var4 & 0x1) != 0) {
                int var11 = class233.field3518.method1492(2971768);
                int var12 = class233.field3518.method1453((byte) -128);
                var3.method1739(var12, class52.field740, var11, (byte) -70);
                var3.field4086 = class52.field740 + 300;
                var3.field4035 = class233.field3518.method1492(2971768);
            }
            if ((var4 & 0x40) != 0) {
                var3.field4014 = class233.field3518.method1445(false);
                if (var3.field4014 == 65535) {
                    var3.field4014 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field1946.method1904((byte) 49)) {
                    class88.method559(var3, -1);
                }
                var3.method946(class270.method1783((byte) 74, class233.field3518.method1442(255)), -1);
                var3.method1744(var3.field1946.field4431, (byte) 52);
                var3.field4025 = var3.field1946.field4442;
                var3.field3991 = var3.field1946.field4401;
                if (var3.field1946.method1904((byte) 49)) {
                    class253.method1692(var3, 0, 128, var3.field4076[0], class295.field4642, var3.field4032[0], (class88) null, (class111) null);
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field4049 = class233.field3518.method1455(-59);
                var3.field3988 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var13 = class233.field3518.method1442(255);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class233.field3518.method1483((byte) 46);
                boolean var15 = true;
                if (var13 != -1 && var3.field4046 != -1 && class132.method905(true, class82.method512(var13, (byte) 111).field2638).field3671 < class132.method905(true, class82.method512(var3.field4046, (byte) 113).field2638).field3671) {
                    var15 = false;
                }
                if (var15) {
                    var3.field4041 = (var14 & 0xFFFF) + class52.field740;
                    var3.field4077 = 0;
                    var3.field4047 = var14 >> 16;
                    var3.field4046 = var13;
                    if (class52.field740 < var3.field4041) {
                        var3.field4077 = -1;
                    }
                    var3.field4062 = 1;
                    var3.field4061 = 0;
                    if (var3.field4046 != -1 && class52.field740 == var3.field4041) {
                        int var16 = class82.method512(var3.field4046, (byte) 86).field2638;
                        if (var16 != -1) {
                            class240 var17 = class132.method905(true, var16);
                            if (var17 != null && var17.field3665 != null) {
                                class116.method781(var3.field4085, 236, var3.field4019, false, 0, var17);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                int var18 = class233.field3518.method1445(false);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class233.field3518.method1495((byte) -58);
                class93.method605(var3, var18, var19, (byte) -118);
            }
            if ((var4 & 0x20) != 0) {
                int var20 = class233.field3518.method1492(2971768);
                int var21 = class233.field3518.method1460(2095725128);
                var3.method1739(var21, class52.field740, var20, (byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method310(int arg0, byte arg1, Random arg2) {
        field683++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class29.method186(arg0, 1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else if (arg1 >= -23) {
            return 24;
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class219.method1413(var4, (byte) -70, arg0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public static final void method311(int arg0) {
        field685++;
        class208.field2953.method544(false);
        if (arg0 != 63) {
            field692 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
    public static final void method312(boolean arg0, int arg1) {
        field688++;
        for (class71 var2 = (class71) class34.field524.method990(-116); var2 != null; var2 = (class71) class34.field524.method993(arg1 ^ 0xFFFFEAEE)) {
            if (var2.field989 != null) {
                class21.field298.method360(var2.field989);
                var2.field989 = null;
            }
            if (var2.field992 != null) {
                class21.field298.method360(var2.field992);
                var2.field992 = null;
            }
            var2.method1115(114);
        }
        if (arg1 != 5470) {
            field682 = null;
        }
        if (!arg0) {
            return;
        }
        for (class71 var3 = (class71) class235.field3541.method990(arg1 ^ 0xFFFFEAED); var3 != null; var3 = (class71) class235.field3541.method993(-85)) {
            if (var3.field989 != null) {
                class21.field298.method360(var3.field989);
                var3.field989 = null;
            }
            var3.method1115(7);
        }
        for (class71 var4 = (class71) class95.field1343.method21((byte) 67); var4 != null; var4 = (class71) class95.field1343.method22(true)) {
            if (var4.field989 != null) {
                class21.field298.method360(var4.field989);
                var4.field989 = null;
            }
            var4.method1115(arg1 ^ 0x150D);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class47() {
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
    public class47(int arg0) {
        this.field689 = arg0;
    }
}
