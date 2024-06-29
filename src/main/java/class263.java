import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public abstract class class263 extends class278 {

    @OriginalMember(owner = "client!vi", name = "Fb", descriptor = "[[B")
    public byte[][] field4282 = new byte[256][];

    @OriginalMember(owner = "client!vi", name = "Jb", descriptor = "Lck;")
    public static class119 field4286 = class298.method1987((byte) 92, "mapfunction");

    @OriginalMember(owner = "client!vi", name = "zb", descriptor = "I")
    public static int field4276 = 0;

    @OriginalMember(owner = "client!vi", name = "Ib", descriptor = "Lck;")
    public static class119 field4285 = class298.method1987((byte) 73, "welle2:");

    @OriginalMember(owner = "client!vi", name = "Eb", descriptor = "Lck;")
    private static class119 field4281 = class298.method1987((byte) 51, "Loading fonts )2 ");

    @OriginalMember(owner = "client!vi", name = "Cb", descriptor = "[S")
    public static short[] field4279 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!vi", name = "Kb", descriptor = "Lck;")
    public static class119 field4287 = field4281;

    @OriginalMember(owner = "client!vi", name = "yb", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!vi", name = "Ab", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!vi", name = "Bb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!vi", name = "Db", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!vi", name = "Hb", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "Lde;")
    public static class191 field4274;

    @OriginalMember(owner = "client!vi", name = "Gb", descriptor = "Lva;")
    public static class36 field4283;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII)V", line = 10)
    public final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 + (class286.field4719 * arg2);
        int var8 = class286.field4719 - arg3;
        field4284++;
        int var9 = 0;
        int var10 = 0;
        if (class286.field4724 > arg2) {
            int var11 = class286.field4724 - arg2;
            var7 += class286.field4719 * var11;
            var10 += arg3 * var11;
            arg2 = class286.field4724;
            arg4 -= var11;
        }
        if (class286.field4722 < (arg2 + arg4)) {
            arg4 -= arg2 + arg4 - class286.field4722;
        }
        if (class286.field4723 > arg1) {
            int var12 = class286.field4723 - arg1;
            arg1 = class286.field4723;
            var10 += var12;
            var9 += var12;
            var7 += var12;
            arg3 -= var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class286.field4720) {
            int var13 = arg1 + arg3 - class286.field4720;
            var8 += var13;
            arg3 -= var13;
            var9 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class174.method1110(var9, 3, var10, var7, arg3, arg4, class286.field4718, var8, this.field4282[arg0], arg5);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)Z", line = 65)
    public static final boolean method1701(int arg0, int arg1) {
        field4275++;
        if (arg0 != -104) {
            field4286 = (class119) null;
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 76)
    public class263(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4282 = arg5;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 95)
    public static void method1702(byte arg0) {
        int var1 = 28 % ((-arg0 - 53) / 58);
        field4285 = null;
        field4286 = null;
        field4274 = null;
        field4287 = null;
        field4279 = null;
        field4283 = null;
        field4281 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V", line = 108)
    public class263(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIII)V", line = 116)
    public final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4278++;
        int var8 = class286.field4719 * arg2 + arg1;
        int var9 = 0;
        int var10 = 0;
        int var11 = class286.field4719 - arg3;
        if (arg2 < class286.field4724) {
            int var12 = class286.field4724 - arg2;
            var8 += class286.field4719 * var12;
            var10 += arg3 * var12;
            arg4 -= var12;
            arg2 = class286.field4724;
        }
        if ((arg2 + arg4) > class286.field4722) {
            arg4 -= arg2 + arg4 - class286.field4722;
        }
        if (arg1 < class286.field4723) {
            int var13 = class286.field4723 - arg1;
            var11 += var13;
            var10 += var13;
            arg1 = class286.field4723;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (class286.field4720 < arg1 + arg3) {
            int var14 = arg1 + arg3 - class286.field4720;
            var11 += var14;
            arg3 -= var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class78.method548(var9, arg4, var10, var11, class286.field4718, arg3, var8, arg5, this.field4282[arg0], arg6, -100);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V", line = 172)
    public static final void method1703(int arg0, int arg1, int arg2) {
        class277.field4548[arg2] = arg0;
        field4277++;
        int var3 = 119 % ((-arg1 - 9) / 53);
        class164 var4 = (class164) class23.field356.method1329((byte) 90, (long) arg2);
        if (var4 == null) {
            class164 var5 = new class164(4611686018427387905L);
            class23.field356.method1326((long) arg2, (byte) -123, var5);
        } else if (var4.field2581 != 4611686018427387905L) {
            var4.field2581 = class110.method707((byte) 123) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)I", line = 203)
    public static final int method1704(int arg0, byte arg1) {
        if (arg0 != 16711935) {
            field4281 = (class119) null;
        }
        field4280++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 - 71;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 52 - 48;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else if (arg1 == 47) {
            return 63;
        } else if (arg1 == 45) {
            return 63;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIII)V", line = 266)
    public static final void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class169 var8 = new class169();
        var8.field2658 = arg2 / 128;
        var8.field2669 = arg3 / 128;
        var8.field2673 = arg4 / 128;
        var8.field2667 = arg5 / 128;
        var8.field2676 = arg1;
        var8.field2675 = arg2;
        var8.field2671 = arg3;
        var8.field2659 = arg4;
        var8.field2664 = arg5;
        var8.field2665 = arg6;
        var8.field2668 = arg7;
        class206.field3287[arg0][class206.field3273[arg0]++] = var8;
    }
}
