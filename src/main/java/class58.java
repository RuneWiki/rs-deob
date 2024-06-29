import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class58 extends class662 {

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "[Z")
    public static boolean[] field743 = new boolean[100];

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field745;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field746;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method502(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 4)
    public static void method498(int arg0) {
        field743 = null;
        if (arg0 != 0) {
            field743 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIBIILoa;I)V", line = 20)
    public static final void method500(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class650 arg7, int arg8) {
        field744++;
        class310 var9 = (class310) class593.method3281(arg6, arg8, arg3);
        if (var9 != null) {
            class687 var10 = class232.field3017.method2358(0, var9.method131((byte) -97));
            int var11 = var9.method139((byte) 90) & 0x3;
            int var12 = var9.method138(8470);
            if (var10.field9376 == -1) {
                int var13 = arg1;
                if (var10.field9382 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method3626(0, 4, var13, arg2, arg0);
                    } else if (var11 == 1) {
                        arg7.method3634(var13, 4, arg2, arg0, arg4 ^ 0xFFFF4EAF);
                    } else if (var11 == 2) {
                        arg7.method3626(0, 4, var13, arg2 + 3, arg0);
                    } else if (var11 == 3) {
                        arg7.method3634(var13, 4, arg2, arg0 + 3, 45365);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method3630((byte) -94, 1, arg0, arg2, var13, 1);
                    } else if (var11 == 1) {
                        arg7.method3630((byte) -80, 1, arg0, arg2 + 3, var13, 1);
                    } else if (var11 == 2) {
                        arg7.method3630((byte) 81, 1, arg0 + 3, arg2 + 3, var13, 1);
                    } else if (var11 == 3) {
                        arg7.method3630((byte) -111, 1, arg0 + 3, arg2, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method3634(var13, 4, arg2, arg0, 45365);
                    } else if (var11 == 1) {
                        arg7.method3626(0, 4, var13, arg2 + 3, arg0);
                    } else if (var11 == 2) {
                        arg7.method3634(var13, 4, arg2, arg0 + 3, 45365);
                    } else if (var11 == 3) {
                        arg7.method3626(arg4 ^ 0xFFFFFF9A, 4, var13, arg2, arg0);
                    }
                }
            } else {
                class82.method631(var11, arg2, var10, arg0, arg7, 24808);
            }
        }
        class310 var14 = (class310) class513.method2796(arg6, arg8, arg3, field746 == null ? (field746 = method502("pba")) : field746);
        if (var14 != null) {
            class687 var15 = class232.field3017.method2358(arg4 ^ 0xFFFFFF9A, var14.method131((byte) -97));
            int var16 = var14.method139((byte) 77) & 0x3;
            int var17 = var14.method138(8470);
            if (var15.field9376 != -1) {
                class82.method631(var16, arg2, var15, arg0, arg7, arg4 + 24910);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field9382 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method3632(arg2, arg0 + 3, arg2 - -3, var18, false, arg0);
                } else {
                    arg7.method3632(arg2, arg0, arg2 + 3, var18, false, arg0 + 3);
                }
            }
        }
        if (arg4 != -102) {
            field745 = 115;
        }
        class310 var19 = (class310) class618.method3444(arg6, arg8, arg3);
        if (var19 == null) {
            return;
        }
        class687 var20 = class232.field3017.method2358(arg4 ^ 0xFFFFFF9A, var19.method131((byte) -97));
        int var21 = var19.method139((byte) 118) & 0x3;
        if (var20.field9376 != -1) {
            class82.method631(var21, arg2, var20, arg0, arg7, arg4 + 24910);
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z", line = 161)
    public static final boolean method501(int arg0, int arg1, byte arg2) {
        if (arg2 < 65) {
            field745 = -103;
        }
        field742++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lgda;")
    public abstract class51 method499(int arg0);
}
