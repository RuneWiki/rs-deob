import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class129 extends class605 {

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "J")
    public static long field2252;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "[B")
    private byte[] field2253;

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V", line = 3)
    public class129() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILij;IILfl;Lwda;B)V", line = 7)
    public static final void method1095(int arg0, int arg1, class445 arg2, int arg3, int arg4, class771 arg5, class666 arg6, byte arg7) {
        field2254++;
        class570 var8 = new class570();
        var8.field8131 = arg0 << 9;
        if (arg7 < 32) {
            return;
        }
        var8.field8112 = arg4 << 9;
        var8.field8113 = arg1;
        if (arg2 != null) {
            var8.field8121 = arg2;
            int var9 = arg2.field6100;
            int var10 = arg2.field6053;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg2.field6100;
                var9 = arg2.field6053;
            }
            var8.field8124 = arg2.field6071;
            var8.field8109 = arg4 + var9 << 9;
            var8.field8123 = arg2.field6112;
            var8.field8117 = arg2.field6081;
            var8.field8122 = arg2.field6032 << 9;
            var8.field8110 = arg2.field6094;
            var8.field8125 = arg2.field6046 << 9;
            var8.field8102 = arg2.field6047;
            var8.field8103 = arg2.field6117;
            var8.field8111 = arg2.field6066;
            var8.field8108 = arg2.field6057;
            var8.field8118 = arg2.field6058;
            var8.field8107 = arg0 + var10 << 9;
            if (arg2.field6028 != null) {
                var8.field8120 = true;
                var8.method3310((byte) -89);
            }
            if (var8.field8123 != null) {
                var8.field8126 = var8.field8111 + (int) (Math.random() * (double) (var8.field8124 - var8.field8111));
            }
            class503.field6872.method3594((byte) -123, var8);
        } else if (arg6 != null) {
            var8.field8104 = arg6;
            class568 var11 = arg6.field9253;
            if (var11.field8023 != null) {
                var8.field8120 = true;
                var11 = var11.method3283((byte) -102, class694.field9613);
            }
            if (var11 != null) {
                var8.field8107 = var11.field8076 + arg0 << 9;
                var8.field8109 = arg4 + var11.field8076 << 9;
                var8.field8102 = class69.method626(true, arg6);
                var8.field8125 = var11.field8030 << 9;
                var8.field8110 = var11.field8033;
                var8.field8108 = var11.field8050;
                var8.field8122 = var11.field8044 << 9;
                var8.field8103 = var11.field8069;
                var8.field8117 = var11.field8085;
            }
            class536.field7294.method3594((byte) -111, var8);
        } else if (arg5 != null) {
            var8.field8116 = arg5;
            var8.field8109 = arg5.method2342((byte) 6) + arg4 << 9;
            var8.field8107 = arg0 + arg5.method2342((byte) 6) << 9;
            var8.field8102 = class448.method2602(arg5, (byte) 121);
            var8.field8117 = 256;
            var8.field8110 = arg5.field10651;
            var8.field8122 = arg5.field10642 << 9;
            var8.field8103 = 256;
            var8.field8108 = arg5.field10621;
            var8.field8125 = 0;
            class663.field9213.method341((long) arg5.field5288, var8, (byte) 61);
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(IIII)[B", line = 112)
    public final byte[] method1096(int arg0, int arg1, int arg2, int arg3) {
        this.field2253 = new byte[arg1 * arg2 * 2 * arg0];
        field2258++;
        if (arg3 != 5066) {
            this.method152((byte) -39, -88, (byte) 118);
        }
        this.method4164(arg3 - 4811, arg2, arg1, arg0);
        return this.field2253;
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(IIII)V", line = 126)
    public static final void method1097(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -9274) {
            return;
        }
        field2257++;
        int var4 = arg0 * class111.field1911.field6752.method925((byte) 85) >> 8;
        if (arg2 == -1 && !class299.field4117) {
            class643.method3575((byte) -30);
        } else if (arg2 != -1 && (class520.field7058 != arg2 || !class153.method1203((byte) -26)) && var4 != 0 && !class299.field4117) {
            class457.method2633(arg3, false, 77, class357.field4898, var4, 0, arg2);
            class279.method1787(true);
        }
        if (class520.field7058 != arg2) {
            class614.field8563 = null;
        }
        class520.field7058 = arg2;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BIB)V", line = 160)
    public final void method152(byte arg0, int arg1, byte arg2) {
        field2255++;
        if (arg0 != 69) {
            return;
        }
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var6 = var4 + 1;
        this.field2253[var4] = var5;
        this.field2253[var6] = var5;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIFIIFI[FI[F)V", line = 178)
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, int arg8, float[] arg9, int arg10, float[] arg11) {
        field2250++;
        int var12 = arg2 - arg0;
        int var13 = arg3 - arg5;
        int var14 = arg6 - arg1;
        float var15 = arg11[2] * (float) var12 + arg11[1] * (float) var14 + arg11[0] * (float) var13;
        float var16 = arg11[5] * (float) var12 + arg11[4] * (float) var14 + arg11[3] * (float) var13;
        float var17 = arg11[8] * (float) var12 + arg11[6] * (float) var13 + arg11[7] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg8 != -7677) {
            return;
        }
        if (arg4 != 1.0F) {
            var18 = arg4 * var18;
        }
        float var19 = var16 + arg7 + 0.5F;
        if (arg10 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg10 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        arg9[1] = var19;
        arg9[0] = var18;
    }
}
