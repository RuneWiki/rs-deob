import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class165 extends class66 {

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "[S")
    private static short[] field2769 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "[S")
    private static short[] field2773 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "[S")
    private static short[] field2778 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "[S")
    private static short[] field2775 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "[[S")
    public static short[][] field2768 = new short[][] { field2769, field2773, field2778, field2775 };

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
    public static int field2779 = 2;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "Lim;")
    public static class531 field2781;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "Loo;")
    public class580 field2776;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "Lrl;")
    public class672 field2777;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cw", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field2782;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public static void method1334(byte arg0) {
        field2778 = null;
        field2781 = null;
        field2773 = null;
        field2775 = null;
        if (arg0 > -11) {
            field2775 = null;
        }
        field2769 = null;
        field2768 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2774++;
        if (arg0 >= 0 && arg3 >= 0 && arg0 < class275.field4426 - 1 && arg3 < class417.field6374 - 1) {
            if (class454.field6818 == null) {
                return;
            }
            if (arg5 == 0) {
                class302 var8 = (class302) class681.method3880(arg6, arg0, arg3);
                class302 var9 = (class302) class677.method3869(arg6, arg0, arg3);
                if (var8 != null && arg1 != 2) {
                    if ((var8 instanceof class436)) {
                        ((class436) var8).field6630.method3658(124, arg2);
                    } else {
                        class700.method3952(arg1, 114, arg0, arg7, arg2, arg6, arg5, var8.method394((byte) -83), arg3);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class436) {
                        ((class436) var9).field6630.method3658(114, arg2);
                    } else {
                        class700.method3952(arg1, 85, arg0, arg7, arg2, arg6, arg5, var9.method394((byte) -87), arg3);
                    }
                }
            } else if (arg5 == 1) {
                class302 var12 = (class302) class351.method2360(arg6, arg0, arg3);
                if (var12 != null) {
                    if (var12 instanceof class695) {
                        ((class695) var12).field9733.method3658(126, arg2);
                    } else {
                        int var13 = var12.method394((byte) -101);
                        if (arg1 == 4 || arg1 == 5) {
                            class700.method3952(4, 40, arg0, arg7, arg2, arg6, arg5, var13, arg3);
                        } else if (arg1 == 6) {
                            class700.method3952(4, 57, arg0, arg7 + 4, arg2, arg6, arg5, var13, arg3);
                        } else if (arg1 == 7) {
                            class700.method3952(4, 62, arg0, (arg7 + 2 & 0x3) + 4, arg2, arg6, arg5, var13, arg3);
                        } else if (arg1 == 8) {
                            class700.method3952(4, 39, arg0, arg7 + 4, arg2, arg6, arg5, var13, arg3);
                            class700.method3952(4, 101, arg0, (arg7 + 2 & 0x3) + 4, arg2, arg6, arg5, var13, arg3);
                        }
                    }
                }
            } else if (arg5 == 2) {
                class302 var11 = (class302) class618.method3589(arg6, arg0, arg3, field2782 == null ? (field2782 = method1338("ofa")) : field2782);
                if (var11 != null) {
                    if (arg1 == 11) {
                        arg1 = 10;
                    }
                    if ((var11 instanceof class208)) {
                        ((class208) var11).field3472.method3658(122, arg2);
                    } else {
                        class700.method3952(arg1, 83, arg0, arg7, arg2, arg6, arg5, var11.method394((byte) 107), arg3);
                    }
                }
            } else if (arg5 == 3) {
                class302 var10 = (class302) class643.method3728(arg6, arg0, arg3);
                if (var10 != null) {
                    if (var10 instanceof class299) {
                        ((class299) var10).field4659.method3658(117, arg2);
                    } else {
                        class700.method3952(arg1, 121, arg0, arg7, arg2, arg6, arg5, var10.method394((byte) -82), arg3);
                    }
                }
            }
        }
        if (arg4 < 41) {
            field2769 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIII)V")
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2770++;
        int var6 = arg0 - arg1;
        int var7 = arg2 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class80.method766(arg1, arg4, arg0, arg5, (byte) -123);
            }
        } else if (var6 == 0) {
            class437.method2773(arg2, 32767, arg1, arg4, arg5);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                int var10 = arg2;
                arg4 = arg1;
                arg2 = arg0;
                arg1 = var9;
                arg0 = var10;
            }
            if (arg2 < arg4) {
                int var11 = arg4;
                int var12 = arg1;
                arg4 = arg2;
                arg2 = var11;
                arg1 = arg0;
                arg0 = var12;
            }
            if (arg3 > 83) {
                int var13 = arg1;
                int var14 = arg2 - arg4;
                int var15 = arg0 - arg1;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg0 > arg1 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg4; var18 <= arg2; var18++) {
                        var16 += var15;
                        class39.field527[var18][var13] = arg5;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg4; var19 <= arg2; var19++) {
                        var16 += var15;
                        class39.field527[var13][var19] = arg5;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public final void method1337(int arg0) {
        field2780++;
        if (arg0 == -1 && class149.field2476 < class462.field6902.length) {
            class462.field6902[class149.field2476++] = this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1338(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
