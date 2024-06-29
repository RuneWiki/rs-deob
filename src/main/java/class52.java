import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 {

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Z")
    public boolean field1336 = true;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
    public static int[] field1316 = new int[100];

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lgd;")
    public static class40 field1321 = class14.method90(false, "Konfig geladen)3");

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lgd;")
    private static class40 field1322 = class14.method90(false, "Examine");

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
    public static int[] field1329 = new int[50];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lgd;")
    public static class40 field1325 = field1322;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lgd;")
    private static class40 field1331 = class14.method90(false, "To create a new account you need to");

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lgd;")
    public static class40 field1320 = field1331;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lgd;")
    public static class40 field1332 = class14.method90(false, " x ");

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lgd;")
    public static class40 field1323 = class14.method90(false, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lgd;")
    public static class40 field1335 = class14.method90(false, "leuchten1:");

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lgd;")
    public static class40 field1324 = class14.method90(false, "sideicons");

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lrb;")
    public static class103 field1326;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V", line = 11)
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class21.field490.method970(arg4, arg3, arg2);
        field1333++;
        if (var6 != 0) {
            int var7 = class21.field490.method957(arg4, arg3, arg2, var6);
            int var8 = var7 >> 6 & 0x3;
            int[] var9 = class38.field937.field1167;
            int var10 = arg3 * 4 + (-arg2 + 103) * 512 * 4 + 24624;
            int var11 = var7 & 0x1F;
            int var12 = arg1;
            if (var6 > 0) {
                var12 = arg5;
            }
            int var13 = var6 >> 14 & 0x7FFF;
            class14 var14 = class114.method884(var13, (byte) -56);
            if (var14.field374 == -1) {
                if (var11 == 0 || var11 == 2) {
                    if (var8 == 0) {
                        var9[var10] = var12;
                        var9[var10 + 512] = var12;
                        var9[var10 + 1024] = var12;
                        var9[var10 + 1536] = var12;
                    } else if (var8 == 1) {
                        var9[var10] = var12;
                        var9[var10 + 1] = var12;
                        var9[var10 + 2] = var12;
                        var9[var10 + 3] = var12;
                    } else if (var8 == 2) {
                        var9[var10 + 3] = var12;
                        var9[var10 + 512 + 3] = var12;
                        var9[var10 + 3 + 1024] = var12;
                        var9[var10 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var9[var10 + 1536] = var12;
                        var9[var10 + 1536 + 1] = var12;
                        var9[var10 + 2 + 1536] = var12;
                        var9[var10 + 1536 + 3] = var12;
                    }
                }
                if (var11 == 3) {
                    if (var8 == 0) {
                        var9[var10] = var12;
                    } else if (var8 == 1) {
                        var9[var10 + 3] = var12;
                    } else if (var8 == 2) {
                        var9[var10 + 1539] = var12;
                    } else if (var8 == 3) {
                        var9[var10 + 1536] = var12;
                    }
                }
                if (var11 == 2) {
                    if (var8 == 3) {
                        var9[var10] = var12;
                        var9[var10 + 512] = var12;
                        var9[var10 + 1024] = var12;
                        var9[var10 + 1536] = var12;
                    } else if (var8 == 0) {
                        var9[var10] = var12;
                        var9[var10 + 1] = var12;
                        var9[var10 + 2] = var12;
                        var9[var10 + 3] = var12;
                    } else if (var8 == 1) {
                        var9[var10 + 3] = var12;
                        var9[var10 + 3 + 512] = var12;
                        var9[var10 + 1024 + 3] = var12;
                        var9[var10 + 1539] = var12;
                    } else if (var8 == 2) {
                        var9[var10 + 1536] = var12;
                        var9[var10 + 1 + 1536] = var12;
                        var9[var10 + 2 + 1536] = var12;
                        var9[var10 + 1536 + 3] = var12;
                    }
                }
            } else {
                class73 var15 = class91.field2081[var14.field374];
                if (var15 != null) {
                    int var16 = (var14.field370 * 4 - var15.field1712) / 2;
                    int var17 = (var14.field363 * 4 - var15.field1706) / 2;
                    var15.method497(arg3 * 4 + var17 + 48, 48 - -((-var14.field370 + 104 + -arg2) * 4) + var16);
                }
            }
        }
        if (arg0 != 17337) {
            return;
        }
        int var18 = class21.field490.method960(arg4, arg3, arg2);
        if (var18 != 0) {
            int var19 = var18 >> 14 & 0x7FFF;
            int var20 = class21.field490.method957(arg4, arg3, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            class14 var22 = class114.method884(var19, (byte) -56);
            int var23 = var20 & 0x1F;
            if (var22.field374 != -1) {
                class73 var27 = class91.field2081[var22.field374];
                if (var27 != null) {
                    int var28 = (var22.field363 * 4 - var27.field1706) / 2;
                    int var29 = (var22.field370 * 4 - var27.field1712) / 2;
                    var27.method497(arg3 * 4 + var28 + 48, (-arg2 + 104 - var22.field370) * 4 + 48 + var29);
                }
            } else if (var23 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int[] var25 = class38.field937.field1167;
                int var26 = (52736 - arg2 * 512) * 4 + arg3 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1025] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 1 + 512] = var24;
                    var25[var26 + 2 + 1024] = var24;
                    var25[var26 + 3 + 1536] = var24;
                }
            }
        }
        int var30 = class21.field490.method989(arg4, arg3, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class14 var32 = class114.method884(var31, (byte) -56);
        if (var32.field374 == -1) {
            return;
        }
        class73 var33 = class91.field2081[var32.field374];
        if (var33 != null) {
            int var34 = (var32.field370 * 4 - var33.field1712) / 2;
            int var35 = (var32.field363 * 4 - var33.field1706) / 2;
            var33.method497(arg3 * 4 + var35 + 48, (-arg2 + 104 - var32.field370) * 4 + 48 + var34);
            return;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfa;)V", line = 257)
    public static final void method404(int arg0, class31 arg1) {
        field1314++;
        if (arg1.field837 == 0) {
            return;
        }
        if (arg1.field766 != -1 && arg1.field766 < 32768) {
            class23 var2 = class130.field3142[arg1.field766];
            if (var2 != null) {
                int var3 = arg1.field792 - var2.field792;
                int var4 = arg1.field838 - var2.field838;
                if (var3 != 0 || var4 != 0) {
                    arg1.field781 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field766 >= 32768) {
            int var5 = arg1.field766 - 32768;
            if (class101.field2414 == var5) {
                var5 = 2047;
            }
            class96 var6 = class90.field2044[var5];
            if (var6 != null) {
                int var7 = arg1.field792 - var6.field792;
                int var8 = arg1.field838 - var6.field838;
                if (var7 != 0 || var8 != 0) {
                    arg1.field781 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field784 != 0 || arg1.field774 != 0) && (arg1.field791 == 0 || arg1.field768 > 0)) {
            int var9 = arg1.field838 - (arg1.field774 - class128.field3022 - class128.field3022) * 64;
            int var10 = arg1.field792 - (arg1.field784 - class125.field2961 - class125.field2961) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field781 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field784 = 0;
            arg1.field774 = 0;
        }
        int var11 = arg1.field781 - arg1.field828 & arg0;
        if (var11 == 0) {
            arg1.field779 = 0;
            return;
        }
        arg1.field779++;
        if (var11 <= 1024) {
            arg1.field828 += arg1.field837;
            boolean var12 = true;
            if (var11 < arg1.field837 || 2048 - arg1.field837 < var11) {
                arg1.field828 = arg1.field781;
                var12 = false;
            }
            if (arg1.field830 == arg1.field777 && (arg1.field779 > 25 || var12)) {
                if (arg1.field825 == -1) {
                    arg1.field777 = arg1.field808;
                } else {
                    arg1.field777 = arg1.field825;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field828 -= arg1.field837;
            if (arg1.field837 > var11 || 2048 - arg1.field837 < var11) {
                var13 = false;
                arg1.field828 = arg1.field781;
            }
            if (arg1.field830 == arg1.field777 && (arg1.field779 > 25 || var13)) {
                if (arg1.field811 == -1) {
                    arg1.field777 = arg1.field808;
                } else {
                    arg1.field777 = arg1.field811;
                }
            }
        }
        arg1.field828 &= 0x7FF;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lee;B)[I", line = 380)
    public static final int[] method405(class30 arg0, byte arg1) {
        field1318++;
        int var2;
        if (arg0.field704 < 0) {
            var2 = arg0.field722 >> 16;
        } else {
            var2 = arg0.field704 >> 16;
        }
        if (!class94.method638(var2, 0)) {
            return null;
        }
        if (arg1 <= 35) {
            field1329 = null;
        }
        int var3 = arg0.field688;
        int var4 = arg0.field722;
        int var5 = arg0.field683;
        while (var4 != -1) {
            class30 var7 = class129.field3093[var2][var4 & 0xFFFF];
            var3 += var7.field688 - var7.field697;
            var4 = var7.field722;
            var5 += var7.field683 - var7.field718;
        }
        return new int[] { var5, var3 };
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 467)
    public static void method406(int arg0) {
        field1320 = null;
        field1335 = null;
        field1322 = null;
        field1321 = null;
        field1331 = null;
        field1325 = null;
        if (arg0 >= -28) {
            return;
        }
        field1329 = null;
        field1332 = null;
        field1326 = null;
        field1316 = null;
        field1324 = null;
        field1323 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIIZ)V", line = 507)
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1336 = arg6;
        this.field1319 = arg1;
        this.field1328 = arg0;
        this.field1315 = arg4;
        this.field1327 = arg3;
        this.field1334 = arg5;
        this.field1313 = arg2;
    }
}
