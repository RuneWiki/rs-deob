import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class689 {

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "Llja;")
    public static class744 field9386 = new class744(14, 0);

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "[Ltf;")
    public static class312[] field9388;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public static final void method3846(byte arg0) {
        field9385++;
        class448 var1 = (class448) class153.field1909.method2725(37);
        int var2 = 95 / ((arg0 - 21) / 57);
        while (var1 != null) {
            class390 var3 = var1.field6022;
            if (var3.field5040) {
                var1.method2219(13630);
                var3.method2290(-1);
            } else if (var3.field5060 <= class228.field2707) {
                var3.method2289(5728, class190.field2279);
                if (var3.field5040) {
                    var1.method2219(13630);
                } else {
                    class36.method321(var3, true);
                }
            }
            var1 = (class448) class153.field1909.method2726(-122);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method3847(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class446.field6000 = 0;
        class116.field1480 = 0;
        class157.field1956++;
        if ((arg5 & 0x2) == 0) {
            for (class61 var8 = class653.field9015[var7]; var8 != null; var8 = var8.field822) {
                if (!class403.method2399(var8, arg0, arg1, arg2, arg3)) {
                    class553.method3244(var8);
                    if (var8.field816 != -1) {
                        class430.field5671[class446.field6000++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class61 var9 = class119.field1509[var7]; var9 != null; var9 = var9.field822) {
                if (!class403.method2399(var9, arg0, arg1, arg2, arg3)) {
                    class553.method3244(var9);
                    if (var9.field816 != -1) {
                        class642.field8765[class116.field1480++] = var9;
                    }
                }
            }
            for (class61 var10 = class454.field6399[var7]; var10 != null; var10 = var10.field822) {
                if (!class403.method2399(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method504((byte) -24)) {
                        class553.method3244(var10);
                        if (var10.field816 != -1) {
                            class642.field8765[class116.field1480++] = var10;
                        }
                    } else {
                        class553.method3244(var10);
                        if (var10.field816 != -1) {
                            class430.field5671[class446.field6000++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class521.field7397; var11++) {
                    if (!class403.method2399(class620.field8391[var11], arg0, arg1, arg2, arg3)) {
                        class553.method3244(class620.field8391[var11]);
                        if (class620.field8391[var11].field816 != -1) {
                            if (class620.field8391[var11].method504((byte) -24)) {
                                class642.field8765[class116.field1480++] = class620.field8391[var11];
                            } else {
                                class430.field5671[class446.field6000++] = class620.field8391[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class446.field6000 > 0) {
            class88.method806(class430.field5671, 0, class446.field6000 - 1);
            for (int var12 = 0; var12 < class446.field6000; var12++) {
                class375.method2188(class430.field5671[var12], true, arg6);
            }
        }
        if (class341.field4281) {
            class6.field80.method587(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class790.field10877; var13 < class368.field4569; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class308.field3820.length;
                    if (class308.field3820.length + class741.field10312 > class307.field3799) {
                        var23 -= class308.field3820.length + class741.field10312 - class307.field3799;
                    }
                    int var24 = class308.field3820[0].length;
                    if (class308.field3820[0].length + class784.field10831 > class250.field2938) {
                        var24 -= class308.field3820[0].length + class784.field10831 - class250.field2938;
                    }
                    boolean[][] var25 = class152.field1896;
                    if (class690.field9396) {
                        if (class309.field3847) {
                            var25 = class617.field8308[var13];
                        }
                        for (int var26 = class215.field2535; var26 < var23; var26++) {
                            int var27 = class741.field10312 + var26 - class215.field2535;
                            for (int var28 = class46.field616; var28 < var24; var28++) {
                                if (class308.field3820[var26][var28] && !class216.method1347(var13, 43, class784.field10831 + var28 - class46.field616, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class309.field3847) {
                        if (arg4 >= 0) {
                            class621.field8523[var13].method1390(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class621.field8523[var13].method1388(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class538.field7570; var29++) {
                            class468.field6545[var29].method2305(new class291(var13 + 1), 13606);
                        }
                    } else if (arg4 >= 0) {
                        class621.field8523[var13].method1390(class463.field6493, class619.field8331, class573.field7852, class152.field1896, true, arg4, arg5);
                    } else {
                        class621.field8523[var13].method1388(class463.field6493, class619.field8331, class573.field7852, class152.field1896, true, arg5);
                    }
                } else {
                    int var14 = class308.field3820.length;
                    if (class308.field3820.length + class741.field10312 > class307.field3799) {
                        var14 -= class308.field3820.length + class741.field10312 - class307.field3799;
                    }
                    int var15 = class308.field3820[0].length;
                    if (class308.field3820[0].length + class784.field10831 > class250.field2938) {
                        var15 -= class308.field3820[0].length + class784.field10831 - class250.field2938;
                    }
                    boolean[][] var16 = class152.field1896;
                    if (class690.field9396) {
                        if (class309.field3847) {
                            var16 = class617.field8308[var13];
                        }
                        for (int var17 = class215.field2535; var17 < var14; var17++) {
                            int var18 = class741.field10312 + var17 - class215.field2535;
                            for (int var19 = class46.field616; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class308.field3820[var17][var19]) {
                                    int var20 = class784.field10831 + var19 - class46.field616;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class107.field1351[var21][var18][var20] != null && class107.field1351[var21][var18][var20].field10186 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class216.method1347(var13, -68, var20, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class309.field3847) {
                        if (arg4 >= 0) {
                            class621.field8523[var13].method1390(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class621.field8523[var13].method1388(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class538.field7570; var22++) {
                            class468.field6545[var22].method2305(new class291(var13 + 1), 13606);
                        }
                    } else if (arg4 >= 0) {
                        class621.field8523[var13].method1390(class463.field6493, class619.field8331, class573.field7852, class152.field1896, false, arg4, arg5);
                    } else {
                        class621.field8523[var13].method1388(class463.field6493, class619.field8331, class573.field7852, class152.field1896, false, arg5);
                    }
                }
            }
        }
        if (class116.field1480 > 0) {
            class580.method3343(class642.field8765, 0, class116.field1480 - 1);
            for (int var30 = 0; var30 < class116.field1480; var30++) {
                class375.method2188(class642.field8765[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V")
    public static void method3848(boolean arg0) {
        field9388 = null;
        if (!arg0) {
            field9386 = null;
        }
        field9386 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZBILbt;J)V")
    public static final void method3849(int arg0, int arg1, boolean arg2, byte arg3, int arg4, class48 arg5, long arg6) {
        if (arg3 != 22) {
            method3848(true);
        }
        field9389++;
        class757.method4223(0, arg5, arg6, arg3 + 1246799506, arg1, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Z")
    public static final boolean method3850(int arg0, int arg1, int arg2) {
        field9387++;
        if (arg1 != 55) {
            method3848(true);
        }
        return (arg2 & 0x37) != 0;
    }
}
