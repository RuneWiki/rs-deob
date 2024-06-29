import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class358 extends class431 implements class338 {

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "Lpe;")
    public class431 field4835;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "Lcu;")
    public static class145 field4824 = new class145(12, 8);

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "I")
    public static int field4838;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hv", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field4839;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        field4838++;
        return arg0 >= -8;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        int var2 = 4 / ((56 - arg0) / 52);
        field4837++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIII)V")
    public static final void method2089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4836++;
        for (int var6 = arg2; var6 <= arg0; var6++) {
            class427.method2465(class457.field6299[var6], arg1, arg3, -7, arg5);
        }
        if (arg4 != -1) {
            method2091(false);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        field4827++;
        if (arg0 != -7803) {
            method2090((byte) -95);
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        if (arg0 == 9124) {
            field4830++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        field4822++;
        if (!arg1) {
            field4824 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IIILpe;)V")
    public class358(int arg0, int arg1, int arg2, class431 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field4835 = arg3;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        if (arg0 == -87) {
            field4834++;
            return 0;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        if (!arg0) {
            this.field4835 = null;
        }
        field4825++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        if (arg1 == 20203) {
            field4828++;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        field4823++;
        if (arg0 != 1) {
            field4824 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            this.field4835 = null;
        }
        field4832++;
        return null;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        field4831++;
        return arg0 == 54 ? false : false;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        field4826++;
        return arg0 == -1736 ? 0 : -28;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(B)V")
    public static void method2090(byte arg0) {
        if (arg0 != -7) {
            method2089(127, 21, -61, 98, 0, -31);
        }
        field4824 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        if (arg0 == -1) {
            field4829++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -4534) {
            field4824 = null;
        }
        field4821++;
        return 0;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V")
    public static final void method2091(boolean arg0) {
        if (class216.field2911 == 2) {
            class199.field2765 = 96;
        } else {
            try {
                Method var1 = (field4839 == null ? (field4839 = method2092("java.lang.Runtime")) : field4839).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class199.field2765 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0) {
            field4824 = null;
        }
        field4833++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2092(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
