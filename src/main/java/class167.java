import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 {

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Ldi;")
    public class82 field2362 = new class82();

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2360 = -1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljm;")
    public static class485 field2355 = new class485(49, -1);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Ldi;")
    private class82 field2368;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZJ)V")
    public static final void method1030(boolean arg0, long arg1) {
        field2366++;
        if (arg0) {
            return;
        }
        class244.field3395.field5069 = 0;
        class244.field3395.method2084(class255.field3545.field3043, arg0);
        class244.field3395.method2076(arg1, (byte) -117);
        class376.field5289 = -3;
        class310.field4243 = 1;
        client.field2804 = 0;
        class270.field3692 = 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
    public static final boolean method1031(boolean arg0, int arg1, int arg2, String arg3) {
        field2363++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg2 != 43) {
            field2355 = null;
        }
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III[BII[BBI)V")
    public static final void method1032(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, byte arg7, int arg8) {
        field2365++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        int var11 = -arg1;
        if (arg7 >= -68) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg3[var10001] += arg6[arg4++];
                int var14 = arg2++;
                arg3[var14] += arg6[arg4++];
                int var15 = arg2++;
                arg3[var15] += arg6[arg4++];
                int var16 = arg2++;
                arg3[var16] += arg6[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg3[var10001] += arg6[arg4++];
            }
            arg4 += arg0;
            arg2 += arg8;
            var11++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public final void method1033(byte arg0) {
        field2359++;
        while (true) {
            class82 var2 = this.field2362.field1151;
            if (this.field2362 == var2) {
                this.field2368 = null;
                if (arg0 == -42) {
                    return;
                } else {
                    this.field2368 = null;
                    return;
                }
            }
            var2.method587((byte) 35);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)Ldi;")
    public final class82 method1034(byte arg0) {
        field2364++;
        class82 var2 = this.field2368;
        if (arg0 != -127) {
            return null;
        } else if (this.field2362 == var2) {
            this.field2368 = null;
            return null;
        } else {
            this.field2368 = var2.field1151;
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Ldi;")
    public final class82 method1035(byte arg0) {
        field2367++;
        class82 var2 = this.field2362.field1151;
        if (this.field2362 == var2) {
            this.field2368 = null;
            return null;
        }
        if (arg0 < 10) {
            this.field2368 = null;
        }
        this.field2368 = var2.field1151;
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ldi;I)V")
    public final void method1036(class82 arg0, int arg1) {
        if (arg0.field1150 != null) {
            arg0.method587((byte) 44);
        }
        field2357++;
        arg0.field1151 = this.field2362;
        arg0.field1150 = this.field2362.field1150;
        if (arg1 != 48) {
            method1037(86, -67, -51, 65, 45, 92, -55, null, null);
        }
        arg0.field1150.field1151 = arg0;
        arg0.field1151.field1150 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII[B[B)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
        field2356++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        if (arg1 != -3) {
            method1032(-1, -50, -1, null, 29, 15, null, (byte) -4, -51);
        }
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg7[var10001] = (byte) (arg7[var10001] - arg8[arg5++]);
                int var14 = arg3++;
                arg7[var14] = (byte) (arg7[var14] - arg8[arg5++]);
                int var15 = arg3++;
                arg7[var15] = (byte) (arg7[var15] - arg8[arg5++]);
                int var16 = arg3++;
                arg7[var16] = (byte) (arg7[var16] - arg8[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg7[var10001] = (byte) (arg7[var10001] - arg8[arg5++]);
            }
            arg5 += arg4;
            arg3 += arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1038(int arg0) {
        field2355 = null;
        if (arg0 != -15244) {
            field2360 = 107;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
    public final int method1039(int arg0) {
        field2361++;
        int var2 = 0;
        class82 var3 = this.field2362.field1151;
        int var4 = -76 % ((arg0 - 17) / 52);
        while (this.field2362 != var3) {
            var3 = var3.field1151;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class167() {
        this.field2362.field1150 = this.field2362;
        this.field2362.field1151 = this.field2362;
    }
}
