import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class296 extends class46 {

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    private final int field5059;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    private final int field5046;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    private final int field5049;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    private final int field5054;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    private final int field5057;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    private final int field5062;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    private final int field5048;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    private final int field5063;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field5052 = 0;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "[S")
    public static short[] field5060 = new short[] { 38, 39, 47, 40, 9, 32, 10, 18 };

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Llf;")
    public static class299 field5047;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method301(int arg0, byte arg1, int arg2) {
        field5058++;
        if (arg1 != -13) {
            return;
        }
        int var4 = this.field5059 * arg0 >> 12;
        int var5 = this.field5048 * arg2 >> 12;
        int var6 = this.field5049 * arg0 >> 12;
        int var7 = this.field5062 * arg2 >> 12;
        int var8 = this.field5054 * arg0 >> 12;
        int var9 = this.field5046 * arg2 >> 12;
        int var10 = this.field5057 * arg2 >> 12;
        int var11 = this.field5063 * arg0 >> 12;
        class288.method1968(var8, this.field687, var7, var11, var6, var5, var4, 23316, var9, var10);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method2004(boolean arg0) {
        if (class291.field4939[96]) {
            class159.field2557 += (-class159.field2557 - 24) / 2;
        } else if (class291.field4939[97]) {
            class159.field2557 += (24 - class159.field2557) / 2;
        } else {
            class159.field2557 /= 2;
        }
        field5050++;
        class267.field4516 += class159.field2557 / 2;
        int var1 = class268.field4551.field3821 + class230.field4003;
        int var2 = class292.field4956 + class268.field4551.field3814;
        if ((class2.field24 - var1) < -500 || (class2.field24 - var1) > 500 || class170.field2769 - var2 < -500 || class170.field2769 - var2 > 500) {
            class2.field24 = var1;
            class170.field2769 = var2;
        }
        if (class170.field2769 != var2) {
            class170.field2769 += (var2 - class170.field2769) / 16;
        }
        if (class291.field4939[98]) {
            class182.field2897 += (12 - class182.field2897) / 2;
        } else if (class291.field4939[99]) {
            class182.field2897 += (-class182.field2897 - 12) / 2;
        } else {
            class182.field2897 /= 2;
        }
        class20.field208 += class182.field2897 / 2;
        if (class2.field24 != var1) {
            class2.field24 += (var1 - class2.field24) / 16;
        }
        if (arg0) {
            field5061 = -51;
        }
        class236.method1662((byte) 96);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 83)
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5059 = arg0;
        this.field5046 = arg7;
        this.field5049 = arg2;
        this.field5054 = arg4;
        this.field5057 = arg5;
        this.field5062 = arg3;
        this.field5048 = arg1;
        this.field5063 = arg6;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lmh;", line = 101)
    public static final class62 method2005(int arg0, int arg1) {
        field5055++;
        class62 var2 = new class62();
        var2.field893 = 0;
        if (arg1 != -1757618132) {
            field5061 = -6;
        }
        var2.field906 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 115)
    public static void method2006(int arg0) {
        field5060 = null;
        if (arg0 == 18) {
            field5047 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZI)V", line = 138)
    public final void method298(int arg0, boolean arg1, int arg2) {
        field5056++;
        if (arg1) {
            field5060 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V", line = 163)
    public final void method297(int arg0, int arg1, int arg2) {
        if (arg2 != 31462) {
            field5061 = -87;
        }
        field5053++;
    }
}
