import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class285 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lmh;")
    public static class128 field4889 = class22.method156(123, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lmh;")
    public static class128 field4894 = class22.method156(122, "mapfunction");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lvd;")
    public class127 field4892;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Ljm;")
    public class226 field4893;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
    public static int[] field4890;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILdj;I)Z", line = 5)
    public static final boolean method1972(int arg0, class314 arg1, int arg2) {
        if (arg2 > -127) {
            method1974(-115, -5, -19, 102, 74, (class270) null);
        }
        field4888++;
        byte[] var3 = arg1.method2162(arg0, -2);
        if (var3 == null) {
            return false;
        } else {
            class188.method1261(var3, (byte) 55);
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1973(boolean arg0) {
        field4889 = null;
        if (!arg0) {
            field4894 = null;
            field4890 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIILcb;)Ljava/awt/Frame;", line = 59)
    public static final Frame method1974(int arg0, int arg1, int arg2, int arg3, int arg4, class270 arg5) {
        field4887++;
        if (!arg5.method1899(arg4 - 125)) {
            return null;
        }
        if (arg0 == 0) {
            class264[] var6 = class188.method1260(0, arg5);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4572 == arg1 && var6[var8].field4585 == arg3 && (arg2 == 0 || var6[var8].field4575 == arg2) && (!var7 || var6[var8].field4576 > arg0)) {
                    arg0 = var6[var8].field4576;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class23 var9 = arg5.method1900(arg1, arg3, arg0, arg4 ^ 0xFFFFFF9F, arg2);
        while (var9.field560 == 0) {
            class177.method1213(0, 10L);
        }
        Frame var10 = (Frame) var9.field562;
        if (var10 == null) {
            return null;
        } else if (arg4 != -1) {
            return (Frame) null;
        } else if (var9.field560 == 2) {
            class77.method498(arg5, 100, var10);
            return null;
        } else {
            return var10;
        }
    }
}
