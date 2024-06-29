import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class49 extends class321 {

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "S")
    public static short field768 = 1;

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
    public static int field772 = 0;

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!pba", name = "v", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!pba", name = "B", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!pba", name = "D", descriptor = "Lmv;")
    public static class295 field777;

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "Lefa;")
    private class322 field778;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLgk;I)V")
    private final void method291(byte arg0, class540 arg1, int arg2) {
        field776++;
        if (arg2 == 249) {
            int var4 = arg1.method3115(29871);
            if (this.field778 == null) {
                int var5 = class240.method1478(-28325, var4);
                this.field778 = new class322(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method3115(29871) == 1;
                int var8 = arg1.method3154((byte) -20);
                class381 var9;
                if (var7) {
                    var9 = new class180(arg1.method3145((byte) -121));
                } else {
                    var9 = new class258(arg1.method3160(false));
                }
                this.field778.method2001(60, var9, (long) var8);
            }
        }
        int var10 = -33 % ((arg0 - 59) / 60);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(F[BIIFLbt;FFFIIIII)V")
    public static final void method292(float arg0, byte[] arg1, int arg2, int arg3, float arg4, class466 arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = 125 / ((arg2 - 69) / 50);
        field769++;
        int var15 = arg11 * arg13;
        float[] var16 = new float[var15];
        for (int var17 = 0; var17 < arg3; var17++) {
            arg5.method1681(0, false, arg4 / (float) arg9, arg0 / (float) arg11, arg10, arg11, arg9, arg8 / (float) arg13, var16, arg6 * 127.0F, arg13);
            int var20 = arg12;
            arg8 *= 2.0F;
            for (int var21 = 0; var21 < var15; var21++) {
                arg1[var20] = (byte) ((int) ((float) arg1[var20] + var16[var21]));
                var20++;
            }
            arg6 *= arg7;
            arg4 *= 2.0F;
            arg0 *= 2.0F;
        }
        int var18 = arg12;
        for (int var19 = 0; var19 < var15; var19++) {
            arg1[var18] = (byte) (arg1[var18] + 127);
            var18++;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIIIII)V")
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class502.field7105 = arg0;
        field771++;
        int var7 = -14 / ((15 - arg4) / 43);
        class375.field5657 = arg5;
        class103.field1545 = arg1;
        class281.field3717 = arg6;
        class47.field743 = arg3;
        class98.field1497 = arg2;
    }

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "(I)V")
    public static void method294(int arg0) {
        field777 = null;
        if (arg0 <= 126) {
            method294(-27);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method295(int arg0, String arg1, byte arg2) {
        field770++;
        if (this.field778 == null) {
            return arg1;
        }
        class180 var4 = (class180) this.field778.method2002((byte) -123, (long) arg0);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg2 != 116) {
                method296(51, -54, 98, 56, false, 51);
            }
            return var4.field2490;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIIZI)V")
    public static final void method296(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field773++;
        if (!arg4) {
            field779 = 114;
        }
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg5 * arg5;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class41.method235(arg1 - arg5, class565.field8253[arg0], 0, arg1 + arg5, arg2);
        int var20 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class41.method235(var24, class565.field8253[var21], 0, var23, arg2);
            class41.method235(var24, class565.field8253[var22], 0, var23, arg2);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIZ)I")
    public final int method297(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 86;
        }
        field774++;
        if (this.field778 == null) {
            return arg0;
        } else {
            class258 var4 = (class258) this.field778.method2002((byte) -119, (long) arg1);
            return var4 == null ? arg0 : var4.field3352;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lgk;I)V")
    public final void method298(class540 arg0, int arg1) {
        if (arg1 != -1) {
            method296(75, -1, -4, 15, true, 76);
        }
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                field775++;
                return;
            }
            this.method291((byte) -120, arg0, var3);
        }
    }
}
