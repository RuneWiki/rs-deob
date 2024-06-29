import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class122 extends class106 {

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Leh;")
    public class47 field2458 = class192.field3724;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public int field2461 = 0;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "[Leh;")
    public static class47[] field2467 = new class47[100];

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lwf;")
    public static class204 field2471 = new class204(4096);

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Leh;")
    private static class47 field2477 = class195.method1282((byte) -4, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "Leh;")
    public static class47 field2478 = null;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Leh;")
    public static class47 field2475 = field2477;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "[I")
    public static int[] field2479 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Leh;")
    public static class47 field2476 = class195.method1282((byte) -4, "mn");

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "[I")
    public int[] field2459;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "[I")
    public int[] field2460;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[Leh;")
    public class47[] field2464;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[Lfb;")
    public static class50[] field2472;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static final void method935(byte arg0) {
        field2469++;
        class151.field2955.method993(1);
        if (arg0 < 114) {
            field2479 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLve;)V")
    public static final void method936(byte arg0, class194 arg1) {
        field2456++;
        if (arg0 != 24) {
            return;
        }
        if (class125.field2512) {
            class103.method846(-74, arg1);
            return;
        }
        if (class100.field2105 == 1 && class3.field29 >= 715 && class185.field3546 >= 453) {
            class182.field3492 = !class182.field3492;
            if (class182.field3492) {
                class191.method1255(arg0 ^ 0x65D5);
            } else {
                class114.method896(false, 255, class161.field3127, class189.field3667, class23.field453, 0);
            }
        }
        if (class158.field3078 == 5) {
            return;
        }
        class83.field1770++;
        if (class158.field3078 != 10) {
            return;
        }
        if (class161.field3129 != 2 && class132.field2606 == 0) {
            if (class100.field2105 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class3.field29 >= var2 && class3.field29 <= var2 + var4 && class185.field3546 >= var3 && var3 + var5 >= class185.field3546) {
                    class179.method1191(true);
                    return;
                }
            }
            if (class161.field3143 != null) {
                class179.method1191(true);
            }
        }
        int var6 = class100.field2105;
        int var7 = class3.field29;
        int var8 = class185.field3546;
        if (class95.field1961 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var6 == 1 && var9 - 75 <= var7 && var9 + 75 >= var7 && var8 >= var10 - 20 && var8 <= var10 + 20) {
                class95.field1961 = 3;
                class141.field2772 = 0;
            }
            short var11 = 462;
            boolean var12 = false;
            if (class94.field1954 != 0) {
                while (class55.method476((byte) -102)) {
                    if (class14.field302 == 84) {
                        var12 = true;
                        break;
                    }
                }
            }
            if (var12 || var6 == 1 && var7 >= var11 - 75 && var11 + 75 >= var7 && var10 - 20 <= var8 && var8 <= var10 + 20) {
                class161.field3121 = class199.field3890;
                class95.field1961 = 2;
                class141.field2772 = 0;
                class161.field3144 = class186.field3564;
                class161.field3146 = class186.field3550;
            }
        } else if (class95.field1961 == 2) {
            short var13 = 231;
            int var21 = var13 + 30;
            short var14 = 302;
            if (var6 == 1 && var21 - 15 <= var8 && var21 > var8) {
                class141.field2772 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var21 - 15 <= var8 && var21 > var8) {
                class141.field2772 = 1;
            }
            short var15 = 321;
            var21 += 15;
            if (var6 == 1 && var14 - 75 <= var7 && var14 + 75 >= var7 && var8 >= var15 - 20 && var8 <= var15 + 20) {
                class161.field3142 = class161.field3142.method395((byte) -61).method387(false);
                if (class161.field3142.method376(-43) == 0) {
                    class51.method453(class131.field2585, class186.field3570, class186.field3583, -82);
                } else if (class161.field3126.method376(-43) == 0) {
                    class51.method453(class167.field3262, class186.field3557, class186.field3575, arg0 ^ 0xFFFFFF82);
                } else {
                    class51.method453(class95.field1965, class186.field3559, class186.field3580, arg0 - 137);
                    class198.method1299(0, 20);
                }
            } else {
                short var16 = 462;
                if (var6 == 1 && var7 >= var16 - 75 && var16 + 75 >= var7 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                    class95.field1961 = 0;
                    class161.field3142 = class161.field3127;
                    class161.field3126 = class161.field3127;
                }
                while (true) {
                    while (class55.method476((byte) -120)) {
                        boolean var17 = false;
                        for (int var18 = 0; var18 < class181.field3465.method376(-43); var18++) {
                            if (class194.field3777 == class181.field3465.method392(var18, 55)) {
                                var17 = true;
                                break;
                            }
                        }
                        if (class141.field2772 == 0) {
                            if (class14.field302 == 85 && class161.field3142.method376(arg0 - 67) > 0) {
                                class161.field3142 = class161.field3142.method401(class161.field3142.method376(-43) - 1, 0, -49);
                            }
                            if (class14.field302 == 84 || class14.field302 == 80) {
                                class141.field2772 = 1;
                            }
                            if (var17 && class161.field3142.method376(arg0 - 67) < 12) {
                                class161.field3142 = class161.field3142.method412(true, class194.field3777);
                            }
                        } else if (class141.field2772 == 1) {
                            if (class14.field302 == 85 && class161.field3126.method376(-43) > 0) {
                                class161.field3126 = class161.field3126.method401(class161.field3126.method376(arg0 ^ -51) - 1, 0, -49);
                            }
                            if (class14.field302 == 84 || class14.field302 == 80) {
                                class141.field2772 = 0;
                            }
                            if (class94.field1954 != 0 && class14.field302 == 84) {
                                class161.field3142 = class161.field3142.method395((byte) -61).method387(false);
                                if (class161.field3142.method376(-43) == 0) {
                                    class51.method453(class131.field2585, class186.field3570, class186.field3583, -121);
                                    return;
                                }
                                if (class161.field3126.method376(-43) == 0) {
                                    class51.method453(class167.field3262, class186.field3557, class186.field3575, -90);
                                    return;
                                }
                                class51.method453(class95.field1965, class186.field3559, class186.field3580, arg0 ^ 0xFFFFFF97);
                                class198.method1299(0, 20);
                                return;
                            }
                            if (var17 && class161.field3126.method376(-43) < 20) {
                                class161.field3126 = class161.field3126.method412(true, class194.field3777);
                            }
                        }
                    }
                    return;
                }
            }
        } else if (class95.field1961 == 3) {
            short var19 = 321;
            short var20 = 382;
            if (var6 == 1 && var20 - 75 <= var7 && var20 + 75 >= var7 && var8 >= var19 - 20 && var8 <= var19 + 20) {
                class95.field1961 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static void method937(int arg0) {
        field2477 = null;
        if (arg0 != 10) {
            field2468 = -79;
        }
        field2478 = null;
        field2475 = null;
        field2479 = null;
        field2467 = null;
        field2471 = null;
        field2476 = null;
        field2472 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lhd;I)V")
    public final void method938(class68 arg0, int arg1) {
        field2466++;
        while (true) {
            int var3 = arg0.method604((byte) -124);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method939();
                    return;
                }
            }
            this.method940((byte) 86, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
    public static final void method939() {
        for (int var0 = 0; var0 < class14.field305; var0++) {
            class60 var1 = class103.field2166[var0];
            class99.method805(var1);
            class103.field2166[var0] = null;
        }
        class14.field305 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLhd;I)V")
    private final void method940(byte arg0, class68 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2463 = arg1.method604((byte) -126);
        } else if (arg2 == 2) {
            this.field2465 = arg1.method604((byte) -18);
        } else if (arg2 == 3) {
            this.field2458 = arg1.method575(91);
        } else if (arg2 == 4) {
            this.field2457 = arg1.method599((byte) 96);
        } else if (arg2 == 5) {
            this.field2461 = arg1.method569(26496);
            this.field2459 = new int[this.field2461];
            this.field2464 = new class47[this.field2461];
            for (int var5 = 0; var5 < this.field2461; var5++) {
                this.field2459[var5] = arg1.method599((byte) 96);
                this.field2464[var5] = arg1.method575(99);
            }
        } else if (arg2 == 6) {
            this.field2461 = arg1.method569(26496);
            this.field2460 = new int[this.field2461];
            this.field2459 = new int[this.field2461];
            for (int var4 = 0; var4 < this.field2461; var4++) {
                this.field2459[var4] = arg1.method599((byte) 96);
                this.field2460[var4] = arg1.method599((byte) 96);
            }
        }
        field2455++;
        int var6 = -102 / ((-arg0 - 20) / 61);
    }
}
