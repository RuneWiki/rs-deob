import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class189 extends class285 {

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "Z")
    public static boolean field3105 = false;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "[[[I")
    public static int[][][] field3099;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBZI[[[Lkb;I)Z", line = 4)
    public static final boolean method1399(int arg0, byte arg1, boolean arg2, int arg3, class204[][][] arg4, int arg5) {
        field3098++;
        byte var6 = arg2 ? 1 : (byte) (class97.field1385 & 0xFF);
        if (class7.field101[class49.field698][arg0][arg3] == var6) {
            return false;
        } else if ((class129.field2025[class49.field698][arg0][arg3] & 0x4) == 0) {
            return false;
        } else {
            if (arg1 >= -106) {
                field3105 = false;
            }
            byte var7 = 0;
            class44.field559[var7] = arg0;
            int var8 = 0;
            int var31 = var7 + 1;
            class144.field2248[var7] = arg3;
            class7.field101[class49.field698][arg0][arg3] = var6;
            while (var31 != var8) {
                int var9 = class44.field559[var8] & 0xFFFF;
                int var10 = class44.field559[var8] >> 16 & 0xFF;
                int var11 = class44.field559[var8] >> 24 & 0xFF;
                int var12 = (class144.field2248[var8] & 0xFF2843) >> 16;
                boolean var13 = false;
                int var14 = class144.field2248[var8] & 0xFFFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class129.field2025[class49.field698][var9][var14] & 0x4) == 0) {
                    var13 = true;
                }
                label246: for (int var16 = class49.field698 + 1; var16 <= 3; var16++) {
                    if ((class129.field2025[var16][var9][var14] & 0x8) == 0) {
                        if (var13 && arg4[var16][var9][var14] != null) {
                            if (arg4[var16][var9][var14].field3364 != null) {
                                int var17 = class81.method551(var10, (byte) -127);
                                if (arg4[var16][var9][var14].field3364.field3597 == var17 || arg4[var16][var9][var14].field3364.field3602 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class81.method551(var11, (byte) -128);
                                    if (arg4[var16][var9][var14].field3364.field3597 == var18 || arg4[var16][var9][var14].field3364.field3602 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class81.method551(var12, (byte) -128);
                                    if (arg4[var16][var9][var14].field3364.field3597 == var19 || arg4[var16][var9][var14].field3364.field3602 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var14].field3343 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var9][var14].field3360; var20++) {
                                    int var21 = (int) (arg4[var16][var9][var14].field3343[var20].field2358 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg4[var16][var9][var14].field3343[var20].field2358 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var12 != 0 && var12 == var23) {
                                        continue label246;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class204 var24 = arg4[var16][var9][var14];
                        if (var24 != null && var24.field3360 > 0) {
                            for (int var25 = 0; var25 < var24.field3360; var25++) {
                                class153 var26 = var24.field3343[var25];
                                if (var26.field2371 != var26.field2355 || var26.field2366 != var26.field2361) {
                                    for (int var27 = var26.field2371; var27 <= var26.field2355; var27++) {
                                        for (int var28 = var26.field2366; var28 <= var26.field2361; var28++) {
                                            class7.field101[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class7.field101[var16][var9][var14] = var6;
                    }
                }
                if (var15) {
                    int var29 = var9 << 7;
                    int var30 = var14 << 7;
                    if (class110.field1642[class49.field698 + 1][var9][var14] > class5.field78[arg5]) {
                        class5.field78[arg5] = class110.field1642[class49.field698 + 1][var9][var14];
                    }
                    if (var29 < class164.field2736[arg5]) {
                        class164.field2736[arg5] = var29;
                    } else if (class121.field1879[arg5] < var29) {
                        class121.field1879[arg5] = var29;
                    }
                    if (var30 < class84.field1174[arg5]) {
                        class84.field1174[arg5] = var30;
                    } else if (class15.field193[arg5] < var30) {
                        class15.field193[arg5] = var30;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class7.field101[class49.field698][var9 - 1][var14] != var6) {
                        class44.field559[var31] = class122.method882(-754974720, class122.method882(1179648, var9 - 1));
                        class144.field2248[var31] = class122.method882(1245184, var14);
                        var31 = var31 + 1 & 0xFFF;
                        class7.field101[class49.field698][var9 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if (var9 - 1 >= 0 && class7.field101[class49.field698][var9 - 1][var14] != var6 && (class129.field2025[class49.field698][var9][var14] & 0x4) == 0 && (class129.field2025[class49.field698][var9 - 1][var14 - 1] & 0x4) == 0) {
                            class44.field559[var31] = class122.method882(class122.method882(1179648, var9 - 1), 1375731712);
                            class144.field2248[var31] = class122.method882(var14, 1245184);
                            class7.field101[class49.field698][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class7.field101[class49.field698][var9][var14] != var6) {
                            class44.field559[var31] = class122.method882(318767104, class122.method882(var9, 5373952));
                            class144.field2248[var31] = class122.method882(5439488, var14);
                            class7.field101[class49.field698][var9][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class7.field101[class49.field698][var9 + 1][var14] != var6 && (class129.field2025[class49.field698][var9][var14] & 0x4) == 0 && (class129.field2025[class49.field698][var9 + 1][var14 - 1] & 0x4) == 0) {
                            class44.field559[var31] = class122.method882(class122.method882(5373952, var9 + 1), -1845493760);
                            class144.field2248[var31] = class122.method882(var14, 5439488);
                            class7.field101[class49.field698][var9 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var14--;
                    if ((var9 + 1) < 104 && class7.field101[class49.field698][var9 + 1][var14] != var6) {
                        class44.field559[var31] = class122.method882(class122.method882(9568256, var9 + 1), 1392508928);
                        class144.field2248[var31] = class122.method882(9633792, var14);
                        class7.field101[class49.field698][var9 + 1][var14] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if (var9 - 1 >= 0 && class7.field101[class49.field698][var9 - 1][var14] != var6 && (class129.field2025[class49.field698][var9][var14] & 0x4) == 0 && (class129.field2025[class49.field698][var9 - 1][var14 + 1] & 0x4) == 0) {
                            class44.field559[var31] = class122.method882(301989888, class122.method882(var9 - 1, 13762560));
                            class144.field2248[var31] = class122.method882(13828096, var14);
                            class7.field101[class49.field698][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class7.field101[class49.field698][var9][var14] != var6) {
                            class44.field559[var31] = class122.method882(class122.method882(13762560, var9), -1828716544);
                            class144.field2248[var31] = class122.method882(var14, 13828096);
                            class7.field101[class49.field698][var9][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class7.field101[class49.field698][var9 + 1][var14] != var6 && (class129.field2025[class49.field698][var9][var14] & 0x4) == 0 && (class129.field2025[class49.field698][var9 + 1][var14 + 1] & 0x4) == 0) {
                            class44.field559[var31] = class122.method882(-771751936, class122.method882(9568256, var9 + 1));
                            class144.field2248[var31] = class122.method882(9633792, var14);
                            class7.field101[class49.field698][var9 + 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class5.field78[arg5] != -1000000) {
                class5.field78[arg5] += 10;
                class164.field2736[arg5] -= 50;
                class121.field1879[arg5] += 50;
                class15.field193[arg5] += 50;
                class84.field1174[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "(I)V", line = 315)
    public static void method1400(int arg0) {
        if (arg0 > -40) {
            field3105 = true;
        }
        field3099 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLjj;I)V", line = 325)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            this.field3104 = -40;
        }
        field3102++;
        if (arg2 == 0) {
            this.method1403(-102, arg1.method273(-867673064));
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILqi;)V", line = 352)
    public static final void method1401(int arg0, class234 arg1) {
        field3106++;
        if (arg0 != -1) {
            return;
        }
        for (class155 var2 = (class155) class229.field3636.method1240(arg0 + 4); var2 != null; var2 = (class155) class229.field3636.method1235(false)) {
            if (var2.field2386 == arg1) {
                if (var2.field2375 != null) {
                    class191.field3127.method118(var2.field2375);
                    var2.field2375 = null;
                }
                var2.method1212((byte) 94);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V", line = 388)
    private class189(int arg0) {
        super(0, false);
        this.method1403(-109, arg0);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z", line = 399)
    public static final boolean method1402(int arg0, int arg1) {
        field3100++;
        if (arg1 != 4) {
            method1404(35);
        }
        return arg0 == 4 || arg0 == 8;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 410)
    private final void method1403(int arg0, int arg1) {
        this.field3101 = (arg1 & 0xFF) << 4;
        field3107++;
        this.field3103 = (arg1 & 0xFF00) >> 4;
        this.field3104 = (arg1 & 0xFF0000) >> 12;
        if (arg0 > -93) {
            this.field3104 = 52;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 422)
    public class189() {
        this(0);
    }

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "(I)V", line = 428)
    public static final void method1404(int arg0) {
        class176.field2942.method702((byte) 127);
        if (arg0 != 1) {
            field3099 = (int[][][]) ((int[][][]) null);
        }
        field3097++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[[I", line = 441)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 <= 121) {
            method1401(-62, (class234) null);
        }
        field3095++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class287.field4599; var7++) {
                var4[var7] = this.field3104;
                var5[var7] = this.field3103;
                var6[var7] = this.field3101;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I", line = 485)
    public static final int method1405(int arg0, int arg1, int arg2) {
        field3096++;
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 != 6995) {
            method1402(-88, 59);
        }
        return arg1;
    }
}
