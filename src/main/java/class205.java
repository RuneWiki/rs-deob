import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class205 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Ltg;")
    public static class184 field3940 = class135.method812("Bitte versuchen Sie es in ", 3);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Ltg;")
    public static class184 field3943 = class135.method812("Gegenstand f-Ur Mitglieder", 3);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ltg;")
    public static class184 field3938 = class135.method812("Das ist eine Mitglieder)2Welt(Q", 3);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[Lre;")
    public static class164[] field3945 = new class164[5000];

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lah;")
    public static class9 field3948 = new class9(512);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Ltg;")
    public class184 field3944;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lvb;")
    public static class197 field3939;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Z")
    public boolean field3947;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1298(int arg0) {
        field3948 = null;
        field3940 = null;
        field3939 = null;
        if (arg0 > -87) {
            field3943 = null;
        }
        field3938 = null;
        field3943 = null;
        field3945 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1299(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class62.field1178 * arg2 + class36.field682 * arg0 >> 16;
        int var5 = class36.field682 * arg2 - class62.field1178 * arg0 >> 16;
        int var6 = class135.field2448 * var5 + class134.field2445 * arg1 >> 16;
        int var7 = class135.field2448 * arg1 - class134.field2445 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class186.field3596;
            int var9 = (var7 << 9) / var6 + class12.field233;
            return var8 >= class87.field1597 && var8 <= class204.field3921 && var9 >= class170.field3233 && var9 <= class58.field1092;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class8.field145 * 128) {
            arg0 = class8.field145 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class159.field2853 * 128) {
            arg2 = class159.field2853 * 128 - 1;
        }
        class103.field1884++;
        class134.field2445 = class23.field422[arg3];
        class135.field2448 = class23.field434[arg3];
        class62.field1178 = class23.field422[arg4];
        class36.field682 = class23.field434[arg4];
        class176.field3364 = class178.field3393[(arg3 - 128) / 32][arg4 / 64];
        class138.field2506 = arg0;
        class101.field1864 = arg1;
        class209.field4011 = arg2;
        class21.field405 = arg0 / 128;
        class208.field3999 = arg2 / 128;
        class126.field2264 = arg5;
        class156.field2790 = class21.field405 - class69.field1323;
        if (class156.field2790 < 0) {
            class156.field2790 = 0;
        }
        class179.field3416 = class208.field3999 - class69.field1323;
        if (class179.field3416 < 0) {
            class179.field3416 = 0;
        }
        class14.field278 = class69.field1323 + class21.field405;
        if (class14.field278 > class8.field145) {
            class14.field278 = class8.field145;
        }
        class167.field3002 = class69.field1323 + class208.field3999;
        if (class167.field3002 > class159.field2853) {
            class167.field3002 = class159.field2853;
        }
        class106.method660();
        class175.field3316 = 0;
        for (int var6 = class143.field2578; var6 < class87.field1608; var6++) {
            class90[][] var31 = class190.field3704[var6];
            for (int var32 = class156.field2790; var32 < class14.field278; var32++) {
                for (int var33 = class179.field3416; var33 < class167.field3002; var33++) {
                    class90 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field1676 <= arg5 && (class176.field3364[var32 + class69.field1323 - class21.field405][var33 + class69.field1323 - class208.field3999] || class131.field2380[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field1671 = true;
                            var34.field1688 = true;
                            if (var34.field1680 > 0) {
                                var34.field1677 = true;
                            } else {
                                var34.field1677 = false;
                            }
                            class175.field3316++;
                        } else {
                            var34.field1671 = false;
                            var34.field1688 = false;
                            var34.field1678 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class143.field2578; var7 < class87.field1608; var7++) {
            class90[][] var20 = class190.field3704[var7];
            for (int var21 = -class69.field1323; var21 <= 0; var21++) {
                int var22 = class21.field405 + var21;
                int var23 = class21.field405 - var21;
                if (var22 >= class156.field2790 || var23 < class14.field278) {
                    for (int var24 = -class69.field1323; var24 <= 0; var24++) {
                        int var25 = class208.field3999 + var24;
                        int var26 = class208.field3999 - var24;
                        if (var22 >= class156.field2790) {
                            if (var25 >= class179.field3416) {
                                class90 var27 = var20[var22][var25];
                                if (var27 != null && var27.field1671) {
                                    class47.method269(var27, true);
                                }
                            }
                            if (var26 < class167.field3002) {
                                class90 var28 = var20[var22][var26];
                                if (var28 != null && var28.field1671) {
                                    class47.method269(var28, true);
                                }
                            }
                        }
                        if (var23 < class14.field278) {
                            if (var25 >= class179.field3416) {
                                class90 var29 = var20[var23][var25];
                                if (var29 != null && var29.field1671) {
                                    class47.method269(var29, true);
                                }
                            }
                            if (var26 < class167.field3002) {
                                class90 var30 = var20[var23][var26];
                                if (var30 != null && var30.field1671) {
                                    class47.method269(var30, true);
                                }
                            }
                        }
                        if (class175.field3316 == 0) {
                            class169.field3193 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class143.field2578; var8 < class87.field1608; var8++) {
            class90[][] var9 = class190.field3704[var8];
            for (int var10 = -class69.field1323; var10 <= 0; var10++) {
                int var11 = class21.field405 + var10;
                int var12 = class21.field405 - var10;
                if (var11 >= class156.field2790 || var12 < class14.field278) {
                    for (int var13 = -class69.field1323; var13 <= 0; var13++) {
                        int var14 = class208.field3999 + var13;
                        int var15 = class208.field3999 - var13;
                        if (var11 >= class156.field2790) {
                            if (var14 >= class179.field3416) {
                                class90 var16 = var9[var11][var14];
                                if (var16 != null && var16.field1671) {
                                    class47.method269(var16, false);
                                }
                            }
                            if (var15 < class167.field3002) {
                                class90 var17 = var9[var11][var15];
                                if (var17 != null && var17.field1671) {
                                    class47.method269(var17, false);
                                }
                            }
                        }
                        if (var12 < class14.field278) {
                            if (var14 >= class179.field3416) {
                                class90 var18 = var9[var12][var14];
                                if (var18 != null && var18.field1671) {
                                    class47.method269(var18, false);
                                }
                            }
                            if (var15 < class167.field3002) {
                                class90 var19 = var9[var12][var15];
                                if (var19 != null && var19.field1671) {
                                    class47.method269(var19, false);
                                }
                            }
                        }
                        if (class175.field3316 == 0) {
                            class169.field3193 = false;
                            return;
                        }
                    }
                }
            }
        }
        class169.field3193 = false;
    }
}
