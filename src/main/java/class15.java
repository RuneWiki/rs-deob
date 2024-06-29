import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class15 {

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    private int field351 = 0;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    private int field355 = -1;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Le;")
    private class86 field338 = new class86();

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Z")
    public boolean field356 = false;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[[[I")
    private int[][][] field337;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[Lng;")
    private class63[] field349;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lij;")
    public static class50 field335 = class78.method578(124, "Mem:");

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lij;")
    public static class50 field336 = class78.method578(125, "welle2:");

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lij;")
    public static class50 field343 = class78.method578(127, ")1 ");

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    public static int[] field347 = new int[256];

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lij;")
    public static class50 field352 = class78.method578(124, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lda;")
    public static class22 field339;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method110(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class210.field3492[var1] = true;
        }
        int var2 = 97 / ((arg0 + 62) / 55);
        field340++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)Lth;")
    public static final class239 method111(int arg0, boolean arg1) {
        class239 var2 = (class239) client.field1524.method764((byte) 70, (long) arg0);
        field354++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class131.field2295.method190((byte) -82, class80.method585(-28002, arg0), class182.method1238(arg0, (byte) 43));
        class239 var4 = new class239();
        if (arg1) {
            method114(false);
        }
        var4.field4091 = arg0;
        if (var3 != null) {
            var4.method1627(-128, new class217(var3));
        }
        var4.method1618((byte) -123);
        if (var4.field4058 != -1) {
            var4.method1624(method111(var4.field4058, false), method111(var4.field4047, false), false);
        }
        if (var4.field4055 != -1) {
            var4.method1623(method111(var4.field4064, false), 0, method111(var4.field4055, false));
        }
        if (!class221.field3726 && var4.field4077) {
            var4.field4113 = 0;
            var4.field4063 = null;
            var4.field4094 = false;
            var4.field4103 = class89.field1700;
            var4.field4079 = null;
        }
        client.field1524.method765((byte) -124, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        for (int var2 = 0; var2 < this.field350; var2++) {
            this.field337[var2][0] = null;
            this.field337[var2][1] = null;
            this.field337[var2][2] = null;
            this.field337[var2] = null;
        }
        this.field349 = null;
        field342++;
        this.field337 = null;
        this.field338.method680((byte) -68);
        this.field338 = null;
        if (arg0 >= -112) {
            method114(false);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lda;Lda;Z)V")
    public static final void method113(class22 arg0, class22 arg1, boolean arg2) {
        field341++;
        class173.field2903 = arg0;
        class141.field2476 = arg1;
        class173.field2881 = class173.field2903.method180(arg2, 3);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static final void method114(boolean arg0) {
        field345++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class136.field2368 - 1); var2++) {
                if (class17.field379[var2] < 1000 && class17.field379[var2 + 1] > 1000) {
                    var1 = false;
                    class50 var3 = class36.field691[var2];
                    class36.field691[var2] = class36.field691[var2 + 1];
                    class36.field691[var2 + 1] = var3;
                    class50 var4 = class250.field4334[var2];
                    class250.field4334[var2] = class250.field4334[var2 + 1];
                    class250.field4334[var2 + 1] = var4;
                    int var5 = class41.field755[var2];
                    class41.field755[var2] = class41.field755[var2 + 1];
                    class41.field755[var2 + 1] = var5;
                    int var6 = class206.field3423[var2];
                    class206.field3423[var2] = class206.field3423[var2 + 1];
                    class206.field3423[var2 + 1] = var6;
                    short var7 = class17.field379[var2];
                    class17.field379[var2] = class17.field379[var2 + 1];
                    class17.field379[var2 + 1] = var7;
                    long var8 = class215.field3551[var2];
                    class215.field3551[var2] = class215.field3551[var2 + 1];
                    class215.field3551[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lr;Z)V")
    public static final void method115(class65 arg0, boolean arg1) {
        class132.field2311.method684(arg0, (byte) 109);
        while (true) {
            class65 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class65[][] var7;
            class65 var66;
            do {
                class65 var65;
                do {
                    class65 var64;
                    do {
                        class65 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class65) class132.field2311.method679((byte) -94);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1257);
                                            var3 = var2.field1232;
                                            var4 = var2.field1254;
                                            var5 = var2.field1255;
                                            var6 = var2.field1249;
                                            var7 = class59.field1089[var5];
                                            if (!var2.field1245) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class65 var8 = class59.field1089[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1257) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class65.field1229 && var3 > class250.field4331) {
                                                    class65 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1257 && (var9.field1245 || (var2.field1240 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class65.field1229 && var3 < class42.field780 - 1) {
                                                    class65 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1257 && (var10.field1245 || (var2.field1240 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class136.field2363 && var4 > class63.field1200) {
                                                    class65 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1257 && (var11.field1245 || (var2.field1240 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class136.field2363 && var4 < class54.field981 - 1) {
                                                    class65 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1257 && (var12.field1245 || (var2.field1240 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1245 = false;
                                            if (var2.field1241 != null) {
                                                class65 var13 = var2.field1241;
                                                if (var13.field1234 == null) {
                                                    if (var13.field1247 != null) {
                                                        if (class56.method439(0, var3, var4)) {
                                                            class243.method1663(var13.field1247, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, true);
                                                        } else {
                                                            class243.method1663(var13.field1247, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class56.method439(0, var3, var4)) {
                                                    class96.method726(var13.field1234, 0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, true);
                                                } else {
                                                    class96.method726(var13.field1234, 0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, false);
                                                }
                                                class55 var14 = var13.field1233;
                                                if (var14 != null) {
                                                    var14.field993.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var14.field986 - class97.field1815, var14.field989 - class17.field382, var14.field990 - class108.field1934, var14.field982);
                                                }
                                                for (int var15 = 0; var15 < var13.field1244; var15++) {
                                                    class106 var16 = var13.field1236[var15];
                                                    if (var16 != null) {
                                                        var16.field1901.method129(var16.field1903, class238.field4036, class60.field1119, class48.field863, class229.field3839, var16.field1917 - class97.field1815, var16.field1902 - class17.field382, var16.field1914 - class108.field1934, var16.field1905);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1234 == null) {
                                                if (var2.field1247 != null) {
                                                    if (class56.method439(var6, var3, var4)) {
                                                        class243.method1663(var2.field1247, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class243.method1663(var2.field1247, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, false);
                                                    }
                                                }
                                            } else if (class56.method439(var6, var3, var4)) {
                                                class96.method726(var2.field1234, var6, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1234.field1362 != 12345678 || class1.field6 && var5 <= class258.field4491) {
                                                    class96.method726(var2.field1234, var6, class238.field4036, class60.field1119, class48.field863, class229.field3839, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class102 var18 = var2.field1251;
                                                if (var18 != null && (var18.field1868 & 0xFFFFFFFF80000000L) != 0L) {
                                                    var18.field1870.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var18.field1878 - class97.field1815, var18.field1867 - class17.field382, var18.field1876 - class108.field1934, var18.field1868);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class55 var21 = var2.field1233;
                                            class139 var22 = var2.field1235;
                                            if (var21 != null || var22 != null) {
                                                if (class65.field1229 == var3) {
                                                    var19++;
                                                } else if (class65.field1229 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class136.field2363 == var4) {
                                                    var19 += 3;
                                                } else if (class136.field2363 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class85.field1646[var19];
                                                var2.field1248 = class196.field3255[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field992 & class155.field2695[var19]) == 0) {
                                                    var2.field1253 = 0;
                                                } else if (var21.field992 == 16) {
                                                    var2.field1253 = 3;
                                                    var2.field1246 = class119.field2092[var19];
                                                    var2.field1252 = 3 - var2.field1246;
                                                } else if (var21.field992 == 32) {
                                                    var2.field1253 = 6;
                                                    var2.field1246 = class87.field1690[var19];
                                                    var2.field1252 = 6 - var2.field1246;
                                                } else if (var21.field992 == 64) {
                                                    var2.field1253 = 12;
                                                    var2.field1246 = class207.field3442[var19];
                                                    var2.field1252 = 12 - var2.field1246;
                                                } else {
                                                    var2.field1253 = 9;
                                                    var2.field1246 = class184.field3026[var19];
                                                    var2.field1252 = 9 - var2.field1246;
                                                }
                                                if ((var21.field992 & var20) != 0 && !class140.method981(var6, var3, var4, var21.field992)) {
                                                    var21.field993.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var21.field986 - class97.field1815, var21.field989 - class17.field382, var21.field990 - class108.field1934, var21.field982);
                                                }
                                                if ((var21.field991 & var20) != 0 && !class140.method981(var6, var3, var4, var21.field991)) {
                                                    var21.field984.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var21.field986 - class97.field1815, var21.field989 - class17.field382, var21.field990 - class108.field1934, var21.field982);
                                                }
                                            }
                                            if (var22 != null && !class5.method37(var6, var3, var4, var22.field2415.method126())) {
                                                if ((var22.field2429 & var20) != 0) {
                                                    var22.field2415.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var22.field2420 + var22.field2423 - class97.field1815, var22.field2426 - class17.field382, var22.field2427 + var22.field2431 - class108.field1934, var22.field2425);
                                                } else if (var22.field2429 == 256) {
                                                    int var23 = var22.field2420 - class97.field1815;
                                                    int var24 = var22.field2426 - class17.field382;
                                                    int var25 = var22.field2427 - class108.field1934;
                                                    int var26 = var22.field2419;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2415.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var22.field2423 + var23, var24, var22.field2431 + var25, var22.field2425);
                                                    } else if (var22.field2424 != null) {
                                                        var22.field2424.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var23, var24, var25, var22.field2425);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class102 var29 = var2.field1251;
                                                if (var29 != null && (var29.field1868 & 0xFFFFFFFF80000000L) == 0L) {
                                                    var29.field1870.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var29.field1878 - class97.field1815, var29.field1867 - class17.field382, var29.field1876 - class108.field1934, var29.field1868);
                                                }
                                                class200 var30 = var2.field1237;
                                                if (var30 != null && var30.field3299 == 0) {
                                                    if (var30.field3300 != null) {
                                                        var30.field3300.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var30.field3301 - class97.field1815, var30.field3293 - class17.field382, var30.field3305 - class108.field1934, var30.field3303);
                                                    }
                                                    if (var30.field3291 != null) {
                                                        var30.field3291.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var30.field3301 - class97.field1815, var30.field3293 - class17.field382, var30.field3305 - class108.field1934, var30.field3303);
                                                    }
                                                    if (var30.field3294 != null) {
                                                        var30.field3294.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var30.field3301 - class97.field1815, var30.field3293 - class17.field382, var30.field3305 - class108.field1934, var30.field3303);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1240;
                                            if (var31 != 0) {
                                                if (var3 < class65.field1229 && (var31 & 0x4) != 0) {
                                                    class65 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1257) {
                                                        class132.field2311.method684(var32, (byte) 109);
                                                    }
                                                }
                                                if (var4 < class136.field2363 && (var31 & 0x2) != 0) {
                                                    class65 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1257) {
                                                        class132.field2311.method684(var33, (byte) 109);
                                                    }
                                                }
                                                if (var3 > class65.field1229 && (var31 & 0x1) != 0) {
                                                    class65 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1257) {
                                                        class132.field2311.method684(var34, (byte) 109);
                                                    }
                                                }
                                                if (var4 > class136.field2363 && (var31 & 0x8) != 0) {
                                                    class65 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1257) {
                                                        class132.field2311.method684(var35, (byte) 109);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1253 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1244; var37++) {
                                                if (class124.field2168 != var2.field1236[var37].field1908 && (var2.field1239[var37] & var2.field1253) == var2.field1246) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class55 var38 = var2.field1233;
                                                if (!class140.method981(var6, var3, var4, var38.field992)) {
                                                    var38.field993.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var38.field986 - class97.field1815, var38.field989 - class17.field382, var38.field990 - class108.field1934, var38.field982);
                                                }
                                                var2.field1253 = 0;
                                            }
                                        }
                                        if (!var2.field1242) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1244;
                                            var2.field1242 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class106 var42 = var2.field1236[var41];
                                                if (class124.field2168 != var42.field1908) {
                                                    for (int var43 = var42.field1913; var43 <= var42.field1907; var43++) {
                                                        for (int var44 = var42.field1906; var44 <= var42.field1919; var44++) {
                                                            class65 var45 = var7[var43][var44];
                                                            if (var45.field1245) {
                                                                var2.field1242 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1253 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1913) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1907) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1906) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1919) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1253) == var2.field1252) {
                                                                    var2.field1242 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class78.field1449[var40++] = var42;
                                                    int var47 = class65.field1229 - var42.field1913;
                                                    int var48 = var42.field1907 - class65.field1229;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class136.field2363 - var42.field1906;
                                                    int var50 = var42.field1919 - class136.field2363;
                                                    if (var50 > var49) {
                                                        var42.field1916 = var47 + var50;
                                                    } else {
                                                        var42.field1916 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class106 var54 = class78.field1449[var53];
                                                    if (class124.field2168 != var54.field1908) {
                                                        if (var54.field1916 > var51) {
                                                            var51 = var54.field1916;
                                                            var52 = var53;
                                                        } else if (var54.field1916 == var51) {
                                                            int var55 = var54.field1917 - class97.field1815;
                                                            int var56 = var54.field1914 - class108.field1934;
                                                            int var57 = class78.field1449[var52].field1917 - class97.field1815;
                                                            int var58 = class78.field1449[var52].field1914 - class108.field1934;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class106 var59 = class78.field1449[var52];
                                                var59.field1908 = class124.field2168;
                                                if (!class80.method588(var6, var59.field1913, var59.field1907, var59.field1906, var59.field1919, var59.field1901.method126())) {
                                                    var59.field1901.method129(var59.field1903, class238.field4036, class60.field1119, class48.field863, class229.field3839, var59.field1917 - class97.field1815, var59.field1902 - class17.field382, var59.field1914 - class108.field1934, var59.field1905);
                                                }
                                                for (int var60 = var59.field1913; var60 <= var59.field1907; var60++) {
                                                    for (int var61 = var59.field1906; var61 <= var59.field1919; var61++) {
                                                        class65 var62 = var7[var60][var61];
                                                        if (var62.field1253 != 0) {
                                                            class132.field2311.method684(var62, (byte) 109);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1257) {
                                                            class132.field2311.method684(var62, (byte) 109);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1242) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1242 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1257);
                            } while (var2.field1253 != 0);
                            if (var3 > class65.field1229 || var3 <= class250.field4331) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1257);
                        if (var3 < class65.field1229 || var3 >= class42.field780 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1257);
                    if (var4 > class136.field2363 || var4 <= class63.field1200) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1257);
                if (var4 < class136.field2363 || var4 >= class54.field981 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1257);
            var2.field1257 = false;
            class85.field1645--;
            class200 var67 = var2.field1237;
            if (var67 != null && var67.field3299 != 0) {
                if (var67.field3300 != null) {
                    var67.field3300.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var67.field3301 - class97.field1815, var67.field3293 - class17.field382 - var67.field3299, var67.field3305 - class108.field1934, var67.field3303);
                }
                if (var67.field3291 != null) {
                    var67.field3291.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var67.field3301 - class97.field1815, var67.field3293 - class17.field382 - var67.field3299, var67.field3305 - class108.field1934, var67.field3303);
                }
                if (var67.field3294 != null) {
                    var67.field3294.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var67.field3301 - class97.field1815, var67.field3293 - class17.field382 - var67.field3299, var67.field3305 - class108.field1934, var67.field3303);
                }
            }
            if (var2.field1248 != 0) {
                class139 var68 = var2.field1235;
                if (var68 != null && !class5.method37(var6, var3, var4, var68.field2415.method126())) {
                    if ((var68.field2429 & var2.field1248) != 0) {
                        var68.field2415.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var68.field2420 + var68.field2423 - class97.field1815, var68.field2426 - class17.field382, var68.field2427 + var68.field2431 - class108.field1934, var68.field2425);
                    } else if (var68.field2429 == 256) {
                        int var69 = var68.field2420 - class97.field1815;
                        int var70 = var68.field2426 - class17.field382;
                        int var71 = var68.field2427 - class108.field1934;
                        int var72 = var68.field2419;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2415.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var68.field2423 + var69, var70, var68.field2431 + var71, var68.field2425);
                        } else if (var68.field2424 != null) {
                            var68.field2424.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var69, var70, var71, var68.field2425);
                        }
                    }
                }
                class55 var75 = var2.field1233;
                if (var75 != null) {
                    if ((var75.field991 & var2.field1248) != 0 && !class140.method981(var6, var3, var4, var75.field991)) {
                        var75.field984.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var75.field986 - class97.field1815, var75.field989 - class17.field382, var75.field990 - class108.field1934, var75.field982);
                    }
                    if ((var75.field992 & var2.field1248) != 0 && !class140.method981(var6, var3, var4, var75.field992)) {
                        var75.field993.method129(0, class238.field4036, class60.field1119, class48.field863, class229.field3839, var75.field986 - class97.field1815, var75.field989 - class17.field382, var75.field990 - class108.field1934, var75.field982);
                    }
                }
            }
            if (var5 < class261.field4553 - 1) {
                class65 var76 = class59.field1089[var5 + 1][var3][var4];
                if (var76 != null && var76.field1257) {
                    class132.field2311.method684(var76, (byte) 109);
                }
            }
            if (var3 < class65.field1229) {
                class65 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1257) {
                    class132.field2311.method684(var77, (byte) 109);
                }
            }
            if (var4 < class136.field2363) {
                class65 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1257) {
                    class132.field2311.method684(var78, (byte) 109);
                }
            }
            if (var3 > class65.field1229) {
                class65 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1257) {
                    class132.field2311.method684(var79, (byte) 109);
                }
            }
            if (var4 > class136.field2363) {
                class65 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1257) {
                    class132.field2311.method684(var80, (byte) 109);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)Lek;")
    public static final class169 method116(byte arg0) {
        field346++;
        int var1 = -122 % ((67 - arg0) / 52);
        int var2 = class46.field836[0] * class164.field2805[0];
        byte[] var3 = class31.field628[0];
        class169 var7;
        if (class240.field4132[0]) {
            byte[] var4 = class174.field2911[0];
            int[] var5 = new int[var2];
            for (int var6 = 0; var6 < var2; var6++) {
                var5[var6] = class29.method261(class51.method413(var4[var6] << 24, -16777216), class114.field1996[class51.method413(var3[var6], 255)]);
            }
            var7 = new class171(class89.field1707, class116.field2024, class20.field421[0], class2.field27[0], class46.field836[0], class164.field2805[0], var5);
        } else {
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
                var8[var9] = class114.field1996[class51.method413(var3[var9], 255)];
            }
            var7 = new class169(class89.field1707, class116.field2024, class20.field421[0], class2.field27[0], class46.field836[0], class164.field2805[0], var8);
        }
        class261.method1759(true);
        return var7;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method117(int arg0, byte arg1) {
        if (arg1 > -12) {
            this.field351 = -48;
        }
        field348++;
        if (this.field350 == this.field334) {
            this.field356 = this.field349[arg0] == null;
            this.field349[arg0] = class97.field1811;
            return this.field337[arg0];
        } else if (this.field350 == 1) {
            this.field356 = this.field355 != arg0;
            this.field355 = arg0;
            return this.field337[0];
        } else {
            class63 var3 = this.field349[arg0];
            if (var3 == null) {
                this.field356 = true;
                if (this.field350 > this.field351) {
                    var3 = new class63(arg0, this.field351);
                    this.field351++;
                } else {
                    class63 var4 = (class63) this.field338.method687(0);
                    var3 = new class63(arg0, var4.field1206);
                    this.field349[var4.field1203] = null;
                    var4.method267(108);
                }
                this.field349[arg0] = var3;
            } else {
                this.field356 = false;
            }
            this.field338.method677(var3, -1);
            return this.field337[var3.field1206];
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V")
    public static void method118(boolean arg0) {
        field339 = null;
        field343 = null;
        if (arg0) {
            field352 = null;
            field347 = null;
            field335 = null;
            field336 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(Z)[[[I")
    public final int[][][] method119(boolean arg0) {
        if (arg0) {
            method118(false);
        }
        field333++;
        if (this.field350 != this.field334) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field350; var2++) {
            this.field349[var2] = class97.field1811;
        }
        return this.field337;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(III)V")
    public class15(int arg0, int arg1, int arg2) {
        this.field350 = arg0;
        this.field337 = new int[this.field350][3][arg2];
        this.field334 = arg1;
        this.field349 = new class63[this.field334];
    }
}
