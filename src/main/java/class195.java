import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class195 {

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "Lmn;")
    private class368 field2875 = new class368();

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    private int field2870;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    private int field2883;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Leq;")
    private class213 field2871;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[Z")
    public static boolean[] field2885 = new boolean[100];

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lej;")
    public static class124 field2874 = new class124(18, 3);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "Leb;")
    public static class626 field2886;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Z")
    public static boolean field2888;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "[I")
    public static int[] field2889;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILwe;)V", line = 5)
    private final void method1386(int arg0, class408 arg1) {
        field2880++;
        long var3 = arg1.method2534((byte) 117);
        for (class338 var5 = (class338) this.field2871.method1465(var3, -6008); var5 != null; var5 = (class338) this.field2871.method1461(true)) {
            if (var5.field4762.method2535(78, arg1)) {
                this.method1390(var5, (byte) 79);
                break;
            }
        }
        if (arg0 != 7) {
            this.method1388(-127, null);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I", line = 31)
    public final int method1387(int arg0) {
        if (arg0 == 100) {
            field2869++;
            return this.field2883;
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILwe;)Ljava/lang/Object;", line = 42)
    public final Object method1388(int arg0, class408 arg1) {
        field2872++;
        long var3 = arg1.method2534((byte) 64);
        for (class338 var5 = (class338) this.field2871.method1465(var3, -6008); var5 != null; var5 = (class338) this.field2871.method1461(true)) {
            if (var5.field4762.method2535(94, arg1)) {
                Object var6 = var5.method1164(65536);
                if (var6 != null) {
                    if (var5.method1165((byte) -128)) {
                        class147 var7 = new class147(arg1, var6, var5.field4759);
                        this.field2871.method1468((byte) 125, var5.field5204, var7);
                        this.field2875.method2338(true, var7);
                        var7.field235 = 0L;
                        var5.method2314((byte) 65);
                        var5.method115(true);
                    } else {
                        this.field2875.method2338(true, var5);
                        var5.field235 = 0L;
                    }
                    return var6;
                }
                var5.method2314((byte) 36);
                var5.method115(true);
                this.field2870 += var5.field4759;
            }
        }
        if (arg0 < 66) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/Object;Lwe;II)V", line = 100)
    private final void method1389(Object arg0, class408 arg1, int arg2, int arg3) {
        if (arg2 >= -84) {
            return;
        }
        field2873++;
        if (arg3 > this.field2883) {
            throw new IllegalStateException("s>cs");
        }
        this.method1386(7, arg1);
        this.field2870 -= arg3;
        while (this.field2870 < 0) {
            class338 var6 = (class338) this.field2875.method2341(20);
            this.method1390(var6, (byte) 60);
        }
        class147 var5 = new class147(arg1, arg0, arg3);
        this.field2871.method1468((byte) 120, arg1.method2534((byte) 120), var5);
        this.field2875.method2338(true, var5);
        var5.field235 = 0L;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lrd;B)V", line = 133)
    private final void method1390(class338 arg0, byte arg1) {
        field2876++;
        if (arg1 < 51) {
            this.method1389(null, null, -110, 119);
        }
        if (arg0 != null) {
            arg0.method2314((byte) 42);
            arg0.method115(true);
            this.field2870 += arg0.field4759;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILat;II)V", line = 152)
    public static final void method1391(int arg0, class378 arg1, int arg2, int arg3) {
        class155.field2514 = arg0;
        class33.field848 = arg1;
        class344.field4821 = arg3;
        field2887++;
        if (arg2 != 1) {
            method1397((byte) 119);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 165)
    public final void method1392(byte arg0) {
        field2878++;
        for (class338 var2 = (class338) this.field2875.method2344(-87); var2 != null; var2 = (class338) this.field2875.method2336((byte) 69)) {
            if (var2.method1165((byte) 5)) {
                var2.method2314((byte) 127);
                var2.method115(true);
                this.field2870 += var2.field4759;
            }
        }
        if (arg0 > -34) {
            field2885 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V", line = 195)
    public final void method1393(byte arg0) {
        this.field2875.method2342(2110355138);
        field2884++;
        this.field2871.method1466(0);
        int var2 = 18 % ((arg0 + 89) / 35);
        this.field2870 = this.field2883;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V", line = 209)
    public final void method1394(int arg0, int arg1) {
        field2881++;
        if (class632.field8698 != null) {
            for (class338 var3 = (class338) this.field2875.method2344(-72); var3 != null; var3 = (class338) this.field2875.method2336((byte) 59)) {
                if (var3.method1165((byte) -124)) {
                    if (var3.method1164(arg0 + 67027) == null) {
                        var3.method2314((byte) 103);
                        var3.method115(true);
                        this.field2870 += var3.field4759;
                    }
                } else if (((long) arg1) < (++var3.field235)) {
                    class338 var4 = class632.field8698.method2872(-1, var3);
                    this.field2871.method1468((byte) 120, var3.field5204, var4);
                    class275.method1815(var4, var3, (byte) 63);
                    var3.method2314((byte) 70);
                    var3.method115(true);
                }
            }
        }
        if (arg0 != -1491) {
            this.method1390(null, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIFFIFII)[F", line = 257)
    public static final float[] method1395(int arg0, int arg1, float arg2, float arg3, int arg4, float arg5, int arg6, int arg7) {
        field2882++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        int var11 = -94 / ((arg4 - 57) / 62);
        float var12 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[6] = -var12;
        float var13 = 1.0F - var10;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[2] = var12;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[7] = 0.0F;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = 0.0F;
        float var18 = 1.0F - var16;
        float var19 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var20 = (float) Math.sqrt((double) (arg0 * arg0 + arg6 * arg6));
        if (var20 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var15 = (float) (-arg0) / var20;
                var17 = (float) arg6 / var20;
            }
            var14[5] = var15 * var19;
            var14[2] = var15 * var17 * var18;
            var14[8] = var17 * var17 * var18 + var16;
            var14[4] = var16;
            var14[0] = var15 * var15 * var18 + var16;
            var14[6] = var15 * var17 * var18;
            var14[3] = -var17 * var19;
            var14[1] = var17 * var19;
            var14[7] = -var15 * var19;
            var9[0] = var8[2] * var14[6] + var8[0] * var14[0] + var8[1] * var14[3];
            var9[1] = var8[2] * var14[7] + var8[1] * var14[4] + var8[0] * var14[1];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[3] = var8[5] * var14[6] + var8[3] * var14[0] + var8[4] * var14[3];
            var9[4] = var8[5] * var14[7] + var8[3] * var14[1] + var8[4] * var14[4];
            var9[6] = var8[8] * var14[6] + var8[6] * var14[0] + var8[7] * var14[3];
            var9[5] = var8[5] * var14[8] + var8[4] * var14[5] + var8[3] * var14[2];
            var9[7] = var8[8] * var14[7] + var8[6] * var14[1] + var8[7] * var14[4];
            var9[8] = var8[8] * var14[8] + var8[7] * var14[5] + var8[6] * var14[2];
        }
        var9[7] *= arg2;
        var9[4] *= arg5;
        var9[3] *= arg5;
        var9[5] *= arg5;
        var9[2] *= arg3;
        var9[8] *= arg2;
        var9[6] *= arg2;
        var9[1] *= arg3;
        var9[0] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/Object;Lwe;)V", line = 340)
    public final void method1396(int arg0, Object arg1, class408 arg2) {
        field2877++;
        this.method1389(arg1, arg2, -114, 1);
        if (arg0 <= 62) {
            this.field2875 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V", line = 354)
    public static void method1397(byte arg0) {
        field2889 = null;
        field2886 = null;
        field2885 = null;
        field2874 = null;
        if (arg0 > -103) {
            field2885 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)I", line = 368)
    public final int method1398(byte arg0) {
        int var2 = -9 % ((73 - arg0) / 53);
        field2879++;
        return this.field2870;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V", line = 390)
    public class195(int arg0) {
        this.field2870 = arg0;
        this.field2883 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2871 = new class213(var2);
    }
}
