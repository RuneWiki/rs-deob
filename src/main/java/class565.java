import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class565 {

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field7984 = 0;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!cv", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field7983++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZIIIIIIIILjn;I)Z", line = 17)
    public static final boolean method3295(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class716 arg9, int arg10) {
        field7981++;
        int var11 = arg3;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        int var16 = arg10 - var14;
        class73.field1288[var13][var14] = 99;
        class668.field9364[var13][var14] = 0;
        if (arg0) {
            return false;
        }
        byte var17 = 0;
        class541.field7609[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class667.field9346[var10001] = arg10;
        int[][] var19 = arg9.field9991;
        while (var26 != var18) {
            var11 = class541.field7609[var18];
            var12 = class667.field9346[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg9.field9992;
            int var23 = var12 - arg9.field10004;
            if (arg7 == -4) {
                if (arg6 == var11 && arg4 == var12) {
                    class33.field437 = var11;
                    class40.field591 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class78.method779(arg5, 1275, arg8, var12, 2, var11, arg6, 2, arg4)) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg9.method3990((byte) 68, arg4, arg5, var12, 2, var11, arg6, arg8, 2, arg2)) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg9.method3984(var11, var12, arg2, 2, arg6, (byte) 89, arg5, arg4, arg8)) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg9.method3998(arg4, var12, arg7, arg1, 2, arg6, 1, var11)) {
                    class40.field591 = var12;
                    class33.field437 = var11;
                    return true;
                }
            } else if (arg9.method3991(2, arg4, arg1, (byte) 89, var11, arg7, arg6, var12)) {
                class40.field591 = var12;
                class33.field437 = var11;
                return true;
            }
            int var25 = class668.field9364[var20][var21] + 1;
            if (var20 > 0 && class73.field1288[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class541.field7609[var26] = var11 - 1;
                class667.field9346[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20 - 1][var21] = 2;
                class668.field9364[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class73.field1288[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class541.field7609[var26] = var11 + 1;
                class667.field9346[var26] = var12;
                class73.field1288[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class73.field1288[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class541.field7609[var26] = var11;
                class667.field9346[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20][var21 - 1] = 1;
                class668.field9364[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class73.field1288[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class541.field7609[var26] = var11;
                class667.field9346[var26] = var12 + 1;
                class73.field1288[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class73.field1288[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class541.field7609[var26] = var11 - 1;
                class667.field9346[var26] = var12 - 1;
                class73.field1288[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class73.field1288[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class541.field7609[var26] = var11 + 1;
                class667.field9346[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20 + 1][var21 - 1] = 9;
                class668.field9364[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class73.field1288[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class541.field7609[var26] = var11 - 1;
                class667.field9346[var26] = var12 + 1;
                class73.field1288[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class668.field9364[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class73.field1288[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class541.field7609[var26] = var11 + 1;
                class667.field9346[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class73.field1288[var20 + 1][var21 + 1] = 12;
                class668.field9364[var20 + 1][var21 + 1] = var25;
            }
        }
        class33.field437 = var11;
        class40.field591 = var12;
        return false;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([BI)[B", line = 373)
    public static final byte[] method3296(byte[] arg0, int arg1) {
        field7982++;
        class35 var2 = new class35(arg0);
        if (arg1 > -23) {
            method3295(true, -10, -13, -45, -57, -106, -120, -79, -16, null, -7);
        }
        int var3 = var2.method273(255);
        int var4 = var2.method234((byte) -124);
        if (var4 < 0 || class214.field3070 != 0 && class214.field3070 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method260(var8, 113, var4, 0);
            return var8;
        } else {
            int var5 = var2.method234((byte) -114);
            if (var5 < 0 || class214.field3070 != 0 && class214.field3070 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class145.method1134(var6, var5, arg0, var4, 9);
            } else {
                class96 var7 = class624.field8975;
                synchronized (class624.field8975) {
                    class624.field8975.method864(var2, (byte) -95, var6);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 437)
    public static final void method3297(int arg0) {
        if (class443.field6166 != null) {
            class443.field6166.method376((byte) -126);
        }
        field7979++;
        if (arg0 <= 21) {
            field7984 = -115;
        }
        if (class338.field4769 != null) {
            class338.field4769.method376((byte) -62);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(JI)V", line = 454)
    public static final void method3298(long arg0, int arg1) {
        if (class390.field5454 != null) {
            if (class666.field9338 == 1 || class666.field9338 == 5) {
                class37.method301(arg0, true);
            } else if (class666.field9338 == 4) {
                class575.method3339(arg0, false);
            }
        }
        field7980++;
        class700.method3936((long) class605.field8787, 3259, class359.field5046);
        if (class401.field5610 != -1) {
            class6.method35(false, class401.field5610);
        }
        for (int var3 = 0; var3 < class114.field1830; var3++) {
            if (class329.field4646[var3]) {
                class443.field6170[var3] = true;
            }
            class280.field3932[var3] = class329.field4646[var3];
            class329.field4646[var3] = false;
        }
        class214.field3063 = class605.field8787;
        class62.method671(-1, -1, -89, null);
        class181.method1301(-1, true, null, -1);
        if (class401.field5610 != -1) {
            class114.field1830 = 0;
            class615.method3535(64);
        }
        class359.field5046.method601();
        class82.method801(class359.field5046, true);
        int var4 = class528.method3120((byte) 95);
        if (var4 == -1) {
            var4 = class458.field6611;
        }
        if (var4 == -1) {
            var4 = class273.field3898;
        }
        class194.method1354((byte) 96, var4);
        if (arg1 < 114) {
            method3297(-103);
        }
        int var5 = class468.field6748.method482(false) << 8;
        class248.method1654(class468.field6748.field644 + var5, 2, class468.field6748.field649, class468.field6748.field648 + var5, class373.field5232);
        class373.field5232 = 0;
    }
}
