import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class265 {

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "B")
    private byte field4061;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field4051;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Leg;")
    public static class41 field4057 = new class41();

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[I")
    public static int[] field4058 = new int[2500];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field4059 = 0;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Lhb;")
    public static class318 field4064 = new class318(260);

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Z")
    public static boolean field4065 = false;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 4)
    public static void method1856(byte arg0) {
        field4057 = null;
        field4064 = null;
        if (arg0 != -40) {
            field4064 = (class318) null;
        }
        field4058 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILla;IIB)V", line = 17)
    public static final void method1857(int arg0, int arg1, int arg2, class191 arg3, int arg4, int arg5, byte arg6) {
        field4056++;
        boolean var7 = true;
        long var8 = 0L;
        if (arg6 >= -62) {
            method1857(98, 117, 93, (class191) null, -97, 94, (byte) -62);
        }
        boolean var10 = false;
        if (arg0 == 0) {
            var8 = class179.method1237(arg1, arg2, arg5);
        } else if (arg0 == 1) {
            var8 = class74.method475(arg1, arg2, arg5);
        } else if (arg0 == 2) {
            var8 = class73.method471(arg1, arg2, arg5);
        } else if (arg0 == 3) {
            var8 = class316.method2165(arg1, arg2, arg5);
        }
        int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
        int var12 = (int) var8 >> 14 & 0x1F;
        boolean var13 = false;
        class22 var14 = class284.method1980(var11, (byte) 118);
        if (var14.method146(-21)) {
            class120.method874(var14, arg5, arg1, 128, arg2);
        }
        int var15 = (int) var8 >> 20 & 0x3;
        if (var8 == 0L) {
            return;
        }
        class233 var16 = null;
        class233 var17 = null;
        if (arg0 == 0) {
            class163 var18 = class28.method182(arg1, arg2, arg5);
            if (var18 != null) {
                var16 = var18.field2452;
                var17 = var18.field2451;
            }
            if (var14.field332 != 0) {
                arg3.method1308(var12, arg5, var15, arg2, var14.field301, 18062);
            }
        } else if (arg0 == 1) {
            class226 var19 = class201.method1375(arg1, arg2, arg5);
            if (var19 != null) {
                var16 = var19.field3435;
                var17 = var19.field3450;
            }
        } else if (arg0 == 2) {
            class311 var21 = class270.method1906(arg1, arg2, arg5);
            if (var21 != null) {
                var17 = var21.field4728;
            }
            if (var14.field332 != 0 && var14.field330 + arg2 < 104 && var14.field330 + arg5 < 104 && var14.field293 + arg2 < 104 && var14.field293 + arg5 < 104) {
                arg3.method1306(arg5, (byte) 44, arg2, var15, var14.field293, var14.field301, var14.field330);
            }
        } else if (arg0 == 3) {
            class187 var20 = class234.method1608(arg1, arg2, arg5);
            if (var20 != null) {
                var17 = var20.field2781;
            }
            if (var14.field332 == 1) {
                arg3.method1311((byte) -118, arg2, arg5);
            }
        }
        if (var14.field336 != null) {
            var14 = var14.method142(0);
        }
        if (!class117.field1817 || var14 == null || !var14.field345) {
            return;
        }
        if (var12 == 2) {
            if (var17 instanceof class17) {
                ((class17) var17).method113(482);
            } else {
                class40.method269(var15 + 4, var12, 0, 0, var14, arg4, arg5, arg2, 113);
            }
            if (var16 instanceof class17) {
                ((class17) var16).method113(482);
            } else {
                class40.method269(var15 + 1 & 0x3, var12, 0, 0, var14, arg4, arg5, arg2, 118);
            }
        } else if (var12 == 5) {
            if ((var17 instanceof class17)) {
                ((class17) var17).method113(482);
            } else {
                class40.method269(var15, 4, class299.field4564[var15] * 8, class40.field478[var15] * 8, var14, arg4, arg5, arg2, 118);
            }
        } else if (var12 == 6) {
            if ((var17 instanceof class17)) {
                ((class17) var17).method113(482);
            } else {
                class40.method269(var15 + 4, 4, class75.field970[var15] * 8, class30.field400[var15] * 8, var14, arg4, arg5, arg2, 111);
            }
        } else if (var12 == 7) {
            if (var17 instanceof class17) {
                ((class17) var17).method113(482);
            } else {
                class40.method269((var15 + 2 & 0x3) + 4, 4, 0, 0, var14, arg4, arg5, arg2, 90);
            }
        } else if (var12 == 8) {
            if ((var17 instanceof class17)) {
                ((class17) var17).method113(482);
            } else {
                class40.method269(var15 + 4, 4, class75.field970[var15] * 8, class30.field400[var15] * 8, var14, arg4, arg5, arg2, 103);
            }
            if ((var16 instanceof class17)) {
                ((class17) var16).method113(482);
            } else {
                class40.method269((var15 + 2 & 0x3) + 4, 4, class75.field970[var15] * 8, class30.field400[var15] * 8, var14, arg4, arg5, arg2, 31);
            }
        } else if (var12 == 11) {
            if (var17 instanceof class17) {
                ((class17) var17).method113(482);
            } else {
                class40.method269(var15 + 4, 10, 0, 0, var14, arg4, arg5, arg2, 91);
            }
        } else if ((var17 instanceof class17)) {
            ((class17) var17).method113(482);
        } else {
            class40.method269(var15, var12, 0, 0, var14, arg4, arg5, arg2, 112);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBI)I", line = 218)
    public static final int method1858(int arg0, byte arg1, int arg2) {
        field4063++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            if (arg1 > -122) {
                method1858(34, (byte) -46, 71);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIZ)I", line = 244)
    public static final int method1859(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0 & 0x3;
        field4062++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            if (!arg3) {
                method1858(20, (byte) -43, 82);
            }
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)I", line = 272)
    public final int method1860(byte arg0) {
        if (arg0 != 28) {
            this.field4048 = 93;
        }
        field4060++;
        return this.field4061 & 0x7;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 288)
    public static final void method1861(int arg0) {
        field4066++;
        if (!class117.field1817 || class325.field4897) {
            return;
        }
        if (arg0 < 114) {
            method1861(-57);
        }
        class221[][][] var1 = class158.field2367;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class221[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class221 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3364 != null && var6.field3364.field2781 instanceof class83) {
                            class83 var7 = (class83) var6.field3364.field2781;
                            if ((Long.MIN_VALUE & var6.field3364.field2787) == 0L) {
                                var7.method574(false, true, true, true, false, true, true);
                            } else {
                                var7.method574(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field3368 != null) {
                            if (var6.field3368.field3450 instanceof class83) {
                                class83 var8 = (class83) var6.field3368.field3450;
                                if ((var6.field3368.field3440 & Long.MIN_VALUE) == 0L) {
                                    var8.method574(false, true, true, true, false, true, true);
                                } else {
                                    var8.method574(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3368.field3435 instanceof class83) {
                                class83 var9 = (class83) var6.field3368.field3435;
                                if ((Long.MIN_VALUE & var6.field3368.field3440) == 0L) {
                                    var9.method574(false, true, true, true, false, true, true);
                                } else {
                                    var9.method574(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field3370 != null) {
                            if (var6.field3370.field2451 instanceof class83) {
                                class83 var10 = (class83) var6.field3370.field2451;
                                if ((Long.MIN_VALUE & var6.field3370.field2448) == 0L) {
                                    var10.method574(false, true, true, true, false, true, true);
                                } else {
                                    var10.method574(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3370.field2452 instanceof class83) {
                                class83 var11 = (class83) var6.field3370.field2452;
                                if ((var6.field3370.field2448 & Long.MIN_VALUE) == 0L) {
                                    var11.method574(false, true, true, true, false, true, true);
                                } else {
                                    var11.method574(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field3374; var12++) {
                            if (var6.field3354[var12].field4728 instanceof class83) {
                                class83 var13 = (class83) var6.field3354[var12].field4728;
                                if ((Long.MIN_VALUE & var6.field3354[var12].field4720) == 0L) {
                                    var13.method574(false, true, true, true, false, true, true);
                                } else {
                                    var13.method574(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class325.field4897 = true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llm;B)V", line = 439)
    public static final void method1862(class210 arg0, byte arg1) {
        class164.field2481 = arg0.method1448((byte) 10, "p11_full");
        class73.field954 = arg0.method1448((byte) 10, "p12_full");
        field4050++;
        class29.field395 = arg0.method1448((byte) 10, "b12_full");
        class37.field453 = arg0.method1448((byte) 10, "mapfunction");
        class87.field1290 = arg0.method1448((byte) 10, "hitmarks");
        class315.field4763 = arg0.method1448((byte) 10, "hitbar_default");
        class23.field346 = arg0.method1448((byte) 10, "headicons_pk");
        class75.field978 = arg0.method1448((byte) 10, "headicons_prayer");
        class3.field14 = arg0.method1448((byte) 10, "hint_headicons");
        class36.field440 = arg0.method1448((byte) 10, "hint_mapmarkers");
        class246.field3668 = arg0.method1448((byte) 10, "mapflag");
        class177.field2629 = arg0.method1448((byte) 10, "cross");
        class92.field1376 = arg0.method1448((byte) 10, "mapdots");
        class305.field4645 = arg0.method1448((byte) 10, "scrollbar");
        class72.field939 = arg0.method1448((byte) 10, "name_icons");
        class288.field4349 = arg0.method1448((byte) 10, "floorshadows");
        int var2 = 25 / ((arg1 - 66) / 56);
        class209.field3153 = arg0.method1448((byte) 10, "compass");
        class306.field4670 = arg0.method1448((byte) 10, "hint_mapedge");
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 470)
    public class265() {
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)I", line = 474)
    public final int method1863(byte arg0) {
        if (arg0 > -7) {
            this.method1863((byte) 19);
        }
        field4049++;
        return (this.field4061 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lre;)V", line = 483)
    public class265(class263 arg0) {
        this.field4061 = arg0.method1810((byte) 106);
        this.field4052 = arg0.method1830((byte) -77);
        this.field4048 = arg0.method1826(-206227536);
        this.field4051 = arg0.method1826(-206227536);
        this.field4053 = arg0.method1826(-206227536);
        this.field4054 = arg0.method1826(-206227536);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIILmd;JZ)V", line = 503)
    public static final void method1864(int arg0, int arg1, int arg2, int arg3, class233 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2781 = arg4;
        var8.field2793 = arg1 * 128 + 64;
        var8.field2792 = arg2 * 128 + 64;
        var8.field2782 = arg3;
        var8.field2787 = arg5;
        var8.field2794 = arg6;
        if (class158.field2367[arg0][arg1][arg2] == null) {
            class158.field2367[arg0][arg1][arg2] = new class221(arg0, arg1, arg2);
        }
        class158.field2367[arg0][arg1][arg2].field3364 = var8;
    }
}
