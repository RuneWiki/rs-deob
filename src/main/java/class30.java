import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class30 extends class85 {

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "[B")
    public byte[] field503;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public static int field501 = 0;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "[I")
    public static int[] field500 = new int[32];

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "[Z")
    public static boolean[] field506 = new boolean[8];

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "[Lhk;")
    public static class268[] field505;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIIB)V", line = 9)
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field502++;
        if (arg7 >= -121) {
            field505 = null;
        }
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class459.field6419 - class471.field6891) * var8 / 100 + class471.field6891;
        int var10 = arg3 * var9 >> 8;
        int var11 = 16384 - arg6 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class21.field385[var11] * -var10 >> 15;
            var15 = class21.field397[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class21.field385[var12] * var15 >> 15;
            var15 = class21.field397[var12] * var15 >> 15;
        }
        class261.field3319 = arg2;
        class74.field927 = 0;
        class291.field3724 = arg0 - var15;
        class299.field3885 = arg5 - var13;
        class430.field5935 = arg6;
        class53.field730 = arg4 - var14;
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)V", line = 64)
    public static void method207(byte arg0) {
        field505 = null;
        field506 = null;
        if (arg0 >= -55) {
            field506 = null;
        }
        field500 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([B)V", line = 75)
    public class30(byte[] arg0) {
        this.field503 = arg0;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)V", line = 83)
    public static final void method208(int arg0, int arg1) {
        field504++;
        class436 var2 = class459.method2712(4, arg0, -1759243680);
        if (arg1 != -1) {
            method208(94, 62);
        }
        var2.method2567(16013);
    }
}
