import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class123 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZIII)V")
    public static final void method913(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1869++;
        class506 var5 = class14.method185(-1304589728, arg3, 4);
        var5.method2992(0);
        if (!arg1) {
            var5.field7442 = arg0;
            var5.field7441 = arg2;
            var5.field7445 = arg4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)V")
    public static final void method914(boolean arg0, boolean arg1) {
        field1863++;
        class152.method1097(-1, class413.field6241, arg0, class256.field3477, class155.field2347);
        if (!arg1) {
            method915(null, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method915(String arg0, byte arg1) {
        field1867++;
        long var2 = 0L;
        if (arg1 != 46) {
            return 49L;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static final void method916(int arg0) {
        if (arg0 != -16777216) {
            field1871 = 127;
        }
        field1870++;
        if (class85.field1347 != null) {
            return;
        }
        class85.field1347 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var11 = var17;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) - (-(var23 << 8) - var24) - 16777216;
                class85.field1347[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lt;IIBZILya;IIIILlc;III)Lt;")
    public static final class398 method917(class398 arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, class11 arg6, int arg7, int arg8, int arg9, int arg10, class520 arg11, int arg12, int arg13, int arg14) {
        field1868++;
        if (arg0 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg11 != null) {
            int var16 = var15 | arg11.method3075(arg7, 7698, -1, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg5 << 48) + (long) ((arg2 << 16) + (arg13 << 24) + arg1) + ((long) arg9 << 32);
        class382 var19 = class426.field6355;
        class398 var20;
        synchronized (class426.field6355) {
            var20 = (class398) class426.field6355.method2288(var17, 0);
        }
        if (var20 == null || arg6.method160(var20.method626(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method120(var15, var20.method626());
            }
            byte var21;
            if (arg1 == 1) {
                var21 = 9;
            } else if (arg1 == 2) {
                var21 = 12;
            } else if (arg1 == 3) {
                var21 = 15;
            } else if (arg1 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class118 var24 = new class118(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method882(-101, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class445.field6545[var31] * var28 >> 15;
                    int var33 = class445.field6544[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method882(49, 0, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg2 * var36 + arg13 * var35 >> 8);
                short var38 = (short) (((arg5 & 0x7F) * var35 + (arg9 & 0x7F) * var36 & 0x7F00) + ((arg5 & 0xFC00) * var35 + (arg9 & 0xFC00) * var36 & 0xFC0000) + ((arg5 & 0x380) * var35 + (arg9 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method884(var26[0][var39], (short) -1, (byte) 1, var38, var25, var37, (byte) -1, var26[0][(var39 + 1) % var21], 13);
                    } else {
                        var24.method884(var26[var34][(var39 + 1) % var21], (short) -1, (byte) 1, var38, var26[var34 - 1][var39], var37, (byte) -1, var26[var34 - 1][(var39 + 1) % var21], -126);
                        var24.method884(var26[var34][var39], (short) -1, (byte) 1, var38, var26[var34 - 1][var39], var37, (byte) -1, var26[var34][(var39 + 1) % var21], 99);
                    }
                }
            }
            var20 = arg6.method150(var24, var15, class75.field1068, 64, 768);
            class382 var40 = class426.field6355;
            synchronized (class426.field6355) {
                class426.field6355.method2290(var17, var20, 127);
            }
        }
        int var41 = (arg1 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg4) {
            if (arg14 > 13312 || arg14 < 3072) {
                var43 -= 128;
            }
            if (arg14 > 9216 && arg14 < 15360) {
                var44 = var41 + 128;
            }
            if (arg14 > 1024 && arg14 < 7168) {
                var42 -= 128;
            }
            if (arg14 > 5120 && arg14 < 11264) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg0.method651();
        if (arg3 > -83) {
            return null;
        }
        int var47 = arg0.method625();
        int var48 = arg0.method621();
        if (var48 < var43) {
            var48 = var43;
        }
        int var49 = arg0.method613();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class41 var50 = null;
        if (arg11 != null) {
            int var51 = arg11.field7630[arg7];
            var50 = class510.field7490.method571(var51 >> 16, 100);
            arg7 = var51 & 0xFFFF;
        }
        class398 var52;
        if (var50 == null) {
            var52 = var20.method610((byte) 3, var15, true);
            var52.method620(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method601(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method610((byte) 3, var15, true);
            var52.method620(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method601(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2387(var50, arg7, 0);
        }
        if (arg10 != 0) {
            var52.method657(arg10);
        }
        if (arg12 != 0) {
            var52.method595(arg12);
        }
        if (arg8 != 0) {
            var52.method601(0, arg8, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1864++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(II)V")
    public class123(int arg0, int arg1) {
        this.field1866 = arg0;
    }

    static {
        new class347("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }
}
