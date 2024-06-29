import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class196 implements class79 {

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lil;")
    private class68 field2469 = new class68(128);

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    private int[] field2460 = new int[class659.field9342.field289];

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
    public int[] field2467 = new int[class659.field9342.field289];

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2458 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)V", line = 3)
    public final void method1180(boolean arg0, int arg1, int arg2) {
        field2464++;
        if (!arg0) {
            method1187(113, null, -10, 127);
        }
        this.field2467[arg2] = arg1;
        class689 var4 = (class689) this.field2469.method399(-32748, (long) arg2);
        if (var4 == null) {
            class689 var5 = new class689(class571.method3150(102) + 500L);
            this.field2469.method402(var5, (byte) -36, (long) arg2);
        } else {
            var4.field9769 = class571.method3150(101) + 500L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V", line = 32)
    public final void method1181(int arg0, int arg1, int arg2) {
        field2465++;
        class683 var4 = class452.field5800.method3564((byte) 126, arg0);
        if (arg2 > -34) {
            this.field2467 = null;
        }
        int var5 = var4.field9593;
        int var6 = var4.field9594;
        int var7 = var4.field9592;
        int var8 = class683.field9600[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1182(var5, 0, ~var9 & this.field2460[var5] | arg1 << var6 & var9);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I", line = 62)
    public final int method466(int arg0, int arg1) {
        field2459++;
        int var3 = -80 / ((arg1 + 27) / 62);
        return this.field2467[arg0];
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V", line = 72)
    public final void method1182(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field2469 = null;
        }
        this.field2460[arg0] = arg2;
        field2466++;
        class689 var4 = (class689) this.field2469.method399(-32748, (long) arg0);
        if (var4 == null) {
            class689 var5 = new class689(4611686018427387905L);
            this.field2469.method402(var5, (byte) -85, (long) arg0);
        } else if (var4.field9769 != 4611686018427387905L) {
            var4.field9769 = class571.method3150(120) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I", line = 99)
    public final int method465(int arg0, int arg1) {
        field2457++;
        if (arg0 < 111) {
            return 124;
        }
        class683 var3 = class452.field5800.method3564((byte) 126, arg1);
        int var4 = var3.field9593;
        int var5 = var3.field9594;
        int var6 = var3.field9592;
        int var7 = class683.field9600[var6 - var5];
        return var7 & this.field2467[var4] >> var5;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(III)V", line = 122)
    public final void method1183(int arg0, int arg1, int arg2) {
        field2462++;
        class683 var4 = class452.field5800.method3564((byte) 126, arg0);
        int var5 = var4.field9593;
        if (arg2 != 16383) {
            return;
        }
        int var6 = var4.field9594;
        int var7 = var4.field9592;
        int var8 = class683.field9600[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1180(true, arg1 << var6 & var9 | ~var9 & this.field2467[var5], var5);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 155)
    public final void method1184(int arg0) {
        for (int var2 = 0; var2 < class659.field9342.field289; var2++) {
            class239 var3 = class659.field9342.method125(var2, true);
            if (var3 != null && var3.field2989 == 0) {
                this.field2460[var2] = 0;
                this.field2467[var2] = 0;
            }
        }
        if (arg0 != 10542) {
            method1187(-45, null, 56, -128);
        }
        field2461++;
        this.field2469 = new class68(128);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lua;ILkp;Lla;ILjava/lang/String;IIILsa;IB)V", line = 183)
    public static final void method1185(class600 arg0, int arg1, class507 arg2, class413 arg3, int arg4, String arg5, int arg6, int arg7, int arg8, class595 arg9, int arg10, byte arg11) {
        field2463++;
        int var12;
        if (class296.field3661 == 4) {
            var12 = (int) class331.field4223 & 0x3FFF;
        } else {
            var12 = (int) class331.field4223 + class411.field5135 & 0x3FFF;
        }
        int var13 = Math.max(arg2.field6793 / 2, arg2.field6700 / 2) + 10;
        int var14 = arg1 * arg1 + arg10 * arg10;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class453.field5810[var12];
        int var16 = class453.field5811[var12];
        if (class296.field3661 != 4) {
            var15 = var15 * 256 / (class354.field4510 + 256);
            var16 = var16 * 256 / (class354.field4510 + 256);
        }
        int var17 = arg1 * var15 + arg10 * var16 >> 14;
        int var18 = 74 / ((35 - arg11) / 45);
        int var19 = arg1 * var16 - (arg10 * var15) >> 14;
        int var20 = arg9.method3273(arg5, null, 100, -112);
        int var21 = arg9.method3278(100, 0, arg5, (byte) -62, null);
        int var22 = var17 - var20 / 2;
        if (var22 >= -arg2.field6793 && arg2.field6793 >= var22 && (-arg2.field6700) <= var19 && arg2.field6700 >= var19) {
            arg3.method2185(0, 0, arg0, var20, arg5, arg6, 1, -51, 0, 50, null, null, arg7, arg8, arg2.field6700 / 2 + arg8 - arg4 - var21 - var19, arg7 - -(arg2.field6793 / 2) + var22);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BZ)I", line = 246)
    public final int method1186(byte arg0, boolean arg1) {
        field2468++;
        long var3 = class571.method3150(109);
        int var5 = 119 / ((16 - arg0) / 46);
        for (class689 var6 = arg1 ? (class689) this.field2469.method407((byte) 124) : (class689) this.field2469.method403(12561); var6 != null; var6 = (class689) this.field2469.method403(12561)) {
            if ((var6.field9769 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var6.field9769 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field4199;
                    this.field2467[var7] = this.field2460[var7];
                    var6.method1871(-19);
                    return var7;
                }
                var6.method1871(-13);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[BII)[B", line = 284)
    public static final byte[] method1187(int arg0, byte[] arg1, int arg2, int arg3) {
        field2470++;
        byte[] var4 = new byte[arg2];
        class293.method1645(arg1, arg3, var4, 0, arg2);
        if (arg0 != -1047) {
            field2471 = 11;
        }
        return var4;
    }
}
