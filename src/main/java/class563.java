import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class563 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lkha;")
    public static class607 field8005 = new class607();

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field8004;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field8006;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method3269(int arg0) {
        if (arg0 >= -121) {
            field8005 = null;
        }
        field8005 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8004++;
        if (arg4 >= -48 || arg3 < 0 || arg0 < 0 || arg3 >= (class109.field1314 - 1) || (class760.field10479 - 1) <= arg0) {
            return;
        }
        if (class378.field5427 == null) {
            return;
        }
        if (arg5 != 0) {
            if (arg5 != 1) {
                if (arg5 == 2) {
                    class362 var9 = (class362) class195.method1415(arg6, arg3, arg0, field8006 == null ? (field8006 = method3271("ija")) : field8006);
                    if (var9 == null) {
                        return;
                    }
                    if (arg7 == 11) {
                        arg7 = 10;
                    }
                    if (var9 instanceof class627) {
                        ((class627) var9).field8864.method2293(arg2, -117);
                        return;
                    }
                    class437.method2633(arg7, (byte) 69, arg1, arg2, arg3, arg0, arg6, arg5, var9.method650(-54));
                } else if (arg5 == 3) {
                    class362 var8 = (class362) class728.method4087(arg6, arg3, arg0);
                    if (var8 != null) {
                        if (!(var8 instanceof class130)) {
                            class437.method2633(arg7, (byte) 69, arg1, arg2, arg3, arg0, arg6, arg5, var8.method650(-91));
                            return;
                        }
                        ((class130) var8).field1706.method2293(arg2, -91);
                        return;
                    }
                }
                return;
            }
            class362 var10 = (class362) class143.method987(arg6, arg3, arg0);
            if (var10 == null) {
                return;
            }
            if (!(var10 instanceof class91)) {
                int var11 = var10.method650(114);
                if (arg7 != 4 && arg7 != 5) {
                    if (arg7 == 6) {
                        class437.method2633(4, (byte) 69, arg1 + 4, arg2, arg3, arg0, arg6, arg5, var11);
                    } else if (arg7 == 7) {
                        class437.method2633(4, (byte) 69, (arg1 + 2 & 0x3) + 4, arg2, arg3, arg0, arg6, arg5, var11);
                        return;
                    } else if (arg7 == 8) {
                        class437.method2633(4, (byte) 69, arg1 + 4, arg2, arg3, arg0, arg6, arg5, var11);
                        class437.method2633(4, (byte) 69, (arg1 + 2 & 0x3) + 4, arg2, arg3, arg0, arg6, arg5, var11);
                        return;
                    }
                    return;
                }
                class437.method2633(4, (byte) 69, arg1, arg2, arg3, arg0, arg6, arg5, var11);
                return;
            }
            ((class91) var10).field1174.method2293(arg2, -80);
            return;
        }
        class362 var12 = (class362) class259.method1702(arg6, arg3, arg0);
        class362 var13 = (class362) class389.method2384(arg6, arg3, arg0);
        if (var12 != null && arg7 != 2) {
            if (var12 instanceof class412) {
                ((class412) var12).field5808.method2293(arg2, -92);
            } else {
                class437.method2633(arg7, (byte) 69, arg1, arg2, arg3, arg0, arg6, arg5, var12.method650(95));
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class412) {
            ((class412) var13).field5808.method2293(arg2, -128);
            return;
        }
        class437.method2633(arg7, (byte) 69, arg1, arg2, arg3, arg0, arg6, arg5, var13.method650(-76));
        return;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3271(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
