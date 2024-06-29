import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class174 {

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "[J")
    private long[] field2521 = new long[8];

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    private int field2528 = 0;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "[J")
    private long[] field2526 = new long[8];

    @OriginalMember(owner = "client!aba", name = "o", descriptor = "[J")
    private long[] field2532 = new long[8];

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "[J")
    private long[] field2530 = new long[8];

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    private int field2523 = 0;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "[B")
    private byte[] field2525 = new byte[64];

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "[B")
    private byte[] field2535 = new byte[32];

    @OriginalMember(owner = "client!aba", name = "v", descriptor = "[J")
    private long[] field2539 = new long[8];

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2519 = new BigInteger("ccad585be67402e8adefadad45ff284c50e9ba1f8d7e4bf7c50f452ad50ed5f14d6692072b565aa9dcd1e9c60c88290577d33472ca4698f94f1f716863fb3937", 16);

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "Lqe;")
    public static class465 field2524 = new class465(22, -2);

    @OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
    public static int field2540 = 104;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "F")
    public static float field2527;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "Lah;")
    public static class382 field2537;

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "Ljava/lang/Thread;")
    public static Thread field2538;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public static void method1266(int arg0) {
        if (arg0 != 8) {
            field2538 = null;
        }
        field2519 = null;
        field2537 = null;
        field2538 = null;
        field2524 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IJ[B)V")
    public final void method1267(int arg0, long arg1, byte[] arg2) {
        field2529++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        if (arg0 != -20403) {
            this.method1271(true);
        }
        int var7 = this.field2523 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field2535[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field2535[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field2525[this.field2528] = (byte) class164.method1221(this.field2525[this.field2528], var15 >>> var7);
            this.field2528++;
            this.field2523 += 8 - var7;
            if (this.field2523 == 512) {
                this.method1271(true);
                this.field2523 = this.field2528 = 0;
            }
            this.field2525[this.field2528] = (byte) class555.method3246(255, var15 << 8 - var7);
            arg1 -= 8L;
            var5++;
            this.field2523 += var7;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field2525[this.field2528] = (byte) class164.method1221(this.field2525[this.field2528], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg1 < 8L) {
            this.field2523 = (int) ((long) this.field2523 + arg1);
            return;
        }
        long var13 = arg1 - (long) (8 - var7);
        this.field2523 += 8 - var7;
        this.field2528++;
        if (this.field2523 == 512) {
            this.method1271(true);
            this.field2523 = this.field2528 = 0;
        }
        this.field2525[this.field2528] = (byte) class555.method3246(255, var12 << 8 - var7);
        this.field2523 += (int) var13;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "([BBI)V")
    public final void method1268(byte[] arg0, byte arg1, int arg2) {
        if (arg1 != 37) {
            method1266(-40);
        }
        field2522++;
        this.field2525[this.field2528] = (byte) class164.method1221(this.field2525[this.field2528], 0x80 >>> class555.method3246(7, this.field2523));
        this.field2528++;
        if (this.field2528 > 32) {
            while (this.field2528 < 64) {
                this.field2525[this.field2528++] = 0;
            }
            this.method1271(true);
            this.field2528 = 0;
        }
        while (this.field2528 < 32) {
            this.field2525[this.field2528++] = 0;
        }
        class622.method3597(this.field2535, 0, this.field2525, 32, 32);
        this.method1271(true);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field2532[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public final void method1269(int arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field2535[var2] = 0;
        }
        if (arg0 != -1) {
            field2519 = null;
        }
        field2533++;
        this.field2523 = this.field2528 = 0;
        this.field2525[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field2532[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (class156.field2337 <= arg4 && arg1 <= class612.field8854 && arg2 >= class558.field7940 && class748.field10458 >= arg3) {
            if (arg0 == 1) {
                class320.method2063(arg3, arg1, arg5, arg2, arg4, 2);
            } else {
                class196.method1372(arg1, arg5, 4146, arg4, arg2, arg3, arg0);
            }
        } else if (arg0 == 1) {
            class407.method2497(0, arg1, arg3, arg2, arg5, arg4);
        } else {
            class512.method3059(arg3, arg4, 255, arg5, arg0, arg1, arg2);
        }
        field2520++;
        if (arg6 != -106) {
            method1266(-19);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V")
    private final void method1271(boolean arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field2521[var2] = class182.method1304(class182.method1304(class362.method2256(255L, (long) this.field2525[var3 + 6]) << 8, class182.method1304(class182.method1304(class362.method2256(255L, (long) this.field2525[var3 + 4]) << 24, class182.method1304(class362.method2256((long) this.field2525[var3 + 3] << 32, 0xFFL << 32), class182.method1304(class182.method1304(class362.method2256((long) this.field2525[var3 + 1] << 48, 0xFFL << 48), (long) this.field2525[var3] << 56), class362.method2256(0xFFL << 40, (long) this.field2525[var3 + 2] << 40)))), class362.method2256(255L, (long) this.field2525[var3 + 5]) << 16)), class362.method2256((long) this.field2525[var3 + 7], 255L));
            var3 += 8;
            var2++;
        }
        field2534++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field2539[var4] = class182.method1304(this.field2521[var4], this.field2526[var4] = this.field2532[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field2530[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field2530[var7] = class182.method1304(this.field2530[var7], class680.field9582[var13][class555.method3246(255, (int) (this.field2526[class555.method3246(7, var7 - var13)] >>> var14))]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field2526[var8] = this.field2530[var8];
            }
            this.field2526[0] = class182.method1304(this.field2526[0], class680.field9581[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field2530[var9] = this.field2526[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field2530[var9] = class182.method1304(this.field2530[var9], class680.field9582[var11][class555.method3246((int) (this.field2539[class555.method3246(7, var9 - var11)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field2539[var10] = this.field2530[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field2532[var6] = class182.method1304(this.field2532[var6], class182.method1304(this.field2539[var6], this.field2521[var6]));
        }
        if (!arg0) {
            this.method1267(70, -16L, null);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjda;Ljda;)V")
    public static final void method1272(int arg0, class224 arg1, class224 arg2) {
        if (arg2.field3202 != null) {
            arg2.method1553(11);
        }
        field2536++;
        arg2.field3202 = arg1;
        arg2.field3201 = arg1.field3201;
        arg2.field3202.field3201 = arg2;
        if (arg0 < 90) {
            method1272(-93, null, null);
        }
        arg2.field3201.field3202 = arg2;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)V")
    public static final void method1273(int arg0, int arg1, int arg2) {
        field2518++;
        class354 var3 = class501.method3012(arg0, arg1, arg1 ^ 0x7FE951A6);
        var3.method2222(-63);
        var3.field4990 = arg2;
    }
}
