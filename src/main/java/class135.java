import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class135 {

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "[B")
    public byte[] field2381;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "[S")
    public short[] field2378;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "[I")
    public int[] field2373;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[S")
    public short[] field2368;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[Llc;")
    public class143[] field2375;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Llc;")
    public static class143 field2365 = class66.method374("Chargement en cours)3 Veuillez patienter)3", -1);

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    public static int[] field2366 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Llc;")
    public static class143 field2370 = class66.method374("glissement:", -1);

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Llc;")
    public static class143 field2374 = class66.method374("<br>", -1);

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Llc;")
    private static class143 field2371 = class66.method374("Started 3d Library", -1);

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "[I")
    public static int[] field2379 = new int[2048];

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Llc;")
    public static class143 field2380 = field2371;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "Lda;")
    public static class102 field2377;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lrg;")
    public static class80 field2364;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)I")
    public final int method810(int arg0, int arg1) {
        if (arg0 != 3) {
            method811(-41);
        }
        field2367++;
        return this.field2381[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method811(int arg0) {
        field2371 = null;
        field2366 = null;
        field2380 = null;
        field2374 = null;
        field2370 = null;
        int var1 = -38 / ((-arg0 - 14) / 42);
        field2379 = null;
        field2377 = null;
        field2364 = null;
        field2365 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIILqk;Lqk;IIJ)V")
    public static final void method812(int arg0, int arg1, int arg2, int arg3, class51 arg4, class51 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class57 var10 = new class57();
        var10.field1096 = arg8;
        var10.field1097 = arg1 * 128 + 64;
        var10.field1101 = arg2 * 128 + 64;
        var10.field1102 = arg3;
        var10.field1105 = arg4;
        var10.field1099 = arg5;
        var10.field1100 = arg6;
        var10.field1104 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class7.field122[var11][arg1][arg2] == null) {
                class7.field122[var11][arg1][arg2] = new class120(var11, arg1, arg2);
            }
        }
        class7.field122[arg0][arg1][arg2].field2131 = var10;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIZI)V")
    public static final void method813(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            return;
        }
        if (arg1 >= class31.field481 && class9.field173 >= arg1) {
            int var5 = class83.method476(true, class188.field3398, arg2, class239.field4321);
            int var6 = class83.method476(!arg3, class188.field3398, arg0, class239.field4321);
            class250.method1662(arg4, arg1, (byte) 17, var6, var5);
        }
        field2363++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)Z")
    public final boolean method814(byte arg0, int arg1) {
        if (arg0 > -22) {
            field2374 = null;
        }
        field2372++;
        return (this.field2381[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I)V")
    public class135(int arg0) {
        this.field2376 = arg0;
        this.field2381 = new byte[this.field2376];
        this.field2378 = new short[this.field2376];
        this.field2373 = new int[this.field2376];
        this.field2368 = new short[this.field2376];
        this.field2375 = new class143[this.field2376];
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILh;)V")
    public static final void method815(int arg0, class190 arg1) {
        field2369++;
        while (true) {
            while (arg1.field3465.length > arg1.field3487) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1265(124) == 1) {
                    var2 = true;
                    var3 = arg1.method1265(arg0 ^ 0xFFFFC5A9);
                    var4 = arg1.method1265(122);
                }
                int var5 = arg1.method1265(118);
                int var6 = arg1.method1265(124);
                int var7 = class25.field426 - (var6 * 64 + -class236.field4298) - 1;
                int var8 = var5 * 64 - class245.field4412;
                if (var8 >= 0 && (var7 - 63) >= 0 && class169.field3009 > (var8 + 63) && var7 < class25.field426) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && (var3 * 8 + 8) > var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                int var13 = arg1.method1265(arg0 ^ 0xFFFFC5AD);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1265(125);
                                        if (class39.field678[var9][var10] == null) {
                                            class39.field678[var9][var10] = new byte[4096];
                                        }
                                        class39.field678[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1275(128);
                                        if (class118.field2099[var9][var10] == null) {
                                            class118.field2099[var9][var10] = new short[4096];
                                        }
                                        class118.field2099[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method1265(115) & 0xFF) << 16) + (arg1.method1265(119) & 0xFF << 8) + (arg1.method1265(125) & 0xFF);
                                        if (class234.field4271[var9][var10] == null) {
                                            class234.field4271[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class209 var17 = class34.method232(167, var16);
                                        if (var17.field3868 != null) {
                                            var17 = var17.method1467((byte) -124);
                                            if (var17 == null || var17.field3851 == -1) {
                                                continue;
                                            }
                                        }
                                        class234.field4271[var9][var10][(63 - var12 << 6) + var11] = var17.field3879 + 1;
                                        class59 var18 = new class59();
                                        var18.field1133 = var17.field3851;
                                        var18.field1136 = var7;
                                        var18.field1132 = var8;
                                        class176.field3166.method1290((byte) -44, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1265(arg0 + 15002);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3487++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3487 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3487 += 3;
                            }
                        }
                    }
                }
            }
            if (arg0 != -14882) {
                method812(64, 11, 33, 117, (class51) null, (class51) null, 14, 49, -124L);
                return;
            }
            return;
        }
    }
}
