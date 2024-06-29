import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class300 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lil;")
    public class7 field4470 = new class7();

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    public boolean field4473 = false;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "J")
    public static long field4468 = 0L;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BB)Ljava/lang/String;")
    public static final String method1924(byte[] arg0, byte arg1) {
        field4469++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 < 224) {
                    if ((var5 + 1) >= var2) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var7 = arg0[var5] & 0xFF;
                    if (var7 < 128 || var7 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class442.method2600(class168.method1203(-193, var6) << 6, class168.method1203(-129, var7));
                } else if (var6 < 240) {
                    if (var2 <= var5 + 2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var5++;
                    int var8 = arg0[var5] & 0xFF;
                    if (var8 >= 128 && var8 <= 191) {
                        var5++;
                        int var9 = arg0[var5] & 0xFF;
                        if (var9 >= 128 && var9 <= 191) {
                            var3[var4++] = (char) class442.method2600(class442.method2600(class168.method1203(var8 << 6, -8256), class168.method1203(var6 << 12, -921600)), class168.method1203(-129, var9));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var6 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        if (arg1 != -103) {
            field4468 = 6L;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method1925(int arg0) {
        if (arg0 <= 41) {
            field4468 = -97L;
        }
        field4467++;
        if (class220.field3371.method1048(class74.field1211, -75) || class123.field1944 == class10.field95) {
            class441.method2597(class76.field1256, false);
            if (class231.field3470 != class123.field1944) {
                class311.method1975(255);
            }
        } else {
            class349.method2200(0, class473.field6897, class122.field1908, 10, false);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIILue;IIIII)Z")
    public static final boolean method1926(int arg0, int arg1, int arg2, int arg3, int arg4, class159 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4466++;
        int var11 = arg9;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class251.field3739[var13][var14] = 99;
        int var16 = arg2 - var14;
        class287.field4247[var13][var14] = 0;
        byte var17 = 0;
        class62.field1087[var17] = arg9;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class476.field6935[var10001] = arg2;
        int[][] var19 = arg5.field2427;
        while (var26 != var18) {
            var12 = class476.field6935[var18];
            var11 = class62.field1087[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg5.field2440;
            int var23 = var12 - arg5.field2437;
            if (arg0 == -4) {
                if (arg1 == var11 && arg4 == var12) {
                    class347.field5113 = var12;
                    class90.field1445 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class167.method1192(arg10, arg3, arg1, var12, var11, 2, arg4, 2, 1)) {
                    class347.field5113 = var12;
                    class90.field1445 = var11;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg5.method1111((byte) -60, arg1, 2, arg4, var11, arg3, 2, arg10, var12, arg8)) {
                    class90.field1445 = var11;
                    class347.field5113 = var12;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg5.method1118(arg4, arg8, 2, arg3, arg1, (byte) 86, var11, arg10, var12)) {
                    class347.field5113 = var12;
                    class90.field1445 = var11;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg5.method1122(arg0, arg1, arg4, var11, var12, (byte) 76, 2, arg6)) {
                    class90.field1445 = var11;
                    class347.field5113 = var12;
                    return true;
                }
            } else if (arg5.method1119(arg1, arg4, arg6, var12, 3, 2, var11, arg0)) {
                class90.field1445 = var11;
                class347.field5113 = var12;
                return true;
            }
            int var25 = class287.field4247[var20][var21] + 1;
            if (var20 > 0 && class251.field3739[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class62.field1087[var26] = var11 - 1;
                class476.field6935[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var20 - 1][var21] = 2;
                class287.field4247[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class251.field3739[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class62.field1087[var26] = var11 + 1;
                class476.field6935[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var20 + 1][var21] = 8;
                class287.field4247[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class251.field3739[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class62.field1087[var26] = var11;
                class476.field6935[var26] = var12 - 1;
                class251.field3739[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class287.field4247[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class251.field3739[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class62.field1087[var26] = var11;
                class476.field6935[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var20][var21 + 1] = 4;
                class287.field4247[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class251.field3739[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class62.field1087[var26] = var11 - 1;
                class476.field6935[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var20 - 1][var21 - 1] = 3;
                class287.field4247[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class251.field3739[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class62.field1087[var26] = var11 + 1;
                class476.field6935[var26] = var12 - 1;
                class251.field3739[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class287.field4247[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class251.field3739[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class62.field1087[var26] = var11 - 1;
                class476.field6935[var26] = var12 + 1;
                class251.field3739[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class287.field4247[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class251.field3739[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class62.field1087[var26] = var11 + 1;
                class476.field6935[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var20 + 1][var21 + 1] = 12;
                class287.field4247[var20 + 1][var21 + 1] = var25;
            }
        }
        if (arg7 < 64) {
            method1924(null, (byte) 49);
        }
        class90.field1445 = var11;
        class347.field5113 = var12;
        return false;
    }
}
