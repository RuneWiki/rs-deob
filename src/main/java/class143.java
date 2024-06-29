import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class143 extends class177 {

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2209 = "wave:";

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2210 = "Loaded fonts";

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public static int field2212 = 2;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 5)
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V", line = 23)
    public static void method1079(boolean arg0) {
        if (arg0) {
            field2210 = null;
            field2209 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I", line = 37)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 >= -52) {
            return (int[]) null;
        } else {
            field2211++;
            return class179.field2684;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)V", line = 48)
    public static final void method1080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 785066493) {
            return;
        }
        if (class327.field5077 == 0) {
            int var7 = class288.field4476;
            int var8 = class142.field2202;
            int var9 = class307.field4796;
            int var10 = class257.field3834;
            int var11 = (arg5 - arg3) * (var9 - var7) / arg4 + var7;
            int var12 = (arg0 - arg1) * (var8 - var10) / arg6 + var10;
            if (class81.field1136 && (class44.field687 & 0x40) != 0) {
                class184 var13 = class314.method2167(class249.field3742, class90.field1313, -2421);
                if (var13 == null) {
                    class15.method117((byte) -127);
                } else {
                    class196.method1419(0L, class309.field4805, class88.field1295, " ->", var12, var11, (byte) -4, (short) 22);
                }
            } else {
                if (class3.field12 == 1) {
                    class196.method1419(0L, class309.field4822, -1, "", var12, var11, (byte) -4, (short) 19);
                }
                class156.field2341++;
                class196.method1419(0L, class298.field4664, -1, "", var12, var11, (byte) -4, (short) 49);
            }
        }
        field2207++;
        long var14 = -1L;
        for (int var16 = 0; var16 < class49.field763; var16++) {
            long var17 = class245.field3699[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3F9F) >> 7;
            int var21 = ((int) var17 & 0x626262BB) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class276.method1925(class50.field775, var19, var20, var17)) {
                    class101 var23 = class281.method1984(var22, false);
                    if (var23.field1542 != null) {
                        var23 = var23.method784(true);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class327.field5077 == 1) {
                        class35.field436++;
                        class196.method1419(var17, class307.field4792, class325.field5061, class220.field3452 + " -> <col=00ffff>" + var23.field1531, var20, var19, (byte) -4, (short) 17);
                    } else if (class81.field1136) {
                        class144 var24 = field2206 == -1 ? null : class180.method1307(field2206, -118);
                        if ((class44.field687 & 0x4) != 0 && (var24 == null || var23.method794(var24.field2222, 13208, field2206) != var24.field2222)) {
                            class299.field4705++;
                            class196.method1419(var17, class309.field4805, class88.field1295, class209.field3290 + " -> <col=00ffff>" + var23.field1531, var20, var19, (byte) -4, (short) 21);
                        }
                    } else {
                        class28.field326++;
                        String[] var25 = var23.field1547;
                        if (class130.field2034) {
                            var25 = class54.method482(0, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class297.field4651++;
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var26 == 0) {
                                        var27 = 60;
                                    }
                                    if (var26 == 1) {
                                        var27 = 2;
                                    }
                                    if (var26 == 2) {
                                        var27 = 43;
                                    }
                                    if (var23.field1546 == var26) {
                                        var28 = var23.field1555;
                                    }
                                    if (var26 == 3) {
                                        var27 = 28;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1005;
                                    }
                                    if (var23.field1560 == var26) {
                                        var28 = var23.field1543;
                                    }
                                    class196.method1419(var17, var25[var26], var28, "<col=00ffff>" + var23.field1531, var20, var19, (byte) -4, var27);
                                }
                            }
                        }
                        class196.method1419((long) var23.field1570, class201.field3183, class322.field5007, "<col=00ffff>" + var23.field1531, var20, var19, (byte) -4, (short) 1003);
                    }
                }
                if (var21 == 1) {
                    class45 var29 = class161.field2394[var22];
                    if ((var29.field698.field2750 & 0x1) == 0 && (var29.field4507 & 0x7F) == 0 && (var29.field4496 & 0x7F) == 0 || (var29.field698.field2750 & 0x1) == 1 && (var29.field4507 & 0x7F) == 64 && (var29.field4496 & 0x7F) == 64) {
                        int var30 = var29.field4496 - ((var29.field698.field2750 - 1) * 64);
                        int var31 = var29.field4507 - ((var29.field698.field2750 - 1) * 64);
                        for (int var32 = 0; var32 < class122.field1923; var32++) {
                            class45 var33 = class161.field2394[class126.field1995[var32]];
                            if (var33 != null && !var33.field4457 && var29 != var33 && var33.field4500) {
                                int var34 = var33.field4507 + 64 - var33.field698.field2750 * 64;
                                int var35 = var33.field4496 - (var33.field698.field2750 * 64 - 64);
                                if (var31 <= var34 && var33.field698.field2750 <= var29.field698.field2750 - (var34 - var31 >> 7) && var35 >= var30 && var33.field698.field2750 <= var29.field698.field2750 - (var35 - var30 >> 7)) {
                                    class210.method1498(var33.field698, 126, var20, var19, class126.field1995[var32]);
                                    var33.field4457 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class262.field3900; var36++) {
                            class121 var37 = class319.field4964[class225.field3504[var36]];
                            if (var37 != null && !var37.field4457 && var37.field4500) {
                                int var38 = var37.field4507 - (var37.method929(12) - 1) * 64;
                                int var39 = var37.field4496 + 64 - var37.method929(12) * 64;
                                if (var38 >= var31 && var37.method929(12) <= (var29.field698.field2750 - (var38 - var31 >> 7)) && var30 <= var39 && var37.method929(12) <= var29.field698.field2750 - (var39 - var30 >> 7)) {
                                    class178.method1289(class225.field3504[var36], -72, var20, var37, var19);
                                    var37.field4457 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4457) {
                        continue;
                    }
                    class210.method1498(var29.field698, 117, var20, var19, var22);
                    var29.field4457 = true;
                }
                if (var21 == 0) {
                    class121 var40 = class319.field4964[var22];
                    if ((var40.field4507 & 0x7F) == 64 && (var40.field4496 & 0x7F) == 64) {
                        int var41 = var40.field4507 - (var40.method929(12) * 64 - 64);
                        int var42 = var40.field4496 + 64 - (var40.method929(arg2 ^ 0x2ECB29F1) * 64);
                        for (int var43 = 0; var43 < class122.field1923; var43++) {
                            class45 var44 = class161.field2394[class126.field1995[var43]];
                            if (var44 != null && !var44.field4457 && var44.field4500) {
                                int var45 = var44.field4507 - ((var44.field698.field2750 - 1) * 64);
                                int var46 = var44.field4496 - ((var44.field698.field2750 - 1) * 64);
                                if (var41 <= var45 && var44.field698.field2750 <= (var40.method929(12) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field698.field2750 <= (var40.method929(12) - (var46 - var42 >> 7))) {
                                    class210.method1498(var44.field698, 126, var20, var19, class126.field1995[var43]);
                                    var44.field4457 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class262.field3900; var47++) {
                            class121 var48 = class319.field4964[class225.field3504[var47]];
                            if (var48 != null && !var48.field4457 && var40 != var48 && var48.field4500) {
                                int var49 = var48.field4507 + 64 - (var48.method929(12) * 64);
                                int var50 = var48.field4496 - (var48.method929(12) - 1) * 64;
                                if (var41 <= var49 && var48.method929(12) <= (var40.method929(12) - (var49 - var41 >> 7)) && var50 >= var42 && var48.method929(12) <= (var40.method929(arg2 ^ 0x2ECB29F1) - (var50 - var42 >> 7))) {
                                    class178.method1289(class225.field3504[var47], -113, var20, var48, var19);
                                    var48.field4457 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4457) {
                        continue;
                    }
                    class178.method1289(var22, -59, var20, var40, var19);
                    var40.field4457 = true;
                }
                if (var21 == 3) {
                    class128 var51 = class281.field4336[class50.field775][var19][var20];
                    if (var51 != null) {
                        for (class205 var52 = (class205) var51.method974(0); var52 != null; var52 = (class205) var51.method985((byte) 84)) {
                            int var53 = var52.field3253.field4785;
                            class274 var54 = class225.method1603(var53, 0);
                            if (class327.field5077 == 1) {
                                class213.field3385++;
                                class196.method1419((long) var53, class307.field4792, class325.field5061, class220.field3452 + " -> <col=ff9040>" + var54.field4149, var20, var19, (byte) -4, (short) 7);
                            } else if (class81.field1136) {
                                class144 var59 = field2206 == -1 ? null : class180.method1307(field2206, -105);
                                if ((class44.field687 & 0x1) != 0 && (var59 == null || var54.method1905(var59.field2222, -50, field2206) != var59.field2222)) {
                                    class242.field3635++;
                                    class196.method1419((long) var53, class309.field4805, class88.field1295, class209.field3290 + " -> <col=ff9040>" + var54.field4149, var20, var19, (byte) -4, (short) 9);
                                }
                            } else {
                                String[] var55 = var54.field4184;
                                if (class130.field2034) {
                                    var55 = class54.method482(0, var55);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        int var57 = -1;
                                        class191.field3074++;
                                        byte var58 = 0;
                                        if (var54.field4157 == var56) {
                                            var57 = var54.field4207;
                                        }
                                        if (var56 == 0) {
                                            var58 = 24;
                                        }
                                        if (var54.field4217 == var56) {
                                            var57 = var54.field4199;
                                        }
                                        if (var56 == 1) {
                                            var58 = 51;
                                        }
                                        if (var56 == 2) {
                                            var58 = 18;
                                        }
                                        if (var56 == 3) {
                                            var58 = 44;
                                        }
                                        if (var56 == 4) {
                                            var58 = 35;
                                        }
                                        class196.method1419((long) var53, var55[var56], var57, "<col=ff9040>" + var54.field4149, var20, var19, (byte) -4, var58);
                                    }
                                }
                                class196.method1419((long) var53, class201.field3183, class322.field5007, "<col=ff9040>" + var54.field4149, var20, var19, (byte) -4, (short) 1006);
                                class294.field4611++;
                            }
                        }
                    }
                }
            }
        }
    }
}
