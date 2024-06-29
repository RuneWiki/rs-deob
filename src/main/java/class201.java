import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class201 extends class220 {

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Z")
    public static boolean field3485 = false;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[Z")
    public static boolean[] field3483 = new boolean[100];

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lmb;")
    public static class96 field3491 = class243.method1708("Loading world list data", (byte) 120);

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Lmb;")
    public static class96 field3490 = class243.method1708(" x ", (byte) 95);

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lff;")
    public static class3 field3482;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZI)V")
    public static final void method1404(int arg0, boolean arg1, int arg2) {
        field3492++;
        if (!arg1) {
            field3490 = null;
        }
        if (class92.field1525 != 0 && arg2 != -1) {
            class68.method476(arg2, class92.field1525, class97.field1634, false, 0, -42);
            class119.field2213 = true;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILwa;III)V")
    public static final void method1405(int arg0, class229 arg1, int arg2, int arg3, int arg4) {
        field3484++;
        if (class73.field1254 >= 400) {
            return;
        }
        if (arg1.field3926 != null) {
            arg1 = arg1.method1560((byte) -74);
        }
        if (arg1 == null) {
            return;
        }
        if (arg2 < 100) {
            field3483 = null;
        }
        if (!arg1.field3909) {
            return;
        }
        class96 var5 = arg1.field3931;
        if (arg1.field3908 != 0) {
            var5 = class36.method289(-5615, new class96[] { var5, class87.method626(class236.field4047.field801, (byte) -44, arg1.field3908), class235.field4030, class53.field933, class31.method205(arg1.field3908, (byte) -78), class243.field4211 });
        }
        if (class148.field2616 == 1) {
            class265.field4628++;
            class220.method1513(-126, (short) 20, class219.field3754, arg4, class36.method289(-5615, new class96[] { class178.field3075, class207.field3577, var5 }), (long) arg0, arg3);
        } else if (!class124.field2301) {
            class55.field947++;
            class96[] var6 = arg1.field3930;
            if (class115.field2138) {
                var6 = class107.method809((byte) 119, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class239.field4097 != 0 || !var6[var7].method679(class49.field864, 18452))) {
                        class198.field3458++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 57;
                        }
                        if (var7 == 1) {
                            var8 = 59;
                        }
                        if (var7 == 2) {
                            var8 = 38;
                        }
                        if (var7 == 3) {
                            var8 = 1;
                        }
                        if (var7 == 4) {
                            var8 = 29;
                        }
                        class220.method1513(-111, var8, var6[var7], arg4, class36.method289(-5615, new class96[] { class96.field1582, var5 }), (long) arg0, arg3);
                    }
                }
            }
            if (class239.field4097 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method679(class49.field864, 18452)) {
                        class74.field1267++;
                        short var10 = 0;
                        if (var9 == 0) {
                            var10 = 57;
                        }
                        short var11 = 0;
                        if (var9 == 1) {
                            var10 = 59;
                        }
                        if (class236.field4047.field801 < arg1.field3908) {
                            var11 = 2000;
                        }
                        if (var9 == 2) {
                            var10 = 38;
                        }
                        if (var9 == 3) {
                            var10 = 1;
                        }
                        if (var9 == 4) {
                            var10 = 29;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class220.method1513(-122, var10, var6[var9], arg4, class36.method289(-5615, new class96[] { class96.field1582, var5 }), (long) arg0, arg3);
                    }
                }
            }
            class220.method1513(-18, (short) 1005, class258.field4473, arg4, class36.method289(-5615, new class96[] { class96.field1582, var5 }), (long) arg0, arg3);
        } else if ((class251.field4343 & 0x2) == 2) {
            class220.method1513(-33, (short) 4, class75.field1302, arg4, class36.method289(-5615, new class96[] { class138.field2478, class207.field3577, var5 }), (long) arg0, arg3);
            class186.field3237++;
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1406(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= class9.field145 && class162.field2884 >= arg2 && client.field1994 <= arg5 && class9.field149 >= arg4) {
            if (arg0 == 1) {
                class250.method1747(arg4, arg5, arg2, (byte) 119, arg6, arg1);
            } else {
                class119.method922(arg5, (byte) 106, arg1, arg0, arg4, arg2, arg6);
            }
        } else if (arg0 == 1) {
            class92.method649(arg4, arg1, 18666, arg6, arg5, arg2);
        } else {
            class33.method223(arg6, arg1, arg2, (byte) 68, arg0, arg4, arg5);
        }
        field3486++;
        if (arg3 < 126) {
            field3490 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (class9.field145 <= arg5 && arg5 <= class162.field2884 && arg6 >= class9.field145 && class162.field2884 >= arg6 && arg3 >= class9.field145 && arg3 <= class162.field2884 && class9.field145 <= arg9 && class162.field2884 >= arg9 && arg4 >= client.field1994 && arg4 <= class9.field149 && client.field1994 <= arg0 && arg0 <= class9.field149 && client.field1994 <= arg7 && arg7 <= class9.field149 && arg1 >= client.field1994 && class9.field149 >= arg1) {
            class115.method907(-24080, arg1, arg5, arg2, arg7, arg6, arg0, arg4, arg3, arg9);
        } else {
            class38.method303(arg7, arg0, 3, arg5, arg4, arg9, arg1, arg2, arg3, arg6);
        }
        if (arg8 >= 66) {
            field3489++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public static final void method1408(int arg0, int arg1, int arg2) {
        class44.field758[arg1] = arg0;
        field3487++;
        if (arg2 != 59) {
            field3490 = null;
        }
        class149 var3 = (class149) class245.field4257.method1081(0, (long) arg1);
        if (var3 == null) {
            class149 var4 = new class149(4611686018427387905L);
            class245.field4257.method1085(-1, var4, (long) arg1);
        } else if (var3.field2631 != 4611686018427387905L) {
            var3.field2631 = class155.method1133(126) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method1409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3488++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class179.field3093 = -1;
            class220.field3756 = -1;
            return;
        }
        int var8 = class137.method1025(class216.field3712, arg0, arg3, (byte) -94) - arg4;
        int var9 = class240.field4162[class140.field2501];
        int var10 = arg3 - class178.field3078;
        int var11 = class240.field4176[class140.field2501];
        int var12 = var8 - class105.field1767;
        int var13 = class240.field4176[class23.field392];
        int var14 = class240.field4162[class23.field392];
        int var15 = arg0 - class22.field389;
        int var16 = var14 * var15 + (var10 * var13) >> 16;
        int var17 = var13 * var15 - (var10 * var14) >> 16;
        if (arg6 != 8639) {
            return;
        }
        int var19 = var11 * var12 - (var9 * var17) >> 16;
        int var20 = var9 * var12 + var11 * var17 >> 16;
        if (var20 >= 50) {
            class220.field3756 = (var19 << 9) / var20 + arg5;
            class179.field3093 = (var16 << 9) / var20 + arg2;
        } else {
            class179.field3093 = -1;
            class220.field3756 = -1;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1410(int arg0) {
        field3482 = null;
        field3491 = null;
        if (arg0 == -239461552) {
            field3483 = null;
            field3490 = null;
        }
    }
}
