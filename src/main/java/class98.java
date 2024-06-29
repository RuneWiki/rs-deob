import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lwd;")
    public static class150 field2247 = class2.method9(true, "Die Verbindung konnte");

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2246 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lwd;")
    public static class150 field2241 = class2.method9(true, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lwd;")
    public static class150 field2248 = class2.method9(true, "(X100(U(Y");

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2249 = 0;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lwd;")
    public static class150 field2250 = class2.method9(true, "(Udns");

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lqd;")
    public static class114 field2239;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lwb;")
    public static class148 field2240;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lhb;")
    public static class51 field2238;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Z")
    public static boolean field2243;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)I")
    public static final int method679(byte arg0, int arg1, int arg2) {
        class130 var3 = (class130) class126.field2920.method534((byte) -116, (long) arg1);
        field2244++;
        if (var3 == null) {
            return -1;
        } else {
            int var4 = -42 % ((66 - arg0) / 40);
            return arg2 >= 0 && arg2 < var3.field3071.length ? var3.field3071[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILwb;IIZI)V")
    public static final void method680(int arg0, int arg1, int arg2, class148 arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg4 >= 0 && arg4 < 104 && arg7 >= 0 && arg7 < 104) {
            class131.field3097[arg1][arg4][arg7] = 0;
            while (true) {
                int var8 = arg3.method1137(255);
                if (var8 == 0) {
                    if (arg1 == 0) {
                        class121.field2789[0][arg4][arg7] = -class116.method810((byte) -118, arg4 + arg2 + 932731, arg5 + 556238 + arg7) * 8;
                    } else {
                        class121.field2789[arg1][arg4][arg7] = class121.field2789[arg1 - 1][arg4][arg7] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg3.method1137(255);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg1 == 0) {
                        class121.field2789[0][arg4][arg7] = -var9 * 8;
                    } else {
                        class121.field2789[arg1][arg4][arg7] = class121.field2789[arg1 - 1][arg4][arg7] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class43.field1195[arg1][arg4][arg7] = arg3.method1124(8);
                    class37.field1022[arg1][arg4][arg7] = (byte) ((var8 - 2) / 4);
                    class111.field2559[arg1][arg4][arg7] = (byte) class94.method667(arg0 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class131.field3097[arg1][arg4][arg7] = (byte) (var8 - 49);
                } else {
                    class11.field281[arg1][arg4][arg7] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg3.method1137(255);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg3.method1137(255);
                    break;
                }
                if (var10 <= 49) {
                    arg3.method1137(255);
                }
            }
        }
        field2245++;
        if (arg6) {
            method681((byte) -101);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method681(byte arg0) {
        if (arg0 >= -71) {
            field2238 = null;
        }
        field2241 = null;
        field2240 = null;
        field2238 = null;
        field2248 = null;
        field2239 = null;
        field2247 = null;
        field2250 = null;
    }
}
