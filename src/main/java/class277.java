import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class277 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    public static boolean field4398 = false;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[B")
    public static byte[] field4395 = new byte[520];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "[Led;")
    public static class186[] field4405;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[[B")
    public static byte[][] field4396;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1866(int arg0, boolean arg1, String arg2) {
        field4406++;
        class41 var3 = class221.method1492((byte) -42, arg0, 3);
        if (arg1) {
            field4395 = null;
        }
        var3.method301(8792);
        var3.field599 = arg2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILhc;)Z")
    public static final boolean method1867(int arg0, int arg1, class235 arg2) {
        if (arg0 != -1) {
            field4405 = null;
        }
        byte[] var3 = arg2.method1601(17055, arg1);
        field4400++;
        if (var3 == null) {
            return false;
        } else {
            class179.method1210(1, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public static final void method1868(int arg0, int arg1) {
        field4402++;
        class128.field2018--;
        if (class128.field2018 == arg0) {
            return;
        }
        if (arg1 != -2632) {
            field4398 = false;
        }
        class175.method1188(class88.field1492, arg0 + 1, class88.field1492, arg0, class128.field2018 - arg0);
        class175.method1188(class256.field4099, arg0 + 1, class256.field4099, arg0, class128.field2018 - arg0);
        class175.method1185(class268.field4273, arg0 + 1, class268.field4273, arg0, class128.field2018 - arg0);
        class175.method1184(class146.field2319, arg0 + 1, class146.field2319, arg0, class128.field2018 - arg0);
        class175.method1189(class243.field3962, arg0 + 1, class243.field3962, arg0, class128.field2018 - arg0);
        class175.method1185(class29.field415, arg0 + 1, class29.field415, arg0, class128.field2018 - arg0);
        class175.method1185(class45.field648, arg0 + 1, class45.field648, arg0, class128.field2018 - arg0);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)I")
    public static final int method1869(int arg0, int arg1) {
        field4403++;
        if (arg0 < 0) {
            return 0;
        }
        if (arg1 > -101) {
            method1868(77, 127);
        }
        class53 var2 = (class53) class291.field4590.method285((long) arg0, 13821);
        if (var2 == null) {
            return class146.method989(arg0, -78).field1837;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field800.length; var4++) {
            if (var2.field800[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class146.method989(arg0, -33).field1837 - var2.field800.length);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class163 var7 = new class163();
        var7.field2552 = arg1 / 128;
        var7.field2562 = arg2 / 128;
        var7.field2550 = arg3 / 128;
        var7.field2557 = arg4 / 128;
        var7.field2547 = arg0;
        var7.field2565 = arg1;
        var7.field2554 = arg2;
        var7.field2548 = arg3;
        var7.field2564 = arg4;
        var7.field2572 = arg5;
        var7.field2573 = arg6;
        class41.field590[class196.field3099++] = var7;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([Ljava/lang/String;IBI)Ljava/lang/String;")
    public static final String method1871(String[] arg0, int arg1, byte arg2, int arg3) {
        field4394++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg0[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            if (arg2 <= 88) {
                method1870(40, 26, 110, 14, 36, -105, 43);
            }
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)Lsi;")
    public static final class203 method1872(boolean arg0, int arg1) {
        class203 var2 = (class203) class171.field2678.method1887(0, (long) arg1);
        field4397++;
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            field4396 = null;
        }
        byte[] var3 = class115.field1880.method1590(arg1, (byte) -25, 34);
        class203 var4 = new class203();
        if (var3 != null) {
            var4.method1368(arg1, 8323, new class88(var3));
        }
        class171.field2678.method1886(-59, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1873(int arg0) {
        field4396 = null;
        field4395 = null;
        if (arg0 != -1) {
            field4405 = null;
        }
        field4405 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1874(byte arg0) {
        class58 var1 = class254.field4065;
        synchronized (class254.field4065) {
            class280.field4431 = class161.field2526;
            class86.field1437++;
            if (class196.field3097 >= 0) {
                while (class196.field3097 != class149.field2358) {
                    int var2 = class62.field1063[class149.field2358];
                    class149.field2358 = class149.field2358 + 1 & 0x7F;
                    if (var2 < 0) {
                        class106.field1764[~var2] = false;
                    } else {
                        class106.field1764[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class106.field1764[var3] = false;
                }
                class196.field3097 = class149.field2358;
            }
            class161.field2526 = class157.field2443;
            if (arg0 < 111) {
                method1868(-8, -11);
            }
        }
        field4404++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1875(boolean arg0, String arg1) {
        field4399++;
        if (class140.field2141 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class57.method432(-2);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class81.method579(-1, (String) null, 0, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class57.method432(-2);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class81.method579(-1, (String) null, 0, "Memory before cleanup=" + var7 + "k");
                class191.method1283((byte) -5);
                class57.method432(-2);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class81.method579(-1, (String) null, 0, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class81.method579(-1, (String) null, 0, "Number of player models in cache:" + class80.method571((byte) -105));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class17.method164(0);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class240.field3903.method1542(-1);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class240.field3903.method1546(-84);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class179.field2788.method259((byte) 89);
                class249.field4022.method904(-127);
                class240.field3903.method1541((byte) 116);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class148.field2351 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                client.method1042(false, 25);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class11.field208 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class11.field208 = false;
            }
            if (arg1.startsWith("::setba")) {
                class106.field1754 = class57.method438(arg1.substring(8), 47);
                class73.method531((byte) 8, class179.field2788);
                class216.field3351 = false;
            }
            if (arg1.startsWith("::setparticles")) {
                class67.method493(class57.method438(arg1.substring(15), 47));
                class73.method531((byte) 8, class179.field2788);
                class216.field3351 = false;
            }
            if (arg1.startsWith("::fps ") && class212.field3292 != 0) {
                class4.method14((byte) 114, class57.method438(arg1.substring(6), 47));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class42.field605 = class57.method438(arg1.substring(12).trim(), 47);
                class81.method579(-1, (String) null, 0, "rect_debug=" + class42.field605);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class170.field2647 = true;
            }
            arg1.startsWith("::hdr");
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class240.field3909) {
                    class240.field3909 = false;
                    class81.method579(-1, (String) null, 0, "Forced tweening disabled.");
                } else {
                    class240.field3909 = true;
                    class81.method579(-1, (String) null, 0, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class244.field3975) {
                    System.out.println("Shift-click disabled.");
                    class244.field3975 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class244.field3975 = true;
                }
            }
        }
        client.field2435.method536((byte) -104, 151);
        if (!arg0) {
            method1869(73, -78);
        }
        class89.field1543++;
        client.field2435.method654((byte) -112, arg1.length() - 1);
        client.field2435.method680(arg1.substring(2), (byte) 101);
    }
}
