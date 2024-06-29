import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class109 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    public static int[] field2112 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Z")
    public static boolean field2115 = false;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "J")
    public static volatile long field2116 = 0L;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lcj;")
    public static class28 field2117;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lpc;")
    public static class29 field2119;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Z")
    public static boolean field2118;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)I")
    public static final int method738(int arg0, byte arg1) {
        field2114++;
        if (arg1 < 37) {
            method739(-109);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method739(int arg0) {
        if (arg0 != 0) {
            method739(56);
        }
        field2112 = null;
        field2119 = null;
        field2117 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)[B")
    public abstract byte[] method440(int arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public static final void method740(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2113++;
        if (arg0 != 1) {
            method739(-15);
        }
        if (arg1 >= arg2) {
            class194.method1266(arg2, (byte) -17, arg3, class15.field183[arg4], arg1);
        } else {
            class194.method1266(arg1, (byte) -17, arg3, class15.field183[arg4], arg2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BZ)V")
    public abstract void method441(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public static int method741(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Lmk;")
    public static final class127 method742(int arg0, int arg1, int arg2) {
        class16 var3 = class110.field2124[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class127 var4 = var3.field212;
            var3.field212 = null;
            return var4;
        }
    }
}
