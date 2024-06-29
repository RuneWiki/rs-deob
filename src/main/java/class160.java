import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class160 {

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Laf;")
    private class181 field2893 = new class181();

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    private int field2900;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    private int field2891;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lsi;")
    private class237 field2885;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
    public static int[] field2899 = new int[128];

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Lml;")
    public static class160 field2889 = new class160(5);

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[I")
    public static int[] field2902 = new int[50];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lcc;")
    public static class313 field2901;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 4)
    public final Object method1173(int arg0, long arg1) {
        field2897++;
        if (arg0 != -19839) {
            this.field2891 = 53;
        }
        class247 var4 = (class247) this.field2885.method1631(false, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1034(-55);
        if (var5 == null) {
            var4.method499((byte) 64);
            var4.method85(100);
            this.field2900++;
            return null;
        }
        if (var4.method1035((byte) 46)) {
            class148 var6 = new class148(var5);
            this.field2885.method1636(11311, var6, var4.field1117);
            this.field2893.method1295(94, var6);
            var6.field202 = 0L;
            var4.method499((byte) 64);
            var4.method85(arg0 ^ 0xFFFFB2DF);
        } else {
            this.field2893.method1295(arg0 + 19729, var4);
            var4.field202 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILcj;)V", line = 48)
    public static final void method1174(int arg0, int arg1, int arg2, class301 arg3) {
        field2890++;
        if ((arg2 & 0x400) != 0) {
            int var4 = class227.field3834.method982((byte) 88);
            int var5 = class227.field3834.method957(arg0 + 496136338);
            if (var4 == 65535) {
                var4 = -1;
            }
            boolean var6 = true;
            if (var4 != -1 && arg3.field2445 != -1 && class110.method721(-126, class173.method1261(false, var4).field2976).field4878 < class110.method721(-124, class173.method1261(false, arg3.field2445).field2976).field4878) {
                var6 = false;
            }
            if (var6) {
                arg3.field2439 = 0;
                arg3.field2495 = var5 >> 16;
                arg3.field2466 = (var5 & 0xFFFF) + class249.field4174;
                arg3.field2445 = var4;
                arg3.field2477 = 0;
                if (arg3.field2466 > class249.field4174) {
                    arg3.field2477 = -1;
                }
                if (arg3.field2445 != -1 && class249.field4174 == arg3.field2466) {
                    int var7 = class173.method1261(false, arg3.field2445).field2976;
                    if (var7 != -1) {
                        class294 var8 = class110.method721(-125, var7);
                        if (var8 != null && var8.field4890 != null) {
                            class241.method1660(0, arg3.field2461, class286.field4744 == arg3, arg3.field2487, var8, (byte) -128);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x1) != 0) {
            arg3.field2446 = class227.field3834.method970(1);
            if (arg3.field2446.method843(0, (byte) -102) == 126) {
                arg3.field2446 = arg3.field2446.method879(arg0 ^ 0x6D00, 1);
                class73.method530(arg3.method2025(105), (byte) 104, 2, arg3.field2446);
            } else if (class286.field4744 == arg3) {
                class73.method530(arg3.method2025(arg0 + 23207), (byte) 110, 2, arg3.field2446);
            }
            arg3.field2491 = 0;
            arg3.field2481 = 0;
            arg3.field2456 = 150;
        }
        if ((arg2 & 0x40) != 0) {
            int var9 = class227.field3834.method928((byte) -52);
            byte[] var10 = new byte[var9];
            class134 var11 = new class134(var10);
            class227.field3834.method944(true, var9, 0, var10);
            class229.field3861[arg1] = var11;
            arg3.method2023((byte) -109, var11);
        }
        if ((arg2 & 0x10) != 0) {
            arg3.field2498 = class227.field3834.method932(105);
            arg3.field2457 = class227.field3834.method971(-117);
        }
        if ((arg2 & 0x4) != 0) {
            int var12 = class227.field3834.method930(arg0 ^ 0x66CF);
            int var13 = class227.field3834.method966(122);
            arg3.method1009(class249.field4174, 0, var12, var13);
            arg3.field2510 = class249.field4174 + 300;
            arg3.field2454 = class227.field3834.method951(-1);
        }
        if ((arg2 & 0x20) != 0) {
            int var14 = class227.field3834.method932(arg0 + 23239);
            int var15 = class227.field3834.method928((byte) -18);
            boolean var16 = (var14 & 0x8000) != 0;
            int var17 = class227.field3834.method948(-122);
            int var18 = class227.field3834.field2299;
            if (arg3.field5019 != null && arg3.field5004 != null) {
                long var19 = arg3.field5019.method845((byte) -126);
                boolean var21 = false;
                if (var15 <= 1) {
                    if (!var16 && (class239.field4038 && !class162.field2920 || class242.field4099)) {
                        var21 = true;
                    } else {
                        for (int var22 = 0; var22 < class116.field1961; var22++) {
                            if (class163.field2922[var22] == var19) {
                                var21 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var21 && class238.field4025 == 0) {
                    class280.field4649.field2299 = 0;
                    class227.field3834.method925((byte) 117, class280.field4649.field2282, 0, var17);
                    int var23 = -1;
                    class280.field4649.field2299 = 0;
                    class126 var24;
                    if (var16) {
                        class85 var25 = class176.method1279(class280.field4649, (byte) -42);
                        var23 = var25.field1348;
                        var14 &= 0x7FFF;
                        var24 = var25.field1346.method1512(class280.field4649, 21622);
                    } else {
                        var24 = class312.method2150(class173.method1258(class280.field4649, 120).method842((byte) -78));
                    }
                    arg3.field2446 = var24.method877(-127);
                    arg3.field2456 = 150;
                    arg3.field2491 = var14 & 0xFF;
                    arg3.field2481 = var14 >> 8;
                    if (var15 == 2) {
                        client.method807((class126) null, var24, -118, var16 ? 17 : 1, class12.method69(new class126[] { class169.field3004, arg3.method2025(58) }, (byte) 123), var23);
                    } else if (var15 == 1) {
                        client.method807((class126) null, var24, 48, var16 ? 17 : 1, class12.method69(new class126[] { class300.field4976, arg3.method2025(112) }, (byte) 127), var23);
                    } else {
                        client.method807((class126) null, var24, 63, var16 ? 17 : 2, arg3.method2025(46), var23);
                    }
                }
            }
            class227.field3834.field2299 = var17 + var18;
        }
        if (arg0 != -23138) {
            method1182(94, -27, 32, true, -93, false, 54);
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field2475 = class227.field3834.method982((byte) 105);
            if (arg3.field2475 == 65535) {
                arg3.field2475 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field2469 = class227.field3834.method948(-122);
            arg3.field2452 = class227.field3834.method948(-127);
            arg3.field2512 = class227.field3834.method966(arg0 ^ 0xFFFFA5CB);
            arg3.field2450 = class227.field3834.method948(-124);
            arg3.field2455 = class227.field3834.method971(69) + class249.field4174;
            arg3.field2479 = class227.field3834.method982((byte) 83) + class249.field4174;
            arg3.field2499 = class227.field3834.method948(-124);
            arg3.field2489 = 1;
            arg3.field2485 = 0;
        }
        if ((arg2 & 0x200) != 0) {
            int var26 = class227.field3834.method930(-15535);
            int var27 = class227.field3834.method928((byte) -49);
            arg3.method1009(class249.field4174, 0, var26, var27);
        }
        if ((arg2 & 0x2) == 0) {
            return;
        }
        int var28 = class227.field3834.method932(arg0 + 23210);
        if (var28 == 65535) {
            var28 = -1;
        }
        int var29 = class227.field3834.method966(87);
        class150.method1118(-1, var29, arg3, var28);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V", line = 287)
    public final void method1175(boolean arg0, int arg1) {
        if (class130.field2229 != null) {
            for (class247 var3 = (class247) this.field2893.method1292(true); var3 != null; var3 = (class247) this.field2893.method1293(2)) {
                if (var3.method1035((byte) 46)) {
                    if (var3.method1034(-68) == null) {
                        var3.method499((byte) 64);
                        var3.method85(99);
                        this.field2900++;
                    }
                } else if ((++var3.field202) > ((long) arg1)) {
                    class247 var4 = class130.field2229.method830(var3, -18688);
                    this.field2885.method1636(11311, var4, var3.field1117);
                    class280.method1873(var4, var3, -1897617972);
                    var3.method499((byte) 64);
                    var3.method85(109);
                }
            }
        }
        if (arg0) {
            field2892++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Loe;IIIIIIZ)V", line = 340)
    public static final void method1176(class77 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1248.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1248[var9] - class39.field625;
            int var11 = arg0.field1267[var9] - class189.field3241;
            int var12 = arg0.field1252[var9] - class318.field5452;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1263 != null) {
                class77.field1262[var9] = var13;
                class77.field1255[var9] = var16;
                class77.field1247[var9] = var17;
            }
            class77.field1258[var9] = (var13 << 9) / var17 + class236.field3981;
            class77.field1268[var9] = (var16 << 9) / var17 + class236.field3976;
        }
        class236.field3972 = 0;
        int var19 = arg0.field1261.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1261[var20];
            int var22 = arg0.field1254[var20];
            int var23 = arg0.field1253[var20];
            int var24 = class77.field1258[var21];
            int var25 = class77.field1258[var22];
            int var26 = class77.field1258[var23];
            int var27 = class77.field1268[var21];
            int var28 = class77.field1268[var22];
            int var29 = class77.field1268[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class27.field377 && class85.method594(class301.field4997 + class236.field3981, class318.field5455 + class236.field3976, var27, var28, var29, var24, var25, var26)) {
                    class152.field2786 = arg5;
                    class40.field637 = arg6;
                }
                if (!class56.field846 && !arg7) {
                    class236.field3986 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class236.field3984 || var25 > class236.field3984 || var26 > class236.field3984) {
                        class236.field3986 = true;
                    }
                    if (arg0.field1263 == null || arg0.field1263[var20] == -1) {
                        if (arg0.field1264[var20] != 12345678) {
                            class236.method1626(var27, var28, var29, var24, var25, var26, arg0.field1264[var20], arg0.field1265[var20], arg0.field1259[var20]);
                        }
                    } else if (!class44.field684) {
                        int var30 = class236.field3987.method597(arg0.field1263[var20], (byte) -98);
                        class236.method1626(var27, var28, var29, var24, var25, var26, class232.method1579(var30, arg0.field1264[var20]), class232.method1579(var30, arg0.field1265[var20]), class232.method1579(var30, arg0.field1259[var20]));
                    } else if (arg0.field1260) {
                        class236.method1617(var27, var28, var29, var24, var25, var26, arg0.field1264[var20], arg0.field1265[var20], arg0.field1259[var20], class77.field1262[0], class77.field1262[1], class77.field1262[3], class77.field1255[0], class77.field1255[1], class77.field1255[3], class77.field1247[0], class77.field1247[1], class77.field1247[3], arg0.field1263[var20]);
                    } else {
                        class236.method1617(var27, var28, var29, var24, var25, var26, arg0.field1264[var20], arg0.field1265[var20], arg0.field1259[var20], class77.field1262[var21], class77.field1262[var22], class77.field1262[var23], class77.field1255[var21], class77.field1255[var22], class77.field1255[var23], class77.field1247[var21], class77.field1247[var22], class77.field1247[var23], arg0.field1263[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lvh;I)[Ltm;", line = 456)
    public static final class161[] method1177(class147 arg0, int arg1) {
        field2898++;
        if (!arg0.method1094(103)) {
            return new class161[0];
        }
        class60 var2 = arg0.method1104(0);
        while (var2.field965 == 0) {
            class313.method2158(10L, true);
        }
        if (var2.field965 == 2) {
            return new class161[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field967);
        class161[] var4 = new class161[var3.length >> 2];
        if (arg1 > -76) {
            field2901 = (class313) null;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class161 var6 = new class161();
            var4[var5] = var6;
            var6.field2911 = var3[var5 << 2];
            var6.field2906 = var3[(var5 << 2) + 1];
            var6.field2914 = var3[(var5 << 2) + 2];
            var6.field2908 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 499)
    public final void method1178(int arg0) {
        this.field2893.method1301(-124);
        if (arg0 >= -68) {
            this.field2885 = (class237) null;
        }
        this.field2885.method1629(0);
        field2896++;
        this.field2900 = this.field2891;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 513)
    public final void method1179(Object arg0, long arg1, byte arg2) {
        field2894++;
        this.method1186(arg1, (byte) -73);
        if (this.field2900 == 0) {
            class247 var5 = (class247) this.field2893.method1296((byte) -83);
            var5.method499((byte) 64);
            var5.method85(89);
        } else {
            this.field2900--;
        }
        if (arg2 != -72) {
            this.field2893 = (class181) null;
        }
        class148 var6 = new class148(arg0);
        this.field2885.method1636(11311, var6, arg1);
        this.field2893.method1295(4, var6);
        var6.field202 = 0L;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 541)
    public static final void method1180(byte arg0) {
        if (arg0 >= 61) {
            field2888++;
            class37.field546.method1185(1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[[[Lma;ZIII)Z", line = 554)
    public static final boolean method1181(int arg0, class5[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2884++;
        byte var6 = arg2 ? 1 : (byte) (class167.field2970 & 0xFF);
        if (class214.field3639[class131.field2250][arg0][arg5] == var6) {
            return false;
        } else if ((class301.field4992[class131.field2250][arg0][arg5] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class205.field3520[var8] = arg0;
            int var31 = var8 + 1;
            class140.field2564[var8] = arg5;
            class214.field3639[class131.field2250][arg0][arg5] = var6;
            while (var7 != var31) {
                int var9 = class205.field3520[var7] >> 16 & 0xFF;
                int var10 = class205.field3520[var7] & 0xFFFF;
                int var11 = class140.field2564[var7] & 0xFFFF;
                int var12 = class205.field3520[var7] >> 24 & 0xFF;
                int var13 = class140.field2564[var7] >> 16 & 0xFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class301.field4992[class131.field2250][var10][var11] & 0x4) == 0) {
                    var15 = true;
                }
                label243: for (int var16 = class131.field2250 + 1; var16 <= 3; var16++) {
                    if ((class301.field4992[var16][var10][var11] & 0x8) == 0) {
                        if (var15 && arg1[var16][var10][var11] != null) {
                            if (arg1[var16][var10][var11].field46 != null) {
                                int var17 = class12.method71(var9, arg4 ^ 0xFFFFFF81);
                                if (arg1[var16][var10][var11].field46.field2238 == var17 || arg1[var16][var10][var11].field46.field2236 == var17) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var18 = class12.method71(var12, arg4 ^ 0xFFFFFF84);
                                    if (arg1[var16][var10][var11].field46.field2238 == var18 || arg1[var16][var10][var11].field46.field2236 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class12.method71(var13, -126);
                                    if (arg1[var16][var10][var11].field46.field2238 == var19 || arg1[var16][var10][var11].field46.field2236 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var10][var11].field54 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var10][var11].field61; var20++) {
                                    int var21 = (int) (arg1[var16][var10][var11].field54[var20].field4045 >> 14 & 0x3FL);
                                    int var22 = (int) (arg1[var16][var10][var11].field54[var20].field4045 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var21 | var22 << 6;
                                    if (var9 == var23 || var12 != 0 && var12 == var23 || var13 != 0 && var13 == var23) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        class5 var24 = arg1[var16][var10][var11];
                        if (var24 != null && var24.field61 > 0) {
                            for (int var25 = 0; var25 < var24.field61; var25++) {
                                class240 var26 = var24.field54[var25];
                                if (var26.field4051 != var26.field4041 || var26.field4046 != var26.field4044) {
                                    for (int var27 = var26.field4041; var27 <= var26.field4051; var27++) {
                                        for (int var28 = var26.field4046; var28 <= var26.field4044; var28++) {
                                            class214.field3639[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class214.field3639[var16][var10][var11] = var6;
                    }
                }
                if (var14) {
                    if (class264.field4396[class131.field2250 + 1][var10][var11] > class174.field3073[arg3]) {
                        class174.field3073[arg3] = class264.field4396[class131.field2250 + 1][var10][var11];
                    }
                    int var29 = var10 << 7;
                    if (var29 < class305.field5127[arg3]) {
                        class305.field5127[arg3] = var29;
                    } else if (class253.field4253[arg3] < var29) {
                        class253.field4253[arg3] = var29;
                    }
                    int var30 = var11 << 7;
                    if (class22.field310[arg3] > var30) {
                        class22.field310[arg3] = var30;
                    } else if (var30 > class300.field4973[arg3]) {
                        class300.field4973[arg3] = var30;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class214.field3639[class131.field2250][var10 - 1][var11] != var6) {
                        class205.field3520[var31] = class221.method1516(-754974720, class221.method1516(1179648, var10 - 1));
                        class140.field2564[var31] = class221.method1516(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class214.field3639[class131.field2250][var10 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var10 - 1) >= 0 && class214.field3639[class131.field2250][var10 - 1][var11] != var6 && (class301.field4992[class131.field2250][var10][var11] & 0x4) == 0 && (class301.field4992[class131.field2250][var10 - 1][var11 - 1] & 0x4) == 0) {
                            class205.field3520[var31] = class221.method1516(1375731712, class221.method1516(var10 - 1, 1179648));
                            class140.field2564[var31] = class221.method1516(var11, 1245184);
                            class214.field3639[class131.field2250][var10 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class214.field3639[class131.field2250][var10][var11] != var6) {
                            class205.field3520[var31] = class221.method1516(class221.method1516(5373952, var10), 318767104);
                            class140.field2564[var31] = class221.method1516(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3639[class131.field2250][var10][var11] = var6;
                        }
                        if ((var10 + 1) < 104 && class214.field3639[class131.field2250][var10 + 1][var11] != var6 && (class301.field4992[class131.field2250][var10][var11] & 0x4) == 0 && (class301.field4992[class131.field2250][var10 + 1][var11 - 1] & 0x4) == 0) {
                            class205.field3520[var31] = class221.method1516(class221.method1516(var10 + 1, 5373952), -1845493760);
                            class140.field2564[var31] = class221.method1516(var11, 5439488);
                            class214.field3639[class131.field2250][var10 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if ((var10 + 1) < 104 && class214.field3639[class131.field2250][var10 + 1][var11] != var6) {
                        class205.field3520[var31] = class221.method1516(class221.method1516(var10 + 1, 9568256), 1392508928);
                        class140.field2564[var31] = class221.method1516(var11, 9633792);
                        class214.field3639[class131.field2250][var10 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var10 - 1 >= 0 && class214.field3639[class131.field2250][var10 - 1][var11] != var6 && (class301.field4992[class131.field2250][var10][var11] & 0x4) == 0 && (class301.field4992[class131.field2250][var10 - 1][var11 + 1] & 0x4) == 0) {
                            class205.field3520[var31] = class221.method1516(class221.method1516(13762560, var10 - 1), 301989888);
                            class140.field2564[var31] = class221.method1516(var11, 13828096);
                            class214.field3639[class131.field2250][var10 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class214.field3639[class131.field2250][var10][var11] != var6) {
                            class205.field3520[var31] = class221.method1516(class221.method1516(13762560, var10), -1828716544);
                            class140.field2564[var31] = class221.method1516(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3639[class131.field2250][var10][var11] = var6;
                        }
                        if (var10 + 1 < 104 && class214.field3639[class131.field2250][var10 + 1][var11] != var6 && (class301.field4992[class131.field2250][var10][var11] & 0x4) == 0 && (class301.field4992[class131.field2250][var10 + 1][var11 + 1] & 0x4) == 0) {
                            class205.field3520[var31] = class221.method1516(-771751936, class221.method1516(var10 + 1, 9568256));
                            class140.field2564[var31] = class221.method1516(var11, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3639[class131.field2250][var10 + 1][var11] = var6;
                        }
                    }
                }
            }
            if (class174.field3073[arg3] != -1000000) {
                class174.field3073[arg3] += 10;
                class305.field5127[arg3] -= 50;
                class253.field4253[arg3] += 50;
                class300.field4973[arg3] += 50;
                class22.field310[arg3] -= 50;
            }
            if (arg4 != 1) {
                field2901 = (class313) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZIZI)V", line = 866)
    public static final void method1182(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg3) {
            class56.method380();
        }
        if (class45.field693 != null && (arg6 != 3 || class95.field1503 != arg4 || class212.field3613 != arg1)) {
            class244.method1680(class45.field693, (byte) 93, class161.field2907);
            class45.field693 = null;
        }
        field2883++;
        if (arg6 == 3 && class45.field693 == null) {
            class45.field693 = class129.method902(0, arg1, arg4, 0, class161.field2907, -106);
            if (class45.field693 != null) {
                class95.field1503 = arg4;
                class212.field3613 = arg1;
                class123.method823(arg2 ^ 0xFFFFE068, class161.field2907);
            }
        }
        if (arg2 != 19771) {
            method1176((class77) null, -56, 98, 121, 85, -103, -84, true);
        }
        if (arg6 == 3 && class45.field693 == null) {
            method1182(arg0, -1, arg2 ^ 0x0, true, -1, true, class189.field3242);
            return;
        }
        Container var7;
        if (class45.field693 != null) {
            var7 = class45.field693;
        } else if (class253.field4250 == null) {
            var7 = class161.field2907.field2705;
        } else {
            var7 = class253.field4250;
        }
        class9.field117 = var7.getSize().width;
        class22.field307 = var7.getSize().height;
        if (class253.field4250 == var7) {
            Insets var8 = class253.field4250.getInsets();
            class9.field117 -= var8.right + var8.left;
            class22.field307 -= var8.top + var8.bottom;
        }
        if (arg6 < 2) {
            class7.field87 = 765;
            class134.field2292 = (class9.field117 - 765) / 2;
            class70.field1154 = 0;
            class1.field6 = 503;
        } else {
            class7.field87 = class9.field117;
            class134.field2292 = 0;
            class70.field1154 = 0;
            class1.field6 = class22.field307;
        }
        if (arg5) {
            class163.method1193((byte) -73, class24.field342);
            class47.method291(class24.field342, 0);
            if (class44.field685 != null) {
                class44.field685.method555((byte) 9, class24.field342);
            }
            class19.field260.method1438((byte) 82);
            class238.method1640(class24.field342, (byte) 31);
            class31.method152(1, class24.field342);
            if (class44.field685 != null) {
                class44.field685.method559(class24.field342, 17330);
            }
        } else {
            if (class56.field846) {
                class56.method365(class7.field87, class1.field6);
            }
            class24.field342.setSize(class7.field87, class1.field6);
            if (class253.field4250 == var7) {
                Insets var9 = class253.field4250.getInsets();
                class24.field342.setLocation(class134.field2292 + var9.left, class70.field1154 + var9.top);
            } else {
                class24.field342.setLocation(class134.field2292, class70.field1154);
            }
        }
        if (arg6 == 0 && arg0 > 0) {
            class56.method374(class24.field342);
        }
        if (arg3 && arg6 > 0) {
            class24.field342.setIgnoreRepaint(true);
            if (!class199.field3394) {
                class48.method304();
                class106.field1668 = null;
                class106.field1668 = class118.method772((byte) -114, class1.field6, class24.field342, class7.field87);
                class276.method1861();
                if (class280.field4662 == 5) {
                    class107.method708(class200.field3414, arg2 - 19767, true);
                } else {
                    class250.method1693(false, class302.field5036, true);
                }
                try {
                    Graphics var10 = class24.field342.getGraphics();
                    class106.field1668.method135(0, 0, (byte) 91, var10);
                } catch (Exception var14) {
                }
                class14.method82(500);
                if (arg0 == 0) {
                    class106.field1668 = class118.method772((byte) -98, 503, class24.field342, 765);
                } else {
                    class106.field1668 = null;
                }
                class60 var12 = class161.field2907.method1099(class19.field260.getClass(), (byte) -88);
                while (var12.field965 == 0) {
                    class313.method2158(100L, true);
                }
                if (var12.field965 == 1) {
                    class199.field3394 = true;
                }
            }
            if (class199.field3394) {
                class56.method386(class24.field342, class22.field300 * 2);
            }
        }
        if (!class56.field846 && arg6 > 0) {
            method1182(arg0, -1, arg2 ^ 0x0, true, -1, true, 0);
            return;
        }
        if (arg6 > 0 && arg0 == 0) {
            class189.field3248.setPriority(5);
            class106.field1668 = null;
            class38.method219();
            ((class232) class236.field3987).method1582(200, true);
            if (class249.field4166) {
                class236.method1614(0.7F);
            }
            class283.method1891(0);
        } else if (arg6 == 0 && arg0 > 0) {
            class189.field3248.setPriority(1);
            class106.field1668 = class118.method772((byte) -105, 503, class24.field342, 765);
            class38.method238();
            class211.method1474();
            ((class232) class236.field3987).method1582(20, true);
            if (class249.field4166) {
                if (class287.field4776 == 1) {
                    class236.method1614(0.9F);
                }
                if (class287.field4776 == 2) {
                    class236.method1614(0.8F);
                }
                if (class287.field4776 == 3) {
                    class236.method1614(0.7F);
                }
                if (class287.field4776 == 4) {
                    class236.method1614(0.6F);
                }
            }
            class201.method1419();
            class283.method1891(0);
        }
        class13.field184 = !class22.method109(arg2 - 15675);
        if (arg3) {
            class122.method802(-1);
        }
        if (arg6 >= 2) {
            class309.field5242 = true;
        } else {
            class309.field5242 = false;
        }
        if (class182.field3162 != -1) {
            class100.method679(true, -14575);
        }
        if (class59.field953 != null && (class280.field4662 == 30 || class280.field4662 == 25)) {
            class5.method30(-122);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class220.field3698[var13] = true;
        }
        class111.field1751 = true;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 1097)
    public static void method1183(int arg0) {
        if (arg0 != 1179648) {
            method1174(127, -99, -3, (class301) null);
        }
        field2899 = null;
        field2901 = null;
        field2889 = null;
        field2902 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I", line = 1110)
    public final int method1184(int arg0) {
        field2895++;
        int var2 = 0;
        if (arg0 < 64) {
            this.field2893 = (class181) null;
        }
        for (class247 var3 = (class247) this.field2893.method1292(true); var3 != null; var3 = (class247) this.field2893.method1293(2)) {
            if (!var3.method1035((byte) 46)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 1142)
    public final void method1185(int arg0) {
        if (arg0 != 1) {
            method1177((class147) null, 79);
        }
        for (class247 var2 = (class247) this.field2893.method1292(true); var2 != null; var2 = (class247) this.field2893.method1293(2)) {
            if (var2.method1035((byte) 46)) {
                var2.method499((byte) 64);
                var2.method85(108);
                this.field2900++;
            }
        }
        field2887++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(JB)V", line = 1169)
    public final void method1186(long arg0, byte arg1) {
        field2886++;
        class247 var4 = (class247) this.field2885.method1631(false, arg0);
        if (var4 != null) {
            var4.method499((byte) 64);
            var4.method85(49);
            this.field2900++;
        }
        int var5 = -99 % ((arg1 - 25) / 51);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I)V", line = 1199)
    public class160(int arg0) {
        this.field2900 = arg0;
        this.field2891 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2885 = new class237(var2);
    }
}
