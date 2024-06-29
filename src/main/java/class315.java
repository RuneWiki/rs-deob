import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class315 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field5355 = 7759444;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lph;")
    public static class229 field5356 = class266.method1858("Chargement des sprites )2 ", 0);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lph;")
    public static class229 field5358 = class266.method1858("Schrifts-=tze geladen)3", 0);

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
    public static boolean field5363 = false;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lph;")
    private static class229 field5361 = class266.method1858("Loading wordpack )2 ", 0);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lph;")
    public static class229 field5360 = field5361;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 6)
    public static void method2136(int arg0) {
        field5361 = null;
        field5360 = null;
        if (arg0 < -102) {
            field5358 = null;
            field5356 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V", line = 19)
    public static final void method2137(byte arg0, Object[] arg1, int[] arg2) {
        if (arg0 != 108) {
            method2136(115);
        }
        field5359++;
        class301.method2031(arg1, 0, arg2, -111, arg2.length - 1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z", line = 30)
    private static final boolean method2138(int arg0, int arg1) {
        if (arg1 != 1158) {
            method2138(-123, -38);
        }
        field5357++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lvl;IB)V", line = 58)
    public static final void method2139(class157 arg0, int arg1, byte arg2) {
        field5364++;
        Object[] var3 = arg0.field2552;
        int var4 = (Integer) var3[0];
        class189 var5 = class43.method324(var4, false);
        if (var5 == null) {
            return;
        }
        class37.field606 = 0;
        int var6 = 0;
        int[] var7 = var5.field3069;
        int var8 = 0;
        int[] var9 = var5.field3062;
        byte var10 = -1;
        int var11 = -1;
        try {
            if (arg2 > 126) {
                class80.field1321 = new int[var5.field3064];
                class161.field2599 = new class229[var5.field3075];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg0.field2554;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg0.field2553;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg0.field2551 == null ? -1 : arg0.field2551.field4948;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg0.field2548;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg0.field2551 == null ? -1 : arg0.field2551.field4987;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg0.field2547 == null ? -1 : arg0.field2547.field4948;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg0.field2547 == null ? -1 : arg0.field2547.field4987;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg0.field2556;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg0.field2545;
                        }
                        class80.field1321[var12++] = var15;
                    } else if (var3[var14] instanceof class229) {
                        class229 var16 = (class229) var3[var14];
                        if (var16.method1618(false, class195.field3267)) {
                            var16 = arg0.field2549;
                        }
                        class161.field2599[var13++] = var16;
                    }
                }
                int var17 = 0;
                label4165: while (true) {
                    var17++;
                    if (var17 > arg1) {
                        throw new RuntimeException("slow");
                    }
                    var11++;
                    int var505 = var7[var11];
                    if (var505 < 100) {
                        if (var505 == 0) {
                            class234.field3858[var6++] = var9[var11];
                            continue;
                        }
                        if (var505 == 1) {
                            int var18 = var9[var11];
                            class234.field3858[var6++] = class166.field2711[var18];
                            continue;
                        }
                        if (var505 == 2) {
                            int var19 = var9[var11];
                            var6--;
                            class157.method1127(class234.field3858[var6], 28232, var19);
                            continue;
                        }
                        if (var505 == 3) {
                            class135.field2194[var8++] = var5.field3061[var11];
                            continue;
                        }
                        if (var505 == 6) {
                            var11 += var9[var11];
                            continue;
                        }
                        if (var505 == 7) {
                            var6 -= 2;
                            if (class234.field3858[var6 + 1] != class234.field3858[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var505 == 8) {
                            var6 -= 2;
                            if (class234.field3858[var6 + 1] == class234.field3858[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var505 == 9) {
                            var6 -= 2;
                            if (class234.field3858[var6] < class234.field3858[var6 + 1]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var505 == 10) {
                            var6 -= 2;
                            if (class234.field3858[var6 + 1] < class234.field3858[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var505 == 21) {
                            if (class37.field606 == 0) {
                                return;
                            }
                            class16 var20 = class299.field4857[--class37.field606];
                            var11 = var20.field199;
                            var5 = var20.field198;
                            class80.field1321 = var20.field197;
                            var9 = var5.field3062;
                            var7 = var5.field3069;
                            class161.field2599 = var20.field192;
                            continue;
                        }
                        if (var505 == 25) {
                            int var21 = var9[var11];
                            class234.field3858[var6++] = class218.method1527(var21, (byte) -125);
                            continue;
                        }
                        if (var505 == 27) {
                            int var22 = var9[var11];
                            var6--;
                            class317.method2145(var22, class234.field3858[var6], 103);
                            continue;
                        }
                        if (var505 == 31) {
                            var6 -= 2;
                            if (class234.field3858[var6 + 1] >= class234.field3858[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var505 == 32) {
                            var6 -= 2;
                            if (class234.field3858[var6] >= class234.field3858[var6 + 1]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var505 == 33) {
                            class234.field3858[var6++] = class80.field1321[var9[var11]];
                            continue;
                        }
                        int var10001;
                        if (var505 == 34) {
                            var10001 = var9[var11];
                            var6--;
                            class80.field1321[var10001] = class234.field3858[var6];
                            continue;
                        }
                        if (var505 == 35) {
                            class135.field2194[var8++] = class161.field2599[var9[var11]];
                            continue;
                        }
                        if (var505 == 36) {
                            var10001 = var9[var11];
                            var8--;
                            class161.field2599[var10001] = class135.field2194[var8];
                            continue;
                        }
                        if (var505 == 37) {
                            int var23 = var9[var11];
                            var8 -= var23;
                            class229 var24 = class295.method2001((byte) -106, class135.field2194, var8, var23);
                            class135.field2194[var8++] = var24;
                            continue;
                        }
                        if (var505 == 38) {
                            var6--;
                            continue;
                        }
                        if (var505 == 39) {
                            var8--;
                            continue;
                        }
                        if (var505 == 40) {
                            int var25 = var9[var11];
                            class189 var26 = class43.method324(var25, false);
                            class229[] var27 = new class229[var26.field3075];
                            int[] var28 = new int[var26.field3064];
                            for (int var29 = 0; var29 < var26.field3076; var29++) {
                                var28[var29] = class234.field3858[var6 + var29 - var26.field3076];
                            }
                            for (int var30 = 0; var30 < var26.field3066; var30++) {
                                var27[var30] = class135.field2194[var8 + var30 - var26.field3066];
                            }
                            var8 -= var26.field3066;
                            var6 -= var26.field3076;
                            class16 var31 = new class16();
                            var31.field192 = class161.field2599;
                            var31.field199 = var11;
                            var31.field198 = var5;
                            var31.field197 = class80.field1321;
                            if (class37.field606 >= class299.field4857.length) {
                                throw new RuntimeException();
                            }
                            var5 = var26;
                            class299.field4857[class37.field606++] = var31;
                            class80.field1321 = var28;
                            var7 = var26.field3069;
                            var11 = -1;
                            class161.field2599 = var27;
                            var9 = var26.field3062;
                            continue;
                        }
                        if (var505 == 42) {
                            class234.field3858[var6++] = class237.field3894[var9[var11]];
                            continue;
                        }
                        if (var505 == 43) {
                            int var32 = var9[var11];
                            var6--;
                            class237.field3894[var32] = class234.field3858[var6];
                            class203.method1422(var32, true);
                            continue;
                        }
                        if (var505 == 44) {
                            int var33 = var9[var11] >> 16;
                            int var34 = var9[var11] & 0xFFFF;
                            var6--;
                            int var35 = class234.field3858[var6];
                            if (var35 >= 0 && var35 <= 5000) {
                                byte var36 = -1;
                                if (var34 == 105) {
                                    var36 = 0;
                                }
                                class215.field3542[var33] = var35;
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var35) {
                                        continue label4165;
                                    }
                                    class8.field107[var33][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var505 == 45) {
                            int var38 = var9[var11];
                            var6--;
                            int var39 = class234.field3858[var6];
                            if (var39 >= 0 && class215.field3542[var38] > var39) {
                                class234.field3858[var6++] = class8.field107[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var505 == 46) {
                            int var40 = var9[var11];
                            var6 -= 2;
                            int var41 = class234.field3858[var6];
                            if (var41 >= 0 && var41 < class215.field3542[var40]) {
                                class8.field107[var40][var41] = class234.field3858[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var505 == 47) {
                            class229 var42 = class241.field3992[var9[var11]];
                            if (var42 == null) {
                                var42 = class216.field3551;
                            }
                            class135.field2194[var8++] = var42;
                            continue;
                        }
                        if (var505 == 48) {
                            int var43 = var9[var11];
                            var8--;
                            class241.field3992[var43] = class135.field2194[var8];
                            class83.method609(15681, var43);
                            continue;
                        }
                        if (var505 == 51) {
                            class97 var44 = var5.field3070[var9[var11]];
                            var6--;
                            class295 var45 = (class295) var44.method713(3365, (long) class234.field3858[var6]);
                            if (var45 != null) {
                                var11 += var45.field4829;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var9[var11] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var505 < 300) {
                        if (var505 == 100) {
                            var6 -= 3;
                            int var484 = class234.field3858[var6 + 1];
                            int var485 = class234.field3858[var6 + 2];
                            int var486 = class234.field3858[var6];
                            if (var484 == 0) {
                                throw new RuntimeException();
                            }
                            class301 var487 = class206.method1440(var486, (byte) -68);
                            if (var487.field4955 == null) {
                                var487.field4955 = new class301[var485 + 1];
                            }
                            if (var485 >= var487.field4955.length) {
                                class301[] var488 = new class301[var485 + 1];
                                for (int var489 = 0; var489 < var487.field4955.length; var489++) {
                                    var488[var489] = var487.field4955[var489];
                                }
                                var487.field4955 = var488;
                            }
                            if (var485 > 0 && var487.field4955[var485 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var485 - 1));
                            }
                            class301 var490 = new class301();
                            var490.field5040 = var490.field4948 = var487.field4948;
                            var490.field4987 = var485;
                            var490.field5043 = true;
                            var490.field4920 = var484;
                            var487.field4955[var485] = var490;
                            if (var46) {
                                class30.field487 = var490;
                            } else {
                                class75.field1261 = var490;
                            }
                            class296.method2006(var487, 122);
                            continue;
                        }
                        if (var505 == 101) {
                            class301 var491 = var46 ? class30.field487 : class75.field1261;
                            if (var491.field4987 == -1) {
                                if (var46) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class301 var492 = class206.method1440(var491.field4948, (byte) -68);
                            var492.field4955[var491.field4987] = null;
                            class296.method2006(var492, 124);
                            continue;
                        }
                        if (var505 == 102) {
                            var6--;
                            class301 var493 = class206.method1440(class234.field3858[var6], (byte) -68);
                            var493.field4955 = null;
                            class296.method2006(var493, 125);
                            continue;
                        }
                        if (var505 == 200) {
                            var6 -= 2;
                            int var494 = class234.field3858[var6 + 1];
                            int var495 = class234.field3858[var6];
                            class301 var496 = class167.method1224(var494, 113, var495);
                            if (var496 != null && var494 != -1) {
                                class234.field3858[var6++] = 1;
                                if (var46) {
                                    class30.field487 = var496;
                                } else {
                                    class75.field1261 = var496;
                                }
                                continue;
                            }
                            class234.field3858[var6++] = 0;
                            continue;
                        }
                        if (var505 == 201) {
                            var6--;
                            int var497 = class234.field3858[var6];
                            class301 var498 = class206.method1440(var497, (byte) -68);
                            if (var498 == null) {
                                class234.field3858[var6++] = 0;
                            } else {
                                class234.field3858[var6++] = 1;
                                if (var46) {
                                    class30.field487 = var498;
                                } else {
                                    class75.field1261 = var498;
                                }
                            }
                            continue;
                        }
                    } else if (var505 < 500) {
                        if (var505 == 403) {
                            var6 -= 2;
                            int var47 = class234.field3858[var6];
                            int var48 = class234.field3858[var6 + 1];
                            if (var47 >= 7) {
                                var47 -= 7;
                            }
                            class230.field3820.field3446.method964((byte) 53, var48, var47);
                            continue;
                        }
                        if (var505 == 404) {
                            var6 -= 2;
                            int var49 = class234.field3858[var6];
                            int var50 = class234.field3858[var6 + 1];
                            class230.field3820.field3446.method971(3, var49, var50);
                            continue;
                        }
                        if (var505 == 410) {
                            var6--;
                            boolean var51 = class234.field3858[var6] != 0;
                            class230.field3820.field3446.method968((byte) 88, var51);
                            continue;
                        }
                    } else if (var505 >= 1000 && var505 < 1100 || var505 >= 2000 && var505 < 2100) {
                        class301 var478;
                        if (var505 < 2000) {
                            var478 = var46 ? class30.field487 : class75.field1261;
                        } else {
                            var6--;
                            var478 = class206.method1440(class234.field3858[var6], (byte) -68);
                            var505 -= 1000;
                        }
                        if (var505 == 1000) {
                            var6 -= 4;
                            var478.field4931 = class234.field3858[var6];
                            var478.field4896 = class234.field3858[var6 + 1];
                            int var479 = class234.field3858[var6 + 3];
                            int var480 = class234.field3858[var6 + 2];
                            if (var480 < 0) {
                                var480 = 0;
                            } else if (var480 > 5) {
                                var480 = 5;
                            }
                            if (var479 < 0) {
                                var479 = 0;
                            } else if (var479 > 5) {
                                var479 = 5;
                            }
                            var478.field5039 = (byte) var479;
                            var478.field4898 = (byte) var480;
                            class296.method2006(var478, 121);
                            class198.method1394(var478, 327680);
                            if (var478.field4987 == -1) {
                                class93.method698(500, var478.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1001) {
                            var6 -= 4;
                            var478.field5037 = class234.field3858[var6];
                            var478.field5026 = class234.field3858[var6 + 1];
                            var478.field4960 = 0;
                            var478.field4994 = 0;
                            int var481 = class234.field3858[var6 + 3];
                            int var482 = class234.field3858[var6 + 2];
                            if (var481 < 0) {
                                var481 = 0;
                            } else if (var481 > 4) {
                                var481 = 4;
                            }
                            if (var482 < 0) {
                                var482 = 0;
                            } else if (var482 > 4) {
                                var482 = 4;
                            }
                            var478.field4956 = (byte) var482;
                            var478.field4957 = (byte) var481;
                            class296.method2006(var478, 123);
                            class198.method1394(var478, 327680);
                            if (var478.field4920 == 0) {
                                class103.method787(false, var478, 75);
                            }
                            continue;
                        }
                        if (var505 == 1003) {
                            var6--;
                            boolean var483 = class234.field3858[var6] == 1;
                            if (var483 != var478.field4990) {
                                var478.field4990 = var483;
                                class296.method2006(var478, 126);
                            }
                            if (var478.field4987 == -1) {
                                class224.method1561(var478.field4948, (byte) 125);
                            }
                            continue;
                        }
                        if (var505 == 1004) {
                            var6 -= 2;
                            var478.field4927 = class234.field3858[var6];
                            var478.field5027 = class234.field3858[var6 + 1];
                            class296.method2006(var478, 126);
                            class198.method1394(var478, 327680);
                            if (var478.field4920 == 0) {
                                class103.method787(false, var478, 116);
                            }
                            continue;
                        }
                    } else if (var505 >= 1100 && var505 < 1200 || var505 >= 2100 && var505 < 2200) {
                        class301 var52;
                        if (var505 >= 2000) {
                            var505 -= 1000;
                            var6--;
                            var52 = class206.method1440(class234.field3858[var6], (byte) -68);
                        } else {
                            var52 = var46 ? class30.field487 : class75.field1261;
                        }
                        if (var505 == 1100) {
                            var6 -= 2;
                            var52.field4937 = class234.field3858[var6];
                            if ((var52.field5006 - var52.field4923) < var52.field4937) {
                                var52.field4937 = var52.field5006 - var52.field4923;
                            }
                            if (var52.field4937 < 0) {
                                var52.field4937 = 0;
                            }
                            var52.field4897 = class234.field3858[var6 + 1];
                            if ((var52.field4877 - var52.field4882) < var52.field4897) {
                                var52.field4897 = var52.field4877 - var52.field4882;
                            }
                            if (var52.field4897 < 0) {
                                var52.field4897 = 0;
                            }
                            class296.method2006(var52, 125);
                            if (var52.field4987 == -1) {
                                class138.method997(var52.field4948, true);
                            }
                            continue;
                        }
                        if (var505 == 1101) {
                            var6--;
                            var52.field4926 = class234.field3858[var6];
                            class296.method2006(var52, 125);
                            if (var52.field4987 == -1) {
                                class30.method233((byte) 106, var52.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1102) {
                            var6--;
                            var52.field4919 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 122);
                            continue;
                        }
                        if (var505 == 1103) {
                            var6--;
                            var52.field4986 = class234.field3858[var6];
                            class296.method2006(var52, 124);
                            continue;
                        }
                        if (var505 == 1104) {
                            var6--;
                            var52.field4982 = class234.field3858[var6];
                            class296.method2006(var52, 126);
                            continue;
                        }
                        if (var505 == 1105) {
                            var6--;
                            var52.field4895 = class234.field3858[var6];
                            class296.method2006(var52, 123);
                            continue;
                        }
                        if (var505 == 1106) {
                            var6--;
                            var52.field4978 = class234.field3858[var6];
                            class296.method2006(var52, 124);
                            continue;
                        }
                        if (var505 == 1107) {
                            var6--;
                            var52.field4975 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 122);
                            continue;
                        }
                        if (var505 == 1108) {
                            var52.field5016 = 1;
                            var6--;
                            var52.field4932 = class234.field3858[var6];
                            class296.method2006(var52, 126);
                            if (var52.field4987 == -1) {
                                class15.method86(0, var52.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1109) {
                            var6 -= 6;
                            var52.field4894 = class234.field3858[var6];
                            var52.field4951 = class234.field3858[var6 + 1];
                            var52.field5034 = class234.field3858[var6 + 2];
                            var52.field4916 = class234.field3858[var6 + 3];
                            var52.field4918 = class234.field3858[var6 + 4];
                            var52.field4933 = class234.field3858[var6 + 5];
                            class296.method2006(var52, 120);
                            if (var52.field4987 == -1) {
                                class211.method1485((byte) -17, var52.field4948);
                                class256.method1782(var52.field4948, -23301);
                            }
                            continue;
                        }
                        if (var505 == 1110) {
                            var6--;
                            int var53 = class234.field3858[var6];
                            if (var52.field4973 != var53) {
                                var52.field4950 = 0;
                                var52.field4973 = var53;
                                var52.field5000 = 0;
                                class296.method2006(var52, 125);
                            }
                            if (var52.field4987 == -1) {
                                class72.method563(true, var52.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1111) {
                            var6--;
                            var52.field4966 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 123);
                            continue;
                        }
                        if (var505 == 1112) {
                            var8--;
                            class229 var54 = class135.field2194[var8];
                            if (!var54.method1618(false, var52.field4963)) {
                                var52.field4963 = var54;
                                class296.method2006(var52, 124);
                            }
                            if (var52.field4987 == -1) {
                                class239.method1688(3, var52.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1113) {
                            var6--;
                            var52.field5010 = class234.field3858[var6];
                            class296.method2006(var52, 122);
                            continue;
                        }
                        if (var505 == 1114) {
                            var6 -= 3;
                            var52.field5021 = class234.field3858[var6];
                            var52.field4915 = class234.field3858[var6 + 1];
                            var52.field4943 = class234.field3858[var6 + 2];
                            class296.method2006(var52, 121);
                            continue;
                        }
                        if (var505 == 1115) {
                            var6--;
                            var52.field4907 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 125);
                            continue;
                        }
                        if (var505 == 1116) {
                            var6--;
                            var52.field4912 = class234.field3858[var6];
                            class296.method2006(var52, 124);
                            continue;
                        }
                        if (var505 == 1117) {
                            var6--;
                            var52.field4925 = class234.field3858[var6];
                            class296.method2006(var52, 120);
                            continue;
                        }
                        if (var505 == 1118) {
                            var6--;
                            var52.field4995 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 125);
                            continue;
                        }
                        if (var505 == 1119) {
                            var6--;
                            var52.field5007 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 127);
                            continue;
                        }
                        if (var505 == 1120) {
                            var6 -= 2;
                            var52.field5006 = class234.field3858[var6];
                            var52.field4877 = class234.field3858[var6 + 1];
                            class296.method2006(var52, 121);
                            if (var52.field4920 == 0) {
                                class103.method787(false, var52, 102);
                            }
                            continue;
                        }
                        if (var505 == 1121) {
                            var6 -= 2;
                            var52.field4939 = (short) class234.field3858[var6];
                            var52.field4976 = (short) class234.field3858[var6 + 1];
                            class296.method2006(var52, 124);
                            continue;
                        }
                        if (var505 == 1122) {
                            var6--;
                            var52.field4903 = class234.field3858[var6] == 1;
                            class296.method2006(var52, 124);
                            continue;
                        }
                        if (var505 == 1123) {
                            var6--;
                            var52.field4933 = class234.field3858[var6];
                            class296.method2006(var52, 121);
                            if (var52.field4987 == -1) {
                                class211.method1485((byte) 124, var52.field4948);
                            }
                            continue;
                        }
                    } else if (!(var505 < 1200 || var505 >= 1300) || !(var505 < 2200 || var505 >= 2300)) {
                        class301 var474;
                        if (var505 < 2000) {
                            var474 = var46 ? class30.field487 : class75.field1261;
                        } else {
                            var6--;
                            var474 = class206.method1440(class234.field3858[var6], (byte) -68);
                            var505 -= 1000;
                        }
                        class296.method2006(var474, 120);
                        if (var505 == 1200 || var505 == 1205) {
                            var6 -= 2;
                            int var475 = class234.field3858[var6 + 1];
                            int var476 = class234.field3858[var6];
                            if (var474.field4987 == -1) {
                                class112.method853(var474.field4948, (byte) 58);
                                class211.method1485((byte) 114, var474.field4948);
                                class256.method1782(var474.field4948, -23301);
                            }
                            if (var476 == -1) {
                                var474.field5009 = -1;
                                var474.field4932 = -1;
                                var474.field5016 = 1;
                            } else {
                                var474.field5009 = var476;
                                var474.field5002 = var475;
                                class191 var477 = class124.method920(-84, var476);
                                var474.field5034 = var477.field3157;
                                var474.field4951 = var477.field3151;
                                var474.field4918 = var477.field3140;
                                var474.field4933 = var477.field3161;
                                var474.field4894 = var477.field3136;
                                var474.field4916 = var477.field3132;
                                if (var474.field4994 > 0) {
                                    var474.field4933 = var474.field4933 * 32 / var474.field4994;
                                } else if (var474.field5037 > 0) {
                                    var474.field4933 = var474.field4933 * 32 / var474.field5037;
                                }
                                if (var505 == 1205) {
                                    var474.field4945 = false;
                                } else {
                                    var474.field4945 = true;
                                }
                            }
                            continue;
                        }
                        if (var505 == 1201) {
                            var474.field5016 = 2;
                            var6--;
                            var474.field4932 = class234.field3858[var6];
                            if (var474.field4987 == -1) {
                                class15.method86(0, var474.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1202) {
                            var474.field5016 = 3;
                            var474.field4932 = class230.field3820.field3446.method970((byte) -18);
                            if (var474.field4987 == -1) {
                                class15.method86(0, var474.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1203) {
                            var474.field5016 = 6;
                            var6--;
                            var474.field4932 = class234.field3858[var6];
                            if (var474.field4987 == -1) {
                                class15.method86(0, var474.field4948);
                            }
                            continue;
                        }
                        if (var505 == 1204) {
                            var474.field5016 = 5;
                            var6--;
                            var474.field4932 = class234.field3858[var6];
                            if (var474.field4987 == -1) {
                                class15.method86(0, var474.field4948);
                            }
                            continue;
                        }
                    } else if (var505 >= 1300 && var505 < 1400 || var505 >= 2300 && var505 < 2400) {
                        class301 var55;
                        if (var505 < 2000) {
                            var55 = var46 ? class30.field487 : class75.field1261;
                        } else {
                            var6--;
                            var55 = class206.method1440(class234.field3858[var6], (byte) -68);
                            var505 -= 1000;
                        }
                        if (var505 == 1300) {
                            var6--;
                            int var56 = class234.field3858[var6] - 1;
                            if (var56 >= 0 && var56 <= 9) {
                                var8--;
                                var55.method2034(var56, class135.field2194[var8], (byte) -89);
                                continue;
                            }
                            var8--;
                            continue;
                        }
                        if (var505 == 1301) {
                            var6 -= 2;
                            int var57 = class234.field3858[var6];
                            int var58 = class234.field3858[var6 + 1];
                            var55.field5028 = class167.method1224(var58, 126, var57);
                            continue;
                        }
                        if (var505 == 1302) {
                            var6--;
                            var55.field4997 = class234.field3858[var6] == 1;
                            continue;
                        }
                        if (var505 == 1303) {
                            var6--;
                            var55.field4989 = class234.field3858[var6];
                            continue;
                        }
                        if (var505 == 1304) {
                            var6--;
                            var55.field4911 = class234.field3858[var6];
                            continue;
                        }
                        if (var505 == 1305) {
                            var8--;
                            var55.field4913 = class135.field2194[var8];
                            continue;
                        }
                        if (var505 == 1306) {
                            var8--;
                            var55.field4881 = class135.field2194[var8];
                            continue;
                        }
                        if (var505 == 1307) {
                            var55.field4902 = null;
                            continue;
                        }
                    } else {
                        if (var505 >= 1400 && var505 < 1500 || var505 >= 2400 && var505 < 2500) {
                            class301 var467;
                            if (var505 >= 2000) {
                                var505 -= 1000;
                                var6--;
                                var467 = class206.method1440(class234.field3858[var6], (byte) -68);
                            } else {
                                var467 = var46 ? class30.field487 : class75.field1261;
                            }
                            var8--;
                            class229 var468 = class135.field2194[var8];
                            int[] var469 = null;
                            if (var468.method1642(16) > 0 && var468.method1598(var468.method1642(47) - 1, 61) == 89) {
                                var6--;
                                int var470 = class234.field3858[var6];
                                if (var470 > 0) {
                                    var469 = new int[var470];
                                    while (var470-- > 0) {
                                        var6--;
                                        var469[var470] = class234.field3858[var6];
                                    }
                                }
                                var468 = var468.method1623(0, -30201, var468.method1642(91) - 1);
                            }
                            Object[] var471 = new Object[var468.method1642(-109) + 1];
                            for (int var472 = var471.length - 1; var472 >= 1; var472--) {
                                if (var468.method1598(var472 - 1, 61) == 115) {
                                    var8--;
                                    var471[var472] = class135.field2194[var8];
                                } else {
                                    var6--;
                                    var471[var472] = Integer.valueOf(class234.field3858[var6]);
                                }
                            }
                            var6--;
                            int var473 = class234.field3858[var6];
                            if (var473 == -1) {
                                var471 = null;
                            } else {
                                var471[0] = Integer.valueOf(var473);
                            }
                            var467.field4921 = true;
                            if (var505 == 1400) {
                                var467.field4890 = var471;
                            } else if (var505 == 1401) {
                                var467.field5031 = var471;
                            } else if (var505 == 1402) {
                                var467.field4938 = var471;
                            } else if (var505 == 1403) {
                                var467.field5038 = var471;
                            } else if (var505 == 1404) {
                                var467.field4998 = var471;
                            } else if (var505 == 1405) {
                                var467.field4887 = var471;
                            } else if (var505 == 1406) {
                                var467.field4984 = var471;
                            } else if (var505 == 1407) {
                                var467.field5001 = var471;
                                var467.field4947 = var469;
                            } else if (var505 == 1408) {
                                var467.field4905 = var471;
                            } else if (var505 == 1409) {
                                var467.field5036 = var471;
                            } else if (var505 == 1410) {
                                var467.field4971 = var471;
                            } else if (var505 == 1411) {
                                var467.field4972 = var471;
                            } else if (var505 == 1412) {
                                var467.field5045 = var471;
                            } else if (var505 == 1414) {
                                var467.field4953 = var469;
                                var467.field4878 = var471;
                            } else if (var505 == 1415) {
                                var467.field4942 = var471;
                                var467.field5018 = var469;
                            } else if (var505 == 1416) {
                                var467.field4967 = var471;
                            } else if (var505 == 1417) {
                                var467.field5003 = var471;
                            } else if (var505 == 1418) {
                                var467.field4961 = var471;
                            } else if (var505 == 1419) {
                                var467.field4889 = var471;
                            } else if (var505 == 1420) {
                                var467.field4949 = var471;
                            } else if (var505 == 1421) {
                                var467.field4954 = var471;
                            } else if (var505 == 1422) {
                                var467.field4985 = var471;
                            } else if (var505 == 1423) {
                                var467.field4914 = var471;
                            } else if (var505 == 1424) {
                                var467.field5015 = var471;
                            } else if (var505 == 1425) {
                                var467.field4893 = var471;
                            } else if (var505 == 1426) {
                                var467.field4946 = var471;
                            } else if (var505 == 1427) {
                                var467.field5048 = var471;
                            } else if (var505 == 1428) {
                                var467.field4930 = var469;
                                var467.field4884 = var471;
                            } else if (var505 == 1429) {
                                var467.field5022 = var471;
                                var467.field5042 = var469;
                            }
                            continue;
                        }
                        if (var505 < 1600) {
                            class301 var59 = var46 ? class30.field487 : class75.field1261;
                            if (var505 == 1500) {
                                class234.field3858[var6++] = var59.field5049;
                                continue;
                            }
                            if (var505 == 1501) {
                                class234.field3858[var6++] = var59.field4991;
                                continue;
                            }
                            if (var505 == 1502) {
                                class234.field3858[var6++] = var59.field4923;
                                continue;
                            }
                            if (var505 == 1503) {
                                class234.field3858[var6++] = var59.field4882;
                                continue;
                            }
                            if (var505 == 1504) {
                                class234.field3858[var6++] = var59.field4990 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 1505) {
                                class234.field3858[var6++] = var59.field5040;
                                continue;
                            }
                        } else if (var505 < 1700) {
                            class301 var60 = var46 ? class30.field487 : class75.field1261;
                            if (var505 == 1600) {
                                class234.field3858[var6++] = var60.field4937;
                                continue;
                            }
                            if (var505 == 1601) {
                                class234.field3858[var6++] = var60.field4897;
                                continue;
                            }
                            if (var505 == 1602) {
                                class135.field2194[var8++] = var60.field4963;
                                continue;
                            }
                            if (var505 == 1603) {
                                class234.field3858[var6++] = var60.field5006;
                                continue;
                            }
                            if (var505 == 1604) {
                                class234.field3858[var6++] = var60.field4877;
                                continue;
                            }
                            if (var505 == 1605) {
                                class234.field3858[var6++] = var60.field4933;
                                continue;
                            }
                            if (var505 == 1606) {
                                class234.field3858[var6++] = var60.field5034;
                                continue;
                            }
                            if (var505 == 1607) {
                                class234.field3858[var6++] = var60.field4918;
                                continue;
                            }
                            if (var505 == 1608) {
                                class234.field3858[var6++] = var60.field4916;
                                continue;
                            }
                            if (var505 == 1609) {
                                class234.field3858[var6++] = var60.field4986;
                                continue;
                            }
                            if (var505 == 1610) {
                                class234.field3858[var6++] = var60.field4894;
                                continue;
                            }
                            if (var505 == 1611) {
                                class234.field3858[var6++] = var60.field4951;
                                continue;
                            }
                        } else if (var505 < 1800) {
                            class301 var61 = var46 ? class30.field487 : class75.field1261;
                            if (var505 == 1700) {
                                class234.field3858[var6++] = var61.field5009;
                                continue;
                            }
                            if (var505 == 1701) {
                                if (var61.field5009 == -1) {
                                    class234.field3858[var6++] = 0;
                                } else {
                                    class234.field3858[var6++] = var61.field5002;
                                }
                                continue;
                            }
                            if (var505 == 1702) {
                                class234.field3858[var6++] = var61.field4987;
                                continue;
                            }
                        } else if (var505 < 1900) {
                            class301 var62 = var46 ? class30.field487 : class75.field1261;
                            if (var505 == 1800) {
                                class234.field3858[var6++] = class122.method911(client.method2168(var62), (byte) 125);
                                continue;
                            }
                            if (var505 == 1801) {
                                var6--;
                                int var63 = class234.field3858[var6];
                                int var506 = var63 - 1;
                                if (var62.field4902 != null && var62.field4902.length > var506 && var62.field4902[var506] != null) {
                                    class135.field2194[var8++] = var62.field4902[var506];
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 1802) {
                                if (var62.field4913 == null) {
                                    class135.field2194[var8++] = class25.field323;
                                } else {
                                    class135.field2194[var8++] = var62.field4913;
                                }
                                continue;
                            }
                        } else if (var505 < 2600) {
                            var6--;
                            class301 var64 = class206.method1440(class234.field3858[var6], (byte) -68);
                            if (var505 == 2500) {
                                class234.field3858[var6++] = var64.field5049;
                                continue;
                            }
                            if (var505 == 2501) {
                                class234.field3858[var6++] = var64.field4991;
                                continue;
                            }
                            if (var505 == 2502) {
                                class234.field3858[var6++] = var64.field4923;
                                continue;
                            }
                            if (var505 == 2503) {
                                class234.field3858[var6++] = var64.field4882;
                                continue;
                            }
                            if (var505 == 2504) {
                                class234.field3858[var6++] = var64.field4990 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 2505) {
                                class234.field3858[var6++] = var64.field5040;
                                continue;
                            }
                        } else if (var505 < 2700) {
                            var6--;
                            class301 var65 = class206.method1440(class234.field3858[var6], (byte) -68);
                            if (var505 == 2600) {
                                class234.field3858[var6++] = var65.field4937;
                                continue;
                            }
                            if (var505 == 2601) {
                                class234.field3858[var6++] = var65.field4897;
                                continue;
                            }
                            if (var505 == 2602) {
                                class135.field2194[var8++] = var65.field4963;
                                continue;
                            }
                            if (var505 == 2603) {
                                class234.field3858[var6++] = var65.field5006;
                                continue;
                            }
                            if (var505 == 2604) {
                                class234.field3858[var6++] = var65.field4877;
                                continue;
                            }
                            if (var505 == 2605) {
                                class234.field3858[var6++] = var65.field4933;
                                continue;
                            }
                            if (var505 == 2606) {
                                class234.field3858[var6++] = var65.field5034;
                                continue;
                            }
                            if (var505 == 2607) {
                                class234.field3858[var6++] = var65.field4918;
                                continue;
                            }
                            if (var505 == 2608) {
                                class234.field3858[var6++] = var65.field4916;
                                continue;
                            }
                            if (var505 == 2609) {
                                class234.field3858[var6++] = var65.field4986;
                                continue;
                            }
                            if (var505 == 2610) {
                                class234.field3858[var6++] = var65.field4894;
                                continue;
                            }
                            if (var505 == 2611) {
                                class234.field3858[var6++] = var65.field4951;
                                continue;
                            }
                        } else if (var505 < 2800) {
                            if (var505 == 2700) {
                                var6--;
                                class301 var66 = class206.method1440(class234.field3858[var6], (byte) -68);
                                class234.field3858[var6++] = var66.field5009;
                                continue;
                            }
                            if (var505 == 2701) {
                                var6--;
                                class301 var67 = class206.method1440(class234.field3858[var6], (byte) -68);
                                if (var67.field5009 == -1) {
                                    class234.field3858[var6++] = 0;
                                } else {
                                    class234.field3858[var6++] = var67.field5002;
                                }
                                continue;
                            }
                            if (var505 == 2702) {
                                var6--;
                                int var68 = class234.field3858[var6];
                                class48 var69 = (class48) class251.field4176.method713(3365, (long) var68);
                                if (var69 == null) {
                                    class234.field3858[var6++] = 0;
                                } else {
                                    class234.field3858[var6++] = 1;
                                }
                                continue;
                            }
                            if (var505 == 2703) {
                                var6--;
                                class301 var70 = class206.method1440(class234.field3858[var6], (byte) -68);
                                if (var70.field4955 == null) {
                                    class234.field3858[var6++] = 0;
                                    continue;
                                }
                                int var71 = var70.field4955.length;
                                for (int var72 = 0; var72 < var70.field4955.length; var72++) {
                                    if (var70.field4955[var72] == null) {
                                        var71 = var72;
                                        break;
                                    }
                                }
                                class234.field3858[var6++] = var71;
                                continue;
                            }
                            if (var505 == 2704 || var505 == 2705) {
                                var6 -= 2;
                                int var73 = class234.field3858[var6];
                                int var74 = class234.field3858[var6 + 1];
                                class48 var75 = (class48) class251.field4176.method713(3365, (long) var73);
                                if (var75 != null && var75.field700 == var74) {
                                    class234.field3858[var6++] = 1;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                        } else if (var505 < 2900) {
                            var6--;
                            class301 var76 = class206.method1440(class234.field3858[var6], (byte) -68);
                            if (var505 == 2800) {
                                class234.field3858[var6++] = class122.method911(client.method2168(var76), (byte) 121);
                                continue;
                            }
                            if (var505 == 2801) {
                                var6--;
                                int var77 = class234.field3858[var6];
                                int var507 = var77 - 1;
                                if (var76.field4902 != null && var507 < var76.field4902.length && var76.field4902[var507] != null) {
                                    class135.field2194[var8++] = var76.field4902[var507];
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 2802) {
                                if (var76.field4913 == null) {
                                    class135.field2194[var8++] = class25.field323;
                                } else {
                                    class135.field2194[var8++] = var76.field4913;
                                }
                                continue;
                            }
                        } else if (var505 < 3200) {
                            if (var505 == 3100) {
                                var8--;
                                class229 var78 = class135.field2194[var8];
                                class205.method1439(var78, true, 0, class25.field323);
                                continue;
                            }
                            if (var505 == 3101) {
                                var6 -= 2;
                                class200.method1404(class230.field3820, class234.field3858[var6 + 1], 1, class234.field3858[var6]);
                                continue;
                            }
                            if (var505 == 3103) {
                                class306.method2068(10606);
                                continue;
                            }
                            if (var505 == 3104) {
                                class83.field1402++;
                                var8--;
                                class229 var79 = class135.field2194[var8];
                                int var80 = 0;
                                if (var79.method1641(10)) {
                                    var80 = var79.method1619(10);
                                }
                                class121.field2033.method37(51, 144);
                                class121.field2033.method1168(var80, (byte) -123);
                                continue;
                            }
                            if (var505 == 3105) {
                                class226.field3710++;
                                var8--;
                                class229 var81 = class135.field2194[var8];
                                class121.field2033.method37(22, 158);
                                class121.field2033.method1208((byte) -6, var81.method1634(false));
                                continue;
                            }
                            if (var505 == 3106) {
                                class152.field2480++;
                                var8--;
                                class229 var82 = class135.field2194[var8];
                                class121.field2033.method37(34, 240);
                                class121.field2033.method1188(-106, var82.method1642(-113) + 1);
                                class121.field2033.method1194(-11504, var82);
                                continue;
                            }
                            if (var505 == 3107) {
                                var6--;
                                int var83 = class234.field3858[var6];
                                var8--;
                                class229 var84 = class135.field2194[var8];
                                class135.method958(var83, var84, (byte) -76);
                                continue;
                            }
                            if (var505 == 3108) {
                                var6 -= 3;
                                int var85 = class234.field3858[var6];
                                int var86 = class234.field3858[var6 + 1];
                                int var87 = class234.field3858[var6 + 2];
                                class301 var88 = class206.method1440(var87, (byte) -68);
                                class213.method1508(0, var85, var88, var86);
                                continue;
                            }
                            if (var505 == 3109) {
                                var6 -= 2;
                                int var89 = class234.field3858[var6];
                                int var90 = class234.field3858[var6 + 1];
                                class301 var91 = var46 ? class30.field487 : class75.field1261;
                                class213.method1508(0, var89, var91, var90);
                                continue;
                            }
                            if (var505 == 3110) {
                                class221.field3628++;
                                var6--;
                                int var92 = class234.field3858[var6];
                                class121.field2033.method37(31, 199);
                                class121.field2033.method1155(-1640531527, var92);
                                continue;
                            }
                        } else if (var505 < 3300) {
                            if (var505 == 3200) {
                                var6 -= 3;
                                class228.method1586(class234.field3858[var6 + 1], class234.field3858[var6 + 2], class234.field3858[var6], false);
                                continue;
                            }
                            if (var505 == 3201) {
                                var6--;
                                class189.method1321(class234.field3858[var6], -6130);
                                continue;
                            }
                            if (var505 == 3202) {
                                var6 -= 2;
                                class314.method2135(class234.field3858[var6 + 1], class234.field3858[var6], -114);
                                continue;
                            }
                        } else if (var505 < 3400) {
                            if (var505 == 3300) {
                                class234.field3858[var6++] = class319.field5393;
                                continue;
                            }
                            if (var505 == 3301) {
                                var6 -= 2;
                                int var93 = class234.field3858[var6];
                                int var94 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class319.method2156(var93, (byte) -126, var94);
                                continue;
                            }
                            if (var505 == 3302) {
                                var6 -= 2;
                                int var95 = class234.field3858[var6];
                                int var96 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class290.method1988(var96, var95, (byte) 111);
                                continue;
                            }
                            if (var505 == 3303) {
                                var6 -= 2;
                                int var97 = class234.field3858[var6];
                                int var98 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class122.method912(var97, var98, (byte) -20);
                                continue;
                            }
                            if (var505 == 3304) {
                                var6--;
                                int var99 = class234.field3858[var6];
                                class234.field3858[var6++] = class111.method848(var99, 0).field1967;
                                continue;
                            }
                            if (var505 == 3305) {
                                var6--;
                                int var100 = class234.field3858[var6];
                                class234.field3858[var6++] = class230.field3825[var100];
                                continue;
                            }
                            if (var505 == 3306) {
                                var6--;
                                int var101 = class234.field3858[var6];
                                class234.field3858[var6++] = class171.field2819[var101];
                                continue;
                            }
                            if (var505 == 3307) {
                                var6--;
                                int var102 = class234.field3858[var6];
                                class234.field3858[var6++] = class145.field2347[var102];
                                continue;
                            }
                            if (var505 == 3308) {
                                int var103 = class298.field4849;
                                int var104 = (class230.field3820.field5147 >> 7) + class1.field9;
                                int var105 = (class230.field3820.field5168 >> 7) + class1.field1;
                                class234.field3858[var6++] = (var103 << 28) + (var104 << 14) + var105;
                                continue;
                            }
                            if (var505 == 3309) {
                                var6--;
                                int var106 = class234.field3858[var6];
                                class234.field3858[var6++] = class243.method1696(var106, 268428220) >> 14;
                                continue;
                            }
                            if (var505 == 3310) {
                                var6--;
                                int var107 = class234.field3858[var6];
                                class234.field3858[var6++] = var107 >> 28;
                                continue;
                            }
                            if (var505 == 3311) {
                                var6--;
                                int var108 = class234.field3858[var6];
                                class234.field3858[var6++] = class243.method1696(16383, var108);
                                continue;
                            }
                            if (var505 == 3312) {
                                class234.field3858[var6++] = class185.field3006 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3313) {
                                var6 -= 2;
                                int var109 = class234.field3858[var6] + 32768;
                                int var110 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class319.method2156(var109, (byte) -116, var110);
                                continue;
                            }
                            if (var505 == 3314) {
                                var6 -= 2;
                                int var111 = class234.field3858[var6] + 32768;
                                int var112 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class290.method1988(var112, var111, (byte) 111);
                                continue;
                            }
                            if (var505 == 3315) {
                                var6 -= 2;
                                int var113 = class234.field3858[var6] + 32768;
                                int var114 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class122.method912(var113, var114, (byte) 54);
                                continue;
                            }
                            if (var505 == 3316) {
                                if (class27.field378 >= 2) {
                                    class234.field3858[var6++] = class27.field378;
                                } else {
                                    class234.field3858[var6++] = 0;
                                }
                                continue;
                            }
                            if (var505 == 3317) {
                                class234.field3858[var6++] = class115.field1953;
                                continue;
                            }
                            if (var505 == 3318) {
                                class234.field3858[var6++] = class209.field3457;
                                continue;
                            }
                            if (var505 == 3321) {
                                class234.field3858[var6++] = class53.field749;
                                continue;
                            }
                            if (var505 == 3322) {
                                class234.field3858[var6++] = class111.field1872;
                                continue;
                            }
                            if (var505 == 3323) {
                                if (class16.field196 >= 5 && class16.field196 <= 9) {
                                    class234.field3858[var6++] = 1;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3324) {
                                if (class16.field196 >= 5 && class16.field196 <= 9) {
                                    class234.field3858[var6++] = class16.field196;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3325) {
                                class234.field3858[var6++] = class26.field360 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3326) {
                                class234.field3858[var6++] = class230.field3820.field3468;
                                continue;
                            }
                            if (var505 == 3327) {
                                class234.field3858[var6++] = class230.field3820.field3446.field2203 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3328) {
                                class234.field3858[var6++] = class143.field2324 && !class190.field3097 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3329) {
                                class234.field3858[var6++] = class8.field110 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3330) {
                                var6--;
                                int var115 = class234.field3858[var6];
                                class234.field3858[var6++] = class123.method916((byte) -116, var115);
                                continue;
                            }
                            if (var505 == 3331) {
                                var6 -= 2;
                                int var116 = class234.field3858[var6 + 1];
                                int var117 = class234.field3858[var6];
                                class234.field3858[var6++] = class248.method1745(true, var117, var116, false);
                                continue;
                            }
                            if (var505 == 3332) {
                                var6 -= 2;
                                int var118 = class234.field3858[var6];
                                int var119 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = class248.method1745(true, var118, var119, true);
                                continue;
                            }
                            if (var505 == 3333) {
                                class234.field3858[var6++] = class296.field4832;
                                continue;
                            }
                            if (var505 == 3335) {
                                class234.field3858[var6++] = class276.field4599;
                                continue;
                            }
                        } else if (var505 < 3500) {
                            if (var505 == 3400) {
                                var6 -= 2;
                                int var450 = class234.field3858[var6 + 1];
                                int var451 = class234.field3858[var6];
                                class221 var452 = class279.method1921(var451, (byte) 64);
                                if (var452.field3646 != 115) {
                                }
                                class135.field2194[var8++] = var452.method1540(79, var450);
                                continue;
                            }
                            if (var505 == 3408) {
                                var6 -= 4;
                                int var453 = class234.field3858[var6];
                                int var454 = class234.field3858[var6 + 2];
                                int var455 = class234.field3858[var6 + 3];
                                int var456 = class234.field3858[var6 + 1];
                                class221 var457 = class279.method1921(var454, (byte) 64);
                                if (var457.field3642 == var453 && var457.field3646 == var456) {
                                    if (var456 == 115) {
                                        class135.field2194[var8++] = var457.method1540(19, var455);
                                    } else {
                                        class234.field3858[var6++] = var457.method1547((byte) 107, var455);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var505 == 3409) {
                                var6 -= 3;
                                int var458 = class234.field3858[var6];
                                int var459 = class234.field3858[var6 + 1];
                                int var460 = class234.field3858[var6 + 2];
                                if (var459 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class221 var461 = class279.method1921(var459, (byte) 64);
                                if (var461.field3646 != var458) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class234.field3858[var6++] = var461.method1549(-30534, var460) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3410) {
                                var6--;
                                int var462 = class234.field3858[var6];
                                var8--;
                                class229 var463 = class135.field2194[var8];
                                if (var462 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class221 var464 = class279.method1921(var462, (byte) 64);
                                if (var464.field3646 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class234.field3858[var6++] = var464.method1541(var463, (byte) 59) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3411) {
                                var6--;
                                int var465 = class234.field3858[var6];
                                class221 var466 = class279.method1921(var465, (byte) 64);
                                class234.field3858[var6++] = var466.field3630.method715(53);
                                continue;
                            }
                        } else if (var505 < 3700) {
                            if (var505 == 3600) {
                                if (class10.field122 == 0) {
                                    class234.field3858[var6++] = -2;
                                } else if (class10.field122 == 1) {
                                    class234.field3858[var6++] = -1;
                                } else {
                                    class234.field3858[var6++] = class103.field1752;
                                }
                                continue;
                            }
                            if (var505 == 3601) {
                                var6--;
                                int var428 = class234.field3858[var6];
                                if (class10.field122 == 2 && var428 < class103.field1752) {
                                    class135.field2194[var8++] = class133.field2170[var428];
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 3602) {
                                var6--;
                                int var429 = class234.field3858[var6];
                                if (class10.field122 == 2 && class103.field1752 > var429) {
                                    class234.field3858[var6++] = class70.field1162[var429];
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3603) {
                                var6--;
                                int var430 = class234.field3858[var6];
                                if (class10.field122 == 2 && var430 < class103.field1752) {
                                    class234.field3858[var6++] = class52.field739[var430];
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3604) {
                                var8--;
                                class229 var431 = class135.field2194[var8];
                                var6--;
                                int var432 = class234.field3858[var6];
                                class255.method1777(var431, 94, var432);
                                continue;
                            }
                            if (var505 == 3605) {
                                var8--;
                                class229 var433 = class135.field2194[var8];
                                class230.method1647(1471, var433.method1634(false));
                                continue;
                            }
                            if (var505 == 3606) {
                                var8--;
                                class229 var434 = class135.field2194[var8];
                                class141.method1013(var434.method1634(false), 26615);
                                continue;
                            }
                            if (var505 == 3607) {
                                var8--;
                                class229 var435 = class135.field2194[var8];
                                class272.method1886(var435.method1634(false), false);
                                continue;
                            }
                            if (var505 == 3608) {
                                var8--;
                                class229 var436 = class135.field2194[var8];
                                class60.method406(false, var436.method1634(false));
                                continue;
                            }
                            if (var505 == 3609) {
                                var8--;
                                class229 var437 = class135.field2194[var8];
                                if (var437.method1614((byte) 53, class303.field5069) || var437.method1614((byte) 33, class319.field5397)) {
                                    var437 = var437.method1640(7, -109);
                                }
                                class234.field3858[var6++] = class269.method1869((byte) 3, var437) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3610) {
                                var6--;
                                int var438 = class234.field3858[var6];
                                if (class10.field122 == 2 && var438 < class103.field1752) {
                                    class135.field2194[var8++] = class178.field2937[var438];
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 3611) {
                                if (class217.field3557 == null) {
                                    class135.field2194[var8++] = class25.field323;
                                } else {
                                    class135.field2194[var8++] = class217.field3557.method1628(-32);
                                }
                                continue;
                            }
                            if (var505 == 3612) {
                                if (class217.field3557 == null) {
                                    class234.field3858[var6++] = 0;
                                } else {
                                    class234.field3858[var6++] = class317.field5378;
                                }
                                continue;
                            }
                            if (var505 == 3613) {
                                var6--;
                                int var439 = class234.field3858[var6];
                                if (class217.field3557 != null && var439 < class317.field5378) {
                                    class135.field2194[var8++] = class30.field484[var439].field2305.method1628(-32);
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 3614) {
                                var6--;
                                int var440 = class234.field3858[var6];
                                if (class217.field3557 != null && var440 < class317.field5378) {
                                    class234.field3858[var6++] = class30.field484[var440].field2295;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3615) {
                                var6--;
                                int var441 = class234.field3858[var6];
                                if (class217.field3557 != null && class317.field5378 > var441) {
                                    class234.field3858[var6++] = class30.field484[var441].field2307;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3616) {
                                class234.field3858[var6++] = client.field5430;
                                continue;
                            }
                            if (var505 == 3617) {
                                var8--;
                                class229 var442 = class135.field2194[var8];
                                class45.method334(false, var442);
                                continue;
                            }
                            if (var505 == 3618) {
                                class234.field3858[var6++] = class178.field2933;
                                continue;
                            }
                            if (var505 == 3619) {
                                var8--;
                                class229 var443 = class135.field2194[var8];
                                class302.method2038(false, var443.method1634(false));
                                continue;
                            }
                            if (var505 == 3620) {
                                class268.method1863(83);
                                continue;
                            }
                            if (var505 == 3621) {
                                if (class10.field122 == 0) {
                                    class234.field3858[var6++] = -1;
                                } else {
                                    class234.field3858[var6++] = class216.field3555;
                                }
                                continue;
                            }
                            if (var505 == 3622) {
                                var6--;
                                int var444 = class234.field3858[var6];
                                if (class10.field122 != 0 && class216.field3555 > var444) {
                                    class135.field2194[var8++] = class100.method767((byte) 69, class282.field4682[var444]).method1628(-32);
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 3623) {
                                var8--;
                                class229 var445 = class135.field2194[var8];
                                if (var445.method1614((byte) 90, class303.field5069) || var445.method1614((byte) 40, class319.field5397)) {
                                    var445 = var445.method1640(7, -112);
                                }
                                class234.field3858[var6++] = class251.method1764((byte) 89, var445) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3624) {
                                var6--;
                                int var446 = class234.field3858[var6];
                                if (class30.field484 != null && class317.field5378 > var446 && class30.field484[var446].field2305.method1630(10, class230.field3820.field3463)) {
                                    class234.field3858[var6++] = 1;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3625) {
                                if (class300.field4869 == null) {
                                    class135.field2194[var8++] = class25.field323;
                                } else {
                                    class135.field2194[var8++] = class300.field4869.method1628(-32);
                                }
                                continue;
                            }
                            if (var505 == 3626) {
                                var6--;
                                int var447 = class234.field3858[var6];
                                if (class217.field3557 != null && var447 < class317.field5378) {
                                    class135.field2194[var8++] = class30.field484[var447].field2294;
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 3627) {
                                var6--;
                                int var448 = class234.field3858[var6];
                                if (class10.field122 == 2 && var448 >= 0 && class103.field1752 > var448) {
                                    class234.field3858[var6++] = class110.field1859[var448] ? 1 : 0;
                                    continue;
                                }
                                class234.field3858[var6++] = 0;
                                continue;
                            }
                            if (var505 == 3628) {
                                var8--;
                                class229 var449 = class135.field2194[var8];
                                if (var449.method1614((byte) 119, class303.field5069) || var449.method1614((byte) 107, class319.field5397)) {
                                    var449 = var449.method1640(7, -127);
                                }
                                class234.field3858[var6++] = class186.method1303(var449, true);
                                continue;
                            }
                            if (var505 == 3629) {
                                class234.field3858[var6++] = class69.field1111;
                                continue;
                            }
                        } else if (var505 < 4000) {
                            if (var505 == 3903) {
                                var6--;
                                int var414 = class234.field3858[var6];
                                class234.field3858[var6++] = class187.field3037[var414].method1308(-1);
                                continue;
                            }
                            if (var505 == 3904) {
                                var6--;
                                int var415 = class234.field3858[var6];
                                class234.field3858[var6++] = class187.field3037[var415].field3010;
                                continue;
                            }
                            if (var505 == 3905) {
                                var6--;
                                int var416 = class234.field3858[var6];
                                class234.field3858[var6++] = class187.field3037[var416].field3016;
                                continue;
                            }
                            if (var505 == 3906) {
                                var6--;
                                int var417 = class234.field3858[var6];
                                class234.field3858[var6++] = class187.field3037[var417].field3020;
                                continue;
                            }
                            if (var505 == 3907) {
                                var6--;
                                int var418 = class234.field3858[var6];
                                class234.field3858[var6++] = class187.field3037[var418].field3021;
                                continue;
                            }
                            if (var505 == 3908) {
                                var6--;
                                int var419 = class234.field3858[var6];
                                class234.field3858[var6++] = class187.field3037[var419].field3018;
                                continue;
                            }
                            if (var505 == 3910) {
                                var6--;
                                int var420 = class234.field3858[var6];
                                int var421 = class187.field3037[var420].method1307(126);
                                class234.field3858[var6++] = var421 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3911) {
                                var6--;
                                int var422 = class234.field3858[var6];
                                int var423 = class187.field3037[var422].method1307(111);
                                class234.field3858[var6++] = var423 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3912) {
                                var6--;
                                int var424 = class234.field3858[var6];
                                int var425 = class187.field3037[var424].method1307(118);
                                class234.field3858[var6++] = var425 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 3913) {
                                var6--;
                                int var426 = class234.field3858[var6];
                                int var427 = class187.field3037[var426].method1307(116);
                                class234.field3858[var6++] = var427 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var505 < 4100) {
                            if (var505 == 4000) {
                                var6 -= 2;
                                int var120 = class234.field3858[var6];
                                int var121 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = var120 + var121;
                                continue;
                            }
                            if (var505 == 4001) {
                                var6 -= 2;
                                int var122 = class234.field3858[var6];
                                int var123 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = var122 - var123;
                                continue;
                            }
                            if (var505 == 4002) {
                                var6 -= 2;
                                int var124 = class234.field3858[var6 + 1];
                                int var125 = class234.field3858[var6];
                                class234.field3858[var6++] = var124 * var125;
                                continue;
                            }
                            if (var505 == 4003) {
                                var6 -= 2;
                                int var126 = class234.field3858[var6 + 1];
                                int var127 = class234.field3858[var6];
                                class234.field3858[var6++] = var127 / var126;
                                continue;
                            }
                            if (var505 == 4004) {
                                var6--;
                                int var128 = class234.field3858[var6];
                                class234.field3858[var6++] = (int) ((double) var128 * Math.random());
                                continue;
                            }
                            if (var505 == 4005) {
                                var6--;
                                int var129 = class234.field3858[var6];
                                class234.field3858[var6++] = (int) ((double) (var129 + 1) * Math.random());
                                continue;
                            }
                            if (var505 == 4006) {
                                var6 -= 5;
                                int var130 = class234.field3858[var6];
                                int var131 = class234.field3858[var6 + 1];
                                int var132 = class234.field3858[var6 + 2];
                                int var133 = class234.field3858[var6 + 3];
                                int var134 = class234.field3858[var6 + 4];
                                class234.field3858[var6++] = var130 + ((var134 - var132) * (var131 - var130) / (var133 - var132));
                                continue;
                            }
                            if (var505 == 4007) {
                                var6 -= 2;
                                long var135 = (long) class234.field3858[var6];
                                long var137 = (long) class234.field3858[var6 + 1];
                                class234.field3858[var6++] = (int) (var135 * var137 / 100L + var135);
                                continue;
                            }
                            if (var505 == 4008) {
                                var6 -= 2;
                                int var139 = class234.field3858[var6 + 1];
                                int var140 = class234.field3858[var6];
                                class234.field3858[var6++] = class201.method1410(var140, 0x1 << var139);
                                continue;
                            }
                            if (var505 == 4009) {
                                var6 -= 2;
                                int var141 = class234.field3858[var6 + 1];
                                int var142 = class234.field3858[var6];
                                class234.field3858[var6++] = class243.method1696(var142, -(0x1 << var141) - 1);
                                continue;
                            }
                            if (var505 == 4010) {
                                var6 -= 2;
                                int var143 = class234.field3858[var6 + 1];
                                int var144 = class234.field3858[var6];
                                class234.field3858[var6++] = class243.method1696(0x1 << var143, var144) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var505 == 4011) {
                                var6 -= 2;
                                int var145 = class234.field3858[var6];
                                int var146 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = var145 % var146;
                                continue;
                            }
                            if (var505 == 4012) {
                                var6 -= 2;
                                int var147 = class234.field3858[var6];
                                int var148 = class234.field3858[var6 + 1];
                                if (var147 == 0) {
                                    class234.field3858[var6++] = 0;
                                } else {
                                    class234.field3858[var6++] = (int) Math.pow((double) var147, (double) var148);
                                }
                                continue;
                            }
                            if (var505 == 4013) {
                                var6 -= 2;
                                int var149 = class234.field3858[var6 + 1];
                                int var150 = class234.field3858[var6];
                                if (var150 == 0) {
                                    class234.field3858[var6++] = 0;
                                } else if (var149 == 0) {
                                    class234.field3858[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class234.field3858[var6++] = (int) Math.pow((double) var150, 1.0D / (double) var149);
                                }
                                continue;
                            }
                            if (var505 == 4014) {
                                var6 -= 2;
                                int var151 = class234.field3858[var6 + 1];
                                int var152 = class234.field3858[var6];
                                class234.field3858[var6++] = class243.method1696(var152, var151);
                                continue;
                            }
                            if (var505 == 4015) {
                                var6 -= 2;
                                int var153 = class234.field3858[var6 + 1];
                                int var154 = class234.field3858[var6];
                                class234.field3858[var6++] = class201.method1410(var154, var153);
                                continue;
                            }
                            if (var505 == 4016) {
                                var6 -= 2;
                                int var155 = class234.field3858[var6];
                                int var156 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = var156 <= var155 ? var156 : var155;
                                continue;
                            }
                            if (var505 == 4017) {
                                var6 -= 2;
                                int var157 = class234.field3858[var6];
                                int var158 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = var157 > var158 ? var157 : var158;
                                continue;
                            }
                            if (var505 == 4018) {
                                var6 -= 3;
                                long var159 = (long) class234.field3858[var6 + 1];
                                long var161 = (long) class234.field3858[var6];
                                long var163 = (long) class234.field3858[var6 + 2];
                                class234.field3858[var6++] = (int) (var161 * var163 / var159);
                                continue;
                            }
                        } else if (var505 < 4200) {
                            if (var505 == 4100) {
                                var8--;
                                class229 var165 = class135.field2194[var8];
                                var6--;
                                int var166 = class234.field3858[var6];
                                class135.field2194[var8++] = class248.method1746(8528, new class229[] { var165, class50.method354(0, var166) });
                                continue;
                            }
                            if (var505 == 4101) {
                                var8 -= 2;
                                class229 var167 = class135.field2194[var8 + 1];
                                class229 var168 = class135.field2194[var8];
                                class135.field2194[var8++] = class248.method1746(8528, new class229[] { var168, var167 });
                                continue;
                            }
                            if (var505 == 4102) {
                                var8--;
                                class229 var169 = class135.field2194[var8];
                                var6--;
                                int var170 = class234.field3858[var6];
                                class135.field2194[var8++] = class248.method1746(8528, new class229[] { var169, class139.method1004((byte) 89, var170, true) });
                                continue;
                            }
                            if (var505 == 4103) {
                                var8--;
                                class229 var171 = class135.field2194[var8];
                                class135.field2194[var8++] = var171.method1616(-985019996);
                                continue;
                            }
                            if (var505 == 4104) {
                                var6--;
                                int var172 = class234.field3858[var6];
                                long var173 = (long) var172 * 86400000L + 1014768000000L;
                                class57.field810.setTime(new Date(var173));
                                int var175 = class57.field810.get(5);
                                int var176 = class57.field810.get(2);
                                int var177 = class57.field810.get(1);
                                class135.field2194[var8++] = class248.method1746(8528, new class229[] { class50.method354(0, var175), class143.field2315, class294.field4823[var176], class143.field2315, class50.method354(0, var177) });
                                continue;
                            }
                            if (var505 == 4105) {
                                var8 -= 2;
                                class229 var178 = class135.field2194[var8];
                                class229 var179 = class135.field2194[var8 + 1];
                                if (class230.field3820.field3446 != null && class230.field3820.field3446.field2203) {
                                    class135.field2194[var8++] = var179;
                                    continue;
                                }
                                class135.field2194[var8++] = var178;
                                continue;
                            }
                            if (var505 == 4106) {
                                var6--;
                                int var180 = class234.field3858[var6];
                                class135.field2194[var8++] = class50.method354(0, var180);
                                continue;
                            }
                            if (var505 == 4107) {
                                var8 -= 2;
                                class234.field3858[var6++] = class135.field2194[var8].method1613((byte) 44, class135.field2194[var8 + 1]);
                                continue;
                            }
                            if (var505 == 4108) {
                                var6 -= 2;
                                var8--;
                                class229 var181 = class135.field2194[var8];
                                int var182 = class234.field3858[var6];
                                int var183 = class234.field3858[var6 + 1];
                                byte[] var184 = class48.field704.method523(-102, 0, var183);
                                class81 var185 = new class81(var184);
                                var185.method254(class260.field4346, (int[]) null);
                                class234.field3858[var6++] = var185.method247(var181, var182);
                                continue;
                            }
                            if (var505 == 4109) {
                                var6 -= 2;
                                int var186 = class234.field3858[var6];
                                int var187 = class234.field3858[var6 + 1];
                                var8--;
                                class229 var188 = class135.field2194[var8];
                                byte[] var189 = class48.field704.method523(-20, 0, var187);
                                class81 var190 = new class81(var189);
                                var190.method254(class260.field4346, (int[]) null);
                                class234.field3858[var6++] = var190.method238(var188, var186);
                                continue;
                            }
                            if (var505 == 4110) {
                                var8 -= 2;
                                class229 var191 = class135.field2194[var8];
                                class229 var192 = class135.field2194[var8 + 1];
                                var6--;
                                if (class234.field3858[var6] == 1) {
                                    class135.field2194[var8++] = var191;
                                } else {
                                    class135.field2194[var8++] = var192;
                                }
                                continue;
                            }
                            if (var505 == 4111) {
                                var8--;
                                class229 var193 = class135.field2194[var8];
                                class135.field2194[var8++] = class31.method257(var193);
                                continue;
                            }
                            if (var505 == 4112) {
                                var8--;
                                class229 var194 = class135.field2194[var8];
                                var6--;
                                int var195 = class234.field3858[var6];
                                if (var195 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class135.field2194[var8++] = var194.method1596(var195, -1);
                                continue;
                            }
                            if (var505 == 4113) {
                                var6--;
                                int var196 = class234.field3858[var6];
                                class234.field3858[var6++] = class228.method1587(var196, 31007) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 4114) {
                                var6--;
                                int var197 = class234.field3858[var6];
                                class234.field3858[var6++] = class201.method1411(13782, var197) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 4115) {
                                var6--;
                                int var198 = class234.field3858[var6];
                                class234.field3858[var6++] = class17.method91(var198, 110) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 4116) {
                                var6--;
                                int var199 = class234.field3858[var6];
                                class234.field3858[var6++] = method2138(var199, 1158) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 4117) {
                                var8--;
                                class229 var200 = class135.field2194[var8];
                                if (var200 == null) {
                                    class234.field3858[var6++] = 0;
                                } else {
                                    class234.field3858[var6++] = var200.method1642(119);
                                }
                                continue;
                            }
                            if (var505 == 4118) {
                                var8--;
                                class229 var201 = class135.field2194[var8];
                                var6 -= 2;
                                int var202 = class234.field3858[var6];
                                int var203 = class234.field3858[var6 + 1];
                                class135.field2194[var8++] = var201.method1623(var202, -30201, var203);
                                continue;
                            }
                            if (var505 == 4119) {
                                var8--;
                                class229 var204 = class135.field2194[var8];
                                boolean var205 = false;
                                class229 var206 = class121.method904(var204.method1642(12), 30487);
                                for (int var207 = 0; var204.method1642(-108) > var207; var207++) {
                                    int var208 = var204.method1598(var207, 61);
                                    if (var208 == 60) {
                                        var205 = true;
                                    } else if (var208 == 62) {
                                        var205 = false;
                                    } else if (!var205) {
                                        var206.method1608(var208, 0);
                                    }
                                }
                                var206.method1620(-22358);
                                class135.field2194[var8++] = var206;
                                continue;
                            }
                            if (var505 == 4120) {
                                var6 -= 2;
                                int var209 = class234.field3858[var6];
                                var8--;
                                class229 var210 = class135.field2194[var8];
                                int var211 = class234.field3858[var6 + 1];
                                class234.field3858[var6++] = var210.method1633(612, var209, var211);
                                continue;
                            }
                            if (var505 == 4121) {
                                var8 -= 2;
                                class229 var212 = class135.field2194[var8];
                                class229 var213 = class135.field2194[var8 + 1];
                                var6--;
                                int var214 = class234.field3858[var6];
                                class234.field3858[var6++] = var212.method1629(var213, -128, var214);
                                continue;
                            }
                            if (var505 == 4122) {
                                var6--;
                                int var215 = class234.field3858[var6];
                                class234.field3858[var6++] = class17.method94(var215, 0);
                                continue;
                            }
                            if (var505 == 4123) {
                                var6--;
                                int var216 = class234.field3858[var6];
                                class234.field3858[var6++] = class232.method1654(6724, var216);
                                continue;
                            }
                        } else if (var505 < 4300) {
                            if (var505 == 4200) {
                                var6--;
                                int var217 = class234.field3858[var6];
                                class135.field2194[var8++] = class124.method920(-84, var217).field3154;
                                continue;
                            }
                            if (var505 == 4201) {
                                var6 -= 2;
                                int var218 = class234.field3858[var6];
                                int var219 = class234.field3858[var6 + 1];
                                class191 var220 = class124.method920(-84, var218);
                                if (var219 >= 1 && var219 <= 5 && var220.field3149[var219 - 1] != null) {
                                    class135.field2194[var8++] = var220.field3149[var219 - 1];
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 4202) {
                                var6 -= 2;
                                int var221 = class234.field3858[var6];
                                int var222 = class234.field3858[var6 + 1];
                                class191 var223 = class124.method920(-84, var221);
                                if (var222 >= 1 && var222 <= 5 && var223.field3110[var222 - 1] != null) {
                                    class135.field2194[var8++] = var223.field3110[var222 - 1];
                                    continue;
                                }
                                class135.field2194[var8++] = class25.field323;
                                continue;
                            }
                            if (var505 == 4203) {
                                var6--;
                                int var224 = class234.field3858[var6];
                                class234.field3858[var6++] = class124.method920(-84, var224).field3113;
                                continue;
                            }
                            if (var505 == 4204) {
                                var6--;
                                int var225 = class234.field3858[var6];
                                class234.field3858[var6++] = class124.method920(-84, var225).field3134 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 4205) {
                                var6--;
                                int var226 = class234.field3858[var6];
                                class191 var227 = class124.method920(-84, var226);
                                if (var227.field3141 == -1 && var227.field3148 >= 0) {
                                    class234.field3858[var6++] = var227.field3148;
                                    continue;
                                }
                                class234.field3858[var6++] = var226;
                                continue;
                            }
                            if (var505 == 4206) {
                                var6--;
                                int var228 = class234.field3858[var6];
                                class191 var229 = class124.method920(-84, var228);
                                if (var229.field3141 >= 0 && var229.field3148 >= 0) {
                                    class234.field3858[var6++] = var229.field3148;
                                    continue;
                                }
                                class234.field3858[var6++] = var228;
                                continue;
                            }
                            if (var505 == 4207) {
                                var6--;
                                int var230 = class234.field3858[var6];
                                class234.field3858[var6++] = class124.method920(-84, var230).field3123 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 4208) {
                                var6 -= 2;
                                int var231 = class234.field3858[var6 + 1];
                                int var232 = class234.field3858[var6];
                                class102 var233 = class61.method419(var231, false);
                                if (var233.method782(false)) {
                                    class135.field2194[var8++] = class124.method920(-84, var232).method1347(6, var231, var233.field1744);
                                } else {
                                    class234.field3858[var6++] = class124.method920(-84, var232).method1334(var233.field1737, (byte) -92, var231);
                                }
                                continue;
                            }
                            if (var505 == 4210) {
                                var6--;
                                int var234 = class234.field3858[var6];
                                var8--;
                                class229 var235 = class135.field2194[var8];
                                class175.method1263(var234 == 1, var235, (byte) -59);
                                class234.field3858[var6++] = class38.field610;
                                continue;
                            }
                            if (var505 == 4211) {
                                if (class65.field987 != null && class206.field3400 < class38.field610) {
                                    class234.field3858[var6++] = class243.method1696(class65.field987[class206.field3400++], 65535);
                                    continue;
                                }
                                class234.field3858[var6++] = -1;
                                continue;
                            }
                            if (var505 == 4212) {
                                class206.field3400 = 0;
                                continue;
                            }
                        } else if (var505 < 4400) {
                            if (var505 == 4300) {
                                var6 -= 2;
                                int var404 = class234.field3858[var6 + 1];
                                int var405 = class234.field3858[var6];
                                class102 var406 = class61.method419(var404, false);
                                if (var406.method782(false)) {
                                    class135.field2194[var8++] = class25.method155(var405, -27).method2123(var406.field1744, var404, 0);
                                } else {
                                    class234.field3858[var6++] = class25.method155(var405, -64).method2125(var404, var406.field1737, 19105);
                                }
                                continue;
                            }
                            if (var505 == 4301) {
                                var6--;
                                int var407 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var407, -26).field5292;
                                continue;
                            }
                            if (var505 == 4302) {
                                var6--;
                                int var408 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var408, -83).field5288;
                                continue;
                            }
                            if (var505 == 4303) {
                                var6--;
                                int var409 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var409, -31).field5317;
                                continue;
                            }
                            if (var505 == 4304) {
                                var6--;
                                int var410 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var410, -127).field5319;
                                continue;
                            }
                            if (var505 == 4305) {
                                var6--;
                                int var411 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var411, -128).field5302;
                                continue;
                            }
                            if (var505 == 4306) {
                                var6--;
                                int var412 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var412, -102).field5276;
                                continue;
                            }
                            if (var505 == 4307) {
                                var6--;
                                int var413 = class234.field3858[var6];
                                class234.field3858[var6++] = class25.method155(var413, -76).field5289;
                                continue;
                            }
                        } else if (var505 >= 4500) {
                            if (var505 < 4600) {
                                if (var505 == 4500) {
                                    var6 -= 2;
                                    int var236 = class234.field3858[var6];
                                    int var237 = class234.field3858[var6 + 1];
                                    class102 var238 = class61.method419(var237, false);
                                    if (var238.method782(false)) {
                                        class135.field2194[var8++] = class234.method1662(var236, (byte) -23).method791(var238.field1744, 0, var237);
                                    } else {
                                        class234.field3858[var6++] = class234.method1662(var236, (byte) 89).method796(var238.field1737, -126, var237);
                                    }
                                    continue;
                                }
                            } else if (var505 < 5100) {
                                if (var505 == 5000) {
                                    class234.field3858[var6++] = class25.field322;
                                    continue;
                                }
                                if (var505 == 5001) {
                                    class12.field163++;
                                    var6 -= 3;
                                    class25.field322 = class234.field3858[var6];
                                    class253.field4229 = class234.field3858[var6 + 1];
                                    class19.field260 = class234.field3858[var6 + 2];
                                    class121.field2033.method37(97, 207);
                                    class121.field2033.method1188(-75, class25.field322);
                                    class121.field2033.method1188(-73, class253.field4229);
                                    class121.field2033.method1188(-89, class19.field260);
                                    continue;
                                }
                                if (var505 == 5002) {
                                    var6 -= 2;
                                    class325.field5549++;
                                    int var336 = class234.field3858[var6 + 1];
                                    var8--;
                                    class229 var337 = class135.field2194[var8];
                                    int var338 = class234.field3858[var6];
                                    class121.field2033.method37(26, 115);
                                    class121.field2033.method1208((byte) -6, var337.method1634(false));
                                    class121.field2033.method1188(-111, var338 - 1);
                                    class121.field2033.method1188(-103, var336);
                                    continue;
                                }
                                if (var505 == 5003) {
                                    class229 var339 = null;
                                    var6--;
                                    int var340 = class234.field3858[var6];
                                    if (var340 < 100) {
                                        var339 = class53.field752[var340];
                                    }
                                    if (var339 == null) {
                                        var339 = class25.field323;
                                    }
                                    class135.field2194[var8++] = var339;
                                    continue;
                                }
                                if (var505 == 5004) {
                                    int var341 = -1;
                                    var6--;
                                    int var342 = class234.field3858[var6];
                                    if (var342 < 100 && class53.field752[var342] != null) {
                                        var341 = class266.field4480[var342];
                                    }
                                    class234.field3858[var6++] = var341;
                                    continue;
                                }
                                if (var505 == 5005) {
                                    class234.field3858[var6++] = class253.field4229;
                                    continue;
                                }
                                if (var505 == 5008) {
                                    var8--;
                                    class229 var343 = class135.field2194[var8];
                                    if (!var343.method1614((byte) 37, class289.field4743)) {
                                        if (class27.field378 == 0 && (class143.field2324 && !class190.field3097 || class8.field110)) {
                                            continue;
                                        }
                                        class170.field2800++;
                                        class229 var344 = var343.method1616(-985019996);
                                        byte var345 = 0;
                                        if (var344.method1614((byte) 30, class141.field2284)) {
                                            var343 = var343.method1640(class141.field2284.method1642(-124), -108);
                                            var345 = 0;
                                        } else if (var344.method1614((byte) 87, class175.field2873)) {
                                            var343 = var343.method1640(class175.field2873.method1642(-93), -68);
                                            var345 = 1;
                                        } else if (var344.method1614((byte) 37, class254.field4243)) {
                                            var343 = var343.method1640(class254.field4243.method1642(-118), -122);
                                            var345 = 2;
                                        } else if (var344.method1614((byte) 69, class68.field1085)) {
                                            var345 = 3;
                                            var343 = var343.method1640(class68.field1085.method1642(-106), -68);
                                        } else if (var344.method1614((byte) 107, class218.field3589)) {
                                            var343 = var343.method1640(class218.field3589.method1642(116), -71);
                                            var345 = 4;
                                        } else if (var344.method1614((byte) 59, class185.field2998)) {
                                            var343 = var343.method1640(class185.field2998.method1642(-119), -71);
                                            var345 = 5;
                                        } else if (var344.method1614((byte) 111, class308.field5194)) {
                                            var343 = var343.method1640(class308.field5194.method1642(-119), -116);
                                            var345 = 6;
                                        } else if (var344.method1614((byte) 44, class222.field3660)) {
                                            var345 = 7;
                                            var343 = var343.method1640(class222.field3660.method1642(-101), -78);
                                        } else if (var344.method1614((byte) 119, class296.field4839)) {
                                            var343 = var343.method1640(class296.field4839.method1642(-95), -98);
                                            var345 = 8;
                                        } else if (var344.method1614((byte) 39, class78.field1299)) {
                                            var343 = var343.method1640(class78.field1299.method1642(13), -105);
                                            var345 = 9;
                                        } else if (var344.method1614((byte) 49, class16.field193)) {
                                            var343 = var343.method1640(class16.field193.method1642(-118), -83);
                                            var345 = 10;
                                        } else if (var344.method1614((byte) 106, class107.field1812)) {
                                            var343 = var343.method1640(class107.field1812.method1642(60), -106);
                                            var345 = 11;
                                        } else if (class276.field4599 != 0) {
                                            if (var344.method1614((byte) 49, class141.field2278)) {
                                                var345 = 0;
                                                var343 = var343.method1640(class141.field2278.method1642(-104), -97);
                                            } else if (var344.method1614((byte) 81, class175.field2869)) {
                                                var343 = var343.method1640(class175.field2869.method1642(21), -85);
                                                var345 = 1;
                                            } else if (var344.method1614((byte) 79, class254.field4245)) {
                                                var345 = 2;
                                                var343 = var343.method1640(class254.field4245.method1642(41), -96);
                                            } else if (var344.method1614((byte) 70, class68.field1081)) {
                                                var345 = 3;
                                                var343 = var343.method1640(class68.field1081.method1642(38), -121);
                                            } else if (var344.method1614((byte) 115, class218.field3583)) {
                                                var345 = 4;
                                                var343 = var343.method1640(class218.field3583.method1642(-92), -78);
                                            } else if (var344.method1614((byte) 47, class185.field3005)) {
                                                var343 = var343.method1640(class185.field3005.method1642(-122), -97);
                                                var345 = 5;
                                            } else if (var344.method1614((byte) 36, class308.field5191)) {
                                                var345 = 6;
                                                var343 = var343.method1640(class308.field5191.method1642(115), -100);
                                            } else if (var344.method1614((byte) 67, class222.field3662)) {
                                                var343 = var343.method1640(class222.field3662.method1642(79), -106);
                                                var345 = 7;
                                            } else if (var344.method1614((byte) 72, class296.field4835)) {
                                                var345 = 8;
                                                var343 = var343.method1640(class296.field4835.method1642(-125), -123);
                                            } else if (var344.method1614((byte) 59, class78.field1303)) {
                                                var345 = 9;
                                                var343 = var343.method1640(class78.field1303.method1642(-108), -91);
                                            } else if (var344.method1614((byte) 91, class16.field195)) {
                                                var343 = var343.method1640(class16.field195.method1642(-118), -111);
                                                var345 = 10;
                                            } else if (var344.method1614((byte) 47, class107.field1816)) {
                                                var345 = 11;
                                                var343 = var343.method1640(class107.field1816.method1642(-109), -118);
                                            }
                                        }
                                        class229 var346 = var343.method1616(-985019996);
                                        byte var347 = 0;
                                        if (var346.method1614((byte) 70, class76.field1280)) {
                                            var343 = var343.method1640(class76.field1280.method1642(-122), -76);
                                            var347 = 1;
                                        } else if (var346.method1614((byte) 90, class142.field2297)) {
                                            var347 = 2;
                                            var343 = var343.method1640(class142.field2297.method1642(19), -119);
                                        } else if (var346.method1614((byte) 87, class94.field1580)) {
                                            var343 = var343.method1640(class94.field1580.method1642(-126), -72);
                                            var347 = 3;
                                        } else if (var346.method1614((byte) 121, class311.field5216)) {
                                            var343 = var343.method1640(class311.field5216.method1642(96), -72);
                                            var347 = 4;
                                        } else if (var346.method1614((byte) 38, class66.field1039)) {
                                            var343 = var343.method1640(class66.field1039.method1642(-118), -99);
                                            var347 = 5;
                                        } else if (class276.field4599 != 0) {
                                            if (var346.method1614((byte) 105, class76.field1272)) {
                                                var343 = var343.method1640(class76.field1272.method1642(26), -111);
                                                var347 = 1;
                                            } else if (var346.method1614((byte) 119, class142.field2308)) {
                                                var347 = 2;
                                                var343 = var343.method1640(class142.field2308.method1642(-122), -111);
                                            } else if (var346.method1614((byte) 87, class94.field1585)) {
                                                var347 = 3;
                                                var343 = var343.method1640(class94.field1585.method1642(-111), -75);
                                            } else if (var346.method1614((byte) 79, class311.field5217)) {
                                                var347 = 4;
                                                var343 = var343.method1640(class311.field5217.method1642(58), -107);
                                            } else if (var346.method1614((byte) 94, class66.field1033)) {
                                                var343 = var343.method1640(class66.field1033.method1642(44), -125);
                                                var347 = 5;
                                            }
                                        }
                                        class121.field2033.method37(26, 24);
                                        class121.field2033.method1188(-80, 0);
                                        int var348 = class121.field2033.field2670;
                                        class121.field2033.method1188(-94, var345);
                                        class121.field2033.method1188(-101, var347);
                                        class285.method1965((byte) -76, class121.field2033, var343);
                                        class121.field2033.method1173(class121.field2033.field2670 - var348, -1);
                                        continue;
                                    }
                                    class193.method1353(var343, 11881);
                                    continue;
                                }
                                if (var505 == 5009) {
                                    var8 -= 2;
                                    class229 var349 = class135.field2194[var8 + 1];
                                    class229 var350 = class135.field2194[var8];
                                    if (class27.field378 != 0 || (!class143.field2324 || class190.field3097) && !class8.field110) {
                                        class121.field2033.method37(115, 45);
                                        class176.field2900++;
                                        class121.field2033.method1188(-111, 0);
                                        int var351 = class121.field2033.field2670;
                                        class121.field2033.method1208((byte) -6, var350.method1634(false));
                                        class285.method1965((byte) -76, class121.field2033, var349);
                                        class121.field2033.method1173(class121.field2033.field2670 - var351, -1);
                                    }
                                    continue;
                                }
                                if (var505 == 5010) {
                                    class229 var352 = null;
                                    var6--;
                                    int var353 = class234.field3858[var6];
                                    if (var353 < 100) {
                                        var352 = class296.field4840[var353];
                                    }
                                    if (var352 == null) {
                                        var352 = class25.field323;
                                    }
                                    class135.field2194[var8++] = var352;
                                    continue;
                                }
                                if (var505 == 5011) {
                                    var6--;
                                    int var354 = class234.field3858[var6];
                                    class229 var355 = null;
                                    if (var354 < 100) {
                                        var355 = class152.field2466[var354];
                                    }
                                    if (var355 == null) {
                                        var355 = class25.field323;
                                    }
                                    class135.field2194[var8++] = var355;
                                    continue;
                                }
                                if (var505 == 5012) {
                                    var6--;
                                    int var356 = class234.field3858[var6];
                                    int var357 = -1;
                                    if (var356 < 100) {
                                        var357 = class48.field710[var356];
                                    }
                                    class234.field3858[var6++] = var357;
                                    continue;
                                }
                                if (var505 == 5015) {
                                    class229 var358;
                                    if (class230.field3820 == null || class230.field3820.field3463 == null) {
                                        var358 = class134.field2186;
                                    } else {
                                        var358 = class230.field3820.method1453((byte) -99);
                                    }
                                    class135.field2194[var8++] = var358;
                                    continue;
                                }
                                if (var505 == 5016) {
                                    class234.field3858[var6++] = class19.field260;
                                    continue;
                                }
                                if (var505 == 5017) {
                                    class234.field3858[var6++] = class38.field608;
                                    continue;
                                }
                                if (var505 == 5050) {
                                    var6--;
                                    int var359 = class234.field3858[var6];
                                    class135.field2194[var8++] = class88.method655(var359, -32769).field319;
                                    continue;
                                }
                                if (var505 == 5051) {
                                    var6--;
                                    int var360 = class234.field3858[var6];
                                    class25 var361 = class88.method655(var360, -32769);
                                    if (var361.field316 == null) {
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var361.field316.length;
                                    }
                                    continue;
                                }
                                if (var505 == 5052) {
                                    var6 -= 2;
                                    int var362 = class234.field3858[var6];
                                    int var363 = class234.field3858[var6 + 1];
                                    class25 var364 = class88.method655(var362, -32769);
                                    int var365 = var364.field316[var363];
                                    class234.field3858[var6++] = var365;
                                    continue;
                                }
                                if (var505 == 5053) {
                                    var6--;
                                    int var366 = class234.field3858[var6];
                                    class25 var367 = class88.method655(var366, -32769);
                                    if (var367.field318 == null) {
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var367.field318.length;
                                    }
                                    continue;
                                }
                                if (var505 == 5054) {
                                    var6 -= 2;
                                    int var368 = class234.field3858[var6];
                                    int var369 = class234.field3858[var6 + 1];
                                    class234.field3858[var6++] = class88.method655(var368, -32769).field318[var369];
                                    continue;
                                }
                                if (var505 == 5055) {
                                    var6--;
                                    int var370 = class234.field3858[var6];
                                    class135.field2194[var8++] = class224.method1560((byte) -61, var370).method1809(0);
                                    continue;
                                }
                                if (var505 == 5056) {
                                    var6--;
                                    int var371 = class234.field3858[var6];
                                    class260 var372 = class224.method1560((byte) -61, var371);
                                    if (var372.field4360 == null) {
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var372.field4360.length;
                                    }
                                    continue;
                                }
                                if (var505 == 5057) {
                                    var6 -= 2;
                                    int var373 = class234.field3858[var6];
                                    int var374 = class234.field3858[var6 + 1];
                                    class234.field3858[var6++] = class224.method1560((byte) -61, var373).field4360[var374];
                                    continue;
                                }
                                if (var505 == 5058) {
                                    class328.field5582 = new class166();
                                    var6--;
                                    class328.field5582.field2703 = class234.field3858[var6];
                                    class328.field5582.field2714 = class224.method1560((byte) -61, class328.field5582.field2703);
                                    class328.field5582.field2712 = new int[class328.field5582.field2714.method1805(0)];
                                    continue;
                                }
                                if (var505 == 5059) {
                                    class121.field2033.method37(74, 213);
                                    class121.field2033.method1188(-101, 0);
                                    int var375 = class121.field2033.field2670;
                                    class121.field2033.method1188(-113, 0);
                                    class230.field3821++;
                                    class121.field2033.method1155(-1640531527, class328.field5582.field2703);
                                    class328.field5582.field2714.method1804(class121.field2033, 11766, class328.field5582.field2712);
                                    class121.field2033.method1173(class121.field2033.field2670 - var375, -1);
                                    continue;
                                }
                                if (var505 == 5060) {
                                    class44.field672++;
                                    var8--;
                                    class229 var376 = class135.field2194[var8];
                                    class121.field2033.method37(45, 219);
                                    class121.field2033.method1188(-71, 0);
                                    int var377 = class121.field2033.field2670;
                                    class121.field2033.method1208((byte) -6, var376.method1634(false));
                                    class121.field2033.method1155(-1640531527, class328.field5582.field2703);
                                    class328.field5582.field2714.method1804(class121.field2033, 11766, class328.field5582.field2712);
                                    class121.field2033.method1173(class121.field2033.field2670 - var377, -1);
                                    continue;
                                }
                                if (var505 == 5061) {
                                    class230.field3821++;
                                    class121.field2033.method37(54, 213);
                                    class121.field2033.method1188(-98, 0);
                                    int var378 = class121.field2033.field2670;
                                    class121.field2033.method1188(-107, 1);
                                    class121.field2033.method1155(-1640531527, class328.field5582.field2703);
                                    class328.field5582.field2714.method1804(class121.field2033, 11766, class328.field5582.field2712);
                                    class121.field2033.method1173(class121.field2033.field2670 - var378, -1);
                                    continue;
                                }
                                if (var505 == 5062) {
                                    var6 -= 2;
                                    int var379 = class234.field3858[var6];
                                    int var380 = class234.field3858[var6 + 1];
                                    class234.field3858[var6++] = class88.method655(var379, -32769).field328[var380];
                                    continue;
                                }
                                if (var505 == 5063) {
                                    var6 -= 2;
                                    int var381 = class234.field3858[var6];
                                    int var382 = class234.field3858[var6 + 1];
                                    class234.field3858[var6++] = class88.method655(var381, -32769).field321[var382];
                                    continue;
                                }
                                if (var505 == 5064) {
                                    var6 -= 2;
                                    int var383 = class234.field3858[var6];
                                    int var384 = class234.field3858[var6 + 1];
                                    if (var384 == -1) {
                                        class234.field3858[var6++] = -1;
                                    } else {
                                        class234.field3858[var6++] = class88.method655(var383, -32769).method154(var384, -5);
                                    }
                                    continue;
                                }
                                if (var505 == 5065) {
                                    var6 -= 2;
                                    int var385 = class234.field3858[var6];
                                    int var386 = class234.field3858[var6 + 1];
                                    if (var386 == -1) {
                                        class234.field3858[var6++] = -1;
                                    } else {
                                        class234.field3858[var6++] = class88.method655(var385, -32769).method159((byte) 127, var386);
                                    }
                                    continue;
                                }
                                if (var505 == 5066) {
                                    var6--;
                                    int var387 = class234.field3858[var6];
                                    class234.field3858[var6++] = class224.method1560((byte) -61, var387).method1805(0);
                                    continue;
                                }
                                if (var505 == 5067) {
                                    var6 -= 2;
                                    int var388 = class234.field3858[var6];
                                    int var389 = class234.field3858[var6 + 1];
                                    int var390 = class224.method1560((byte) -61, var388).method1806(37821, var389);
                                    class234.field3858[var6++] = var390;
                                    continue;
                                }
                                if (var505 == 5068) {
                                    var6 -= 2;
                                    int var391 = class234.field3858[var6];
                                    int var392 = class234.field3858[var6 + 1];
                                    class328.field5582.field2712[var391] = var392;
                                    continue;
                                }
                                if (var505 == 5069) {
                                    var6 -= 2;
                                    int var393 = class234.field3858[var6];
                                    int var394 = class234.field3858[var6 + 1];
                                    class328.field5582.field2712[var393] = var394;
                                    continue;
                                }
                                if (var505 == 5070) {
                                    var6 -= 3;
                                    int var395 = class234.field3858[var6];
                                    int var396 = class234.field3858[var6 + 1];
                                    int var397 = class234.field3858[var6 + 2];
                                    class260 var398 = class224.method1560((byte) -61, var395);
                                    if (var398.method1806(37821, var396) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class234.field3858[var6++] = var398.method1813(var396, var397, (byte) 121);
                                    continue;
                                }
                                if (var505 == 5071) {
                                    var8--;
                                    class229 var399 = class135.field2194[var8];
                                    var6--;
                                    boolean var400 = class234.field3858[var6] == 1;
                                    class266.method1860((byte) 66, var399, var400);
                                    class234.field3858[var6++] = class38.field610;
                                    continue;
                                }
                                if (var505 == 5072) {
                                    if (class65.field987 != null && class38.field610 > class206.field3400) {
                                        class234.field3858[var6++] = class243.method1696(class65.field987[class206.field3400++], 65535);
                                        continue;
                                    }
                                    class234.field3858[var6++] = -1;
                                    continue;
                                }
                                if (var505 == 5073) {
                                    class206.field3400 = 0;
                                    continue;
                                }
                            } else if (var505 < 5200) {
                                if (var505 == 5100) {
                                    if (class94.field1583[86]) {
                                        class234.field3858[var6++] = 1;
                                    } else {
                                        class234.field3858[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var505 == 5101) {
                                    if (class94.field1583[82]) {
                                        class234.field3858[var6++] = 1;
                                    } else {
                                        class234.field3858[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var505 == 5102) {
                                    if (class94.field1583[81]) {
                                        class234.field3858[var6++] = 1;
                                    } else {
                                        class234.field3858[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var505 < 5300) {
                                if (var505 == 5200) {
                                    var6--;
                                    class54.method371(-15443, class234.field3858[var6]);
                                    continue;
                                }
                                if (var505 == 5201) {
                                    class234.field3858[var6++] = class275.method1905(50);
                                    continue;
                                }
                                if (var505 == 5202) {
                                    var6--;
                                    class154.method1117(class234.field3858[var6], (byte) 40);
                                    continue;
                                }
                                if (var505 == 5203) {
                                    var8--;
                                    class97.method716(class135.field2194[var8], 879);
                                    continue;
                                }
                                if (var505 == 5204) {
                                    class135.field2194[var8 - 1] = class103.method797(class135.field2194[var8 - 1], -17882);
                                    continue;
                                }
                                if (var505 == 5205) {
                                    var8--;
                                    class250.method1757(class135.field2194[var8], (byte) -111);
                                    continue;
                                }
                                if (var505 == 5206) {
                                    var6--;
                                    int var239 = class234.field3858[var6];
                                    class235 var240 = class60.method404(126, var239 >> 14 & 0x3FFF, var239 & 0x3FFF);
                                    if (var240 == null) {
                                        class135.field2194[var8++] = class25.field323;
                                    } else {
                                        class135.field2194[var8++] = var240.field3874;
                                    }
                                    continue;
                                }
                                if (var505 == 5207) {
                                    var8--;
                                    class235 var241 = class219.method1531(4, class135.field2194[var8]);
                                    if (var241 != null && var241.field3870 != null) {
                                        class135.field2194[var8++] = var241.field3870;
                                        continue;
                                    }
                                    class135.field2194[var8++] = class25.field323;
                                    continue;
                                }
                                if (var505 == 5208) {
                                    class234.field3858[var6++] = class320.field5401;
                                    class234.field3858[var6++] = class221.field3624;
                                    continue;
                                }
                                if (var505 == 5209) {
                                    class234.field3858[var6++] = class103.field1767 + class54.field786;
                                    class234.field3858[var6++] = class214.field3537 - class324.field5534 - (1 - class266.field4487);
                                    continue;
                                }
                                if (var505 == 5210) {
                                    class235 var242 = class279.method1919(16711680);
                                    if (var242 == null) {
                                        class234.field3858[var6++] = 0;
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var242.field3881 * 64;
                                        class234.field3858[var6++] = var242.field3867 * 64;
                                    }
                                    continue;
                                }
                                if (var505 == 5211) {
                                    class235 var243 = class279.method1919(16711680);
                                    if (var243 == null) {
                                        class234.field3858[var6++] = 0;
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var243.field3872 - var243.field3865;
                                        class234.field3858[var6++] = var243.field3868 - var243.field3869;
                                    }
                                    continue;
                                }
                                if (var505 == 5212) {
                                    int var244 = class48.method340(-10291);
                                    int var245 = 0;
                                    class229 var246;
                                    if (var244 == -1) {
                                        var246 = class25.field323;
                                    } else {
                                        var246 = class1.field5.field872[var244];
                                        var245 = class1.field5.method411((byte) 76, var244);
                                    }
                                    class229 var247 = var246.method1597(31428, class25.field337, class18.field249);
                                    class135.field2194[var8++] = var247;
                                    class234.field3858[var6++] = var245;
                                    continue;
                                }
                                if (var505 == 5213) {
                                    int var248 = class154.method1119(118);
                                    int var249 = 0;
                                    class229 var250;
                                    if (var248 == -1) {
                                        var250 = class25.field323;
                                    } else {
                                        var250 = class1.field5.field872[var248];
                                        var249 = class1.field5.method411((byte) 69, var248);
                                    }
                                    class229 var251 = var250.method1597(31428, class25.field337, class18.field249);
                                    class135.field2194[var8++] = var251;
                                    class234.field3858[var6++] = var249;
                                    continue;
                                }
                                if (var505 == 5214) {
                                    var6--;
                                    int var252 = class234.field3858[var6];
                                    class252.method1768(var252 & 0x3FFF, (byte) -72, (var252 & 0xFFFF4DF) >> 14);
                                    continue;
                                }
                                if (var505 == 5215) {
                                    var6--;
                                    int var253 = class234.field3858[var6];
                                    var8--;
                                    class229 var254 = class135.field2194[var8];
                                    class219 var255 = class1.method10(var253 >> 14 & 0x3FFF, (byte) 127, var253 & 0x3FFF);
                                    boolean var256 = false;
                                    for (class235 var257 = (class235) var255.method1529((byte) 0); var257 != null; var257 = (class235) var255.method1533(3)) {
                                        if (var257.field3874.method1630(10, var254)) {
                                            var256 = true;
                                            break;
                                        }
                                    }
                                    if (var256) {
                                        class234.field3858[var6++] = 1;
                                    } else {
                                        class234.field3858[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var505 == 5216) {
                                    var6--;
                                    int var258 = class234.field3858[var6];
                                    class4.method24(var258, 106);
                                    continue;
                                }
                                if (var505 == 5217) {
                                    var6--;
                                    int var259 = class234.field3858[var6];
                                    if (class160.method1134(var259, 0)) {
                                        class234.field3858[var6++] = 1;
                                    } else {
                                        class234.field3858[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var505 < 5400) {
                                if (var505 == 5300) {
                                    var6 -= 2;
                                    int var260 = class234.field3858[var6 + 1];
                                    int var261 = class234.field3858[var6];
                                    class168.method1229(var261, false, (byte) -74, var260, 3);
                                    class234.field3858[var6++] = class325.field5569 == null ? 0 : 1;
                                    continue;
                                }
                                if (var505 == 5301) {
                                    if (class325.field5569 != null) {
                                        class168.method1229(-1, false, (byte) 65, -1, class72.field1231);
                                    }
                                    continue;
                                }
                                if (var505 == 5302) {
                                    class77[] var262 = class307.method2072(-124);
                                    class234.field3858[var6++] = var262.length;
                                    continue;
                                }
                                if (var505 == 5303) {
                                    var6--;
                                    int var263 = class234.field3858[var6];
                                    class77[] var264 = class307.method2072(-114);
                                    class234.field3858[var6++] = var264[var263].field1290;
                                    class234.field3858[var6++] = var264[var263].field1291;
                                    continue;
                                }
                                if (var505 == 5305) {
                                    int var265 = class156.field2540;
                                    int var266 = class326.field5576;
                                    int var267 = -1;
                                    class77[] var268 = class307.method2072(-118);
                                    for (int var269 = 0; var269 < var268.length; var269++) {
                                        class77 var270 = var268[var269];
                                        if (var270.field1290 == var265 && var270.field1291 == var266) {
                                            var267 = var269;
                                            break;
                                        }
                                    }
                                    class234.field3858[var6++] = var267;
                                    continue;
                                }
                                if (var505 == 5306) {
                                    class234.field3858[var6++] = class269.method1870(true);
                                    continue;
                                }
                                if (var505 == 5307) {
                                    var6--;
                                    int var271 = class234.field3858[var6];
                                    if (var271 < 0 || var271 > 2) {
                                        var271 = 0;
                                    }
                                    class168.method1229(-1, false, (byte) 91, -1, var271);
                                    continue;
                                }
                                if (var505 == 5308) {
                                    class234.field3858[var6++] = class72.field1231;
                                    continue;
                                }
                                if (var505 == 5309) {
                                    var6--;
                                    int var272 = class234.field3858[var6];
                                    if (var272 < 0 || var272 > 2) {
                                        var272 = 0;
                                    }
                                    class72.field1231 = var272;
                                    class94.method702((byte) -38, class249.field4143);
                                    continue;
                                }
                            } else if (var505 < 5500) {
                                if (var505 == 5400) {
                                    class241.field3988++;
                                    var6--;
                                    int var314 = class234.field3858[var6];
                                    var8 -= 2;
                                    class229 var315 = class135.field2194[var8 + 1];
                                    class229 var316 = class135.field2194[var8];
                                    class121.field2033.method37(31, 143);
                                    class121.field2033.method1188(-75, (class71.method553(false, var316) + class71.method553(false, var315)) + 1);
                                    class121.field2033.method1194(-11504, var316);
                                    class121.field2033.method1194(-11504, var315);
                                    class121.field2033.method1188(-103, var314);
                                    continue;
                                }
                                if (var505 == 5401) {
                                    var6 -= 2;
                                    class183.field2975[class234.field3858[var6]] = (short) class282.method1939(false, class234.field3858[var6 + 1]);
                                    class241.method1694(true);
                                    class250.method1753(33);
                                    class302.method2040(true);
                                    class168.method1230(99);
                                    class229.method1632((byte) 65);
                                    continue;
                                }
                                if (var505 == 5405) {
                                    var6 -= 2;
                                    int var317 = class234.field3858[var6];
                                    int var318 = class234.field3858[var6 + 1];
                                    if (var317 >= 0 && var317 < 2) {
                                        class191.field3156[var317] = new int[var318 << 1][4];
                                    }
                                    continue;
                                }
                                if (var505 == 5406) {
                                    var6 -= 7;
                                    int var319 = class234.field3858[var6];
                                    int var320 = class234.field3858[var6 + 1] << 1;
                                    int var321 = class234.field3858[var6 + 2];
                                    int var322 = class234.field3858[var6 + 3];
                                    int var323 = class234.field3858[var6 + 4];
                                    int var324 = class234.field3858[var6 + 5];
                                    int var325 = class234.field3858[var6 + 6];
                                    if (var319 >= 0 && var319 < 2 && class191.field3156[var319] != null && var320 >= 0 && var320 < class191.field3156[var319].length) {
                                        class191.field3156[var319][var320] = new int[] { (class243.method1696(268427395, var321) >> 14) * 128, var322, class243.method1696(16383, var321) * 128, var325 };
                                        class191.field3156[var319][var320 + 1] = new int[] { (class243.method1696(268430820, var323) >> 14) * 128, var324, class243.method1696(var323, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var505 == 5407) {
                                    var6--;
                                    int var326 = class191.field3156[class234.field3858[var6]].length >> 1;
                                    class234.field3858[var6++] = var326;
                                    continue;
                                }
                                if (var505 == 5411) {
                                    if (class325.field5569 != null) {
                                        class168.method1229(-1, false, (byte) 79, -1, class72.field1231);
                                    }
                                    if (class160.field2590 == null) {
                                        class119.method896(false, 114, class195.method1381((byte) 99));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var505 == 5419) {
                                    class229 var327 = class25.field323;
                                    if (class180.field2950 != null) {
                                        var327 = class200.method1407(class180.field2950.field4124, -23345);
                                        try {
                                            if (class180.field2950.field4123 != null) {
                                                byte[] var328 = ((String) class180.field2950.field4123).getBytes("ISO-8859-1");
                                                var327 = class27.method184((byte) 78, var328, var328.length, 0);
                                            }
                                        } catch (UnsupportedEncodingException var503) {
                                        }
                                    }
                                    class135.field2194[var8++] = var327;
                                    continue;
                                }
                                if (var505 == 5420) {
                                    class234.field3858[var6++] = class92.field1562 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 5421) {
                                    if (class325.field5569 != null) {
                                        class168.method1229(-1, false, (byte) 92, -1, class72.field1231);
                                    }
                                    var6--;
                                    boolean var330 = class234.field3858[var6] == 1;
                                    var8--;
                                    class229 var331 = class135.field2194[var8];
                                    class229 var332 = class248.method1746(8528, new class229[] { class195.method1381((byte) 85), var331 });
                                    if (class160.field2590 == null && (!var330 || class92.field1562 == 3 || !class92.field1557.startsWith("win") || class174.field2849)) {
                                        class119.method896(var330, -42, var332);
                                        continue;
                                    }
                                    class108.field1851 = var330;
                                    class145.field2352 = var332;
                                    class152.field2460 = class249.field4143.method687((byte) 21, new String(var332.method1599(-119), "ISO-8859-1"));
                                    continue;
                                }
                                if (var505 == 5422) {
                                    var8 -= 2;
                                    class229 var333 = class135.field2194[var8];
                                    class229 var334 = class135.field2194[var8 + 1];
                                    var6--;
                                    int var335 = class234.field3858[var6];
                                    if (var333.method1642(-114) > 0) {
                                        if (class230.field3827 == null) {
                                            class230.field3827 = new class229[class307.field5187[class166.field2710]];
                                        }
                                        class230.field3827[var335] = var333;
                                    }
                                    if (var334.method1642(-100) > 0) {
                                        if (class89.field1511 == null) {
                                            class89.field1511 = new class229[class307.field5187[class166.field2710]];
                                        }
                                        class89.field1511[var335] = var334;
                                    }
                                    continue;
                                }
                                if (var505 == 5423) {
                                    var8--;
                                    class135.field2194[var8].method1624(true);
                                    continue;
                                }
                            } else if (var505 < 5600) {
                                if (var505 == 5500) {
                                    var6 -= 4;
                                    int var302 = class234.field3858[var6 + 2];
                                    int var303 = class234.field3858[var6];
                                    int var304 = class234.field3858[var6 + 3];
                                    int var305 = class234.field3858[var6 + 1];
                                    class133.method943(((var303 & 0xFFFF45B) >> 14) - class1.field9, var305, false, var304, var302, (var303 & 0x3FFF) - class1.field1, 4478);
                                    continue;
                                }
                                if (var505 == 5501) {
                                    var6 -= 4;
                                    int var306 = class234.field3858[var6];
                                    int var307 = class234.field3858[var6 + 3];
                                    int var308 = class234.field3858[var6 + 2];
                                    int var309 = class234.field3858[var6 + 1];
                                    class259.method1800((var306 & 0x3FFF) - class1.field1, var309, ((var306 & 0xFFFDE55) >> 14) - class1.field9, 115, var307, var308);
                                    continue;
                                }
                                if (var505 == 5502) {
                                    var6 -= 6;
                                    int var310 = class234.field3858[var6];
                                    if (var310 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class24.field305 = var310;
                                    int var311 = class234.field3858[var6 + 1];
                                    if (var311 + 1 >= class191.field3156[class24.field305].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class37.field603 = var311;
                                    class129.field2121 = 0;
                                    class249.field4140 = class234.field3858[var6 + 2];
                                    class217.field3570 = class234.field3858[var6 + 3];
                                    int var312 = class234.field3858[var6 + 4];
                                    if (var312 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class265.field4470 = var312;
                                    int var313 = class234.field3858[var6 + 5];
                                    if ((var313 + 1) >= (class191.field3156[class265.field4470].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class217.field3565 = 3;
                                    class112.field1895 = var313;
                                    continue;
                                }
                                if (var505 == 5503) {
                                    class50.method352((byte) -10);
                                    continue;
                                }
                                if (var505 == 5504) {
                                    var6 -= 2;
                                    class245.field4049 = class234.field3858[var6];
                                    class147.field2379 = class234.field3858[var6 + 1];
                                    class181.method1287(false);
                                    continue;
                                }
                                if (var505 == 5505) {
                                    class234.field3858[var6++] = class245.field4049;
                                    continue;
                                }
                                if (var505 == 5506) {
                                    class234.field3858[var6++] = class147.field2379;
                                    continue;
                                }
                            } else if (var505 < 5700) {
                                if (var505 == 5600) {
                                    var8 -= 2;
                                    class229 var273 = class135.field2194[var8 + 1];
                                    var6--;
                                    int var274 = class234.field3858[var6];
                                    class229 var275 = class135.field2194[var8];
                                    if (class169.field2786 == 10 && class181.field2965 == 0 && class12.field164 == 0 && class211.field3490 == 0 && class149.field2414 == 0) {
                                        class29.method225(var274, var273, -51, var275);
                                    }
                                    continue;
                                }
                                if (var505 == 5601) {
                                    class303.method2046(5);
                                    continue;
                                }
                                if (var505 == 5602) {
                                    if (class12.field164 == 0) {
                                        class332.field5661 = -2;
                                    }
                                    continue;
                                }
                                if (var505 == 5603) {
                                    var6 -= 4;
                                    if (class169.field2786 == 10 && class181.field2965 == 0 && class12.field164 == 0 && class211.field3490 == 0 && class149.field2414 == 0) {
                                        class259.method1795(class234.field3858[var6 + 3], class234.field3858[var6], class234.field3858[var6 + 2], (byte) 102, class234.field3858[var6 + 1]);
                                    }
                                    continue;
                                }
                                if (var505 == 5604) {
                                    var8--;
                                    if (class169.field2786 == 10 && class181.field2965 == 0 && class12.field164 == 0 && class211.field3490 == 0 && class149.field2414 == 0) {
                                        class204.method1428(true, class135.field2194[var8].method1634(false));
                                    }
                                    continue;
                                }
                                if (var505 == 5605) {
                                    var8 -= 2;
                                    var6 -= 4;
                                    if (class169.field2786 == 10 && class181.field2965 == 0 && class12.field164 == 0 && class211.field3490 == 0 && class149.field2414 == 0) {
                                        class180.method1284(128, class135.field2194[var8].method1634(false), class234.field3858[var6 + 1], class234.field3858[var6 + 2], class234.field3858[var6], class135.field2194[var8 + 1], class234.field3858[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var505 == 5606) {
                                    if (class211.field3490 == 0) {
                                        class4.field42 = -2;
                                    }
                                    continue;
                                }
                                if (var505 == 5607) {
                                    class234.field3858[var6++] = class332.field5661;
                                    continue;
                                }
                                if (var505 == 5608) {
                                    class234.field3858[var6++] = class248.field4127;
                                    continue;
                                }
                                if (var505 == 5609) {
                                    class234.field3858[var6++] = class4.field42;
                                    continue;
                                }
                                if (var505 == 5610) {
                                    for (int var276 = 0; var276 < 5; var276++) {
                                        class135.field2194[var8++] = class257.field4300.length <= var276 ? class25.field323 : class257.field4300[var276].method1628(-32);
                                    }
                                    class257.field4300 = null;
                                    continue;
                                }
                                if (var505 == 5611) {
                                    class234.field3858[var6++] = class122.field2045;
                                    continue;
                                }
                            } else if (var505 < 6100) {
                                if (var505 == 6001) {
                                    var6--;
                                    int var294 = class234.field3858[var6];
                                    if (var294 < 1) {
                                        var294 = 1;
                                    }
                                    if (var294 > 4) {
                                        var294 = 4;
                                    }
                                    class191.field3153 = var294;
                                    if (!class99.field1675 || !class88.field1483) {
                                        if (class191.field3153 == 1) {
                                            class310.method2102(0.9F);
                                        }
                                        if (class191.field3153 == 2) {
                                            class310.method2102(0.8F);
                                        }
                                        if (class191.field3153 == 3) {
                                            class310.method2102(0.7F);
                                        }
                                        if (class191.field3153 == 4) {
                                            class310.method2102(0.6F);
                                        }
                                    }
                                    if (class99.field1675) {
                                        class101.method778((byte) -88);
                                        if (!class88.field1483) {
                                            class80.method596(28);
                                        }
                                    }
                                    class250.method1753(38);
                                    class94.method702((byte) -87, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6002) {
                                    var6--;
                                    class302.method2041((byte) 36, class234.field3858[var6] == 1);
                                    class115.method873(-23965);
                                    class80.method596(28);
                                    class227.method1572(32);
                                    class94.method702((byte) -112, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6003) {
                                    var6--;
                                    class175.field2877 = class234.field3858[var6] == 1;
                                    class227.method1572(32);
                                    class94.method702((byte) -113, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6005) {
                                    var6--;
                                    class120.field2017 = class234.field3858[var6] == 1;
                                    class80.method596(28);
                                    class94.method702((byte) -63, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6006) {
                                    var6--;
                                    class296.field4836 = class234.field3858[var6] == 1;
                                    ((class17) class310.field5207).method97(-2459, !class296.field4836);
                                    class94.method702((byte) -63, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6007) {
                                    var6--;
                                    class298.field4847 = class234.field3858[var6] == 1;
                                    class94.method702((byte) -47, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6008) {
                                    var6--;
                                    class171.field2807 = class234.field3858[var6] == 1;
                                    class94.method702((byte) -65, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6009) {
                                    var6--;
                                    class215.field3547 = class234.field3858[var6] == 1;
                                    class94.method702((byte) -61, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6010) {
                                    var6--;
                                    class45.field687 = class234.field3858[var6] == 1;
                                    class94.method702((byte) -121, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6011) {
                                    var6--;
                                    int var295 = class234.field3858[var6];
                                    if (var295 < 0 || var295 > 2) {
                                        var295 = 0;
                                    }
                                    class157.field2559 = var295;
                                    class94.method702((byte) -76, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6012) {
                                    if (class99.field1675) {
                                        class285.method1964(114, 0, 0);
                                    }
                                    var6--;
                                    class88.field1483 = class234.field3858[var6] == 1;
                                    if (class99.field1675 && class88.field1483) {
                                        class310.method2102(0.7F);
                                    } else {
                                        if (class191.field3153 == 1) {
                                            class310.method2102(0.9F);
                                        }
                                        if (class191.field3153 == 2) {
                                            class310.method2102(0.8F);
                                        }
                                        if (class191.field3153 == 3) {
                                            class310.method2102(0.7F);
                                        }
                                        if (class191.field3153 == 4) {
                                            class310.method2102(0.6F);
                                        }
                                    }
                                    class80.method596(28);
                                    class94.method702((byte) -64, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6014) {
                                    var6--;
                                    class281.field4661 = class234.field3858[var6] == 1;
                                    if (class99.field1675) {
                                        class80.method596(28);
                                    }
                                    class94.method702((byte) -85, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6015) {
                                    var6--;
                                    class215.field3545 = class234.field3858[var6] == 1;
                                    if (class99.field1675) {
                                        class101.method778((byte) -88);
                                    }
                                    class94.method702((byte) -74, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6016) {
                                    var6--;
                                    int var296 = class234.field3858[var6];
                                    if (class99.field1675) {
                                        client.field5431 = true;
                                    }
                                    if (var296 < 0 || var296 > 2) {
                                        var296 = 0;
                                    }
                                    class272.field4546 = var296;
                                    continue;
                                }
                                if (var505 == 6017) {
                                    var6--;
                                    class143.field2313 = class234.field3858[var6] == 1;
                                    class61.method414(95);
                                    class94.method702((byte) -50, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6018) {
                                    var6--;
                                    int var297 = class234.field3858[var6];
                                    if (var297 < 0) {
                                        var297 = 0;
                                    }
                                    if (var297 > 127) {
                                        var297 = 127;
                                    }
                                    class265.field4462 = var297;
                                    class94.method702((byte) -119, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6019) {
                                    var6--;
                                    int var298 = class234.field3858[var6];
                                    if (var298 < 0) {
                                        var298 = 0;
                                    }
                                    if (var298 > 255) {
                                        var298 = 255;
                                    }
                                    if (class234.field3860 != var298) {
                                        if (class234.field3860 == 0 && class187.field3048 != -1) {
                                            class301.method2024(1, class187.field3048, false, class219.field3599, 0, var298);
                                            class300.field4870 = false;
                                        } else if (var298 == 0) {
                                            class254.method1773(93);
                                            class300.field4870 = false;
                                        } else {
                                            class10.method64(0, var298);
                                        }
                                        class234.field3860 = var298;
                                    }
                                    class94.method702((byte) -118, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6020) {
                                    var6--;
                                    int var299 = class234.field3858[var6];
                                    if (var299 < 0) {
                                        var299 = 0;
                                    }
                                    if (var299 > 127) {
                                        var299 = 127;
                                    }
                                    class184.field2996 = var299;
                                    class94.method702((byte) -76, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6021) {
                                    var6--;
                                    class88.field1499 = class234.field3858[var6] == 1;
                                    class227.method1572(32);
                                    continue;
                                }
                                if (var505 == 6023) {
                                    var6--;
                                    int var300 = class234.field3858[var6];
                                    if (var300 < 0) {
                                        var300 = 0;
                                    }
                                    if (var300 > 2) {
                                        var300 = 2;
                                    }
                                    class194.method1364(var300);
                                    class94.method702((byte) -79, class249.field4143);
                                    class116.field1966 = false;
                                    continue;
                                }
                                if (var505 == 6024) {
                                    var6--;
                                    int var301 = class234.field3858[var6];
                                    if (var301 < 0 || var301 > 2) {
                                        var301 = 0;
                                    }
                                    class214.field3532 = var301;
                                    class94.method702((byte) -77, class249.field4143);
                                    continue;
                                }
                            } else if (var505 < 6200) {
                                if (var505 == 6101) {
                                    class234.field3858[var6++] = class191.field3153;
                                    continue;
                                }
                                if (var505 == 6102) {
                                    class234.field3858[var6++] = class61.method415((byte) 68) ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6103) {
                                    class234.field3858[var6++] = class175.field2877 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6105) {
                                    class234.field3858[var6++] = class120.field2017 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6106) {
                                    class234.field3858[var6++] = class296.field4836 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6107) {
                                    class234.field3858[var6++] = class298.field4847 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6108) {
                                    class234.field3858[var6++] = class171.field2807 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6109) {
                                    class234.field3858[var6++] = class215.field3547 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6110) {
                                    class234.field3858[var6++] = class45.field687 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6111) {
                                    class234.field3858[var6++] = class157.field2559;
                                    continue;
                                }
                                if (var505 == 6112) {
                                    class234.field3858[var6++] = class88.field1483 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6114) {
                                    class234.field3858[var6++] = class281.field4661 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6115) {
                                    class234.field3858[var6++] = class215.field3545 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6116) {
                                    class234.field3858[var6++] = class272.field4546;
                                    continue;
                                }
                                if (var505 == 6117) {
                                    class234.field3858[var6++] = class143.field2313 ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6118) {
                                    class234.field3858[var6++] = class265.field4462;
                                    continue;
                                }
                                if (var505 == 6119) {
                                    class234.field3858[var6++] = class234.field3860;
                                    continue;
                                }
                                if (var505 == 6120) {
                                    class234.field3858[var6++] = class184.field2996;
                                    continue;
                                }
                                if (var505 == 6121) {
                                    if (class99.field1675) {
                                        class234.field3858[var6++] = class99.field1690 ? 1 : 0;
                                    } else {
                                        class234.field3858[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var505 == 6123) {
                                    class234.field3858[var6++] = class194.method1371();
                                    continue;
                                }
                                if (var505 == 6124) {
                                    class234.field3858[var6++] = class214.field3532;
                                    continue;
                                }
                            } else if (var505 < 6300) {
                                if (var505 == 6200) {
                                    var6 -= 2;
                                    class129.field2115 = (short) class234.field3858[var6];
                                    if (class129.field2115 <= 0) {
                                        class129.field2115 = 256;
                                    }
                                    class186.field3030 = (short) class234.field3858[var6 + 1];
                                    if (class186.field3030 <= 0) {
                                        class186.field3030 = 205;
                                    }
                                    continue;
                                }
                                if (var505 == 6201) {
                                    var6 -= 2;
                                    class192.field3178 = (short) class234.field3858[var6];
                                    if (class192.field3178 <= 0) {
                                        class192.field3178 = 256;
                                    }
                                    class226.field3713 = (short) class234.field3858[var6 + 1];
                                    if (class226.field3713 <= 0) {
                                        class226.field3713 = 320;
                                    }
                                    continue;
                                }
                                if (var505 == 6202) {
                                    var6 -= 4;
                                    class311.field5219 = (short) class234.field3858[var6];
                                    if (class311.field5219 <= 0) {
                                        class311.field5219 = 1;
                                    }
                                    class57.field813 = (short) class234.field3858[var6 + 1];
                                    if (class57.field813 <= 0) {
                                        class57.field813 = 32767;
                                    } else if (class311.field5219 > class57.field813) {
                                        class57.field813 = class311.field5219;
                                    }
                                    class219.field3609 = (short) class234.field3858[var6 + 2];
                                    if (class219.field3609 <= 0) {
                                        class219.field3609 = 1;
                                    }
                                    class175.field2875 = (short) class234.field3858[var6 + 3];
                                    if (class175.field2875 <= 0) {
                                        class175.field2875 = 32767;
                                    } else if (class175.field2875 < class219.field3609) {
                                        class175.field2875 = class219.field3609;
                                    }
                                    continue;
                                }
                                if (var505 == 6203) {
                                    class126.method926(334, class52.field742.field4882, 0, class52.field742.field4923, 0, false);
                                    class234.field3858[var6++] = class43.field671;
                                    class234.field3858[var6++] = class133.field2163;
                                    continue;
                                }
                                if (var505 == 6204) {
                                    class234.field3858[var6++] = class192.field3178;
                                    class234.field3858[var6++] = class226.field3713;
                                    continue;
                                }
                                if (var505 == 6205) {
                                    class234.field3858[var6++] = class129.field2115;
                                    class234.field3858[var6++] = class186.field3030;
                                    continue;
                                }
                            } else if (var505 < 6400) {
                                if (var505 == 6300) {
                                    class234.field3858[var6++] = (int) (class130.method935(false) / 60000L);
                                    continue;
                                }
                                if (var505 == 6301) {
                                    class234.field3858[var6++] = (int) (class130.method935(false) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var505 == 6302) {
                                    var6 -= 3;
                                    int var277 = class234.field3858[var6 + 1];
                                    int var278 = class234.field3858[var6];
                                    int var279 = class234.field3858[var6 + 2];
                                    class57.field810.clear();
                                    class57.field810.set(11, 12);
                                    class57.field810.set(var279, var277, var278);
                                    class234.field3858[var6++] = (int) (class57.field810.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var505 == 6303) {
                                    class57.field810.clear();
                                    class57.field810.setTime(new Date(class130.method935(false)));
                                    class234.field3858[var6++] = class57.field810.get(1);
                                    continue;
                                }
                                if (var505 == 6304) {
                                    var6--;
                                    int var280 = class234.field3858[var6];
                                    boolean var281 = true;
                                    if (var280 < 0) {
                                        var281 = ((var280 + 1) % 4) == 0;
                                    } else if (var280 < 1582) {
                                        var281 = (var280 % 4) == 0;
                                    } else if (var280 % 4 != 0) {
                                        var281 = false;
                                    } else if ((var280 % 100) != 0) {
                                        var281 = true;
                                    } else if ((var280 % 400) != 0) {
                                        var281 = false;
                                    }
                                    class234.field3858[var6++] = var281 ? 1 : 0;
                                    continue;
                                }
                            } else if (var505 < 6500) {
                                if (var505 == 6405) {
                                    class234.field3858[var6++] = class186.method1306((byte) -89) ? 1 : 0;
                                    continue;
                                }
                                if (var505 == 6406) {
                                    class234.field3858[var6++] = class146.method1075(98) ? 1 : 0;
                                    continue;
                                }
                            } else if (var505 < 6600) {
                                if (var505 == 6500) {
                                    if (class169.field2786 == 10 && class181.field2965 == 0 && class12.field164 == 0 && class211.field3490 == 0) {
                                        class234.field3858[var6++] = class110.method841(1001) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class234.field3858[var6++] = 1;
                                    continue;
                                }
                                if (var505 == 6501) {
                                    class134 var282 = class226.method1569(0);
                                    if (var282 == null) {
                                        class234.field3858[var6++] = -1;
                                        class234.field3858[var6++] = 0;
                                        class135.field2194[var8++] = class25.field323;
                                        class234.field3858[var6++] = 0;
                                        class135.field2194[var8++] = class25.field323;
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var282.field2178;
                                        class234.field3858[var6++] = var282.field2161;
                                        class135.field2194[var8++] = var282.field2177;
                                        class180 var283 = var282.method952((byte) 95);
                                        class234.field3858[var6++] = var283.field2948;
                                        class135.field2194[var8++] = var283.field2953;
                                        class234.field3858[var6++] = var282.field2167;
                                    }
                                    continue;
                                }
                                if (var505 == 6502) {
                                    class134 var284 = class124.method917((byte) -65);
                                    if (var284 == null) {
                                        class234.field3858[var6++] = -1;
                                        class234.field3858[var6++] = 0;
                                        class135.field2194[var8++] = class25.field323;
                                        class234.field3858[var6++] = 0;
                                        class135.field2194[var8++] = class25.field323;
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var284.field2178;
                                        class234.field3858[var6++] = var284.field2161;
                                        class135.field2194[var8++] = var284.field2177;
                                        class180 var285 = var284.method952((byte) 95);
                                        class234.field3858[var6++] = var285.field2948;
                                        class135.field2194[var8++] = var285.field2953;
                                        class234.field3858[var6++] = var284.field2167;
                                    }
                                    continue;
                                }
                                if (var505 == 6503) {
                                    var6--;
                                    int var286 = class234.field3858[var6];
                                    if (class169.field2786 == 10 && class181.field2965 == 0 && class12.field164 == 0 && class211.field3490 == 0) {
                                        class234.field3858[var6++] = class288.method1974(var286, -24910) ? 1 : 0;
                                        continue;
                                    }
                                    class234.field3858[var6++] = 0;
                                    continue;
                                }
                                if (var505 == 6504) {
                                    var6--;
                                    class8.field99 = class234.field3858[var6];
                                    class94.method702((byte) -73, class249.field4143);
                                    continue;
                                }
                                if (var505 == 6505) {
                                    class234.field3858[var6++] = class8.field99;
                                    continue;
                                }
                                if (var505 == 6506) {
                                    var6--;
                                    int var287 = class234.field3858[var6];
                                    class134 var288 = class183.method1294(var287, (byte) 20);
                                    if (var288 == null) {
                                        class234.field3858[var6++] = -1;
                                        class135.field2194[var8++] = class25.field323;
                                        class234.field3858[var6++] = 0;
                                        class135.field2194[var8++] = class25.field323;
                                        class234.field3858[var6++] = 0;
                                    } else {
                                        class234.field3858[var6++] = var288.field2161;
                                        class135.field2194[var8++] = var288.field2177;
                                        class180 var289 = var288.method952((byte) 95);
                                        class234.field3858[var6++] = var289.field2948;
                                        class135.field2194[var8++] = var289.field2953;
                                        class234.field3858[var6++] = var288.field2167;
                                    }
                                    continue;
                                }
                                if (var505 == 6507) {
                                    var6 -= 4;
                                    int var290 = class234.field3858[var6];
                                    int var291 = class234.field3858[var6 + 2];
                                    boolean var292 = class234.field3858[var6 + 1] == 1;
                                    boolean var293 = class234.field3858[var6 + 3] == 1;
                                    class232.method1650(var291, 0, var293, var290, var292);
                                    continue;
                                }
                            } else if (var505 < 6700) {
                                if (var505 == 6600) {
                                    var6--;
                                    class255.field4267 = class234.field3858[var6] == 1;
                                    class94.method702((byte) -78, class249.field4143);
                                    continue;
                                }
                                if (var505 == 6601) {
                                    class234.field3858[var6++] = class255.field4267 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var505 == 4400) {
                            var6 -= 2;
                            int var401 = class234.field3858[var6];
                            int var402 = class234.field3858[var6 + 1];
                            class102 var403 = class61.method419(var402, false);
                            if (var403.method782(false)) {
                                class135.field2194[var8++] = class260.method1807(false, var401).method616((byte) -13, var403.field1744, var402);
                            } else {
                                class234.field3858[var6++] = class260.method1807(false, var401).method619(var402, var403.field1737, 0);
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var504) {
            if (var5.field3065 == null) {
                if (class112.field1900 != 0) {
                    class205.method1439(class152.field2459, true, 0, class25.field323);
                }
                class110.method834("CS2 - scr:" + var5.field1325 + " op:" + var10, var504, -1);
            } else {
                class229 var500 = class121.method904(30, 30487);
                var500.method1631(class234.field3861, true).method1631(var5.field3065, true);
                for (int var501 = class37.field606 - 1; var501 >= 0; var501--) {
                    var500.method1631(class89.field1526, true).method1631(class299.field4857[var501].field198.field3065, true);
                }
                if (var10 == 40) {
                    int var502 = var9[var11];
                    var500.method1631(class36.field594, true).method1631(class50.method354(0, var502), true);
                }
                if (class112.field1900 != 0) {
                    class205.method1439(class248.method1746(8528, new class229[] { class101.field1732, var5.field3065 }), true, 0, class25.field323);
                }
                class110.method834("CS2 - scr:" + var5.field1325 + " op:" + var10 + new String(var500.method1599(-128)), var504, -1);
            }
        }
    }
}
