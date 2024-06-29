import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class166 extends class106 {

    @OriginalMember(owner = "client!s", name = "K", descriptor = "S")
    public short field3376 = -32768;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
    public static int[] field3375 = new int[256];

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Lrf;")
    public static class163 field3377 = class53.method392(88, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Lrf;")
    public static class163 field3379;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Z")
    public static final boolean method1129(int arg0, byte arg1) {
        if (arg1 <= 72) {
            method1129(-103, (byte) -92);
        }
        field3373++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3371++;
        class91 var11 = this.method406(false);
        if (var11 != null) {
            var11.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3376 = var11.field3376;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1130(boolean arg0) {
        field3379 = null;
        field3377 = null;
        if (!arg0) {
            method1134(115, -53, 79, -63, -107, -57);
        }
        field3375 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
    public static final void method1131(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2345 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)Lje;")
    public class91 method406(boolean arg0) {
        field3378++;
        if (arg0) {
            field3384 = 121;
        }
        return null;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static final void method1132(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(arg0);
        field3372++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIZZ)Lue;")
    public static final class189 method1133(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        field3381++;
        class16 var5 = null;
        if (class23.field401 != null) {
            var5 = new class16(arg2, class23.field401, class25.field446[arg2], 1000000);
        }
        if (arg0 != 24781) {
            field3384 = -83;
        }
        return new class189(var5, class149.field3073, arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class80.field1620 * 128) {
            arg0 = class80.field1620 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class92.field2007 * 128) {
            arg2 = class92.field2007 * 128 - 1;
        }
        class63.field1329++;
        class181.field3639 = class1.field21[arg3];
        class194.field3827 = class1.field8[arg3];
        class122.field2572 = class1.field21[arg4];
        class71.field1501 = class1.field8[arg4];
        class150.field3109 = class155.field3212[(arg3 - 128) / 32][arg4 / 64];
        class154.field3198 = arg0;
        class208.field4046 = arg1;
        class116.field2466 = arg2;
        class79.field1608 = arg0 / 128;
        class12.field234 = arg2 / 128;
        class209.field4079 = arg5;
        class117.field2479 = class79.field1608 - class34.field669;
        if (class117.field2479 < 0) {
            class117.field2479 = 0;
        }
        class19.field310 = class12.field234 - class34.field669;
        if (class19.field310 < 0) {
            class19.field310 = 0;
        }
        class28.field522 = class79.field1608 + class34.field669;
        if (class28.field522 > class80.field1620) {
            class28.field522 = class80.field1620;
        }
        class58.field1178 = class34.field669 + class12.field234;
        if (class58.field1178 > class92.field2007) {
            class58.field1178 = class92.field2007;
        }
        class161.method1007();
        class28.field516 = 0;
        for (int var6 = class57.field1153; var6 < class41.field847; var6++) {
            class111[][] var31 = class97.field2054[var6];
            for (int var32 = class117.field2479; var32 < class28.field522; var32++) {
                for (int var33 = class19.field310; var33 < class58.field1178; var33++) {
                    class111 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field2354 <= arg5 && (class150.field3109[var32 + class34.field669 - class79.field1608][var33 + class34.field669 - class12.field234] || class99.field2086[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field2356 = true;
                            var34.field2347 = true;
                            if (var34.field2359 > 0) {
                                var34.field2341 = true;
                            } else {
                                var34.field2341 = false;
                            }
                            class28.field516++;
                        } else {
                            var34.field2356 = false;
                            var34.field2347 = false;
                            var34.field2339 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class57.field1153; var7 < class41.field847; var7++) {
            class111[][] var20 = class97.field2054[var7];
            for (int var21 = -class34.field669; var21 <= 0; var21++) {
                int var22 = class79.field1608 + var21;
                int var23 = class79.field1608 - var21;
                if (var22 >= class117.field2479 || var23 < class28.field522) {
                    for (int var24 = -class34.field669; var24 <= 0; var24++) {
                        int var25 = class12.field234 + var24;
                        int var26 = class12.field234 - var24;
                        if (var22 >= class117.field2479) {
                            if (var25 >= class19.field310) {
                                class111 var27 = var20[var22][var25];
                                if (var27 != null && var27.field2356) {
                                    class138.method904(var27, true);
                                }
                            }
                            if (var26 < class58.field1178) {
                                class111 var28 = var20[var22][var26];
                                if (var28 != null && var28.field2356) {
                                    class138.method904(var28, true);
                                }
                            }
                        }
                        if (var23 < class28.field522) {
                            if (var25 >= class19.field310) {
                                class111 var29 = var20[var23][var25];
                                if (var29 != null && var29.field2356) {
                                    class138.method904(var29, true);
                                }
                            }
                            if (var26 < class58.field1178) {
                                class111 var30 = var20[var23][var26];
                                if (var30 != null && var30.field2356) {
                                    class138.method904(var30, true);
                                }
                            }
                        }
                        if (class28.field516 == 0) {
                            class101.field2116 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class57.field1153; var8 < class41.field847; var8++) {
            class111[][] var9 = class97.field2054[var8];
            for (int var10 = -class34.field669; var10 <= 0; var10++) {
                int var11 = class79.field1608 + var10;
                int var12 = class79.field1608 - var10;
                if (var11 >= class117.field2479 || var12 < class28.field522) {
                    for (int var13 = -class34.field669; var13 <= 0; var13++) {
                        int var14 = class12.field234 + var13;
                        int var15 = class12.field234 - var13;
                        if (var11 >= class117.field2479) {
                            if (var14 >= class19.field310) {
                                class111 var16 = var9[var11][var14];
                                if (var16 != null && var16.field2356) {
                                    class138.method904(var16, false);
                                }
                            }
                            if (var15 < class58.field1178) {
                                class111 var17 = var9[var11][var15];
                                if (var17 != null && var17.field2356) {
                                    class138.method904(var17, false);
                                }
                            }
                        }
                        if (var12 < class28.field522) {
                            if (var14 >= class19.field310) {
                                class111 var18 = var9[var12][var14];
                                if (var18 != null && var18.field2356) {
                                    class138.method904(var18, false);
                                }
                            }
                            if (var15 < class58.field1178) {
                                class111 var19 = var9[var12][var15];
                                if (var19 != null && var19.field2356) {
                                    class138.method904(var19, false);
                                }
                            }
                        }
                        if (class28.field516 == 0) {
                            class101.field2116 = false;
                            return;
                        }
                    }
                }
            }
        }
        class101.field2116 = false;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3375[var0] = var1;
        }
        field3382 = 0;
        field3379 = class53.method392(65, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");
        field3383 = -1;
    }
}
