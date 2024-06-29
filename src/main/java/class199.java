import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class199 {

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "[I")
    public int[] field2515 = new int[4];

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "B")
    public byte field2518;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "[I")
    public int[] field2511;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "[I")
    public int[] field2523;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "B")
    public byte field2524;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "S")
    public short field2520;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "S")
    public short field2525;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "S")
    public short field2512;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "S")
    public short field2517;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "[S")
    public short[] field2513;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "[S")
    public short[] field2519;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "[S")
    public short[] field2522;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "Z")
    public static boolean field2516 = true;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "Lrga;")
    public static class280 field2521 = new class280(74, 4);

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public static int field2527 = 0;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "[I")
    public static int[] field2528 = new int[14];

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "Ltb;")
    public static class450 field2526 = new class450(32);

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "Lfh;")
    public static class266 field2529 = new class266(12, 19);

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "Z")
    public static boolean field2530 = false;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 13)
    public static void method1204(int arg0) {
        field2529 = null;
        field2521 = null;
        field2528 = null;
        field2526 = null;
        if (arg0 != 0) {
            method1204(-56);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILbfa;)I", line = 30)
    public static final int method1205(int arg0, class145 arg1) {
        field2514++;
        String var2 = class425.method2255(arg1, arg0 ^ 0x629C);
        int[] var3 = null;
        if (class497.method2674(arg1.field1873, (byte) 20)) {
            var3 = class633.field8881.method434(12388, (int) arg1.field1865).field80;
        } else if (arg1.field1866 != -1) {
            var3 = class633.field8881.method434(12388, arg1.field1866).field80;
        } else if (class605.method3316(-1, arg1.field1873)) {
            class206 var6 = (class206) class180.field2318.method399(-32748, (long) ((int) arg1.field1865));
            if (var6 != null) {
                class307 var7 = var6.field2618;
                class586 var8 = var7.field3902;
                if (var8.field8205 != null) {
                    var8 = var8.method3220(-4261, class684.field9606);
                }
                if (var8 != null) {
                    var3 = var8.field8200;
                }
            }
        } else if (class556.method3060(arg1.field1873, 21922)) {
            Object var4 = null;
            class441 var5;
            if (arg1.field1873 == 1008) {
                var5 = class428.field5352.method3138((byte) 125, (int) arg1.field1865);
            } else {
                var5 = class428.field5352.method3138((byte) 33, (int) (arg1.field1865 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field5574 != null) {
                var5 = var5.method2355(class684.field9606, -1643);
            }
            if (var5 != null) {
                var3 = var5.field5510;
            }
        }
        if (var3 != null) {
            var2 = var2 + class531.method2880(var3, (byte) 126);
        }
        int var9 = class546.field7269.method3271(class478.field6077, var2, 111);
        if (arg0 != 25322) {
            method1205(36, null);
        }
        if (arg1.field1864) {
            var9 += class600.field8418.method167() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 119)
    public class199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field2518 = (byte) arg0;
        this.field2511 = new int[4];
        this.field2523 = new int[4];
        this.field2524 = (byte) arg1;
        this.field2523[0] = arg2;
        this.field2523[1] = arg3;
        this.field2523[2] = arg4;
        this.field2523[3] = arg5;
        this.field2511[0] = arg6;
        this.field2511[3] = arg9;
        this.field2511[2] = arg8;
        this.field2511[1] = arg7;
        this.field2515[1] = arg11;
        this.field2515[0] = arg10;
        this.field2520 = (short) (arg2 >> class52.field775);
        this.field2515[2] = arg12;
        this.field2515[3] = arg13;
        this.field2525 = (short) (arg4 >> class52.field775);
        this.field2512 = (short) (arg10 >> class52.field775);
        this.field2517 = (short) (arg12 >> class52.field775);
        this.field2513 = new short[4];
        this.field2519 = new short[4];
        this.field2522 = new short[4];
    }
}
