import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class235 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lil;")
    private class68 field2944 = new class68(256);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "Lil;")
    private class68 field2948 = new class68(256);

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lpl;")
    private class612 field2942;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lpl;")
    private class612 field2940;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lwp;")
    public static class453 field2938 = new class453(7, -1);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[II)Loaa;")
    private final class555 method1412(int arg0, int arg1, int[] arg2, int arg3) {
        field2937++;
        int var5 = (arg3 << 4 & 0xFFF8 | arg3 >>> 12) ^ arg0;
        int var6 = -127 / ((arg1 - 6) / 63);
        int var7 = var5 | arg3 << 16;
        long var8 = (long) var7;
        class555 var10 = (class555) this.field2948.method399(-32748, var8);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class211 var11 = class211.method1258(this.field2942, arg3, arg0);
            if (var11 == null) {
                return null;
            }
            class555 var12 = var11.method1260();
            this.field2948.method402(var12, (byte) -72, var8);
            if (arg2 != null) {
                arg2[0] -= var12.field7722.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILr;)V")
    public static final void method1413(int arg0, class566 arg1) {
        if (arg0 != 256) {
            method1413(45, null);
        }
        field2943++;
        if (class9.field186) {
            class604.method3312(false, arg1);
        } else {
            class356.method1950(arg0 - 225, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[III)Loaa;")
    private final class555 method1414(int arg0, int[] arg1, int arg2, int arg3) {
        field2947++;
        int var5 = arg3 ^ ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class555 var9 = (class555) this.field2948.method399(-32748, var7);
        if (arg0 != -432121204) {
            this.field2940 = null;
        }
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class416 var10 = (class416) this.field2944.method399(-32748, var7);
            if (var10 == null) {
                var10 = class416.method2221(this.field2940, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2944.method402(var10, (byte) -117, var7);
            }
            class555 var11 = var10.method2216(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1871(-56);
                this.field2948.method402(var11, (byte) -41, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        if (arg0 != -71) {
            method1413(-85, null);
        }
        field2938 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(FIFIIIII[FIIIF)V")
    public static final void method1416(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg6 - arg3;
        field2945++;
        int var14 = arg11 - arg1;
        int var15 = arg10 - arg9;
        if (arg7 != 8431) {
            return;
        }
        float var16 = arg8[2] * (float) var14 + arg8[1] * (float) var13 + arg8[0] * (float) var15;
        float var17 = arg8[5] * (float) var14 + arg8[4] * (float) var13 + arg8[3] * (float) var15;
        float var18 = arg8[8] * (float) var14 + arg8[7] * (float) var13 + arg8[6] * (float) var15;
        float var19;
        float var20;
        if (arg4 == 0) {
            var20 = arg0 + var16 + 0.5F;
            var19 = arg2 + 0.5F - var18;
        } else if (arg4 == 1) {
            var19 = arg2 + var18 + 0.5F;
            var20 = arg0 + var16 + 0.5F;
        } else if (arg4 == 2) {
            var20 = arg0 + 0.5F - var16;
            var19 = arg12 + 0.5F - var17;
        } else if (arg4 == 3) {
            var20 = arg0 + var16 + 0.5F;
            var19 = arg12 + 0.5F - var17;
        } else if (arg4 == 4) {
            var19 = arg12 + 0.5F - var17;
            var20 = arg2 + var18 + 0.5F;
        } else {
            var20 = arg2 + 0.5F - var18;
            var19 = arg12 + 0.5F - var17;
        }
        if (arg5 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg5 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg5 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class359.field4580 = var19;
        class181.field2327 = var20;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I)Loaa;")
    public final class555 method1417(int arg0, int arg1, int[] arg2) {
        field2941++;
        if (this.field2942.method3342((byte) -107) == arg1) {
            return this.method1412(arg0, -100, arg2, 0);
        } else if (this.field2942.method3349(arg0, true) == 1) {
            return this.method1412(0, -102, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lpl;Lpl;)V")
    public class235(class612 arg0, class612 arg1) {
        this.field2942 = arg0;
        this.field2940 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[IB)Loaa;")
    public final class555 method1418(int arg0, int[] arg1, byte arg2) {
        field2939++;
        if (this.field2940.method3342((byte) -107) == 1) {
            return this.method1414(-432121204, arg1, 0, arg0);
        }
        if (arg2 > -54) {
            field2946 = 78;
        }
        if (this.field2940.method3349(arg0, true) != 1) {
            throw new RuntimeException();
        }
        return this.method1414(-432121204, arg1, arg0, 0);
    }
}
