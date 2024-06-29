import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class152 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "J")
    public long field2392 = 0L;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Z")
    public static boolean field2391 = false;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Lnk;")
    public static class2 field2395 = new class2();

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "[I")
    public static int[] field2408 = new int[14];

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2411 = " has logged out.";

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lce;")
    public static class8 field2400;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Lfe;")
    public class94 field2405;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "Lfe;")
    public class94 field2406;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[I")
    public static int[] field2407;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)C", line = 4)
    public static final char method1064(int arg0, byte arg1) {
        field2388++;
        int var2 = arg1 & 0xFF;
        if (arg0 != 0) {
            field2409 = 93;
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class4.field44[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V", line = 32)
    public static final void method1065(boolean arg0, int arg1) {
        field2399++;
        byte var2;
        byte[][] var3;
        if (class333.field5166 && arg0) {
            var2 = 1;
            var3 = class184.field2827;
        } else {
            var3 = class204.field3079;
            var2 = 4;
        }
        int var4 = var3.length;
        if (arg1 >= -76) {
            method1067(-125, -63, -62);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var3[var5];
            int var8 = class121.field1865[var5] >> 8;
            int var9 = var8 * 64 - class30.field374;
            int var10 = class121.field1865[var5] & 0xFF;
            int var11 = var10 * 64 - class294.field4535;
            if (var7 != null) {
                class233.method1592(true);
                var6 = class315.method2151(class294.field4535, class33.field425, var11, 104, class30.field374, var9, var7, arg0);
            }
            if (!arg0 && class144.field2288 / 8 == var8 && class240.field3815 / 8 == var10) {
                if (var6 == null) {
                    class299.field4633 = -1;
                } else {
                    class298.field4593 = var6[1];
                    class299.field4633 = var6[0];
                    field2409 = var6[3];
                    class115.field1791 = var6[4];
                    class285.field4371 = var6[2];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class121.field1865[var12] >> 8) * 64 - class30.field374;
            int var14 = (class121.field1865[var12] & 0xFF) * 64 - class294.field4535;
            byte[] var15 = var3[var12];
            if (var15 == null && class240.field3815 < 800) {
                class233.method1592(true);
                for (int var16 = 0; var16 < var2; var16++) {
                    class219.method1465(true, 64, 64, var14, var16, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILgn;)V", line = 130)
    public static final void method1066(int arg0, class303 arg1) {
        field2397++;
        if ((arg1.field4716.length - arg1.field4679) < 1) {
            return;
        }
        int var2 = arg1.method2043((byte) -126);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg1.field4716.length - arg1.field4679) < var3) {
            return;
        }
        class88.field1322 = arg1.method2043((byte) -118);
        if (arg0 != -8950) {
            field2401 = -117;
        }
        if (class88.field1322 < 1) {
            class88.field1322 = 1;
        } else if (class88.field1322 > 4) {
            class88.field1322 = 4;
        }
        class175.method1187(arg1.method2043((byte) -119) == 1, (byte) 120);
        class233.field3752 = arg1.method2043((byte) -120) == 1;
        class317.field4985 = arg1.method2043((byte) -112) == 1;
        class275.field4239 = arg1.method2043((byte) -117) == 1;
        class188.field2856 = arg1.method2043((byte) -106) == 1;
        class318.field4986 = arg1.method2043((byte) -114) == 1;
        class124.field1935 = arg1.method2043((byte) -116) == 1;
        class155.field2434 = arg1.method2043((byte) -123) == 1;
        class90.field1382 = arg1.method2043((byte) -119);
        if (class90.field1382 > 2) {
            class90.field1382 = 2;
        }
        if (var2 < 2) {
            class192.field2903 = arg1.method2043((byte) -111) == 1;
            arg1.method2043((byte) -112);
        } else {
            class192.field2903 = arg1.method2043((byte) -126) == 1;
        }
        class297.field4556 = arg1.method2043((byte) -106) == 1;
        class187.field2843 = arg1.method2043((byte) -104) == 1;
        class160.field2490 = arg1.method2043((byte) -117);
        if (class160.field2490 > 2) {
            class160.field2490 = 2;
        }
        class10.field95 = class160.field2490;
        class269.field4148 = arg1.method2043((byte) -111) == 1;
        class34.field441 = arg1.method2043((byte) -115);
        if (class34.field441 > 127) {
            class34.field441 = 127;
        }
        class334.field5199 = arg1.method2043((byte) -114);
        class274.field4219 = arg1.method2043((byte) -105);
        if (class274.field4219 > 127) {
            class274.field4219 = 127;
        }
        if (var2 >= 1) {
            class226.field3605 = arg1.method1994(false);
            class10.field99 = arg1.method1994(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method2043((byte) -114);
        }
        if (var2 >= 4) {
            int var4 = arg1.method2043((byte) -127);
            if (class109.field1676 < 96) {
                var4 = 0;
            }
            class243.method1652(var4);
        }
        if (var2 >= 5) {
            class99.field1539 = arg1.method1996(103);
        }
        if (var2 >= 6) {
            class175.field2682 = arg1.method2043((byte) -104);
        }
        if (var2 >= 7) {
            class315.field4962 = arg1.method2043((byte) -114) == 1;
        }
        if (var2 >= 8) {
            class298.field4569 = arg1.method2043((byte) -104) == 1;
        }
        if (var2 >= 9) {
            class338.field5235 = arg1.method2043((byte) -113);
        }
        if (var2 >= 10) {
            class268.field4135 = arg1.method2043((byte) -128) != 0;
        }
        if (var2 >= 11) {
            class104.field1609 = arg1.method2043((byte) -118) != 0;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V", line = 294)
    public static final void method1067(int arg0, int arg1, int arg2) {
        class230.field3717 = true;
        class6.field68 = arg0;
        class101.field1573 = arg1;
        class45.field637 = arg2;
        class13.field140 = -1;
        class220.field3496 = -1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 314)
    public static void method1068(byte arg0) {
        field2411 = null;
        if (arg0 == 1) {
            field2407 = null;
            field2400 = null;
            field2395 = null;
            field2408 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([IB[J)V", line = 350)
    public static final void method1069(int[] arg0, byte arg1, long[] arg2) {
        int var3 = -52 / ((-arg1 - 86) / 39);
        field2394++;
        class47.method327(arg2.length - 1, arg2, 0, 1, arg0);
    }
}
