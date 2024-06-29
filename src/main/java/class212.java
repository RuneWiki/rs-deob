import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class212 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private int field2924;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Leo;")
    public class291 field2925;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIILab;IIILhg;I)V")
    public static final void method1179(boolean arg0, int arg1, int arg2, class256 arg3, int arg4, int arg5, int arg6, class313 arg7, int arg8) {
        field2926++;
        if (!arg0) {
            return;
        }
        int var9 = arg1 * arg1 + (arg6 * arg6);
        if (var9 > arg5) {
            return;
        }
        int var10 = Math.min(arg3.field3597 / 2, arg3.field3707 / 2);
        if (var9 <= var10 * var10) {
            class18.method120(arg1, arg7, arg6, (byte) -63, arg2, class115.field1420[arg8], arg4, arg3);
            return;
        }
        var10 -= 10;
        int var11;
        if (class358.field5167 == 4) {
            var11 = (int) class349.field5021 & 0x3FFF;
        } else {
            var11 = (int) class349.field5021 + class367.field5251 & 0x3FFF;
        }
        int var12 = class16.field212[var11];
        int var13 = class16.field214[var11];
        if (class358.field5167 != 4) {
            var13 = var13 * 256 / (class415.field6000 + 256);
            var12 = var12 * 256 / (class415.field6000 + 256);
        }
        int var14 = arg1 * var13 + arg6 * var12 >> 15;
        int var15 = arg6 * var13 - (arg1 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var10 * Math.sin(var16));
        int var19 = (int) ((double) var10 * Math.cos(var16));
        class398.field5666[arg8].method2366((float) arg3.field3597 / 2.0F + (float) arg2 + (float) var18, (float) arg3.field3707 / 2.0F + (float) arg4 - (float) var19, 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB[Ljava/lang/Object;I[I)V")
    public static final void method1180(int arg0, byte arg1, Object[] arg2, int arg3, int[] arg4) {
        field2931++;
        if (arg1 != -123) {
            method1179(true, 31, -17, (class256) null, -68, 9, -31, (class313) null, 117);
        }
        if (arg3 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg3;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if (arg4[var9] < var7 + (var9 & 0x1)) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                Object var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var8;
        method1180(var6 - 1, (byte) -123, arg2, arg3, arg4);
        method1180(arg0, (byte) -123, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILvt;)V")
    public final void method1181(int arg0, class179 arg1) {
        field2929++;
        while (true) {
            int var3 = arg1.method895((byte) -79);
            if (var3 == 0) {
                if (arg0 == 2) {
                    return;
                } else {
                    this.field2924 = -2;
                    return;
                }
            }
            this.method1182(var3, (byte) 70, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBLvt;)V")
    private final void method1182(int arg0, byte arg1, class179 arg2) {
        if (arg1 != 70) {
            this.field2925 = null;
        }
        field2927++;
        if (arg0 == 1) {
            this.field2924 = arg2.method916(21933);
        } else if (arg0 == 2) {
            this.field2928 = arg2.method895((byte) -106);
            this.field2932 = arg2.method895((byte) -78);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Lkm;")
    public final synchronized class473 method1183(int arg0) {
        field2933++;
        class473 var2 = (class473) this.field2925.field4338.method1163((byte) -96, (long) this.field2924);
        if (var2 != null) {
            return var2;
        }
        class473 var3 = class473.method2795(this.field2925.field4330, this.field2924, arg0);
        if (var3 != null) {
            this.field2925.field4338.method1172((long) this.field2924, 1, var3);
        }
        return var3;
    }
}
