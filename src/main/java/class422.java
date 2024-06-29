import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class422 extends class296 {

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "[I")
    private int[] field6358 = new int[this.field4495];

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field6359 = 0;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "Lbj;")
    public static class162 field6349 = new class162(80, 8);

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    private int field6353;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "Lgs;")
    public static class34 field6355;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "[B")
    private byte[] field6352;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIB)V")
    public void method1744(int arg0, int arg1, byte arg2) {
        ++field6360;
        this.field6352[this.field6353++] = (byte) (class490.method2960(arg2 >> 1, 127) + 127);
        if (arg1 >= -77) {
            this.field6358 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
    public final void method790(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field6348 += this.field6358[arg1] * arg0 >> 12;
            ++field6361;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIF)V")
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field4495; ++var7) {
            this.field6358[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
    public static final void method2575(int arg0) {
        ++field6357;
        class219.field3446.method268(-29708);
        int var1 = class219.field3446.method261(8, 0);
        if (var1 < class341.field5128) {
            for (int var2 = var1; ~class341.field5128 < ~var2; ++var2) {
                class314.field4737[class95.field1865++] = class515.field7477[var2];
            }
        }
        if (var1 > class341.field5128) {
            throw new RuntimeException("gnpov1");
        } else {
            class341.field5128 = 0;
            for (int var3 = arg0; ~var1 < ~var3; ++var3) {
                int var4 = class515.field7477[var3];
                class163 var5 = ((class435) class209.field3337.method1622((long) var4, 26)).field6471;
                int var6 = class219.field3446.method261(1, arg0);
                if (~var6 == -1) {
                    class515.field7477[class341.field5128++] = var4;
                    var5.field7796 = class62.field1268;
                } else {
                    int var7 = class219.field3446.method261(2, arg0);
                    if (var7 == 0) {
                        class515.field7477[class341.field5128++] = var4;
                        var5.field7796 = class62.field1268;
                        class403.field6093[class238.field3675++] = var4;
                    } else if (~var7 == -2) {
                        class515.field7477[class341.field5128++] = var4;
                        var5.field7796 = class62.field1268;
                        int var8 = class219.field3446.method261(3, 0);
                        var5.method1163(true, var8, 1);
                        int var9 = class219.field3446.method261(1, 0);
                        if (var9 == 1) {
                            class403.field6093[class238.field3675++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class515.field7477[class341.field5128++] = var4;
                        var5.field7796 = class62.field1268;
                        if (~class219.field3446.method261(1, 0) == -2) {
                            int var10 = class219.field3446.method261(3, 0);
                            var5.method1163(true, var10, 2);
                            int var11 = class219.field3446.method261(3, arg0);
                            var5.method1163(true, var11, 2);
                        } else {
                            int var12 = class219.field3446.method261(3, 0);
                            var5.method1163(true, var12, 0);
                        }
                        int var13 = class219.field3446.method261(1, 0);
                        if (var13 == 1) {
                            class403.field6093[class238.field3675++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class314.field4737[class95.field1865++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
    public final void method791(int arg0) {
        this.field6348 = 0;
        ++field6354;
        if (arg0 > 72) {
            this.field6353 = 0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public static void method2576(byte arg0) {
        field6349 = null;
        field6355 = null;
        if (arg0 < 84) {
            field6356 = 56;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public final void method789(byte arg0) {
        this.field6348 = Math.abs(this.field6348);
        ++field6350;
        if (this.field6348 >= 4096) {
            this.field6348 = 4095;
        }
        this.method1744(this.field6353++, -111, (byte) (this.field6348 >> 4));
        this.field6348 = 0;
        if (arg0 >= -95) {
            this.method789((byte) -116);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZLsf;)V")
    public static final void method2577(int arg0, boolean arg1, class366 arg2) {
        if (arg0 == 22314) {
            ++field6351;
            if (~class332.field5041 > -401) {
                if (class15.field266 == arg2) {
                    if (class233.field3597 && (class364.field5326 & 16) != 0) {
                        ++class10.field144;
                        class274.method1739(class101.field1932, 28, 18, 0L, 0, false, class220.field3455, class373.field5465 + " -> <col=ffffff>" + class286.field4313.method1977(class146.field2452, 72), true, -1, 0);
                    }
                } else {
                    String var3;
                    if (~arg2.field5378 != -1) {
                        var3 = arg2.method2246(true, true) + " (" + class38.field555.method1977(class146.field2452, arg0 + -22395) + arg2.field5378 + ")";
                    } else {
                        boolean var4 = true;
                        if (~class15.field266.field5351 != 0 && arg2.field5351 != -1) {
                            int var5 = class15.field266.field5362 > arg2.field5362 ? class15.field266.field5362 : arg2.field5362;
                            int var6 = class15.field266.field5351 >= arg2.field5351 ? arg2.field5351 : class15.field266.field5351;
                            int var7 = var5 * 10 / 100 + (5 - -var6);
                            int var8 = -arg2.field5362 + class15.field266.field5362;
                            if (~var8 > -1) {
                                var8 = -var8;
                            }
                            if (var8 > var7) {
                                var4 = false;
                            }
                        }
                        String var9 = class424.field6366 == class209.field3343 ? class42.field583.method1977(class146.field2452, arg0 ^ 22357) : class181.field2930.method1977(class146.field2452, 89);
                        if (arg2.field5362 < arg2.field5357) {
                            var3 = arg2.method2246(true, true) + (!var4 ? "<col=ffffff>" : class12.method77(arg0 ^ -22364, arg2.field5362, class15.field266.field5362)) + " (" + var9 + arg2.field5362 + "+" + (arg2.field5357 - arg2.field5362) + ")";
                        } else {
                            var3 = arg2.method2246(true, true) + (var4 ? class12.method77(-51, arg2.field5362, class15.field266.field5362) : "<col=ffffff>") + " (" + var9 + arg2.field5362 + ")";
                        }
                    }
                    if (!class233.field3597) {
                        if (!arg1) {
                            for (int var10 = 7; var10 >= 0; --var10) {
                                if (class320.field4894[var10] != null) {
                                    short var11 = 0;
                                    if (class424.field6366 == class316.field4779 && class320.field4894[var10].equalsIgnoreCase(class215.field3404.method1977(class146.field2452, -81))) {
                                        if (~class15.field266.field5362 > ~arg2.field5362) {
                                            var11 = 2000;
                                        }
                                        if (~class15.field266.field5379 != -1 && arg2.field5379 != 0) {
                                            if (~class15.field266.field5379 != ~arg2.field5379) {
                                                var11 = 0;
                                            } else {
                                                var11 = 2000;
                                            }
                                        }
                                    } else if (class56.field1191[var10]) {
                                        var11 = 2000;
                                    }
                                    short var12 = (short) (class493.field7232[var10] + var11);
                                    int var13 = class210.field3353[var10] == -1 ? class10.field139 : class210.field3353[var10];
                                    class274.method1739(class320.field4894[var10], arg0 ^ 22290, var12, (long) arg2.field7789, 0, false, var13, "<col=ffffff>" + var3, true, -1, 0);
                                    ++class375.field5492;
                                }
                            }
                        } else {
                            class274.method1739("<col=cccccc>" + var3, arg0 + -22306, -1, 0L, 0, true, -1, "", false, 0, 0);
                        }
                    } else if (!arg1 && (class364.field5326 & 8) != 0) {
                        ++class151.field2487;
                        class274.method1739(class101.field1932, 78, 25, (long) arg2.field7789, 0, false, class220.field3455, class373.field5465 + " -> <col=ffffff>" + var3, true, -1, 0);
                    }
                    if (!arg1) {
                        for (class328 var14 = (class328) class373.field5469.method1892(arg0 + -22211); var14 != null; var14 = (class328) class373.field5469.method1893((byte) -2)) {
                            if (~var14.field4972 == -6) {
                                var14.field4977 = "<col=ffffff>" + var3;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
