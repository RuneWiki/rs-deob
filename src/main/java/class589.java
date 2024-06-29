import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class589 implements class318 {

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lul;")
    private class364 field8388;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lqa;")
    private class147 field8380;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[S")
    public static short[] field8375 = new short[256];

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lgr;")
    public static class530 field8384 = new class530(38, 3);

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lsm;")
    public static class387 field8387 = new class387("", 18);

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "[I")
    public static int[] field8389 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[Ltd;")
    public static class515[] field8382;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([II[IBI)V", line = 3)
    public static final void method3461(int[] arg0, int arg1, int[] arg2, byte arg3, int arg4) {
        field8385++;
        if (arg3 <= 121) {
            field8389 = null;
        }
        if (arg1 <= arg4) {
            return;
        }
        int var5 = (arg4 + arg1) / 2;
        int var6 = arg4;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg4; var10 < arg1; var10++) {
            if (arg0[var10] < ((var9 & var10) + var7)) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                int var12 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var12;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var8;
        method3461(arg0, var6 - 1, arg2, (byte) 123, arg4);
        method3461(arg0, arg1, arg2, (byte) 122, var6 + 1);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 64)
    public static final void method3462(byte arg0) {
        if (class211.field3164 != null) {
            if (class416.field5919) {
                class169.method1211(-38);
            }
            class465.field6628.method3855(false);
            class434.method2665();
            class40.method423((byte) 102);
            class544.method3273(false);
            class364.method2293(-119);
            class228.method1586(2);
            if (class728.field10226 != null) {
                class728.field10226.method3375(false);
            }
            class572.method3404(true);
            class648.method3743(12245);
            class750.method4178((byte) 93);
            class301.method1889(true);
            class145.method1015(false, (byte) -87);
            for (int var1 = 0; var1 < 2048; var1++) {
                class639 var5 = class536.field7796[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field4636.length; var6++) {
                        var5.field4636[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class551.field8042; var2++) {
                class571 var3 = class414.field5889[var2].field1004;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4636.length; var4++) {
                        var3.field4636[var4] = null;
                    }
                }
            }
            class182.field2510 = null;
            class569.field8215 = null;
            class211.field3164.method3266(1);
            class211.field3164 = null;
        }
        if (arg0 < 18) {
            field8389 = null;
        }
        field8381++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;IIILda;I)I", line = 143)
    private final int method3463(String arg0, int arg1, int arg2, int arg3, class400 arg4, int arg5) {
        field8379++;
        if (arg1 != 1897) {
            this.method678(false, (byte) 114);
        }
        return arg4.method2435(this.field8380.field2142, arg0, 0, null, this.field8380.field2152, (byte) -124, null, arg2 + arg5, 0, 0, this.field8380.field2145 - (arg5 * 2), 0, this.field8380.field2150 - (arg5 * 2), arg3 + arg5, null, 0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 154)
    public final void method414(byte arg0) {
        if (arg0 > 126) {
            field8377++;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V", line = 165)
    public static void method3464(byte arg0) {
        field8384 = null;
        field8375 = null;
        field8387 = null;
        field8389 = null;
        if (arg0 <= 92) {
            field8387 = null;
        }
        field8382 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V", line = 180)
    public final void method678(boolean arg0, byte arg1) {
        if (arg1 != -53) {
            return;
        }
        field8378++;
        class216 var3 = this.field8388.method2290(this.field8380.field2143, 16383);
        if (var3 == null) {
            return;
        }
        int var4 = this.field8380.field2151.method71(class758.field10546, (byte) 79, this.field8380.field2150) + this.field8380.field2141;
        int var5 = this.field8380.field2148.method995(this.field8380.field2145, class544.field7915, (byte) 46) + this.field8380.field2144;
        if (this.field8380.field2147) {
            class211.field3164.method305(var4, var5, this.field8380.field2150, this.field8380.field2145, this.field8380.field2139, 0);
        }
        int var6 = var5 + this.method3463(var3.field3238, arg1 + 1950, var5, var4, class193.field2838, 5) * 12;
        int var9 = var6 + 8;
        if (this.field8380.field2147) {
            class211.field3164.method380(var4, var9, var4 + this.field8380.field2150 - 1, var9, this.field8380.field2139, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3463(var3.field3235, 1897, var6, var4, class193.field2838, 5) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3463(var3.field3236, 1897, var10, var4, class193.field2838, 5) * 12;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lwfa;Lwfa;I)V", line = 216)
    public static final void method3465(class388 arg0, class388 arg1, int arg2) {
        if (arg0.field5597 != null) {
            arg0.method2381(15735);
        }
        int var3 = -107 % ((17 - arg2) / 35);
        field8376++;
        arg0.field5597 = arg1;
        arg0.field5596 = arg1.field5596;
        arg0.field5597.field5596 = arg0;
        arg0.field5596.field5597 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z", line = 237)
    public final boolean method418(boolean arg0) {
        if (!arg0) {
            field8387 = null;
        }
        field8383++;
        return this.field8388.method2292(-21299);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[BIIIIII[B)V", line = 250)
    public static final void method3466(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field8386++;
        if (arg3 != -11477) {
            method3462((byte) 21);
        }
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg5++];
                int var14 = arg0++;
                arg8[var14] += arg1[arg5++];
                int var15 = arg0++;
                arg8[var15] += arg1[arg5++];
                int var16 = arg0++;
                arg8[var16] += arg1[arg5++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg5++];
            }
            arg5 += arg4;
            arg0 += arg7;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lul;Lqa;)V", line = 302)
    public class589(class364 arg0, class147 arg1) {
        this.field8388 = arg0;
        this.field8380 = arg1;
    }
}
