import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class186 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
    public static boolean field3256 = false;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lpj;")
    private static class237 field3259 = class33.method353("glow1:", 54);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lpj;")
    public static class237 field3258 = field3259;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lpj;")
    public static class237 field3255 = field3259;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
    public static boolean field3265 = false;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lpj;")
    private static class237 field3260 = class33.method353(" from your ignore list first)3", 84);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lpj;")
    public static class237 field3262 = field3260;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lpj;")
    public static class237 field3266 = class33.method353("::rect_debug", 44);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[[[B")
    public static byte[][][] field3257;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1271(int arg0) {
        class41.field926.method942(0);
        field3261++;
        if (arg0 != -10094) {
            field3260 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method1272(int arg0) {
        field3262 = null;
        field3257 = null;
        int var1 = 119 / ((arg0 + 7) / 59);
        field3266 = null;
        field3259 = null;
        field3258 = null;
        field3255 = null;
        field3260 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)I")
    public static final int method1273(boolean arg0) {
        field3268++;
        if (class39.field897) {
            return 0;
        } else if (class151.method1033((byte) -78)) {
            if (!arg0) {
                field3262 = null;
            }
            return class92.field1662 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLw;)V")
    public static final void method1274(int arg0, int arg1, byte arg2, class141 arg3) {
        if (arg3.field2552 == 1) {
            class55.method489(0, arg3.field2455, (short) 35, class239.field4202, 0L, arg3.field2530, (byte) -115);
            class241.field4242++;
        }
        if (arg3.field2552 == 2 && !class15.field244) {
            class237 var4 = class115.method848(-92, arg3);
            if (var4 != null) {
                class25.field453++;
                class55.method489(-1, var4, (short) 44, class238.method1626(new class237[] { class65.field1289, arg3.field2475 }, arg2 - 27), 0L, arg3.field2530, (byte) -112);
            }
        }
        if (arg3.field2552 == 3) {
            class55.method489(0, class207.field3536, (short) 3, class239.field4202, 0L, arg3.field2530, (byte) -71);
            class188.field3282++;
        }
        if (arg2 != -65) {
            return;
        }
        field3267++;
        if (arg3.field2552 == 4) {
            class33.field701++;
            class55.method489(0, arg3.field2455, (short) 40, class239.field4202, 0L, arg3.field2530, (byte) -81);
        }
        if (arg3.field2552 == 5) {
            class55.method489(0, arg3.field2455, (short) 38, class239.field4202, 0L, arg3.field2530, (byte) -127);
            class159.field2863++;
        }
        if (arg3.field2552 == 6 && class83.field1552 == null) {
            class55.method489(-1, arg3.field2455, (short) 19, class239.field4202, 0L, arg3.field2530, (byte) -116);
            class96.field1710++;
        }
        if (arg3.field2529 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field2484; var6++) {
                for (int var7 = 0; var7 < arg3.field2440; var7++) {
                    int var8 = (arg3.field2482 + 32) * var7;
                    int var9 = (arg3.field2421 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg3.field2479[var5];
                        var9 += arg3.field2478[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg1 && arg0 < var8 + 32 && arg1 < (var9 + 32)) {
                        class149.field2645 = arg3;
                        class108.field1926 = var5;
                        if (arg3.field2548[var5] > 0) {
                            class8 var10 = class112.method829((byte) -82, arg3.field2548[var5] - 1);
                            if (class70.field1376 == 1 && class226.method1508(client.method1042(arg3), (byte) 42)) {
                                if (class113.field1977 != arg3.field2530 || class112.field1960 != var5) {
                                    class55.method489(var5, class37.field831, (short) 17, class238.method1626(new class237[] { class28.field544, class197.field3431, var10.field131 }, -52), (long) var10.field134, arg3.field2530, (byte) -104);
                                    class207.field3521++;
                                }
                            } else if (!class15.field244 || !class226.method1508(client.method1042(arg3), (byte) 37)) {
                                class182.field3193++;
                                class237[] var11 = var10.field157;
                                if (class220.field3793) {
                                    var11 = class259.method1747(1328872140, var11);
                                }
                                if (class226.method1508(client.method1042(arg3), (byte) 76)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class220.field3791++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 2;
                                            } else {
                                                var13 = 16;
                                            }
                                            class55.method489(var5, var11[var12], var13, class238.method1626(new class237[] { class152.field2700, var10.field131 }, -126), (long) var10.field134, arg3.field2530, (byte) -105);
                                        } else if (var12 == 4) {
                                            class55.method489(var5, class36.field795, (short) 16, class238.method1626(new class237[] { class152.field2700, var10.field131 }, arg2 ^ 0x67), (long) var10.field134, arg3.field2530, (byte) -108);
                                            class90.field1646++;
                                        }
                                    }
                                }
                                if (class91.method688(client.method1042(arg3), -19388)) {
                                    class55.method489(var5, class37.field831, (short) 25, class238.method1626(new class237[] { class152.field2700, var10.field131 }, -32), (long) var10.field134, arg3.field2530, (byte) -117);
                                    class231.field4011++;
                                }
                                if (class226.method1508(client.method1042(arg3), (byte) 88) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 48;
                                            }
                                            if (var14 == 1) {
                                                var15 = 20;
                                            }
                                            if (var14 == 2) {
                                                var15 = 24;
                                            }
                                            class193.field3341++;
                                            class55.method489(var5, var11[var14], var15, class238.method1626(new class237[] { class152.field2700, var10.field131 }, arg2 + 8), (long) var10.field134, arg3.field2530, (byte) -72);
                                        }
                                    }
                                }
                                class237[] var16 = arg3.field2437;
                                if (class220.field3793) {
                                    var16 = class259.method1747(1328872140, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class107.field1915++;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 1;
                                            }
                                            if (var17 == 2) {
                                                var18 = 12;
                                            }
                                            if (var17 == 3) {
                                                var18 = 51;
                                            }
                                            if (var17 == 4) {
                                                var18 = 8;
                                            }
                                            class55.method489(var5, var16[var17], var18, class238.method1626(new class237[] { class152.field2700, var10.field131 }, -78), (long) var10.field134, arg3.field2530, (byte) -100);
                                        }
                                    }
                                }
                                class55.method489(var5, class172.field2992, (short) 1001, class238.method1626(new class237[] { class152.field2700, var10.field131 }, -69), (long) var10.field134, arg3.field2530, (byte) -86);
                            } else if ((class149.field2644 & 0x10) == 16) {
                                class115.field2022++;
                                class55.method489(var5, class203.field3481, (short) 57, class238.method1626(new class237[] { class181.field3177, class197.field3431, var10.field131 }, arg2 ^ 0x16), (long) var10.field134, arg3.field2530, (byte) -100);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field2536) {
            return;
        }
        if (!class15.field244) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class237 var23 = class12.method117(arg2 + 65, var19, arg3);
                if (var23 != null) {
                    class55.method489(arg3.field2433, var23, (short) 1004, arg3.field2485, (long) (var19 + 1), arg3.field2530, (byte) -122);
                    field3264++;
                }
            }
            class237 var20 = class115.method848(-96, arg3);
            if (var20 != null) {
                class55.method489(arg3.field2433, var20, (short) 44, arg3.field2485, 0L, arg3.field2530, (byte) -109);
                class25.field453++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class237 var22 = class12.method117(0, var21, arg3);
                if (var22 != null) {
                    class55.method489(arg3.field2433, var22, (short) 46, arg3.field2485, (long) (var21 + 1), arg3.field2530, (byte) -91);
                    field3264++;
                }
            }
            if (class120.method865(client.method1042(arg3), -117)) {
                class55.method489(arg3.field2433, class26.field480, (short) 19, class239.field4202, 0L, arg3.field2530, (byte) -109);
                class96.field1710++;
                return;
            }
            return;
        }
        if (class162.method1145((byte) 81, client.method1042(arg3)) && (class149.field2644 & 0x20) == 32) {
            class55.method489(arg3.field2433, class203.field3481, (short) 37, class238.method1626(new class237[] { class181.field3177, class269.field4597, arg3.field2485 }, -125), 0L, arg3.field2530, (byte) -86);
            class139.field2403++;
            return;
        }
    }
}
