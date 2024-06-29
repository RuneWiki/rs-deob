import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class426 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field5523 = 0;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lra;")
    public static class361 field5524 = new class361(13, -2);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "F")
    public static float field5527;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2447(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field5526++;
        if (arg1 != 250) {
            field5527 = 0.12579124F;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[BLiaa;B)V", line = 24)
    public static final void method2448(byte[][] arg0, class99 arg1, byte arg2) {
        field5521++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg2 > -38) {
            return;
        }
        for (int var4 = 0; var4 < arg1.field4216; var4++) {
            class424.method2439(26);
            for (int var5 = 0; var5 < (class611.field8258 >> 3); var5++) {
                for (int var6 = 0; var6 < class656.field9155 >> 3; var6++) {
                    int var7 = class325.field4211[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3BE3795) >> 24;
                        if (!arg1.field4215 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFDE7C) >> 14;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class547.field7096.length; var13++) {
                                if (class547.field7096[var13] == var12 && arg0[var13] != null) {
                                    class418 var14 = new class418(arg0[var13]);
                                    arg1.method1887(var4, (byte) 92, var14, var11, var5 * 8, class703.field9806, var8, var9, var6 * 8, var10);
                                    arg1.method744(var10, var11, var5 * 8, var6 * 8, var14, var9, var4, 4, class520.field6799, var3[0] == -1 ? var3 : null, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class625.field8743 = class382.field4898.method2020(var3[2], var3[3], (byte) 115, var3[0], class277.field3629, var3[1]);
            class221.field2897 = var3[4];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 109)
    public static void method2449(int arg0) {
        if (arg0 != -18151) {
            field5527 = 0.29541564F;
        }
        field5524 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII[BI[BI)V", line = 119)
    public static final void method2450(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field5522++;
        if (arg1 <= 100) {
            method2451(-74, null, -36, true, -81, true, null);
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg7[var10001] += arg5[arg8++];
                int var14 = arg2++;
                arg7[var14] += arg5[arg8++];
                int var15 = arg2++;
                arg7[var15] += arg5[arg8++];
                int var16 = arg2++;
                arg7[var16] += arg5[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg7[var10001] += arg5[arg8++];
            }
            arg2 += arg6;
            arg8 += arg4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;IZIZLjava/lang/String;)V", line = 173)
    public static final void method2451(int arg0, String arg1, int arg2, boolean arg3, int arg4, boolean arg5, String arg6) {
        field5525++;
        class493.field6524.field8306 = 1;
        String var7 = arg6.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg2 != -1) {
            class428 var11 = class191.field2445.method1075((byte) -65, arg2);
            if (var11 == null || arg3 != var11.method2460(-28741)) {
                return;
            }
            if (var11.method2460(-28741)) {
                var10 = var11.field5541;
            } else {
                var9 = var11.field5546;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class232.field3109.field2558; var13++) {
            class696 var16 = class232.field3109.method1292(0, var13);
            if ((!arg5 || var16.field9549) && var16.field9575 == -1 && var16.field9547 == -1 && var16.field9555 == 0 && var16.field9569.toLowerCase().indexOf(var7) != -1) {
                if (arg2 != -1) {
                    if (arg3) {
                        if (!arg1.equals(var16.method3783(arg2, var10, (byte) 97))) {
                            continue;
                        }
                    } else if (arg0 != var16.method3782(false, var9, arg2)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    client.field1222 = null;
                    class542.field7043 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        client.field1222 = var8;
        class587.field7973 = 0;
        class542.field7043 = var12;
        String[] var14 = new String[class542.field7043];
        for (int var15 = 0; var15 < class542.field7043; var15++) {
            var14[var15] = class232.field3109.method1292(0, var8[var15]).field9569;
        }
        class82.method638(false, var14, client.field1222);
        if (arg4 <= 15) {
            field5527 = 1.5545695F;
        }
        class493.field6524.method3337(0);
        class493.field6524.field8306 = 2;
    }
}
