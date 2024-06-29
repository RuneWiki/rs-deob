import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class323 extends class451 {

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    private int field4599;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "J")
    public static volatile long field4598 = 0L;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Ltq;")
    public static class376 field4602;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Ltq;")
    public static class376 field4606;

    // $FF: synthetic field
    @OriginalMember(owner = "client!md", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field4607;

    // $FF: synthetic method
    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2108(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2104(byte arg0) {
        class237 var1 = class66.field755;
        synchronized (class66.field755) {
            class66.field755.method1618(0);
        }
        if (arg0 == 114) {
            ++field4596;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V", line = 18)
    public final void method261(int arg0, int arg1, int arg2) {
        ++field4593;
        int var4 = this.field4603 * arg0 >> 12;
        if (arg1 >= -56) {
            method2105(-7, 119, -37, 12, -5, 72, (class134) null, 2, -118);
        }
        int var5 = this.field4591 * arg0 >> 12;
        int var6 = this.field4599 * arg2 >> 12;
        int var7 = this.field4595 * arg2 >> 12;
        class396.method2524(var4, super.field6456, var6, var5, -587094489, var7);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIILae;II)V", line = 40)
    public static final void method2105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, int arg7, int arg8) {
        ++field4590;
        class9 var9 = (class9) class137.method847(arg2, arg4, arg7);
        if (var9 != null) {
            class88 var10 = class374.method2382(var9.method71((byte) -96), false);
            int var11 = 3 & var9.method68(arg5 ^ -117);
            int var12 = var9.method69(-5944);
            if (var10.field1075 != -1) {
                class105.method580(arg1, arg8, arg6, var11, (byte) -125, var10);
            } else {
                int var13 = arg3;
                if (var10.field998 > 0) {
                    var13 = arg0;
                }
                if (~var12 == -1 || var12 == 2) {
                    if (~var11 == -1) {
                        arg6.method821(-94, arg8, arg1, 4, var13);
                    } else if (var11 != 1) {
                        if (~var11 == -3) {
                            arg6.method821(-126, arg8, arg1 + 3, 4, var13);
                        } else if (var11 == 3) {
                            arg6.method826((byte) -82, 4, arg1, arg8 + 3, var13);
                        }
                    } else {
                        arg6.method826((byte) -82, 4, arg1, arg8, var13);
                    }
                }
                if (var12 == 3) {
                    if (~var11 == -1) {
                        arg6.method827(arg8, arg1, 1, -126, 1, var13);
                    } else if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                arg6.method827(arg8 + 3, arg1, 1, -100, 1, var13);
                            }
                        } else {
                            arg6.method827(arg8 + 3, arg1 - -3, 1, -87, 1, var13);
                        }
                    } else {
                        arg6.method827(arg8, arg1 - -3, 1, -98, 1, var13);
                    }
                }
                if (var12 == 2) {
                    if (~var11 == -1) {
                        arg6.method826((byte) -82, 4, arg1, arg8, var13);
                    } else if (~var11 != -2) {
                        if (var11 == 2) {
                            arg6.method826((byte) -82, 4, arg1, arg8 + 3, var13);
                        } else if (~var11 == -4) {
                            arg6.method821(-102, arg8, arg1, 4, var13);
                        }
                    } else {
                        arg6.method821(-94, arg8, arg1 + 3, 4, var13);
                    }
                }
            }
        }
        class9 var14 = (class9) class159.method1013(arg2, arg4, arg7, field4607 != null ? field4607 : (field4607 = method2108("vl")));
        if (var14 != null) {
            class88 var15 = class374.method2382(var14.method71((byte) -50), false);
            int var16 = 3 & var14.method68(123);
            int var17 = var14.method69(arg5 ^ 5940);
            if (var15.field1075 == -1) {
                if (var17 == 9) {
                    int var18 = -1118482;
                    if (~var15.field998 < -1) {
                        var18 = -1179648;
                    }
                    if (~var16 != -1 && var16 != 2) {
                        arg6.method822(arg1 - -3, arg8 - -3, arg8, arg1, 122, var18);
                    } else {
                        arg6.method822(arg1 + 3, arg8, arg8 - -3, arg1, arg5 ^ 88, var18);
                    }
                }
            } else {
                class105.method580(arg1, arg8, arg6, var16, (byte) -121, var15);
            }
        }
        if (arg5 != -4) {
            field4598 = 107L;
        }
        class9 var19 = (class9) class327.method2118(arg2, arg4, arg7);
        if (var19 != null) {
            class88 var20 = class374.method2382(var19.method71((byte) -39), false);
            int var21 = 3 & var19.method68(124);
            if (var20.field1075 != -1) {
                class105.method580(arg1, arg8, arg6, var21, (byte) -125, var20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZII)V", line = 182)
    public static final void method2106(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field4604;
        int var6 = -arg5 + arg0;
        int var7 = -arg4 + arg2;
        if (~var6 != -1) {
            if (var7 == 0) {
                class404.method2582(arg0, arg5, arg1, false, arg4);
            } else if (!arg3) {
                int var8 = (var7 << 12) / var6;
                int var9 = arg4 - (arg5 * var8 >> 12);
                int var10;
                int var11;
                if (arg5 >= class81.field946) {
                    if (~class235.field3295 <= ~arg5) {
                        var10 = arg4;
                        var11 = arg5;
                    } else {
                        var10 = (class235.field3295 * var8 >> 12) + var9;
                        var11 = class235.field3295;
                    }
                } else {
                    var10 = (class81.field946 * var8 >> 12) + var9;
                    var11 = class81.field946;
                }
                int var12;
                int var13;
                if (~class81.field946 >= ~arg0) {
                    if (class235.field3295 < arg0) {
                        var12 = class235.field3295;
                        var13 = (class235.field3295 * var8 >> 12) + var9;
                    } else {
                        var12 = arg0;
                        var13 = arg2;
                    }
                } else {
                    var12 = class81.field946;
                    var13 = var9 - -(class81.field946 * var8 >> 12);
                }
                if (~var10 <= ~class388.field5464) {
                    if (class219.field3080 < var10) {
                        var11 = (-var9 + class219.field3080 << 12) / var8;
                        var10 = class219.field3080;
                    }
                } else {
                    var10 = class388.field5464;
                    var11 = (-var9 + class388.field5464 << 12) / var8;
                }
                if (~var13 > ~class388.field5464) {
                    var12 = (-var9 + class388.field5464 << 12) / var8;
                    var13 = class388.field5464;
                } else if (~var13 < ~class219.field3080) {
                    var13 = class219.field3080;
                    var12 = (-var9 + class219.field3080 << 12) / var8;
                }
                class128.method794(-113, arg1, var12, var13, var10, var11);
            }
        } else {
            if (~var7 != -1) {
                class117.method725(arg4, arg5, 255, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V", line = 285)
    public final void method259(int arg0, byte arg1, int arg2) {
        ++field4597;
        if (arg1 != 12) {
            this.field4599 = -27;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIII)V", line = 303)
    public class323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4595 = arg3;
        this.field4603 = arg0;
        this.field4591 = arg2;
        this.field4599 = arg1;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V", line = 315)
    public final void method260(int arg0, int arg1, int arg2) {
        ++field4592;
        int var4 = this.field4603 * arg1 >> 12;
        int var5 = this.field4591 * arg1 >> 12;
        int var6 = this.field4599 * arg2 >> 12;
        int var7 = this.field4595 * arg2 >> 12;
        class2.method12(true, super.field6458, super.field6456, var6, var7, var4, super.field6457, var5);
        int var8 = -13 % ((arg0 - -78) / 40);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 335)
    public static void method2107(int arg0) {
        field4606 = null;
        if (arg0 == -7216) {
            field4602 = null;
        }
    }
}
