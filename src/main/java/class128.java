import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class128 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Z")
    public static boolean field2255 = false;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    public static int[] field2252 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static final void method932(byte arg0) {
        field2253++;
        class129.field2272.method294(0);
        class5.field68.method294(0);
        if (arg0 != -106) {
            method934(true, -4, (class288) null, 0, (class288) null);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static void method933(boolean arg0) {
        field2252 = null;
        if (arg0) {
            field2255 = false;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILli;ILli;)I")
    public static final int method934(boolean arg0, int arg1, class288 arg2, int arg3, class288 arg4) {
        field2257++;
        if (arg3 == 1) {
            int var5 = arg2.field919;
            int var6 = arg4.field919;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return arg2.method1970(false).field783.method639(-125, arg4.method1970(false).field783);
        } else if (arg1 != 2001) {
            return 67;
        } else if (arg3 == 3) {
            if (arg2.field5152.method667(class227.field4066, (byte) -111)) {
                if (arg4.field5152.method667(class227.field4066, (byte) -124)) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field5152.method667(class227.field4066, (byte) -107)) {
                return arg0 ? 1 : -1;
            } else {
                return arg2.field5152.method639(arg1 - 2129, arg4.field5152);
            }
        } else if (arg3 == 4) {
            if (arg2.method314(-936)) {
                return arg4.method314(-936) ? 0 : 1;
            } else if (arg4.method314(arg1 ^ 0xFFFFFB89)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg2.method305(-105)) {
                return arg4.method305(127) ? 0 : 1;
            } else if (arg4.method305(127)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg2.method313(12281)) {
                return arg4.method313(12281) ? 0 : 1;
            } else if (arg4.method313(arg1 + 10280)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 7) {
            return arg2.field5140 - arg4.field5140;
        } else if (arg2.method312(0)) {
            return arg4.method312(arg1 - 2001) ? 0 : 1;
        } else if (arg4.method312(0)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)Lge;")
    public static final class70 method935(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        return var3 == null ? null : var3.field643;
    }
}
