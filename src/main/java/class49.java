import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class49 extends class80 {

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Z")
    public static boolean field874 = false;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "[I")
    public static int[] field877 = new int[32768];

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Lr;")
    public static class66 field872 = class93.method641(43, "loginscreen");

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field882 = -1;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lr;")
    public static class66 field871 = class93.method641(43, "::clientdrop");

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "Llb;")
    public static class228 field883;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "Lei;")
    public static class232 field885;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Lcj;")
    public static class28 field878;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[Z")
    public static boolean[] field876;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIB)V")
    public static final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field881++;
        if (arg5 < 79) {
            field877 = null;
        }
        long var6 = class225.method1434(arg0, arg2, arg4);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3DA024) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int[] var10 = class235.field4105;
            int var11 = arg1;
            int var12 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var13 = (52736 - (arg4 * 512)) * 4 + arg2 * 4 + 24624;
            if (var6 > 0L) {
                var11 = arg3;
            }
            class231 var14 = class52.method359(106, var12);
            if (var14.field4006 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var13] = var11;
                        var10[var13 + 512] = var11;
                        var10[var13 + 1024] = var11;
                        var10[var13 + 1536] = var11;
                    } else if (var8 == 1) {
                        var10[var13] = var11;
                        var10[var13 + 1] = var11;
                        var10[var13 + 2] = var11;
                        var10[var13 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var13 + 3] = var11;
                        var10[var13 + 512 + 3] = var11;
                        var10[var13 + 1024 + 3] = var11;
                        var10[var13 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var10[var13 + 1536] = var11;
                        var10[var13 + 1536 + 1] = var11;
                        var10[var13 + 2 + 1536] = var11;
                        var10[var13 + 1539] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var10[var13] = var11;
                    } else if (var8 == 1) {
                        var10[var13 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var13 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var10[var13 + 1536] = var11;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var13] = var11;
                        var10[var13 + 512] = var11;
                        var10[var13 + 1024] = var11;
                        var10[var13 + 1536] = var11;
                    } else if (var8 == 0) {
                        var10[var13] = var11;
                        var10[var13 + 1] = var11;
                        var10[var13 + 2] = var11;
                        var10[var13 + 3] = var11;
                    } else if (var8 == 1) {
                        var10[var13 + 3] = var11;
                        var10[var13 + 515] = var11;
                        var10[var13 + 3 + 1024] = var11;
                        var10[var13 + 1539] = var11;
                    } else if (var8 == 2) {
                        var10[var13 + 1536] = var11;
                        var10[var13 + 1 + 1536] = var11;
                        var10[var13 + 1538] = var11;
                        var10[var13 + 3 + 1536] = var11;
                    }
                }
            } else {
                class265 var15 = null;
                if (!var14.field4050) {
                    var15 = class263.field4613[var14.field4006];
                } else if (var8 == 0) {
                    var15 = class263.field4613[var14.field4006];
                } else if (var8 == 1) {
                    var15 = class93.field1788[var14.field4006];
                } else if (var8 == 2) {
                    var15 = class199.field3431[var14.field4006];
                } else if (var8 == 3) {
                    var15 = class154.field2741[var14.field4006];
                }
                if (var15 != null) {
                    int var16 = (var14.field4021 * 4 - var15.field442) / 2;
                    int var17 = (var14.field4020 * 4 - var15.field441) / 2;
                    var15.method162(arg2 * 4 + var16 + 48, (-var14.field4020 + -arg4 + 104) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class12.method53(arg0, arg2, arg4);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class231 var23 = class52.method359(127, var22);
            if (var23.field4006 != -1) {
                class265 var27 = null;
                if (!var23.field4050) {
                    var27 = class263.field4613[var23.field4006];
                } else if (var20 == 0) {
                    var27 = class263.field4613[var23.field4006];
                } else if (var20 == 1) {
                    var27 = class93.field1788[var23.field4006];
                } else if (var20 == 2) {
                    var27 = class199.field3431[var23.field4006];
                } else if (var20 == 3) {
                    var27 = class154.field2741[var23.field4006];
                }
                if (var27 != null) {
                    int var28 = (var23.field4020 * 4 - var27.field441) / 2;
                    int var29 = (var23.field4021 * 4 - var27.field442) / 2;
                    var27.method162(arg2 * 4 + var29 + 48, (104 - (arg4 - -var23.field4020)) * 4 + 48 + var28);
                }
            } else if (var21 == 9) {
                int[] var24 = class235.field4105;
                int var25 = 15658734;
                if (var18 > 0L) {
                    var25 = 15597568;
                }
                int var26 = (103 - arg4) * 4 * 512 + arg2 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var24[var26 + 1536] = var25;
                    var24[var26 + 1024 + 1] = var25;
                    var24[var26 + 2 + 512] = var25;
                    var24[var26 + 3] = var25;
                } else {
                    var24[var26] = var25;
                    var24[var26 + 1 + 512] = var25;
                    var24[var26 + 1026] = var25;
                    var24[var26 + 1539] = var25;
                }
            }
        }
        long var30 = class86.method612(arg0, arg2, arg4);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x3F83B3) >> 20;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class231 var34 = class52.method359(82, var33);
        if (var34.field4006 == -1) {
            return;
        }
        class265 var35 = null;
        if (!var34.field4050) {
            var35 = class263.field4613[var34.field4006];
        } else if (var32 == 0) {
            var35 = class263.field4613[var34.field4006];
        } else if (var32 == 1) {
            var35 = class93.field1788[var34.field4006];
        } else if (var32 == 2) {
            var35 = class199.field3431[var34.field4006];
        } else if (var32 == 3) {
            var35 = class154.field2741[var34.field4006];
        }
        if (var35 != null) {
            int var36 = (var34.field4020 * 4 - var35.field441) / 2;
            int var37 = (var34.field4021 * 4 - var35.field442) / 2;
            var35.method162(arg2 * 4 + var37 + 48, var36 + 48 - -((-arg4 + 104 + -var34.field4020) * 4));
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public static void method346(int arg0) {
        field871 = null;
        field885 = null;
        field878 = null;
        field872 = null;
        field883 = null;
        field876 = null;
        if (arg0 == 0) {
            field877 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
    public class49(int arg0) {
        this.field873 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static final void method347(byte arg0) {
        field884++;
        int var1 = -69 / ((arg0 + 65) / 61);
        if (class143.field2612 != null && class146.field2668 != null) {
            return;
        }
        class143.field2612 = new int[256];
        class146.field2668 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class143.field2612[var2] = (int) (Math.sin(var3) * 4096.0D);
            class146.field2668[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static final void method348(int arg0) {
        field875++;
        if (arg0 != ~class207.method1346(1)) {
            return;
        }
        byte var1 = (byte) (class214.field3683 - 4 & 0xFF);
        int var2 = class214.field3683 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class102.field2000[var3][var2][var16] = var1;
            }
        }
        if (class196.field3401 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class247.field4296[var4] = -1000000;
            class101.field1962[var4] = 1000000;
            class162.field2911[var4] = 0;
            class240.field4160[var4] = 1000000;
            class230.field3979[var4] = 0;
        }
        if (class167.field2995 != 1) {
            int var15 = class45.method327(class207.field3597, class196.field3401, class192.field3330, false);
            if (var15 - class134.field2494 >= 800 || (class47.field846[class196.field3401][class207.field3597 >> 7][class192.field3330 >> 7] & 0x4) == 0) {
                return;
            }
            class95.method651(false, class110.field2124, class192.field3330 >> 7, class207.field3597 >> 7, 1, (byte) -109);
            return;
        }
        if ((class47.field846[class196.field3401][class207.field3595.field2077 >> 7][class207.field3595.field2053 >> 7] & 0x4) != 0) {
            class95.method651(false, class110.field2124, class207.field3595.field2053 >> 7, class207.field3595.field2077 >> 7, 0, (byte) -125);
        }
        if (class253.field4435 >= 310) {
            return;
        }
        int var5 = class207.field3595.field2077 >> 7;
        int var6 = class192.field3330 >> 7;
        int var7 = class207.field3595.field2053 >> 7;
        int var8 = class207.field3597 >> 7;
        int var9;
        if (var5 <= var8) {
            var9 = var8 - var5;
        } else {
            var9 = var5 - var8;
        }
        int var10;
        if (var7 <= var6) {
            var10 = var6 - var7;
        } else {
            var10 = var7 - var6;
        }
        if (var10 < var9) {
            int var11 = 32768;
            int var12 = var10 * 65536 / var9;
            while (var5 != var8) {
                if (var5 > var8) {
                    var8++;
                } else if (var8 > var5) {
                    var8--;
                }
                if ((class47.field846[class196.field3401][var8][var6] & 0x4) != 0) {
                    class95.method651(false, class110.field2124, var6, var8, 1, (byte) 104);
                    return;
                }
                var11 += var12;
                if (var11 >= 65536) {
                    var11 -= 65536;
                    if (var6 < var7) {
                        var6++;
                    } else if (var6 > var7) {
                        var6--;
                    }
                    if ((class47.field846[class196.field3401][var8][var6] & 0x4) != 0) {
                        class95.method651(false, class110.field2124, var6, var8, 1, (byte) 62);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = var9 * 65536 / var10;
        int var14 = 32768;
        while (var6 != var7) {
            if (var6 < var7) {
                var6++;
            } else if (var6 > var7) {
                var6--;
            }
            if ((class47.field846[class196.field3401][var8][var6] & 0x4) != 0) {
                class95.method651(false, class110.field2124, var6, var8, 1, (byte) -79);
                return;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var8 < var5) {
                    var8++;
                } else if (var8 > var5) {
                    var8--;
                }
                var14 -= 65536;
                if ((class47.field846[class196.field3401][var8][var6] & 0x4) != 0) {
                    class95.method651(false, class110.field2124, var6, var8, 1, (byte) -113);
                    return;
                }
            }
        }
        return;
    }
}
