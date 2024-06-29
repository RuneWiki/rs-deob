import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Z")
    public static boolean field40 = true;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lsi;")
    public static class204 field39;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
    public static final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class174 var7 = new class174();
        var7.field2844 = arg1 / 128;
        var7.field2830 = arg2 / 128;
        var7.field2842 = arg3 / 128;
        var7.field2821 = arg4 / 128;
        var7.field2822 = arg0;
        var7.field2828 = arg1;
        var7.field2824 = arg2;
        var7.field2835 = arg3;
        var7.field2839 = arg4;
        var7.field2827 = arg5;
        var7.field2840 = arg6;
        class250.field4153[class191.field3083++] = var7;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BILlc;)Lmj;")
    public static final class115 method27(byte arg0, int arg1, class86 arg2) {
        if (arg0 != 68) {
            method27((byte) -28, 70, (class86) null);
        }
        field38++;
        return class149.method1060(arg1, arg0 ^ 0x26, arg2) ? class187.method1392(-123) : null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method28(boolean arg0) {
        if (arg0) {
            method27((byte) 60, -10, (class86) null);
        }
        field39 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Z")
    public static final boolean method29(int arg0, int arg1, int arg2) {
        int var3 = class260.field4255[arg0][arg1][arg2];
        if (-class200.field3209 == var3) {
            return false;
        } else if (class200.field3209 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class77.method565(var4 + 1, class220.field3533[arg0][arg1][arg2], var5 + 1) && class77.method565(var4 + 128 - 1, class220.field3533[arg0][arg1 + 1][arg2], var5 + 1) && class77.method565(var4 + 128 - 1, class220.field3533[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class77.method565(var4 + 1, class220.field3533[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class260.field4255[arg0][arg1][arg2] = class200.field3209;
                return true;
            } else {
                class260.field4255[arg0][arg1][arg2] = -class200.field3209;
                return false;
            }
        }
    }
}
