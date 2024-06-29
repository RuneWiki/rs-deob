import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 extends class77 {

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public int field165 = -1;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    public int field161 = 0;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Z")
    public boolean field162 = true;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public int field166 = -1;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Ldc;")
    public static class37 field170 = null;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Lvf;")
    public static class233 field167 = new class233(5000);

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lwa;")
    public static class238 field173;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "[Lji;")
    public static class106[] field174;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lce;III)V")
    private final void method75(class28 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field161 = class147.method1015(false, arg0.method225(118));
        } else if (arg2 == 2) {
            this.field165 = arg0.method215(-1797813752);
        } else if (arg2 == 3) {
            this.field165 = arg0.method230((byte) -101);
            if (this.field165 == 65535) {
                this.field165 = -1;
            }
        } else if (arg2 == 5) {
            this.field162 = false;
        } else if (arg2 == 7) {
            this.field166 = class147.method1015(false, arg0.method225(124));
        } else if (arg2 == 8) {
            class39.field812 = arg3;
        } else if (arg2 == 9) {
            arg0.method230((byte) -111);
        }
        field160++;
        if (arg1 != -9) {
            field170 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIII)V")
    public static final void method76(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -717) {
            field167 = null;
        }
        for (int var5 = 0; var5 < class157.field2981; var5++) {
            if (class61.field1121[var5] + class58.field1089[var5] > arg0 && class61.field1121[var5] < arg0 + arg1 && class64.field1167[var5] + class120.field2139[var5] > arg4 && class64.field1167[var5] < arg2 + arg4) {
                class85.field1505[var5] = true;
            }
        }
        field168++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILce;I)V")
    public final void method77(int arg0, class28 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method215(-1797813752);
            if (var4 == 0) {
                if (arg0 != 3) {
                    method79(105, 87, 20, -45, 35);
                }
                field169++;
                return;
            }
            this.method75(arg1, -9, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 != -124) {
            method81(118, 102, -126, -110, -95, -60, 38, 101);
        }
        if (arg4 == arg6 && arg5 == arg9 && arg3 == arg7 && arg0 == arg1) {
            class83.method569(arg6, arg0, arg2, arg5, (byte) -88, arg7);
        } else {
            int var10 = arg5;
            int var11 = arg6;
            int var12 = arg6 * 3;
            int var13 = arg5 * 3;
            int var14 = arg4 * 3;
            int var15 = arg3 * 3;
            int var16 = var14 + arg7 - var15 - arg6;
            int var17 = arg9 * 3;
            int var18 = arg1 * 3;
            int var19 = var15 + var12 - var14 - var14;
            int var20 = var18 + var13 - var17 - var17;
            int var21 = arg0 + var17 - var18 - arg5;
            int var22 = var14 - var12;
            int var23 = var17 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var16 * var26;
                int var28 = var19 * var25;
                int var29 = var20 * var25;
                int var30 = var22 * var24;
                int var31 = var21 * var26;
                int var32 = var23 * var24;
                int var33 = (var27 + var28 + var30 >> 12) + arg6;
                int var34 = (var31 + var32 + var29 >> 12) + arg5;
                class83.method569(var11, var34, arg2, var10, (byte) -88, var33);
                var10 = var34;
                var11 = var33;
            }
        }
        field172++;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class49.field981 == arg3) {
            class24.field416[class115.field2060 / 100].method687(class161.field3035 - 8, class128.field2412 + -8);
        }
        field171++;
        if (class49.field981 == 2) {
            class24.field416[class115.field2060 / 100 + 4].method687(class161.field3035 - 8, class128.field2412 + -8);
        }
        class149.method1026(true);
        if (!class183.field3378) {
            return;
        }
        int var5 = arg4 + 512 - 5;
        int var6 = arg1 + 20;
        class190.field3468.method623(class80.method548(new class37[] { class218.field4070, class151.method1034((byte) -9, class3.field25) }, -112), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var10 = var6 + 15;
        int var9 = 16776960;
        if (var8 > 32768 && class16.field259) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class16.field259) {
            var9 = 16711680;
        }
        class190.field3468.method623(class80.method548(new class37[] { class155.field2918, class151.method1034((byte) -9, var8), class120.field2142 }, -45), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
    public static void method80(int arg0) {
        field170 = null;
        field174 = null;
        field173 = null;
        field167 = null;
        if (arg0 != -2903) {
            method76(-8, -124, 5, 72, -21);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field164++;
        int var9 = arg0 - arg6;
        int var10 = (arg8 - arg2 << 16) / var9;
        if (arg5 != -3) {
            method81(-71, 7, -31, -31, -37, -12, 47, 59);
        }
        int var11 = arg3 - arg4;
        int var12 = (arg7 - arg1 << 16) / var11;
        boolean var13;
        if (class13.field189 > 0 && class13.field189 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        for (int var14 = 0; var14 < var11; var14++) {
            int var31 = (var14 + 1) * var12 >> 16;
            int var32 = var12 * var14 >> 16;
            int var33 = var31 - var32;
            if (var33 > 0) {
                int var34 = arg1 + var32;
                int[][] var35 = class106.field1845[arg4 + var14 >> 6];
                int var10000 = arg1 + var31;
                for (int var37 = 0; var37 < var9; var37++) {
                    int var38 = var10 * var37 >> 16;
                    int var39 = (var37 + 1) * var10 >> 16;
                    int var40 = var39 - var38;
                    if (var40 > 0) {
                        int var41 = arg2 + var38;
                        var10000 = arg2 + var39;
                        int var43 = arg6 + var37 >> 6;
                        if (var35[var43] != null) {
                            int var44 = ((arg6 + var37 & 0x3F) << 6) + (var14 + arg4 & 0x3F);
                            int var45 = var35[var43][var44];
                            if (var45 != 0) {
                                class30 var46 = class73.method519(var45 - 1, -21035);
                                if (var13 && class212.field3957 == var46.field559) {
                                    class64 var47 = new class64();
                                    var47.field1161 = var46.field559;
                                    var47.field1170 = var34;
                                    var47.field1166 = var41;
                                    class99.field1731.method1340(27, var47);
                                }
                                class54.field1058[var46.field559].method687(var34 - 7, var41 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class31.field632 == class244.field4471) {
            for (class141 var15 = (class141) class37.field788.method1338(10); var15 != null; var15 = (class141) class37.field788.method1332((byte) -89)) {
                int var16 = var15.field2728;
                int var17 = var15.field2731;
                int var18 = class68.field1224 + class190.field3528 - var17;
                int var19 = var16 - class235.field4272;
                int var20 = (arg7 - arg1) * (var19 - arg4) / (arg3 - arg4) + arg1;
                int var21 = (arg8 - arg2) * (var18 - arg6) / (arg0 - arg6) + arg2;
                int var22 = 16777215;
                int var23 = var15.field2721;
                class187 var24 = null;
                if (var23 == 0) {
                    if (class244.field4471 == 3.0D) {
                        var24 = class214.field4004;
                    }
                    if (class244.field4471 == 4.0D) {
                        var24 = class133.field2472;
                    }
                    if (class244.field4471 == 6.0D) {
                        var24 = class77.field1350;
                    }
                    if (class244.field4471 == 8.0D) {
                        var24 = class193.field3607;
                    }
                }
                if (var23 == 1) {
                    if (class244.field4471 == 3.0D) {
                        var24 = class77.field1350;
                    }
                    if (class244.field4471 == 4.0D) {
                        var24 = class193.field3607;
                    }
                    if (class244.field4471 == 6.0D) {
                        var24 = class5.field40;
                    }
                    if (class244.field4471 == 8.0D) {
                        var24 = class246.field4499;
                    }
                }
                if (var23 == 2) {
                    if (class244.field4471 == 3.0D) {
                        var24 = class5.field40;
                    }
                    var22 = 16755200;
                    if (class244.field4471 == 4.0D) {
                        var24 = class246.field4499;
                    }
                    if (class244.field4471 == 6.0D) {
                        var24 = class201.field3753;
                    }
                    if (class244.field4471 == 8.0D) {
                        var24 = class50.field1012;
                    }
                }
                if (var24 != null) {
                    class37[] var25 = var15.field2724;
                    int var26 = var25.length;
                    int var27 = var21 - var24.method1242() * (var26 - 1) / 2;
                    int var28 = var27 + var24.method1244() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var24.method1246(var25[var29], var20, var28, var22, true);
                        var28 += var24.method1242();
                    }
                }
            }
        }
        for (class64 var30 = (class64) class99.field1731.method1338(1); var30 != null; var30 = (class64) class99.field1731.method1332((byte) -89)) {
            class54.field1058[var30.field1161].method687(var30.field1170 - 7, var30.field1166 - 7);
            class48.method399(var30.field1170, var30.field1166, 15, 16776960, 128);
            class48.method399(var30.field1170, var30.field1166, 7, 16777215, 256);
        }
        class99.field1731.method1336(95);
    }
}
