import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lqf;")
    private static class117 field2897 = class72.method514(117, "skill)2");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lqf;")
    private static class117 field2902 = class72.method514(118, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lqf;")
    public static class117 field2896 = field2902;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lqf;")
    private static class117 field2900 = class72.method514(117, "New User");

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lqf;")
    private static class117 field2905 = class72.method514(123, "Login");

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lqf;")
    public static class117 field2908 = field2900;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lqf;")
    public static class117 field2910 = field2905;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lqf;")
    public static class117 field2909 = field2897;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lr;")
    public static class118 field2895;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2906;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Ljc;")
    public static final class65 method974(int arg0, byte arg1) {
        field2899++;
        class65 var2 = (class65) class110.field2599.method247(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 97) {
            return null;
        } else {
            byte[] var3 = class138.field3285.method458(false, 0, arg0);
            if (var3 == null) {
                return null;
            }
            class65 var4 = new class65();
            class77 var5 = new class77(var3);
            var5.field1691 = var5.field1748.length - 12;
            int var6 = 0;
            int var7 = var5.method554((byte) -112);
            var4.field1353 = var5.method597(33);
            var4.field1352 = var5.method597(109);
            var4.field1348 = var5.method597(96);
            var4.field1340 = var5.method597(85);
            var5.field1691 = 0;
            var4.field1360 = var5.method579(104);
            var4.field1361 = new class117[var7];
            var4.field1341 = new int[var7];
            var4.field1356 = new int[var7];
            while (var5.field1748.length - 12 > var5.field1691) {
                int var8 = var5.method597(87);
                if (var8 == 3) {
                    var4.field1361[var6] = var5.method577(-110);
                } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                    var4.field1341[var6] = var5.method570((byte) 123);
                } else {
                    var4.field1341[var6] = var5.method554((byte) 94);
                }
                var4.field1356[var6++] = var8;
            }
            class110.field2599.method248((long) arg0, (byte) -125, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method975(int arg0) {
        field2907++;
        if (class121.field2891 != 0) {
            return;
        }
        if (arg0 >= -78) {
            method976(false);
        }
        if (class120.field2876 != -1) {
            return;
        }
        int var1 = class133.field3142;
        if (class89.field2160 && class153.field3788 >= 516 && class102.field2462 >= 160 && class153.field3788 <= 765 && class102.field2462 <= 205) {
            var1 = 0;
        }
        if (!class81.field1864) {
            if (var1 == 1 && class27.field531 > 0) {
                int var12 = class3.field54[class27.field531 - 1];
                if (var12 == 36 || var12 == 12 || var12 == 19 || var12 == 8 || var12 == 34 || var12 == 50 || var12 == 39 || var12 == 54 || var12 == 57 || var12 == 58 || var12 == 6 || var12 == 1002) {
                    int var13 = class107.field2552[class27.field531 - 1];
                    int var14 = class136.field3255[class27.field531 - 1];
                    class89 var15 = class104.method801(var14, -63);
                    if (class22.method180(class42.method292(var15, -5447), -10) || class136.method1062(class42.method292(var15, -5447), 19138)) {
                        class83.field1900 = var14;
                        class83.field1906 = var13;
                        class65.field1343 = 0;
                        class121.field2891 = 2;
                        class110.field2600 = false;
                        class16.field252 = class102.field2462;
                        if (var14 >> 16 == class96.field2316) {
                            class121.field2891 = 1;
                        }
                        if (var14 >> 16 == class95.field2288) {
                            class121.field2891 = 3;
                        }
                        class107.field2553 = class153.field3788;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class45.field889 == 1 || class107.method810(class27.field531 - 1, 82)) && class27.field531 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class27.field531 > 0) {
                class90.method717((byte) -90, class27.field531 - 1);
            }
            if (var1 != 2 || class27.field531 <= 0) {
                return;
            }
            class90.method716(2);
            return;
        }
        if (var1 != 1) {
            int var2 = class143.field3504;
            int var3 = class18.field274;
            if (class24.field468 == 0) {
                var2 -= 4;
                var3 -= 4;
            }
            if (class24.field468 == 1) {
                var2 -= 553;
                var3 -= 205;
            }
            if (class24.field468 == 2) {
                var2 -= 17;
                var3 -= 357;
            }
            if (var2 < class147.field3595 - 10 || var2 > class147.field3595 + class55.field1142 + 10 || var3 < class140.field3341 - 10 || var3 > class140.field3341 + class87.field1987 + 10) {
                if (class24.field468 == 1) {
                    class139.field3310 = true;
                }
                class81.field1864 = false;
                if (class24.field468 == 2) {
                    class87.field1993 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class147.field3595;
        int var5 = class55.field1142;
        int var6 = class140.field3341;
        int var7 = class102.field2462;
        int var8 = class153.field3788;
        int var9 = -1;
        if (class24.field468 == 0) {
            var8 -= 4;
            var7 -= 4;
        }
        if (class24.field468 == 1) {
            var8 -= 553;
            var7 -= 205;
        }
        if (class24.field468 == 2) {
            var7 -= 357;
            var8 -= 17;
        }
        for (int var10 = 0; var10 < class27.field531; var10++) {
            int var11 = (class27.field531 - var10 - 1) * 15 + var6 + 31;
            if (var8 > var4 && var4 + var5 > var8 && var7 > var11 - 13 && var7 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class90.method717((byte) -101, var9);
        }
        class81.field1864 = false;
        if (class24.field468 == 1) {
            class139.field3310 = true;
        }
        if (class24.field468 == 2) {
            class87.field1993 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static void method976(boolean arg0) {
        field2900 = null;
        field2909 = null;
        field2905 = null;
        field2896 = null;
        field2906 = null;
        field2910 = null;
        field2897 = null;
        if (!arg0) {
            field2902 = null;
            field2895 = null;
            field2908 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)J")
    public static final synchronized long method977(boolean arg0) {
        if (arg0) {
            field2900 = null;
        }
        field2898++;
        long var1 = System.currentTimeMillis();
        if (var1 < class87.field1992) {
            class64.field1331 += class87.field1992 - var1;
        }
        class87.field1992 = var1;
        return class64.field1331 + var1;
    }
}
