import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class392 extends class524 {

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "I")
    public int field5769;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "Z")
    public static boolean field5766 = true;

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BIIIII)V")
    public static final void method2465(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class479.field6682 >= arg4 && class58.field1150 <= arg3) {
            boolean var6;
            if (arg5 < class140.field2314) {
                arg5 = class140.field2314;
                var6 = false;
            } else if (arg5 <= class536.field7419) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class536.field7419;
            }
            boolean var7;
            if (class140.field2314 > arg1) {
                arg1 = class140.field2314;
                var7 = false;
            } else if (arg1 > class536.field7419) {
                arg1 = class536.field7419;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg4 < class58.field1150) {
                arg4 = class58.field1150;
            } else {
                class47.method550(-27, arg1, class691.field9345[arg4++], arg5, arg2);
            }
            if (arg3 <= class479.field6682) {
                class47.method550(-27, arg1, class691.field9345[arg3--], arg5, arg2);
            } else {
                arg3 = class479.field6682;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg3; var8++) {
                    int[] var9 = class691.field9345[var8];
                    var9[arg5] = var9[arg1] = arg2;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg3; var11++) {
                    class691.field9345[var11][arg5] = arg2;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg3; var10++) {
                    class691.field9345[var10][arg1] = arg2;
                }
            }
        }
        if (arg0 <= 57) {
            method2468((byte) -97, null, null);
        }
        field5765++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2466(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        field5767++;
        if (arg0 < 116) {
            this.field5769 = -10;
        }
        return class186.field2801;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBLin;)Lmi;")
    public static final class496 method2467(int arg0, byte arg1, class91 arg2) {
        field5768++;
        class496 var3 = (class496) class488.field6758.method992((long) arg0, -68);
        int var4 = -86 / ((55 - arg1) / 51);
        if (var3 == null) {
            if (class87.field1560) {
                var3 = class272.field3822.method356(class267.method1771(arg2, arg0), true);
            } else {
                var3 = class533.method3071(arg2.method868((byte) 73, arg0), -5901);
            }
            class488.field6758.method991(var3, (long) arg0, (byte) -108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLjava/lang/Object;Lwea;)V")
    public static final void method2468(byte arg0, Object arg1, class158 arg2) {
        field5770++;
        if (arg2.field2547 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -42) {
            method2468((byte) 95, null, null);
        }
        while (var3 < 50 && arg2.field2547.peekEvent() != null) {
            class700.method3916((byte) 30, 1L);
            var3++;
        }
        try {
            if (arg1 != null) {
                arg2.field2547.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lsd;Lec;IIIIIIIIIIIIII)V")
    public class392(class95 arg0, class236 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field5769 = arg15;
    }
}
