import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class252 {

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Ljd;")
    private static class85 field306 = class221.method1499("shake:", (byte) 86);

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Ljd;")
    private static class85 field311 = class221.method1499("Connecting to update server", (byte) 106);

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field307 = 0;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "Ljd;")
    public static class85 field314 = field306;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "Z")
    public static boolean field305 = false;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Ljd;")
    public static class85 field318 = field306;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "Ljd;")
    public static class85 field319 = field311;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lfg;")
    public static class12 field313;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Ljb;")
    public static class255 field309;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Lrh;")
    public static class44 field308;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
    public static void method148(int arg0) {
        field313 = null;
        field311 = null;
        field318 = null;
        field319 = null;
        field309 = null;
        field306 = null;
        field314 = null;
        field308 = null;
        if (arg0 != 0) {
            field308 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field312;
        if (arg1 == 0) {
            this.field316 = (arg0.method1711((byte) -67) << 12) / 255;
        }
        if (arg2 != -99) {
            field305 = true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class22() {
        this(4096);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
    private class22(int arg0) {
        super(0, true);
        this.field316 = 4096;
        this.field316 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field310;
        if (arg1 != -55) {
            this.method149(-109, (byte) 5);
        }
        int[] var3 = super.field4356.method868(arg0, (byte) 112);
        if (super.field4356.field2258) {
            class248.method1723(var3, 0, class5.field63, this.field316);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 <= 14) {
            field319 = null;
        }
        ++field315;
        if (~field308.method311((byte) 65) == -3) {
            return class7.method36(arg2, arg9, arg7, arg0, arg3, true, arg5, arg8, arg6, arg10, arg11, arg1);
        } else {
            return ~field308.method311((byte) -104) < -3 ? class134.method893(arg11, arg9, field308.method311((byte) -113), (byte) 80, arg7, arg0, arg10, arg3, arg6, arg5, arg8, arg1, arg2) : class256.method1776(arg10, arg8, arg3, arg11, arg1, arg7, arg5, arg0, arg2, -1, arg6, arg9);
        }
    }
}
