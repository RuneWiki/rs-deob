import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Z")
    public boolean field1369 = true;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lqf;")
    public static class117 field1382 = class72.method514(98, "Sprites geladen)3");

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1381 = 0;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lad;")
    public static class5 field1374 = new class5();

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1386 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lqf;")
    public static class117 field1388 = class72.method514(110, "Fps:");

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lqf;")
    private static class117 field1390 = class72.method514(99, " from your friend list first");

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Lqf;")
    public static class117 field1394 = field1390;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Laf;")
    public static class7 field1393;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method469(int arg0) {
        class32.field683.method214(8);
        class12.method95();
        if (arg0 <= 31) {
            method472(false);
        }
        field1377++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
    public static final int method470(int arg0, int arg1, int arg2) {
        field1370++;
        if (arg0 >= -37) {
            field1393 = null;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method471(int arg0) {
        field1393 = null;
        field1388 = null;
        field1390 = null;
        field1382 = null;
        field1394 = null;
        if (arg0 < 110) {
            field1385 = -53;
        }
        field1374 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static final void method472(boolean arg0) {
        field1376++;
        try {
            Graphics var1 = class3.field64.getGraphics();
            class134.field3186.method210(553, 205, (byte) 78, var1);
            if (arg0) {
                field1388 = null;
            }
        } catch (Exception var2) {
            class3.field64.repaint();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lmd;I)V")
    public static final void method473(class87 arg0, int arg1) {
        arg0.field1949 = arg0.field2019;
        field1371++;
        if (arg0.field1963 == 0) {
            arg0.field1964 = 0;
            return;
        }
        if (arg0.field2017 != -1 && arg0.field1994 == 0) {
            class96 var2 = class130.method1013(arg0.field2017, -104);
            if (arg0.field1955 > 0 && var2.field2329 == 0) {
                arg0.field1964++;
                return;
            }
            if (arg0.field1955 <= 0 && var2.field2315 == 0) {
                arg0.field1964++;
                return;
            }
        }
        int var3 = arg0.field1998;
        int var4 = arg0.field1960;
        int var5 = arg0.field2004[arg0.field1963 - 1] * 128 + arg0.field2009 * 64;
        int var6 = arg0.field1970[arg0.field1963 - 1] * 128 + arg0.field2009 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field1960 = var6;
            arg0.field1998 = var5;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg0.field1969 = 1280;
            } else if (var6 < var4) {
                arg0.field1969 = 1792;
            } else {
                arg0.field1969 = 1536;
            }
        } else if (var3 <= var5) {
            if (var4 < var6) {
                arg0.field1969 = 1024;
            } else if (var6 < var4) {
                arg0.field1969 = 0;
            }
        } else if (var4 < var6) {
            arg0.field1969 = 768;
        } else if (var4 > var6) {
            arg0.field1969 = 256;
        } else {
            arg0.field1969 = 512;
        }
        int var7 = arg0.field1969 - arg0.field1999 & 0x7FF;
        if (arg1 >= -73) {
            field1381 = -121;
        }
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1991;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1982;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1954;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1956;
        }
        if (var8 == -1) {
            var8 = arg0.field1982;
        }
        int var9 = 4;
        arg0.field1949 = var8;
        boolean var10 = true;
        if (arg0 instanceof class58) {
            var10 = ((class58) arg0).field1172.field3206;
        }
        if (var10) {
            if (arg0.field1999 != arg0.field1969 && arg0.field1996 == -1 && arg0.field1972 != 0) {
                var9 = 2;
            }
            if (arg0.field1963 > 2) {
                var9 = 6;
            }
            if (arg0.field1963 > 3) {
                var9 = 8;
            }
            if (arg0.field1964 > 0 && arg0.field1963 > 1) {
                var9 = 8;
                arg0.field1964--;
            }
        } else {
            if (arg0.field1963 > 1) {
                var9 = 6;
            }
            if (arg0.field1963 > 2) {
                var9 = 8;
            }
            if (arg0.field1964 > 0 && arg0.field1963 > 1) {
                var9 = 8;
                arg0.field1964--;
            }
        }
        if (arg0.field1966[arg0.field1963 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var5) {
            arg0.field1998 += var9;
            if (arg0.field1998 > var5) {
                arg0.field1998 = var5;
            }
        } else if (var3 > var5) {
            arg0.field1998 -= var9;
            if (var5 > arg0.field1998) {
                arg0.field1998 = var5;
            }
        }
        if (var9 >= 8 && arg0.field1982 == arg0.field1949 && arg0.field1995 != -1) {
            arg0.field1949 = arg0.field1995;
        }
        if (var6 > var4) {
            arg0.field1960 += var9;
            if (var6 < arg0.field1960) {
                arg0.field1960 = var6;
            }
        } else if (var4 > var6) {
            arg0.field1960 -= var9;
            if (var6 > arg0.field1960) {
                arg0.field1960 = var6;
            }
        }
        if (arg0.field1998 != var5 || arg0.field1960 != var6) {
            return;
        }
        arg0.field1963--;
        if (arg0.field1955 > 0) {
            arg0.field1955--;
            return;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
    public static final void method474(int arg0, int arg1) {
        class125.field2952 = 0;
        class78.field1773 = arg1;
        class80.field1831 = null;
        if (arg0 != -27742) {
            field1393 = null;
        }
        class89.field2047 = -1;
        class125.field2953 = 1;
        class44.field876 = false;
        class112.field2615 = -1;
        field1368++;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1384 = arg5;
        this.field1380 = arg2;
        this.field1369 = arg6;
        this.field1372 = arg0;
        this.field1373 = arg3;
        this.field1375 = arg4;
        this.field1378 = arg1;
    }
}
