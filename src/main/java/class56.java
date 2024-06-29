import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class56 extends Canvas {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field1450;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lmb;")
    public static class73 field1453 = new class73(5000);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lke;")
    public static class65 field1463 = class1.method17("Aus", -124);

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
    public static int[] field1464 = new int[16384];

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "J")
    public static volatile long field1460 = 0L;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lke;")
    public static class65 field1466 = class1.method17(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -120);

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lke;")
    public static class65 field1467 = class1.method17("(X", -127);

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lke;")
    public static class65 field1469 = class1.method17("leuchten1:", -126);

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lqd;")
    public static class100 field1465 = new class100(50);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lta;")
    public static class112 field1468;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILta;)V", line = 3)
    public static final void method452(int arg0, int arg1, class112 arg2) {
        field1449++;
        if (class89.field2366 == null) {
            class97.method813(255, (byte) 81, null, 0, 255, (byte) 0, true);
            class9.field165[arg0] = arg2;
            int var4 = 110 % ((3 - arg1) / 57);
        } else {
            class89.field2366.field998 = arg0 * 4 + 5;
            int var3 = class89.field2366.method329(144752608);
            arg2.method914(var3, -65);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method453(boolean arg0) {
        for (int var1 = 0; var1 < class4.field73; var1++) {
            int var10002 = class7.field130[var1]--;
            if (class7.field130[var1] >= -10) {
                class103 var3 = class81.field2154[var1];
                if (var3 == null) {
                    var3 = class103.method851(class70.field1809, class62.field1652[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class7.field130[var1] += var3.method852();
                    class81.field2154[var1] = var3;
                }
                if (class7.field130[var1] < 0) {
                    int var4 = class27.field706;
                    if (class90.field2390[var1] != 0) {
                        int var5 = (class90.field2390[var1] & 0xFF) * 128;
                        int var6 = class90.field2390[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class32.field833.field1067;
                        int var8 = class90.field2390[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class32.field833.field1070;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class7.field130[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class27.field706 / var5;
                    }
                    class96 var11 = var3.method850().method810(class94.field2494);
                    class25 var12 = class25.method199(var11, 100, var4);
                    var12.method210(class28.field742[var1] - 1);
                    class12.field245.method863(var12);
                    class7.field130[var1] = -100;
                }
            } else {
                class4.field73--;
                for (int var2 = var1; var2 < class4.field73; var2++) {
                    class62.field1652[var2] = class62.field1652[var2 + 1];
                    class81.field2154[var2] = class81.field2154[var2 + 1];
                    class28.field742[var2] = class28.field742[var2 + 1];
                    class7.field130[var2] = class7.field130[var2 + 1];
                    class90.field2390[var2] = class90.field2390[var2 + 1];
                }
                var1--;
            }
        }
        if (!arg0) {
            field1464 = null;
        }
        if (class39.field999 > 0) {
            class39.field999 -= 20;
            if (class39.field999 < 0) {
                class39.field999 = 0;
            }
            if (class39.field999 == 0 && class90.field2392 != 0 && class44.field1164 != -1) {
                class84.method759(0, (byte) -124, field1468, class90.field2392, 0, class44.field1164, false);
            }
        }
        field1458++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V", line = 143)
    public static final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class87 var5 = (class87) class13.field262.method421(1); var5 != null; var5 = (class87) class13.field262.method428(22743)) {
            if (var5.field2313 != -1 || var5.field2342 != null) {
                int var6 = 0;
                if (arg2 > var5.field2321) {
                    var6 += arg2 - var5.field2321;
                } else if (arg2 < var5.field2310) {
                    var6 += var5.field2310 - arg2;
                }
                if (var5.field2335 < arg3) {
                    var6 += arg3 - var5.field2335;
                } else if (arg3 < var5.field2341) {
                    var6 += var5.field2341 - arg3;
                }
                if (var5.field2305 < var6 - 64 || class27.field706 == 0 || var5.field2316 != arg1) {
                    if (var5.field2340 != null) {
                        class12.field245.method866(var5.field2340);
                        var5.field2340 = null;
                    }
                    if (var5.field2337 != null) {
                        class12.field245.method866(var5.field2337);
                        var5.field2337 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2305 - var6) * class27.field706 / var5.field2305;
                    if (var5.field2340 != null) {
                        var5.field2340.method205(var7);
                    } else if (var5.field2313 >= 0) {
                        class103 var8 = class103.method851(class70.field1809, var5.field2313, 0);
                        if (var8 != null) {
                            class96 var9 = var8.method850().method810(class94.field2494);
                            class25 var10 = class25.method199(var9, 100, var7);
                            var10.method210(-1);
                            class12.field245.method863(var10);
                            var5.field2340 = var10;
                        }
                    }
                    if (var5.field2337 != null) {
                        var5.field2337.method205(var7);
                        if (!var5.field2337.method214()) {
                            var5.field2337 = null;
                        }
                    } else if (var5.field2342 != null && (var5.field2333 -= arg0) <= 0) {
                        int var11 = (int) ((double) var5.field2342.length * Math.random());
                        class103 var12 = class103.method851(class70.field1809, var5.field2342[var11], 0);
                        if (var12 != null) {
                            class96 var13 = var12.method850().method810(class94.field2494);
                            class25 var14 = class25.method199(var13, 100, var7);
                            var14.method210(0);
                            class12.field245.method863(var14);
                            var5.field2333 = (int) (Math.random() * (double) (var5.field2307 - var5.field2311)) + var5.field2311;
                            var5.field2337 = var14;
                        }
                    }
                }
            }
        }
        field1456++;
        if (arg4 != -1) {
            field1469 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 275)
    public static final void method455(int arg0) {
        field1457++;
        class75.field2013.method793(arg0 ^ 0x16A3);
        if (arg0 != -5833) {
            field1465 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 300)
    public final void paint(Graphics arg0) {
        field1452++;
        this.field1450.paint(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 311)
    public final void update(Graphics arg0) {
        this.field1450.update(arg0);
        field1451++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 319)
    public static void method456(int arg0) {
        field1464 = null;
        field1467 = null;
        field1468 = null;
        field1466 = null;
        field1453 = null;
        field1465 = null;
        if (arg0 >= 55) {
            field1463 = null;
            field1469 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 348)
    public class56(Component arg0) {
        this.field1450 = arg0;
    }
}
