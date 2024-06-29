import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class315 extends class51 {

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "Lfk;")
    public class288 field5428;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lhi;")
    public static class82 field5419 = class95.method664((byte) -58, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "Lhi;")
    public static class82 field5420 = class95.method664((byte) -79, "Module texte charg-B");

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "Lum;")
    public static class222 field5422;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "Lkk;")
    public static class73 field5424;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method2159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -22260) {
            method2161(true);
        }
        field5425++;
        if (arg0 == arg5) {
            class69.method437(arg7, arg3, arg1, arg4, arg2, arg5, 256);
        } else if ((arg1 - arg5) >= class200.field3443 && class207.field3623 >= arg1 + arg5 && class60.field931 <= (arg3 - arg0) && class29.field399 >= (arg3 + arg0)) {
            class257.method1844(arg4, arg5, arg2, arg1, arg3, arg7, false, arg0);
        } else {
            class129.method897(arg5, arg2, arg1, arg7, arg0, arg4, arg3, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method2160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -110) {
            return;
        }
        field5423++;
        if (class200.field3443 <= arg1 - arg0 && arg0 + arg1 <= class207.field3623 && class60.field931 <= arg2 - arg0 && (arg0 + arg2) <= class29.field399) {
            class247.method1774(arg1, (byte) 54, arg2, arg0, arg4);
        } else {
            class300.method2076(arg0, arg1, 23, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 47)
    public static void method2161(boolean arg0) {
        if (arg0) {
            field5422 = null;
            field5420 = null;
            field5424 = null;
            field5419 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII)V", line = 61)
    public static final void method2162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5427++;
        if (class271.field4578 == 0) {
            class324.field5570++;
            int var7 = class287.field4828;
            int var8 = class16.field146;
            int var9 = class109.field1951;
            int var10 = (arg0 - arg1) * (var7 - var9) / arg6 + var9;
            int var11 = class281.field4722;
            int var12 = (arg4 - arg2) * (var8 - var11) / arg3 + var11;
            if (class256.field4406 && (class193.field3272 & 0x40) == 64) {
                class75 var13 = class257.method1840(false, class65.field1016, class15.field133);
                if (var13 == null) {
                    class293.method2019(98);
                } else {
                    class47.method341(2300, 0L, (short) 47, var12, class192.field3218, var10, class119.field2105);
                }
            } else {
                if (class22.field307 == 1) {
                    class47.method341(arg5 + 12099, 0L, (short) 14, var12, class129.field2247, var10, class193.field3275);
                }
                class47.method341(2300, 0L, (short) 3, var12, class129.field2247, var10, class143.field2442);
            }
        }
        long var14 = -1L;
        if (arg5 != -9799) {
            method2162(-107, -64, 122, 0, -58, -29, 39);
        }
        for (int var16 = 0; var16 < class179.field3064; var16++) {
            long var17 = class160.field2783[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FCA) >> 7;
            int var21 = ((int) var17 & 0x6FD2B12E) >> 29;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class131.method908(class297.field5058, var19, var20, var17)) {
                    class157 var23 = class99.method682(var22, (byte) -111);
                    if (var23.field2688 != null) {
                        var23 = var23.method1119((byte) 122);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class271.field4578 == 1) {
                        class329.field5612++;
                        class47.method341(2300, var17, (short) 42, var20, class29.method182(-6039, new class82[] { class321.field5537, class201.field3461, var23.field2691 }), var19, class19.field238);
                    } else if (!class256.field4406) {
                        class204.field3574++;
                        class82[] var24 = var23.field2722;
                        if (class127.field2233) {
                            var24 = client.method858(var24, 0);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class187.field3143++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 10;
                                    }
                                    if (var25 == 1) {
                                        var26 = 22;
                                    }
                                    if (var25 == 2) {
                                        var26 = 51;
                                    }
                                    if (var25 == 3) {
                                        var26 = 36;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class47.method341(2300, var17, var26, var20, class29.method182(arg5 ^ 0x31D0, new class82[] { class277.field4661, var23.field2691 }), var19, var24[var25]);
                                }
                            }
                        }
                        class47.method341(2300, (long) var23.field2676, (short) 1002, var20, class29.method182(-6039, new class82[] { class277.field4661, var23.field2691 }), var19, class242.field4216);
                    } else if ((class193.field3272 & 0x4) == 4) {
                        class99.field1790++;
                        class47.method341(2300, var17, (short) 2, var20, class29.method182(-6039, new class82[] { class48.field800, class201.field3461, var23.field2691 }), var19, class119.field2105);
                    }
                }
                if (var21 == 1) {
                    class275 var27 = class99.field1777[var22];
                    if (var27.field4628.field4052 == 1 && (var27.field1685 & 0x7F) == 64 && (var27.field1689 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class25.field333; var28++) {
                            class275 var29 = class99.field1777[class43.field749[var28]];
                            if (var29 != null && var27 != var29 && var29.field4628.field4052 == 1 && var27.field1685 == var29.field1685 && var27.field1689 == var29.field1689) {
                                class55.method385(-27050, var19, var29.field4628, class43.field749[var28], var20);
                            }
                        }
                        for (int var30 = 0; var30 < class297.field5054; var30++) {
                            class81 var31 = class29.field405[class310.field5292[var30]];
                            if (var31 != null && var27.field1685 == var31.field1685 && var27.field1689 == var31.field1689) {
                                class325.method2237((byte) -120, class310.field5292[var30], var31, var19, var20);
                            }
                        }
                    }
                    class55.method385(arg5 ^ 0x4FEF, var19, var27.field4628, var22, var20);
                }
                if (var21 == 0) {
                    class81 var32 = class29.field405[var22];
                    if ((var32.field1685 & 0x7F) == 64 && (var32.field1689 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class25.field333; var33++) {
                            class275 var34 = class99.field1777[class43.field749[var33]];
                            if (var34 != null && var34.field4628.field4052 == 1 && var32.field1685 == var34.field1685 && var32.field1689 == var34.field1689) {
                                class55.method385(-27050, var19, var34.field4628, class43.field749[var33], var20);
                            }
                        }
                        for (int var35 = 0; var35 < class297.field5054; var35++) {
                            class81 var36 = class29.field405[class310.field5292[var35]];
                            if (var36 != null && var32 != var36 && var32.field1685 == var36.field1685 && var32.field1689 == var36.field1689) {
                                class325.method2237((byte) -101, class310.field5292[var35], var36, var19, var20);
                            }
                        }
                    }
                    class325.method2237((byte) -121, var22, var32, var19, var20);
                }
                if (var21 == 3) {
                    class277 var37 = class107.field1889[class297.field5058][var19][var20];
                    if (var37 != null) {
                        for (class315 var38 = (class315) var37.method1931((byte) -73); var38 != null; var38 = (class315) var37.method1927(0)) {
                            int var39 = var38.field5428.field4840;
                            class312 var40 = class273.method1912(var39, -90);
                            if (class271.field4578 == 1) {
                                class267.field4533++;
                                class47.method341(2300, (long) var39, (short) 35, var20, class29.method182(-6039, new class82[] { class321.field5537, class272.field4583, var40.field5364 }), var19, class19.field238);
                            } else if (!class256.field4406) {
                                class296.field5026++;
                                class82[] var41 = var40.field5396;
                                if (class127.field2233) {
                                    var41 = client.method858(var41, 0);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class89.field1598++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 30;
                                        }
                                        if (var42 == 1) {
                                            var43 = 23;
                                        }
                                        if (var42 == 2) {
                                            var43 = 39;
                                        }
                                        if (var42 == 3) {
                                            var43 = 13;
                                        }
                                        if (var42 == 4) {
                                            var43 = 7;
                                        }
                                        class47.method341(2300, (long) var39, var43, var20, class29.method182(arg5 + 3760, new class82[] { class31.field466, var40.field5364 }), var19, var41[var42]);
                                    } else if (var42 == 2) {
                                        class231.field3985++;
                                        class47.method341(2300, (long) var39, (short) 39, var20, class29.method182(-6039, new class82[] { class31.field466, var40.field5364 }), var19, class312.field5393);
                                    }
                                }
                                class47.method341(2300, (long) var39, (short) 1004, var20, class29.method182(-6039, new class82[] { class31.field466, var40.field5364 }), var19, class242.field4216);
                            } else if ((class193.field3272 & 0x1) == 1) {
                                class47.method341(2300, (long) var39, (short) 59, var20, class29.method182(arg5 + 3760, new class82[] { class48.field800, class272.field4583, var40.field5364 }), var19, class119.field2105);
                                class255.field4385++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 393)
    public static final void method2163() {
        for (int var0 = 0; var0 < class33.field491; var0++) {
            class69 var1 = class164.field2878[var0];
            class64.method409(var1);
            class164.field2878[var0] = null;
        }
        class33.field491 = 0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIIIIII)I", line = 416)
    public static final int method2164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg0;
            arg0 = var7;
        }
        if (arg1 > -10) {
            method2164(-30, -128, -30, -27, 6, -53, -43);
        }
        int var8 = arg2 & 0x3;
        field5421++;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 - (arg3 - 1) - arg5;
        } else {
            return 1 + 7 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lfk;)V", line = 463)
    public class315(class288 arg0) {
        this.field5428 = arg0;
    }
}
