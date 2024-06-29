import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class134 {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[[I")
    private int[][] field2389;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lbd;")
    public static class162 field2388 = class17.method142(0, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2393 = -1;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lqb;")
    public static class209 field2398 = new class209(30);

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lbd;")
    public static class162 field2399 = class17.method142(0, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BB)[B", line = 22)
    public final byte[] method1054(byte[] arg0, byte arg1) {
        if (arg1 != 39) {
            return (byte[]) null;
        }
        if (this.field2389 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2387 / (long) this.field2392) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field2389[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var4 + var10] += var9[var10] * var8;
                }
                int var11 = this.field2387 + var5;
                int var12 = var11 / this.field2392;
                var4 += var12;
                var5 = var11 - this.field2392 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        field2395++;
        return arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)I", line = 90)
    public final int method1055(int arg0, byte arg1) {
        field2390++;
        if (arg1 != 68) {
            this.method1061(45, -50);
        }
        if (this.field2389 != null) {
            arg0 = (int) ((long) this.field2387 * (long) arg0 / (long) this.field2392) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I", line = 106)
    public static final int method1056(byte arg0, int arg1) {
        field2385++;
        int var2 = arg1 & 0x3F;
        if (arg0 < 2) {
            return 108;
        }
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V", line = 166)
    public class134(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class242.method1715(arg0, arg1, (byte) -127);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2392 = var4;
            this.field2387 = var5;
            this.field2389 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2389[var6];
                double var8 = (double) var5 / (double) var4;
                double var10 = (double) var6 / (double) var4 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBZI)I", line = 228)
    public static final int method1057(int arg0, byte arg1, boolean arg2, int arg3) {
        field2391++;
        class101 var4 = (class101) class40.field651.method1672((long) arg3, 19760);
        if (var4 == null) {
            return 0;
        }
        if (arg1 < 21) {
            method1058(-66, false, 26, (byte) -71, 4, -63, true);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field1847.length; var6++) {
            if (var4.field1847[var6] >= 0 && class173.field2988 > var4.field1847[var6]) {
                class116 var7 = class304.method2075(var4.field1847[var6], 4);
                if (var7.field2081 != null) {
                    class188 var8 = (class188) var7.field2081.method1672((long) arg0, 19760);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field1849[var6] * var8.field3237;
                        } else {
                            var5 += var8.field3237;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZIBIIZ)V", line = 277)
    public static final void method1058(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field2386++;
        if (arg3 != -122) {
            field2399 = (class162) null;
        }
        if (arg1) {
            class117.method952();
        }
        if (class168.field2950 != null && (arg4 != 3 || class204.field3452 != arg0 || class138.field2465 != arg5)) {
            class59.method411(client.field1903, class168.field2950, (byte) -127);
            class168.field2950 = null;
        }
        if (arg4 == 3 && class168.field2950 == null) {
            class168.field2950 = class156.method1218(0, client.field1903, arg5, (byte) -23, 0, arg0);
            if (class168.field2950 != null) {
                class204.field3452 = arg0;
                class138.field2465 = arg5;
                class27.method217(client.field1903, (byte) 85);
            }
        }
        if (arg4 == 3 && class168.field2950 == null) {
            method1058(-1, true, arg2, (byte) -122, class258.field4296, -1, true);
            return;
        }
        Container var7;
        if (class168.field2950 != null) {
            var7 = class168.field2950;
        } else if (class95.field1740 == null) {
            var7 = client.field1903.field469;
        } else {
            var7 = class95.field1740;
        }
        class194.field3273 = var7.getSize().width;
        class212.field3562 = var7.getSize().height;
        if (class95.field1740 == var7) {
            Insets var8 = class95.field1740.getInsets();
            class194.field3273 -= var8.right + var8.left;
            class212.field3562 -= var8.top + var8.bottom;
        }
        if (arg4 >= 2) {
            class252.field4205 = class212.field3562;
            class110.field1999 = 0;
            class251.field4201 = class194.field3273;
            class173.field3003 = 0;
        } else {
            class252.field4205 = 503;
            class251.field4201 = 765;
            class110.field1999 = 0;
            class173.field3003 = (class194.field3273 - 765) / 2;
        }
        if (arg6) {
            class138.method1079((byte) -37, class308.field5173);
            class9.method58((byte) -121, class308.field5173);
            if (class264.field4406 != null) {
                class264.field4406.method199((byte) 115, class308.field5173);
            }
            class135.field2414.method1908(50);
            class91.method689(class308.field5173, (byte) 17);
            class288.method2001((byte) -85, class308.field5173);
            if (class264.field4406 != null) {
                class264.field4406.method200(class308.field5173, 0);
            }
        } else {
            if (class117.field2159) {
                class117.method933(class251.field4201, class252.field4205);
            }
            class308.field5173.setSize(class251.field4201, class252.field4205);
            if (class95.field1740 == var7) {
                Insets var9 = class95.field1740.getInsets();
                class308.field5173.setLocation(class173.field3003 + var9.left, var9.top - -class110.field1999);
            } else {
                class308.field5173.setLocation(class173.field3003, class110.field1999);
            }
        }
        if (arg4 == 0 && arg2 > 0) {
            class117.method964(class308.field5173);
        }
        if (arg1 && arg4 > 0) {
            class308.field5173.setIgnoreRepaint(true);
            if (!class260.field4345) {
                class308.method2091();
                class139.field2484 = null;
                class139.field2484 = class111.method894(class308.field5173, -9970, class251.field4201, class252.field4205);
                class316.method2171();
                if (class262.field4380 == 5) {
                    class291.method2016(true, (byte) 119, class207.field3507);
                } else {
                    class94.method706(class235.field3934, arg3 ^ 0xFFFFFFA1, false);
                }
                try {
                    Graphics var10 = class308.field5173.getGraphics();
                    class139.field2484.method10((byte) 95, var10, 0, 0);
                } catch (Exception var14) {
                }
                class240.method1702(0);
                if (arg2 == 0) {
                    class139.field2484 = class111.method894(class308.field5173, -9970, 765, 503);
                } else {
                    class139.field2484 = null;
                }
                class166 var12 = client.field1903.method238(arg3 + 106, class135.field2414.getClass());
                while (var12.field2934 == 0) {
                    class177.method1342(100L, 1);
                }
                if (var12.field2934 == 1) {
                    class260.field4345 = true;
                }
            }
            if (class260.field4345) {
                class117.method945(class308.field5173, class112.field2031 * 2);
            }
        }
        if (!class117.field2159 && arg4 > 0) {
            method1058(-1, true, arg2, (byte) -122, 0, -1, true);
            return;
        }
        if (arg4 > 0 && arg2 == 0) {
            class288.field4853.setPriority(5);
            class139.field2484 = null;
            class11.method72();
            ((class17) class312.field5271).method151(true, 200);
            if (class92.field1634) {
                class312.method2130(0.7F);
            }
        } else if (arg4 == 0 && arg2 > 0) {
            class288.field4853.setPriority(1);
            class139.field2484 = class111.method894(class308.field5173, -9970, 765, 503);
            class11.method63();
            ((class17) class312.field5271).method151(true, 20);
            if (class92.field1634) {
                if (class39.field639 == 1) {
                    class312.method2130(0.9F);
                }
                if (class39.field639 == 2) {
                    class312.method2130(0.8F);
                }
                if (class39.field639 == 3) {
                    class312.method2130(0.7F);
                }
                if (class39.field639 == 4) {
                    class312.method2130(0.6F);
                }
            }
            class26.method212();
        }
        if (arg1) {
            class25.method202(25);
        }
        if (arg4 >= 2) {
            class158.field2778 = true;
        } else {
            class158.field2778 = false;
        }
        if (class265.field4412 != -1) {
            class162.method1284(true, -123);
        }
        if (class116.field2054 != null && (class262.field4380 == 30 || class262.field4380 == 25)) {
            class47.method353(arg3 ^ 0xFFFFFFD4);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class73.field1159[var13] = true;
        }
        class238.field3958 = true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V", line = 509)
    public static final void method1059(int arg0, int arg1, int arg2) {
        field2394++;
        class18 var3 = class212.field3557[class157.field2765][arg2][arg1];
        if (var3 == null) {
            class67.method477(class157.field2765, arg2, arg1);
            return;
        }
        class40 var4 = (class40) var3.method169(-124);
        class40 var5 = null;
        int var6 = -99999999;
        if (arg0 != 2747) {
            return;
        }
        while (var4 != null) {
            class116 var7 = class304.method2075(var4.field653.field892, 4);
            int var8 = var7.field2062;
            if (var7.field2082 == 1) {
                var8 = (var4.field653.field891 + 1) * var8;
            }
            if (var6 < var8) {
                var5 = var4;
                var6 = var8;
            }
            var4 = (class40) var3.method165((byte) -101);
        }
        if (var5 == null) {
            class67.method477(class157.field2765, arg2, arg1);
            return;
        }
        var3.method163((byte) 77, var5);
        class40 var9 = (class40) var3.method169(-120);
        class57 var10 = null;
        class57 var11 = null;
        while (var9 != null) {
            class57 var12 = var9.field653;
            if (var5.field653.field892 != var12.field892) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field892 != var12.field892 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class40) var3.method165((byte) -101);
        }
        long var13 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class60.method413(class157.field2765, arg2, arg1, class3.method15(arg2 * 128 + 64, class157.field2765, arg1 * 128 + 64, false), var5.field653, var13, var10, var11);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 593)
    public static void method1060(byte arg0) {
        field2388 = null;
        field2399 = null;
        if (arg0 < 123) {
            field2399 = (class162) null;
        }
        field2398 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 606)
    public final int method1061(int arg0, int arg1) {
        int var3 = -91 % ((23 - arg0) / 63);
        if (this.field2389 != null) {
            arg1 = (int) ((long) this.field2387 * (long) arg1 / (long) this.field2392);
        }
        field2397++;
        return arg1;
    }
}
