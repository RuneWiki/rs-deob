import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class297 {

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field144;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Lgn;")
    public static class475 field146;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "F")
    public static float field142;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field145;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field147;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "[I")
    public static int[] field143;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public final void method69(int arg0) {
        int var2 = -6 % ((arg0 - 61) / 55);
        this.field144.method2520();
        field141++;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public static void method70(int arg0) {
        int var1 = -121 % ((arg0 - 22) / 58);
        field143 = null;
        field146 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        this.field144 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg7) {
            return;
        }
        field145++;
        if (arg0 < 0 || arg4 < 0 || (class362.field5442 - 1) <= arg0 || class203.field2813 - 1 <= arg4) {
            return;
        }
        if (class358.field5312 == null) {
            return;
        }
        if (arg3 == 0) {
            class113 var8 = (class113) class478.method2795(arg6, arg0, arg4);
            class113 var9 = (class113) class452.method2630(arg6, arg0, arg4);
            if (var8 != null && arg1 != 2) {
                if ((var8 instanceof class437)) {
                    ((class437) var8).field6398.method8(false, arg2);
                } else {
                    class399.method2382(arg0, -113, arg1, arg3, arg4, arg5, var8.method369((byte) 106), arg2, arg6);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class437)) {
                    class399.method2382(arg0, -51, arg1, arg3, arg4, arg5, var9.method369((byte) 83), arg2, arg6);
                    return;
                }
                ((class437) var9).field6398.method8(false, arg2);
                return;
            }
            return;
        }
        if (arg3 != 1) {
            if (arg3 == 2) {
                class113 var11 = (class113) class124.method701(arg6, arg0, arg4, field147 == null ? (field147 = method72("sq")) : field147);
                if (var11 == null) {
                    return;
                }
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (!(var11 instanceof class131)) {
                    class399.method2382(arg0, 112, arg1, arg3, arg4, arg5, var11.method369((byte) 53), arg2, arg6);
                    return;
                }
                ((class131) var11).field1660.method8(false, arg2);
            } else if (arg3 == 3) {
                class113 var10 = (class113) class79.method515(arg6, arg0, arg4);
                if (var10 != null) {
                    if (var10 instanceof class145) {
                        ((class145) var10).field1878.method8(false, arg2);
                        return;
                    }
                    class399.method2382(arg0, -50, arg1, arg3, arg4, arg5, var10.method369((byte) 117), arg2, arg6);
                    return;
                }
            }
            return;
        }
        class113 var12 = (class113) class305.method1832(arg6, arg0, arg4);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class62)) {
            int var13 = var12.method369((byte) 28);
            if (arg1 != 4 && arg1 != 5) {
                if (arg1 == 6) {
                    class399.method2382(arg0, -34, 4, arg3, arg4, arg5 + 4, var13, arg2, arg6);
                } else if (arg1 == 7) {
                    class399.method2382(arg0, 117, 4, arg3, arg4, (arg5 + 2 & 0x3) + 4, var13, arg2, arg6);
                    return;
                } else if (arg1 == 8) {
                    class399.method2382(arg0, 104, 4, arg3, arg4, arg5 + 4, var13, arg2, arg6);
                    class399.method2382(arg0, 88, 4, arg3, arg4, (arg5 + 2 & 0x3) + 4, var13, arg2, arg6);
                    return;
                }
                return;
            }
            class399.method2382(arg0, 120, 4, arg3, arg4, arg5, var13, arg2, arg6);
            return;
        }
        ((class62) var12).field912.method8(false, arg2);
        return;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method72(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class194("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field146 = new class475(64, -1);
    }
}
