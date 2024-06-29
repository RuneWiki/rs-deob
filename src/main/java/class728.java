import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public abstract class class728 extends class173 {

    @OriginalMember(owner = "client!hfa", name = "s", descriptor = "Lofa;")
    public class320 field9559;

    @OriginalMember(owner = "client!hfa", name = "u", descriptor = "I")
    public int field9561;

    @OriginalMember(owner = "client!hfa", name = "v", descriptor = "F")
    public static float field9562;

    @OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!hfa", name = "t", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!hfa", name = "w", descriptor = "I")
    public static int field9563;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hfa", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field9564;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIII)I")
    public static final int method3893(int arg0, int arg1, int arg2, int arg3) {
        field9558++;
        if (arg2 != -20086) {
            return 29;
        } else if (arg1 == arg3) {
            return arg3;
        } else {
            int var4 = 128 - arg0;
            int var5 = (arg1 & 0x7F) * arg0 + (arg3 & 0x7F) * var4 >> 7;
            int var6 = (arg3 & 0x380) * var4 + ((arg1 & 0x380) * arg0) >> 7;
            int var7 = (arg1 & 0xFC00) * arg0 + (arg3 & 0xFC00) * var4 >> 7;
            return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Z")
    public abstract boolean method825(byte arg0);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lha;ZI)Z")
    public static final boolean method3894(class570 arg0, boolean arg1, int arg2) {
        field9560++;
        int var3 = (class240.field3280 - 104) / 2;
        int var4 = (class276.field3602 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class408.method2373(arg2, 16, var57, var6, var58)) {
                        int var59 = var58;
                        if (class433.method2484(var57, 0, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class226.method1457(var59, var57, false, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class737.field9982 = arg0.method3078((byte) 71, 512, 512, var7, 0, 512);
        class202.method1378(false);
        int var9 = (int) (Math.random() * 20.0D) + (238 - (10 - (((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16)))) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x3D12FF00) << 16;
        if (arg1) {
            return true;
        }
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class178.field2334 + 2 + 1][class178.field2334 + 3];
        for (int var13 = var3; var13 < var3 + 104; var13 += class178.field2334) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class178.field2334) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class178.field2334 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class178.field2334 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg0.method915(0, 0, class178.field2334 * 4 + var37, class178.field2334 * 4 + var38);
                arg0.method907(-16777216);
                for (int var43 = arg2; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class178.field2334; var50++) {
                        for (int var56 = 0; var56 <= class178.field2334; var56++) {
                            var12[var50][var56] = class408.method2373(arg2, 16, var40 + var56, var39 + var50, var43);
                        }
                    }
                    class383.field4790[var43].method2069(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class171.field2263) {
                        for (int var51 = -4; var51 < class178.field2334; var51++) {
                            for (int var52 = -4; var52 < class178.field2334; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var54 >= var4 && class408.method2373(arg2, 16, var54, var53, var43)) {
                                    int var55 = var43;
                                    if (class433.method2484(var54, 0, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class138.method793(-12856, var10, var9, var53, var37 + (var51 * 4), arg0, (class178.field2334 - var52) * 4 + var38 - 4, var55, var54);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class171.field2263) {
                    class340 var44 = class179.field2391[arg2];
                    for (int var45 = 0; var45 < class178.field2334; var45++) {
                        for (int var46 = 0; var46 < class178.field2334; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field4160[var47 - var44.field4158][var48 - var44.field4157];
                            if ((var49 & 0x40240000) != 0) {
                                arg0.method3068(false, var45 * 4 + var37, (-var46 + class178.field2334) * 4 + -4 + var38, 4, -1713569622, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg0.method3076(4, var45 * 4 + var37, !arg1, -1713569622, (class178.field2334 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg0.method3065((class178.field2334 - var46) * 4 + var38 - 4, -1713569622, 4, (byte) 17, var37 + (var45 * 4) + 3);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg0.method3076(4, var45 * 4 + var37, true, -1713569622, (class178.field2334 - var46) * 4 + var38 + 3 - 4);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg0.method3065((class178.field2334 - var46) * 4 + (var38 - 4), -1713569622, 4, (byte) 17, var45 * 4 + var37);
                            }
                        }
                    }
                }
                arg0.method921(var37, var38, class178.field2334 * 4, class178.field2334 * 4, var11, 2);
                class737.field9982.method622((var13 - var3) * 4 + 48, 464 - class178.field2334 * 4 + -((-var4 + var36) * 4), class178.field2334 * 4, class178.field2334 * 4, var37, var38);
            }
        }
        arg0.method957();
        arg0.method907(-16777215);
        class135.method783(0);
        class223.field3033 = 0;
        class33.field363.method3594(84);
        if (!class171.field2263) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; arg2 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class408.method2373(arg2, 16, var20, var14, var21)) {
                            class274 var22 = (class274) class740.method4019(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class274) class238.method1571(var21, var14, var20, field9564 == null ? (field9564 = method3895("aia")) : field9564);
                            }
                            if (var22 == null) {
                                var22 = (class274) class127.method741(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class274) class14.method60(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class773 var23 = class390.field4983.method4292(var22.method1010(-6546), (byte) -74);
                                if (!var23.field10526 || class216.field2939) {
                                    int var24 = var23.field10443;
                                    if (var23.field10536 != null) {
                                        for (int var25 = 0; var25 < var23.field10536.length; var25++) {
                                            if (var23.field10536[var25] != -1) {
                                                class773 var26 = class390.field4983.method4292(var23.field10536[var25], (byte) -86);
                                                if (var26.field10443 >= 0) {
                                                    var24 = var26.field10443;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class624 var28 = class272.field3575.method2323(var24, true);
                                            if (var28 != null && var28.field7934) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class179.field2391[var21].field4160;
                                            int var32 = class179.field2391[var21].field4158;
                                            int var33 = class179.field2391[var21].field4157;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class382.field4783[class223.field3033] = var23.field10531;
                                        class323.field3998[class223.field3033] = var29;
                                        class645.field8250[class223.field3033] = var30;
                                        class223.field3033++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class17.field159 != null) {
                class735.field9972.field294 = 1;
                class272.field3575.method2322(false, 1024, 64);
                for (int var15 = 0; var15 < class17.field159.field7691; var15++) {
                    int var16 = class17.field159.field7690[var15];
                    if ((var16 >> 28) == class422.field5564.field2895) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class714.field9407;
                        int var18 = (var16 & 0x3FFF) - class240.field3293;
                        if (var17 >= 0 && var17 < class240.field3280 && var18 >= 0 && var18 < class276.field3602) {
                            class33.field363.method3593(new class405(var15), 15);
                        } else {
                            class624 var19 = class272.field3575.method2323(class17.field159.field7688[var15], true);
                            if (var19.field7953 != null && (var19.field7919 + var17) >= 0 && class240.field3280 > (var19.field7922 + var17) && (var18 + var19.field7923) >= 0 && class276.field3602 > var19.field7928 + var18) {
                                class33.field363.method3593(new class405(var15), 15);
                            }
                        }
                    }
                }
                class272.field3575.method2322(false, 128, 64);
                class735.field9972.field294 = 2;
                class735.field9972.method155(false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lofa;I)V")
    public class728(class320 arg0, int arg1) {
        this.field9559 = arg0;
        this.field9561 = arg1;
    }

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method828(byte arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3895(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
