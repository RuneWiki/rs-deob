import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class22 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lve;")
    public static class255 field340 = class87.method607(45, "gr-Un:");

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lkh;")
    public static class13 field345 = new class13(64);

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lve;")
    public static class255 field346 = class87.method607(97, "logo");

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lve;")
    public static class255 field347 = class87.method607(109, "leuchten3:");

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Z")
    public static boolean field348 = false;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLlc;I)V", line = 6)
    public static final void method120(boolean arg0, class155 arg1, int arg2) {
        int var3 = arg1.field2637;
        field341++;
        int var4 = (int) arg1.field3568;
        if (arg2 <= 72) {
            field346 = (class255) null;
        }
        arg1.method1502((byte) -82);
        if (arg0) {
            class103.method794(var3, -1);
        }
        class168.method1221(17, var3);
        class197 var5 = class58.method353(var4, (byte) -16);
        if (var5 != null) {
            class108.method834((byte) 49, var5);
        }
        int var6 = class136.field2272;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class297.method2088(class264.field4466[var7], 119)) {
                class68.method415(var7, 1366);
            }
        }
        if (class136.field2272 == 1) {
            class156.field2651 = false;
            class124.method915(class249.field4172, class148.field2507, -2, class184.field2974, class173.field2864);
        } else {
            class124.method915(class249.field4172, class148.field2507, -2, class184.field2974, class173.field2864);
            int var8 = class277.field4761.method498(class196.field3225);
            for (int var9 = 0; var9 < class136.field2272; var9++) {
                int var10 = class277.field4761.method498(class9.method47(true, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class173.field2864 = var8 + 8;
            class148.field2507 = class136.field2272 * 15 + 22;
        }
        if (class264.field4459 != -1) {
            class291.method2059(true, 1, class264.field4459);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lfk;I)[Lid;", line = 77)
    public static final class248[] method121(class40 arg0, int arg1) {
        field342++;
        if (!arg0.method247(arg1 + 24715)) {
            return new class248[0];
        } else if (arg1 == -24588) {
            class169 var2 = arg0.method240(-18745);
            while (var2.field2833 == 0) {
                class137.method1027(10L, 0);
            }
            if (var2.field2833 == 2) {
                return new class248[0];
            }
            int[] var3 = (int[]) ((int[]) var2.field2832);
            class248[] var4 = new class248[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class248 var6 = new class248();
                var4[var5] = var6;
                var6.field4161 = var3[var5 << 2];
                var6.field4150 = var3[(var5 << 2) + 1];
                var6.field4160 = var3[(var5 << 2) + 2];
                var6.field4157 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return (class248[]) null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)Z", line = 123)
    public static final boolean method122(int arg0, int arg1, int arg2, int arg3) {
        if (!class97.method768(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class106.field1783[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class210.field3580) {
                    if (!class222.method1557(var4, var6, var5)) {
                        return false;
                    }
                    if (!class222.method1557(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class222.method1557(var4, var7, var5)) {
                        return false;
                    }
                    if (!class222.method1557(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class222.method1557(var4, var8, var5)) {
                    return false;
                }
                if (!class222.method1557(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class59.field912) {
                    if (!class222.method1557(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class222.method1557(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class222.method1557(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class222.method1557(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class222.method1557(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class222.method1557(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class210.field3580) {
                    if (!class222.method1557(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class222.method1557(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class222.method1557(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class222.method1557(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class222.method1557(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class222.method1557(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class59.field912) {
                    if (!class222.method1557(var4, var6, var5)) {
                        return false;
                    }
                    if (!class222.method1557(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class222.method1557(var4, var7, var5)) {
                        return false;
                    }
                    if (!class222.method1557(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class222.method1557(var4, var8, var5)) {
                    return false;
                }
                if (!class222.method1557(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class222.method1557(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class222.method1557(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class222.method1557(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class222.method1557(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class222.method1557(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIIII)V", line = 331)
    public static final void method123(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class252.method1727(arg5, arg4, arg2);
        field344++;
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3B849B) >> 20;
            int var9 = ((int) var6 & 0x7DC84) >> 14;
            int[] var10 = class175.field2891;
            int var11 = arg0;
            int var12 = (103 - arg2) * 2048 + arg4 * 4 + 24624;
            if (var6 > 0L) {
                var11 = arg3;
            }
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class145 var14 = class289.method2046(-12453, var13);
            if (var14.field2429 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var8 == 1) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 512 + 3] = var11;
                        var10[var12 + 1027] = var11;
                        var10[var12 + 1539] = var11;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1536 + 1] = var11;
                        var10[var12 + 2 + 1536] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 1536 + 3] = var11;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var11;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 512 + 3] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1 + 1536] = var11;
                        var10[var12 + 1536 + 2] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
            } else {
                class273 var15 = null;
                if (!var14.field2467) {
                    var15 = class15.field220[var14.field2429];
                } else if (var8 == 0) {
                    var15 = class15.field220[var14.field2429];
                } else if (var8 == 1) {
                    var15 = class252.field4245[var14.field2429];
                } else if (var8 == 2) {
                    var15 = class115.field1954[var14.field2429];
                } else if (var8 == 3) {
                    var15 = class172.field2847[var14.field2429];
                }
                if (var15 != null) {
                    int var16 = (var14.field2444 * 4 - var15.field74) / 2;
                    int var17 = (var14.field2442 * 4 - var15.field70) / 2;
                    var15.method28(arg4 * 4 + var17 + 48, (-var14.field2444 + 104 + -arg2) * 4 + 48 + var16);
                }
            }
        }
        if (arg1 != -105) {
            method125((byte) 35);
        }
        long var18 = class53.method324(arg5, arg4, arg2);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class145 var23 = class289.method2046(-12453, var22);
            if (var23.field2429 != -1) {
                class273 var24 = null;
                if (!var23.field2467) {
                    var24 = class15.field220[var23.field2429];
                } else if (var20 == 0) {
                    var24 = class15.field220[var23.field2429];
                } else if (var20 == 1) {
                    var24 = class252.field4245[var23.field2429];
                } else if (var20 == 2) {
                    var24 = class115.field1954[var23.field2429];
                } else if (var20 == 3) {
                    var24 = class172.field2847[var23.field2429];
                }
                if (var24 != null) {
                    int var25 = (var23.field2442 * 4 - var24.field70) / 2;
                    int var26 = (var23.field2444 * 4 - var24.field74) / 2;
                    var24.method28(arg4 * 4 + var25 + 48, (-arg2 + 104 + -var23.field2444) * 4 + var26 + 48);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int[] var28 = class175.field2891;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int var29 = arg4 * 4 + ((-(arg2 * 512) + 52736) * 4) + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 1 + 512] = var27;
                    var28[var29 + 1026] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class56.method347(arg5, arg4, arg2);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class145 var34 = class289.method2046(-12453, var33);
        if (var34.field2429 == -1) {
            return;
        }
        class273 var35 = null;
        if (!var34.field2467) {
            var35 = class15.field220[var34.field2429];
        } else if (var32 == 0) {
            var35 = class15.field220[var34.field2429];
        } else if (var32 == 1) {
            var35 = class252.field4245[var34.field2429];
        } else if (var32 == 2) {
            var35 = class115.field1954[var34.field2429];
        } else if (var32 == 3) {
            var35 = class172.field2847[var34.field2429];
        }
        if (var35 != null) {
            int var36 = (var34.field2442 * 4 - var35.field70) / 2;
            int var37 = (var34.field2444 * 4 - var35.field74) / 2;
            var35.method28(arg4 * 4 + var36 + 48, (-arg2 + 104 + -var34.field2444) * 4 + 48 + var37);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 636)
    public static final void method124(int arg0) {
        field339++;
        class118.field1985 = 0;
        class103.field1731 = 0;
        class41.method252((byte) -93);
        class295.method2080(22461);
        class205.method1488(65535);
        for (int var1 = 0; var1 < class103.field1731; var1++) {
            int var2 = class87.field1413[var1];
            if (class277.field4768 != class82.field1334[var2].field5122) {
                if (class82.field1334[var2].field2996.method1630(-83)) {
                    class56.method350(class82.field1334[var2], -31844);
                }
                class82.field1334[var2].field2996 = null;
                class82.field1334[var2] = null;
            }
        }
        if (class125.field2084 != class160.field2692.field1068) {
            throw new RuntimeException("gnp1 pos:" + class160.field2692.field1068 + " psize:" + class125.field2084);
        }
        int var3 = 0;
        if (arg0 >= -126) {
            return;
        }
        while (var3 < class282.field4858) {
            if (class82.field1334[class84.field1356[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class282.field4858);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 701)
    public static void method125(byte arg0) {
        field346 = null;
        int var1 = 45 % ((-arg0 - 58) / 44);
        field340 = null;
        field347 = null;
        field345 = null;
    }
}
