import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class344 {

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lfr;")
    private class231 field5394 = new class231(64);

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Lfr;")
    public class231 field5397 = new class231(50);

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Lsg;")
    public class327 field5399 = new class327(250);

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Llg;")
    private class142 field5400 = new class142();

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lqs;")
    private class496 field5380;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "Lbn;")
    private class351 field5401;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lqs;")
    public class496 field5378;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
    private boolean field5381;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field5385;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field5403;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field5404;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lwp;")
    public static class307 field5382 = new class307();

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 5)
    public static void method2211(int arg0) {
        if (arg0 != 32) {
            method2214(-97, -128);
        }
        field5382 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 15)
    public final void method2212(byte arg0) {
        class327 var2 = this.field5399;
        synchronized (this.field5399) {
            this.field5399.method2055(62);
        }
        if (arg0 < 106) {
            this.method2217((byte) 95);
        }
        field5386++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIIILza;ILqp;BLza;ILla;Z)Lo;", line = 30)
    public final class138 method2213(boolean arg0, int arg1, int arg2, int arg3, class491 arg4, int arg5, class333 arg6, byte arg7, class491 arg8, int arg9, class296 arg10, boolean arg11) {
        field5389++;
        class138 var13 = this.method2223(arg2, arg4, arg5, arg1, arg3, arg7 + 6466, arg6, arg9);
        if (var13 != null) {
            return var13;
        }
        class104 var14 = this.method2221(arg1, arg7 ^ 0x3A);
        if (arg9 > 1 && var14.field1773 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg9 >= var14.field1746[var16] && var14.field1746[var16] != 0) {
                    var15 = var14.field1773[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2221(var15, -1);
            }
        }
        int[] var17 = var14.method719(arg11, arg10, arg3, arg4, arg9, arg6, arg5, arg8, 766916832, arg2);
        if (var17 == null) {
            return null;
        }
        if (arg7 != -59) {
            this.method2218(101);
        }
        class138 var18;
        if (arg0) {
            var18 = arg8.method834(var17, 0, 36, 36, 32);
        } else {
            var18 = arg4.method834(var17, 0, 36, 36, 32);
        }
        if (!arg0) {
            class142 var19 = new class142();
            var19.field2346 = arg4.field7164;
            var19.field2341 = arg9;
            var19.field2343 = arg5;
            var19.field2339 = arg3;
            var19.field2338 = arg1;
            var19.field2334 = arg6 != null;
            var19.field2340 = arg2;
            this.field5399.method2063((byte) 123, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 102)
    public static final void method2214(int arg0, int arg1) {
        field5396++;
        if (class386.field5952 == arg0) {
            return;
        }
        class217.field3775 = class277.field4548 = class13.field150[arg0];
        class5.method17((byte) -4);
        class18.field196 = new int[class217.field3775][class277.field4548];
        class361.field5602 = new int[4][class217.field3775 >> 3][class277.field4548 >> 3];
        class94.field1592 = new int[class217.field3775][class277.field4548];
        for (int var2 = 0; var2 < 4; var2++) {
            class106.field1865[var2] = class517.method3058((byte) -93, class217.field3775, class277.field4548);
        }
        class53.field858 = new byte[4][class217.field3775][class277.field4548];
        class156.method1095(class277.field4548, class217.field3775, false, 4);
        class262.method1750(118, class217.field3775 >> 3, class305.field4873, class277.field4548 >> 3);
        if (arg1 == 36) {
            class386.field5952 = arg0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I", line = 135)
    public static final int method2215(int arg0, int arg1) {
        field5391++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else {
            if (arg1 != -12017) {
                method2214(-34, -36);
            }
            if (arg0 == 6409 || arg0 == 34846) {
                return 6409;
            } else if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 168)
    public final void method2216(int arg0) {
        class231 var2 = this.field5394;
        synchronized (this.field5394) {
            if (arg0 != -1309) {
                return;
            }
            this.field5394.method1604(arg0 + 1313);
        }
        field5387++;
        class231 var3 = this.field5397;
        synchronized (this.field5397) {
            this.field5397.method1604(4);
        }
        class327 var4 = this.field5399;
        synchronized (this.field5399) {
            this.field5399.method2055(-106);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 189)
    public final void method2217(byte arg0) {
        field5395++;
        class231 var2 = this.field5397;
        synchronized (this.field5397) {
            this.field5397.method1604(4);
        }
        if (arg0 != -127) {
            this.method2222(-113, -101);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 203)
    public final void method2218(int arg0) {
        field5379++;
        class231 var2 = this.field5394;
        synchronized (this.field5394) {
            this.field5394.method1598(124);
        }
        class231 var3 = this.field5397;
        synchronized (this.field5397) {
            this.field5397.method1598(-98);
        }
        class327 var4 = this.field5399;
        synchronized (this.field5399) {
            this.field5399.method2062(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BZ)V", line = 219)
    public final void method2219(byte arg0, boolean arg1) {
        if (arg0 >= -109) {
            this.method2217((byte) 45);
        }
        field5383++;
        if (arg1 != this.field5381) {
            this.field5381 = arg1;
            this.method2216(-1309);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)V", line = 236)
    public final void method2220(int arg0, int arg1) {
        this.field5402 = arg0;
        if (arg1 != -1) {
            this.method2217((byte) -6);
        }
        field5384++;
        class231 var3 = this.field5397;
        synchronized (this.field5397) {
            this.field5397.method1604(4);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)Lmh;", line = 255)
    public final class104 method2221(int arg0, int arg1) {
        field5390++;
        class231 var3 = this.field5394;
        class104 var4;
        synchronized (this.field5394) {
            var4 = (class104) this.field5394.method1593((byte) 118, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field5380;
        byte[] var6;
        synchronized (this.field5380) {
            var6 = this.field5380.method2926(class420.method2584(0, arg0), -118, class160.method1110(arg0, (byte) 92));
        }
        class104 var7 = new class104();
        var7.field1752 = arg0;
        var7.field1707 = this;
        var7.field1778 = new String[] { null, null, class359.field5582.method1954(this.field5388, -30366), null, null };
        var7.field1714 = new String[] { null, null, null, null, class471.field6988.method1954(this.field5388, -30366) };
        if (var6 != null) {
            var7.method709(new class23(var6), 1);
        }
        var7.method718(true);
        if (var7.field1776 != -1) {
            var7.method720(1, this.method2221(var7.field1776, -1), this.method2221(var7.field1770, arg1));
        }
        if (var7.field1761 != arg1) {
            var7.method706(arg1 - 122, this.method2221(var7.field1749, -1), this.method2221(var7.field1761, -1));
        }
        if (!this.field5381 && var7.field1728) {
            var7.field1771 = class423.field6385.method1954(this.field5388, -30366);
            var7.field1778 = this.field5403;
            var7.field1724 = false;
            var7.field1705 = 0;
            var7.field1732 = null;
            var7.field1714 = this.field5404;
            if (var7.field1760 != null) {
                boolean var8 = false;
                for (class276 var9 = var7.field1760.method2518(-116); var9 != null; var9 = var7.field1760.method2524(0)) {
                    class223 var10 = this.field5401.method2258(true, (int) var9.field4542);
                    if (var10.field3849) {
                        var9.method1821((byte) -84);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field1760 = null;
                }
            }
        }
        class231 var11 = this.field5394;
        synchronized (this.field5394) {
            this.field5394.method1595(var7, (long) arg0, (byte) 87);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)V", line = 331)
    public final void method2222(int arg0, int arg1) {
        class231 var3 = this.field5394;
        synchronized (this.field5394) {
            this.field5394.method1603((byte) -113, arg1);
        }
        field5392++;
        class231 var4 = this.field5397;
        synchronized (this.field5397) {
            if (arg0 != 36) {
                method2211(-27);
            }
            this.field5397.method1603((byte) -101, arg1);
        }
        class327 var5 = this.field5399;
        synchronized (this.field5399) {
            this.field5399.method2064(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lwv;IZLbn;Lqs;Lqs;)V", line = 399)
    public class344(class535 arg0, int arg1, boolean arg2, class351 arg3, class496 arg4, class496 arg5) {
        this.field5380 = arg4;
        this.field5388 = arg1;
        this.field5401 = arg3;
        this.field5378 = arg5;
        this.field5381 = arg2;
        if (this.field5380 == null) {
            this.field5385 = 0;
        } else {
            int var7 = this.field5380.method2919((byte) -57) - 1;
            this.field5385 = this.field5380.method2940(var7, -10511) + var7 * 256;
        }
        this.field5403 = new String[] { null, null, class359.field5582.method1954(this.field5388, -30366), null, null };
        this.field5404 = new String[] { null, null, null, null, class471.field6988.method1954(this.field5388, -30366) };
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILza;IIIILqp;I)Lo;", line = 360)
    public final class138 method2223(int arg0, class491 arg1, int arg2, int arg3, int arg4, int arg5, class333 arg6, int arg7) {
        this.field5400.field2343 = arg2;
        this.field5400.field2338 = arg3;
        this.field5400.field2339 = arg4;
        this.field5400.field2341 = arg7;
        this.field5400.field2334 = arg6 != null;
        field5398++;
        this.field5400.field2346 = arg1.field7164;
        if (arg5 != 6407) {
            this.field5402 = -76;
        }
        this.field5400.field2340 = arg0;
        return (class138) this.field5399.method2061(0, this.field5400);
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(II)I", line = 378)
    public static int method2224(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
