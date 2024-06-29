import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class404 extends class407 {

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field6237;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field6238;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIII)V")
    public final void method2589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6234;
        int var6 = -32 % ((arg2 - 1) / 40);
        int var7 = super.field6282.method1076();
        int var8 = ((class602) super.field3611).field8564 * class183.method1491(-99) / 10 % var7;
        super.field6282.method3956(-var7 + arg1 + var8, arg3, arg0 + var7 + -var8, arg4);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILpca;II)V")
    public static final void method2590(int arg0, class665 arg1, int arg2, int arg3) {
        if (arg0 != 219836194) {
            field6237 = 41;
        }
        ++field6236;
        class617 var4 = arg1.method3808(10492, class627.field8857);
        if (var4 != null) {
            class627.field8857.method352(arg2, arg3, arg1.field9411 + arg2, arg1.field9282 + arg3);
            if (class106.field1720 >= 3) {
                class627.field8857.method310(-16777216, var4, arg2, arg3);
            } else {
                class65.field834.method3964((float) arg1.field9411 / 2.0F + (float) arg2, (float) arg1.field9282 / 2.0F + (float) arg3, 4096, (int) (-class37.field514) << 2 & 65532, var4, arg2, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIILr;III)V")
    public static final void method2591(int arg0, int arg1, int arg2, int arg3, int arg4, class167 arg5, int arg6, int arg7, int arg8) {
        ++field6235;
        class302 var9 = (class302) class681.method3880(arg6, arg3, arg2);
        if (arg0 > -31) {
            field6237 = -128;
        }
        if (var9 != null) {
            class698 var10 = class213.field3537.method94(var9.method394((byte) 118), (byte) -42);
            int var11 = 3 & var9.method401((byte) 116);
            int var12 = var9.method413((byte) 11);
            if (~var10.field9793 != 0) {
                class197.method1549(var11, arg8, arg7, var10, 10678, arg5);
            } else {
                int var13 = arg4;
                if (var10.field9830 > 0) {
                    var13 = arg1;
                }
                if (~var12 == -1 || ~var12 == -3) {
                    if (~var11 != -1) {
                        if (var11 != 1) {
                            if (var11 != 2) {
                                if (var11 == 3) {
                                    arg5.method1348(var13, 4, arg8, 3, arg7 + 3);
                                }
                            } else {
                                arg5.method1347(arg8 + 3, arg7, 4, 119, var13);
                            }
                        } else {
                            arg5.method1348(var13, 4, arg8, 3, arg7);
                        }
                    } else {
                        arg5.method1347(arg8, arg7, 4, 122, var13);
                    }
                }
                if (var12 == 3) {
                    if (~var11 != -1) {
                        if (~var11 != -2) {
                            if (~var11 == -3) {
                                arg5.method1355(arg7 + 3, arg8 + 3, 1, 1, var13, 1);
                            } else if (var11 == 3) {
                                arg5.method1355(arg7 + 3, arg8, 1, 1, var13, 1);
                            }
                        } else {
                            arg5.method1355(arg7, arg8 + 3, 1, 1, var13, 1);
                        }
                    } else {
                        arg5.method1355(arg7, arg8, 1, 1, var13, 1);
                    }
                }
                if (~var12 == -3) {
                    if (var11 == 0) {
                        arg5.method1348(var13, 4, arg8, 3, arg7);
                    } else if (var11 == 1) {
                        arg5.method1347(arg8 + 3, arg7, 4, 118, var13);
                    } else if (~var11 == -3) {
                        arg5.method1348(var13, 4, arg8, 3, arg7 - -3);
                    } else if (var11 == 3) {
                        arg5.method1347(arg8, arg7, 4, 121, var13);
                    }
                }
            }
        }
        class302 var14 = (class302) class618.method3589(arg6, arg3, arg2, field6238 != null ? field6238 : (field6238 = method2592("ofa")));
        if (var14 != null) {
            class698 var15 = class213.field3537.method94(var14.method394((byte) -126), (byte) -42);
            int var16 = 3 & var14.method401((byte) 82);
            int var17 = var14.method413((byte) 11);
            if (~var15.field9793 == 0) {
                if (var17 == 9) {
                    int var18 = -1118482;
                    if (var15.field9830 > 0) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && var16 != 2) {
                        arg5.method1354(var18, arg7, arg7 + 3, -83, arg8, arg8 + 3);
                    } else {
                        arg5.method1354(var18, arg7 - -3, arg7, 103, arg8, arg8 + 3);
                    }
                }
            } else {
                class197.method1549(var16, arg8, arg7, var15, 10678, arg5);
            }
        }
        class302 var19 = (class302) class643.method3728(arg6, arg3, arg2);
        if (var19 != null) {
            class698 var20 = class213.field3537.method94(var19.method394((byte) -110), (byte) -42);
            int var21 = var19.method401((byte) 70) & 3;
            if (var20.field9793 != -1) {
                class197.method1549(var21, arg8, arg7, var20, 10678, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lri;Lri;Lbl;)V")
    public class404(class97 arg0, class97 arg1, class602 arg2) {
        super(arg0, arg1, arg2);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2592(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
