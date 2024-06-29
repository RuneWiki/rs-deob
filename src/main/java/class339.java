import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class339 extends class335 {

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field5298 = 32768;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Z")
    public static boolean field5305 = false;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Llj;")
    public static class5 field5299;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "[[[B")
    public static byte[][][] field5307;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 3)
    public class339() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method149(int arg0, int arg1) {
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        field5309++;
        if (this.field5233.field2467) {
            int[] var4 = this.method2330(arg0, true, 1);
            int[] var5 = this.method2330(arg0, true, 2);
            for (int var6 = 0; var6 < class105.field1630; var6++) {
                int var7 = (var4[var6] & 0xFF6) >> 4;
                int var8 = var5[var6] * this.field5298 >> 12;
                int var9 = class128.field2009[var7] * var8 >> 12;
                int var10 = class288.field4490[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + arg0 & class227.field3597;
                int var12 = var6 + (var10 >> 12) & class244.field3906;
                int[] var13 = this.method2330(var11, true, 0);
                var3[var6] = var13[var12];
            }
        }
        if (arg1 != 621) {
            this.method381(46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 58)
    public static final void method2354(int arg0) {
        if (arg0 != 2) {
            method2354(108);
        }
        field5306++;
        class257.method1766(arg0 + 114, false);
        System.gc();
        class88.method640(25, (byte) 49);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BJ)V", line = 72)
    public static final void method2355(byte arg0, long arg1) {
        field5295++;
        if (arg0 != 82 || arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class336.field5253; var3++) {
            if (class337.field5277[var3] == arg1) {
                class336.field5253--;
                class81.field1275++;
                for (int var4 = var3; var4 < class336.field5253; var4++) {
                    class337.field5277[var4] = class337.field5277[var4 + 1];
                    class54.field910[var4] = class54.field910[var4 + 1];
                    class281.field4346[var4] = class281.field4346[var4 + 1];
                }
                class161.field2423 = class291.field4524;
                class106.field1642.method753(122, 178);
                class106.field1642.method1125(8473, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)I", line = 114)
    public static final int method2356(int arg0, int arg1, int arg2) {
        field5304++;
        int var3 = class295.method2009(arg0 - 1, 256, arg1 - 1) - (-class295.method2009(arg0 + 1, 256, arg1 - 1) - class295.method2009(arg0 - 1, 256, arg1 + 1) - class295.method2009(arg0 + 1, 256, arg1 + 1));
        int var4 = class295.method2009(arg0 - 1, 256, arg1) + class295.method2009(arg0 + 1, 256, arg1) + class295.method2009(arg0, 256, arg1 + -1) + class295.method2009(arg0, 256, arg1 - -1);
        int var5 = class295.method2009(arg0, 256, arg1);
        return arg2 >= -124 ? 9 : var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[[I", line = 140)
    public final int[][] method249(int arg0, byte arg1) {
        field5308++;
        if (arg1 != 51) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[] var4 = this.method2330(arg0, true, 1);
            int[] var5 = this.method2330(arg0, true, 2);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class105.field1630; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field5298 >> 12;
                int var12 = class288.field4490[var10] * var11 >> 12;
                int var13 = class128.field2009[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class244.field3906;
                int var15 = (var13 >> 12) + arg0 & class227.field3597;
                int[][] var16 = this.method2328(var15, false, 0);
                var8[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILwb;JLwb;Lwb;)V", line = 197)
    public static final void method2357(int arg0, int arg1, int arg2, int arg3, class253 arg4, long arg5, class253 arg6, class253 arg7) {
        class34 var9 = new class34();
        var9.field523 = arg4;
        var9.field513 = arg1 * 128 + 64;
        var9.field526 = arg2 * 128 + 64;
        var9.field532 = arg3;
        var9.field531 = arg5;
        var9.field516 = arg6;
        var9.field520 = arg7;
        int var10 = 0;
        class142 var11 = class256.field4013[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2204; var12++) {
                class26 var13 = var11.field2197[var12];
                if ((var13.field402 & 0x400000L) == 4194304L) {
                    int var14 = var13.field406.method76();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field517 = -var10;
        if (class256.field4013[arg0][arg1][arg2] == null) {
            class256.field4013[arg0][arg1][arg2] = new class142(arg0, arg1, arg2);
        }
        class256.field4013[arg0][arg1][arg2].field2215 = var9;
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V", line = 240)
    public static void method2358(int arg0) {
        if (arg0 >= -124) {
            field5299 = (class5) null;
        }
        field5307 = (byte[][][]) null;
        field5299 = null;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V", line = 258)
    public final void method381(int arg0) {
        class117.method865(10);
        int var2 = -91 / ((44 - arg0) / 35);
        field5300++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)Ltk;", line = 275)
    public static final class45 method2359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = ((long) arg2 & 0xFFFFL) << 16 | ((long) arg4 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | (long) arg0 & 0xFFFFL;
        field5297++;
        if (arg3 != 12637) {
            method2355((byte) -13, -10L);
        }
        class45 var7 = (class45) class130.field2035.method2179(false, var5);
        if (var7 != null) {
            return var7;
        }
        class280 var8 = class307.method2100((byte) 0, arg0);
        class266[] var9 = null;
        if (var8.field4306 != null) {
            var9 = new class266[var8.field4306.length];
            for (int var10 = 0; var10 < var9.length; var10++) {
                class97 var11 = class304.method2075(104, var8.field4306[var10]);
                var9[var10] = new class266(var11.field1544, var11.field1548, var11.field1552, var11.field1551, var11.field1545, var11.field1547, var11.field1541, var11.field1543);
            }
        }
        class45 var12 = new class45(var8.field4310, var9, var8.field4308, arg4, arg1, arg2);
        class130.field2035.method2173(var12, true, var5);
        return var12;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILkh;I)V", line = 329)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field5298 = arg1.method1151(-112) << 4;
        } else if (arg0 == 1) {
            this.field5234 = arg1.method1178(0) == 1;
        }
        field5302++;
        if (arg2 < 51) {
            field5307 = (byte[][][]) ((byte[][][]) null);
        }
    }
}
