import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class279 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Leg;")
    public static class272 field4463 = new class272(64);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lv;")
    public static class62 field4467 = null;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Z")
    public static boolean field4470 = false;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lui;")
    public static class239 field4468 = new class239(64);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Ljj;")
    public static class134 field4469;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
    public static int[] field4465;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method1864(int arg0) {
        field4471++;
        class70 var1 = (class70) class58.field814.method365(3);
        if (arg0 != 27726) {
            method1865(80, 77, false, 4, -89, -19, -118, 82);
        }
        while (var1 != null) {
            class193 var2 = var1.field970;
            if (class28.field336 != var2.field3095 || var2.field3088 < class9.field141) {
                var1.method544(91);
            } else if (class9.field141 >= var2.field3073) {
                if (var2.field3103 > 0) {
                    class275 var3 = class198.field3193[var2.field3103 - 1];
                    if (var3 != null && var3.field614 >= 0 && var3.field614 < 13312 && var3.field613 >= 0 && var3.field613 < 13312) {
                        var2.method1305(var3.field613, true, class9.field141, class220.method1461(var3.field614, var2.field3095, var3.field613, 25) - var2.field3084, var3.field614);
                    }
                }
                if (var2.field3103 < 0) {
                    int var4 = -var2.field3103 - 1;
                    class235 var5;
                    if (class80.field1121 == var4) {
                        var5 = class197.field3179;
                    } else {
                        var5 = class260.field4141[var4];
                    }
                    if (var5 != null && var5.field614 >= 0 && var5.field614 < 13312 && var5.field613 >= 0 && var5.field613 < 13312) {
                        var2.method1305(var5.field613, true, class9.field141, class220.method1461(var5.field614, var2.field3095, var5.field613, 86) - var2.field3084, var5.field614);
                    }
                }
                var2.method1304(-9406, class221.field3524);
                class147.method1004(class28.field336, (int) var2.field3074, (int) var2.field3089, (int) var2.field3083, 60, var2, var2.field3092, -1L, false);
            }
            var1 = (class70) class58.field814.method372((byte) 7);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZIIIII)Z")
    public static final boolean method1865(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4466++;
        long var8 = class177.method1222(arg5, arg3 + arg7, arg1 + arg6);
        if (!arg2) {
            return true;
        }
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x7C4DC) >> 14;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class94 var12 = class119.method842(124, var11);
            int var13 = ((int) var8 & 0x3145AD) >> 20;
            if (var12.field1348 == -1) {
                int var14 = arg4;
                int[] var15 = class63.field894;
                if (var8 > 0L) {
                    var14 = arg0;
                }
                int var16 = (52736 - (arg1 * 512)) * 4 + arg3 * 4 + 24624;
                if (var10 == 0 || var10 == 2) {
                    if (var13 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var13 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var13 == 0) {
                        var15[var16] = var14;
                    } else if (var13 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var13 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var13 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var13 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class59.method449(arg7, arg6, var13, false, arg3, var12, arg1)) {
                return false;
            }
        }
        long var17 = class289.method1940(arg5, arg3 + arg7, arg1 + arg6);
        if (var17 != 0L) {
            int var19 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var20 = ((int) var17 & 0x7C7AF) >> 14;
            int var21 = (int) var17 >> 20 & 0x3;
            class94 var22 = class119.method842(-109, var19);
            if (var22.field1348 == -1) {
                if (var20 == 9) {
                    int var23 = arg3 * 4 + (103 - arg1) * 2048 + 24624;
                    int[] var24 = class63.field894;
                    int var25 = 15658734;
                    if (var17 > 0L) {
                        var25 = 15597568;
                    }
                    if (var21 == 0 || var21 == 2) {
                        var24[var23 + 1536] = var25;
                        var24[var23 + 1024 + 1] = var25;
                        var24[var23 + 514] = var25;
                        var24[var23 + 3] = var25;
                    } else {
                        var24[var23] = var25;
                        var24[var23 + 512 + 1] = var25;
                        var24[var23 + 1024 + 2] = var25;
                        var24[var23 + 3 + 1536] = var25;
                    }
                }
            } else if (!class59.method449(arg7, arg6, var21, false, arg3, var22, arg1)) {
                return false;
            }
        }
        long var26 = class125.method866(arg5, arg3 + arg7, arg1 + arg6);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            int var29 = ((int) var26 & 0x382572) >> 20;
            class94 var30 = class119.method842(120, var28);
            if (var30.field1348 != -1 && !class59.method449(arg7, arg6, var29, false, arg3, var30, arg1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static final void method1866(int arg0) {
        for (int var1 = arg0; var1 < class70.field969; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class51.field721[var1];
            }
            class235 var6 = class260.field4141[var5];
            if (var6 != null && var6.field612 > 0) {
                var6.field612--;
                if (var6.field612 == 0) {
                    var6.field695 = null;
                }
            }
        }
        field4464++;
        for (int var2 = 0; var2 < class251.field4027; var2++) {
            int var3 = class134.field2250[var2];
            class275 var4 = class198.field3193[var3];
            if (var4 != null && var4.field612 > 0) {
                var4.field612--;
                if (var4.field612 == 0) {
                    var4.field695 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method1867(int arg0, int arg1) {
        class150.field2407 = -1;
        class150.field2407 = arg0;
        class266.field4320 = arg1;
        field4462++;
        class26.method180(118);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method1868(byte arg0) {
        field4465 = null;
        if (arg0 == 93) {
            field4463 = null;
            field4469 = null;
            field4468 = null;
        }
    }
}
