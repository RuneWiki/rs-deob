import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class15 extends class513 {

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "Lam;")
    public class55 field204;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "J")
    public static long field203 = -1L;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lwp;")
    public static final class527 method78(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class527 var4 = var3.field537;
            var3.field537 = null;
            class481.method2836(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 != -1) {
            field201 = -88;
        }
        field202++;
        if (!class393.method2393(arg7, arg4)) {
            return;
        }
        if (class13.field185[arg7] == null) {
            client.method2682(class491.field6599[arg7], -1, arg1, arg2, arg3, arg5, arg11, arg9, arg6, arg10, arg0, arg8);
        } else {
            client.method2682(class13.field185[arg7], -1, arg1, arg2, arg3, arg5, arg11, arg9, arg6, arg10, arg0, arg8);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lam;)V")
    public class15(class55 arg0) {
        this.field204 = arg0;
    }
}
