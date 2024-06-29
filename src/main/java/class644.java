import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class644 extends class469 {

    @OriginalMember(owner = "client!eca", name = "C", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!eca", name = "G", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!eca", name = "H", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "Loca;")
    public static class220 field9387;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eca", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field9390;

    // $FF: synthetic method
    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3722(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method3718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= -119) {
            method3718(12, 122, 61, -6, 31, -96, 8, -42);
        }
        ++field9388;
        if (arg3 >= 0 && arg1 >= 0 && arg3 < class106.field1289 + -1 && class422.field5452 + -1 > arg1) {
            if (class383.field5070 == null) {
                return;
            }
            if (arg4 != 0) {
                if (arg4 == 1) {
                    class269 var8 = (class269) class31.method181(arg6, arg3, arg1);
                    if (var8 != null) {
                        if (!(var8 instanceof class365)) {
                            int var9 = var8.method342(-2329);
                            if (~arg5 != -5 && arg5 != 5) {
                                if (~arg5 == -7) {
                                    class577.method3361(arg6, 34336, arg4, arg0 + 4, 4, arg3, var9, arg1, arg7);
                                    return;
                                }
                                if (~arg5 != -8) {
                                    if (~arg5 == -9) {
                                        class577.method3361(arg6, 34336, arg4, arg0 + 4, 4, arg3, var9, arg1, arg7);
                                        class577.method3361(arg6, 34336, arg4, (3 & arg0 + 2) + 4, 4, arg3, var9, arg1, arg7);
                                        return;
                                    }
                                } else {
                                    class577.method3361(arg6, 34336, arg4, (3 & arg0 - -2) + 4, 4, arg3, var9, arg1, arg7);
                                }
                                return;
                            }
                            class577.method3361(arg6, 34336, arg4, arg0, 4, arg3, var9, arg1, arg7);
                            return;
                        }
                        ((class365) var8).field4803.method3666((byte) 112, arg7);
                        return;
                    }
                } else if (arg4 != 2) {
                    if (arg4 == 3) {
                        class269 var10 = (class269) class543.method3171(arg6, arg3, arg1);
                        if (var10 != null) {
                            if (var10 instanceof class59) {
                                ((class59) var10).field578.method3666((byte) 112, arg7);
                                return;
                            }
                            class577.method3361(arg6, 34336, arg4, arg0, arg5, arg3, var10.method342(-2329), arg1, arg7);
                            return;
                        }
                    }
                } else {
                    class269 var11 = (class269) class198.method1072(arg6, arg3, arg1, field9390 != null ? field9390 : (field9390 = method3722("fp")));
                    if (var11 == null) {
                        return;
                    }
                    if (~arg5 == -12) {
                        arg5 = 10;
                    }
                    if (!(var11 instanceof class473)) {
                        class577.method3361(arg6, 34336, arg4, arg0, arg5, arg3, var11.method342(-2329), arg1, arg7);
                        return;
                    }
                    ((class473) var11).field6621.method3666((byte) 112, arg7);
                }
                return;
            }
            class269 var12 = (class269) class19.method124(arg6, arg3, arg1);
            class269 var13 = (class269) class136.method760(arg6, arg3, arg1);
            if (var12 != null && arg5 != 2) {
                if (var12 instanceof class479) {
                    ((class479) var12).field6727.method3666((byte) 112, arg7);
                } else {
                    class577.method3361(arg6, 34336, arg4, arg0, arg5, arg3, var12.method342(-2329), arg1, arg7);
                }
            }
            if (var13 != null) {
                if (!(var13 instanceof class479)) {
                    class577.method3361(arg6, 34336, arg4, arg0, arg5, arg3, var13.method342(-2329), arg1, arg7);
                    return;
                }
                ((class479) var13).field6727.method3666((byte) 112, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILpq;II)Ljava/awt/Frame;", line = 128)
    public static final Frame method3719(int arg0, int arg1, int arg2, class165 arg3, int arg4, int arg5) {
        ++field9389;
        if (!arg3.method905(683)) {
            return null;
        } else {
            if (arg5 == 0) {
                class536[] var6 = class486.method2823(0, arg3);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (~var6[var8].field7519 == ~arg4 && var6[var8].field7514 == arg2 && (~arg1 == -1 || var6[var8].field7515 == arg1) && (!var7 || var6[var8].field7522 > arg5)) {
                        var7 = true;
                        arg5 = var6[var8].field7522;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class506 var9 = arg3.method923((byte) 73, arg2, arg5, arg1, arg4);
            while (~var9.field7031 == -1) {
                class462.method2688(10L, (byte) 110);
            }
            Frame var10 = (Frame) var9.field7030;
            if (var10 == null) {
                return null;
            } else {
                if (arg0 != -2193) {
                    method3721((class483) null, 124, 110, -107, (boolean[]) null);
                }
                if (~var9.field7031 == -3) {
                    class643.method3703(arg3, var10, (byte) 98);
                    return null;
                } else {
                    return var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "(I)V", line = 200)
    public static void method3720(int arg0) {
        field9387 = null;
        if (arg0 != 3) {
            method3719(-125, 56, 45, (class165) null, -34, -115);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lk;III[Z)Z", line = 211)
    public static final boolean method3721(class483 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class370.field4884 != class128.field1574) {
            int var6 = class90.field1114[arg1].method847(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class174 var8 = class90.field1114[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method847(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method851(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method848(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII)V", line = 246)
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            this.method509(17, 113, -11, -112);
        }
        super.field6558 = arg2;
        super.field6554 = arg3;
        ++field9384;
        super.field6556 = arg0;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(IIIIIF)V", line = 262)
    public class644(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IF)V", line = 268)
    public final void method506(int arg0, float arg1) {
        ++field9386;
        super.field6557 = arg1;
        if (arg0 != -1) {
            field9387 = null;
        }
    }
}
