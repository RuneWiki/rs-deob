import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class135 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    private int field2361 = 0;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
    public boolean field2358 = false;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    private int field2363 = 0;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field2352 = -1;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field2360 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field2355 = 128;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    private int field2366 = 128;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
    public static int[] field2368 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field2351 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lcf;")
    public static class93 field2353 = class147.method1066("Lade Benutzeroberfl-=che )2 ", -48);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    private int field2356;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    public static int[] field2370;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[S")
    private short[] field2364;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[S")
    private short[] field2367;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[S")
    private short[] field2371;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[S")
    private short[] field2373;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method982(byte arg0) {
        class285.field5105.method1568(149, (byte) 96);
        class97.field1727++;
        field2372++;
        class285.field5105.method1916(class55.method311(false), 105);
        class285.field5105.method1908(-105, class150.field2629);
        class285.field5105.method1908(-109, class169.field2968);
        if (arg0 == 33) {
            class285.field5105.method1916(class119.field2121, arg0 + 38);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILee;I)V")
    private final void method983(int arg0, class280 arg1, int arg2) {
        if (arg2 != -101) {
            method982((byte) 78);
        }
        field2359++;
        if (arg0 == 1) {
            this.field2356 = arg1.method1891(-119);
        } else if (arg0 == 2) {
            this.field2352 = arg1.method1891(-115);
        } else if (arg0 == 4) {
            this.field2355 = arg1.method1891(-123);
        } else if (arg0 == 5) {
            this.field2366 = arg1.method1891(-123);
        } else if (arg0 == 6) {
            this.field2363 = arg1.method1891(arg2 ^ 0xB);
        } else if (arg0 == 7) {
            this.field2360 = arg1.method1907(arg2 ^ 0xFFFFBE5B);
        } else if (arg0 == 8) {
            this.field2361 = arg1.method1907(16832);
        } else if (arg0 == 9) {
            this.field2358 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1907(16832);
            this.field2364 = new short[var6];
            this.field2367 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2364[var7] = (short) arg1.method1891(-124);
                this.field2367[var7] = (short) arg1.method1891(-112);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1907(arg2 ^ 0xFFFFBE5B);
            this.field2371 = new short[var4];
            this.field2373 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2373[var5] = (short) arg1.method1891(-115);
                this.field2371[var5] = (short) arg1.method1891(-112);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBII)Lbk;")
    public final class20 method984(int arg0, byte arg1, int arg2, int arg3) {
        field2369++;
        class20 var5 = (class20) class151.field2644.method302((long) this.field2365, 0);
        if (var5 == null) {
            class64 var6 = class64.method443(class106.field1828, this.field2356, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2364 != null) {
                for (int var7 = 0; var7 < this.field2364.length; var7++) {
                    var6.method433(this.field2364[var7], this.field2367[var7]);
                }
            }
            if (this.field2373 != null) {
                for (int var8 = 0; var8 < this.field2373.length; var8++) {
                    var6.method448(this.field2373[var8], this.field2371[var8]);
                }
            }
            var5 = var6.method436(this.field2360 + 64, this.field2361 + 850, -30, -50, -30);
            class151.field2644.method297((long) this.field2365, var5, 10414);
        }
        class20 var9;
        if (this.field2352 == -1 || arg2 == -1) {
            var9 = var5.method104(true, true, true);
        } else {
            var9 = class131.method964(this.field2352, true).method184(arg3, -424149168, arg0, arg2, var5);
        }
        if (arg1 != 124) {
            return null;
        }
        if (this.field2355 != 128 || this.field2366 != 128) {
            var9.method100(this.field2355, this.field2366, this.field2355);
        }
        if (this.field2363 != 0) {
            if (this.field2363 == 90) {
                var9.method91();
            }
            if (this.field2363 == 180) {
                var9.method97();
            }
            if (this.field2363 == 270) {
                var9.method92();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILee;)V")
    public final void method985(int arg0, class280 arg1) {
        if (arg0 != 128) {
            this.method985(86, (class280) null);
        }
        field2362++;
        while (true) {
            int var3 = arg1.method1907(16832);
            if (var3 == 0) {
                return;
            }
            this.method983(var3, arg1, -101);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method986(int arg0) {
        if (arg0 != -30) {
            field2353 = null;
        }
        field2351 = null;
        field2368 = null;
        field2353 = null;
        field2370 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class154.field2703 = arg3;
        field2354++;
        class77.field1437 = arg2;
        if (arg5 >= -111) {
            field2368 = null;
        }
        class258.field4652 = arg4;
        class109.field1862 = arg0;
        class167.field2952 = arg1;
        if (class154.field2703 >= 100) {
            int var6 = class167.field2952 * 128 + 64;
            int var7 = class109.field1862 * 128 + 64;
            int var8 = class13.method56(var6, var7, (byte) 127, class138.field2405) - class77.field1437;
            int var9 = var6 - class165.field2919;
            int var10 = var7 - class166.field2925;
            int var11 = var8 - class77.field1442;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class198.field3602 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class233.field4155 = (int) (-325.949D * Math.atan2((double) var10, (double) var9)) & 0x7FF;
            if (class198.field3602 < 128) {
                class198.field3602 = 128;
            }
            if (class198.field3602 > 383) {
                class198.field3602 = 383;
            }
        }
        class18.field234 = 2;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static final void method988(byte arg0) {
        class266 var1 = class172.field3011;
        synchronized (class172.field3011) {
            if (arg0 > -35) {
                return;
            }
            class123.field2194 = class211.field3876;
            class164.field2888++;
            if (class33.field522 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class176.field3048[var2] = false;
                }
                class33.field522 = class80.field1489;
            } else {
                while (class80.field1489 != class33.field522) {
                    int var3 = class55.field924[class80.field1489];
                    class80.field1489 = class80.field1489 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class176.field3048[var3] = true;
                    } else {
                        class176.field3048[~var3] = false;
                    }
                }
            }
            class211.field3876 = class196.field3590;
        }
        field2357++;
    }
}
