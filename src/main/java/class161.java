import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class161 extends class176 {

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "[I")
    public static int[] field3124 = new int[32];

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "[J")
    public static long[] field3123 = new long[500];

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lob;")
    private static class141 field3130;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "[[I")
    public static int[][] field3125;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Lob;")
    public static class141 field3128;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Lob;")
    public static class141 field3129;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Laa;")
    public class2 field3121;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
    public static final void method1122(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3122++;
        class221.field4184 = 0;
        for (int var5 = -1; var5 < class195.field3738 + class184.field3587; var5++) {
            class203 var21;
            if (var5 == -1) {
                var21 = class114.field2176;
            } else if (var5 < class184.field3587) {
                var21 = class116.field2231[class188.field3647[var5]];
            } else {
                var21 = class10.field172[class203.field3888[var5 - class184.field3587]];
            }
            if (var21 != null && var21.method251((byte) 86)) {
                if (var21 instanceof class131) {
                    class10 var22 = ((class131) var21).field2507;
                    if (var22.field197 != null) {
                        var22 = var22.method61((byte) 121);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class184.field3587) {
                    class10 var28 = ((class131) var21).field2507;
                    if (var28.field197 != null) {
                        var28 = var28.method61((byte) 124);
                    }
                    if (var28.field198 >= 0 && class22.field367.length > var28.field198) {
                        class45.method302(var21, (byte) -8, var21.method1346((byte) 95) + 15);
                        if (class15.field273 > -1) {
                            class22.field367[var28.field198].method683(arg2 + class15.field273 - 12, class119.field2321 + arg3 - 30);
                        }
                    }
                    class108[] var29 = class200.field3777;
                    for (int var30 = 0; var30 < var29.length; var30++) {
                        class108 var32 = var29[var30];
                        if (var32 != null && var32.field2077 == 1 && class203.field3888[var5 - class184.field3587] == var32.field2074 && class20.field344 % 20 < 10) {
                            class45.method302(var21, (byte) -8, var21.method1346((byte) 61) + 15);
                            if (class15.field273 > -1) {
                                class67.field1314[var32.field2082].method683(class15.field273 + arg2 - 12, arg3 + -28 + class119.field2321);
                            }
                        }
                    }
                } else {
                    class38 var23 = (class38) var21;
                    int var24 = 30;
                    if (var23.field769 != -1 || var23.field750 != -1) {
                        class45.method302(var21, (byte) -8, var21.method1346((byte) 94) + 15);
                        if (class15.field273 > -1) {
                            if (var23.field769 != -1) {
                                class125.field2407[var23.field769].method683(arg2 + class15.field273 - 12, class119.field2321 + arg3 + -var24);
                                var24 += 25;
                            }
                            if (var23.field750 != -1) {
                                class22.field367[var23.field750].method683(class15.field273 + arg2 - 12, -var24 + arg3 + class119.field2321);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0) {
                        class108[] var25 = class200.field3777;
                        for (int var26 = 0; var26 < var25.length; var26++) {
                            class108 var27 = var25[var26];
                            if (var27 != null && var27.field2077 == 10 && class188.field3647[var5] == var27.field2074) {
                                class45.method302(var21, (byte) -8, var21.method1346((byte) 54) + 15);
                                if (class15.field273 > -1) {
                                    class67.field1314[var27.field2082].method683(class15.field273 + arg2 - 12, arg3 - -class119.field2321 - var24);
                                }
                            }
                        }
                    }
                }
                if (var21.field3866 != null && (var5 >= class184.field3587 || class67.field1316 == 0 || class67.field1316 == 3 || class67.field1316 == 1 && class157.method1092(((class38) var21).field773, (byte) -115))) {
                    class45.method302(var21, (byte) -8, var21.method1346((byte) 55));
                    if (class15.field273 > -1 && class146.field2834 > class221.field4184) {
                        class146.field2811[class221.field4184] = class81.field1624.method869(var21.field3866) / 2;
                        class146.field2802[class221.field4184] = class81.field1624.field2618;
                        class146.field2831[class221.field4184] = class15.field273;
                        class146.field2822[class221.field4184] = class119.field2321;
                        class146.field2839[class221.field4184] = var21.field3891;
                        class146.field2803[class221.field4184] = var21.field3853;
                        class146.field2801[class221.field4184] = var21.field3886;
                        class146.field2848[class221.field4184] = var21.field3866;
                        class221.field4184++;
                    }
                }
                if (var21.field3880 > class20.field344) {
                    class45.method302(var21, (byte) -8, var21.method1346((byte) 123) + 15);
                    if (class15.field273 > -1) {
                        class148.method1030(arg2 + class15.field273 - 15, class119.field2321 - 3 + arg3, var21.field3863, 5, 65280);
                        class148.method1030(arg2 + class15.field273 + var21.field3863 - 15, arg3 + -3 + class119.field2321, 30 - var21.field3863, 5, 16711680);
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var21.field3849[var31] > class20.field344) {
                        class45.method302(var21, (byte) -8, var21.method1346((byte) 69) / 2);
                        if (class15.field273 > -1) {
                            if (var31 == 1) {
                                class119.field2321 -= 20;
                            }
                            if (var31 == 2) {
                                class15.field273 -= 15;
                                class119.field2321 -= 10;
                            }
                            if (var31 == 3) {
                                class119.field2321 -= 10;
                                class15.field273 += 15;
                            }
                            class174.field3451[var21.field3896[var31]].method683(arg2 + class15.field273 - 12, class119.field2321 + arg3 + -12);
                            class165.field3198.method873(class78.method543((byte) 93, var21.field3868[var31]), arg2 + class15.field273 - 1, class119.field2321 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg0) {
            field3123 = null;
        }
        for (int var6 = 0; var6 < class221.field4184; var6++) {
            int var7 = class146.field2811[var6];
            int var8 = class146.field2802[var6];
            int var9 = class146.field2822[var6];
            boolean var10 = true;
            int var11 = class146.field2831[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class146.field2822[var20] - class146.field2802[var20] < var9 - -2 && class146.field2822[var20] + 2 > var9 - var8 && class146.field2831[var20] + class146.field2811[var20] > -var7 + var11 && var7 + var11 > class146.field2831[var20] - class146.field2811[var20] && class146.field2822[var20] - class146.field2802[var20] < var9) {
                        var10 = true;
                        var9 = class146.field2822[var20] - class146.field2802[var20];
                    }
                }
            }
            class15.field273 = class146.field2831[var6];
            class119.field2321 = class146.field2822[var6] = var9;
            class141 var12 = class146.field2848[var6];
            if (class94.field1877 == 0) {
                int var13 = 16776960;
                if (class146.field2839[var6] < 6) {
                    var13 = class124.field2390[class146.field2839[var6]];
                }
                if (class146.field2839[var6] == 6) {
                    var13 = class45.field866 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class146.field2839[var6] == 7) {
                    var13 = class45.field866 % 20 < 10 ? 255 : 65535;
                }
                if (class146.field2839[var6] == 8) {
                    var13 = class45.field866 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class146.field2839[var6] == 9) {
                    int var14 = 150 - class146.field2801[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 64780;
                    }
                }
                if (class146.field2839[var6] == 10) {
                    int var15 = 150 - class146.field2801[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16384000 + 16711935 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 255 - (var15 + -100) * 5 - 32768000;
                    }
                }
                if (class146.field2839[var6] == 11) {
                    int var16 = 150 - class146.field2801[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class146.field2803[var6] == 0) {
                    class81.field1624.method873(var12, arg2 + class15.field273, class119.field2321 + arg3, var13, 0);
                }
                if (class146.field2803[var6] == 1) {
                    class81.field1624.method880(var12, class15.field273 + arg2, class119.field2321 + arg3, var13, 0, class45.field866);
                }
                if (class146.field2803[var6] == 2) {
                    class81.field1624.method862(var12, class15.field273 + arg2, class119.field2321 + arg3, var13, 0, class45.field866);
                }
                if (class146.field2803[var6] == 3) {
                    class81.field1624.method864(var12, class15.field273 + arg2, class119.field2321 + arg3, var13, 0, class45.field866, 150 - class146.field2801[var6]);
                }
                if (class146.field2803[var6] == 4) {
                    int var17 = (150 - class146.field2801[var6]) * (class81.field1624.method869(var12) + 100) / 150;
                    class148.method1037(arg2 + class15.field273 - 50, arg3, class15.field273 + arg2 + 50, arg1 + arg3);
                    class81.field1624.method866(var12, arg2 + class15.field273 + 50 - var17, class119.field2321 + arg3, var13, 0);
                    class148.method1020(arg2, arg3, arg2 + arg4, arg3 - -arg1);
                }
                if (class146.field2803[var6] == 5) {
                    int var18 = 150 - class146.field2801[var6];
                    class148.method1037(arg2, arg3 + class119.field2321 - class81.field1624.field2618 - 1, arg2 + arg4, class119.field2321 + arg3 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class81.field1624.method873(var12, arg2 + class15.field273, arg3 + var19 + class119.field2321, var13, 0);
                    class148.method1020(arg2, arg3, arg2 + arg4, arg1 + arg3);
                }
            } else {
                class81.field1624.method873(var12, class15.field273 + arg2, class119.field2321 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
    public static final void method1123(int arg0, int arg1) {
        class153 var2 = class131.field2506[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class153 var4 = class131.field2506[var3][arg0][arg1] = class131.field2506[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2925--;
                for (int var5 = 0; var5 < var4.field2933; var5++) {
                    class9 var6 = var4.field2935[var5];
                    if ((var6.field141 >> 29 & 0x3L) == 2L && var6.field156 == arg0 && var6.field143 == arg1) {
                        var6.field150--;
                    }
                }
            }
        }
        if (class131.field2506[0][arg0][arg1] == null) {
            class131.field2506[0][arg0][arg1] = new class153(0, arg0, arg1);
        }
        class131.field2506[0][arg0][arg1].field2927 = var2;
        class131.field2506[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBI)V")
    public static final void method1124(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 55) {
            return;
        }
        class68.field1323 = arg1;
        class130.field2470 = arg4;
        class136.field2590 = arg0;
        class35.field698 = arg2;
        field3127++;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)I")
    public static final int method1125(int arg0, int arg1) {
        field3131++;
        return arg1 >= -113 ? 123 : arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public static final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class68.field1323 <= arg2 && class136.field2590 >= arg2) {
            int var5 = class106.method703(class35.field698, class130.field2470, true, arg0);
            int var6 = class106.method703(class35.field698, class130.field2470, true, arg4);
            class66.method441(arg2, arg1, var6, var5, 0);
        }
        if (arg3 != 27908) {
            field3123 = null;
        }
        field3126++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILjava/awt/Component;)Lkg;")
    public static final class106 method1127(int arg0, int arg1, int arg2, Component arg3) {
        field3120++;
        try {
            Class var4 = Class.forName("k");
            if (arg2 != 100) {
                method1127(-94, -4, 102, null);
            }
            class106 var5 = (class106) var4.getDeclaredConstructor().newInstance();
            var5.method656(arg0, 20053, arg3, arg1);
            return var5;
        } catch (Throwable var7) {
            class122 var6 = new class122();
            var6.method656(arg0, 20053, arg3, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method1128(int arg0) {
        field3125 = null;
        field3128 = null;
        if (arg0 != 5) {
            method1125(26, -84);
        }
        field3124 = null;
        field3123 = null;
        field3130 = null;
        field3129 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3124[var1] = var0 - 1;
            var0 += var0;
        }
        field3130 = class175.method1195(40, "FULL");
        field3125 = new int[104][104];
        field3128 = class175.method1195(40, "Der Server wird gerade aktualisiert)3");
        field3129 = field3130;
        field3132 = 0;
    }
}
