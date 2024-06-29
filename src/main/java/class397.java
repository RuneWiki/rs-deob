import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class397 extends class28 {

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lrh;")
    public class59 field5665 = new class59();

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Leo;")
    public static class147 field5668;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lpq;")
    public static class159 field5664;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[Ld;")
    public static class176[] field5666;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLvu;)V")
    public static final void method2351(byte arg0, class184 arg1) {
        arg1.field2268 = null;
        field5669++;
        if (arg0 != -75) {
            method2351((byte) 43, null);
        }
        if (class597.field8172 < 20) {
            class267.field3664.method2216(4, arg1);
            class597.field8172++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIZ)V")
    public static final void method2352(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            class49.field662++;
            class236.method1461(120);
        }
        field5671++;
        int var3 = 31 % ((arg1 + 17) / 62);
        if (arg0) {
            class593.field8138++;
            class634.method3457(-120);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method2353(boolean arg0) {
        field5664 = null;
        field5666 = null;
        if (!arg0) {
            method2354(78, 75, -1, 17, -123, -66, -32, 89);
        }
        field5668 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -22726) {
            method2353(false);
        }
        if (class398.field5676 <= arg0 && arg7 <= class298.field3995 && class609.field8313 <= arg2 && class19.field169 >= arg5) {
            class471.method2651(-31998, arg2, arg3, arg5, arg6, arg4, arg7, arg0);
        } else {
            class335.method2141(arg6, arg5, arg7, arg0, arg2, arg3, -257, arg4);
        }
        field5670++;
    }
}
