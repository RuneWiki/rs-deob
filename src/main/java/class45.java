import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class45 extends class502 {

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Z")
    public final boolean method329(int arg0) {
        ++field700;
        if (arg0 != 0) {
            field697 = 90;
        }
        return true;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)I")
    public final int method330(byte arg0) {
        if (arg0 < 49) {
            this.method52(-111, 87);
        }
        ++field703;
        return super.field6865;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field702;
        super.field6865 = arg0;
        if (arg1 != 0) {
            field697 = 56;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        if (arg0 != -2) {
            return -70;
        } else {
            ++field699;
            return 1;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Leka;)V")
    public class45(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method331(int arg0, int arg1, int arg2, Class arg3) {
        class549 var4 = class325.field4448[arg0][arg1][arg2];
        if (var4 != null) {
            for (class58 var5 = var4.field7466; var5 != null; var5 = var5.field811) {
                class597 var6 = var5.field815;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field8368 == arg1 && var6.field8369 == arg2) {
                    class682.method3846(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (~super.field6865 != -1 && super.field6863.field6754.method3467((byte) 95) != 1) {
            super.field6865 = 0;
        }
        if (!arg0) {
            field697 = -127;
        }
        ++field704;
        if (~super.field6865 > -1 || super.field6865 > 1) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIII)V")
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field707;
        if (~class268.field3766 >= ~(arg4 - arg1) && class236.field3392 >= arg4 - -arg1 && ~(-arg1 + arg3) <= ~class223.field3260 && arg1 + arg3 <= class706.field9700) {
            class128.method1093(arg5, arg6, arg2, arg4, arg1, arg0 ^ -962345307, arg3);
        } else {
            class422.method2496(arg4, arg5, arg1, arg3, arg0 ^ -112215515, arg6, arg2);
        }
        if (arg0 != 4) {
            field697 = 111;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field706;
        return arg0 != arg1 && ~super.field6863.field6754.method3467((byte) 110) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lri;Z)V")
    public static final void method333(class123 arg0, boolean arg1) {
        if (arg0.field2200 != null) {
            arg0.field2200.field8349 = 0;
        }
        ++field701;
        arg0.field2203 = false;
        class123 var2 = arg0.method362();
        if (arg1) {
            while (var2 != null) {
                method333(var2, true);
                var2 = arg0.method355();
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(ILeka;)V")
    public class45(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method334(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field698;
        if (class325.field4448 == null) {
            class95.field1472.method472(25692, arg4, arg1, arg2, -16777216, arg0);
        } else if (~class235.field3379.field7396 <= -1 && ~class235.field3379.field7396 > ~(class483.field6515 * 512) && class235.field3379.field7398 >= 0 && ~(class65.field926 * 512) < ~class235.field3379.field7398) {
            ++class93.field1455;
            if (class235.field3379 != null && ~(class235.field3379.field7396 + -(class235.field3379.method2342((byte) 19) * 256) + 256 >> 9) == ~class231.field3356 && ~(class235.field3379.field7398 + -((-1 + class235.field3379.method2342((byte) 109)) * 256) >> 9) == ~class392.field5380) {
                class392.field5380 = -1;
                class231.field3356 = -1;
                class414.method2445(-8688);
            }
            class426.method2508(-2963);
            if (!arg5) {
                class3.method18(-1);
            }
            class246.method1643(-15349);
            class491.method2816(arg1, -128, arg2, arg4, true, arg0);
            int var6 = class552.field7815;
            int var7 = class713.field9817;
            int var8 = class6.field110;
            class90.field1369 = class90.field1367;
            int var9 = class341.field4604;
            if (~class536.field7291 == -2) {
                int var10 = (int) class43.field682;
                if (var10 < class224.field3284 >> 8) {
                    var10 = class224.field3284 >> 8;
                }
                if (class727.field9991[4] && var10 < class214.field3184[4] + 128) {
                    var10 = class214.field3184[4] + 128;
                }
                int var11 = 16383 & (int) class53.field763 + class485.field6563;
                class584.method3357(var9, (byte) -124, class488.field6593, class97.field1557, var11, (var10 >> 3) * 3 + 600 << 2, var10, -200 + class309.method1973(15356, class235.field3379.field7396, class235.field3379.field7398, class282.field3917));
            } else if (class536.field7291 == 4) {
                int var12 = (int) class43.field682;
                if (var12 < class224.field3284 >> 8) {
                    var12 = class224.field3284 >> 8;
                }
                if (class727.field9991[4] && var12 < class214.field3184[4] + 128) {
                    var12 = class214.field3184[4] + 128;
                }
                int var13 = 16383 & (int) class53.field763;
                class584.method3357(var9, (byte) -124, class488.field6593, class97.field1557, var13, 600 - -((var12 >> 3) * 3) << 2, var12, class309.method1973(15356, class492.field6736, class229.field3347, class282.field3917) + -200);
            } else if (class536.field7291 == 5) {
                class709.method3956(var9, true);
            }
            int var14 = class733.field10131;
            int var15 = class605.field8452;
            int var16 = class450.field6172;
            int var17 = class255.field3585;
            int var18 = class460.field6249;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class727.field9991[var19]) {
                    int var22 = (int) ((double) (-class609.field8506[var19]) + Math.random() * (double) (class609.field8506[var19] * 2 - -1) + Math.sin((double) class270.field3786[var19] / 100.0D * (double) class407.field5591[var19]) * (double) class214.field3184[var19]);
                    if (var19 == 4) {
                        class255.field3585 += var22;
                        if (~class255.field3585 <= -1025) {
                            if (~class255.field3585 < -3073) {
                                class255.field3585 = 3072;
                            }
                        } else {
                            class255.field3585 = 1024;
                        }
                    }
                    if (~var19 == -3) {
                        class450.field6172 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class605.field8452 += var22 << 2;
                    }
                    if (~var19 == -4) {
                        class460.field6249 = class460.field6249 - -var22 & 16383;
                    }
                    if (var19 == 0) {
                        class733.field10131 += var22 << 2;
                    }
                }
            }
            if (~class733.field10131 > -1) {
                class733.field10131 = 0;
            }
            if (class450.field6172 < 0) {
                class450.field6172 = 0;
            }
            if (class733.field10131 > (class441.field5980 << 9) + -1) {
                class733.field10131 = (class441.field5980 << 9) + -1;
            }
            if (~((class375.field5083 << 9) - 1) > ~class450.field6172) {
                class450.field6172 = (class375.field5083 << 9) + -1;
            }
            class398.method2398(5);
            class412.method2441(31460);
            class95.field1472.method512(var8, var7, var6 + var8, var7 + var9);
            class522.method2965(false, true);
            if (!class618.field8597) {
                class95.field1472.method494();
                int var20 = class714.field9834;
                if (class288.field3973 == null) {
                    class95.field1472.method536(var20);
                } else {
                    class288.field3973.method2650(var6, (byte) -73, var9, var8, class255.field3585, class95.field1472, var7, class58.field817 << 3, var20, class460.field6249);
                }
            } else {
                class726.method4029(class714.field9834, (byte) -122);
                if (~class90.field1369 != ~class393.field5426) {
                    class180.field2828 = true;
                }
                class393.field5426 = class90.field1369;
            }
            class204.method1458(arg3 ^ 573261093);
            class417.field5701.method1882(class733.field10131, class605.field8452, class450.field6172, 16383 & -class255.field3585, -class460.field6249 & 16383, -class463.field6307 & 16383);
            class95.field1472.method503(class417.field5701);
            class95.field1472.method521(var6 / 2 + var8, var7 - -(var9 / 2), class535.field7248 << 1, class535.field7248 << 1);
            class119.method1050(class535.field7248 << 1, var6 / 2 + var8, -101, class535.field7248 << 1, var9 / 2 + var7);
            class311.method1979(arg3 ^ 573243580, class605.field8452, -class460.field6249 & 16383, -class463.field6307 & 16383, class450.field6172, class733.field10131, -class255.field3585 & 16383);
            byte var21 = class111.field1911.field6722.method3987((byte) 95) != 2 ? 1 : (byte) class93.field1455;
            if (!class618.field8597) {
                class715.method3981(class440.field5977, class733.field10131, class605.field8452, class450.field6172, class101.field1628, class58.field812, class562.field7972, class79.field1112, class737.field10175, class379.field5164, class235.field3379.field7391 + 1, var21, class235.field3379.field7396 >> 9, class235.field3379.field7398 >> 9, class111.field1911.field6718.method2964((byte) 68) == 0, true, !class507.field6967 ? -1 : class90.field1369, 0, false);
            } else {
                class628.method3528(-class460.field6249 & 16383, arg3 ^ 573244779, 16383 & -class463.field6307, -class255.field3585 & 16383);
                class713.method3966((byte) -111, class79.field1112, class605.field8452, class440.field5977, class235.field3379.field7398 >> 9, class101.field1628, class235.field3379.field7391 + 1, class90.field1369, class562.field7972, class379.field5164, class235.field3379.field7396 >> 9, true, class58.field812, class450.field6172, var21, class737.field10175, class733.field10131, class111.field1911.field6718.method2964((byte) 74) == 0);
            }
            class204.method1458(-17818);
            if (~class753.field10398 == -11) {
                class346.method2137(var8, var7, var9, 256, false, 256, var6);
                class441.method2567(0, 256, var8, 256, var6, var7, var9);
                class61.method427(256, var7, var8, var6, var9, arg3 ^ -573272811, 256);
                class404.method2414(var7, var8, var9, (byte) -11, var6);
            }
            class234.method1580();
            class460.field6249 = var18;
            class733.field10131 = var14;
            class605.field8452 = var15;
            class255.field3585 = var17;
            class450.field6172 = var16;
            if (class530.field7181 && class336.field4527.method6((byte) -85) == 0) {
                class530.field7181 = false;
            }
            if (arg3 != -573243581) {
                method332(-4, -21, -94, 50, 66, -11, 25);
            }
            if (class530.field7181) {
                class95.field1472.method472(25692, var9, var8, var6, -16777216, var7);
                class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8830.method3566((byte) -59, class464.field6309), false, (byte) 11);
            }
            class522.method2965(false, false);
        } else {
            class95.field1472.method472(25692, arg4, arg1, arg2, -16777216, arg0);
        }
    }
}
