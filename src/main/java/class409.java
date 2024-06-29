import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class409 {

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field5795 = 0;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field5794 = -1;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "Lvk;")
    public static class337 field5796;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZIIZI)V")
    public static final void method2470(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class679.field9735 = arg1;
        class473.field6626 = arg4;
        class48.field818 = arg6;
        class452.field6354 = arg3;
        if (arg5) {
            return;
        }
        class451.field6341 = arg0;
        field5793++;
        if (arg2 && class452.field6354 >= 100) {
            class346.field4550 = class473.field6626 * 512 + 256;
            class627.field8995 = class451.field6341 * 512 + 256;
            class614.field8846 = class589.method3416(class346.field4550, -96, class617.field8853, class627.field8995) - class679.field9735;
        }
        class586.field8507 = 2;
        class221.field2860 = -1;
        class51.field842 = -1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static void method2471(int arg0) {
        if (arg0 == -3727) {
            field5796 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([BIIIIZ)V")
    public static final void method2472(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field5797++;
        if (arg3 >= arg4) {
            return;
        }
        int var6 = arg1 + arg3;
        int var7 = arg4 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                if (!arg5) {
                    method2472(null, -64, 108, -59, -11, true);
                }
                int var8 = arg4 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var6++] = 1;
                }
            }
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
        }
    }
}
