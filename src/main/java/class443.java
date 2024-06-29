import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class443 extends class383 {

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "[B")
    public byte[] field6356;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field6362 = 0;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Lc;")
    public static class123 field6354;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "Llf;")
    public static class159 field6361;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "Lrk;")
    public static class25 field6357;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V")
    public static final void method2616(String arg0, String arg1, int arg2, boolean arg3, String arg4, int arg5) {
        class515.method3076(null, arg4, arg0, -1, arg1, arg2, (byte) -58, arg5);
        field6358++;
        if (arg3) {
            field6354 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lhs;FIFFIFFI[BIII)V")
    public static final void method2617(class215 arg0, float arg1, int arg2, float arg3, float arg4, int arg5, float arg6, float arg7, int arg8, byte[] arg9, int arg10, int arg11, int arg12) {
        field6355++;
        if (arg2 != -3495) {
            field6357 = null;
        }
        for (int var13 = 0; var13 < arg8; var13++) {
            class383.method2167(arg10, arg7, arg12, arg9, arg0, var13, arg11, arg6, arg3, arg5, arg1, arg8, arg4, -26706);
            arg5 += arg10 * arg11;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)I")
    public static final int method2618(byte arg0, int arg1) {
        field6360++;
        if (arg0 != -6) {
            method2616(null, null, 34, true, null, 4);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBI)I")
    public static final int method2619(int arg0, byte arg1, int arg2) {
        int var3 = 72 / ((arg1 - 64) / 55);
        field6359++;
        int var4 = arg2 >>> 31;
        return (arg2 + var4) / arg0 - var4;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([B)V")
    public class443(byte[] arg0) {
        this.field6356 = arg0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method2620(int arg0) {
        field6361 = null;
        field6354 = null;
        if (arg0 != 27499) {
            field6362 = -63;
        }
        field6357 = null;
    }
}
