import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class87 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ltb;")
    private class165 field1366;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lg;")
    private class63 field1364;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lfk;")
    private class283 field1373;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lce;")
    public static class126 field1359 = class206.method1445(-7923, "floorshadows");

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "[F")
    public static float[] field1374 = new float[4];

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[Lce;")
    public static class126[] field1372 = new class126[200];

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lbb;")
    private class134 field1368;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lbg;")
    private class195[] field1361;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLwh;Lwh;I)Lbg;", line = 7)
    public final class195 method609(boolean arg0, class58 arg1, class58 arg2, int arg3) {
        field1363++;
        return arg0 ? this.method610(arg1, -8288, arg3, arg2, true) : (class195) null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lwh;IILwh;Z)Lbg;", line = 24)
    private final class195 method610(class58 arg0, int arg1, int arg2, class58 arg3, boolean arg4) {
        field1362++;
        if (this.field1368 == null) {
            throw new RuntimeException();
        }
        this.field1368.field2299 = arg2 * 8 + 5;
        if (this.field1368.field2299 >= this.field1368.field2282.length) {
            throw new RuntimeException();
        } else if (this.field1361[arg2] == null) {
            int var6 = this.field1368.method957(496113200);
            int var7 = this.field1368.method957(496113200);
            class195 var8 = new class195(arg2, arg3, arg0, this.field1364, this.field1366, var6, var7, arg4);
            this.field1361[arg2] = var8;
            if (arg1 != -8288) {
                method615(-62, 17, 106, -85L);
            }
            return var8;
        } else {
            return this.field1361[arg2];
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z", line = 69)
    public final boolean method611(int arg0) {
        field1371++;
        if (this.field1368 != null) {
            return true;
        } else if (arg0 <= 108) {
            return true;
        } else {
            if (this.field1373 == null) {
                if (this.field1364.method454(-21)) {
                    return false;
                }
                this.field1373 = this.field1364.method463(255, 255, true, (byte) 100, (byte) 0);
            }
            if (this.field1373.field176) {
                return false;
            } else {
                this.field1368 = new class134(this.field1373.method77(-121));
                this.field1361 = new class195[(this.field1368.field2282.length - 5) / 8];
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 103)
    public static void method612(byte arg0) {
        field1374 = null;
        if (arg0 != 0) {
            field1370 = -2;
        }
        field1372 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBII)V", line = 115)
    public static final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1367++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg7 - arg3;
        int var12 = arg6 * arg6;
        int var13 = arg6 - arg3;
        if (arg5 < 31) {
            return;
        }
        int var14 = arg7 * arg7;
        int var15 = var13 * var13;
        int var16 = var14 << 1;
        int var17 = var12 << 1;
        int var18 = var11 * var11;
        int var19 = var18 << 1;
        int var20 = var11 << 1;
        int var21 = arg7 << 1;
        int var22 = var15 << 1;
        int var23 = (1 - var21) * var12 + var16;
        int var24 = var14 - (var21 - 1) * var17;
        int var25 = (1 - var20) * var15 + var19;
        int var26 = var18 - (var20 - 1) * var22;
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var18 << 2;
        int var30 = var15 << 2;
        int var31 = var16 * 3;
        int var32 = (var21 - 3) * var17;
        int var33 = var19 * 3;
        int var34 = var28;
        int var35 = var29;
        int var36 = (var11 - 1) * var30;
        int var37 = (var20 - 3) * var22;
        int var38 = (arg7 - 1) * var27;
        if (class197.field3372 <= arg2 && class194.field3302 >= arg2) {
            int[] var39 = class314.field5393[arg2];
            int var40 = class94.method645(class321.field5489, 0, arg0 - arg6, class52.field795);
            int var41 = class94.method645(class321.field5489, 0, arg0 + arg6, class52.field795);
            int var42 = class94.method645(class321.field5489, 0, arg0 - var13, class52.field795);
            int var43 = class94.method645(class321.field5489, 0, arg0 + var13, class52.field795);
            class94.method647(var39, var40, -7, var42, arg4);
            class94.method647(var39, var42, -7, var43, arg1);
            class94.method647(var39, var43, -7, var41, arg4);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var34;
                    var34 += var28;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var34;
                var8++;
                var34 += var28;
                var31 += var28;
            }
            var23 += -var38;
            var24 += -var32;
            var32 -= var27;
            var38 -= var27;
            boolean var44 = var9 <= var11;
            var9--;
            int var45 = arg2 + var9;
            int var46 = arg2 - var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var33 += var29;
                        var10++;
                        var26 += var35;
                        var35 += var29;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var35;
                    var10++;
                    var33 += var29;
                    var35 += var29;
                }
                var26 += -var37;
                var37 -= var30;
                var25 += -var36;
                var36 -= var30;
            }
            if (var45 >= class197.field3372 && var46 <= class194.field3302) {
                int var47 = class94.method645(class321.field5489, 0, arg0 + var8, class52.field795);
                int var48 = class94.method645(class321.field5489, 0, arg0 - var8, class52.field795);
                if (var44) {
                    int var49 = class94.method645(class321.field5489, 0, arg0 + var10, class52.field795);
                    int var50 = class94.method645(class321.field5489, 0, arg0 - var10, class52.field795);
                    if (var46 >= class197.field3372) {
                        int[] var51 = class314.field5393[var46];
                        class94.method647(var51, var48, -7, var50, arg4);
                        class94.method647(var51, var50, -7, var49, arg1);
                        class94.method647(var51, var49, -7, var47, arg4);
                    }
                    if (var45 <= class194.field3302) {
                        int[] var52 = class314.field5393[var45];
                        class94.method647(var52, var48, -7, var50, arg4);
                        class94.method647(var52, var50, -7, var49, arg1);
                        class94.method647(var52, var49, -7, var47, arg4);
                    }
                } else {
                    if (class197.field3372 <= var46) {
                        class94.method647(class314.field5393[var46], var48, -7, var47, arg4);
                    }
                    if (class194.field3302 >= var45) {
                        class94.method647(class314.field5393[var45], var48, -7, var47, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lbb;B)V", line = 319)
    public static final void method614(class134 arg0, byte arg1) {
        field1365++;
        int var2 = -93 % ((-arg1 - 78) / 41);
        while (true) {
            while (arg0.field2282.length > arg0.field2299) {
                int var3 = 0;
                int var4 = 0;
                boolean var5 = false;
                if (arg0.method948(-124) == 1) {
                    var3 = arg0.method948(-126);
                    var5 = true;
                    var4 = arg0.method948(-123);
                }
                int var6 = arg0.method948(-123);
                int var7 = arg0.method948(-125);
                int var8 = var6 * 64 - class220.field3702;
                int var9 = class306.field5140 + class143.field2602 - (var7 * 64) - 1;
                if (var8 >= 0 && (var9 - 63) >= 0 && var8 + 63 < class36.field521 && var9 < class143.field2602) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var5 || var12 >= var3 * 8 && var12 < var3 * 8 + 8 && (var4 * 8) <= var13 && var13 < var4 * 8 + 8) {
                                byte var14 = arg0.method977(19773);
                                if (var14 != 0) {
                                    if (class264.field4400[var10][var11] == null) {
                                        class264.field4400[var10][var11] = new byte[4096];
                                    }
                                    class264.field4400[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method977(19773);
                                    if (class260.field4361[var10][var11] == null) {
                                        class260.field4361[var10][var11] = new byte[4096];
                                    }
                                    class260.field4361[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var5 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method977(19773);
                        if (var17 != 0) {
                            arg0.field2299++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIJ)Z", line = 414)
    public static final boolean method615(int arg0, int arg1, int arg2, long arg3) {
        int var5 = ((int) arg3 & 0x7D2FD) >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        field1369++;
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class265 var8 = class185.method1338(var7, arg0 ^ 0xFFFFE40F);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field4452;
                var10 = var8.field4474;
            } else {
                var9 = var8.field4474;
                var10 = var8.field4452;
            }
            int var11 = var8.field4423;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class151.method1123(2, var10, -9, var11, 0, true, var9, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], arg2, arg1);
        } else {
            class151.method1123(2, 0, -9, 0, var5 + 1, true, 0, var6, class286.field4744.field2460[0], class286.field4744.field2471[0], arg2, arg1);
        }
        class238.field4015 = class152.field2782;
        class296.field4933 = arg0;
        class29.field412 = 2;
        class17.field239 = class53.field804;
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILja;JZ)V", line = 475)
    public static final void method616(int arg0, int arg1, int arg2, int arg3, class114 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class8 var8 = new class8();
        var8.field103 = arg4;
        var8.field90 = arg1 * 128 + 64;
        var8.field102 = arg2 * 128 + 64;
        var8.field91 = arg3;
        var8.field101 = arg5;
        var8.field95 = arg6;
        if (class297.field4940[arg0][arg1][arg2] == null) {
            class297.field4940[arg0][arg1][arg2] = new class5(arg0, arg1, arg2);
        }
        class297.field4940[arg0][arg1][arg2].field52 = var8;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lg;Ltb;)V", line = 493)
    public class87(class63 arg0, class165 arg1) {
        this.field1366 = arg1;
        this.field1364 = arg0;
        if (!this.field1364.method454(-21)) {
            this.field1373 = this.field1364.method463(255, 255, true, (byte) 80, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 507)
    public final void method617(byte arg0) {
        field1360++;
        if (arg0 != -107 || this.field1361 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1361.length; var2++) {
            if (this.field1361[var2] != null) {
                this.field1361[var2].method1390(arg0 - 30417);
            }
        }
        for (int var3 = 0; var3 < this.field1361.length; var3++) {
            if (this.field1361[var3] != null) {
                this.field1361[var3].method1392(-61);
            }
        }
    }
}
