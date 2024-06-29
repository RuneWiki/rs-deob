import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class44 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lam;")
    public static class286 field449;

    // $FF: synthetic field
    @OriginalMember(owner = "client!be", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field456;

    // $FF: synthetic method
    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method210(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method205(int arg0, boolean arg1, int arg2) {
        class254.field3495[arg2] = arg0;
        if (!arg1) {
            field449 = null;
        }
        field452++;
        class392 var3 = (class392) class126.field1618.method308((long) arg2, (byte) 86);
        if (var3 == null) {
            class392 var4 = new class392(class442.method2730(25207) + 500L);
            class126.field1618.method314((long) arg2, var4, 7079);
        } else {
            var3.field5638 = class442.method2730(25207) + 500L;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILvm;)Z", line = 27)
    public static final boolean method206(int arg0, int arg1, class322 arg2) {
        field454++;
        int var3 = (class315.field4214 - 104) / 2;
        int var4 = (class340.field4549 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class230.method1249(var51, var52, arg1, var6, -119)) {
                        int var53 = var52;
                        if (class67.method381((byte) 97, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class335.method1910(var51, var6, var53, 5);
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
        class342.field4581 = arg2.method1637(var7, 0, 512, 512, 512);
        class57.method300(-60);
        int var9 = 228 - (-((int) (Math.random() * 20.0D)) - ((((int) (Math.random() * 20.0D)) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8))) | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class131.field1697][class131.field1697];
        if (arg0 >= -35) {
            return false;
        }
        for (int var13 = var3; var13 < var3 + 104; var13 += class131.field1697) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class131.field1697) {
                arg2.method1648(0, 0, class131.field1697 * 4, class131.field1697 * 4);
                arg2.method1578(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class131.field1697; var44++) {
                        for (int var50 = 0; var50 < class131.field1697; var50++) {
                            var12[var44][var50] = class230.method1249(var36 + var50, var37, arg1, var13 + var44, -114);
                        }
                    }
                    class272.field3682[var37].method279(0, 0, 1024, var13, var36, class131.field1697 + var13, class131.field1697 + var36, var12);
                    if (!class243.field3314) {
                        for (int var45 = -4; var45 < class131.field1697; var45++) {
                            for (int var46 = -4; var46 < class131.field1697; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var4 <= var48 && class230.method1249(var48, var37, arg1, var47, -93)) {
                                    int var49 = var37;
                                    if (class67.method381((byte) -49, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class417.method2590(arg2, var49, (byte) -99, var45 * 4, (class131.field1697 - var46) * 4 - 4, var47, var9, var48, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class243.field3314) {
                    class438 var38 = class36.field352[arg1];
                    for (int var39 = 0; var39 < class131.field1697; var39++) {
                        for (int var40 = 0; var40 < class131.field1697; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field6422[var41 - var38.field6415][var42 - var38.field6423];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method1860((class131.field1697 - var40) * 4 - 4, -3272, 4, var39 * 4, 4, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method1857((class131.field1697 - var40) * 4 - 4, -1713569622, -66, 4, var39 * 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method1861((class131.field1697 - var40) * 4 - 4, -1713569622, true, 4, var39 * 4 + 3);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method1857((class131.field1697 - var40) * 4 + 3 - 4, -1713569622, 89, 4, var39 * 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method1861((class131.field1697 - var40) * 4 - 4, -1713569622, true, 4, var39 * 4);
                            }
                        }
                    }
                }
                arg2.method1614(0, 0, class131.field1697 * 4, class131.field1697 * 4, var11, 2);
                class342.field4581.method95((var13 - var3) * 4 + 48, -((var36 - var4) * 4) + 464 + -(class131.field1697 * 4), class131.field1697 * 4, class131.field1697 * 4, 0, 0);
            }
        }
        arg2.method1584();
        arg2.method1578(-16777215);
        class84.method458((byte) -102);
        class401.field5856 = 0;
        class267.field3635.method829(false);
        if (!class243.field3314) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class230.method1249(var20, var21, arg1, var14, -101)) {
                            class285 var22 = (class285) class275.method1514(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class285) class165.method878(var21, var14, var20, field456 == null ? (field456 = method210("io")) : field456);
                            }
                            if (var22 == null) {
                                var22 = (class285) class173.method906(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class285) class316.method1828(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class225 var23 = class281.method1655((byte) -28, var22.method356(10397));
                                if (!var23.field3038 || class21.field210) {
                                    int var24 = var23.field2988;
                                    if (var23.field3061 != null) {
                                        for (int var25 = 0; var25 < var23.field3061.length; var25++) {
                                            if (var23.field3061[var25] != -1) {
                                                class225 var26 = class281.method1655((byte) -28, var23.field3061[var25]);
                                                if (var26.field2988 >= 0) {
                                                    var24 = var26.field2988;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class228 var28 = class283.method1668(-73, var24);
                                            if (var28 != null && var28.field3142) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class36.field352[var21].field6422;
                                            int var32 = class36.field352[var21].field6415;
                                            int var33 = class36.field352[var21].field6423;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class12.field120[class401.field5856] = var23.field3051;
                                        class118.field1466[class401.field5856] = var29;
                                        class411.field5939[class401.field5856] = var30;
                                        class401.field5856++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class448.field6516 != null) {
                class262.field3582.field3910 = 1;
                class260.method1458(1024, 11904, 64);
                for (int var15 = 0; var15 < class448.field6516.field94; var15++) {
                    int var16 = class448.field6516.field87[var15];
                    if ((var16 >> 28) == class263.field3592) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class70.field767;
                        int var18 = (var16 & 0x3FFF) - class291.field3961;
                        if (var17 >= 0 && class315.field4214 > var17 && var18 >= 0 && var18 < class340.field4549) {
                            class267.field3635.method825(94, new class310(var15));
                        } else {
                            class228 var19 = class283.method1668(-61, class448.field6516.field88[var15]);
                            if (var19.field3120 != null && (var19.field3134 + var17) >= 0 && (var19.field3136 + var17) < class315.field4214 && var19.field3124 + var18 >= 0 && class340.field4549 > var19.field3139 + var18) {
                                class267.field3635.method825(60, new class310(var15));
                            }
                        }
                    }
                }
                class260.method1458(128, 11904, 64);
                class262.field3582.field3910 = 2;
                class262.field3582.method1684((byte) -50);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lam;Lam;Lam;Ls;B)Z", line = 436)
    public static final boolean method207(class286 arg0, class286 arg1, class286 arg2, class380 arg3, byte arg4) {
        if (arg4 != -39) {
            field455 = -37;
        }
        class84.field931 = arg0;
        class352.field4933 = arg1;
        field451++;
        class314.field4205 = arg3;
        class444.field6481 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 457)
    public static void method208(byte arg0) {
        field449 = null;
        if (arg0 != 123) {
            field449 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Luh;", line = 468)
    public static final class151 method209(int arg0, int arg1) {
        field453++;
        class114 var2 = class130.field1669;
        class151 var3;
        synchronized (class130.field1669) {
            var3 = (class151) class130.field1669.method616(-52, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg1 > -115) {
            method208((byte) -10);
        }
        byte[] var4 = class372.field5203.method1687(arg0, 16, 255);
        class151 var5 = new class151();
        if (var4 != null) {
            var5.method806(new class250(var4), (byte) 86);
        }
        class114 var6 = class130.field1669;
        synchronized (class130.field1669) {
            class130.field1669.method615((byte) -117, (long) arg0, var5);
            return var5;
        }
    }
}
