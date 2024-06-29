import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class662 extends class113 {

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "[B")
    public byte[] field9312;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public int field9309;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public int field9310;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public int field9311;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public int field9314;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    public final void method3777(int arg0) {
        field9316++;
        int var2 = -1;
        int var3 = this.field9312.length - 8;
        if (arg0 != 16) {
            method3780(-5, null);
        }
        while (var2 < var3) {
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
            var2++;
            this.field9312[var2] = 0;
        }
        while (var2 < (this.field9312.length - 1)) {
            var2++;
            this.field9312[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
    public final boolean method3778(int arg0, int arg1, int arg2) {
        field9306++;
        if (arg2 != 0) {
            this.method3783(-20, 57, 74, -11, true);
        }
        return this.field9312.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
    public final void method3779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9315++;
        int var8 = 0;
        if (arg1 != arg4) {
            var8 = (arg0 - arg3 << 16) / (arg1 - arg4);
        }
        int var9 = 0;
        if (arg1 != arg5) {
            var9 = (arg2 - arg0 << 16) / (arg5 - arg1);
        }
        if (arg6 != 871193392) {
            this.field9311 = -76;
        }
        int var10 = 0;
        if (arg4 != arg5) {
            var10 = (arg3 - arg2 << 16) / (arg4 - arg5);
        }
        if (arg1 >= arg4 && arg5 >= arg4) {
            if (arg5 > arg1) {
                int var11;
                int var12 = var11 = arg3 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                int var13 = arg0 << 16;
                if (arg1 < 0) {
                    var13 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var10 < var8 || arg1 == arg4 && var10 > var9) {
                    int var14 = arg5 - arg1;
                    int var15 = arg1 - arg4;
                    int var16 = this.field9309 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var13 >> 16, var12 >> 16, 0, var16, (byte) -102);
                                var16 += this.field9309;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class154.method1006(this.field9312, var11 >> 16, var12 >> 16, 0, var16, (byte) -98);
                        var16 += this.field9309;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg5 - arg1;
                    int var18 = arg1 - arg4;
                    int var19 = this.field9309 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var12 >> 16, var13 >> 16, 0, var19, (byte) -119);
                                var19 += this.field9309;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class154.method1006(this.field9312, var12 >> 16, var11 >> 16, 0, var19, (byte) -76);
                        var19 += this.field9309;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                int var22 = arg2 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg4 != arg5 && var8 > var10 || arg4 == arg5 && var9 > var8) {
                    int var23 = arg1 - arg5;
                    int var24 = arg5 - arg4;
                    int var25 = this.field9309 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var20 >> 16, var22 >> 16, 0, var25, (byte) -43);
                                var25 += this.field9309;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class154.method1006(this.field9312, var20 >> 16, var21 >> 16, 0, var25, (byte) -46);
                        var20 += var8;
                        var25 += this.field9309;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg1 - arg5;
                    int var27 = arg5 - arg4;
                    int var28 = this.field9309 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var22 >> 16, var20 >> 16, 0, var28, (byte) -106);
                                var28 += this.field9309;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class154.method1006(this.field9312, var21 >> 16, var20 >> 16, 0, var28, (byte) -117);
                        var20 += var8;
                        var28 += this.field9309;
                        var21 += var10;
                    }
                }
            }
        } else if (arg5 < arg1) {
            if (arg1 > arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var10;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                int var31 = arg3 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg1 - arg4;
                    int var33 = arg4 - arg5;
                    int var34 = this.field9309 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var30 >> 16, var31 >> 16, 0, var34, (byte) -36);
                                var34 += this.field9309;
                                var30 += var9;
                                var31 += var8;
                            }
                        }
                        class154.method1006(this.field9312, var30 >> 16, var29 >> 16, 0, var34, (byte) -78);
                        var29 += var10;
                        var34 += this.field9309;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg1 - arg4;
                    int var36 = arg4 - arg5;
                    int var37 = this.field9309 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var31 >> 16, var30 >> 16, 0, var37, (byte) -45);
                                var30 += var9;
                                var31 += var8;
                                var37 += this.field9309;
                            }
                        }
                        class154.method1006(this.field9312, var29 >> 16, var30 >> 16, 0, var37, (byte) -85);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field9309;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg0 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var10;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg4 - arg1;
                    int var42 = arg1 - arg5;
                    int var43 = this.field9309 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var40 >> 16, var38 >> 16, 0, var43, (byte) -101);
                                var40 += var8;
                                var38 += var10;
                                var43 += this.field9309;
                            }
                        }
                        class154.method1006(this.field9312, var39 >> 16, var38 >> 16, 0, var43, (byte) -64);
                        var43 += this.field9309;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg4 - arg1;
                    int var45 = arg1 - arg5;
                    int var46 = this.field9309 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class154.method1006(this.field9312, var38 >> 16, var40 >> 16, 0, var46, (byte) -68);
                                var38 += var10;
                                var40 += var8;
                                var46 += this.field9309;
                            }
                        }
                        class154.method1006(this.field9312, var38 >> 16, var39 >> 16, 0, var46, (byte) -90);
                        var46 += this.field9309;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg5 < arg4) {
            int var47;
            int var48 = var47 = arg0 << 16;
            if (arg1 < 0) {
                var47 -= arg1 * var9;
                var48 -= arg1 * var8;
                arg1 = 0;
            }
            int var49 = arg2 << 16;
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg1 != arg5 && var8 < var9 || arg1 == arg5 && var10 < var8) {
                int var50 = arg4 - arg5;
                int var51 = arg5 - arg1;
                int var52 = this.field9309 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class154.method1006(this.field9312, var49 >> 16, var48 >> 16, 0, var52, (byte) -69);
                            var52 += this.field9309;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class154.method1006(this.field9312, var47 >> 16, var48 >> 16, 0, var52, (byte) -114);
                    var47 += var9;
                    var52 += this.field9309;
                    var48 += var8;
                }
            } else {
                int var53 = arg4 - arg5;
                int var54 = arg5 - arg1;
                int var55 = this.field9309 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class154.method1006(this.field9312, var48 >> 16, var49 >> 16, 0, var55, (byte) -64);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field9309;
                        }
                    }
                    class154.method1006(this.field9312, var48 >> 16, var47 >> 16, 0, var55, (byte) -54);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field9309;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            int var58 = arg3 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var8;
                var56 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (var8 < var9) {
                int var59 = arg5 - arg4;
                int var60 = arg4 - arg1;
                int var61 = this.field9309 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class154.method1006(this.field9312, var56 >> 16, var58 >> 16, 0, var61, (byte) -73);
                            var58 += var10;
                            var61 += this.field9309;
                            var56 += var9;
                        }
                    }
                    class154.method1006(this.field9312, var56 >> 16, var57 >> 16, 0, var61, (byte) -44);
                    var56 += var9;
                    var61 += this.field9309;
                    var57 += var8;
                }
            } else {
                int var62 = arg5 - arg4;
                int var63 = arg4 - arg1;
                int var64 = this.field9309 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class154.method1006(this.field9312, var58 >> 16, var56 >> 16, 0, var64, (byte) -34);
                            var64 += this.field9309;
                            var58 += var10;
                            var56 += var9;
                        }
                    }
                    class154.method1006(this.field9312, var57 >> 16, var56 >> 16, 0, var64, (byte) -100);
                    var64 += this.field9309;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3780(int arg0, String arg1) {
        field9313++;
        if (!class773.field10644 || (class774.field10657 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class783.field10748;
        int[] var4 = class244.field3610;
        for (int var5 = arg0; var5 < var3; var5++) {
            class723 var6 = class413.field5787[var4[var5]];
            if (var6.field9965 != null && var6.field9965.equalsIgnoreCase(arg1) && (class724.field10031 == var6 && (class774.field10657 & 0x10) != 0 || var6 != null && (class774.field10657 & 0x8) != 0)) {
                class650.field9087++;
                class116 var7 = class248.method1672(class84.field1023, class353.field5114, -20647);
                var7.field1575.method2988((byte) -120, 0);
                var7.field1575.method2977(false, var4[var5]);
                var7.field1575.method3003(class539.field7462, -23061);
                var7.field1575.method2986(class81.field913, 117);
                var7.field1575.method2977(false, class326.field4586);
                class443.method2655(0, var7);
                var2 = true;
                class461.method2775(-2, true, 0, var6.method3744(1), -2, var6.field9214[0], 0, var6.method3744(arg0 + 1), var6.field9219[0]);
                break;
            }
        }
        if (!var2) {
            class128.method876(4, (byte) 121, class712.field9874.method3999(class553.field7667, (byte) -43) + arg1);
        }
        if (class773.field10644) {
            class76.method561(-1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)B")
    public static final byte method3781(int arg0, int arg1, int arg2) {
        field9307++;
        if (arg2 <= 43) {
            return 96;
        } else if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBII)V")
    public static final void method3782(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field9308++;
        if (arg2 > -107) {
            return;
        }
        int var5 = class68.field753;
        int var6 = class100.field1167;
        if (class55.field651) {
            var5 += class236.method1611(-5110);
            var6 += class339.method2149((byte) 34);
        }
        if (class381.field5457 == 1) {
            class318 var7 = class686.field9579[class450.field6290 / 100];
            var7.method2025(var5 - 8, var6 + -8);
            class338.method2144((byte) -123, (var5 + var7.method749()) - 8, var6 + -8, var7.method736() + var6 - 8, var5 + -8);
        }
        if (class381.field5457 == 2) {
            class318 var8 = class686.field9579[(class450.field6290 / 100) + 4];
            var8.method2025(var5 - 8, var6 + -8);
            class338.method2144((byte) -128, var8.method749() + var5 - 8, var6 + -8, var8.method736() + var6 - 8, var5 - 8);
        }
        class665.method3794(true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZ)V")
    public final void method3783(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        this.field9309 = arg3 - arg1;
        this.field9310 = arg0;
        this.field9314 = arg2 - arg0;
        this.field9311 = arg1;
        field9317++;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Llba;II)V")
    public class662(class223 arg0, int arg1, int arg2) {
        this.field9312 = new byte[arg1 * arg2];
    }
}
